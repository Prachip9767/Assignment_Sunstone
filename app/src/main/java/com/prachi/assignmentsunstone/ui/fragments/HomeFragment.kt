package com.prachi.assignmentsunstone.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.prachi.assignmentsunstone.R
import com.prachi.assignmentsunstone.databinding.FragmentHomeBinding
import com.prachi.assignmentsunstone.local.Status
import com.prachi.assignmentsunstone.local.interfaces.OnCardClicked
import com.prachi.assignmentsunstone.local.responses.PhotoModel
import com.prachi.assignmentsunstone.local.responses.SrcModel
import com.prachi.assignmentsunstone.ui.adapter.BaseAdapter
import com.prachi.assignmentsunstone.viewmodels.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment(), OnCardClicked {

    private lateinit var homeBinding: FragmentHomeBinding
    private val viewModel: BaseViewModel by viewModels()
    private lateinit var adapter: BaseAdapter
    private var emptyList = emptyList<PhotoModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return homeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getResponseFromAPI(query = "nature").observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Status.ERROR -> {
                    Toast.makeText(context, "Check Internet Connection", Toast.LENGTH_SHORT).show()
                }
                Status.SUCCESS -> {
                    emptyList = it.data?.photoModels as ArrayList<PhotoModel>
                    adapter = BaseAdapter(emptyList, this)
                    homeBinding.recyclerViewHomeFrag.adapter = adapter
                    homeBinding.recyclerViewHomeFrag.layoutManager = GridLayoutManager(context, 2)

                }
                Status.LOADING -> {
                    Toast.makeText(context, "Loading...", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }


    override fun onCardClicked(srcModel: SrcModel) {
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(srcModel)
        Navigation.findNavController(requireView()).navigate(action)
    }
}
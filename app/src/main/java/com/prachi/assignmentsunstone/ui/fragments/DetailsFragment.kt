package com.prachi.assignmentsunstone.ui.fragments

import android.app.WallpaperManager
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.prachi.assignmentsunstone.R
import com.prachi.assignmentsunstone.databinding.FragmentDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private val args: DetailsFragmentArgs by navArgs()
    private lateinit var detailsFragmentBindings: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailsFragmentBindings =
            DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)
        return detailsFragmentBindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailsFragmentBindings.apply {
            Glide.with(ivImage).load(args.srcModel.original).placeholder(
                ColorDrawable(Color.parseColor("#bcd4e6"))).into(ivImage)

            btnSetWallpaper.setOnClickListener {
                setWallpaper()
            }
        }
    }

    private fun setWallpaper() {
        val bitmap: Bitmap = detailsFragmentBindings.ivImage.drawable.toBitmap()
        val manager: WallpaperManager = WallpaperManager.getInstance(context)
        try {
            manager.setBitmap(bitmap)
            Toast.makeText(context, "Wallpaper Changed", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Toast.makeText(context, "Something went wrong!", Toast.LENGTH_SHORT).show()
        }
    }


}
# Assignment_Sunstone✨
WallCraft is a App where you can set different wallpaper in you mobile without downloading them

![Green and Cream Modern Sales Marketing Presentation](https://user-images.githubusercontent.com/86509987/149639646-8b3f8faf-7026-4db1-bd86-12d7e77f5af1.png)


# Click On Demo✨
  <code>
    <a href="https://drive.google.com/file/d/1v8lT75mGaV-6GpfbEUHQo6GZ5nj9TkBx/view?usp=sharing" title="Playstore Profile"><img height="140" width="140" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgwJcz642pA7mLR5u44OirKSJjfxOoOqWbpNx7vgDP0NI4snSp68daLp-JccwzoGUIARw&usqp=CAU"></a></code>


# Things we used while making this application✨
* MVVM-Architecture
* GitHub
* Recycler View
* Retrofit Library
* Glide
* Dependency Injection-Hilt
* Navigation
* Coroutines

# Teck-stack✨
* Android Studio
* Kotlin


# Clone this Repo To Your System Using Android Studio✨

* Step 1: Open your Android Studio then go to the File > New > Project from Version Control as shown in the below image.
* Step 2: After clicking on the Project from Version Control a pop-up screen will arise like below. In the Version control choose Git from the drop-down menu.
* Step 3: Then at last paste this ( https://github.com/Prachip9767/Assignment_Sunstone.git ) link in the URL and choose your Directory. Click on the Clone button and you are done.


# Clone this Repo To Your System Using GitBash✨

* Open Git Bash

* If Git is not already installed, it is super simple. Just go to the Git Download Folder and follow the instructions.

* Go to the current directory where you want the cloned directory to be added.

* To do this, input cd and add your folder location. You can add the folder location by dragging the folder to Git bash.

* Go to the page of the repository that you want to clone

* Click on “Clone or download” and copy the URL.

* Use the git clone command along with the copied URL from earlier. $ git clone https://github.com/Prachip9767/Assignment_Sunstone.git

* Press Enter. $ git clone https://github.com/Prachip9767/Assignment_Sunstone.git Cloning into Git … remote: Counting objects: 13, done. remote: Compressing objects: 100% (13/13), done. remove: Total 13 (delta 1), reused 0 (delta 1) Unpacking objects: 100% (13/13), done.

Congratulations, you have created your first local clone from your remote Github repository.


# Dependencies and Plugins✨
Project level dependencies


     //navigation
      classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")

      //hilt
      classpath 'com.google.dagger:hilt-android-gradle-plugin:2.38.1'

App level dependencies


      //navigation
    def nav_version = "2.3.5"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")
    implementation("androidx.navigation:navigation-compose:2.4.0-rc01")

    //Glide
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'

    //Retrofit
    def retrofit2_version = "2.9.0"
    def okhttp3_version = "4.9.0"
    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.9.0'
    implementation "com.squareup.retrofit2:retrofit:$retrofit2_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit2_version"
    implementation "com.squareup.okhttp3:okhttp:$okhttp3_version"
    implementation "com.squareup.okhttp3:logging-interceptor:$okhttp3_version"

    //hilt
    implementation("com.google.dagger:hilt-android:2.38.1")
    kapt("com.google.dagger:hilt-android-compiler:2.38.1")

    // ViewModel and LiveData
    def arch_version = '2.2.0-alpha01'
    implementation "androidx.lifecycle:lifecycle-extensions:$arch_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$arch_version"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$arch_version"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
    //gif
    implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.23'
    
    
Plugins


    id 'kotlin-kapt'
    id("androidx.navigation.safeargs")
    id 'dagger.hilt.android.plugin'
    
    
# Thank You✨

package com.example.erecruitment.App.Data

import com.example.erecruitment.App.Home.Projects
import com.example.erecruitment.R

object ProjectData {
    private val title:Array <String> = arrayOf(
        "android studio",
        "web socket",
        "android arkademy",
        "web Project",
        "Project Pribadi 1",
        "project Arkademy"

    )
    private val image: Array<Int> = arrayOf(
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij,
        R.drawable.intelij)
    private val desc: Array<String> = arrayOf(
        "Project Android",
        "project arkademy",
        "project Website pemerintah",
        "Project Android",
        "project arkademy",
        "project Website pemerintah"
    )
    val lisData:ArrayList<Projects>
        get() {
            val list = arrayListOf<Projects>()
            for (i in image.indices){
                val projects = Projects()
                projects.name = title[i]
                projects.desc = desc[i]
                projects.image = image[i]
                list.add(projects)
            }
            return list
        }
}












package com.example.erecruitment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.erecruitment.App.Adapter.RecyclerAdapter
import com.example.erecruitment.R


class OnProgres : Fragment() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_on_progres, container, false)
    }

//    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(itemView, savedInstanceState)
//        R.layout.fragment_on_progres.apply {
//            layoutManager = LinearLayoutManager(activity)
//            adapter = RecyclerAdapter()
//        }
//    }
}


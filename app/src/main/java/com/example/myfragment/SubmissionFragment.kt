package com.example.myfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.myfragment.databinding.FragmentMyFragmentBinding
import com.example.myfragment.databinding.FragmentSubmissionBinding


class SubmissionFragment : Fragment() {
    private var _binding: FragmentSubmissionBinding? = null
    private val binding get() = _binding!!
    private lateinit var name: String
    private lateinit var track: String
    private lateinit var ambition: String

    companion object{
        const val  NAME = "name"
        const val  TRACK = "track"
        const val  AMBITION = "ambition"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME).toString()
            track = it.getString(TRACK).toString()
            ambition = it.getString(AMBITION).toString()


        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSubmissionBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Text.text = name
        binding.TextTwo.text = track
        binding.TexThree.text = ambition
    }


}
package com.example.myfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.myfragment.databinding.FragmentMyFragmentBinding
class MyHomefragment : Fragment() {

private var _binding: FragmentMyFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMyFragmentBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val name = binding.FullName.editText?.text.toString()
        val track = binding.InputLayoutTwo.editText?.text.toString()
        val ambition = binding.InputLayoutThree.editText?.text.toString()

        binding.SubmitButton.setOnClickListener {
            val  bundle = Bundle()
            bundle.putString("name", binding.FullName.editText?.text.toString())
            bundle.putString("track", binding.InputLayoutTwo.editText?.text.toString())
            bundle.putString("ambition", binding.InputLayoutThree.editText?.text.toString())
            navCon.navigate(R.id.action_my_fragment_to_submissionFragment, bundle)
        }
    }


}
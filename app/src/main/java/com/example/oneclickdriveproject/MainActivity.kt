package com.example.oneclickdriveproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.oneclickdriveproject.databinding.ActivityMainBinding
import com.example.oneclickdriveproject.factory.MainViewModelFactory
import com.example.oneclickdriveproject.utils.CalculatorImpl
import com.example.oneclickdriveproject.utils.InputParserImpl
import com.example.oneclickdriveproject.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(
            this@MainActivity,
            MainViewModelFactory(InputParserImpl(), CalculatorImpl())
        )[MainViewModel::class.java]

        initView()
        initObserver()
    }

    private fun initView() {
        with(binding) {
            bvCalculate.setOnClickListener {
                viewModel.calculate(
                    et1.text.toString(),
                    et2.text.toString(),
                    et3.text.toString()
                )
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initObserver() {
        viewModel.intersectResult.observe(this) { intersectResult ->
            binding.tvResult.text = "Intersect: ${intersectResult.joinToString(", ")}"
        }

        viewModel.unionResult.observe(this) { unionResult ->
            binding.tvResult.append("\nUnion: ${unionResult.joinToString(", ")}")
        }

        viewModel.maxNumber.observe(this) { maxNumber ->
            binding.tvResult.append("\nHighest Number: ${maxNumber ?: "N/A"}")
        }
    }
}

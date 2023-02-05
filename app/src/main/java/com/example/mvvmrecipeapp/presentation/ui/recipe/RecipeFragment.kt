package com.example.mvvmrecipeapp.presentation.ui.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.mvvmrecipeapp.presentation.ui.recipeList.RecipeListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeFragment : Fragment() {

    val viewModel: RecipeListViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("RecipeFragment: $viewModel")
    }
    @OptIn(ExperimentalUnitApi::class)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Text(
                    text = "Recipe Fragment", style = TextStyle(
                        fontSize = TextUnit(
                            21F, TextUnitType.Sp
                        )
                    )
                )
            }
        }
    }
}
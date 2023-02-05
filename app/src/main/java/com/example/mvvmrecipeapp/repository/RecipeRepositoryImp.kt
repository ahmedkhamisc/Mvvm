package com.example.mvvmrecipeapp.repository

import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.domain.util.DomainMapper
import com.example.mvvmrecipeapp.network.RecipeServices
import com.example.mvvmrecipeapp.network.model.RecipeDtoMapper

class RecipeRepositoryImp(
    private val recipeService: RecipeServices,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token,page,query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token,id))
    }

}
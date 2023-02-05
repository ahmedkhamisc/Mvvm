package com.example.mvvmrecipeapp.di

import com.example.mvvmrecipeapp.network.RecipeServices
import com.example.mvvmrecipeapp.network.model.RecipeDtoMapper
import com.example.mvvmrecipeapp.repository.RecipeRepository
import com.example.mvvmrecipeapp.repository.RecipeRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule{

    @Singleton
    @Provides
    fun providesRecipeRepository(
        recipeService:RecipeServices,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepositoryImp(recipeService,recipeDtoMapper)
    }
}
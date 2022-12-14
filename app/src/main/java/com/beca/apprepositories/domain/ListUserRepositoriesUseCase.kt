package com.beca.apprepositories.domain

import com.beca.apprepositories.core.UseCase
import com.beca.apprepositories.data.model.Repo
import com.beca.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow


class ListUserRepositoriesUseCase(
    private val repository: RepoRepository,

    ): UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
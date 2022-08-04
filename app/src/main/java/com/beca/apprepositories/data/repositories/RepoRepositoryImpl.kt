package com.beca.apprepositories.data.repositories

import com.beca.apprepositories.core.RemoteException
import com.beca.apprepositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

//chamada da api
class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositores(user)
            emit(repoList)

        }catch (ex: HttpException){
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento")
        }
    }

}
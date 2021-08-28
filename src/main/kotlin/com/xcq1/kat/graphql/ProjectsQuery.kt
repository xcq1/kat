package com.xcq1.kat.graphql

import com.expediagroup.graphql.server.operations.Query
import com.xcq1.kat.github.GitHubBackend
import org.springframework.stereotype.Component

@Component
class ProjectsQuery(
    private val gitHubBackend: GitHubBackend
) : Query {
    fun projects(): List<ProjectGraphQL> = gitHubBackend.getAllProjects().map { ProjectGraphQL(it.name) }
}

data class ProjectGraphQL(
    val name: String
)
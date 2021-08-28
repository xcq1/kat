package com.xcq1.kat.github

import org.kohsuke.github.GitHub
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class GitHubBackend {

    @Value("\${kat.github.username}")
    private val userName: String = ""

    @Value("\${kat.github.accesstoken}")
    private val accessToken: String = ""

    @Value("\${kat.github.filter.org}")
    private val filterOrganization: String = ""

    @Value("\${kat.github.filter.unarchived}")
    private val filterUnarchived: String = ""

    @Value("\${kat.github.filter.name-regexp}")
    private val filterNameRegexp: String = ".*"

    private val sdk = lazy { GitHub.connect(userName, accessToken) }

    fun getAllProjects() = sdk.value.getOrganization(filterOrganization).listRepositories().filter {
        (!filterUnarchived.toBoolean() || !it.isArchived) && (it.name.matches(filterNameRegexp.toRegex()))
    }

}
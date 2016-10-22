import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.publish.bintray
import com.beust.kobalt.project

import org.apache.maven.model.*

val jcommander = project {
    name = "jcommander"
    group = "com.beust"
    artifactId = name
    version = "1.58"

    dependenciesTest {
        compile("org.testng:testng:6.9.13")
    }

    assemble {
        mavenJars {
        }
    }

    bintray {
        publish = true
        sign = true
    }

    pom = Model().apply {
        name = project.name
        description = "Command line parsing"
        url = "http://jcommander.org"
        licenses = listOf(License().apply {
            name = "Apache 2.0"
            url = "http://www.apache.org/licenses/LICENSE-2.0"
        })
        scm = Scm().apply {
            url = "http://github.com/cbeust/jcommander"
            connection = "https://github.com/cbeust/jcommander.git"
            developerConnection = "git@github.com:cbeust/jcommander.git"
        }
        developers = listOf(Developer().apply {
            name = "Cedric Beust"
            email = "cedric@beust.com"
        })
    }

}

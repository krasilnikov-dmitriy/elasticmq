node("mesos:hseeberger/scala-sbt:scala-2.12.2-sbt-0.13.15") {
    stage("compile") {
        sh "sbt elasticmq-server:assembly"
    }
}
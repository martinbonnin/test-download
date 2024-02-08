plugins {
  id("org.jetbrains.kotlin.jvm").version("1.9.20")
  id("com.apollographql.apollo3").version("3.8.2")
}

apollo {
  service("confetti") {
    packageName.set("confetti")

    introspection {
      endpointUrl.set("https://confetti-app.dev/graphql")
      schemaFile.set(file("src/main/graphql/schema.graphqls"))
    }
  }
}
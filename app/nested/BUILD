load("@salesforce_rules_mybuilder//mybuilder:defs.bzl", "mybuilder_gen_java_library")

filegroup(
    name = "mybuilder_input",
    srcs = glob(
        [
            "src/main/resources/**/*.txt",
        ],
    ),
)

mybuilder_gen_java_library(
    name = "mybuilder_sources",
    srcs = [":mybuilder_input"],
)

java_binary (
    name = "App",
    srcs = glob(["src/main/java/com/epam/*.java"]),
    main_class = "com.epam.App",
    deps = ["//greeting:greeter", ":mybuilder_sources"]
)

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "4.0"
RULES_JVM_EXTERNAL_SHA = "31701ad93dbfe544d597dbe62c9a1fdd76d81d8a9150c2bf1ecf928ecdf97169"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.apache.commons:commons-lang3:3.9"
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ]
)

http_archive(
    name = "salesforce_rules_mybuilder",
    url = "https://github.com/salesforce/bazel-java-builder-template/archive/6d7cc260d50225432758d88bea9d7dd332f89352.zip",
    strip_prefix = "bazel-java-builder-template-6d7cc260d50225432758d88bea9d7dd332f89352"
)

load("@salesforce_rules_mybuilder//mybuilder:repositories.bzl", "rules_mybuilder_dependencies", "rules_mybuilder_toolchains")
rules_mybuilder_dependencies()
rules_mybuilder_toolchains()

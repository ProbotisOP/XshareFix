#!/usr/bin/env sh

GRADLE_VERSION=8.2
WRAPPER_DIR="$(dirname "$0")/gradle/wrapper"

JAVA_CMD="java"

exec "$JAVA_CMD" -classpath "$WRAPPER_DIR/gradle-wrapper.jar" \
org.gradle.wrapper.GradleWrapperMain "$@"

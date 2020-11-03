#!/usr/bin/env groovy
def call(String name = 'human') {
  echo "Hello, ${name}."
}
def postBuild(String name = 'human') {
  echo "Post Build Successfully"
}
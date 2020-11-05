#!/usr/bin/env groovy
def call(String name = 'human') {
  echo "Hello,"
}
def postBuild(String name = 'human') {
  echo "Post Build Successfully"
}

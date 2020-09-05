#!/usr/bin/env groovy

def call(Closure body) {
  sh "ls -al"
  echo "--------"
  sh "pwd"
  body()
}

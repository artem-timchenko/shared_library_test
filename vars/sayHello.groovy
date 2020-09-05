#!/usr/bin/env groovy

def testing_method(Closure body) {
  sh "ls -al"
  echo "--------"
  sh "pwd"
  body()
}

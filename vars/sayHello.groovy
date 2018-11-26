#!/usr/bin/env groovy

def call(String name = 'human') {
  sh "ls -al"
  echo "--------"
  sh "pwd"
  return ["Works !!"]
}

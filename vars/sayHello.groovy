#!/usr/bin/env groovy

def call(Closure body_1, Closure body_2 = {}) {
  sh "ls -al"
  echo "--------"
  sh "pwd"
  body_1()
  body_2()
}

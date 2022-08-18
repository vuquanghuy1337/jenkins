job('hello-world') {
    steps {
        shell('echo Hello World!')
    }
}

pipelineJob('github-demo') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('vuquanghuy1337/jenkins')
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('github-demo2') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('vuquanghuy1337/jenkins')
                    }
                }
            }
            scriptPath('vars/Jenkinsfile')
        }
    }
}


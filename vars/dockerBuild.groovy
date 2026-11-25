def call() {
    sh 'docker build --no-cache -t jenkins-node:v8 .'
}

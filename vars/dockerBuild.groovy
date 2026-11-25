def call(String imageName, String tag) {
    sh "docker build --no-cache -t ${imageName}:${tag} ."
}

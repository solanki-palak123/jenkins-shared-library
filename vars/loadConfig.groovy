def call() {
    def configText = libraryResource('config/app.properties')

    def props = new Properties()
    props.load(new StringReader(configText))

    echo "Application: ${props.getProperty('APP_NAME')}"
    echo "Environment: ${props.getProperty('ENVIRONMENT')}"
    echo "Port: ${props.getProperty('APP_PORT')}"
}

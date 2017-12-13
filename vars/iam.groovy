def call(body) {
    sh """
        (
        echo 'Hello from shared library'
        )
    """
}
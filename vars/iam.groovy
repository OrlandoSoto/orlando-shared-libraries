def call(body) {
    sh """
        (
        echo 'Hello from branch inside a shared library'
        )
    """
}
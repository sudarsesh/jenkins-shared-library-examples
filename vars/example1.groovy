def call(String name = "Alice") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}

def print_msg(String msg = 'Hello') {
    return script {
        sh "echo ${msg}"
    }
}

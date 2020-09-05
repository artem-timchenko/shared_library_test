import org.example.foo

def call(Map config=[:]) {
    if (config.type == "slack") {
        echo foo.SLACK_MESSAGE
        echo config.message
    } else {
        echo foo.EMAIL_MESSAGE
        echo config.message
    }
}

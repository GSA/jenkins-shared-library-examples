def call(String firstname="Obama", String lastname="Barrack") {
    def fullname = "${firstname} ${lastname}"
    def message = "Hello ${fullname}"
    return [fullname, message]
}

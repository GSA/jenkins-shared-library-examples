def call(String firstname, String lastname) {
    def fullname = "${firstname} ${lastname}"
    def message = "Hello ${fullname}"
    return [fullname, message]
}

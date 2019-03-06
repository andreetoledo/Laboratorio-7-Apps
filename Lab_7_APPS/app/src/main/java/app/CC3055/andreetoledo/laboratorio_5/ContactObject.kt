package app.CC3055.andreetoledo.laboratorio_5




class ContactObject {
    private var name = ""
    private var phone = ""
    private var mail = ""


    constructor(name: String, phone: String, mail: String) {
        this.name = name
        this.phone = phone
        this.mail = mail
    }

    override fun toString(): String {
        return "$name - $phone"
    }

    fun getInfo() : String {
        return "$name - $phone + $mail"
    }


}
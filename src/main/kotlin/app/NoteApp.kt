package app

import model.Archive
import screen.ArchiveListScreen

class NoteApp {
    val archives = mutableListOf<Archive>()

    fun start() {
        println("\n Добро пожаловать в приложение заметки!!!")
        ArchiveListScreen(this).show()

    }
}

fun main() {
    NoteApp().start()
}

package screen

import app.NoteApp
import model.Archive
import java.util.Scanner

class CreateArchiveScreen(
    private val app: NoteApp,
    private val previousScreen: ArchiveListScreen
) : MenuScreen() {

    fun show() {
        println("\n--- Создание архива ---")
        print("Введите имя архива: ")
        val name = Scanner(System.`in`).nextLine().trim()

        if (name.isEmpty()) {
            println(" Имя архива не может быть пустым.")
            return previousScreen.show()
        }

        val archive = Archive(name)
        app.archives.add(archive)
        println(" Архив «$name» создан.")

        previousScreen.show()
    }
}

package screen

import app.NoteApp
import model.Archive
import model.Note
import java.util.Scanner

class CreateNoteScreen(
    private val app: NoteApp,
    private val archive: Archive,
    private val previousScreen: NoteListScreen
) {

    fun show() {
        println("\n--- Создание заметки ---")
        print("Введите заголовок: ")
        val title = Scanner(System.`in`).nextLine().trim()

        if (title.isEmpty()) {
            println(" Заголовок не может быть пустым.")
            return previousScreen.show()
        }

        print("Введите текст заметки: ")
        val text = Scanner(System.`in`).nextLine().trim()

        if (text.isEmpty()) {
            println(" Текст заметки не может быть пустым.")
            return previousScreen.show()
        }

        val note = Note(title, text)
        archive.addNote(note)
        println(" Заметка «$title» добавлена.")

        previousScreen.show()
    }
}

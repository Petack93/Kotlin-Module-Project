package screen

import model.Note
import java.util.Scanner

class ViewNoteScreen(
    private val note: Note,
    private val previousScreen: NoteListScreen
) : MenuScreen() {

     fun show() {
        println("\n--- Заметка: ${note.title} ---")
        println(note.text)
        println("\n[Нажмите Enter, чтобы вернуться...]")


        Scanner(System.`in`).nextLine()

        previousScreen.show()
    }
}

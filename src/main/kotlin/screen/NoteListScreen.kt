package screen

import app.NoteApp
import model.Archive

class NoteListScreen(
    private val app: NoteApp,
    private val archive: Archive,
    private val previousScreen: ArchiveListScreen
) : MenuScreen() {

     fun show() {
        val menuItems = mutableListOf<Pair<String, () -> Unit>>()

        menuItems.add("Создать заметку" to { CreateNoteScreen(app, archive, this).show() })

        archive.getNotes().forEach { note ->
            menuItems.add(note.title to { ViewNoteScreen(note, this).show() })
        }

        menuItems.add("Назад" to { previousScreen.show() })

        runMenu(menuItems)
    }
}

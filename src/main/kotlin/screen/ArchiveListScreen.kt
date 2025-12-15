package screen

import app.NoteApp


class ArchiveListScreen(private val app: NoteApp) : MenuScreen() {
     fun show() {
        val menuItems = mutableListOf<Pair<String, () -> Unit>>()

        menuItems.add("Создать архив" to { CreateArchiveScreen(app, this).show() })

        app.archives.forEach { archive ->
            menuItems.add(archive.name to { NoteListScreen(app, archive, this).show() })
        }

        menuItems.add("Выход из программы" to { println("До свидания!") })

        runMenu(menuItems)
    }
}

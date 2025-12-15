package model

class Archive(val name: String) {
    private val notes = mutableListOf<Note>()

    fun addNote(note: Note) {
        notes.add(note)
    }

    fun getNotes() = notes.toList()

    override fun toString() = name
}

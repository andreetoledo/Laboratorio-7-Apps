package note.ejemplo.andree_toledo.my_notesapp.data

import androidx.room.Entity

@Entity(tableName = "note_table")
data class Note(

    var title: String

    var description: String

    var priority: Int

){
    @Primary(autoGenerate = true)
    var id: Int = 0
}
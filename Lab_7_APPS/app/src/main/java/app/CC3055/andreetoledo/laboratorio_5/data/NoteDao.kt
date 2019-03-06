package note.ejemplo.andree_toledo.my_notesapp.data

import android.arch.lifecycle.LiveData
import.androidx.room.Dao

@Dao
interface NoteDao{
    @Inser
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query(value:'DELETE FROM note_tanble')
    fun deleterAllNotes()

    @Query(value:'SELECT*FROM note_table ORDER BY')
    fun getAllNotes():LiveData<List<Note>>

}
package note.ejemplo.andree_toledo.my_notesapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Databse(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase(){

    abstract fun noteDaeo(): NoteDao

    companion object {
        private var instance: NoteDatabase? = null

        fun getInstance(context: Context): NoteDatabase? {
            synchronized(NoteDatabase::class) {
                instance = Room.databaseBuilder {
                    context.applicationContext,
                    NoteDatabase::class.java, name"note_database"
                }
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build()
            }

            return instance
        }

        fun destroyInstance() {
            instance = null
        }
    }

    private  val roomCallback = object : RoomDatabase.Callback(){
        override fun onCreate(db: SupportSQLiteDatabase){
            super.onCreate(db)
            PopulateDbAsyncTask()
        }

    }
}

private PopulateDbAsyncTask(db: NoteDatabse?) AsyncTask<Unit, Unit, Unit>(){
    private val noteDao = db?.noteDao()
}
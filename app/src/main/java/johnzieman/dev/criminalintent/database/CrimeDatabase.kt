package johnzieman.dev.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import johnzieman.dev.criminalintent.Crime

@Database(entities = [Crime::class], version = 1)
abstract class CrimeDatabase: RoomDatabase() {
}
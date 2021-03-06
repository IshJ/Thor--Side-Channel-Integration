package threads.thor.core.pages;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Page.class}, version = 75, exportSchema = false)
public abstract class PageDatabase extends RoomDatabase {

    public abstract PageDao pageDao();

}

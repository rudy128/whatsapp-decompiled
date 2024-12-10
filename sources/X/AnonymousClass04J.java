package X;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.util.Log;

/* renamed from: X.04J  reason: invalid class name */
public class AnonymousClass04J extends AsyncQueryHandler {
    public final /* synthetic */ C01910Br A00;

    public void onQueryComplete(int i, Object obj, Cursor cursor) {
        if (cursor == null) {
            Log.w("CarApp.Conn", "Null response from content provider when checking connection to the car, treating as disconnected");
            this.A00.A0E(0);
            return;
        }
        int columnIndex = cursor.getColumnIndex("CarConnectionState");
        if (columnIndex < 0) {
            Log.e("CarApp.Conn", "Connection to car response is missing the connection type, treating as disconnected");
            this.A00.A0E(0);
        } else if (!cursor.moveToNext()) {
            Log.e("CarApp.Conn", "Connection to car response is empty, treating as disconnected");
            this.A00.A0E(0);
        } else {
            this.A00.A0E(Integer.valueOf(cursor.getInt(columnIndex)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04J(ContentResolver contentResolver, C01910Br r2) {
        super(contentResolver);
        this.A00 = r2;
    }
}

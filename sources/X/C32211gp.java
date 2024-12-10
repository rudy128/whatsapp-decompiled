package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1gp  reason: invalid class name and case insensitive filesystem */
public class C32211gp {
    public final AnonymousClass1RM A00;

    public String A00(String str) {
        Cursor A0A;
        C28781at A05 = this.A00.get();
        try {
            A0A = ((C28801av) A05).A02.A0A("SELECT file_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", "SharedMediaIdsStore/getSharedFileByUUID", new String[]{str, String.valueOf(System.currentTimeMillis())});
            if (!A0A.moveToNext()) {
                A0A.close();
                A05.close();
                return null;
            }
            String string = A0A.getString(A0A.getColumnIndexOrThrow("file_name"));
            A0A.close();
            A05.close();
            return string;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(String str, String str2, String str3, String str4) {
        C28791au A06 = this.A00.A06();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("item_uuid", str);
            contentValues.put("file_name", str2);
            contentValues.put("mime_type", str3);
            C63432t4.A01(contentValues, "display_name", str4);
            contentValues.put("expiration_timestamp", String.valueOf(System.currentTimeMillis() + 3600000));
            ((C28801av) A06).A02.A05("shared_media_ids", "INSERT_SHARED_MEDIA", contentValues);
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C32211gp(AnonymousClass1RM r1) {
        this.A00 = r1;
    }
}

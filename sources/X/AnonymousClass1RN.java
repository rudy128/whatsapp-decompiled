package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.1RN  reason: invalid class name */
public class AnonymousClass1RN {
    public final AnonymousClass11P A00;
    public final AnonymousClass1RM A01;

    public synchronized boolean A01(String str) {
        C41851xA BD0;
        C17960vV.A01();
        try {
            C28791au A06 = this.A01.A06();
            try {
                BD0 = A06.BD0();
                ((C28801av) A06).A02.A04("express_path_download_data", "enc_file_hash = ?", "ExpressPathDownloadDataStore/delete", new String[]{str});
                BD0.A00();
                BD0.close();
                A06.close();
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("ExpressPathDownloadDataStore/delete", e);
            return false;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        return true;
        throw th;
    }

    public AnonymousClass1RN(AnonymousClass11P r1, AnonymousClass1RM r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(String str, Integer num) {
        C41851xA BD0;
        C17960vV.A01();
        C28791au A06 = this.A01.A06();
        try {
            BD0 = A06.BD0();
            ContentValues contentValues = new ContentValues();
            contentValues.put("download_state", Integer.valueOf(C123846Wb.A00(num)));
            C23141Ev r7 = ((C28801av) A06).A02;
            if (((long) r7.A02(contentValues, "express_path_download_data", "enc_file_hash = ?", "ExpressPathDownloadDataStore/updateDownloadState", new String[]{str})) <= 0) {
                contentValues.put("enc_file_hash", str);
                r7.A05("express_path_download_data", "ExpressPathDownloadDataStore/insertDownloadState", contentValues);
            }
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}

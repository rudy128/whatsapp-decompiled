package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;

/* renamed from: X.1Nr  reason: invalid class name and case insensitive filesystem */
public class C25301Nr {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass1CL A01;

    public int A00(String str) {
        Cursor A0A;
        try {
            C28781at A04 = this.A00.get();
            try {
                int i = 0;
                A0A = ((C28801av) A04).A02.A0A("SELECT ref_count FROM media_refs WHERE path = ?", "GET_MEDIA_REF_COUNT_SQL", new String[]{str});
                if (A0A.moveToNext()) {
                    i = A0A.getInt(A0A.getColumnIndexOrThrow("ref_count"));
                }
                A0A.close();
                A04.close();
                return i;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDiskIOException e) {
            this.A01.A00(1);
            throw e;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public C25301Nr(AnonymousClass1CL r1, AnonymousClass1Cd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}

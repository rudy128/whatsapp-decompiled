package X;

import android.database.Cursor;

/* renamed from: X.9jH  reason: invalid class name and case insensitive filesystem */
public class C189459jH {
    public final C192439oO A00;

    public int A00() {
        Cursor A002;
        int i;
        C28781at A003 = this.A00.A00();
        try {
            A002 = C23141Ev.A00(((C28801av) A003).A02, "SELECT COUNT(*) as count FROM prefetched_files WHERE prefetched = 0", "XPM_FILE_PREFETCHER_PENDING_COUNT");
            if (A002.moveToNext()) {
                i = C17890vO.A01(A002, "count");
            } else {
                i = 0;
            }
            A002.close();
            A003.close();
            return i;
        } catch (Throwable th) {
            try {
                A003.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C189459jH(C192439oO r1) {
        this.A00 = r1;
    }
}

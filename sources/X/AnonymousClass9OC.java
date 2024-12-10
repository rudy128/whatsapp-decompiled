package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.9OC  reason: invalid class name */
public abstract class AnonymousClass9OC {
    public static final AHQ A00(SQLiteDatabase sQLiteDatabase, C180549Mz r3) {
        C18070vi.A0d(r3, 0);
        AHQ ahq = r3.A00;
        if (ahq != null && C18070vi.A18(ahq.A00, sQLiteDatabase)) {
            return ahq;
        }
        AHQ ahq2 = new AHQ(sQLiteDatabase);
        r3.A00 = ahq2;
        return ahq2;
    }
}

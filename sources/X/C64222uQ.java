package X;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: X.2uQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64222uQ implements DatabaseErrorHandler {
    public final /* synthetic */ File A00;

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C17900vP.A0Y(this.A00, "MessageStoreBackup/integritycheck/error-handler/corrupt-db ", AnonymousClass000.A10());
    }

    public /* synthetic */ C64222uQ(File file) {
        this.A00 = file;
    }
}

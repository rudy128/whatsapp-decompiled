package X;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;

/* renamed from: X.1Cf  reason: invalid class name */
public class AnonymousClass1Cf implements AnonymousClass1Ce {
    public final /* synthetic */ AnonymousClass11O A00;
    public final /* synthetic */ AnonymousClass1CL A01;
    public final /* synthetic */ AnonymousClass1Cd A02;
    public final /* synthetic */ AnonymousClass1CM A03;
    public final /* synthetic */ AnonymousClass00H A04;

    public AnonymousClass1Cf(AnonymousClass11O r1, AnonymousClass1CL r2, AnonymousClass1Cd r3, AnonymousClass1CM r4, AnonymousClass00H r5) {
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void Bqu() {
        C19830z4.A00((C19830z4) this.A04.get()).putBoolean("md_messaging_enabled", true).apply();
        this.A00.A00.edit().putBoolean("force_db_check", false).apply();
    }

    public void Bqv(SQLiteException sQLiteException) {
        AnonymousClass1CL r1;
        int i;
        if (sQLiteException instanceof SQLiteFullException) {
            r1 = this.A01;
            i = 0;
        } else if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
            if (this.A03.A04()) {
                r1 = this.A01;
                i = 2;
            } else {
                return;
            }
        } else if (sQLiteException.toString().contains("unable to open")) {
            r1 = this.A01;
            i = 3;
        } else if (sQLiteException.toString().contains("attempt to write a readonly database")) {
            r1 = this.A01;
            i = 4;
        } else {
            return;
        }
        r1.A00(i);
    }

    public void Bqw(C23141Ev r4) {
        this.A00.A00.edit().putBoolean("force_db_check", false).apply();
    }
}

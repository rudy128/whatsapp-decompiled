package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2Dj  reason: invalid class name */
public final class AnonymousClass2Dj extends C24801Ls {
    public final AnonymousClass11O A00;
    public final AnonymousClass1CO A01;
    public final AnonymousClass1CT A02;
    public final AnonymousClass00H A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Dj(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass11O r9, AnonymousClass1Cb r10, AnonymousClass1CO r11, AnonymousClass1CT r12, AnonymousClass00H r13) {
        super(r8.A00, r7, r10, "backup.db", 1);
        C18070vi.A0w(r8, r7, r11, r13, r9);
        C18070vi.A0l(r10, r12);
        this.A01 = r11;
        this.A03 = r13;
        this.A00 = r9;
        this.A02 = r12;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.1F1] */
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C18070vi.A0d(sQLiteDatabase, 0);
        synchronized (this) {
            C23141Ev A012 = A01(sQLiteDatabase);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("creating backup database version ");
            C17900vP.A0o(A10, 1);
            C22781De.A03();
            try {
                SQLiteDatabase sQLiteDatabase2 = A012.A00;
                sQLiteDatabase2.beginTransaction();
                ? obj = new Object();
                AnonymousClass1F6 r6 = new AnonymousClass1F6();
                Set<AnonymousClass12T> set = (Set) this.A02.A00.get();
                for (AnonymousClass12T BLt : set) {
                    BLt.BLt(r6);
                }
                r6.A05(A012, "BackupDbHelper");
                r6.A02(A012);
                for (AnonymousClass12T BLp : set) {
                    BLp.BLp(obj, r6);
                }
                r6.A03(A012, "BackupDbHelper");
                for (AnonymousClass12T BLv : set) {
                    BLv.BLv(r6);
                }
                r6.A04(A012, "BackupDbHelper");
                C60352ns.A01(A012, "wa_db_schema_version", "ConsumerRelease-6f007f19e8ad28d6fdadc4404c800a7b", "BackupDbHelper");
                sQLiteDatabase2.setTransactionSuccessful();
                C17880vN.A1B(this.A00.A00.edit(), "force_backup_check");
                sQLiteDatabase2.endTransaction();
                C22781De.A03();
                this.A00 = A012;
            } catch (Throwable th) {
                C22781De.A03();
                throw th;
            }
        }
    }

    private final C23141Ev A01(SQLiteDatabase sQLiteDatabase) {
        String databaseName = getDatabaseName();
        AnonymousClass1CO r1 = this.A01;
        Object obj = this.A03.get();
        if (obj != null) {
            return AnonymousClass1Eu.A03(sQLiteDatabase, (AnonymousClass1CP) obj, r1, databaseName);
        }
        throw C17890vO.A0K();
    }

    public C23141Ev A09() {
        try {
            SQLiteDatabase A04 = super.A04();
            C18070vi.A0X(A04);
            return A01(A04);
        } catch (SQLiteException e) {
            Log.w("Backup database is corrupt. Removing...", e);
            A08();
            SQLiteDatabase A042 = super.A04();
            C18070vi.A0X(A042);
            return A01(A042);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0K = C18070vi.A0K(sQLiteDatabase);
        A0K.append("Downgrading backup database from version ");
        A0K.append(i);
        C17900vP.A0k(" to ", A0K, i2);
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0K = C18070vi.A0K(sQLiteDatabase);
        A0K.append("Upgrading backup database from version ");
        A0K.append(i);
        C17900vP.A0j(" to ", A0K, i2);
        onCreate(sQLiteDatabase);
    }
}

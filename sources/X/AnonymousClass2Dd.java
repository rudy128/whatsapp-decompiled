package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.2Dd  reason: invalid class name */
public class AnonymousClass2Dd extends AnonymousClass1NZ {
    public static final String[] A09;
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final C24811Lt A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11O A05;
    public final AnonymousClass1CO A06;
    public final AnonymousClass1CT A07;
    public final AnonymousClass00H A08;

    public static boolean A00(C24811Lt r15, C24811Lt r16) {
        Cursor A0A;
        try {
            C28791au A062 = r15.A06();
            try {
                C28791au A063 = r16.A06();
                try {
                    C41851xA BD0 = A062.BD0();
                    try {
                        C41851xA BD02 = A063.BD0();
                        try {
                            String[] strArr = A09;
                            int i = 0;
                            do {
                                String str = strArr[i];
                                C23141Ev r4 = ((C28801av) A063).A02;
                                r4.A04(str, (String) null, AnonymousClass001.A1H("WaDatabaseBackupProducer/copyBackupTables/delete/", str, AnonymousClass000.A10()), (String[]) null);
                                A0A = ((C28801av) A062).A02.A0A(AnonymousClass001.A1H("SELECT * FROM ", str, AnonymousClass000.A10()), AnonymousClass001.A1H("WaDatabaseBackupProducer/copyBackupTables/read/", str, AnonymousClass000.A10()), (String[]) null);
                                while (A0A.moveToNext()) {
                                    ContentValues A082 = C17880vN.A08();
                                    DatabaseUtils.cursorRowToContentValues(A0A, A082);
                                    r4.A05(str, AnonymousClass001.A1H("WaDatabaseBackupProducer/copyBackupTables/write/", str, AnonymousClass000.A10()), A082);
                                }
                                A0A.close();
                                i++;
                            } while (i < 2);
                            BD0.A00();
                            BD02.A00();
                            BD02.close();
                            BD0.close();
                            A063.close();
                            A062.close();
                            return true;
                        } catch (Throwable th) {
                            BD02.close();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        BD0.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    A063.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                A062.close();
                throw th4;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("WaDatabaseBackupProducer/copyBackupTables/exception", e);
            return false;
        } catch (Throwable th5) {
            AnonymousClass0DT.A00(th4, th5);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Cb, java.lang.Object] */
    public C24811Lt A0U() {
        AnonymousClass118 r2 = this.A00;
        return new C24811Lt(this.A04, r2, this.A05, new Object(), this.A06, this.A07, this.A08, "wa-backup.db");
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "wa_trusted_contacts";
        A1Z[1] = "wa_trusted_contacts_send";
        A09 = A1Z;
    }

    public AnonymousClass2Dd(AnonymousClass190 r1, AnonymousClass118 r2, AnonymousClass11O r3, AnonymousClass1NX r4, AnonymousClass1CO r5, AnonymousClass1CT r6, C18030ve r7, C24811Lt r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        super(r4);
        this.A00 = r2;
        this.A01 = r7;
        this.A04 = r1;
        this.A06 = r5;
        this.A03 = r9;
        this.A07 = r6;
        this.A02 = r8;
        this.A08 = r10;
        this.A05 = r3;
    }
}

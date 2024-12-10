package X;

import android.database.sqlite.SQLiteProgram;

public class AHW implements BE4 {
    public final SQLiteProgram A00;

    public AHW(SQLiteProgram sQLiteProgram) {
        C18070vi.A0d(sQLiteProgram, 1);
        this.A00 = sQLiteProgram;
    }

    public void BD5(int i, byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A00.bindBlob(i, bArr);
    }

    public void BDB(int i, String str) {
        C18070vi.A0d(str, 1);
        this.A00.bindString(i, str);
    }

    public static void A00(C20076A6c a6c, Object obj) {
        ((C162128Jb) obj).A00.executeUpdateDelete();
        a6c.A08();
    }

    public void BD9(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public void BDA(int i) {
        this.A00.bindNull(i);
    }

    public void close() {
        this.A00.close();
    }
}

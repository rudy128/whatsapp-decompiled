package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;

/* renamed from: X.1xA  reason: invalid class name and case insensitive filesystem */
public class C41851xA implements Closeable {
    public boolean A00 = false;
    public boolean A01;
    public final AnonymousClass1Ca A02;
    public final C23141Ev A03;

    public void A00() {
        this.A01 = true;
        this.A03.A00.setTransactionSuccessful();
    }

    public boolean A01() {
        if (!this.A03.A00.inTransaction() || this.A00 || this.A01) {
            return false;
        }
        return true;
    }

    public void close() {
        if (!this.A00) {
            if (!this.A01) {
                Log.w("DatabaseTransaction/close/was not set successful");
            }
            C23141Ev r1 = this.A03;
            r1.A00.endTransaction();
            this.A00 = true;
            AnonymousClass1Ca r2 = this.A02;
            if (r2 != null) {
                String str = r1.A02;
                C18070vi.A0d(str, 0);
                if (r2.A04) {
                    Object obj = C60802od.A00.get();
                    C17960vV.A07(obj);
                    C18070vi.A0X(obj);
                    int[] iArr = (int[]) obj;
                    int A002 = C60802od.A00(str);
                    iArr[A002] = iArr[A002] - 1;
                }
            }
        }
    }

    public void finalize() {
        if (!this.A00) {
            Log.e("DatabaseTransaction/finalize/was not closed", (Throwable) null);
            C17960vV.A0F(false, "DatabaseTransaction/finalize/was not closed");
            close();
        }
    }

    public C41851xA(SQLiteTransactionListener sQLiteTransactionListener, C22561Ci r7, AnonymousClass1Ca r8, C23141Ev r9) {
        this.A03 = r9;
        this.A02 = r8;
        ThreadLocal threadLocal = r7.A01;
        Object obj = threadLocal.get();
        C17960vV.A07(obj);
        if (!((Boolean) obj).booleanValue()) {
            SQLiteDatabase sQLiteDatabase = r9.A00;
            C17960vV.A0F(!sQLiteDatabase.inTransaction(), "OuterTransactionManager/already-in-transaction");
            sQLiteDatabase.beginTransactionWithListener(r7);
            threadLocal.set(true);
        } else {
            r9.A00.beginTransaction();
        }
        if (sQLiteTransactionListener != null) {
            Object obj2 = new Object();
            Object obj3 = r7.A02.get();
            C17960vV.A07(obj3);
            ((AbstractMap) obj3).put(obj2, sQLiteTransactionListener);
            sQLiteTransactionListener.onBegin();
        }
        if (r8 != null) {
            String str = r9.A02;
            C18070vi.A0d(str, 0);
            if (r8.A04) {
                Object obj4 = C60802od.A00.get();
                C17960vV.A07(obj4);
                C18070vi.A0X(obj4);
                int[] iArr = (int[]) obj4;
                int A002 = C60802od.A00(str);
                iArr[A002] = iArr[A002] + 1;
            }
        }
    }
}

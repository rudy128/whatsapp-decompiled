package X;

import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1av  reason: invalid class name and case insensitive filesystem */
public class C28801av implements C28791au {
    public boolean A00 = false;
    public final C22561Ci A01;
    public final C23141Ev A02;
    public final ReentrantReadWriteLock.ReadLock A03;

    public C41851xA A00(SQLiteTransactionListener sQLiteTransactionListener, C22561Ci r4, C23141Ev r5) {
        AnonymousClass1Ca r1;
        if (this instanceof C46172Dl) {
            r1 = ((C46172Dl) this).A00;
        } else {
            r1 = null;
        }
        return new C41851xA(sQLiteTransactionListener, r4, r1, r5);
    }

    public C41851xA BD0() {
        Boolean bool = C17970vW.A03;
        C17960vV.A01();
        return A00((SQLiteTransactionListener) null, this.A01, this.A02);
    }

    @Deprecated
    public C41851xA BD1() {
        return A00((SQLiteTransactionListener) null, this.A01, this.A02);
    }

    public void BJ7(Runnable runnable) {
        C17960vV.A0D(this.A02.A00.inTransaction());
        C22561Ci r0 = this.A01;
        Object obj = new Object();
        C41861xB r1 = new C41861xB(r0, runnable);
        Object obj2 = r0.A02.get();
        C17960vV.A07(obj2);
        ((AbstractMap) obj2).put(obj, r1);
    }

    public void close() {
        if (!this.A00) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03;
            if (readLock != null) {
                Thread.currentThread().getId();
                readLock.unlock();
            }
            this.A00 = true;
        }
    }

    public void finalize() {
        if (!this.A00) {
            Log.e("DatabaseSession/finalize/not closed", (Throwable) null);
            C17960vV.A0F(false, "DatabaseSession not closed");
            close();
        }
    }

    public C28801av(C22591Cl r3, ReentrantReadWriteLock.ReadLock readLock, boolean z) {
        this.A03 = readLock;
        this.A01 = r3.BVq();
        if (readLock != null) {
            readLock.lock();
            Thread.currentThread().getId();
        }
        if (z) {
            try {
                this.A02 = r3.Bbw();
            } catch (Throwable th) {
                Log.e("DatabaseSession/failed to get database", th);
                close();
                throw th;
            }
        } else {
            this.A02 = r3.BXw();
        }
    }
}

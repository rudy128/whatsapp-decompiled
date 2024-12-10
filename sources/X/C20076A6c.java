package X;

import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.A6c  reason: case insensitive filesystem */
public abstract class C20076A6c {
    public BE1 A00;
    public List A01;
    public Map A02 = C17880vN.A13();
    public Executor A03;
    public Executor A04;
    public boolean A05;
    public final A2Q A06 = new A2Q(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    public final Map A07 = AnonymousClass8BW.A0u();
    public final Map A08 = C17880vN.A13();
    public final ReentrantReadWriteLock A09 = new ReentrantReadWriteLock();
    public final ThreadLocal A0A = new ThreadLocal();
    public volatile BE3 A0B;

    public BE1 A03() {
        BE1 be1 = this.A00;
        if (be1 != null) {
            return be1;
        }
        C18070vi.A11("internalOpenHelper");
        throw null;
    }

    public void A05() {
        if (!this.A05 && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw AnonymousClass000.A0n("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public static SQLiteDatabase A00(C20076A6c a6c) {
        return ((AHQ) ((AnonymousClass8CH) ((AHV) a6c.A03()).A04.getValue()).A00()).A00;
    }

    public static BDc A01(C20076A6c a6c, C19955A0m a0m, String str) {
        BDc A012 = a0m.A01();
        A012.BDB(1, str);
        a6c.A07();
        return A012;
    }

    public static final void A02(C20076A6c a6c) {
        A00(a6c).endTransaction();
        if (!A00(a6c).inTransaction()) {
            A2Q a2q = a6c.A06;
            if (AnonymousClass8BV.A1Z(a2q.A07)) {
                Executor executor = a2q.A02.A03;
                if (executor == null) {
                    C18070vi.A11("internalQueryExecutor");
                    throw null;
                } else {
                    executor.execute(a2q.A04);
                }
            }
        }
    }

    public Object A04(Callable callable) {
        A07();
        try {
            Object call = callable.call();
            A08();
            return call;
        } finally {
            A02(this);
        }
    }

    public void A06() {
        if (!A00(this).inTransaction() && this.A0A.get() != null) {
            throw AnonymousClass000.A0n("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A07() {
        A05();
        A05();
        BE3 A002 = ((AnonymousClass8CH) ((AHV) A03()).A04.getValue()).A00();
        this.A06.A02(A002);
        SQLiteDatabase sQLiteDatabase = ((AHQ) A002).A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            sQLiteDatabase.beginTransactionNonExclusive();
        } else {
            sQLiteDatabase.beginTransaction();
        }
    }

    public void A08() {
        ((AHQ) ((AnonymousClass8CH) ((AHV) A03()).A04.getValue()).A00()).A00.setTransactionSuccessful();
    }
}

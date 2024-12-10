package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.1xB  reason: invalid class name and case insensitive filesystem */
public class C41861xB implements SQLiteTransactionListener {
    public final /* synthetic */ C22561Ci A00;
    public final /* synthetic */ Runnable A01;

    public void onBegin() {
    }

    public void onRollback() {
    }

    public C41861xB(C22561Ci r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void onCommit() {
        this.A01.run();
    }
}

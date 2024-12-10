package X;

import android.database.sqlite.SQLiteTransactionListener;

public class AA6 implements SQLiteTransactionListener {
    public final /* synthetic */ C195259t3 A00;

    public void onBegin() {
    }

    public void onCommit() {
    }

    public AA6(C195259t3 r1) {
        this.A00 = r1;
    }

    public void onRollback() {
        C195259t3 r1 = this.A00;
        synchronized (r1) {
            r1.A00 = null;
        }
    }
}

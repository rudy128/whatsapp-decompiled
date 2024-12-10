package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2uR  reason: invalid class name and case insensitive filesystem */
public class C64232uR implements SQLiteTransactionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64232uR(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void onBegin() {
        if (this.A00 == 0) {
            ((AtomicBoolean) this.A02).set(false);
        }
    }

    public void onCommit() {
        if (this.A00 == 0) {
            ((AtomicBoolean) this.A02).set(true);
        }
    }

    public void onRollback() {
        ((AtomicBoolean) this.A02).set(false);
    }
}

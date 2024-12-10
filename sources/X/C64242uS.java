package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.2uS  reason: invalid class name and case insensitive filesystem */
public final class C64242uS implements SQLiteTransactionListener {
    public final /* synthetic */ C18090vk A00;

    public void onBegin() {
    }

    public void onCommit() {
    }

    public C64242uS(C18090vk r1) {
        this.A00 = r1;
    }

    public void onRollback() {
        this.A00.invoke();
    }

    public C64242uS() {
    }
}

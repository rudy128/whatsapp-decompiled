package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.AbstractMap;

/* renamed from: X.1Ci  reason: invalid class name and case insensitive filesystem */
public class C22561Ci implements SQLiteTransactionListener {
    public final String A00;
    public final ThreadLocal A01 = new C22581Ck(this);
    public final ThreadLocal A02 = new C22571Cj(this);

    public void onBegin() {
    }

    public void onCommit() {
        Object obj = this.A02.get();
        C17960vV.A07(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            for (SQLiteTransactionListener onCommit : abstractMap.values()) {
                onCommit.onCommit();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(false);
        }
    }

    public void onRollback() {
        Object obj = this.A02.get();
        C17960vV.A07(obj);
        AbstractMap abstractMap = (AbstractMap) obj;
        try {
            for (SQLiteTransactionListener onRollback : abstractMap.values()) {
                onRollback.onRollback();
            }
        } finally {
            abstractMap.clear();
            this.A01.set(false);
        }
    }

    public C22561Ci(String str) {
        this.A00 = str;
    }
}

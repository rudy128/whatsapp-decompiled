package X;

import android.database.DataSetObserver;

/* renamed from: X.3Mu  reason: invalid class name and case insensitive filesystem */
public class C72603Mu extends DataSetObserver {
    public final int A00;
    public final Object A01;

    public C72603Mu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onChanged() {
        if (this.A00 == 0) {
            ((AnonymousClass1b8) this.A01).A04();
        }
    }
}

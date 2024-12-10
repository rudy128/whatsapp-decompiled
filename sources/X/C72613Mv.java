package X;

import android.database.DataSetObserver;

/* renamed from: X.3Mv  reason: invalid class name and case insensitive filesystem */
public class C72613Mv extends DataSetObserver {
    public final /* synthetic */ C73093Oy A00;

    public C72613Mv(C73093Oy r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        C73093Oy r1 = this.A00;
        r1.A06 = true;
        r1.notifyDataSetChanged();
    }

    public void onInvalidated() {
        C73093Oy r1 = this.A00;
        r1.A06 = false;
        r1.notifyDataSetInvalidated();
    }
}

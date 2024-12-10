package X;

import android.database.DataSetObserver;

/* renamed from: X.3Mw  reason: invalid class name and case insensitive filesystem */
public final class C72623Mw extends DataSetObserver {
    public final /* synthetic */ AnonymousClass3XJ A00;

    public C72623Mw(AnonymousClass3XJ r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        super.onChanged();
        AnonymousClass3XJ r1 = this.A00;
        r1.A01 = true;
        r1.notifyDataSetChanged();
    }

    public void onInvalidated() {
        super.onInvalidated();
        AnonymousClass3XJ r1 = this.A00;
        r1.A01 = false;
        r1.notifyDataSetChanged();
    }
}

package X;

import android.database.DataSetObserver;

/* renamed from: X.04P  reason: invalid class name */
public class AnonymousClass04P extends DataSetObserver {
    public final /* synthetic */ AnonymousClass0SF A00;

    public AnonymousClass04P(AnonymousClass0SF r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        AnonymousClass0SF r1 = this.A00;
        if (r1.A0A.isShowing()) {
            r1.CMX();
        }
    }

    public void onInvalidated() {
        this.A00.dismiss();
    }
}

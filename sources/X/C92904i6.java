package X;

import android.view.View;

/* renamed from: X.4i6  reason: invalid class name and case insensitive filesystem */
public class C92904i6 implements C107895an {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C92904i6(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void BzY() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass5ZK) this.A02).BKk();
                return;
            case 1:
                AnonymousClass3v6.A00((View) this.A01, (AnonymousClass3v6) this.A02);
                return;
            default:
                return;
        }
    }

    public void onDismiss() {
    }
}

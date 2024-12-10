package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.4lN  reason: invalid class name and case insensitive filesystem */
public class C94904lN implements AnonymousClass5ZY {
    public final int A00;
    public final Object A01;

    public C94904lN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BEw() {
        C108875cR r1;
        if (this.A00 != 0) {
            ((AnonymousClass01E) ((Fragment) this.A01).A1D()).invalidateOptionsMenu();
            return;
        }
        AnonymousClass1FU r12 = (AnonymousClass1FU) this.A01;
        if ((r12 instanceof C108875cR) && (r1 = (C108875cR) r12) != null) {
            r1.BLL();
        }
    }
}

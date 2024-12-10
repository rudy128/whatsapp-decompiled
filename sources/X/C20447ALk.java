package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.ALk  reason: case insensitive filesystem */
public class C20447ALk implements C72033Kj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20447ALk(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bom() {
        if (this.A00 != 0) {
            ((AnonymousClass92u) this.A01).BiK((C20112A7u) this.A02, C17880vN.A0h(), C17880vN.A0l(), "sanction_check_error_dialog");
            return;
        }
        Fragment fragment = (Fragment) this.A02;
        if (((C185919dM) this.A01).A01) {
            C72463Mc.A1A(fragment);
        }
    }
}

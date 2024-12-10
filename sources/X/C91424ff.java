package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.4ff  reason: invalid class name and case insensitive filesystem */
public class C91424ff implements AnonymousClass1GC, C218317o {
    public final int A00;
    public final Object A01;

    public C91424ff(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C6U(C27581Wq r4, AnonymousClass1F9 r5) {
        DialogFragment dialogFragment;
        switch (this.A00) {
            case 0:
                ((CX4) this.A01).A00(false);
                return;
            case 1:
                AnonymousClass4X4 r1 = (AnonymousClass4X4) this.A01;
                C18070vi.A0i(r1, r4);
                if (r4 == C27581Wq.ON_DESTROY) {
                    r1.A01 = null;
                    return;
                }
                return;
            case 2:
                if (r4.A00() == C23401Fx.RESUMED) {
                    AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                    r2.A2Q.getLifecycle().A06(this);
                    if (r2.A3C != null && (dialogFragment = (DialogFragment) AnonymousClass3MW.A0K(r2).A0Q("expressions_search_dialog_fragment")) != null && dialogFragment.A1b()) {
                        dialogFragment.A28();
                        AnonymousClass4aY.A0b(r2);
                        return;
                    }
                    return;
                }
                return;
            default:
                C90594eK r12 = (C90594eK) this.A01;
                C18070vi.A0d(r4, 2);
                if (r4 == C27581Wq.ON_STOP) {
                    r12.A01();
                    return;
                }
                return;
        }
    }
}

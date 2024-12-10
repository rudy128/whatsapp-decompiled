package X;

import androidx.compose.ui.node.ForceUpdateElement;

/* renamed from: X.0PC  reason: invalid class name */
public abstract class AnonymousClass0PC {
    public static final C014008i A00;

    static {
        C014008i r1 = new C014008i();
        r1.A00 = -1;
        A00 = r1;
    }

    public static final void A01(C06970a9 r4, C17090tj r5) {
        int i = r4.A00;
        if (i < 16) {
            i = 16;
        }
        C06970a9 A02 = C06970a9.A02(new C17090tj[i]);
        A02.A0F(r5);
        C10010he r2 = null;
        while (true) {
            int i2 = A02.A00;
            if (i2 != 0) {
                C17090tj r1 = (C17090tj) A02.A06(i2 - 1);
                if (r1 instanceof AnonymousClass0WB) {
                    AnonymousClass0WB r12 = (AnonymousClass0WB) r1;
                    A02.A0F(r12.A00);
                    A02.A0F(r12.A01);
                } else if (r1 instanceof C17450ug) {
                    r4.A0F(r1);
                } else {
                    if (r2 == null) {
                        r2 = new C10010he(r4);
                    }
                    r1.BC2(r2);
                }
            } else {
                return;
            }
        }
    }

    public static final void A02(AnonymousClass0XW r1, AnonymousClass0WA r2) {
        C18070vi.A0z(r1, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        r2.A02(r1);
    }

    public static final int A00(C17450ug r2, C17450ug r3) {
        if (C18070vi.A18(r2, r3)) {
            return 2;
        }
        Class<?> cls = r2.getClass();
        Class<?> cls2 = r3.getClass();
        if (cls == cls2) {
            return 1;
        }
        if (!(r2 instanceof ForceUpdateElement) || ((ForceUpdateElement) r2).A00.getClass() != cls2) {
            return 0;
        }
        return 1;
    }
}

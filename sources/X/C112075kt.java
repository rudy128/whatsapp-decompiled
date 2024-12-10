package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5kt  reason: invalid class name and case insensitive filesystem */
public final class C112075kt extends C38391rD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C113515nD(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627548, false), i);
    }

    public int A0Q() {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A00;
        int i4 = this.A03;
        if (i > 0) {
            return ((i * i2) / i3) / i4;
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        C113515nD r42 = (C113515nD) r4;
        C18070vi.A0d(r42, 0);
        View view = r42.A0H;
        if (view.isLaidOut()) {
            r42.A0B();
        } else {
            C1420978d.A00(view, new C21356Ail(r42, 7), 13);
        }
    }

    public int getItemViewType(int i) {
        if (i % 2 == 0) {
            return 0;
        }
        return 1;
    }
}

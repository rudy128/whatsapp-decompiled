package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.290  reason: invalid class name */
public abstract class AnonymousClass290 extends AnonymousClass1b8 {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = (X.C45702Bd) r2;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(android.view.ViewGroup r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C45702Bd
            if (r0 == 0) goto L_0x0021
            X.2Bd r2 = (X.C45702Bd) r2
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.Fragment r0 = r2.A01
            if (r5 == r0) goto L_0x0021
            if (r0 == 0) goto L_0x0018
            r1 = 0
            r0.A1a(r1)
            androidx.fragment.app.Fragment r0 = r2.A01
            r0.A23(r1)
        L_0x0018:
            r0 = 1
            r5.A1a(r0)
            r5.A23(r0)
            r2.A01 = r5
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass290.A09(android.view.ViewGroup, java.lang.Object, int):void");
    }

    public Object A0J(ViewGroup viewGroup, int i) {
        C45702Bd r5 = (C45702Bd) this;
        long A0M = r5.A0M(i);
        C001100p r4 = r5.A02;
        Object A05 = r4.A05(A0M);
        Fragment fragment = A05;
        if (A05 == null) {
            if (r5.A00 == null) {
                r5.A00 = new C34001jj(r5.A04);
            }
            Fragment A0N = r5.A0N(i);
            C26550D3n d3n = (C26550D3n) r5.A03.A05(A0M);
            if (d3n != null) {
                A0N.A1U(d3n);
            }
            A0N.A1a(false);
            A0N.A23(false);
            r4.A0A(A0M, A0N);
            r5.A00.A0C(A0N, C17890vO.A0a("f", AnonymousClass000.A10(), A0M), viewGroup.getId());
            fragment = A0N;
        }
        return fragment;
    }

    public void A0K(ViewGroup viewGroup, Object obj, int i) {
        ((C45702Bd) this).A0O(viewGroup, (Fragment) obj, i);
    }

    public boolean A0L(View view, Object obj) {
        return AnonymousClass000.A1Z(((Fragment) obj).A0B, view);
    }

    @Deprecated
    public final Object A0F(ViewGroup viewGroup, int i) {
        return A0J(viewGroup, i);
    }

    public int A0I(Object obj) {
        return -1;
    }

    @Deprecated
    public final void A0G(ViewGroup viewGroup, Object obj, int i) {
        A0K(viewGroup, obj, i);
    }
}

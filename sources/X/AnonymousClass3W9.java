package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3W9  reason: invalid class name */
public final class AnonymousClass3W9 extends C25848Cn6 {
    public final boolean A00;
    public final C18090vk A01;
    public final AnonymousClass1OS A02;

    public void A03(C42011xT r3, int i) {
        View view;
        if (i == 2 && r3 != null && (view = r3.A0H) != null) {
            view.setAlpha(0.8f);
        }
    }

    public void A04(C42011xT r3, RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        super.A04(r3, recyclerView);
        r3.A0H.setAlpha(1.0f);
        this.A01.invoke();
    }

    public boolean A05() {
        return false;
    }

    public boolean A06() {
        return false;
    }

    public boolean A07(C42011xT r4, C42011xT r5, RecyclerView recyclerView) {
        boolean z;
        C18070vi.A0d(recyclerView, 0);
        C18070vi.A0e(r4, 1, r5);
        if (this.A00) {
            z = r5 instanceof C821042p;
        } else {
            z = r5 instanceof AnonymousClass42j;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r3 >= r2) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r4 >= r2) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.C42011xT r7, X.C42011xT r8, androidx.recyclerview.widget.RecyclerView r9) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.1rD r0 = r9.A0B
            r5 = 0
            if (r0 == 0) goto L_0x0033
            int r2 = r0.A0Q()
            int r4 = r7.A05()
            int r3 = r8.A05()
            if (r3 < 0) goto L_0x001a
            r1 = 1
            if (r3 < r2) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r4 < 0) goto L_0x0020
            r0 = 1
            if (r4 < r2) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            X.1OS r2 = r6.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.invoke(r1, r0)
            r5 = 1
        L_0x0033:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3W9.A08(X.1xT, X.1xT, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public AnonymousClass3W9(C18090vk r1, AnonymousClass1OS r2, boolean z) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = z;
    }

    public int A01(C42011xT r2, RecyclerView recyclerView) {
        return C72483Me.A01();
    }
}

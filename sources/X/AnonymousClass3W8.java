package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3W8  reason: invalid class name */
public final class AnonymousClass3W8 extends C25848Cn6 {
    public final C108505bo A00;

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
        this.A00.Bu0();
    }

    public boolean A05() {
        return false;
    }

    public boolean A06() {
        return false;
    }

    public boolean A07(C42011xT r4, C42011xT r5, RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        C18070vi.A0e(r4, 1, r5);
        return !(r5 instanceof C80913yM);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r2 >= r4) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r3 >= r4) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.C42011xT r7, X.C42011xT r8, androidx.recyclerview.widget.RecyclerView r9) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.1rD r0 = r9.A0B
            r5 = 0
            if (r0 == 0) goto L_0x002b
            int r4 = r0.A0Q()
            int r3 = r7.A05()
            int r2 = r8.A05()
            if (r2 < 0) goto L_0x001a
            r1 = 1
            if (r2 < r4) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r3 < 0) goto L_0x0020
            r0 = 1
            if (r3 < r4) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002b
            if (r0 == 0) goto L_0x002b
            X.5bo r0 = r6.A00
            r0.Btz(r3, r2)
            r5 = 1
        L_0x002b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3W8.A08(X.1xT, X.1xT, androidx.recyclerview.widget.RecyclerView):boolean");
    }

    public AnonymousClass3W8(C108505bo r1) {
        this.A00 = r1;
    }

    public int A01(C42011xT r2, RecyclerView recyclerView) {
        return C72483Me.A01();
    }
}

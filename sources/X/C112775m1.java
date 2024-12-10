package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5m1  reason: invalid class name and case insensitive filesystem */
public final class C112775m1 extends D70 {
    public int A00 = 150;
    public int A01 = -1;
    public int A02 = 8;
    public int A03 = -1;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C146797Qq A08 = new C146797Qq(this);
    public final C18030ve A09;
    public final C18100vl A0A = AnonymousClass7S3.A00(this, 15);
    public final AnonymousClass8AA A0B;

    public boolean Bw2(MotionEvent motionEvent, RecyclerView recyclerView) {
        C18070vi.A0d(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.A04 = false;
        }
        return this.A04;
    }

    private final void A00(RecyclerView recyclerView, int i) {
        AnonymousClass8B2 r0;
        boolean z;
        if (i != this.A03) {
            AnonymousClass8AA r2 = this.A0B;
            if (r2.BjF()) {
                if (!this.A05) {
                    r2.CMv();
                }
                z = true;
            } else {
                C42011xT A0P = recyclerView.A0P(i, false);
                if (A0P instanceof C113295mr) {
                    AnonymousClass65B r1 = ((C113295mr) A0P).A03;
                    if ((r1.A0C || !C72453Mb.A1a(this.A0A)) && (r0 = r1.A08) != null) {
                        r2.CHD(r0);
                        z = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A05 = z;
        }
    }

    private final void A01(RecyclerView recyclerView, int i) {
        AnonymousClass8B2 r1;
        if (i != this.A03) {
            C42011xT A0P = recyclerView.A0P(i, false);
            if (A0P instanceof C113295mr) {
                AnonymousClass65B r12 = ((C113295mr) A0P).A03;
                if ((r12.A0C || !C72453Mb.A1a(this.A0A)) && (r1 = r12.A08) != null) {
                    this.A0B.CQF(r1);
                }
            }
        }
    }

    public C112775m1(C18030ve r2, AnonymousClass8AA r3) {
        this.A09 = r2;
        this.A0B = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0087, code lost:
        if (r1 > r3) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C8t(android.view.MotionEvent r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r4 = this;
            boolean r0 = X.C18070vi.A16(r6, r5)
            int r1 = r5.getActionMasked()
            if (r1 == r0) goto L_0x00a1
            r0 = 2
            if (r1 == r0) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x00a1
        L_0x0010:
            return
        L_0x0011:
            float r1 = r5.getX()
            float r0 = r5.getY()
            android.view.View r0 = r6.A0M(r1, r0)
            if (r0 == 0) goto L_0x00d5
            int r3 = androidx.recyclerview.widget.RecyclerView.A00(r0)
            r2 = -1
            if (r3 == r2) goto L_0x00d5
            int r1 = r4.A01
            if (r3 == r1) goto L_0x00d5
            int r0 = r4.A03
            if (r0 == r2) goto L_0x00d5
            if (r1 != r2) goto L_0x0042
            int r1 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r3, r0)
            if (r1 > r0) goto L_0x00d3
        L_0x003a:
            r4.A00(r6, r1)
            if (r1 == r0) goto L_0x00d3
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0042:
            if (r0 <= r1) goto L_0x0058
            if (r0 <= r3) goto L_0x0058
        L_0x0046:
            if (r0 <= r1) goto L_0x005d
            if (r0 <= r3) goto L_0x005d
            if (r1 > r3) goto L_0x0089
            int r0 = r3 + -1
            if (r1 > r0) goto L_0x00d3
        L_0x0050:
            r4.A01(r6, r1)
            if (r1 == r0) goto L_0x00d3
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0058:
            if (r0 >= r1) goto L_0x006b
            if (r0 >= r3) goto L_0x006b
            goto L_0x0046
        L_0x005d:
            if (r1 < r3) goto L_0x0095
            int r0 = r3 + 1
            if (r0 > r1) goto L_0x00d3
        L_0x0063:
            r4.A01(r6, r1)
            if (r1 == r0) goto L_0x00d3
            int r1 = r1 + -1
            goto L_0x0063
        L_0x006b:
            if (r0 <= r1) goto L_0x0079
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0085
        L_0x0071:
            r4.A01(r6, r1)
            if (r1 == r0) goto L_0x0085
            int r1 = r1 + 1
            goto L_0x0071
        L_0x0079:
            int r0 = r0 + 1
            if (r0 > r1) goto L_0x0085
        L_0x007d:
            r4.A01(r6, r1)
            if (r1 == r0) goto L_0x0085
            int r1 = r1 + -1
            goto L_0x007d
        L_0x0085:
            int r1 = r4.A03
            if (r1 <= r3) goto L_0x0095
        L_0x0089:
            int r0 = r1 + -1
            if (r3 > r0) goto L_0x00d3
        L_0x008d:
            r4.A00(r6, r0)
            if (r0 == r3) goto L_0x00d3
            int r0 = r0 + -1
            goto L_0x008d
        L_0x0095:
            int r0 = r1 + 1
            if (r0 > r3) goto L_0x00d3
        L_0x0099:
            r4.A00(r6, r0)
            if (r0 == r3) goto L_0x00d3
            int r0 = r0 + 1
            goto L_0x0099
        L_0x00a1:
            r1 = 0
            r4.A04 = r1
            r0 = 8
            r4.A02 = r0
            r4.A05 = r1
            r0 = -1
            r4.A01 = r0
            r4.A03 = r0
            r4.A06 = r1
            goto L_0x00c6
        L_0x00b2:
            float r2 = r5.getY()
            int r1 = r6.getBottom()
            int r0 = r4.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x00e6
            r0 = 0
            r4.A06 = r0
        L_0x00c6:
            android.os.Handler r0 = r6.getHandler()
            X.7Qq r1 = r4.A08
            r0.removeCallbacks(r1)
            r0 = 0
            r1.A00 = r0
            return
        L_0x00d3:
            r4.A01 = r3
        L_0x00d5:
            float r2 = r5.getY()
            int r1 = r6.getTop()
            int r0 = r4.A00
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            r1 = 0
        L_0x00e6:
            r4.A07 = r1
            if (r1 == 0) goto L_0x011c
            float r2 = r5.getY()
            int r1 = r6.getBottom()
            int r0 = r4.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r2 = r2 - r0
            int r0 = (int) r2
        L_0x00f8:
            int r0 = java.lang.Math.abs(r0)
            int r1 = r4.A00
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + 8
            r4.A02 = r0
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r4.A06 = r0
            X.7Qq r1 = r4.A08
            r1.A00 = r6
            android.os.Handler r0 = r6.getHandler()
            r0.post(r1)
            return
        L_0x011c:
            int r1 = r6.getTop()
            int r0 = r4.A00
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r5.getY()
            float r1 = r1 - r0
            int r0 = (int) r1
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112775m1.C8t(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):void");
    }
}

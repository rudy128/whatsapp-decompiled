package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class D72 implements C72343Lo {
    public final /* synthetic */ CIZ A00;
    public final /* synthetic */ E6R A01;
    public final /* synthetic */ C40391ud A02;
    public final /* synthetic */ BM2 A03;

    public void C3K(boolean z) {
    }

    public void C8t(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public D72(CIZ ciz, E6R e6r, C40391ud r3, BM2 bm2) {
        this.A03 = bm2;
        this.A01 = e6r;
        this.A02 = r3;
        this.A00 = ciz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r6 != 8) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bw2(android.view.MotionEvent r8, androidx.recyclerview.widget.RecyclerView r9) {
        /*
            r7 = this;
            int r6 = r8.getActionMasked()
            X.E6R r5 = r7.A01
            r2 = 1
            r4 = 8
            r1 = 0
            X.BM2 r3 = r7.A03
            boolean r0 = r3.A01
            if (r5 == 0) goto L_0x001d
            if (r0 != 0) goto L_0x001c
            X.1ud r0 = r7.A02
            boolean r0 = r0.CM0()
            if (r0 == 0) goto L_0x001c
            if (r6 != r4) goto L_0x002f
        L_0x001c:
            return r1
        L_0x001d:
            if (r0 != 0) goto L_0x001c
            X.1ud r0 = r7.A02
            boolean r0 = r0.CM0()
            if (r0 == 0) goto L_0x001c
            r0 = 2
            if (r6 == r0) goto L_0x001c
            if (r6 == r4) goto L_0x001c
            if (r6 != r2) goto L_0x002f
            return r1
        L_0x002f:
            float r1 = r8.getY()
            int r0 = r3.A00
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
            X.CIZ r0 = r7.A00
            android.view.GestureDetector r0 = r0.A00
            r0.onTouchEvent(r8)
        L_0x0041:
            float r1 = r8.getY()
            int r0 = r3.A00
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
            r2 = 0
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D72.Bw2(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):boolean");
    }
}

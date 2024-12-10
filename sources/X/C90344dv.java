package X;

import android.graphics.PointF;
import android.os.Handler;
import android.view.View;

/* renamed from: X.4dv  reason: invalid class name and case insensitive filesystem */
public class C90344dv implements View.OnTouchListener, View.OnLongClickListener {
    public PointF A00 = null;
    public boolean A01 = false;
    public final Handler A02 = new Handler();
    public final /* synthetic */ View.OnTouchListener A03;
    public final /* synthetic */ AnonymousClass4aY A04;
    public final /* synthetic */ Runnable A05;

    public C90344dv(View.OnTouchListener onTouchListener, AnonymousClass4aY r3, Runnable runnable) {
        this.A04 = r3;
        this.A03 = onTouchListener;
        this.A05 = runnable;
    }

    public static boolean A00(C90344dv r6) {
        if (!r6.A01) {
            return false;
        }
        r6.A00 = null;
        r6.A01 = false;
        C41111vp r4 = r6.A04.A0h.A00;
        AnonymousClass4YI r0 = (AnonymousClass4YI) r4.A06();
        r4.A0F(new AnonymousClass4YI(r0.A00, r0.A01, true));
        r6.A02.removeCallbacksAndMessages((Object) null);
        r6.A05.run();
        return true;
    }

    public boolean onLongClick(View view) {
        return A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r1 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r1 = r10.getAction()
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r7) goto L_0x004b
            r0 = 2
            if (r1 == r0) goto L_0x0017
            r0 = 3
            if (r1 == r0) goto L_0x004b
        L_0x0010:
            android.view.View$OnTouchListener r0 = r8.A03
            boolean r0 = r0.onTouch(r9, r10)
            return r0
        L_0x0017:
            android.graphics.PointF r0 = r8.A00
            if (r0 == 0) goto L_0x0010
            X.4aY r4 = r8.A04
            java.lang.Integer r0 = r4.A6L
            if (r0 == 0) goto L_0x0010
            float r2 = r10.getX()
            android.graphics.PointF r0 = r8.A00
            float r0 = r0.x
            float r2 = r2 - r0
            float r1 = r10.getY()
            android.graphics.PointF r0 = r8.A00
            float r0 = r0.y
            float r1 = r1 - r0
            float r2 = r2 * r2
            float r1 = r1 * r1
            float r2 = r2 + r1
            double r0 = (double) r2
            double r2 = java.lang.Math.sqrt(r0)
            float r1 = (float) r2
            java.lang.Integer r0 = r4.A6L
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            A00(r8)
            goto L_0x0010
        L_0x004b:
            android.os.Handler r0 = r8.A02
            r0.removeCallbacksAndMessages(r6)
            goto L_0x0010
        L_0x0051:
            X.4aY r5 = r8.A04
            X.3TF r0 = r5.A0h
            X.1vp r4 = r0.A00
            java.lang.Object r0 = r4.A06()
            X.4YI r0 = (X.AnonymousClass4YI) r0
            r3 = 0
            float r2 = r0.A00
            float r1 = r0.A01
            X.4YI r0 = new X.4YI
            r0.<init>(r2, r1, r3)
            r4.A0F(r0)
            r8.A01 = r7
            java.lang.Integer r0 = r5.A6L
            if (r0 == 0) goto L_0x007d
            float r1 = r10.getX()
            float r0 = r10.getY()
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r1, r0)
        L_0x007d:
            r8.A00 = r6
            android.os.Handler r4 = r8.A02
            r0 = 44
            X.4rj r3 = new X.4rj
            r3.<init>((java.lang.Object) r8, (int) r0)
            X.0ve r2 = r5.A3F
            r1 = 5348(0x14e4, float:7.494E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 50
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 700(0x2bc, float:9.81E-43)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
            r4.postDelayed(r3, r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90344dv.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

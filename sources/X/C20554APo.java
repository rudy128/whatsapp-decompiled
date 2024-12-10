package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.APo  reason: case insensitive filesystem */
public class C20554APo implements C160868Ag {
    public View A00;
    public View A01;
    public C192929pG A02;
    public boolean A03 = true;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final AnonymousClass9j0 A06 = new Object();
    public final Activity A07;
    public final AnonymousClass1GV A08;
    public final AnonymousClass1GV A09;
    public final C201911e A0A = AnonymousClass12Q.A00(C37081ow.class);
    public final C23661Hd A0B;
    public final AGV A0C;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.View r9, X.AnonymousClass1DT r10, X.C20554APo r11) {
        /*
            X.9pG r0 = r11.A02
            if (r0 == 0) goto L_0x0030
            if (r9 == 0) goto L_0x0030
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0018
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0031
            android.app.Activity r0 = r11.A07
            boolean r0 = r0.isInPictureInPictureMode()
            if (r0 == 0) goto L_0x0031
        L_0x0018:
            X.6zf r4 = X.C139926zf.A04
        L_0x001a:
            java.lang.Object r2 = r10.A06()
            if (r2 != 0) goto L_0x0027
            int r1 = r4.A00
            if (r1 == 0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x0030
        L_0x0027:
            boolean r0 = X.C42171xk.A00(r2, r4)
            if (r0 != 0) goto L_0x0030
            r10.A0E(r4)
        L_0x0030:
            return
        L_0x0031:
            X.9pG r0 = r11.A02
            X.BDd r2 = X.AnonymousClass9QW.A00(r0)
            if (r2 != 0) goto L_0x004a
            X.1Hd r1 = r11.A0B
            r0 = 1
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0018
            r1 = 3
            r0 = 0
            X.6zf r4 = new X.6zf
            r4.<init>(r0, r0, r1)
            goto L_0x001a
        L_0x004a:
            android.view.ViewParent r4 = r9.getParent()
            android.view.View r4 = (android.view.View) r4
            int r0 = r4.getHeight()
            if (r0 == 0) goto L_0x0030
            X.AHa r2 = (X.C20344AHa) r2
            X.9zN r1 = r2.A02
            X.9zN r0 = X.C199069zN.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0074
            X.9zN r0 = X.C199069zN.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0018
            X.9zM r1 = r2.A01
            X.9zM r0 = X.C199059zM.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0018
        L_0x0074:
            r0 = 2
            int[] r7 = new int[r0]
            r4.getLocationOnScreen(r7)
            r9 = 0
            r6 = r7[r9]
            r5 = 1
            r3 = r7[r5]
            int r1 = r4.getWidth()
            int r1 = r1 + r6
            r0 = r7[r5]
            int r0 = X.AnonymousClass3MW.A02(r4, r0)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r6, r3, r1, r0)
            X.1Zh r0 = r2.A00
            int r6 = r0.A01
            int r3 = r0.A03
            int r2 = r0.A02
            int r1 = r0.A00
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r3, r2, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0)
            boolean r1 = r3.intersect(r8)
            int r0 = r3.width()
            if (r0 != 0) goto L_0x00b4
            int r0 = r3.height()
            if (r0 == 0) goto L_0x0018
        L_0x00b4:
            if (r1 == 0) goto L_0x0018
            r0 = r7[r9]
            int r1 = -r0
            r0 = r7[r5]
            int r0 = -r0
            r3.offset(r1, r0)
            int r0 = r3.left
            if (r0 != 0) goto L_0x00d8
            int r2 = r4.getWidth()
            int r0 = r4.getHeight()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r2, r0)
            r0 = 2
            X.6zf r4 = new X.6zf
            r4.<init>(r1, r3, r0)
            goto L_0x001a
        L_0x00d8:
            int r0 = r3.top
            if (r0 != 0) goto L_0x0030
            int r2 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            X.6zf r4 = new X.6zf
            r4.<init>(r0, r3, r5)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20554APo.A00(android.view.View, X.1DT, X.APo):void");
    }

    public void Bzi() {
        C37081ow r1 = (C37081ow) this.A0A.get();
        Activity activity = this.A07;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void C0Y() {
        C37081ow r1 = (C37081ow) this.A0A.get();
        Activity activity = this.A07;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void C6C(View view) {
        this.A01 = view;
        C201911e r2 = this.A0A;
        ((C37081ow) r2.get()).A02(this.A09);
        ((C37081ow) r2.get()).A02(this.A0C);
        ((C37081ow) r2.get()).A02(this.A08);
        ((C37081ow) r2.get()).A01(this.A07);
    }

    public void C6z() {
        C201911e r1 = this.A0A;
        ((C37081ow) r1.get()).A00();
        ((C37081ow) r1.get()).A00.clear();
    }

    public void CI9(View view) {
        this.A00 = view;
        A00(view, this.A04, this);
    }

    public void CIo(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A00(this.A01, this.A05, this);
            A00(this.A00, this.A04, this);
        }
    }

    public void onGlobalLayout() {
        A00(this.A01, this.A05, this);
        A00(this.A00, this.A04, this);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.9j0, java.lang.Object] */
    public C20554APo(AnonymousClass1FL r3, AGU agu, C23661Hd r5, AGV agv, AnonymousClass18K r7) {
        this.A07 = r3;
        this.A0C = agv;
        this.A08 = agu;
        this.A0B = r5;
        this.A09 = new AGW(r3, this, r7, 1);
    }

    public AnonymousClass1DS BO0() {
        return this.A04;
    }

    public AnonymousClass1DS BO1() {
        return this.A05;
    }
}

package X;

import android.content.Context;
import java.util.ArrayList;

public final class BVJ extends C110125ey {
    public C160948As A00;
    public int A01;
    public int A02;
    public final C38201qr A03 = new C38201qr(this);
    public final int[] A04 = new int[2];
    public final int[] A05 = new int[2];

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 != 3) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            r8 = 0
            X.C18070vi.A0d(r14, r8)
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r14)
            int r1 = r4.getAction()
            r6 = 0
            r7 = r13
            if (r1 != 0) goto L_0x0012
            r13.A02 = r8
        L_0x0012:
            float r0 = r4.getY()
            int r5 = (int) r0
            int r0 = r13.A02
            float r0 = (float) r0
            r3 = 0
            r4.offsetLocation(r3, r0)
            r0 = 2
            if (r1 == 0) goto L_0x0073
            r2 = 1
            if (r1 == r2) goto L_0x006b
            if (r1 == r0) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x006b
        L_0x0029:
            return r6
        L_0x002a:
            int r11 = r13.A01
            int r11 = r11 - r5
            int[] r1 = r13.A04
            int[] r12 = r13.A05
            boolean r0 = r13.dispatchNestedPreScroll(r8, r11, r1, r12)
            if (r0 == 0) goto L_0x004b
            r0 = r1[r2]
            int r11 = r11 - r0
            r0 = r12[r2]
            int r5 = r5 - r0
            r13.A01 = r5
            float r0 = (float) r0
            float r0 = -r0
            r4.offsetLocation(r3, r0)
            int r1 = r13.A02
            r0 = r12[r2]
            int r1 = r1 + r0
            r13.A02 = r1
        L_0x004b:
            boolean r6 = super.onTouchEvent(r4)
            r9 = r12[r2]
            r10 = r8
            boolean r0 = r7.dispatchNestedScroll(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0029
            r0 = r12[r2]
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            int r0 = r13.A02
            r1 = r12[r2]
            int r0 = r0 + r1
            r13.A02 = r0
            int r0 = r13.A01
            int r0 = r0 - r1
            r13.A01 = r0
            return r6
        L_0x006b:
            boolean r6 = super.onTouchEvent(r4)
            r13.stopNestedScroll()
            return r6
        L_0x0073:
            boolean r6 = super.onTouchEvent(r4)
            r13.A01 = r5
            r13.startNestedScroll(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVJ.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A03.A0C(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A03.A0B(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A03.A0E(iArr, iArr2, i, i2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return C38201qr.A08(this.A03, iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public final C160948As getWebViewDelegate$app_productinfra_webview_webview() {
        return this.A00;
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1W(this.A03.A01);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A03.A02;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A03.A0A(z);
    }

    public boolean startNestedScroll(int i) {
        return this.A03.A0D(i, 0);
    }

    public void stopNestedScroll() {
        this.A03.A09(0);
    }

    public BVJ(Context context) {
        super(context);
        setNestedScrollingEnabled(false);
        ArrayList A13 = AnonymousClass000.A13();
        this.A01 = C110125ey.A00(C137566vf.A00(), AnonymousClass000.A13(), A13);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C160948As r0 = this.A00;
        if (r0 != null) {
            r0.CAX(i2, i4);
        }
    }

    public final void setWebViewDelegate$app_productinfra_webview_webview(C160948As r1) {
        this.A00 = r1;
    }
}

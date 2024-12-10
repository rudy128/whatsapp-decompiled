package X;

import android.text.method.LinkMovementMethod;

/* renamed from: X.5dp  reason: invalid class name and case insensitive filesystem */
public class C109675dp extends LinkMovementMethod {
    public static C109675dp A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r1 <= r3.getLineRight(r2)) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.widget.TextView r6, android.text.Spannable r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            boolean r0 = X.C1401770f.A01()
            if (r0 != 0) goto L_0x0056
            int r1 = r8.getAction()
            r0 = 1
            if (r1 == r0) goto L_0x000f
            if (r1 != 0) goto L_0x0056
        L_0x000f:
            float r0 = r8.getX()
            int r4 = (int) r0
            float r0 = r8.getY()
            int r1 = (int) r0
            int r0 = r6.getTotalPaddingLeft()
            int r4 = r4 - r0
            int r0 = r6.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r6.getScrollX()
            int r4 = r4 + r0
            int r0 = r6.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r3 = r6.getLayout()
            if (r1 < 0) goto L_0x004e
            int r0 = r3.getHeight()
            if (r1 > r0) goto L_0x004e
            int r2 = r3.getLineForVertical(r1)
            float r1 = (float) r4
            float r0 = r3.getLineLeft(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            float r0 = r3.getLineRight(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
        L_0x004e:
            android.text.Selection.removeSelection(r7)
            boolean r0 = android.text.method.Touch.onTouchEvent(r6, r7, r8)
            return r0
        L_0x0056:
            boolean r0 = super.onTouchEvent(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109675dp.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}

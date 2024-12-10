package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8D2  reason: invalid class name */
public final class AnonymousClass8D2 extends TouchDelegate {
    public static final Rect A02 = AnonymousClass3MW.A07();
    public final List A00 = AnonymousClass000.A13();
    public final ViewGroup A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8D2(ViewGroup viewGroup, List list) {
        super(A02, viewGroup);
        C18070vi.A0d(viewGroup, 1);
        this.A01 = viewGroup;
        A00(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
        if (r12.contains(r6, r5) != false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            r9 = 0
            X.C18070vi.A0d(r15, r9)
            java.util.List r8 = r14.A00
            int r0 = X.AnonymousClass3MX.A01(r8)
            if (r0 < 0) goto L_0x0127
        L_0x000c:
            int r13 = r0 + -1
            java.lang.Object r7 = r8.get(r0)
            X.9yK r7 = (X.C198429yK) r7
            float r0 = r15.getX()
            int r6 = (int) r0
            float r0 = r15.getY()
            int r5 = (int) r0
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x007f
            r0 = 0
            r7.A01 = r0
            r7.A00 = r0
            android.view.ViewGroup r4 = r7.A03
            X.C198429yK.A00(r4, r7)
            android.view.View r3 = r7.A01
            if (r3 == 0) goto L_0x007f
            X.CTS r2 = r7.A04
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            r3.getHitRect(r1)
            float r0 = r2.A04
            r10 = 1
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            float r0 = r2.A01
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            int r0 = r1.left
            float r10 = (float) r0
            float r0 = r2.A02
            float r10 = r10 - r0
            int r0 = (int) r10
            r1.left = r0
            int r0 = r1.right
            float r10 = (float) r0
            float r0 = r2.A03
        L_0x0056:
            float r10 = r10 + r0
            int r0 = (int) r10
            r1.right = r0
            int r0 = r1.top
            float r10 = (float) r0
            float r0 = r2.A05
            float r10 = r10 - r0
            int r0 = (int) r10
            r1.top = r0
            int r0 = r1.bottom
            float r10 = (float) r0
            float r0 = r2.A00
            float r10 = r10 + r0
            int r0 = (int) r10
            r1.bottom = r0
            r7.A00 = r1
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == r4) goto L_0x007f
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x007f
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r0 = r7.A00
            r4.offsetDescendantRectToMyCoords(r1, r0)
        L_0x007f:
            android.graphics.Rect r3 = r7.A00
            if (r3 == 0) goto L_0x00f3
            android.view.View r2 = r7.A01
            if (r2 == 0) goto L_0x00f3
            android.view.ViewGroup r0 = r7.A03
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r11 = r0.getScaledTouchSlop()
            android.graphics.Rect r12 = X.AnonymousClass3MW.A07()
            r12.set(r3)
            int r0 = -r11
            r12.inset(r0, r0)
            int r1 = r15.getAction()
            r10 = 1
            r4 = 2
            if (r1 == 0) goto L_0x00ec
            if (r1 == r10) goto L_0x00d6
            if (r1 == r4) goto L_0x00d6
            r0 = 3
            if (r1 != r0) goto L_0x00f3
            boolean r3 = r7.A02
            r7.A02 = r9
        L_0x00b3:
            if (r3 == 0) goto L_0x00f3
            if (r10 == 0) goto L_0x00ce
            int r0 = r2.getWidth()
            int r0 = r0 / r4
            float r1 = (float) r0
            int r0 = r2.getHeight()
            int r0 = r0 / r4
            float r0 = (float) r0
            r15.setLocation(r1, r0)
        L_0x00c6:
            boolean r0 = r2.dispatchTouchEvent(r15)
            if (r0 == 0) goto L_0x00f3
            r0 = 1
            return r0
        L_0x00ce:
            int r0 = r11 * 2
            float r0 = (float) r0
            float r0 = -r0
            r15.setLocation(r0, r0)
            goto L_0x00c6
        L_0x00d6:
            boolean r3 = r7.A02
            if (r3 == 0) goto L_0x00e1
            boolean r0 = r12.contains(r6, r5)
            r1 = 0
            if (r0 == 0) goto L_0x00e2
        L_0x00e1:
            r1 = 1
        L_0x00e2:
            int r0 = r15.getAction()
            if (r0 != r10) goto L_0x00ea
            r7.A02 = r9
        L_0x00ea:
            r10 = r1
            goto L_0x00b3
        L_0x00ec:
            boolean r3 = r3.contains(r6, r5)
            r7.A02 = r3
            goto L_0x00b3
        L_0x00f3:
            if (r13 < 0) goto L_0x0127
            r0 = r13
            goto L_0x000c
        L_0x00f8:
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            android.content.res.Configuration r0 = X.C108965cb.A03(r0)
            int r0 = r0.getLayoutDirection()
            boolean r11 = X.C17890vO.A1R(r0)
            int r0 = r1.left
            float r10 = (float) r0
            if (r11 == 0) goto L_0x011a
            float r0 = r2.A01
            float r10 = r10 - r0
            int r0 = (int) r10
            r1.left = r0
            int r0 = r1.right
            float r10 = (float) r0
            float r0 = r2.A04
            goto L_0x0056
        L_0x011a:
            float r0 = r2.A04
            float r10 = r10 - r0
            int r0 = (int) r10
            r1.left = r0
            int r0 = r1.right
            float r10 = (float) r0
            float r0 = r2.A01
            goto L_0x0056
        L_0x0127:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8D2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void A00(List list) {
        List list2 = this.A00;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(new C198429yK(this.A01, (CTS) it.next()));
        }
        list2.addAll(A0D);
        C29391cC.A0H(list2, C21482Akn.A00);
    }
}

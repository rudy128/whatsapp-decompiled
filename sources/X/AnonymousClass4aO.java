package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;

/* renamed from: X.4aO  reason: invalid class name */
public abstract class AnonymousClass4aO {
    public static final int[] A00 = new int[2];

    public static final void A01(Matrix.ScaleToFit scaleToFit, View view, int i, int i2, int i3) {
        C18070vi.A0d(view, 0);
        view.setOutlineProvider(new AnonymousClass3ON(scaleToFit, i, i2, i3));
        view.setClipToOutline(true);
    }

    public static final void A02(View view) {
        C18070vi.A0d(view, 0);
        view.setOutlineProvider(new C22649BHn(1));
        view.setClipToOutline(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(android.graphics.Rect r10, android.view.View r11, float r12, float r13) {
        /*
            r7 = 0
            X.C18070vi.A0d(r11, r7)
            r8 = 3
            X.C18070vi.A0d(r10, r8)
            int[] r6 = A00
            r11.getLocationOnScreen(r6)
            float r2 = r11.getRotation()
            r1 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r1
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            float r2 = r2 + r1
        L_0x001a:
            r0 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 / r0
            int r5 = (int) r2
            r1 = 1
            if (r5 == r1) goto L_0x008d
            if (r5 != r8) goto L_0x0024
            r5 = 1
        L_0x0024:
            r0 = 2
            r9 = 1
            r3 = r6[r1]
            if (r5 == r1) goto L_0x0088
            if (r5 != r0) goto L_0x0031
            int r0 = r11.getHeight()
        L_0x0030:
            int r3 = r3 - r0
        L_0x0031:
            int r0 = r10.top
            int r3 = r3 - r0
            r2 = r6[r1]
            if (r5 == 0) goto L_0x0083
            if (r5 != r8) goto L_0x003f
            int r0 = r11.getWidth()
        L_0x003e:
            int r2 = r2 + r0
        L_0x003f:
            int r0 = r10.bottom
            int r2 = r2 + r0
            r0 = 2
            r4 = r6[r7]
            if (r5 == r0) goto L_0x007e
            if (r5 != r8) goto L_0x004e
            int r0 = r11.getHeight()
        L_0x004d:
            int r4 = r4 - r0
        L_0x004e:
            int r0 = r10.left
            int r4 = r4 - r0
            if (r5 == 0) goto L_0x006f
            if (r5 == r1) goto L_0x0076
            r1 = r6[r7]
        L_0x0057:
            int r0 = r10.right
            int r1 = r1 + r0
            float r0 = (float) r4
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            float r0 = (float) r1
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            float r0 = (float) r3
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            float r0 = (float) r2
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            return r9
        L_0x006f:
            r0 = r6[r7]
            int r1 = r11.getWidth()
            goto L_0x007c
        L_0x0076:
            r0 = r6[r7]
            int r1 = r11.getHeight()
        L_0x007c:
            int r1 = r1 + r0
            goto L_0x0057
        L_0x007e:
            int r0 = r11.getWidth()
            goto L_0x004d
        L_0x0083:
            int r0 = r11.getHeight()
            goto L_0x003e
        L_0x0088:
            int r0 = r11.getWidth()
            goto L_0x0030
        L_0x008d:
            r5 = 3
            goto L_0x0024
        L_0x008f:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aO.A06(android.graphics.Rect, android.view.View, float, float):boolean");
    }

    public static final RectF A00(View view) {
        View view2;
        Rect A07 = AnonymousClass3MW.A07();
        view.getHitRect(A07);
        A07.offset(-A07.left, -A07.top);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        Rect A072 = AnonymousClass3MW.A07();
        while (true) {
            View view3 = view;
            view = view2;
            if (view2 == null) {
                break;
            }
            view3.getHitRect(A072);
            A07.offset(A072.left, A072.top);
            ViewParent parent2 = view2.getParent();
            if (!(parent2 instanceof View)) {
                break;
            }
            view2 = (View) parent2;
        }
        return new RectF(A07);
    }

    public static final void A03(View view) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            z = true;
        } else {
            z = layoutParams instanceof AbsListView.LayoutParams;
        }
        C17960vV.A0F(z, "Layout params for header/footer view should be of type AbsListView.LayoutParams");
    }

    public static final void A04(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C18070vi.A0X(childAt);
                A04(childAt, z);
            }
        }
    }

    public static final boolean A05(Rect rect, MotionEvent motionEvent, View view) {
        C18070vi.A0i(view, rect);
        return A06(rect, view, motionEvent.getRawX(), motionEvent.getRawY());
    }
}

package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
import com.whatsapp.mediacomposer.doodle.textentry.strokepicker.StrokeWidthTool;

/* renamed from: X.BJi  reason: case insensitive filesystem */
public class C22667BJi extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;

    public C22667BJi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A1S(View view, int i) {
        if (13 - this.A00 != 0 || i != 4) {
            super.A1S(view, i);
        }
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        if (4 - this.A00 != 0) {
            super.A1T(view, accessibilityEvent);
            return;
        }
        super.A1T(view, accessibilityEvent);
        accessibilityEvent.setChecked(((CheckableImageButton) this.A01).isChecked());
    }

    public void A1U(View view, AccessibilityEvent accessibilityEvent) {
        if (2 - this.A00 != 0) {
            super.A1U(view, accessibilityEvent);
            return;
        }
        super.A1U(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            BottomSheetDragHandleView.A02((BottomSheetDragHandleView) this.A01);
        }
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        View view2 = view;
        int i2 = i;
        Bundle bundle2 = bundle;
        switch (this.A00) {
            case 0:
                if (i2 == 1048576) {
                    BEZ bez = (BEZ) this.A01;
                    if (bez.A0B) {
                        bez.A04(AnonymousClass00R.A0N);
                        return true;
                    }
                }
                break;
            case 6:
                if (i2 == 1048576) {
                    ((C26155CtN) this.A01).A09(3);
                    return true;
                }
                break;
            case 7:
                if (i2 == 16) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ClockFaceView clockFaceView = (ClockFaceView) this.A01;
                    Rect rect = clockFaceView.A07;
                    view2.getHitRect(rect);
                    float centerX = (float) rect.centerX();
                    float centerY = (float) rect.centerY();
                    ClockHandView clockHandView = clockFaceView.A0B;
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    return true;
                }
                break;
            case 12:
                C18070vi.A0d(view2, 0);
                if (super.A1Y(view2, i2, bundle2)) {
                    return true;
                }
                StrokeWidthTool strokeWidthTool = (StrokeWidthTool) this.A01;
                if (!strokeWidthTool.isEnabled()) {
                    return false;
                }
                if (i2 == 4096 || i2 == 8192) {
                    float f = strokeWidthTool.A01;
                    float f2 = strokeWidthTool.A02;
                    float max = Math.max(1.0f, (f - f2) / 20.0f);
                    if (i2 == 8192) {
                        max = -max;
                    }
                    float f3 = strokeWidthTool.A03;
                    float A002 = BE8.A00(max + f3, f2, f);
                    if (A002 == f3) {
                        return false;
                    }
                    strokeWidthTool.setStrokeWidth(A002);
                    StrokeWidthTool.A01(strokeWidthTool, A002);
                    return true;
                } else if (i2 != 16908349 || bundle == null || !bundle2.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                } else {
                    float f4 = bundle2.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                    if (f4 == strokeWidthTool.A03) {
                        return false;
                    }
                    strokeWidthTool.setStrokeWidth(f4);
                    StrokeWidthTool.A01(strokeWidthTool, f4);
                    return false;
                }
        }
        return super.A1Y(view2, i2, bundle2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0115, code lost:
        r10.A02.setDismissable(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0147, code lost:
        r2 = new X.C26137Ct0(16, (java.lang.CharSequence) r1.getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
        r10.A0L(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.view.View r9, X.C26228CvK r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00f3;
                case 2: goto L_0x0005;
                case 3: goto L_0x00ae;
                case 4: goto L_0x009a;
                case 5: goto L_0x008d;
                case 6: goto L_0x011b;
                case 7: goto L_0x0153;
                case 8: goto L_0x0134;
                case 9: goto L_0x0134;
                case 10: goto L_0x007f;
                case 11: goto L_0x0125;
                case 12: goto L_0x003e;
                case 13: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A1Z(r9, r10)
        L_0x0008:
            return
        L_0x0009:
            super.A1Z(r9, r10)
            r0 = 0
            r10.A0f(r0)
            r10.A0q(r0)
            java.util.List r0 = r10.A08()
            java.util.Iterator r4 = r0.iterator()
        L_0x001b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r3 = r4.next()
            X.Ct0 r3 = (X.C26137Ct0) r3
            java.lang.Object r2 = r3.A03
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            int r1 = r2.getId()
            r0 = 16
            if (r1 == r0) goto L_0x003a
            int r1 = r2.getId()
            r0 = 4
            if (r1 != r0) goto L_0x001b
        L_0x003a:
            r10.A0M(r3)
            goto L_0x001b
        L_0x003e:
            boolean r4 = X.C18070vi.A16(r9, r10)
            super.A1Z(r9, r10)
            java.lang.Object r3 = r8.A01
            com.whatsapp.mediacomposer.doodle.textentry.strokepicker.StrokeWidthTool r3 = (com.whatsapp.mediacomposer.doodle.textentry.strokepicker.StrokeWidthTool) r3
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = "com.whatsapp.mediacomposer.doodle.textentry.strokepicker.StrokeWidthTool"
            r10.A0O(r0)
            float r2 = r3.A02
            float r1 = r3.A01
            float r0 = r3.A03
            X.CgW r0 = X.C25477CgW.A00(r2, r1, r0, r4)
            r10.A0N(r0)
            float r1 = r3.A03
            float r0 = r3.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            X.Ct0 r0 = X.C26137Ct0.A0X
            r10.A0L(r0)
        L_0x006e:
            float r1 = r3.A03
            float r0 = r3.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x007b
            X.Ct0 r0 = X.C26137Ct0.A0Z
            r10.A0L(r0)
        L_0x007b:
            X.Ct0 r2 = X.C26137Ct0.A0g
            goto L_0x0188
        L_0x007f:
            X.C18070vi.A0h(r9, r10)
            super.A1Z(r9, r10)
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            r10.A0F(r0)
            return
        L_0x008d:
            super.A1Z(r9, r10)
            java.lang.Object r0 = r8.A01
            com.google.android.material.internal.NavigationMenuItemView r0 = (com.google.android.material.internal.NavigationMenuItemView) r0
            boolean r0 = r0.A04
            r10.A0d(r0)
            return
        L_0x009a:
            super.A1Z(r9, r10)
            java.lang.Object r1 = r8.A01
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r0 = r1.A00
            r10.A0d(r0)
            boolean r0 = r1.isChecked()
            r10.A0e(r0)
            return
        L_0x00ae:
            super.A1Z(r9, r10)
            java.lang.Object r3 = r8.A01
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r0 = r9 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L_0x00e0
            r2 = 0
            r4 = 0
        L_0x00bb:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x00e0
            android.view.View r0 = r3.getChildAt(r2)
            if (r0 == r9) goto L_0x00e1
            android.view.View r0 = r3.getChildAt(r2)
            boolean r0 = r0 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L_0x00dd
            android.view.View r0 = r3.getChildAt(r2)
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00dd
            int r4 = r4 + 1
        L_0x00dd:
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x00e0:
            r4 = -1
        L_0x00e1:
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            boolean r7 = r9.isChecked()
            r2 = 0
            r3 = 1
            r5 = r3
            r6 = r2
            X.CgV r0 = X.C25476CgV.A00(r2, r3, r4, r5, r6, r7)
            r10.A0a(r0)
            return
        L_0x00f3:
            super.A1Z(r9, r10)
            java.lang.Object r0 = r8.A01
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            boolean r0 = r0.A05
            r10.A0p(r0)
            java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
            java.lang.String r0 = r0.getName()
            r10.A0O(r0)
            return
        L_0x0109:
            super.A1Z(r9, r10)
            java.lang.Object r0 = r8.A01
            X.BEZ r0 = (X.BEZ) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x011e
            r1 = 0
        L_0x0115:
            android.view.accessibility.AccessibilityNodeInfo r0 = r10.A02
            r0.setDismissable(r1)
            return
        L_0x011b:
            super.A1Z(r9, r10)
        L_0x011e:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r10.A0A(r0)
            r1 = 1
            goto L_0x0115
        L_0x0125:
            super.A1Z(r9, r10)
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131886192(0x7f120070, float:1.9406956E38)
            goto L_0x0147
        L_0x0134:
            X.C18070vi.A0h(r9, r10)
            super.A1Z(r9, r10)
            X.Ct0 r0 = X.C26137Ct0.A04
            java.lang.Object r0 = r8.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131888887(0x7f120af7, float:1.9412422E38)
        L_0x0147:
            java.lang.String r1 = r1.getString(r0)
            r0 = 16
            X.Ct0 r2 = new X.Ct0
            r2.<init>((int) r0, (java.lang.CharSequence) r1)
            goto L_0x0188
        L_0x0153:
            super.A1Z(r9, r10)
            r0 = 2131432339(0x7f0b1393, float:1.8486433E38)
            java.lang.Object r0 = r9.getTag(r0)
            int r2 = X.AnonymousClass000.A0M(r0)
            if (r2 <= 0) goto L_0x0174
            java.lang.Object r0 = r8.A01
            com.google.android.material.timepicker.ClockFaceView r0 = (com.google.android.material.timepicker.ClockFaceView) r0
            android.util.SparseArray r1 = r0.A09
            int r0 = r2 + -1
            java.lang.Object r0 = r1.get(r0)
            android.view.View r0 = (android.view.View) r0
            r10.A0F(r0)
        L_0x0174:
            r0 = 0
            boolean r5 = r9.isSelected()
            r1 = 1
            r3 = r1
            r4 = r0
            X.CgV r0 = X.C25476CgV.A00(r0, r1, r2, r3, r4, r5)
            r10.A0a(r0)
            r10.A0f(r1)
            X.Ct0 r2 = X.C26137Ct0.A08
        L_0x0188:
            r10.A0L(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22667BJi.A1Z(android.view.View, X.CvK):void");
    }
}

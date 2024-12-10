package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* renamed from: X.0Od  reason: invalid class name and case insensitive filesystem */
public class C04630Od {
    public int A00;
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public AnonymousClass0SE A03;
    public C004301w A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final PopupWindow.OnDismissListener A09;
    public final C003301m A0A;
    public final boolean A0B;

    public void A03() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public AnonymousClass0SE A01() {
        AnonymousClass0SE r2 = this.A03;
        if (r2 == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            A00(point, defaultDisplay);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                r2 = new AnonymousClass06A(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                r2 = new AnonymousClass06B(context, this.A01, this.A0A, this.A06, this.A07, this.A0B);
            }
            r2.A08(this.A0A);
            r2.A07(this.A09);
            r2.A06(this.A01);
            r2.CIA(this.A04);
            r2.A09(this.A05);
            r2.A03(this.A00);
            this.A03 = r2;
        }
        return r2;
    }

    public void A02() {
        AnonymousClass0SE r0 = this.A03;
        if (r0 != null && r0.BgV()) {
            this.A03.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            X.0SE r0 = r3.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.BgV()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.view.View r0 = r3.A01
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            X.0SE r0 = r3.A01()
            r0.A0A(r1)
            r0.CMX()
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04630Od.A04():boolean");
    }

    public C04630Od(Context context, View view, C003301m r10, boolean z) {
        this(context, view, r10, 2130968621, 0, z);
    }

    public static void A00(Point point, Display display) {
        display.getRealSize(point);
    }

    public C04630Od(Context context, View view, C003301m r5, int i, int i2, boolean z) {
        this.A00 = 8388611;
        this.A09 = new C05380Ry(this, 0);
        this.A08 = context;
        this.A0A = r5;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }
}

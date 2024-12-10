package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.Switch;

public final class BIR extends FrameLayout implements C28588E9c {
    public final Switch A00;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CL6(float r5) {
        /*
            r4 = this;
            android.widget.Switch r3 = r4.A00
            android.graphics.drawable.Drawable r2 = r3.getThumbDrawable()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2 instanceof X.AnonymousClass26r
            if (r0 != 0) goto L_0x0040
            X.C18070vi.A0b(r2)
            X.26r r0 = new X.26r
            r0.<init>(r2)
        L_0x0018:
            r3.setThumbDrawable(r0)
        L_0x001b:
            android.graphics.drawable.Drawable r1 = r3.getThumbDrawable()
            boolean r0 = r1 instanceof X.AnonymousClass26r
            if (r0 == 0) goto L_0x003f
            X.26r r1 = (X.AnonymousClass26r) r1
            if (r1 == 0) goto L_0x003f
            float r0 = r1.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r0 = r0 ^ 1
            r1.A00 = r5
            if (r0 == 0) goto L_0x003f
            android.graphics.Rect r0 = r1.getBounds()
            X.C18070vi.A0X(r0)
            r1.onBoundsChange(r0)
        L_0x003f:
            return
        L_0x0040:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001b
            boolean r0 = r2 instanceof X.AnonymousClass26r
            if (r0 == 0) goto L_0x001b
            X.26r r2 = (X.AnonymousClass26r) r2
            android.graphics.drawable.Drawable r0 = r2.A01
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIR.CL6(float):void");
    }

    public void CL7(ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        Switch switchR = this.A00;
        if (i >= 23) {
            switchR.setThumbTintList(colorStateList);
            return;
        }
        Drawable thumbDrawable = switchR.getThumbDrawable();
        if (thumbDrawable != null) {
            Drawable A0E = BE7.A0E(thumbDrawable);
            C18070vi.A0X(A0E);
            C27831Xu.A03(colorStateList, A0E);
            if (A0E.isStateful()) {
                AnonymousClass000.A17(A0E, switchR);
            }
            switchR.setThumbDrawable(A0E);
        }
    }

    public void CLB(ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 23) {
            Switch switchR = this.A00;
            switchR.setTrackTintList(colorStateList);
            switchR.setTrackTintMode(PorterDuff.Mode.SRC_OVER);
            return;
        }
        Switch switchR2 = this.A00;
        Drawable trackDrawable = switchR2.getTrackDrawable();
        if (trackDrawable != null) {
            Drawable A0E = BE7.A0E(trackDrawable);
            C18070vi.A0X(A0E);
            C27831Xu.A03(colorStateList, A0E);
            if (A0E.isStateful()) {
                AnonymousClass000.A17(A0E, switchR2);
            }
            switchR2.setTrackDrawable(A0E);
        }
    }

    public void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }

    public BIR(Context context) {
        super(context);
        Switch switchR = new Switch(context);
        this.A00 = switchR;
        addView(switchR, -2, -2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }
}

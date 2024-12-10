package com.whatsapp.wds.components.toggle;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.BE7;
import X.C003101k;
import X.C18000vb;
import X.C18070vi;
import X.C19740yt;
import X.C24261Jm;
import X.C24892COk;
import X.C24893COl;
import X.C27771Xm;
import X.C27831Xu;
import X.C72453Mb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.reflect.Field;
import java.util.Arrays;

public final class WDSSwitch extends SwitchCompat {
    public ColorStateList A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public PorterDuff.Mode A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public C18000vb A07;
    public int[] A08;
    public int[] A09;
    public final C24892COk A0A;
    public final C24893COl A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context, AttributeSet attributeSet, int i) {
        super(C27771Xm.A00(new C003101k(context, 2132084388), attributeSet, i, 2132084609), attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A03 = PorterDuff.Mode.SRC_IN;
        Field field = null;
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mSwitchWidth");
            C18070vi.A0X(declaredField);
            declaredField.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        this.A0A = new C24892COk(this, field);
        this.A0B = new C24893COl(this);
        this.A04 = this.A0D;
        this.A00 = C19740yt.A03(context, 2131103355);
        super.setThumbTintList((ColorStateList) null);
        this.A06 = this.A0E;
        this.A02 = this.A0A;
        super.setTrackTintList((ColorStateList) null);
        this.A05 = C24261Jm.A00(context, 2131233559);
        this.A01 = C19740yt.A03(context, 2131103356);
        setMinHeight(0);
        setMinimumHeight(0);
        A00();
        A01();
    }

    private final void A00() {
        Drawable drawable = this.A04;
        ColorStateList colorStateList = this.A00;
        PorterDuff.Mode mode = this.A0B;
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList != null) {
            drawable = BE7.A0E(drawable);
            if (mode != null) {
                C27831Xu.A07(mode, drawable);
            }
        }
        this.A04 = drawable;
        A02();
        super.setThumbDrawable(this.A04);
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r2 = r3.A06
            android.content.res.ColorStateList r1 = r3.A02
            android.graphics.PorterDuff$Mode r0 = r3.A0C
            if (r2 != 0) goto L_0x0048
            r2 = 0
        L_0x0009:
            r3.A06 = r2
            android.graphics.drawable.Drawable r2 = r3.A05
            android.content.res.ColorStateList r1 = r3.A01
            android.graphics.PorterDuff$Mode r0 = r3.A03
            if (r2 != 0) goto L_0x003c
            r2 = 0
        L_0x0014:
            r3.A05 = r2
            r3.A02()
            android.graphics.drawable.Drawable r2 = r3.A06
            if (r2 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r1 = r3.A05
            if (r1 == 0) goto L_0x002c
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            X.AnonymousClass001.A1Q(r2, r1, r0)
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
        L_0x002c:
            int r0 = r2.getIntrinsicWidth()
            r3.setSwitchMinWidth(r0)
        L_0x0033:
            super.setTrackDrawable(r2)
            return
        L_0x0037:
            android.graphics.drawable.Drawable r2 = r3.A05
            if (r2 == 0) goto L_0x0033
            goto L_0x002c
        L_0x003c:
            if (r1 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r2 = X.BE7.A0E(r2)
            if (r0 == 0) goto L_0x0014
            X.C27831Xu.A07(r0, r2)
            goto L_0x0014
        L_0x0048:
            if (r1 == 0) goto L_0x0009
            android.graphics.drawable.Drawable r2 = X.BE7.A0E(r2)
            if (r0 == 0) goto L_0x0009
            X.C27831Xu.A07(r0, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.toggle.WDSSwitch.A01():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r7 = this;
            android.content.res.ColorStateList r0 = r7.A00
            if (r0 != 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r7.A02
            if (r0 != 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r7.A01
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            X.COl r2 = r7.A0B
            java.lang.reflect.Field r1 = r2.A01     // Catch:{ IllegalAccessException -> 0x001a }
            if (r1 == 0) goto L_0x001a
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A00     // Catch:{ IllegalAccessException -> 0x001a }
            float r6 = r1.getFloat(r0)     // Catch:{ IllegalAccessException -> 0x001a }
            goto L_0x0025
        L_0x001a:
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A00
            boolean r0 = r0.isChecked()
            r6 = 0
            if (r0 == 0) goto L_0x0025
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0025:
            android.content.res.ColorStateList r3 = r7.A00
            java.lang.String r5 = "currentStateChecked"
            java.lang.String r4 = "currentStateUnchecked"
            if (r3 == 0) goto L_0x003a
            android.graphics.drawable.Drawable r2 = r7.A04
            int[] r1 = r7.A09
            if (r1 == 0) goto L_0x0061
            int[] r0 = r7.A08
            if (r0 == 0) goto L_0x005d
            X.BEB.A0l(r3, r2, r1, r0, r6)
        L_0x003a:
            android.content.res.ColorStateList r3 = r7.A02
            if (r3 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r2 = r7.A06
            int[] r1 = r7.A09
            if (r1 == 0) goto L_0x0061
            int[] r0 = r7.A08
            if (r0 == 0) goto L_0x005d
            X.BEB.A0l(r3, r2, r1, r0, r6)
        L_0x004b:
            android.content.res.ColorStateList r3 = r7.A01
            if (r3 == 0) goto L_0x000c
            android.graphics.drawable.Drawable r2 = r7.A05
            int[] r1 = r7.A09
            if (r1 == 0) goto L_0x0061
            int[] r0 = r7.A08
            if (r0 == 0) goto L_0x005d
            X.BEB.A0l(r3, r2, r1, r0, r6)
            return
        L_0x005d:
            X.C18070vi.A11(r5)
            goto L_0x0064
        L_0x0061:
            X.C18070vi.A11(r4)
        L_0x0064:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.toggle.WDSSwitch.A02():void");
    }

    public Drawable getThumbDrawable() {
        return this.A04;
    }

    public ColorStateList getThumbTintList() {
        return this.A00;
    }

    public Drawable getTrackDrawable() {
        return this.A06;
    }

    public ColorStateList getTrackTintList() {
        return this.A02;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A07;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C72453Mb.A1R(onCreateDrawableState);
        int[] iArr = new int[r5];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.A09 = iArr;
        int[] iArr2 = onCreateDrawableState;
        int i4 = 0;
        while (true) {
            if (i4 >= r5) {
                iArr2 = Arrays.copyOf(onCreateDrawableState, r5 + 1);
                C18070vi.A0X(iArr2);
                iArr2[r5] = 16842912;
                break;
            }
            int i5 = onCreateDrawableState[i4];
            if (i5 == 16842912) {
                break;
            } else if (i5 == 0) {
                iArr2 = (int[]) onCreateDrawableState.clone();
                iArr2[i4] = 16842912;
                break;
            } else {
                i4++;
            }
        }
        this.A08 = iArr2;
        return onCreateDrawableState;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.A04 = drawable;
        A00();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A00 = colorStateList;
        A00();
    }

    public void setTrackDrawable(Drawable drawable) {
        this.A06 = drawable;
        A01();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        A01();
    }

    public void invalidate() {
        A02();
        super.invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C24892COk cOk = this.A0A;
        int i3 = this.A03;
        try {
            Field field = cOk.A01;
            if (field != null) {
                field.setInt(cOk.A00, i3);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        A00();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        A01();
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A07 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSSwitch(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 2130970453 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970453);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context) {
        this(context, (AttributeSet) null, 2130970453);
        C18070vi.A0d(context, 1);
    }
}

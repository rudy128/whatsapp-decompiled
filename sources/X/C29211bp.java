package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* renamed from: X.1bp  reason: invalid class name and case insensitive filesystem */
public class C29211bp {
    public static final boolean A0K;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public Drawable A0B;
    public LayerDrawable A0C;
    public C28011Ym A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = true;
    public final MaterialButton A0J;

    public static void A02(C29211bp r4) {
        int i;
        C27801Xq A002 = A00(r4, false);
        C27801Xq A003 = A00(r4, true);
        if (A002 != null) {
            A002.A0H(r4.A09, (float) r4.A06);
            if (A003 != null) {
                float f = (float) r4.A06;
                if (r4.A0H) {
                    i = AnonymousClass1ZA.A03(r4.A0J, 2130969148);
                } else {
                    i = 0;
                }
                A003.A01.A04 = f;
                A003.invalidateSelf();
                A003.A0G(ColorStateList.valueOf(i));
            }
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT > 22) {
            z = false;
        }
        A0K = z;
    }

    public static C27801Xq A00(C29211bp r1, boolean z) {
        LayerDrawable layerDrawable = r1.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C27801Xq) ((LayerDrawable) ((InsetDrawable) r1.A0C.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public static void A01(C29211bp r10) {
        int i;
        MaterialButton materialButton = r10.A0J;
        C27801Xq r8 = new C27801Xq(r10.A0D);
        r8.A0E(materialButton.getContext());
        C27831Xu.A04(r10.A07, r8);
        PorterDuff.Mode mode = r10.A0A;
        if (mode != null) {
            C27831Xu.A08(mode, r8);
        }
        r8.A0H(r10.A09, (float) r10.A06);
        C27801Xq r7 = new C27801Xq(r10.A0D);
        r7.setTint(0);
        float f = (float) r10.A06;
        if (r10.A0H) {
            i = AnonymousClass1ZA.A03(materialButton, 2130969148);
        } else {
            i = 0;
        }
        r7.A01.A04 = f;
        r7.invalidateSelf();
        r7.A0G(ColorStateList.valueOf(i));
        C27801Xq r1 = new C27801Xq(r10.A0D);
        r10.A0B = r1;
        C27831Xu.A0D(r1, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AnonymousClass1ZD.A02(r10.A08), new InsetDrawable(new LayerDrawable(new Drawable[]{r7, r8}), r10.A03, r10.A05, r10.A04, r10.A02), r10.A0B);
        r10.A0C = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C27801Xq A002 = A00(r10, false);
        if (A002 != null) {
            A002.A0C((float) r10.A01);
            A002.setState(materialButton.getDrawableState());
        }
    }

    public static void A03(C29211bp r8, int i, int i2) {
        MaterialButton materialButton = r8.A0J;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = r8.A05;
        int i4 = r8.A02;
        r8.A02 = i2;
        r8.A05 = i;
        if (!r8.A0E) {
            A01(r8);
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public AnonymousClass1Xp A04() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.A0C.getNumberOfLayers();
        LayerDrawable layerDrawable2 = this.A0C;
        if (numberOfLayers > 2) {
            drawable = layerDrawable2.getDrawable(2);
        } else {
            drawable = layerDrawable2.getDrawable(1);
        }
        return (AnonymousClass1Xp) drawable;
    }

    public void A05(C28011Ym r6) {
        this.A0D = r6;
        if (!A0K || this.A0E) {
            if (A00(this, false) != null) {
                A00(this, false).setShapeAppearanceModel(r6);
            }
            if (A00(this, true) != null) {
                A00(this, true).setShapeAppearanceModel(r6);
            }
            if (A04() != null) {
                A04().setShapeAppearanceModel(r6);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.A0J;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        A01(this);
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public C29211bp(MaterialButton materialButton, C28011Ym r3) {
        this.A0J = materialButton;
        this.A0D = r3;
    }
}

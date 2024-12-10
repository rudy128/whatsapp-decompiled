package com.whatsapp.quickactionbar;

import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C17880vN;
import X.C18070vi;
import X.C19740yt;
import X.C24128Bvu;
import X.C24129Bvv;
import X.C24130Bvw;
import X.C24131Bvx;
import X.C24885COd;
import X.C25778Clp;
import X.C72463Mc;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WaQuickActionChip extends LinearLayout {
    public WaImageView A00;
    public C24885COd A01;
    public final WaImageView A02;
    public final WaTextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaQuickActionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C24885COd bvv;
        C18070vi.A0d(context, 1);
        View inflate = LayoutInflater.from(context).inflate(2131623984, this, true);
        WaTextView waTextView = (WaTextView) AnonymousClass3MX.A0C(inflate, 2131431916);
        this.A03 = waTextView;
        this.A02 = (WaImageView) AnonymousClass3MX.A0C(inflate, 2131431496);
        waTextView.setMaxLines(1);
        AnonymousClass3MX.A1C(context, waTextView, 2131102322);
        if (attributeSet != null) {
            int[] iArr = C84144If.A0W;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(0, 0);
            if (i == 0) {
                bvv = new C24129Bvv(C25778Clp.A00(obtainStyledAttributes, 4, 5, 2131102322));
            } else if (i == 1) {
                bvv = new C24128Bvu(C25778Clp.A00(obtainStyledAttributes, 1, 2, 2131103036));
            } else if (i == 2) {
                bvv = new C24130Bvw(C25778Clp.A00(obtainStyledAttributes, 4, 5, 2131102322), C25778Clp.A00(obtainStyledAttributes, 1, 2, 2131102322));
            } else if (i == 3) {
                bvv = C24131Bvx.A00;
            } else {
                throw C17880vN.A0y();
            }
            this.A01 = bvv;
            A02(bvv);
            waTextView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(obtainStyledAttributes.getInt(3, 20))});
            obtainStyledAttributes.recycle();
        }
    }

    private final Drawable A00(Integer num, int i) {
        int intValue;
        Drawable A0B;
        if (num == null || (intValue = num.intValue()) == 0 || (A0B = AnonymousClass3MZ.A0B(this, intValue)) == null) {
            return null;
        }
        A0B.setBounds(0, 0, 50, 50);
        A0B.setTint(C19740yt.A00(getContext(), i));
        A0B.setTintMode(PorterDuff.Mode.SRC_IN);
        return A0B;
    }

    public final void setChipVariant(C24885COd cOd) {
        C18070vi.A0d(cOd, 0);
        this.A01 = cOd;
        A02(cOd);
        invalidate();
    }

    public final void setIconsForChip(C25778Clp clp, C25778Clp clp2) {
        Drawable drawable;
        C18070vi.A0d(clp, 0);
        Drawable A002 = A00(clp.A01, clp.A00);
        if (clp2 != null) {
            drawable = A00(clp2.A01, clp2.A00);
        } else {
            drawable = null;
        }
        setIconDawableForChip(A002, drawable);
    }

    public final void setLabel(String str) {
        C18070vi.A0d(str, 0);
        WaTextView waTextView = this.A03;
        waTextView.setText(str);
        waTextView.setVisibility(0);
    }

    private final void A02(C24885COd cOd) {
        Drawable drawable = null;
        if (cOd instanceof C24129Bvv) {
            A01();
            C25778Clp clp = ((C24129Bvv) cOd).A00;
            if (clp != null) {
                drawable = A00(Integer.valueOf(C72463Mc.A0B(clp.A01)), clp.A00);
            }
            this.A02.setImageDrawable(drawable);
        } else if (cOd instanceof C24130Bvw) {
            A01();
            C24130Bvw bvw = (C24130Bvw) cOd;
            C25778Clp clp2 = bvw.A00;
            Drawable A002 = A00(clp2.A01, clp2.A00);
            C25778Clp clp3 = bvw.A01;
            setIconDawableForChip(A002, A00(clp3.A01, clp3.A00));
        } else if (cOd instanceof C24128Bvu) {
            A01();
            C25778Clp clp4 = ((C24128Bvu) cOd).A00;
            setIconDawableForChip((Drawable) null, A00(clp4.A01, clp4.A00));
        } else if (cOd instanceof C24131Bvx) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131168784);
            getLayoutParams().height = dimensionPixelOffset;
            getLayoutParams().width = dimensionPixelOffset;
            this.A03.setVisibility(0);
            C25778Clp clp5 = cOd.A00;
            if (clp5 != null) {
                this.A02.setImageDrawable(A00(clp5.A01, clp5.A00));
            }
        }
    }

    private final void setIconDawableForChip(Drawable drawable, Drawable drawable2) {
        this.A02.setImageDrawable(drawable);
        if (drawable2 != null) {
            if (this.A00 == null) {
                WaImageView waImageView = new WaImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(waImageView.getResources().getDimensionPixelSize(2131168779), 0, 0, 0);
                waImageView.setLayoutParams(layoutParams);
                this.A00 = waImageView;
                addView(waImageView);
            }
            WaImageView waImageView2 = this.A00;
            if (waImageView2 != null) {
                waImageView2.setImageDrawable(drawable2);
                WaImageView waImageView3 = this.A00;
                if (waImageView3 != null) {
                    waImageView3.setVisibility(0);
                    return;
                }
            }
            C18070vi.A11("endIconView");
            throw null;
        }
    }

    private final void A01() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131168784);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setMinimumHeight(dimensionPixelOffset);
        layoutParams.gravity = 16;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168775);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
    }

    public final void setLabel(int i) {
        WaTextView waTextView = this.A03;
        waTextView.setText(i);
        waTextView.setVisibility(0);
    }
}

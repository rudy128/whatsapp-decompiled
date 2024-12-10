package com.whatsapp.wds.components.fab;

import X.AnonymousClass033;
import X.AnonymousClass03N;
import X.AnonymousClass1L9;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YL;
import X.AnonymousClass1YR;
import X.AnonymousClass1ZE;
import X.C003101k;
import X.C18030ve;
import X.C18070vi;
import X.C19740yt;
import X.C27691Xc;
import X.C27771Xm;
import X.C28011Ym;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class WDSFab extends AnonymousClass1YR {
    public C18030ve A00;
    public AnonymousClass1ZE A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }

    public void setShapeAppearanceModel(C28011Ym r5) {
        C18070vi.A0d(r5, 0);
        if (this.A02) {
            AnonymousClass1ZE r3 = this.A01;
            Context context = getContext();
            C18070vi.A0X(context);
            r5 = new C28011Ym().A03((float) context.getResources().getDimensionPixelSize(r3.cornerRadius));
        }
        super.setShapeAppearanceModel(r5);
    }

    public final void setWdsFabStyle(AnonymousClass1ZE r3) {
        boolean z = false;
        C18070vi.A0d(r3, 0);
        if (this.A01 != r3) {
            z = true;
        }
        this.A01 = r3;
        if (z) {
            setElevation(0.0f);
            setSize(-1);
            setImageTintList((ColorStateList) null);
            setBackgroundTintList((ColorStateList) null);
            setScaleType(ImageView.ScaleType.CENTER);
            setShapeAppearanceModel(new C28011Ym());
        }
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A02) {
            AnonymousClass1ZE r0 = this.A01;
            Context context = getContext();
            C18070vi.A0X(context);
            colorStateList = C19740yt.A03(context, AnonymousClass1YL.A00(context, r0.backgroundAttrb, r0.background));
        }
        super.setBackgroundTintList(colorStateList);
    }

    public void setElevation(float f) {
        if (this.A02) {
            AnonymousClass1ZE r2 = this.A01;
            Context context = getContext();
            C18070vi.A0X(context);
            f = (float) context.getResources().getDimensionPixelSize(r2.elevation);
        }
        super.setElevation(f);
    }

    public void setImageTintList(ColorStateList colorStateList) {
        if (this.A02) {
            AnonymousClass1ZE r0 = this.A01;
            Context context = getContext();
            C18070vi.A0X(context);
            colorStateList = C19740yt.A03(context, AnonymousClass1YL.A00(context, r0.contentAttrb, r0.content));
        }
        super.setImageTintList(colorStateList);
    }

    public void setSize(int i) {
        if (this.A02) {
            i = this.A01.size;
        }
        super.setSize(i);
    }

    public final C18030ve getAbProps() {
        return this.A00;
    }

    public final AnonymousClass1ZE getWdsFabStyle() {
        return this.A01;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z && !AnonymousClass1L9.A00(getContext()).isFinishing() && !AnonymousClass1L9.A00(getContext()).isDestroyed()) {
            performLongClick();
        }
    }

    public final void setAbProps(C18030ve r1) {
        this.A00 = r1;
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        AnonymousClass03N.A00(this, charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSFab(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context, AttributeSet attributeSet, int i) {
        super(C27771Xm.A00(new C003101k(context, 2132084380), attributeSet, i, 2132084380), attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C18030ve) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A04.get();
        }
        AnonymousClass1ZE r4 = AnonymousClass1ZE.PRIMARY;
        this.A01 = r4;
        this.A02 = true;
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0A;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            int i2 = obtainStyledAttributes.getInt(1, 0);
            AnonymousClass1ZE[] values = AnonymousClass1ZE.values();
            if (i2 >= 0 && i2 < values.length) {
                r4 = values[i2];
            }
            setWdsFabStyle(r4);
            obtainStyledAttributes.recycle();
        }
        setElevation(0.0f);
        setSize(-1);
        setImageTintList((ColorStateList) null);
        setBackgroundTintList((ColorStateList) null);
        setScaleType(ImageView.ScaleType.CENTER);
        setShapeAppearanceModel(new C28011Ym());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSFab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}

package com.whatsapp.biz.catalog.view;

import X.AnonymousClass1HF;
import X.AnonymousClass1VU;
import X.AnonymousClass1Y1;
import X.AnonymousClass26q;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3N8;
import X.AnonymousClass3gq;
import X.AnonymousClass4IN;
import X.C103865Ly;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C21450AkH;
import X.C43031z8;
import X.C65482wZ;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class AvailabilityStateImageView extends AnonymousClass3gq {
    public AnonymousClass3N8 A00;
    public boolean A01;
    public AnonymousClass1VU A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public static final void setImageDrawable$lambda$0(AvailabilityStateImageView availabilityStateImageView, Drawable drawable) {
        C18070vi.A0d(availabilityStateImageView, 0);
        availabilityStateImageView.setImageDrawableInternal(drawable);
    }

    private final void setImageDrawableInternal(Drawable drawable) {
        Drawable drawable2 = null;
        if (drawable != null) {
            AnonymousClass3MW.A1R(this);
            AnonymousClass1VU r1 = this.A02;
            if (r1 == null) {
                C18070vi.A11("helper");
                throw null;
            }
            C65482wZ r3 = new C65482wZ(1);
            if (C18020vd.A05(C18040vf.A02, r1.A00, 1257)) {
                drawable2 = new AnonymousClass26q(drawable, r3);
            } else {
                drawable2 = new C43031z8(drawable, r3);
            }
        }
        super.setImageDrawable(drawable2);
    }

    public final void A06(AnonymousClass3N8 r3, AnonymousClass1VU r4) {
        C18070vi.A0d(r4, 0);
        if (!getAreDependenciesInjected()) {
            this.A02 = r4;
            this.A00 = r3;
            r3.setCallback(this);
            boolean z = this.A01;
            if (r3.A00 != z) {
                r3.A00 = z;
                AnonymousClass3N8.A00(r3, r3.getBounds().width());
                r3.invalidateSelf();
            }
        }
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getBounds() == null) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            canvas.scale(0.8f, 0.8f, (((float) C72473Md.A07(this, getWidth())) * 0.5f) + ((float) getPaddingLeft()), (((float) C72473Md.A04(this)) * 0.5f) + ((float) getPaddingTop()));
            super.onDraw(canvas);
            canvas.restore();
        }
        AnonymousClass3N8 r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("frameDrawable");
            throw null;
        } else {
            r0.draw(canvas);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        C18070vi.A0d(drawable, 0);
        if (!super.verifyDrawable(drawable)) {
            AnonymousClass3N8 r1 = this.A00;
            if (r1 == null) {
                C18070vi.A11("frameDrawable");
                throw null;
            } else if (drawable == r1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private final boolean getAreDependenciesInjected() {
        if (this.A02 == null || this.A00 == null) {
            return false;
        }
        return true;
    }

    public final void setAvailable(boolean z) {
        this.A01 = z;
        int i = 2131886210;
        if (z) {
            i = 2131886209;
        }
        AnonymousClass1HF.A0o(this, AnonymousClass3MY.A0m(getResources(), i));
        C103865Ly r1 = new C103865Ly(this, z);
        if (getAreDependenciesInjected()) {
            r1.invoke();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass3N8 r3 = this.A00;
        if (r3 == null) {
            C18070vi.A11("frameDrawable");
            throw null;
        } else {
            r3.setBounds(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getAreDependenciesInjected()) {
            setImageDrawableInternal(drawable);
        } else {
            post(new C21450AkH(this, drawable, 10));
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        AnonymousClass3N8 r1 = this.A00;
        if (r1 == null) {
            C18070vi.A11("frameDrawable");
            throw null;
        } else {
            r1.setState(getDrawableState());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IN.A00, i, 0);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            setAvailable(obtainStyledAttributes.getBoolean(0, this.A01));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ AvailabilityStateImageView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass6Z5;
import X.C108945cZ;
import X.C108995ce;
import X.C115045tF;
import X.C122406Qd;
import X.C148227h6;
import X.C148237h7;
import X.C148247h8;
import X.C148257h9;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.CircleWaImageView;

public final class AvatarProfilePhotoImageView extends CircleWaImageView {
    public float A00;
    public int A01;
    public final Paint A02;
    public final Paint A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final Paint A08;

    public final void A06(C122406Qd r5, float f, int i) {
        float A002;
        float A003;
        C18070vi.A0d(r5, 0);
        Paint paint = this.A02;
        int ordinal = r5.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = C72453Mb.A0I(this.A04);
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        paint.setColor(i);
        if (ordinal != 0) {
            A002 = C72453Mb.A00(this.A05);
        } else {
            A002 = C72453Mb.A00(this.A06);
        }
        paint.setStrokeWidth(A002);
        Paint paint2 = this.A03;
        if (ordinal != 0) {
            f = 0.0f;
        }
        paint2.setStrokeWidth(f);
        if (ordinal != 0) {
            A003 = C72453Mb.A00(this.A05);
        } else {
            A003 = C72453Mb.A00(this.A06);
        }
        this.A00 = A003;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        int width = getWidth() / 2;
        float f = (float) width;
        float A062 = (float) C108945cZ.A06(this);
        float min = (float) (Math.min(C108995ce.A03(this), C72473Md.A04(this)) / 2);
        canvas.drawCircle(f, A062, min, this.A08);
        super.onDraw(canvas);
        Paint paint = this.A03;
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(f, A062, min - this.A00, paint);
        }
        canvas.drawCircle(f, A062, min, this.A02);
    }

    private final int getBorderColorIdle() {
        return C72453Mb.A0I(this.A04);
    }

    private final float getBorderStrokeWidthIdle() {
        return C72453Mb.A00(this.A05);
    }

    private final float getBorderStrokeWidthSelected() {
        return C72453Mb.A00(this.A06);
    }

    private final int getColorNeutral() {
        return C72453Mb.A0I(this.A07);
    }

    public static /* synthetic */ void setBorderStyle$default(AvatarProfilePhotoImageView avatarProfilePhotoImageView, C122406Qd r2, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        avatarProfilePhotoImageView.A06(r2, f, i);
    }

    public void onMeasure(int i, int i2) {
        int defaultSize;
        int i3 = this.A01;
        if (i3 == 0) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else if (i3 == 1) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            throw AnonymousClass001.A13("Illegal value: ", AnonymousClass000.A10(), i3);
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setAvatarPoseBackgroundColor(int i) {
        this.A08.setColor(i);
        invalidate();
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Integer num = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass1DF.A00(num, new C148247h8(this));
        this.A05 = AnonymousClass1DF.A00(num, new C148237h7(this));
        this.A04 = AnonymousClass1DF.A00(num, new C148227h6(this));
        this.A07 = AnonymousClass1DF.A00(num, new C148257h9(this));
        Paint A062 = AnonymousClass3MW.A06();
        A062.setColor(C72453Mb.A0I(this.A04));
        boolean A042 = C115045tF.A04(A062, C72453Mb.A00(this.A05));
        this.A02 = A062;
        Paint A063 = AnonymousClass3MW.A06();
        C115045tF.A03(A063, this, A042);
        this.A08 = A063;
        Paint A064 = AnonymousClass3MW.A06();
        C108995ce.A0p(A064, C72453Mb.A0I(this.A07), A042);
        this.A03 = A064;
        A00(attributeSet);
    }

    private final void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass6Z5.A01);
        C18070vi.A0X(obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A01 = obtainStyledAttributes.getInt(0, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAvatarPoseBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer num = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass1DF.A00(num, new C148247h8(this));
        this.A05 = AnonymousClass1DF.A00(num, new C148237h7(this));
        this.A04 = AnonymousClass1DF.A00(num, new C148227h6(this));
        this.A07 = AnonymousClass1DF.A00(num, new C148257h9(this));
        Paint A062 = AnonymousClass3MW.A06();
        A062.setColor(C72453Mb.A0I(this.A04));
        boolean A042 = C115045tF.A04(A062, C72453Mb.A00(this.A05));
        this.A02 = A062;
        Paint A063 = AnonymousClass3MW.A06();
        C115045tF.A03(A063, this, A042);
        this.A08 = A063;
        Paint A064 = AnonymousClass3MW.A06();
        C108995ce.A0p(A064, C72453Mb.A0I(this.A07), A042);
        this.A03 = A064;
        A00(attributeSet);
    }

    public AvatarProfilePhotoImageView(Context context) {
        super(context, (AttributeSet) null);
        Integer num = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass1DF.A00(num, new C148247h8(this));
        this.A05 = AnonymousClass1DF.A00(num, new C148237h7(this));
        this.A04 = AnonymousClass1DF.A00(num, new C148227h6(this));
        this.A07 = AnonymousClass1DF.A00(num, new C148257h9(this));
        Paint A062 = AnonymousClass3MW.A06();
        A062.setColor(C72453Mb.A0I(this.A04));
        boolean A042 = C115045tF.A04(A062, C72453Mb.A00(this.A05));
        this.A02 = A062;
        Paint A063 = AnonymousClass3MW.A06();
        C115045tF.A03(A063, this, A042);
        this.A08 = A063;
        Paint A064 = AnonymousClass3MW.A06();
        C108995ce.A0p(A064, C72453Mb.A0I(this.A07), A042);
        this.A03 = A064;
        A00((AttributeSet) null);
    }
}

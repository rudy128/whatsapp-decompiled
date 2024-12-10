package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass6Qk;
import X.AnonymousClass6Z5;
import X.C108945cZ;
import X.C108955ca;
import X.C108995ce;
import X.C115045tF;
import X.C153117p0;
import X.C153127p1;
import X.C153137p2;
import X.C153147p3;
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

public final class AvatarCoinFlipProfilePhotoImageView extends CircleWaImageView {
    public float A00;
    public int A01;
    public final Paint A02;
    public final Paint A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final Paint A08;

    public final void A06(AnonymousClass6Qk r4, float f, int i) {
        float A002;
        int A042 = C108955ca.A04(r4, 0);
        if (A042 != 0) {
            if (A042 == 1) {
                Paint paint = this.A02;
                paint.setColor(C72453Mb.A0I(this.A04));
                C18100vl r2 = this.A05;
                paint.setStrokeWidth(C72453Mb.A00(r2));
                this.A03.setStrokeWidth(0.0f);
                A002 = C72453Mb.A00(r2);
            }
            invalidate();
        }
        Paint paint2 = this.A02;
        paint2.setColor(i);
        C18100vl r1 = this.A06;
        paint2.setStrokeWidth(C72453Mb.A00(r1));
        this.A03.setStrokeWidth(f);
        A002 = C72453Mb.A00(r1);
        this.A00 = A002;
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

    public static /* synthetic */ void setBorderStyle$default(AvatarCoinFlipProfilePhotoImageView avatarCoinFlipProfilePhotoImageView, AnonymousClass6Qk r2, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        avatarCoinFlipProfilePhotoImageView.A06(r2, f, i);
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

    public AvatarCoinFlipProfilePhotoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Integer num = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass1DF.A00(num, new C153137p2(this));
        this.A05 = AnonymousClass1DF.A00(num, new C153127p1(this));
        this.A04 = AnonymousClass1DF.A00(num, new C153117p0(this));
        this.A07 = AnonymousClass1DF.A00(num, new C153147p3(this));
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
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass6Z5.A00);
        C18070vi.A0X(obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A01 = obtainStyledAttributes.getInt(0, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAvatarPoseBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public AvatarCoinFlipProfilePhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer num = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass1DF.A00(num, new C153137p2(this));
        this.A05 = AnonymousClass1DF.A00(num, new C153127p1(this));
        this.A04 = AnonymousClass1DF.A00(num, new C153117p0(this));
        this.A07 = AnonymousClass1DF.A00(num, new C153147p3(this));
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

    public AvatarCoinFlipProfilePhotoImageView(Context context) {
        super(context, (AttributeSet) null);
        Integer num = AnonymousClass00R.A0C;
        this.A06 = AnonymousClass1DF.A00(num, new C153137p2(this));
        this.A05 = AnonymousClass1DF.A00(num, new C153127p1(this));
        this.A04 = AnonymousClass1DF.A00(num, new C153117p0(this));
        this.A07 = AnonymousClass1DF.A00(num, new C153147p3(this));
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

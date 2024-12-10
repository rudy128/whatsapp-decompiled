package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C108945cZ;
import X.C108995ce;
import X.C122406Qd;
import X.C148207h4;
import X.C148217h5;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public final class AvatarProfilePhotoColorView extends View {
    public C122406Qd A00;
    public final Paint A01;
    public final Paint A02;
    public final C18100vl A03;
    public final C18100vl A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        float f;
        C18070vi.A0d(canvas, 0);
        int width = getWidth() / 2;
        int A06 = C108945cZ.A06(this);
        float A022 = C108945cZ.A02(Math.min(C108995ce.A03(this), C72473Md.A04(this)));
        C122406Qd r0 = this.A00;
        C122406Qd r4 = C122406Qd.SELECTED;
        if (r0 == r4) {
            f = A022 - C72453Mb.A00(this.A04);
        } else {
            f = A022;
        }
        float f2 = (float) width;
        float f3 = (float) A06;
        canvas.drawCircle(f2, f3, f, this.A01);
        if (this.A00 == r4) {
            canvas.drawCircle(f2, f3, A022, this.A02);
        }
    }

    private final float getBorderStrokeWidthSelected() {
        return C72453Mb.A00(this.A03);
    }

    private final float getSelectedBorderMargin() {
        return C72453Mb.A00(this.A04);
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public /* synthetic */ AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        Integer num = AnonymousClass00R.A0C;
        this.A03 = AnonymousClass1DF.A00(num, new C148207h4(this));
        this.A04 = AnonymousClass1DF.A00(num, new C148217h5(this));
        this.A00 = C122406Qd.IDLE;
        Paint A06 = AnonymousClass3MW.A06();
        A06.setStrokeWidth(C72453Mb.A00(this.A03));
        AnonymousClass3MW.A1P(A06);
        A06.setAntiAlias(true);
        A06.setDither(true);
        this.A02 = A06;
        Paint A062 = AnonymousClass3MW.A06();
        AnonymousClass3MX.A19(context, A062, AnonymousClass1YL.A00(context, 2130971113, 2131102439));
        C108945cZ.A1L(A062);
        A062.setAntiAlias(true);
        A062.setDither(true);
        this.A01 = A062;
    }
}

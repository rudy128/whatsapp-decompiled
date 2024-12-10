package com.whatsapp.events;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Ys;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C28011Ym;
import X.C28041Yp;
import X.CGM;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;

public final class EventCoverImageView extends FrameLayout implements AnonymousClass009 {
    public ShapeableImageView A00;
    public AnonymousClass031 A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCoverImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, 2131625241, this);
        this.A00 = (ShapeableImageView) AnonymousClass1HF.A06(this, 2131429696);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CGM.A00);
        C18070vi.A0X(obtainStyledAttributes);
        float dimension = obtainStyledAttributes.getDimension(1, getResources().getDimension(2131166686));
        float dimension2 = obtainStyledAttributes.getDimension(0, getResources().getDimension(2131166686));
        obtainStyledAttributes.recycle();
        ShapeableImageView shapeableImageView = this.A00;
        C28041Yp r1 = new C28041Yp(shapeableImageView.A07);
        r1.A02 = new AnonymousClass1Ys(dimension);
        r1.A03 = new AnonymousClass1Ys(dimension);
        r1.A00 = new AnonymousClass1Ys(dimension2);
        r1.A01 = new AnonymousClass1Ys(dimension2);
        shapeableImageView.setShapeAppearanceModel(new C28011Ym(r1));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setCoverImage(Bitmap bitmap) {
        this.A00.setImageBitmap(bitmap);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventCoverImageView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventCoverImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventCoverImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

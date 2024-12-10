package com.whatsapp;

import X.AnonymousClass112;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.BE7;
import X.C108945cZ;
import X.C18070vi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public final class MetaAiFtuxAnimationOverlayView extends View {
    public final Bitmap A00;
    public final Bitmap A01;
    public final Paint A02;
    public final Rect A03;
    public final RectF A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAiFtuxAnimationOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A02 = C108945cZ.A0K(1);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), 2131231112);
        this.A00 = decodeResource;
        this.A01 = BitmapFactory.decodeResource(getResources(), 2131231113);
        this.A04 = AnonymousClass3MW.A08();
        this.A03 = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        if (AnonymousClass112.A06()) {
            A00(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    private final void A00(Canvas canvas) {
        RectF rectF = this.A04;
        BE7.A13(rectF, C108945cZ.A03(this), getHeight());
        Paint paint = this.A02;
        paint.setBlendMode(BlendMode.SCREEN);
        Bitmap bitmap = this.A01;
        Rect rect = this.A03;
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        paint.setBlendMode(BlendMode.OVERLAY);
        canvas.drawBitmap(this.A00, rect, rectF, paint);
    }

    public final RectF getDest() {
        return this.A04;
    }

    public final Rect getSrc() {
        return this.A03;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MetaAiFtuxAnimationOverlayView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ MetaAiFtuxAnimationOverlayView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}

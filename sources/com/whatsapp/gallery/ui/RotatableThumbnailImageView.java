package com.whatsapp.gallery.ui;

import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C108945cZ;
import X.C108965cb;
import X.C108985cd;
import X.C18070vi;
import X.C72453Mb;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.WaMediaThumbnailView;

public final class RotatableThumbnailImageView extends WaMediaThumbnailView {
    public float A00;
    public final Paint A01 = AnonymousClass3Ma.A07();
    public final Paint A02;
    public final Paint A03 = AnonymousClass3Ma.A07();
    public final Path A04 = C108945cZ.A0L();
    public final RectF A05 = AnonymousClass3MW.A08();
    public final RectF A06 = AnonymousClass3MW.A08();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotatableThumbnailImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        Paint A07 = AnonymousClass3Ma.A07();
        C108965cb.A11(A07, PorterDuff.Mode.SRC_IN);
        this.A02 = A07;
        setLayerType(C72453Mb.A03(isHardwareAccelerated() ? 1 : 0), this.A01);
    }

    public void onDraw(Canvas canvas) {
        int i = 0;
        C18070vi.A0d(canvas, 0);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            RectF rectF = this.A06;
            rectF.set(drawable.getBounds());
            rectF.offset((float) getPaddingLeft(), (float) getPaddingTop());
            if (getImageMatrix() != null) {
                getImageMatrix().mapRect(rectF);
            }
            rectF.intersect((float) C108985cd.A04(this), (float) C108985cd.A04(this), C108945cZ.A03(this) - ((float) C108985cd.A04(this)), C108945cZ.A04(this) - ((float) C108985cd.A04(this)));
            RectF rectF2 = this.A05;
            if (!rectF.equals(rectF2)) {
                rectF2.set(rectF);
                Path path = this.A04;
                if (path != null) {
                    path.rewind();
                    float f = this.A00;
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                }
            }
            canvas.drawPath(this.A04, this.A03);
            i = canvas.saveLayer((RectF) null, this.A02);
        }
        super.onDraw(canvas);
        if (drawable != null) {
            canvas.restoreToCount(i);
        }
    }

    public final void setCornerRadius(float f) {
        this.A00 = f;
        invalidate();
    }

    private final float getJaggedBorder() {
        return (float) C108985cd.A04(this);
    }

    public final float getCornerRadius() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotatableThumbnailImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        Paint A07 = AnonymousClass3Ma.A07();
        C108965cb.A11(A07, PorterDuff.Mode.SRC_IN);
        this.A02 = A07;
        setLayerType(C72453Mb.A03(isHardwareAccelerated() ? 1 : 0), this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotatableThumbnailImageView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        Paint A07 = AnonymousClass3Ma.A07();
        C108965cb.A11(A07, PorterDuff.Mode.SRC_IN);
        this.A02 = A07;
        setLayerType(C72453Mb.A03(isHardwareAccelerated() ? 1 : 0), this.A01);
    }
}

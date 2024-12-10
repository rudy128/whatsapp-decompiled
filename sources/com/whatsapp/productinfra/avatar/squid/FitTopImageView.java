package com.whatsapp.productinfra.avatar.squid;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C72453Mb;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import com.whatsapp.WaImageView;

public final class FitTopImageView extends WaImageView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FitTopImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        C18070vi.A0d(context, 1);
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        float f;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float measuredWidth = (float) (getMeasuredWidth() - C72453Mb.A0C(this));
            float measuredHeight = (float) (getMeasuredHeight() - (getPaddingTop() + getPaddingBottom()));
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            if (((float) drawable.getIntrinsicWidth()) * measuredHeight > ((float) drawable.getIntrinsicHeight()) * measuredWidth) {
                f = measuredHeight / intrinsicHeight;
            } else {
                f = measuredWidth / intrinsicWidth;
            }
            imageMatrix.setRectToRect(new RectF(0.0f, 0.5f, intrinsicWidth, measuredHeight / f), new RectF(0.0f, 0.0f, measuredWidth, measuredHeight), Matrix.ScaleToFit.FILL);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FitTopImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setClipToOutline(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FitTopImageView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FitTopImageView(Context context) {
        this(context, (AttributeSet) null, -1);
        C18070vi.A0d(context, 1);
    }
}

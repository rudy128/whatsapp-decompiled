package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C79963wK;
import X.C88164Yo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class ConversationRowDocument$DocumentPreviewView extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public C79963wK A02;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4Yo, X.3wK] */
    private void A00() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.A02 = new C88164Yo(AnonymousClass3MW.A01(getResources(), 2131166243));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A02.A05(bitmap.getWidth(), bitmap.getHeight());
        super.setImageBitmap(bitmap);
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A00();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C79963wK r0 = this.A02;
        ImageView.ScaleType scaleType = getScaleType();
        RectF A022 = r0.A02(i3, i4);
        Matrix matrix = null;
        if (A022 != null) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
            if (scaleType == ImageView.ScaleType.MATRIX) {
                matrix = new Matrix();
                matrix.setRectToRect(A022, rectF, Matrix.ScaleToFit.FILL);
            } else {
                matrix = C79963wK.A00;
            }
        }
        setImageMatrix(matrix);
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A00();
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ConversationRowDocument$DocumentPreviewView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A00();
    }
}

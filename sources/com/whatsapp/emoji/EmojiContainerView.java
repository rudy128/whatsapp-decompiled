package com.whatsapp.emoji;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C108995ce;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiContainerView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public boolean A02;
    public Paint A03;
    public Path A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A02) {
            if (this.A04 == null) {
                this.A04 = C108945cZ.A0L();
            }
            Paint paint = this.A03;
            if (paint == null) {
                paint = AnonymousClass3MW.A06();
                this.A03 = paint;
            }
            paint.setColor(285212672);
            this.A04.reset();
            this.A04.moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A04.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) / 4));
            C108995ce.A0q(this.A04, this, (getWidth() * 3) / 4);
            C108995ce.A0q(this.A04, this, (getWidth() * 9) / 10);
            this.A04.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A04, this.A03);
        }
    }

    public void setIsSkinTone(boolean z) {
        this.A02 = z;
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public EmojiContainerView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }
}

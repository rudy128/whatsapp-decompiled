package com.whatsapp.expressionstray.expression.emoji.view;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass26m;
import X.AnonymousClass74I;
import X.AnonymousClass7x1;
import X.C108995ce;
import X.C117025z5;
import X.C137176v2;
import X.C18070vi;
import X.C18100vl;
import X.C43291zZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class EmojiImageView extends View {
    public int A00 = getResources().getDimensionPixelSize(2131166633);
    public Paint A01;
    public Drawable A02;
    public boolean A03;
    public int[] A04;
    public final C18100vl A05 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, AnonymousClass7x1.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public final void A00(int[] iArr, Drawable drawable) {
        boolean z = false;
        if (iArr == null) {
            this.A04 = null;
            this.A02 = null;
            this.A03 = false;
            setContentDescription((CharSequence) null);
            return;
        }
        C43291zZ.A00(new C117025z5(iArr), false);
        this.A04 = iArr;
        if (AnonymousClass74I.A03(iArr) || AnonymousClass74I.A02(iArr)) {
            z = true;
        }
        this.A03 = z;
        this.A02 = drawable;
        setContentDescription(C137176v2.A01(iArr));
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        if (this.A03) {
            getOutlinePath().reset();
            getOutlinePath().moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            getOutlinePath().lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) / 4));
            C108995ce.A0q(getOutlinePath(), this, (getWidth() * 3) / 4);
            C108995ce.A0q(getOutlinePath(), this, (getWidth() * 9) / 10);
            getOutlinePath().setFillType(Path.FillType.WINDING);
            canvas.drawPath(getOutlinePath(), getPaint());
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            int i = this.A00;
            int width = (getWidth() - i) / 2;
            int height = (getHeight() - i) / 2;
            if (drawable instanceof AnonymousClass26m) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(width, height, width + i, i + height);
            }
            drawable.draw(canvas);
        }
    }

    public final void setPaint(Paint paint) {
        C18070vi.A0d(paint, 0);
        this.A01 = paint;
    }

    private final Path getOutlinePath() {
        return (Path) this.A05.getValue();
    }

    public final Paint getPaint() {
        Paint paint = this.A01;
        if (paint != null) {
            return paint;
        }
        C18070vi.A11("paint");
        throw null;
    }

    public final int[] getEmoji() {
        return this.A04;
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setEmoji(int[] iArr) {
        this.A04 = iArr;
    }

    public final void setEmojiIconSize(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
    }
}

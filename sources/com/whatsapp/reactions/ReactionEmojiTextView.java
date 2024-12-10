package com.whatsapp.reactions;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C108285bR;
import X.C18070vi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionEmojiTextView;

public class ReactionEmojiTextView extends TextEmojiLabel implements C108285bR {
    public float A00;
    public float A01 = 1.0f;
    public Paint A02;
    public float A03 = 1.0f;
    public int A04;

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        if (isSelected()) {
            float pivotX = getPivotX();
            float pivotY = getPivotY();
            canvas.save();
            float f = this.A01;
            canvas.scale(f, f, pivotX, pivotY);
            float f2 = this.A00;
            Paint paint = this.A02;
            if (paint == null) {
                C18070vi.A11("selectionPaint");
                throw null;
            } else {
                canvas.drawCircle(pivotX, pivotY, f2, paint);
                canvas.restore();
            }
        }
        float pivotX2 = getPivotX();
        float pivotY2 = getPivotY();
        canvas.save();
        float f3 = this.A03;
        canvas.scale(f3, f3, pivotX2, pivotY2);
        super.onDraw(canvas);
        canvas.restore();
    }

    public final float getSelectionRadius() {
        return this.A00;
    }

    public void setBackgroundAlpha(float f) {
        Paint paint = this.A02;
        if (paint == null) {
            C18070vi.A11("selectionPaint");
            throw null;
        }
        paint.setAlpha((int) (f * ((float) this.A04)));
        invalidate();
    }

    public void setBackgroundScale(float f) {
        this.A01 = f;
        invalidate();
    }

    public void setForegroundScale(float f) {
        this.A03 = f;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionEmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0j(context, attributeSet);
        A0F();
    }

    private final void A0F() {
        Paint A06 = AnonymousClass3MW.A06();
        AnonymousClass3MX.A19(getContext(), A06, 2131102360);
        this.A04 = A06.getAlpha();
        this.A02 = A06;
        boolean z = this instanceof NewsletterReactionEmojiTextView;
        Resources resources = getResources();
        if (z) {
            this.A00 = AnonymousClass3MW.A00(resources, 2131168036) / 2.0f;
        } else {
            this.A00 = AnonymousClass3MW.A00(resources, 2131168424) / 2.0f;
        }
    }

    public void setForegroundAlpha(float f) {
        getPaint().setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public final void setSelectionRadius(float f) {
        this.A00 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0j(context, attributeSet);
        A0F();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionEmojiTextView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A0F();
    }
}

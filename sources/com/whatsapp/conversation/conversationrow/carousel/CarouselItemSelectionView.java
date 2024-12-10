package com.whatsapp.conversation.conversationrow.carousel;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass118;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public final class CarouselItemSelectionView extends View implements AnonymousClass009 {
    public AnonymousClass118 A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public boolean A03;
    public final Paint A04;
    public final Rect A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        if (this.A03) {
            Rect rect = this.A05;
            getDrawingRect(rect);
            canvas.drawRect(rect, this.A04);
        }
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public boolean isSelected() {
        return this.A03;
    }

    public final void setRowSelected(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            setSelected(z);
            invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass3MZ.A0l(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A05 = AnonymousClass3MW.A07();
        Paint A06 = AnonymousClass3MW.A06();
        this.A04 = A06;
        AnonymousClass3MX.A19(getWaContext().A00, A06, 2131100228);
        A06.setStyle(Paint.Style.FILL);
        A06.setAntiAlias(true);
    }

    public /* synthetic */ CarouselItemSelectionView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

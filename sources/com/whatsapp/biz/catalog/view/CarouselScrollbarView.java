package com.whatsapp.biz.catalog.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass8CK;
import X.C17960vV;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselScrollbarView extends View implements AnonymousClass009 {
    public RecyclerView A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass8CK A04;

    public static void A00(CarouselScrollbarView carouselScrollbarView) {
        boolean z;
        RecyclerView recyclerView = carouselScrollbarView.A00;
        C17960vV.A05(recyclerView);
        int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
        int computeHorizontalScrollOffset = carouselScrollbarView.A00.computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = carouselScrollbarView.A00.computeHorizontalScrollRange();
        if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
            int width = (carouselScrollbarView.getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
            int width2 = ((carouselScrollbarView.getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
            AnonymousClass8CK r1 = carouselScrollbarView.A04;
            if (!(r1.A01 == width2 && r1.A00 == width)) {
                r1.A00 = width;
                r1.A01 = width2;
                AnonymousClass8CK.A00(r1);
            }
            z = true;
        } else {
            AnonymousClass8CK r12 = carouselScrollbarView.A04;
            z = false;
            if (!(r12.A01 == 0 && r12.A00 == 0)) {
                r12.A00 = 0;
                r12.A01 = 0;
                AnonymousClass8CK.A00(r12);
            }
        }
        carouselScrollbarView.A03 = z;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A03) {
            this.A04.draw(canvas);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.A04.setBounds(0, 0, i, i2);
        A00(this);
    }

    public CarouselScrollbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        AnonymousClass8CK r0 = new AnonymousClass8CK(context);
        this.A04 = r0;
        r0.setCallback(this);
        this.A03 = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || this.A04 == drawable) {
            return true;
        }
        return false;
    }

    public CarouselScrollbarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CarouselScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

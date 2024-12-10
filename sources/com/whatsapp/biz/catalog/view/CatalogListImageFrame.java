package com.whatsapp.biz.catalog.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C108985cd;
import X.C18070vi;
import X.C40501uo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class CatalogListImageFrame extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final Drawable A02;
    public final Drawable A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogListImageFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = C40501uo.A00((Resources.Theme) null, context.getResources(), 2131231004);
        this.A02 = C40501uo.A00((Resources.Theme) null, context.getResources(), 2131231003);
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(0, getPaddingTop() - drawable.getIntrinsicHeight(), getWidth(), getPaddingTop());
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setBounds(0, C108985cd.A05(this), getWidth(), C108985cd.A05(this) + drawable2.getIntrinsicHeight());
            drawable2.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogListImageFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ CatalogListImageFrame(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogListImageFrame(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

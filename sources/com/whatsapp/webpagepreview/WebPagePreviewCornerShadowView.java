package com.whatsapp.webpagepreview;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4OH;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C72463Mc;
import X.C74743cP;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class WebPagePreviewCornerShadowView extends FrameLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass4OH A01;
    public AnonymousClass031 A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00();
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int A09 = C72463Mc.A09(this);
            int height = getHeight() - getPaddingBottom();
            Context context = getContext();
            C17960vV.A07(context);
            C18070vi.A0X(context);
            AnonymousClass4OH drawableOverlayUtil = getDrawableOverlayUtil();
            Drawable drawable = drawableOverlayUtil.A01;
            if (drawable == null) {
                drawable = new C74743cP(context.getResources().getDrawable(2131231296), drawableOverlayUtil.A03);
                drawableOverlayUtil.A01 = drawable;
            }
            if (AnonymousClass3MY.A1b(getWhatsAppLocale())) {
                drawable.setBounds(A09 - drawable.getIntrinsicWidth(), height - drawable.getIntrinsicHeight(), A09, height);
            } else {
                drawable.setBounds(paddingLeft, height - drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth() + paddingLeft, height);
            }
            drawable.draw(canvas);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        C18070vi.A0d(view, 0);
        super.onVisibilityChanged(view, i);
    }

    public final void setDrawableOverlayUtil(AnonymousClass4OH r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = (AnonymousClass4OH) A0O.A00.A9R.get();
            this.A00 = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4OH getDrawableOverlayUtil() {
        AnonymousClass4OH r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("drawableOverlayUtil");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00();
        setWillNotDraw(false);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebPagePreviewCornerShadowView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A00();
        setWillNotDraw(false);
    }
}

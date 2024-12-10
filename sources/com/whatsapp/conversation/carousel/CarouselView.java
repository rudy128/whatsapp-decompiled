package com.whatsapp.conversation.carousel;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3XQ;
import X.AnonymousClass3XT;
import X.BM9;
import X.C111705kI;
import X.C18000vb;
import X.C18070vi;
import X.C38251qy;
import X.C38391rD;
import X.C40611uz;
import X.C72473Md;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class CarouselView extends RecyclerView implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setLayoutManager(C38251qy r2, BM9 bm9) {
        C18070vi.A0d(r2, 0);
        setLayoutManager(r2);
        if (bm9 != null) {
            bm9.A08(this);
        }
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void A15(int i) {
        int i2;
        LinearLayoutManager linearLayoutManager;
        C38391rD r0 = this.A0B;
        int i3 = 0;
        if (r0 != null) {
            i2 = r0.A0Q();
        } else {
            i2 = 0;
        }
        if (i >= 0 && i < i2) {
            if (i != 0) {
                i3 = -AnonymousClass000.A0Y(this).getDimensionPixelSize(2131165569);
            }
            C38251qy layoutManager = getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.A1a(i, i3);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void A14() {
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false), new C111705kI(getWhatsAppLocale()));
    }

    public final int getCurrentPosition() {
        C38251qy layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        C18070vi.A0z(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) layoutManager).A1O();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C40611uz r1;
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        setClipToPadding(false);
        setClipChildren(false);
        if (AnonymousClass3MW.A1Z(getWhatsAppLocale())) {
            setLayoutDirection(1);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A04);
        C18070vi.A0X(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(2131165569));
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            r1 = new AnonymousClass3XQ(dimensionPixelSize);
        } else {
            r1 = new AnonymousClass3XT(getWhatsAppLocale(), dimensionPixelSize);
        }
        A0r(r1);
    }

    public /* synthetic */ CarouselView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

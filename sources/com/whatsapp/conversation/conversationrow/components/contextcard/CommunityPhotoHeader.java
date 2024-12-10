package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass1E7;
import X.AnonymousClass1VU;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5ZE;
import X.C18070vi;
import X.C37451pZ;
import X.C72473Md;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;

public final class CommunityPhotoHeader extends WaImageView implements AnonymousClass5ZE {
    public AnonymousClass1VU A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A05() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = AnonymousClass3MZ.A0s(C72483Me.A0P(this));
        }
    }

    public View getHeaderView() {
        return this;
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public final void A06(AnonymousClass1E7 r5, C37451pZ r6) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166133);
        if (r5 == null) {
            AnonymousClass1VU pathDrawableHelper = getPathDrawableHelper();
            C72473Md.A0t(AnonymousClass3Ma.A06(this), getResources(), this, AnonymousClass3Ma.A0J(), pathDrawableHelper);
            return;
        }
        r6.A08(this, r5, -2.14748365E9f, dimensionPixelSize);
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        return C72483Me.A0M(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public /* synthetic */ CommunityPhotoHeader(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

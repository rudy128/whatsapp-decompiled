package com.whatsapp.expressionstray.ui.stickergrid;

import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class StickersUpsellItemView extends ConstraintLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        LayoutInflater.from(context).inflate(2131627386, this, true);
        setBackgroundResource(2131233070);
        AnonymousClass1HF.A06(this, 2131435793).setVisibility(0);
        AnonymousClass1HF.A06(this, 2131435794).setVisibility(8);
        AnonymousClass3MY.A1A(this, 2131435797, 8);
        AnonymousClass3MW.A0J(this, 2131435800).setText(2131890566);
        TextView A0J = AnonymousClass3MW.A0J(this, 2131435799);
        String A0F = C18070vi.A0F(A0J.getContext(), 2131890567);
        String A10 = AnonymousClass3Ma.A10(A0J.getContext(), A0F, new Object[1], 0, 2131890565);
        int A0F2 = AnonymousClass1YF.A0F(A10, A0F, 0, false);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(A10);
        A09.setSpan(new ForegroundColorSpan(AnonymousClass3MZ.A02(A0J.getContext(), A0J.getContext(), 2130970828, 2131102239)), A0F2, A0F.length() + A0F2, 33);
        A0J.setText(A09);
        A0J.setContentDescription(AnonymousClass3Ma.A13(A0J));
        A0J.setPadding(A0J.getPaddingLeft(), A0J.getPaddingTop(), A0J.getPaddingRight(), A0J.getResources().getDimensionPixelSize(2131166876));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ StickersUpsellItemView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

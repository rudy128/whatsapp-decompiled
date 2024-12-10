package com.whatsapp.payments.ui.components;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass9TV;
import X.C18070vi;
import X.C39151sZ;
import X.C72453Mb;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class PixPaymentInfoView extends ConstraintLayout {
    public boolean A00;
    public final ConstraintLayout A01;
    public final ConstraintLayout A02;
    public final ConstraintLayout A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final WaTextView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PixPaymentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        LayoutInflater.from(context).inflate(2131626471, this, true);
        this.A04 = C72453Mb.A0c(this, 2131432663);
        this.A05 = C72453Mb.A0c(this, 2131433865);
        this.A06 = (WaTextView) C18070vi.A05(this, 2131430260);
        this.A01 = (ConstraintLayout) C18070vi.A05(this, 2131432661);
        this.A02 = (ConstraintLayout) C18070vi.A05(this, 2131432662);
        this.A03 = (ConstraintLayout) C18070vi.A05(this, 2131433610);
        int[] iArr = AnonymousClass9TV.A00;
        C18070vi.A0Z(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.A00 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        A00();
    }

    private final void A00() {
        WaTextView waTextView = this.A06;
        waTextView.setVisibility(C72453Mb.A07(this.A00 ? 1 : 0));
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C39151sZ r1 = (C39151sZ) layoutParams;
        if (this.A00) {
            r1.A0J = waTextView.getId();
        } else {
            r1.A0I = 0;
        }
    }

    public final void setShowEditIcon(boolean z) {
        this.A00 = z;
        A00();
    }

    public final WaTextView getEditIcon() {
        return this.A06;
    }

    public final TextEmojiLabel getMerchantName() {
        return this.A04;
    }

    public final TextEmojiLabel getPixInfoValue() {
        return this.A05;
    }

    public /* synthetic */ PixPaymentInfoView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}

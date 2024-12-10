package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C43421zm;
import X.C72463Mc;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.WaTextView;

public final class PnhListItem extends ListItemWithLeftIcon {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        WaTextView waTextView = this.A02;
        waTextView.setTextSize(0, (float) AnonymousClass3Ma.A02(this, 2131169432));
        C43421zm.A04(waTextView);
        waTextView.setMaxLines(2);
        waTextView.setSingleLine(false);
        this.A00.setTextSize(0, (float) AnonymousClass3Ma.A02(this, 2131169436));
        int A05 = C72463Mc.A05(this);
        this.A00.setPadding(A05, A05, A05, A05);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A04();
    }

    public /* synthetic */ PnhListItem(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

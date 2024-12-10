package com.whatsapp.communitymedia.itemviews;

import X.C18070vi;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class MessageChatNameView extends WaTextView {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageChatNameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public void A0I() {
        if (!this.A00) {
            this.A00 = true;
            C72483Me.A0s(C72463Mc.A0X(this), this);
        }
    }

    public MessageChatNameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }
}

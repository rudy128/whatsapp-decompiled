package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C28931bI;
import X.C98244qo;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public final class ConversationRowMediaControlView extends FrameLayout {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final C28931bI A04;
    public final C28931bI A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final View getButton() {
        return this.A00;
    }

    public final C28931bI getCancelBtnViewStubHolder() {
        return this.A04;
    }

    public final ImageView getIcon() {
        return this.A01;
    }

    public final TextView getPrimaryTextView() {
        return this.A02;
    }

    public final C28931bI getProgressBarViewStubHolder() {
        return this.A05;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        LayoutInflater.from(context).inflate(2131624870, this, true);
        this.A04 = C28931bI.A00(this, 2131432385);
        C28931bI A002 = C28931bI.A00(this, 2131432388);
        this.A05 = A002;
        C98244qo.A00(A002, 6);
        this.A01 = AnonymousClass3Ma.A0C(this, 2131432386);
        this.A00 = C18070vi.A05(this, 2131432384);
        this.A02 = AnonymousClass3Ma.A0E(this, 2131432387);
        this.A03 = AnonymousClass3Ma.A0E(this, 2131432389);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}

package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass3MY;
import X.AnonymousClass3Q3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ConversationRowParticipantHeaderQuotedView extends AnonymousClass3Q3 {
    public View getSecondaryNameView() {
        return getChildAt(2);
    }

    public View getPrimaryNameView() {
        return AnonymousClass3MY.A0F(this);
    }

    public /* bridge */ /* synthetic */ void setShouldTruncateNameViewWhenNeeded(boolean z) {
        this.A00 = z;
    }

    public ConversationRowParticipantHeaderQuotedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationRowParticipantHeaderQuotedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationRowParticipantHeaderQuotedView(Context context) {
        super(context);
    }
}

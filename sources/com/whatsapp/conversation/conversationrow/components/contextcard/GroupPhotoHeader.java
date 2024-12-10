package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5ZE;
import X.C18070vi;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class GroupPhotoHeader extends GroupPhoto implements AnonymousClass5ZE {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public View getHeaderView() {
        return this;
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        return C72483Me.A0M(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ GroupPhotoHeader(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}

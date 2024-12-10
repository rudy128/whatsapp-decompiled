package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IO;
import X.C18070vi;
import X.C24261Jm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class ConversationRowContactInfoLinkedAccount extends LinearLayout implements AnonymousClass009 {
    public WaTextView A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public WaImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context, attributeSet);
    }

    public static /* synthetic */ void getAccountType$annotations() {
    }

    private final void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A03;
        if (waImageView == null) {
            C18070vi.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            throw null;
        } else {
            waImageView.setImageDrawable(drawable);
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

    private final void A00(Context context, AttributeSet attributeSet) {
        Context context2;
        int i;
        View.inflate(context, 2131624797, this);
        this.A03 = (WaImageView) C18070vi.A05(this, 2131432032);
        this.A00 = AnonymousClass3Ma.A0N(this, 2131432034);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IO.A01);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            if (integer != 0) {
                if (integer == 1) {
                    context2 = getContext();
                    i = 2131231739;
                }
            }
            context2 = getContext();
            i = 2131232284;
            setIcon(C24261Jm.A00(context2, i));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context, attributeSet);
    }

    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}

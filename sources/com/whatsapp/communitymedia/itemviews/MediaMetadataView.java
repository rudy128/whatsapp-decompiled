package com.whatsapp.communitymedia.itemviews;

import X.AnonymousClass1DF;
import X.AnonymousClass21V;
import X.AnonymousClass3MW;
import X.AnonymousClass4ZN;
import X.C102095Fd;
import X.C102105Fe;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C25291Nq;
import X.C43351zf;
import X.C438921i;
import X.C62272r8;
import X.C64062u9;
import X.C72473Md;
import X.C88584aA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaLinearLayout;
import com.whatsapp.WaTextView;
import java.util.List;
import java.util.Locale;

public final class MediaMetadataView extends WaLinearLayout {
    public C18000vb A00;
    public boolean A01;
    public final C18100vl A02;
    public final C18100vl A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        this.A02 = AnonymousClass1DF.A01(new C102095Fd(this));
        this.A03 = AnonymousClass1DF.A01(new C102105Fe(this));
        View inflate = View.inflate(context, 2131625965, this);
        setOrientation(0);
        C72473Md.A0z(inflate);
    }

    public final void A02(AnonymousClass21V r12, AnonymousClass4ZN r13, List list) {
        String A0q;
        String A19;
        String str;
        C18070vi.A0d(r12, 0);
        String A022 = C88584aA.A02(getWhatsAppLocale(), r12.A01);
        C18070vi.A0X(A022);
        String A032 = C25291Nq.A03(r12.A06);
        C18070vi.A0X(A032);
        Locale locale = Locale.US;
        C18070vi.A0Z(locale);
        String upperCase = A032.toUpperCase(locale);
        C18070vi.A0X(upperCase);
        if (!(upperCase.length() != 0 || (A19 = r12.A19()) == null || A19.length() == 0)) {
            String A192 = r12.A19();
            if (A192 != null) {
                String A09 = C64062u9.A09(A192);
                C18070vi.A0X(A09);
                str = A09.toUpperCase(locale);
                C18070vi.A0X(str);
            } else {
                str = null;
            }
            upperCase = String.valueOf(str);
        }
        MessageChatNameView messageChatNameText = getMessageChatNameText();
        if (r13 != null) {
            messageChatNameText.setText(C43351zf.A03(messageChatNameText.getContext(), messageChatNameText.getWhatsAppLocale(), AnonymousClass4ZN.A00(messageChatNameText, r13), list));
        }
        WaTextView messageFileMetadataText = getMessageFileMetadataText();
        if (r12 instanceof C438921i) {
            C438921i r122 = (C438921i) r12;
            if (r122.A00 != 0) {
                Context context = getContext();
                Object[] objArr = new Object[3];
                objArr[0] = C62272r8.A04.A09(getWhatsAppLocale(), r122);
                objArr[1] = A022;
                A0q = C17880vN.A0q(context, upperCase, objArr, 2, 2131891929);
                messageFileMetadataText.setText(A0q);
            }
        }
        Context context2 = getContext();
        Object[] objArr2 = new Object[2];
        objArr2[0] = A022;
        A0q = C17880vN.A0q(context2, upperCase, objArr2, 1, 2131891930);
        messageFileMetadataText.setText(A0q);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final MessageChatNameView getMessageChatNameText() {
        return (MessageChatNameView) this.A02.getValue();
    }

    private final WaTextView getMessageFileMetadataText() {
        return (WaTextView) this.A03.getValue();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public MediaMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }
}

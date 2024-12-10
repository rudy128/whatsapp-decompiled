package com.whatsapp.info.views;

import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1Nb;
import X.AnonymousClass3MZ;
import X.C177679Ad;
import X.C18070vi;
import X.C72453Mb;
import X.C74793cj;
import X.C74953dB;
import android.content.Context;
import android.util.AttributeSet;

public class CustomNotificationsInfoView extends C74953dB {
    public AnonymousClass1Nb A00;
    public final AnonymousClass1FU A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomNotificationsInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A01 = AnonymousClass3MZ.A0P(context);
        A05(2131233371, false);
        C74793cj.A01(context, this, 2131889170);
        setDescription(2131889171);
    }

    public final void A0A(AnonymousClass1EC r2) {
        C18070vi.A0d(r2, 0);
        setDescriptionVisibility(C72453Mb.A07(getChatSettingsStore$app_productinfra_chat_chat().A0a(r2).A0V ? 1 : 0));
        setOnClickListener(new C177679Ad(this, r2));
    }

    public final void setChatSettingsStore$app_productinfra_chat_chat(AnonymousClass1Nb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1FU getActivity() {
        return this.A01;
    }

    public final AnonymousClass1Nb getChatSettingsStore$app_productinfra_chat_chat() {
        AnonymousClass1Nb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatSettingsStore");
        throw null;
    }
}

package com.whatsapp.info.views;

import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1FU;
import X.AnonymousClass1Nb;
import X.AnonymousClass3MW;
import X.AnonymousClass5I5;
import X.C18070vi;
import X.C18100vl;
import X.C74793cj;
import X.C74963dC;
import android.content.Context;
import android.util.AttributeSet;

public class NotificationsAndSoundsInfoView extends C74963dC {
    public AnonymousClass1Nb A00;
    public AnonymousClass00H A01;
    public final C18100vl A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationsAndSoundsInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5I5(context));
        C74793cj.A01(context, this, 2131893086);
    }

    public final void setChatSettingsStore$app_productinfra_chat_chat(AnonymousClass1Nb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    /* access modifiers changed from: private */
    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A02.getValue();
    }

    public final AnonymousClass1Nb getChatSettingsStore$app_productinfra_chat_chat() {
        AnonymousClass1Nb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatSettingsStore");
        throw null;
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }
}

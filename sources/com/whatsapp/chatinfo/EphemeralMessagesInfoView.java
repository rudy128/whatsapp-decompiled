package com.whatsapp.chatinfo;

import X.AnonymousClass00H;
import X.AnonymousClass126;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1L9;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass78H;
import X.C18070vi;
import X.C25841Pv;
import X.C43391zj;
import X.C74793cj;
import X.C74943dA;
import X.C81723zh;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;

public class EphemeralMessagesInfoView extends C74943dA {
    public AnonymousClass1CJ A00;
    public AnonymousClass1MZ A01;
    public AnonymousClass126 A02;
    public C25841Pv A03;
    public AnonymousClass00H A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EphemeralMessagesInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A05(2131231953, false);
        C74793cj.A01(context, this, 2131889914);
    }

    public final void A0A(AnonymousClass1E7 r11, C81723zh r12, AnonymousClass1EC r13, boolean z) {
        AnonymousClass1E7 r7 = r11;
        C18070vi.A0d(r11, 0);
        C81723zh r4 = r12;
        AnonymousClass1EC r6 = r13;
        C18070vi.A0e(r13, 1, r12);
        Activity A012 = AnonymousClass1L9.A01(getContext(), AnonymousClass1FU.class);
        if (getGroupInfoUtils$app_productinfra_conversation_ui_ui().A02(r11, r13, z)) {
            setVisibility(0);
            A05(2131231954, false);
            setDescription((CharSequence) C43391zj.A00.A09(AnonymousClass3MY.A04(this), r11.A04, false, false));
            setOnClickListener(new AnonymousClass78H(r4, this, r6, r7, A012, 1));
            return;
        }
        setVisibility(8);
    }

    public final void setChatsCache$app_productinfra_conversation_ui_ui(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setGroupChatManager$app_productinfra_conversation_ui_ui(AnonymousClass126 r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setGroupInfoUtils$app_productinfra_conversation_ui_ui(C25841Pv r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setGroupParticipantsManager$app_productinfra_conversation_ui_ui(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSuspensionManager$app_productinfra_conversation_ui_ui(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final AnonymousClass1CJ getChatsCache$app_productinfra_conversation_ui_ui() {
        AnonymousClass1CJ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass126 getGroupChatManager$app_productinfra_conversation_ui_ui() {
        AnonymousClass126 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatManager");
        throw null;
    }

    public final C25841Pv getGroupInfoUtils$app_productinfra_conversation_ui_ui() {
        C25841Pv r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupInfoUtils");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager$app_productinfra_conversation_ui_ui() {
        AnonymousClass1MZ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final AnonymousClass00H getSuspensionManager$app_productinfra_conversation_ui_ui() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("suspensionManager");
        throw null;
    }
}

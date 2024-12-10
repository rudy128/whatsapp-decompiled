package com.whatsapp.info.views;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass48j;
import X.C18070vi;
import X.C56882iB;
import X.C72473Md;
import X.C74793cj;
import X.C74973dD;
import android.content.Context;
import android.util.AttributeSet;

public class PhoneNumberPrivacyInfoView extends C74973dD {
    public AnonymousClass11S A00;
    public AnonymousClass1CJ A01;
    public AnonymousClass1MZ A02;
    public C56882iB A03;
    public AnonymousClass10I A04;
    public AnonymousClass00H A05;
    public final AnonymousClass1FU A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberPrivacyInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A06 = AnonymousClass3MZ.A0P(context);
        C74793cj.A01(context, this, 2131894663);
        setIcon(2131231854);
        C72473Md.A0y(this);
    }

    public final void A0A(AnonymousClass1EC r4, AnonymousClass1EC r5) {
        C18070vi.A0d(r4, 0);
        if (getChatsCache$app_productinfra_chat_chat().A0R(r4)) {
            setVisibility(0);
            boolean A0K = getGroupParticipantsManager$app_productinfra_chat_chat().A0K(r4);
            Context context = getContext();
            int i = 2131894633;
            if (A0K) {
                i = 2131894652;
            }
            setDescription((CharSequence) AnonymousClass3MX.A15(context, i));
            int i2 = 27;
            if (getGroupParticipantsManager$app_productinfra_chat_chat().A0K(r4)) {
                i2 = 28;
            }
            setOnClickListener(new AnonymousClass48j(r5, this, r4, i2));
        }
    }

    public final void setChatsCache$app_productinfra_chat_chat(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setDependencyBridgeRegistryLazy$app_productinfra_chat_chat(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setGroupParticipantsManager$app_productinfra_chat_chat(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setMeManager$app_productinfra_chat_chat(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setPnhDailyActionLoggingStore$app_productinfra_chat_chat(C56882iB r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers$app_productinfra_chat_chat(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final AnonymousClass1FU getActivity() {
        return this.A06;
    }

    public final AnonymousClass1CJ getChatsCache$app_productinfra_chat_chat() {
        AnonymousClass1CJ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass00H getDependencyBridgeRegistryLazy$app_productinfra_chat_chat() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("dependencyBridgeRegistryLazy");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager$app_productinfra_chat_chat() {
        AnonymousClass1MZ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final AnonymousClass11S getMeManager$app_productinfra_chat_chat() {
        AnonymousClass11S r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final C56882iB getPnhDailyActionLoggingStore$app_productinfra_chat_chat() {
        C56882iB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pnhDailyActionLoggingStore");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers$app_productinfra_chat_chat() {
        AnonymousClass10I r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }
}

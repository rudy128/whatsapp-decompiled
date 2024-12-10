package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4bI;
import X.AnonymousClass9Jm;
import X.C170588qG;
import X.C18070vi;
import X.C19999A2n;
import X.C26811To;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C58862lN;
import X.C82804Cd;
import java.util.Collections;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1", f = "UsernameStartConversationWithSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C82804Cd $privacyMode;
    public int label;
    public final /* synthetic */ UsernameStartConversationWithSettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1(UsernameStartConversationWithSettingsViewModel usernameStartConversationWithSettingsViewModel, C82804Cd r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = usernameStartConversationWithSettingsViewModel;
        this.$privacyMode = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1(this.this$0, this.$privacyMode, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass9Jm r5;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ((AnonymousClass4bI) this.this$0.A03.get()).A01(this.$privacyMode);
            C26811To r2 = (C26811To) this.this$0.A01.get();
            C82804Cd r3 = this.$privacyMode;
            if (((C58862lN) r2.A0a.get()).A00("usernameChatStartMode") != null && r2.A0T()) {
                C18070vi.A0d(r3, 0);
                long currentTimeMillis = System.currentTimeMillis();
                int ordinal = r3.ordinal();
                if (ordinal == 0) {
                    r5 = AnonymousClass9Jm.LID;
                } else if (ordinal == 1) {
                    r5 = AnonymousClass9Jm.PN;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                r2.A0R(r2.A0D(Collections.singleton(new C170588qG((C19999A2n) null, r5, (String) null, currentTimeMillis))));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameStartConversationWithSettingsViewModel$onPrivacyModeSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

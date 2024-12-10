package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.C18070vi;
import X.C25795Cm7;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C82804Cd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1", f = "UsernameStartConversationWithSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass00H $myPhoneNumberProvider;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1(AnonymousClass00H r2, C30391dr r3) {
        super(3, r3);
        this.$myPhoneNumberProvider = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1 usernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1 = new UsernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1(this.$myPhoneNumberProvider, (C30391dr) obj3);
        usernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1.L$0 = obj;
        usernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1.L$1 = obj2;
        return usernameStartConversationWithSettingsViewModel$startConversationWithSettingsViewState$2$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new C25795Cm7((C82804Cd) this.L$1, (String) C18070vi.A0E(this.$myPhoneNumberProvider), (String) this.L$0);
        }
        throw AnonymousClass000.A0l();
    }
}

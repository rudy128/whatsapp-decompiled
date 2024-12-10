package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel$onUsernameChanged$1", f = "UsernameStartConversationWithSettingsViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameStartConversationWithSettingsViewModel$onUsernameChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $newUsername;
    public int label;
    public final /* synthetic */ UsernameStartConversationWithSettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameStartConversationWithSettingsViewModel$onUsernameChanged$1(UsernameStartConversationWithSettingsViewModel usernameStartConversationWithSettingsViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = usernameStartConversationWithSettingsViewModel;
        this.$newUsername = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UsernameStartConversationWithSettingsViewModel$onUsernameChanged$1(this.this$0, this.$newUsername, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G4 r1 = this.this$0.A06;
            String str = this.$newUsername;
            this.label = 1;
            if (r1.BJt(str, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameStartConversationWithSettingsViewModel$onUsernameChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

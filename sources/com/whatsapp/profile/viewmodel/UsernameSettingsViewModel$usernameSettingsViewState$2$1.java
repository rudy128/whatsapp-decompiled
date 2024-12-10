package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass20G;
import X.C25789Cm0;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C82804Cd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameSettingsViewModel$usernameSettingsViewState$2$1", f = "UsernameSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSettingsViewModel$usernameSettingsViewState$2$1 extends C30431dv implements AnonymousClass20G {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    public UsernameSettingsViewModel$usernameSettingsViewState$2$1(C30391dr r2) {
        super(4, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UsernameSettingsViewModel$usernameSettingsViewState$2$1 usernameSettingsViewModel$usernameSettingsViewState$2$1 = new UsernameSettingsViewModel$usernameSettingsViewState$2$1((C30391dr) obj4);
        usernameSettingsViewModel$usernameSettingsViewState$2$1.L$0 = obj;
        usernameSettingsViewModel$usernameSettingsViewState$2$1.L$1 = obj2;
        usernameSettingsViewModel$usernameSettingsViewState$2$1.L$2 = obj3;
        return usernameSettingsViewModel$usernameSettingsViewState$2$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new C25789Cm0((C82804Cd) this.L$1, (String) this.L$0, (String) this.L$2);
        }
        throw AnonymousClass000.A0l();
    }
}

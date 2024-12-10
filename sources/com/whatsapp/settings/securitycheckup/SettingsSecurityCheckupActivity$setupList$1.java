package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3WE;
import X.C23381Fv;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99574t7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity$setupList$1", f = "SettingsSecurityCheckupActivity.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsSecurityCheckupActivity$setupList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass3WE $adapter;
    public int label;
    public final /* synthetic */ SettingsSecurityCheckupActivity this$0;

    @DebugMetadata(c = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity$setupList$1$1", f = "SettingsSecurityCheckupActivity.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity$setupList$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, settingsSecurityCheckupActivity, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                SettingsSecurityCheckupActivity settingsSecurityCheckupActivity = settingsSecurityCheckupActivity;
                SettingsSecurityCheckupViewModel settingsSecurityCheckupViewModel = settingsSecurityCheckupActivity.A01;
                if (settingsSecurityCheckupViewModel == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                AnonymousClass1G1 r3 = settingsSecurityCheckupViewModel.A04;
                C99574t7 r0 = new C99574t7(r2, settingsSecurityCheckupActivity, 20);
                this.label = 1;
                if (r3.BFC(this, r0) == r6) {
                    return r6;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsSecurityCheckupActivity$setupList$1(AnonymousClass3WE r2, SettingsSecurityCheckupActivity settingsSecurityCheckupActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = settingsSecurityCheckupActivity;
        this.$adapter = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SettingsSecurityCheckupActivity$setupList$1(this.$adapter, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23381Fv lifecycle = this.this$0.getLifecycle();
            C23401Fx r4 = C23401Fx.STARTED;
            final SettingsSecurityCheckupActivity settingsSecurityCheckupActivity = this.this$0;
            final AnonymousClass3WE r2 = this.$adapter;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A00(r4, lifecycle, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SettingsSecurityCheckupActivity$setupList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

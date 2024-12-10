package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass42E;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99614tB;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1", f = "InteropReachNotificationSettingsActivity.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass42E $adapter;
    public int label;
    public final /* synthetic */ InteropReachNotificationSettingsActivity this$0;

    @DebugMetadata(c = "com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1$1", f = "InteropReachNotificationSettingsActivity.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, interopReachNotificationSettingsActivity, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r2 = ((InteropNotifOptInViewModel) interopReachNotificationSettingsActivity.A03.getValue()).A06;
                C99614tB A00 = C99614tB.A00(r2, 27);
                this.label = 1;
                if (r2.BFC(this, A00) == r4) {
                    return r4;
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
    public InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1(AnonymousClass42E r2, InteropReachNotificationSettingsActivity interopReachNotificationSettingsActivity, C30391dr r4) {
        super(2, r4);
        this.this$0 = interopReachNotificationSettingsActivity;
        this.$adapter = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1(this.$adapter, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final InteropReachNotificationSettingsActivity interopReachNotificationSettingsActivity = this.this$0;
            C23401Fx r3 = C23401Fx.STARTED;
            final AnonymousClass42E r2 = this.$adapter;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r3, interopReachNotificationSettingsActivity, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropReachNotificationSettingsActivity$registerIntegratorsUpdates$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

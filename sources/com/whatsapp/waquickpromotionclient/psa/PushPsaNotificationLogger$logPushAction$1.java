package com.whatsapp.waquickpromotionclient.psa;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C138366wx;
import X.C179549Ik;
import X.C18600wl;
import X.C191629mu;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C36561o6;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class PushPsaNotificationLogger$logPushAction$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $campaignId;
    public final /* synthetic */ int $eligibilityDuration;
    public final /* synthetic */ C179549Ik $qpActionEventEnum;
    public final /* synthetic */ int $surfaceId;
    public int label;
    public final /* synthetic */ C138366wx this$0;

    @DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushAction$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            C138366wx r1 = C138366wx.this;
            int i = i2;
            return new AnonymousClass1(r5, str, r9, i, i3);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                int i = i2;
                String str = str;
                int i2 = i3;
                C179549Ik r1 = r5;
                C72473Md.A1I(str, r1);
                ((C191629mu) ((C36561o6) C138366wx.this.A01.get()).A06.getValue()).A00(r1, str, (String) null, (String) null, i, i2);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushPsaNotificationLogger$logPushAction$1(C138366wx r2, C179549Ik r3, String str, C30391dr r5, int i, int i2) {
        super(2, r5);
        this.this$0 = r2;
        this.$surfaceId = i;
        this.$campaignId = str;
        this.$eligibilityDuration = i2;
        this.$qpActionEventEnum = r3;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C138366wx r1 = this.this$0;
        int i = this.$surfaceId;
        return new PushPsaNotificationLogger$logPushAction$1(r1, this.$qpActionEventEnum, this.$campaignId, r9, i, this.$eligibilityDuration);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C138366wx r4 = this.this$0;
            C18600wl r0 = r4.A02;
            final int i2 = this.$surfaceId;
            final String str = this.$campaignId;
            final int i3 = this.$eligibilityDuration;
            final C179549Ik r5 = this.$qpActionEventEnum;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PushPsaNotificationLogger$logPushAction$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.waquickpromotionclient.psa;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass5YR;
import X.C138366wx;
import X.C179549Ik;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C36561o6;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class PushPsaNotificationLogger$logPushShow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass5YR $quickPromotion;
    public final /* synthetic */ int $surfaceId;
    public int label;
    public final /* synthetic */ C138366wx this$0;

    @DebugMetadata(c = "com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1$1", f = "PushPsaNotificationLogger.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r2, r6, i2);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                int i2 = i2;
                AnonymousClass5YR r1 = r2;
                C179549Ik r0 = C179549Ik.IMPRESSION;
                this.label = 1;
                if (((C36561o6) C138366wx.this.A01.get()).A00(r0, r1, i2) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushPsaNotificationLogger$logPushShow$1(C138366wx r2, AnonymousClass5YR r3, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$surfaceId = i;
        this.$quickPromotion = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new PushPsaNotificationLogger$logPushShow$1(this.this$0, this.$quickPromotion, r6, this.$surfaceId);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C138366wx r5 = this.this$0;
            C18600wl r4 = r5.A02;
            final int i2 = this.$surfaceId;
            final AnonymousClass5YR r2 = this.$quickPromotion;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
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
        return ((PushPsaNotificationLogger$logPushShow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

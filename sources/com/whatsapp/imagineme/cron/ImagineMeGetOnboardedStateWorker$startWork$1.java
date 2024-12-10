package com.whatsapp.imagineme.cron;

import X.AnonymousClass000;
import X.AnonymousClass190;
import X.AnonymousClass1OS;
import X.AnonymousClass6RD;
import X.AnonymousClass7DC;
import X.C114465qs;
import X.C162178Jk;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.imagineme.ImagineMeOnboardingRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.imagineme.cron.ImagineMeGetOnboardedStateWorker$startWork$1", f = "ImagineMeGetOnboardedStateWorker.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeGetOnboardedStateWorker$startWork$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $debugString;
    public final /* synthetic */ C114465qs $settableFuture;
    public int label;
    public final /* synthetic */ ImagineMeGetOnboardedStateWorker this$0;

    @DebugMetadata(c = "com.whatsapp.imagineme.cron.ImagineMeGetOnboardedStateWorker$startWork$1$1", f = "ImagineMeGetOnboardedStateWorker.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.imagineme.cron.ImagineMeGetOnboardedStateWorker$startWork$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r2, imagineMeGetOnboardedStateWorker, str, r6);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                ImagineMeOnboardingRequester imagineMeOnboardingRequester = imagineMeGetOnboardedStateWorker.A03;
                this.label = 1;
                obj = imagineMeOnboardingRequester.A01(this);
                if (obj == r2) {
                    return r2;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            if (C18070vi.A19(obj, false)) {
                imagineMeGetOnboardedStateWorker.A01.A00(false);
                imagineMeGetOnboardedStateWorker.A02.A07(new AnonymousClass7DC(r2), AnonymousClass6RD.META_AI_IMAGINE_ME_TOS);
                ((AnonymousClass190) imagineMeGetOnboardedStateWorker.A04.getValue()).A0G("imagine_me_onboarded_state_mismatch", str, false);
            } else {
                r2.A03(new C162178Jk());
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeGetOnboardedStateWorker$startWork$1(C114465qs r2, ImagineMeGetOnboardedStateWorker imagineMeGetOnboardedStateWorker, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = imagineMeGetOnboardedStateWorker;
        this.$debugString = str;
        this.$settableFuture = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ImagineMeGetOnboardedStateWorker$startWork$1(this.$settableFuture, this.this$0, this.$debugString, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ImagineMeGetOnboardedStateWorker imagineMeGetOnboardedStateWorker = this.this$0;
            C18600wl r4 = imagineMeGetOnboardedStateWorker.A05;
            final String str = this.$debugString;
            final C114465qs r2 = this.$settableFuture;
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
        return ((ImagineMeGetOnboardedStateWorker$startWork$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

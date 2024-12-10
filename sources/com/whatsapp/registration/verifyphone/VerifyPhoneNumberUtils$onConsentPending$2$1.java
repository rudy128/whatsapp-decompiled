package com.whatsapp.registration.verifyphone;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1LU;
import X.AnonymousClass1OS;
import X.AnonymousClass8BA;
import X.C108955ca;
import X.C143967Fm;
import X.C147327Ss;
import X.C1595584z;
import X.C19830z4;
import X.C23761Hn;
import X.C23771Ho;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.verifyphone.VerifyPhoneNumberUtils$onConsentPending$2$1", f = "VerifyPhoneNumberUtils.kt", i = {}, l = {403}, m = "invokeSuspend", n = {}, s = {})
public final class VerifyPhoneNumberUtils$onConsentPending$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ AnonymousClass8BA $pancakeRepository;
    public final /* synthetic */ AnonymousClass1LU $waIntents;
    public final /* synthetic */ C19830z4 $waSharedPreferences;
    public int label;

    @DebugMetadata(c = "com.whatsapp.registration.verifyphone.VerifyPhoneNumberUtils$onConsentPending$2$1$1", f = "VerifyPhoneNumberUtils.kt", i = {0, 0}, l = {406}, m = "invokeSuspend", n = {"countryCode", "phoneNumber"}, s = {"L$0", "L$1"})
    /* renamed from: com.whatsapp.registration.verifyphone.VerifyPhoneNumberUtils$onConsentPending$2$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(activity, r5, r6, r7, r8);
        }

        public final Object invokeSuspend(Object obj) {
            String A0t;
            String A0u;
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                A0t = C108955ca.A0t(r5);
                A0u = C108955ca.A0u(r5);
                AnonymousClass8BA r2 = r6;
                this.L$0 = A0t;
                this.L$1 = A0u;
                this.label = 1;
                obj = r2.CRm(this, 2000, -1, -1);
                if (obj == r5) {
                    return r5;
                }
            } else if (i == 1) {
                A0u = (String) this.L$1;
                A0t = (String) this.L$0;
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            C1595584z r7 = (C1595584z) obj;
            if (r7 instanceof C143967Fm) {
                C143967Fm r72 = (C143967Fm) r7;
                r5.A23(r72.A03);
                r5.A22(r72.A02);
                r5.A2B(r72.A01);
                r5.A1d(r72.A00);
                r5.A1t(A0t, A0u);
                Log.i("VerifyPhoneNumberUtils/onVerificationSuccess/proceed to register name");
                Activity activity = activity;
                activity.startActivity(AnonymousClass1LU.A1k(activity, false));
                activity.finish();
                return C27621Wu.A00;
            }
            throw new C147327Ss(AnonymousClass001.A1E(r7, "Failed consent. status ", AnonymousClass000.A10()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifyPhoneNumberUtils$onConsentPending$2$1(Activity activity, C19830z4 r3, AnonymousClass8BA r4, AnonymousClass1LU r5, C30391dr r6) {
        super(2, r6);
        this.$waSharedPreferences = r3;
        this.$pancakeRepository = r4;
        this.$activity = activity;
        this.$waIntents = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new VerifyPhoneNumberUtils$onConsentPending$2$1(this.$activity, this.$waSharedPreferences, this.$pancakeRepository, this.$waIntents, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23771Ho r0 = C23761Hn.A01;
            final C19830z4 r5 = this.$waSharedPreferences;
            final AnonymousClass8BA r6 = this.$pancakeRepository;
            final Activity activity = this.$activity;
            final AnonymousClass1LU r7 = this.$waIntents;
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
        return ((VerifyPhoneNumberUtils$onConsentPending$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.registration.phonenumberentry.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.B3Z;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import com.whatsapp.registration.passkey.PasskeyVerifier;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel$startPasskeyFlow$1", f = "PasskeyLoginViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyLoginViewModel$startPasskeyFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $authChallenge;
    public final /* synthetic */ Activity $context;
    public int label;
    public final /* synthetic */ PasskeyLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyLoginViewModel$startPasskeyFlow$1(Activity activity, PasskeyLoginViewModel passkeyLoginViewModel, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = passkeyLoginViewModel;
        this.$context = activity;
        this.$authChallenge = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new PasskeyLoginViewModel$startPasskeyFlow$1(this.$context, this.this$0, this.$authChallenge, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PasskeyLoginViewModel passkeyLoginViewModel = this.this$0;
            Activity activity = this.$context;
            String str = this.$authChallenge;
            this.label = 1;
            if (((PasskeyVerifier) passkeyLoginViewModel.A04.get()).A00(activity, str, this, new B3Z(passkeyLoginViewModel)) == r5) {
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
        return ((PasskeyLoginViewModel$startPasskeyFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

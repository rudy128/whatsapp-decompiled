package com.whatsapp.acs;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C20113A7w;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C57432j4;
import X.C62882s9;
import X.C72353Lp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.acs.ACSTokenProviderImpl$ACSTokenListenerImpl$1", f = "ACSTokenProviderImpl.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
public final class ACSTokenProviderImpl$ACSTokenListenerImpl$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $acsTokenName;
    public int label;
    public final /* synthetic */ C57432j4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ACSTokenProviderImpl$ACSTokenListenerImpl$1(C57432j4 r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$acsTokenName = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ACSTokenProviderImpl$ACSTokenListenerImpl$1(this.this$0, this.$acsTokenName, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, C20113A7w.A0L) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C57432j4 r3 = this.this$0;
        String str = this.$acsTokenName;
        C72353Lp r1 = (C72353Lp) r3.A00.get();
        if (r1 != null) {
            r1.C8m(3);
        }
        r3.A00(str);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ACSTokenProviderImpl$ACSTokenListenerImpl$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.biz.catalog.network.graphql.directconnection;

import X.AEW;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C20480AMr;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2", f = "CoroutineDirectConnectionHelper.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AEW $businessProfile;
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ String $postcode;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ CoroutineDirectConnectionHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2(CoroutineDirectConnectionHelper coroutineDirectConnectionHelper, AEW aew, UserJid userJid, String str, C30391dr r6) {
        super(2, r6);
        this.this$0 = coroutineDirectConnectionHelper;
        this.$jid = userJid;
        this.$businessProfile = aew;
        this.$postcode = str;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2(this.this$0, this.$businessProfile, this.$jid, this.$postcode, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CoroutineDirectConnectionHelper coroutineDirectConnectionHelper = this.this$0;
            UserJid userJid = this.$jid;
            AEW aew = this.$businessProfile;
            String str = this.$postcode;
            this.L$0 = coroutineDirectConnectionHelper;
            this.L$1 = userJid;
            this.L$2 = aew;
            this.L$3 = str;
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            coroutineDirectConnectionHelper.A01.A04(new C20480AMr(A0k, 0), aew, userJid, str);
            obj = A0k.A00();
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoroutineDirectConnectionHelper$generateDirectConnectionEncryptedInfo$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.biz.catalog.network.graphql.directconnection;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C21553Am0;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2", f = "CoroutineDirectConnectionHelper.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $userJid;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CoroutineDirectConnectionHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2(CoroutineDirectConnectionHelper coroutineDirectConnectionHelper, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = coroutineDirectConnectionHelper;
        this.$userJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2(this.this$0, this.$userJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CoroutineDirectConnectionHelper coroutineDirectConnectionHelper = this.this$0;
            UserJid userJid = this.$userJid;
            this.L$0 = coroutineDirectConnectionHelper;
            this.L$1 = userJid;
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            coroutineDirectConnectionHelper.A00.A0D(new C21553Am0(A0k), userJid);
            obj = A0k.A00();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoroutineDirectConnectionHelper$awaitLoadBusinessProfile$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

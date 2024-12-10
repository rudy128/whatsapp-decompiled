package com.whatsapp.biz.catalog.network;

import X.A0W;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1OS;
import X.AnonymousClass4S5;
import X.AnonymousClass8BT;
import X.AnonymousClass9M2;
import X.BAL;
import X.C138476x9;
import X.C168408io;
import X.C168418ip;
import X.C18070vi;
import X.C183899a0;
import X.C188869i8;
import X.C190929lk;
import X.C193499qC;
import X.C196209ud;
import X.C199279zj;
import X.C20009A2z;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper;
import com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService$send$2;
import com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1", f = "DCVerifyPostcodeGraphqlOrXMPPNetworkCall.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $businessId;
    public final /* synthetic */ BAL $callback;
    public final /* synthetic */ String $postcode;
    public int label;
    public final /* synthetic */ C190929lk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1(C190929lk r2, BAL bal, UserJid userJid, String str, C30391dr r6) {
        super(2, r6);
        this.this$0 = r2;
        this.$businessId = userJid;
        this.$postcode = str;
        this.$callback = bal;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1(this.this$0, this.$callback, this.$businessId, this.$postcode, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C188869i8 r4 = (C188869i8) this.this$0.A00.get();
            C193499qC r7 = new C193499qC(this.$businessId, this.$postcode);
            AnonymousClass10E r2 = r4.A04.A00.A00;
            C138476x9 AHh = AnonymousClass10E.AHh(r2);
            CoroutineDirectConnectionHelper A2j = AnonymousClass10E.A2j(r2);
            C20009A2z a2z = (C20009A2z) r2.A3P.get();
            DCVerifyPostcodeGraphQLService dCVerifyPostcodeGraphQLService = new DCVerifyPostcodeGraphQLService(AnonymousClass8BT.A0D(r2), a2z, r7, A2j, (A0W) C18070vi.A0E(r4.A0P), (C196209ud) r2.A8m.get(), (C199279zj) r2.A1v.get(), AHh, (AnonymousClass4S5) r2.ABW.get());
            this.label = 1;
            obj = C30451dy.A00(this, C23761Hn.A01, new BaseCoroutineGraphQLRequestService$send$2(dCVerifyPostcodeGraphQLService, (C30391dr) null));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9M2 r15 = (AnonymousClass9M2) obj;
        if (r15 instanceof C168418ip) {
            this.$callback.C1H((C183899a0) ((C168418ip) r15).A01);
        } else if (r15 instanceof C168408io) {
            this.$callback.C1G("error", ((C168408io) r15).A00);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

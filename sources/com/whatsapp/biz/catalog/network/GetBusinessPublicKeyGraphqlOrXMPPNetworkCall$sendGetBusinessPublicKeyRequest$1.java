package com.whatsapp.biz.catalog.network;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9M2;
import X.BAN;
import X.C168408io;
import X.C168418ip;
import X.C194229rO;
import X.C198649yg;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.biz.catalog.network.graphql.service.impl.GetBusinessPublicKeyGraphQLService$send$2;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1", f = "GetBusinessPublicKeyGraphqlOrXMPPNetworkCall.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $businessJid;
    public final /* synthetic */ BAN $listener;
    public final /* synthetic */ C198649yg $srv;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1(C198649yg r2, BAN ban, UserJid userJid, C30391dr r5) {
        super(2, r5);
        this.$srv = r2;
        this.$listener = ban;
        this.$businessJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1(this.$srv, this.$listener, this.$businessJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C198649yg r3 = this.$srv;
            this.label = 1;
            obj = C30451dy.A00(this, r3.A07, new GetBusinessPublicKeyGraphQLService$send$2(r3, (C30391dr) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9M2 r6 = (AnonymousClass9M2) obj;
        if (r6 instanceof C168408io) {
            this.$listener.Bv6(this.$businessJid);
        } else if (r6 instanceof C168418ip) {
            BAN ban = this.$listener;
            UserJid userJid = this.$businessJid;
            C194229rO r0 = (C194229rO) ((C168418ip) r6).A01;
            ban.Bv7(userJid, r0.A00, r0.A01, r0.A02);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetBusinessPublicKeyGraphqlOrXMPPNetworkCall$sendGetBusinessPublicKeyRequest$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

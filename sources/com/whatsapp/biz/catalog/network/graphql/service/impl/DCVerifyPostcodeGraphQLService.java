package com.whatsapp.biz.catalog.network.graphql.service.impl;

import X.A0W;
import X.AnonymousClass4S5;
import X.C138476x9;
import X.C18070vi;
import X.C193499qC;
import X.C196209ud;
import X.C199279zj;
import X.C20009A2z;
import X.C26911Ty;
import com.whatsapp.biz.catalog.network.graphql.directconnection.CoroutineDirectConnectionHelper;

public final class DCVerifyPostcodeGraphQLService extends BaseCoroutineGraphQLRequestService {
    public final C26911Ty A00;
    public final C20009A2z A01;
    public final C193499qC A02;
    public final CoroutineDirectConnectionHelper A03;
    public final C196209ud A04;
    public final AnonymousClass4S5 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DCVerifyPostcodeGraphQLService(C26911Ty r9, C20009A2z a2z, C193499qC r11, CoroutineDirectConnectionHelper coroutineDirectConnectionHelper, A0W a0w, C196209ud r14, C199279zj r15, C138476x9 r16, AnonymousClass4S5 r17) {
        super(coroutineDirectConnectionHelper, a0w, r15, r16, 11);
        C18070vi.A0k(a0w, r15);
        C18070vi.A0q(a2z, r9, r14);
        AnonymousClass4S5 r1 = r17;
        C18070vi.A0d(r1, 9);
        this.A02 = r11;
        this.A03 = coroutineDirectConnectionHelper;
        this.A01 = a2z;
        this.A00 = r9;
        this.A04 = r14;
        this.A05 = r1;
    }
}

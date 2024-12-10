package com.whatsapp.biz.catalog.network.graphql.service.impl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9M2;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.BaseCoroutineGraphQLRequestService$send$2", f = "BaseCoroutineGraphQLRequestService.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
public final class BaseCoroutineGraphQLRequestService$send$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BaseCoroutineGraphQLRequestService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCoroutineGraphQLRequestService$send$2(BaseCoroutineGraphQLRequestService baseCoroutineGraphQLRequestService, C30391dr r3) {
        super(2, r3);
        this.this$0 = baseCoroutineGraphQLRequestService;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BaseCoroutineGraphQLRequestService$send$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BaseCoroutineGraphQLRequestService$send$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                BaseCoroutineGraphQLRequestService baseCoroutineGraphQLRequestService = this.this$0;
                this.label = 1;
                obj = baseCoroutineGraphQLRequestService.A01(this);
                if (obj == r2) {
                    return r2;
                }
            } catch (Exception e) {
                throw e;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return (AnonymousClass9M2) obj;
    }
}

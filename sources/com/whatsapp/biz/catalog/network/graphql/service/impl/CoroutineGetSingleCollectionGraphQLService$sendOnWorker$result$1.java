package com.whatsapp.biz.catalog.network.graphql.service.impl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6WV;
import X.AnonymousClass9M3;
import X.AnonymousClass9TO;
import X.C131206ki;
import X.C18070vi;
import X.C195689tk;
import X.C20655ATn;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35021lW;
import X.C36001nB;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1", f = "CoroutineGetSingleCollectionGraphQLService.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CoroutineGetSingleCollectionGraphQLService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1(CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService, C30391dr r3) {
        super(3, r3);
        this.this$0 = coroutineGetSingleCollectionGraphQLService;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1 coroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1 = new CoroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1(this.this$0, (C30391dr) obj3);
        coroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1.L$0 = obj;
        return coroutineGetSingleCollectionGraphQLService$sendOnWorker$result$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, X.9Ma] */
    public final Object invokeSuspend(Object obj) {
        Object A04;
        Object obj2 = obj;
        Object obj3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            AnonymousClass1OS r1 = (AnonymousClass1OS) this.L$0;
            CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService = this.this$0;
            if (coroutineGetSingleCollectionGraphQLService.A02.A05 == null) {
                coroutineGetSingleCollectionGraphQLService.A05.A03("view_collection_details_tag");
            }
            CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService2 = this.this$0;
            coroutineGetSingleCollectionGraphQLService2.A02.A01(new Object(), coroutineGetSingleCollectionGraphQLService2.A00);
            CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService3 = this.this$0;
            C195689tk r7 = coroutineGetSingleCollectionGraphQLService3.A02;
            UserJid A00 = coroutineGetSingleCollectionGraphQLService3.A06.A00(r7.A04);
            String str = r7.A06;
            int i2 = r7.A01;
            int i3 = r7.A02;
            int i4 = r7.A00;
            C195689tk r72 = new C195689tk(r7.A03, A00, str, r7.A07, r7.A05, i2, i3, i4, r7.A08, r7.A09);
            CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService4 = this.this$0;
            boolean A0O = coroutineGetSingleCollectionGraphQLService4.A00.A0O(coroutineGetSingleCollectionGraphQLService4.A02.A04);
            CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService5 = this.this$0;
            if (A0O) {
                C131206ki r8 = coroutineGetSingleCollectionGraphQLService5.A04;
                C35021lW r9 = AnonymousClass9TO.A00;
                C20655ATn aTn = new C20655ATn(coroutineGetSingleCollectionGraphQLService5, r72, 0);
                C18070vi.A0d(r9, 0);
                A04 = r8.A01(r9, (AnonymousClass6WV) null, aTn, 0);
            } else {
                A04 = coroutineGetSingleCollectionGraphQLService5.A01.A04(r72, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", false);
            }
            this.label = 1;
            obj2 = r1.invoke(A04, this);
            if (obj2 == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        CoroutineGetSingleCollectionGraphQLService coroutineGetSingleCollectionGraphQLService6 = this.this$0;
        coroutineGetSingleCollectionGraphQLService6.A04((AnonymousClass9M3) obj2, -1);
        if (coroutineGetSingleCollectionGraphQLService6.A02.A05 == null) {
            coroutineGetSingleCollectionGraphQLService6.A05.A02("view_collection_details_tag");
        }
        return obj2;
    }
}

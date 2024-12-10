package com.whatsapp.biz.catalog.network.graphql.service.impl;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass67D;
import X.AnonymousClass67E;
import X.AnonymousClass67F;
import X.AnonymousClass6TR;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C138476x9;
import X.C138506xC;
import X.C1404571m;
import X.C168318if;
import X.C168408io;
import X.C168418ip;
import X.C1770496z;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C193009pO;
import X.C198649yg;
import X.C199279zj;
import X.C23761Hn;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.GetBusinessPublicKeyGraphQLService$send$2", f = "GetBusinessPublicKeyGraphQLService.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class GetBusinessPublicKeyGraphQLService$send$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C198649yg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetBusinessPublicKeyGraphQLService$send$2(C198649yg r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GetBusinessPublicKeyGraphQLService$send$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GetBusinessPublicKeyGraphQLService$send$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C198649yg r3;
        int i;
        C168408io r0;
        String str;
        Collection values;
        C1404571m r1;
        C31751g4 r02 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            C198649yg r12 = this.this$0;
            r12.A04.A01(r12.A03, 10);
            C198649yg r13 = this.this$0;
            C193009pO r4 = new C193009pO(r13.A06.A00(r13.A01.A00));
            AnonymousClass10E r14 = this.this$0.A00.A00.A00;
            C18030ve A8r = AnonymousClass10E.A8r(r14);
            C168318if r2 = new C168318if(C108965cb.A0H(r14), r4, AnonymousClass3Ma.A0c(r14), A8r, C108955ca.A0X(r14), C108945cZ.A14(r14), r14.A4y, r14.A8x);
            this.label = 1;
            obj = r2.CBy(this, C23761Hn.A01);
            if (obj == r02) {
                return r02;
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass6TR r15 = (AnonymousClass6TR) obj;
        if (r15 instanceof AnonymousClass67D) {
            r3 = this.this$0;
            i = -1;
            r0 = new C168408io(r3.A01, -1);
            str = "delivery failure";
        } else if (r15 instanceof AnonymousClass67E) {
            C198649yg r5 = this.this$0;
            C193009pO r42 = r5.A01;
            C168408io r03 = new C168408io(r42, 0);
            Exception exc = ((AnonymousClass67E) r15).A00;
            C199279zj r22 = r5.A04;
            UserJid userJid = r42.A00;
            C199279zj.A00(userJid, r5.A03, r22, 10, 1);
            C138476x9.A00(userJid, r5.A05, 10, 2, 0);
            Log.e("CoroutineGetBusinessPublicKeyGraphQLService/send", exc);
            return r03;
        } else if (r15 instanceof AnonymousClass67F) {
            r3 = this.this$0;
            C138506xC r16 = ((AnonymousClass67F) r15).A00;
            Object obj2 = r16.A03.A00;
            if (obj2 != null) {
                C199279zj r43 = r3.A04;
                C193009pO r23 = r3.A01;
                UserJid userJid2 = r23.A00;
                C1770496z r17 = r3.A03;
                C18070vi.A0d(userJid2, 0);
                C199279zj.A00(userJid2, r17, r43, 10, 0);
                C138476x9.A00(userJid2, r3.A05, 10, 1, -1);
                return new C168418ip(r23, obj2);
            }
            Map map = r16.A04.A00;
            if (map == null || (values = map.values()) == null || (r1 = (C1404571m) C29431cG.A0Y(values)) == null) {
                i = 0;
                r0 = new C168408io(r3.A01, 0);
                str = "cannot find data or error";
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("error response ");
                int i3 = r1.A01;
                C198649yg.A00(r3, C17880vN.A0t(A10, i3), i3);
                return new C168408io(r3.A01, r3.A02.A00(i3));
            }
        } else {
            throw AnonymousClass3MW.A14();
        }
        C198649yg.A00(r3, str, i);
        return r0;
    }
}

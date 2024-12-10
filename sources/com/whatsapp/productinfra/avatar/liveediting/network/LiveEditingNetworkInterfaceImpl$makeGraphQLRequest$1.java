package com.whatsapp.productinfra.avatar.liveediting.network;

import X.AnonymousClass000;
import X.AnonymousClass10G;
import X.AnonymousClass1OS;
import X.AnonymousClass67D;
import X.AnonymousClass67E;
import X.AnonymousClass67F;
import X.AnonymousClass6TR;
import X.AnonymousClass7I9;
import X.AnonymousClass7L2;
import X.C125356aw;
import X.C125426b3;
import X.C129186hO;
import X.C1601687k;
import X.C22821Di;
import X.C23761Hn;
import X.C26652D8b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1", f = "LiveEditingNetworkInterfaceImpl.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $docId;
    public final /* synthetic */ C22821Di $onFailure;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ String $variables;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C26652D8b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1(C26652D8b d8b, String str, String str2, C30391dr r5, C22821Di r6, C22821Di r7) {
        super(2, r5);
        this.this$0 = d8b;
        this.$docId = str;
        this.$variables = str2;
        this.$onFailure = r6;
        this.$onSuccess = r7;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1 liveEditingNetworkInterfaceImpl$makeGraphQLRequest$1 = new LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1(this.this$0, this.$docId, this.$variables, r9, this.$onFailure, this.$onSuccess);
        liveEditingNetworkInterfaceImpl$makeGraphQLRequest$1.L$0 = obj;
        return liveEditingNetworkInterfaceImpl$makeGraphQLRequest$1;
    }

    public final Object invokeSuspend(Object obj) {
        C22821Di r1;
        String str;
        Object obj2;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj3 = this.L$0;
            C125356aw r12 = this.this$0.A00;
            long parseLong = Long.parseLong(this.$docId);
            String str2 = this.$variables;
            AnonymousClass10G r13 = r12.A00.A00.A00;
            C129186hO r6 = new C129186hO((C125426b3) r13.A22.get(), (C1601687k) r13.A28.get(), str2, parseLong);
            AnonymousClass7I9 BGe = r6.A02.BGe(new AnonymousClass7L2(r6, 0));
            this.L$0 = obj3;
            this.label = 1;
            obj = BGe.CBy(this, C23761Hn.A01);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass6TR r132 = (AnonymousClass6TR) obj;
        if (r132 instanceof AnonymousClass67F) {
            Object obj4 = ((AnonymousClass67F) r132).A00.A03.A00;
            if (obj4 != null) {
                this.$onSuccess.invoke(obj4);
            } else {
                r1 = this.$onFailure;
                str = "No data";
                r1.invoke(str);
            }
        } else {
            if (r132 instanceof AnonymousClass67E) {
                obj2 = ((AnonymousClass67E) r132).A00;
            } else if (r132 instanceof AnonymousClass67D) {
                obj2 = ((AnonymousClass67D) r132).A00;
            }
            r1 = this.$onFailure;
            str = obj2.toString();
            r1.invoke(str);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

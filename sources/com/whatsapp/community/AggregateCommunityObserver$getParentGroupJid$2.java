package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4Xp;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.AggregateCommunityObserver$getParentGroupJid$2", f = "AggregateCommunityObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AggregateCommunityObserver$getParentGroupJid$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $subgroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass4Xp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateCommunityObserver$getParentGroupJid$2(AnonymousClass4Xp r2, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$subgroupJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AggregateCommunityObserver$getParentGroupJid$2(this.this$0, this.$subgroupJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.this$0.A00.A05(this.$subgroupJid);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AggregateCommunityObserver$getParentGroupJid$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

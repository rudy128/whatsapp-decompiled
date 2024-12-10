package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GetSubgroupsManager$fetchSubgroupMemberCount$1$1", f = "GetSubgroupsManager.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class GetSubgroupsManager$fetchSubgroupMemberCount$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public final /* synthetic */ AnonymousClass1EC $participatingSubgroupJid;
    public final /* synthetic */ List $targetGroups;
    public int label;
    public final /* synthetic */ GetSubgroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSubgroupsManager$fetchSubgroupMemberCount$1$1(GetSubgroupsManager getSubgroupsManager, AnonymousClass1EC r3, AnonymousClass1EC r4, List list, C30391dr r6) {
        super(2, r6);
        this.this$0 = getSubgroupsManager;
        this.$parentGroupJid = r3;
        this.$participatingSubgroupJid = r4;
        this.$targetGroups = list;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new GetSubgroupsManager$fetchSubgroupMemberCount$1$1(this.this$0, this.$parentGroupJid, this.$participatingSubgroupJid, this.$targetGroups, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            GetSubgroupsManager getSubgroupsManager = this.this$0;
            AnonymousClass1EC r2 = this.$parentGroupJid;
            AnonymousClass1EC r1 = this.$participatingSubgroupJid;
            List list = this.$targetGroups;
            this.label = 1;
            obj = GetSubgroupsManager.A01(getSubgroupsManager, r2, r1, list, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetSubgroupsManager$fetchSubgroupMemberCount$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

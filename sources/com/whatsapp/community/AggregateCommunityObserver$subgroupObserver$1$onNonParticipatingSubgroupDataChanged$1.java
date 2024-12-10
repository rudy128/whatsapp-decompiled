package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Xp;
import X.C107955at;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.GroupJid;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.AggregateCommunityObserver$subgroupObserver$1$onNonParticipatingSubgroupDataChanged$1", f = "AggregateCommunityObserver.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
public final class AggregateCommunityObserver$subgroupObserver$1$onNonParticipatingSubgroupDataChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ GroupJid $subgroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass4Xp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateCommunityObserver$subgroupObserver$1$onNonParticipatingSubgroupDataChanged$1(AnonymousClass4Xp r2, GroupJid groupJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$subgroupJid = groupJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AggregateCommunityObserver$subgroupObserver$1$onNonParticipatingSubgroupDataChanged$1(this.this$0, this.$subgroupJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4Xp r3 = this.this$0;
            this.label = 1;
            obj = C30451dy.A00(this, r3.A0J, new AggregateCommunityObserver$getCommunitySubgroups$2(r3, (C30391dr) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (((Set) obj).contains(this.$subgroupJid)) {
            Iterator A00 = AnonymousClass4Xp.A00(this.this$0);
            while (A00.hasNext()) {
                ((C107955at) A00.next()).C7C();
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AggregateCommunityObserver$subgroupObserver$1$onNonParticipatingSubgroupDataChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

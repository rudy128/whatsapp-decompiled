package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87834Xg;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.LinkExistingGroupsUseCase$suggestExistingGroups$1", f = "LinkExistingGroupsUseCase.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class LinkExistingGroupsUseCase$suggestExistingGroups$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $jids;
    public final /* synthetic */ List $jidsToBeHidden;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public int label;
    public final /* synthetic */ C87834Xg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkExistingGroupsUseCase$suggestExistingGroups$1(C87834Xg r2, AnonymousClass1EC r3, List list, List list2, C30391dr r6) {
        super(2, r6);
        this.this$0 = r2;
        this.$parentGroupJid = r3;
        this.$jids = list;
        this.$jidsToBeHidden = list2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new LinkExistingGroupsUseCase$suggestExistingGroups$1(this.this$0, this.$parentGroupJid, this.$jids, this.$jidsToBeHidden, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C87834Xg r3 = this.this$0;
            AnonymousClass1EC r2 = this.$parentGroupJid;
            List list = this.$jids;
            List list2 = this.$jidsToBeHidden;
            this.label = 1;
            obj = r3.A02(r2, list, list2, this);
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
        return ((LinkExistingGroupsUseCase$suggestExistingGroups$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

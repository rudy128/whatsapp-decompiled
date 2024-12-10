package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4RX;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1", f = "SuggestGroupResultHandler.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$showSnackBar$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $cancelGroupJid;
    public final /* synthetic */ AnonymousClass1EC $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass4RX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$showSnackBar$1$1$1$1(AnonymousClass4RX r2, AnonymousClass1EC r3, AnonymousClass1EC r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$linkedParentGroupJid = r3;
        this.$cancelGroupJid = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SuggestGroupResultHandler$showSnackBar$1$1$1$1(this.this$0, this.$linkedParentGroupJid, this.$cancelGroupJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MemberSuggestedGroupsManager memberSuggestedGroupsManager = this.this$0.A04;
            AnonymousClass1EC r5 = this.$linkedParentGroupJid;
            List A0M = C18070vi.A0M(this.$cancelGroupJid);
            this.label = 1;
            if (memberSuggestedGroupsManager.A02.A00(r5, (List) null, (List) null, A0M, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestGroupResultHandler$showSnackBar$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.group.membersuggestions.data;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C108065b4;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C84964Ln;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2", f = "GroupMemberSuggestionsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $contactsToExclude;
    public final /* synthetic */ List $suggestedBucketQueryJobs;
    public final /* synthetic */ int $uiSurface;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GroupMemberSuggestionsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2(GroupMemberSuggestionsManager groupMemberSuggestionsManager, List list, Set set, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = groupMemberSuggestionsManager;
        this.$suggestedBucketQueryJobs = list;
        this.$uiSurface = i;
        this.$contactsToExclude = set;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2 groupMemberSuggestionsManager$loadSuggestionsBucketsResults$2 = new GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2(this.this$0, this.$suggestedBucketQueryJobs, this.$contactsToExclude, r8, this.$uiSurface);
        groupMemberSuggestionsManager$loadSuggestionsBucketsResults$2.L$0 = obj;
        return groupMemberSuggestionsManager$loadSuggestionsBucketsResults$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass00H r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r3 = (AnonymousClass1OX) this.L$0;
            ArrayList A13 = AnonymousClass000.A13();
            C18030ve r2 = ((C84964Ln) this.this$0.A03.get()).A00;
            C18040vf r4 = C18040vf.A02;
            if (C18020vd.A05(r4, r2, 9337)) {
                A13.add(C18070vi.A0E(this.this$0.A02));
            }
            boolean A05 = C18020vd.A05(r4, ((C84964Ln) this.this$0.A03.get()).A00, 8647);
            GroupMemberSuggestionsManager groupMemberSuggestionsManager = this.this$0;
            if (A05) {
                A13.add(C18070vi.A0E(groupMemberSuggestionsManager.A01));
                r0 = this.this$0.A00;
            } else {
                A13.add(C18070vi.A0E(groupMemberSuggestionsManager.A00));
                r0 = this.this$0.A01;
            }
            A13.add(C18070vi.A0E(r0));
            List list = this.$suggestedBucketQueryJobs;
            GroupMemberSuggestionsManager groupMemberSuggestionsManager2 = this.this$0;
            int i = this.$uiSurface;
            Set set = this.$contactsToExclude;
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                list.add(C30451dy.A01(AnonymousClass00R.A00, groupMemberSuggestionsManager2.A05, new GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2$1$1((C108065b4) it.next(), groupMemberSuggestionsManager2, set, (C30391dr) null, i), r3));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

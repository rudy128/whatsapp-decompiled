package com.whatsapp.group.membersuggestions.data;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1Ez;
import X.AnonymousClass1OS;
import X.C108065b4;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C81543zP;
import X.C86854Ti;
import X.C87554Wa;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2$1$1", f = "GroupMemberSuggestionsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $contactsToExclude;
    public final /* synthetic */ C108065b4 $groupMemberSuggestionsBucket;
    public final /* synthetic */ int $uiSurface;
    public int label;
    public final /* synthetic */ GroupMemberSuggestionsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2$1$1(C108065b4 r2, GroupMemberSuggestionsManager groupMemberSuggestionsManager, Set set, C30391dr r5, int i) {
        super(2, r5);
        this.$groupMemberSuggestionsBucket = r2;
        this.$uiSurface = i;
        this.$contactsToExclude = set;
        this.this$0 = groupMemberSuggestionsManager;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C108065b4 r1 = this.$groupMemberSuggestionsBucket;
        int i = this.$uiSurface;
        return new GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2$1$1(r1, this.this$0, this.$contactsToExclude, r8, i);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1Ez r2 = new AnonymousClass1Ez(false);
            r2.A04();
            C86854Ti Bhf = this.$groupMemberSuggestionsBucket.Bhf(this.$contactsToExclude);
            long A02 = r2.A02();
            Bhf.A00 = new Long(A02);
            int i = this.$uiSurface;
            int i2 = this.$groupMemberSuggestionsBucket.BNn().requestName;
            int size = Bhf.A01.size();
            C81543zP r22 = new C81543zP();
            r22.A00 = Integer.valueOf(i2);
            r22.A03 = Long.valueOf(A02);
            r22.A01 = 0;
            r22.A04 = C17880vN.A0n(size);
            r22.A02 = Integer.valueOf(i);
            ((C87554Wa) this.this$0.A04.get()).A00.CC6(r22, C87554Wa.A01);
            return AnonymousClass1D6.A01(this.$groupMemberSuggestionsBucket.BNn(), Bhf);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupMemberSuggestionsManager$loadSuggestionsBucketsResults$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

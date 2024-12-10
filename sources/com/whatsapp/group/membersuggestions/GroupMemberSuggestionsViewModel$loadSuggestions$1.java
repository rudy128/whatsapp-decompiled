package com.whatsapp.group.membersuggestions;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C86854Ti;
import com.whatsapp.group.membersuggestions.data.GroupMemberSuggestionsManager;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel$loadSuggestions$1", f = "GroupMemberSuggestionsViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class GroupMemberSuggestionsViewModel$loadSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $contactsToExclude;
    public final /* synthetic */ int $uiSurface;
    public Object L$0;
    public int label;
    public final /* synthetic */ GroupMemberSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberSuggestionsViewModel$loadSuggestions$1(GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel, Set set, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = groupMemberSuggestionsViewModel;
        this.$uiSurface = i;
        this.$contactsToExclude = set;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new GroupMemberSuggestionsViewModel$loadSuggestions$1(this.this$0, this.$contactsToExclude, r6, this.$uiSurface);
    }

    public final Object invokeSuspend(Object obj) {
        GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            int A0I = this.this$0.A02.A04.A0I();
            groupMemberSuggestionsViewModel = this.this$0;
            if (A0I < 10) {
                groupMemberSuggestionsViewModel.A00 = new LinkedHashMap(0);
                Log.i("GroupMemberSuggestionsViewModel/loadSuggestions not enough contacts on WhatsApp");
                return C27621Wu.A00;
            }
            int i2 = this.$uiSurface;
            Set set = this.$contactsToExclude;
            this.L$0 = groupMemberSuggestionsViewModel;
            this.label = 1;
            obj = ((GroupMemberSuggestionsManager) groupMemberSuggestionsViewModel.A04.get()).A00(set, this, i2);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            groupMemberSuggestionsViewModel = (GroupMemberSuggestionsViewModel) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        groupMemberSuggestionsViewModel.A01 = (LinkedHashMap) obj;
        GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel2 = this.this$0;
        groupMemberSuggestionsViewModel2.A00 = C17880vN.A13();
        LinkedHashMap linkedHashMap = groupMemberSuggestionsViewModel2.A01;
        if (linkedHashMap != null) {
            Iterator A15 = AnonymousClass000.A15(linkedHashMap);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                LinkedHashMap linkedHashMap2 = groupMemberSuggestionsViewModel2.A00;
                List list = ((C86854Ti) A16.getValue()).A01;
                if (linkedHashMap2 != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("GroupMemberSuggestionsViewModel/addLoadedContactsToResults contactListLoaded size: ");
                    C17900vP.A0o(A10, list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1E7 A0O = C17880vN.A0O(it);
                        AnonymousClass1BI r0 = A0O.A0J;
                        if (r0 != null) {
                            linkedHashMap2.put(r0, A0O);
                        }
                    }
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("GroupMemberSuggestionsViewModel/addLoadedContactsToResults/after added suggestedWaContactsResults size: ");
                    C17900vP.A0o(A102, linkedHashMap2.size());
                }
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupMemberSuggestionsViewModel$loadSuggestions$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

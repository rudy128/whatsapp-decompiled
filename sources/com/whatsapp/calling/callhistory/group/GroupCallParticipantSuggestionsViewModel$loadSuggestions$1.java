package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.C17880vN;
import X.C18460wS;
import X.C190989lq;
import X.C199429zz;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72463Mc;
import X.C72473Md;
import android.os.SystemClock;
import com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$loadSuggestions$1", f = "GroupCallParticipantSuggestionsViewModel.kt", i = {0}, l = {65}, m = "invokeSuspend", n = {"selectedJids"}, s = {"L$0"})
public final class GroupCallParticipantSuggestionsViewModel$loadSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $selectedContacts;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GroupCallParticipantSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = groupCallParticipantSuggestionsViewModel;
        this.$selectedContacts = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(this.this$0, this.$selectedContacts, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Set A12;
        GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel2 = this.this$0;
            long uptimeMillis = SystemClock.uptimeMillis();
            groupCallParticipantSuggestionsViewModel2.A01 = ((C190989lq) groupCallParticipantSuggestionsViewModel2.A07.getValue()).A00(C18460wS.A00);
            this.this$0.A00 = SystemClock.uptimeMillis() - uptimeMillis;
            List list = this.$selectedContacts;
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72473Md.A1N(A0D, it);
            }
            A12 = C29431cG.A12(A0D);
            groupCallParticipantSuggestionsViewModel = this.this$0;
            C199429zz r0 = groupCallParticipantSuggestionsViewModel.A01;
            if (r0 != null) {
                List list2 = r0.A01;
                AnonymousClass1M9 r2 = groupCallParticipantSuggestionsViewModel.A05;
                this.L$0 = A12;
                this.L$1 = groupCallParticipantSuggestionsViewModel;
                this.label = 1;
                obj = AnonymousClass1OW.A00(this, new ContactManagerExtKt$asWaContacts$2(r2, list2, (C30391dr) null));
                if (obj == r4) {
                    return r4;
                }
            } else {
                throw C17880vN.A0g();
            }
        } else if (i == 1) {
            groupCallParticipantSuggestionsViewModel = (GroupCallParticipantSuggestionsViewModel) this.L$1;
            A12 = (Set) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Iterable iterable = (Iterable) obj;
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            C72463Mc.A1D(C17880vN.A0O(it2), A12);
        }
        groupCallParticipantSuggestionsViewModel.A02 = (List) iterable;
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupCallParticipantSuggestionsViewModel$loadSuggestions$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

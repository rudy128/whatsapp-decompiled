package com.whatsapp.group.membersuggestions;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass4DU;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C81673zc;
import X.C88474Zv;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.membersuggestions.GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1", f = "GroupMemberSuggestionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $uiSurface;
    public final /* synthetic */ AnonymousClass1E7 $waContact;
    public int label;
    public final /* synthetic */ GroupMemberSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1(AnonymousClass1E7 r2, GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = groupMemberSuggestionsViewModel;
        this.$waContact = r2;
        this.$uiSurface = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1(this.$waContact, this.this$0, r6, this.$uiSurface);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Integer num;
        Boolean bool;
        Long l;
        Long l2;
        Set keySet;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Integer A00 = GroupMemberSuggestionsViewModel.A00(this.this$0, AnonymousClass4DU.FREQUENTLY_CONTACTED, this.$waContact.A0J);
            Integer A002 = GroupMemberSuggestionsViewModel.A00(this.this$0, AnonymousClass4DU.RECENT_CHATS, this.$waContact.A0J);
            C88474Zv r4 = (C88474Zv) this.this$0.A03.get();
            AnonymousClass1E7 r9 = this.$waContact;
            int i = this.$uiSurface;
            LinkedHashMap linkedHashMap = this.this$0.A00;
            if (linkedHashMap == null || (keySet = linkedHashMap.keySet()) == null) {
                list = null;
            } else {
                list = C29431cG.A0t(keySet);
            }
            C18070vi.A0d(r9, 0);
            Long l3 = null;
            if (list != null) {
                num = Integer.valueOf(list.indexOf(r9.A0J));
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                boolean z = false;
                if (intValue >= 0 && intValue < 5) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            boolean A19 = C18070vi.A19(bool, true);
            C81673zc r2 = new C81673zc();
            boolean z2 = r9.A0y;
            if (A19) {
                int i2 = 4;
                if (z2) {
                    i2 = 2;
                }
                C88474Zv.A00(r2, r4, i, i2, false);
            } else {
                int i3 = 5;
                if (z2) {
                    i3 = 3;
                }
                C88474Zv.A00(r2, r4, i, i3, false);
            }
            if (list != null) {
                l = C17880vN.A0n(Math.min(list.size(), 5));
            } else {
                l = null;
            }
            r2.A04 = l;
            Long l4 = r2.A05;
            if (l4 == null) {
                l4 = null;
            }
            r2.A05 = l4;
            if (A00 != null) {
                l2 = C17890vO.A0N(A00);
            } else {
                l2 = null;
            }
            r2.A02 = l2;
            if (A002 != null) {
                l3 = C17890vO.A0N(A002);
            }
            r2.A03 = l3;
            r4.A01.CC6(r2, C88474Zv.A05);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupMemberSuggestionsViewModel$logContactSelectionChangeSuggestionsEnabled$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

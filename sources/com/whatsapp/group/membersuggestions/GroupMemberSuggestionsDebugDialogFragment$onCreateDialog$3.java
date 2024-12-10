package com.whatsapp.group.membersuggestions;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18460wS;
import X.C25511Om;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C98644rU;
import X.C99834tX;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment$onCreateDialog$3", f = "GroupMemberSuggestionsDebugDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GroupMemberSuggestionsDebugDialogFragment$onCreateDialog$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ GroupMemberSuggestionsDebugDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberSuggestionsDebugDialogFragment$onCreateDialog$3(GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = groupMemberSuggestionsDebugDialogFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new GroupMemberSuggestionsDebugDialogFragment$onCreateDialog$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupMemberSuggestionsDebugDialogFragment$onCreateDialog$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Set set = C25511Om.A00;
            GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment = this.this$0;
            AnonymousClass1EC r1 = groupMemberSuggestionsDebugDialogFragment.A07;
            if (r1 != null) {
                AnonymousClass1MZ r0 = groupMemberSuggestionsDebugDialogFragment.A05;
                if (r0 != null) {
                    set = r0.A08.A0B(r1).A09();
                } else {
                    str = "groupParticipantManager";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            AnonymousClass11P r02 = this.this$0.A03;
            if (r02 != null) {
                long A01 = AnonymousClass11P.A01(r02);
                GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment2 = this.this$0;
                GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel = groupMemberSuggestionsDebugDialogFragment2.A06;
                if (groupMemberSuggestionsViewModel != null) {
                    Set set2 = set;
                    groupMemberSuggestionsViewModel.A0U(set2, groupMemberSuggestionsDebugDialogFragment2.A00);
                    GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel2 = this.this$0.A06;
                    if (groupMemberSuggestionsViewModel2 != null) {
                        List A0T = groupMemberSuggestionsViewModel2.A0T(C18460wS.A00);
                        AnonymousClass11P r03 = this.this$0.A03;
                        if (r03 != null) {
                            long A012 = AnonymousClass11P.A01(r03);
                            GroupMemberSuggestionsViewModel groupMemberSuggestionsViewModel3 = this.this$0.A06;
                            if (groupMemberSuggestionsViewModel3 != null) {
                                LinkedHashMap linkedHashMap = groupMemberSuggestionsViewModel3.A01;
                                if (linkedHashMap != null) {
                                    list = C99834tX.A0L(linkedHashMap);
                                } else {
                                    list = null;
                                }
                                GroupMemberSuggestionsDebugDialogFragment groupMemberSuggestionsDebugDialogFragment3 = this.this$0;
                                long j = A012 - A01;
                                int size = set2.size();
                                LinearLayout linearLayout = groupMemberSuggestionsDebugDialogFragment3.A01;
                                if (linearLayout != null) {
                                    AnonymousClass1KB r04 = groupMemberSuggestionsDebugDialogFragment3.A02;
                                    if (r04 != null) {
                                        r04.A0J(new C98644rU(linearLayout, groupMemberSuggestionsDebugDialogFragment3, A0T, list, size, j));
                                    } else {
                                        str = "globalUi";
                                        C18070vi.A11(str);
                                        throw null;
                                    }
                                }
                                return C27621Wu.A00;
                            }
                        }
                    }
                }
                C18070vi.A11("viewModel");
                throw null;
            }
            str = "time";
            C18070vi.A11(str);
            throw null;
        }
        throw AnonymousClass000.A0l();
    }
}

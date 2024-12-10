package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass40T;
import X.AnonymousClass40U;
import X.AnonymousClass41B;
import X.AnonymousClass41C;
import X.AnonymousClass4EX;
import X.AnonymousClass9DP;
import X.C106925Xs;
import X.C178269Cl;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31761g5;
import X.C41681wt;
import X.C96164nP;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1", f = "CreateSubGroupSuggestionProtocolHelper.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
public final class CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C106925Xs $createExistingGroupSuggestionCallback;
    public final /* synthetic */ List $groupJids;
    public final /* synthetic */ List $groupJidsToBeHidden;
    public final /* synthetic */ AnonymousClass1EC $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ CreateSubGroupSuggestionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(C106925Xs r2, CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper, AnonymousClass1EC r4, List list, List list2, C30391dr r7) {
        super(2, r7);
        this.this$0 = createSubGroupSuggestionProtocolHelper;
        this.$linkedParentGroupJid = r4;
        this.$groupJids = list;
        this.$groupJidsToBeHidden = list2;
        this.$createExistingGroupSuggestionCallback = r2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(this.$createExistingGroupSuggestionCallback, this.this$0, this.$linkedParentGroupJid, this.$groupJids, this.$groupJidsToBeHidden, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C106925Xs r3;
        int i;
        C31761g5 r32;
        Object obj2;
        C178269Cl r0;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = this.this$0;
            AnonymousClass1EC r5 = this.$linkedParentGroupJid;
            List list = this.$groupJids;
            ArrayList A0E = C29351c6.A0E(list);
            for (Object next : list) {
                C18070vi.A0z(next, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A0E.add(next);
            }
            List A01 = C41681wt.A01(A0E);
            List list2 = this.$groupJidsToBeHidden;
            ArrayList A0E2 = C29351c6.A0E(list2);
            for (Object next2 : list2) {
                C18070vi.A0z(next2, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A0E2.add(next2);
            }
            this.label = 1;
            obj = createSubGroupSuggestionProtocolHelper.A01(r5, A01, A0E2, this);
            if (obj == r7) {
                return r7;
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass4EX r10 = (AnonymousClass4EX) obj;
        if (r10 instanceof AnonymousClass40T) {
            List list3 = ((AnonymousClass40T) r10).A00;
            if (AnonymousClass000.A1a(list3)) {
                int size = this.$groupJids.size();
                r3 = this.$createExistingGroupSuggestionCallback;
                if (size == 1) {
                    AnonymousClass9DP r02 = (AnonymousClass9DP) list3.get(0);
                    if (!(r02 == null || (r0 = (C178269Cl) r02.A01) == null)) {
                        int i3 = r0.A00;
                        i = 2131896610;
                        if (i3 != 1) {
                            i = 2131896612;
                            if (i3 != 4) {
                                i = 2131896611;
                                if (i3 != 3) {
                                    if (i3 == 6) {
                                        i = 2131896609;
                                    } else {
                                        Log.e("CreateSubFroupSuggestionProcotolHendler/unknown error");
                                    }
                                }
                            }
                        }
                    }
                    i = 2131890750;
                } else {
                    C96164nP r33 = (C96164nP) r3;
                    int size2 = r33.A01.size();
                    r32 = r33.A02;
                    obj2 = new AnonymousClass41C(size2, size2 - list3.size());
                    r32.resumeWith(obj2);
                    return C27621Wu.A00;
                }
            } else {
                C96164nP r03 = (C96164nP) this.$createExistingGroupSuggestionCallback;
                C31761g5 r34 = r03.A02;
                List list4 = r03.A01;
                r34.resumeWith(new AnonymousClass41C(list4.size(), list4.size()));
                return C27621Wu.A00;
            }
        } else {
            if (r10 instanceof AnonymousClass40U) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("sendExistingGroupSuggestionWrapperForJavaCaller/Request failed for suggested existing group ");
                A10.append(this.$groupJids);
                C17890vO.A0w(A10);
                r3 = this.$createExistingGroupSuggestionCallback;
                i = 2131890750;
            }
            return C27621Wu.A00;
        }
        r32 = ((C96164nP) r3).A02;
        obj2 = new AnonymousClass41B(i);
        r32.resumeWith(obj2);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass41B;
import X.AnonymousClass41C;
import X.AnonymousClass4FI;
import X.C106395Vr;
import X.C18070vi;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C40371ub;
import X.C77173pV;
import X.C83164Eb;
import X.C86604Sh;
import X.C87834Xg;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.SelectCommunityForGroupViewModel$suggestGroup$1", f = "SelectCommunityForGroupViewModel.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
public final class SelectCommunityForGroupViewModel$suggestGroup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ List $groupsToBeHidden;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public int label;
    public final /* synthetic */ SelectCommunityForGroupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCommunityForGroupViewModel$suggestGroup$1(SelectCommunityForGroupViewModel selectCommunityForGroupViewModel, AnonymousClass1EC r3, AnonymousClass1EC r4, List list, C30391dr r6) {
        super(2, r6);
        this.this$0 = selectCommunityForGroupViewModel;
        this.$parentGroupJid = r3;
        this.$groupJid = r4;
        this.$groupsToBeHidden = list;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new SelectCommunityForGroupViewModel$suggestGroup$1(this.this$0, this.$parentGroupJid, this.$groupJid, this.$groupsToBeHidden, r8);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass1D6 A01;
        Object value;
        Object A012;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            C87834Xg r3 = this.this$0.A00;
            AnonymousClass1EC r2 = this.$parentGroupJid;
            List A0M = C18070vi.A0M(this.$groupJid.getRawString());
            List list = this.$groupsToBeHidden;
            this.label = 1;
            obj = r3.A02(r2, A0M, list, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C83164Eb r9 = (C83164Eb) obj;
        if (r9 instanceof AnonymousClass41C) {
            if (((AnonymousClass41C) r9).A00 >= 1) {
                A01 = AnonymousClass1D6.A01(new C86604Sh(AnonymousClass3MX.A0t(2131896616)), true);
            }
            i = 2131890322;
            A01 = AnonymousClass1D6.A01(new C86604Sh(AnonymousClass3MX.A0t(i)), false);
        } else {
            if (r9 instanceof AnonymousClass41B) {
                i = ((AnonymousClass41B) r9).A00;
                A01 = AnonymousClass1D6.A01(new C86604Sh(AnonymousClass3MX.A0t(i)), false);
            }
            i = 2131890322;
            A01 = AnonymousClass1D6.A01(new C86604Sh(AnonymousClass3MX.A0t(i)), false);
        }
        C86604Sh r7 = (C86604Sh) A01.first;
        boolean A1Y = AnonymousClass000.A1Y(A01.second);
        SelectCommunityForGroupViewModel selectCommunityForGroupViewModel = this.this$0;
        AnonymousClass1G4 r4 = selectCommunityForGroupViewModel.A05;
        do {
            value = r4.getValue();
            AnonymousClass4FI r22 = (AnonymousClass4FI) value;
            C40371ub r0 = selectCommunityForGroupViewModel.A01;
            if (A1Y) {
                r0.A06();
                A012 = new C77173pV(r22.A00(), r7);
            } else {
                r0.A05();
                A012 = r22.A01(r7, (Integer) null, C106395Vr.A00, (C22821Di) null);
            }
        } while (!r4.BFK(value, A012));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SelectCommunityForGroupViewModel$suggestGroup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4WZ;
import X.AnonymousClass9F6;
import X.C17880vN;
import X.C17890vO;
import X.C184329am;
import X.C20996Aco;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C32101gd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$init$2", f = "CommunityMembersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$init$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$init$2(CommunityMembersViewModel communityMembersViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = communityMembersViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMembersViewModel$init$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMembersViewModel$init$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            C32101gd r1 = communityMembersViewModel.A08;
            AnonymousClass1EC r4 = communityMembersViewModel.A0I;
            CommunityMembersDirectory communityMembersDirectory = (CommunityMembersDirectory) r1;
            if (communityMembersDirectory.A06.A0K(r4)) {
                C184329am r3 = new C184329am(communityMembersDirectory, r4);
                AnonymousClass00H r2 = ((AnonymousClass4WZ) communityMembersDirectory.A0A.get()).A00;
                String A0T = C17890vO.A0T(r2);
                AnonymousClass9F6 r12 = new AnonymousClass9F6(r4, A0T, 25);
                C17880vN.A0U(r2).A0I(new C20996Aco(r12, r3, 1), (C29621ca) r12.A00, A0T, 349, AnonymousClass4WZ.A01);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}

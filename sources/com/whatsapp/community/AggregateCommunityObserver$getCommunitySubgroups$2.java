package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Xp;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.AggregateCommunityObserver$getCommunitySubgroups$2", f = "AggregateCommunityObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AggregateCommunityObserver$getCommunitySubgroups$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4Xp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateCommunityObserver$getCommunitySubgroups$2(AnonymousClass4Xp r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AggregateCommunityObserver$getCommunitySubgroups$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AggregateCommunityObserver$getCommunitySubgroups$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4Xp r0 = this.this$0;
            HashSet A03 = r0.A0E.A03(r0.A0I);
            ArrayList A0D = C29351c6.A0D(A03);
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                C72463Mc.A1K(A0D, it);
            }
            return C29431cG.A12(A0D);
        }
        throw AnonymousClass000.A0l();
    }
}

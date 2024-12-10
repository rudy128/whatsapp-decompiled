package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Uc;
import X.AnonymousClass4Xp;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C93884jh;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1", f = "AggregateCommunityObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $gjid;
    public int label;
    public final /* synthetic */ AnonymousClass4Xp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1(AnonymousClass4Xp r2, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$gjid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1(this.this$0, this.$gjid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (C18070vi.A18(this.this$0.A0I, this.this$0.A00.A05(this.$gjid))) {
                Iterator A00 = AnonymousClass4Xp.A00(this.this$0);
                while (A00.hasNext()) {
                    C93884jh A0M = AnonymousClass3MY.A0M(A00);
                    if (A0M.A00 == 0) {
                        AnonymousClass3Uc r2 = (AnonymousClass3Uc) A0M.A01;
                        if (r2.A0N.A08(r2.A0q).size() <= 0) {
                            AnonymousClass3MX.A1K(r2.A12, 403);
                        }
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AggregateCommunityObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.AnonymousClass3Uc;
import X.AnonymousClass4Xp;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C93884jh;
import X.C98754rf;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1", f = "AggregateCommunityObserver.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $gjid;
    public int label;
    public final /* synthetic */ AnonymousClass4Xp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1(AnonymousClass4Xp r2, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$gjid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1(this.this$0, this.$gjid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4Xp r4 = this.this$0;
            AnonymousClass1EC r3 = this.$gjid;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A0J, new AggregateCommunityObserver$getParentGroupJid$2(r4, r3, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (C18070vi.A18(this.this$0.A0I, obj)) {
            Iterator A00 = AnonymousClass4Xp.A00(this.this$0);
            while (A00.hasNext()) {
                C93884jh A0M = AnonymousClass3MY.A0M(A00);
                if (A0M.A00 == 0) {
                    AnonymousClass3Uc r32 = (AnonymousClass3Uc) A0M.A01;
                    if (C18020vd.A05(C18040vf.A02, r32.A0i, 8070)) {
                        C98754rf.A00(r32.A10, A0M, 30);
                    } else {
                        r32.A0j.A05(r32.A0q);
                    }
                }
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AggregateCommunityObserver$groupParticipantsObserver$1$onMeLeavingGroup$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

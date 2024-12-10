package com.whatsapp.blocklist;

import X.AnonymousClass000;
import X.AnonymousClass1ED;
import X.AnonymousClass1OS;
import X.AnonymousClass7RK;
import X.C130666jo;
import X.C132786na;
import X.C17900vP;
import X.C18070vi;
import X.C188509hX;
import X.C21451AkI;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37551pj;
import com.whatsapp.interop.blocklist.InteropBlockListManager$blockUser$2;
import com.whatsapp.interop.blocklist.InteropBlockListManager$unblockUser$2;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.blocklist.InteropBlockListResponseHandler$send$1", f = "InteropBlockListResponseHandler.kt", i = {}, l = {39, 41}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListResponseHandler$send$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C130666jo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListResponseHandler$send$1(C130666jo r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropBlockListResponseHandler$send$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropBlockListResponseHandler$send$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                C130666jo r3 = this.this$0;
                C188509hX r2 = r3.A04;
                if (r2.A0A) {
                    C132786na r4 = r3.A06;
                    UserJid userJid = r2.A03;
                    C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                    this.label = 1;
                    obj2 = C30451dy.A00(this, r4.A03, new InteropBlockListManager$blockUser$2(r4, (AnonymousClass1ED) userJid, (C30391dr) null));
                } else {
                    C132786na r42 = r3.A06;
                    UserJid userJid2 = r2.A03;
                    C18070vi.A0z(userJid2, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                    this.label = 2;
                    obj2 = C30451dy.A00(this, r42.A03, new InteropBlockListManager$unblockUser$2(r42, (AnonymousClass1ED) userJid2, (C30391dr) null));
                }
                if (obj2 == r6) {
                    return r6;
                }
            } catch (IOException e) {
                Log.i(C17900vP.A0C("InteropBlockListResponseHandler/error: ", AnonymousClass000.A10(), e));
                z = false;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C130666jo r0 = this.this$0;
        C37551pj r43 = r0.A03;
        r43.A0G.CGF(new C21451AkI(r0.A04, r43, 7));
        C130666jo r02 = this.this$0;
        C37551pj r22 = r02.A03;
        C188509hX r03 = r02.A04;
        r22.A0K(r03.A03, r03.A0A);
        C130666jo r32 = this.this$0;
        r32.A01.CGP(new AnonymousClass7RK(12, (Object) r32, z));
        return C27621Wu.A00;
    }
}

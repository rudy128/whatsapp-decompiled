package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4YZ;
import X.C18070vi;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C445823z;
import X.C73353Va;
import X.C80893yG;
import X.C84854Lc;
import X.C84914Li;
import com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$send$2;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1", f = "EventInfoViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ C445823z $message;
    public int label;
    public final /* synthetic */ C73353Va this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1(C445823z r2, C73353Va r3, UserJid userJid, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$message = r2;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1(this.$message, this.this$0, this.$jid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C73353Va r2 = this.this$0;
            C445823z r0 = this.$message;
            Object obj2 = this.$jid;
            if (r2.A04.A0R(r0.A0v.A00) && (obj2 instanceof PhoneUserJid)) {
                obj2 = r2.A07.A0C((PhoneUserJid) obj2);
            }
            Iterator it = ((AnonymousClass4YZ) this.this$0.A0F.getValue()).A03.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C84914Li r1 = (C84914Li) it.next();
                if (!(r1 instanceof C80893yG) || !C18070vi.A18(((C80893yG) r1).A01, obj2)) {
                    i2++;
                } else if (i2 != -1) {
                    C73353Va r02 = this.this$0;
                    C84854Lc r4 = r02.A02;
                    Integer A0v = AnonymousClass3MW.A0v(i2 + ((AnonymousClass4YZ) r02.A0F.getValue()).A02.size());
                    this.label = 1;
                    if (AnonymousClass3MX.A13(C30451dy.A00(this, C23761Hn.A00(), new MainThreadSingleSideEffect$send$2(r4, A0v, (C30391dr) null))) == r5) {
                        return r5;
                    }
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventInfoViewModel$contactObserver$1$onDisplayNameChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

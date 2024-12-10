package com.whatsapp.interop.blocklist.init;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7CF;
import X.C108945cZ;
import X.C132786na;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.init.InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1", f = "InteropBlockListAsyncInit.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass7CF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(AnonymousClass7CF r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C132786na r3 = (C132786na) this.this$0.A00.get();
            this.label = 1;
            Set set = r3.A02;
            boolean A1U = C108945cZ.A1U(set);
            Object obj3 = set;
            if (!A1U) {
                obj3 = C30451dy.A00(this, r3.A03, new InteropBlockListManager$loadBlockListFromStorage$2(r3, (C30391dr) null));
            }
            if (obj3 == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}

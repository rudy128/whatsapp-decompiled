package com.whatsapp.status.logging;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass6XJ;
import X.AnonymousClass77U;
import X.C138716xZ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C32741hg;
import com.whatsapp.productinfra.music.gating.MusicGating;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.logging.StatusesStatsManager$stopViewerSession$1$1$1", f = "StatusesStatsManager.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {})
public final class StatusesStatsManager$stopViewerSession$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C138716xZ $itemView;
    public final /* synthetic */ AnonymousClass206 $message;
    public Object L$0;
    public int label;
    public final /* synthetic */ C32741hg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesStatsManager$stopViewerSession$1$1$1(AnonymousClass206 r2, C32741hg r3, C138716xZ r4, C30391dr r5) {
        super(2, r5);
        this.$itemView = r4;
        this.this$0 = r3;
        this.$message = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        C138716xZ r3 = this.$itemView;
        return new StatusesStatsManager$stopViewerSession$1$1$1(this.$message, this.this$0, r3, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C138716xZ r2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r2 = this.$itemView;
            AnonymousClass77U A00 = AnonymousClass6XJ.A00(this.$message);
            this.L$0 = r2;
            this.label = 1;
            obj = ((MusicGating) this.this$0.A0J.get()).A00(A00, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            r2 = (C138716xZ) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        r2.A0F = (Boolean) obj;
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusesStatsManager$stopViewerSession$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

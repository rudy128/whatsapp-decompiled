package androidx.work;

import X.AJU;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineWorker$getForegroundInfoAsync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AJU $jobFuture;
    public Object L$0;
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(CoroutineWorker coroutineWorker, AJU aju, C30391dr r4) {
        super(2, r4);
        this.$jobFuture = aju;
        this.this$0 = coroutineWorker;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.this$0, this.$jobFuture, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AJU aju = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = aju;
            this.label = 1;
            if (coroutineWorker instanceof XmppLifecycleWorker) {
                throw AnonymousClass000.A0n("XmppLifecycleWorker is not supposed to run in foreground");
            }
            throw AnonymousClass000.A0n("Not implemented");
        } else if (i == 1) {
            C30691eM.A01(obj);
            ((AJU) this.L$0).A00.A05(obj);
            return C27621Wu.A00;
        } else {
            throw AnonymousClass000.A0l();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

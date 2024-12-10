package com.whatsapp.messaging;

import X.AnonymousClass1OS;
import X.AnonymousClass1OZ;
import X.C186019dW;
import X.C20994Acm;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.MessageClient$RetriableIqProtocol$resubmit$1$1", f = "MessageClient.kt", i = {}, l = {1053}, m = "invokeSuspend", n = {}, s = {})
public final class MessageClient$RetriableIqProtocol$resubmit$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C29621ca $modifiedNode;
    public final /* synthetic */ C186019dW $retryInfo;
    public int label;
    public final /* synthetic */ C20994Acm this$0;
    public final /* synthetic */ AnonymousClass1OZ this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageClient$RetriableIqProtocol$resubmit$1$1(C186019dW r2, C20994Acm acm, AnonymousClass1OZ r4, C29621ca r5, C30391dr r6) {
        super(2, r6);
        this.$retryInfo = r2;
        this.this$0 = acm;
        this.this$1 = r4;
        this.$modifiedNode = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new MessageClient$RetriableIqProtocol$resubmit$1$1(this.$retryInfo, this.this$0, this.this$1, this.$modifiedNode, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        X.C20994Acm.A02(r11.this$0, (X.C29621ca) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0010
            if (r0 != r3) goto L_0x000b
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0010:
            X.C30691eM.A01(r12)
            X.9dW r0 = r11.$retryInfo     // Catch:{ CancellationException -> 0x0064 }
            long r0 = r0.A01     // Catch:{ CancellationException -> 0x0064 }
            r11.label = r3     // Catch:{ CancellationException -> 0x0064 }
            java.lang.Object r0 = X.C62882s9.A00(r11, r0)     // Catch:{ CancellationException -> 0x0064 }
            if (r0 != r4) goto L_0x0023
            return r4
        L_0x0020:
            X.C30691eM.A01(r12)     // Catch:{ CancellationException -> 0x0064 }
        L_0x0023:
            X.Acm r7 = r11.this$0     // Catch:{ CancellationException -> 0x0064 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CancellationException -> 0x0064 }
            long r0 = r7.A01     // Catch:{ CancellationException -> 0x0064 }
            long r5 = r5 - r0
            X.9dW r0 = r11.$retryInfo     // Catch:{ CancellationException -> 0x0064 }
            long r3 = r0.A00     // Catch:{ CancellationException -> 0x0064 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003a
            X.C20994Acm.A02(r7, r2)     // Catch:{ CancellationException -> 0x0064 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x0064 }
            return r0
        L_0x003a:
            X.1OZ r0 = r11.this$1     // Catch:{ CancellationException -> 0x0064 }
            java.util.Map r3 = r0.A09     // Catch:{ CancellationException -> 0x0064 }
            monitor-enter(r3)     // Catch:{ CancellationException -> 0x0064 }
            java.util.Map r1 = r0.A09     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x0061 }
            r1.remove(r0)     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)     // Catch:{ CancellationException -> 0x0064 }
            X.1OZ r3 = r11.this$1     // Catch:{ CancellationException -> 0x0064 }
            X.Acm r1 = r11.this$0     // Catch:{ CancellationException -> 0x0064 }
            int r8 = r1.A00     // Catch:{ CancellationException -> 0x0064 }
            java.lang.String r7 = r1.A06     // Catch:{ CancellationException -> 0x0064 }
            X.1ca r5 = r11.$modifiedNode     // Catch:{ CancellationException -> 0x0064 }
            if (r5 != 0) goto L_0x0055
            X.1ca r5 = r1.A04     // Catch:{ CancellationException -> 0x0064 }
        L_0x0055:
            X.1O5 r4 = r1.A03     // Catch:{ CancellationException -> 0x0064 }
            X.9dW r0 = r11.$retryInfo     // Catch:{ CancellationException -> 0x0064 }
            long r9 = r0.A00     // Catch:{ CancellationException -> 0x0064 }
            X.1NV r6 = r1.A05     // Catch:{ CancellationException -> 0x0064 }
            r3.A0H(r4, r5, r6, r7, r8, r9)     // Catch:{ CancellationException -> 0x0064 }
            goto L_0x0069
        L_0x0061:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ CancellationException -> 0x0064 }
            throw r0     // Catch:{ CancellationException -> 0x0064 }
        L_0x0064:
            X.Acm r0 = r11.this$0
            X.C20994Acm.A02(r0, r2)
        L_0x0069:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageClient$RetriableIqProtocol$resubmit$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageClient$RetriableIqProtocol$resubmit$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

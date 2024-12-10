package com.whatsapp.status.playback;

import X.AnonymousClass1OS;
import X.C111235jF;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.StatusPlaybackViewModel$onStatusClick$1", f = "StatusPlaybackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackViewModel$onStatusClick$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $chatJid;
    public final /* synthetic */ boolean $singleContactUpdate;
    public int label;
    public final /* synthetic */ C111235jF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackViewModel$onStatusClick$1(UserJid userJid, C111235jF r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r3;
        this.$chatJid = userJid;
        this.$singleContactUpdate = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StatusPlaybackViewModel$onStatusClick$1(this.$chatJid, this.this$0, r6, this.$singleContactUpdate);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.6sJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.6sJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.6sJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.6sJ} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r9 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1.A02 != false) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            if (r0 != 0) goto L_0x00c2
            X.C30691eM.A01(r13)
            X.5jF r0 = r12.this$0
            X.00H r0 = r0.A0B
            java.lang.Object r5 = r0.get()
            X.6ji r5 = (X.C130606ji) r5
            com.whatsapp.jid.UserJid r7 = r12.$chatJid
            X.5jF r1 = r12.this$0
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x001e
            boolean r0 = r1.A02
            r2 = 0
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            boolean r9 = r12.$singleContactUpdate
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            int r1 = r5.A03
            r0 = 1
            if (r1 != r0) goto L_0x00bf
            if (r2 == 0) goto L_0x00bf
            X.00H r0 = r5.A06
            java.lang.Object r6 = r0.get()
            X.6O1 r6 = (X.AnonymousClass6O1) r6
            java.util.Calendar r0 = r6.A0J()
            long r3 = r0.getTimeInMillis()
            java.util.List r0 = X.C18070vi.A0M(r7)
            java.util.ArrayList r0 = r6.A0I(r0, r3)
            r8 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6sJ r0 = (X.C135506sJ) r0
            X.1BI r0 = r0.A02
            boolean r0 = X.C18070vi.A18(r0, r7)
            if (r0 == 0) goto L_0x0049
            r8 = r1
        L_0x005f:
            X.6sJ r8 = (X.C135506sJ) r8
            X.00H r0 = r5.A05
            java.lang.Object r10 = r0.get()
            X.6j1 r10 = (X.C130186j1) r10
            X.00H r0 = r5.A07
            java.lang.Object r0 = r0.get()
            X.6wg r0 = (X.C138196wg) r0
            X.0vl r0 = r0.A02
            int r11 = X.C72453Mb.A0I(r0)
            monitor-enter(r10)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x009e }
            java.util.Map r2 = r10.A00     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x00a1
            r0 = 40
            X.7Rn r1 = new X.7Rn     // Catch:{ all -> 0x009e }
            r1.<init>(r0)     // Catch:{ all -> 0x009e }
            java.util.TreeMap r0 = new java.util.TreeMap     // Catch:{ all -> 0x009e }
            r0.<init>(r1)     // Catch:{ all -> 0x009e }
            r0.putAll(r2)     // Catch:{ all -> 0x009e }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x009e }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x009e }
            java.util.List r0 = X.C29431cG.A0v(r0, r11)     // Catch:{ all -> 0x009e }
            r5.addAll(r0)     // Catch:{ all -> 0x009e }
            goto L_0x00a1
        L_0x009e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00a1:
            monitor-exit(r10)
            boolean r0 = r5.contains(r7)
            if (r0 == 0) goto L_0x00ab
            r5 = 1
            if (r9 == 0) goto L_0x00ac
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            if (r8 == 0) goto L_0x00bf
            int r2 = r8.A01
            int r0 = r8.A00
            int r1 = r0 + 1
            if (r5 != 0) goto L_0x00b8
            int r2 = r2 + 1
        L_0x00b8:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r6.A0K(r7, r0, r1, r2)
        L_0x00bf:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusPlaybackViewModel$onStatusClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackViewModel$onStatusClick$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.interop.blocklist;

import X.AnonymousClass1OS;
import X.C132786na;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2", f = "InteropBlockListManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListManager$loadBlockListFromStorage$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C132786na this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListManager$loadBlockListFromStorage$2(C132786na r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropBlockListManager$loadBlockListFromStorage$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropBlockListManager$loadBlockListFromStorage$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x0061
            X.C30691eM.A01(r9)
            X.6na r0 = r8.this$0
            java.util.Set r4 = r0.A02
            monitor-enter(r4)
            java.util.Set r7 = r0.A02     // Catch:{ all -> 0x005e }
            X.00H r0 = r0.A01     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005e }
            X.2Q5 r0 = (X.AnonymousClass2Q5) r0     // Catch:{ all -> 0x005e }
            java.util.HashSet r6 = X.C17880vN.A12()     // Catch:{ all -> 0x005e }
            X.1Lt r0 = r0.A00     // Catch:{ all -> 0x005e }
            X.1at r5 = r0.get()     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "SELECT jid FROM wa_block_list_interop"
            java.lang.String r1 = "INTEROP_GET_BLOCK_LIST"
            r0 = 0
            android.database.Cursor r3 = X.C24861Ly.A03(r5, r2, r1, r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "jid"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0050 }
        L_0x002f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0045
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r3.getString(r2)     // Catch:{ all -> 0x0050 }
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x002f
            r6.add(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x002f
        L_0x0045:
            r3.close()     // Catch:{ all -> 0x0057 }
            r5.close()     // Catch:{ all -> 0x005e }
            r7.addAll(r6)     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return r7
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

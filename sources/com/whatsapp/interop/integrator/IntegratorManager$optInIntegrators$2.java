package com.whatsapp.interop.integrator;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C34651kr;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2", f = "IntegratorManager.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$optInIntegrators$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $integrators;
    public int label;
    public final /* synthetic */ C34651kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$optInIntegrators$2(C34651kr r2, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$integrators = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new IntegratorManager$optInIntegrators$2(this.this$0, this.$integrators, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0140, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0141, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0144, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r6 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r6) goto L_0x0156
            X.C30691eM.A01(r15)
        L_0x000c:
            X.9FE r15 = (X.AnonymousClass9FE) r15
            if (r15 == 0) goto L_0x0153
            int r0 = r15.A00
            if (r0 != r6) goto L_0x0145
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r7 = r0.iterator()
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r2 = r7.next()
            X.9DK r2 = (X.AnonymousClass9DK) r2
            java.lang.Object r0 = r2.A01
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x0020
            java.lang.Object r5 = r0.A00
            X.5aZ r5 = (X.C107775aZ) r5
            long r2 = r2.A00
            int r0 = (int) r2
            java.lang.Integer r4 = X.AnonymousClass3MW.A0v(r0)
            long r2 = r5.BOr()
            int r0 = (int) r2
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            X.AnonymousClass1D6.A02(r4, r0, r1)
            goto L_0x0020
        L_0x004a:
            X.C30691eM.A01(r15)
            X.1kr r0 = r14.this$0
            X.00H r0 = r0.A02
            java.lang.Object r5 = r0.get()
            com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager r5 = (com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager) r5
            java.util.List r0 = r14.$integrators
            java.util.ArrayList r4 = X.C29351c6.A0E(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0061:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0075
            int r0 = X.C72453Mb.A0H(r3)
            long r1 = (long) r0
            X.9Ed r0 = new X.9Ed
            r0.<init>((long) r1)
            r4.add(r0)
            goto L_0x0061
        L_0x0075:
            r14.label = r6
            r0 = 394(0x18a, float:5.52E-43)
            java.lang.Object r15 = r5.A05(r4, r14, r0)
            if (r15 != r7) goto L_0x000c
            return r7
        L_0x0080:
            java.util.List r4 = r14.$integrators
            java.util.ArrayList r3 = X.C29351c6.A0E(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x008a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r2.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            int r0 = X.AnonymousClass3MZ.A04(r0)
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r3.add(r0)
            goto L_0x008a
        L_0x00a2:
            java.util.Set r0 = X.C29431cG.A12(r3)
            java.util.Set r2 = X.C29431cG.A14(r4, r0)
            X.1kr r0 = r14.this$0
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.2cM r0 = (X.C53332cM) r0
            java.util.List r7 = X.C29431cG.A0t(r2)
            java.lang.String r5 = "opt_in_status"
            r4 = 0
            X.1Cd r0 = r0.A00
            X.1au r2 = r0.A05()
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x013e }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0137 }
            r9.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0137 }
            r9.put(r5, r0)     // Catch:{ all -> 0x0137 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0137 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0137 }
            java.lang.String r10 = "integrator_display_name"
            java.lang.String r11 = "opt_in_status = 1"
            java.lang.String r12 = "InteropIntegratorStoreCLEAR_OPTED_IN_INTEGRATORS"
            r13 = 0
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0137 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0137 }
            r9.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0137 }
            r9.put(r5, r0)     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "integrator_id IN "
            r5.append(r0)     // Catch:{ all -> 0x0137 }
            int r0 = r7.size()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r11 = X.AnonymousClass000.A0y(r0, r5)     // Catch:{ all -> 0x0137 }
            java.util.ArrayList r6 = X.C29351c6.A0E(r7)     // Catch:{ all -> 0x0137 }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ all -> 0x0137 }
        L_0x0109:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x011b
            int r0 = X.C72453Mb.A0H(r5)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0137 }
            r6.add(r0)     // Catch:{ all -> 0x0137 }
            goto L_0x0109
        L_0x011b:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x0137 }
            java.lang.Object[] r13 = r6.toArray(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x0137 }
            java.lang.String r12 = "InteropIntegratorStoreSET_OPTED_IN_INTEGRATORS"
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0137 }
            r3.A00()     // Catch:{ all -> 0x0137 }
            r3.close()     // Catch:{ all -> 0x013e }
            r2.close()
            X.426 r0 = new X.426
            r0.<init>(r1)
            return r0
        L_0x0137:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0145:
            java.lang.Object r0 = r15.A01
            X.5aa r0 = (X.C107785aa) r0
            long r1 = r0.BOr()
            X.425 r0 = new X.425
            r0.<init>(r1)
            return r0
        L_0x0153:
            X.427 r0 = X.AnonymousClass427.A00
            return r0
        L_0x0156:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IntegratorManager$optInIntegrators$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}

package com.whatsapp.interop.integrator;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C34651kr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2", f = "IntegratorManager.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class IntegratorManager$refreshIntegrators$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C34651kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegratorManager$refreshIntegrators$2(C34651kr r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new IntegratorManager$refreshIntegrators$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new IntegratorManager$refreshIntegrators$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0199, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r2 = 1
            if (r0 == 0) goto L_0x00ab
            if (r0 != r2) goto L_0x0203
            X.C30691eM.A01(r14)
        L_0x000c:
            X.B6J r14 = (X.B6J) r14
            boolean r0 = r14 instanceof X.AnonymousClass9FS
            if (r0 == 0) goto L_0x01d9
            X.9FS r14 = (X.AnonymousClass9FS) r14
            java.util.List r0 = r14.A00
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x001e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r1 = r5.next()
            X.49z r1 = (X.C827649z) r1
            long r2 = r1.A00
            int r11 = (int) r2
            java.lang.String r9 = r1.A03
            java.lang.String r3 = r1.A05
            int r2 = r3.hashCode()
            r0 = -1422950650(0xffffffffab2f7f06, float:-6.234877E-13)
            if (r2 == r0) goto L_0x00a0
            r0 = 21116443(0x142361b, float:3.567099E-38)
            if (r2 == r0) goto L_0x0095
            r0 = 1091836000(0x41141860, float:9.255951)
            if (r2 != r0) goto L_0x00ca
            java.lang.String r0 = "removed"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.Integer r7 = X.AnonymousClass00R.A0C
        L_0x004e:
            java.lang.String r10 = r1.A01
            java.lang.String r0 = r1.A04
            boolean r12 = X.AnonymousClass000.A1W(r0)
            java.lang.String r2 = r1.A02
            if (r2 == 0) goto L_0x0092
            int r1 = r2.hashCode()
            r0 = -265713450(0xfffffffff02988d6, float:-2.0987356E29)
            if (r1 == r0) goto L_0x008a
            r0 = 3582(0xdfe, float:5.02E-42)
            if (r1 == r0) goto L_0x007f
            r0 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r1 != r0) goto L_0x00c3
            java.lang.String r0 = "email"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.Integer r8 = X.AnonymousClass00R.A0C
        L_0x0076:
            X.4ca r6 = new X.4ca
            r6.<init>((java.lang.Integer) r7, (java.lang.Integer) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (boolean) r12)
            r4.add(r6)
            goto L_0x001e
        L_0x007f:
            java.lang.String r0 = "pn"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.Integer r8 = X.AnonymousClass00R.A01
            goto L_0x0076
        L_0x008a:
            java.lang.String r0 = "username"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c3
        L_0x0092:
            java.lang.Integer r8 = X.AnonymousClass00R.A00
            goto L_0x0076
        L_0x0095:
            java.lang.String r0 = "onboarding"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.Integer r7 = X.AnonymousClass00R.A00
            goto L_0x004e
        L_0x00a0:
            java.lang.String r0 = "active"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            goto L_0x004e
        L_0x00ab:
            X.C30691eM.A01(r14)
            X.1kr r0 = r13.this$0
            X.00H r0 = r0.A02
            java.lang.Object r1 = r0.get()
            com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager r1 = (com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager) r1
            r13.label = r2
            r0 = 392(0x188, float:5.5E-43)
            java.lang.Object r14 = r1.A07(r13, r0)
            if (r14 != r3) goto L_0x000c
            return r3
        L_0x00c3:
            java.lang.String r0 = "invalid integrator identifier type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00ca:
            java.lang.String r0 = "invalid integrator status"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00d1:
            X.1kr r0 = r13.this$0
            X.00H r0 = r0.A01
            java.lang.Object r9 = r0.get()
            X.2cM r9 = (X.C53332cM) r9
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r4.iterator()
        L_0x00e3:
            boolean r0 = r3.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4ca r0 = (X.C89514ca) r0
            java.util.Map r1 = r9.A01
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.containsKey(r0)
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x00e3
            r8.add(r2)
            goto L_0x00e3
        L_0x0104:
            X.1Cd r0 = r9.A00     // Catch:{ SQLException -> 0x01a5 }
            X.1au r5 = r0.A05()     // Catch:{ SQLException -> 0x01a5 }
            X.1xA r7 = r5.BD0()     // Catch:{ all -> 0x019e }
            java.util.Iterator r11 = r8.iterator()     // Catch:{ all -> 0x0197 }
        L_0x0112:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0197 }
            if (r0 == 0) goto L_0x0183
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x0197 }
            X.4ca r2 = (X.C89514ca) r2     // Catch:{ all -> 0x0197 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0197 }
            r10.<init>()     // Catch:{ all -> 0x0197 }
            int r0 = r2.A00     // Catch:{ all -> 0x0197 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "integrator_id"
            r10.put(r0, r1)     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0197 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0197 }
            java.lang.Integer r0 = r2.A02     // Catch:{ all -> 0x0197 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0197 }
            switch(r0) {
                case 0: goto L_0x0140;
                case 1: goto L_0x0142;
                default: goto L_0x013e;
            }     // Catch:{ all -> 0x0197 }
        L_0x013e:
            r0 = 2
            goto L_0x0143
        L_0x0140:
            r0 = 0
            goto L_0x0143
        L_0x0142:
            r0 = 1
        L_0x0143:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "status"
            r10.put(r0, r1)     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "icon_path"
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x0197 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0197 }
            boolean r0 = r2.A05     // Catch:{ all -> 0x0197 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "opt_in_status"
            r10.put(r0, r1)     // Catch:{ all -> 0x0197 }
            java.lang.Integer r0 = r2.A01     // Catch:{ all -> 0x0197 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0197 }
            switch(r0) {
                case 0: goto L_0x0169;
                case 1: goto L_0x016b;
                default: goto L_0x0167;
            }     // Catch:{ all -> 0x0197 }
        L_0x0167:
            r0 = 2
            goto L_0x016c
        L_0x0169:
            r0 = 0
            goto L_0x016c
        L_0x016b:
            r0 = 1
        L_0x016c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r0 = "identifier_type"
            r10.put(r0, r1)     // Catch:{ all -> 0x0197 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0197 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0197 }
            r2 = 5
            java.lang.String r1 = "InteropIntegratorStoreINSERT_INTEGRATOR_INFO"
            java.lang.String r0 = "integrator_display_name"
            r3.A09(r0, r1, r10, r2)     // Catch:{ all -> 0x0197 }
            goto L_0x0112
        L_0x0183:
            r7.A00()     // Catch:{ all -> 0x0197 }
            r1 = 34
            X.3Bx r0 = new X.3Bx     // Catch:{ all -> 0x0197 }
            r0.<init>(r8, r9, r1)     // Catch:{ all -> 0x0197 }
            r5.BJ7(r0)     // Catch:{ all -> 0x0197 }
            r7.close()     // Catch:{ all -> 0x019e }
            r5.close()     // Catch:{ SQLException -> 0x01a5 }
            goto L_0x01ab
        L_0x0197:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x019e }
            throw r0     // Catch:{ all -> 0x019e }
        L_0x019e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ SQLException -> 0x01a5 }
            throw r0     // Catch:{ SQLException -> 0x01a5 }
        L_0x01a5:
            r1 = move-exception
            java.lang.String r0 = "InteropIntegratorStore/insertNameForIntegratorIds"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01ab:
            X.1kr r0 = r13.this$0
            X.00H r0 = r0.A03
            X.1jg r5 = X.AnonymousClass3MX.A0k(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r4.iterator()
        L_0x01bb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4ca r0 = (X.C89514ca) r0
            boolean r0 = r0.A05
            if (r0 != r6) goto L_0x01bb
            r3.add(r1)
            goto L_0x01bb
        L_0x01d0:
            r5.A02(r3)
            X.423 r0 = new X.423
            r0.<init>(r4)
            return r0
        L_0x01d9:
            boolean r0 = r14 instanceof X.AnonymousClass9FR
            if (r0 == 0) goto L_0x01f4
            X.9FR r14 = (X.AnonymousClass9FR) r14
            X.5aX r0 = r14.A00
            long r2 = r0.BOr()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "IntegratorManager/refreshIntegrators/server error; code="
            X.C17900vP.A0l(r0, r1, r2)
            X.422 r0 = new X.422
            r0.<init>(r2)
            return r0
        L_0x01f4:
            if (r14 != 0) goto L_0x01fe
            java.lang.String r0 = "IntegratorManager/refreshIntegrators/delivery failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.424 r0 = X.AnonymousClass424.A00
            return r0
        L_0x01fe:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0203:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

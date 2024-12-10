package com.whatsapp.interopui.compose;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1", f = "InteropComposeSelectIntegratorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ InteropComposeSelectIntegratorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(InteropComposeSelectIntegratorViewModel interopComposeSelectIntegratorViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopComposeSelectIntegratorViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r9 = r20
            int r0 = r9.label
            if (r0 != 0) goto L_0x00af
            X.C30691eM.A01(r21)
            com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel r8 = r9.this$0
            X.00H r0 = r8.A03
            java.lang.Object r0 = r0.get()
            X.1kr r0 = (X.C34651kr) r0
            X.00H r0 = r0.A01
            java.lang.Object r7 = r0.get()
            X.2cM r7 = (X.C53332cM) r7
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.1Cd r0 = r7.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a8 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "SELECT integrator_id, display_name, status, icon_path, identifier_type FROM integrator_display_name WHERE opt_in_status > 0"
            java.lang.String r1 = "InteropIntegratorStoreGET_OPTED_IN_INTEGRATORS"
            r0 = 0
            android.database.Cursor r4 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "integrator_id"
            int r3 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "display_name"
            int r2 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "status"
            int r1 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "icon_path"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r10 = "identifier_type"
            int r10 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x00a1 }
        L_0x0051:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x00a1 }
            if (r11 == 0) goto L_0x008d
            if (r3 < 0) goto L_0x0051
            if (r2 < 0) goto L_0x0051
            if (r1 < 0) goto L_0x0051
            if (r0 < 0) goto L_0x0051
            int r16 = r4.getInt(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.String r14 = r4.getString(r2)     // Catch:{ all -> 0x00a1 }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x00a1 }
            int r17 = r4.getInt(r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r15 = r4.getString(r0)     // Catch:{ all -> 0x00a1 }
            X.C18070vi.A0X(r15)     // Catch:{ all -> 0x00a1 }
            int r18 = r4.getInt(r10)     // Catch:{ all -> 0x00a1 }
            r19 = 1
            X.4ca r13 = new X.4ca     // Catch:{ all -> 0x00a1 }
            r13.<init>((java.lang.String) r14, (java.lang.String) r15, (int) r16, (int) r17, (int) r18, (boolean) r19)     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00a1 }
            java.util.Map r11 = r7.A01     // Catch:{ all -> 0x00a1 }
            r11.put(r12, r13)     // Catch:{ all -> 0x00a1 }
            r6.add(r13)     // Catch:{ all -> 0x00a1 }
            goto L_0x0051
        L_0x008d:
            r4.close()     // Catch:{ all -> 0x00a8 }
            r5.close()
            r8.A00 = r6
            com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel r0 = r9.this$0
            X.1DT r1 = r0.A02
            java.lang.String r0 = ""
            r1.A0E(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00a8 }
            throw r0     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

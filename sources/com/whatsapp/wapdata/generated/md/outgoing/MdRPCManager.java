package com.whatsapp.wapdata.generated.md.outgoing;

import X.AnonymousClass00H;
import X.C18070vi;

public final class MdRPCManager {
    public final AnonymousClass00H A00;

    public MdRPCManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r6, X.C30391dr r7, byte[] r8, int r9) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.AnonymousClass3FD
            if (r0 == 0) goto L_0x0031
            r4 = r7
            X.3FD r4 = (X.AnonymousClass3FD) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x0037
            X.C30691eM.A01(r3)
        L_0x0020:
            X.9xb r3 = (X.C197989xb) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x0025:
            X.C30691eM.A01(r3)
            r4.label = r0
            java.lang.Object r3 = r5.A01(r6, r4, r8, r9)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0031:
            X.3FD r4 = new X.3FD
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x0037:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.md.outgoing.MdRPCManager.A00(java.lang.String, X.1dr, byte[], int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r9, X.C30391dr r10, byte[] r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.AnonymousClass3FM
            if (r0 == 0) goto L_0x0052
            r7 = r10
            X.3FM r7 = (X.AnonymousClass3FM) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x00ae
            java.lang.Object r4 = r7.L$0
            X.9F7 r4 = (X.AnonymousClass9F7) r4
            X.C30691eM.A01(r6)
        L_0x0024:
            X.1ca r6 = (X.C29621ca) r6
            if (r6 != 0) goto L_0x0058
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r1)
            return r0
        L_0x002f:
            X.C30691eM.A01(r6)
            X.00H r0 = r8.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            java.lang.String r1 = r2.A01()
            X.9F7 r4 = new X.9F7
            r4.<init>((java.lang.String) r1, (byte[]) r11, (java.lang.String) r9)
            java.lang.Object r0 = r4.A00
            X.1ca r0 = (X.C29621ca) r0
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r6 = r2.A00(r0, r1, r7, r12)
            if (r6 != r5) goto L_0x0024
            return r5
        L_0x0052:
            X.3FM r7 = new X.3FM
            r7.<init>(r8, r10)
            goto L_0x0012
        L_0x0058:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.9FV r1 = new X.9FV     // Catch:{ 1UI -> 0x0069 }
            r1.<init>(r6, r4)     // Catch:{ 1UI -> 0x0069 }
            r0 = 0
            X.9xb r5 = new X.9xb     // Catch:{ 1UI -> 0x0069 }
            r5.<init>(r1, r0)     // Catch:{ 1UI -> 0x0069 }
            return r5
        L_0x0069:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SetPrimaryEphemeralIdentityResponseSuccess: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.add(r0)
            X.9FW r1 = new X.9FW     // Catch:{ 1UI -> 0x008e }
            r1.<init>(r6, r4)     // Catch:{ 1UI -> 0x008e }
            r0 = 0
            X.9xb r5 = new X.9xb     // Catch:{ 1UI -> 0x008e }
            r5.<init>(r1, r0)     // Catch:{ 1UI -> 0x008e }
            return r5
        L_0x008e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SetPrimaryEphemeralIdentityResponseError: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.add(r0)
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r3)
            return r0
        L_0x00ae:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.md.outgoing.MdRPCManager.A01(java.lang.String, X.1dr, byte[], int):java.lang.Object");
    }
}

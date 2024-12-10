package com.whatsapp.wapdata.generated.dmainterop.outgoing;

import X.AnonymousClass00H;
import X.C18070vi;
import X.C197989xb;
import java.util.List;

public final class DmaInteropRPCManager {
    public final AnonymousClass00H A00;

    public DmaInteropRPCManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static C197989xb A00(Object obj) {
        return new C197989xb(obj, (List) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r6, java.util.List r7, X.C30391dr r8, int r9) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C21638AnT
            if (r0 == 0) goto L_0x0031
            r4 = r8
            X.AnT r4 = (X.C21638AnT) r4
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
            java.lang.Object r3 = r5.A02(r6, r7, r4, r9)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0031:
            X.AnT r4 = new X.AnT
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A01(java.lang.String, java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r9, java.util.List r10, X.C30391dr r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C21674Ao3
            if (r0 == 0) goto L_0x0055
            r6 = r11
            X.Ao3 r6 = (X.C21674Ao3) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r4) goto L_0x0090
            java.lang.Object r3 = r6.L$0
            X.9F5 r3 = (X.AnonymousClass9F5) r3
            X.C30691eM.A01(r5)
        L_0x0024:
            X.1ca r5 = (X.C29621ca) r5
            if (r5 != 0) goto L_0x005b
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r1)
            return r0
        L_0x002f:
            X.C30691eM.A01(r5)
            X.00H r0 = r8.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            X.00H r0 = r2.A00
            java.lang.String r1 = X.C17890vO.A0T(r0)
            r0 = 3
            X.9F5 r3 = new X.9F5
            r3.<init>(r1, r9, r10, r0)
            X.1ca r0 = r3.BVP()
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r5 = r2.A00(r0, r1, r6, r12)
            if (r5 != r7) goto L_0x0024
            return r7
        L_0x0055:
            X.Ao3 r6 = new X.Ao3
            r6.<init>(r8, r11)
            goto L_0x0012
        L_0x005b:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r1 = 2
            X.9FQ r0 = new X.9FQ     // Catch:{ 1UI -> 0x006a }
            r0.<init>((X.C29621ca) r5, (X.AnonymousClass9F5) r3, (int) r1)     // Catch:{ 1UI -> 0x006a }
            X.9xb r7 = A00(r0)     // Catch:{ 1UI -> 0x006a }
            return r7
        L_0x006a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SetReachabilitySettingsResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r4)
            r1 = 0
            X.9FP r0 = new X.9FP     // Catch:{ 1UI -> 0x007f }
            r0.<init>((X.C29621ca) r5, (X.AnonymousClass9F5) r3, (int) r1)     // Catch:{ 1UI -> 0x007f }
            X.9xb r7 = A00(r0)     // Catch:{ 1UI -> 0x007f }
            return r7
        L_0x007f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SetReachabilitySettingsResponseError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r4)
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r4)
            return r0
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A02(java.lang.String, java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.util.List r6, X.C30391dr r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C21635AnQ
            if (r0 == 0) goto L_0x0031
            r4 = r7
            X.AnQ r4 = (X.C21635AnQ) r4
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
            java.lang.Object r3 = r5.A04(r6, r4, r8)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0031:
            X.AnQ r4 = new X.AnQ
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A03(java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.util.List r9, X.C30391dr r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C21671Ao0
            if (r0 == 0) goto L_0x0056
            r7 = r10
            X.Ao0 r7 = (X.C21671Ao0) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x0091
            java.lang.Object r4 = r7.L$0
            X.9F6 r4 = (X.AnonymousClass9F6) r4
            X.C30691eM.A01(r6)
        L_0x0024:
            X.1ca r6 = (X.C29621ca) r6
            if (r6 != 0) goto L_0x005c
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r1)
            return r0
        L_0x002f:
            X.C30691eM.A01(r6)
            X.00H r0 = r8.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            X.00H r0 = r2.A00
            java.lang.String r1 = X.C17890vO.A0T(r0)
            r0 = 20
            X.9F6 r4 = new X.9F6
            r4.<init>((java.util.List) r9, (int) r0, (java.lang.String) r1)
            java.lang.Object r0 = r4.A00
            X.1ca r0 = (X.C29621ca) r0
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r6 = r2.A00(r0, r1, r7, r11)
            if (r6 != r5) goto L_0x0024
            return r5
        L_0x0056:
            X.Ao0 r7 = new X.Ao0
            r7.<init>(r8, r10)
            goto L_0x0012
        L_0x005c:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r1 = 1
            X.9FD r0 = new X.9FD     // Catch:{ 1UI -> 0x006b }
            r0.<init>(r6, r4, r1)     // Catch:{ 1UI -> 0x006b }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x006b }
            return r5
        L_0x006b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FetchUsersResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9FD r0 = new X.9FD     // Catch:{ 1UI -> 0x0080 }
            r0.<init>(r6, r4, r1)     // Catch:{ 1UI -> 0x0080 }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x0080 }
            return r5
        L_0x0080:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FetchUsersResponseRequestError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r3)
            return r0
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A04(java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.util.List r6, X.C30391dr r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C21637AnS
            if (r0 == 0) goto L_0x0031
            r4 = r7
            X.AnS r4 = (X.C21637AnS) r4
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
            java.lang.Object r3 = r5.A06(r6, r4, r8)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0031:
            X.AnS r4 = new X.AnS
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A05(java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.util.List r9, X.C30391dr r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C21673Ao2
            if (r0 == 0) goto L_0x0056
            r7 = r10
            X.Ao2 r7 = (X.C21673Ao2) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x0091
            java.lang.Object r4 = r7.L$0
            X.9F6 r4 = (X.AnonymousClass9F6) r4
            X.C30691eM.A01(r6)
        L_0x0024:
            X.1ca r6 = (X.C29621ca) r6
            if (r6 != 0) goto L_0x005c
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r1)
            return r0
        L_0x002f:
            X.C30691eM.A01(r6)
            X.00H r0 = r8.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            X.00H r0 = r2.A00
            java.lang.String r1 = X.C17890vO.A0T(r0)
            r0 = 22
            X.9F6 r4 = new X.9F6
            r4.<init>((java.util.List) r9, (int) r0, (java.lang.String) r1)
            java.lang.Object r0 = r4.A00
            X.1ca r0 = (X.C29621ca) r0
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r6 = r2.A00(r0, r1, r7, r11)
            if (r6 != r5) goto L_0x0024
            return r5
        L_0x0056:
            X.Ao2 r7 = new X.Ao2
            r7.<init>(r8, r10)
            goto L_0x0012
        L_0x005c:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r1 = 1
            X.9FE r0 = new X.9FE     // Catch:{ 1UI -> 0x006b }
            r0.<init>(r6, r4, r1)     // Catch:{ 1UI -> 0x006b }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x006b }
            return r5
        L_0x006b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SetOptInIntegratorsResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9FE r0 = new X.9FE     // Catch:{ 1UI -> 0x0080 }
            r0.<init>(r6, r4, r1)     // Catch:{ 1UI -> 0x0080 }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x0080 }
            return r5
        L_0x0080:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SetOptInIntegratorsResponseRequestError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r3)
            return r0
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A06(java.util.List, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.C30391dr r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C21634AnP
            if (r0 == 0) goto L_0x0031
            r4 = r6
            X.AnP r4 = (X.C21634AnP) r4
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
            java.lang.Object r3 = r5.A08(r4, r7)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0031:
            X.AnP r4 = new X.AnP
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A07(X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C30391dr r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21670Anz
            if (r0 == 0) goto L_0x0056
            r7 = r9
            X.Anz r7 = (X.C21670Anz) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x008f
            java.lang.Object r4 = r7.L$0
            X.9F6 r4 = (X.AnonymousClass9F6) r4
            X.C30691eM.A01(r6)
        L_0x0024:
            X.1ca r6 = (X.C29621ca) r6
            if (r6 != 0) goto L_0x005c
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r1)
            return r0
        L_0x002f:
            X.C30691eM.A01(r6)
            X.00H r0 = r8.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            X.00H r0 = r2.A00
            java.lang.String r1 = X.C17890vO.A0T(r0)
            r0 = 19
            X.9F6 r4 = new X.9F6
            r4.<init>((java.lang.String) r1, (int) r0)
            java.lang.Object r0 = r4.A00
            X.1ca r0 = (X.C29621ca) r0
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r6 = r2.A00(r0, r1, r7, r10)
            if (r6 != r5) goto L_0x0024
            return r5
        L_0x0056:
            X.Anz r7 = new X.Anz
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x005c:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.9FS r0 = new X.9FS     // Catch:{ 1UI -> 0x006a }
            r0.<init>(r6, r4)     // Catch:{ 1UI -> 0x006a }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x006a }
            return r5
        L_0x006a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FetchResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            X.9FR r0 = new X.9FR     // Catch:{ 1UI -> 0x007e }
            r0.<init>(r6, r4)     // Catch:{ 1UI -> 0x007e }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x007e }
            return r5
        L_0x007e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FetchResponseRequestError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r3)
            return r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A08(X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C30391dr r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C21636AnR
            if (r0 == 0) goto L_0x0031
            r4 = r6
            X.AnR r4 = (X.C21636AnR) r4
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
            java.lang.Object r3 = r5.A0A(r4, r7)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0031:
            X.AnR r4 = new X.AnR
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A09(X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.C30391dr r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C21672Ao1
            if (r0 == 0) goto L_0x0056
            r7 = r9
            X.Ao1 r7 = (X.C21672Ao1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x008f
            java.lang.Object r4 = r7.L$0
            X.9F6 r4 = (X.AnonymousClass9F6) r4
            X.C30691eM.A01(r6)
        L_0x0024:
            X.1ca r6 = (X.C29621ca) r6
            if (r6 != 0) goto L_0x005c
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r1)
            return r0
        L_0x002f:
            X.C30691eM.A01(r6)
            X.00H r0 = r8.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            X.00H r0 = r2.A00
            java.lang.String r1 = X.C17890vO.A0T(r0)
            r0 = 21
            X.9F6 r4 = new X.9F6
            r4.<init>((java.lang.String) r1, (int) r0)
            java.lang.Object r0 = r4.A00
            X.1ca r0 = (X.C29621ca) r0
            r7.L$0 = r4
            r7.label = r3
            java.lang.Object r6 = r2.A00(r0, r1, r7, r10)
            if (r6 != r5) goto L_0x0024
            return r5
        L_0x0056:
            X.Ao1 r7 = new X.Ao1
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x005c:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.9FU r0 = new X.9FU     // Catch:{ 1UI -> 0x006a }
            r0.<init>(r6, r4)     // Catch:{ 1UI -> 0x006a }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x006a }
            return r5
        L_0x006a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetReachabilitySettingsResponseSuccess: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            X.9FT r0 = new X.9FT     // Catch:{ 1UI -> 0x007e }
            r0.<init>(r6, r4)     // Catch:{ 1UI -> 0x007e }
            X.9xb r5 = A00(r0)     // Catch:{ 1UI -> 0x007e }
            return r5
        L_0x007e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetReachabilitySettingsResponseError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
            r1 = 0
            X.9xb r0 = new X.9xb
            r0.<init>(r1, r3)
            return r0
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.dmainterop.outgoing.DmaInteropRPCManager.A0A(X.1dr, int):java.lang.Object");
    }
}

package com.whatsapp.wapdata.generated.profilepicture.outgoing;

import X.AnonymousClass00H;
import X.C18070vi;

public final class ProfilePictureRPCManager {
    public final AnonymousClass00H A00;

    public ProfilePictureRPCManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.whatsapp.jid.Jid r10, java.lang.String r11, X.C30391dr r12, int r13) {
        /*
            r9 = this;
            r3 = 0
            boolean r0 = r12 instanceof X.C21675Ao4
            if (r0 == 0) goto L_0x0054
            r8 = r12
            X.Ao4 r8 = (X.C21675Ao4) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r8.label = r2
        L_0x0013:
            java.lang.Object r6 = r8.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r5 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r5) goto L_0x00d1
            java.lang.Object r4 = r8.L$0
            X.9F5 r4 = (X.AnonymousClass9F5) r4
            X.C30691eM.A01(r6)
        L_0x0025:
            X.1ca r6 = (X.C29621ca) r6
            if (r6 != 0) goto L_0x005a
            X.9xb r7 = new X.9xb
            r7.<init>(r3, r3)
            return r7
        L_0x002f:
            X.C30691eM.A01(r6)
            X.00H r0 = r9.A00
            java.lang.Object r2 = r0.get()
            com.whatsapp.messaging.MessageClientSmaxWrapper r2 = (com.whatsapp.messaging.MessageClientSmaxWrapper) r2
            X.00H r0 = r2.A00
            java.lang.String r1 = X.C17890vO.A0T(r0)
            X.9F5 r4 = new X.9F5
            r4.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r1, (java.lang.String) r11)
            X.1ca r0 = r4.BVP()
            r8.L$0 = r4
            r8.label = r5
            java.lang.Object r6 = r2.A00(r0, r1, r8, r13)
            if (r6 != r7) goto L_0x0025
            return r7
        L_0x0054:
            X.Ao4 r8 = new X.Ao4
            r8.<init>(r9, r12)
            goto L_0x0013
        L_0x005a:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.9FC r0 = new X.9FC     // Catch:{ 1UI -> 0x0069 }
            r0.<init>(r6, r4)     // Catch:{ 1UI -> 0x0069 }
            X.9xb r7 = new X.9xb     // Catch:{ 1UI -> 0x0069 }
            r7.<init>(r0, r3)     // Catch:{ 1UI -> 0x0069 }
            return r7
        L_0x0069:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetResponseSuccessPictureURL: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r5)
            r1 = 7
            X.9FP r0 = new X.9FP     // Catch:{ 1UI -> 0x007f }
            r0.<init>((X.C29621ca) r6, (X.AnonymousClass9F5) r4, (int) r1)     // Catch:{ 1UI -> 0x007f }
            X.9xb r7 = new X.9xb     // Catch:{ 1UI -> 0x007f }
            r7.<init>(r0, r3)     // Catch:{ 1UI -> 0x007f }
            return r7
        L_0x007f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetResponseSuccessAvatarURLs: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r5)
            X.9FH r0 = new X.9FH     // Catch:{ 1UI -> 0x0094 }
            r0.<init>(r6, r4)     // Catch:{ 1UI -> 0x0094 }
            X.9xb r7 = new X.9xb     // Catch:{ 1UI -> 0x0094 }
            r7.<init>(r0, r3)     // Catch:{ 1UI -> 0x0094 }
            return r7
        L_0x0094:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetResponseSuccessPictureBlob: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r5)
            r1 = 11
            X.9FQ r0 = new X.9FQ     // Catch:{ 1UI -> 0x00ab }
            r0.<init>((X.C29621ca) r6, (X.AnonymousClass9F5) r4, (int) r1)     // Catch:{ 1UI -> 0x00ab }
            X.9xb r7 = new X.9xb     // Catch:{ 1UI -> 0x00ab }
            r7.<init>(r0, r3)     // Catch:{ 1UI -> 0x00ab }
            return r7
        L_0x00ab:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetResponseSuccessNoData: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r5)
            r1 = 6
            X.9FP r0 = new X.9FP     // Catch:{ 1UI -> 0x00c1 }
            r0.<init>((X.C29621ca) r6, (X.AnonymousClass9F5) r4, (int) r1)     // Catch:{ 1UI -> 0x00c1 }
            X.9xb r7 = new X.9xb     // Catch:{ 1UI -> 0x00c1 }
            r7.<init>(r0, r3)     // Catch:{ 1UI -> 0x00c1 }
            return r7
        L_0x00c1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetResponseError: "
            X.AnonymousClass8BY.A1I(r0, r1, r2, r5)
            X.9xb r0 = new X.9xb
            r0.<init>(r3, r5)
            return r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wapdata.generated.profilepicture.outgoing.ProfilePictureRPCManager.A00(com.whatsapp.jid.Jid, java.lang.String, X.1dr, int):java.lang.Object");
    }
}

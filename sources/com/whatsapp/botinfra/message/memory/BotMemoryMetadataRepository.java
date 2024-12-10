package com.whatsapp.botinfra.message.memory;

import X.AnonymousClass00H;
import X.AnonymousClass1OX;
import X.C18070vi;
import X.C18600wl;

public final class BotMemoryMetadataRepository {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;
    public final AnonymousClass1OX A05;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r6, X.C30391dr r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.AnonymousClass7TI
            if (r0 == 0) goto L_0x0036
            r4 = r7
            X.7TI r4 = (X.AnonymousClass7TI) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0022
            if (r0 != r1) goto L_0x003c
            java.lang.Object r0 = X.C108955ca.A0n(r3)
        L_0x0021:
            return r0
        L_0x0022:
            X.C30691eM.A01(r3)
            X.00H r0 = r5.A00
            java.lang.Object r0 = r0.get()
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore r0 = (com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore) r0
            r4.label = r1
            java.lang.Object r0 = r0.A01(r6, r4)
            if (r0 != r2) goto L_0x0021
            return r2
        L_0x0036:
            X.7TI r4 = new X.7TI
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository.A00(java.lang.String, X.1dr):java.lang.Object");
    }

    public BotMemoryMetadataRepository(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, C18600wl r6, AnonymousClass1OX r7) {
        C18070vi.A0w(r2, r7, r6, r3, r4);
        C18070vi.A0d(r5, 6);
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }
}

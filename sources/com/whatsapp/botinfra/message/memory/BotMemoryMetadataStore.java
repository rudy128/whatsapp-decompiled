package com.whatsapp.botinfra.message.memory;

import X.AnonymousClass00H;
import X.C18070vi;
import X.C18600wl;

public final class BotMemoryMetadataStore {
    public final AnonymousClass00H A00;
    public final C18600wl A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C20951Ac5 r13, java.lang.String r14, X.C30391dr r15, long r16) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.AnonymousClass7TK
            r7 = r12
            if (r0 == 0) goto L_0x003e
            r4 = r15
            X.7TK r4 = (X.AnonymousClass7TK) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r1) goto L_0x0044
            X.C30691eM.A01(r3)
        L_0x0021:
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0026:
            X.C30691eM.A01(r3)
            X.0wl r0 = r12.A01
            r9 = 0
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$insertBotMemoryMetadata$2 r5 = new com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$insertBotMemoryMetadata$2
            r6 = r13
            r8 = r14
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            r4.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x003e:
            X.7TK r4 = new X.7TK
            r4.<init>(r12, r15)
            goto L_0x0013
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore.A00(X.Ac5, java.lang.String, X.1dr, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r7, X.C30391dr r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.AnonymousClass7TJ
            if (r0 == 0) goto L_0x0039
            r5 = r8
            X.7TJ r5 = (X.AnonymousClass7TJ) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r3) goto L_0x003f
            X.C30691eM.A01(r1)
        L_0x0020:
            X.1eK r1 = (X.C30671eK) r1
            java.lang.Object r0 = r1.value
            return r0
        L_0x0025:
            X.C30691eM.A01(r1)
            X.0wl r2 = r6.A01
            r1 = 0
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2 r0 = new com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore$getMemoryByMemoryAnnotatedUserMessageKeyId$2
            r0.<init>(r6, r7, r1)
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x0039:
            X.7TJ r5 = new X.7TJ
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore.A01(java.lang.String, X.1dr):java.lang.Object");
    }

    public BotMemoryMetadataStore(AnonymousClass00H r1, C18600wl r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}

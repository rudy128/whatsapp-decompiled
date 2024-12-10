package com.whatsapp.bot.home.sync;

import X.AnonymousClass11P;
import X.AnonymousClass11Z;
import X.AnonymousClass181;
import X.C139536z0;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C24371Kb;
import X.C24421Kg;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class BotPhotoDownloader {
    public final AnonymousClass181 A00;
    public final C139536z0 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass11Z A03;
    public final C18030ve A04;
    public final C24371Kb A05;
    public final C24421Kg A06;
    public final Set A07 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C18600wl A08;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        if (r10 != X.C122616Rb.A03) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C122616Rb r10, com.whatsapp.bot.home.sync.BotPhotoDownloader r11, com.whatsapp.infra.graphql.generated.aihome.AiHomeBot r12, X.C30391dr r13, X.AnonymousClass1G4 r14) {
        /*
            boolean r0 = r13 instanceof X.AnonymousClass7UJ
            if (r0 == 0) goto L_0x00cf
            r4 = r13
            X.7UJ r4 = (X.AnonymousClass7UJ) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cf
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r8 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 3
            r7 = 2
            r2 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 == r6) goto L_0x00b5
            if (r0 == r7) goto L_0x00ab
            if (r0 != r1) goto L_0x00d6
            java.lang.Object r5 = r4.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r11 = r4.L$0
            com.whatsapp.bot.home.sync.BotPhotoDownloader r11 = (com.whatsapp.bot.home.sync.BotPhotoDownloader) r11
            X.C30691eM.A01(r8)
        L_0x002f:
            X.6z0 r6 = r11.A01
            X.C18070vi.A0d(r5, r2)
            X.1OX r4 = r6.A01
            X.0wl r3 = r6.A00
            r1 = 0
            com.whatsapp.bot.home.BotPhotoHelper$deleteOldPictures$1 r0 = new com.whatsapp.bot.home.BotPhotoHelper$deleteOldPictures$1
            r0.<init>(r6, r5, r1)
            X.AnonymousClass3MW.A1X(r3, r0, r4)
        L_0x0041:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0046:
            X.C30691eM.A01(r8)
            r5 = r12
            X.A8k r5 = (X.C20125A8k) r5
            java.lang.String r0 = "id"
            java.lang.String r5 = r5.A0F(r0)
            if (r5 == 0) goto L_0x00e0
            int r0 = r10.ordinal()
            if (r0 == r2) goto L_0x0083
            if (r0 != r6) goto L_0x00db
            X.6Rb r8 = X.C122616Rb.A03
        L_0x005e:
            X.6z0 r9 = r11.A01
            java.io.File r0 = r9.A01(r10, r12)
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.exists()
            if (r0 != r6) goto L_0x0086
            X.6Rb r1 = X.C122616Rb.A02
            r0 = 1
            if (r10 != r1) goto L_0x0072
            r0 = 2
        L_0x0072:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r5, r0)
            r4.label = r6
            java.lang.Object r0 = r14.BJt(r0, r4)
            if (r0 != r3) goto L_0x00b8
            return r3
        L_0x0083:
            X.6Rb r8 = X.C122616Rb.A02
            goto L_0x005e
        L_0x0086:
            java.io.File r0 = r9.A01(r8, r12)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r0.exists()
            if (r0 != r6) goto L_0x00ba
            X.6Rb r1 = X.C122616Rb.A02
            r0 = 1
            if (r8 != r1) goto L_0x0098
            r0 = 2
        L_0x0098:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r5, r0)
            r4.L$0 = r10
            r4.label = r7
            java.lang.Object r0 = r14.BJt(r0, r4)
            if (r0 != r3) goto L_0x00b0
            return r3
        L_0x00ab:
            java.lang.Object r10 = r4.L$0
            X.C30691eM.A01(r8)
        L_0x00b0:
            X.6Rb r0 = X.C122616Rb.A03
            if (r10 != r0) goto L_0x0041
            goto L_0x00b8
        L_0x00b5:
            X.C30691eM.A01(r8)
        L_0x00b8:
            r2 = 1
            goto L_0x0041
        L_0x00ba:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r2)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r5, r0)
            r4.L$0 = r11
            r4.L$1 = r5
            r4.label = r1
            java.lang.Object r0 = r14.BJt(r0, r4)
            if (r0 != r3) goto L_0x002f
            return r3
        L_0x00cf:
            X.7UJ r4 = new X.7UJ
            r4.<init>(r11, r13)
            goto L_0x0012
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00db:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00e0:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.sync.BotPhotoDownloader.A00(X.6Rb, com.whatsapp.bot.home.sync.BotPhotoDownloader, com.whatsapp.infra.graphql.generated.aihome.AiHomeBot, X.1dr, X.1G4):java.lang.Object");
    }

    public BotPhotoDownloader(AnonymousClass181 r2, C139536z0 r3, AnonymousClass11P r4, AnonymousClass11Z r5, C18030ve r6, C24371Kb r7, C24421Kg r8, C18600wl r9) {
        C18070vi.A0w(r4, r6, r2, r5, r8);
        C18070vi.A0q(r3, r7, r9);
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = r8;
        this.A01 = r3;
        this.A05 = r7;
        this.A08 = r9;
    }
}

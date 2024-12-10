package com.whatsapp.bot.creation.service;

import X.AnonymousClass11P;
import X.AnonymousClass11Z;
import X.AnonymousClass181;
import X.C108965cb;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C24371Kb;
import X.C24421Kg;
import android.content.Context;

public final class AiCreationPhotoLoader {
    public final Context A00;
    public final AnonymousClass181 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass11Z A03;
    public final C18030ve A04;
    public final C24371Kb A05;
    public final C24421Kg A06;
    public final C18600wl A07;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.bot.creation.service.AiCreationPhotoLoader r7, java.lang.String r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.AnonymousClass7TE
            if (r0 == 0) goto L_0x004e
            r6 = r9
            X.7TE r6 = (X.AnonymousClass7TE) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r4) goto L_0x0054
            X.C30691eM.A01(r1)
        L_0x0020:
            byte[] r1 = (byte[]) r1
            X.C18070vi.A0b(r1)
            X.83T r0 = X.AnonymousClass83T.A00
            java.lang.String r2 = X.C200410p.A0J(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ai_creation_photo_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            return r0
        L_0x0036:
            X.C30691eM.A01(r1)
            java.security.MessageDigest r3 = X.C108945cZ.A1I()
            X.0wl r2 = r7.A07
            r1 = 0
            com.whatsapp.bot.creation.service.AiCreationPhotoLoader$generateFileName$hashedByteArray$1 r0 = new com.whatsapp.bot.creation.service.AiCreationPhotoLoader$generateFileName$hashedByteArray$1
            r0.<init>(r8, r3, r1)
            r6.label = r4
            java.lang.Object r1 = X.C30451dy.A00(r6, r2, r0)
            if (r1 != r5) goto L_0x0020
            return r5
        L_0x004e:
            X.7TE r6 = new X.7TE
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.service.AiCreationPhotoLoader.A00(com.whatsapp.bot.creation.service.AiCreationPhotoLoader, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r18, X.C30391dr r19) {
        /*
            r17 = this;
            r6 = r19
            r2 = r18
            boolean r0 = r6 instanceof X.C147717Uf
            r1 = r17
            if (r0 == 0) goto L_0x00ba
            r5 = r6
            X.7Uf r5 = (X.C147717Uf) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x00ba
            int r4 = r4 - r3
            r5.label = r4
        L_0x0018:
            java.lang.Object r10 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r7 = r5.label
            r0 = 3
            r9 = 2
            r6 = 1
            r3 = 0
            if (r7 == 0) goto L_0x002e
            if (r7 == r6) goto L_0x003e
            if (r7 == r9) goto L_0x0075
            if (r7 != r0) goto L_0x00c1
            X.C30691eM.A01(r10)
        L_0x002d:
            return r10
        L_0x002e:
            X.C30691eM.A01(r10)
            r5.L$0 = r1
            r5.L$1 = r2
            r5.label = r6
            java.lang.Object r10 = A00(r1, r2, r5)
            if (r10 != r4) goto L_0x0049
            return r4
        L_0x003e:
            java.lang.Object r2 = r5.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.L$0
            com.whatsapp.bot.creation.service.AiCreationPhotoLoader r1 = (com.whatsapp.bot.creation.service.AiCreationPhotoLoader) r1
            X.C30691eM.A01(r10)
        L_0x0049:
            java.lang.String r10 = (java.lang.String) r10
            android.content.Context r6 = r1.A00
            java.io.File r8 = r6.getCacheDir()
            java.lang.StringBuilder r7 = X.AnonymousClass000.A11(r10)
            java.lang.String r6 = ".jpg"
            java.lang.String r6 = X.AnonymousClass000.A0y(r6, r7)
            java.io.File r14 = X.C17880vN.A0e(r8, r6)
            X.0wl r7 = r1.A07
            com.whatsapp.bot.creation.service.AiCreationPhotoLoader$loadPhoto$cachedDrawable$1 r6 = new com.whatsapp.bot.creation.service.AiCreationPhotoLoader$loadPhoto$cachedDrawable$1
            r6.<init>(r14, r3)
            r5.L$0 = r1
            r5.L$1 = r2
            r5.L$2 = r14
            r5.label = r9
            java.lang.Object r10 = X.C30451dy.A00(r5, r7, r6)
            if (r10 != r4) goto L_0x0084
            return r4
        L_0x0075:
            java.lang.Object r14 = r5.L$2
            java.io.File r14 = (java.io.File) r14
            java.lang.Object r2 = r5.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r5.L$0
            com.whatsapp.bot.creation.service.AiCreationPhotoLoader r1 = (com.whatsapp.bot.creation.service.AiCreationPhotoLoader) r1
            X.C30691eM.A01(r10)
        L_0x0084:
            if (r10 != 0) goto L_0x002d
            r14.getPath()
            X.11P r8 = r1.A02
            X.0ve r10 = r1.A04
            X.181 r7 = r1.A01
            X.11Z r9 = r1.A03
            X.1Kg r13 = r1.A06
            X.1Kb r11 = r1.A05
            java.lang.String r16 = "image/jpg"
            X.1So r12 = X.C26551So.A0E
            X.68i r6 = new X.68i
            r15 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.0wl r2 = r1.A07
            X.7sH r1 = new X.7sH
            r1.<init>(r6, r14)
            r5.L$0 = r3
            r5.L$1 = r3
            r5.L$2 = r3
            r5.label = r0
            X.7bQ r0 = new X.7bQ
            r0.<init>(r3, r1)
            java.lang.Object r10 = X.C30451dy.A00(r5, r2, r0)
            if (r10 != r4) goto L_0x002d
            return r4
        L_0x00ba:
            X.7Uf r5 = new X.7Uf
            r5.<init>(r1, r6)
            goto L_0x0018
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.service.AiCreationPhotoLoader.A01(java.lang.String, X.1dr):java.lang.Object");
    }

    public AiCreationPhotoLoader(Context context, AnonymousClass181 r3, AnonymousClass11P r4, AnonymousClass11Z r5, C18030ve r6, C24371Kb r7, C24421Kg r8, C18600wl r9) {
        C18070vi.A0w(r4, r6, r3, r5, r8);
        C108965cb.A1P(r7, 7, r9);
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A06 = r8;
        this.A00 = context;
        this.A05 = r7;
        this.A07 = r9;
    }
}

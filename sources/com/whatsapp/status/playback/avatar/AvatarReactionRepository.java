package com.whatsapp.status.playback.avatar;

import X.AnonymousClass00H;
import X.AnonymousClass1OX;
import X.AnonymousClass3MX;
import X.AnonymousClass6GR;
import X.AnonymousClass6GS;
import X.AnonymousClass71H;
import X.C108995ce;
import X.C133416oi;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public final class AvatarReactionRepository {
    public static final List A0C;
    public static final List A0D;
    public static final List A0E;
    public File A00;
    public List A01 = A0E;
    public final AnonymousClass71H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;
    public final C18600wl A08;
    public final AnonymousClass1OX A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    static {
        AnonymousClass6GS[] r1 = new AnonymousClass6GS[6];
        AnonymousClass6GS r0 = AnonymousClass6GS.A00;
        r1[0] = r0;
        r1[1] = r0;
        r1[2] = r0;
        r1[3] = r0;
        r1[4] = r0;
        A0E = C18070vi.A0O(r0, r1, 5);
        String[] strArr = new String[6];
        strArr[0] = "770347478";
        strArr[1] = "8952361871444313";
        strArr[2] = "5336107443145802";
        strArr[3] = "4706129709419993";
        strArr[4] = "1747509846";
        A0D = C18070vi.A0O("5694722353875618", strArr, 5);
        String[] strArr2 = new String[6];
        strArr2[0] = "8724517617588544";
        strArr2[1] = "5867824533312508";
        strArr2[2] = "5749495891784144";
        strArr2[3] = "8426096200765561";
        strArr2[4] = "5831572750195307";
        A0C = C18070vi.A0O("9138357339511510", strArr2, 5);
    }

    public final void A01(WeakReference weakReference, boolean z) {
        C18070vi.A0d(weakReference, 1);
        C133416oi r1 = (C133416oi) weakReference.get();
        if (r1 != null) {
            r1.A01(this.A01);
        }
        List<Object> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if (!(obj instanceof AnonymousClass6GR)) {
                    AnonymousClass3MX.A1Q(new AvatarReactionRepository$startAsyncAvatarReactionFetch$2(this, weakReference, (C30391dr) null, z), this.A09);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.ref.WeakReference r16, X.C30391dr r17, X.AnonymousClass1OX r18, boolean r19) {
        /*
            r15 = this;
            r6 = r18
            r11 = r16
            r2 = r19
            r5 = r17
            boolean r0 = r5 instanceof X.AnonymousClass7V9
            if (r0 == 0) goto L_0x0137
            r4 = r5
            X.7V9 r4 = (X.AnonymousClass7V9) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0137
            int r3 = r3 - r1
            r4.label = r3
        L_0x001a:
            java.lang.Object r12 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 3
            r5 = 2
            r13 = 0
            r9 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r9) goto L_0x0074
            if (r1 == r5) goto L_0x00c5
            if (r1 != r0) goto L_0x013e
            X.C30691eM.A01(r12)
        L_0x002f:
            r0 = 1
        L_0x0030:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0035:
            X.C30691eM.A01(r12)
            if (r19 == 0) goto L_0x004e
            java.util.List r0 = A0C
        L_0x003c:
            java.util.ArrayList r8 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            X.C139726zL.A00(r8, r1)
            goto L_0x0044
        L_0x004e:
            java.util.List r0 = A0D
            goto L_0x003c
        L_0x0051:
            X.00H r0 = r15.A0B
            java.lang.Object r7 = r0.get()
            X.6jj r7 = (X.C130616jj) r7
            r4.L$0 = r15
            r4.L$1 = r6
            r4.L$2 = r11
            r4.L$3 = r8
            r4.Z$0 = r2
            r4.label = r9
            X.0wl r1 = r7.A07
            com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 r0 = new com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2
            r0.<init>(r7, r8, r13)
            java.lang.Object r12 = X.C30451dy.A00(r4, r1, r0)
            if (r12 == r3) goto L_0x0143
            r10 = r15
            goto L_0x0089
        L_0x0074:
            boolean r2 = r4.Z$0
            java.lang.Object r8 = r4.L$3
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r11 = r4.L$2
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            java.lang.Object r6 = r4.L$1
            X.1OX r6 = (X.AnonymousClass1OX) r6
            java.lang.Object r10 = r4.L$0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r10 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r10
            X.C30691eM.A01(r12)
        L_0x0089:
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r1 = X.C29351c6.A0D(r8)
            java.util.Iterator r7 = r8.iterator()
            r14 = 0
        L_0x0094:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r9 = r7.next()
            int r0 = r14 + 1
            if (r14 >= 0) goto L_0x00a6
            X.AnonymousClass1ZU.A0B()
            throw r13
        L_0x00a6:
            X.6zL r9 = (X.C139726zL) r9
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1 r8 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.C108985cd.A1P(r1, r8, r6)
            r14 = r0
            goto L_0x0094
        L_0x00b2:
            r4.L$0 = r10
            r4.L$1 = r11
            r4.L$2 = r13
            r4.L$3 = r13
            r4.Z$0 = r2
            r4.label = r5
            java.lang.Object r12 = X.C197009w0.A00(r1, r4)
            if (r12 != r3) goto L_0x00d2
            return r3
        L_0x00c5:
            boolean r2 = r4.Z$0
            java.lang.Object r11 = r4.L$1
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            java.lang.Object r10 = r4.L$0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r10 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r10
            X.C30691eM.A01(r12)
        L_0x00d2:
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x00f3
        L_0x00de:
            X.0wl r2 = r10.A08
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2 r1 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2
            r1.<init>(r10, r11, r12, r13)
            r4.L$0 = r13
            r4.L$1 = r13
            r0 = 3
            r4.label = r0
            java.lang.Object r0 = X.C30451dy.A00(r4, r2, r1)
            if (r0 != r3) goto L_0x002f
            return r3
        L_0x00f3:
            java.util.Iterator r1 = r12.iterator()
            r6 = 0
        L_0x00f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass6GQ
            if (r0 == 0) goto L_0x00f8
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x00f8
            X.AnonymousClass1ZU.A0A()
            throw r13
        L_0x010e:
            if (r6 <= 0) goto L_0x00de
            X.00H r0 = r10.A0A
            X.6ue r5 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "isAnimated="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ",errorCount="
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r6)
            r1 = 4
            java.lang.String r0 = "error_avatar_reaction_returned"
            r5.A02(r1, r0, r2)
            int r0 = r12.size()
            if (r6 != r0) goto L_0x00de
            r0 = 0
            goto L_0x0030
        L_0x0137:
            X.7V9 r4 = new X.7V9
            r4.<init>(r15, r5)
            goto L_0x001a
        L_0x013e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0143:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository.A00(java.lang.ref.WeakReference, X.1dr, X.1OX, boolean):java.lang.Object");
    }

    public AvatarReactionRepository(AnonymousClass71H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9, C18600wl r10) {
        C18070vi.A0w(r3, r4, r5, r6, r2);
        C18070vi.A0q(r7, r8, r9);
        C18070vi.A0d(r10, 9);
        this.A0A = r3;
        this.A03 = r4;
        this.A0B = r5;
        this.A05 = r6;
        this.A02 = r2;
        this.A04 = r7;
        this.A06 = r8;
        this.A08 = r9;
        this.A07 = r10;
        this.A09 = C108995ce.A0f(r10);
    }
}

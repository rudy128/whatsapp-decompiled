package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass00H;
import X.AnonymousClass70I;
import X.C130616jj;
import X.C130746jw;
import X.C18070vi;
import X.C18600wl;

public final class AvatarOnDemandStickers {
    public final C130616jj A00;
    public final C130746jw A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C123096Tc r12, com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r13, java.util.List r14, X.C30391dr r15, X.AnonymousClass1G2 r16, int r17) {
        /*
            r11 = r12
            r10 = r13
            r9 = r16
            r8 = r17
            r3 = r15
            boolean r0 = r15 instanceof X.AnonymousClass7V4
            if (r0 == 0) goto L_0x0185
            r7 = r3
            X.7V4 r7 = (X.AnonymousClass7V4) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0185
            int r2 = r2 - r1
            r7.label = r2
        L_0x0019:
            java.lang.Object r12 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            java.lang.String r5 = "all_stickers_emitted_to_ui"
            r0 = 2
            r2 = 1
            r4 = 3
            r3 = 0
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x0118
            if (r1 == r0) goto L_0x015c
            if (r1 != r4) goto L_0x018c
            int r8 = r7.I$0
            java.lang.Object r10 = r7.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r10 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r10
            X.C30691eM.A01(r12)
        L_0x0036:
            X.00H r1 = r10.A03
            X.70I r0 = X.C108945cZ.A0q(r1)
            X.70I r1 = X.AnonymousClass70I.A00(r0, r1, r5, r8)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x0042:
            r1.A02(r8, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0048:
            X.C30691eM.A01(r12)
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            r16 = r14
            java.util.Iterator r12 = r16.iterator()
        L_0x0055:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r12.next()
            boolean r0 = r1 instanceof X.AnonymousClass6E1
            if (r0 == 0) goto L_0x0055
            r13.add(r1)
            goto L_0x0055
        L_0x0067:
            java.util.ArrayList r12 = X.C29351c6.A0D(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.next()
            X.6E1 r0 = (X.AnonymousClass6E1) r0
            X.6zL r0 = r0.A00
            r12.add(r0)
            goto L_0x006f
        L_0x0081:
            java.util.Set r15 = X.C29431cG.A12(r12)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0036
            r15.size()
            X.00H r0 = r10.A06     // Catch:{ all -> 0x00a6 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x00a6 }
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r14 = (com.whatsapp.productinfra.avatar.data.AvatarStickersRepository) r14     // Catch:{ all -> 0x00a6 }
            r13 = 0
            X.0wl r12 = r14.A0A     // Catch:{ all -> 0x00a6 }
            r1 = 0
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1     // Catch:{ all -> 0x00a6 }
            r0.<init>(r14, r15, r1, r13)     // Catch:{ all -> 0x00a6 }
            java.lang.Object r12 = X.AnonymousClass4GT.A00(r12, r0)     // Catch:{ all -> 0x00a6 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x00a6 }
            goto L_0x00ab
        L_0x00a6:
            r0 = move-exception
            X.1IU r12 = X.C108945cZ.A1J(r0)
        L_0x00ab:
            java.lang.Throwable r13 = X.C30671eK.A00(r12)
            if (r13 == 0) goto L_0x00cf
            X.00H r0 = r10.A02
            X.6ue r14 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "error fetching remote stickers ("
            java.lang.String r0 = X.C108955ca.A10(r0, r1, r13)
            java.lang.String r1 = X.C17900vP.A0B(r0, r1)
            java.lang.String r0 = "observe_stickers_failed"
            r14.A02(r4, r0, r1)
            java.lang.String r0 = "AvatarOnDemandStickers/error fetching remote stickers"
            com.whatsapp.util.Log.e(r0, r13)
        L_0x00cf:
            boolean r0 = r12 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x00d4
            r12 = r3
        L_0x00d4:
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L_0x0129
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r16.iterator()
        L_0x00e0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r1 = r3.next()
            X.6Te r1 = (X.C123116Te) r1
            boolean r0 = r1 instanceof X.AnonymousClass6E0
            if (r0 == 0) goto L_0x00fd
            X.6E0 r1 = (X.AnonymousClass6E0) r1
            X.77d r1 = r1.A00
            X.6Dy r0 = new X.6Dy
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x00e0
        L_0x00fd:
            boolean r0 = r1 instanceof X.AnonymousClass6E1
            if (r0 != 0) goto L_0x00e0
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0106:
            X.6Dw r0 = new X.6Dw
            r0.<init>(r11, r4)
            r7.L$0 = r10
            r7.I$0 = r8
            r7.label = r2
            java.lang.Object r0 = r9.BJt(r0, r7)
            if (r0 != r6) goto L_0x0121
            return r6
        L_0x0118:
            int r8 = r7.I$0
            java.lang.Object r10 = r7.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r10 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r10
            X.C30691eM.A01(r12)
        L_0x0121:
            X.70I r1 = A00(r10)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0042
        L_0x0129:
            X.00H r13 = r10.A03
            X.70I r2 = X.C108945cZ.A0q(r13)
            X.6EG r1 = X.AnonymousClass6EG.A00
            int r0 = r12.size()
            r2.A04(r1, r8, r0)
            X.70I r1 = X.C108945cZ.A0q(r13)
            java.lang.String r0 = "remote_stickers_fetched"
            r1.A03(r8, r0)
            X.0wl r2 = r10.A07
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1 r1 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1
            r0 = r16
            r1.<init>(r10, r12, r0, r3)
            r7.L$0 = r10
            r7.L$1 = r9
            r7.L$2 = r11
            r7.I$0 = r8
            r0 = 2
            r7.label = r0
            java.lang.Object r12 = X.C30451dy.A00(r7, r2, r1)
            if (r12 != r6) goto L_0x016d
            return r6
        L_0x015c:
            int r8 = r7.I$0
            java.lang.Object r11 = r7.L$2
            X.6Tc r11 = (X.C123096Tc) r11
            java.lang.Object r9 = r7.L$1
            X.1G2 r9 = (X.AnonymousClass1G2) r9
            java.lang.Object r10 = r7.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r10 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r10
            X.C30691eM.A01(r12)
        L_0x016d:
            java.util.List r12 = (java.util.List) r12
            X.6Dw r0 = new X.6Dw
            r0.<init>(r11, r12)
            r7.L$0 = r10
            r7.L$1 = r3
            r7.L$2 = r3
            r7.I$0 = r8
            r7.label = r4
            java.lang.Object r0 = r9.BJt(r0, r7)
            if (r0 != r6) goto L_0x0036
            return r6
        L_0x0185:
            X.7V4 r7 = new X.7V4
            r7.<init>(r13, r15)
            goto L_0x0019
        L_0x018c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A01(X.6Tc, com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers, java.util.List, X.1dr, X.1G2, int):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.6Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.6Ds} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.6Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.6Dt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28243Du4 A03(X.C123096Tc r9, X.C108935cY r10) {
        /*
            r8 = this;
            r3 = r9
            boolean r0 = r9 instanceof X.C120446Ds
            if (r0 == 0) goto L_0x007f
            X.6Ds r3 = (X.C120446Ds) r3
            X.6UV r1 = r3.A00
            java.util.List r0 = X.AnonymousClass6Z7.A06
            X.6Di r0 = X.C120346Di.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x006a
            X.6Dp r0 = X.C120416Dp.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x006a
            X.6Dl r0 = X.C120376Dl.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003b
            java.util.List r0 = X.AnonymousClass6Z7.A03
        L_0x0025:
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r1.next()
            X.C108955ca.A1U(r0, r2)
            goto L_0x002d
        L_0x003b:
            X.6Dm r0 = X.C120386Dm.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0046
            java.util.List r0 = X.AnonymousClass6Z7.A04
            goto L_0x0025
        L_0x0046:
            X.6Dn r0 = X.C120396Dn.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = X.AnonymousClass6Z7.A05
            goto L_0x0025
        L_0x0051:
            X.6Dk r0 = X.C120366Dk.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x005c
            java.util.List r0 = X.AnonymousClass6Z7.A02
            goto L_0x0025
        L_0x005c:
            X.6Dj r0 = X.C120356Dj.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = X.AnonymousClass6Z7.A01
            goto L_0x0025
        L_0x0067:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0025
        L_0x006a:
            java.util.List r1 = X.AnonymousClass6Z7.A00
            java.util.List r0 = X.AnonymousClass6Z7.A06
            java.util.ArrayList r0 = X.C29431cG.A0k(r0, r1)
            goto L_0x0025
        L_0x0073:
            java.lang.String[] r1 = X.C108955ca.A1b(r2)
            int r0 = r1.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            goto L_0x008b
        L_0x007f:
            boolean r0 = r9 instanceof X.C120456Dt
            if (r0 == 0) goto L_0x0099
            X.6Dt r3 = (X.C120456Dt) r3
            java.lang.String r0 = r3.A00
            java.lang.String[] r7 = X.C108975cc.A1b(r0)
        L_0x008b:
            r5 = 0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1 r2 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1
            r4 = r8
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            X.Du4 r0 = new X.Du4
            r0.<init>(r2)
            return r0
        L_0x0099:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A03(X.6Tc, X.5cY):X.Du4");
    }

    public static AnonymousClass70I A00(AvatarOnDemandStickers avatarOnDemandStickers) {
        return (AnonymousClass70I) avatarOnDemandStickers.A03.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C123096Tc r5, com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r6, X.C30391dr r7, int r8) {
        /*
            boolean r0 = r7 instanceof X.AnonymousClass7UV
            if (r0 == 0) goto L_0x0071
            r4 = r7
            X.7UV r4 = (X.AnonymousClass7UV) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0077
            java.lang.Object r5 = r4.L$1
            X.6Tc r5 = (X.C123096Tc) r5
            java.lang.Object r6 = r4.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r6 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r6
            X.C30691eM.A01(r1)
        L_0x0028:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0032
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x007c
        L_0x0032:
            X.00H r0 = r6.A02
            X.6ue r3 = X.C108975cc.A0L(r0)
            r2 = 0
            java.lang.String r1 = "unable_to_initialize_search"
            r0 = 3
            r3.A02(r0, r1, r2)
            X.6Du r0 = new X.6Du
            r0.<init>(r5)
            return r0
        L_0x0045:
            X.C30691eM.A01(r1)
            X.00H r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.6pK r0 = (X.C133686pK) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x007c
            r1 = 0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$searchabilityFlow$1 r0 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$searchabilityFlow$1
            r0.<init>(r6, r1, r8)
            X.5WL r1 = X.AnonymousClass4I4.A00(r0)
            X.0wl r0 = r6.A05
            X.1Fz r0 = X.AnonymousClass4I5.A00(r0, r1)
            r4.L$0 = r6
            r4.L$1 = r5
            r4.label = r2
            java.lang.Object r1 = X.C26067Crh.A03(r4, r0)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x0071:
            X.7UV r4 = new X.7UV
            r4.<init>(r6, r7)
            goto L_0x0012
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x007c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A02(X.6Tc, com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers, X.1dr, int):java.lang.Object");
    }

    public AvatarOnDemandStickers(C130616jj r1, C130746jw r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7, C18600wl r8) {
        C18070vi.A0w(r3, r1, r2, r4, r5);
        C18070vi.A0q(r7, r6, r8);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = r8;
    }
}

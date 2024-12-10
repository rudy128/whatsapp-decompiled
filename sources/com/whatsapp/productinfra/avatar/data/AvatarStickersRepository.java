package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass6D0;
import X.AnonymousClass6D1;
import X.AnonymousClass6D2;
import X.AnonymousClass6D3;
import X.AnonymousClass6D4;
import X.C108945cZ;
import X.C108975cc;
import X.C108995ce;
import X.C123076Ta;
import X.C136816uS;
import X.C136936ue;
import X.C18070vi;
import X.C18140vp;
import X.C18600wl;
import X.C29351c6;
import X.C72473Md;
import java.util.ArrayList;
import java.util.List;

public final class AvatarStickersRepository {
    public final C136816uS A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18140vp A08;
    public final C18140vp A09;
    public final C18600wl A0A;
    public final C18600wl A0B;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r6, java.lang.Integer r7, java.lang.Integer r8, java.util.List r9, java.util.Set r10, X.C30391dr r11, boolean r12) {
        /*
            boolean r0 = r11 instanceof X.AnonymousClass7TU
            if (r0 == 0) goto L_0x0039
            r4 = r11
            X.7TU r4 = (X.AnonymousClass7TU) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x003f
            X.C30691eM.A01(r3)
        L_0x0020:
            X.1eK r3 = (X.C30671eK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.C30691eM.A01(r3)
            X.0wl r0 = r6.A0A
            r11 = 0
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackAwait$2 r5 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackAwait$2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.label = r1
            java.lang.Object r3 = X.C30451dy.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0039:
            X.7TU r4 = new X.7TU
            r4.<init>(r6, r11)
            goto L_0x0012
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarStickersRepository.A00(com.whatsapp.productinfra.avatar.data.AvatarStickersRepository, java.lang.Integer, java.lang.Integer, java.util.List, java.util.Set, X.1dr, boolean):java.lang.Object");
    }

    public static final String A01(C123076Ta r4) {
        StringBuilder A10;
        if (r4 instanceof AnonymousClass6D1) {
            return "delivery_error";
        }
        if (r4 instanceof AnonymousClass6D2) {
            A10 = AnonymousClass000.A10();
            A10.append("error_");
            String message = ((Throwable) ((AnonymousClass6D2) r4).A00).getMessage();
            if (message == null) {
                message = "unknown";
            }
            A10.append(message);
        } else if (r4 instanceof AnonymousClass6D3) {
            A10 = AnonymousClass000.A10();
            A10.append("multiple_errors [");
            List<Throwable> list = ((AnonymousClass6D3) r4).A00;
            ArrayList A0D = C29351c6.A0D(list);
            for (Throwable message2 : list) {
                A0D.add(message2.getMessage());
            }
            A10.append(C108995ce.A0X(", ", A0D));
            A10.append(']');
        } else {
            if (r4 instanceof AnonymousClass6D4) {
                A10 = AnonymousClass000.A10();
                A10.append("unknown_error (");
                A10.append(((AnonymousClass6D4) r4).A00.getMessage());
            } else if (r4 instanceof AnonymousClass6D0) {
                A10 = AnonymousClass000.A10();
                A10.append("unknown_error_code (");
                A10.append(0);
            } else {
                throw AnonymousClass3MW.A14();
            }
            A10.append(')');
        }
        return A10.toString();
    }

    public static final void A02(AvatarStickersRepository avatarStickersRepository, String str, String str2) {
        C136936ue A0p = C108945cZ.A0p(avatarStickersRepository.A04);
        if (str2 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("hasAvatar=");
            str2 = AnonymousClass3MY.A0r(A10, C108975cc.A1I(avatarStickersRepository.A02));
        }
        A0p.A02(1, str, str2);
    }

    public AvatarStickersRepository(C136816uS r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18140vp r9, C18140vp r10, C18600wl r11, C18600wl r12) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0x(r7, r9, r8, r1, r10);
        C72473Md.A1L(r11, r12);
        this.A04 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A09 = r9;
        this.A07 = r8;
        this.A00 = r1;
        this.A08 = r10;
        this.A0B = r11;
        this.A0A = r12;
    }
}

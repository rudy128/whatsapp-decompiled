package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OX;
import X.AnonymousClass73M;
import X.AnonymousClass84H;
import X.C108945cZ;
import X.C108975cc;
import X.C1405371w;
import X.C1583780l;
import X.C18070vi;
import X.C18600wl;
import X.C201811d;
import X.C29431cG;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.jid.UserJid;
import java.io.File;

public final class ContactAvatarCoinFlipRepository {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02 = C201811d.A00(32837);
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;
    public final AnonymousClass1OX A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C18600wl A0A;

    public final Bitmap A03(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        AnonymousClass00H r3 = this.A03;
        Bitmap bitmap = (Bitmap) C108975cc.A0E(r3).A0A(userJid.user);
        if (bitmap != null) {
            return bitmap;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(userJid.user);
        String A0y = AnonymousClass000.A0y(".jpg", A10);
        File A16 = C108945cZ.A16(((AnonymousClass73M) this.A00.get()).A00);
        C18070vi.A0X(A16);
        File A012 = AnonymousClass73M.A01(A16, A0y);
        if (A012 == null) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(A012.getAbsolutePath());
        if (decodeFile == null) {
            return decodeFile;
        }
        C108975cc.A0E(r3).A0F(userJid.user, decodeFile);
        return decodeFile;
    }

    private final Bitmap A00(String str) {
        return (Bitmap) C29431cG.A0c(((C1405371w) C18070vi.A0E(this.A07)).A02(C18070vi.A0M(str), new C1583780l(str), AnonymousClass84H.A00, false, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.jid.UserJid r6, com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7UR
            if (r0 == 0) goto L_0x0062
            r4 = r8
            X.7UR r4 = (X.AnonymousClass7UR) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0062
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r1) goto L_0x00de
            java.lang.Object r6 = r4.L$1
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            java.lang.Object r7 = r4.L$0
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r7 = (com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository) r7
            java.lang.Object r5 = X.C108955ca.A0n(r3)
        L_0x0029:
            java.lang.Throwable r0 = X.C30671eK.A00(r5)
            if (r0 == 0) goto L_0x003f
            java.lang.String r3 = "unable to get contact's avatar photo information"
            java.lang.String r2 = r0.getMessage()
            X.00H r0 = r7.A01
            X.6ue r1 = X.C108945cZ.A0p(r0)
            r0 = 7
            r1.A02(r0, r3, r2)
        L_0x003f:
            boolean r0 = r5 instanceof X.AnonymousClass1IU
            r4 = 0
            if (r0 == 0) goto L_0x0045
            r5 = r4
        L_0x0045:
            X.6sr r5 = (X.C135846sr) r5
            if (r5 != 0) goto L_0x0068
            return r4
        L_0x004a:
            X.C30691eM.A01(r3)
            X.00H r0 = r7.A08
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.coinflip.iq.GetAvatarCoinFlipProfilePicturesProtocolHelper r0 = (com.whatsapp.productinfra.avatar.coinflip.iq.GetAvatarCoinFlipProfilePicturesProtocolHelper) r0
            r4.L$0 = r7
            r4.L$1 = r6
            r4.label = r1
            java.lang.Object r5 = r0.A00(r6, r4)
            if (r5 != r2) goto L_0x0029
            return r2
        L_0x0062:
            X.7UR r4 = new X.7UR
            r4.<init>(r7, r8)
            goto L_0x0012
        L_0x0068:
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x00d0
            android.graphics.Bitmap r3 = r7.A00(r0)
            if (r3 == 0) goto L_0x00d0
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x00c2
            android.graphics.Bitmap r2 = r7.A00(r0)
            if (r2 == 0) goto L_0x00c2
            X.00H r1 = r7.A02
            java.lang.Object r0 = r1.get()
            X.6oX r0 = (X.C133306oX) r0
            android.graphics.Bitmap r4 = r0.A00(r3, r2)
            java.lang.Object r0 = r1.get()
            X.6oX r0 = (X.C133306oX) r0
            byte[] r3 = r0.A01(r4)
            X.00H r0 = r7.A00
            java.lang.Object r2 = r0.get()
            X.73M r2 = (X.AnonymousClass73M) r2
            r0 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r6, r0)
            java.lang.String r0 = r6.user
            r1.append(r0)
            java.lang.String r0 = ".jpg"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.118 r0 = r2.A00
            java.io.File r0 = X.C108945cZ.A16(r0)
            X.C18070vi.A0X(r0)
            X.AnonymousClass73M.A02(r0, r1, r3)
            X.00H r0 = r7.A03
            X.1ga r1 = X.C108975cc.A0E(r0)
            java.lang.String r0 = r6.user
            r1.A0F(r0, r4)
            return r4
        L_0x00c2:
            java.lang.String r3 = "unable to fetch contact's avatar background photo"
            r2 = 0
            X.00H r0 = r7.A01
            X.6ue r1 = X.C108945cZ.A0p(r0)
            r0 = 7
            r1.A02(r0, r3, r2)
            return r4
        L_0x00d0:
            java.lang.String r3 = "unable to fetch contact's avatar static photo"
            r2 = 0
            X.00H r0 = r7.A01
            X.6ue r1 = X.C108945cZ.A0p(r0)
            r0 = 7
            r1.A02(r0, r3, r2)
            return r4
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository.A01(com.whatsapp.jid.UserJid, com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.whatsapp.jid.UserJid r7, com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C147797Un
            if (r0 == 0) goto L_0x009e
            r4 = r9
            X.7Un r4 = (X.C147797Un) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r3) goto L_0x00a8
            java.lang.Object r6 = r4.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r4.L$1
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            java.lang.Object r8 = r4.L$0
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository r8 = (com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository) r8
            X.C30691eM.A01(r1)
        L_0x002c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a5
            X.1E7 r0 = X.C17880vN.A0O(r6)
            boolean r0 = r0.A0g
            if (r0 != 0) goto L_0x002c
            X.0wl r2 = r8.A0A
            r1 = 0
            com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2 r0 = new com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository$notifyContactPhotoChangeIfNecessary$2
            r0.<init>(r7, r8, r1)
            r4.L$0 = r8
            r4.L$1 = r7
            r4.L$2 = r6
            r4.label = r3
            java.lang.Object r0 = X.C30451dy.A00(r4, r2, r0)
            if (r0 != r5) goto L_0x002c
            return r5
        L_0x0051:
            X.C30691eM.A01(r1)
            X.DcQ r6 = X.AnonymousClass1ZT.A01()
            boolean r2 = X.C22971Dz.A0T(r7)
            X.00H r1 = r8.A09
            java.lang.Object r0 = r1.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            if (r2 == 0) goto L_0x0099
            X.1E7 r0 = r0.A0E(r7)
            r6.add(r0)
            java.lang.Object r2 = r1.get()
            X.1M9 r2 = (X.AnonymousClass1M9) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r7, r0)
            r1 = r7
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            X.1Ln r0 = r2.A0G
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0097
            X.1E7 r0 = r2.A0E(r0)
        L_0x0087:
            r6.add(r0)
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r6)
            java.util.List r0 = X.C29431cG.A0q(r0)
            java.util.Iterator r6 = r0.iterator()
            goto L_0x002c
        L_0x0097:
            r0 = 0
            goto L_0x0087
        L_0x0099:
            X.1E7 r0 = r0.A0H(r7)
            goto L_0x0087
        L_0x009e:
            X.7Un r4 = new X.7Un
            r4.<init>(r8, r9)
            goto L_0x0012
        L_0x00a5:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository.A02(com.whatsapp.jid.UserJid, com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository, X.1dr):java.lang.Object");
    }

    public ContactAvatarCoinFlipRepository(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, C18600wl r9, C18600wl r10, AnonymousClass1OX r11) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0x(r7, r8, r11, r9, r10);
        this.A03 = r2;
        this.A01 = r3;
        this.A09 = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A00 = r7;
        this.A08 = r8;
        this.A06 = r11;
        this.A0A = r9;
        this.A05 = r10;
    }
}

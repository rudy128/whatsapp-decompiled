package com.whatsapp.stickers.store.preview;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1SB;
import X.AnonymousClass3MW;
import X.AnonymousClass6IK;
import X.AnonymousClass6IL;
import X.AnonymousClass725;
import X.AnonymousClass7RQ;
import X.AnonymousClass89P;
import X.C108945cZ;
import X.C1185864a;
import X.C145677Me;
import X.C145697Mg;
import X.C145707Mh;
import X.C145717Mi;
import X.C1597985x;
import X.C18070vi;
import X.C18600wl;
import X.C25311Ns;
import X.C32431hB;
import X.C441522i;
import java.io.File;

public final class StickerStorePackPreviewViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M(C145717Mi.A00);
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final C25311Ns A02;
    public final C32431hB A03;
    public final AnonymousClass1SB A04;
    public final AnonymousClass00H A05;
    public final C18600wl A06;
    public final C1185864a A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.6oW, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r9.exists() == true) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass725 A00(X.C441522i r45, com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r46, java.io.File r47) {
        /*
            r2 = r46
            X.64a r1 = r2.A07
            X.00H r0 = r2.A0B
            r44 = r0
            X.00H r0 = r2.A0A
            r43 = r0
            X.00H r15 = r2.A09
            r7 = 0
            r8 = r45
            X.C18070vi.A0d(r8, r7)
            r18 = 0
            r0 = r47
            if (r47 == 0) goto L_0x0122
            java.io.File r6 = r1.A00(r0)
        L_0x001e:
            X.6oW r5 = new X.6oW
            r5.<init>()
            r4 = 1
            r5.A0Z = r4
            r5.A0Y = r4
            java.lang.String r0 = r8.A06
            if (r0 == 0) goto L_0x002e
            r5.A0E = r0
        L_0x002e:
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0034
            r5.A0G = r0
        L_0x0034:
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x003a
            r5.A0I = r0
        L_0x003a:
            java.lang.String r0 = r8.A04
            if (r0 == 0) goto L_0x0040
            r5.A03 = r0
        L_0x0040:
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x0046
            r5.A0F = r0
        L_0x0046:
            java.lang.Long r0 = r8.A01
            if (r0 == 0) goto L_0x0050
            long r0 = r0.longValue()
            r5.A01 = r0
        L_0x0050:
            if (r6 == 0) goto L_0x0060
            java.lang.String r0 = r8.A07
            if (r0 == 0) goto L_0x0060
            java.io.File r0 = X.C17880vN.A0e(r6, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            r5.A0K = r0
        L_0x0060:
            java.util.List r1 = r8.A08
            if (r1 == 0) goto L_0x0128
            java.lang.Boolean r0 = r8.A1G()
            boolean r0 = X.C18070vi.A19(r0, r4)
            r5.A0P = r0
            java.util.ArrayList r10 = X.C29351c6.A0D(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x0076:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0126
            java.lang.Object r1 = r16.next()
            X.6tY r1 = (X.C136276tY) r1
            if (r6 == 0) goto L_0x011e
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x011e
            java.io.File r9 = X.C17880vN.A0e(r6, r0)
            boolean r0 = r9.exists()
            if (r0 != r4) goto L_0x011e
        L_0x0092:
            java.lang.Object r0 = r44.get()
            X.6xt r0 = (X.C138906xt) r0
            java.lang.String r3 = r1.A05
            X.6uF r12 = r0.A01(r9, r3)
            java.lang.String r14 = r8.A06
            java.lang.String r13 = r1.A03
            java.lang.String r11 = r1.A02
            java.lang.Boolean r0 = r1.A01
            boolean r41 = X.C72453Mb.A1Y(r0)
            if (r9 == 0) goto L_0x0118
            long r1 = r9.length()
            int r0 = (int) r1
            java.lang.Object r1 = X.C18070vi.A0E(r15)
            X.C18070vi.A0d(r1, r7)
            java.lang.String r19 = X.C1402370n.A00(r9)
            X.C18070vi.A0X(r19)
            if (r12 == 0) goto L_0x0115
            java.lang.String r21 = r12.A01(r9)
        L_0x00c5:
            r32 = 512(0x200, float:7.175E-43)
            X.77d r1 = new X.77d
            r22 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r18
            r31 = r18
            r36 = r7
            r37 = r7
            r38 = r7
            r39 = r7
            r40 = r7
            r42 = r7
            r20 = r18
            r23 = r3
            r24 = r14
            r25 = r13
            r30 = r11
            r33 = r32
            r34 = r0
            r35 = r7
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            if (r9 == 0) goto L_0x0110
            java.lang.String r3 = r9.getAbsolutePath()
            if (r3 == 0) goto L_0x0110
            r1.A0B = r3
            java.lang.Object r2 = r43.get()
            X.70H r2 = (X.AnonymousClass70H) r2
            java.lang.Integer r0 = r1.A01()
            X.73B r0 = r2.A03(r0, r3)
            r1.A04 = r0
        L_0x0110:
            r10.add(r1)
            goto L_0x0076
        L_0x0115:
            r21 = r18
            goto L_0x00c5
        L_0x0118:
            r0 = 0
            r19 = r18
            r21 = r18
            goto L_0x00c5
        L_0x011e:
            r9 = r18
            goto L_0x0092
        L_0x0122:
            r6 = r18
            goto L_0x001e
        L_0x0126:
            r5.A0O = r10
        L_0x0128:
            X.725 r0 = r5.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel.A00(X.22i, com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel, java.io.File):X.725");
    }

    public final AnonymousClass725 A0T() {
        C1597985x r1 = (C1597985x) this.A00.A06();
        if (r1 instanceof C145707Mh) {
            return ((C145707Mh) r1).A00;
        }
        if (r1 instanceof C145697Mg) {
            C145697Mg r12 = (C145697Mg) r1;
            if (r12 instanceof AnonymousClass6IL) {
                return ((AnonymousClass6IL) r12).A00;
            }
            return ((AnonymousClass6IK) r12).A00;
        } else if (r1 instanceof C145677Me) {
            return ((C145677Me) r1).A00;
        } else {
            return null;
        }
    }

    public StickerStorePackPreviewViewModel(C25311Ns r2, C32431hB r3, C1185864a r4, AnonymousClass1SB r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, C18600wl r11) {
        C18070vi.A0w(r6, r11, r5, r2, r7);
        C18070vi.A0x(r3, r4, r8, r9, r10);
        this.A08 = r6;
        this.A06 = r11;
        this.A04 = r5;
        this.A02 = r2;
        this.A05 = r7;
        this.A03 = r3;
        this.A07 = r4;
        this.A0A = r8;
        this.A09 = r9;
        this.A0B = r10;
    }

    public static final void A03(C441522i r4, StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel, File file) {
        Object r0;
        AnonymousClass725 A002 = A00(r4, stickerStorePackPreviewViewModel, file);
        AnonymousClass725 A062 = stickerStorePackPreviewViewModel.A04.A06((AnonymousClass89P) null, A002.A0H, false, false);
        if (A062 != null) {
            A002.A03 = A062.A03;
        }
        AnonymousClass1DT r2 = stickerStorePackPreviewViewModel.A00;
        if (file != null) {
            r0 = new C145707Mh(A002, true);
        } else {
            r0 = new AnonymousClass6IK(A002);
        }
        r2.A0E(r0);
    }

    public void A0S() {
        AnonymousClass725 A0T = A0T();
        if (A0T != null) {
            AnonymousClass7RQ.A02(this.A08, this, A0T, 42);
        }
    }
}

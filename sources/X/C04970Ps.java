package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0Ps  reason: invalid class name and case insensitive filesystem */
public abstract class C04970Ps {
    public static final int A00(AnonymousClass0XW r2) {
        int i = r2.A01;
        if (i != 0) {
            return i;
        }
        int i2 = 1;
        if (r2 instanceof C17670v2) {
            i2 = 3;
        }
        if (r2 instanceof C17640uz) {
            i2 |= 4;
        }
        if (r2 instanceof C17660v1) {
            i2 |= 8;
        }
        if (r2 instanceof C17690v4) {
            i2 |= 16;
        }
        if (r2 instanceof C17540up) {
            i2 |= 32;
        }
        if (r2 instanceof C17620ux) {
            i2 |= 64;
        }
        if (r2 instanceof C17650v0) {
            i2 |= 128;
        }
        if (r2 instanceof C17600uv) {
            i2 |= 256;
        }
        if (r2 instanceof C015408x) {
            i2 |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        if (r2 instanceof C17580ut) {
            i2 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        if (r2 instanceof C17570us) {
            i2 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        if (r2 instanceof C17630uy) {
            i2 |= DefaultCrypto.BUFFER_SIZE;
        }
        if (r2 instanceof C17590uu) {
            i2 |= 16384;
        }
        if (r2 instanceof C17560ur) {
            i2 |= 32768;
        }
        if (r2 instanceof C17700v5) {
            return i2 | 262144;
        }
        return i2;
    }

    public static final int A01(AnonymousClass0XW r3) {
        if (!(r3 instanceof C014308l)) {
            return A00(r3);
        }
        C014308l r32 = (C014308l) r3;
        int i = r32.A01;
        for (AnonymousClass0XW r1 = r32.A00; r1 != null; r1 = r1.A02) {
            i |= A01(r1);
        }
        return i;
    }

    public static final void A02(AnonymousClass0XW r2) {
        if (r2.A07) {
            A04(r2, -1, 1);
            return;
        }
        throw AnonymousClass000.A0n("autoInvalidateInsertedNode called on unattached node");
    }

    public static final void A03(AnonymousClass0XW r2) {
        if (r2.A07) {
            A04(r2, -1, 0);
            return;
        }
        throw AnonymousClass000.A0n("autoInvalidateUpdatedNode called on unattached node");
    }

    public static final void A04(AnonymousClass0XW r3, int i, int i2) {
        if (r3 instanceof C014308l) {
            C014308l r2 = (C014308l) r3;
            int i3 = r2.A01;
            A05(r3, i3 & i, i2);
            int i4 = i & (i3 ^ -1);
            for (AnonymousClass0XW r0 = r2.A00; r0 != null; r0 = r0.A02) {
                A04(r0, i4, i2);
            }
            return;
        }
        A05(r3, i & r3.A01, i2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0113 A[EDGE_INSN: B:90:0x0113->B:81:0x0113 ?: BREAK  , SYNTHETIC] */
    public static final void A05(X.AnonymousClass0XW r8, int r9, int r10) {
        /*
            if (r10 != 0) goto L_0x0009
            boolean r0 = r8.A0K()
            if (r0 != 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            r3 = 2
            r0 = r9 & 2
            if (r0 == 0) goto L_0x001e
            boolean r0 = r8 instanceof X.C17670v2
            if (r0 == 0) goto L_0x001e
            X.AnonymousClass0QV.A08(r8)
            if (r10 != r3) goto L_0x001e
            X.0Ad r0 = X.AnonymousClass0QV.A04(r8, r3)
            r0.A16()
        L_0x001e:
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x002a
            boolean r0 = r8 instanceof X.C17600uv
            if (r0 == 0) goto L_0x002a
            X.AnonymousClass0QV.A08(r8)
        L_0x002a:
            r0 = 4
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0038
            boolean r0 = r8 instanceof X.C17640uz
            if (r0 == 0) goto L_0x0038
            r0 = r8
            X.0uz r0 = (X.C17640uz) r0
            X.AnonymousClass0F0.A00(r0)
        L_0x0038:
            r0 = 8
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0044
            boolean r0 = r8 instanceof X.C17660v1
            if (r0 == 0) goto L_0x0044
            X.AnonymousClass0QV.A07(r8)
        L_0x0044:
            r0 = 64
            r0 = r0 & r9
            if (r0 == 0) goto L_0x005e
            boolean r0 = r8 instanceof X.C17620ux
            if (r0 == 0) goto L_0x005e
            X.0XV r0 = X.AnonymousClass0QV.A03(r8)
            X.0Ok r2 = r0.A0Q
            X.0AK r0 = r2.A0G
            r1 = 1
            r0.A0B = r1
            X.0AL r0 = r2.A04
            if (r0 == 0) goto L_0x005e
            r0.A07 = r1
        L_0x005e:
            r0 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x006c
            boolean r0 = r8 instanceof X.C015408x
            if (r0 == 0) goto L_0x006c
            if (r10 != r3) goto L_0x00fb
            r8.A0J()
        L_0x006c:
            r0 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0113
            boolean r0 = r8 instanceof X.C17580ut
            if (r0 == 0) goto L_0x0113
            r2 = r8
            X.0ut r2 = (X.C17580ut) r2
            X.0WM r1 = X.AnonymousClass0WM.A01
            r0 = 0
            X.AnonymousClass0WM.A00 = r0
            r2.BCR(r1)
            java.lang.Boolean r0 = X.AnonymousClass0WM.A00
            if (r0 == 0) goto L_0x0113
            if (r10 != r3) goto L_0x0108
            r7 = 1024(0x400, float:1.435E-42)
            X.0XW r2 = (X.AnonymousClass0XW) r2
            X.0XW r6 = r2.A03
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0122
            X.0a9 r5 = X.C06970a9.A01()
            X.0XW r0 = r6.A02
            if (r0 == 0) goto L_0x00a9
            r5.A0F(r0)
        L_0x009b:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0113
            r4 = 1
            X.0XW r6 = X.C06970a9.A03(r5, r0)
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 != 0) goto L_0x00af
        L_0x00a9:
            X.AnonymousClass0QV.A06(r5, r6)
            goto L_0x009b
        L_0x00ad:
            if (r6 == 0) goto L_0x009b
        L_0x00af:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00f8
            r3 = 0
        L_0x00b5:
            boolean r0 = r6 instanceof X.C015408x
            if (r0 == 0) goto L_0x00cb
            X.0WK r0 = X.AnonymousClass0QV.A01(r6)
            X.0Mj r1 = r0.A04
            java.util.Set r0 = r1.A02
            X.C04230Mj.A00(r1, r6, r0)
        L_0x00c4:
            X.0XW r6 = X.AnonymousClass0QV.A00(r3)
        L_0x00c8:
            if (r6 == 0) goto L_0x009b
            goto L_0x00b5
        L_0x00cb:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r6 instanceof X.C014308l
            if (r0 == 0) goto L_0x00c4
            r0 = r6
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x00da:
            if (r2 == 0) goto L_0x00f5
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00e6
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x00e9
            r6 = r2
        L_0x00e6:
            X.0XW r2 = r2.A02
            goto L_0x00da
        L_0x00e9:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r6 = X.AnonymousClass000.A0d(r3, r6)
            r3.A0F(r2)
            goto L_0x00e6
        L_0x00f5:
            if (r1 != r4) goto L_0x00c4
            goto L_0x00c8
        L_0x00f8:
            X.0XW r6 = r6.A02
            goto L_0x00ad
        L_0x00fb:
            X.0WK r0 = X.AnonymousClass0QV.A01(r8)
            X.0Mj r1 = r0.A04
            java.util.Set r0 = r1.A02
            X.C04230Mj.A00(r1, r8, r0)
            goto L_0x006c
        L_0x0108:
            X.0WK r0 = X.AnonymousClass0QV.A01(r2)
            X.0Mj r1 = r0.A04
            java.util.Set r0 = r1.A01
            X.C04230Mj.A00(r1, r2, r0)
        L_0x0113:
            r0 = 4096(0x1000, float:5.74E-42)
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0008
            boolean r0 = r8 instanceof X.C17570us
            if (r0 == 0) goto L_0x0008
            X.0us r8 = (X.C17570us) r8
            X.C04500Nq.A01(r8)
            return
        L_0x0122:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04970Ps.A05(X.0XW, int, int):void");
    }
}

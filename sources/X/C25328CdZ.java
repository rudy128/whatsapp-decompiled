package X;

import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CdZ  reason: case insensitive filesystem */
public abstract class C25328CdZ {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f4, code lost:
        if (r12.A06 != null) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25092CXd A00(X.E7q r36, X.E7q r37, X.C26052CrM r38, boolean r39, boolean r40) {
        /*
            r0 = 0
            r9 = 0
            java.lang.String r1 = "MediaCompositionMetadataExtractor.extractVideoMetadata"
            android.os.Trace.beginSection(r1)
            X.BzJ r6 = X.C24322BzJ.VIDEO
            r20 = r6
            r10 = r38
            java.util.HashMap r1 = r10.A06(r6)
            if (r1 != 0) goto L_0x0015
            X.BzJ r6 = X.C24322BzJ.AUDIO
        L_0x0015:
            r11 = r37
            r7 = r40
            long r16 = X.C26162Ctb.A00(r11, r6, r10, r7)
            java.util.HashMap r8 = X.C17880vN.A11()
            r18 = r36
            r21 = r10
            r22 = r8
            r23 = r7
            r19 = r11
            A01(r18, r19, r20, r21, r22, r23)
            X.BzJ r3 = X.C24322BzJ.AUDIO
            r20 = r3
            A01(r18, r19, r20, r21, r22, r23)
            if (r6 != r3) goto L_0x00c9
            java.lang.Object r1 = r8.get(r3)
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r8.get(r3)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x005f
            java.lang.Object r0 = r8.get(r3)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r9)
            X.CXd r0 = (X.C25092CXd) r0
        L_0x005f:
            r0.getClass()
            long r2 = r0.A08
            r4 = 1000(0x3e8, double:4.94E-321)
            long r34 = r16 / r4
            int r1 = r0.A05
            r21 = r1
            int r1 = r0.A03
            r20 = r1
            int r1 = r0.A04
            r19 = r1
            int r1 = r0.A02
            r18 = r1
            int r15 = r0.A01
            r36 = 8
            long r36 = r36 * r2
            long r36 = r36 * r4
            long r36 = r36 * r4
            long r36 = r36 / r16
            int r14 = r0.A00
            X.D3e r13 = r0.A09
            java.lang.String r12 = r0.A0E
            java.lang.String r11 = r0.A0I
            java.lang.String r10 = r0.A0C
            java.lang.String r7 = r0.A0G
            java.lang.String r6 = r0.A0F
            java.lang.String r5 = r0.A0B
            java.lang.String r4 = r0.A0A
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = r0.A0H
            X.CXd r16 = new X.CXd
            r31 = r18
            r32 = r15
            r33 = r14
            r38 = r2
            r40 = r9
            r25 = r1
            r26 = r0
            r27 = r8
            r28 = r21
            r29 = r20
            r30 = r19
            r20 = r10
            r21 = r7
            r22 = r6
            r23 = r5
            r24 = r4
            r17 = r13
            r18 = r12
            r19 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)
            android.os.Trace.endSection()
            return r16
        L_0x00c9:
            java.util.HashMap r1 = r10.A06(r6)
            r1.getClass()
            int r5 = r1.size()
            r14 = 0
            r4 = -1
            r3 = 0
        L_0x00d7:
            if (r3 >= r5) goto L_0x0121
            java.util.List r1 = r10.A07(r6, r3)
            r1.getClass()
            java.lang.Object r12 = r1.get(r9)
            X.CcJ r12 = (X.C25271CcJ) r12
            X.By8 r2 = r12.A04
            X.By8 r1 = X.C24250By8.MULTI_PHOTO
            if (r2 != r1) goto L_0x0134
            r2 = r0
        L_0x00ed:
            java.io.File r1 = r12.A05
            if (r1 != 0) goto L_0x00f6
            java.net.URL r1 = r12.A06
            r13 = 0
            if (r1 == 0) goto L_0x00f7
        L_0x00f6:
            r13 = 1
        L_0x00f7:
            java.lang.String r1 = "file and url is null"
            X.C26171Ctn.A03(r13, r1)
            X.C28111Yx.A02(r2)
            java.io.File r1 = r12.A05
            if (r1 == 0) goto L_0x012a
            java.io.File r1 = r12.A05
            java.lang.String r1 = r1.getCanonicalPath()
            java.io.File r1 = X.C108945cZ.A17(r1)
            X.CXd r12 = X.BE7.A0I(r2, r1)
        L_0x0111:
            if (r12 == 0) goto L_0x0127
            int r2 = r12.A05
            int r1 = r12.A03
            int r1 = java.lang.Math.min(r2, r1)
            if (r1 <= r4) goto L_0x011f
            r14 = r12
            r4 = r1
        L_0x011f:
            if (r39 != 0) goto L_0x0127
        L_0x0121:
            r14.getClass()
            r0 = r14
            goto L_0x005f
        L_0x0127:
            int r3 = r3 + 1
            goto L_0x00d7
        L_0x012a:
            java.net.URL r1 = r12.A06
            X.C26171Ctn.A02(r1)
            X.CXd r12 = r2.BKw(r1)
            goto L_0x0111
        L_0x0134:
            boolean r1 = r12.A02(r7)
            r2 = r11
            if (r1 == 0) goto L_0x00ed
            r2 = r18
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25328CdZ.A00(X.E7q, X.E7q, X.CrM, boolean, boolean):X.CXd");
    }

    public static void A01(E7q e7q, E7q e7q2, C24322BzJ bzJ, C26052CrM crM, HashMap hashMap, boolean z) {
        C25092CXd BKw;
        HashMap A06 = crM.A06(bzJ);
        if (A06 != null) {
            HashMap A11 = C17880vN.A11();
            hashMap.put(bzJ, A11);
            Iterator A0i = C17890vO.A0i(A06);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                ArrayList A13 = AnonymousClass000.A13();
                A11.put(A16.getKey(), A13);
                Iterator A0y = AnonymousClass8BV.A0y(((C25833Cmm) A16.getValue()).A04);
                while (true) {
                    if (A0y.hasNext()) {
                        C25271CcJ ccJ = (C25271CcJ) A0y.next();
                        File file = ccJ.A05;
                        URL url = ccJ.A06;
                        if (ccJ.A04 != C24250By8.MULTI_PHOTO) {
                            if (ccJ.A02(z)) {
                                C26171Ctn.A03(AnonymousClass000.A1W(file), (String) null);
                                C26171Ctn.A02(file);
                                BKw = BE7.A0I(e7q, file);
                            } else {
                                C28111Yx.A02(e7q2);
                                if (file != null) {
                                    BKw = BE7.A0I(e7q2, file);
                                } else if (url != null) {
                                    BKw = e7q2.BKw(url);
                                }
                            }
                            A13.add(BKw);
                        } else if (file != null) {
                            C28111Yx.A02((Object) null);
                            Uri.fromFile(file);
                            throw AnonymousClass000.A0s("extractMediaMetadata");
                        } else if (url != null) {
                            C28111Yx.A02((Object) null);
                            throw AnonymousClass000.A0s("extractMediaMetadataUrl");
                        }
                    }
                }
            }
        }
    }
}

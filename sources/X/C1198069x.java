package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.69x  reason: invalid class name and case insensitive filesystem */
public final class C1198069x extends C133066o7 {
    public final C218617r A00;
    public final AnonymousClass2E5 A01;
    public final C1403571b A02;
    public final C24641Lc A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1198069x(X.AnonymousClass1T1 r17, X.C218617r r18, X.AnonymousClass118 r19, X.C18000vb r20, X.AnonymousClass2E5 r21, X.AnonymousClass1KW r22, X.C18030ve r23, X.C25291Nq r24, X.C1403571b r25, X.C24641Lc r26, X.C26631Sw r27, X.C26521Sl r28, X.AnonymousClass00H r29, X.AnonymousClass00H r30) {
        /*
            r16 = this;
            r9 = r19
            r10 = r20
            r11 = r22
            r14 = r27
            r15 = r28
            X.C18070vi.A0w(r15, r9, r11, r10, r14)
            r8 = r17
            r12 = r23
            r13 = r24
            r4 = r25
            r3 = r26
            X.C18070vi.A0x(r12, r13, r8, r3, r4)
            r2 = r29
            r6 = r18
            r5 = r21
            X.C18070vi.A0r(r2, r5, r6)
            r0 = 14
            r1 = r30
            X.C18070vi.A0d(r1, r0)
            r7 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r7.A03 = r3
            r7.A02 = r4
            r7.A04 = r2
            r7.A01 = r5
            r7.A00 = r6
            r7.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198069x.<init>(X.1T1, X.17r, X.118, X.0vb, X.2E5, X.1KW, X.0ve, X.1Nq, X.71b, X.1Lc, X.1Sw, X.1Sl, X.00H, X.00H):void");
    }

    public static final Bitmap A00(Uri.Builder builder, AnonymousClass6nF r6, C1198069x r7) {
        int i = r6.A00;
        try {
            return r7.A02.A0h(builder.build(), i, i);
        } catch (C33261iX | IOException e) {
            Log.e("PrepareAndSendMediaTask/can't load image", e);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x02ca: MOVE  (r0v22 android.graphics.Point) = (r20v0 android.graphics.Point)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01de  */
    public final android.net.Uri.Builder A02(android.net.Uri r29, X.C1185563x r30, X.AnonymousClass64U r31, X.AnonymousClass72S r32, java.lang.Integer r33, boolean r34, boolean r35, boolean r36) {
        /*
            r28 = this;
            r1 = 1
            r27 = r29
            r0 = r27
            X.C18070vi.A0d(r0, r1)
            r6 = r28
            X.1Sl r1 = r6.A02
            r26 = r31
            r4 = r32
            r0 = r26
            android.net.Uri$Builder r8 = X.C123976Wo.A00(r0, r4, r1)
            r22 = 0
            r0 = r27
            java.lang.String r1 = X.C108975cc.A0c(r0, r1)
            java.lang.String r0 = "mime_type"
            r8.appendQueryParameter(r0, r1)
            X.C26521Sl.A0Z(r8, r4)
            int r21 = r4.A01()
            X.73s r5 = r6.A01(r4)
            if (r21 != 0) goto L_0x004c
            if (r5 != 0) goto L_0x004c
            monitor-enter(r4)
            boolean r0 = r4.A0M     // Catch:{ all -> 0x0329 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x004c
            android.graphics.Point r0 = r4.A03()
            if (r0 != 0) goto L_0x004c
            if (r35 == 0) goto L_0x0046
            int r0 = r4.A02()
            if (r0 != 0) goto L_0x004c
        L_0x0046:
            boolean r0 = r4.A0V()
            if (r0 == 0) goto L_0x032c
        L_0x004c:
            r10 = r30
            if (r30 == 0) goto L_0x0061
            if (r5 == 0) goto L_0x008e
            X.69K r0 = r5.A04()
            if (r0 == 0) goto L_0x008e
            float r0 = r0.A03
        L_0x005a:
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A04 = r0
        L_0x0061:
            r3 = 0
            if (r30 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x008c
            X.69K r0 = r5.A04()
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.A0c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0074:
            r10.A01 = r0
            if (r5 == 0) goto L_0x008a
            X.69K r0 = r5.A04()
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.A0b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0086:
            r10.A00 = r0
        L_0x0088:
            monitor-enter(r4)
            goto L_0x0091
        L_0x008a:
            r0 = r3
            goto L_0x0086
        L_0x008c:
            r0 = r3
            goto L_0x0074
        L_0x008e:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x005a
        L_0x0091:
            boolean r9 = r4.A0M     // Catch:{ all -> 0x0329 }
            monitor-exit(r4)
            monitor-enter(r4)
            java.lang.Integer r0 = r4.A0D     // Catch:{ all -> 0x0329 }
            r25 = r0
            monitor-exit(r4)
            monitor-enter(r4)
            java.lang.Integer r0 = r4.A0C     // Catch:{ all -> 0x0329 }
            r24 = r0
            monitor-exit(r4)
            monitor-enter(r4)
            java.lang.Integer r0 = r4.A0E     // Catch:{ all -> 0x0329 }
            r23 = r0
            monitor-exit(r4)
            android.graphics.Point r20 = r4.A03()
            java.io.File r0 = r4.A08()
            boolean r19 = X.AnonymousClass000.A1W(r0)
            boolean r0 = r4.A0V()
            if (r0 == 0) goto L_0x02a9
            X.0ve r11 = r6.A01
            r0 = 6030(0x178e, float:8.45E-42)
            X.0vf r7 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r7, r11, r0)
            r0 = 6029(0x178d, float:8.448E-42)
            int r1 = X.C18020vd.A00(r7, r11, r0)
            r0 = 12902(0x3266, float:1.808E-41)
            int r0 = X.C18020vd.A00(r7, r11, r0)
            X.68a r7 = new X.68a
            r7.<init>(r2, r1, r0, r0)
        L_0x00d3:
            r2 = 1
            r11 = 0
            if (r9 == 0) goto L_0x02a2
            android.graphics.Bitmap r18 = A00(r8, r7, r6)
            if (r18 == 0) goto L_0x02e0
            if (r5 == 0) goto L_0x027d
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "main-image-file"
            r1[r22] = r0
            boolean r0 = X.C1409573s.A03(r5, r1)
            if (r0 != r2) goto L_0x027d
            X.1Lc r0 = r6.A03
            X.0ve r1 = r0.A01
            r0 = 10920(0x2aa8, float:1.5302E-41)
            X.0vf r12 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 == 0) goto L_0x027d
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r30 == 0) goto L_0x012a
            int r11 = r18.getWidth()
            int r9 = r18.getHeight()
            X.69K r0 = r5.A04()
            if (r0 == 0) goto L_0x0279
            float r1 = r0.A03
        L_0x010d:
            X.6rw r0 = X.C1403571b.A00(r3, r11, r9)
            int r11 = r11 * r9
            float r9 = (float) r11
            float r9 = r9 * r1
            float r9 = r9 * r1
            int r1 = r0.A01
            int r0 = r0.A00
            int r1 = r1 * r0
            float r0 = (float) r1
            float r9 = r9 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 * r0
            int r0 = (int) r9
            double r0 = (double) r0
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r13
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A03 = r0
        L_0x012a:
            X.71b r14 = r6.A02
            int r13 = r18.getWidth()
            int r11 = r18.getHeight()
            X.69K r0 = r5.A04()
            if (r0 == 0) goto L_0x013c
            float r8 = r0.A03
        L_0x013c:
            X.6rw r0 = X.C1403571b.A00(r3, r13, r11)
            int r1 = r13 * r11
            float r1 = (float) r1
            float r1 = r1 * r8
            float r1 = r1 * r8
            int r8 = r0.A01
            int r0 = r0.A00
            int r8 = r8 * r0
            float r0 = (float) r8
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r9 = (int) r1
            X.0ve r8 = r14.A00
            r0 = 11317(0x2c35, float:1.5858E-41)
            int r17 = X.C18020vd.A00(r12, r8, r0)
            r0 = 11318(0x2c36, float:1.586E-41)
            int r15 = X.C18020vd.A00(r12, r8, r0)
            r0 = 11320(0x2c38, float:1.5863E-41)
            int r16 = X.C18020vd.A00(r12, r8, r0)
            r0 = 11321(0x2c39, float:1.5864E-41)
            int r1 = X.C18020vd.A00(r12, r8, r0)
            r0 = r17
            if (r9 >= r0) goto L_0x024e
            float r1 = (float) r15
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 * r0
            int r1 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            X.6rw r11 = new X.6rw
            r11.<init>(r0, r1, r15)
        L_0x017c:
            if (r30 == 0) goto L_0x0188
            int r0 = r18.getWidth()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r10.A07 = r0
        L_0x0188:
            if (r30 == 0) goto L_0x0194
            int r0 = r18.getHeight()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r10.A06 = r0
        L_0x0194:
            if (r19 == 0) goto L_0x01a9
            if (r30 == 0) goto L_0x01a9
            int r0 = r18.getWidth()
            double r0 = (double) r0
            int r8 = r18.getHeight()
            double r8 = (double) r8
            double r0 = r0 / r8
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A02 = r0
        L_0x01a9:
            if (r30 == 0) goto L_0x01b5
            java.lang.Integer r0 = r11.A02
            if (r0 == 0) goto L_0x024b
            java.lang.Long r0 = X.C17890vO.A0N(r0)
        L_0x01b3:
            r10.A08 = r0
        L_0x01b5:
            X.6xg r8 = X.C138786xg.A00
            X.118 r0 = r6.A00
            android.content.Context r9 = X.C108945cZ.A0E(r0)
            int r0 = r11.A01
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            int r0 = r11.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            X.1Lc r0 = r6.A03
            r10 = r18
            r11 = r0
            r14 = r25
            r15 = r24
            r16 = r23
            r17 = r22
            X.6cj r0 = r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.graphics.Bitmap r8 = r0.A00
            if (r5 == 0) goto L_0x0237
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "main-image-file"
            r1[r22] = r0
            boolean r0 = X.C1409573s.A03(r5, r1)
            if (r0 != r2) goto L_0x0237
        L_0x01ea:
            r18.recycle()
        L_0x01ed:
            if (r21 == 0) goto L_0x0221
            boolean r0 = r8.isMutable()
            X.C17960vV.A0C(r0)
            X.2E5 r10 = r6.A01
            r1 = r22
            r0 = r21
            com.whatsapp.filter.FilterUtils.A00(r8, r10, r0, r1)
            r0 = r26
            java.lang.Long r0 = r0.A0N
            if (r0 == 0) goto L_0x020d
            java.lang.Long r1 = X.C108995ce.A0T(r0)
            r0 = r26
            r0.A0N = r1
        L_0x020d:
            if (r5 == 0) goto L_0x0221
            X.69K r11 = r5.A04()
            if (r11 == 0) goto L_0x0221
            android.graphics.Bitmap r9 = r11.A01
            r1 = r22
            r0 = r21
            android.graphics.Bitmap r0 = com.whatsapp.filter.FilterUtils.A00(r9, r10, r0, r1)
            r11.A01 = r0
        L_0x0221:
            if (r5 == 0) goto L_0x02c8
            java.util.List r0 = r5.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0229:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02c0
            X.73u r0 = X.C108945cZ.A0k(r1)
            r0.A0G()
            goto L_0x0229
        L_0x0237:
            android.graphics.RectF r1 = X.C137316vG.A00(r18)
            android.graphics.RectF r0 = X.C137316vG.A00(r8)
            android.graphics.RectF r9 = X.C137316vG.A01(r1, r0)
            android.graphics.Canvas r1 = X.C108945cZ.A0I(r8)
            r1.drawBitmap(r10, r3, r9, r3)
            goto L_0x01ea
        L_0x024b:
            r0 = r3
            goto L_0x01b3
        L_0x024e:
            r0 = r16
            if (r9 >= r0) goto L_0x0262
            float r8 = (float) r1
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r8 = r8 * r0
            int r8 = (int) r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.6rw r11 = new X.6rw
            r11.<init>(r0, r8, r1)
            goto L_0x017c
        L_0x0262:
            r0 = 9735(0x2607, float:1.3642E-41)
            int r9 = X.C18020vd.A00(r12, r8, r0)
            r0 = 1580(0x62c, float:2.214E-42)
            int r1 = X.C18020vd.A00(r12, r8, r0)
            X.7mM r0 = new X.7mM
            r0.<init>(r14)
            X.6rw r11 = X.C1403571b.A01(r0, r13, r11, r9, r1)
            goto L_0x017c
        L_0x0279:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x010d
        L_0x027d:
            X.71b r12 = r6.A02
            int r11 = r18.getWidth()
            int r9 = r18.getHeight()
            X.0ve r13 = r12.A00
            r0 = 9735(0x2607, float:1.3642E-41)
            X.0vf r1 = X.C18040vf.A02
            int r8 = X.C18020vd.A00(r1, r13, r0)
            r0 = 1580(0x62c, float:2.214E-42)
            int r1 = X.C18020vd.A00(r1, r13, r0)
            X.7mM r0 = new X.7mM
            r0.<init>(r12)
            X.6rw r11 = X.C1403571b.A01(r0, r11, r9, r8, r1)
            goto L_0x017c
        L_0x02a2:
            android.graphics.Bitmap r8 = A00(r8, r7, r6)
            if (r8 != 0) goto L_0x01ed
            goto L_0x02e0
        L_0x02a9:
            X.00H r0 = r6.A04
            X.6ub r1 = X.C108945cZ.A0j(r0)
            r0 = 1
            r7 = r33
            r2 = r34
            X.6nF r7 = r1.A00(r7, r0, r2)
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            goto L_0x00d3
        L_0x02c0:
            r5.A07(r8)
            r0 = r26
            r5.A0A(r0)
        L_0x02c8:
            if (r20 == 0) goto L_0x02df
            r0 = r20
            int r1 = r0.x
            if (r1 <= 0) goto L_0x02df
            int r0 = r0.y
            if (r0 <= 0) goto L_0x02df
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createScaledBitmap(r8, r1, r0, r2)     // Catch:{ OutOfMemoryError -> 0x02d9 }
            goto L_0x02e0
        L_0x02d9:
            r1 = move-exception
            java.lang.String r0 = "ImageSendPrepHelper/getDrawingBitmap/cannot resize image"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02df:
            r11 = r8
        L_0x02e0:
            if (r11 != 0) goto L_0x02e6
            r8 = 0
        L_0x02e3:
            if (r8 != 0) goto L_0x032c
            return r3
        L_0x02e6:
            X.17r r5 = r6.A00
            if (r36 == 0) goto L_0x02f7
            java.lang.String r0 = X.C17890vO.A0Q()
        L_0x02ee:
            java.io.File r5 = r5.A0a(r0)
            android.net.Uri$Builder r8 = X.C108965cb.A06(r5)
            goto L_0x030d
        L_0x02f7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r27.toString()
            java.lang.String r0 = X.C17970vW.A04(r0)
            r1.append(r0)
            java.lang.String r0 = "-crop"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x02ee
        L_0x030d:
            int r1 = r7.A03     // Catch:{ IOException -> 0x0321 }
            boolean r0 = r7 instanceof X.C1194268b     // Catch:{ IOException -> 0x0321 }
            com.whatsapp.media.transcode.Mozjpeg r10 = X.C60892om.A00     // Catch:{ IOException -> 0x0321 }
            java.lang.String r12 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x0321 }
            r13 = r1
            r14 = r2
            r15 = r22
            r16 = r0
            r10.A00(r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x0321 }
            goto L_0x02e3
        L_0x0321:
            r1 = move-exception
            java.lang.String r0 = "PrepareAndSendMediaTask/can't compress bitmap"
            com.whatsapp.util.Log.e(r0, r1)
            r8 = 0
            goto L_0x02e3
        L_0x0329:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x032c:
            java.lang.String r1 = r4.A0E()
            if (r1 == 0) goto L_0x0337
            java.lang.String r0 = "caption"
            r8.appendQueryParameter(r0, r1)
        L_0x0337:
            java.lang.String r1 = r4.A0G()
            if (r1 == 0) goto L_0x0342
            java.lang.String r0 = "mentions"
            r8.appendQueryParameter(r0, r1)
        L_0x0342:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198069x.A02(android.net.Uri, X.63x, X.64U, X.72S, java.lang.Integer, boolean, boolean, boolean):android.net.Uri$Builder");
    }
}

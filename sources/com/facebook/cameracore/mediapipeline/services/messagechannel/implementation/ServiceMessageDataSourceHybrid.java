package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.AnonymousClass000;
import X.C18070vi;
import X.CPO;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class ServiceMessageDataSourceHybrid {
    public final CPO dataSource;
    public final HybridData mHybridData = initHybrid();

    public ServiceMessageDataSourceHybrid(CPO cpo) {
        C18070vi.A0d(cpo, 1);
        this.dataSource = cpo;
    }

    private final native HybridData initHybrid();

    public native void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2);

    public native void setConfiguration(int i, ByteBuffer byteBuffer, int i2);

    public static void A00(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw AnonymousClass000.A0k("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX WARNING: type inference failed for: r0v84, types: [X.CER, java.lang.Object] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 240 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void didReceiveFromXplat(int r20, byte[] r21) {
        /*
            r19 = this;
            r0 = r19
            X.CPO r0 = r0.dataSource
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r21)
            X.CJx r1 = r0.A02
            if (r1 == 0) goto L_0x0266
            X.CER r0 = X.CER.A00
            if (r0 != 0) goto L_0x0017
            X.CER r0 = new X.CER
            r0.<init>()
            X.CER.A00 = r0
        L_0x0017:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r0)
            int r0 = r6.position()
            int r5 = r6.getInt(r0)
            int r0 = r6.position()
            int r5 = r5 + r0
            int r0 = r6.getInt(r5)
            int r8 = r5 - r0
            short r7 = r6.getShort(r8)
            X.CK0 r4 = r1.A00
            r0 = 4
            if (r0 >= r7) goto L_0x0231
            int r0 = r8 + 4
            short r1 = r6.getShort(r0)
            if (r1 == 0) goto L_0x0231
            int r1 = r1 + r5
            int r0 = r6.getInt(r1)
            int r1 = r1 + r0
            int r13 = r6.getInt(r1)
            int r2 = r1 + 4
            boolean r0 = r6.hasArray()
            if (r0 == 0) goto L_0x013d
            byte[] r11 = r6.array()
            int r12 = r6.arrayOffset()
            int r12 = r12 + r2
            r1 = r12 | r13
            int r2 = r11.length
            int r0 = r2 - r12
            int r0 = r0 - r13
            r1 = r1 | r0
            r10 = 0
            r0 = 1
            if (r1 < 0) goto L_0x012c
            int r9 = r12 + r13
            char[] r3 = new char[r13]
            r1 = 0
        L_0x006b:
            if (r12 >= r9) goto L_0x007e
            byte r0 = r11[r12]
            if (r0 < 0) goto L_0x007e
            int r12 = r12 + 1
            int r2 = r1 + 1
            char r0 = (char) r0
            r3[r1] = r0
            r1 = r2
            goto L_0x006b
        L_0x007a:
            X.BE9.A14(r0, r13, r3, r1)
        L_0x007d:
            r1 = r14
        L_0x007e:
            if (r12 >= r9) goto L_0x0125
            int r2 = r12 + 1
            byte r0 = r11[r12]
            if (r0 < 0) goto L_0x009c
            int r14 = r1 + 1
            char r0 = (char) r0
            r3[r1] = r0
        L_0x008b:
            if (r2 >= r9) goto L_0x009a
            byte r0 = r11[r2]
            if (r0 < 0) goto L_0x009a
            int r2 = r2 + 1
            int r1 = r14 + 1
            char r0 = (char) r0
            r3[r14] = r0
            r14 = r1
            goto L_0x008b
        L_0x009a:
            r12 = r2
            goto L_0x007d
        L_0x009c:
            r12 = -32
            boolean r12 = X.AnonymousClass000.A1U(r0, r12)
            java.lang.String r18 = "Invalid UTF-8"
            if (r12 == 0) goto L_0x00bd
            if (r2 >= r9) goto L_0x0111
            int r12 = r2 + 1
            byte r13 = r11[r2]
            int r14 = r1 + 1
            r2 = -62
            if (r0 < r2) goto L_0x010a
            r2 = -65
            if (r13 <= r2) goto L_0x007a
            java.lang.String r0 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00bd:
            r12 = -16
            if (r0 >= r12) goto L_0x00d3
            int r12 = r9 + -1
            if (r2 >= r12) goto L_0x0116
            int r14 = r2 + 1
            byte r13 = r11[r2]
            int r12 = r14 + 1
            byte r2 = r11[r14]
            int r14 = r1 + 1
            A00(r0, r13, r2, r3, r1)
            goto L_0x007d
        L_0x00d3:
            int r12 = r9 + -2
            if (r2 >= r12) goto L_0x0120
            int r12 = r2 + 1
            byte r15 = r11[r2]
            int r2 = r12 + 1
            byte r14 = r11[r12]
            int r12 = r2 + 1
            byte r13 = r11[r2]
            int r17 = r1 + 1
            r2 = -65
            if (r15 > r2) goto L_0x011b
            int r16 = X.BE8.A05(r0, r15)
            if (r16 != 0) goto L_0x011b
            if (r14 > r2) goto L_0x011b
            if (r13 > r2) goto L_0x011b
            r0 = r0 & 7
            int r2 = r0 << 18
            r0 = r15 & 63
            int r0 = r0 << 12
            r2 = r2 | r0
            r0 = r14 & 63
            int r0 = r0 << 6
            r2 = r2 | r0
            r0 = r13 & 63
            X.BEB.A0j(r2, r0, r3, r1)
            int r1 = r17 + 1
            goto L_0x007e
        L_0x010a:
            java.lang.String r0 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0111:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r18)
            throw r0
        L_0x0116:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r18)
            throw r0
        L_0x011b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r18)
            throw r0
        L_0x0120:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r18)
            throw r0
        L_0x0125:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r10, r1)
            goto L_0x0238
        L_0x012c:
            java.lang.Object[] r1 = X.AnonymousClass8BR.A1a()
            X.BEA.A1V(r1, r2, r10, r12, r0)
            X.AnonymousClass3Ma.A1S(r1, r13)
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BE8.A0U(r0, r1)
            throw r0
        L_0x013d:
            r1 = r2 | r13
            int r0 = r6.limit()
            int r0 = r0 - r2
            int r0 = r0 - r13
            r1 = r1 | r0
            r3 = 0
            r9 = 1
            if (r1 < 0) goto L_0x021c
            int r11 = r2 + r13
            char[] r10 = new char[r13]
            r9 = 0
        L_0x014f:
            if (r2 >= r11) goto L_0x0160
            byte r0 = r6.get(r2)
            if (r0 < 0) goto L_0x0160
            int r2 = r2 + 1
            int r1 = r9 + 1
            char r0 = (char) r0
            r10[r9] = r0
            r9 = r1
            goto L_0x014f
        L_0x0160:
            if (r2 >= r11) goto L_0x0233
            int r12 = r2 + 1
            byte r15 = r6.get(r2)
            if (r15 < 0) goto L_0x0182
            int r13 = r9 + 1
            char r0 = (char) r15
            r10[r9] = r0
        L_0x016f:
            if (r12 >= r11) goto L_0x0180
            byte r0 = r6.get(r12)
            if (r0 < 0) goto L_0x0180
            int r12 = r12 + 1
            int r1 = r13 + 1
            char r0 = (char) r0
            r10[r13] = r0
            r13 = r1
            goto L_0x016f
        L_0x0180:
            r2 = r12
            goto L_0x01c2
        L_0x0182:
            r0 = -32
            boolean r0 = X.AnonymousClass000.A1U(r15, r0)
            java.lang.String r17 = "Invalid UTF-8"
            if (r0 == 0) goto L_0x01a5
            if (r12 >= r11) goto L_0x0208
            int r2 = r12 + 1
            byte r1 = r6.get(r12)
            int r13 = r9 + 1
            r0 = -62
            if (r15 < r0) goto L_0x0201
            r0 = -65
            if (r1 <= r0) goto L_0x01bf
            java.lang.String r0 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01a5:
            r0 = -16
            if (r15 >= r0) goto L_0x01c4
            int r0 = r11 + -1
            if (r12 >= r0) goto L_0x020d
            int r0 = r12 + 1
            byte r1 = r6.get(r12)
            int r2 = r0 + 1
            byte r0 = r6.get(r0)
            int r13 = r9 + 1
            A00(r15, r1, r0, r10, r9)
            goto L_0x01c2
        L_0x01bf:
            X.BE9.A14(r15, r1, r10, r9)
        L_0x01c2:
            r9 = r13
            goto L_0x0160
        L_0x01c4:
            int r0 = r11 + -2
            if (r12 >= r0) goto L_0x0217
            int r1 = r12 + 1
            byte r14 = r6.get(r12)
            int r0 = r1 + 1
            byte r13 = r6.get(r1)
            int r2 = r0 + 1
            byte r12 = r6.get(r0)
            int r16 = r9 + 1
            r1 = -65
            if (r14 > r1) goto L_0x0212
            int r0 = X.BE8.A05(r15, r14)
            if (r0 != 0) goto L_0x0212
            if (r13 > r1) goto L_0x0212
            if (r12 > r1) goto L_0x0212
            r0 = r15 & 7
            int r1 = r0 << 18
            r0 = r14 & 63
            int r0 = r0 << 12
            r1 = r1 | r0
            r0 = r13 & 63
            int r0 = r0 << 6
            r1 = r1 | r0
            r0 = r12 & 63
            X.BEB.A0j(r1, r0, r10, r9)
            int r9 = r16 + 1
            goto L_0x0160
        L_0x0201:
            java.lang.String r0 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0208:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r17)
            throw r0
        L_0x020d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r17)
            throw r0
        L_0x0212:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r17)
            throw r0
        L_0x0217:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r17)
            throw r0
        L_0x021c:
            java.lang.Object[] r1 = X.AnonymousClass8BR.A1a()
            int r0 = r6.limit()
            X.BEA.A1V(r1, r0, r3, r2, r9)
            X.AnonymousClass3Ma.A1S(r1, r13)
            java.lang.String r0 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BE8.A0U(r0, r1)
            throw r0
        L_0x0231:
            r0 = 0
            goto L_0x0238
        L_0x0233:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10, r3, r9)
        L_0x0238:
            java.io.IOException r3 = X.C17880vN.A0f(r0)
            r1 = 6
            r0 = 0
            if (r1 >= r7) goto L_0x0246
            int r0 = r8 + 6
            short r0 = r6.getShort(r0)
        L_0x0246:
            r1 = 0
            if (r0 == 0) goto L_0x0251
            int r0 = r0 + r5
            byte r0 = r6.get(r0)
            if (r0 == 0) goto L_0x0251
            r1 = 1
        L_0x0251:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onSegmentationLoadModelFailed, is multiclass: "
            java.lang.String r2 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.E4Y r1 = r4.A00
            java.lang.String r0 = "FbMsqrdRendererModelLoaderCallback"
            r1.CNX(r0, r2, r3)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid.didReceiveFromXplat(int, byte[]):void");
    }
}

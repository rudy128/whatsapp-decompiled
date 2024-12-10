package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9pi  reason: invalid class name and case insensitive filesystem */
public class C193209pi {
    public final A79 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0208, code lost:
        if (r11 != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0224, code lost:
        if ((r1 & 32) != 0) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0226, code lost:
        r3.A08 = r14.width_;
        r3.A06 = r14.height_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0238, code lost:
        if (r11 != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r12 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C166268cc r14, X.C438321c r15, int r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r2 = 1
            r0 = r16
            if (r0 != r2) goto L_0x001a
            if (r17 != 0) goto L_0x001a
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r14.caption_
            X.AnonymousClass8BU.A1D(r15, r0)
            return
        L_0x0015:
            X.1hd r0 = X.AnonymousClass8BT.A0b()
            throw r0
        L_0x001a:
            java.lang.String r1 = r14.accessibilityLabel_
            X.2rc r3 = new X.2rc
            r3.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002b
            r3.A0H = r1
            r15.A03 = r1
        L_0x002b:
            r15.A02 = r3
            X.205 r4 = r15.A0v
            X.1BI r0 = r4.A00
            boolean r12 = X.C22971Dz.A0V(r0)
            r8 = 0
            if (r17 != 0) goto L_0x003b
            r11 = 0
            if (r12 == 0) goto L_0x003c
        L_0x003b:
            r11 = 1
        L_0x003c:
            int r0 = r14.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016c
            X.DSQ r0 = r14.mediaKey_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x004e
            X.A3I.A00(r3, r15, r1)
        L_0x004e:
            int r5 = r14.bitField0_
            r0 = r5 & 1024(0x400, float:1.435E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x005f
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r9
            r3.A0B = r0
        L_0x005f:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r5
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r6 = 2
            if (r0 == 0) goto L_0x0098
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0154
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0154
            X.2Qz r0 = X.C49572Qz.IMAGE
            X.36w r5 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r14.thumbnailDirectPath_
            r5.A05 = r0
            X.DSQ r0 = r14.thumbnailSha256_
            byte[] r1 = r0.A06()
            X.DSQ r0 = r14.thumbnailEncSha256_
            X.AnonymousClass8BX.A14(r0, r5, r1)
            X.DSQ r0 = r14.mediaKey_
            byte[] r0 = r0.A06()
            r5.A0B = r0
            long r0 = r14.mediaKeyTimestamp_
            long r0 = r0 * r9
            r5.A02 = r0
        L_0x0095:
            X.C60502o8.A01(r15, r5)
        L_0x0098:
            X.EDj r0 = r14.scanLengths_
            int r5 = r0.size()
            int r1 = r14.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r7 = 32
            if (r0 == 0) goto L_0x011a
            if (r5 <= 0) goto L_0x011a
            X.DSQ r0 = r14.scansSidecar_
            byte[] r1 = r0.A06()
            int[] r10 = new int[r5]
            r9 = 0
        L_0x00b6:
            X.EDj r0 = r14.scanLengths_
            X.Bm7 r0 = (X.Bm7) r0
            X.Bm7.A00(r0, r9)
            int[] r0 = r0.A01
            r0 = r0[r9]
            r10[r9] = r0
            int r9 = r9 + 1
            if (r9 < r5) goto L_0x00b6
            if (r5 < r6) goto L_0x011a
            int r0 = r1.length
            int r0 = r0 / 10
            if (r0 != r5) goto L_0x011a
            X.36v r0 = r15.A17()
            X.C17960vV.A07(r0)
            r0.A04(r1, r10)
            int r1 = r14.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ee
            X.DSQ r0 = r14.midQualityFileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x00ee
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r3.A0O = r0
        L_0x00ee:
            int r1 = r14.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0104
            X.DSQ r0 = r14.midQualityFileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0104
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r3.A0N = r0
        L_0x0104:
            r9 = 10
            byte[] r5 = new byte[r9]
            X.DSQ r1 = r14.scansSidecar_
            int r0 = r1.A02()
            X.DSQ.A00(r8, r9, r0)
            r1.A05(r5, r9)
            r3.A0X = r5
            r0 = r10[r8]
            r3.A04 = r0
        L_0x011a:
            X.DSQ r0 = r14.jpegThumbnail_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            r5 = r18
            if (r0 > 0) goto L_0x0127
            if (r18 == 0) goto L_0x012c
        L_0x0127:
            r15.A02 = r2
            r15.A15(r1, r5)
        L_0x012c:
            java.lang.String r5 = "; message.key="
            if (r11 == 0) goto L_0x0136
            int r0 = r14.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0182
        L_0x0136:
            long r1 = r14.fileLength_
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x017c
            if (r12 != 0) goto L_0x017c
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/bogus media size received; fileLength="
            r3.append(r0)
            r3.append(r1)
            X.C17900vP.A0Z(r4, r5, r3)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        L_0x0154:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0098
            if (r12 == 0) goto L_0x0098
            X.2Qz r0 = X.C49572Qz.IMAGE
            X.36w r5 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r14.thumbnailDirectPath_
            r5.A05 = r0
            X.DSQ r0 = r14.thumbnailSha256_
            X.AnonymousClass8BV.A1A(r0, r5)
            goto L_0x0095
        L_0x016c:
            if (r11 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/missing media key; message.key="
            X.C17900vP.A0Z(r4, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x017c:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0182
            r15.A01 = r1
        L_0x0182:
            r8 = 14
            java.lang.String r2 = "FMessageImageCommon/bogus sha-256 hash received; length="
            if (r11 == 0) goto L_0x018e
            int r0 = r14.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x019d
        L_0x018e:
            X.DSQ r0 = r14.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x0247
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r15.A05 = r0
        L_0x019d:
            int r0 = r14.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b2
            X.DSQ r0 = r14.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r7) goto L_0x023b
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r6)
            r15.A08 = r0
        L_0x01b2:
            if (r12 != 0) goto L_0x01c0
            int r1 = r14.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = r14.staticUrl_
        L_0x01bd:
            r15.A1C(r0)
        L_0x01c0:
            java.lang.String r0 = r14.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01cd
            java.lang.String r0 = r14.caption_
            X.AnonymousClass8BU.A1D(r15, r0)
        L_0x01cd:
            if (r11 == 0) goto L_0x01d5
            int r0 = r14.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x020a
        L_0x01d5:
            java.lang.String r0 = "image/jpeg"
            java.lang.String r2 = r14.mimetype_
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0206
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0206
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r2)
            X.C17900vP.A0Z(r4, r5, r1)
            r0 = 17
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x01fd:
            if (r17 == 0) goto L_0x0203
            r0 = r1 & 1
            if (r0 == 0) goto L_0x01c0
        L_0x0203:
            java.lang.String r0 = r14.url_
            goto L_0x01bd
        L_0x0206:
            r15.A06 = r2
            if (r11 == 0) goto L_0x0234
        L_0x020a:
            int r0 = r14.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0234
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/message without direct path received; message.key="
            r1.append(r0)
            X.AnonymousClass8BY.A0z(r15, r4, r1)
        L_0x021c:
            int r1 = r14.bitField0_
            r0 = r1 & 64
            if (r0 == 0) goto L_0x022e
            r0 = r1 & 32
            if (r0 == 0) goto L_0x022e
        L_0x0226:
            int r0 = r14.width_
            r3.A08 = r0
            int r0 = r14.height_
            r3.A06 = r0
        L_0x022e:
            X.EE9 r0 = r14.annotations_
            X.C20133A8t.A08(r3, r0)
            return
        L_0x0234:
            java.lang.String r0 = r14.directPath_
            r3.A0J = r0
            if (r11 == 0) goto L_0x0226
            goto L_0x021c
        L_0x023b:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r2)
            X.C17900vP.A0Z(r4, r5, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r8)
            throw r0
        L_0x0247:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r2)
            X.C17900vP.A0Z(r4, r5, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193209pi.A02(X.8cc, X.21c, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r15 != false) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C163748We A00(X.C19998A2m r19, X.C163748We r20, X.C438321c r21) {
        /*
            r18 = this;
            r6 = r19
            boolean r17 = r6.A01()
            r8 = r21
            X.2rc r5 = r8.A02
            X.36u r16 = r8.A0O()
            X.205 r2 = r8.A0v
            X.1BI r0 = r2.A00
            boolean r15 = X.C22971Dz.A0V(r0)
            r7 = 0
            if (r17 != 0) goto L_0x001c
            r11 = 0
            if (r15 == 0) goto L_0x001d
        L_0x001c:
            r11 = 1
        L_0x001d:
            r14 = 16
            if (r5 == 0) goto L_0x038d
            if (r11 != 0) goto L_0x0027
            byte[] r0 = r5.A0a
            if (r0 == 0) goto L_0x038d
        L_0x0027:
            java.lang.String r10 = r5.A0H
            java.lang.String r1 = r8.A03
            if (r1 == 0) goto L_0x00bc
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r9 = X.AnonymousClass1EG.A0C(r1, r0)
        L_0x0033:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r4 = r20
            if (r0 != 0) goto L_0x00a5
            X.8cc r3 = X.AnonymousClass8BS.A0G(r4)
            r10.getClass()
            int r1 = r3.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.accessibilityLabel_ = r10
        L_0x004b:
            java.lang.String r9 = r8.A07
            boolean r0 = X.AnonymousClass21V.A0A(r9)
            if (r0 == 0) goto L_0x008d
            X.8cc r3 = X.AnonymousClass8BS.A0G(r4)
            r9.getClass()
            int r1 = r3.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.staticUrl_ = r9
        L_0x0063:
            boolean r0 = X.AnonymousClass21V.A0A(r9)
            java.lang.String r3 = "; message.key="
            if (r0 != 0) goto L_0x006d
            if (r11 != 0) goto L_0x00bf
        L_0x006d:
            boolean r0 = X.C20133A8t.A0D(r2, r9)
            if (r0 != 0) goto L_0x00bf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0Z(r2, r3, r1)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00bf
            r0 = 15
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x008d:
            if (r11 == 0) goto L_0x0095
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0063
        L_0x0095:
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            r9.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r9
            goto L_0x0063
        L_0x00a5:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x004b
            X.8cc r3 = X.AnonymousClass8BS.A0G(r4)
            r9.getClass()
            int r1 = r3.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r3.bitField0_ = r1
            r3.accessibilityLabel_ = r9
            goto L_0x004b
        L_0x00bc:
            r9 = 0
            goto L_0x0033
        L_0x00bf:
            java.lang.String r9 = r8.A06
            java.lang.String r10 = "image/jpeg"
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            if (r9 == 0) goto L_0x00f5
            r1.mimetype_ = r9
            boolean r0 = r10.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "image/png"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x00f7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0Z(r2, r3, r1)
            r0 = 17
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x00f5:
            r1.mimetype_ = r10
        L_0x00f7:
            java.lang.String r9 = r8.A18()
            if (r9 == 0) goto L_0x0109
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.caption_ = r9
        L_0x0109:
            r12 = 14
            r10 = 32
            if (r17 == 0) goto L_0x0117
            java.lang.String r0 = r8.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0144
        L_0x0117:
            java.lang.String r0 = r8.A05
            byte[] r0 = android.util.Base64.decode(r0, r7)
            int r11 = r0.length
            X.BmB r9 = X.DSQ.A01(r0, r7, r11)
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.fileSha256_ = r9
            if (r11 == r10) goto L_0x0144
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r11)
            X.C17900vP.A0Z(r2, r3, r1)
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r12)
            throw r0
        L_0x0144:
            java.lang.String r0 = r8.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = r8.A08
            byte[] r0 = android.util.Base64.decode(r0, r7)
            int r9 = r0.length
            X.BmB r7 = X.DSQ.A01(r0, r7, r9)
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r7
            if (r9 == r10) goto L_0x0179
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r9)
            X.C17900vP.A0Z(r2, r3, r1)
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r12)
            throw r0
        L_0x0179:
            r13 = 13
            r11 = 0
            if (r17 == 0) goto L_0x019d
            long r0 = r8.A01
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x019d
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r7 = "FMessageImageCommon/buildE2eMessage/image media size not set, size="
            r9.append(r7)
            r9.append(r0)
            X.C17900vP.A0Z(r2, r3, r9)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01cb
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r13)
            throw r0
        L_0x019d:
            long r0 = r8.A01
            X.8cc r9 = X.AnonymousClass8BS.A0G(r4)
            int r7 = r9.bitField0_
            r7 = r7 | 16
            r9.bitField0_ = r7
            r9.fileLength_ = r0
            if (r17 != 0) goto L_0x01cb
            long r0 = r8.A01
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01cb
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r7 = "FMessageImageCommon/buildE2eMessage/sending image with media size not set, size="
            r9.append(r7)
            r9.append(r0)
            X.C17900vP.A0Z(r2, r3, r9)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01cb
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r13)
            throw r0
        L_0x01cb:
            if (r15 != 0) goto L_0x0204
            if (r17 == 0) goto L_0x01d3
            byte[] r0 = r5.A0a
            if (r0 == 0) goto L_0x0204
        L_0x01d3:
            byte[] r0 = r5.A0a
            if (r0 == 0) goto L_0x01f2
            int r7 = r0.length
            if (r7 == r10) goto L_0x01f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length="
            r1.append(r0)
            r1.append(r7)
            X.C17900vP.A0Z(r2, r3, r1)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01f2
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r14)
            throw r0
        L_0x01f2:
            byte[] r0 = r5.A0a
            X.BmB r3 = X.C17900vP.A03(r4, r0)
            X.Bm6 r1 = r4.A00
            X.8cc r1 = (X.C166268cc) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.mediaKey_ = r3
        L_0x0204:
            long r0 = r5.A0B
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x021a
            long r0 = X.C17880vN.A04(r0)
            X.8cc r7 = X.AnonymousClass8BS.A0G(r4)
            int r3 = r7.bitField0_
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r7.bitField0_ = r3
            r7.mediaKeyTimestamp_ = r0
        L_0x021a:
            int r3 = r5.A06
            if (r3 <= 0) goto L_0x023e
            int r0 = r5.A08
            if (r0 <= 0) goto L_0x023e
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.height_ = r3
            int r3 = r5.A08
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cc r1 = (X.C166268cc) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.width_ = r3
        L_0x023e:
            java.lang.String r0 = r5.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0382
            java.lang.String r2 = r5.A0J
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x0257:
            X.36v r11 = r8.A17()
            if (r11 == 0) goto L_0x037f
            byte[] r2 = r11.A06()
            int[] r10 = r11.A07()
            if (r10 == 0) goto L_0x037f
            if (r2 == 0) goto L_0x037f
            int r9 = r10.length
            r0 = 2
            if (r9 < r0) goto L_0x037f
            int r1 = r2.length
            int r0 = r1 / 10
            if (r0 != r9) goto L_0x037f
            r0 = 0
            X.BmB r3 = X.DSQ.A01(r2, r0, r1)
            X.8cc r2 = X.AnonymousClass8BS.A0G(r4)
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.scansSidecar_ = r3
            r7 = 0
        L_0x0285:
            r3 = r10[r7]
            X.Bm6 r2 = X.C17880vN.A0G(r4)
            X.8cc r2 = (X.C166268cc) r2
            X.EDj r1 = r2.scanLengths_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x029c
            X.Bm7 r1 = X.C23577Bm6.A08(r1)
            r2.scanLengths_ = r1
        L_0x029c:
            r1.BBE(r3)
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x0285
            boolean r0 = r11.A04
            r7 = 1
            r7 = r7 ^ r0
            java.lang.String r0 = r5.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02c7
            java.lang.String r1 = r5.A0O
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)
            X.BmB r3 = X.C17900vP.A03(r4, r0)
            X.Bm6 r2 = r4.A00
            X.8cc r2 = (X.C166268cc) r2
            int r1 = r2.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.midQualityFileSha256_ = r3
        L_0x02c7:
            X.36w r8 = X.C60502o8.A00(r8)
            if (r8 == 0) goto L_0x031d
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = r8.A09
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = r8.A06
            if (r0 == 0) goto L_0x0359
            byte[] r1 = r8.A0B
            byte[] r0 = r5.A0a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0359
            long r2 = r8.A02
            long r0 = r5.A0B
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0359
            boolean r7 = r8.A0E
            java.lang.String r0 = r8.A05
            r4.A0G(r0)
            java.lang.String r0 = r8.A09
            r9 = 0
            byte[] r0 = android.util.Base64.decode(r0, r9)
            X.BmB r3 = X.AnonymousClass8BR.A0F(r0, r9)
            X.8cc r2 = X.AnonymousClass8BS.A0G(r4)
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailSha256_ = r3
            java.lang.String r0 = r8.A06
            X.BmB r3 = X.AnonymousClass8BW.A0B(r4, r0, r9)
            X.Bm6 r2 = r4.A00
            X.8cc r2 = (X.C166268cc) r2
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailEncSha256_ = r3
        L_0x031d:
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x033e
            byte[] r0 = r16.A01()
            if (r0 == 0) goto L_0x033e
            if (r7 == 0) goto L_0x033e
            byte[] r1 = r16.A01()
            r0 = 0
            X.BmB r2 = X.AnonymousClass8BR.A0F(r1, r0)
            X.8cc r1 = X.AnonymousClass8BS.A0G(r4)
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.jpegThumbnail_ = r2
        L_0x033e:
            java.util.ArrayList r3 = X.C20133A8t.A07(r5)
            X.8cc r2 = X.AnonymousClass8BS.A0G(r4)
            X.EE9 r1 = r2.annotations_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0355
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.annotations_ = r1
        L_0x0355:
            X.DND.A09(r3, r1)
            return r20
        L_0x0359:
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x031d
            java.lang.String r0 = r8.A09
            if (r0 == 0) goto L_0x031d
            if (r15 == 0) goto L_0x031d
            r4.A0G(r1)
            java.lang.String r0 = r8.A09
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)
            X.BmB r3 = X.AnonymousClass8BR.A0F(r0, r1)
            X.8cc r2 = X.AnonymousClass8BS.A0G(r4)
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailSha256_ = r3
            goto L_0x031d
        L_0x037f:
            r7 = 1
            goto L_0x02c7
        L_0x0382:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/sending image with directPath not set; message.key="
            X.C17900vP.A0Z(r2, r0, r1)
            goto L_0x0257
        L_0x038d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageImageCommon/buildE2eMessage/unable to send encrypted media message due to missing mediaKey; message.key="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; media_wa_type="
            X.AnonymousClass8BX.A1G(r8, r0, r1)
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x03a4
            r0 = 0
            return r0
        L_0x03a4:
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193209pi.A00(X.A2m, X.8We, X.21c):X.8We");
    }

    public C193209pi(A79 a79) {
        this.A00 = a79;
    }

    public C163748We A01(C19998A2m a2m, C163748We r5, C438321c r6) {
        C163748We A002 = A00(a2m, r5, r6);
        if (A002 != null && C19998A2m.A00(a2m, r6)) {
            C166278cd A04 = this.A00.A04(a2m, r6);
            C166268cc A0G = AnonymousClass8BS.A0G(A002);
            A04.getClass();
            A0G.contextInfo_ = A04;
            A0G.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        return A002;
    }
}

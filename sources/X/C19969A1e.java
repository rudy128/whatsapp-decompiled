package X;

/* renamed from: X.A1e  reason: case insensitive filesystem */
public class C19969A1e {
    public final C18030ve A00;
    public final A79 A01;

    public static void A00(C166248ca r4, AnonymousClass21W r5, int i, boolean z) {
        if (i != 1 || z) {
            C62572rc r3 = r5.A02;
            C17960vV.A07(r3);
            if ((r4.bitField0_ & 32) != 0) {
                byte[] A06 = r4.streamingSidecar_.A06();
                if (A06.length > 0) {
                    C693436v A17 = r5.A17();
                    C17960vV.A07(A17);
                    synchronized (A17) {
                        A17.A04(A06, (int[]) null);
                    }
                }
            }
            C20133A8t.A08(r3, r4.annotations_);
        }
    }

    /* JADX WARNING: type inference failed for: r0v43, types: [X.9gX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r11 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if ((r1 & 256) != 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        r6.A08 = r5.width_;
        r6.A06 = r5.height_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C166248ca r16, X.AnonymousClass21W r17, int r18, boolean r19, boolean r20) {
        /*
            r15 = this;
            r8 = 1
            r12 = r17
            r0 = r18
            r5 = r16
            if (r0 != r8) goto L_0x0019
            if (r19 != 0) goto L_0x0019
            java.lang.String r0 = r5.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = r5.caption_
            X.AnonymousClass8BU.A1D(r12, r0)
        L_0x0018:
            return
        L_0x0019:
            X.2rc r6 = new X.2rc
            r6.<init>()
            r12.A02 = r6
            X.205 r4 = r12.A0v
            X.1BI r0 = r4.A00
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r19 != 0) goto L_0x002d
            r11 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r11 = 1
        L_0x002e:
            int r0 = r5.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x01f4
            X.DSQ r0 = r5.mediaKey_
            byte[] r0 = r0.A06()
            X.A3I.A00(r6, r12, r0)
        L_0x003d:
            int r0 = r5.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x004e
            long r0 = r5.mediaKeyTimestamp_
            long r0 = r0 * r13
            r6.A0B = r0
        L_0x004e:
            X.DSQ r0 = r5.jpegThumbnail_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x005e
            r12.A02 = r8
            r0 = r20
            r12.A15(r1, r0)
        L_0x005e:
            java.lang.String r7 = "; message.key="
            if (r11 == 0) goto L_0x0068
            int r0 = r5.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0074
        L_0x0068:
            long r2 = r5.fileLength_
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x023d
            r12.A01 = r2
            if (r11 == 0) goto L_0x007e
        L_0x0074:
            int r1 = r5.bitField0_
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0086
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0086
        L_0x007e:
            int r0 = r5.width_
            r6.A08 = r0
            int r0 = r5.height_
            r6.A06 = r0
        L_0x0086:
            r10 = 14
            java.lang.String r9 = "FMessageVideoCommon/bogus sha-256 hash received; length="
            r3 = 32
            r2 = 2
            if (r11 == 0) goto L_0x0095
            int r0 = r5.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00a4
        L_0x0095:
            X.DSQ r0 = r5.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r3) goto L_0x0231
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r2)
            r12.A05 = r0
        L_0x00a4:
            int r0 = r5.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00b9
            X.DSQ r0 = r5.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r3) goto L_0x0225
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r2)
            r12.A08 = r0
        L_0x00b9:
            if (r11 == 0) goto L_0x00c1
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00cd
        L_0x00c1:
            java.lang.String r0 = r5.mimetype_
            java.lang.String r0 = X.AnonymousClass1SO.A08(r0, r8)
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = r5.mimetype_
            r12.A06 = r0
        L_0x00cd:
            int r1 = r5.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = r5.staticUrl_
        L_0x00d6:
            r12.A1C(r0)
        L_0x00d9:
            java.lang.String r0 = r5.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = r5.caption_
            X.AnonymousClass8BU.A1D(r12, r0)
        L_0x00e6:
            java.lang.String r1 = r5.accessibilityLabel_
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00f2
            r12.A03 = r1
            r6.A0H = r1
        L_0x00f2:
            if (r11 == 0) goto L_0x01e4
            int r0 = r5.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x01e4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key="
            X.C17900vP.A0Z(r4, r0, r1)
        L_0x0103:
            int r1 = r5.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0139
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01c8
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01c8
            X.2Qz r0 = X.C49572Qz.VIDEO
            X.36w r2 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r5.thumbnailDirectPath_
            r2.A05 = r0
            X.DSQ r0 = r5.thumbnailSha256_
            byte[] r1 = r0.A06()
            X.DSQ r0 = r5.thumbnailEncSha256_
            X.AnonymousClass8BX.A14(r0, r2, r1)
            X.DSQ r0 = r5.mediaKey_
            byte[] r0 = r0.A06()
            r2.A0B = r0
            long r0 = r5.mediaKeyTimestamp_
            long r0 = r0 * r13
            r2.A02 = r0
        L_0x0136:
            X.C60502o8.A01(r12, r2)
        L_0x0139:
            int r0 = r5.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01c5
            int r0 = r5.seconds_
        L_0x0141:
            r12.A0D = r0
            X.EE9 r0 = r5.annotations_
            X.C20133A8t.A08(r6, r0)
            X.EE9 r3 = r5.processedVideos_
            if (r3 == 0) goto L_0x0018
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0018
            X.0ve r2 = r15.A00
            r1 = 9095(0x2387, float:1.2745E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0018
            java.util.ArrayList r13 = X.AnonymousClass000.A14(r3)
            java.util.Iterator r14 = r3.iterator()
        L_0x0166:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0209
            java.lang.Object r9 = r14.next()
            X.8by r9 = (X.C165918by) r9
            if (r9 == 0) goto L_0x0166
            int r4 = r9.height_
            if (r4 <= 0) goto L_0x0166
            int r3 = r9.width_
            if (r3 <= 0) goto L_0x0166
            int r0 = r9.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0166
            long r7 = r9.fileLength_
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0166
            java.lang.String r11 = r9.directPath_
            long r5 = (long) r4
            long r3 = (long) r3
            int r0 = r9.bitrate_
            long r1 = (long) r0
            int r0 = r9.quality_
            X.9KM r0 = X.AnonymousClass9KM.A00(r0)
            if (r0 != 0) goto L_0x019b
            X.9KM r0 = X.AnonymousClass9KM.UNDEFINED
        L_0x019b:
            int r0 = r0.value
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = X.C181059Oz.A00(r0)
            X.EE9 r9 = r9.capabilities_
            r0 = 1
            X.C18070vi.A0d(r11, r0)
            X.C18070vi.A0l(r10, r9)
            X.9gX r0 = new X.9gX
            r0.<init>()
            r0.A05 = r11
            r0.A02 = r5
            r0.A03 = r3
            r0.A01 = r7
            r0.A00 = r1
            r0.A04 = r10
            r0.A06 = r9
            r13.add(r0)
            goto L_0x0166
        L_0x01c5:
            r0 = 0
            goto L_0x0141
        L_0x01c8:
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0139
            boolean r0 = r12.A0w()
            if (r0 == 0) goto L_0x0139
            X.2Qz r0 = X.C49572Qz.VIDEO
            X.36w r2 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r5.thumbnailDirectPath_
            r2.A05 = r0
            X.DSQ r0 = r5.thumbnailSha256_
            X.AnonymousClass8BV.A1A(r0, r2)
            goto L_0x0136
        L_0x01e4:
            java.lang.String r0 = r5.directPath_
            r6.A0J = r0
            goto L_0x0103
        L_0x01ea:
            if (r11 == 0) goto L_0x01f0
            r0 = r1 & 1
            if (r0 == 0) goto L_0x00d9
        L_0x01f0:
            java.lang.String r0 = r5.url_
            goto L_0x00d6
        L_0x01f4:
            if (r11 != 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/missing media key; message.key="
            X.C17900vP.A0Z(r4, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x0204:
            X.1hd r0 = X.AnonymousClass8BT.A0b()
            throw r0
        L_0x0209:
            r12.A1H(r13)
            return
        L_0x020d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r5.mimetype_
            r1.append(r0)
            X.C17900vP.A0Z(r4, r7, r1)
            r0 = 17
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x0225:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r9)
            X.C17900vP.A0Z(r4, r7, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r10)
            throw r0
        L_0x0231:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r9)
            X.C17900vP.A0Z(r4, r7, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r10)
            throw r0
        L_0x023d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/bogus media size received; file_length="
            r1.append(r0)
            r1.append(r2)
            X.C17900vP.A0Z(r4, r7, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19969A1e.A03(X.8ca, X.21W, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (X.C22971Dz.A0V(r6.A0v.A00) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b9, code lost:
        if (r6.A0D > 0) goto L_0x01bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0437  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C163928Ww A01(X.C19998A2m r19, X.C163928Ww r20, X.AnonymousClass21W r21) {
        /*
            r18 = this;
            r8 = r19
            boolean r17 = r8.A01()
            boolean r10 = r8.A05
            X.1cl r9 = r8.A02
            byte[] r5 = r8.A0G
            boolean r2 = r8.A04
            r6 = r21
            X.2rc r4 = r6.A02
            X.36u r16 = r6.A0O()
            r12 = 0
            if (r17 != 0) goto L_0x0024
            X.205 r0 = r6.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0V(r0)
            r15 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r15 = 1
        L_0x0025:
            r11 = 16
            if (r4 == 0) goto L_0x0441
            if (r15 != 0) goto L_0x002f
            byte[] r0 = r4.A0a
            if (r0 == 0) goto L_0x0441
        L_0x002f:
            byte[] r1 = r4.A0a
            r0 = 32
            java.lang.String r3 = "; message.key="
            if (r1 == 0) goto L_0x0050
            int r7 = r1.length
            if (r7 == r0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r7)
            X.AnonymousClass8BX.A1F(r6, r3, r1)
            if (r2 == 0) goto L_0x0050
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r11)
            throw r0
        L_0x0050:
            java.lang.String r11 = r6.A07
            boolean r0 = X.AnonymousClass21V.A0A(r11)
            r7 = r20
            if (r0 == 0) goto L_0x0092
            X.8ca r13 = X.AnonymousClass8BS.A0L(r7)
            r11.getClass()
            int r1 = r13.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r13.bitField0_ = r1
            r13.staticUrl_ = r11
        L_0x006a:
            boolean r0 = X.AnonymousClass21V.A0A(r11)
            if (r0 != 0) goto L_0x0072
            if (r15 != 0) goto L_0x00bf
        L_0x0072:
            X.205 r13 = r6.A0v
            boolean r0 = X.C20133A8t.A0D(r13, r11)
            if (r0 != 0) goto L_0x00bf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending image with invalid url"
            r1.append(r0)
            r1.append(r11)
            X.C17900vP.A0Z(r13, r3, r1)
            if (r2 == 0) goto L_0x00bf
            r0 = 15
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x0092:
            if (r15 == 0) goto L_0x009c
            java.lang.String r0 = r6.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006a
        L_0x009c:
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            r11.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r11
            if (r15 != 0) goto L_0x006a
            java.lang.String r0 = r6.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/sending video with url not set; message.key="
            X.AnonymousClass8BX.A1F(r6, r0, r1)
            goto L_0x006a
        L_0x00bf:
            java.lang.String r11 = r6.A06
            if (r17 == 0) goto L_0x00c9
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0105
        L_0x00c9:
            if (r15 != 0) goto L_0x00f6
            X.C17960vV.A07(r11)
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00f6
            if (r2 == 0) goto L_0x00f6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/unrecognized video mime type; mimeType="
            r1.append(r0)
            r1.append(r11)
            X.AnonymousClass8BX.A1F(r6, r3, r1)
            r0 = 17
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x00f6:
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            r11.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r11
        L_0x0105:
            r13 = 14
            if (r17 == 0) goto L_0x0111
            java.lang.String r0 = r6.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0144
        L_0x0111:
            java.lang.String r0 = r6.A05
            byte[] r1 = android.util.Base64.decode(r0, r12)
            if (r15 != 0) goto L_0x0134
            int r11 = r1.length
            r0 = 32
            if (r11 == r0) goto L_0x0134
            if (r2 == 0) goto L_0x0134
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r11)
            X.AnonymousClass8BX.A1F(r6, r3, r1)
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r13)
            throw r0
        L_0x0134:
            X.BmB r11 = X.AnonymousClass8BR.A0F(r1, r12)
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r11
        L_0x0144:
            java.lang.String r0 = r6.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x017f
            java.lang.String r0 = r6.A08
            byte[] r1 = android.util.Base64.decode(r0, r12)
            if (r15 != 0) goto L_0x016f
            int r11 = r1.length
            r0 = 32
            if (r11 == r0) goto L_0x016f
            if (r2 == 0) goto L_0x016f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/bogus enc sha-256 hash; length="
            r1.append(r0)
            r1.append(r11)
            X.AnonymousClass8BX.A1F(r6, r3, r1)
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r13)
            throw r0
        L_0x016f:
            X.BmB r11 = X.AnonymousClass8BR.A0F(r1, r12)
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r11
        L_0x017f:
            r13 = 0
            if (r17 == 0) goto L_0x0189
            long r0 = r6.A01
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x01b7
        L_0x0189:
            long r0 = r6.A01
            X.8ca r12 = X.AnonymousClass8BS.A0L(r7)
            int r11 = r12.bitField0_
            r11 = r11 | 8
            r12.bitField0_ = r11
            r12.fileLength_ = r0
            if (r17 != 0) goto L_0x01b7
            long r0 = r6.A01
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x01bb
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r11 = "FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size="
            r12.append(r11)
            r12.append(r0)
            X.AnonymousClass8BX.A1F(r6, r3, r12)
            if (r2 == 0) goto L_0x01bb
            r0 = 13
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x01b7:
            int r0 = r6.A0D
            if (r0 <= 0) goto L_0x01c9
        L_0x01bb:
            int r2 = r6.A0D
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r2
        L_0x01c9:
            java.lang.String r2 = r6.A18()
            if (r2 == 0) goto L_0x01db
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r2
        L_0x01db:
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x01f4
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r3 = X.AnonymousClass1EG.A0C(r1, r0)
            if (r3 == 0) goto L_0x01f4
            X.8ca r2 = X.AnonymousClass8BS.A0L(r7)
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.accessibilityLabel_ = r3
        L_0x01f4:
            if (r15 == 0) goto L_0x01fa
            byte[] r0 = r4.A0a
            if (r0 == 0) goto L_0x020e
        L_0x01fa:
            byte[] r0 = r4.A0a
            X.BmB r2 = X.C17900vP.A03(r7, r0)
            X.Bm6 r1 = r7.A00
            X.8ca r1 = (X.C166248ca) r1
            int r0 = X.C166248ca.ACCESSIBILITY_LABEL_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.mediaKey_ = r2
        L_0x020e:
            long r0 = r4.A0B
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x0224
            long r0 = X.C17880vN.A04(r0)
            X.8ca r3 = X.AnonymousClass8BS.A0L(r7)
            int r2 = r3.bitField0_
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r3.bitField0_ = r2
            r3.mediaKeyTimestamp_ = r0
        L_0x0224:
            X.36w r11 = X.C60502o8.A00(r6)
            if (r11 == 0) goto L_0x0421
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x03f8
            java.lang.String r0 = r11.A09
            if (r0 == 0) goto L_0x03f8
            java.lang.String r0 = r11.A06
            if (r0 == 0) goto L_0x03f8
            byte[] r1 = r11.A0B
            byte[] r0 = r4.A0a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x03f8
            long r2 = r11.A02
            long r0 = r4.A0B
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x03f8
            boolean r12 = r11.A0E
            java.lang.String r0 = r11.A05
            r7.A0H(r0)
            java.lang.String r0 = r11.A09
            r13 = 0
            byte[] r0 = android.util.Base64.decode(r0, r13)
            X.BmB r3 = X.AnonymousClass8BR.A0F(r0, r13)
            X.8ca r2 = X.AnonymousClass8BS.A0L(r7)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailSha256_ = r3
            java.lang.String r0 = r11.A06
            X.BmB r3 = X.AnonymousClass8BW.A0B(r7, r0, r13)
            X.Bm6 r2 = r7.A00
            X.8ca r2 = (X.C166248ca) r2
            int r1 = r2.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailEncSha256_ = r3
        L_0x027a:
            if (r10 != 0) goto L_0x03ed
            byte[] r0 = r16.A01()
            if (r0 == 0) goto L_0x03ed
            if (r12 == 0) goto L_0x03ed
            byte[] r0 = r16.A01()
            X.BmB r2 = X.C17900vP.A03(r7, r0)
            X.Bm6 r1 = r7.A00
            X.8ca r1 = (X.C166248ca) r1
            int r0 = X.C166248ca.ACCESSIBILITY_LABEL_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.jpegThumbnail_ = r2
        L_0x029a:
            boolean r0 = X.A79.A03(r9, r6, r5)
            r5 = r18
            if (r0 == 0) goto L_0x02b7
            X.A79 r0 = r5.A01
            X.8cd r0 = r0.A04(r8, r6)
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x02b7:
            int r2 = r4.A06
            if (r2 <= 0) goto L_0x02db
            int r0 = r4.A08
            if (r0 <= 0) goto L_0x02db
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.height_ = r2
            int r2 = r4.A08
            X.Bm6 r1 = X.C17880vN.A0G(r7)
            X.8ca r1 = (X.C166248ca) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.width_ = r2
        L_0x02db:
            java.lang.String r0 = r4.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03dd
            java.lang.String r2 = r4.A0J
            X.8ca r1 = X.AnonymousClass8BS.A0L(r7)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x02f4:
            java.util.ArrayList r3 = X.C20133A8t.A07(r4)
            X.8ca r2 = X.AnonymousClass8BS.A0L(r7)
            X.EE9 r1 = r2.annotations_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x030b
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.annotations_ = r1
        L_0x030b:
            X.DND.A09(r3, r1)
            java.util.List r0 = r6.A1G()
            boolean r0 = X.C137476vW.A00(r0)
            if (r0 != 0) goto L_0x0424
            X.0ve r2 = r5.A00
            r1 = 9096(0x2388, float:1.2746E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0424
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.List r0 = r6.A1G()
            java.util.Iterator r8 = r0.iterator()
        L_0x0330:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0428
            java.lang.Object r3 = r8.next()
            X.9gX r3 = (X.C187889gX) r3
            if (r3 == 0) goto L_0x0330
            X.8by r0 = X.C165918by.DEFAULT_INSTANCE
            X.Bmt r6 = r0.A0N()
            long r0 = r3.A02
            int r2 = (int) r0
            X.Bm6 r1 = X.C17880vN.A0G(r6)
            X.8by r1 = (X.C165918by) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.height_ = r2
            long r0 = r3.A03
            int r2 = (int) r0
            X.Bm6 r1 = X.C17880vN.A0G(r6)
            X.8by r1 = (X.C165918by) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.width_ = r2
            java.lang.String r2 = r3.A05
            X.Bm6 r1 = X.C17880vN.A0G(r6)
            X.8by r1 = (X.C165918by) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.directPath_ = r2
            long r1 = r3.A01
            X.Bm6 r5 = X.C17880vN.A0G(r6)
            X.8by r5 = (X.C165918by) r5
            int r0 = r5.bitField0_
            r0 = r0 | 16
            r5.bitField0_ = r0
            r5.fileLength_ = r1
            long r0 = r3.A00
            int r2 = (int) r0
            X.Bm6 r1 = X.C17880vN.A0G(r6)
            X.8by r1 = (X.C165918by) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.bitrate_ = r2
            java.lang.Integer r0 = r3.A04
            long r1 = X.AnonymousClass9P0.A00(r0)
            int r0 = (int) r1
            X.9KM r0 = X.AnonymousClass9KM.A00(r0)
            if (r0 == 0) goto L_0x03b4
            X.Bm6 r1 = X.C17880vN.A0G(r6)
            X.8by r1 = (X.C165918by) r1
            int r0 = r0.value
            r1.quality_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
        L_0x03b4:
            java.util.List r3 = r3.A06
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x03d4
            X.Bm6 r2 = X.C17880vN.A0G(r6)
            X.8by r2 = (X.C165918by) r2
            X.EE9 r1 = r2.capabilities_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x03d1
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.capabilities_ = r1
        L_0x03d1:
            X.DND.A09(r3, r1)
        L_0x03d4:
            X.Bm6 r0 = r6.A0C()
            r4.add(r0)
            goto L_0x0330
        L_0x03dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/message without direct path received; message.key="
            r1.append(r0)
            X.205 r0 = r6.A0v
            X.AnonymousClass8BY.A0z(r6, r0, r1)
            goto L_0x02f4
        L_0x03ed:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key="
            X.AnonymousClass8BX.A1F(r6, r0, r1)
            goto L_0x029a
        L_0x03f8:
            java.lang.String r1 = r11.A05
            if (r1 == 0) goto L_0x0421
            java.lang.String r0 = r11.A09
            if (r0 == 0) goto L_0x0421
            boolean r0 = r6.A0w()
            if (r0 == 0) goto L_0x0421
            r7.A0H(r1)
            java.lang.String r0 = r11.A09
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)
            X.BmB r3 = X.AnonymousClass8BR.A0F(r0, r1)
            X.8ca r2 = X.AnonymousClass8BS.A0L(r7)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.thumbnailSha256_ = r3
        L_0x0421:
            r12 = 1
            goto L_0x027a
        L_0x0424:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x0428:
            X.Bm6 r2 = X.C17880vN.A0G(r7)
            X.8ca r2 = (X.C166248ca) r2
            X.EE9 r1 = r2.processedVideos_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x043d
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.processedVideos_ = r1
        L_0x043d:
            X.DND.A09(r4, r1)
            return r20
        L_0x0441:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageVideoCommon/unable to send encrypted media message due to missing mediaKey; message.key="
            X.AnonymousClass8BY.A10(r6, r0, r1)
            if (r2 != 0) goto L_0x044e
            r0 = 0
            return r0
        L_0x044e:
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19969A1e.A01(X.A2m, X.8Ww, X.21W):X.8Ww");
    }

    public C19969A1e(C18030ve r1, A79 a79) {
        this.A00 = r1;
        this.A01 = a79;
    }

    public void A02(C19998A2m a2m, C163928Ww r6, AnonymousClass21W r7) {
        C163928Ww A012 = A01(a2m, r6, r7);
        C62572rc r1 = r7.A02;
        boolean A0V = C22971Dz.A0V(r7.A0v.A00);
        if (r1 == null || A012 == null || (!A0V && !a2m.A01() && r1.A0a == null)) {
            AnonymousClass8BX.A1G(r7, "FMessageVideo/unable to send encrypted media message due to missing; media_wa_type=", AnonymousClass000.A10());
            return;
        }
        C693436v A17 = r7.A17();
        C17960vV.A07(A17);
        byte[] A06 = A17.A06();
        if (A06 != null) {
            C23581BmB A0F = AnonymousClass8BR.A0F(A06, 0);
            C166248ca A0L = AnonymousClass8BS.A0L(A012);
            A0L.bitField0_ |= 32768;
            A0L.streamingSidecar_ = A0F;
        }
    }
}

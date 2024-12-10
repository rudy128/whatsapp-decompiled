package X;

/* renamed from: X.9o8  reason: invalid class name and case insensitive filesystem */
public class C192299o8 {
    public final C18030ve A00;
    public final A79 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r13.A0w() != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C166208cW r12, X.C438921i r13, int r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r4 = 1
            if (r14 != r4) goto L_0x0013
            if (r15 != 0) goto L_0x0013
            java.lang.String r0 = r12.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0177
            java.lang.String r0 = r12.caption_
            r13.A1H(r0)
        L_0x0012:
            return
        L_0x0013:
            X.2rc r1 = new X.2rc
            r1.<init>()
            r13.A02 = r1
            if (r15 != 0) goto L_0x0023
            boolean r0 = r13.A0w()
            r10 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r10 = 1
        L_0x0024:
            int r0 = r12.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0167
            X.DSQ r0 = r12.mediaKey_
            byte[] r0 = r0.A06()
            X.A3I.A00(r1, r13, r0)
        L_0x0033:
            int r0 = r12.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0044
            long r2 = r12.mediaKeyTimestamp_
            long r2 = r2 * r8
            r1.A0B = r2
        L_0x0044:
            X.DSQ r0 = r12.jpegThumbnail_
            byte[] r2 = r0.A06()
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0054
            r13.A02 = r4
            r0 = r16
            r13.A15(r2, r0)
        L_0x0054:
            java.lang.String r4 = "; message.key="
            if (r10 == 0) goto L_0x005e
            int r0 = r12.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0068
        L_0x005e:
            long r2 = r12.fileLength_
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0194
            r13.A01 = r2
        L_0x0068:
            r7 = 14
            java.lang.String r6 = "FMessageDocument/bogus sha-256 hash received; length="
            r5 = 32
            r2 = 2
            if (r10 == 0) goto L_0x0077
            int r0 = r12.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0086
        L_0x0077:
            X.DSQ r0 = r12.fileSha256_
            byte[] r3 = r0.A06()
            int r0 = r3.length
            if (r0 != r5) goto L_0x0188
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            r13.A05 = r0
        L_0x0086:
            int r0 = r12.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x009b
            X.DSQ r0 = r12.fileEncSha256_
            byte[] r3 = r0.A06()
            int r0 = r3.length
            if (r0 != r5) goto L_0x017c
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)
            r13.A08 = r0
        L_0x009b:
            if (r10 == 0) goto L_0x00a3
            int r0 = r12.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00a8
        L_0x00a3:
            java.lang.String r0 = r12.url_
            r13.A1C(r0)
        L_0x00a8:
            java.lang.String r0 = r12.title_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = r12.title_
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r0, r3)
            r13.A04 = r0
        L_0x00ba:
            int r0 = r12.pageCount_
            r13.A00 = r0
            java.lang.String r0 = r12.caption_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = r12.caption_
            r13.A1H(r0)
        L_0x00cb:
            java.lang.String r0 = r12.fileName_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = r12.fileName_
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r0, r3)
            r13.A09 = r0
        L_0x00db:
            if (r10 == 0) goto L_0x0162
            int r0 = r12.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0162
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            r1.append(r0)
            X.205 r0 = r13.A0v
            X.AnonymousClass8BY.A0z(r13, r0, r1)
        L_0x00f1:
            int r1 = r12.bitField0_
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0156
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0156
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0156
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0156
            X.2Qz r0 = X.C49572Qz.DOCUMENT
            X.36w r3 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r12.thumbnailDirectPath_
            r3.A05 = r0
            X.DSQ r0 = r12.thumbnailSha256_
            X.AnonymousClass8BV.A1A(r0, r3)
            X.DSQ r0 = r12.thumbnailEncSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)
            r3.A06 = r0
            X.DSQ r0 = r12.mediaKey_
            byte[] r0 = r0.A06()
            r3.A0B = r0
            int r2 = r12.bitField0_
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0131
            long r0 = r12.mediaKeyTimestamp_
            long r0 = r0 * r8
            r3.A02 = r0
        L_0x0131:
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x013f
            X.DSQ r0 = r12.jpegThumbnail_
            byte[] r0 = r0.A06()
            r3.A0C = r0
        L_0x013f:
            int r1 = r12.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x014a
            int r0 = r12.thumbnailWidth_
            r3.A01 = r0
        L_0x014a:
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0153
            int r0 = r12.thumbnailHeight_
            r3.A00 = r0
        L_0x0153:
            X.C60502o8.A01(r13, r3)
        L_0x0156:
            java.lang.String r0 = r12.mimetype_
            r13.A06 = r0
            boolean r0 = r12.contactVcard_
            if (r0 == 0) goto L_0x0012
            r0 = 7
            r13.A09 = r0
            return
        L_0x0162:
            java.lang.String r0 = r12.directPath_
            r1.A0J = r0
            goto L_0x00f1
        L_0x0167:
            if (r10 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/missing media key; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x0177:
            X.1hd r0 = X.AnonymousClass8BT.A0b()
            throw r0
        L_0x017c:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.AnonymousClass8BX.A1F(r13, r4, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r7)
            throw r0
        L_0x0188:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.AnonymousClass8BX.A1F(r13, r4, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r7)
            throw r0
        L_0x0194:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/bogus media size received; file_length="
            r1.append(r0)
            r1.append(r2)
            X.AnonymousClass8BX.A1F(r13, r4, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192299o8.A01(X.8cW, X.21i, int, boolean, boolean):void");
    }

    public C192299o8(C18030ve r1, A79 a79) {
        this.A00 = r1;
        this.A01 = a79;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015c, code lost:
        if (r3.A0w() != false) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C62572rc r13, X.C19998A2m r14, X.C162748Si r15, X.C693336u r16, X.C438921i r17) {
        /*
            r12 = this;
            boolean r11 = r14.A01()
            boolean r8 = r14.A05
            X.1cl r7 = r14.A02
            byte[] r6 = r14.A0G
            r3 = r17
            if (r11 == 0) goto L_0x0016
            java.lang.String r0 = r3.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003a
        L_0x0016:
            java.lang.String r2 = r3.A07
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r2
            if (r11 != 0) goto L_0x003a
            java.lang.String r0 = r3.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with url not set; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r1)
        L_0x003a:
            java.lang.String r2 = r3.A06
            if (r2 == 0) goto L_0x004a
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        L_0x004a:
            java.lang.String r2 = r3.A18()
            if (r2 == 0) goto L_0x005c
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.title_ = r2
        L_0x005c:
            java.lang.String r0 = r3.A19()
            if (r0 == 0) goto L_0x0075
            java.lang.String r2 = r3.A19()
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileName_ = r2
        L_0x0075:
            if (r11 == 0) goto L_0x007b
            int r0 = r3.A00
            if (r0 < 0) goto L_0x0089
        L_0x007b:
            int r2 = r3.A00
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.pageCount_ = r2
        L_0x0089:
            java.lang.String r4 = r3.A01
            if (r4 == 0) goto L_0x009a
            X.8cW r2 = X.AnonymousClass8BT.A0X(r15)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.caption_ = r4
        L_0x009a:
            r2 = 0
            if (r11 == 0) goto L_0x00a5
            java.lang.String r0 = r3.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dc
        L_0x00a5:
            java.lang.String r0 = r3.A05
            byte[] r5 = android.util.Base64.decode(r0, r2)
            int r4 = r5.length
            r0 = 32
            if (r4 == r0) goto L_0x00cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r1)
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00cc
            r0 = 14
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x00cc:
            X.BmB r4 = X.DSQ.A01(r5, r2, r4)
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.fileSha256_ = r4
        L_0x00dc:
            java.lang.String r0 = r3.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = r3.A08
            byte[] r5 = android.util.Base64.decode(r0, r2)
            int r4 = r5.length
            r0 = 32
            if (r4 == r0) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r1)
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x010b
            r0 = 14
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x010b:
            X.BmB r4 = X.DSQ.A01(r5, r2, r4)
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r4
        L_0x011b:
            r9 = 0
            if (r11 == 0) goto L_0x0125
            long r0 = r3.A01
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x015e
        L_0x0125:
            long r0 = r3.A01
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0147
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "FMessageDocument/buildE2eMessage/sending document with media size not set, size="
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r5)
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x0147
            r0 = 13
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x0147:
            long r0 = r3.A01
            X.8cW r5 = X.AnonymousClass8BT.A0X(r15)
            int r4 = r5.bitField0_
            r4 = r4 | 16
            r5.bitField0_ = r4
            r5.fileLength_ = r0
            if (r11 != 0) goto L_0x015e
            boolean r1 = r3.A0w()
            r0 = 0
            if (r1 == 0) goto L_0x015f
        L_0x015e:
            r0 = 1
        L_0x015f:
            byte[] r1 = r13.A0a
            if (r1 != 0) goto L_0x016c
            if (r0 != 0) goto L_0x01a3
            r0 = 16
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x016c:
            r0 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r4 = r1.length
            r0 = 32
            if (r4 == r0) goto L_0x0191
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/setMediaKeyForMediaData/media key incorrect length; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r1)
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x0191
            X.1T8 r0 = X.AnonymousClass8BU.A0b(r5)
            throw r0
        L_0x0191:
            byte[] r0 = r13.A0a
            X.BmB r4 = X.AnonymousClass8BR.A0F(r0, r2)
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r4
        L_0x01a3:
            long r0 = r13.A0B
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b9
            long r0 = X.C17880vN.A04(r0)
            X.8cW r5 = X.AnonymousClass8BT.A0X(r15)
            int r4 = r5.bitField0_
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r5.bitField0_ = r4
            r5.mediaKeyTimestamp_ = r0
        L_0x01b9:
            X.36w r9 = X.C60502o8.A00(r3)
            if (r9 == 0) goto L_0x0287
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = r9.A09
            if (r0 == 0) goto L_0x0287
            java.lang.String r0 = r9.A06
            if (r0 == 0) goto L_0x0287
            byte[] r0 = r9.A0C
            if (r0 == 0) goto L_0x0287
            byte[] r1 = r9.A0B
            byte[] r0 = r13.A0a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0287
            long r4 = r9.A02
            long r0 = r13.A0B
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0287
            r5 = 1
            java.lang.String r4 = r9.A05
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.thumbnailDirectPath_ = r4
            java.lang.String r0 = r9.A09
            X.BmB r4 = X.AnonymousClass8BW.A0B(r15, r0, r2)
            X.Bm6 r1 = r15.A00
            X.8cW r1 = (X.C166208cW) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.thumbnailSha256_ = r4
            java.lang.String r0 = r9.A06
            X.BmB r0 = X.AnonymousClass8BW.A0B(r15, r0, r2)
            X.AnonymousClass8BY.A0n(r0, r15, r9)
        L_0x020e:
            if (r8 != 0) goto L_0x022a
            if (r5 == 0) goto L_0x027c
            boolean r0 = r9.A0E
            if (r0 != 0) goto L_0x027c
            byte[] r0 = r9.A0C
        L_0x0218:
            X.BmB r4 = X.AnonymousClass8BR.A0F(r0, r2)
            X.8cW r2 = X.AnonymousClass8BT.A0X(r15)
            int r1 = r2.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.jpegThumbnail_ = r4
        L_0x022a:
            boolean r0 = X.A79.A03(r7, r3, r6)
            if (r0 == 0) goto L_0x0246
            X.A79 r0 = r12.A01
            X.8cd r0 = r0.A04(r14, r3)
            X.8cW r2 = X.AnonymousClass8BT.A0X(r15)
            r0.getClass()
            r2.contextInfo_ = r0
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0246:
            java.lang.String r0 = r13.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0272
            java.lang.String r2 = r13.A0J
            X.8cW r1 = X.AnonymousClass8BT.A0X(r15)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x025f:
            int r1 = r3.A09
            r0 = 7
            if (r1 != r0) goto L_0x0271
            X.8cW r2 = X.AnonymousClass8BT.A0X(r15)
            r1 = 1
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.contactVcard_ = r1
        L_0x0271:
            return
        L_0x0272:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with directPath not set; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r1)
            goto L_0x025f
        L_0x027c:
            byte[] r0 = r16.A01()
            if (r0 == 0) goto L_0x022a
            byte[] r0 = r16.A01()
            goto L_0x0218
        L_0x0287:
            r5 = 0
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192299o8.A00(X.2rc, X.A2m, X.8Si, X.36u, X.21i):void");
    }
}

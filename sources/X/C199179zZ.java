package X;

/* renamed from: X.9zZ  reason: invalid class name and case insensitive filesystem */
public class C199179zZ {
    public final C18030ve A00;
    public final A79 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r3 = r12.waveform_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        if (r15 != false) goto L_0x00ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C166138cP r12, X.AnonymousClass205 r13, X.C441722k r14, boolean r15) {
        /*
            boolean r0 = r12.ptt_
            r14.A09 = r0
            X.2rc r2 = new X.2rc
            r2.<init>()
            r14.A02 = r2
            int r0 = r12.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00d8
            X.DSQ r3 = r12.waveform_
            int r1 = r3.A02()
            if (r1 <= 0) goto L_0x00d8
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x00d8
            byte[] r8 = r3.A06()
        L_0x0021:
            int r0 = r12.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00d5
            int r9 = r12.backgroundArgb_
        L_0x0029:
            if (r8 != 0) goto L_0x002d
            if (r9 == 0) goto L_0x003d
        L_0x002d:
            r7 = 0
            r10 = 0
            X.Bvt r6 = X.C24127Bvt.A00
            X.BvS r4 = X.C24100BvS.A00
            X.7LG r3 = new X.7LG
            r5 = r4
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r14.A1H(r3)
        L_0x003d:
            int r0 = r12.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00bf
            X.DSQ r0 = r12.mediaKey_
            byte[] r0 = r0.A06()
            X.A3I.A00(r2, r14, r0)
        L_0x004c:
            int r8 = r12.bitField0_
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0059
            long r0 = r12.mediaKeyTimestamp_
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            r2.A0B = r0
        L_0x0059:
            java.lang.String r4 = "; message.key="
            if (r15 == 0) goto L_0x0061
            r0 = r8 & 8
            if (r0 == 0) goto L_0x006b
        L_0x0061:
            long r0 = r12.fileLength_
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0122
            r14.A01 = r0
        L_0x006b:
            r7 = 14
            java.lang.String r6 = "FMessageAudio/bogus sha-256 hash received; length="
            r5 = 2
            r3 = 32
            if (r15 == 0) goto L_0x0078
            r0 = r8 & 4
            if (r0 == 0) goto L_0x0087
        L_0x0078:
            X.DSQ r0 = r12.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r3) goto L_0x0116
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r14.A05 = r0
        L_0x0087:
            int r0 = r12.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x009c
            X.DSQ r0 = r12.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r3) goto L_0x010a
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r14.A08 = r0
        L_0x009c:
            if (r15 != 0) goto L_0x00db
            java.lang.String r1 = r12.mimetype_
            r0 = 1
            java.lang.String r0 = X.AnonymousClass1SO.A07(r1, r0)
            if (r0 != 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/unrecognized audio mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r12.mimetype_
            r1.append(r0)
            X.C17900vP.A0Z(r13, r4, r1)
            r0 = 17
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x00bf:
            if (r15 != 0) goto L_0x004c
            boolean r0 = r14.A0w()
            if (r0 != 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/missing media key; message.key="
            X.C17900vP.A0Z(r13, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x00d5:
            r9 = 0
            goto L_0x0029
        L_0x00d8:
            r8 = 0
            goto L_0x0021
        L_0x00db:
            java.lang.String r0 = r12.mimetype_
            r14.A06 = r0
            if (r15 == 0) goto L_0x00e7
            int r0 = r12.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00ee
        L_0x00e7:
            java.lang.String r0 = r12.url_
            r14.A1C(r0)
            if (r15 == 0) goto L_0x0105
        L_0x00ee:
            int r0 = r12.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0105
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            r1.append(r0)
            X.AnonymousClass8BY.A0z(r14, r13, r1)
        L_0x0100:
            int r0 = r12.seconds_
            r14.A0D = r0
            return
        L_0x0105:
            java.lang.String r0 = r12.directPath_
            r2.A0J = r0
            goto L_0x0100
        L_0x010a:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.C17900vP.A0Z(r13, r4, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r7)
            throw r0
        L_0x0116:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.C17900vP.A0Z(r13, r4, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r7)
            throw r0
        L_0x0122:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "FMessageAudio/bogus media size received; fileLength="
            r3.append(r2)
            r3.append(r0)
            X.C17900vP.A0Z(r13, r4, r3)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199179zZ.A00(X.8cP, X.205, X.22k, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0219, code lost:
        r2 = X.C17900vP.A03(r3, r6.A0a);
        r1 = (X.C166138cP) r3.A00;
        r1.bitField0_ |= 64;
        r1.mediaKey_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x022b, code lost:
        r0 = (X.AnonymousClass7LG) r13.A00.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0231, code lost:
        if (r0 == null) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0233, code lost:
        r2 = r0.A08;
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0237, code lost:
        if (r2 == null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0239, code lost:
        r1 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023a, code lost:
        if (r1 <= 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
        if (r1 > 192) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0240, code lost:
        r2 = X.DSQ.A01(r2, 0, r1);
        r1 = X.AnonymousClass8BS.A0E(r3);
        r1.bitField0_ |= com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE;
        r1.waveform_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0251, code lost:
        if (r4 == 0) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0253, code lost:
        r1 = X.AnonymousClass8BS.A0E(r3);
        r1.bitField0_ |= com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE;
        r1.backgroundArgb_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025f, code lost:
        r0 = r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0263, code lost:
        if (r0 <= 0) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0265, code lost:
        r0 = X.C17880vN.A04(r0);
        r4 = X.AnonymousClass8BS.A0E(r3);
        r4.bitField0_ |= 512;
        r4.mediaKeyTimestamp_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0279, code lost:
        if (X.C19998A2m.A00(r12, r13) == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x027b, code lost:
        r0 = r11.A01.A04(r12, r13);
        r1 = X.AnonymousClass8BS.A0E(r3);
        r0.getClass();
        r1.contextInfo_ = r0;
        r1.bitField0_ |= androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0296, code lost:
        if (android.text.TextUtils.isEmpty(r6.A0J) != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0298, code lost:
        r2 = r6.A0J;
        r1 = X.AnonymousClass8BS.A0E(r3);
        r2.getClass();
        r1.bitField0_ |= 256;
        r1.directPath_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02aa, code lost:
        X.AnonymousClass8BX.A1F(r13, "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key=", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b3, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (r10 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        if (android.text.TextUtils.isEmpty(r13.A05) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r5 = android.util.Base64.decode(r13.A05, 0);
        r4 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r13.A0w() != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        if (r4 == 32) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("FMessageAudio/bogus sha-256 hash; length=");
        r1.append(r4);
        X.AnonymousClass8BX.A1F(r13, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        if (r12.A04 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        throw X.AnonymousClass8BW.A0S(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r4 = X.DSQ.A01(r5, 0, r4);
        r1 = X.AnonymousClass8BS.A0E(r3);
        r1.bitField0_ |= 4;
        r1.fileSha256_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        if (android.text.TextUtils.isEmpty(r13.A08) != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r5 = android.util.Base64.decode(r13.A08, 0);
        r4 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        if (r4 == 32) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("FMessageAudio/bogus sha-256 enc hash; length=");
        r1.append(r4);
        X.AnonymousClass8BX.A1F(r13, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r12.A04 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        throw X.AnonymousClass8BW.A0S(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0117, code lost:
        r4 = X.DSQ.A01(r5, 0, r4);
        r1 = X.AnonymousClass8BS.A0E(r3);
        r1.bitField0_ |= 128;
        r1.fileEncSha256_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0127, code lost:
        r0 = r13.A01;
        r4 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        if (r10 == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012f, code lost:
        if (r4 <= 0) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0131, code lost:
        r0 = r13.A01;
        r5 = X.AnonymousClass8BS.A0E(r3);
        r5.bitField0_ |= 8;
        r5.fileLength_ = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        if (r10 == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        if (r13.A0D <= 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r4 = r13.A0D;
        r1 = X.AnonymousClass8BS.A0E(r3);
        r1.bitField0_ |= 16;
        r1.seconds_ = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        if (r13.A09 == 1) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0158, code lost:
        r1 = X.AnonymousClass8BS.A0E(r3);
        r1.bitField0_ |= 32;
        r1.ptt_ = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r9 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0168, code lost:
        if (r6.A0a == null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016a, code lost:
        r0 = r6.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016c, code lost:
        if (r10 != false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016e, code lost:
        r2 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0171, code lost:
        if (r2 == 32) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0173, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("FMessageAudio/buildE2eMessage/media key incorrect length; length=");
        r1.append(r2);
        X.AnonymousClass8BX.A1F(r13, "; message.key=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0186, code lost:
        if (r12.A04 == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018e, code lost:
        throw X.AnonymousClass8BW.A0S(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018f, code lost:
        if (r4 > 0) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0191, code lost:
        r5 = X.AnonymousClass000.A10();
        r5.append("FMessageAudio/buildE2eMessage/sending audio with media size not set, size=");
        r5.append(r0);
        X.AnonymousClass8BX.A1F(r13, "; message.key=", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a4, code lost:
        if (r12.A04 == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ac, code lost:
        throw X.AnonymousClass8BW.A0S(13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass8SR A01(X.C19998A2m r12, X.C441722k r13) {
        /*
            r11 = this;
            X.2rc r6 = r13.A02
            boolean r10 = r12.A01()
            r2 = 1
            r7 = 0
            if (r10 != 0) goto L_0x0011
            boolean r0 = r13.A0w()
            r9 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r9 = 1
        L_0x0012:
            r3 = 0
            if (r6 == 0) goto L_0x01ad
            if (r9 != 0) goto L_0x001b
            byte[] r0 = r6.A0a
            if (r0 == 0) goto L_0x01ad
        L_0x001b:
            X.8X8 r0 = r12.A00
            X.Bm6 r0 = r0.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cP r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x0027
            X.8cP r0 = X.C166138cP.DEFAULT_INSTANCE
        L_0x0027:
            X.Bmt r3 = r0.A0O()
            X.8SR r3 = (X.AnonymousClass8SR) r3
            java.lang.String r4 = r13.A07
            if (r9 == 0) goto L_0x0037
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x006c
        L_0x0037:
            if (r10 != 0) goto L_0x005d
            X.205 r5 = r13.A0v
            boolean r0 = X.C20133A8t.A0D(r5, r4)
            if (r0 != 0) goto L_0x005d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending message with invalid url"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.C17900vP.A0Z(r5, r0, r1)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x005d
            r0 = 15
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x005d:
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r4
        L_0x006c:
            java.lang.String r4 = r13.A06
            if (r10 == 0) goto L_0x0076
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00a9
        L_0x0076:
            boolean r0 = X.AnonymousClass1SO.A0A(r4)
            if (r0 != 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r1)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0098
            r0 = 17
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x0098:
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r4
            if (r10 == 0) goto L_0x00b1
        L_0x00a9:
            java.lang.String r0 = r13.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e8
        L_0x00b1:
            java.lang.String r0 = r13.A05
            byte[] r5 = android.util.Base64.decode(r0, r7)
            int r4 = r5.length
            r0 = 32
            if (r4 == r0) goto L_0x00d8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r1)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x00d8
            r0 = 14
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x00d8:
            X.BmB r4 = X.DSQ.A01(r5, r7, r4)
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r4
        L_0x00e8:
            java.lang.String r0 = r13.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0127
            java.lang.String r0 = r13.A08
            byte[] r5 = android.util.Base64.decode(r0, r7)
            int r4 = r5.length
            r0 = 32
            if (r4 == r0) goto L_0x0117
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r1)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0117
            r0 = 14
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x0117:
            X.BmB r4 = X.DSQ.A01(r5, r7, r4)
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r4
        L_0x0127:
            r7 = 0
            long r0 = r13.A01
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x018f
            if (r4 <= 0) goto L_0x0141
        L_0x0131:
            long r0 = r13.A01
            X.8cP r5 = X.AnonymousClass8BS.A0E(r3)
            int r4 = r5.bitField0_
            r4 = r4 | 8
            r5.bitField0_ = r4
            r5.fileLength_ = r0
            if (r10 == 0) goto L_0x0145
        L_0x0141:
            int r0 = r13.A0D
            if (r0 <= 0) goto L_0x0153
        L_0x0145:
            int r4 = r13.A0D
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r4
        L_0x0153:
            int r0 = r13.A09
            if (r0 == r2) goto L_0x0158
            r2 = 0
        L_0x0158:
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r2
            if (r9 == 0) goto L_0x016a
            byte[] r0 = r6.A0a
            if (r0 == 0) goto L_0x022b
        L_0x016a:
            byte[] r0 = r6.A0a
            if (r10 != 0) goto L_0x0219
            int r2 = r0.length
            r0 = 32
            if (r2 == r0) goto L_0x0219
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r1)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0219
            r0 = 16
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x018f:
            if (r4 > 0) goto L_0x0131
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "FMessageAudio/buildE2eMessage/sending audio with media size not set, size="
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r5)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0131
            r0 = 13
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        L_0x01ad:
            if (r10 == 0) goto L_0x0200
            X.8X8 r0 = r12.A00
            X.Bm6 r0 = r0.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cP r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x01bb
            X.8cP r0 = X.C166138cP.DEFAULT_INSTANCE
        L_0x01bb:
            X.Bmt r3 = r0.A0O()
            X.8SR r3 = (X.AnonymousClass8SR) r3
            int r0 = r13.A09
            if (r0 == r2) goto L_0x01c6
            r2 = 0
        L_0x01c6:
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r2
            boolean r0 = X.C19998A2m.A00(r12, r13)
            if (r0 == 0) goto L_0x01ed
            X.A79 r0 = r11.A01
            X.8cd r0 = r0.A04(r12, r13)
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
        L_0x01ed:
            int r0 = r13.A0D
            if (r0 <= 0) goto L_0x02a9
            int r2 = r13.A0D
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r2
            return r3
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/unable to send audio message due to missing mediaKey; message.key="
            X.AnonymousClass8BY.A10(r13, r0, r1)
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x02a9
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1T8 r0 = new X.1T8
            r0.<init>(r1, r3)
            throw r0
        L_0x0219:
            byte[] r0 = r6.A0a
            X.BmB r2 = X.C17900vP.A03(r3, r0)
            X.Bm6 r1 = r3.A00
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r2
        L_0x022b:
            X.25F r0 = r13.A00
            X.229 r0 = r0.A02
            X.7LG r0 = (X.AnonymousClass7LG) r0
            if (r0 == 0) goto L_0x025f
            byte[] r2 = r0.A08
            int r4 = r0.A00
            if (r2 == 0) goto L_0x0251
            int r1 = r2.length
            if (r1 <= 0) goto L_0x0251
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x0251
            r0 = 0
            X.BmB r2 = X.DSQ.A01(r2, r0, r1)
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.waveform_ = r2
        L_0x0251:
            if (r4 == 0) goto L_0x025f
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.backgroundArgb_ = r4
        L_0x025f:
            long r0 = r6.A0B
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0275
            long r0 = X.C17880vN.A04(r0)
            X.8cP r4 = X.AnonymousClass8BS.A0E(r3)
            int r2 = r4.bitField0_
            r2 = r2 | 512(0x200, float:7.175E-43)
            r4.bitField0_ = r2
            r4.mediaKeyTimestamp_ = r0
        L_0x0275:
            boolean r0 = X.C19998A2m.A00(r12, r13)
            if (r0 == 0) goto L_0x0290
            X.A79 r0 = r11.A01
            X.8cd r0 = r0.A04(r12, r13)
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
        L_0x0290:
            java.lang.String r0 = r6.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r2 = r6.A0J
            X.8cP r1 = X.AnonymousClass8BS.A0E(r3)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r2
        L_0x02a9:
            return r3
        L_0x02aa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key="
            X.AnonymousClass8BX.A1F(r13, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199179zZ.A01(X.A2m, X.22k):X.8SR");
    }

    public C199179zZ(C18030ve r1, A79 a79) {
        this.A00 = r1;
        this.A01 = a79;
    }
}

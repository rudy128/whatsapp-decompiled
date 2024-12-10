package X;

public final class ASF implements C436920n {
    public final AnonymousClass00H A00;

    public ASF(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r8 = r6.waveform_;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBH(X.C195239t1 r18) {
        /*
            r17 = this;
            r0 = 0
            r2 = r18
            X.C18070vi.A0d(r2, r0)
            X.8bz r1 = r2.A01
            int r0 = r1.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x014c
            X.8cH r6 = r1.audioMessage_
            if (r6 != 0) goto L_0x0014
            X.8cH r6 = X.C166058cH.DEFAULT_INSTANCE
        L_0x0014:
            X.205 r5 = r2.A02
            long r0 = r2.A00
            X.22l r4 = new X.22l
            r4.<init>(r5, r0)
            r0 = r17
            X.00H r0 = r0.A00
            r0.get()
            X.C18070vi.A0b(r6)
            r7 = 1
            r3 = 2
            X.C18070vi.A0d(r6, r3)
            boolean r0 = r6.ptt_
            r4.A09 = r0
            X.2rc r2 = new X.2rc
            r2.<init>()
            r4.A02 = r2
            int r0 = r6.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00f7
            X.DSQ r8 = r6.waveform_
            int r1 = r8.A02()
            if (r1 <= 0) goto L_0x00f7
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x00f7
            byte[] r13 = r8.A06()
        L_0x004d:
            int r0 = r6.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00f4
            int r14 = r6.backgroundArgb_
        L_0x0055:
            if (r13 != 0) goto L_0x0059
            if (r14 == 0) goto L_0x006a
        L_0x0059:
            r12 = 0
            r15 = 0
            X.Bvt r11 = X.C24127Bvt.A00
            X.BvS r9 = X.C24100BvS.A00
            X.7LG r8 = new X.7LG
            r10 = r9
            r16 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A1H(r8)
        L_0x006a:
            int r0 = r6.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x013e
            X.DSQ r0 = r6.mediaKey_
            byte[] r0 = r0.A06()
            X.A3I.A00(r2, r4, r0)
            int r12 = r6.bitField0_
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0086
            long r0 = r6.mediaKeyTimestamp_
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            r2.A0B = r0
        L_0x0086:
            r0 = r12 & 4
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.String r8 = "; message.key="
            if (r0 == 0) goto L_0x009a
            long r0 = r6.fileLength_
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x012a
            r4.A01 = r0
        L_0x009a:
            r0 = r12 & 2
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r11 = 14
            java.lang.String r10 = "FMessageAudio/bogus sha-256 hash received; length="
            r9 = 32
            if (r0 == 0) goto L_0x00b7
            X.DSQ r0 = r6.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r9) goto L_0x011e
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r4.A05 = r0
        L_0x00b7:
            int r0 = r6.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00cc
            X.DSQ r0 = r6.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r9) goto L_0x0112
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r3)
            r4.A08 = r0
        L_0x00cc:
            java.lang.String r0 = r6.mimetype_
            java.lang.String r0 = X.AnonymousClass1SO.A07(r0, r7)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r6.mimetype_
            r4.A06 = r0
            int r0 = r6.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r6.directPath_
            r2.A0J = r0
        L_0x00e2:
            int r0 = r6.seconds_
            r4.A0D = r0
            return r4
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/message without direct path received; message.key="
            r1.append(r0)
            X.AnonymousClass8BY.A0z(r4, r5, r1)
            goto L_0x00e2
        L_0x00f4:
            r14 = 0
            goto L_0x0055
        L_0x00f7:
            r13 = 0
            goto L_0x004d
        L_0x00fa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/unrecognized audio mime type; mimeType="
            r1.append(r0)
            java.lang.String r0 = r6.mimetype_
            r1.append(r0)
            X.C17900vP.A0Z(r5, r8, r1)
            r0 = 17
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x0112:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r10)
            X.C17900vP.A0Z(r5, r8, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r11)
            throw r0
        L_0x011e:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r10)
            X.C17900vP.A0Z(r5, r8, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r11)
            throw r0
        L_0x012a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "FMessageAudio/bogus media size received; fileLength="
            r3.append(r2)
            r3.append(r0)
            X.C17900vP.A0Z(r5, r8, r3)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/missing media key; message.key="
            X.C17900vP.A0Z(r5, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x014c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASF.CBH(X.9t1):X.206");
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDc(X.C184489b2 r11, X.AnonymousClass206 r12) {
        /*
            r10 = this;
            boolean r1 = X.C18070vi.A15(r12, r11)
            boolean r0 = r12 instanceof X.C441822l
            if (r0 == 0) goto L_0x01d7
            X.00H r0 = r10.A00
            r0.get()
            r4 = r12
            X.22k r4 = (X.C441722k) r4
            r6 = 0
            X.C18070vi.A0d(r4, r1)
            r5 = 1
            X.2rc r3 = r4.A02
            r2 = 0
            if (r3 == 0) goto L_0x01ba
            byte[] r8 = r3.A0a
            if (r8 == 0) goto L_0x01ba
            X.8X8 r0 = r11.A00
            X.Bm6 r0 = r0.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cP r0 = r0.audioMessage_
            if (r0 != 0) goto L_0x002a
            X.8cP r0 = X.C166138cP.DEFAULT_INSTANCE
        L_0x002a:
            X.Bmt r2 = r0.A0O()
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r7 = r8.length
            r0 = 32
            if (r7 == r0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/media key incorrect length; length="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r4, r0, r1)
        L_0x0046:
            X.BmB r7 = X.AnonymousClass8BU.A0A(r2, r8, r6)
            X.Bm6 r1 = r2.A00
            X.8cP r1 = (X.C166138cP) r1
            int r0 = X.C166138cP.ACCESSIBILITY_LABEL_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.mediaKey_ = r7
            java.lang.String r7 = r4.A06
            if (r7 == 0) goto L_0x0087
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0087
            boolean r0 = X.AnonymousClass1SO.A0A(r7)
            if (r0 != 0) goto L_0x0079
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/invalid mime type; mimetype="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r4, r0, r1)
        L_0x0079:
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mimetype_ = r7
        L_0x0087:
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x00be
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00be
            byte[] r8 = android.util.Base64.decode(r1, r6)
            X.C18070vi.A0b(r8)
            int r7 = r8.length
            r0 = 32
            if (r7 == r0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudioInterop/bogus sha-256 hash; length="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r4, r0, r1)
        L_0x00ae:
            X.BmB r7 = X.AnonymousClass8BU.A0A(r2, r8, r6)
            X.Bm6 r1 = r2.A00
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.fileSha256_ = r7
        L_0x00be:
            java.lang.String r1 = r4.A08
            if (r1 == 0) goto L_0x00f5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00f5
            byte[] r8 = android.util.Base64.decode(r1, r6)
            X.C18070vi.A0b(r8)
            int r7 = r8.length
            r0 = 32
            if (r7 == r0) goto L_0x00e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/bogus sha-256 enc hash; length="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r4, r0, r1)
        L_0x00e5:
            X.BmB r6 = X.AnonymousClass8BU.A0A(r2, r8, r6)
            X.Bm6 r1 = r2.A00
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.fileEncSha256_ = r6
        L_0x00f5:
            long r0 = r4.A01
            r8 = 0
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x010e
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r6 = "FMessageAudio/buildE2eMessage/sending audio with media size not set, size="
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = "; message.key="
            X.AnonymousClass8BX.A1F(r4, r0, r7)
        L_0x010e:
            long r0 = r4.A01
            X.Bm6 r7 = X.C17880vN.A0G(r2)
            X.8cP r7 = (X.C166138cP) r7
            int r6 = r7.bitField0_
            r6 = r6 | 8
            r7.bitField0_ = r6
            r7.fileLength_ = r0
            int r0 = r4.A0D
            if (r0 <= 0) goto L_0x0130
            int r6 = r4.A0D
            X.8cP r1 = X.AnonymousClass8BS.A0E(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.seconds_ = r6
        L_0x0130:
            int r0 = r4.A09
            boolean r5 = X.AnonymousClass000.A1T(r0, r5)
            X.8cP r1 = X.AnonymousClass8BS.A0E(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.ptt_ = r5
            X.25F r0 = r4.A00
            X.229 r6 = r0.A02
            X.7LG r6 = (X.AnonymousClass7LG) r6
            if (r6 == 0) goto L_0x017a
            byte[] r5 = r6.A08
            if (r5 == 0) goto L_0x0168
            int r1 = r5.length
            if (r1 == 0) goto L_0x0168
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 > r0) goto L_0x0168
            r0 = 0
            X.BmB r5 = X.DSQ.A01(r5, r0, r1)
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.waveform_ = r5
        L_0x0168:
            int r5 = r6.A00
            if (r5 == 0) goto L_0x017a
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.backgroundArgb_ = r5
        L_0x017a:
            long r0 = r3.A0B
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0192
            long r0 = X.C17880vN.A04(r0)
            X.Bm6 r6 = X.C17880vN.A0G(r2)
            X.8cP r6 = (X.C166138cP) r6
            int r5 = r6.bitField0_
            r5 = r5 | 512(0x200, float:7.175E-43)
            r6.bitField0_ = r5
            r6.mediaKeyTimestamp_ = r0
        L_0x0192:
            java.lang.String r3 = r3.A0J
            if (r3 == 0) goto L_0x01b0
            int r0 = r3.length()
            if (r0 == 0) goto L_0x01b0
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cP r1 = (X.C166138cP) r1
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.directPath_ = r3
        L_0x01aa:
            X.8X8 r0 = r11.A00
            r0.A0H(r2)
            return
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/sending audio with directPath not set; message.key="
            X.AnonymousClass8BT.A1H(r4, r0, r1)
            goto L_0x01c8
        L_0x01ba:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/buildE2eMessage/unable to send audio message due to missing mediaKey; message.key="
            X.AnonymousClass8BT.A1H(r4, r0, r1)
            java.lang.String r0 = "; media_wa_type="
            X.AnonymousClass206.A07(r4, r0, r1)
        L_0x01c8:
            X.AnonymousClass8BT.A1M(r1)
            if (r2 != 0) goto L_0x01aa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageAudio/unable to send encrypted media message due to missing mediaKey; key="
            X.AnonymousClass8BY.A10(r12, r0, r1)
            return
        L_0x01d7:
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASF.BDc(X.9b2, X.206):void");
    }
}

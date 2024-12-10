package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import java.util.LinkedList;

/* renamed from: X.AQs  reason: case insensitive filesystem */
public final class C20582AQs implements C72123Ks {
    public boolean A00;
    public final C19880zA A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11S A03;
    public final C60002nE A04;
    public final AnonymousClass1P3 A05;
    public final AnonymousClass122 A06;
    public final ARP A07;
    public final C32981i4 A08;
    public final C18030ve A09;
    public final AnonymousClass2HL A0A;
    public final AnonymousClass1BI A0B;
    public final Jid A0C;
    public final C35241lt A0D;
    public final A4L A0E;
    public final C188259h8 A0F;
    public final AnonymousClass1N9 A0G;
    public final C35211lq A0H;
    public final C173578vJ A0I;
    public final AnonymousClass1PT A0J;
    public final C63362sw A0K;
    public final AnonymousClass00H A0L;
    public final Integer A0M;
    public final boolean A0N;

    public static final void A02(C166418cr r3, AnonymousClass23U r4) {
        int i;
        int i2 = r3.bitField1_;
        if ((i2 & 16) == 0 && (i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            i = 67;
            if ((i2 & 128) == 0) {
                if ((262144 & i2) != 0) {
                    i = 79;
                } else if (AnonymousClass000.A1O(i2 & DefaultCrypto.BUFFER_SIZE)) {
                    i = 74;
                } else {
                    i = 80;
                    if (!AnonymousClass000.A1O(r3.bitField1_ & 4194304)) {
                        i = 81;
                        if ((33554432 & i2) == 0) {
                            if ((16777216 & i2) != 0) {
                                i = 82;
                            } else if (AnonymousClass000.A1O(r3.bitField1_ & 134217728)) {
                                i = 84;
                            } else if ((r3.bitField2_ & 8) != 0) {
                                i = 10002;
                            } else {
                                i = 83;
                                if (!AnonymousClass000.A1O(r3.bitField1_ & 268435456)) {
                                    if ((i2 & 536870912) != 0) {
                                        i = 85;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            i = 56;
        }
        r4.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C166418cr r6) {
        /*
            r5 = this;
            X.2sw r4 = r5.A0K
            X.205 r0 = r4.A0B
            X.1BI r3 = r0.A00
            boolean r0 = X.C22971Dz.A0d(r3)
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0082
            X.11S r1 = r5.A03
            com.whatsapp.jid.Jid r0 = r5.A0C
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r0)
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x0080
            int r0 = r6.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0081
            X.8cm r0 = r6.protocolMessage_
            r1 = r0
            if (r0 != 0) goto L_0x002d
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x002d:
            int r0 = r0.bitField0_
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0080
            r0 = r1
            if (r1 != 0) goto L_0x0038
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0038:
            int r0 = r0.bitField0_
            r0 = r0 & 64
            if (r0 != 0) goto L_0x0080
            r0 = r1
            if (r1 != 0) goto L_0x0043
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0043:
            int r0 = r0.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0080
            r0 = r1
            if (r1 != 0) goto L_0x004e
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x004e:
            int r0 = r0.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0080
            r0 = r1
            if (r1 != 0) goto L_0x0059
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0059:
            int r0 = r0.bitField0_
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0080
            r0 = r1
            if (r1 != 0) goto L_0x0064
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0064:
            int r0 = r0.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x0080
            r0 = r1
            if (r1 != 0) goto L_0x006f
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x006f:
            int r0 = r0.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 != 0) goto L_0x0080
            if (r1 != 0) goto L_0x0079
            X.8cm r1 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0079:
            int r1 = r1.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            return r2
        L_0x0082:
            boolean r0 = r3 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x009d
            com.whatsapp.jid.Jid r0 = r4.A0Y
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass1E0.A00(r0)
            X.11S r0 = r5.A03
            boolean r0 = r0.A0R(r1)
            if (r0 == 0) goto L_0x0080
            X.9r6 r0 = r4.A09
            if (r0 != 0) goto L_0x0080
            X.9r6 r0 = r4.A08
            if (r0 == 0) goto L_0x0080
            return r2
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20582AQs.A03(X.8cr):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0899, code lost:
        if (r5 != null) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08f0, code lost:
        if (r4 != r8) goto L_0x08f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        if (r3.equals(r0.A0B.A00) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ae A[Catch:{ all -> 0x0b64, 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd, Exception -> 0x0b6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b9 A[Catch:{ all -> 0x0b64, 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd, Exception -> 0x0b6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04b5 A[Catch:{ all -> 0x0b64, 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd, Exception -> 0x0b6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0a69 A[Catch:{ all -> 0x0b64, 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd, Exception -> 0x0b6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0b49 A[Catch:{ all -> 0x0b64, 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd, Exception -> 0x0b6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:607:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:609:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcN(byte[] r37) {
        /*
            r36 = this;
            r6 = r37
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DecryptionCallbackV2/handlePlaintext key="
            r3.append(r0)
            r1 = r36
            X.2sw r0 = r1.A0K
            X.205 r2 = r0.A0B
            r3.append(r2)
            java.lang.String r2 = " sendReceipt="
            r3.append(r2)
            boolean r2 = r1.A0N
            r17 = r2
            X.C17900vP.A0r(r3, r2)
            java.lang.Integer r2 = r1.A0M
            if (r2 == 0) goto L_0x0033
            int r3 = r2.intValue()
            r2 = 4
            if (r3 == r2) goto L_0x0033
            X.2HL r3 = r1.A0A
            X.8vJ r2 = r1.A0I
            byte[] r6 = X.A3S.A02(r3, r2, r6)
        L_0x0033:
            if (r6 != 0) goto L_0x0047
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl derived invalid plaintext; message.key="
            X.C63362sw.A01(r0, r2, r3)
            X.AnonymousClass8BT.A1M(r3)
            r2 = 0
            r0 = 0
            r1.A01(r0, r2)
        L_0x0046:
            return
        L_0x0047:
            r5 = 0
            X.8cr r4 = X.C166418cr.A01(r6)     // Catch:{ 1PN -> 0x0b86 }
            boolean r2 = r1.A03(r4)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 == 0) goto L_0x0071
            int r3 = r4.bitField0_     // Catch:{ 1PN -> 0x0b86 }
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r2
            boolean r2 = X.AnonymousClass000.A1O(r3)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 != 0) goto L_0x0071
            X.1PT r4 = r1.A0J     // Catch:{ 1PN -> 0x0b86 }
            com.whatsapp.jid.Jid r2 = r1.A0C     // Catch:{ 1PN -> 0x0b86 }
            com.whatsapp.jid.DeviceJid r3 = X.AnonymousClass1E0.A00(r2)     // Catch:{ 1PN -> 0x0b86 }
            r2 = 2
            r4.A0C(r3, r0, r2)     // Catch:{ 1PN -> 0x0b86 }
            java.lang.String r2 = "Peers must use DeviceSentMessage proto"
            X.1PN r3 = new X.1PN     // Catch:{ 1PN -> 0x0b86 }
            r3.<init>((java.lang.String) r2)     // Catch:{ 1PN -> 0x0b86 }
        L_0x0070:
            throw r3     // Catch:{ 1PN -> 0x0b86 }
        L_0x0071:
            boolean r2 = r1.A03(r4)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 != 0) goto L_0x0096
            int r3 = r4.bitField0_     // Catch:{ 1PN -> 0x0b86 }
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r2
            boolean r2 = X.AnonymousClass000.A1O(r3)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 == 0) goto L_0x0096
            X.1PT r4 = r1.A0J     // Catch:{ 1PN -> 0x0b86 }
            com.whatsapp.jid.Jid r2 = r1.A0C     // Catch:{ 1PN -> 0x0b86 }
            com.whatsapp.jid.DeviceJid r3 = X.AnonymousClass1E0.A00(r2)     // Catch:{ 1PN -> 0x0b86 }
            r2 = 1
            r4.A0C(r3, r0, r2)     // Catch:{ 1PN -> 0x0b86 }
            java.lang.String r2 = "DeviceSentMessage proto only allowed from peer device"
            X.1PN r3 = new X.1PN     // Catch:{ 1PN -> 0x0b86 }
            r3.<init>((java.lang.String) r2)     // Catch:{ 1PN -> 0x0b86 }
            goto L_0x0070
        L_0x0096:
            int r2 = r4.bitField0_     // Catch:{ 1PN -> 0x0b86 }
            r8 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r8
            boolean r2 = X.AnonymousClass000.A1O(r2)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 == 0) goto L_0x00e0
            X.8a1 r7 = r4.deviceSentMessage_     // Catch:{ 1PN -> 0x0b86 }
            if (r7 != 0) goto L_0x00a7
            X.8a1 r7 = X.C164758a1.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0b86 }
        L_0x00a7:
            int r3 = r7.bitField0_     // Catch:{ 1PN -> 0x0b86 }
            r2 = r3 & 2
            if (r2 == 0) goto L_0x00ff
            r2 = r3 & 1
            if (r2 == 0) goto L_0x00ff
            java.lang.String r3 = r7.destinationJid_     // Catch:{ 1PN -> 0x0b86 }
            X.1Dv r2 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x00ff }
            X.1BI r7 = X.C22931Dv.A01(r3)     // Catch:{ 11T -> 0x00ff }
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A02(r3)     // Catch:{ 1PN -> 0x0b86 }
            boolean r2 = X.C22971Dz.A0M(r3)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 == 0) goto L_0x00d2
            com.whatsapp.jid.UserJid r3 = X.C22971Dz.A03(r3)     // Catch:{ 1PN -> 0x0b86 }
        L_0x00c7:
            X.205 r2 = r0.A0B     // Catch:{ 1PN -> 0x0b86 }
            X.1BI r2 = r2.A00     // Catch:{ 1PN -> 0x0b86 }
            boolean r2 = r7.equals(r2)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 != 0) goto L_0x00e0
            goto L_0x00d4
        L_0x00d2:
            r3 = 0
            goto L_0x00c7
        L_0x00d4:
            if (r3 == 0) goto L_0x00ff
            X.205 r2 = r0.A0B     // Catch:{ 1PN -> 0x0b86 }
            X.1BI r2 = r2.A00     // Catch:{ 1PN -> 0x0b86 }
            boolean r2 = r3.equals(r2)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 == 0) goto L_0x00ff
        L_0x00e0:
            X.8cG r3 = r4.messageContextInfo_     // Catch:{ 1PN -> 0x0b86 }
            if (r3 != 0) goto L_0x00e6
            X.8cG r3 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0b86 }
        L_0x00e6:
            int r2 = r4.bitField0_     // Catch:{ 1PN -> 0x0b86 }
            r2 = r2 & r8
            boolean r2 = X.AnonymousClass000.A1O(r2)     // Catch:{ 1PN -> 0x0b86 }
            if (r2 == 0) goto L_0x0114
            X.8a1 r2 = r4.deviceSentMessage_     // Catch:{ 1PN -> 0x0b86 }
            if (r2 != 0) goto L_0x00f5
            X.8a1 r2 = X.C164758a1.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0b86 }
        L_0x00f5:
            X.8cr r4 = r2.message_     // Catch:{ 1PN -> 0x0b86 }
            if (r4 != 0) goto L_0x00fb
            X.8cr r4 = X.C166418cr.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0b86 }
        L_0x00fb:
            X.C18070vi.A0X(r4)     // Catch:{ 1PN -> 0x0b86 }
            goto L_0x0114
        L_0x00ff:
            X.1PT r4 = r1.A0J     // Catch:{ 1PN -> 0x0b86 }
            com.whatsapp.jid.Jid r2 = r1.A0C     // Catch:{ 1PN -> 0x0b86 }
            com.whatsapp.jid.DeviceJid r3 = X.AnonymousClass1E0.A00(r2)     // Catch:{ 1PN -> 0x0b86 }
            r2 = 3
            r4.A0C(r3, r0, r2)     // Catch:{ 1PN -> 0x0b86 }
            java.lang.String r2 = "invalid DeviceSentMessage"
            X.1PN r3 = new X.1PN     // Catch:{ 1PN -> 0x0b86 }
            r3.<init>((java.lang.String) r2)     // Catch:{ 1PN -> 0x0b86 }
            goto L_0x0070
        L_0x0114:
            if (r3 == 0) goto L_0x0123
            X.Bmt r2 = r4.A0O()     // Catch:{ 1PN -> 0x0b86 }
            X.8X8 r2 = (X.AnonymousClass8X8) r2     // Catch:{ 1PN -> 0x0b86 }
            r2.A0V(r3)     // Catch:{ 1PN -> 0x0b86 }
            X.8cr r4 = X.AnonymousClass8BR.A0e(r2)     // Catch:{ 1PN -> 0x0b86 }
        L_0x0123:
            java.util.ArrayList r7 = X.C20102A7g.A01(r4)
            int r5 = X.C20102A7g.A00(r4)
            if (r5 <= 0) goto L_0x013e
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext messageTypes="
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = ", numUnknownTags="
            X.C17900vP.A0j(r2, r3, r5)
        L_0x013e:
            X.0ve r5 = r1.A09
            X.190 r8 = r1.A02
            boolean r2 = X.C20102A7g.A03(r8, r5, r4, r7)
            if (r2 != 0) goto L_0x015c
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext received an invalid protobuf; message.key="
            X.C63362sw.A01(r0, r2, r3)
            java.lang.String r0 = " messageTypes="
            X.C17900vP.A0Z(r7, r0, r3)
            r0 = 12
            r1.A01(r4, r0)
            return
        L_0x015c:
            android.util.Pair r2 = X.C108945cZ.A0N(r4, r7)
            java.lang.Object r3 = r2.first
            X.8cr r3 = (X.C166418cr) r3
            java.lang.Object r2 = r2.second
            java.util.List r2 = (java.util.List) r2
            int r4 = r2.size()
            r11 = 0
            r2 = 1
            boolean r7 = X.AnonymousClass000.A1T(r4, r2)
            int r2 = X.C20102A7g.A00(r3)
            if (r2 <= 0) goto L_0x0179
            r11 = 1
        L_0x0179:
            int r2 = r3.bitField0_
            r2 = r2 & 2
            if (r2 != 0) goto L_0x01d7
            r4 = 5716(0x1654, float:8.01E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r5, r4)
            if (r2 == 0) goto L_0x01d7
            X.8cr r4 = X.C196709vV.A01(r5, r3)
            X.1i4 r2 = r1.A08
            java.lang.String r9 = X.A8F.A07(r2, r4)
            java.lang.Class<X.AW0> r2 = X.AW0.class
            X.B5K r2 = r0.A06(r2)
            X.AW0 r2 = (X.AW0) r2
            long r4 = r0.A05
            int r22 = r0.A02()
            r20 = 0
            r18 = r2
            r19 = r3
            r21 = r9
            r23 = r4
            java.lang.String r10 = X.AnonymousClass9AU.A02(r18, r19, r20, r21, r22, r23)
            java.lang.String r5 = r0.A0R
            boolean r2 = r10.equals(r5)
            if (r2 != 0) goto L_0x01d7
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Received type: "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = ", Expected type: "
            r4.append(r2)
            r4.append(r10)
            java.lang.String r2 = ", Media type: "
            java.lang.String r5 = X.AnonymousClass001.A1H(r2, r9, r4)
            java.lang.String r4 = "DecryptionCallbackV2/messageTypeMismatch"
            r2 = 0
            r8.A0G(r4, r5, r2)
        L_0x01d7:
            X.1lq r2 = r1.A0H     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r9 = "IncomingMessageManager/notifyIncomingMessageDecrypted "
            X.00H r2 = r2.A00     // Catch:{ Exception -> 0x0b6a }
            java.util.Iterator r4 = X.C17890vO.A0h(r2)     // Catch:{ Exception -> 0x0b6a }
        L_0x01e1:
            boolean r2 = r4.hasNext()     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x0225
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0b6a }
            X.1Oi r5 = (X.C25471Oi) r5     // Catch:{ Exception -> 0x0b6a }
            X.B5I r8 = r5.Bvs(r3, r0, r7)     // Catch:{ Exception -> 0x0b6a }
            X.AVd r2 = X.C20697AVd.A00     // Catch:{ Exception -> 0x0b6a }
            boolean r2 = X.C18070vi.A18(r8, r2)     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x01e1
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r9)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = r5.BSr()     // Catch:{ Exception -> 0x0b6a }
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = " returned "
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            r4.append(r8)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = ", stopping"
            X.C17890vO.A1B(r4, r2)     // Catch:{ Exception -> 0x0b6a }
        L_0x0211:
            boolean r2 = r8 instanceof X.C20698AVe     // Catch:{ Exception -> 0x0b6a }
            r5 = 0
            if (r2 == 0) goto L_0x022c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext/stop/recent "
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            X.205 r2 = r0.A0B     // Catch:{ Exception -> 0x0b6a }
            X.C17900vP.A0b(r2, r4)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0228
        L_0x0225:
            X.AVd r8 = X.C20697AVd.A00     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0211
        L_0x0228:
            if (r17 == 0) goto L_0x0046
            goto L_0x0b4f
        L_0x022c:
            boolean r2 = r8 instanceof X.C20696AVc     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x0245
            r5 = 11
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext/stop/ack "
            X.C63362sw.A01(r0, r2, r4)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = " e2eFailureReason="
            X.C17900vP.A0j(r2, r4, r5)     // Catch:{ Exception -> 0x0b6a }
            r1.A01(r3, r5)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0b57
        L_0x0245:
            boolean r2 = r8 instanceof X.C20697AVd     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x025c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "action must be Continue, but it is "
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            X.C17900vP.A0a(r8, r4)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0b6a }
            X.C17960vV.A0F(r5, r2)     // Catch:{ Exception -> 0x0b6a }
        L_0x025c:
            if (r7 != 0) goto L_0x0262
            if (r11 != 0) goto L_0x0262
            goto L_0x0a5e
        L_0x0262:
            int r2 = r0.A01     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x07ce
            r7 = 32
            long r4 = r0.A05     // Catch:{ Exception -> 0x0b6a }
            long r4 = r4 & r7
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x07ce
            int r2 = r3.bitField2_     // Catch:{ Exception -> 0x0b6a }
            r2 = r2 & 1
            if (r2 != 0) goto L_0x07ce
            boolean r2 = r1.A00     // Catch:{ Exception -> 0x0b6a }
            r19 = r2
            X.A4L r2 = r1.A0E     // Catch:{ Exception -> 0x0b6a }
            X.2HL r5 = r1.A0A     // Catch:{ Exception -> 0x0b6a }
            X.2mv r7 = r0.A0D     // Catch:{ Exception -> 0x0b6a }
            boolean r4 = r3.A0R()     // Catch:{ Exception -> 0x0b6a }
            if (r4 == 0) goto L_0x0293
            X.8ck r4 = r3.templateMessage_     // Catch:{ Exception -> 0x0b6a }
            r11 = r4
            if (r4 != 0) goto L_0x028c
            X.8ck r4 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x028c:
            int r4 = r4.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0293
            goto L_0x02ac
        L_0x0293:
            int r4 = r3.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r4 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x02af
            X.8c5 r4 = r3.highlyStructuredMessage_     // Catch:{ Exception -> 0x0b6a }
            r8 = r4
            if (r4 != 0) goto L_0x02a0
            X.8c5 r4 = X.C165948c5.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x02a0:
            int r4 = r4.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r4 = r4 & 64
            if (r4 == 0) goto L_0x02af
            if (r8 != 0) goto L_0x02aa
            X.8c5 r8 = X.C165948c5.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x02aa:
            X.8ck r11 = r8.hydratedHsm_     // Catch:{ Exception -> 0x0b6a }
        L_0x02ac:
            if (r11 != 0) goto L_0x02b3
            goto L_0x02b1
        L_0x02af:
            r11 = 0
            goto L_0x02b3
        L_0x02b1:
            X.8ck r11 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x02b3:
            com.whatsapp.jid.UserJid r10 = r0.A05()     // Catch:{ Exception -> 0x0b6a }
            if (r11 == 0) goto L_0x04b5
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r4 = "HsmMessageHandler/handleHydratedTemplateMessage key="
            r8.append(r4)     // Catch:{ Exception -> 0x0b6a }
            X.205 r4 = r0.A0B     // Catch:{ Exception -> 0x0b6a }
            X.C17900vP.A0b(r4, r8)     // Catch:{ Exception -> 0x0b6a }
            com.whatsapp.jid.UserJid r8 = r0.A05()     // Catch:{ Exception -> 0x0b6a }
            r9 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ 1hd -> 0x04ac }
            r5.A0E = r4     // Catch:{ 1hd -> 0x04ac }
            X.205 r4 = r0.A0B     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r5 = r4.toString()     // Catch:{ 1hd -> 0x04ac }
            r13 = 0
            int r4 = r11.bitField0_     // Catch:{ 1hd -> 0x04ac }
            r4 = r4 & 16
            if (r4 == 0) goto L_0x035e
            X.8bt r12 = X.AnonymousClass8BS.A0K(r11)     // Catch:{ 1hd -> 0x04ac }
            int r4 = r12.titleCase_     // Catch:{ 1hd -> 0x04ac }
            java.lang.Integer r10 = X.AnonymousClass8BY.A0S(r4)     // Catch:{ 1hd -> 0x04ac }
            java.lang.Integer r4 = X.AnonymousClass00R.A01     // Catch:{ 1hd -> 0x04ac }
            if (r10 != r4) goto L_0x0300
            int r10 = r12.titleCase_     // Catch:{ 1hd -> 0x04ac }
            r4 = 2
            if (r10 == r4) goto L_0x0300
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r2 = "MessageUtil/validateHydratedTemplateMessage/error no title with text title, message key="
            X.C17900vP.A0g(r2, r5, r4)     // Catch:{ 1hd -> 0x04ac }
            X.1hd r2 = X.AnonymousClass8BR.A0o(r13)     // Catch:{ 1hd -> 0x04ac }
        L_0x02ff:
            throw r2     // Catch:{ 1hd -> 0x04ac }
        L_0x0300:
            int r4 = r12.bitField0_     // Catch:{ 1hd -> 0x04ac }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0350
            X.8X8 r12 = X.C166418cr.A00()     // Catch:{ 1hd -> 0x04ac }
            X.8cr r10 = X.AnonymousClass8BS.A0M(r12)     // Catch:{ 1hd -> 0x04ac }
            r10.templateMessage_ = r11     // Catch:{ 1hd -> 0x04ac }
            int r5 = r10.bitField0_     // Catch:{ 1hd -> 0x04ac }
            r4 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 | r4
            r10.bitField0_ = r5     // Catch:{ 1hd -> 0x04ac }
            X.8cr r15 = X.AnonymousClass8BR.A0e(r12)     // Catch:{ 1hd -> 0x04ac }
            java.lang.Class<X.AVx> r12 = X.C20717AVx.class
            X.B5K r14 = r0.A06(r12)     // Catch:{ 1hd -> 0x04ac }
            X.AVx r14 = (X.C20717AVx) r14     // Catch:{ 1hd -> 0x04ac }
            java.lang.Class<X.AVy> r4 = X.C20718AVy.class
            X.B5K r13 = r0.A06(r4)     // Catch:{ 1hd -> 0x04ac }
            X.AVy r13 = (X.C20718AVy) r13     // Catch:{ 1hd -> 0x04ac }
            X.205 r10 = r0.A0B     // Catch:{ 1hd -> 0x04ac }
            long r4 = r0.A0X     // Catch:{ 1hd -> 0x04ac }
            X.9p8 r15 = X.C196699vU.A01(r15, r10, r0, r4)     // Catch:{ 1hd -> 0x04ac }
            java.lang.Class<X.AW0> r4 = X.AW0.class
            X.B5K r4 = r0.A06(r4)     // Catch:{ 1hd -> 0x04ac }
            X.AW0 r4 = (X.AW0) r4     // Catch:{ 1hd -> 0x04ac }
            r15.A01 = r4     // Catch:{ 1hd -> 0x04ac }
            com.whatsapp.jid.Jid r4 = r0.A0Y     // Catch:{ 1hd -> 0x04ac }
            X.1BI r5 = X.C22971Dz.A00(r4)     // Catch:{ 1hd -> 0x04ac }
            r15.A02 = r5     // Catch:{ 1hd -> 0x04ac }
            r15.A0A = r9     // Catch:{ 1hd -> 0x04ac }
            int r5 = r0.A01     // Catch:{ 1hd -> 0x04ac }
            r15.A00 = r5     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r5 = r0.A0R     // Catch:{ 1hd -> 0x04ac }
            r15.A08 = r5     // Catch:{ 1hd -> 0x04ac }
            goto L_0x0363
        L_0x0350:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r2 = "MessageUtil/validateHydratedTemplateMessage/error no content, message key="
            X.C17900vP.A0g(r2, r5, r4)     // Catch:{ 1hd -> 0x04ac }
            X.1hd r2 = X.AnonymousClass8BR.A0o(r13)     // Catch:{ 1hd -> 0x04ac }
            goto L_0x02ff
        L_0x035e:
            X.1hd r2 = X.AnonymousClass8BR.A0o(r13)     // Catch:{ 1hd -> 0x04ac }
            goto L_0x02ff
        L_0x0363:
            r10 = 0
            if (r14 == 0) goto L_0x0367
            goto L_0x0369
        L_0x0367:
            r5 = r10
            goto L_0x036b
        L_0x0369:
            java.lang.String r5 = r14.A00     // Catch:{ 1hd -> 0x04ac }
        L_0x036b:
            r15.A06 = r5     // Catch:{ 1hd -> 0x04ac }
            if (r13 == 0) goto L_0x0370
            goto L_0x0372
        L_0x0370:
            r5 = r10
            goto L_0x0374
        L_0x0372:
            java.lang.String r5 = r13.A01     // Catch:{ 1hd -> 0x04ac }
        L_0x0374:
            r15.A09 = r5     // Catch:{ 1hd -> 0x04ac }
            if (r14 == 0) goto L_0x0379
            goto L_0x037b
        L_0x0379:
            r5 = r10
            goto L_0x037d
        L_0x037b:
            java.lang.String r5 = r14.A01     // Catch:{ 1hd -> 0x04ac }
        L_0x037d:
            r15.A07 = r5     // Catch:{ 1hd -> 0x04ac }
            java.lang.Class<X.AVz> r5 = X.C20719AVz.class
            X.B5K r5 = r0.A06(r5)     // Catch:{ 1hd -> 0x04ac }
            X.AVz r5 = (X.C20719AVz) r5     // Catch:{ 1hd -> 0x04ac }
            r15.A01(r5, r6)     // Catch:{ 1hd -> 0x04ac }
            X.A6d r6 = r15.A00()     // Catch:{ 1hd -> 0x04ac }
            X.00H r5 = r2.A0E     // Catch:{ 1hc -> 0x0395 }
            X.206 r6 = X.AnonymousClass8BV.A0K(r6, r5)     // Catch:{ 1hc -> 0x0395 }
            goto L_0x03db
        L_0x0395:
            r6 = move-exception
            java.lang.String r5 = "HsmMessageHandler/failed to parse incoming HSM message."
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ 1hd -> 0x04ac }
            X.1N9 r5 = r2.A08     // Catch:{ 1hd -> 0x04ac }
            X.0ve r14 = r5.A04     // Catch:{ 1hd -> 0x04ac }
            X.190 r13 = r5.A00     // Catch:{ 1hd -> 0x04ac }
            X.1BI r21 = r0.A03()     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r6 = r0.A0h     // Catch:{ 1hd -> 0x04ac }
            X.1BI r22 = X.C22971Dz.A00(r4)     // Catch:{ 1hd -> 0x04ac }
            long r11 = r0.A04     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r24 = "structure-unavailable"
            X.2fh r4 = new X.2fh     // Catch:{ 1hd -> 0x04ac }
            r20 = r4
            r23 = r6
            r25 = r11
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ 1hd -> 0x04ac }
            long r11 = r4.A00     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r23 = "error-receipt"
            java.lang.String r6 = r4.A04     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r22 = "message"
            r21 = r14
            r24 = r6
            r25 = r11
            r27 = r9
            r20 = r13
            X.C63902ts.A07(r20, r21, r22, r23, r24, r25, r27)     // Catch:{ 1hd -> 0x04ac }
            r9 = 0
            r6 = 431(0x1af, float:6.04E-43)
            android.os.Message r4 = android.os.Message.obtain(r10, r9, r6, r9, r4)     // Catch:{ 1hd -> 0x04ac }
            X.AnonymousClass1N9.A02(r4, r5)     // Catch:{ 1hd -> 0x04ac }
            goto L_0x0462
        L_0x03db:
            X.A89 r10 = r2.A0C     // Catch:{ 1hd -> 0x04ac }
            X.8bt r5 = X.AnonymousClass8BS.A0K(r11)     // Catch:{ 1hd -> 0x04ac }
            X.0ve r4 = r10.A00     // Catch:{ 1hd -> 0x04ac }
            java.util.ArrayList r5 = X.A89.A02(r4, r5)     // Catch:{ 1hd -> 0x04ac }
            if (r5 == 0) goto L_0x03ee
            java.lang.String r4 = "Receive Time"
            X.A89.A03(r10, r4, r5)     // Catch:{ 1hd -> 0x04ac }
        L_0x03ee:
            X.205 r4 = r0.A0B     // Catch:{ 1hd -> 0x04ac }
            X.1BI r10 = r4.A00     // Catch:{ 1hd -> 0x04ac }
            if (r10 == 0) goto L_0x040b
            X.0ve r5 = r2.A05     // Catch:{ 1hd -> 0x04ac }
            X.C18070vi.A0d(r5, r9)     // Catch:{ 1hd -> 0x04ac }
            r9 = 3609(0xe19, float:5.057E-42)
            X.0vf r4 = X.C18040vf.A02     // Catch:{ 1hd -> 0x04ac }
            boolean r4 = X.C18020vd.A05(r4, r5, r9)     // Catch:{ 1hd -> 0x04ac }
            if (r4 == 0) goto L_0x040b
            X.8bt r4 = r11.hydratedTemplate_     // Catch:{ 1hd -> 0x04ac }
            if (r4 != 0) goto L_0x0470
            X.8bt r4 = X.C165868bt.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x04ac }
            if (r4 != 0) goto L_0x0470
        L_0x040b:
            X.A4L.A01(r2, r6, r0)     // Catch:{ 1hd -> 0x04ac }
            X.1ya r4 = r7.A05     // Catch:{ 1hd -> 0x04ac }
            X.1ya r5 = r7.A04     // Catch:{ 1hd -> 0x04ac }
            boolean r4 = X.C60622oL.A01(r4, r5)     // Catch:{ 1hd -> 0x04ac }
            if (r4 == 0) goto L_0x041f
            r6.A0O = r5     // Catch:{ 1hd -> 0x04ac }
            r4 = 4096(0x1000, double:2.0237E-320)
            r6.A0b(r4)     // Catch:{ 1hd -> 0x04ac }
        L_0x041f:
            boolean r4 = r7.A08     // Catch:{ 1hd -> 0x04ac }
            r6.A0r = r4     // Catch:{ 1hd -> 0x04ac }
            X.122 r4 = r2.A03     // Catch:{ 1hd -> 0x04ac }
            r4.BBY(r6)     // Catch:{ 1hd -> 0x04ac }
            X.1pi r13 = r2.A04     // Catch:{ 1hd -> 0x04ac }
            X.8bt r4 = X.AnonymousClass8BS.A0K(r11)     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r10 = r4.templateId_     // Catch:{ 1hd -> 0x04ac }
            X.00H r4 = r13.A01     // Catch:{ 1hd -> 0x04ac }
            java.lang.Object r9 = r4.get()     // Catch:{ 1hd -> 0x04ac }
            X.1gM r9 = (X.C31931gM) r9     // Catch:{ 1hd -> 0x04ac }
            r4 = 26
            X.AkY r5 = new X.AkY     // Catch:{ 1hd -> 0x04ac }
            r5.<init>(r13, r6, r10, r4)     // Catch:{ 1hd -> 0x04ac }
            r4 = 48
            r9.A01(r5, r4)     // Catch:{ 1hd -> 0x04ac }
            X.00H r4 = r2.A0H     // Catch:{ 1hd -> 0x04ac }
            java.lang.Object r9 = r4.get()     // Catch:{ 1hd -> 0x04ac }
            X.2qT r9 = (X.C61902qT) r9     // Catch:{ 1hd -> 0x04ac }
            X.8bt r4 = X.AnonymousClass8BS.A0K(r11)     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r5 = r4.templateId_     // Catch:{ 1hd -> 0x04ac }
            X.B5K r4 = r0.A06(r12)     // Catch:{ 1hd -> 0x04ac }
            X.AVx r4 = (X.C20717AVx) r4     // Catch:{ 1hd -> 0x04ac }
            if (r4 == 0) goto L_0x046e
            java.lang.String r4 = r4.A01     // Catch:{ 1hd -> 0x04ac }
        L_0x045c:
            r9.A01(r6, r5, r4)     // Catch:{ 1hd -> 0x04ac }
            X.A4L.A00(r2, r6, r0)     // Catch:{ 1hd -> 0x04ac }
        L_0x0462:
            int r5 = r7.A03     // Catch:{ 1hd -> 0x04ac }
            r4 = -1
            if (r5 == r4) goto L_0x0767
            X.122 r2 = r2.A03     // Catch:{ 1hd -> 0x04ac }
            r2.BAz(r8, r7)     // Catch:{ 1hd -> 0x04ac }
            goto L_0x0767
        L_0x046e:
            r4 = 0
            goto L_0x045c
        L_0x0470:
            X.EE9 r4 = r4.hydratedButtons_     // Catch:{ 1hd -> 0x04ac }
            java.util.Iterator r14 = r4.iterator()     // Catch:{ 1hd -> 0x04ac }
        L_0x0476:
            boolean r4 = r14.hasNext()     // Catch:{ 1hd -> 0x04ac }
            if (r4 == 0) goto L_0x040b
            java.lang.Object r13 = r14.next()     // Catch:{ 1hd -> 0x04ac }
            X.8ch r13 = (X.C166318ch) r13     // Catch:{ 1hd -> 0x04ac }
            int r9 = r13.hydratedButtonCase_     // Catch:{ 1hd -> 0x04ac }
            r4 = 2
            if (r9 != r4) goto L_0x0476
            X.8bH r4 = r13.A0R()     // Catch:{ 1hd -> 0x04ac }
            java.lang.String r13 = r4.url_     // Catch:{ 1hd -> 0x04ac }
            X.C18070vi.A0b(r13)     // Catch:{ 1hd -> 0x04ac }
            boolean r4 = X.C196919vr.A01(r5, r10, r13)     // Catch:{ 1hd -> 0x04ac }
            if (r4 != 0) goto L_0x04a2
            java.lang.String r9 = "webview"
            java.lang.String r4 = X.C196919vr.A00(r5, r10, r13)     // Catch:{ 1hd -> 0x04ac }
            boolean r4 = r9.equals(r4)     // Catch:{ 1hd -> 0x04ac }
            if (r4 == 0) goto L_0x0476
        L_0x04a2:
            X.A19 r9 = r2.A0B     // Catch:{ 1hd -> 0x04ac }
            r5 = 0
            java.lang.String r4 = "marketing_msg_webview"
            r9.A02(r6, r4, r5)     // Catch:{ 1hd -> 0x04ac }
            goto L_0x040b
        L_0x04ac:
            r2 = move-exception
            int r4 = r2.e2eFailureReason     // Catch:{ Exception -> 0x0b6a }
            r2 = 0
            r1.A01(r2, r4)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0767
        L_0x04b5:
            boolean r4 = r3.A0R()     // Catch:{ Exception -> 0x0b6a }
            if (r4 == 0) goto L_0x0769
            X.8ck r4 = r3.templateMessage_     // Catch:{ Exception -> 0x0b6a }
            if (r4 != 0) goto L_0x04c1
            X.8ck r4 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x04c1:
            int r5 = r4.formatCase_     // Catch:{ Exception -> 0x0b6a }
            r4 = 5
            if (r5 != r4) goto L_0x0769
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r4 = "HsmMessageHandler/handleInteractiveMessageTemplate key="
            r5.append(r4)     // Catch:{ Exception -> 0x0b6a }
            X.205 r4 = r0.A0B     // Catch:{ Exception -> 0x0b6a }
            X.C17900vP.A0b(r4, r5)     // Catch:{ Exception -> 0x0b6a }
            com.whatsapp.jid.UserJid r8 = r0.A05()     // Catch:{ Exception -> 0x0b6a }
            X.8ck r7 = r3.templateMessage_     // Catch:{ Exception -> 0x0b6a }
            if (r7 != 0) goto L_0x04de
            X.8ck r7 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x04de:
            int r5 = r7.formatCase_     // Catch:{ Exception -> 0x0b6a }
            r4 = 5
            if (r5 != r4) goto L_0x04ea
            java.lang.Object r4 = r7.format_     // Catch:{ Exception -> 0x0b6a }
            X.8cp r4 = (X.C166398cp) r4     // Catch:{ Exception -> 0x0b6a }
        L_0x04e7:
            int r5 = r4.interactiveMessageCase_     // Catch:{ Exception -> 0x0b6a }
            goto L_0x04ed
        L_0x04ea:
            X.8cp r4 = X.C166398cp.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
            goto L_0x04e7
        L_0x04ed:
            r4 = 7
            boolean r18 = X.AnonymousClass000.A1T(r5, r4)
            java.lang.String r7 = "carousel_message_receive_tag"
            if (r18 == 0) goto L_0x0502
            X.9lW r9 = r2.A09     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r5 = X.C108955ca.A0x(r2)     // Catch:{ Exception -> 0x0b6a }
            r4 = 238883000(0xe3d10b8, float:2.3304098E-30)
            r9.A00(r4, r7, r5)     // Catch:{ Exception -> 0x0b6a }
        L_0x0502:
            X.00H r4 = r2.A0F     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r4 = r4.get()     // Catch:{ 1hd -> 0x074b }
            X.1l7 r4 = (X.C34811l7) r4     // Catch:{ 1hd -> 0x074b }
            X.9ul r5 = r4.A01(r3)     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x0518
            X.0ve r4 = r2.A05     // Catch:{ 1hd -> 0x074b }
            boolean r4 = r5.A0E(r4)     // Catch:{ 1hd -> 0x074b }
            if (r4 != 0) goto L_0x068c
        L_0x0518:
            boolean r4 = r0.A0T     // Catch:{ 1hd -> 0x074b }
            if (r4 != 0) goto L_0x068c
            java.lang.Class<X.AVy> r4 = X.C20718AVy.class
            X.B5K r9 = r0.A06(r4)     // Catch:{ 1hd -> 0x074b }
            X.AVy r9 = (X.C20718AVy) r9     // Catch:{ 1hd -> 0x074b }
            X.A7C r10 = r2.A0A     // Catch:{ 1hd -> 0x074b }
            X.205 r11 = r0.A0B     // Catch:{ 1hd -> 0x074b }
            long r4 = r0.A0X     // Catch:{ 1hd -> 0x074b }
            r34 = r4
            if (r9 == 0) goto L_0x0536
            java.lang.String r13 = r9.A01     // Catch:{ 1hd -> 0x074b }
        L_0x0530:
            r14 = 4194304(0x400000, double:2.0722615E-317)
            long r4 = r0.A05     // Catch:{ 1hd -> 0x074b }
            goto L_0x0538
        L_0x0536:
            r13 = 0
            goto L_0x0530
        L_0x0538:
            long r4 = r4 & r14
            int r9 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            boolean r30 = X.AnonymousClass000.A1P(r9)
            int r5 = r0.A01     // Catch:{ 1hd -> 0x074b }
            java.lang.Class<X.AVx> r4 = X.C20717AVx.class
            X.B5K r4 = r0.A06(r4)     // Catch:{ 1hd -> 0x074b }
            X.AVx r4 = (X.C20717AVx) r4     // Catch:{ 1hd -> 0x074b }
            if (r4 == 0) goto L_0x0579
            java.lang.String r4 = r4.A01     // Catch:{ 1hd -> 0x074b }
        L_0x054d:
            r9 = 0
            r12 = 0
            r29 = r12
            r20 = r10
            r21 = r3
            r22 = r11
            r23 = r13
            r24 = r4
            r25 = r5
            r26 = r34
            r28 = r12
            X.206 r4 = r20.A04(r21, r22, r23, r24, r25, r26, r28, r29, r30)     // Catch:{ 1hd -> 0x074b }
            boolean r5 = r3.A0R()     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x0624
            X.8ck r5 = r3.templateMessage_     // Catch:{ 1hd -> 0x074b }
            r11 = r5
            if (r5 != 0) goto L_0x0572
            X.8ck r5 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x0572:
            int r5 = r5.bitField0_     // Catch:{ 1hd -> 0x074b }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0624
            goto L_0x057b
        L_0x0579:
            r4 = 0
            goto L_0x054d
        L_0x057b:
            if (r11 != 0) goto L_0x057f
            X.8ck r11 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x057f:
            X.8cd r11 = r11.contextInfo_     // Catch:{ 1hd -> 0x074b }
            if (r11 != 0) goto L_0x0585
            X.8cd r11 = X.C166278cd.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x0585:
            X.0ve r13 = r10.A03     // Catch:{ 1hd -> 0x074b }
            r10 = 5869(0x16ed, float:8.224E-42)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ 1hd -> 0x074b }
            boolean r5 = X.C18020vd.A05(r5, r13, r10)     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x0624
            int r10 = r11.bitField0_     // Catch:{ 1hd -> 0x074b }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r5
            if (r10 == 0) goto L_0x0624
            X.8Zw r5 = r11.dataSharingContext_     // Catch:{ 1hd -> 0x074b }
            r10 = r5
            if (r5 != 0) goto L_0x059f
            X.8Zw r5 = X.C164708Zw.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x059f:
            int r5 = r5.bitField0_     // Catch:{ 1hd -> 0x074b }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0624
            if (r10 != 0) goto L_0x05a9
            X.8Zw r10 = X.C164708Zw.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x05a9:
            X.EE9 r5 = r10.parameters_     // Catch:{ 1hd -> 0x074b }
            java.util.Iterator r16 = r5.iterator()     // Catch:{ 1hd -> 0x074b }
            r10 = 0
        L_0x05b0:
            boolean r5 = r16.hasNext()     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x05e2
            java.lang.Object r13 = r16.next()     // Catch:{ 1hd -> 0x074b }
            X.8bF r13 = (X.C165498bF) r13     // Catch:{ 1hd -> 0x074b }
            int r14 = r13.bitField0_     // Catch:{ 1hd -> 0x074b }
            r5 = r14 & 1
            if (r5 == 0) goto L_0x05b0
            java.lang.String r15 = r13.key_     // Catch:{ 1hd -> 0x074b }
            java.lang.String r5 = "data_sharing_encrypted_token_disclosed"
            boolean r5 = r15.equals(r5)     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x05d3
            r5 = r14 & 2
            if (r5 == 0) goto L_0x05d3
            java.lang.String r10 = r13.stringData_     // Catch:{ 1hd -> 0x074b }
            goto L_0x05b0
        L_0x05d3:
            java.lang.String r5 = "data_sharing_encrypted_token_undisclosed"
            boolean r5 = r15.equals(r5)     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x05b0
            r5 = r14 & 2
            if (r5 == 0) goto L_0x05b0
            java.lang.String r9 = r13.stringData_     // Catch:{ 1hd -> 0x074b }
            goto L_0x05b0
        L_0x05e2:
            X.8Zw r5 = r11.dataSharingContext_     // Catch:{ 1hd -> 0x074b }
            if (r5 != 0) goto L_0x05e8
            X.8Zw r5 = X.C164708Zw.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x05e8:
            boolean r5 = r5.showMmDisclosure_     // Catch:{ 1hd -> 0x074b }
            X.AcA r13 = new X.AcA     // Catch:{ 1hd -> 0x074b }
            r13.<init>(r10, r9, r5)     // Catch:{ 1hd -> 0x074b }
            java.lang.Class<X.AcA> r11 = X.C20956AcA.class
            X.AnonymousClass206.A05(r4, r13, r11)     // Catch:{ 1hd -> 0x074b }
            r10 = 64
            r4.A0V(r10)     // Catch:{ 1hd -> 0x074b }
            boolean r5 = r4 instanceof X.AnonymousClass21L     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x0624
            r5 = r4
            X.21L r5 = (X.AnonymousClass21L) r5     // Catch:{ 1hd -> 0x074b }
            java.util.List r9 = r5.A17()     // Catch:{ 1hd -> 0x074b }
            if (r9 == 0) goto L_0x0624
            boolean r5 = r9.isEmpty()     // Catch:{ 1hd -> 0x074b }
            if (r5 != 0) goto L_0x0624
            java.util.Iterator r9 = r9.iterator()     // Catch:{ 1hd -> 0x074b }
        L_0x0610:
            boolean r5 = r9.hasNext()     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x0624
            X.206 r5 = X.C17880vN.A0Y(r9)     // Catch:{ 1hd -> 0x074b }
            X.C18070vi.A0d(r5, r12)     // Catch:{ 1hd -> 0x074b }
            X.AnonymousClass206.A05(r5, r13, r11)     // Catch:{ 1hd -> 0x074b }
            r5.A0V(r10)     // Catch:{ 1hd -> 0x074b }
            goto L_0x0610
        L_0x0624:
            X.00H r5 = r2.A0G     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r11 = r5.get()     // Catch:{ 1hd -> 0x074b }
            X.9n2 r11 = (X.C191699n2) r11     // Catch:{ 1hd -> 0x074b }
            java.lang.Class<X.AVz> r5 = X.C20719AVz.class
            X.B5K r5 = X.C63362sw.A00(r0, r5)     // Catch:{ 1hd -> 0x074b }
            X.AVz r5 = (X.C20719AVz) r5     // Catch:{ 1hd -> 0x074b }
            if (r5 != 0) goto L_0x0638
            r5 = 0
            goto L_0x0674
        L_0x0638:
            X.205 r10 = r0.A0g     // Catch:{ 1hd -> 0x074b }
            X.205 r9 = r0.A0B     // Catch:{ 1hd -> 0x074b }
            boolean r33 = X.AnonymousClass8BR.A1T(r10, r9)     // Catch:{ 1hd -> 0x074b }
            com.whatsapp.jid.Jid r9 = r0.A0Y     // Catch:{ 1hd -> 0x074b }
            X.1BI r21 = X.C22971Dz.A00(r9)     // Catch:{ 1hd -> 0x074b }
            int r14 = r0.A01     // Catch:{ 1hd -> 0x074b }
            byte[] r12 = r5.A01     // Catch:{ 1hd -> 0x074b }
            byte[] r9 = r5.A02     // Catch:{ 1hd -> 0x074b }
            java.lang.Integer r5 = r5.A00     // Catch:{ 1hd -> 0x074b }
            java.lang.Integer r13 = r0.A0H     // Catch:{ 1hd -> 0x074b }
            if (r13 == 0) goto L_0x067c
            int r30 = r13.intValue()     // Catch:{ 1hd -> 0x074b }
        L_0x0656:
            com.whatsapp.jid.Jid r22 = r0.A04()     // Catch:{ 1hd -> 0x074b }
            r20 = r11
            r23 = r4
            r24 = r10
            r25 = r5
            r26 = r12
            r27 = r9
            r28 = r6
            r29 = r14
            r31 = r34
            X.7PS r5 = r20.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r5 = r5.first     // Catch:{ 1hd -> 0x074b }
            X.Ac2 r5 = (X.C20948Ac2) r5     // Catch:{ 1hd -> 0x074b }
        L_0x0674:
            X.C196899vp.A01(r4, r5)     // Catch:{ 1hd -> 0x074b }
            boolean r5 = r4 instanceof X.AnonymousClass21L     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x06e8
            goto L_0x067f
        L_0x067c:
            r30 = 0
            goto L_0x0656
        L_0x067f:
            if (r8 == 0) goto L_0x06e8
            r9 = r4
            X.21L r9 = (X.AnonymousClass21L) r9     // Catch:{ 1hd -> 0x074b }
            X.9oz r6 = r2.A01     // Catch:{ 1hd -> 0x074b }
            X.118 r5 = r2.A02     // Catch:{ 1hd -> 0x074b }
            X.C181619Re.A00(r6, r5, r8, r9)     // Catch:{ 1hd -> 0x074b }
            goto L_0x06e8
        L_0x068c:
            X.205 r9 = r0.A0B     // Catch:{ 1hd -> 0x074b }
            long r5 = r0.A0X     // Catch:{ 1hd -> 0x074b }
            byte[] r12 = r3.A0M()     // Catch:{ 1hd -> 0x074b }
            int r8 = r0.A01     // Catch:{ 1hd -> 0x074b }
            r13 = 2
            X.23U r4 = new X.23U     // Catch:{ 1hd -> 0x074b }
            r10 = r4
            r11 = r9
            r14 = r8
            r15 = r5
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ 1hd -> 0x074b }
            X.00H r8 = r2.A0G     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r12 = r8.get()     // Catch:{ 1hd -> 0x074b }
            X.9n2 r12 = (X.C191699n2) r12     // Catch:{ 1hd -> 0x074b }
            X.0ve r10 = r12.A01     // Catch:{ 1hd -> 0x074b }
            r9 = 5718(0x1656, float:8.013E-42)
            X.0vf r8 = X.C18040vf.A02     // Catch:{ 1hd -> 0x074b }
            boolean r8 = X.C18020vd.A05(r8, r10, r9)     // Catch:{ 1hd -> 0x074b }
            r11 = 0
            if (r8 == 0) goto L_0x06e5
            java.lang.Class<X.AVz> r8 = X.C20719AVz.class
            X.B5K r8 = X.C63362sw.A00(r0, r8)     // Catch:{ all -> 0x06dd }
            X.AVz r8 = (X.C20719AVz) r8     // Catch:{ all -> 0x06dd }
            if (r8 == 0) goto L_0x06e5
            java.lang.String r13 = r0.A0h     // Catch:{ all -> 0x06dd }
            byte[] r10 = r8.A01     // Catch:{ all -> 0x06dd }
            byte[] r9 = r8.A02     // Catch:{ all -> 0x06dd }
            java.lang.Integer r8 = r8.A00     // Catch:{ all -> 0x06dd }
            X.Ac2 r20 = new X.Ac2     // Catch:{ all -> 0x06dd }
            r26 = r11
            r21 = r8
            r22 = r13
            r23 = r10
            r24 = r9
            r25 = r11
            r27 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x06dd }
            r11 = r20
            goto L_0x06e5
        L_0x06dd:
            r8 = move-exception
            X.1Qo r6 = r12.A00     // Catch:{ 1hd -> 0x074b }
            X.8oI r5 = X.AnonymousClass8oI.A05     // Catch:{ 1hd -> 0x074b }
            r6.A01(r5, r11, r8)     // Catch:{ 1hd -> 0x074b }
        L_0x06e5:
            X.C196899vp.A01(r4, r11)     // Catch:{ 1hd -> 0x074b }
        L_0x06e8:
            X.A4L.A01(r2, r4, r0)     // Catch:{ 1hd -> 0x074b }
            r0.A0A = r4     // Catch:{ 1hd -> 0x074b }
            X.1lt r5 = r2.A07     // Catch:{ 1hd -> 0x074b }
            X.C35241lt.A00(r5, r4, r0)     // Catch:{ 1hd -> 0x074b }
            X.1pi r10 = r2.A04     // Catch:{ 1hd -> 0x074b }
            X.8ck r5 = r3.templateMessage_     // Catch:{ 1hd -> 0x074b }
            if (r5 != 0) goto L_0x06fa
            X.8ck r5 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x06fa:
            java.lang.String r9 = r5.templateId_     // Catch:{ 1hd -> 0x074b }
            X.00H r5 = r10.A01     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r8 = r5.get()     // Catch:{ 1hd -> 0x074b }
            X.1gM r8 = (X.C31931gM) r8     // Catch:{ 1hd -> 0x074b }
            r5 = 26
            X.AkY r6 = new X.AkY     // Catch:{ 1hd -> 0x074b }
            r6.<init>(r10, r4, r9, r5)     // Catch:{ 1hd -> 0x074b }
            r5 = 48
            r8.A01(r6, r5)     // Catch:{ 1hd -> 0x074b }
            X.00H r5 = r2.A0H     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r8 = r5.get()     // Catch:{ 1hd -> 0x074b }
            X.2qT r8 = (X.C61902qT) r8     // Catch:{ 1hd -> 0x074b }
            X.8ck r5 = r3.templateMessage_     // Catch:{ 1hd -> 0x074b }
            if (r5 != 0) goto L_0x071e
            X.8ck r5 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x074b }
        L_0x071e:
            java.lang.String r6 = r5.templateId_     // Catch:{ 1hd -> 0x074b }
            java.lang.Class<X.AVx> r5 = X.C20717AVx.class
            X.B5K r5 = r0.A06(r5)     // Catch:{ 1hd -> 0x074b }
            X.AVx r5 = (X.C20717AVx) r5     // Catch:{ 1hd -> 0x074b }
            if (r5 == 0) goto L_0x0730
            java.lang.String r5 = r5.A01     // Catch:{ 1hd -> 0x074b }
        L_0x072c:
            r8.A01(r4, r6, r5)     // Catch:{ 1hd -> 0x074b }
            goto L_0x0732
        L_0x0730:
            r5 = 0
            goto L_0x072c
        L_0x0732:
            if (r18 == 0) goto L_0x0747
            X.9lW r5 = r2.A09     // Catch:{ 1hd -> 0x074b }
            java.util.Map r8 = r5.A02     // Catch:{ 1hd -> 0x074b }
            java.lang.Object r6 = r8.get(r7)     // Catch:{ 1hd -> 0x074b }
            X.19a r6 = (X.C222119a) r6     // Catch:{ 1hd -> 0x074b }
            if (r6 == 0) goto L_0x0747
            r5 = 2
            r6.A0C(r5)     // Catch:{ 1hd -> 0x074b }
            r8.remove(r7)     // Catch:{ 1hd -> 0x074b }
        L_0x0747:
            X.A4L.A00(r2, r4, r0)     // Catch:{ 1hd -> 0x074b }
            goto L_0x0767
        L_0x074b:
            r6 = move-exception
            if (r18 == 0) goto L_0x0761
            X.9lW r2 = r2.A09     // Catch:{ Exception -> 0x0b6a }
            java.util.Map r5 = r2.A02     // Catch:{ Exception -> 0x0b6a }
            java.lang.Object r4 = r5.get(r7)     // Catch:{ Exception -> 0x0b6a }
            X.19a r4 = (X.C222119a) r4     // Catch:{ Exception -> 0x0b6a }
            if (r4 == 0) goto L_0x0761
            r2 = 3
            r4.A0C(r2)     // Catch:{ Exception -> 0x0b6a }
            r5.remove(r7)     // Catch:{ Exception -> 0x0b6a }
        L_0x0761:
            int r4 = r6.e2eFailureReason     // Catch:{ Exception -> 0x0b6a }
            r2 = 0
            r1.A01(r2, r4)     // Catch:{ Exception -> 0x0b6a }
        L_0x0767:
            r2 = 1
            goto L_0x07c8
        L_0x0769:
            X.205 r9 = r0.A0B     // Catch:{ Exception -> 0x0b6a }
            long r4 = r0.A0X     // Catch:{ Exception -> 0x0b6a }
            r8 = 19
            X.21r r6 = new X.21r     // Catch:{ Exception -> 0x0b6a }
            r6.<init>(r9, r8, r4)     // Catch:{ Exception -> 0x0b6a }
            X.A4L.A01(r2, r6, r0)     // Catch:{ Exception -> 0x0b6a }
            X.206 r4 = r0.A0A     // Catch:{ Exception -> 0x0b6a }
            if (r4 != 0) goto L_0x077e
            r0.A09(r6)     // Catch:{ Exception -> 0x0b6a }
        L_0x077e:
            X.122 r8 = r2.A03     // Catch:{ Exception -> 0x0b6a }
            r8.BBY(r6)     // Catch:{ Exception -> 0x0b6a }
            int r5 = r7.A03     // Catch:{ Exception -> 0x0b6a }
            r4 = -1
            if (r5 == r4) goto L_0x078b
            r8.BAz(r10, r7)     // Catch:{ Exception -> 0x0b6a }
        L_0x078b:
            X.1N9 r8 = r2.A08     // Catch:{ Exception -> 0x0b6a }
            long r4 = r6.A10     // Catch:{ Exception -> 0x0b6a }
            X.0ve r9 = r8.A04     // Catch:{ Exception -> 0x0b6a }
            X.190 r7 = r8.A00     // Catch:{ Exception -> 0x0b6a }
            X.205 r2 = r6.A0v     // Catch:{ Exception -> 0x0b6a }
            X.1BI r11 = r2.A00     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r10 = r2.A01     // Catch:{ Exception -> 0x0b6a }
            X.1BI r12 = r6.A0H()     // Catch:{ Exception -> 0x0b6a }
            r6 = 0
            java.lang.String r14 = "hsm-envelope-mismatch"
            X.2fh r2 = new X.2fh     // Catch:{ Exception -> 0x0b6a }
            r13 = r10
            r15 = r4
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0b6a }
            long r4 = r2.A00     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r23 = "error-receipt"
            java.lang.String r10 = r2.A04     // Catch:{ Exception -> 0x0b6a }
            r27 = 1
            java.lang.String r22 = "message"
            r20 = r7
            r21 = r9
            r24 = r10
            r25 = r4
            X.C63902ts.A07(r20, r21, r22, r23, r24, r25, r27)     // Catch:{ Exception -> 0x0b6a }
            r5 = 0
            r4 = 431(0x1af, float:6.04E-43)
            android.os.Message r2 = android.os.Message.obtain(r6, r5, r4, r5, r2)     // Catch:{ Exception -> 0x0b6a }
            X.AnonymousClass1N9.A02(r2, r8)     // Catch:{ Exception -> 0x0b6a }
            r2 = 0
        L_0x07c8:
            r2 = r2 & r19
            r1.A00 = r2     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a63
        L_0x07ce:
            com.whatsapp.jid.UserJid r5 = r0.A05()     // Catch:{ Exception -> 0x0b6a }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/processRegularMessage, senderJid="
            X.C17900vP.A0Y(r5, r2, r4)     // Catch:{ Exception -> 0x0b6a }
            r0.A07 = r3     // Catch:{ Exception -> 0x0b6a }
            int r4 = r3.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r2
            boolean r2 = X.AnonymousClass000.A1O(r4)     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x080e
            X.8cG r2 = r3.messageContextInfo_     // Catch:{ Exception -> 0x0b6a }
            r4 = r2
            if (r2 != 0) goto L_0x07ef
            X.8cG r2 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x07ef:
            int r2 = r2.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r2 = r2 & 8
            if (r2 == 0) goto L_0x080e
            r2 = r4
            if (r4 != 0) goto L_0x07fa
            X.8cG r2 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x07fa:
            X.DSQ r2 = r2.paddingBytes_     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x080e
            if (r4 != 0) goto L_0x0802
            X.8cG r4 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x0802:
            X.DSQ r2 = r4.paddingBytes_     // Catch:{ Exception -> 0x0b6a }
            int r2 = r2.A02()     // Catch:{ Exception -> 0x0b6a }
            java.lang.Long r2 = X.C17880vN.A0n(r2)     // Catch:{ Exception -> 0x0b6a }
            r0.A0J = r2     // Catch:{ Exception -> 0x0b6a }
        L_0x080e:
            X.9h8 r9 = r1.A0F     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r8 = 0
            r7 = 2
            X.0ve r11 = r9.A02     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.8cd r5 = X.A0O.A00(r11, r3)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.00H r2 = r9.A06     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            java.lang.Object r10 = r2.get()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1l7 r10 = (X.C34811l7) r10     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1CJ r4 = r9.A00     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1BI r2 = r0.A03()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            boolean r2 = X.C20102A7g.A04(r10, r4, r11, r2, r3)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x092e
            boolean r2 = r0.A0T     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x092e
            if (r5 == 0) goto L_0x087c
            int r2 = r5.bitField0_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x087c
            X.205 r2 = r0.A0B     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1BI r7 = r2.A00     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            boolean r4 = r2.A02     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.8cq r2 = r5.placeholderKey_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x0844
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x0844:
            java.lang.String r2 = r2.id_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.205 r8 = X.AnonymousClass205.A01(r7, r2, r4)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1W6 r2 = r9.A05     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.206 r7 = X.C108945cZ.A0s(r8, r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r7 == 0) goto L_0x087c
            int r4 = r7.A0u     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2 = 31
            if (r4 != r2) goto L_0x087c
            com.whatsapp.jid.UserJid r4 = r7.A0I()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            com.whatsapp.jid.UserJid r2 = r0.A05()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            boolean r2 = X.C42171xk.A00(r4, r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 == 0) goto L_0x087c
            java.lang.String r2 = "IncomingFMessageBuilder/placeholder message"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            java.lang.String r7 = r8.A01     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r7 == 0) goto L_0x087c
            X.205 r2 = r0.A0B     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1BI r4 = r2.A00     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            boolean r2 = r2.A02     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.205 r2 = X.AnonymousClass205.A01(r4, r7, r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r0.A0B(r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x087c:
            X.9p8 r2 = X.C181639Rg.A00(r3, r0, r6)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.A6d r4 = r2.A00()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.12N r2 = r9.A03     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.206 r7 = r2.A00(r4)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.1lr r2 = r9.A04     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.C35221lr.A00(r7, r0)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2.A02(r5, r7, r0)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.8cG r5 = r3.messageContextInfo_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r4 = r5
            if (r5 != 0) goto L_0x089b
            X.8cG r5 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r5 == 0) goto L_0x0952
        L_0x089b:
            int r2 = r5.bitField0_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0952
            X.8c6 r2 = r5.deviceListMetadata_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x08a7
            X.8c6 r2 = X.C165958c6.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x08a7:
            int r2 = r2.senderAccountType_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.2RD r2 = X.AnonymousClass2RD.A00(r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x08b1
            X.2RD r2 = X.AnonymousClass2RD.E2EE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x08b1:
            X.2RD r8 = X.AnonymousClass2RD.HOSTED     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != r8) goto L_0x0952
            if (r4 != 0) goto L_0x08bb
            X.8cG r4 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r4 == 0) goto L_0x08d3
        L_0x08bb:
            X.8c6 r2 = r4.deviceListMetadata_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x08c3
            X.8c6 r2 = X.C165958c6.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 == 0) goto L_0x08d3
        L_0x08c3:
            int r2 = r2.senderAccountType_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.2RD r2 = X.AnonymousClass2RD.A00(r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 == 0) goto L_0x08d3
            if (r2 != r8) goto L_0x08d3
            r4 = 134217728(0x8000000, double:6.63123685E-316)
            r7.A0b(r4)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x08d3:
            X.1U5 r10 = r9.A01     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.8cG r11 = r3.messageContextInfo_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r11 != 0) goto L_0x08db
            X.8cG r11 = X.C166048cG.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x08db:
            int r2 = r11.bitField0_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x08f2
            X.8c6 r2 = r11.deviceListMetadata_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x08e7
            X.8c6 r2 = X.C165958c6.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x08e7:
            int r2 = r2.senderAccountType_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.2RD r4 = X.AnonymousClass2RD.A00(r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r4 == 0) goto L_0x08f2
            r2 = 1
            if (r4 == r8) goto L_0x08f3
        L_0x08f2:
            r2 = 0
        L_0x08f3:
            X.C17960vV.A0C(r2)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            com.whatsapp.jid.UserJid r8 = r7.A0I()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.11S r2 = r10.A02     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            boolean r2 = r2.A0O(r8)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x0952
            X.1MR r5 = r10.A09     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.2RD r4 = r5.A06(r8)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.2RD r2 = X.AnonymousClass2RD.E2EE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r4 != r2) goto L_0x0952
            long r8 = r5.A01(r8)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.8c6 r2 = r11.deviceListMetadata_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 != 0) goto L_0x0916
            X.8c6 r2 = X.C165958c6.DEFAULT_INSTANCE     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x0916:
            long r4 = r2.senderTimestamp_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0952
            r4 = 33554432(0x2000000, double:1.6578092E-316)
            r7.A0b(r4)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.00H r2 = r10.A0C     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            java.lang.Object r2 = r2.get()     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.6lu r2 = (X.C131936lu) r2     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2.A00(r7)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            goto L_0x0952
        L_0x092e:
            int r4 = r3.bitField1_     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            r2 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r4
            if (r2 != 0) goto L_0x093e
            r2 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 & r2
            boolean r2 = X.AnonymousClass000.A1O(r4)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 == 0) goto L_0x0949
        L_0x093e:
            int r2 = r0.A01     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            if (r2 == 0) goto L_0x0949
            java.lang.String r2 = "IncomingFMessageBuilder/buildFMessage: Unsupported message type and edit version combination for scheduled call messages"
            X.1hd r2 = X.AnonymousClass8BU.A0a(r2, r8)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            throw r2     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x0949:
            X.1lr r2 = r9.A04     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            X.23U r7 = r2.A01(r0, r6, r7)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
            A02(r3, r7)     // Catch:{ 8t1 -> 0x0a37, 98X -> 0x0a22, 98Y -> 0x0a19, 1hd -> 0x0a12, 1hc -> 0x0a10, 9L5 -> 0x09fd }
        L_0x0952:
            int r8 = r7.A0u     // Catch:{ Exception -> 0x0b6a }
            r2 = 108(0x6c, float:1.51E-43)
            r6 = 69
            r9 = 0
            r10 = 1
            if (r8 != r2) goto L_0x0979
            java.lang.String r2 = "DecryptionCallbackV2/unsupported message"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ Exception -> 0x0b6a }
            java.util.ArrayList r4 = X.C17880vN.A0z(r10)     // Catch:{ Exception -> 0x0b6a }
            r4.add(r7)     // Catch:{ Exception -> 0x0b6a }
            X.122 r2 = r1.A06     // Catch:{ Exception -> 0x0b6a }
            r2.BIL(r4, r10)     // Catch:{ Exception -> 0x0b6a }
            r1.A01(r3, r6)     // Catch:{ Exception -> 0x0b6a }
            if (r17 == 0) goto L_0x0a63
            X.1N9 r2 = r1.A0G     // Catch:{ Exception -> 0x0b6a }
            r2.A0D(r0)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x09fa
        L_0x0979:
            java.lang.Integer r5 = X.AnonymousClass1PT.A03(r7)     // Catch:{ Exception -> 0x0b6a }
            if (r5 == 0) goto L_0x0983
            X.2HL r2 = r1.A0A     // Catch:{ Exception -> 0x0b6a }
            r2.A0C = r5     // Catch:{ Exception -> 0x0b6a }
        L_0x0983:
            X.8vJ r4 = r1.A0I     // Catch:{ Exception -> 0x0b6a }
            if (r4 == 0) goto L_0x0993
            if (r5 == 0) goto L_0x098b
            r4.A02 = r5     // Catch:{ Exception -> 0x0b6a }
        L_0x098b:
            X.00H r2 = r1.A0L     // Catch:{ Exception -> 0x0b6a }
            int r2 = X.C62242r5.A00(r7, r2)     // Catch:{ Exception -> 0x0b6a }
            r4.A00 = r2     // Catch:{ Exception -> 0x0b6a }
        L_0x0993:
            X.2HL r4 = r1.A0A     // Catch:{ Exception -> 0x0b6a }
            X.00H r2 = r1.A0L     // Catch:{ Exception -> 0x0b6a }
            int r2 = X.C62242r5.A00(r7, r2)     // Catch:{ Exception -> 0x0b6a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0b6a }
            r4.A0E = r2     // Catch:{ Exception -> 0x0b6a }
            boolean r2 = X.AnonymousClass25A.A0p(r7)     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x09be
            int r2 = r7.A01     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x09bc
            boolean r2 = r7 instanceof X.AnonymousClass227     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x09be
            boolean r2 = r7 instanceof X.AnonymousClass22A     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x09be
            boolean r2 = r7 instanceof X.AnonymousClass22C     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x09be
            boolean r2 = r7 instanceof X.C444923q     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x09bc
            goto L_0x09be
        L_0x09bc:
            r4 = 0
            goto L_0x09bf
        L_0x09be:
            r4 = 1
        L_0x09bf:
            int r5 = r7.A01     // Catch:{ Exception -> 0x0b6a }
            if (r5 == 0) goto L_0x09cd
            r2 = 2
            if (r5 == r2) goto L_0x09cd
            if (r5 == r10) goto L_0x09cd
            r2 = 12
            if (r8 == r2) goto L_0x09cd
            r10 = 0
        L_0x09cd:
            if (r4 != 0) goto L_0x09f5
            if (r10 != 0) goto L_0x09f5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/unsupported message; edit="
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            r4.append(r5)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = ", type="
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            r4.append(r8)     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = ", id="
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            X.205 r2 = r7.A0v     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = r2.A01     // Catch:{ Exception -> 0x0b6a }
            X.C17890vO.A19(r4, r2)     // Catch:{ Exception -> 0x0b6a }
            r1.A01(r3, r6)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a63
        L_0x09f5:
            X.1lt r2 = r1.A0D     // Catch:{ Exception -> 0x0b6a }
            X.C35241lt.A00(r2, r7, r0)     // Catch:{ Exception -> 0x0b6a }
        L_0x09fa:
            r1.A00 = r9     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a63
        L_0x09fd:
            r4 = move-exception
            r2 = 1
            r0.A0U = r2     // Catch:{ Exception -> 0x0b6a }
            r2 = 9
            r0.A02 = r2     // Catch:{ Exception -> 0x0b6a }
            int r4 = r4.failureReason     // Catch:{ Exception -> 0x0b6a }
            r2 = 35
            if (r4 == 0) goto L_0x0a15
            r2 = 1
            if (r4 == r2) goto L_0x0a10
            goto L_0x0b58
        L_0x0a10:
            r2 = 0
            goto L_0x0a15
        L_0x0a12:
            r2 = move-exception
            int r2 = r2.e2eFailureReason     // Catch:{ Exception -> 0x0b6a }
        L_0x0a15:
            r1.A01(r3, r2)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a63
        L_0x0a19:
            r2 = move-exception
            X.ARP r4 = r1.A07     // Catch:{ Exception -> 0x0b6a }
            X.9tq r2 = r2.messageOrphan     // Catch:{ Exception -> 0x0b6a }
            r4.A01(r2)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a63
        L_0x0a22:
            r5 = move-exception
            X.9h8 r2 = r1.A0F     // Catch:{ Exception -> 0x0b6a }
            r4 = 2
            X.1lr r2 = r2.A04     // Catch:{ Exception -> 0x0b6a }
            X.23U r4 = r2.A01(r0, r6, r4)     // Catch:{ Exception -> 0x0b6a }
            int r2 = r5.futureMessageType     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x0a33
            r4.A00 = r2     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a54
        L_0x0a33:
            A02(r3, r4)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a54
        L_0x0a37:
            r5 = move-exception
            X.9h8 r2 = r1.A0F     // Catch:{ Exception -> 0x0b6a }
            r4 = 2
            X.1lr r2 = r2.A04     // Catch:{ Exception -> 0x0b6a }
            X.23U r4 = r2.A01(r0, r6, r4)     // Catch:{ Exception -> 0x0b6a }
            int r2 = r5.futureMessageType     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x0a5a
            r4.A00 = r2     // Catch:{ Exception -> 0x0b6a }
        L_0x0a47:
            X.36t r2 = r5.parentAssociationInfo     // Catch:{ Exception -> 0x0b6a }
            X.C60512o9.A01(r4, r2)     // Catch:{ Exception -> 0x0b6a }
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0b6a }
            r4.A0S = r2     // Catch:{ Exception -> 0x0b6a }
        L_0x0a54:
            X.1lt r2 = r1.A0D     // Catch:{ Exception -> 0x0b6a }
            X.C35241lt.A00(r2, r4, r0)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a63
        L_0x0a5a:
            A02(r3, r4)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0a47
        L_0x0a5e:
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext skipping processing, sender-key distribution only message"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x0b6a }
        L_0x0a63:
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0046
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/processSenderKeyDistributionMessage key="
            r4.append(r2)     // Catch:{ Exception -> 0x0b6a }
            X.205 r2 = r0.A0B     // Catch:{ Exception -> 0x0b6a }
            X.C17900vP.A0b(r2, r4)     // Catch:{ Exception -> 0x0b6a }
            X.8ZH r5 = r3.senderKeyDistributionMessage_     // Catch:{ Exception -> 0x0b6a }
            if (r5 != 0) goto L_0x0a7d
            X.8ZH r5 = X.AnonymousClass8ZH.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0b6a }
        L_0x0a7d:
            int r4 = r5.bitField0_     // Catch:{ Exception -> 0x0b6a }
            r2 = r4 & 1
            if (r2 == 0) goto L_0x0b37
            r2 = r4 & 2
            if (r2 == 0) goto L_0x0b37
            X.1BI r4 = r1.A0B     // Catch:{ Exception -> 0x0b6a }
            boolean r2 = X.C22971Dz.A0e(r4)     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x0aa3
            java.lang.String r4 = r4.getRawString()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = r5.groupId_     // Catch:{ Exception -> 0x0b6a }
            boolean r2 = r4.equals(r2)     // Catch:{ Exception -> 0x0b6a }
            if (r2 != 0) goto L_0x0aa3
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/group id on message and group id in ciphertext do not match; message.key="
            goto L_0x0b3d
        L_0x0aa3:
            java.lang.String r4 = r5.groupId_     // Catch:{ Exception -> 0x0b6a }
            X.2nE r2 = r1.A04     // Catch:{ Exception -> 0x0b6a }
            X.2nC r10 = new X.2nC     // Catch:{ Exception -> 0x0b6a }
            r10.<init>(r2, r4)     // Catch:{ Exception -> 0x0b6a }
            X.1P3 r4 = r1.A05     // Catch:{ Exception -> 0x0b6a }
            X.DSQ r2 = r5.axolotlSenderKeyDistributionMessage_     // Catch:{ Exception -> 0x0b6a }
            byte[] r5 = r2.A06()     // Catch:{ Exception -> 0x0b6a }
            X.1Os r2 = r4.A0H     // Catch:{ Exception -> 0x0b6a }
            X.3Ez r9 = X.C25571Os.A01(r2, r10)     // Catch:{ Exception -> 0x0b6a }
            r9.lock()     // Catch:{ Exception -> 0x0b6a }
            X.1PJ r4 = r4.A01     // Catch:{ all -> 0x0b5f }
            java.lang.String r6 = "SignalCoordinatorDefault/processSenderKey"
            int r2 = r5.length     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            if (r2 == 0) goto L_0x0af9
            X.AmM r8 = new X.AmM     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            r8.<init>(r5)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.1Ot r2 = r4.A03     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            boolean r2 = r2.A03()     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            if (r2 == 0) goto L_0x0ae8
            X.1PH r2 = r4.A00     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.1Oy r7 = r2.A04     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.2kj r4 = X.C62812s2.A02(r10)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            java.lang.Object r5 = X.C20024A3q.A00     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            monitor-enter(r5)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.2bX r2 = A00(r7, r4, r8)     // Catch:{ all -> 0x0ae5 }
            r7.A04(r4, r2)     // Catch:{ all -> 0x0ae5 }
            monitor-exit(r5)     // Catch:{ all -> 0x0ae5 }
            goto L_0x0af7
        L_0x0ae5:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0ae5 }
            goto L_0x0b00
        L_0x0ae8:
            X.1PH r2 = r4.A00     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.1Oy r5 = r2.A04     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.2kj r4 = X.C62812s2.A02(r10)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            X.2bX r2 = A00(r5, r4, r8)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            r5.A04(r4, r2)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
        L_0x0af7:
            r5 = 0
            goto L_0x0b15
        L_0x0af9:
            java.lang.String r2 = "Data is empty"
            X.1P5 r4 = new X.1P5     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
            r4.<init>((java.lang.String) r2)     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
        L_0x0b00:
            throw r4     // Catch:{ 1P4 -> 0x0b0f, 1P5 -> 0x0b08, Exception -> 0x0b01 }
        L_0x0b01:
            r2 = move-exception
            com.whatsapp.util.Log.w(r6, r2)     // Catch:{ all -> 0x0b5f }
            r5 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x0b15
        L_0x0b08:
            r2 = move-exception
            com.whatsapp.util.Log.w(r6, r2)     // Catch:{ all -> 0x0b5f }
            r5 = -1005(0xfffffffffffffc13, float:NaN)
            goto L_0x0b15
        L_0x0b0f:
            r2 = move-exception
            com.whatsapp.util.Log.w(r6, r2)     // Catch:{ all -> 0x0b5f }
            r5 = -1007(0xfffffffffffffc11, float:NaN)
        L_0x0b15:
            r9.close()     // Catch:{ Exception -> 0x0b6a }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/processSenderKeyDistributionMessage/status/"
            X.C17900vP.A0j(r2, r4, r5)     // Catch:{ Exception -> 0x0b6a }
            r2 = -1005(0xfffffffffffffc13, float:NaN)
            if (r5 != r2) goto L_0x0b2c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received invalid sender key distribution message; message.key="
            goto L_0x0b3d
        L_0x0b2c:
            r2 = -1007(0xfffffffffffffc11, float:NaN)
            if (r5 != r2) goto L_0x0b43
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received legacy sender key distribution message; message.key="
            goto L_0x0b3d
        L_0x0b37:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0b6a }
            java.lang.String r2 = "DecryptionCallbackV2/axolotl received incomplete sender key distribution message; message.key="
        L_0x0b3d:
            X.C63362sw.A01(r0, r2, r4)     // Catch:{ Exception -> 0x0b6a }
            X.AnonymousClass8BT.A1M(r4)     // Catch:{ Exception -> 0x0b6a }
        L_0x0b43:
            if (r17 == 0) goto L_0x0046
            boolean r2 = r1.A00     // Catch:{ Exception -> 0x0b6a }
            if (r2 == 0) goto L_0x0046
            X.1N9 r2 = r1.A0G     // Catch:{ Exception -> 0x0b6a }
            r2.A0D(r0)     // Catch:{ Exception -> 0x0b6a }
            goto L_0x0b69
        L_0x0b4f:
            X.1N9 r2 = r1.A0G     // Catch:{ Exception -> 0x0b6a }
            r2.A0D(r0)     // Catch:{ Exception -> 0x0b6a }
            r1.A00 = r5     // Catch:{ Exception -> 0x0b6a }
            return
        L_0x0b57:
            return
        L_0x0b58:
            java.lang.String r2 = "Invalid failure reason"
            java.lang.IllegalArgumentException r2 = X.AnonymousClass000.A0k(r2)     // Catch:{ Exception -> 0x0b6a }
            throw r2     // Catch:{ Exception -> 0x0b6a }
        L_0x0b5f:
            r4 = move-exception
            r9.close()     // Catch:{ all -> 0x0b64 }
            goto L_0x0b68
        L_0x0b64:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r4, r2)     // Catch:{ Exception -> 0x0b6a }
        L_0x0b68:
            throw r4     // Catch:{ Exception -> 0x0b6a }
        L_0x0b69:
            return
        L_0x0b6a:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext Error processing e2e message; message.key="
            X.C63362sw.A01(r0, r2, r4)
            X.C17880vN.A1M(r4, r5)
            boolean r0 = r5 instanceof android.database.sqlite.SQLiteFullException
            if (r0 != 0) goto L_0x0b85
            boolean r0 = r5 instanceof android.database.sqlite.SQLiteDatabaseCorruptException
            if (r0 != 0) goto L_0x0b85
            r0 = 34
            r1.A01(r3, r0)
            return
        L_0x0b85:
            throw r5
        L_0x0b86:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "DecryptionCallbackV2/handlePlaintext axolotl derived plaintext does not represent valid protocol buffer; message.key="
            X.C63362sw.A01(r0, r2, r3)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w(r0, r4)
            r0 = 11
            r1.A01(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20582AQs.BcN(byte[]):void");
    }

    public C20582AQs(C19880zA r6, AnonymousClass190 r7, AnonymousClass11S r8, C60002nE r9, AnonymousClass1P3 r10, AnonymousClass122 r11, ARP arp, C32981i4 r13, C18030ve r14, AnonymousClass2HL r15, C35241lt r16, A4L a4l, C188259h8 r18, AnonymousClass1N9 r19, C35211lq r20, AnonymousClass1N7 r21, AnonymousClass1PT r22, C63362sw r23, AnonymousClass00H r24, Integer num, boolean z, boolean z2) {
        this.A04 = r9;
        this.A0M = num;
        C63362sw r3 = r23;
        this.A0K = r3;
        this.A0A = r15;
        this.A0N = z;
        this.A00 = z2;
        this.A09 = r14;
        this.A02 = r7;
        this.A03 = r8;
        this.A0G = r19;
        this.A08 = r13;
        this.A0J = r22;
        this.A06 = r11;
        this.A0E = a4l;
        this.A05 = r10;
        this.A07 = arp;
        this.A0D = r16;
        this.A0H = r20;
        this.A0F = r18;
        this.A0L = r24;
        this.A01 = r6;
        this.A0I = (C173578vJ) AnonymousClass1N7.A00(r21, 0, r3.A04);
        this.A0B = r3.A03();
        this.A0C = r3.A04();
    }

    public static C52822bX A00(C25631Oy r8, C58462kj r9, C21572AmM amM) {
        C52822bX A022 = r8.A02(r9);
        int i = amM.A00;
        int i2 = amM.A01;
        byte[] bArr = amM.A03;
        C21344AiX aiX = amM.A02;
        LinkedList linkedList = A022.A00;
        linkedList.addFirst(new C192139ns(aiX, AnonymousClass3K4.A00, bArr, i, i2));
        if (linkedList.size() > 5) {
            linkedList.removeLast();
        }
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r13 == 67) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C166418cr r12, int r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DecryptionCallbackV2/onE2eFailure reason="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", isSendRetry="
            r1.append(r0)
            X.2sw r3 = r11.A0K
            boolean r0 = r3.A0U
            r1.append(r0)
            X.C17890vO.A0w(r1)
            r0 = 0
            r3.A0A = r0
            boolean r0 = r3.A0U
            if (r0 != 0) goto L_0x0060
            r0 = 34
            if (r13 == r0) goto L_0x0097
            r0 = 66
            if (r13 == r0) goto L_0x002f
            r0 = 67
            r2 = 5
            if (r13 != r0) goto L_0x0030
        L_0x002f:
            r2 = 6
        L_0x0030:
            X.1PT r1 = r11.A0J
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1.A0I(r3, r0, r2)
            java.lang.String r7 = java.lang.String.valueOf(r13)
            if (r12 == 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)
            java.lang.String r0 = ", "
            java.lang.String r7 = X.AnonymousClass001.A1E(r12, r0, r1)
        L_0x0049:
            X.122 r4 = r11.A06
            r0 = 34
            r8 = 491(0x1eb, float:6.88E-43)
            if (r13 != r0) goto L_0x0053
            r8 = 500(0x1f4, float:7.0E-43)
        L_0x0053:
            X.205 r6 = r3.A0B
            com.whatsapp.jid.Jid r0 = r3.A0Y
            X.1BI r5 = X.C22971Dz.A00(r0)
            long r9 = r3.A0X
            r4.A0O(r5, r6, r7, r8, r9)
        L_0x0060:
            X.2HL r1 = r11.A0A
            X.8vJ r0 = r11.A0I
            X.A3S.A01(r1, r0, r13)
            boolean r0 = r11.A0N
            if (r0 == 0) goto L_0x0076
            r0 = 18
            if (r13 != r0) goto L_0x007e
            X.1N9 r1 = r11.A0G
            r0 = 491(0x1eb, float:6.88E-43)
            r1.A0E(r3, r0)
        L_0x0076:
            X.1PT r1 = r11.A0J
            java.lang.Integer r0 = r11.A0M
            r1.A0J(r3, r0, r13)
            return
        L_0x007e:
            boolean r0 = r3.A0U
            X.1N9 r2 = r11.A0G
            if (r0 != 0) goto L_0x0093
            r1 = 34
            r0 = 491(0x1eb, float:6.88E-43)
            if (r13 != r1) goto L_0x008c
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x008c:
            r2.A0E(r3, r0)
        L_0x008f:
            r0 = 0
            r11.A00 = r0
            goto L_0x0076
        L_0x0093:
            r2.A0D(r3)
            goto L_0x008f
        L_0x0097:
            r2 = 10
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20582AQs.A01(X.8cr, int):void");
    }
}

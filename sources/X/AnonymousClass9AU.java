package X;

/* renamed from: X.9AU  reason: invalid class name */
public abstract class AnonymousClass9AU extends C20133A8t {
    public static final AnonymousClass206 A00(AnonymousClass207 r4, AnonymousClass206 r5) {
        C18070vi.A0d(r4, 0);
        AnonymousClass205 r3 = r5.A0N;
        C17960vV.A07(r3);
        C18070vi.A0X(r3);
        return r4.A00(r3, r5.A0u, r5.A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        if (r0 != 0) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C187959ge r14, X.AnonymousClass8X8 r15) {
        /*
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            if (r14 == 0) goto L_0x00fc
            X.8cG r0 = r15.A0G()
            X.Bmt r3 = r0.A0O()
            X.8Wx r3 = (X.C163938Wx) r3
            X.Bm6 r0 = r3.A00
            X.8cG r0 = (X.C166048cG) r0
            X.8c6 r0 = r0.deviceListMetadata_
            if (r0 != 0) goto L_0x001a
            X.8c6 r0 = X.C165958c6.DEFAULT_INSTANCE
        L_0x001a:
            X.Bmt r13 = r0.A0O()
            X.DSQ r9 = r14.A03
            if (r9 == 0) goto L_0x0032
            X.Bm6 r1 = X.C17880vN.A0G(r13)
            X.8c6 r1 = (X.C165958c6) r1
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.senderKeyHash_ = r9
        L_0x0032:
            X.2RD r2 = r14.A05
            X.2RD r0 = X.AnonymousClass2RD.HOSTED
            if (r2 != r0) goto L_0x004a
            X.Bm6 r1 = X.C17880vN.A0G(r13)
            X.8c6 r1 = (X.C165958c6) r1
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r2.value
            r1.senderAccountType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x004a:
            X.DSQ r8 = r14.A02
            if (r8 == 0) goto L_0x005e
            X.Bm6 r1 = X.C17880vN.A0G(r13)
            X.8c6 r1 = (X.C165958c6) r1
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.recipientKeyHash_ = r8
        L_0x005e:
            long r4 = r14.A01
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            X.Bm6 r1 = X.C17880vN.A0G(r13)
            X.8c6 r1 = (X.C165958c6) r1
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.senderTimestamp_ = r4
        L_0x0076:
            long r1 = r14.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            X.Bm6 r6 = X.C17880vN.A0G(r13)
            X.8c6 r6 = (X.C165958c6) r6
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r6.bitField0_
            r0 = r0 | 32
            r6.bitField0_ = r0
            r6.recipientTimestamp_ = r1
        L_0x008c:
            java.util.Set r10 = r14.A06
            if (r10 == 0) goto L_0x00aa
            X.Bm6 r7 = X.C17880vN.A0G(r13)
            X.8c6 r7 = (X.C165958c6) r7
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            X.EDj r6 = r7.recipientKeyIndexes_
            r0 = r6
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00a7
            X.Bm7 r6 = X.C23577Bm6.A08(r6)
            r7.recipientKeyIndexes_ = r6
        L_0x00a7:
            X.DND.A09(r10, r6)
        L_0x00aa:
            X.2RD r7 = r14.A04
            if (r7 == 0) goto L_0x00c0
            X.Bm6 r6 = X.C17880vN.A0G(r13)
            X.8c6 r6 = (X.C165958c6) r6
            int r0 = X.C165958c6.RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER
            int r0 = r7.value
            r6.receiverAccountType_ = r0
            int r0 = r6.bitField0_
            r0 = r0 | 8
            r6.bitField0_ = r0
        L_0x00c0:
            if (r9 != 0) goto L_0x00cd
            if (r8 != 0) goto L_0x00cd
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x00ce
        L_0x00cd:
            r1 = 1
        L_0x00ce:
            java.lang.String r0 = "Invalid adv device metadata"
            X.C17960vV.A0H(r1, r0)
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8cG r1 = (X.C166048cG) r1
            X.Bm6 r0 = r13.A0C()
            X.8c6 r0 = (X.C165958c6) r0
            r0.getClass()
            r1.deviceListMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.Bm6 r2 = X.C17880vN.A0G(r3)
            X.8cG r2 = (X.C166048cG) r2
            r1 = 2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.deviceListMetadataVersion_ = r1
            r15.A0U(r3)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AU.A03(X.9ge, X.8X8):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if ((r1 & 128) != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (X.AnonymousClass000.A1O(r11.bitField1_ & 1048576) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r1 & com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        if ((r12 instanceof X.AnonymousClass24H) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00e8, code lost:
        if ((r0.bitField0_ & 64) != 0) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (X.AnonymousClass000.A1O(r11.bitField0_ & X.A7Y.A0F) != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(X.AW0 r10, X.C166418cr r11, X.AnonymousClass206 r12, java.lang.String r13, int r14, long r15) {
        /*
            int r1 = r11.bitField1_
            r0 = r1 & 16
            if (r0 != 0) goto L_0x000b
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            r9 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r9 = 1
        L_0x000c:
            int r2 = r11.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            boolean r0 = X.AnonymousClass000.A1O(r2)
            r8 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0026
            int r3 = r11.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r0
            boolean r0 = X.AnonymousClass000.A1O(r3)
            r4 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r4 = 1
        L_0x0027:
            r0 = r1 & 64
            if (r0 != 0) goto L_0x0041
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0041
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0041
            int r0 = r11.bitField2_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0041
            r0 = r1 & 128(0x80, float:1.794E-43)
            r7 = 0
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r7 = 1
        L_0x0042:
            int r0 = r11.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x00d8
            X.8cm r0 = X.AnonymousClass8BS.A0I(r11)
            int r3 = r0.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00d8
        L_0x0057:
            r6 = 1
        L_0x0058:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0069
            int r3 = r11.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r0
            boolean r0 = X.AnonymousClass000.A1O(r3)
            r5 = 0
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r5 = 1
        L_0x006a:
            int r0 = r11.bitField2_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0093
            X.8ar r0 = r11.secretEncryptedMessage_
            r3 = r0
            if (r0 != 0) goto L_0x0077
            X.8ar r0 = X.C165268ar.DEFAULT_INSTANCE
        L_0x0077:
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0093
            if (r3 != 0) goto L_0x0081
            X.8ar r3 = X.C165268ar.DEFAULT_INSTANCE
        L_0x0081:
            int r0 = r3.secretEncType_
            if (r0 == 0) goto L_0x0090
            if (r0 != r2) goto L_0x0090
            X.9Ji r3 = X.AnonymousClass9Ji.EVENT_EDIT
        L_0x0089:
            X.9Ji r0 = X.AnonymousClass9Ji.EVENT_EDIT
            if (r3 != r0) goto L_0x0093
        L_0x008d:
            java.lang.String r0 = "event"
            return r0
        L_0x0090:
            X.9Ji r3 = X.AnonymousClass9Ji.UNKNOWN
            goto L_0x0089
        L_0x0093:
            int r3 = r11.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r0
            boolean r0 = X.AnonymousClass000.A1O(r3)
            if (r0 != 0) goto L_0x00bf
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00bf
            boolean r0 = r12 instanceof X.C445823z
            if (r0 != 0) goto L_0x00ab
            boolean r0 = r12 instanceof X.AnonymousClass24H
            if (r0 == 0) goto L_0x00c0
        L_0x00ab:
            if (r4 == 0) goto L_0x00af
            if (r14 > 0) goto L_0x00f0
        L_0x00af:
            if (r10 != 0) goto L_0x00f0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r15 = r15 & r0
            r3 = 0
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f0
            if (r9 == 0) goto L_0x00c2
            java.lang.String r0 = "reaction"
            return r0
        L_0x00bf:
            r8 = 1
        L_0x00c0:
            r2 = r8
            goto L_0x00ab
        L_0x00c2:
            if (r7 == 0) goto L_0x00c7
            java.lang.String r0 = "poll"
            return r0
        L_0x00c7:
            if (r6 == 0) goto L_0x00cc
            java.lang.String r0 = "medianotify"
            return r0
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
            java.lang.String r0 = "scheduled-call"
            return r0
        L_0x00d1:
            if (r2 != 0) goto L_0x008d
            if (r13 == 0) goto L_0x00ed
            java.lang.String r0 = "media"
            return r0
        L_0x00d8:
            int r0 = r11.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00ea
            X.8cW r0 = r11.documentMessage_
            if (r0 != 0) goto L_0x00e4
            X.8cW r0 = X.C166208cW.DEFAULT_INSTANCE
        L_0x00e4:
            int r0 = r0.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0057
        L_0x00ea:
            r6 = 0
            goto L_0x0058
        L_0x00ed:
            java.lang.String r0 = "text"
            return r0
        L_0x00f0:
            java.lang.String r0 = "pay"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AU.A02(X.AW0, X.8cr, X.206, java.lang.String, int, long):java.lang.String");
    }

    public static final Integer A01(AnonymousClass1M9 r1, AnonymousClass1BI r2) {
        int i;
        C18070vi.A0h(r2, r1);
        if (!C22971Dz.A0e(r2)) {
            return null;
        }
        AnonymousClass1E7 A0E = r1.A0E(r2);
        if (A0E != null) {
            i = A0E.A03;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}

package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

public final class ATA implements B83, B85, C436820m {
    public final C18030ve A00;
    public final A79 A01;

    public ATA(C18030ve r2, A79 a79) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = a79;
    }

    public static final void A01(C19998A2m a2m, C441522i r4, byte[] bArr) {
        int length = bArr.length;
        if (length != 32 && a2m.A04) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FMessageStickerPack/bogus sha-256 enc or plain hash; length=");
            A10.append(length);
            AnonymousClass8BX.A1F(r4, "; message.key=", A10);
            throw AnonymousClass8BW.A0S(14);
        }
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r15) {
        C23624Bmt bmt;
        AnonymousClass8X8 r3;
        String str;
        Iterable iterable;
        C179799Jy r0;
        int length;
        boolean A17 = C18070vi.A17(r15, a2m);
        C181359Qe.A00(C22086AxQ.A00, r15 instanceof C441522i);
        C441522i r152 = (C441522i) r15;
        C62572rc r2 = r152.A02;
        if (r2 == null || (r2.A0a == null && !a2m.A01() && !r152.A0w())) {
            AnonymousClass8BY.A10(r152, "FMessageStickerPack/unable to send encrypted media message, missing mediaKey; message.key=", AnonymousClass000.A10());
            r3 = a2m.A00;
            C166228cY r02 = ((C166418cr) r3.A00).stickerPackMessage_;
            if (r02 == null) {
                r02 = C166228cY.DEFAULT_INSTANCE;
            }
            bmt = r02.A0O();
            C18070vi.A0b(bmt);
        } else {
            r3 = a2m.A00;
            C166228cY r03 = ((C166418cr) r3.A00).stickerPackMessage_;
            if (r03 == null) {
                r03 = C166228cY.DEFAULT_INSTANCE;
            }
            bmt = r03.A0O();
            byte[] bArr = r2.A0a;
            if (bArr != null) {
                if (r152.A0w() || (length = bArr.length) == 32 || !a2m.A04) {
                    C23581BmB A0A = AnonymousClass8BU.A0A(bmt, bArr, 0);
                    C166228cY r1 = (C166228cY) bmt.A00;
                    int i = C166228cY.CAPTION_FIELD_NUMBER;
                    r1.bitField0_ |= 64;
                    r1.mediaKey_ = A0A;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("FMessageStickerPack/buildE2eMessage/media key incorrect length; length=");
                    A10.append(length);
                    AnonymousClass8BX.A1F(r152, "; message.key=", A10);
                    throw AnonymousClass8BW.A0S(16);
                }
            }
            long j = r2.A0B;
            if (j > 0) {
                long A04 = C17880vN.A04(j);
                C166228cY A002 = A00(bmt);
                int i2 = C166228cY.CAPTION_FIELD_NUMBER;
                A002.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                A002.mediaKeyTimestamp_ = A04;
            }
            String str2 = r152.A08;
            if (!(str2 == null || str2.length() == 0)) {
                byte[] decode = Base64.decode(str2, 0);
                C18070vi.A0b(decode);
                A01(a2m, r152, decode);
                C23581BmB A0A2 = AnonymousClass8BU.A0A(bmt, decode, 0);
                C166228cY r12 = (C166228cY) bmt.A00;
                int i3 = C166228cY.CAPTION_FIELD_NUMBER;
                r12.bitField0_ |= 32;
                r12.fileEncSha256_ = A0A2;
            }
            String str3 = r152.A05;
            if (!(str3 == null || str3.length() == 0)) {
                byte[] decode2 = Base64.decode(str3, 0);
                C18070vi.A0b(decode2);
                A01(a2m, r152, decode2);
                C23581BmB A0A3 = AnonymousClass8BU.A0A(bmt, decode2, 0);
                C166228cY r13 = (C166228cY) bmt.A00;
                int i4 = C166228cY.CAPTION_FIELD_NUMBER;
                r13.bitField0_ |= 16;
                r13.fileSha256_ = A0A3;
            }
            C166278cd A012 = A79.A01(bmt, this.A01, a2m, r152);
            C166228cY r14 = (C166228cY) bmt.A00;
            int i5 = C166228cY.CAPTION_FIELD_NUMBER;
            A012.getClass();
            r14.contextInfo_ = A012;
            r14.bitField0_ |= 512;
            String str4 = r2.A0J;
            if (!(str4 == null || str4.length() == 0)) {
                C166228cY A003 = A00(bmt);
                A003.bitField0_ |= 128;
                A003.directPath_ = str4;
            }
            long j2 = r152.A01;
            if (j2 > 0) {
                C166228cY A004 = A00(bmt);
                A004.bitField0_ |= 8;
                A004.fileLength_ = j2;
            }
            String str5 = r152.A03;
            if (str5 != null) {
                C166228cY A005 = A00(bmt);
                A005.bitField0_ |= 2;
                A005.name_ = str5;
            }
            String str6 = r152.A06;
            if (str6 != null) {
                C166228cY A006 = A00(bmt);
                A006.bitField0_ |= 1;
                A006.stickerPackId_ = str6;
            }
            String str7 = r152.A07;
            if (str7 != null) {
                C166228cY A007 = A00(bmt);
                A007.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                A007.trayIconFileName_ = str7;
            }
            String str8 = r152.A02;
            if (str8 != null) {
                C166228cY A008 = A00(bmt);
                A008.bitField0_ |= 262144;
                A008.imageDataHash_ = str8;
            }
            String str9 = r152.A05;
            if (str9 != null) {
                C166228cY A009 = A00(bmt);
                A009.bitField0_ |= 4;
                A009.publisher_ = str9;
            }
            String str10 = r152.A04;
            if (str10 != null) {
                C166228cY A0010 = A00(bmt);
                A0010.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                A0010.packDescription_ = str10;
            }
            Long l = r152.A01;
            if (l != null) {
                long longValue = l.longValue();
                C166228cY A0011 = A00(bmt);
                A0011.bitField0_ |= 524288;
                A0011.stickerPackSize_ = longValue;
            }
            Integer num = r152.A00;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    r0 = C179799Jy.FIRST_PARTY;
                } else if (intValue != 2) {
                    r0 = C179799Jy.THIRD_PARTY;
                } else {
                    r0 = C179799Jy.USER_CREATED;
                }
                C166228cY A0012 = A00(bmt);
                A0012.stickerPackOrigin_ = r0.value;
                A0012.bitField0_ |= 1048576;
            }
            List list = r152.A08;
            if (list != null) {
                int i6 = 0;
                for (Object next : list) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        AnonymousClass1ZU.A0B();
                        throw null;
                    }
                    C136276tY r8 = (C136276tY) next;
                    C23624Bmt A0N = C165698bc.DEFAULT_INSTANCE.A0N();
                    String str11 = r8.A04;
                    C165698bc r16 = (C165698bc) C17880vN.A0G(A0N);
                    str11.getClass();
                    r16.bitField0_ |= 1;
                    r16.fileName_ = str11;
                    String str12 = r8.A05;
                    C165698bc r17 = (C165698bc) C17880vN.A0G(A0N);
                    str12.getClass();
                    r17.bitField0_ |= 16;
                    r17.mimetype_ = str12;
                    boolean A1Y = C72453Mb.A1Y(r8.A00);
                    C165698bc r18 = (C165698bc) C17880vN.A0G(A0N);
                    r18.bitField0_ |= 2;
                    r18.isAnimated_ = A1Y;
                    boolean A1Y2 = C72453Mb.A1Y(r8.A01);
                    C165698bc r19 = (C165698bc) C17880vN.A0G(A0N);
                    r19.bitField0_ |= 8;
                    r19.isLottie_ = A1Y2;
                    String str13 = r8.A02;
                    if (str13 == null) {
                        str13 = "";
                    }
                    C165698bc r110 = (C165698bc) C17880vN.A0G(A0N);
                    r110.bitField0_ |= 4;
                    r110.accessibilityLabel_ = str13;
                    String str14 = r8.A03;
                    if (str14 == null || (iterable = C108985cd.A0s(str14, A17 ? 1 : 0)) == null) {
                        iterable = C18460wS.A00;
                    }
                    C165698bc r7 = (C165698bc) C17880vN.A0G(A0N);
                    EE9 ee9 = r7.emojis_;
                    if (!((C27296DbR) ee9).A00) {
                        ee9 = C23577Bm6.A09(ee9);
                        r7.emojis_ = ee9;
                    }
                    DND.A09(iterable, ee9);
                    C23577Bm6 A09 = AnonymousClass8BS.A09(A0N, bmt);
                    C166228cY r72 = (C166228cY) bmt.A00;
                    A09.getClass();
                    EE9 ee92 = r72.stickers_;
                    if (!((C27296DbR) ee92).A00) {
                        ee92 = C23577Bm6.A09(ee92);
                        r72.stickers_ = ee92;
                    }
                    ee92.add(i6, A09);
                    i6 = i7;
                }
            }
            String str15 = r2.A0J;
            if (str15 != null && str15.length() > 0) {
                C166228cY A0013 = A00(bmt);
                A0013.bitField0_ |= 128;
                A0013.directPath_ = str15;
            }
            C693536w A0014 = C60502o8.A00(r152);
            if (!(A0014 == null || (str = A0014.A05) == null || A0014.A09 == null || A0014.A06 == null)) {
                C166228cY A0015 = A00(bmt);
                A0015.bitField0_ |= A7Y.A0F;
                A0015.thumbnailWidth_ = 252;
                C166228cY A0016 = A00(bmt);
                A0016.bitField0_ |= 65536;
                A0016.thumbnailHeight_ = 252;
                C166228cY A0017 = A00(bmt);
                A0017.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                A0017.thumbnailDirectPath_ = str;
                C23581BmB A0B = AnonymousClass8BW.A0B(bmt, A0014.A09, 0);
                C166228cY r111 = (C166228cY) bmt.A00;
                r111.bitField0_ |= 16384;
                r111.thumbnailSha256_ = A0B;
                C23581BmB A0B2 = AnonymousClass8BW.A0B(bmt, A0014.A06, 0);
                C166228cY r22 = (C166228cY) bmt.A00;
                r22.bitField0_ |= 32768;
                r22.thumbnailEncSha256_ = A0B2;
                C23581BmB A0A4 = AnonymousClass8BU.A0A(bmt, C108975cc.A1O(str), 0);
                C166228cY r112 = (C166228cY) bmt.A00;
                r112.thumbnailDirectPath_ = A0A4.A04();
                r112.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            }
        }
        C166228cY r04 = (C166228cY) bmt.A0C();
        C166418cr A0J = AnonymousClass8BV.A0J(r3, r04);
        A0J.stickerPackMessage_ = r04;
        A0J.bitField2_ |= 16;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.21V, X.22i, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r16) {
        /*
            r15 = this;
            r9 = r16
            X.8cr r5 = X.C20077A6d.A01(r9)
            int r0 = r5.bitField2_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01c2
            X.0ve r7 = r15.A00
            r0 = 9776(0x2630, float:1.3699E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 != 0) goto L_0x001f
            r0 = 10004(0x2714, float:1.4019E-41)
            X.23U r2 = r9.A04(r0)
        L_0x001e:
            return r2
        L_0x001f:
            X.205 r1 = r9.A0A
            long r3 = r9.A03
            r8 = 1
            X.C18070vi.A0d(r1, r8)
            r0 = 105(0x69, float:1.47E-43)
            X.22i r2 = new X.22i
            r2.<init>(r1, r0, r3)
            X.8cY r5 = r5.stickerPackMessage_
            if (r5 != 0) goto L_0x0034
            X.8cY r5 = X.C166228cY.DEFAULT_INSTANCE
        L_0x0034:
            X.C18070vi.A0X(r5)
            boolean r1 = r9.A05()
            X.2rc r3 = new X.2rc
            r3.<init>()
            r2.A02 = r3
            boolean r0 = r2.A0w()
            if (r1 != 0) goto L_0x004b
            r14 = 0
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r14 = 1
        L_0x004c:
            int r0 = r5.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x017b
            X.DSQ r0 = r5.mediaKey_
            byte[] r0 = r0.A06()
            X.A3I.A00(r3, r2, r0)
        L_0x005b:
            int r10 = r5.bitField0_
            r0 = r10 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x006c
            long r0 = r5.mediaKeyTimestamp_
            long r0 = r0 * r12
            r3.A0B = r0
        L_0x006c:
            r9 = 14
            java.lang.String r6 = "FMessageStickerPackProtobuf/bogus sha-256 hash received; length="
            r4 = 32
            java.lang.String r11 = "; message.key="
            r7 = 2
            if (r14 == 0) goto L_0x007b
            r0 = r10 & 16
            if (r0 == 0) goto L_0x008a
        L_0x007b:
            X.DSQ r0 = r5.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r4) goto L_0x01b6
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r2.A05 = r0
        L_0x008a:
            int r0 = r5.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x009f
            X.DSQ r0 = r5.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r4) goto L_0x01aa
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r7)
            r2.A08 = r0
        L_0x009f:
            if (r14 == 0) goto L_0x00a7
            int r0 = r5.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ab
        L_0x00a7:
            java.lang.String r0 = r5.directPath_
            r3.A0J = r0
        L_0x00ab:
            int r6 = r5.bitField0_
            r0 = r6 & 8
            if (r0 == 0) goto L_0x00bb
            long r3 = r5.fileLength_
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0196
            r2.A01 = r3
        L_0x00bb:
            java.lang.String r0 = r5.stickerPackId_
            r2.A06 = r0
            java.lang.String r0 = r5.name_
            r2.A03 = r0
            java.lang.String r0 = r5.publisher_
            r2.A05 = r0
            java.lang.String r0 = r5.packDescription_
            r2.A04 = r0
            java.lang.String r0 = r5.trayIconFileName_
            r2.A07 = r0
            java.lang.String r0 = r5.imageDataHash_
            r2.A02 = r0
            long r0 = r5.stickerPackSize_
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            int r0 = r5.stickerPackOrigin_
            if (r0 == 0) goto L_0x0177
            if (r0 == r8) goto L_0x0173
            if (r0 != r7) goto L_0x0177
            X.9Jy r0 = X.C179799Jy.USER_CREATED
        L_0x00e5:
            int r3 = r0.ordinal()
            r1 = 1
            r0 = 0
            if (r3 == r0) goto L_0x0170
            if (r3 != r7) goto L_0x00f0
            r1 = 2
        L_0x00f0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            r0 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0131
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0131
            r0 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0131
            X.2Qz r0 = X.C49572Qz.STICKER_PACK
            X.36w r3 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r5.thumbnailDirectPath_
            r3.A05 = r0
            X.DSQ r0 = r5.thumbnailSha256_
            byte[] r1 = r0.A06()
            X.DSQ r0 = r5.thumbnailEncSha256_
            X.AnonymousClass8BX.A14(r0, r3, r1)
            X.DSQ r0 = r5.mediaKey_
            byte[] r0 = r0.A06()
            r3.A0B = r0
            long r0 = r5.mediaKeyTimestamp_
            long r0 = r0 * r12
            r3.A02 = r0
            int r0 = r5.thumbnailWidth_
            r3.A01 = r0
            int r0 = r5.thumbnailHeight_
            r3.A00 = r0
            X.C60502o8.A01(r2, r3)
        L_0x0131:
            X.EE9 r0 = r5.stickers_
            if (r0 == 0) goto L_0x001e
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x013d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0193
            java.lang.Object r4 = r6.next()
            X.8bc r4 = (X.C165698bc) r4
            java.lang.String r10 = r4.fileName_
            boolean r0 = r4.isAnimated_
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            X.EE9 r3 = r4.emojis_
            X.C18070vi.A0X(r3)
            r1 = 0
            java.lang.String r0 = ", "
            java.lang.String r11 = X.C29431cG.A0h(r0, r3, r1)
            java.lang.String r12 = r4.accessibilityLabel_
            java.lang.String r13 = r4.mimetype_
            boolean r0 = r4.isLottie_
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            X.6tY r7 = new X.6tY
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r5.add(r7)
            goto L_0x013d
        L_0x0170:
            r1 = 0
            goto L_0x00f0
        L_0x0173:
            X.9Jy r0 = X.C179799Jy.THIRD_PARTY
            goto L_0x00e5
        L_0x0177:
            X.9Jy r0 = X.C179799Jy.FIRST_PARTY
            goto L_0x00e5
        L_0x017b:
            if (r14 != 0) goto L_0x005b
            r0 = 4466(0x1172, float:6.258E-42)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)
            if (r0 == 0) goto L_0x005b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageStickerPackProtobuf/no media key; message.key="
            X.AnonymousClass8BX.A1F(r2, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x0193:
            r2.A08 = r5
            return r2
        L_0x0196:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageStickerPackProtobuf/bogus media size received; fileLength="
            r1.append(r0)
            r1.append(r3)
            X.AnonymousClass8BX.A1F(r2, r11, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        L_0x01aa:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.AnonymousClass8BX.A1F(r2, r11, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r9)
            throw r0
        L_0x01b6:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.AnonymousClass8BX.A1F(r2, r11, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r9)
            throw r0
        L_0x01c2:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATA.CBG(X.A6d):X.206");
    }

    public static C166228cY A00(C23624Bmt bmt) {
        bmt.A0E();
        return (C166228cY) bmt.A00;
    }
}

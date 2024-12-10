package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.TextData;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ATC implements B83, B85, C436820m {
    public final C18030ve A00;
    public final A79 A01;
    public final C32011gU A02;
    public final C198669yi A03;
    public final ASL A04;
    public final C198359yD A05;
    public final AnonymousClass00H A06;

    public static final AEX A00(C165978c9 r28, boolean z) {
        C165978c9 r8 = r28;
        C18070vi.A0d(r8, 0);
        String str = r8.id_;
        C18070vi.A0X(str);
        long j = r8.fileLength_;
        int i = r8.width_;
        int i2 = r8.height_;
        String str2 = r8.mimetype_;
        C18070vi.A0X(str2);
        AEX aex = new AEX(str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (byte[]) null, i, i2, r8.placeholderArgb_, r8.textArgb_, r8.subtextArgb_, j, 0, false);
        if (z) {
            AnonymousClass8bL r7 = r8.mediaData_;
            if (r7 == null) {
                r7 = AnonymousClass8bL.DEFAULT_INSTANCE;
            }
            if ((r7.bitField0_ & 1) != 0) {
                byte[] A062 = r7.mediaKey_.A06();
                long j2 = r7.mediaKeyTimestamp_;
                String encodeToString = Base64.encodeToString(r7.fileSha256_.A06(), 2);
                String encodeToString2 = Base64.encodeToString(r7.fileEncSha256_.A06(), 2);
                String str3 = r7.directPath_;
                aex.A08 = A062;
                aex.A00 = j2;
                aex.A04 = encodeToString;
                aex.A03 = encodeToString2;
                aex.A02 = str3;
                aex.A07 = true;
            }
        }
        return aex;
    }

    private AnonymousClass8X8 A01(C19998A2m a2m, AnonymousClass206 r7) {
        if (r7 instanceof AnonymousClass210) {
            AnonymousClass8X8 A002 = C166418cr.A00();
            C166258cb r0 = ((C166418cr) A002.A00).extendedTextMessage_;
            if (r0 == null) {
                r0 = C166258cb.DEFAULT_INSTANCE;
            }
            C163738Wd r3 = (C163738Wd) r0.A0O();
            if (r7.A0P() != null) {
                String A0P = r7.A0P();
                C166258cb A0F = AnonymousClass8BS.A0F(r3);
                int i = C166258cb.BACKGROUND_ARGB_FIELD_NUMBER;
                A0P.getClass();
                A0F.bitField0_ |= 1;
                A0F.text_ = A0P;
            }
            if (C19998A2m.A00(a2m, r7)) {
                r3.A0G(this.A01.A04(a2m, r7));
            }
            A002.A0K(r3);
            return A002;
        }
        throw AnonymousClass000.A0k("FMessageTextSerializer/getPaymentNoteMessageBuilder wrong message passed");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, com.whatsapp.TextData] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        if ((r2 & 128) == 0) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C18030ve r8, X.C32011gU r9, X.C166258cb r10, X.AnonymousClass210 r11) {
        /*
            java.lang.String r6 = r10.text_
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r6, r2)
            r11.A0i(r0)
            java.lang.String r5 = r10.matchedText_
            r4 = 1
            java.util.ArrayList r3 = r9.A04(r5, r4)
            r1 = 0
            if (r3 == 0) goto L_0x01d7
            int r0 = r3.size()
            if (r0 != r4) goto L_0x01d7
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 == 0) goto L_0x01d7
        L_0x0025:
            r1 = 2
            if (r4 == 0) goto L_0x008c
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L_0x008c
            r11.A07 = r5
            int r0 = r10.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r10.title_
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r0, r2)
            r11.A06 = r0
        L_0x003e:
            int r0 = r10.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r10.description_
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r0, r2)
            r11.A05 = r0
        L_0x004c:
            int r4 = r10.bitField0_
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0063
            int r0 = r10.previewType_
            X.9KR r3 = X.AnonymousClass9KR.A00(r0)
            if (r3 != 0) goto L_0x005c
            X.9KR r3 = X.AnonymousClass9KR.NONE
        L_0x005c:
            X.9KR r0 = X.AnonymousClass9KR.VIDEO
            if (r3 != r0) goto L_0x01ba
            r2 = 1
        L_0x0061:
            r11.A01 = r2
        L_0x0063:
            r0 = r4 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0070
            X.DSQ r0 = r10.jpegThumbnail_
            byte[] r0 = r0.A06()
            r11.A19(r0)
        L_0x0070:
            int r2 = r10.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x008c
            int r2 = r10.inviteLinkGroupTypeV2_
            if (r2 == 0) goto L_0x01b6
            r0 = 1
            if (r2 == r0) goto L_0x01b2
            if (r2 == r1) goto L_0x01ae
            r0 = 3
            if (r2 != r0) goto L_0x01b6
            X.9KA r3 = X.AnonymousClass9KA.DEFAULT_SUB
        L_0x0085:
            X.9KA r0 = X.AnonymousClass9KA.PARENT
            if (r3 != r0) goto L_0x019e
            r2 = 1
        L_0x008a:
            r11.A00 = r2
        L_0x008c:
            int r2 = r10.bitField0_
            r0 = r2 & 64
            r4 = 1
            if (r0 != 0) goto L_0x009c
            r4 = 0
            r0 = r2 & 32
            if (r0 != 0) goto L_0x009c
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c4
        L_0x009c:
            com.whatsapp.TextData r3 = new com.whatsapp.TextData
            r3.<init>()
            if (r4 == 0) goto L_0x00a7
            int r0 = r10.backgroundArgb_
            r3.backgroundColor = r0
        L_0x00a7:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x00af
            int r0 = r10.textArgb_
            r3.textColor = r0
        L_0x00af:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c1
            int r0 = r10.font_
            X.9KZ r0 = X.AnonymousClass9KZ.A00(r0)
            if (r0 != 0) goto L_0x00bd
            X.9KZ r0 = X.AnonymousClass9KZ.SANS_SERIF
        L_0x00bd:
            int r0 = r0.value
            r3.fontStyle = r0
        L_0x00c1:
            r11.A18(r3)
        L_0x00c4:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0124
            r0 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0124
            X.2Qz r0 = X.C49572Qz.WEB_THUMBNAIL
            X.36w r5 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r10.thumbnailDirectPath_
            r5.A05 = r0
            X.DSQ r0 = r10.thumbnailSha256_
            X.AnonymousClass8BV.A1A(r0, r5)
            int r0 = r10.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00f3
            X.DSQ r0 = r10.thumbnailEncSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            r5.A06 = r0
        L_0x00f3:
            int r2 = r10.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0103
            X.DSQ r0 = r10.mediaKey_
            byte[] r0 = r0.A06()
            r5.A0B = r0
        L_0x0103:
            int r4 = r10.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x010f
            long r2 = r10.mediaKeyTimestamp_
            long r2 = r2 * r6
            r5.A02 = r2
        L_0x010f:
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0118
            int r0 = r10.thumbnailWidth_
            r5.A01 = r0
        L_0x0118:
            r0 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0121
            int r0 = r10.thumbnailHeight_
            r5.A00 = r0
        L_0x0121:
            X.C60502o8.A01(r11, r5)
        L_0x0124:
            int r2 = r10.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x019d
            boolean r0 = r11.A0w()
            if (r0 != 0) goto L_0x019d
            r2 = 9584(0x2570, float:1.343E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r2)
            if (r0 == 0) goto L_0x019d
            X.8bm r4 = r10.faviconMMSMetadata_
            if (r4 != 0) goto L_0x0141
            X.8bm r4 = X.C165798bm.DEFAULT_INSTANCE
        L_0x0141:
            int r2 = r4.bitField0_
            r0 = r2 & 1
            if (r0 == 0) goto L_0x019d
            r0 = r2 & 2
            if (r0 == 0) goto L_0x019d
            X.2Qz r0 = X.C49572Qz.FAVICON
            X.36w r3 = X.AnonymousClass8BV.A0M(r0)
            java.lang.String r0 = r4.thumbnailDirectPath_
            r3.A05 = r0
            X.DSQ r0 = r4.thumbnailSha256_
            X.AnonymousClass8BV.A1A(r0, r3)
            int r0 = r4.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x016c
            X.DSQ r0 = r4.thumbnailEncSha256_
            byte[] r0 = r0.A06()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            r3.A06 = r0
        L_0x016c:
            int r0 = r4.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x017a
            X.DSQ r0 = r4.mediaKey_
            byte[] r0 = r0.A06()
            r3.A0B = r0
        L_0x017a:
            int r2 = r4.bitField0_
            r0 = r2 & 16
            if (r0 == 0) goto L_0x0185
            long r0 = r4.mediaKeyTimestamp_
            long r0 = r0 * r6
            r3.A02 = r0
        L_0x0185:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x018d
            int r0 = r4.thumbnailWidth_
            r3.A01 = r0
        L_0x018d:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0195
            int r0 = r4.thumbnailHeight_
            r3.A00 = r0
        L_0x0195:
            X.Ac6 r0 = new X.Ac6
            r0.<init>(r3)
            X.C196869vm.A01(r0, r11)
        L_0x019d:
            return
        L_0x019e:
            X.9KA r0 = X.AnonymousClass9KA.SUB
            if (r3 != r0) goto L_0x01a6
            r11.A00 = r1
            goto L_0x008c
        L_0x01a6:
            X.9KA r0 = X.AnonymousClass9KA.DEFAULT_SUB
            r2 = 0
            if (r3 != r0) goto L_0x008a
            r2 = 3
            goto L_0x008a
        L_0x01ae:
            X.9KA r3 = X.AnonymousClass9KA.SUB
            goto L_0x0085
        L_0x01b2:
            X.9KA r3 = X.AnonymousClass9KA.PARENT
            goto L_0x0085
        L_0x01b6:
            X.9KA r3 = X.AnonymousClass9KA.DEFAULT
            goto L_0x0085
        L_0x01ba:
            X.9KR r0 = X.AnonymousClass9KR.IMAGE
            if (r3 != r0) goto L_0x01c1
            r2 = 5
            goto L_0x0061
        L_0x01c1:
            X.9KR r0 = X.AnonymousClass9KR.PLACEHOLDER
            if (r3 != r0) goto L_0x01c8
            r2 = 4
            goto L_0x0061
        L_0x01c8:
            X.9KR r0 = X.AnonymousClass9KR.PAYMENT_LINKS
            if (r3 != r0) goto L_0x01cf
            r2 = 6
            goto L_0x0061
        L_0x01cf:
            X.9KR r0 = X.AnonymousClass9KR.PROFILE
            r2 = 0
            if (r3 != r0) goto L_0x0061
            r2 = 7
            goto L_0x0061
        L_0x01d7:
            r4 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATC.A02(X.0ve, X.1gU, X.8cb, X.210):void");
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r15) {
        C166418cr A0M;
        int i;
        int i2;
        C22565BDa bDa;
        long A0A;
        int i3;
        if (r15 instanceof AnonymousClass210) {
            AnonymousClass210 r152 = (AnonymousClass210) r15;
            boolean A1R = AnonymousClass8BV.A1R(r152);
            AW0 A002 = AnonymousClass25B.A00(r152);
            if (A1R) {
                if (A002 != null || C20097A7a.A05(r152)) {
                    C17960vV.A0F(false, "FMessageTextSerializer/buildE2eMessage cant edit payment or buttons message");
                }
                this.A04.A00(new C20612ARw(this, 5), a2m, r152);
            } else if (A002 != null) {
                AW0 A003 = AnonymousClass25B.A00(r152);
                if (A003.A0K()) {
                    AnonymousClass1KN r0 = A003.A09;
                    C17960vV.A07(r0);
                    long A07 = AnonymousClass8BX.A07(r0);
                    String str = A003.A0I;
                    AnonymousClass8pG r2 = A003.A0A;
                    if (r2 == null) {
                        bDa = null;
                        A0A = 0;
                    } else {
                        bDa = r2.A00;
                        A0A = r2.A0A();
                    }
                    UserJid userJid = A003.A0E;
                    AEX A042 = A003.A04();
                    AnonymousClass8X8 r4 = a2m.A00;
                    C165828bp r22 = ((C166418cr) r4.A00).requestPaymentMessage_;
                    if (r22 == null) {
                        r22 = C165828bp.DEFAULT_INSTANCE;
                    }
                    C163008Ti r3 = (C163008Ti) r22.A0O();
                    AnonymousClass8X8 A012 = A01(a2m, r152);
                    C165828bp r9 = (C165828bp) C17880vN.A0G(r3);
                    C166418cr A0e = AnonymousClass8BR.A0e(A012);
                    int i4 = C165828bp.AMOUNT_1000_FIELD_NUMBER;
                    A0e.getClass();
                    r9.noteMessage_ = A0e;
                    r9.bitField0_ |= 1;
                    C165828bp r8 = (C165828bp) C17880vN.A0G(r3);
                    r8.bitField0_ |= 4;
                    r8.amount1000_ = A07;
                    C165828bp A0N = AnonymousClass8BW.A0N(r3, str);
                    A0N.bitField0_ |= 2;
                    A0N.currencyCodeIso4217_ = str;
                    C164948aK r23 = ((C165828bp) r3.A00).amount_;
                    if (r23 == null) {
                        r23 = C164948aK.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8X0 r24 = (AnonymousClass8X0) r23.A0O();
                    if (bDa != null) {
                        A07 = (long) bDa.getValue();
                    }
                    r24.A0H(A07);
                    if (bDa != null) {
                        i3 = ((ARR) bDa).A00;
                    } else {
                        i3 = 1000;
                    }
                    r24.A0G(i3);
                    if (bDa != null) {
                        str = AnonymousClass8BU.A0n((ARR) bDa);
                    }
                    r24.A0I(str);
                    C164948aK r02 = (C164948aK) r24.A0C();
                    C165828bp A0N2 = AnonymousClass8BW.A0N(r3, r02);
                    A0N2.amount_ = r02;
                    A0N2.bitField0_ |= 32;
                    long A043 = C17880vN.A04(A0A);
                    C165828bp r5 = (C165828bp) C17880vN.A0G(r3);
                    r5.bitField0_ |= 16;
                    r5.expiryTimestamp_ = A043;
                    if (userJid != null) {
                        String rawString = userJid.getRawString();
                        C165828bp A0N3 = AnonymousClass8BW.A0N(r3, rawString);
                        A0N3.bitField0_ |= 8;
                        A0N3.requestFrom_ = rawString;
                    }
                    if (A042 != null) {
                        C165978c9 A004 = A042.A00();
                        C165828bp A0N4 = AnonymousClass8BW.A0N(r3, A004);
                        A0N4.background_ = A004;
                        A0N4.bitField0_ |= 64;
                    }
                    A0M = AnonymousClass8BS.A0M(r4);
                    C165828bp r03 = (C165828bp) r3.A0C();
                    r03.getClass();
                    A0M.requestPaymentMessage_ = r03;
                    i = A0M.bitField0_;
                    i2 = A7Y.A0F;
                } else {
                    String str2 = A003.A0M;
                    UserJid userJid2 = A003.A0D;
                    AEX A044 = A003.A04();
                    AnonymousClass8X8 r42 = a2m.A00;
                    C164928aI r04 = ((C166418cr) r42.A00).sendPaymentMessage_;
                    if (r04 == null) {
                        r04 = C164928aI.DEFAULT_INSTANCE;
                    }
                    C163058Tn r32 = (C163058Tn) r04.A0O();
                    if (str2 != null) {
                        AnonymousClass8X7 A005 = C166408cq.A00();
                        A005.A0H(str2);
                        A005.A0K(false);
                        AnonymousClass1BI r1 = r152.A0v.A00;
                        if (C22971Dz.A0e(r1) && userJid2 != null) {
                            AnonymousClass8X7.A01(userJid2, A005);
                        }
                        A005.A0J(C22971Dz.A06(r1));
                        C166408cq A0Z = AnonymousClass8BU.A0Z(A005, r32);
                        C164928aI r12 = (C164928aI) r32.A00;
                        int i5 = C164928aI.BACKGROUND_FIELD_NUMBER;
                        A0Z.getClass();
                        r12.requestMessageKey_ = A0Z;
                        r12.bitField0_ |= 2;
                    }
                    if (A044 != null) {
                        C165978c9 A006 = A044.A00();
                        C164928aI r13 = (C164928aI) C17880vN.A0G(r32);
                        int i6 = C164928aI.BACKGROUND_FIELD_NUMBER;
                        A006.getClass();
                        r13.background_ = A006;
                        r13.bitField0_ |= 4;
                    }
                    AnonymousClass8X8 A013 = A01(a2m, r152);
                    C164928aI r25 = (C164928aI) C17880vN.A0G(r32);
                    C166418cr A0e2 = AnonymousClass8BR.A0e(A013);
                    int i7 = C164928aI.BACKGROUND_FIELD_NUMBER;
                    A0e2.getClass();
                    r25.noteMessage_ = A0e2;
                    r25.bitField0_ |= 1;
                    A0M = AnonymousClass8BS.A0M(r42);
                    C164928aI r05 = (C164928aI) r32.A0C();
                    r05.getClass();
                    A0M.sendPaymentMessage_ = r05;
                    i = A0M.bitField0_;
                    i2 = 32768;
                }
                A0M.bitField0_ = i | i2;
            } else if (C20097A7a.A05(r152)) {
                AnonymousClass8X8 r33 = a2m.A00;
                C29721cl r6 = a2m.A02;
                byte[] bArr = a2m.A0G;
                C165858bs r06 = ((C166418cr) r33.A00).buttonsMessage_;
                if (r06 == null) {
                    r06 = C165858bs.DEFAULT_INSTANCE;
                }
                C163728Wc r43 = (C163728Wc) r06.A0O();
                if (!TextUtils.isEmpty(r152.A0P())) {
                    r43.A0G(AnonymousClass9KT.TEXT);
                    String A0P = r152.A0P();
                    C165858bs r14 = (C165858bs) C17880vN.A0G(r43);
                    int i8 = C165858bs.BUTTONS_FIELD_NUMBER;
                    A0P.getClass();
                    r14.headerCase_ = 1;
                    r14.header_ = A0P;
                } else {
                    r43.A0G(AnonymousClass9KT.EMPTY);
                }
                C20097A7a.A04(r43, AnonymousClass8BR.A0i(r152));
                if (A79.A03(r6, r152, bArr)) {
                    C166278cd A014 = A79.A01(r43, this.A01, a2m, r152);
                    C165858bs r16 = (C165858bs) r43.A00;
                    int i9 = C165858bs.BUTTONS_FIELD_NUMBER;
                    A014.getClass();
                    r16.contextInfo_ = A014;
                    r16.bitField0_ |= 128;
                }
                r33.A0I((C165858bs) r43.A0C());
            } else if (!TextUtils.isEmpty(r152.A06) || !TextUtils.isEmpty(r152.A05) || r152.A02 != null || r152.A11(1024) || r152.A11(67108864) || C19998A2m.A00(a2m, r152)) {
                AnonymousClass8X8 r44 = a2m.A00;
                C166258cb r07 = ((C166418cr) r44.A00).extendedTextMessage_;
                if (r07 == null) {
                    r07 = C166258cb.DEFAULT_INSTANCE;
                }
                C163738Wd r17 = (C163738Wd) r07.A0O();
                A03(this, r17, r152);
                if (C19998A2m.A00(a2m, r152)) {
                    r17.A0G(this.A01.A04(a2m, r152));
                }
                if (!((AnonymousClass1PW) this.A06.get()).A08() || !r152.A0q()) {
                    r44.A0K(r17);
                    return;
                }
                C163988Xc r08 = ((C166418cr) r44.A00).botInvokeMessage_;
                if (r08 == null) {
                    r08 = C163988Xc.DEFAULT_INSTANCE;
                }
                AnonymousClass8X6 r34 = (AnonymousClass8X6) r08.A0O();
                AnonymousClass8X8 A007 = AnonymousClass8X6.A00(r34);
                C166258cb r09 = (C166258cb) r17.A0C();
                C166418cr A045 = AnonymousClass8X8.A04(A007, r09);
                A045.extendedTextMessage_ = r09;
                A045.bitField0_ |= 32;
                C163988Xc A015 = AnonymousClass8X6.A01(A007, r34);
                C166418cr A0J = AnonymousClass8BV.A0J(r44, A015);
                A0J.botInvokeMessage_ = A015;
                A0J.bitField1_ |= 4194304;
            } else {
                AnonymousClass8X8 r010 = a2m.A00;
                String A0P2 = r152.A0P();
                C166418cr A046 = AnonymousClass8X8.A04(r010, A0P2);
                A046.bitField0_ |= 1;
                A046.conversation_ = A0P2;
            }
        } else {
            throw AnonymousClass000.A0k("FMessageTextProtobuf/buildE2EMessage wrong message passed");
        }
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v6, types: [X.2r3, java.lang.Object] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        String str;
        int i;
        ARR arr;
        int i2;
        C62222r3 r6;
        C20077A6d a6d2 = a6d;
        C166418cr r2 = a6d2.A08;
        int i3 = r2.bitField0_;
        if ((i3 & 1) != 0) {
            AnonymousClass205 r1 = a6d2.A0A;
            long j = a6d2.A03;
            String str2 = r2.conversation_;
            AnonymousClass210 r0 = new AnonymousClass210(r1, j);
            r0.A0i(AnonymousClass1EG.A0E(str2, 65536));
            return r0;
        }
        if (AnonymousClass000.A1O(i3 & 32)) {
            C166258cb r22 = r2.extendedTextMessage_;
            C166258cb r5 = r22;
            if (r22 == null) {
                r22 = C166258cb.DEFAULT_INSTANCE;
            }
            if ((r22.bitField0_ & 8388608) == 0 || !r22.viewOnce_) {
                AnonymousClass205 r3 = a6d2.A0A;
                long j2 = a6d2.A03;
                if (r5 == null) {
                    r5 = C166258cb.DEFAULT_INSTANCE;
                }
                AnonymousClass210 r02 = new AnonymousClass210(r3, j2);
                A02(this.A00, this.A02, r5, r02);
                return r02;
            }
        } else {
            if (AnonymousClass000.A1O(r2.bitField0_ & 32768)) {
                C198359yD r62 = this.A05;
                C164928aI r4 = r2.sendPaymentMessage_;
                if (r4 == null) {
                    r4 = C164928aI.DEFAULT_INSTANCE;
                }
                if ((r4.bitField0_ & 1) != 0) {
                    C166418cr r03 = r4.noteMessage_;
                    if (r03 == null) {
                        r03 = C166418cr.DEFAULT_INSTANCE;
                    }
                    AnonymousClass206 A002 = C198359yD.A00(a6d2, r62, r03);
                    if (AnonymousClass25B.A00(A002) == null) {
                        if (a6d2.A0L) {
                            AnonymousClass25B.A04(A002, "UNSET");
                        } else {
                            AnonymousClass25B.A02(C20128A8n.A01(A002.A0I), A002);
                        }
                    }
                    AW0 A003 = AnonymousClass25B.A00(A002);
                    if (A003 == null) {
                        return A002;
                    }
                    int i4 = r4.bitField0_;
                    if ((i4 & 2) != 0) {
                        C166408cq r12 = r4.requestMessageKey_;
                        if (r12 == null) {
                            r12 = C166408cq.DEFAULT_INSTANCE;
                        }
                        String str3 = r12.id_;
                        A003.A0M = str3;
                        AW0 aw0 = a6d2.A04;
                        if (aw0 != null) {
                            aw0.A0M = str3;
                        }
                    }
                    if ((i4 & 4) == 0) {
                        return A002;
                    }
                    C165978c9 r42 = r4.background_;
                    if (r42 == null) {
                        r42 = C165978c9.DEFAULT_INSTANCE;
                    }
                    AEX A004 = A00(r42, C18020vd.A05(C18040vf.A02, r62.A02, 1084));
                    A003.A0B(A004);
                    AW0 aw02 = a6d2.A04;
                    if (aw02 == null) {
                        return A002;
                    }
                    aw02.A0B(A004);
                    return A002;
                }
            } else if (AnonymousClass000.A1O(r2.bitField0_ & A7Y.A0F)) {
                C198359yD r52 = this.A05;
                C165828bp r23 = r2.requestPaymentMessage_;
                if (r23 == null) {
                    r23 = C165828bp.DEFAULT_INSTANCE;
                }
                AW0 aw03 = a6d2.A04;
                if ((r23.bitField0_ & 1) != 0) {
                    C166418cr r04 = r23.noteMessage_;
                    if (r04 == null) {
                        r04 = C166418cr.DEFAULT_INSTANCE;
                    }
                    AnonymousClass206 A005 = C198359yD.A00(a6d2, r52, r04);
                    AnonymousClass1KI r63 = r52.A01;
                    AnonymousClass1KJ A012 = r63.A01(r23.currencyCodeIso4217_);
                    UserJid A022 = C22941Dw.A02(r23.requestFrom_);
                    AnonymousClass1KN A0H = AnonymousClass8BU.A0H(A012, new BigDecimal(r23.amount1000_).scaleByPowerOfTen(-3));
                    if (aw03 != null) {
                        str = aw03.A0G;
                    } else {
                        C63572tK r32 = C63572tK.A0E;
                        str = "UNSET";
                    }
                    AnonymousClass1BI r33 = A005.A0v.A00;
                    boolean A0e = C22971Dz.A0e(r33);
                    if (A0e) {
                        r33 = a6d2.A05;
                    }
                    UserJid A013 = C22941Dw.A01(r33);
                    if (aw03 != null) {
                        i = aw03.A01;
                    } else {
                        i = 0;
                    }
                    if (A013 != null) {
                        if (aw03 == null || aw03.A03 != 5) {
                            AnonymousClass11S r34 = r52.A00;
                            if (!A0e) {
                                A022 = (UserJid) AnonymousClass3MZ.A0Q(r34).A0J;
                            } else if (!r34.A0O(A022)) {
                                String str4 = r23.currencyCodeIso4217_;
                                long j3 = A005.A0I;
                                C20128A8n a8n = C20128A8n.$redex_init_class;
                                AnonymousClass25B.A03(A005, new AnonymousClass25E(C20128A8n.A02(A012, A0H, A022, A013, str4, (String) null, str, 30, 0, C196679vS.A00(str), i, 0, j3), "UNSET"));
                            }
                            C17960vV.A07(A022);
                            String str5 = r23.currencyCodeIso4217_;
                            long j4 = A005.A0I;
                            C20128A8n a8n2 = C20128A8n.$redex_init_class;
                            AnonymousClass25B.A02(C20128A8n.A02(A012, A0H, A022, A013, str5, (String) null, str, 20, 12, C196679vS.A00(str), i, 0, j4), A005);
                            if (aw03 != null && aw03.A03 == 20) {
                                AW0 A006 = AnonymousClass25B.A00(A005);
                                C17960vV.A07(A006);
                                A006.A0K = aw03.A0K;
                                A006.A0A = aw03.A0A;
                                int i5 = r23.bitField0_;
                                if ((i5 & 32) != 0) {
                                    C164948aK r8 = r23.amount_;
                                    if (r8 == null) {
                                        r8 = C164948aK.DEFAULT_INSTANCE;
                                    }
                                    A012 = r63.A01(r8.currencyCode_);
                                    ? obj = new Object();
                                    obj.A01 = r8.value_;
                                    i2 = r8.offset_;
                                    r6 = obj;
                                } else if ((i5 & 4) != 0) {
                                    ? obj2 = new Object();
                                    obj2.A01 = r23.amount1000_;
                                    i2 = 1000;
                                    r6 = obj2;
                                } else {
                                    arr = null;
                                    Log.e("PAY: MessageUtils/buildFMessage paymentMoney is NULL.");
                                    A006.A0A.A00 = arr;
                                }
                                r6.A00 = i2;
                                r6.A02 = A012;
                                arr = r6.A00();
                                A006.A0A.A00 = arr;
                            }
                        } else {
                            if (!A0e) {
                                A022 = (UserJid) AnonymousClass3MZ.A0Q(r52.A00).A0J;
                            }
                            C17960vV.A07(A022);
                            String str6 = r23.currencyCodeIso4217_;
                            long j5 = A005.A0I;
                            String str7 = aw03.A0G;
                            int i6 = aw03.A04;
                            byte[] bArr = aw03.A0R;
                            AW0 A023 = C20128A8n.A02(A012, A0H, A022, A013, str6, (String) null, str7, 5, 0, i6, aw03.A01, 0, j5);
                            A023.A0R = bArr;
                            AnonymousClass25B.A02(A023, A005);
                        }
                    }
                    AW0 A007 = AnonymousClass25B.A00(A005);
                    if ((r23.bitField0_ & 64) != 0) {
                        C165978c9 r64 = r23.background_;
                        if (r64 == null) {
                            r64 = C165978c9.DEFAULT_INSTANCE;
                        }
                        AEX A008 = A00(r64, C18020vd.A05(C18040vf.A02, r52.A02, 1084));
                        if (aw03 != null) {
                            aw03.A0B(A008);
                        }
                        if (A007 != null) {
                            A007.A0B(A008);
                        }
                    }
                    if (aw03 == null || A007 == null) {
                        return A005;
                    }
                    aw03.A0A(A007);
                    return A005;
                }
            }
            return new AnonymousClass210(a6d2.A0A, a6d2.A03);
        }
        return null;
    }

    public ATC(C198669yi r1, ASL asl, C18030ve r3, A79 a79, C32011gU r5, C198359yD r6, AnonymousClass00H r7) {
        this.A00 = r3;
        this.A02 = r5;
        this.A06 = r7;
        this.A04 = asl;
        this.A03 = r1;
        this.A01 = a79;
        this.A05 = r6;
    }

    public static void A03(ATC atc, C163738Wd r13, AnonymousClass210 r14) {
        String str;
        AnonymousClass9KA r0;
        AnonymousClass9KR r02;
        C693536w r6;
        String str2;
        String A0P = r14.A0P();
        C166258cb A0F = AnonymousClass8BS.A0F(r13);
        int i = C166258cb.BACKGROUND_ARGB_FIELD_NUMBER;
        A0P.getClass();
        A0F.bitField0_ |= 1;
        A0F.text_ = A0P;
        ArrayList A042 = atc.A02.A04(r14.A0P(), true);
        if (A042 != null) {
            str = (String) AnonymousClass8BS.A0Y(A042);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C166258cb A0F2 = AnonymousClass8BS.A0F(r13);
            str.getClass();
            A0F2.bitField0_ |= 2;
            A0F2.matchedText_ = str;
        }
        if (!TextUtils.isEmpty(r14.A06)) {
            String str3 = r14.A06;
            C166258cb A0F3 = AnonymousClass8BS.A0F(r13);
            str3.getClass();
            A0F3.bitField0_ |= 16;
            A0F3.title_ = str3;
        }
        if (!TextUtils.isEmpty(r14.A05)) {
            String str4 = r14.A05;
            C166258cb A0F4 = AnonymousClass8BS.A0F(r13);
            str4.getClass();
            A0F4.bitField0_ |= 8;
            A0F4.description_ = str4;
        }
        if (!TextUtils.isEmpty(r14.A07)) {
            String str5 = r14.A07;
            C166258cb A0F5 = AnonymousClass8BS.A0F(r13);
            str5.getClass();
            A0F5.bitField0_ |= 4;
            A0F5.canonicalUrl_ = str5;
        }
        int i2 = r14.A00;
        if (i2 == 1) {
            r0 = AnonymousClass9KA.PARENT;
        } else if (i2 == 2) {
            r0 = AnonymousClass9KA.SUB;
        } else if (i2 == 3) {
            r0 = AnonymousClass9KA.DEFAULT_SUB;
        } else {
            r0 = AnonymousClass9KA.DEFAULT;
        }
        C166258cb A0F6 = AnonymousClass8BS.A0F(r13);
        A0F6.inviteLinkGroupTypeV2_ = r0.value;
        A0F6.bitField0_ |= 4194304;
        C693536w A002 = C60502o8.A00(r14);
        if (!(A002 == null || (str2 = A002.A05) == null || A002.A09 == null)) {
            C166258cb A0F7 = AnonymousClass8BS.A0F(r13);
            A0F7.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            A0F7.thumbnailDirectPath_ = str2;
            C23581BmB A0B = AnonymousClass8BW.A0B(r13, A002.A09, 0);
            C166258cb r1 = (C166258cb) r13.A00;
            r1.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r1.thumbnailSha256_ = A0B;
            byte[] bArr = A002.A0B;
            if (bArr != null) {
                C23581BmB A0A = AnonymousClass8BU.A0A(r13, bArr, 0);
                C166258cb r2 = (C166258cb) r13.A00;
                r2.bitField0_ |= 32768;
                r2.mediaKey_ = A0A;
            }
            String str6 = A002.A06;
            if (str6 != null) {
                C23581BmB A0B2 = AnonymousClass8BW.A0B(r13, str6, 0);
                C166258cb r12 = (C166258cb) r13.A00;
                r12.bitField0_ |= 16384;
                r12.thumbnailEncSha256_ = A0B2;
            }
            long j = A002.A02;
            if (j > 0) {
                C166258cb A0F8 = AnonymousClass8BS.A0F(r13);
                A0F8.bitField0_ |= 65536;
                A0F8.mediaKeyTimestamp_ = j / 1000;
            }
            int i3 = A002.A00;
            if (i3 > 0) {
                C166258cb A0F9 = AnonymousClass8BS.A0F(r13);
                A0F9.bitField0_ |= A7Y.A0F;
                A0F9.thumbnailHeight_ = i3;
            }
            int i4 = A002.A01;
            if (i4 > 0) {
                C166258cb A0F10 = AnonymousClass8BS.A0F(r13);
                A0F10.bitField0_ |= 262144;
                A0F10.thumbnailWidth_ = i4;
            }
        }
        int i5 = r14.A01;
        if (i5 == 1) {
            r02 = AnonymousClass9KR.VIDEO;
        } else if (i5 == 6) {
            r02 = AnonymousClass9KR.PAYMENT_LINKS;
        } else if (i5 == 7) {
            r02 = AnonymousClass9KR.PROFILE;
        } else {
            r02 = AnonymousClass9KR.NONE;
        }
        C166258cb A0F11 = AnonymousClass8BS.A0F(r13);
        A0F11.previewType_ = r02.value;
        A0F11.bitField0_ |= 256;
        byte[] bArr2 = r14.A08;
        TextData textData = r14.A02;
        if (textData != null) {
            int i6 = textData.backgroundColor;
            C166258cb A0F12 = AnonymousClass8BS.A0F(r13);
            A0F12.bitField0_ |= 64;
            A0F12.backgroundArgb_ = i6;
            int i7 = textData.textColor;
            C166258cb A0F13 = AnonymousClass8BS.A0F(r13);
            A0F13.bitField0_ |= 32;
            A0F13.textArgb_ = i7;
            AnonymousClass9KZ A003 = AnonymousClass9KZ.A00(textData.fontStyle);
            C166258cb A0F14 = AnonymousClass8BS.A0F(r13);
            A0F14.font_ = A003.value;
            A0F14.bitField0_ |= 128;
            bArr2 = textData.thumbnail;
        }
        if (bArr2 != null) {
            C23581BmB A0A2 = AnonymousClass8BU.A0A(r13, bArr2, 0);
            C166258cb r15 = (C166258cb) r13.A00;
            r15.bitField0_ |= 512;
            r15.jpegThumbnail_ = A0A2;
        }
        C20952Ac6 A004 = C196869vm.A00(r14);
        if (A004 == null) {
            r6 = null;
        } else {
            r6 = A004.A00;
        }
        C23624Bmt A0N = C165798bm.DEFAULT_INSTANCE.A0N();
        if (r6 != null && r6.A05 != null && r6.A09 != null && !r14.A0w()) {
            if (C18020vd.A05(C18040vf.A02, atc.A00, 9584)) {
                String str7 = r6.A05;
                C165798bm r16 = (C165798bm) C17880vN.A0G(A0N);
                str7.getClass();
                r16.bitField0_ |= 1;
                r16.thumbnailDirectPath_ = str7;
                C23581BmB A0B3 = AnonymousClass8BW.A0B(A0N, r6.A09, 0);
                C165798bm r17 = (C165798bm) A0N.A00;
                r17.bitField0_ |= 2;
                r17.thumbnailSha256_ = A0B3;
                byte[] bArr3 = r6.A0B;
                if (bArr3 != null) {
                    C23581BmB A0A3 = AnonymousClass8BU.A0A(A0N, bArr3, 0);
                    C165798bm r18 = (C165798bm) A0N.A00;
                    r18.bitField0_ |= 8;
                    r18.mediaKey_ = A0A3;
                }
                String str8 = r6.A06;
                if (str8 != null) {
                    C23581BmB A0B4 = AnonymousClass8BW.A0B(A0N, str8, 0);
                    C165798bm r19 = (C165798bm) A0N.A00;
                    r19.bitField0_ |= 4;
                    r19.thumbnailEncSha256_ = A0B4;
                }
                long j2 = r6.A02;
                if (j2 > 0) {
                    C165798bm r110 = (C165798bm) C17880vN.A0G(A0N);
                    r110.bitField0_ |= 16;
                    r110.mediaKeyTimestamp_ = j2 / 1000;
                }
                int i8 = r6.A00;
                if (i8 > 0) {
                    C165798bm r111 = (C165798bm) C17880vN.A0G(A0N);
                    r111.bitField0_ |= 32;
                    r111.thumbnailHeight_ = i8;
                }
                int i9 = r6.A01;
                if (i9 > 0) {
                    C165798bm r112 = (C165798bm) C17880vN.A0G(A0N);
                    r112.bitField0_ |= 64;
                    r112.thumbnailWidth_ = i9;
                }
                C165798bm r03 = (C165798bm) A0N.A0C();
                C166258cb A0F15 = AnonymousClass8BS.A0F(r13);
                r03.getClass();
                A0F15.faviconMMSMetadata_ = r03;
                A0F15.bitField0_ |= 67108864;
            }
        }
    }
}

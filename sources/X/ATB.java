package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;

public class ATB implements B83, B85, C436820m {
    public final C18030ve A00;
    public final A79 A01;
    public final C198359yD A02;

    private C163808Wk A00(C19998A2m a2m, C441322g r10) {
        C62572rc r3 = r10.A02;
        boolean A0w = r10.A0w();
        if (r3 == null || (r3.A0a == null && !a2m.A01() && !A0w)) {
            AnonymousClass8BY.A10(r10, "FMessageSticker/unable to send encrypted media message due to missing mediaKey; message.key=", AnonymousClass000.A10());
            if (A0w || !a2m.A04) {
                return null;
            }
            throw AnonymousClass8BW.A0S(16);
        }
        C166218cX r0 = ((C166418cr) a2m.A00.A00).stickerMessage_;
        if (r0 == null) {
            r0 = C166218cX.DEFAULT_INSTANCE;
        }
        C163808Wk r4 = (C163808Wk) r0.A0O();
        byte[] bArr = r3.A0a;
        if (bArr != null) {
            int length = bArr.length;
            if (length == 32 || !a2m.A04) {
                C23581BmB A012 = DSQ.A01(bArr, 0, length);
                C166218cX A0J = AnonymousClass8BS.A0J(r4);
                A0J.bitField0_ |= 8;
                A0J.mediaKey_ = A012;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("FMessageSticker/buildE2eMessage/media key incorrect length; length=");
                A10.append(length);
                AnonymousClass8BX.A1F(r10, "; message.key=", A10);
                throw AnonymousClass8BW.A0S(16);
            }
        } else {
            Log.w("FMessageSticker/buildE2eMessage/sticker media key missing");
        }
        long j = r3.A0B;
        if (j > 0) {
            long A04 = C17880vN.A04(j);
            C166218cX A0J2 = AnonymousClass8BS.A0J(r4);
            A0J2.bitField0_ |= 512;
            A0J2.mediaKeyTimestamp_ = A04;
        }
        if (!TextUtils.isEmpty(r10.A08)) {
            byte[] decode = Base64.decode(r10.A08, 0);
            int length2 = decode.length;
            if (length2 == 32 || !a2m.A04) {
                C23581BmB A013 = DSQ.A01(decode, 0, length2);
                C166218cX A0J3 = AnonymousClass8BS.A0J(r4);
                A0J3.bitField0_ |= 4;
                A0J3.fileEncSha256_ = A013;
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("FMessageSticker/bogus sha-256 enc hash; length=");
                A102.append(length2);
                AnonymousClass8BX.A1F(r10, "; message.key=", A102);
                throw AnonymousClass8BW.A0S(14);
            }
        }
        if (!TextUtils.isEmpty(r10.A05)) {
            byte[] decode2 = Base64.decode(r10.A05, 0);
            int length3 = decode2.length;
            if (length3 == 32 || !a2m.A04) {
                r4.A0G(DSQ.A01(decode2, 0, length3));
            } else {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("FMessageSticker/bogus sha-256 hash; length=");
                A103.append(length3);
                AnonymousClass8BX.A1F(r10, "; message.key=", A103);
                throw AnonymousClass8BW.A0S(14);
            }
        }
        int i = r3.A06;
        if (i > 0 && r3.A08 > 0) {
            C166218cX A0J4 = AnonymousClass8BS.A0J(r4);
            A0J4.bitField0_ |= 32;
            A0J4.height_ = i;
            int i2 = r3.A08;
            C166218cX r1 = (C166218cX) C17880vN.A0G(r4);
            r1.bitField0_ |= 64;
            r1.width_ = i2;
        }
        if (C19998A2m.A00(a2m, r10)) {
            C166278cd A042 = this.A01.A04(a2m, r10);
            C166218cX A0J5 = AnonymousClass8BS.A0J(r4);
            A042.getClass();
            A0J5.contextInfo_ = A042;
            A0J5.bitField0_ |= 16384;
        }
        String str = r10.A07;
        if (str != null) {
            AnonymousClass205 r2 = r10.A0v;
            if (C20133A8t.A0D(r2, str) || !a2m.A04) {
                C166218cX A0J6 = AnonymousClass8BS.A0J(r4);
                A0J6.bitField0_ |= 1;
                A0J6.url_ = str;
            } else {
                StringBuilder A104 = AnonymousClass000.A10();
                A104.append("FMessageSticker/buildE2eMessage/sending image with invalid url");
                A104.append(str);
                C17900vP.A0Z(r2, "; message.key=", A104);
                throw AnonymousClass8BW.A0S(15);
            }
        }
        String str2 = r10.A06;
        if (str2 != null) {
            if (r10.A1I() ? !"application/was".equalsIgnoreCase(str2) : !"image/webp".equalsIgnoreCase(str2)) {
                if (a2m.A04) {
                    StringBuilder A105 = AnonymousClass000.A10();
                    A105.append("FMessageSticker/invalid mime type; mimetype=");
                    A105.append(str2);
                    AnonymousClass8BX.A1F(r10, "; message.key=", A105);
                    throw AnonymousClass8BW.A0S(17);
                }
            }
            C166218cX A0J7 = AnonymousClass8BS.A0J(r4);
            A0J7.bitField0_ |= 16;
            A0J7.mimetype_ = str2;
        }
        if (!TextUtils.isEmpty(r3.A0J)) {
            String str3 = r3.A0J;
            C166218cX A0J8 = AnonymousClass8BS.A0J(r4);
            str3.getClass();
            A0J8.bitField0_ |= 128;
            A0J8.directPath_ = str3;
        }
        long j2 = r10.A01;
        if (j2 > 0) {
            C166218cX A0J9 = AnonymousClass8BS.A0J(r4);
            A0J9.bitField0_ |= 256;
            A0J9.fileLength_ = j2;
        }
        int i3 = r3.A04;
        if (i3 > 0) {
            C166218cX A0J10 = AnonymousClass8BS.A0J(r4);
            A0J10.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            A0J10.firstFrameLength_ = i3;
        }
        byte[] bArr2 = r3.A0X;
        if (bArr2 != null) {
            C23581BmB A03 = C17900vP.A03(r4, bArr2);
            C166218cX r12 = (C166218cX) r4.A00;
            int i4 = C166218cX.ACCESSIBILITY_LABEL_FIELD_NUMBER;
            r12.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            r12.firstFrameSidecar_ = A03;
        }
        boolean z = r10.A03;
        C166218cX A0J11 = AnonymousClass8BS.A0J(r4);
        A0J11.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        A0J11.isAnimated_ = z;
        long j3 = r10.A04;
        C166218cX r5 = (C166218cX) C17880vN.A0G(r4);
        r5.bitField0_ |= 32768;
        r5.stickerSentTs_ = j3;
        boolean A1H = r10.A1H();
        C166218cX r22 = (C166218cX) C17880vN.A0G(r4);
        r22.bitField0_ |= 65536;
        r22.isAvatar_ = A1H;
        boolean A1G = r10.A1G();
        C166218cX r23 = (C166218cX) C17880vN.A0G(r4);
        r23.bitField0_ |= A7Y.A0F;
        r23.isAiSticker_ = A1G;
        boolean A1I = r10.A1I();
        C166218cX r24 = (C166218cX) C17880vN.A0G(r4);
        r24.bitField0_ |= 262144;
        r24.isLottie_ = A1I;
        return r4;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.21V, X.22g, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r0 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C441322g A01(X.C20077A6d r13) {
        /*
            r12 = this;
            X.8cr r0 = r13.A08
            X.8cX r8 = r0.stickerMessage_
            if (r8 != 0) goto L_0x0008
            X.8cX r8 = X.C166218cX.DEFAULT_INSTANCE
        L_0x0008:
            X.205 r4 = r13.A0A
            long r0 = r13.A03
            r2 = 20
            X.22g r3 = new X.22g
            r3.<init>(r4, r2, r0)
            r3.A04 = r0
            boolean r1 = r13.A05()
            X.2rc r9 = new X.2rc
            r9.<init>()
            r3.A02 = r9
            boolean r0 = r3.A0w()
            if (r1 != 0) goto L_0x0029
            r11 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r11 = 1
        L_0x002a:
            int r0 = r8.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x012b
            X.DSQ r0 = r8.mediaKey_
            byte[] r0 = r0.A06()
            X.A3I.A00(r9, r3, r0)
        L_0x0039:
            int r10 = r8.bitField0_
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0046
            long r4 = r8.mediaKeyTimestamp_
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            r9.A0B = r4
        L_0x0046:
            r7 = 14
            java.lang.String r6 = "FMessageSticker/bogus sha-256 hash received; length="
            r5 = 2
            r4 = 32
            java.lang.String r2 = "; message.key="
            if (r11 == 0) goto L_0x0055
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0064
        L_0x0055:
            X.DSQ r0 = r8.fileSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r4) goto L_0x0167
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r3.A05 = r0
        L_0x0064:
            int r0 = r8.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0079
            X.DSQ r0 = r8.fileEncSha256_
            byte[] r1 = r0.A06()
            int r0 = r1.length
            if (r0 != r4) goto L_0x015b
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r5)
            r3.A08 = r0
        L_0x0079:
            if (r11 == 0) goto L_0x0081
            int r0 = r8.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00af
        L_0x0081:
            java.lang.String r4 = r8.mimetype_
            boolean r0 = r8.isLottie_
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "image/webp"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 != 0) goto L_0x00ad
        L_0x008f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageSticker/invalid sticker mime type; mimetype="
            r1.append(r0)
            r1.append(r4)
            X.AnonymousClass8BX.A1F(r3, r2, r1)
            r0 = 17
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x00a5:
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x008f
        L_0x00ad:
            r3.A06 = r4
        L_0x00af:
            int r0 = r8.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = r8.url_
            r3.A1C(r0)
        L_0x00ba:
            int r1 = r8.bitField0_
            r0 = r1 & 64
            if (r0 == 0) goto L_0x00cc
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00cc
            int r0 = r8.height_
            r9.A06 = r0
            int r0 = r8.width_
            r9.A08 = r0
        L_0x00cc:
            if (r11 == 0) goto L_0x00d2
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d6
        L_0x00d2:
            java.lang.String r0 = r8.directPath_
            r9.A0J = r0
        L_0x00d6:
            r0 = r1 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r6 = 0
            if (r0 == 0) goto L_0x00e8
            long r4 = r8.fileLength_
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0147
            r3.A01 = r4
        L_0x00e8:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00f2
            int r0 = r8.firstFrameLength_
            if (r0 <= 0) goto L_0x00f2
            r9.A04 = r0
        L_0x00f2:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0100
            X.DSQ r0 = r8.firstFrameSidecar_
            if (r0 == 0) goto L_0x0100
            byte[] r0 = r0.A06()
            r9.A0X = r0
        L_0x0100:
            boolean r2 = r8.isAiSticker_
            boolean r1 = r8.isAvatar_
            boolean r0 = r8.isLottie_
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r2 == 0) goto L_0x010e
            r0 = r0 | 2
        L_0x010e:
            if (r1 == 0) goto L_0x0112
            r0 = r0 | 4
        L_0x0112:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            r3.A02 = r2
            boolean r0 = r8.isAnimated_
            r3.A03 = r0
            int r1 = r8.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0128
            long r6 = r8.stickerSentTs_
        L_0x0128:
            r3.A04 = r6
            return r3
        L_0x012b:
            if (r11 != 0) goto L_0x0039
            X.0ve r2 = r12.A00
            r1 = 4466(0x1172, float:6.258E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageSticker/no media key; message.key="
            X.AnonymousClass8BX.A1F(r3, r0, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0d()
            throw r0
        L_0x0147:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageSticker/bogus media size received; fileLength="
            r1.append(r0)
            r1.append(r4)
            X.AnonymousClass8BX.A1F(r3, r2, r1)
            X.1hd r0 = X.AnonymousClass8BT.A0c()
            throw r0
        L_0x015b:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.AnonymousClass8BX.A1F(r3, r2, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r7)
            throw r0
        L_0x0167:
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0n(r0, r6)
            X.AnonymousClass8BX.A1F(r3, r2, r0)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATB.A01(X.A6d):X.22g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011f, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01db, code lost:
        if (r1 != null) goto L_0x01ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDb(X.C19998A2m r14, X.AnonymousClass206 r15) {
        /*
            r13 = this;
            boolean r2 = r15 instanceof X.C441322g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageStickerProtobuf: message type is not supported "
            X.AnonymousClass8BX.A1H(r15, r0, r1, r2)
            X.22g r15 = (X.C441322g) r15
            X.AW0 r3 = X.AnonymousClass25B.A00(r15)
            if (r3 == 0) goto L_0x01de
            boolean r0 = r3.A0K()
            if (r0 == 0) goto L_0x012b
            X.1KN r0 = r3.A09
            X.C17960vV.A07(r0)
            long r0 = X.AnonymousClass8BX.A07(r0)
            java.lang.String r7 = r3.A0I
            X.8pG r2 = r3.A0A
            if (r2 != 0) goto L_0x0123
            r5 = 0
            r11 = 0
        L_0x002b:
            com.whatsapp.jid.UserJid r6 = r3.A0E
            X.AEX r10 = r3.A04()
            X.8X8 r4 = r14.A00
            X.Bm6 r2 = r4.A00
            X.8cr r2 = (X.C166418cr) r2
            X.8bp r2 = r2.requestPaymentMessage_
            if (r2 != 0) goto L_0x003d
            X.8bp r2 = X.C165828bp.DEFAULT_INSTANCE
        L_0x003d:
            X.Bmt r3 = r2.A0O()
            X.8Ti r3 = (X.C163008Ti) r3
            boolean r9 = r15 instanceof X.C441322g
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r2 = "FMessageStickerProtobuf/getPaymentNoteMessageBuilder wrong message passed: "
            X.AnonymousClass8BX.A1H(r15, r2, r8, r9)
            X.8X8 r8 = X.C166418cr.A00()
            X.8Wk r2 = r13.A00(r14, r15)
            if (r2 == 0) goto L_0x011f
            r8.A0Q(r2)
        L_0x005b:
            X.Bm6 r9 = X.C17880vN.A0G(r3)
            X.8bp r9 = (X.C165828bp) r9
            X.8cr r8 = X.AnonymousClass8BR.A0e(r8)
            int r2 = X.C165828bp.AMOUNT_1000_FIELD_NUMBER
            r8.getClass()
            r9.noteMessage_ = r8
            int r2 = r9.bitField0_
            r2 = r2 | 1
            r9.bitField0_ = r2
        L_0x0072:
            X.Bm6 r8 = X.C17880vN.A0G(r3)
            X.8bp r8 = (X.C165828bp) r8
            int r2 = X.C165828bp.AMOUNT_1000_FIELD_NUMBER
            int r2 = r8.bitField0_
            r2 = r2 | 4
            r8.bitField0_ = r2
            r8.amount1000_ = r0
            X.8bp r8 = X.AnonymousClass8BW.A0N(r3, r7)
            int r2 = r8.bitField0_
            r2 = r2 | 2
            r8.bitField0_ = r2
            r8.currencyCodeIso4217_ = r7
            X.Bm6 r2 = r3.A00
            X.8bp r2 = (X.C165828bp) r2
            X.8aK r2 = r2.amount_
            if (r2 != 0) goto L_0x0098
            X.8aK r2 = X.C164948aK.DEFAULT_INSTANCE
        L_0x0098:
            X.Bmt r2 = r2.A0O()
            X.8X0 r2 = (X.AnonymousClass8X0) r2
            if (r5 == 0) goto L_0x00a5
            int r0 = r5.getValue()
            long r0 = (long) r0
        L_0x00a5:
            r2.A0H(r0)
            if (r5 == 0) goto L_0x011c
            r0 = r5
            X.ARR r0 = (X.ARR) r0
            int r0 = r0.A00
        L_0x00af:
            r2.A0G(r0)
            if (r5 == 0) goto L_0x00ba
            X.ARR r5 = (X.ARR) r5
            java.lang.String r7 = X.AnonymousClass8BU.A0n(r5)
        L_0x00ba:
            r2.A0I(r7)
            X.Bm6 r0 = r2.A0C()
            X.8aK r0 = (X.C164948aK) r0
            X.8bp r1 = X.AnonymousClass8BW.A0N(r3, r0)
            r1.amount_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            long r1 = X.C17880vN.A04(r11)
            X.Bm6 r5 = X.C17880vN.A0G(r3)
            X.8bp r5 = (X.C165828bp) r5
            int r0 = r5.bitField0_
            r0 = r0 | 16
            r5.bitField0_ = r0
            r5.expiryTimestamp_ = r1
            if (r6 == 0) goto L_0x00f3
            java.lang.String r2 = r6.getRawString()
            X.8bp r1 = X.AnonymousClass8BW.A0N(r3, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.requestFrom_ = r2
        L_0x00f3:
            if (r10 == 0) goto L_0x0105
            X.8c9 r0 = r10.A00()
            X.8bp r1 = X.AnonymousClass8BW.A0N(r3, r0)
            r1.background_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
        L_0x0105:
            X.8cr r2 = X.AnonymousClass8BS.A0M(r4)
            X.Bm6 r0 = r3.A0C()
            X.8bp r0 = (X.C165828bp) r0
            r0.getClass()
            r2.requestPaymentMessage_ = r0
            int r1 = r2.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0118:
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x011b:
            return
        L_0x011c:
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x00af
        L_0x011f:
            if (r8 == 0) goto L_0x0072
            goto L_0x005b
        L_0x0123:
            X.BDa r5 = r2.A00
            long r11 = r2.A0A()
            goto L_0x002b
        L_0x012b:
            java.lang.String r1 = r3.A0M
            com.whatsapp.jid.UserJid r6 = r3.A0D
            X.AEX r5 = r3.A04()
            X.8X8 r4 = r14.A00
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8aI r0 = r0.sendPaymentMessage_
            if (r0 != 0) goto L_0x013f
            X.8aI r0 = X.C164928aI.DEFAULT_INSTANCE
        L_0x013f:
            X.Bmt r3 = r0.A0O()
            X.8Tn r3 = (X.C163058Tn) r3
            if (r1 == 0) goto L_0x017d
            X.8X7 r2 = X.C166408cq.A00()
            r2.A0H(r1)
            r0 = 0
            r2.A0K(r0)
            X.205 r0 = r15.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0161
            if (r6 == 0) goto L_0x0161
            X.AnonymousClass8X7.A01(r6, r2)
        L_0x0161:
            java.lang.String r0 = X.C22971Dz.A06(r1)
            r2.A0J(r0)
            X.8cq r2 = X.AnonymousClass8BU.A0Z(r2, r3)
            X.Bm6 r1 = r3.A00
            X.8aI r1 = (X.C164928aI) r1
            int r0 = X.C164928aI.BACKGROUND_FIELD_NUMBER
            r2.getClass()
            r1.requestMessageKey_ = r2
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
        L_0x017d:
            if (r5 == 0) goto L_0x0196
            X.8c9 r2 = r5.A00()
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8aI r1 = (X.C164928aI) r1
            int r0 = X.C164928aI.BACKGROUND_FIELD_NUMBER
            r2.getClass()
            r1.background_ = r2
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x0196:
            boolean r2 = r15 instanceof X.C441322g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageStickerProtobuf/getPaymentNoteMessageBuilder wrong message passed: "
            X.AnonymousClass8BX.A1H(r15, r0, r1, r2)
            X.8X8 r1 = X.C166418cr.A00()
            X.8Wk r0 = r13.A00(r14, r15)
            if (r0 == 0) goto L_0x01db
            r1.A0Q(r0)
        L_0x01ae:
            X.Bm6 r2 = X.C17880vN.A0G(r3)
            X.8aI r2 = (X.C164928aI) r2
            X.8cr r1 = X.AnonymousClass8BR.A0e(r1)
            int r0 = X.C164928aI.BACKGROUND_FIELD_NUMBER
            r1.getClass()
            r2.noteMessage_ = r1
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
        L_0x01c5:
            X.8cr r2 = X.AnonymousClass8BS.A0M(r4)
            X.Bm6 r0 = r3.A0C()
            X.8aI r0 = (X.C164928aI) r0
            r0.getClass()
            r2.sendPaymentMessage_ = r0
            int r1 = r2.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0118
        L_0x01db:
            if (r1 == 0) goto L_0x01c5
            goto L_0x01ae
        L_0x01de:
            boolean r0 = r15.A1I()
            if (r0 == 0) goto L_0x0215
            X.8X8 r3 = r14.A00
            X.Bm6 r0 = r3.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8Xc r0 = r0.lottieStickerMessage_
            if (r0 != 0) goto L_0x01f0
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x01f0:
            X.Bmt r2 = r0.A0O()
            X.8X6 r2 = (X.AnonymousClass8X6) r2
            X.8X8 r1 = X.AnonymousClass8X6.A00(r2)
            X.8Wk r0 = r13.A00(r14, r15)
            if (r0 == 0) goto L_0x011b
            r1.A0Q(r0)
            X.8Xc r0 = X.AnonymousClass8X6.A01(r1, r2)
            X.8cr r2 = X.AnonymousClass8BV.A0J(r3, r0)
            r2.lottieStickerMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r0
            r2.bitField1_ = r1
            return
        L_0x0215:
            X.8Wk r1 = r13.A00(r14, r15)
            if (r1 == 0) goto L_0x011b
            X.8X8 r0 = r14.A00
            r0.A0Q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATB.BDb(X.A2m, X.206):void");
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r2 = a6d.A08;
        if (AnonymousClass000.A1O(r2.bitField0_ & 2097152)) {
            return A01(a6d);
        }
        if (!AnonymousClass000.A1O(r2.bitField1_ & 134217728)) {
            return null;
        }
        C163988Xc r0 = r2.lottieStickerMessage_;
        if (r0 == null) {
            r0 = C163988Xc.DEFAULT_INSTANCE;
        }
        C166418cr r02 = r0.message_;
        C166418cr r22 = r02;
        if (r02 == null) {
            r02 = C166418cr.DEFAULT_INSTANCE;
        }
        if (AnonymousClass000.A1O(r02.bitField0_ & 2097152)) {
            if (r22 == null) {
                r22 = C166418cr.DEFAULT_INSTANCE;
            }
            return A01(a6d.A03(r22));
        }
        throw AnonymousClass8BT.A0b();
    }

    public ATB(C18030ve r1, A79 a79, C198359yD r3) {
        this.A00 = r1;
        this.A01 = a79;
        this.A02 = r3;
    }
}

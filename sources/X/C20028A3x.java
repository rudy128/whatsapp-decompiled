package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Arrays;

/* renamed from: X.A3x  reason: case insensitive filesystem */
public final class C20028A3x {
    public final C18030ve A00;

    public C20028A3x(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A01(C166168cS r11, AnonymousClass21W r12) {
        C62572rc r4 = new C62572rc();
        r12.A02 = r4;
        if ((r11.bitField0_ & 16) != 0) {
            A3I.A00(r4, r12, r11.mediaKey_.A06());
            byte[] A06 = r11.streamingSidecar_.A06();
            if (A06.length != 0) {
                C693436v A17 = r12.A17();
                C17960vV.A07(A17);
                synchronized (A17) {
                    A17.A04(A06, (int[]) null);
                }
            }
            if (AnonymousClass000.A1O(r11.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
                r4.A0B = r11.mediaKeyTimestamp_ * 1000;
            }
            byte[] A062 = r11.jpegThumbnail_.A06();
            C18070vi.A0b(A062);
            if (A062.length != 0) {
                r12.A02 = 1;
                r12.A15(A062, false);
            }
            long j = r11.fileLength_;
            if (j > 0) {
                r12.A01 = j;
                r4.A08 = r11.width_;
                r4.A06 = r11.height_;
                byte[] A063 = r11.fileSha256_.A06();
                int length = A063.length;
                if (length == 32) {
                    r12.A05 = Base64.encodeToString(A063, 2);
                    if ((r11.bitField0_ & 512) != 0) {
                        byte[] A064 = r11.fileEncSha256_.A06();
                        int length2 = A064.length;
                        if (length2 == 32) {
                            r12.A08 = Base64.encodeToString(A064, 2);
                        } else {
                            AnonymousClass8BX.A1F(r12, "; message.key=", AnonymousClass8BW.A0n(length2, "FMessageVideoCommon/bogus sha-256 hash received; length="));
                            throw AnonymousClass8BR.A0o(14);
                        }
                    }
                    if (AnonymousClass1SO.A08(r11.mimetype_, true) != null) {
                        r12.A06 = r11.mimetype_;
                        String str = r11.caption_;
                        if (!(str == null || str.length() == 0)) {
                            AnonymousClass8BU.A1D(r12, str);
                        }
                        if ((r11.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                            r4.A0J = r11.directPath_;
                        } else {
                            AnonymousClass8BX.A1F(r12, "FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key=", AnonymousClass000.A10());
                        }
                        int i = r11.bitField0_;
                        if (!((32768 & i) == 0 || (131072 & i) == 0 || (i & 65536) == 0)) {
                            C693536w r2 = new C693536w(C49572Qz.VIDEO, r12.A0x);
                            r2.A05 = r11.thumbnailDirectPath_;
                            AnonymousClass8BX.A14(r11.thumbnailEncSha256_, r2, r11.thumbnailSha256_.A06());
                            r2.A0B = r11.mediaKey_.A06();
                            r2.A02 = r11.mediaKeyTimestamp_ * 1000;
                            C60502o8.A01(r12, r2);
                        }
                        r12.A0D = r11.seconds_;
                        return;
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("FMessageVideoCommon/unrecognized video mime type; mimeType=");
                    A10.append(r11.mimetype_);
                    AnonymousClass8BX.A1F(r12, "; message.key=", A10);
                    throw AnonymousClass8BR.A0o(17);
                }
                AnonymousClass8BX.A1F(r12, "; message.key=", AnonymousClass8BW.A0n(length, "FMessageVideoCommon/bogus sha-256 hash received; length="));
                throw AnonymousClass8BR.A0o(14);
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("FMessageVideoCommon/bogus media size received; file_length=");
            A102.append(j);
            AnonymousClass8BX.A1F(r12, "; message.key=", A102);
            throw AnonymousClass8BT.A0c();
        }
        AnonymousClass8BX.A1F(r12, "FMessageVideoCommon/missing media key; message.key=", AnonymousClass000.A10());
        throw AnonymousClass8BT.A0d();
    }

    public static final C163928Ww A00(C163928Ww r10, AnonymousClass21W r11, boolean z) {
        byte[] bArr;
        boolean z2;
        boolean A15 = C18070vi.A15(r11, r10);
        C62572rc r4 = r11.A02;
        C693336u A0O = r11.A0O();
        C18070vi.A0X(A0O);
        if (r4 == null || (bArr = r4.A0a) == null) {
            AnonymousClass8BY.A10(r11, "FMessageVideoCommon/unable to send encrypted media message due to missing mediaKey; message.key=", AnonymousClass000.A10());
            return null;
        }
        int length = bArr.length;
        if (length != 32) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FMessageVideoCommon/buildE2eMessage/media key incorrect length; length=");
            A10.append(length);
            AnonymousClass8BX.A1F(r11, "; message.key=", A10);
        }
        String str = r11.A07;
        if (AnonymousClass21V.A0A(str)) {
            AnonymousClass205 r3 = r11.A0v;
            if (!C20133A8t.A0D(r3, str)) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("FMessageVideoCommon/buildE2eMessage/sending image with invalid url");
                A102.append(str);
                C17900vP.A0Z(r3, "; message.key=", A102);
            }
        }
        String str2 = r11.A06;
        if (!(str2 == null || str2.length() == 0)) {
            C17960vV.A07(str2);
            C166248ca A0L = AnonymousClass8BS.A0L(r10);
            A0L.bitField0_ |= 2;
            A0L.mimetype_ = str2;
        }
        String str3 = r11.A05;
        if (!(str3 == null || str3.length() == 0)) {
            C23581BmB A0B = AnonymousClass8BW.A0B(r10, str3, A15);
            C166248ca r1 = (C166248ca) r10.A00;
            int i = C166248ca.ACCESSIBILITY_LABEL_FIELD_NUMBER;
            r1.bitField0_ |= 4;
            r1.fileSha256_ = A0B;
        }
        String str4 = r11.A08;
        if (!(str4 == null || str4.length() == 0)) {
            C23581BmB A0B2 = AnonymousClass8BW.A0B(r10, str4, A15);
            C166248ca r12 = (C166248ca) r10.A00;
            int i2 = C166248ca.ACCESSIBILITY_LABEL_FIELD_NUMBER;
            r12.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r12.fileEncSha256_ = A0B2;
        }
        long j = r11.A01;
        if (j > 0) {
            C166248ca A0L2 = AnonymousClass8BS.A0L(r10);
            A0L2.bitField0_ |= 8;
            A0L2.fileLength_ = j;
            long j2 = r11.A01;
            if (j2 <= 0) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("FMessageVideoCommon/buildE2eMessage/sending video with media size not set, size=");
                A103.append(j2);
                AnonymousClass8BX.A1F(r11, "; message.key=", A103);
            }
        }
        if (r11.A0D > 0) {
            int i3 = r11.A0D;
            C166248ca A0L3 = AnonymousClass8BS.A0L(r10);
            A0L3.bitField0_ |= 16;
            A0L3.seconds_ = i3;
        }
        String A18 = r11.A18();
        if (A18 != null) {
            C166248ca A0L4 = AnonymousClass8BS.A0L(r10);
            A0L4.bitField0_ |= 64;
            A0L4.caption_ = A18;
        }
        byte[] bArr2 = r4.A0a;
        if (bArr2 != null) {
            C23581BmB A0F = AnonymousClass8BR.A0F(bArr2, A15);
            C166248ca A0L5 = AnonymousClass8BS.A0L(r10);
            A0L5.bitField0_ |= 32;
            A0L5.mediaKey_ = A0F;
        }
        long j3 = r4.A0B;
        if (j3 > 0) {
            long A04 = C17880vN.A04(j3);
            C166248ca A0L6 = AnonymousClass8BS.A0L(r10);
            A0L6.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            A0L6.mediaKeyTimestamp_ = A04;
        }
        C693536w A002 = C60502o8.A00(r11);
        if (A002 == null || A002.A05 == null || A002.A09 == null || A002.A06 == null || !Arrays.equals(A002.A0B, r4.A0a) || A002.A02 != r4.A0B) {
            z2 = true;
        } else {
            z2 = A002.A0E;
            r10.A0H(A002.A05);
            C23581BmB A0F2 = AnonymousClass8BR.A0F(Base64.decode(A002.A09, A15), A15);
            C166248ca A0L7 = AnonymousClass8BS.A0L(r10);
            A0L7.bitField0_ |= 524288;
            A0L7.thumbnailSha256_ = A0F2;
            C23581BmB A0B3 = AnonymousClass8BW.A0B(r10, A002.A06, A15);
            C166248ca r2 = (C166248ca) r10.A00;
            r2.bitField0_ |= 1048576;
            r2.thumbnailEncSha256_ = A0B3;
        }
        if (z || A0O.A01() == null || !z2) {
            AnonymousClass8BX.A1F(r11, "FMessageVideoCommon/buildE2eMessage/video thumbnail missing; message.key=", AnonymousClass000.A10());
        } else {
            C23581BmB A0F3 = AnonymousClass8BR.A0F(A0O.A01(), A15 ? 1 : 0);
            C166248ca A0L8 = AnonymousClass8BS.A0L(r10);
            A0L8.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            A0L8.jpegThumbnail_ = A0F3;
        }
        int i4 = r4.A06;
        if (i4 > 0 && r4.A08 > 0) {
            C166248ca A0L9 = AnonymousClass8BS.A0L(r10);
            A0L9.bitField0_ |= 256;
            A0L9.height_ = i4;
            int i5 = r4.A08;
            C166248ca r13 = (C166248ca) C17880vN.A0G(r10);
            r13.bitField0_ |= 512;
            r13.width_ = i5;
        }
        String str5 = r4.A0J;
        if (str5 == null || str5.length() == 0) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("FMessageVideoCommon/message without direct path received; message.key=");
            AnonymousClass8BY.A0z(r11, r11.A0v, A104);
            return r10;
        }
        C166248ca A0L10 = AnonymousClass8BS.A0L(r10);
        A0L10.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A0L10.directPath_ = str5;
        return r10;
    }
}

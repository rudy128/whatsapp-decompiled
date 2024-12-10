package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Arrays;

public final class ASG implements C436920n {
    public final AnonymousClass00H A00;

    public ASG(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.21i, X.21V, X.206] */
    public AnonymousClass206 CBH(C195239t1 r13) {
        C18070vi.A0d(r13, 0);
        C165928bz r2 = r13.A01;
        if ((r2.bitField0_ & 8) == 0 || C18070vi.A18(r13.A03, "medianotify")) {
            return null;
        }
        C166158cR r5 = r2.documentMessage_;
        if (r5 == null) {
            r5 = C166158cR.DEFAULT_INSTANCE;
        }
        ? r22 = new AnonymousClass21V(r13.A02, 9, r13.A00);
        this.A00.get();
        C18070vi.A0b(r5);
        C18070vi.A0d(r5, 1);
        C62572rc r6 = new C62572rc();
        r22.A02 = r6;
        if ((r5.bitField0_ & 32) != 0) {
            A3I.A00(r6, r22, r5.mediaKey_.A06());
            if (AnonymousClass000.A1O(r5.bitField0_ & 512)) {
                r6.A0B = r5.mediaKeyTimestamp_ * 1000;
            }
            byte[] A06 = r5.jpegThumbnail_.A06();
            C18070vi.A0b(A06);
            if (A06.length != 0) {
                r22.A02 = 1;
                r22.A0p(A06);
            }
            int i = r5.bitField0_;
            if (AnonymousClass000.A1O(i & 8)) {
                long j = r5.fileLength_;
                if (j >= 0) {
                    r22.A01 = j;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("FMessageDocument/bogus media size received; file_length=");
                    A10.append(j);
                    AnonymousClass8BX.A1F(r22, "; message.key=", A10);
                    throw AnonymousClass8BT.A0c();
                }
            }
            if (AnonymousClass000.A1O(i & 4)) {
                byte[] A062 = r5.fileSha256_.A06();
                int length = A062.length;
                if (length == 32) {
                    r22.A05 = Base64.encodeToString(A062, 2);
                } else {
                    AnonymousClass8BX.A1F(r22, "; message.key=", AnonymousClass8BW.A0n(length, "FMessageDocument/bogus sha-256 hash received; length="));
                    throw AnonymousClass8BR.A0o(14);
                }
            }
            if ((r5.bitField0_ & 128) != 0) {
                byte[] A063 = r5.fileEncSha256_.A06();
                int length2 = A063.length;
                if (length2 == 32) {
                    r22.A08 = Base64.encodeToString(A063, 2);
                } else {
                    AnonymousClass8BX.A1F(r22, "; message.key=", AnonymousClass8BW.A0n(length2, "FMessageDocument/bogus sha-256 hash received; length="));
                    throw AnonymousClass8BR.A0o(14);
                }
            }
            String str = r5.title_;
            if (!(str == null || str.length() == 0)) {
                r22.A04 = AnonymousClass1EG.A0E(str, 65536);
            }
            r22.A00 = r5.pageCount_;
            String str2 = r5.caption_;
            if (!(str2 == null || str2.length() == 0)) {
                r22.A1H(str2);
            }
            String str3 = r5.fileName_;
            if (!(str3 == null || str3.length() == 0)) {
                r22.A09 = AnonymousClass1EG.A0E(str3, 65536);
            }
            if ((r5.bitField0_ & 256) != 0) {
                r6.A0J = r5.directPath_;
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("FMessageAudio/message without direct path received; message.key=");
                AnonymousClass8BY.A0z(r22, r22.A0v, A102);
            }
            int i2 = r5.bitField0_;
            if (!((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0 || (i2 & DefaultCrypto.BUFFER_SIZE) == 0 || (i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0 || (i2 & 32) == 0)) {
                C693536w A0M = AnonymousClass8BV.A0M(C49572Qz.DOCUMENT);
                A0M.A05 = r5.thumbnailDirectPath_;
                AnonymousClass8BV.A1A(r5.thumbnailSha256_, A0M);
                A0M.A06 = Base64.encodeToString(r5.thumbnailEncSha256_.A06(), 2);
                A0M.A0B = r5.mediaKey_.A06();
                int i3 = r5.bitField0_;
                if ((i3 & 512) != 0) {
                    A0M.A02 = r5.mediaKeyTimestamp_ * 1000;
                }
                if ((i3 & 16384) != 0) {
                    A0M.A0C = r5.jpegThumbnail_.A06();
                }
                int i4 = r5.bitField0_;
                if ((65536 & i4) != 0) {
                    A0M.A01 = r5.thumbnailWidth_;
                }
                if ((i4 & 32768) != 0) {
                    A0M.A00 = r5.thumbnailHeight_;
                }
                C60502o8.A01(r22, A0M);
            }
            r22.A06 = r5.mimetype_;
            if (r5.contactVcard_) {
                r22.A09 = 7;
            }
            return r22;
        }
        AnonymousClass8BX.A1F(r22, "FMessageDocument/missing media key; message.key=", AnonymousClass000.A10());
        throw AnonymousClass8BT.A0d();
    }

    public void BDc(C184489b2 r16, AnonymousClass206 r17) {
        boolean z;
        C23581BmB A0F;
        AnonymousClass206 r8 = r17;
        C184489b2 r2 = r16;
        boolean A15 = C18070vi.A15(r8, r2);
        if (r8 instanceof C438921i) {
            C438921i r82 = (C438921i) r8;
            this.A00.get();
            AnonymousClass8X8 r9 = r2.A00;
            C166208cW r0 = ((C166418cr) r9.A00).documentMessage_;
            if (r0 == null) {
                r0 = C166208cW.DEFAULT_INSTANCE;
            }
            C162748Si r7 = (C162748Si) r0.A0O();
            C18070vi.A0e(r82, A15, r7);
            boolean z2 = r2.A01;
            C62572rc r5 = r82.A02;
            boolean z3 = false;
            if (r5 != null) {
                C693336u A0O = r82.A0O();
                C18070vi.A0X(A0O);
                String str = r82.A06;
                if (str != null) {
                    C166208cW A0X = AnonymousClass8BT.A0X(r7);
                    A0X.bitField0_ |= 2;
                    A0X.mimetype_ = str;
                }
                String A18 = r82.A18();
                if (A18 != null) {
                    C166208cW A0X2 = AnonymousClass8BT.A0X(r7);
                    A0X2.bitField0_ |= 4;
                    A0X2.title_ = A18;
                }
                String A19 = r82.A19();
                if (A19 != null) {
                    C166208cW A0X3 = AnonymousClass8BT.A0X(r7);
                    A0X3.bitField0_ |= 128;
                    A0X3.fileName_ = A19;
                }
                String str2 = r82.A01;
                if (str2 != null) {
                    C166208cW A0X4 = AnonymousClass8BT.A0X(r7);
                    A0X4.bitField0_ |= 524288;
                    A0X4.caption_ = str2;
                }
                int i = r82.A00;
                if (i >= 0) {
                    C166208cW A0X5 = AnonymousClass8BT.A0X(r7);
                    A0X5.bitField0_ |= 32;
                    A0X5.pageCount_ = i;
                }
                String str3 = r82.A05;
                if (!(str3 == null || str3.length() == 0)) {
                    byte[] decode = Base64.decode(str3, 0);
                    C18070vi.A0b(decode);
                    int length = decode.length;
                    if (length != 32) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("FMessageAudioInterop/bogus sha-256 hash; length=");
                        A10.append(length);
                        AnonymousClass8BX.A1F(r82, "; message.key=", A10);
                    }
                    C23581BmB A0F2 = AnonymousClass8BR.A0F(decode, 0);
                    C166208cW A0X6 = AnonymousClass8BT.A0X(r7);
                    A0X6.bitField0_ |= 8;
                    A0X6.fileSha256_ = A0F2;
                }
                String str4 = r82.A08;
                if (!(str4 == null || str4.length() == 0)) {
                    byte[] decode2 = Base64.decode(str4, 0);
                    C18070vi.A0b(decode2);
                    int length2 = decode2.length;
                    if (length2 != 32) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("FMessageAudio/bogus sha-256 enc hash; length=");
                        A102.append(length2);
                        AnonymousClass8BX.A1F(r82, "; message.key=", A102);
                    }
                    C23581BmB A0F3 = AnonymousClass8BR.A0F(decode2, 0);
                    C166208cW A0X7 = AnonymousClass8BT.A0X(r7);
                    A0X7.bitField0_ |= 256;
                    A0X7.fileEncSha256_ = A0F3;
                }
                long j = r82.A01;
                if (j > 0) {
                    C166208cW A0X8 = AnonymousClass8BT.A0X(r7);
                    A0X8.bitField0_ |= 16;
                    A0X8.fileLength_ = j;
                }
                byte[] bArr = r5.A0a;
                if (bArr != null) {
                    int length3 = bArr.length;
                    if (length3 != 32) {
                        StringBuilder A103 = AnonymousClass000.A10();
                        A103.append("FMessageAudio/buildE2eMessage/media key incorrect length; length=");
                        A103.append(length3);
                        AnonymousClass8BX.A1F(r82, "; message.key=", A103);
                    }
                    C23581BmB A0F4 = AnonymousClass8BR.A0F(bArr, 0);
                    C166208cW A0X9 = AnonymousClass8BT.A0X(r7);
                    A0X9.bitField0_ |= 64;
                    A0X9.mediaKey_ = A0F4;
                }
                long j2 = r5.A0B;
                if (j2 > 0) {
                    long A04 = C17880vN.A04(j2);
                    C166208cW A0X10 = AnonymousClass8BT.A0X(r7);
                    A0X10.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    A0X10.mediaKeyTimestamp_ = A04;
                }
                C693536w A002 = C60502o8.A00(r82);
                byte[] bArr2 = null;
                if (A002 == null || A002.A05 == null || A002.A09 == null || A002.A06 == null || A002.A0C == null || !Arrays.equals(A002.A0B, r5.A0a) || A002.A02 != r5.A0B) {
                    z = false;
                } else {
                    z = true;
                    String str5 = A002.A05;
                    C166208cW A0X11 = AnonymousClass8BT.A0X(r7);
                    str5.getClass();
                    A0X11.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                    A0X11.thumbnailDirectPath_ = str5;
                    C23581BmB A0B = AnonymousClass8BW.A0B(r7, A002.A09, 0);
                    C166208cW r1 = (C166208cW) r7.A00;
                    r1.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                    r1.thumbnailSha256_ = A0B;
                    AnonymousClass8BY.A0n(AnonymousClass8BW.A0B(r7, A002.A06, 0), r7, A002);
                }
                if (!z2) {
                    if (A002 != null) {
                        z3 = A002.A0E;
                    }
                    if (z && z3) {
                        if (A002 != null) {
                            bArr2 = A002.A0C;
                        }
                        A0F = AnonymousClass8BR.A0F(bArr2, 0);
                    } else if (A0O.A01() != null) {
                        A0F = AnonymousClass8BR.A0F(A0O.A01(), 0);
                    }
                    C166208cW A0X12 = AnonymousClass8BT.A0X(r7);
                    A0X12.bitField0_ |= 32768;
                    A0X12.jpegThumbnail_ = A0F;
                }
                String str6 = r5.A0J;
                if (str6 == null || str6.length() == 0) {
                    AnonymousClass8BX.A1F(r82, "FMessageDocument/buildE2eMessage/sending document with directPath not set; message.key=", AnonymousClass000.A10());
                } else {
                    C166208cW A0X13 = AnonymousClass8BT.A0X(r7);
                    A0X13.bitField0_ |= 512;
                    A0X13.directPath_ = str6;
                }
                if (r82.A09 == 7) {
                    C166208cW A0X14 = AnonymousClass8BT.A0X(r7);
                    A0X14.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                    A0X14.contactVcard_ = true;
                }
                C166208cW r02 = (C166208cW) r7.A0C();
                C166418cr A0J = AnonymousClass8BV.A0J(r9, r02);
                A0J.documentMessage_ = r02;
                A0J.bitField0_ |= 64;
                return;
            }
            throw AnonymousClass8BW.A0S(A15);
        }
        throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
    }
}

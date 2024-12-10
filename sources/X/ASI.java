package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Arrays;

public final class ASI implements C436920n {
    public final AnonymousClass00H A00;

    public ASI(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass206 CBH(C195239t1 r14) {
        C18070vi.A0d(r14, 0);
        C165928bz r1 = r14.A01;
        if ((r1.bitField0_ & 4) == 0) {
            return null;
        }
        C166188cU r6 = r1.imageMessage_;
        if (r6 == null) {
            r6 = C166188cU.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r2 = r14.A02;
        long j = r14.A00;
        C18070vi.A0d(r2, 1);
        AnonymousClass21V r3 = new AnonymousClass21V(r2, 1, j);
        this.A00.get();
        C18070vi.A0b(r6);
        C18070vi.A0d(r6, 1);
        C62572rc r5 = new C62572rc();
        r3.A02 = r5;
        if ((r6.bitField0_ & 64) != 0) {
            byte[] A06 = r6.mediaKey_.A06();
            C18070vi.A0b(A06);
            if (A06.length != 0) {
                A3I.A00(r5, r3, A06);
            }
            int i = r6.bitField0_;
            if (AnonymousClass000.A1O(i & 512)) {
                r5.A0B = r6.mediaKeyTimestamp_ * 1000;
            }
            if (!(!AnonymousClass000.A1O(32768 & i) || (131072 & i) == 0 || (i & 65536) == 0)) {
                C693536w A0M = AnonymousClass8BV.A0M(C49572Qz.IMAGE);
                A0M.A05 = r6.thumbnailDirectPath_;
                AnonymousClass8BX.A14(r6.thumbnailEncSha256_, A0M, r6.thumbnailSha256_.A06());
                A0M.A0B = r6.mediaKey_.A06();
                A0M.A02 = r6.mediaKeyTimestamp_ * 1000;
                C60502o8.A01(r3, A0M);
            }
            int size = r6.scanLengths_.size();
            if (AnonymousClass000.A1O(r6.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) && size > 0) {
                byte[] A062 = r6.scansSidecar_.A06();
                int[] iArr = new int[size];
                int i2 = 0;
                do {
                    Bm7 bm7 = (Bm7) r6.scanLengths_;
                    Bm7.A00(bm7, i2);
                    iArr[i2] = bm7.A01[i2];
                    i2++;
                } while (i2 < size);
                if (size >= 2 && A062.length / 10 == size) {
                    C693436v A17 = r3.A17();
                    C17960vV.A07(A17);
                    A17.A04(A062, iArr);
                    if ((r6.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0) {
                        byte[] A063 = r6.midQualityFileSha256_.A06();
                        if (A063.length == 32) {
                            r5.A0O = Base64.encodeToString(A063, 2);
                        }
                    }
                    if ((r6.bitField0_ & 16384) != 0) {
                        byte[] A064 = r6.midQualityFileEncSha256_.A06();
                        if (A064.length == 32) {
                            r5.A0N = Base64.encodeToString(A064, 2);
                        }
                    }
                    byte[] bArr = new byte[10];
                    DSQ dsq = r6.scansSidecar_;
                    DSQ.A00(0, 10, dsq.A02());
                    dsq.A05(bArr, 10);
                    r5.A0X = bArr;
                    r5.A04 = iArr[0];
                }
            }
            byte[] A065 = r6.jpegThumbnail_.A06();
            C18070vi.A0b(A065);
            if (A065.length != 0) {
                r3.A02 = 1;
                r3.A0p(A065);
            }
            long j2 = r6.fileLength_;
            if (j2 >= 0) {
                r3.A01 = j2;
                byte[] A066 = r6.fileSha256_.A06();
                int length = A066.length;
                if (length == 32) {
                    r3.A05 = Base64.encodeToString(A066, 2);
                    if ((r6.bitField0_ & 128) != 0) {
                        byte[] A067 = r6.fileEncSha256_.A06();
                        int length2 = A067.length;
                        if (length2 == 32) {
                            r3.A08 = Base64.encodeToString(A067, 2);
                        } else {
                            AnonymousClass8BX.A1F(r3, "; message.key=", AnonymousClass8BW.A0n(length2, "FMessageImageCommon/bogus sha-256 hash received; length="));
                            throw AnonymousClass8BR.A0o(14);
                        }
                    }
                    String str = r6.caption_;
                    if (!(str == null || str.length() == 0)) {
                        AnonymousClass8BU.A1D(r3, str);
                    }
                    String str2 = r6.mimetype_;
                    if ("image/jpeg".equalsIgnoreCase(str2) || "image/png".equalsIgnoreCase(str2)) {
                        r3.A06 = str2;
                        r5.A0J = r6.directPath_;
                        r5.A08 = r6.width_;
                        r5.A06 = r6.height_;
                        return r3;
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("FMessageImageCommon/invalid mime type; mimetype=");
                    A10.append(str2);
                    AnonymousClass8BX.A1F(r3, "; message.key=", A10);
                    throw AnonymousClass8BR.A0o(17);
                }
                AnonymousClass8BX.A1F(r3, "; message.key=", AnonymousClass8BW.A0n(length, "FMessageImageCommon/bogus sha-256 hash received; length="));
                throw AnonymousClass8BR.A0o(14);
            }
            throw AnonymousClass8BT.A0c();
        }
        AnonymousClass8BX.A1F(r3, "FMessageImageCommon/missing media key; message.key=", AnonymousClass000.A10());
        throw AnonymousClass8BT.A0d();
    }

    public void BDc(C184489b2 r17, AnonymousClass206 r18) {
        int length;
        int length2;
        AnonymousClass206 r7 = r18;
        C184489b2 r10 = r17;
        boolean A15 = C18070vi.A15(r7, r10);
        if (r7 instanceof C438421d) {
            AnonymousClass21V r72 = (AnonymousClass21V) r7;
            this.A00.get();
            AnonymousClass8X8 r9 = r10.A00;
            C166268cc r0 = ((C166418cr) r9.A00).imageMessage_;
            if (r0 == null) {
                r0 = C166268cc.DEFAULT_INSTANCE;
            }
            C163748We r6 = (C163748We) r0.A0O();
            AnonymousClass3Ma.A1N(r72, A15, r6);
            C62572rc r8 = r72.A02;
            C693336u A0O = r72.A0O();
            if (r8 != null) {
                String str = r72.A06;
                boolean z = true;
                if (str == null) {
                    C166268cc A0G = AnonymousClass8BS.A0G(r6);
                    A0G.bitField0_ |= 2;
                    A0G.mimetype_ = "image/jpeg";
                } else if ("image/jpeg".equalsIgnoreCase(str) || "image/png".equalsIgnoreCase(str)) {
                    C166268cc A0G2 = AnonymousClass8BS.A0G(r6);
                    A0G2.bitField0_ |= 2;
                    A0G2.mimetype_ = str;
                } else {
                    throw AnonymousClass8BW.A0S(17);
                }
                String A18 = r72.A18();
                if (A18 != null) {
                    C166268cc A0G3 = AnonymousClass8BS.A0G(r6);
                    A0G3.bitField0_ |= 4;
                    A0G3.caption_ = A18;
                }
                byte[] decode = Base64.decode(r72.A05, 0);
                int length3 = decode.length;
                C23581BmB A01 = DSQ.A01(decode, 0, length3);
                C166268cc A0G4 = AnonymousClass8BS.A0G(r6);
                A0G4.bitField0_ |= 8;
                A0G4.fileSha256_ = A01;
                if (length3 == 32) {
                    String str2 = r72.A08;
                    if (!(str2 == null || str2.length() == 0)) {
                        byte[] decode2 = Base64.decode(str2, 0);
                        int length4 = decode2.length;
                        C23581BmB A012 = DSQ.A01(decode2, 0, length4);
                        C166268cc r1 = (C166268cc) C17880vN.A0G(r6);
                        r1.bitField0_ |= 256;
                        r1.fileEncSha256_ = A012;
                        if (length4 != 32) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("FMessageImageCommon/bogus sha-256 enc hash; length=");
                            A10.append(length4);
                            AnonymousClass8BX.A1F(r72, "; message.key=", A10);
                            throw AnonymousClass8BW.A0S(14);
                        }
                    }
                    long j = r72.A01;
                    C166268cc A0G5 = AnonymousClass8BS.A0G(r6);
                    A0G5.bitField0_ |= 16;
                    A0G5.fileLength_ = j;
                    long j2 = r72.A01;
                    if (j2 <= 0) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("FMessageImageCommon/buildE2eInteropMessage/sending image with media size not set, size=");
                        A102.append(j2);
                        AnonymousClass8BX.A1F(r72, "; message.key=", A102);
                    }
                    long j3 = r72.A01;
                    C166268cc A0G6 = AnonymousClass8BS.A0G(r6);
                    A0G6.bitField0_ |= 16;
                    A0G6.fileLength_ = j3;
                    byte[] bArr = r8.A0a;
                    if (!(bArr == null || (length2 = bArr.length) == 32)) {
                        StringBuilder A103 = AnonymousClass000.A10();
                        A103.append("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
                        A103.append(length2);
                        AnonymousClass8BX.A1F(r72, "; message.key=", A103);
                    }
                    C23581BmB A0A = AnonymousClass8BU.A0A(r6, r8.A0a, 0);
                    C166268cc r12 = (C166268cc) r6.A00;
                    r12.bitField0_ |= 128;
                    r12.mediaKey_ = A0A;
                    long j4 = r8.A0B;
                    if (j4 > 0) {
                        long A04 = C17880vN.A04(j4);
                        C166268cc r3 = (C166268cc) C17880vN.A0G(r6);
                        r3.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                        r3.mediaKeyTimestamp_ = A04;
                    }
                    int i = r8.A06;
                    if (i > 0 && r8.A08 > 0) {
                        C166268cc r13 = (C166268cc) C17880vN.A0G(r6);
                        r13.bitField0_ |= 32;
                        r13.height_ = i;
                        int i2 = r8.A08;
                        C166268cc r14 = (C166268cc) C17880vN.A0G(r6);
                        r14.bitField0_ |= 64;
                        r14.width_ = i2;
                    }
                    String str3 = r8.A0J;
                    if (str3 == null || str3.length() == 0) {
                        AnonymousClass8BX.A1F(r72, "FMessageImageCommon/buildE2eInteropMessage/sending image with directPath not set; message.key=", AnonymousClass000.A10());
                    } else {
                        C166268cc r15 = (C166268cc) C17880vN.A0G(r6);
                        r15.bitField0_ |= 512;
                        r15.directPath_ = str3;
                    }
                    C693436v A17 = r72.A17();
                    if (A17 != null) {
                        byte[] A06 = A17.A06();
                        int[] A07 = A17.A07();
                        if (!(A07 == null || A06 == null || (length = A07.length) < 2)) {
                            int length5 = A06.length;
                            if (length5 / 10 == length) {
                                C23581BmB A013 = DSQ.A01(A06, 0, length5);
                                C166268cc r2 = (C166268cc) C17880vN.A0G(r6);
                                r2.bitField0_ |= 65536;
                                r2.scansSidecar_ = A013;
                                int i3 = 0;
                                do {
                                    int i4 = A07[i3];
                                    C166268cc r22 = (C166268cc) C17880vN.A0G(r6);
                                    C28667EDj eDj = r22.scanLengths_;
                                    boolean z2 = ((C27296DbR) eDj).A00;
                                    Bm7 bm7 = eDj;
                                    if (!z2) {
                                        Bm7 A08 = C23577Bm6.A08(eDj);
                                        r22.scanLengths_ = A08;
                                        bm7 = A08;
                                    }
                                    bm7.BBE(i4);
                                    i3++;
                                } while (i3 < length);
                                z = !A17.A04;
                                String str4 = r8.A0O;
                                if (!(str4 == null || str4.length() == 0)) {
                                    C23581BmB A0B = AnonymousClass8BW.A0B(r6, str4, 0);
                                    C166268cc r23 = (C166268cc) r6.A00;
                                    r23.bitField0_ |= A7Y.A0F;
                                    r23.midQualityFileSha256_ = A0B;
                                }
                            }
                        }
                    }
                    C693536w A002 = C60502o8.A00(r72);
                    if (!(A002 == null || A002.A05 == null || A002.A09 == null || A002.A06 == null || !Arrays.equals(A002.A0B, r8.A0a) || A002.A02 != r8.A0B)) {
                        z = A002.A0E;
                        r6.A0G(A002.A05);
                        C23581BmB A0F = AnonymousClass8BR.A0F(Base64.decode(A002.A09, 0), 0);
                        C166268cc A0G7 = AnonymousClass8BS.A0G(r6);
                        A0G7.bitField0_ |= 2097152;
                        A0G7.thumbnailSha256_ = A0F;
                        C23581BmB A0B2 = AnonymousClass8BW.A0B(r6, A002.A06, 0);
                        C166268cc r24 = (C166268cc) r6.A00;
                        r24.bitField0_ |= 4194304;
                        r24.thumbnailEncSha256_ = A0B2;
                    }
                    if (r10.A01 || A0O.A01() == null || !z) {
                        AnonymousClass8BX.A1F(r72, "FMessageImageCommon/buildE2eInteropMessage/image thumbnail missing; message.key=", AnonymousClass000.A10());
                    } else {
                        C23581BmB A0F2 = AnonymousClass8BR.A0F(A0O.A01(), 0);
                        C166268cc A0G8 = AnonymousClass8BS.A0G(r6);
                        A0G8.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                        A0G8.jpegThumbnail_ = A0F2;
                    }
                    C166268cc r02 = (C166268cc) r6.A0C();
                    C166418cr A042 = AnonymousClass8X8.A04(r9, r02);
                    A042.imageMessage_ = r02;
                    A042.bitField0_ |= 4;
                    return;
                }
                StringBuilder A104 = AnonymousClass000.A10();
                A104.append("FMessageImageCommon/bogus sha-256 hash; length=");
                A104.append(length3);
                AnonymousClass8BX.A1F(r72, "; message.key=", A104);
                throw AnonymousClass8BW.A0S(14);
            }
            AnonymousClass8BY.A10(r72, "FMessageImageCommon/buildE2eInteropMessage/unable to send encrypted media message due to missing mediaKey; message.key=", AnonymousClass000.A10());
            return;
        }
        throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
    }
}

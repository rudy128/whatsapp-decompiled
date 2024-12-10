package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.36w  reason: invalid class name and case insensitive filesystem */
public class C693536w implements AnonymousClass25C, AnonymousClass25D {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public byte[] A0B;
    public byte[] A0C;
    public final C49572Qz A0D;
    public transient boolean A0E;

    public static final C693536w A00(AnonymousClass190 r3, AnonymousClass21V r4) {
        C49572Qz r32;
        C18070vi.A0d(r3, 1);
        int i = r4.A0u;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 9) {
                        if (i != 13) {
                            if (i == 20) {
                                r32 = C49572Qz.STICKER;
                            } else if (!(i == 23 || i == 37 || i == 57 || i == 97)) {
                                if (i != 105) {
                                    if (i != 25) {
                                        if (i != 26) {
                                            if (i != 28) {
                                                if (i != 29) {
                                                    if (i != 62) {
                                                        if (i != 63) {
                                                            if (i != 81) {
                                                                if (i != 82) {
                                                                    switch (i) {
                                                                        case 42:
                                                                            break;
                                                                        case 43:
                                                                            break;
                                                                        case 44:
                                                                            r32 = C49572Qz.ORDER;
                                                                            break;
                                                                        default:
                                                                            C17900vP.A0k("Unknown mmsType for messageType: ", AnonymousClass000.A10(), i);
                                                                            r3.A0G("invalid-MmsMetadataType-for-Message", AnonymousClass001.A1I("MessageType: ", AnonymousClass000.A10(), i), false);
                                                                            r32 = null;
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    r32 = C49572Qz.STICKER_PACK;
                                }
                            }
                            return new C693536w(r32, r4.A0x);
                        }
                        r32 = C49572Qz.GIF;
                        return new C693536w(r32, r4.A0x);
                    }
                    r32 = C49572Qz.DOCUMENT;
                    return new C693536w(r32, r4.A0x);
                }
                r32 = C49572Qz.VIDEO;
                return new C693536w(r32, r4.A0x);
            }
            r32 = C49572Qz.AUDIO;
            return new C693536w(r32, r4.A0x);
        }
        r32 = C49572Qz.IMAGE;
        return new C693536w(r32, r4.A0x);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C693536w)) {
            return false;
        }
        C693536w r7 = (C693536w) obj;
        return C42171xk.A00(r7.A05, this.A05) && C42171xk.A00(r7.A0B, this.A0B) && C42171xk.A00(r7.A06, this.A06) && C42171xk.A00(r7.A09, this.A09) && C42171xk.A00(r7.A0C, this.A0C) && C42171xk.A00(r7.A08, this.A08) && C42171xk.A00(r7.A07, this.A07) && r7.A02 == this.A02 && r7.A01 == this.A01 && r7.A00 == this.A00 && r7.A0D == this.A0D;
    }

    public final C693536w A01() {
        C693536w r2 = new C693536w(this.A0D, this.A04);
        r2.A05 = this.A05;
        r2.A0B = this.A0B;
        r2.A02 = this.A02;
        r2.A06 = this.A06;
        r2.A09 = this.A09;
        r2.A0A = false;
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A0C = this.A0C;
        r2.A03 = this.A03;
        r2.A08 = this.A08;
        r2.A07 = this.A07;
        return r2;
    }

    public final boolean A02() {
        if (this.A0B == null || this.A05 == null || this.A09 == null || this.A06 == null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[12];
        objArr[0] = this.A05;
        objArr[1] = this.A0B;
        objArr[2] = this.A06;
        objArr[3] = this.A09;
        objArr[4] = this.A0C;
        C17890vO.A1Q(objArr, this.A02);
        C17890vO.A1H(objArr, this.A01);
        C17890vO.A1I(objArr, this.A00);
        objArr[8] = this.A08;
        objArr[9] = this.A07;
        objArr[10] = this.A0D;
        return AnonymousClass000.A0P(Long.valueOf(this.A04), objArr, 11);
    }

    public String toString() {
        Integer num;
        Locale locale = Locale.US;
        Object[] objArr = new Object[14];
        int i = 0;
        int i2 = 0;
        objArr[0] = this.A05;
        byte[] bArr = this.A0B;
        if (bArr != null) {
            num = Integer.valueOf(bArr.length);
        } else {
            num = 0;
        }
        objArr[1] = num;
        C17890vO.A1N(objArr, this.A02);
        objArr[3] = this.A06;
        objArr[4] = this.A09;
        objArr[5] = Integer.valueOf(this.A01);
        C17890vO.A1H(objArr, this.A00);
        objArr[7] = Boolean.valueOf(this.A0A);
        byte[] bArr2 = this.A0C;
        if (bArr2 != null) {
            i2 = Integer.valueOf(bArr2.length);
        }
        objArr[8] = i2;
        objArr[9] = Boolean.valueOf(this.A0E);
        objArr[10] = this.A08;
        objArr[11] = this.A07;
        C49572Qz r0 = this.A0D;
        if (r0 != null) {
            i = r0.value;
        }
        objArr[12] = Integer.valueOf(i);
        objArr[13] = Long.valueOf(this.A04);
        String format = String.format(locale, "MmsThumbnailMetadata{directPath=%s, mediaKey.length=%d, mediaKeyTimestampMs=%d, encThumbHash=%s, thumbHash=%s, thumbWidth=%d, thumbHeight=%d, transferred=%b, microThumbnail.length=%d, shouldSendOriginalThumbnail=%b, localFileName=%s, handle=%s, type=%d, rowId=%d}", Arrays.copyOf(objArr, 14));
        C18070vi.A0X(format);
        return format;
    }

    public C693536w(C49572Qz r1, long j) {
        this.A04 = j;
        this.A0D = r1;
    }

    public void BF3(AnonymousClass206 r2, AnonymousClass206 r3) {
        C60502o8.A01(r3, C60502o8.A00(r2));
    }
}

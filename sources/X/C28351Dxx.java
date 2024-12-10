package X;

import java.util.Arrays;

/* renamed from: X.Dxx  reason: case insensitive filesystem */
public class C28351Dxx extends AnonymousClass1Bz implements E74 {
    public final byte[] A00;

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 12, z);
    }

    public boolean A0H() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public String toString() {
        return BZl();
    }

    public int A0D() {
        return BE9.A0K(this.A00);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28351Dxx)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28351Dxx) r3).A00);
    }

    public String BZl() {
        byte[] bArr = this.A00;
        String str = AnonymousClass1Bo.A00;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i < length) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    if (i2 >= length) {
                        break;
                    }
                    cArr[i2] = (char) b;
                    i = i3;
                    i2++;
                } else {
                    short s = C24713CHa.A01[b & Byte.MAX_VALUE];
                    int i4 = s >>> 8;
                    byte b2 = (byte) s;
                    while (true) {
                        if (b2 >= 0) {
                            if (i3 >= length) {
                                break loop0;
                            }
                            byte b3 = bArr[i3];
                            i4 = (i4 << 6) | (b3 & 63);
                            b2 = C24713CHa.A00[b2 + ((b3 & 255) >>> 4)];
                            i3++;
                        } else if (b2 == -2) {
                            break;
                        } else {
                            if (i4 > 65535) {
                                if (i2 >= length - 1) {
                                    break;
                                }
                                int i5 = i2 + 1;
                                cArr[i2] = (char) ((i4 >>> 10) + 55232);
                                i2 = i5 + 1;
                                cArr[i5] = (char) ((i4 & 1023) | 56320);
                            } else if (i2 >= length) {
                                break;
                            } else {
                                cArr[i2] = (char) i4;
                                i2++;
                            }
                            i = i3;
                        }
                    }
                }
            } else if (i2 >= 0) {
                return new String(cArr, 0, i2);
            }
        }
        throw AnonymousClass000.A0k("Invalid UTF-8 input");
    }

    public C28351Dxx(String str) {
        String str2 = AnonymousClass1Bo.A00;
        this.A00 = AnonymousClass1Bo.A04(str.toCharArray());
    }

    public C28351Dxx(byte[] bArr) {
        this.A00 = bArr;
    }
}

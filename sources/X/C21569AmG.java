package X;

import java.io.OutputStream;

/* renamed from: X.AmG  reason: case insensitive filesystem */
public class C21569AmG implements C22529BBm {
    public final byte[] A00;
    public final byte[] A01;

    private int A00(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 10 && charAt != 13 && charAt != 9 && charAt != ' ') {
                break;
            }
            i++;
        }
        return i;
    }

    public void BI5(OutputStream outputStream, String str) {
        byte[] bArr = new byte[54];
        String str2 = str;
        int length = str2.length();
        while (length > 0) {
            char charAt = str2.charAt(length - 1);
            if (charAt != 10 && charAt != 13 && charAt != 9 && charAt != ' ') {
                break;
            }
            length--;
        }
        if (length != 0) {
            int i = length;
            int i2 = 0;
            while (i > 0 && i2 != 4) {
                char charAt2 = str2.charAt(i - 1);
                if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == 9 || charAt2 == ' ')) {
                    i2++;
                }
                i--;
            }
            int A002 = A00(str2, 0, i);
            int i3 = 0;
            while (true) {
                OutputStream outputStream2 = outputStream;
                if (A002 < i) {
                    byte[] bArr2 = this.A00;
                    byte b = bArr2[str2.charAt(A002)];
                    int A003 = A00(str2, A002 + 1, i);
                    byte b2 = bArr2[str2.charAt(A003)];
                    int A004 = A00(str2, A003 + 1, i);
                    byte b3 = bArr2[str2.charAt(A004)];
                    int A005 = A00(str2, A004 + 1, i);
                    int i4 = A005 + 1;
                    byte b4 = bArr2[str2.charAt(A005)];
                    if ((b | b2 | b3 | b4) >= 0) {
                        int i5 = i3 + 1;
                        bArr[i3] = (byte) ((b << 2) | (b2 >> 4));
                        int i6 = i5 + 1;
                        bArr[i5] = (byte) ((b2 << 4) | (b3 >> 2));
                        i3 = i6 + 1;
                        bArr[i6] = (byte) ((b3 << 6) | b4);
                        if (i3 == 54) {
                            outputStream2.write(bArr);
                            i3 = 0;
                        }
                        A002 = A00(str2, i4, i);
                    } else {
                        throw C17880vN.A0f("invalid characters encountered in base64 data");
                    }
                } else {
                    if (i3 > 0) {
                        outputStream2.write(bArr, 0, i3);
                    }
                    int A006 = A00(str2, A002, length);
                    int A007 = A00(str2, A006 + 1, length);
                    int A008 = A00(str2, A007 + 1, length);
                    int A009 = A00(str2, A008 + 1, length);
                    char charAt3 = str2.charAt(A006);
                    char charAt4 = str2.charAt(A007);
                    char charAt5 = str2.charAt(A008);
                    char charAt6 = str2.charAt(A009);
                    if (charAt5 != '=') {
                        byte[] bArr3 = this.A00;
                        if (charAt6 == '=') {
                            byte b5 = bArr3[charAt3];
                            byte b6 = bArr3[charAt4];
                            byte b7 = bArr3[charAt5];
                            if ((b5 | b6 | b7) >= 0) {
                                outputStream2.write((b5 << 2) | (b6 >> 4));
                                outputStream2.write((b6 << 4) | (b7 >> 2));
                                return;
                            }
                            throw C17880vN.A0f("invalid characters encountered at end of base64 data");
                        }
                        byte b8 = bArr3[charAt3];
                        byte b9 = bArr3[charAt4];
                        byte b10 = bArr3[charAt5];
                        byte b11 = bArr3[charAt6];
                        if ((b8 | b9 | b10 | b11) >= 0) {
                            outputStream2.write((b8 << 2) | (b9 >> 4));
                            outputStream2.write((b9 << 4) | (b10 >> 2));
                            outputStream2.write((b10 << 6) | b11);
                            return;
                        }
                        throw C17880vN.A0f("invalid characters encountered at end of base64 data");
                    } else if (charAt6 == '=') {
                        byte[] bArr4 = this.A00;
                        byte b12 = bArr4[charAt3];
                        byte b13 = bArr4[charAt4];
                        if ((b12 | b13) >= 0) {
                            outputStream2.write((b12 << 2) | (b13 >> 4));
                            return;
                        }
                        throw C17880vN.A0f("invalid characters encountered at end of base64 data");
                    } else {
                        throw C17880vN.A0f("invalid characters encountered at end of base64 data");
                    }
                }
            }
        }
    }

    public void BK1(OutputStream outputStream, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte b;
        int i5 = i2;
        int i6 = 0;
        byte[] bArr2 = new byte[72];
        while (i5 > 0) {
            int min = Math.min(54, i5);
            int i7 = (i6 + min) - 2;
            int i8 = i6;
            int i9 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                int i10 = i8 + 1;
                byte b2 = bArr[i8];
                int i11 = i10 + 1;
                byte b3 = bArr[i10] & 255;
                i8 = i11 + 1;
                byte b4 = bArr[i11] & 255;
                int i12 = i3 + 1;
                byte[] bArr3 = this.A01;
                AnonymousClass8BR.A1J(bArr3, bArr2, b2 >>> 2, i3);
                int i13 = i12 + 1;
                AnonymousClass8BR.A1J(bArr3, bArr2, (b2 << 4) | (b3 >>> 4), i12);
                int i14 = i13 + 1;
                AnonymousClass8BR.A1J(bArr3, bArr2, (b3 << 2) | (b4 >>> 6), i13);
                i9 = i14 + 1;
                AnonymousClass8BR.A1J(bArr3, bArr2, b4, i14);
            }
            int i15 = min - (i8 - i6);
            if (i15 == 1) {
                byte b5 = bArr[i8] & 255;
                int i16 = i3 + 1;
                byte[] bArr4 = this.A01;
                AnonymousClass8BR.A1J(bArr4, bArr2, b5 >>> 2, i3);
                int i17 = i16 + 1;
                AnonymousClass8BR.A1J(bArr4, bArr2, b5 << 4, i16);
                i4 = i17 + 1;
                b = 61;
                bArr2[i17] = 61;
                i3 = i4 + 1;
            } else if (i15 == 2) {
                byte b6 = bArr[i8] & 255;
                byte b7 = bArr[i8 + 1] & 255;
                int i18 = i3 + 1;
                byte[] bArr5 = this.A01;
                AnonymousClass8BR.A1J(bArr5, bArr2, b6 >>> 2, i3);
                int i19 = i18 + 1;
                AnonymousClass8BR.A1J(bArr5, bArr2, (b6 << 4) | (b7 >>> 4), i18);
                i4 = i19 + 1;
                AnonymousClass8BR.A1J(bArr5, bArr2, b7 << 2, i19);
                i3 = i4 + 1;
                b = 61;
            } else {
                outputStream.write(bArr2, 0, i3);
                i6 += min;
                i5 -= min;
            }
            bArr2[i4] = b;
            outputStream.write(bArr2, 0, i3);
            i6 += min;
            i5 -= min;
        }
    }

    public C21569AmG() {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        this.A01 = bArr;
        byte[] bArr2 = new byte[128];
        this.A00 = bArr2;
        int i = 0;
        int i2 = 0;
        do {
            bArr2[i2] = -1;
            i2++;
        } while (i2 < 128);
        do {
            bArr2[bArr[i]] = (byte) i;
            i++;
        } while (i < 64);
    }
}

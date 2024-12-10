package X;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.1u8  reason: invalid class name and case insensitive filesystem */
public class C40081u8 implements Comparable, Serializable {
    public static final C40081u8 A02 = C40091u9.A00;
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    public C40081u8(byte[] bArr) {
        C18070vi.A0c(bArr, 1);
        this.data = bArr;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public byte A00(int i) {
        byte[] bArr;
        int i2;
        if (this instanceof AnonymousClass3JZ) {
            AnonymousClass3JZ r0 = (AnonymousClass3JZ) this;
            int[] iArr = r0.A00;
            byte[][] bArr2 = r0.A01;
            int length = bArr2.length;
            C39921tr.A00((long) iArr[length - 1], (long) i, 1);
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int i3 = iArr[length + binarySearch];
            bArr = bArr2[binarySearch];
            i = (i - i2) + i3;
        } else {
            C40081u8 r02 = C40091u9.A00;
            bArr = this.data;
        }
        return bArr[i];
    }

    public int A01() {
        if (this instanceof AnonymousClass3JZ) {
            AnonymousClass3JZ r0 = (AnonymousClass3JZ) this;
            return r0.A00[r0.A01.length - 1];
        }
        C40081u8 r02 = C40091u9.A00;
        return this.data.length;
    }

    public String A02() {
        if (this instanceof AnonymousClass3JZ) {
            return new C40081u8(((AnonymousClass3JZ) this).A05()).A02();
        }
        C40081u8 r0 = C40091u9.A00;
        char[] cArr = new char[(r7 * 2)];
        int i = 0;
        for (byte b : this.data) {
            int i2 = i + 1;
            char[] cArr2 = C40091u9.A01;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean A03(C40081u8 r11, int i) {
        int i2;
        if (this instanceof AnonymousClass3JZ) {
            AnonymousClass3JZ r2 = (AnonymousClass3JZ) this;
            int i3 = 0;
            int i4 = 0;
            if (0 > r2.A01() - i) {
                return false;
            }
            int[] iArr = r2.A00;
            byte[][] bArr = r2.A01;
            int length = bArr.length;
            int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            while (i3 < i) {
                if (binarySearch == 0) {
                    i2 = 0;
                } else {
                    i2 = iArr[binarySearch - 1];
                }
                int i5 = iArr[length + binarySearch];
                int min = Math.min(i, (iArr[binarySearch] - i2) + i2) - i3;
                if (!r11.A04(bArr[binarySearch], i4, i5 + (i3 - i2), min)) {
                    return false;
                }
                i4 += min;
                i3 += min;
                binarySearch++;
            }
            return true;
        }
        C40081u8 r0 = C40091u9.A00;
        return r11.A04(this.data, 0, 0, i);
    }

    public boolean A04(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (this instanceof AnonymousClass3JZ) {
            AnonymousClass3JZ r1 = (AnonymousClass3JZ) this;
            C18070vi.A0c(bArr, 1);
            if (i >= 0 && i <= r1.A01() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                int i5 = i3 + i;
                int[] iArr = r1.A00;
                byte[][] bArr2 = r1.A01;
                int length = bArr2.length;
                int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
                if (binarySearch < 0) {
                    binarySearch ^= -1;
                }
                while (i < i5) {
                    if (binarySearch == 0) {
                        i4 = 0;
                    } else {
                        i4 = iArr[binarySearch - 1];
                    }
                    int i6 = iArr[length + binarySearch];
                    int min = Math.min(i5, (iArr[binarySearch] - i4) + i4) - i;
                    int i7 = i6 + (i - i4);
                    byte[] bArr3 = bArr2[binarySearch];
                    C18070vi.A0c(bArr3, 0);
                    int i8 = 0;
                    while (i8 < min) {
                        if (bArr3[i8 + i7] == bArr[i8 + i2]) {
                            i8++;
                        }
                    }
                    i2 += min;
                    i += min;
                    binarySearch++;
                }
                return true;
            }
        } else {
            C18070vi.A0c(bArr, 1);
            C40081u8 r0 = C40091u9.A00;
            if (i >= 0) {
                byte[] bArr4 = this.data;
                if (i <= bArr4.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                    int i9 = 0;
                    while (i9 < i3) {
                        if (bArr4[i9 + i] == bArr[i9 + i2]) {
                            i9++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C40081u8 r8 = (C40081u8) obj;
        C18070vi.A0c(r8, 0);
        C40081u8 r0 = C40091u9.A00;
        int A012 = A01();
        int A013 = r8.A01();
        int min = Math.min(A012, A013);
        int i = 0;
        while (i < min) {
            byte A002 = A00(i) & 255;
            byte A003 = r8.A00(i) & 255;
            if (A002 == A003) {
                i++;
            } else if (A002 < A003) {
                return -1;
            } else {
                return 1;
            }
        }
        if (A012 == A013) {
            return 0;
        }
        if (A012 < A013) {
            return -1;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r6 = (X.C40081u8) r6;
        r2 = r6.A01();
        r1 = r5.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            X.1u8 r0 = X.C40091u9.A00
            r4 = 0
            r3 = 1
            if (r6 == r5) goto L_0x001b
            boolean r0 = r6 instanceof X.C40081u8
            if (r0 == 0) goto L_0x001c
            X.1u8 r6 = (X.C40081u8) r6
            int r2 = r6.A01()
            byte[] r1 = r5.data
            int r0 = r1.length
            if (r2 != r0) goto L_0x001c
            boolean r0 = r6.A04(r1, r4, r4, r0)
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40081u8.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C40081u8 r0 = C40091u9.A00;
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.A00 = hashCode;
        return hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r13 < 65536) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bb, code lost:
        if (r10 == 64) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c5, code lost:
        if (r2 != -1) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c9, code lost:
        if (r5 > 64) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cb, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("[hex=");
        r3.append(A02());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00da, code lost:
        r3.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e1, code lost:
        return r3.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e2, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("[size=");
        r3.append(r5);
        r3.append(" hex=");
        r1 = new byte[64];
        java.lang.System.arraycopy(r6, 0, r1, 0, 64);
        r3.append(new X.C40081u8(r1).A02());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0102, code lost:
        r4 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0104, code lost:
        if (r4 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0108, code lost:
        if ((r7 instanceof X.AnonymousClass3JZ) == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010a, code lost:
        r6 = ((X.AnonymousClass3JZ) r7).A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0111, code lost:
        r4 = new java.lang.String(r6, X.C26571Sq.A05);
        r7.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011a, code lost:
        r3 = r4.substring(0, r2);
        X.C18070vi.A0T(r3);
        r1 = X.AnonymousClass1YE.A07(X.AnonymousClass1YE.A07(X.AnonymousClass1YE.A07(r3, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013f, code lost:
        if (r2 >= r4.length()) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0141, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("[size=");
        r3.append(r7.data.length);
        r3.append(" text=");
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0155, code lost:
        r3.append("…]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0159, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("[text=");
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017a, code lost:
        r2 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            X.1u8 r0 = X.C40091u9.A00
            r8 = 0
            r7 = r17
            byte[] r6 = r7.data
            int r5 = r6.length
            if (r5 != 0) goto L_0x000d
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x000d:
            r4 = 64
            r3 = 0
            r2 = 0
            r10 = 0
        L_0x0012:
            byte r13 = r6[r3]
            r12 = 127(0x7f, float:1.78E-43)
            r15 = 159(0x9f, float:2.23E-43)
            r11 = 31
            r9 = 13
            r14 = 65533(0xfffd, float:9.1831E-41)
            r1 = 10
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r13 < 0) goto L_0x005c
            int r16 = r10 + 1
            if (r10 == r4) goto L_0x00bd
            if (r13 == r1) goto L_0x0038
            if (r13 == r9) goto L_0x0038
            if (r11 >= r13) goto L_0x017a
            if (r12 > r13) goto L_0x0038
            if (r15 >= r13) goto L_0x017a
            if (r13 == r14) goto L_0x017a
            r10 = 2
            if (r13 >= r0) goto L_0x0039
        L_0x0038:
            r10 = 1
        L_0x0039:
            int r2 = r2 + r10
            int r3 = r3 + 1
        L_0x003c:
            r10 = r16
            if (r3 >= r5) goto L_0x0088
            byte r13 = r6[r3]
            if (r13 < 0) goto L_0x0088
            int r3 = r3 + 1
            int r16 = r16 + 1
            if (r10 == r4) goto L_0x00bd
            if (r13 == r1) goto L_0x0059
            if (r13 == r9) goto L_0x0059
            if (r11 >= r13) goto L_0x017a
            if (r12 > r13) goto L_0x0059
            if (r15 >= r13) goto L_0x017a
            if (r13 == r14) goto L_0x017a
            r10 = 2
            if (r13 >= r0) goto L_0x005a
        L_0x0059:
            r10 = 1
        L_0x005a:
            int r2 = r2 + r10
            goto L_0x003c
        L_0x005c:
            int r0 = r13 >> 5
            r12 = -2
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != r12) goto L_0x008b
            int r0 = r3 + 1
            if (r5 <= r0) goto L_0x00bb
            int r0 = r3 + 1
            byte r9 = r6[r0]
            r0 = r9 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L_0x00bb
            r0 = r9 ^ 3968(0xf80, float:5.56E-42)
            int r11 = r13 << 6
            r11 = r11 ^ r0
            if (r11 < r1) goto L_0x00bb
            int r9 = r10 + 1
            if (r10 == r4) goto L_0x00bd
            if (r15 >= r11) goto L_0x017a
            if (r11 == r14) goto L_0x017a
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r11 >= r1) goto L_0x0084
            r0 = 1
        L_0x0084:
            int r2 = r2 + r0
            int r3 = r3 + 2
        L_0x0087:
            r10 = r9
        L_0x0088:
            if (r3 >= r5) goto L_0x00bd
            goto L_0x0012
        L_0x008b:
            int r0 = r13 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r0 != r12) goto L_0x017d
            int r0 = r3 + 2
            if (r5 <= r0) goto L_0x00bb
            int r0 = r3 + 1
            byte r14 = r6[r0]
            r0 = r14 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L_0x00bb
            int r0 = r3 + 2
            byte r12 = r6[r0]
            r0 = r12 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L_0x00bb
            r1 = -123008(0xfffffffffffe1f80, float:NaN)
            r1 = r1 ^ r12
            int r0 = r14 << 6
            r1 = r1 ^ r0
            int r12 = r13 << 12
            r12 = r12 ^ r1
            r0 = 2048(0x800, float:2.87E-42)
            if (r12 < r0) goto L_0x00bb
            if (r11 > r12) goto L_0x0166
            if (r9 < r12) goto L_0x0166
        L_0x00bb:
            if (r10 != r4) goto L_0x017a
        L_0x00bd:
            r0 = -1
            r10 = 93
            java.lang.String r9 = "…]"
            java.lang.String r11 = "[size="
            if (r2 != r0) goto L_0x0102
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r5 > r4) goto L_0x00e2
            r3.<init>()
            java.lang.String r0 = "[hex="
            r3.append(r0)
            java.lang.String r0 = r7.A02()
            r3.append(r0)
        L_0x00da:
            r3.append(r10)
        L_0x00dd:
            java.lang.String r0 = r3.toString()
            return r0
        L_0x00e2:
            r3.<init>()
            r3.append(r11)
            r3.append(r5)
            java.lang.String r0 = " hex="
            r3.append(r0)
            byte[] r1 = new byte[r4]
            java.lang.System.arraycopy(r6, r8, r1, r8, r4)
            X.1u8 r0 = new X.1u8
            r0.<init>(r1)
            java.lang.String r0 = r0.A02()
            r3.append(r0)
            goto L_0x0155
        L_0x0102:
            java.lang.String r4 = r7.A01
            if (r4 != 0) goto L_0x011a
            boolean r0 = r7 instanceof X.AnonymousClass3JZ
            if (r0 == 0) goto L_0x0111
            r0 = r7
            X.3JZ r0 = (X.AnonymousClass3JZ) r0
            byte[] r6 = r0.A05()
        L_0x0111:
            java.nio.charset.Charset r0 = X.C26571Sq.A05
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6, r0)
            r7.A01 = r4
        L_0x011a:
            java.lang.String r3 = r4.substring(r8, r2)
            X.C18070vi.A0T(r3)
            java.lang.String r1 = "\\"
            java.lang.String r0 = "\\\\"
            java.lang.String r3 = X.AnonymousClass1YE.A07(r3, r1, r0, r8)
            java.lang.String r1 = "\n"
            java.lang.String r0 = "\\n"
            java.lang.String r3 = X.AnonymousClass1YE.A07(r3, r1, r0, r8)
            java.lang.String r1 = "\r"
            java.lang.String r0 = "\\r"
            java.lang.String r1 = X.AnonymousClass1YE.A07(r3, r1, r0, r8)
            int r0 = r4.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r2 >= r0) goto L_0x0159
            r3.<init>()
            r3.append(r11)
            byte[] r0 = r7.data
            int r0 = r0.length
            r3.append(r0)
            java.lang.String r0 = " text="
            r3.append(r0)
            r3.append(r1)
        L_0x0155:
            r3.append(r9)
            goto L_0x00dd
        L_0x0159:
            r3.<init>()
            java.lang.String r0 = "[text="
            r3.append(r0)
            r3.append(r1)
            goto L_0x00da
        L_0x0166:
            int r9 = r10 + 1
            if (r10 == r4) goto L_0x00bd
            r0 = 65533(0xfffd, float:9.1831E-41)
            if (r12 == r0) goto L_0x017a
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r12 >= r1) goto L_0x0175
            r0 = 1
        L_0x0175:
            int r2 = r2 + r0
            int r3 = r3 + 3
            goto L_0x0087
        L_0x017a:
            r2 = -1
            goto L_0x00bd
        L_0x017d:
            int r0 = r13 >> 3
            if (r0 != r12) goto L_0x00bb
            int r0 = r3 + 3
            if (r5 <= r0) goto L_0x00bb
            int r0 = r3 + 1
            byte r14 = r6[r0]
            r0 = r14 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L_0x00bb
            int r0 = r3 + 2
            byte r15 = r6[r0]
            r0 = r15 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L_0x00bb
            int r0 = r3 + 3
            byte r12 = r6[r0]
            r0 = r12 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L_0x00bb
            r1 = 3678080(0x381f80, float:5.154088E-39)
            r1 = r1 ^ r12
            int r0 = r15 << 6
            r1 = r1 ^ r0
            int r0 = r14 << 12
            r0 = r0 ^ r1
            int r1 = r13 << 18
            r1 = r1 ^ r0
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 > r0) goto L_0x00bb
            if (r11 > r1) goto L_0x00bb
            if (r9 >= r1) goto L_0x00bb
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 < r0) goto L_0x00bb
            int r9 = r10 + 1
            if (r10 == r4) goto L_0x00bd
            int r2 = r2 + 2
            int r3 = r3 + 4
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40081u8.toString():java.lang.String");
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            C40081u8 r2 = new C40081u8(bArr);
            Field declaredField = C40081u8.class.getDeclaredField("data");
            C18070vi.A0T(declaredField);
            declaredField.setAccessible(true);
            declaredField.set(this, r2.data);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(readInt);
        throw new IllegalArgumentException(sb.toString());
    }
}

package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: X.CtG  reason: case insensitive filesystem */
public class C26150CtG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C35 A06;
    public ByteBuffer A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public int[] A0B;
    public final CER A0C;

    public void A06(int i, int i2) {
        if (i2 != 0) {
            A07(4, 0);
            int capacity = this.A07.capacity();
            int i3 = this.A03;
            int i4 = ((capacity - i3) - i2) + 4;
            ByteBuffer byteBuffer = this.A07;
            int i5 = i3 - 4;
            this.A03 = i5;
            byteBuffer.putInt(i5, i4);
            this.A0A[i] = A00(this);
        }
    }

    public static int A00(C26150CtG ctG) {
        return ctG.A07.capacity() - ctG.A03;
    }

    public int A01() {
        if (this.A0A == null || !this.A09) {
            throw AnonymousClass8BR.A0v("FlatBuffers: endTable called without startTable");
        }
        A07(4, 0);
        ByteBuffer byteBuffer = this.A07;
        int i = this.A03 - 4;
        this.A03 = i;
        byteBuffer.putInt(i, 0);
        int A002 = A00(this);
        int i2 = this.A05;
        do {
            i2--;
            if (i2 < 0 || this.A0A[i2] != 0) {
                int i3 = i2 + 1;
            }
            i2--;
            break;
        } while (this.A0A[i2] != 0);
        int i32 = i2 + 1;
        while (i2 >= 0) {
            int i4 = this.A0A[i2];
            int i5 = A002 - i4;
            if (i4 == 0) {
                i5 = 0;
            }
            short s = (short) i5;
            A07(2, 0);
            ByteBuffer byteBuffer2 = this.A07;
            int i6 = this.A03 - 2;
            this.A03 = i6;
            byteBuffer2.putShort(i6, s);
            i2--;
        }
        short s2 = (short) (A002 - this.A02);
        A07(2, 0);
        ByteBuffer byteBuffer3 = this.A07;
        int i7 = this.A03 - 2;
        this.A03 = i7;
        byteBuffer3.putShort(i7, s2);
        A07(2, 0);
        ByteBuffer byteBuffer4 = this.A07;
        int i8 = this.A03 - 2;
        this.A03 = i8;
        byteBuffer4.putShort(i8, (short) ((i32 + 2) * 2));
        int i9 = 0;
        while (true) {
            if (i9 >= this.A01) {
                break;
            }
            int capacity = this.A07.capacity() - this.A0B[i9];
            int i10 = this.A03;
            short s3 = this.A07.getShort(capacity);
            if (s3 == this.A07.getShort(i10)) {
                int i11 = 2;
                while (i11 < s3) {
                    if (this.A07.getShort(capacity + i11) == this.A07.getShort(i10 + i11)) {
                        i11 += 2;
                    }
                }
                int i12 = this.A0B[i9];
                if (i12 != 0) {
                    int capacity2 = this.A07.capacity() - A002;
                    this.A03 = capacity2;
                    this.A07.putInt(capacity2, i12 - A002);
                }
            }
            i9++;
        }
        int i13 = this.A01;
        int[] iArr = this.A0B;
        if (i13 == iArr.length) {
            iArr = Arrays.copyOf(iArr, i13 * 2);
            this.A0B = iArr;
        }
        int i14 = this.A01;
        this.A01 = i14 + 1;
        iArr[i14] = A00(this);
        ByteBuffer byteBuffer5 = this.A07;
        byteBuffer5.putInt(byteBuffer5.capacity() - A002, A00(this) - A002);
        this.A09 = false;
        return A002;
    }

    public void A03() {
        if (!this.A08) {
            throw AnonymousClass8BR.A0v("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public void A04(int i) {
        A07(this.A00, 4);
        A07(4, 0);
        int capacity = this.A07.capacity();
        int i2 = this.A03;
        int i3 = ((capacity - i2) - i) + 4;
        ByteBuffer byteBuffer = this.A07;
        int i4 = i2 - 4;
        this.A03 = i4;
        byteBuffer.putInt(i4, i3);
        this.A07.position(this.A03);
        this.A08 = true;
    }

    public void A05(int i) {
        if (!this.A09) {
            int[] iArr = this.A0A;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
                this.A0A = iArr;
            }
            this.A05 = i;
            Arrays.fill(iArr, 0, i, 0);
            this.A09 = true;
            this.A02 = A00(this);
            return;
        }
        throw AnonymousClass8BR.A0v("FlatBuffers: object serialization must not be nested.");
    }

    public void A07(int i, int i2) {
        ByteBuffer order;
        if (i > this.A00) {
            this.A00 = i;
        }
        int capacity = this.A07.capacity();
        int i3 = this.A03;
        int i4 = ((((capacity - i3) + i2) ^ -1) + 1) & (i - 1);
        while (i3 < i4 + i + i2) {
            int capacity2 = this.A07.capacity();
            ByteBuffer byteBuffer = this.A07;
            C35 c35 = this.A06;
            int capacity3 = byteBuffer.capacity();
            int i5 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (capacity3 != 0) {
                i5 = 2147483639;
                if (capacity3 == 2147483639) {
                    throw AnonymousClass8BR.A0v("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                } else if ((-1073741824 & capacity3) == 0) {
                    i5 = capacity3 << 1;
                }
            }
            byteBuffer.position(0);
            if (c35 instanceof C22799BPm) {
                order = ByteBuffer.allocateDirect(i5).order(ByteOrder.LITTLE_ENDIAN);
                C18070vi.A0X(order);
            } else {
                order = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
            }
            order.position(order.clear().capacity() - capacity3);
            order.put(byteBuffer);
            this.A07 = order;
            i3 = this.A03 + (order.capacity() - capacity2);
            this.A03 = i3;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ByteBuffer byteBuffer2 = this.A07;
            int i7 = this.A03 - 1;
            this.A03 = i7;
            byteBuffer2.put(i7, (byte) 0);
        }
    }

    public C26150CtG(C35 c35, CER cer, int i) {
        ByteBuffer order;
        this.A00 = 1;
        this.A0A = null;
        this.A05 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A0B = new int[16];
        this.A01 = 0;
        this.A04 = 0;
        this.A06 = c35;
        if (c35 instanceof C22799BPm) {
            order = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
            C18070vi.A0X(order);
        } else {
            order = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
        this.A07 = order;
        this.A0C = cer;
        this.A03 = order.capacity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019a, code lost:
        if (r2 < 2048) goto L_0x019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(java.lang.CharSequence r14) {
        /*
            r13 = this;
            int r6 = r14.length()
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x0012
            char r1 = r14.charAt(r5)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x0012
            int r5 = r5 + 1
            goto L_0x0005
        L_0x0012:
            r2 = r6
        L_0x0013:
            if (r5 >= r6) goto L_0x0058
            char r0 = r14.charAt(r5)
            r7 = 2048(0x800, float:2.87E-42)
            if (r0 >= r7) goto L_0x0025
            int r0 = 127 - r0
            int r0 = r0 >>> 31
            int r2 = r2 + r0
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0025:
            int r4 = r14.length()
            r3 = 0
        L_0x002a:
            if (r5 >= r4) goto L_0x0057
            char r1 = r14.charAt(r5)
            if (r1 >= r7) goto L_0x003a
            int r0 = 127 - r1
            int r0 = r0 >>> 31
            int r3 = r3 + r0
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x003a:
            int r3 = r3 + 2
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 > r1) goto L_0x0037
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r1 > r0) goto L_0x0037
            int r1 = java.lang.Character.codePointAt(r14, r5)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 < r0) goto L_0x0051
            int r5 = r5 + 1
            goto L_0x0037
        L_0x0051:
            X.C2c r1 = new X.C2c
            r1.<init>(r5, r4)
            throw r1
        L_0x0057:
            int r2 = r2 + r3
        L_0x0058:
            if (r2 < r6) goto L_0x026d
            r9 = 0
            r0 = 1
            r13.A07(r0, r9)
            java.nio.ByteBuffer r1 = r13.A07
            int r0 = r13.A03
            int r0 = r0 + -1
            r13.A03 = r0
            r1.put(r0, r9)
            r1 = 1
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x0266
            r13.A04 = r2
            r0 = 4
            r13.A07(r0, r2)
            r13.A07(r1, r2)
            r13.A09 = r1
            java.nio.ByteBuffer r1 = r13.A07
            int r0 = r13.A03
            int r0 = r0 - r2
            r13.A03 = r0
            r1.position(r0)
            java.nio.ByteBuffer r8 = r13.A07
            boolean r0 = r8.hasArray()
            if (r0 == 0) goto L_0x00b8
            int r12 = r8.arrayOffset()
            byte[] r7 = r8.array()
            int r3 = r8.position()
            int r3 = r3 + r12
            int r6 = r8.remaining()
            int r5 = r14.length()
            int r6 = r6 + r3
            r4 = 0
        L_0x00a3:
            r1 = 128(0x80, float:1.794E-43)
            if (r4 >= r5) goto L_0x0165
            int r0 = r4 + r3
            if (r0 >= r6) goto L_0x0165
            char r2 = r14.charAt(r4)
            if (r2 >= r1) goto L_0x0165
            int r0 = r3 + r4
            int r4 = X.BE6.A0A(r2, r7, r0, r4)
            goto L_0x00a3
        L_0x00b8:
            int r5 = r14.length()
            int r4 = r8.position()
            r3 = 0
        L_0x00c1:
            r6 = 128(0x80, float:1.794E-43)
            if (r3 >= r5) goto L_0x00d4
            char r0 = r14.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            if (r0 >= r6) goto L_0x00d4
            int r1 = r4 + r3
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            r8.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            int r3 = r3 + 1
            goto L_0x00c1
        L_0x00d4:
            if (r3 != r5) goto L_0x00dd
            int r0 = r4 + r3
            r8.position(r0)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            goto L_0x016c
        L_0x00dd:
            int r4 = r4 + r3
        L_0x00de:
            if (r3 >= r5) goto L_0x0161
            char r0 = r14.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            if (r0 < r6) goto L_0x0150
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x00f2
            int r2 = r4 + 1
            int r1 = r0 >>> 6
            r1 = r1 | 192(0xc0, float:2.69E-43)
        L_0x00f0:
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            goto L_0x012d
        L_0x00f2:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r1) goto L_0x0138
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r1 < r0) goto L_0x0138
            int r1 = r3 + 1
            if (r1 == r5) goto L_0x015b
            int r3 = r3 + 1
            char r2 = r14.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            boolean r1 = java.lang.Character.isSurrogatePair(r0, r2)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            if (r1 == 0) goto L_0x015b
            int r0 = java.lang.Character.toCodePoint(r0, r2)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            int r2 = r4 + 1
            int r1 = r0 >>> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            r8.put(r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            int r4 = r2 + 1
            int r1 = r0 >>> 12
            r1 = r1 & 63
            r1 = r1 | r6
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            r8.put(r2, r1)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            int r2 = r4 + 1
            int r1 = r0 >>> 6
            r1 = r1 & 63
            r1 = r1 | r6
            goto L_0x00f0
        L_0x012d:
            r8.put(r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            r0 = r0 & 63
            r0 = r0 | r6
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            r8.put(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            goto L_0x0155
        L_0x0138:
            int r2 = r4 + 1
            int r1 = r0 >>> 12
            r1 = r1 | 224(0xe0, float:3.14E-43)
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            r8.put(r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            int r4 = r2 + 1
            int r1 = r0 >>> 6
            r1 = r1 & 63
            r1 = r1 | r6
            byte r1 = (byte) r1     // Catch:{ IndexOutOfBoundsException -> 0x023e }
            r8.put(r2, r1)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            r0 = r0 & 63
            r0 = r0 | r6
        L_0x0150:
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            r8.put(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            goto L_0x0156
        L_0x0155:
            r4 = r2
        L_0x0156:
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L_0x00de
        L_0x015b:
            X.C2c r0 = new X.C2c     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            r0.<init>(r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x023f }
        L_0x0161:
            r8.position(r4)     // Catch:{ IndexOutOfBoundsException -> 0x023f }
            goto L_0x016c
        L_0x0165:
            if (r4 != r5) goto L_0x0184
            int r3 = r3 + r5
        L_0x0168:
            int r3 = r3 - r12
            r8.position(r3)
        L_0x016c:
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x0204
            r13.A09 = r9
            int r2 = r13.A04
            java.nio.ByteBuffer r1 = r13.A07
            int r0 = r13.A03
            int r0 = r0 + -4
            r13.A03 = r0
            r1.putInt(r0, r2)
            int r0 = A00(r13)
            return r0
        L_0x0184:
            int r3 = r3 + r4
        L_0x0185:
            if (r4 >= r5) goto L_0x0168
            char r2 = r14.charAt(r4)
            if (r2 >= r1) goto L_0x0198
            if (r3 >= r6) goto L_0x019c
            int r10 = r3 + 1
        L_0x0191:
            byte r0 = (byte) r2
            r7[r3] = r0
            r3 = r10
        L_0x0195:
            int r4 = r4 + 1
            goto L_0x0185
        L_0x0198:
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L_0x01ae
        L_0x019c:
            int r0 = r6 + -2
            if (r3 > r0) goto L_0x01ae
            int r10 = r3 + 1
            int r0 = r2 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
        L_0x01a6:
            int r3 = X.BE6.A0A(r0, r7, r3, r10)
            X.BE7.A1U(r7, r2, r10)
            goto L_0x0195
        L_0x01ae:
            r11 = 57343(0xdfff, float:8.0355E-41)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r10) goto L_0x01b8
            if (r11 >= r2) goto L_0x01d1
        L_0x01b8:
            int r0 = r6 + -3
            if (r3 > r0) goto L_0x01d1
            int r10 = r3 + 1
            int r0 = r2 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            int r3 = X.BE6.A0A(r0, r7, r3, r10)
            int r0 = r2 >>> 6
            X.BE7.A1U(r7, r0, r10)
            int r10 = r3 + 1
            r2 = r2 & 63
            r2 = r2 | r1
            goto L_0x0191
        L_0x01d1:
            int r0 = r6 + -4
            if (r3 > r0) goto L_0x0213
            int r10 = r4 + 1
            int r0 = r14.length()
            if (r10 == r0) goto L_0x020b
            int r4 = r4 + 1
            char r10 = r14.charAt(r4)
            boolean r0 = java.lang.Character.isSurrogatePair(r2, r10)
            if (r0 == 0) goto L_0x020b
            int r2 = java.lang.Character.toCodePoint(r2, r10)
            int r10 = r3 + 1
            int r0 = r2 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            int r3 = X.BE6.A0A(r0, r7, r3, r10)
            int r0 = r2 >>> 12
            X.BE7.A1U(r7, r0, r10)
            int r10 = r3 + 1
            int r0 = r2 >>> 6
            r0 = r0 & 63
            r0 = r0 | r1
            goto L_0x01a6
        L_0x0204:
            java.lang.String r0 = "FlatBuffers: endVector called without startVector"
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x020b:
            int r0 = r4 + -1
            X.C2c r1 = new X.C2c
            r1.<init>(r0, r5)
            throw r1
        L_0x0213:
            if (r10 > r2) goto L_0x022b
            if (r2 > r11) goto L_0x022b
            int r1 = r4 + 1
            int r0 = r14.length()
            if (r1 == r0) goto L_0x0225
            boolean r0 = X.BE8.A1X(r14, r2, r1)
            if (r0 != 0) goto L_0x022b
        L_0x0225:
            X.C2c r1 = new X.C2c
            r1.<init>(r4, r5)
            throw r1
        L_0x022b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r1 = X.BEA.A0Z(r0, r1, r3)
            throw r1
        L_0x023e:
            r4 = r2
        L_0x023f:
            int r2 = r8.position()
            int r0 = r8.position()
            int r4 = r4 - r0
            int r0 = r4 + 1
            int r0 = java.lang.Math.max(r3, r0)
            int r2 = r2 + r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            char r0 = r14.charAt(r3)
            r1.append(r0)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r2)
            throw r0
        L_0x0266:
            java.lang.String r0 = "FlatBuffers: object serialization must not be nested."
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x026d:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UTF-8 length does not fit in int: "
            r4.append(r0)
            long r2 = (long) r2
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r0
            r4.append(r2)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0j(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26150CtG.A02(java.lang.CharSequence):int");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.CER, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26150CtG(X.C35 r2, int r3) {
        /*
            r1 = this;
            X.CER r0 = X.CER.A00
            if (r0 != 0) goto L_0x000b
            X.CER r0 = new X.CER
            r0.<init>()
            X.CER.A00 = r0
        L_0x000b:
            r1.<init>(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26150CtG.<init>(X.C35, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.CER, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26150CtG() {
        /*
            r3 = this;
            r2 = 1024(0x400, float:1.435E-42)
            X.BPl r1 = X.C22798BPl.A00
            X.CER r0 = X.CER.A00
            if (r0 != 0) goto L_0x000f
            X.CER r0 = new X.CER
            r0.<init>()
            X.CER.A00 = r0
        L_0x000f:
            r3.<init>(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26150CtG.<init>():void");
    }
}

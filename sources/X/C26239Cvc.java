package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.Cvc  reason: case insensitive filesystem */
public abstract class C26239Cvc {
    public int A00 = -1;
    public int A01;
    public final C24171Bwf A02 = new ByteArrayOutputStream();

    public static void A05(OutputStream outputStream, int i, long j) {
        outputStream.write((byte) ((int) (j >> i)));
    }

    public static int A00(C24171Bwf bwf, long j) {
        int i = 1;
        if (j != 0) {
            i = 2;
            if (j != 1) {
                bwf.write((byte) ((int) j));
                if (-128 <= j && j <= 127) {
                    return 3;
                }
                A05(bwf, 8, j);
                if (-32768 <= j && j <= 32767) {
                    return 4;
                }
                A05(bwf, 16, j);
                A05(bwf, 24, j);
                if (-2147483648L <= j && j <= 2147483647L) {
                    return 5;
                }
                A05(bwf, 32, j);
                A05(bwf, 40, j);
                A05(bwf, 48, j);
                A05(bwf, 56, j);
                return 6;
            }
        }
        return i;
    }

    public static int A01(C24171Bwf bwf, long j) {
        if (j < 0 || j > 4294967295L) {
            throw AnonymousClass000.A0k("Value is not an unsigned integer");
        }
        bwf.write((byte) ((int) j));
        if (j <= 255) {
            return 1;
        }
        A05(bwf, 8, j);
        if (j <= 65535) {
            return 2;
        }
        A05(bwf, 16, j);
        A05(bwf, 24, j);
        return 4;
    }

    public static long A02(ByteBuffer byteBuffer, int i) {
        long j = 0;
        int i2 = 0;
        do {
            j |= (((long) byteBuffer.get()) & 255) << (i2 * 8);
            i2++;
        } while (i2 < i);
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        return new X.CQX(r1, r10, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.CQX A03(java.nio.ByteBuffer r12) {
        /*
            java.lang.String r5 = ", tag: "
            java.lang.String r4 = " at "
            java.lang.String r8 = "%02X "
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BufferUnderflowException -> 0x00ec }
            r12.order(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            int r3 = r12.position()     // Catch:{ BufferUnderflowException -> 0x00ec }
            byte r7 = r12.get()     // Catch:{ BufferUnderflowException -> 0x00ec }
            r6 = 0
            r9 = 1
            r0 = 3
            r10 = r7 & 3
            if (r10 > r0) goto L_0x00ab
            r0 = r7 & 8
            if (r0 != 0) goto L_0x0023
            long r0 = A02(r12, r9)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x0028
        L_0x0023:
            r0 = 2
            long r0 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
        L_0x0028:
            int r2 = (int) r0     // Catch:{ BufferUnderflowException -> 0x00ec }
            int r0 = r7 >> 4
            r11 = r0 & 15
            r0 = 10
            if (r11 > r0) goto L_0x00a0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ BufferUnderflowException -> 0x00ec }
            r12.order(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            switch(r11) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0042;
                case 2: goto L_0x0049;
                case 3: goto L_0x004e;
                case 4: goto L_0x0057;
                case 5: goto L_0x0060;
                case 6: goto L_0x0069;
                case 7: goto L_0x0072;
                case 8: goto L_0x007b;
                case 9: goto L_0x0085;
                case 10: goto L_0x0090;
                default: goto L_0x0039;
            }     // Catch:{ BufferUnderflowException -> 0x00ec }
        L_0x0039:
            java.lang.String r0 = "Invalid value type"
            java.lang.Error r1 = new java.lang.Error     // Catch:{ BufferUnderflowException -> 0x00ec }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x00eb
        L_0x0042:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0047:
            r1 = 0
            goto L_0x009a
        L_0x0049:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x004e:
            byte r0 = r12.get()     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0057:
            short r0 = r12.getShort()     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Short r1 = java.lang.Short.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0060:
            int r0 = r12.getInt()     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0069:
            long r0 = r12.getLong()     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0072:
            double r0 = r12.getDouble()     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x007b:
            long r3 = A02(r12, r9)     // Catch:{ BufferUnderflowException -> 0x00ec }
            int r0 = (int) r3     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0085:
            r0 = 2
            long r3 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            int r0 = (int) r3     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x009a
        L_0x0090:
            r0 = 4
            long r3 = A02(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            int r0 = (int) r3     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r1 = A04(r12, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
        L_0x009a:
            X.CQX r0 = new X.CQX     // Catch:{ BufferUnderflowException -> 0x00ec }
            r0.<init>(r1, r10, r2)     // Catch:{ BufferUnderflowException -> 0x00ec }
            return r0
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.String r0 = "Invalid value type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r11)     // Catch:{ IllegalArgumentException -> 0x00cf }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00cf }
        L_0x00ab:
            java.lang.String r0 = "Invalid record type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00b2 }
        L_0x00b2:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ BufferUnderflowException -> 0x00ec }
            X.BE6.A1S(r0, r7, r6)     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r1 = java.lang.String.format(r1, r8, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r2)     // Catch:{ BufferUnderflowException -> 0x00ec }
            X.AnonymousClass000.A1E(r4, r5, r0, r3)     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            X.C1i r1 = new X.C1i     // Catch:{ BufferUnderflowException -> 0x00ec }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            goto L_0x00eb
        L_0x00cf:
            r2 = move-exception
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ BufferUnderflowException -> 0x00ec }
            X.BE6.A1S(r0, r7, r6)     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r1 = java.lang.String.format(r1, r8, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.StringBuilder r0 = X.C17890vO.A0f(r2)     // Catch:{ BufferUnderflowException -> 0x00ec }
            X.AnonymousClass000.A1E(r4, r5, r0, r3)     // Catch:{ BufferUnderflowException -> 0x00ec }
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
            X.C1i r1 = new X.C1i     // Catch:{ BufferUnderflowException -> 0x00ec }
            r1.<init>(r0)     // Catch:{ BufferUnderflowException -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ BufferUnderflowException -> 0x00ec }
        L_0x00ec:
            java.lang.String r1 = "Incomplete buffer"
            X.C1i r0 = new X.C1i
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26239Cvc.A03(java.nio.ByteBuffer):X.CQX");
    }

    public static String A04(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, C19620yd.A0A);
        } catch (UnsupportedEncodingException e) {
            throw new C24388C1i(AnonymousClass001.A1E(e, "UnsupportedEncoding: ", AnonymousClass000.A10()));
        }
    }

    public void A06() {
        this.A02.reset();
        this.A00 = -1;
        this.A01 = 0;
    }

    public final void A07(Object obj, int i, int i2) {
        int i3;
        int i4;
        long A05;
        C24171Bwf bwf = this.A02;
        this.A00 = bwf.size();
        bwf.write(0);
        int A012 = A01(bwf, (long) i2);
        if (A012 == 1) {
            i3 = 0;
        } else if (A012 == 2) {
            i3 = 1;
        } else {
            throw new Error("Id too big to fit in 2 bytes");
        }
        if (obj == null) {
            i4 = 0;
        } else {
            if (obj instanceof Boolean) {
                A05 = AnonymousClass8BX.A06(AnonymousClass000.A1Y(obj) ? 1 : 0);
            } else if (obj instanceof Long) {
                A05 = C17880vN.A05(obj);
            } else if (obj instanceof Number) {
                double A002 = AnonymousClass8BR.A00(obj);
                long j = (long) A002;
                if (((double) j) == A002) {
                    i4 = A00(bwf, j);
                } else {
                    long doubleToRawLongBits = Double.doubleToRawLongBits(A002);
                    bwf.write((byte) ((int) doubleToRawLongBits));
                    A05(bwf, 8, doubleToRawLongBits);
                    A05(bwf, 16, doubleToRawLongBits);
                    A05(bwf, 24, doubleToRawLongBits);
                    A05(bwf, 32, doubleToRawLongBits);
                    A05(bwf, 40, doubleToRawLongBits);
                    A05(bwf, 48, doubleToRawLongBits);
                    A05(bwf, 56, doubleToRawLongBits);
                    i4 = 7;
                }
            } else if (obj instanceof String) {
                try {
                    byte[] bytes = ((String) obj).getBytes(C19620yd.A0A);
                    int length = bytes.length;
                    if (length > 1024) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0);
                        Log.w(String.format(locale, "wam/serialize: string length is limited to %d UTF-8 bytes", objArr));
                    }
                    int min = Math.min(length, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    int A013 = A01(bwf, (long) min);
                    bwf.write(bytes, 0, min);
                    i4 = 8;
                    if (A013 != 1) {
                        i4 = 9;
                        if (A013 != 2) {
                            if (A013 == 4) {
                                i4 = 10;
                            } else {
                                throw new Error("Impossible");
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new Error(e);
                }
            } else {
                throw BEB.A0T(obj, "Expected class Boolean, Number, or String, got ", AnonymousClass000.A10());
            }
            i4 = A00(bwf, A05);
        }
        bwf.A01()[this.A00] = (byte) (i | (i3 << 3) | (i4 << 4));
        this.A01++;
    }
}

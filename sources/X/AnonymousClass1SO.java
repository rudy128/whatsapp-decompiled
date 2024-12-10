package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1SO  reason: invalid class name */
public class AnonymousClass1SO {
    public static final AnonymousClass1SQ A01 = new AnonymousClass1SP(0, 0, 0, true);
    public static final AnonymousClass1SQ A02 = new AnonymousClass1SP(0, 0, 7, true);
    public static final AnonymousClass1SP A03 = new AnonymousClass1SP(0, 0, 0, true);
    public static final AnonymousClass1SP A04 = new AnonymousClass1SP(0, 5, 7, true);
    public static final byte[] A05 = {35, 33, 65, 77, 82, 10};
    public static final byte[] A06 = {35, 33, 65, 77, 82, 45, 87, 66, 10};
    public static final byte[] A07 = {79, 103, 103, 83};
    public static final byte[] A08 = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A09 = {82, 73, 70, 70};
    public static final byte[] A0A = {100, 97, 116, 97};
    public static final byte[] A0B = {102, 109, 116, 32};
    public static final byte[] A0C = {73, 68, 51};
    public static final byte[] A0D = {102, 116, 121, 112};
    public static final byte[] A0E = {51, 103};
    public static final byte[] A0F = {113, 116, 32, 32};
    public static final byte[] A0G = {87, 65, 86, 69};
    public static final int[] A0H = {1633973356, 1668637984, 1684108385, 1717658484, 1718449184, 1768846196, 1818321516, 1819572340, 1852798053, 1886155636, 1936552044};
    public final AnonymousClass190 A00;

    public static int A00(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int A01(C54582eN r11, InputStream inputStream) {
        try {
            int i = (int) (r11.A01 - r11.A02);
            byte[] bArr = new byte[i];
            if (A02(inputStream, bArr, 0, i) != i) {
                return 7;
            }
            byte b = bArr[4];
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaIdentification/Did not find esds description tag - found: ");
                sb.append(b);
                Log.i(sb.toString());
                return 7;
            }
            int[] A0E2 = A0E(bArr, 4, i);
            if (A0E2 == null) {
                Log.i("MediaIdentification/Did not find esds description details");
                return 7;
            }
            int i2 = A0E2[0] + 3;
            byte b2 = bArr[i2];
            int i3 = 1;
            int i4 = i2 + 1;
            if ((b2 & 128) == 128) {
                i4 += 2;
            }
            if ((b2 & 64) == 64) {
                i4 += bArr[i4] + 1;
            }
            if ((b2 & 32) == 32) {
                i4 += 2;
            }
            byte b3 = bArr[i4];
            if (b3 != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MediaIdentification/Did not find esds config description tag - found: ");
                sb2.append(b3);
                Log.i(sb2.toString());
                return 7;
            }
            int[] A0E3 = A0E(bArr, i4, i);
            if (A0E3 == null) {
                Log.i("MediaIdentification/Did not find esds config details");
                return 7;
            }
            int i5 = A0E3[0];
            byte b4 = bArr[i5 + 1];
            if (b4 != 64) {
                if (b4 != 107) {
                    switch (b4) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        case 105:
                            break;
                        default:
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("MediaIdentification/Did not find esds supported type - found: ");
                            sb3.append(b4);
                            Log.i(sb3.toString());
                            return 7;
                    }
                }
                i3 = 2;
            }
            byte b5 = bArr[i5 + 2];
            if (((b5 & 252) >> 2) == 5) {
                return i3;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("MediaIdentification/Did not find stream type - found: ");
            sb4.append(b5);
            Log.i(sb4.toString());
            return 7;
        } catch (Exception e) {
            Log.i("MediaIdentification/Exception processing esds box: ", e);
            return 7;
        }
    }

    public static int A02(InputStream inputStream, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length - i);
        int i3 = 0;
        while (i3 < min) {
            int read = inputStream.read(bArr, i + i3, min - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static boolean A0B(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length >= length2) {
            int i2 = 0;
            while (i2 < length2) {
                if (bArr[i + i2] == bArr2[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public static byte[] A0C(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static int[] A0D(InputStream inputStream) {
        byte[] bArr = new byte[2];
        if (A02(inputStream, bArr, 0, 2) == 2) {
            byte b = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            StringBuilder sb = new StringBuilder();
            sb.append("MediaIdentification/mp4a box version: ");
            sb.append(b);
            Log.i(sb.toString());
            if (b == 0) {
                return new int[]{0, 18};
            }
            if (b == 1) {
                return new int[]{1, 34};
            }
            if (b == 2) {
                return new int[]{2, 54};
            }
            throw new IOException("Unexpected result getting mp4a version");
        }
        throw new IOException("Unexpected eof getting mp4a version");
    }

    public static C54582eN A05(InputStream inputStream, int[] iArr, long j, long j2) {
        long j3;
        long j4;
        long j5;
        String str;
        long j6 = j2;
        int[] iArr2 = iArr;
        new String(A0C(iArr[0]));
        long j7 = 0;
        long j8 = j;
        InputStream inputStream2 = inputStream;
        if (j > 0) {
            if (j2 <= 0 || j <= j2) {
                A09(inputStream2, j8);
                if (j2 == -1) {
                    j6 = -1;
                } else {
                    j6 = j2 - j;
                }
            } else {
                throw new IOException("Not enough bytes to skip");
            }
        }
        int i = 8;
        byte[] bArr = new byte[8];
        while (true) {
            if (j3 != -1 && j3 <= j7) {
                return null;
            }
            int A022 = A02(inputStream2, bArr, 0, i);
            if (A022 >= i) {
                long j9 = (long) A022;
                if (j3 == -1) {
                    j4 = -1;
                } else {
                    j4 = j3 - j9;
                }
                for (int i2 = 4; i2 < i; i2++) {
                    byte b = bArr[i2];
                    if (b < 32) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaIdentification/Found non character data in box type ");
                        sb.append(b);
                        Log.i(sb.toString());
                        return null;
                    }
                }
                int A002 = A00(bArr[0], bArr[1], bArr[2], bArr[3]);
                if (A002 == 0) {
                    A002 = -1;
                } else if (A002 == 1) {
                    byte[] bArr2 = new byte[i];
                    A022 += A02(inputStream2, bArr2, 0, i);
                    if (A022 == 16) {
                        if (j5 == -1) {
                            j5 = -1;
                        } else {
                            j5 -= 16;
                        }
                        long A003 = ((long) A00(bArr2[4], bArr2[5], bArr2[6], bArr2[7])) | (((long) A00(bArr2[0], bArr2[1], bArr2[2], bArr2[3])) << 32);
                        if (A003 <= 2147483647L) {
                            A002 = (int) A003;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Length of box too long to be processed: ");
                            sb2.append(A003);
                            throw new IOException(sb2.toString());
                        }
                    } else {
                        throw new IOException("End of file looking for wide box length");
                    }
                }
                if (j5 <= 0 || j5 >= ((long) (A002 - A022))) {
                    int A004 = A00(bArr[4], bArr[5], bArr[6], bArr[7]);
                    boolean A012 = C137476vW.A01(iArr2, A004);
                    byte[] A0C2 = A0C(A004);
                    if (A012) {
                        return new C54582eN(A002, A004, A022);
                    }
                    new String(A0C2);
                    long j10 = (long) (A002 - A022);
                    A09(inputStream2, j10);
                    if (j5 == -1) {
                        j3 = -1;
                    } else {
                        j3 = j5 - j10;
                    }
                    j7 = 0;
                    i = 8;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Length of box too long to be in current input: ");
                    sb3.append(A002);
                    sb3.append('>');
                    sb3.append(j5);
                    throw new IOException(sb3.toString());
                }
            } else {
                throw new IOException("End of file looking for box header");
            }
        }
    }

    public static String A06(AnonymousClass1SQ r3) {
        switch (r3.A00) {
            case 1:
                if (r3.A01 != 2) {
                    return "audio/aac";
                }
                return "audio/mp4";
            case 2:
                if (r3.A01 != 2) {
                    return "audio/mpeg";
                }
                return "audio/mp4";
            case 3:
                return "audio/amr";
            case 5:
                return "audio/ogg; codecs=opus";
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("invalid audio type returned; ");
                sb.append(r3);
                throw new AssertionError(sb.toString());
            default:
                Log.w("MediaIdentification/unsupported audio type; returning null mime type");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Audio type not supported: ");
                sb2.append(r3.A00);
                throw new AnonymousClass2RQ(sb2.toString());
        }
    }

    public static void A09(InputStream inputStream, long j) {
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (j > 0) {
            if (A02(inputStream, bArr, 0, (int) Math.min(1024, j)) != -1) {
                j -= 1024;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected EOF skipping ");
                sb.append(j);
                throw new IOException(sb.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e A[Catch:{ Exception -> 0x0027 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ Exception -> 0x0027 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A0E(byte[] r8, int r9, int r10) {
        /*
            int r0 = r9 + 4
            r7 = 0
            int r6 = java.lang.Math.min(r10, r0)     // Catch:{ Exception -> 0x0027 }
            r5 = 0
            r4 = r9
            r2 = 0
        L_0x000a:
            r3 = 1
            int r4 = r4 + 1
            int r2 = r2 << 7
            byte r1 = r8[r4]     // Catch:{ Exception -> 0x0027 }
            r0 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + r0
            if (r9 >= r6) goto L_0x001c
            r1 = r1 & 128(0x80, float:1.794E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x000a
        L_0x001c:
            if (r2 != 0) goto L_0x001f
            return r7
        L_0x001f:
            r0 = 2
            int[] r0 = new int[r0]     // Catch:{ Exception -> 0x0027 }
            r0[r5] = r4     // Catch:{ Exception -> 0x0027 }
            r0[r3] = r2     // Catch:{ Exception -> 0x0027 }
            return r0
        L_0x0027:
            r1 = move-exception
            java.lang.String r0 = "MediaIdentification/Exception processing esds box: "
            com.whatsapp.util.Log.i(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SO.A0E(byte[], int, int):int[]");
    }

    public AnonymousClass1SO(AnonymousClass190 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.1SP] */
    /* JADX WARNING: type inference failed for: r4v9, types: [X.1SP] */
    /* JADX WARNING: type inference failed for: r4v11, types: [X.1SP] */
    /* JADX WARNING: type inference failed for: r4v13, types: [X.1SP] */
    /* JADX WARNING: type inference failed for: r4v15, types: [X.1SP] */
    /* JADX WARNING: type inference failed for: r4v17, types: [X.1SP] */
    /* JADX WARNING: type inference failed for: r1v102, types: [X.2QT, java.io.InputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0211, code lost:
        if (7 == r11) goto L_0x0213;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1SQ A03(java.io.File r27) {
        /*
            java.io.FileInputStream r0 = X.C26511Sk.A0J(r27)
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream
            r10.<init>(r0)
            r9 = 36
            byte[] r4 = new byte[r9]     // Catch:{ all -> 0x0451 }
            r0 = 0
            r7 = 8
            int r11 = A02(r10, r4, r0, r7)     // Catch:{ all -> 0x0451 }
            if (r11 < r7) goto L_0x044b
            byte[] r1 = A0D     // Catch:{ all -> 0x0451 }
            r2 = 4
            boolean r1 = A0B(r4, r1, r2)     // Catch:{ all -> 0x0451 }
            r17 = 3
            r15 = 2
            r16 = 7
            r3 = 1
            if (r1 == 0) goto L_0x021c
            int r1 = A02(r10, r4, r7, r2)     // Catch:{ all -> 0x0451 }
            int r11 = r11 + r1
            r6 = 12
            if (r11 < r6) goto L_0x044b
            byte r5 = r4[r0]     // Catch:{ all -> 0x0451 }
            byte r3 = r4[r3]     // Catch:{ all -> 0x0451 }
            byte r2 = r4[r15]     // Catch:{ all -> 0x0451 }
            byte r1 = r4[r17]     // Catch:{ all -> 0x0451 }
            int r1 = A00(r5, r3, r2, r1)     // Catch:{ all -> 0x0451 }
            int r1 = r1 - r6
            long r1 = (long) r1     // Catch:{ all -> 0x0451 }
            r12 = 1
            int[] r4 = new int[r12]     // Catch:{ all -> 0x0451 }
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r4[r0] = r3     // Catch:{ all -> 0x0451 }
            r7 = -1
            r3 = r10
            r5 = r1
            X.2eN r1 = A05(r3, r4, r5, r7)     // Catch:{ all -> 0x0451 }
            if (r1 != 0) goto L_0x0055
            java.lang.String r0 = "moov box not found"
        L_0x0050:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0451 }
            goto L_0x0206
        L_0x0055:
            long r13 = r1.A01     // Catch:{ all -> 0x0451 }
            long r2 = r1.A02     // Catch:{ all -> 0x0451 }
            long r13 = r13 - r2
            X.2QT r1 = new X.2QT     // Catch:{ all -> 0x0451 }
            r1.<init>()     // Catch:{ all -> 0x0451 }
            byte[] r4 = new byte[r12]     // Catch:{ all -> 0x0451 }
            r1.A02 = r4     // Catch:{ all -> 0x0451 }
            r1.A01 = r10     // Catch:{ all -> 0x0451 }
            r1.A00 = r2     // Catch:{ all -> 0x0451 }
            long r13 = r13 + r2
            r11 = 0
        L_0x0069:
            long r2 = r1.A00     // Catch:{ all -> 0x0451 }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x020f
            long r6 = r13 - r2
            int[] r3 = new int[r12]     // Catch:{ all -> 0x0451 }
            r2 = 1953653099(0x7472616b, float:7.681346E31)
            r3[r0] = r2     // Catch:{ all -> 0x0451 }
            r4 = 0
            r2 = r1
            X.2eN r4 = A05(r2, r3, r4, r6)     // Catch:{ all -> 0x0451 }
            if (r4 == 0) goto L_0x0069
            long r8 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r4.A01     // Catch:{ all -> 0x0451 }
            long r8 = r8 + r2
            long r2 = r4.A02     // Catch:{ all -> 0x0451 }
            long r8 = r8 - r2
        L_0x0089:
            long r2 = r1.A00     // Catch:{ all -> 0x0451 }
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0069
            long r22 = r8 - r2
            int[] r3 = new int[r12]     // Catch:{ all -> 0x0451 }
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            r3[r0] = r2     // Catch:{ all -> 0x0451 }
            r20 = 0
            r19 = r3
            r18 = r1
            X.2eN r6 = A05(r18, r19, r20, r22)     // Catch:{ all -> 0x0451 }
            if (r6 != 0) goto L_0x00a7
            java.lang.String r0 = "mdia box not found"
            goto L_0x0050
        L_0x00a7:
            long r2 = r1.A00     // Catch:{ all -> 0x0451 }
            long r4 = r6.A01     // Catch:{ all -> 0x0451 }
            long r26 = r2 + r4
            long r4 = r6.A02     // Catch:{ all -> 0x0451 }
            long r26 = r26 - r4
            long r22 = r26 - r2
            int[] r2 = new int[r12]     // Catch:{ all -> 0x0451 }
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            r2[r0] = r3     // Catch:{ all -> 0x0451 }
            r19 = r2
            X.2eN r6 = A05(r18, r19, r20, r22)     // Catch:{ all -> 0x0451 }
            if (r6 != 0) goto L_0x00c5
            java.lang.String r0 = "hdlr box not found"
            goto L_0x0050
        L_0x00c5:
            long r4 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r6.A01     // Catch:{ all -> 0x0451 }
            long r4 = r4 + r2
            long r6 = r6.A02     // Catch:{ all -> 0x0451 }
            long r4 = r4 - r6
            r2 = 16
            long r2 = r2 - r6
            A09(r1, r2)     // Catch:{ all -> 0x0451 }
            r3 = 4
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x0451 }
            int r6 = A02(r1, r2, r0, r3)     // Catch:{ all -> 0x0451 }
            if (r6 == r3) goto L_0x00e0
            java.lang.String r0 = "hdlr box too short"
            goto L_0x0050
        L_0x00e0:
            byte r7 = r2[r0]     // Catch:{ all -> 0x0451 }
            byte r6 = r2[r12]     // Catch:{ all -> 0x0451 }
            byte r3 = r2[r15]     // Catch:{ all -> 0x0451 }
            byte r2 = r2[r17]     // Catch:{ all -> 0x0451 }
            int r2 = A00(r7, r6, r3, r2)     // Catch:{ all -> 0x0451 }
            r3 = 1986618469(0x76696465, float:1.1834389E33)
            if (r2 != r3) goto L_0x00f6
            java.lang.String r0 = "video hdlr type not valid"
            goto L_0x0050
        L_0x00f6:
            r3 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r2 == r3) goto L_0x00fd
            goto L_0x01e0
        L_0x00fd:
            if (r11 == 0) goto L_0x0101
            goto L_0x0208
        L_0x0101:
            long r2 = r1.A00     // Catch:{ all -> 0x0451 }
            long r4 = r4 - r2
            long r26 = r26 - r2
            int[] r2 = new int[r12]     // Catch:{ all -> 0x0451 }
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            r2[r0] = r3     // Catch:{ all -> 0x0451 }
            r22 = r1
            r23 = r2
            r24 = r4
            X.2eN r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x0451 }
            if (r6 != 0) goto L_0x011d
            java.lang.String r0 = "minf box not found"
            goto L_0x0050
        L_0x011d:
            long r4 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r6.A01     // Catch:{ all -> 0x0451 }
            long r22 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x0451 }
            long r22 = r22 - r2
            long r22 = r22 - r4
            int[] r3 = new int[r12]     // Catch:{ all -> 0x0451 }
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            r3[r0] = r2     // Catch:{ all -> 0x0451 }
            r19 = r3
            X.2eN r6 = A05(r18, r19, r20, r22)     // Catch:{ all -> 0x0451 }
            if (r6 != 0) goto L_0x013d
            java.lang.String r0 = "stbl box not found"
            goto L_0x0050
        L_0x013d:
            long r4 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r6.A01     // Catch:{ all -> 0x0451 }
            long r22 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x0451 }
            long r22 = r22 - r2
            long r22 = r22 - r4
            int[] r3 = new int[r12]     // Catch:{ all -> 0x0451 }
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            r3[r0] = r2     // Catch:{ all -> 0x0451 }
            r19 = r3
            X.2eN r6 = A05(r18, r19, r20, r22)     // Catch:{ all -> 0x0451 }
            if (r6 != 0) goto L_0x015d
            java.lang.String r0 = "stsd box not found"
            goto L_0x0050
        L_0x015d:
            r2 = 8
            A09(r1, r2)     // Catch:{ all -> 0x0451 }
            long r4 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r6.A01     // Catch:{ all -> 0x0451 }
            long r22 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x0451 }
            long r22 = r22 - r2
            r2 = r17
            int[] r3 = new int[r2]     // Catch:{ all -> 0x0451 }
            r2 = 1836069985(0x6d703461, float:4.6462328E27)
            r3[r0] = r2     // Catch:{ all -> 0x0451 }
            r6 = 1935764850(0x73616d72, float:1.7860208E31)
            r3[r12] = r6     // Catch:{ all -> 0x0451 }
            r6 = 1935767394(0x73617762, float:1.7863284E31)
            r3[r15] = r6     // Catch:{ all -> 0x0451 }
            long r22 = r22 - r4
            r19 = r3
            X.2eN r6 = A05(r18, r19, r20, r22)     // Catch:{ all -> 0x0451 }
            if (r6 != 0) goto L_0x018d
            java.lang.String r0 = "content box not found"
            goto L_0x0050
        L_0x018d:
            int r3 = r6.A00     // Catch:{ all -> 0x0451 }
            if (r3 == r2) goto L_0x01ad
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0451 }
            r2.<init>()     // Catch:{ all -> 0x0451 }
            java.lang.String r0 = "Found media contents that wasn't m4a: "
            r2.append(r0)     // Catch:{ all -> 0x0451 }
            byte[] r1 = A0C(r3)     // Catch:{ all -> 0x0451 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0451 }
            r0.<init>(r1)     // Catch:{ all -> 0x0451 }
            r2.append(r0)     // Catch:{ all -> 0x0451 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0451 }
            goto L_0x0050
        L_0x01ad:
            long r4 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r6.A01     // Catch:{ all -> 0x0451 }
            long r4 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x0451 }
            long r4 = r4 - r2
            r2 = 8
            A09(r1, r2)     // Catch:{ all -> 0x0451 }
            int[] r2 = A0D(r1)     // Catch:{ all -> 0x0451 }
            r2 = r2[r12]     // Catch:{ all -> 0x0451 }
            long r6 = (long) r2     // Catch:{ all -> 0x0451 }
            long r2 = r1.A00     // Catch:{ all -> 0x0451 }
            long r4 = r4 - r2
            int[] r3 = new int[r12]     // Catch:{ all -> 0x0451 }
            r2 = 1702061171(0x65736473, float:7.183675E22)
            r3[r0] = r2     // Catch:{ all -> 0x0451 }
            r19 = r3
            r20 = r6
            r22 = r4
            X.2eN r2 = A05(r18, r19, r20, r22)     // Catch:{ all -> 0x0451 }
            if (r2 != 0) goto L_0x01db
            java.lang.String r0 = "esds box not found"
            goto L_0x0050
        L_0x01db:
            int r11 = A01(r2, r1)     // Catch:{ all -> 0x0451 }
            goto L_0x01fd
        L_0x01e0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0451 }
            r4.<init>()     // Catch:{ all -> 0x0451 }
            java.lang.String r3 = "non sound hdlr type found "
            r4.append(r3)     // Catch:{ all -> 0x0451 }
            byte[] r3 = A0C(r2)     // Catch:{ all -> 0x0451 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0451 }
            r2.<init>(r3)     // Catch:{ all -> 0x0451 }
            r4.append(r2)     // Catch:{ all -> 0x0451 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0451 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0451 }
        L_0x01fd:
            long r4 = r1.A00     // Catch:{ all -> 0x0451 }
            long r2 = r8 - r4
            A09(r1, r2)     // Catch:{ all -> 0x0451 }
            goto L_0x0089
        L_0x0206:
            r11 = 7
            goto L_0x0213
        L_0x0208:
            java.lang.String r1 = "multiple hldr sound tracks found"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0451 }
            r11 = 6
            goto L_0x0214
        L_0x020f:
            r1 = r16
            if (r1 != r11) goto L_0x0214
        L_0x0213:
            r0 = 1
        L_0x0214:
            r1 = 0
            X.1SQ r4 = new X.1SQ     // Catch:{ all -> 0x0451 }
            r4.<init>(r15, r1, r11, r0)     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x021c:
            byte[] r1 = A07     // Catch:{ all -> 0x0451 }
            boolean r1 = A0B(r4, r1, r0)     // Catch:{ all -> 0x0451 }
            if (r1 == 0) goto L_0x026f
            int r9 = r9 - r11
            int r1 = A02(r10, r4, r11, r9)     // Catch:{ all -> 0x0451 }
            int r11 = r11 + r1
            r1 = 27
            if (r11 >= r1) goto L_0x023d
            java.lang.String r0 = "MediaIdentification/not opus - too few bytes for first packet"
        L_0x0230:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0451 }
            r1 = 0
            X.1SQ r4 = new X.1SQ     // Catch:{ all -> 0x0451 }
            r0 = r16
            r4.<init>(r2, r1, r0, r3)     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x023d:
            r1 = 26
            byte r1 = r4[r1]     // Catch:{ all -> 0x0451 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r8 = r1 + 27
            byte[] r6 = A08     // Catch:{ all -> 0x0451 }
            int r7 = r7 + r8
            if (r11 >= r7) goto L_0x025d
            byte[] r5 = new byte[r7]     // Catch:{ all -> 0x0451 }
            java.lang.System.arraycopy(r4, r0, r5, r0, r11)     // Catch:{ all -> 0x0451 }
            int r1 = r5.length     // Catch:{ all -> 0x0451 }
            int r0 = r1 - r11
            int r0 = A02(r10, r5, r11, r0)     // Catch:{ all -> 0x0451 }
            int r11 = r11 + r0
            if (r11 >= r1) goto L_0x025c
            java.lang.String r0 = "MediaIdentification/not opus - too few bytes"
            goto L_0x0230
        L_0x025c:
            r4 = r5
        L_0x025d:
            boolean r0 = A0B(r4, r6, r8)     // Catch:{ all -> 0x0451 }
            if (r0 == 0) goto L_0x026c
            r1 = 5
            r0 = 0
            X.1SQ r4 = new X.1SQ     // Catch:{ all -> 0x0451 }
            r4.<init>(r2, r0, r1, r0)     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x026c:
            java.lang.String r0 = "MediaIdentification/not opus - header bytes don't match"
            goto L_0x0230
        L_0x026f:
            byte[] r12 = A09     // Catch:{ all -> 0x0451 }
            boolean r1 = A0B(r4, r12, r0)     // Catch:{ all -> 0x0451 }
            if (r1 != 0) goto L_0x032e
            int r1 = 10 - r11
            int r1 = A02(r10, r4, r11, r1)     // Catch:{ all -> 0x0451 }
            int r11 = r11 + r1
            r8 = 10
            if (r11 < r8) goto L_0x044b
            r5 = -32
            r2 = 6
            r6 = -1
            if (r11 != r8) goto L_0x02ef
            byte[] r1 = A0C     // Catch:{ all -> 0x0451 }
            boolean r1 = A0B(r4, r1, r0)     // Catch:{ all -> 0x0451 }
            if (r1 == 0) goto L_0x02ef
            byte r1 = r4[r2]     // Catch:{ all -> 0x0451 }
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r11 = r1 << 21
            byte r1 = r4[r16]     // Catch:{ all -> 0x0451 }
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 << 14
            r11 = r11 | r1
            byte r1 = r4[r7]     // Catch:{ all -> 0x0451 }
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << r16
            r2 = r2 | r11
            r1 = 9
            byte r1 = r4[r1]     // Catch:{ all -> 0x0451 }
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r2 = r2 | r1
            long r1 = (long) r2     // Catch:{ all -> 0x0451 }
            A09(r10, r1)     // Catch:{ all -> 0x0451 }
            int r11 = A02(r10, r4, r0, r8)     // Catch:{ all -> 0x0451 }
            r13 = 2048(0x800, float:2.87E-42)
            r2 = 0
        L_0x02b6:
            if (r11 <= 0) goto L_0x044b
            if (r13 <= 0) goto L_0x02e2
            boolean r1 = A0B(r4, r12, r0)     // Catch:{ all -> 0x0451 }
            if (r1 != 0) goto L_0x02e2
            byte r1 = r4[r0]     // Catch:{ all -> 0x0451 }
            if (r1 != r6) goto L_0x02cb
            byte r1 = r4[r3]     // Catch:{ all -> 0x0451 }
            r1 = r1 & 224(0xe0, float:3.14E-43)
            byte r1 = (byte) r1     // Catch:{ all -> 0x0451 }
            if (r1 == r5) goto L_0x02e2
        L_0x02cb:
            int r11 = r11 + -1
            java.lang.System.arraycopy(r4, r3, r4, r0, r11)     // Catch:{ all -> 0x0451 }
            if (r2 != 0) goto L_0x02b6
            int r1 = r10.read(r4, r11, r3)     // Catch:{ all -> 0x0451 }
            if (r1 != r6) goto L_0x02dd
            r4[r11] = r0     // Catch:{ all -> 0x0451 }
            r13 = 0
            r2 = 1
            goto L_0x02b6
        L_0x02dd:
            int r11 = r11 + 1
            int r13 = r13 + -1
            goto L_0x02b6
        L_0x02e2:
            r1 = 4
            if (r11 < r1) goto L_0x044b
            boolean r1 = A0B(r4, r12, r0)     // Catch:{ all -> 0x0451 }
            if (r1 != 0) goto L_0x032e
            if (r11 >= r8) goto L_0x02ef
            goto L_0x044b
        L_0x02ef:
            int r1 = r9 - r11
            int r1 = A02(r10, r4, r11, r1)     // Catch:{ all -> 0x0451 }
            int r11 = r11 + r1
            if (r11 < r9) goto L_0x044b
            byte r1 = r4[r0]     // Catch:{ all -> 0x0451 }
            if (r1 != r6) goto L_0x0310
            byte r2 = r4[r3]     // Catch:{ all -> 0x0451 }
            r1 = r2 & 224(0xe0, float:3.14E-43)
            byte r1 = (byte) r1     // Catch:{ all -> 0x0451 }
            if (r1 != r5) goto L_0x0310
            r1 = r2 & 6
            if (r1 != 0) goto L_0x030e
            X.1SQ r4 = new X.1SQ     // Catch:{ all -> 0x0451 }
            r4.<init>(r3, r0, r3, r0)     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x030e:
            r1 = 2
            goto L_0x0323
        L_0x0310:
            byte[] r1 = A05     // Catch:{ all -> 0x0451 }
            boolean r1 = A0B(r4, r1, r0)     // Catch:{ all -> 0x0451 }
            if (r1 == 0) goto L_0x031a
            r1 = 3
            goto L_0x0323
        L_0x031a:
            byte[] r1 = A06     // Catch:{ all -> 0x0451 }
            boolean r1 = A0B(r4, r1, r0)     // Catch:{ all -> 0x0451 }
            if (r1 == 0) goto L_0x032a
            r1 = 4
        L_0x0323:
            X.1SQ r4 = new X.1SQ     // Catch:{ all -> 0x0451 }
            r4.<init>(r3, r0, r1, r0)     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x032a:
            X.1SQ r4 = A02     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x032e:
            byte[] r6 = new byte[r9]     // Catch:{ all -> 0x0451 }
            r2 = 8
            byte[] r8 = new byte[r7]     // Catch:{ all -> 0x0451 }
            java.lang.System.arraycopy(r4, r0, r6, r0, r11)     // Catch:{ all -> 0x0451 }
            int r1 = r9 - r11
            int r1 = A02(r10, r6, r11, r1)     // Catch:{ all -> 0x0451 }
            int r11 = r11 + r1
            if (r11 == r9) goto L_0x0348
            java.lang.String r1 = "Insufficient data for WAV file header"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0451 }
            r3 = 0
            goto L_0x0443
        L_0x0348:
            byte[] r1 = A0G     // Catch:{ all -> 0x0451 }
            boolean r1 = A0B(r6, r1, r7)     // Catch:{ all -> 0x0451 }
            if (r1 != 0) goto L_0x036c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0451 }
            r3.<init>()     // Catch:{ all -> 0x0451 }
            java.lang.String r0 = "Not WAVE File type "
        L_0x0357:
            r3.append(r0)     // Catch:{ all -> 0x0451 }
            r0 = 4
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0451 }
            r1.<init>(r6, r2, r0)     // Catch:{ all -> 0x0451 }
        L_0x0360:
            r3.append(r1)     // Catch:{ all -> 0x0451 }
        L_0x0363:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0451 }
        L_0x0367:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0451 }
            goto L_0x0441
        L_0x036c:
            byte[] r1 = A0B     // Catch:{ all -> 0x0451 }
            r2 = 12
            boolean r1 = A0B(r6, r1, r2)     // Catch:{ all -> 0x0451 }
            if (r1 != 0) goto L_0x037e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0451 }
            r3.<init>()     // Catch:{ all -> 0x0451 }
            java.lang.String r0 = "Not WAVE chunk format "
            goto L_0x0357
        L_0x037e:
            r1 = 21
            byte r2 = r6[r1]     // Catch:{ all -> 0x0451 }
            r1 = 20
            byte r4 = r6[r1]     // Catch:{ all -> 0x0451 }
            r1 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r1 << 8
            r1 = r4 & 255(0xff, float:3.57E-43)
            r2 = r2 | r1
            r1 = 80
            if (r1 == r2) goto L_0x03ab
            r1 = 85
            if (r1 == r2) goto L_0x03ab
            r1 = 5632(0x1600, float:7.892E-42)
            if (r1 == r2) goto L_0x03ab
            r1 = 5648(0x1610, float:7.915E-42)
            if (r1 == r2) goto L_0x03ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0451 }
            r3.<init>()     // Catch:{ all -> 0x0451 }
            java.lang.String r0 = "RIFF/WAV container carries stream which is not one of supported MPEG audio streams "
            r3.append(r0)     // Catch:{ all -> 0x0451 }
            r3.append(r2)     // Catch:{ all -> 0x0451 }
            goto L_0x0363
        L_0x03ab:
            r1 = 19
            byte r5 = r6[r1]     // Catch:{ all -> 0x0451 }
            r1 = 18
            byte r4 = r6[r1]     // Catch:{ all -> 0x0451 }
            r1 = 17
            byte r2 = r6[r1]     // Catch:{ all -> 0x0451 }
            r1 = 16
            byte r1 = r6[r1]     // Catch:{ all -> 0x0451 }
            int r1 = A00(r5, r4, r2, r1)     // Catch:{ all -> 0x0451 }
            int r1 = r1 + 16
            r6 = 4
            int r9 = r1 + 4
            r2 = 36
        L_0x03c6:
            int r1 = r9 - r2
            long r1 = (long) r1     // Catch:{ all -> 0x0451 }
            A09(r10, r1)     // Catch:{ IOException -> 0x043b }
            int r1 = A02(r10, r8, r0, r7)     // Catch:{ all -> 0x0451 }
            int r9 = r9 + r1
            if (r1 == r7) goto L_0x03d6
            java.lang.String r0 = "EOF reading WAVE chunk"
            goto L_0x0367
        L_0x03d6:
            byte r5 = r8[r0]     // Catch:{ all -> 0x0451 }
            byte r4 = r8[r3]     // Catch:{ all -> 0x0451 }
            byte r2 = r8[r15]     // Catch:{ all -> 0x0451 }
            byte r1 = r8[r17]     // Catch:{ all -> 0x0451 }
            int r2 = A00(r5, r4, r2, r1)     // Catch:{ all -> 0x0451 }
            int[] r1 = A0H     // Catch:{ all -> 0x0451 }
            boolean r1 = X.C137476vW.A01(r1, r2)     // Catch:{ all -> 0x0451 }
            if (r1 == 0) goto L_0x0423
            byte[] r1 = A0A     // Catch:{ all -> 0x0451 }
            boolean r2 = A0B(r8, r1, r0)     // Catch:{ all -> 0x0451 }
            r1 = 6
            if (r2 == 0) goto L_0x03ff
            byte[] r4 = new byte[r15]     // Catch:{ all -> 0x0451 }
            int r1 = A02(r10, r4, r0, r15)     // Catch:{ all -> 0x0451 }
            if (r1 == r15) goto L_0x0410
            java.lang.String r0 = "EOF reading WAVE data"
            goto L_0x0367
        L_0x03ff:
            byte r5 = r8[r16]     // Catch:{ all -> 0x0451 }
            byte r4 = r8[r1]     // Catch:{ all -> 0x0451 }
            r1 = 5
            byte r2 = r8[r1]     // Catch:{ all -> 0x0451 }
            byte r1 = r8[r6]     // Catch:{ all -> 0x0451 }
            int r1 = A00(r5, r4, r2, r1)     // Catch:{ all -> 0x0451 }
            int r1 = r1 + r9
            r2 = r9
            r9 = r1
            goto L_0x03c6
        L_0x0410:
            byte r2 = r4[r0]     // Catch:{ all -> 0x0451 }
            r1 = -1
            if (r2 != r1) goto L_0x041f
            byte r3 = r4[r3]     // Catch:{ all -> 0x0451 }
            r1 = r3 & 224(0xe0, float:3.14E-43)
            byte r2 = (byte) r1     // Catch:{ all -> 0x0451 }
            r1 = -32
            if (r2 != r1) goto L_0x041f
            goto L_0x0434
        L_0x041f:
            java.lang.String r0 = "Not ACC/MP3 WAVE data"
            goto L_0x0367
        L_0x0423:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0451 }
            r3.<init>()     // Catch:{ all -> 0x0451 }
            java.lang.String r1 = "Unsupported WAVE chunk: "
            r3.append(r1)     // Catch:{ all -> 0x0451 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0451 }
            r1.<init>(r8, r0, r6)     // Catch:{ all -> 0x0451 }
            goto L_0x0360
        L_0x0434:
            r1 = r3 & 6
            r3 = 2
            if (r1 != 0) goto L_0x0443
            r3 = 1
            goto L_0x0443
        L_0x043b:
            r1 = move-exception
            java.lang.String r0 = "Excepton reading next chunk "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0451 }
        L_0x0441:
            r3 = 7
            r0 = 1
        L_0x0443:
            r2 = 5
            r1 = 0
            X.1SQ r4 = new X.1SQ     // Catch:{ all -> 0x0451 }
            r4.<init>(r2, r1, r3, r0)     // Catch:{ all -> 0x0451 }
            goto L_0x044d
        L_0x044b:
            X.1SQ r4 = A01     // Catch:{ all -> 0x0451 }
        L_0x044d:
            r10.close()
            return r4
        L_0x0451:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0456 }
            throw r1
        L_0x0456:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SO.A03(java.io.File):X.1SQ");
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.2QT, java.io.InputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c5, code lost:
        r0 = "esds box not found";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ce, code lost:
        r0 = "multiple hldr audio tracks found - not dolby";
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0387 A[Catch:{ all -> 0x03f2, all -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x038d A[Catch:{ all -> 0x03f2, all -> 0x03f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x021c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0220 A[Catch:{ all -> 0x03f2, all -> 0x03f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1SP A04(java.io.File r31) {
        /*
            java.io.FileInputStream r1 = X.C26511Sk.A0J(r31)
            java.io.BufferedInputStream r19 = new java.io.BufferedInputStream
            r0 = r19
            r0.<init>(r1)
            r10 = 0
            r4 = 12
            byte[] r5 = new byte[r4]     // Catch:{ all -> 0x03f2 }
            int r0 = A02(r0, r5, r10, r4)     // Catch:{ all -> 0x03f2 }
            if (r0 >= r4) goto L_0x001a
            X.1SP r12 = A03     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x001a:
            r1 = 4
            byte[] r0 = A0D     // Catch:{ all -> 0x03f2 }
            boolean r0 = A0B(r5, r0, r1)     // Catch:{ all -> 0x03f2 }
            if (r0 == 0) goto L_0x03e6
            byte[] r0 = A0F     // Catch:{ all -> 0x03f2 }
            r2 = 8
            boolean r0 = A0B(r5, r0, r2)     // Catch:{ all -> 0x03f2 }
            r20 = 3
            r1 = 2
            if (r0 == 0) goto L_0x0033
            r21 = 7
            goto L_0x003f
        L_0x0033:
            byte[] r0 = A0E     // Catch:{ all -> 0x03f2 }
            boolean r0 = A0B(r5, r0, r2)     // Catch:{ all -> 0x03f2 }
            r21 = 2
            if (r0 == 0) goto L_0x003f
            r21 = 3
        L_0x003f:
            byte r3 = r5[r10]     // Catch:{ all -> 0x03f2 }
            r0 = 1
            byte r2 = r5[r0]     // Catch:{ all -> 0x03f2 }
            byte r1 = r5[r1]     // Catch:{ all -> 0x03f2 }
            byte r0 = r5[r20]     // Catch:{ all -> 0x03f2 }
            int r0 = A00(r3, r2, r1, r0)     // Catch:{ all -> 0x03f2 }
            int r0 = r0 - r4
            long r2 = (long) r0     // Catch:{ all -> 0x03f2 }
            r1 = 1
            int[] r4 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r4[r10] = r0     // Catch:{ all -> 0x03f2 }
            r15 = -1
            r11 = r19
            r12 = r4
            r13 = r2
            X.2eN r4 = A05(r11, r12, r13, r15)     // Catch:{ all -> 0x03f2 }
            if (r4 != 0) goto L_0x0066
            java.lang.String r0 = "moov box not found"
            goto L_0x03e9
        L_0x0066:
            X.1SP r12 = new X.1SP     // Catch:{ all -> 0x03f2 }
            r12.<init>()     // Catch:{ all -> 0x03f2 }
            r0 = r21
            r12.A01 = r0     // Catch:{ all -> 0x03f2 }
            long r2 = r4.A01     // Catch:{ all -> 0x03f2 }
            r16 = r2
            long r2 = r4.A02     // Catch:{ all -> 0x03f2 }
            long r16 = r16 - r2
            X.2QT r0 = new X.2QT     // Catch:{ all -> 0x03f2 }
            r0.<init>()     // Catch:{ all -> 0x03f2 }
            byte[] r4 = new byte[r1]     // Catch:{ all -> 0x03f2 }
            r0.A02 = r4     // Catch:{ all -> 0x03f2 }
            r0.A01 = r11     // Catch:{ all -> 0x03f2 }
            r0.A00 = r2     // Catch:{ all -> 0x03f2 }
            long r16 = r16 + r2
        L_0x0086:
            long r2 = r0.A00     // Catch:{ all -> 0x03f2 }
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x03d1
            long r6 = r16 - r2
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1953653099(0x7472616b, float:7.681346E31)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r4 = 0
            r2 = r0
            X.2eN r4 = A05(r2, r3, r4, r6)     // Catch:{ all -> 0x03f2 }
            if (r4 == 0) goto L_0x0086
            long r13 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r4.A01     // Catch:{ all -> 0x03f2 }
            long r13 = r13 + r2
            long r2 = r4.A02     // Catch:{ all -> 0x03f2 }
            long r13 = r13 - r2
        L_0x00a6:
            long r2 = r0.A00     // Catch:{ all -> 0x03f2 }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0086
            r4 = 2
            int[] r5 = new int[r4]     // Catch:{ all -> 0x03f2 }
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            r5[r10] = r4     // Catch:{ all -> 0x03f2 }
            r24 = 1835297121(0x6d646961, float:4.4181236E27)
            r5[r1] = r24     // Catch:{ all -> 0x03f2 }
            long r29 = r13 - r2
            r27 = 0
            r25 = r0
            r26 = r5
            X.2eN r11 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x03f2 }
            if (r11 != 0) goto L_0x00cc
            java.lang.String r0 = "tkmd/mdia box not found"
            goto L_0x03e9
        L_0x00cc:
            int r2 = r11.A00     // Catch:{ all -> 0x03f2 }
            if (r2 != r4) goto L_0x018b
            long r6 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r8 = r11.A01     // Catch:{ all -> 0x03f2 }
            long r6 = r6 + r8
            long r4 = r11.A02     // Catch:{ all -> 0x03f2 }
            long r6 = r6 - r4
            r22 = 92
            r11 = 0
            int r2 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r2 < 0) goto L_0x0172
            long r2 = r8 - r4
            int r4 = (int) r2     // Catch:{ all -> 0x03f2 }
            byte[] r15 = new byte[r4]     // Catch:{ all -> 0x03f2 }
            int r2 = A02(r0, r15, r10, r4)     // Catch:{ all -> 0x03f2 }
            if (r2 != r4) goto L_0x03b9
            byte r2 = r15[r10]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x00f3
            r9 = 76
            r22 = 40
            goto L_0x00ff
        L_0x00f3:
            if (r2 != r1) goto L_0x0172
            r3 = 104(0x68, double:5.14E-322)
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0172
            r9 = 88
            r22 = 52
        L_0x00ff:
            byte r5 = r15[r9]     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 1
            byte r4 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 2
            byte r3 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 3
            byte r2 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r8 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 4
            byte r5 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 5
            byte r4 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 6
            byte r3 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r9 + 7
            byte r2 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r3 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            if (r8 <= 0) goto L_0x0139
            if (r3 <= 0) goto L_0x0139
            int r2 = r12.A03     // Catch:{ all -> 0x03f2 }
            if (r2 > 0) goto L_0x0139
            int r2 = r12.A04     // Catch:{ all -> 0x03f2 }
            if (r2 > 0) goto L_0x0139
            int r2 = r3 >>> 16
            r12.A03 = r2     // Catch:{ all -> 0x03f2 }
            int r2 = r8 >>> 16
            r12.A04 = r2     // Catch:{ all -> 0x03f2 }
        L_0x0139:
            r9 = 9
            int[] r8 = new int[r9]     // Catch:{ all -> 0x03f2 }
        L_0x013d:
            int r18 = r11 * 4
            int r18 = r18 + r22
            byte r5 = r15[r18]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 1
            byte r4 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 2
            byte r3 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = r18 + 3
            byte r2 = r15[r2]     // Catch:{ all -> 0x03f2 }
            int r2 = A00(r5, r4, r3, r2)     // Catch:{ all -> 0x03f2 }
            r8[r11] = r2     // Catch:{ all -> 0x03f2 }
            int r11 = r11 + 1
            if (r11 < r9) goto L_0x013d
            r2 = r8[r10]     // Catch:{ all -> 0x03f2 }
            r3 = 4
            if (r2 != 0) goto L_0x0172
            r2 = r8[r1]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0172
            r2 = 2
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0172
            r2 = r8[r20]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0172
            r2 = r8[r3]     // Catch:{ all -> 0x03f2 }
            if (r2 != 0) goto L_0x0172
            r2 = 5
            r2 = r8[r2]     // Catch:{ all -> 0x03f2 }
        L_0x0172:
            long r2 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r6 = r6 - r2
            long r26 = r13 - r2
            int[] r2 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2[r10] = r24     // Catch:{ all -> 0x03f2 }
            r22 = r0
            r23 = r2
            r24 = r6
            X.2eN r11 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r11 != 0) goto L_0x018b
            java.lang.String r0 = "mdia box not found"
            goto L_0x03e9
        L_0x018b:
            long r2 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r4 = r11.A01     // Catch:{ all -> 0x03f2 }
            long r30 = r2 + r4
            long r4 = r11.A02     // Catch:{ all -> 0x03f2 }
            long r30 = r30 - r4
            long r26 = r30 - r2
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r24 = 0
            r22 = r0
            r23 = r3
            X.2eN r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x01ae
            java.lang.String r0 = "hdlr box not found"
            goto L_0x03e9
        L_0x01ae:
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r4 = r4 + r2
            long r6 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r4 = r4 - r6
            r2 = 16
            long r2 = r2 - r6
            A09(r0, r2)     // Catch:{ all -> 0x03f2 }
            r9 = 4
            byte[] r2 = new byte[r9]     // Catch:{ all -> 0x03f2 }
            int r3 = A02(r0, r2, r10, r9)     // Catch:{ all -> 0x03f2 }
            if (r3 == r9) goto L_0x01c9
            java.lang.String r0 = "hdlr box too short"
            goto L_0x03e9
        L_0x01c9:
            byte r7 = r2[r10]     // Catch:{ all -> 0x03f2 }
            byte r6 = r2[r1]     // Catch:{ all -> 0x03f2 }
            r3 = 2
            byte r3 = r2[r3]     // Catch:{ all -> 0x03f2 }
            byte r2 = r2[r20]     // Catch:{ all -> 0x03f2 }
            int r7 = A00(r7, r6, r3, r2)     // Catch:{ all -> 0x03f2 }
            r2 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r7 == r2) goto L_0x01f3
            r2 = 1986618469(0x76696465, float:1.1834389E33)
            if (r7 == r2) goto L_0x01eb
            byte[] r2 = A0C(r7)     // Catch:{ all -> 0x03f2 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x03f2 }
            r1.<init>(r2)     // Catch:{ all -> 0x03f2 }
            goto L_0x03af
        L_0x01eb:
            int r2 = r12.A02     // Catch:{ all -> 0x03f2 }
            if (r2 == 0) goto L_0x0202
            java.lang.String r0 = "multiple hldr video tracks found"
            goto L_0x03e9
        L_0x01f3:
            r3 = 8
            int r2 = r12.A00     // Catch:{ all -> 0x03f2 }
            if (r2 == 0) goto L_0x0202
            if (r2 == r1) goto L_0x01ff
            if (r2 == r3) goto L_0x01ff
            goto L_0x03c1
        L_0x01ff:
            r18 = 1
            goto L_0x0204
        L_0x0202:
            r18 = 0
        L_0x0204:
            long r2 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r4 = r4 - r2
            long r30 = r30 - r2
            int[] r2 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            r2[r10] = r3     // Catch:{ all -> 0x03f2 }
            r26 = r0
            r27 = r2
            r28 = r4
            X.2eN r6 = A05(r26, r27, r28, r30)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x0220
            java.lang.String r0 = "minf box not found"
            goto L_0x03e9
        L_0x0220:
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r2
            long r26 = r26 - r4
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r23 = r3
            X.2eN r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x0240
            java.lang.String r0 = "stbl box not found"
            goto L_0x03e9
        L_0x0240:
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r2
            long r26 = r26 - r4
            int[] r3 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            r3[r10] = r2     // Catch:{ all -> 0x03f2 }
            r23 = r3
            X.2eN r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x0260
            java.lang.String r0 = "stsd box not found"
            goto L_0x03e9
        L_0x0260:
            r2 = 8
            A09(r0, r2)     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r26 = r4 + r2
            long r2 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r2
            r2 = 1986618469(0x76696465, float:1.1834389E33)
            if (r7 != r2) goto L_0x02ae
            int[] r8 = new int[r9]     // Catch:{ all -> 0x03f2 }
            r7 = 1635148593(0x61766331, float:2.840654E20)
            r8[r10] = r7     // Catch:{ all -> 0x03f2 }
            r6 = 1836070006(0x6d703476, float:4.646239E27)
            r8[r1] = r6     // Catch:{ all -> 0x03f2 }
            r3 = 1932670515(0x73323633, float:1.4119387E31)
            r2 = 2
            r8[r2] = r3     // Catch:{ all -> 0x03f2 }
            r2 = 1752589105(0x68766331, float:4.6541277E24)
            r8[r20] = r2     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r4
            r23 = r8
            X.2eN r4 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r4 != 0) goto L_0x029a
            java.lang.String r0 = "video content box not found"
            goto L_0x03e9
        L_0x029a:
            int r4 = r4.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r7) goto L_0x02a0
            r1 = 2
            goto L_0x02aa
        L_0x02a0:
            if (r4 != r6) goto L_0x02a4
            r1 = 3
            goto L_0x02aa
        L_0x02a4:
            if (r4 == r3) goto L_0x02aa
            if (r4 != r2) goto L_0x03af
            goto L_0x03ad
        L_0x02aa:
            r12.A02 = r1     // Catch:{ all -> 0x03f2 }
            goto L_0x03af
        L_0x02ae:
            r2 = 5
            int[] r6 = new int[r2]     // Catch:{ all -> 0x03f2 }
            r9 = 1836069985(0x6d703461, float:4.6462328E27)
            r6[r10] = r9     // Catch:{ all -> 0x03f2 }
            r8 = 1935764850(0x73616d72, float:1.7860208E31)
            r6[r1] = r8     // Catch:{ all -> 0x03f2 }
            r7 = 1935767394(0x73617762, float:1.7863284E31)
            r2 = 2
            r6[r2] = r7     // Catch:{ all -> 0x03f2 }
            r3 = 778924083(0x2e6d7033, float:5.3987214E-11)
            r6[r20] = r3     // Catch:{ all -> 0x03f2 }
            r2 = 1700998451(0x65632d33, float:6.7050686E22)
            r11 = 4
            r6[r11] = r2     // Catch:{ all -> 0x03f2 }
            long r26 = r26 - r4
            r23 = r6
            X.2eN r6 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r6 != 0) goto L_0x02db
            java.lang.String r0 = "sound content box not found"
            goto L_0x03e9
        L_0x02db:
            if (r18 == 0) goto L_0x02e7
            int r5 = r12.A00     // Catch:{ all -> 0x03f2 }
            r4 = 8
            if (r5 != r4) goto L_0x0304
            int r4 = r6.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r9) goto L_0x03ce
        L_0x02e7:
            int r4 = r6.A00     // Catch:{ all -> 0x03f2 }
            r11 = 7
            if (r4 != r9) goto L_0x0391
            long r2 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r4 = r6.A01     // Catch:{ all -> 0x03f2 }
            long r2 = r2 + r4
            long r4 = r6.A02     // Catch:{ all -> 0x03f2 }
            long r2 = r2 - r4
            r4 = 8
            A09(r0, r4)     // Catch:{ all -> 0x03f2 }
            int[] r5 = A0D(r0)     // Catch:{ all -> 0x03f2 }
            r4 = r5[r10]     // Catch:{ all -> 0x03f2 }
            r5 = r5[r1]     // Catch:{ all -> 0x03f2 }
            if (r4 == 0) goto L_0x0364
            goto L_0x030b
        L_0x0304:
            if (r5 != r1) goto L_0x03ce
            int r4 = r6.A00     // Catch:{ all -> 0x03f2 }
            if (r4 != r2) goto L_0x03ce
            goto L_0x02e7
        L_0x030b:
            r4 = r21
            if (r4 != r11) goto L_0x0364
            long r6 = (long) r5     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r30 = r2 - r4
            r4 = 2
            int[] r5 = new int[r4]     // Catch:{ all -> 0x03f2 }
            r4 = 2002876005(0x77617665, float:4.5729223E33)
            r5[r10] = r4     // Catch:{ all -> 0x03f2 }
            r11 = 1702061171(0x65736473, float:7.183675E22)
            r5[r1] = r11     // Catch:{ all -> 0x03f2 }
            r15 = 8
            r26 = r0
            r27 = r5
            r28 = r6
            X.2eN r1 = A05(r26, r27, r28, r30)     // Catch:{ all -> 0x03f2 }
            int r5 = r1.A00     // Catch:{ all -> 0x03f2 }
            if (r5 != r4) goto L_0x0361
            long r6 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r8 = r1.A01     // Catch:{ all -> 0x03f2 }
            long r4 = r6 + r8
            long r8 = r1.A02     // Catch:{ all -> 0x03f2 }
            long r4 = r4 - r8
            long r26 = r4 - r6
            r1 = 1
            int[] r1 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r1[r10] = r11     // Catch:{ all -> 0x03f2 }
            r23 = r1
            X.2eN r1 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
            if (r1 != 0) goto L_0x037e
            long r6 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r4 = r4 - r6
            A09(r0, r4)     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r2 - r4
            r1 = 1
            int[] r1 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r1[r10] = r11     // Catch:{ all -> 0x03f2 }
            r4 = r0
            r5 = r1
            r6 = r24
            r8 = r2
            X.2eN r1 = A05(r4, r5, r6, r8)     // Catch:{ all -> 0x03f2 }
            goto L_0x037b
        L_0x0361:
            if (r5 != r11) goto L_0x03c5
            goto L_0x037e
        L_0x0364:
            r15 = 8
            long r6 = (long) r5     // Catch:{ all -> 0x03f2 }
            long r4 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r2 = r2 - r4
            int[] r4 = new int[r1]     // Catch:{ all -> 0x03f2 }
            r1 = 1702061171(0x65736473, float:7.183675E22)
            r4[r10] = r1     // Catch:{ all -> 0x03f2 }
            r23 = r4
            r24 = r6
            r26 = r2
            X.2eN r1 = A05(r22, r23, r24, r26)     // Catch:{ all -> 0x03f2 }
        L_0x037b:
            if (r1 != 0) goto L_0x037e
            goto L_0x03c5
        L_0x037e:
            int r3 = A01(r1, r0)     // Catch:{ all -> 0x03f2 }
            r12.A00 = r3     // Catch:{ all -> 0x03f2 }
            r2 = 1
            if (r18 == 0) goto L_0x038d
            if (r3 == r2) goto L_0x038a
            goto L_0x03c8
        L_0x038a:
            r12.A00 = r15     // Catch:{ all -> 0x03f2 }
            goto L_0x03af
        L_0x038d:
            r1 = 7
            if (r3 != r1) goto L_0x03af
            goto L_0x03cb
        L_0x0391:
            r1 = 8
            if (r4 != r8) goto L_0x0397
            r1 = 3
            goto L_0x03aa
        L_0x0397:
            if (r4 != r7) goto L_0x039b
            r1 = 4
            goto L_0x03aa
        L_0x039b:
            if (r4 != r3) goto L_0x03a8
            r1 = r21
            if (r1 == r11) goto L_0x03a6
            java.lang.String r1 = ".mp3 box found in non-QuickTime file (?!)"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x03f2 }
        L_0x03a6:
            r1 = 2
            goto L_0x03aa
        L_0x03a8:
            if (r4 != r2) goto L_0x03af
        L_0x03aa:
            r12.A00 = r1     // Catch:{ all -> 0x03f2 }
            goto L_0x03af
        L_0x03ad:
            r12.A02 = r9     // Catch:{ all -> 0x03f2 }
        L_0x03af:
            long r3 = r0.A00     // Catch:{ all -> 0x03f2 }
            long r1 = r13 - r3
            A09(r0, r1)     // Catch:{ all -> 0x03f2 }
            r1 = 1
            goto L_0x00a6
        L_0x03b9:
            java.lang.String r1 = "Unexpected eof reading tkhd"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x03f2 }
            r0.<init>(r1)     // Catch:{ all -> 0x03f2 }
            throw r0     // Catch:{ all -> 0x03f2 }
        L_0x03c1:
            r0 = 6
            r12.A00 = r0     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x03c5:
            java.lang.String r0 = "esds box not found"
            goto L_0x03e9
        L_0x03c8:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby mp4"
            goto L_0x03e9
        L_0x03cb:
            r12.A05 = r2     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x03ce:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby"
            goto L_0x03e9
        L_0x03d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f2 }
            r1.<init>()     // Catch:{ all -> 0x03f2 }
            java.lang.String r0 = "Details found: "
            r1.append(r0)     // Catch:{ all -> 0x03f2 }
            r1.append(r12)     // Catch:{ all -> 0x03f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03f2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03f2 }
            goto L_0x03ee
        L_0x03e6:
            java.lang.String r0 = "video not MP4/3GP type file"
        L_0x03e9:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03f2 }
            X.1SP r12 = A04     // Catch:{ all -> 0x03f2 }
        L_0x03ee:
            r19.close()
            return r12
        L_0x03f2:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x03f7 }
            throw r1
        L_0x03f7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SO.A04(java.io.File):X.1SP");
    }

    public static String A07(String str, boolean z) {
        String obj;
        if (TextUtils.isEmpty(str)) {
            if (z) {
                obj = "MediaIdentification/empty audio mime type";
            }
            return null;
        } else if ("audio/aac".equals(str)) {
            return "aac";
        } else {
            if ("audio/mp4".equals(str)) {
                return "m4a";
            }
            if ("audio/amr".equals(str)) {
                return "amr";
            }
            if ("audio/mpeg".equals(str)) {
                return "mp3";
            }
            if ("audio/ogg; codecs=opus".equals(str)) {
                return "opus";
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaIdentification/unrecognized audio mime type; mimeType=");
                sb.append(str);
                obj = sb.toString();
            }
            return null;
        }
        Log.w(obj);
        return null;
    }

    public static String A08(String str, boolean z) {
        String obj;
        if (TextUtils.isEmpty(str)) {
            if (z) {
                obj = "MediaIdentification/empty video mime type";
            }
            return null;
        } else if ("video/mp4".equals(str)) {
            return "mp4";
        } else {
            if ("video/3gpp".equals(str)) {
                return "3gp";
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaIdentification/unrecognized video mime type; mimeType=");
                sb.append(str);
                obj = sb.toString();
            }
            return null;
        }
        Log.w(obj);
        return null;
    }

    public static boolean A0A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("audio/aac".equals(str) || "audio/mp4".equals(str) || "audio/amr".equals(str) || "audio/mpeg".equals(str) || "audio/ogg; codecs=opus".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean A0F(File file) {
        AnonymousClass1SQ A032 = A03(file);
        switch (A032.A00) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("invalid audio file type returned; ");
                sb.append(A032);
                throw new AssertionError(sb.toString());
            default:
                return false;
        }
    }

    public boolean A0G(File file) {
        AnonymousClass1SP A042 = A04(file);
        int i = A042.A01;
        if (i != 2 && i != 3) {
            return false;
        }
        int i2 = A042.A00;
        if (i2 != 4 && i2 != 2 && i2 != 1 && i2 != 0 && i2 != 8) {
            return false;
        }
        int i3 = A042.A02;
        if (i3 == 2 || i3 == 1 || i3 == 3) {
            return true;
        }
        return false;
    }
}

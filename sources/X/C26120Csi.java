package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Csi  reason: case insensitive filesystem */
public class C26120Csi {
    public static final Charset A04;
    public static final boolean A05 = C24670CEk.A00;
    public static final byte[] A06 = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A07;
    public static final byte[] A08 = {-1, -40, -1};
    public static final int[] A09 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final String[] A0A = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final C24910CPd[][] A0B;
    public static final HashMap A0C = C17880vN.A11();
    public static final HashSet A0D;
    public static final C24910CPd[] A0E;
    public static final C24910CPd[] A0F;
    public static final C24910CPd[] A0G;
    public static final HashMap[] A0H = new HashMap[3];
    public int A00;
    public ByteOrder A01;
    public final HashMap[] A02 = new HashMap[3];
    public final Set A03 = new HashSet(3);

    public int A03(String str, int i) {
        NumberFormatException numberFormatException;
        int i2 = 0;
        do {
            C26005CqM cqM = (C26005CqM) this.A02[i2].get(str);
            if (cqM != null) {
                try {
                    Object A002 = C26005CqM.A00(cqM, this.A01);
                    if (A002 == null) {
                        numberFormatException = new NumberFormatException("NULL can't be converted to a integer value");
                    } else if (A002 instanceof String) {
                        return Integer.parseInt((String) A002);
                    } else {
                        if (A002 instanceof long[]) {
                            long[] jArr = (long[]) A002;
                            if (jArr.length == 1) {
                                return (int) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof int[]) {
                            int[] iArr = (int[]) A002;
                            if (iArr.length == 1) {
                                return iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a integer value");
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        } while (i2 < 3);
        return i;
    }

    static {
        C24910CPd[] cPdArr = new C24910CPd[3];
        A01("Orientation", cPdArr, 274, 3, 0);
        A01("SubIFDPointer", cPdArr, 330, 4, 1);
        A01("ExifIFDPointer", cPdArr, 34665, 4, 2);
        A0G = cPdArr;
        C24910CPd[] cPdArr2 = new C24910CPd[8];
        A01("ExposureTime", cPdArr2, 33434, 5, 0);
        A01("PhotographicSensitivity", cPdArr2, 34855, 3, 1);
        A01("ShutterSpeedValue", cPdArr2, 37377, 10, 2);
        A01("ApertureValue", cPdArr2, 37378, 5, 3);
        A01("FocalLength", cPdArr2, 37386, 5, 4);
        A01("WhiteBalance", cPdArr2, 41987, 3, 5);
        A01("DigitalZoomRatio", cPdArr2, 41988, 5, 6);
        A01("FocalLengthIn35mmFilm", cPdArr2, 41989, 3, 7);
        A0F = cPdArr2;
        A0B = new C24910CPd[][]{cPdArr, cPdArr2, cPdArr};
        C24910CPd[] cPdArr3 = new C24910CPd[2];
        A01("SubIFDPointer", cPdArr3, 330, 4, 0);
        A01("ExifIFDPointer", cPdArr3, 34665, 4, 1);
        A0E = cPdArr3;
        String[] strArr = new String[2];
        strArr[0] = "DigitalZoomRatio";
        A0D = C17900vP.A0I("ExposureTime", strArr, 1);
        Charset forName = Charset.forName("US-ASCII");
        A04 = forName;
        A07 = "Exif\u0000\u0000".getBytes(forName);
        int i = 0;
        while (true) {
            C24910CPd[][] cPdArr4 = A0B;
            if (i < 3) {
                A0H[i] = C17880vN.A11();
                for (C24910CPd cPd : cPdArr4[i]) {
                    C108955ca.A1V(cPd, A0H[i], cPd.A00);
                }
                i++;
            } else {
                C17890vO.A0z(Integer.valueOf(A0E[1].A00), A0C, 1);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fb, code lost:
        if (r18 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fd, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fe, code lost:
        r9 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0200, code lost:
        if (r11 >= 3) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0202, code lost:
        r1 = X.AnonymousClass000.A10();
        X.AnonymousClass000.A1E("The size of tag group[", "]: ", r1, r11);
        android.util.Log.d("ExifReader", X.C17880vN.A0t(r1, r9[r11].size()));
        r12 = X.C17890vO.A0i(r9[r11]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0222, code lost:
        if (r12.hasNext() == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0224, code lost:
        r0 = X.AnonymousClass000.A16(r12);
        r9 = (X.C26005CqM) r0.getValue();
        r1 = new java.lang.Object[3];
        r1[0] = r0.getKey();
        X.BE6.A1H(r9, r1, 1);
        r1[2] = r9.A02(r8.A01);
        X.BE7.A1L("tagName: %s, tagType: %s, tagValue: '%s'", "ExifReader", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0247, code lost:
        r11 = r11 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26120Csi(java.io.InputStream r21) {
        /*
            r20 = this;
            r8 = r20
            r8.<init>()
            r0 = 3
            r7 = 3
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r8.A02 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r7)
            r8.A03 = r0
            java.nio.ByteOrder r11 = java.nio.ByteOrder.BIG_ENDIAN
            r8.A01 = r11
            java.lang.String r19 = "tagName: %s, tagType: %s, tagValue: '%s'"
            java.lang.String r6 = "]: "
            java.lang.String r5 = "The size of tag group["
            r4 = 0
            r9 = 0
        L_0x001e:
            r3 = 2
            r2 = 1
            if (r9 >= r7) goto L_0x002d
            java.util.HashMap[] r1 = r8.A02     // Catch:{ IOException -> 0x024a }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ IOException -> 0x024a }
            r1[r9] = r0     // Catch:{ IOException -> 0x024a }
            int r9 = r9 + 1
            goto L_0x001e
        L_0x002d:
            r1 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x024a }
            r9 = r21
            r0.<init>(r9, r1)     // Catch:{ IOException -> 0x024a }
            r0.mark(r1)     // Catch:{ IOException -> 0x024a }
            byte[] r12 = new byte[r1]     // Catch:{ IOException -> 0x024a }
            r0.read(r12)     // Catch:{ IOException -> 0x024a }
            r0.reset()     // Catch:{ IOException -> 0x024a }
            r10 = 0
        L_0x0042:
            byte[] r1 = A08     // Catch:{ IOException -> 0x024a }
            if (r10 >= r7) goto L_0x0056
            byte r9 = r12[r10]     // Catch:{ IOException -> 0x024a }
            byte r1 = r1[r10]     // Catch:{ IOException -> 0x024a }
            if (r9 == r1) goto L_0x0053
            java.lang.String r0 = "This EXIF util only supports JPEG"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
        L_0x0052:
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x0053:
            int r10 = r10 + 1
            goto L_0x0042
        L_0x0056:
            X.DRH r10 = new X.DRH     // Catch:{ IOException -> 0x024a }
            r10.<init>(r0)     // Catch:{ IOException -> 0x024a }
            boolean r18 = A05     // Catch:{ IOException -> 0x024a }
            if (r18 == 0) goto L_0x006e
            java.lang.String r9 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "getJpegAttributes starting with: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r10, r0, r1)     // Catch:{ IOException -> 0x024a }
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x024a }
        L_0x006e:
            r10.A02 = r11     // Catch:{ IOException -> 0x024a }
            byte r11 = r10.A00()     // Catch:{ IOException -> 0x024a }
            java.lang.String r9 = "Invalid marker: "
            r0 = -1
            if (r11 != r0) goto L_0x01e7
            byte r1 = r10.A00()     // Catch:{ IOException -> 0x024a }
            r0 = -40
            if (r1 != r0) goto L_0x01d7
            r13 = 2
        L_0x0082:
            byte r9 = r10.A00()     // Catch:{ IOException -> 0x024a }
            r0 = -1
            if (r9 != r0) goto L_0x01c2
            int r12 = r13 + 1
            byte r1 = r10.A00()     // Catch:{ IOException -> 0x024a }
            if (r18 == 0) goto L_0x00a9
            java.lang.String r11 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "Found JPEG segment indicator: "
            r9.append(r0)     // Catch:{ IOException -> 0x024a }
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r9)     // Catch:{ IOException -> 0x024a }
            android.util.Log.d(r11, r0)     // Catch:{ IOException -> 0x024a }
        L_0x00a9:
            int r9 = r12 + 1
            r0 = -39
            if (r1 == r0) goto L_0x01f7
            r0 = -38
            if (r1 == r0) goto L_0x01f7
            int r14 = r10.A02()     // Catch:{ IOException -> 0x024a }
            int r14 = r14 - r3
            int r13 = r9 + 2
            if (r18 == 0) goto L_0x00d2
            java.lang.String r11 = "ExifReader"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x024a }
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x024a }
            r9[r4] = r0     // Catch:{ IOException -> 0x024a }
            int r0 = r14 + 2
            X.C17880vN.A1T(r9, r0, r2)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "JPEG segment: %s, (length: %d)"
            X.BE7.A1L(r0, r11, r9)     // Catch:{ IOException -> 0x024a }
        L_0x00d2:
            java.lang.String r0 = "Invalid length"
            if (r14 < 0) goto L_0x01bc
            r0 = -31
            if (r1 != r0) goto L_0x0175
            byte[] r15 = new byte[r14]     // Catch:{ IOException -> 0x024a }
            r10.A06(r15)     // Catch:{ IOException -> 0x024a }
            int r17 = r14 + r13
            byte[] r11 = A07     // Catch:{ IOException -> 0x024a }
            if (r11 == 0) goto L_0x0172
            int r12 = r11.length     // Catch:{ IOException -> 0x024a }
            if (r14 < r12) goto L_0x0172
            r9 = 0
            r16 = 1
        L_0x00eb:
            if (r9 >= r12) goto L_0x00f8
            byte r1 = r15[r9]     // Catch:{ IOException -> 0x024a }
            byte r0 = r11[r9]     // Catch:{ IOException -> 0x024a }
            if (r1 == r0) goto L_0x00f5
            r16 = 0
        L_0x00f5:
            int r9 = r9 + 1
            goto L_0x00eb
        L_0x00f8:
            if (r16 == 0) goto L_0x0172
            byte[] r11 = java.util.Arrays.copyOfRange(r15, r12, r14)     // Catch:{ IOException -> 0x024a }
            int r13 = r13 + r12
            r8.A00 = r13     // Catch:{ IOException -> 0x024a }
            if (r18 == 0) goto L_0x0112
            java.lang.String r9 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "readExifSegment for type: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ IOException -> 0x024a }
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x024a }
        L_0x0112:
            java.io.ByteArrayInputStream r0 = X.BE6.A0h(r11)     // Catch:{ IOException -> 0x024a }
            X.DRH r1 = new X.DRH     // Catch:{ IOException -> 0x024a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x024a }
            int r11 = r11.length     // Catch:{ IOException -> 0x024a }
            short r9 = r1.A04()     // Catch:{ IOException -> 0x024a }
            r0 = 18761(0x4949, float:2.629E-41)
            if (r9 == r0) goto L_0x0134
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r9 != r0) goto L_0x017e
            if (r18 == 0) goto L_0x0131
            java.lang.String r9 = "ExifReader"
            java.lang.String r0 = "readExifSegment: Byte Align MM"
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x024a }
        L_0x0131:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x024a }
            goto L_0x013f
        L_0x0134:
            if (r18 == 0) goto L_0x013d
            java.lang.String r9 = "ExifReader"
            java.lang.String r0 = "readExifSegment: Byte Align II"
            android.util.Log.d(r9, r0)     // Catch:{ IOException -> 0x024a }
        L_0x013d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x024a }
        L_0x013f:
            r8.A01 = r0     // Catch:{ IOException -> 0x024a }
            r1.A02 = r0     // Catch:{ IOException -> 0x024a }
            int r9 = r1.A02()     // Catch:{ IOException -> 0x024a }
            r0 = 42
            if (r9 != r0) goto L_0x01a1
            int r9 = r1.A01()     // Catch:{ IOException -> 0x024a }
            r0 = 8
            if (r9 < r0) goto L_0x0191
            if (r9 >= r11) goto L_0x0191
            int r9 = r9 + -8
            if (r9 <= 0) goto L_0x016f
            int r0 = r1.A03(r9)     // Catch:{ IOException -> 0x024a }
            if (r0 == r9) goto L_0x016f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "Couldn't jump to first Ifd: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r9)     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x016f:
            r8.A00(r1, r4)     // Catch:{ IOException -> 0x024a }
        L_0x0172:
            r13 = r17
            r14 = 0
        L_0x0175:
            int r0 = r10.A03(r14)     // Catch:{ IOException -> 0x024a }
            if (r0 != r14) goto L_0x01b4
            int r13 = r13 + r14
            goto L_0x0082
        L_0x017e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "Invalid byte order: "
            X.BE9.A1J(r0, r1, r9)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x0191:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "Invalid first Ifd offset: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r9)     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "Invalid start code: "
            X.BE9.A1J(r0, r1, r9)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01b4:
            java.lang.String r0 = "Invalid JPEG segment"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01bc:
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01c2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "Invalid marker:"
            r1.append(r0)     // Catch:{ IOException -> 0x024a }
            r0 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.BE9.A0e(r0, r1)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ IOException -> 0x024a }
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.BE9.A0e(r0, r1)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)     // Catch:{ IOException -> 0x024a }
            r0 = r11 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x024a }
            java.io.IOException r0 = X.BE9.A0e(r0, r1)     // Catch:{ IOException -> 0x024a }
            goto L_0x0052
        L_0x01f7:
            java.nio.ByteOrder r0 = r8.A01     // Catch:{ IOException -> 0x024a }
            r10.A02 = r0     // Catch:{ IOException -> 0x024a }
            if (r18 == 0) goto L_0x02a1
            r11 = 0
        L_0x01fe:
            java.util.HashMap[] r9 = r8.A02
            if (r11 >= r7) goto L_0x02a1
            java.lang.String r10 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.AnonymousClass000.A1E(r5, r6, r1, r11)
            r0 = r9[r11]
            int r0 = r0.size()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            android.util.Log.d(r10, r0)
            r0 = r9[r11]
            java.util.Iterator r12 = X.C17890vO.A0i(r0)
        L_0x021e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0247
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.Object r9 = r0.getValue()
            X.CqM r9 = (X.C26005CqM) r9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.getKey()
            r1[r4] = r0
            X.BE6.A1H(r9, r1, r2)
            java.nio.ByteOrder r0 = r8.A01
            java.lang.String r0 = r9.A02(r0)
            r1[r3] = r0
            r0 = r19
            X.BE7.A1L(r0, r10, r1)
            goto L_0x021e
        L_0x0247:
            int r11 = r11 + 1
            goto L_0x01fe
        L_0x024a:
            r1 = move-exception
            boolean r0 = A05     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x02a1
            java.lang.String r11 = "ExifReader"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r11, r0, r1)     // Catch:{ all -> 0x02a2 }
            r10 = 0
        L_0x0257:
            java.util.HashMap[] r9 = r8.A02
            if (r10 >= r7) goto L_0x02a1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.AnonymousClass000.A1E(r5, r6, r1, r10)
            r0 = r9[r10]
            int r0 = r0.size()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            android.util.Log.d(r11, r0)
            r0 = r9[r10]
            java.util.Iterator r12 = X.C17890vO.A0i(r0)
        L_0x0275:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x029e
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.Object r9 = r0.getValue()
            X.CqM r9 = (X.C26005CqM) r9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.getKey()
            r1[r4] = r0
            X.BE6.A1H(r9, r1, r2)
            java.nio.ByteOrder r0 = r8.A01
            java.lang.String r0 = r9.A02(r0)
            r1[r3] = r0
            r0 = r19
            X.BE7.A1L(r0, r11, r1)
            goto L_0x0275
        L_0x029e:
            int r10 = r10 + 1
            goto L_0x0257
        L_0x02a1:
            return
        L_0x02a2:
            r13 = move-exception
            boolean r0 = A05
            if (r0 == 0) goto L_0x02f4
            r11 = 0
        L_0x02a8:
            java.util.HashMap[] r9 = r8.A02
            if (r11 >= r7) goto L_0x02f4
            java.lang.String r10 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.AnonymousClass000.A1E(r5, r6, r1, r11)
            r0 = r9[r11]
            int r0 = r0.size()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            android.util.Log.d(r10, r0)
            r0 = r9[r11]
            java.util.Iterator r12 = X.C17890vO.A0i(r0)
        L_0x02c8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02f1
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.Object r9 = r0.getValue()
            X.CqM r9 = (X.C26005CqM) r9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.getKey()
            r1[r4] = r0
            X.BE6.A1H(r9, r1, r2)
            java.nio.ByteOrder r0 = r8.A01
            java.lang.String r0 = r9.A02(r0)
            r1[r3] = r0
            r0 = r19
            X.BE7.A1L(r0, r10, r1)
            goto L_0x02c8
        L_0x02f1:
            int r11 = r11 + 1
            goto L_0x02a8
        L_0x02f4:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26120Csi.<init>(java.io.InputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r12 == r2) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (r12 == 7) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.DRH r24, int r25) {
        /*
            r23 = this;
            r22 = r23
            r0 = r22
            java.util.Set r0 = r0.A03
            r21 = r0
            r8 = r24
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r21
            r0.add(r1)
            int r0 = r8.A00
            r14 = 2
            int r0 = r0 + 2
            int r7 = r8.A03
            if (r0 > r7) goto L_0x0274
            short r6 = r8.A04()
            boolean r20 = A05
            if (r20 == 0) goto L_0x0035
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "numberOfDirectoryEntry: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)
            android.util.Log.d(r2, r0)
        L_0x0035:
            int r1 = r8.A00
            int r0 = r6 * 12
            int r1 = r1 + r0
            if (r1 > r7) goto L_0x0274
            if (r6 <= 0) goto L_0x0274
            r13 = 0
            r19 = 0
        L_0x0041:
            r3 = 1
            r0 = r19
            if (r0 >= r6) goto L_0x022b
            int r16 = r8.A02()
            int r12 = r8.A02()
            int r11 = r8.A01()
            int r0 = r8.A00
            long r4 = (long) r0
            r0 = 4
            long r4 = r4 + r0
            java.util.HashMap[] r0 = A0H
            r0 = r0[r25]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            java.lang.Object r9 = r0.get(r10)
            X.CPd r9 = (X.C24910CPd) r9
            r2 = 0
            if (r20 == 0) goto L_0x0086
            java.lang.String r15 = "ExifReader"
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = r25
            X.C17880vN.A1T(r1, r0, r13)
            r1[r3] = r10
            if (r9 == 0) goto L_0x0079
            java.lang.String r2 = r9.A02
        L_0x0079:
            r1[r14] = r2
            X.C17890vO.A1G(r1, r12)
            X.AnonymousClass3Ma.A1T(r1, r11)
            java.lang.String r0 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            X.BE7.A1L(r0, r15, r1)
        L_0x0086:
            if (r9 != 0) goto L_0x00a6
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Skip the tag entry since tag number is not defined: "
            r0 = r16
            java.lang.String r0 = X.AnonymousClass001.A1I(r2, r3, r0)
        L_0x0098:
            android.util.Log.d(r1, r0)
        L_0x009b:
            r8.A05(r4)
        L_0x009e:
            int r0 = r19 + 1
            short r0 = (short) r0
            r19 = r0
            r14 = 2
            r13 = 0
            goto L_0x0041
        L_0x00a6:
            if (r12 <= 0) goto L_0x0212
            int[] r15 = A09
            r0 = 14
            if (r12 >= r0) goto L_0x0212
            int r1 = r9.A01
            r0 = 7
            if (r1 == r0) goto L_0x00c3
            if (r12 == r0) goto L_0x00c6
            if (r1 == r12) goto L_0x00c3
            r0 = 4
            r2 = 3
            if (r1 == r0) goto L_0x00c1
            r0 = 9
            if (r1 != r0) goto L_0x01f9
            r2 = 8
        L_0x00c1:
            if (r12 != r2) goto L_0x01f9
        L_0x00c3:
            r0 = 7
            if (r12 != r0) goto L_0x00c7
        L_0x00c6:
            r12 = r1
        L_0x00c7:
            long r2 = (long) r11
            r0 = r15[r12]
            long r0 = (long) r0
            long r2 = r2 * r0
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x01e8
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x01e8
            r13 = 4
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            int r13 = r8.A01()
            if (r20 == 0) goto L_0x00f4
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()
            java.lang.String r0 = "seek to data offset: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r14, r13)
            android.util.Log.d(r1, r0)
        L_0x00f4:
            long r0 = (long) r13
            long r17 = r0 + r2
            long r14 = (long) r7
            int r16 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x01b4
            r8.A05(r0)
        L_0x00ff:
            java.util.HashMap r0 = A0C
            java.lang.Number r10 = X.C108945cZ.A1D(r10, r0)
            if (r20 == 0) goto L_0x011e
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "nextIfdType: "
            r13.append(r0)
            r13.append(r10)
            java.lang.String r0 = " byteCount: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r13, r2)
            android.util.Log.d(r1, r0)
        L_0x011e:
            if (r10 == 0) goto L_0x0195
            r0 = 3
            if (r12 == r0) goto L_0x0179
            r0 = 4
            if (r12 == r0) goto L_0x0170
            r0 = 8
            if (r12 == r0) goto L_0x017e
            r0 = 9
            if (r12 == r0) goto L_0x016b
            r0 = 13
            if (r12 == r0) goto L_0x016b
            r2 = -1
        L_0x0134:
            if (r20 == 0) goto L_0x0149
            java.lang.String r12 = "ExifReader"
            java.lang.Object[] r11 = X.AnonymousClass3MW.A1b()
            X.C17890vO.A1L(r11, r2)
            java.lang.String r1 = r9.A02
            r0 = 1
            r11[r0] = r1
            java.lang.String r0 = "Offset: %d, tagName: %s"
            X.BE7.A1L(r0, r12, r11)
        L_0x0149:
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0184
            long r0 = (long) r7
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0184
            int r1 = (int) r2
            r0 = r21
            boolean r0 = X.C108965cb.A1b(r0, r1)
            if (r0 != 0) goto L_0x01c5
            r8.A05(r2)
            int r1 = r10.intValue()
            r0 = r22
            r0.A00(r8, r1)
            goto L_0x009b
        L_0x016b:
            int r0 = r8.A01()
            goto L_0x0182
        L_0x0170:
            int r0 = r8.A01()
            long r2 = X.BE7.A0C(r0)
            goto L_0x0134
        L_0x0179:
            int r0 = r8.A02()
            goto L_0x0182
        L_0x017e:
            short r0 = r8.A04()
        L_0x0182:
            long r2 = (long) r0
            goto L_0x0134
        L_0x0184:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip jump into the IFD since its offset is invalid: "
            r9.append(r0)
            r9.append(r2)
            goto L_0x01e2
        L_0x0195:
            int r0 = (int) r2
            byte[] r0 = new byte[r0]
            r8.A06(r0)
            X.CqM r2 = new X.CqM
            r2.<init>(r0, r12, r11)
            r0 = r22
            java.util.HashMap[] r0 = r0.A02
            r1 = r0[r25]
            java.lang.String r0 = r9.A02
            r1.put(r0, r2)
            int r0 = r8.A00
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x009e
            goto L_0x009b
        L_0x01b4:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since data offset is invalid: "
            r9.append(r0)
            r9.append(r13)
            goto L_0x01e2
        L_0x01c5:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip jump into the IFD since it has already been read: IfdType "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r0 = " (at "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = ")"
            r9.append(r0)
        L_0x01e2:
            java.lang.String r0 = r9.toString()
            goto L_0x0098
        L_0x01e8:
            if (r20 == 0) goto L_0x009b
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since the number of components is invalid: "
            r1.append(r0)
            r1.append(r11)
            goto L_0x0222
        L_0x01f9:
            if (r20 == 0) goto L_0x009b
            java.lang.String r1 = "ExifReader"
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String[] r0 = A0A
            r0 = r0[r12]
            r3[r13] = r0
            java.lang.String r2 = r9.A02
            r0 = 1
            r3[r0] = r2
            java.lang.String r0 = "Skip the tag entry since data format (%s) is unexpected for tag: %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            goto L_0x0098
        L_0x0212:
            if (r20 == 0) goto L_0x009b
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Skip the tag entry since data format is invalid: "
            r1.append(r0)
            r1.append(r12)
        L_0x0222:
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto L_0x009b
        L_0x022b:
            int r0 = r8.A00
            int r0 = r0 + 4
            if (r0 > r7) goto L_0x0274
            int r5 = r8.A01()
            if (r20 == 0) goto L_0x0243
            java.lang.String r2 = "ExifReader"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.C17880vN.A1T(r1, r5, r13)
            java.lang.String r0 = "nextIfdOffset: %d"
            X.BE7.A1L(r0, r2, r1)
        L_0x0243:
            long r1 = (long) r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0263
            if (r5 >= r7) goto L_0x0263
            r0 = r21
            boolean r0 = X.C108965cb.A1b(r0, r5)
            if (r0 != 0) goto L_0x0258
            r8.A05(r1)
            return
        L_0x0258:
            if (r20 == 0) goto L_0x0274
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x026d
        L_0x0263:
            if (r20 == 0) goto L_0x0274
            java.lang.String r2 = "ExifReader"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x026d:
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            android.util.Log.d(r2, r0)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26120Csi.A00(X.DRH, int):void");
    }

    public static void A01(String str, Object[] objArr, int i, int i2, int i3) {
        objArr[i3] = new C24910CPd(str, i, i2);
    }

    public double A02(String str) {
        NumberFormatException numberFormatException;
        int i = 0;
        do {
            C26005CqM cqM = (C26005CqM) this.A02[i].get(str);
            if (cqM != null) {
                try {
                    Object A002 = C26005CqM.A00(cqM, this.A01);
                    if (A002 == null) {
                        numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                    } else if (A002 instanceof String) {
                        return Double.parseDouble((String) A002);
                    } else {
                        if (A002 instanceof long[]) {
                            long[] jArr = (long[]) A002;
                            if (jArr.length == 1) {
                                return (double) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof int[]) {
                            int[] iArr = (int[]) A002;
                            if (iArr.length == 1) {
                                return (double) iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof double[]) {
                            double[] dArr = (double[]) A002;
                            if (dArr.length == 1) {
                                return dArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A002 instanceof C25055CVj[]) {
                            C25055CVj[] cVjArr = (C25055CVj[]) A002;
                            if (cVjArr.length == 1) {
                                C25055CVj cVj = cVjArr[0];
                                return ((double) cVj.A01) / ((double) cVj.A00);
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a double value");
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return -1.0d;
                }
            } else {
                i++;
            }
        } while (i < 3);
        return -1.0d;
    }
}

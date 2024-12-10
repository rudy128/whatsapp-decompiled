package X;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.74C  reason: invalid class name */
public class AnonymousClass74C {
    public static final byte[] A04 = "%FDF-".getBytes();
    public static final byte[] A05 = "%PDF-".getBytes();
    public static final byte[] A06 = "endobj".getBytes();
    public static final byte[] A07 = " obj".getBytes();
    public static final byte[] A08 = "stream".getBytes();
    public static final String[] A09 = {"/RichMedia", "/JS", "/JavaScript", "/AA", "/Launch", "/RichMediaInstance"};
    public int A00;
    public boolean A01;
    public final C132136mG A02 = new C132136mG();
    public final File A03;

    public static boolean A04(int i) {
        return i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 40 || i == 41 || i == -1;
    }

    public static boolean A05(int i) {
        return i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw new X.AnonymousClass6SQ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r7 = this;
            r5 = 0
            r7.A00 = r5
            r7.A01 = r5
            java.io.File r0 = r7.A03
            java.io.FileInputStream r0 = X.C108945cZ.A18(r0)
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            r3.<init>(r0)
            X.6mG r6 = r7.A02     // Catch:{ all -> 0x0051 }
            byte[] r4 = r6.A01     // Catch:{ all -> 0x0051 }
            java.util.Arrays.fill(r4, r5)     // Catch:{ all -> 0x0051 }
            r2 = 0
        L_0x0018:
            int r0 = r3.read()     // Catch:{ all -> 0x0051 }
            if (r0 < 0) goto L_0x004b
            byte r1 = (byte) r0     // Catch:{ all -> 0x0051 }
            int r0 = r6.A00     // Catch:{ all -> 0x0051 }
            r4[r0] = r1     // Catch:{ all -> 0x0051 }
            int r1 = r0 + 1
            r6.A00 = r1     // Catch:{ all -> 0x0051 }
            r0 = 200(0xc8, float:2.8E-43)
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x0051 }
            byte[] r0 = A05     // Catch:{ all -> 0x0051 }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0043
            byte[] r0 = A04     // Catch:{ all -> 0x0051 }
            boolean r0 = r6.A00(r0)     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0043
            int r2 = r2 + 1
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 >= r0) goto L_0x004b
            goto L_0x0018
        L_0x0043:
            r0 = 1
            r7.A01(r3, r5, r0)     // Catch:{ all -> 0x0051 }
            r3.close()
            return
        L_0x004b:
            X.6SQ r0 = new X.6SQ     // Catch:{ all -> 0x0051 }
            r0.<init>()     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0056:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74C.A08():void");
    }

    public static void A00(InputStream inputStream, int i) {
        int read;
        if (i > 500) {
            throw new AnonymousClass6SQ();
        }
        do {
            read = inputStream.read();
        } while (A05(read));
        if (read != -1) {
            while (true) {
                if (read == 40) {
                    while (true) {
                        int read2 = inputStream.read();
                        if (read2 != 92) {
                            if (read2 == 41 || read2 == -1) {
                                break;
                            }
                        } else {
                            inputStream.read();
                        }
                    }
                } else if (read == 60) {
                    do {
                    } while (inputStream.read() != 62);
                } else if (read == 91) {
                    A00(inputStream, i + 1);
                } else if (read == 93 || read == -1) {
                    return;
                }
                read = inputStream.read();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.6QW, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.io.InputStream r10, int r11, boolean r12) {
        /*
            r9 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r11 <= r0) goto L_0x000a
            X.6SQ r0 = new X.6SQ
            r0.<init>()
            throw r0
        L_0x000a:
            int r0 = r10.read()
            r3 = -1
            if (r0 == r3) goto L_0x001b
            if (r12 == 0) goto L_0x001c
            byte[] r0 = A07
            boolean r0 = r9.A06(r10, r0)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            int r2 = r10.read()
            boolean r0 = A05(r2)
            if (r0 != 0) goto L_0x001c
            if (r2 != r3) goto L_0x0029
            return
        L_0x0029:
            if (r2 == r3) goto L_0x00b0
            r1 = 60
            if (r2 != r1) goto L_0x00aa
            int r0 = r10.read()
            if (r0 != r1) goto L_0x00aa
            int r0 = r11 + 1
            java.util.HashMap r5 = r9.A07(r10, r0)
        L_0x003b:
            r9.A03(r5)
            if (r2 == r3) goto L_0x001b
            java.lang.String r0 = "/Type"
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r0 = "/Pages"
            boolean r0 = r0.equals(r2)
            java.lang.String r6 = "pdfparser/numberformat/"
            r7 = 82
            r3 = 1
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "/Parent"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "/Count"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0081
            java.lang.String r4 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x009a
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            if (r0 != r7) goto L_0x009a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "pdfparser/indirectpagecount/"
            X.C17900vP.A0f(r0, r4, r1)
        L_0x0081:
            java.lang.String r0 = "/Length"
            java.lang.String r8 = X.C108945cZ.A1G(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            int r0 = r8.length()
            int r0 = r0 - r3
            char r0 = r8.charAt(r0)
            if (r0 == r7) goto L_0x00bf
            goto L_0x00b2
        L_0x009a:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00a1 }
            r9.A00 = r0     // Catch:{ NumberFormatException -> 0x00a1 }
            goto L_0x0081
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = X.C17900vP.A0A(r6, r4)
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0081
        L_0x00aa:
            int r2 = r10.read()
            goto L_0x0029
        L_0x00b0:
            r5 = 0
            goto L_0x003b
        L_0x00b2:
            int r6 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x00b7 }
            goto L_0x00c0
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = X.C17900vP.A0A(r6, r8)
            com.whatsapp.util.Log.i(r0, r1)
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            java.lang.String r0 = "/ObjStm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x010c
            byte[] r0 = A08
            r9.A06(r10, r0)
            int r1 = r10.read()
            r0 = 13
            if (r1 != r0) goto L_0x00d8
            r10.read()
        L_0x00d8:
            X.6QW r2 = new X.6QW
            r2.<init>()
            r2.A01 = r10
            r2.A00 = r6
            java.lang.String r0 = "/Filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "/FlateDecode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x010c
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
            r0.<init>(r2)     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
            r2.<init>(r0)     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
            int r0 = r11 + 1
            r9.A01(r2, r0, r4)     // Catch:{ all -> 0x0102 }
            r2.close()     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
            goto L_0x0119
        L_0x0102:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
        L_0x010b:
            throw r1     // Catch:{ ZipException -> 0x0111, IOException -> 0x0122 }
        L_0x010c:
            long r0 = (long) r6
            r10.skip(r0)
            goto L_0x0119
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput marking file as suspicious"
            com.whatsapp.util.Log.e(r0, r1)
            r9.A01 = r3
        L_0x0119:
            if (r12 == 0) goto L_0x000a
            byte[] r0 = A06
            r9.A06(r10, r0)
            goto L_0x000a
        L_0x0122:
            r1 = move-exception
            java.lang.String r0 = "pdfparser/parseInput "
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74C.A01(java.io.InputStream, int, boolean):void");
    }

    private void A03(Map map) {
        if (map != null) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A02(C17880vN.A0x(A16));
                Object value = A16.getValue();
                if (value instanceof String) {
                    A02((String) value);
                } else if (value instanceof Map) {
                    A03((Map) value);
                }
            }
        }
    }

    private boolean A06(InputStream inputStream, byte[] bArr) {
        C132136mG r3 = this.A02;
        byte[] bArr2 = r3.A01;
        Arrays.fill(bArr2, (byte) 0);
        do {
            int read = inputStream.read();
            if (read < 0) {
                return false;
            }
            byte b = (byte) read;
            int i = r3.A00;
            bArr2[i] = b;
            int i2 = i + 1;
            r3.A00 = i2;
            r3.A00 = i2 % 200;
        } while (!r3.A00(bArr));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r5 == 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r1.append(r0);
        r5 = r8.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (A04(r5) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (A05(r5) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r4 = r1.toString().trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        r0 = (char) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A07(java.io.InputStream r8, int r9) {
        /*
            r7 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r9 > r0) goto L_0x00c6
            java.util.HashMap r2 = X.C17880vN.A11()
        L_0x0008:
            int r5 = r8.read()
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x0024
        L_0x0019:
            int r5 = r8.read()
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            r6 = -1
            if (r5 == r6) goto L_0x0031
            r1 = 62
            if (r5 != r1) goto L_0x0032
            int r0 = r8.read()
            if (r0 != r1) goto L_0x0032
        L_0x0031:
            return r2
        L_0x0032:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
        L_0x0036:
            char r0 = (char) r5
            r3.append(r0)
            int r5 = r8.read()
            boolean r0 = A04(r5)
            if (r0 != 0) goto L_0x004a
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x0036
        L_0x004a:
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x005b
        L_0x0050:
            int r5 = r8.read()
            boolean r0 = A05(r5)
            if (r0 == 0) goto L_0x005b
            goto L_0x0050
        L_0x005b:
            if (r5 == r6) goto L_0x0031
            r0 = 40
            r4 = 0
            if (r5 == r0) goto L_0x00a2
            r0 = 60
            if (r5 == r0) goto L_0x00b5
            r0 = 91
            if (r5 == r0) goto L_0x009c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 47
            if (r5 != r0) goto L_0x0079
        L_0x0072:
            r1.append(r0)
            int r5 = r8.read()
        L_0x0079:
            boolean r0 = A04(r5)
            if (r0 == 0) goto L_0x009a
            boolean r0 = A05(r5)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = r1.toString()
            java.lang.String r4 = r0.trim()
        L_0x008d:
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r0.trim()
            r2.put(r0, r4)
            goto L_0x0013
        L_0x009a:
            char r0 = (char) r5
            goto L_0x0072
        L_0x009c:
            int r0 = r9 + 1
            A00(r8, r0)
            goto L_0x00c1
        L_0x00a2:
            int r1 = r8.read()
            r0 = 92
            if (r1 != r0) goto L_0x00ae
            r8.read()
            goto L_0x00a2
        L_0x00ae:
            r0 = 41
            if (r1 == r0) goto L_0x00c1
            if (r1 != r6) goto L_0x00a2
            goto L_0x00c1
        L_0x00b5:
            int r5 = r8.read()
            if (r5 != r0) goto L_0x008d
            int r0 = r9 + 1
            java.util.HashMap r4 = r7.A07(r8, r0)
        L_0x00c1:
            int r5 = r8.read()
            goto L_0x008d
        L_0x00c6:
            X.6SQ r0 = new X.6SQ
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74C.A07(java.io.InputStream, int):java.util.HashMap");
    }

    public AnonymousClass74C(File file) {
        this.A03 = file;
    }

    private void A02(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            if (str.charAt(0) == '/' && str.indexOf(35) >= 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                int length = str.length();
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt != '#' || i > length - 3) {
                        A10.append(charAt);
                    } else {
                        try {
                            A10.append((char) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                            i += 2;
                        } catch (NumberFormatException unused) {
                            A10.append(charAt);
                        }
                    }
                    i++;
                }
                str = A10.toString();
            }
        }
        String[] strArr = A09;
        int i2 = 0;
        do {
            if (strArr[i2].equals(str)) {
                this.A01 = true;
                C17900vP.A0f("pdfparser/checkname pdf contains suspicious name ", str, AnonymousClass000.A10());
            }
            i2++;
        } while (i2 < 6);
    }
}

package X;

import java.io.File;
import java.util.zip.ZipFile;

/* renamed from: X.8Qs  reason: invalid class name and case insensitive filesystem */
public class C162488Qs extends AnonymousClass3BQ {
    public AnonymousClass8Qo[] A00;
    public final AnonymousClass1AE A01;
    public final File A02;
    public final ZipFile A03;
    public final /* synthetic */ AnonymousClass1AF A04;
    public final /* synthetic */ AnonymousClass1AF A05;

    public C162488Qs(AnonymousClass1AF r3, AnonymousClass1AF r4) {
        this.A04 = r3;
        this.A05 = r3;
        this.A03 = new ZipFile(r3.A00);
        this.A01 = r4;
        this.A02 = C108945cZ.A17(r3.A03.getApplicationInfo().nativeLibraryDir);
    }

    public final AnonymousClass3BP A01() {
        return new AnonymousClass8Qq(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass8Qo[] A02() {
        /*
            r14 = this;
            X.8Qo[] r6 = r14.A00
            if (r6 != 0) goto L_0x0146
            java.util.LinkedHashSet r5 = X.C17880vN.A14()
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.String r0 = "^lib/([^/]+)/([^/]+\\.so)$"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r0)
            java.lang.String[] r7 = X.C62732rs.A02()
            java.util.zip.ZipFile r0 = r14.A03
            java.util.Enumeration r9 = r0.entries()
        L_0x001c:
            boolean r0 = r9.hasMoreElements()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r6 = r9.nextElement()
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6
            java.lang.String r0 = r6.getName()
            java.util.regex.Matcher r1 = r8.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            java.lang.String r4 = r1.group(r0)
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r1 = 0
        L_0x0041:
            int r0 = r7.length
            if (r1 >= r0) goto L_0x001c
            r0 = r7[r1]
            if (r0 == 0) goto L_0x0068
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0068
            if (r1 < 0) goto L_0x001c
            r5.add(r4)
            java.lang.Object r0 = r3.get(r2)
            X.8Qo r0 = (X.AnonymousClass8Qo) r0
            if (r0 == 0) goto L_0x005f
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x001c
        L_0x005f:
            X.8Qo r0 = new X.8Qo
            r0.<init>(r2, r6, r1)
            r3.put(r2, r0)
            goto L_0x001c
        L_0x0068:
            int r1 = r1 + 1
            goto L_0x0041
        L_0x006b:
            X.1AE r1 = r14.A01
            int r0 = r5.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.A01 = r0
            java.util.Collection r1 = r3.values()
            int r0 = r3.size()
            X.8Qo[] r0 = new X.AnonymousClass8Qo[r0]
            java.lang.Object[] r4 = r1.toArray(r0)
            X.8Qo[] r4 = (X.AnonymousClass8Qo[]) r4
            java.util.Arrays.sort(r4)
            r3 = 0
            r7 = 0
            r2 = 0
        L_0x0091:
            int r5 = r4.length
            if (r7 >= r5) goto L_0x0133
            r0 = r4[r7]
            java.util.zip.ZipEntry r1 = r0.A01
            java.lang.String r5 = r0.A01
            java.lang.String r10 = r1.getName()
            X.1AF r6 = r14.A04
            java.lang.String r0 = r6.A00
            boolean r0 = r5.equals(r0)
            r12 = 1
            if (r0 == 0) goto L_0x00c6
            r0 = 0
            r6.A00 = r0
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r3] = r5
            java.lang.String r0 = "allowing consideration of corrupted lib %s"
        L_0x00b2:
            java.lang.String r1 = java.lang.String.format(r0, r8)
        L_0x00b6:
            java.lang.String r0 = "ApkSoSource"
            android.util.Log.d(r0, r1)
            if (r12 == 0) goto L_0x00c2
            int r2 = r2 + 1
        L_0x00bf:
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00c2:
            r0 = 0
            r4[r7] = r0
            goto L_0x00bf
        L_0x00c6:
            java.io.File r0 = r14.A02
            java.io.File r13 = X.C17880vN.A0e(r0, r5)
            r11 = 3
            r9 = 2
            java.lang.String r6 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x010d }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x010d }
            boolean r0 = r6.startsWith(r0)     // Catch:{ IOException -> 0x010d }
            if (r0 != 0) goto L_0x00e7
            java.lang.String r1 = "not allowing consideration of %s: %s not in lib dir"
            java.lang.Object[] r0 = X.C108945cZ.A1a(r10, r5, r9, r12)     // Catch:{ IOException -> 0x010d }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ IOException -> 0x010d }
            goto L_0x0131
        L_0x00e7:
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L_0x00f4
            java.lang.Object[] r8 = X.C108945cZ.A1a(r10, r5, r9, r12)
            java.lang.String r0 = "allowing consideration of %s: %s not in system lib dir"
            goto L_0x00b2
        L_0x00f4:
            long r5 = r13.length()
            long r0 = r1.getSize()
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x011f
            java.lang.Object[] r8 = new java.lang.Object[r11]
            r8[r3] = r13
            X.AnonymousClass3MX.A1S(r8, r12, r5)
            X.AnonymousClass3MX.A1S(r8, r9, r0)
            java.lang.String r0 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK"
            goto L_0x00b2
        L_0x010d:
            r0 = move-exception
            java.lang.Object[] r1 = X.C108945cZ.A1a(r10, r5, r11, r12)
            java.lang.String r0 = r0.toString()
            r1[r9] = r0
            java.lang.String r0 = "not allowing consideration of %s: %s, IOException when constructing path: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            goto L_0x0131
        L_0x011f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "not allowing consideration of "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ": deferring to libdir"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0131:
            r12 = 0
            goto L_0x00b6
        L_0x0133:
            X.8Qo[] r6 = new X.AnonymousClass8Qo[r2]
            r2 = 0
        L_0x0136:
            if (r3 >= r5) goto L_0x0144
            r1 = r4[r3]
            if (r1 == 0) goto L_0x0141
            int r0 = r2 + 1
            r6[r2] = r1
            r2 = r0
        L_0x0141:
            int r3 = r3 + 1
            goto L_0x0136
        L_0x0144:
            r14.A00 = r6
        L_0x0146:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162488Qs.A02():X.8Qo[]");
    }

    public void close() {
        this.A03.close();
    }

    public final C182379Ud A00() {
        return new C182379Ud(A02());
    }
}

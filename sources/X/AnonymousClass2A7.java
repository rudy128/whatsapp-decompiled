package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.soloader.SysUtil$Api14Utils;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2A7  reason: invalid class name */
public class AnonymousClass2A7 extends AnonymousClass1AB {
    public final File A00;
    public final Map A01 = C17880vN.A11();
    public final Set A02;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r12 = new X.C65332wE(r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.getElfDependencies[", r9, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r13 = X.AnonymousClass1AS.A02(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
        r11 = r13.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r4 >= r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r2 = r13[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r2.startsWith("/") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        X.AnonymousClass1A8.A05(r18, r2, (java.lang.String) null, (java.lang.String) null, r6 | 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(android.os.StrictMode.ThreadPolicy r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r6 = r20
            X.19u r0 = X.AnonymousClass1A8.A04
            if (r0 == 0) goto L_0x00e6
            r5 = r17
            java.util.Set r0 = r5.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x000e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.String r7 = X.C17880vN.A0v(r16)
            java.util.Map r0 = r5.A01
            java.lang.Object r1 = r0.get(r7)
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r8 = " not found on "
            java.lang.String r3 = "SoLoader"
            r9 = r19
            if (r0 != 0) goto L_0x00af
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x00af
            java.lang.String r14 = "/"
            java.io.File r0 = r5.A00
            java.util.zip.ZipFile r10 = new java.util.zip.ZipFile
            r10.<init>(r0)
            java.util.Enumeration r4 = r10.entries()     // Catch:{ all -> 0x00da }
        L_0x0041:
            boolean r0 = r4.hasMoreElements()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r2 = r4.nextElement()     // Catch:{ all -> 0x00da }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x0041
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = X.C17900vP.A0A(r14, r9)     // Catch:{ all -> 0x00da }
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0041
            X.2wE r12 = new X.2wE     // Catch:{ all -> 0x00da }
            r12.<init>(r2, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r9, r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String[] r13 = X.AnonymousClass1AS.A02(r12)     // Catch:{ all -> 0x00bc }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x00c1 }
            int r11 = r13.length     // Catch:{ all -> 0x00c1 }
            r4 = 0
        L_0x0072:
            if (r4 >= r11) goto L_0x0087
            r2 = r13[r4]     // Catch:{ all -> 0x00c1 }
            boolean r0 = r2.startsWith(r14)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x0084
            r1 = r6 | 1
            r0 = 0
            r15 = r18
            X.AnonymousClass1A8.A05(r15, r2, r0, r0, r1)     // Catch:{ all -> 0x00c1 }
        L_0x0084:
            int r4 = r4 + 1
            goto L_0x0072
        L_0x0087:
            r12.close()     // Catch:{ all -> 0x00da }
        L_0x008a:
            r10.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)     // Catch:{ UnsatisfiedLinkError -> 0x009f }
            java.lang.String r0 = java.io.File.separator     // Catch:{ UnsatisfiedLinkError -> 0x009f }
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r9, r1)     // Catch:{ UnsatisfiedLinkError -> 0x009f }
            r6 = r6 | 4
            X.19u r0 = X.AnonymousClass1A8.A04     // Catch:{ UnsatisfiedLinkError -> 0x009f }
            r0.Bhe(r1, r6)     // Catch:{ UnsatisfiedLinkError -> 0x009f }
            goto L_0x00cb
        L_0x009f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r9, r8, r7)
            java.lang.String r0 = " flag: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)
            android.util.Log.w(r3, r0, r2)
            goto L_0x000e
        L_0x00af:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r9, r8, r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
            goto L_0x000e
        L_0x00bc:
            r0 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00da }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            java.lang.String r0 = " found on "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r1)
            android.util.Log.d(r3, r0)
            r0 = 1
            return r0
        L_0x00da:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00df }
            throw r1
        L_0x00df:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00e4:
            r0 = 0
            return r0
        L_0x00e6:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2A7.A02(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    public AnonymousClass2A7(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        this.A02 = A00(lastIndexOf > 0 ? name.substring(0, lastIndexOf) : name, file.getAbsolutePath());
        this.A00 = file;
    }

    public static HashSet A00(String str, String str2) {
        HashSet A12 = C17880vN.A12();
        String A002 = SysUtil$Api14Utils.A00();
        if (A002 != null) {
            for (String str3 : A002.split(":")) {
                if (str3.contains(AnonymousClass000.A0y(".apk!/", AnonymousClass000.A11(str)))) {
                    A12.add(str3);
                }
            }
        }
        if (A12.isEmpty()) {
            String[] A022 = C62732rs.A02();
            if (!TextUtils.isEmpty(str2) && A022.length > 0) {
                StringBuilder A11 = AnonymousClass000.A11(str2);
                A11.append("!/lib/");
                String A0y = AnonymousClass000.A0y(A022[0], A11);
                if (A0y != null) {
                    A12.add(A0y);
                }
            }
        }
        return A12;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C17890vO.A0U(this));
        A10.append("[root = ");
        A10.append(this.A02.toString());
        return C17890vO.A0c(A10, ']');
    }

    public AnonymousClass2A7(Context context) {
        String str = context.getApplicationInfo().sourceDir;
        this.A02 = A00("", str);
        this.A00 = new File(str);
    }
}

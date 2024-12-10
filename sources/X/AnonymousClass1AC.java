package X;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1AC  reason: invalid class name */
public class AnonymousClass1AC extends AnonymousClass1AB {
    public final File A00;
    public final int A01;
    public final List A02;

    public int A02(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        return A04(threadPolicy, this.A00, str, i);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.1AR, X.1AQ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
        r1 = new java.lang.StringBuilder();
        r1.append("Loading ");
        r1.append(r2);
        r1.append("'s dependencies: ");
        r1.append(java.util.Arrays.toString(r9));
        android.util.Log.d("SoLoader", r1.toString());
        r8 = r9.length;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        if (r7 >= r8) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f7, code lost:
        r6 = r9[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ff, code lost:
        if (r6.startsWith("/") != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0101, code lost:
        r2 = r6.substring(3, r6.indexOf(46));
        r1 = X.AnonymousClass1AM.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        if (r1 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0114, code lost:
        r6 = java.lang.System.mapLibraryName(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0118, code lost:
        X.AnonymousClass1A8.A04(r14, r6, r2, r1, r17 | 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0136 A[SYNTHETIC, Splitter:B:44:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0140 A[Catch:{ UnsatisfiedLinkError -> 0x0154, all -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(android.os.StrictMode.ThreadPolicy r14, java.io.File r15, java.lang.String r16, int r17) {
        /*
            r13 = this;
            X.19u r0 = X.AnonymousClass1A8.A04
            if (r0 == 0) goto L_0x018c
            java.util.List r0 = r13.A02
            r2 = r16
            boolean r0 = r0.contains(r2)
            r6 = 0
            java.lang.String r3 = "SoLoader"
            if (r0 == 0) goto L_0x002d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = " is on the denyList, skip loading from "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
            return r6
        L_0x002d:
            java.io.File r0 = r13.A00
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r2)
            boolean r0 = r4.exists()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x0175
            r1.append(r2)
            java.lang.String r0 = " found on "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
            r5 = r17
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0077
            int r0 = r13.A01
            r12 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0077
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = " loaded implicitly"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
        L_0x0076:
            return r12
        L_0x0077:
            int r0 = r13.A01
            r12 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x007f
            r6 = 1
        L_0x007f:
            java.lang.String r0 = r4.getName()
            boolean r11 = r0.equals(r2)
            r10 = 0
            if (r6 != 0) goto L_0x008c
            if (r11 != 0) goto L_0x0120
        L_0x008c:
            X.1AR r8 = new X.1AR     // Catch:{ all -> 0x016e }
            r8.<init>()     // Catch:{ all -> 0x016e }
            r8.A00 = r4     // Catch:{ all -> 0x016e }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x016e }
            r0.<init>(r4)     // Catch:{ all -> 0x016e }
            r8.A01 = r0     // Catch:{ all -> 0x016e }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x016e }
            r8.A02 = r0     // Catch:{ all -> 0x016e }
            r10 = r8
            if (r6 == 0) goto L_0x0120
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r2, r0)     // Catch:{ all -> 0x016e }
            r7 = 0
        L_0x00ab:
            java.lang.String[] r9 = X.AnonymousClass1AS.A02(r8)     // Catch:{ ClosedByInterruptException -> 0x00b0 }
            goto L_0x00d0
        L_0x00b0:
            r6 = move-exception
            int r7 = r7 + 1
            r0 = 4
            if (r7 > r0) goto L_0x014e
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x014f }
            java.lang.String r1 = "MinElf"
            java.lang.String r0 = "retrying extract_DT_NEEDED due to ClosedByInterruptException"
            android.util.Log.e(r1, r0, r6)     // Catch:{ all -> 0x014f }
            java.io.File r1 = r8.A00     // Catch:{ all -> 0x014f }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x014f }
            r0.<init>(r1)     // Catch:{ all -> 0x014f }
            r8.A01 = r0     // Catch:{ all -> 0x014f }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x014f }
            r8.A02 = r0     // Catch:{ all -> 0x014f }
            goto L_0x00ab
        L_0x00d0:
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r1.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "Loading "
            r1.append(r0)     // Catch:{ all -> 0x016e }
            r1.append(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "'s dependencies: "
            r1.append(r0)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = java.util.Arrays.toString(r9)     // Catch:{ all -> 0x016e }
            r1.append(r0)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x016e }
            int r8 = r9.length     // Catch:{ all -> 0x016e }
            r7 = 0
        L_0x00f5:
            if (r7 >= r8) goto L_0x0134
            r6 = r9[r7]     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "/"
            boolean r0 = r6.startsWith(r0)     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x011d
            r0 = 46
            int r1 = r6.indexOf(r0)     // Catch:{ all -> 0x016e }
            r0 = 3
            java.lang.String r2 = r6.substring(r0, r1)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = X.AnonymousClass1AM.A00(r2)     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x0114
            r2 = 0
            goto L_0x0118
        L_0x0114:
            java.lang.String r6 = java.lang.System.mapLibraryName(r1)     // Catch:{ all -> 0x016e }
        L_0x0118:
            r0 = r17 | 1
            X.AnonymousClass1A8.A04(r14, r6, r2, r1, r0)     // Catch:{ all -> 0x016e }
        L_0x011d:
            int r7 = r7 + 1
            goto L_0x00f5
        L_0x0120:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r1.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "Not resolving dependencies for "
            r1.append(r0)     // Catch:{ all -> 0x016e }
            r1.append(r2)     // Catch:{ all -> 0x016e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x016e }
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x016e }
        L_0x0134:
            if (r11 == 0) goto L_0x0140
            X.19u r1 = X.AnonymousClass1A8.A04     // Catch:{ UnsatisfiedLinkError -> 0x0154 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0154 }
            r1.Bhe(r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0154 }
            goto L_0x0148
        L_0x0140:
            X.19u r0 = X.AnonymousClass1A8.A04     // Catch:{ UnsatisfiedLinkError -> 0x0154 }
            r4.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0154 }
            r0.Bhi()     // Catch:{ UnsatisfiedLinkError -> 0x0154 }
        L_0x0148:
            if (r10 == 0) goto L_0x0076
            r10.close()
            return r12
        L_0x014e:
            throw r6     // Catch:{ all -> 0x014f }
        L_0x014f:
            r0 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x0154:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x016e }
            java.lang.String r0 = "bad ELF magic"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "Corrupted lib file detected"
            android.util.Log.d(r3, r0)     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x016b
            r10.close()
        L_0x016b:
            r0 = 3
            return r0
        L_0x016d:
            throw r2     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            if (r10 == 0) goto L_0x0193
            r10.close()
            throw r0
        L_0x0175:
            r1.append(r2)
            java.lang.String r0 = " not found on "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r3, r0)
            return r6
        L_0x018c:
            java.lang.String r1 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
        L_0x0193:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AC.A04(android.os.StrictMode$ThreadPolicy, java.io.File, java.lang.String, int):int");
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A00.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A00.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.A01);
        sb.append(']');
        return sb.toString();
    }

    public AnonymousClass1AC(File file, String[] strArr, int i) {
        this.A00 = file;
        this.A01 = i;
        this.A02 = Arrays.asList(strArr);
    }
}

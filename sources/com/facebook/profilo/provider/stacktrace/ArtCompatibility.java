package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass1A8;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference((Object) null);

    public static native boolean nativeCheck(int i);

    static {
        AnonymousClass1A8.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        if (r1.equals("5.0.2") != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        r5 = nativeCheck(androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (r1.equals("5.1.1") != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        r5 = nativeCheck(androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c5, code lost:
        if (r1.equals("6.0.1") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c7, code lost:
        r5 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
        if (r1.equals("7.0.0") != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d4, code lost:
        r5 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r1.equals("7.1.0") != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r5 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012c, code lost:
        if (r1.equals("9.0.0") != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012e, code lost:
        r5 = nativeCheck(16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0134, code lost:
        r2 = X.C108945cZ.A19(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0139, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013b, code lost:
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013d, code lost:
        if (r5 == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013f, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0160, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0169, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 0
            r0 = 28
            if (r1 > r0) goto L_0x016a
            java.util.concurrent.atomic.AtomicReference r3 = sIsCompatible
            java.lang.Object r0 = r3.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0016
            boolean r5 = r0.booleanValue()
        L_0x0015:
            return r5
        L_0x0016:
            java.io.File r4 = r7.getFilesDir()     // Catch:{ IOException -> 0x016a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x016a }
            java.lang.String r0 = "ProfiloArtUnwindcCompat_"
            r2.append(r0)     // Catch:{ IOException -> 0x016a }
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x016a }
            java.io.File r4 = X.AnonymousClass8BW.A0X(r4, r1, r2)     // Catch:{ IOException -> 0x016a }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0042
            java.io.FileInputStream r2 = X.C108945cZ.A18(r4)     // Catch:{ IOException -> 0x016a }
            int r1 = r2.read()     // Catch:{ all -> 0x015b }
            r0 = 49
            boolean r5 = X.AnonymousClass000.A1T(r1, r0)
            r2.close()     // Catch:{ IOException -> 0x016a }
            goto L_0x0147
        L_0x0042:
            int r0 = r1.hashCode()     // Catch:{ IOException -> 0x016a }
            r2 = 16
            switch(r0) {
                case 57: goto L_0x004d;
                case 52407: goto L_0x0057;
                case 52408: goto L_0x0060;
                case 53368: goto L_0x0069;
                case 54329: goto L_0x0072;
                case 54330: goto L_0x007b;
                case 56251: goto L_0x0084;
                case 50364602: goto L_0x008e;
                case 50364603: goto L_0x0097;
                case 50365562: goto L_0x00a7;
                case 50365563: goto L_0x00b0;
                case 51288123: goto L_0x00bf;
                case 52211643: goto L_0x00cc;
                case 52212604: goto L_0x00db;
                case 52212605: goto L_0x00ea;
                case 52212606: goto L_0x00f9;
                case 53135164: goto L_0x0108;
                case 53136125: goto L_0x0117;
                case 54058685: goto L_0x0126;
                default: goto L_0x004b;
            }     // Catch:{ IOException -> 0x016a }
        L_0x004b:
            goto L_0x0139
        L_0x004d:
            java.lang.String r0 = "9"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x012e
        L_0x0057:
            java.lang.String r0 = "5.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x009f
        L_0x0060:
            java.lang.String r0 = "5.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x00b8
        L_0x0069:
            java.lang.String r0 = "6.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x00c7
        L_0x0072:
            java.lang.String r0 = "7.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x00d4
        L_0x007b:
            java.lang.String r0 = "7.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x00e3
        L_0x0084:
            java.lang.String r0 = "9.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x012e
        L_0x008e:
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x009f
        L_0x0097:
            java.lang.String r0 = "5.0.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
        L_0x009f:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x00a7:
            java.lang.String r0 = "5.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            goto L_0x00b8
        L_0x00b0:
            java.lang.String r0 = "5.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
        L_0x00b8:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x00bf:
            java.lang.String r0 = "6.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
        L_0x00c7:
            boolean r5 = nativeCheck(r2)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x00cc:
            java.lang.String r0 = "7.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
        L_0x00d4:
            r0 = 32
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x00db:
            java.lang.String r0 = "7.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
        L_0x00e3:
            r0 = 64
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x00ea:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            r0 = 128(0x80, float:1.794E-43)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x00f9:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            r0 = 256(0x100, float:3.59E-43)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x0108:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x0117:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0134
        L_0x0126:
            java.lang.String r0 = "9.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016a }
            if (r0 == 0) goto L_0x0139
        L_0x012e:
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016a }
        L_0x0134:
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r4)     // Catch:{ IOException -> 0x016a }
            goto L_0x013b
        L_0x0139:
            r5 = 0
            goto L_0x0134
        L_0x013b:
            r0 = 48
            if (r5 == 0) goto L_0x0141
            r0 = 49
        L_0x0141:
            r2.write(r0)     // Catch:{ all -> 0x0160 }
            r2.close()     // Catch:{ IOException -> 0x016a }
        L_0x0147:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x016a }
            r0 = 0
            boolean r0 = X.AnonymousClass00N.A00(r0, r1, r3)     // Catch:{ IOException -> 0x016a }
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x016a }
            boolean r5 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IOException -> 0x016a }
            return r5
        L_0x015b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0165 }
            goto L_0x0169
        L_0x0160:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0165 }
            goto L_0x0169
        L_0x0165:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x016a }
        L_0x0169:
            throw r1     // Catch:{ IOException -> 0x016a }
        L_0x016a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }
}

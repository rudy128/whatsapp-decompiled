package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass1A8;
import com.facebook.profilo.logger.MultiBufferLogger;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(MultiBufferLogger multiBufferLogger, int i, boolean z, boolean z2, int i2, int i3, boolean z3);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeStopProfiling();

    static {
        AnonymousClass1A8.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        if (r2.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r2.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008f, code lost:
        if (r2.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0091, code lost:
        r1 = androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        if (r2.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        r1 = androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a6, code lost:
        if (r2.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a8, code lost:
        r1 = 16384;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean init(android.content.Context r5, com.facebook.profilo.logger.MultiBufferLogger r6, boolean r7, boolean r8, int r9, int r10, boolean r11) {
        /*
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r3 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r3)
            boolean r0 = sInitialized     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x000a:
            boolean r0 = com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(r5)     // Catch:{ all -> 0x00c2 }
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00c2 }
            int r0 = r2.hashCode()     // Catch:{ all -> 0x00c2 }
            switch(r0) {
                case 57: goto L_0x00a0;
                case 52407: goto L_0x0094;
                case 52408: goto L_0x0089;
                case 53368: goto L_0x007e;
                case 54329: goto L_0x0073;
                case 54330: goto L_0x0068;
                case 56251: goto L_0x0065;
                case 50364602: goto L_0x0062;
                case 50364603: goto L_0x005f;
                case 50365562: goto L_0x005c;
                case 50365563: goto L_0x0059;
                case 51288123: goto L_0x0056;
                case 52212604: goto L_0x0053;
                case 52212605: goto L_0x0048;
                case 52212606: goto L_0x003d;
                case 53135164: goto L_0x0032;
                case 53136125: goto L_0x0027;
                case 54058685: goto L_0x0024;
                default: goto L_0x001a;
            }     // Catch:{ all -> 0x00c2 }
        L_0x001a:
            r2 = r1 | 512(0x200, float:7.175E-43)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c2 }
            r0 = 29
            if (r1 < r0) goto L_0x00ae
            goto L_0x00ac
        L_0x0024:
            java.lang.String r0 = "9.0.0"
            goto L_0x00a2
        L_0x0027:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x001a
        L_0x0032:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x001a
        L_0x003d:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x001a
        L_0x0048:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x001a
        L_0x0053:
            java.lang.String r0 = "7.1.0"
            goto L_0x006a
        L_0x0056:
            java.lang.String r0 = "6.0.1"
            goto L_0x0080
        L_0x0059:
            java.lang.String r0 = "5.1.1"
            goto L_0x008b
        L_0x005c:
            java.lang.String r0 = "5.1.0"
            goto L_0x008b
        L_0x005f:
            java.lang.String r0 = "5.0.2"
            goto L_0x0096
        L_0x0062:
            java.lang.String r0 = "5.0.1"
            goto L_0x0096
        L_0x0065:
            java.lang.String r0 = "9.0"
            goto L_0x00a2
        L_0x0068:
            java.lang.String r0 = "7.1"
        L_0x006a:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 64
            goto L_0x001a
        L_0x0073:
            java.lang.String r0 = "7.0"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 32
            goto L_0x001a
        L_0x007e:
            java.lang.String r0 = "6.0"
        L_0x0080:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 16
            goto L_0x001a
        L_0x0089:
            java.lang.String r0 = "5.1"
        L_0x008b:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x001a
        L_0x0094:
            java.lang.String r0 = "5.0"
        L_0x0096:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x001a
        L_0x00a0:
            java.lang.String r0 = "9"
        L_0x00a2:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x001a
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x001a
        L_0x00ac:
            r2 = r2 | 4
        L_0x00ae:
            sAvailableTracers = r2     // Catch:{ all -> 0x00c2 }
            int r5 = sAvailableTracers     // Catch:{ all -> 0x00c2 }
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            boolean r0 = nativeInitialize(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c2 }
            sInitialized = r0     // Catch:{ all -> 0x00c2 }
            boolean r0 = sInitialized     // Catch:{ all -> 0x00c2 }
            monitor-exit(r3)
            return r0
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.init(android.content.Context, com.facebook.profilo.logger.MultiBufferLogger, boolean, boolean, int, int, boolean):boolean");
    }
}

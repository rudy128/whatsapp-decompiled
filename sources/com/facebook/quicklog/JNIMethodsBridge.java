package com.facebook.quicklog;

public class JNIMethodsBridge {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r8 = r8 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void markerPoint(int r7, int r8, java.lang.String r9, java.lang.String[] r10, int r11, long r12, boolean r14, com.facebook.quicklog.QuickPerformanceLogger r15) {
        /*
            if (r15 == 0) goto L_0x0104
            int r5 = r10.length
            int r0 = r5 % 3
            if (r0 != 0) goto L_0x0104
            com.facebook.quicklog.MarkerEditor r0 = r15.withMarker(r7, r8)
            r0.withLevel(r11)
            com.facebook.quicklog.PointEditor r0 = r0.pointEditor(r9)
            com.facebook.quicklog.PointEditor r0 = r0.pointCustomTimestamp(r12)
            com.facebook.quicklog.PointEditor r9 = r0.pointShouldIncludeMetadata(r14)
            r8 = 0
        L_0x001b:
            if (r8 >= r5) goto L_0x00fd
            r7 = r10[r8]
            int r0 = r8 + 1
            r1 = r10[r0]
            int r0 = r8 + 2
            r2 = r10[r0]
            int r0 = r2.hashCode()
            switch(r0) {
                case 49: goto L_0x00ee;
                case 50: goto L_0x00de;
                case 51: goto L_0x00ce;
                case 52: goto L_0x00ba;
                case 53: goto L_0x00a8;
                case 54: goto L_0x0085;
                case 55: goto L_0x0062;
                case 56: goto L_0x003c;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Type entry is not supported: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r2, r1)
            throw r0
        L_0x003c:
            java.lang.String r0 = "8"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r6 = r1.split(r0)
            int r4 = r6.length
            boolean[] r3 = new boolean[r4]
            r2 = 0
        L_0x004e:
            if (r2 >= r4) goto L_0x005d
            java.lang.String r1 = "1"
            r0 = r6[r2]
            boolean r0 = r1.equals(r0)
            r3[r2] = r0
            int r2 = r2 + 1
            goto L_0x004e
        L_0x005d:
            r9.addPointData((java.lang.String) r7, (boolean[]) r3)
            goto L_0x00f9
        L_0x0062:
            java.lang.String r0 = "7"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r6 = r1.split(r0)
            int r4 = r6.length
            double[] r3 = new double[r4]
            r2 = 0
        L_0x0074:
            if (r2 >= r4) goto L_0x0081
            r0 = r6[r2]
            double r0 = java.lang.Double.parseDouble(r0)
            r3[r2] = r0
            int r2 = r2 + 1
            goto L_0x0074
        L_0x0081:
            r9.addPointData((java.lang.String) r7, (double[]) r3)
            goto L_0x00f9
        L_0x0085:
            java.lang.String r0 = "6"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r6 = r1.split(r0)
            int r4 = r6.length
            long[] r3 = new long[r4]
            r2 = 0
        L_0x0097:
            if (r2 >= r4) goto L_0x00a4
            r0 = r6[r2]
            long r0 = java.lang.Long.parseLong(r0)
            r3[r2] = r0
            int r2 = r2 + 1
            goto L_0x0097
        L_0x00a4:
            r9.addPointData((java.lang.String) r7, (long[]) r3)
            goto L_0x00f9
        L_0x00a8:
            java.lang.String r0 = "5"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ",,,"
            java.lang.String[] r0 = r1.split(r0)
            r9.addPointData((java.lang.String) r7, (java.lang.String[]) r0)
            goto L_0x00f9
        L_0x00ba:
            java.lang.String r0 = "4"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            r9.addPointData((java.lang.String) r7, (boolean) r0)
            goto L_0x00f9
        L_0x00ce:
            java.lang.String r0 = "3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            double r0 = java.lang.Double.parseDouble(r1)
            r9.addPointData((java.lang.String) r7, (double) r0)
            goto L_0x00f9
        L_0x00de:
            java.lang.String r0 = "2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            long r0 = java.lang.Long.parseLong(r1)
            r9.addPointData((java.lang.String) r7, (long) r0)
            goto L_0x00f9
        L_0x00ee:
            java.lang.String r0 = "1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002e
            r9.addPointData((java.lang.String) r7, (java.lang.String) r1)
        L_0x00f9:
            int r8 = r8 + 3
            goto L_0x001b
        L_0x00fd:
            com.facebook.quicklog.MarkerEditor r0 = r9.pointEditingCompleted()
            r0.markerEditingCompleted()
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicklog.JNIMethodsBridge.markerPoint(int, int, java.lang.String, java.lang.String[], int, long, boolean, com.facebook.quicklog.QuickPerformanceLogger):void");
    }

    public static void markerPoint(int i, int i2, String str, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }

    public static void markerPoint(int i, int i2, String str, String str2, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).addPointData("__key", str2).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }
}

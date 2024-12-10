package com.whatsapp.filter;

import X.AnonymousClass2E5;
import X.C137726vv;
import X.C18070vi;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.util.List;

public final class FilterUtils {
    public static final FilterUtils A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A00(android.graphics.Bitmap r5, X.AnonymousClass2E5 r6, int r7, boolean r8) {
        /*
            r0 = 3
            X.C18070vi.A0d(r6, r0)
            r4 = 0
            if (r5 != 0) goto L_0x000d
            java.lang.String r0 = "FilterUtils/applyFilter/source is null"
        L_0x0009:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x000d:
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r3) goto L_0x0018
            java.lang.String r0 = "Invalid bitmap config."
            goto L_0x0009
        L_0x0018:
            r1 = 0
            if (r7 < 0) goto L_0x002a
            X.0vl r0 = X.C137726vv.A00
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x002a
            r1 = 1
        L_0x002a:
            if (r1 != 0) goto L_0x002f
            java.lang.String r0 = "FilterUtils/applyFilter/filterId is invalid"
            goto L_0x0009
        L_0x002f:
            android.graphics.Bitmap r2 = A01(r6, r7)     // Catch:{ OutOfMemoryError -> 0x003b }
            r0 = 1
            if (r8 != r0) goto L_0x0045
            android.graphics.Bitmap r5 = r5.copy(r3, r0)     // Catch:{ OutOfMemoryError -> 0x003e }
            goto L_0x0045
        L_0x003b:
            r1 = move-exception
            r2 = r4
            goto L_0x003f
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            java.lang.String r0 = "FilterUtils/applyFilter/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            r5 = r4
        L_0x0045:
            if (r5 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            com.whatsapp.filter.FilterUtils r0 = A00
            boolean r0 = r0.applyFilter(r2, r5)
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.recycle()
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            return r5
        L_0x0057:
            r0 = 0
            goto L_0x004f
        L_0x0059:
            if (r8 == 0) goto L_0x0060
            if (r5 == 0) goto L_0x0060
            r5.recycle()
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A00(android.graphics.Bitmap, X.2E5, int, boolean):android.graphics.Bitmap");
    }

    public static final void A02(int i, Bitmap bitmap) {
        C18070vi.A0d(bitmap, 0);
        A00.blurNative(bitmap, i, 2);
    }

    public static final boolean A03(Bitmap bitmap, Bitmap bitmap2, AnonymousClass2E5 r5, int i) {
        String str;
        C18070vi.A0d(r5, 3);
        if (bitmap == null) {
            str = "FilterUtils/applyFilterIntoBuffer/sourceImage is null";
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            str = "Invalid sourceImage config.";
        } else if (bitmap2 == null) {
            str = "FilterUtils/applyFilterIntoBuffer/destinationBuffer is null";
        } else if (i < 0 || i >= ((List) C137726vv.A00.getValue()).size()) {
            str = "FilterUtils/applyFilterIntoBuffer/filterId is invalid";
        } else {
            Log.a(bitmap2.isMutable());
            try {
                FilterUtils filterUtils = A00;
                Bitmap A01 = A01(r5, i);
                if (A01 != null) {
                    boolean applyFilterIntoBuffer = filterUtils.applyFilterIntoBuffer(A01, bitmap, bitmap2);
                    A01.recycle();
                    return applyFilterIntoBuffer;
                }
                return false;
            } catch (OutOfMemoryError e) {
                Log.e("FilterUtils/applyFilterIntoBuffer/OutOfMemoryError", e);
                return false;
            }
        }
        Log.e(str);
        return false;
    }

    private final native boolean applyFilter(Bitmap bitmap, Bitmap bitmap2);

    private final native boolean applyFilterIntoBuffer(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    private final native boolean blurNative(Bitmap bitmap, int i, int i2);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final android.graphics.Bitmap A01(X.AnonymousClass2E5 r5, int r6) {
        /*
            X.6ry r0 = X.C137726vv.A00(r6)
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L_0x000a
            r3 = 0
            return r3
        L_0x000a:
            monitor-enter(r5)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0088 }
            r1.inPreferredConfig = r0     // Catch:{ all -> 0x0088 }
            boolean r0 = r5.A0G()     // Catch:{ all -> 0x0088 }
            r3 = 0
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "FilterManager/Downloadable files are not ready and createLut is called, ui should have prevented calling this"
            X.C88574a9.A03(r0)     // Catch:{ all -> 0x0088 }
            r0 = 0
            r5.A0F(r3, r0)     // Catch:{ all -> 0x0088 }
            monitor-exit(r5)
            return r3
        L_0x0026:
            java.util.HashMap r0 = r5.A0E()     // Catch:{ all -> 0x0088 }
            java.lang.Object r4 = r0.get(r2)     // Catch:{ all -> 0x0088 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0088 }
            if (r4 == 0) goto L_0x0066
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0066
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0050 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0050 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2, r3, r1)     // Catch:{ all -> 0x0046 }
            r2.close()     // Catch:{ IOException -> 0x0050 }
            monitor-exit(r5)
            return r0
        L_0x0046:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0050 }
        L_0x004f:
            throw r1     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "FilterManager/createLut/Could not get bitmap from downloaded file for "
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            X.C17880vN.A1M(r1, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r5)
            return r3
        L_0x0066:
            boolean r0 = r5 instanceof X.AnonymousClass2E5     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0078
            r0 = r5
            X.2E5 r0 = (X.AnonymousClass2E5) r0     // Catch:{ all -> 0x0088 }
            monitor-enter(r5)     // Catch:{ all -> 0x0088 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x0074 }
            r0.clear()     // Catch:{ all -> 0x0074 }
            goto L_0x0077
        L_0x0074:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x0088 }
        L_0x0078:
            r1 = 0
            r0 = -1
            r5.A0A(r1, r0)     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "FilterManager/createLut/Error getting downloaded file to compute bitmap for filterFileName="
            X.C17900vP.A0e(r0, r2, r1)     // Catch:{ all -> 0x0088 }
            monitor-exit(r5)
            return r3
        L_0x0088:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A01(X.2E5, int):android.graphics.Bitmap");
    }
}

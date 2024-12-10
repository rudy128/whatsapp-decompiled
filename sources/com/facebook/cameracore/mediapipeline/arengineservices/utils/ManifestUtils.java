package com.facebook.cameracore.mediapipeline.arengineservices.utils;

import X.AnonymousClass1A8;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;

public final class ManifestUtils {
    public static final ManifestUtils INSTANCE = new Object();
    public static boolean forceSOLoad;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r7.add(r1);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List filterNeededServices(java.lang.String r8, java.lang.String r9, java.util.List r10, X.E94 r11) {
        /*
            r1 = 1
            X.AnonymousClass8BX.A1J(r9, r10, r11, r1)
            boolean r0 = forceSOLoad
            if (r0 != 0) goto L_0x000a
            forceSOLoad = r1
        L_0x000a:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r4 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r4.<init>(r11)
            int r0 = r10.size()
            int[] r3 = new int[r0]
            int r2 = r10.size()
            r1 = 0
        L_0x001e:
            if (r1 >= r2) goto L_0x002d
            java.lang.Object r0 = r10.get(r1)
            X.C0M r0 = (X.C0M) r0
            int r0 = r0.mCppValue
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x001e
        L_0x002d:
            int[] r6 = filterNeededServicesNative(r8, r9, r3, r4)
            int r5 = r6.length
            r4 = 0
        L_0x0033:
            if (r4 >= r5) goto L_0x0059
            r3 = r6[r4]
            java.util.Iterator r2 = r10.iterator()
        L_0x003b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.C0M r0 = (X.C0M) r0
            int r0 = r0.mCppValue
            if (r0 != r3) goto L_0x003b
            if (r1 == 0) goto L_0x0054
            r7.add(r1)
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0054:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0059:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.filterNeededServices(java.lang.String, java.lang.String, java.util.List, X.E94):java.util.List");
    }

    public static final native int[] filterNeededServicesNative(String str, String str2, int[] iArr, ARExperimentConfig aRExperimentConfig);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("arengineservicesutils");
    }
}

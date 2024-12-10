package com.facebook.systrace;

import X.AnonymousClass000;
import X.AnonymousClass1AI;
import X.AnonymousClass1AK;
import X.AnonymousClass3MW;
import X.BEA;
import X.C222919i;
import X.C25665Cjv;
import X.C25927Coq;
import android.util.Log;
import com.facebook.common.util.TriState;

public class TraceDirect {
    public static final boolean sForceJavaImpl = "true".equals(C222919i.A02("debug.fbsystrace.force_java"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sTraceLoad = "true".equals(C222919i.A02("debug.fbsystrace.trace_load"));

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        boolean A1W;
        int i;
        Exception exc;
        AnonymousClass1AI r0;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                Log.i("TraceDirect", "Forcing java implementation.");
                sNativeAvailable = TriState.NO;
            } else {
                Class<AnonymousClass1AK> cls = AnonymousClass1AK.class;
                synchronized (cls) {
                    A1W = AnonymousClass000.A1W(AnonymousClass1AK.A00);
                }
                if (A1W) {
                    synchronized (cls) {
                        r0 = AnonymousClass1AK.A00;
                        if (r0 == null) {
                            throw AnonymousClass000.A0n("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = r0.BZS();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    Object[] A1b = AnonymousClass3MW.A1b();
                    BEA.A1V(A1b, sPrevSoLoaderSourcesVersion, 0, i, 1);
                    String format = String.format("Attempting to load fbsystrace.so [%d|%d].", A1b);
                    if (sTraceLoad) {
                        exc = new Exception();
                    } else {
                        exc = null;
                    }
                    Log.d("TraceDirect", format, exc);
                    try {
                        AnonymousClass1AK.A00("fbsystrace");
                        C25665Cjv cjv = C25927Coq.A01;
                        nativeSetEnabledTags(C222919i.A00("debug.fbsystrace.tags"));
                        nativeBeginSection("fbsystrace.so loaded");
                        nativeEndSection();
                        sNativeAvailable = TriState.YES;
                        Log.i("TraceDirect", "fbsystrace.so loaded.");
                    } catch (UnsatisfiedLinkError unused) {
                        sNativeAvailable = TriState.NO;
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable != TriState.YES) {
            return false;
        }
        return true;
    }
}

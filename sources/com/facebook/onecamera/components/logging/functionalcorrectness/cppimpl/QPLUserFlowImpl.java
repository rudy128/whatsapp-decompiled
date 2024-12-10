package com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl;

import X.AnonymousClass1A8;
import X.AnonymousClass8BR;
import X.AnonymousClass9T5;
import X.AnonymousClass9TA;
import X.B4Z;
import X.C17880vN;
import X.C26294Cx6;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

public class QPLUserFlowImpl {
    public static final String TAG = "QPLUserFlowImpl";
    public final boolean mEnableLazyLoad;
    public HybridData mHybridData;
    public volatile boolean mIsNativeLibLoadedAndInit = false;

    private native void annotateInternal(long j, String str, String str2, boolean z, String str3);

    private native void endCancelInternal(long j, String str, String str2);

    private native void endFailInternal(long j, String str, int i, String str2, String str3);

    private native void endSuccessInternal(long j, String str);

    public static native HybridData initHybrid();

    private native long instanceIdWithStringInternal(int i, String str);

    private native void markPointInternal(long j, int i, String str);

    private native long startInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void startWithFlowInstanceIdInternal(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public void annotate(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, "");
    }

    public void annotateWithCrucialData(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, "");
    }

    private void initNative() {
        if (!this.mIsNativeLibLoadedAndInit) {
            synchronized (this) {
                if (!this.mIsNativeLibLoadedAndInit) {
                    loadSoLibrary();
                    this.mHybridData = initHybrid();
                    this.mIsNativeLibLoadedAndInit = true;
                }
            }
        }
    }

    public static void loadSoLibrary() {
        AnonymousClass1A8.A06("spark-qpluserflow-native");
        C26294Cx6.A02(Float.valueOf(0.0f / 1000000.0f), TAG, "QPLUserFlow load .so spark-qpluserflow-native time = %f ms");
    }

    public void endCancel(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, str2);
    }

    public void endFail(long j, String str, int i, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, str3);
    }

    public void endSuccess(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, str);
    }

    public long getInstanceIdWithString(int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return instanceIdWithStringInternal(i, str);
    }

    public void markPoint(long j, int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, str);
    }

    public long start(int i, B4Z b4z, long j) {
        throw AnonymousClass8BR.A0w("Not yet implemented");
    }

    public void startWithFlowInstanceId(long j, B4Z b4z, long j2) {
        throw AnonymousClass8BR.A0w("Not yet implemented");
    }

    public QPLUserFlowImpl(boolean z) {
        this.mEnableLazyLoad = z;
        synchronized (AnonymousClass9T5.class) {
            if (!UserFlowJNIProvider.isInitialized()) {
                UserFlowLogger userFlowLogger = AnonymousClass9T5.A00;
                if (userFlowLogger == null) {
                    QuickPerformanceLogger A00 = AnonymousClass9TA.A00();
                    if (A00 != null) {
                        userFlowLogger = new UserFlowLoggerImpl(A00, true, false);
                        AnonymousClass9T5.A00 = userFlowLogger;
                    } else {
                        throw C17880vN.A0g();
                    }
                }
                UserFlowJNIProvider.setUserFlowLogger(userFlowLogger);
            }
        }
        if ("robolectric".equals(Build.FINGERPRINT)) {
            this.mHybridData = null;
        } else if (!z) {
            initNative();
        }
    }

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public void annotate(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, str3);
    }

    public void annotateWithCrucialData(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, str3);
    }

    public void endCancel(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, "");
    }

    public void endFail(long j, String str, int i, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, "");
    }

    public void endSuccess(long j) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, "");
    }

    public void markPoint(long j, int i) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, "");
    }

    public long start(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return startInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    public void startWithFlowInstanceId(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        startWithFlowInstanceIdInternal(j, str, str2, str3, str4, str5, str6, str7);
    }
}

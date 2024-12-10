package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.C24317BzE;
import X.C24318BzF;
import X.C26719DAt;
import X.C28423E0o;
import X.C28424E0p;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.Executors;

public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public AndroidAsyncExecutorFactory mAsyncExecutorFactory;
    public C28423E0o mCameraARAnalyticsLogger;
    public final CameraARCrashMetadataLogger mCrashMetadataLogger = new CameraARCrashMetadataLogger();
    public C24317BzE mEffectStartIntent = C24317BzE.NONE;
    public final C24318BzF mOptimizedPerfLoggerOption;
    public String mProductName;

    public native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i);

    public String getEffectStartIntentString() {
        int ordinal = this.mEffectStartIntent.ordinal();
        if (ordinal == 1) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        if (ordinal != 2) {
            return "unknown";
        }
        return "system";
    }

    public String getProductName() {
        return this.mProductName;
    }

    public XAnalyticsHolder getXAnalytics() {
        C28423E0o e0o = this.mCameraARAnalyticsLogger;
        if (e0o != null) {
            return ((C26719DAt) e0o).A02;
        }
        return null;
    }

    public void logSessionEvent(boolean z) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null && !z) {
            cameraARCrashMetadataLogger.cleanupBreakpadData();
        }
    }

    public void setBreakpadData(String str, String str2) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null) {
            cameraARCrashMetadataLogger.setBreakpadData(str, str2);
        }
    }

    public AnalyticsLoggerImpl(C28423E0o e0o, C28424E0p e0p, C24318BzF bzF) {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(Executors.newScheduledThreadPool(1));
        this.mAsyncExecutorFactory = androidAsyncExecutorFactory2;
        this.mCameraARAnalyticsLogger = e0o;
        this.mProductName = ((C26719DAt) e0o).A00;
        this.mOptimizedPerfLoggerOption = bzF;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, bzF.mCppValue);
    }

    public void logForBugReport(String str, String str2) {
    }

    public void logRawEvent(String str, String str2) {
    }
}

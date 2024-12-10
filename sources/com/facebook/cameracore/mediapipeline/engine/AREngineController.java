package com.facebook.cameracore.mediapipeline.engine;

import X.AnonymousClass1A8;
import X.AnonymousClass8BX;
import X.C18070vi;
import X.C24325BzM;
import X.C8Z;
import android.content.res.AssetManager;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.jni.HybridData;
import java.util.List;

public final class AREngineController {
    public static final C8Z Companion = new Object();
    public static volatile boolean isLibraryLoaded;
    public static volatile boolean isLibraryStartLoading;
    public final HybridData mHybridData;

    public AREngineController(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, AndroidAsyncExecutorFactory androidAsyncExecutorFactory2, PluginConfigProvider pluginConfigProvider) {
        AnonymousClass8BX.A1J(assetManager, androidAsyncExecutorFactory, androidAsyncExecutorFactory2, 1);
        synchronized (Companion) {
            if (!isLibraryLoaded) {
                isLibraryStartLoading = true;
                AnonymousClass1A8.A06("filters-native-android");
                isLibraryLoaded = true;
            }
        }
        this.mHybridData = initHybrid(assetManager, androidAsyncExecutorFactory, androidAsyncExecutorFactory2, pluginConfigProvider);
    }

    public static final native HybridData initHybrid(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, AndroidAsyncExecutorFactory androidAsyncExecutorFactory2, PluginConfigProvider pluginConfigProvider);

    private final native boolean renderSessionInit(boolean z, int i, int i2, GPUTimerImpl gPUTimerImpl, HybridLogSink hybridLogSink, boolean z2);

    public final native void cycleDebugOverlaySetup(boolean z);

    public final native boolean doFrame(int i, int i2, int i3, int i4, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, int i5, int i6, boolean z, int i7);

    public final native float getFPS();

    public final native int getFacesCount();

    public final native void onEffectStopped();

    public final native void preloadServices(List list);

    public final native void releaseGl();

    public final boolean renderSessionInit(boolean z, C24325BzM bzM, int i, GPUTimerImpl gPUTimerImpl, HybridLogSink hybridLogSink, boolean z2) {
        C18070vi.A0d(bzM, 1);
        return renderSessionInit(false, bzM.value, 0, (GPUTimerImpl) null, (HybridLogSink) null, false);
    }

    public final native void resetCurrentEffect();

    public final native void resize(int i, int i2);

    public final native void setCameraFacing(int i);

    public final native void setCameraSensorRotation(int i);

    public final native void setEffect(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, List list, List list2, ProductFeatureConfig productFeatureConfig, AsyncAssetFetcher asyncAssetFetcher, ComponentSyncListener componentSyncListener, int i2);

    public final native void setFieldOfViewRadians(float f);

    public final native void setupImageSourceFacet(int i, int i2, int i3, int i4, boolean z);

    public final native void setupServiceHost(EffectServiceHost effectServiceHost);

    public final native void updatePerEffectDebugConfiguration(boolean z, boolean z2, boolean z3, boolean z4);

    public final native void updatePerSessionDebugConfiguration(int i, boolean z, boolean z2, boolean z3);
}

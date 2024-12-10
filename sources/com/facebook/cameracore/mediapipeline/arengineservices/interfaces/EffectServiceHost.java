package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.C17880vN;
import X.C8T;
import X.CPK;
import X.CX6;
import X.CXC;
import X.DB2;
import X.DB3;
import X.DW3;
import X.E94;
import android.content.Context;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EffectServiceHost {
    public final E94 mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public boolean mDestroyed = false;
    public EffectManifest mEffectManifest = new EffectManifest();
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public String mProductSessionId;
    public final C8T mServiceConfigurationHybridBuilder;
    public List mServiceConfigurations = AnonymousClass000.A13();
    public final List mServiceModules;
    public CXC mServicesHostConfiguration;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, C8T c8t, Collection collection, String str, E94 e94) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = c8t;
        this.mServiceModules = C17880vN.A10(collection);
        this.mProductSessionId = null;
        this.mArExperimentUtil = e94;
    }

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new DW3(str, 1));
    }

    public native void cleanupServices();

    public synchronized void destroy() {
        if (!this.mDestroyed) {
            this.mHybridData.resetNative();
            for (ServiceConfiguration destroy : this.mServiceConfigurations) {
                destroy.destroy();
            }
            this.mServiceConfigurations.clear();
            for (ServiceModule serviceModule : this.mServiceModules) {
                serviceModule.mHybridData.resetNative();
            }
            this.mServiceModules.clear();
            this.mDestroyed = true;
        }
    }

    public native void resetServices();

    public native void stopEffect();

    public void updateFrame(DB3 db3, int i, boolean z) {
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        DB3 db32 = db3;
        CX6 cx6 = (CX6) db32.get();
        int i6 = cx6.A03;
        int i7 = cx6.A01;
        CPK[] cpkArr = cx6.A05;
        if (cpkArr != null && (length = cpkArr.length) > 0) {
            CPK cpk = cpkArr[0];
            int i8 = cpk.A01;
            if (i8 == 0) {
                i8 = i6;
            }
            int i9 = cpk.A00;
            if (length > 1) {
                CPK cpk2 = cpkArr[1];
                i2 = cpk2.A01;
                if (i2 == 0) {
                    i2 = i6;
                }
                i3 = cpk2.A00;
                if (length > 2) {
                    CPK cpk3 = cpkArr[2];
                    i4 = cpk3.A01;
                    if (i4 == 0) {
                        i4 = i6;
                    }
                    i5 = cpk3.A00;
                }
                i4 = i6;
                i5 = 0;
            } else {
                i2 = i6;
                i3 = 0;
                i4 = i6;
                i5 = 0;
            }
            int i10 = cx6.A02;
            ByteBuffer byteBuffer3 = cpk.A02;
            if (length > 1) {
                byteBuffer = cpkArr[1].A02;
                if (length > 2) {
                    byteBuffer2 = cpkArr[2].A02;
                }
                byteBuffer2 = null;
            } else {
                byteBuffer = null;
                byteBuffer2 = null;
            }
            long j = cx6.A04;
            int i11 = 0;
            do {
                AtomicInteger atomicInteger = db32.A02;
                int i12 = atomicInteger.get();
                if (i12 == 0) {
                    throw AnonymousClass000.A0n("Trying to lock already released reference.");
                } else if (atomicInteger.compareAndSet(i12, i12 + 1)) {
                    int i13 = i6;
                    int i14 = i7;
                    int i15 = i8;
                    int i16 = i9;
                    nativeUpdateFrame(i13, i14, i15, i16, i2, i3, i4, i5, i, z, i10, byteBuffer3, byteBuffer, byteBuffer2, j, false, (float[]) null, (float[]) null, 0.0f, 0.0d, 0.0d, new DB2(db32));
                    return;
                } else {
                    i11++;
                }
            } while (i11 < 10);
            throw AnonymousClass8BR.A0w("WTF: Could not lock the reference after multiple tries.");
        }
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
    }
}

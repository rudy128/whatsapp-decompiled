package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.C24234Bxo;
import X.C25535ChX;
import X.C26294Cx6;
import X.C26718DAs;
import X.C28422E0n;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus;
import java.util.Iterator;
import java.util.Map;

public class MotionDataSourceWrapper {
    public final C28422E0n mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        if (1 - ((C26718DAs) this.mDataSource).A0M.intValue() != 0) {
            return 0;
        }
        return 1;
    }

    public boolean hasRawData() {
        C26718DAs dAs = (C26718DAs) this.mDataSource;
        if (dAs.A08 == null && dAs.A09 == null && dAs.A0A == null) {
            return false;
        }
        return true;
    }

    public boolean isSensorAvailable(int i) {
        Sensor sensor;
        C26718DAs dAs = (C26718DAs) this.mDataSource;
        if (i == 0) {
            sensor = dAs.A0C;
        } else if (i == 1) {
            sensor = dAs.A06;
        } else if (i == 2) {
            sensor = dAs.A07;
        } else if (i != 3) {
            return false;
        } else {
            sensor = dAs.A0B;
        }
        if (sensor != null) {
            return true;
        }
        return false;
    }

    public void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        if (this.mIsAlive) {
            setData(fArr, fArr2, fArr3, fArr4, j);
        }
    }

    public void onRawSensorMeasurementChanged(C24234Bxo bxo, float[] fArr, long j) {
        if (this.mIsAlive) {
            setRawSensorResult(bxo.mCppValue, fArr, j);
        }
    }

    public void start() {
        RuntimeException th;
        Map map;
        HandlerThread handlerThread;
        C26718DAs dAs = (C26718DAs) this.mDataSource;
        synchronized (dAs) {
            if (!dAs.A04) {
                dAs.A04 = true;
                dAs.A05 = false;
                int intValue = dAs.A0M.intValue();
                if (intValue == 0) {
                    SensorManager sensorManager = dAs.A0K;
                    if (sensorManager != null) {
                        Handler handler = dAs.A03;
                        if (handler == null) {
                            C25535ChX chX = C25535ChX.A02;
                            if (!"SensorMotionDataSource".isEmpty()) {
                                synchronized (chX) {
                                    try {
                                        map = chX.A01;
                                        Iterator A0x = AnonymousClass8BU.A0x(map);
                                        while (true) {
                                            if (A0x.hasNext()) {
                                                if (((Thread) A0x.next()).getName().equals("SensorMotionDataSource")) {
                                                    C26294Cx6.A0G("ThreadPool", "Thread name already exists %s", "SensorMotionDataSource");
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        handlerThread = new HandlerThread("DO_NOT_USE_thread", 0);
                                        handlerThread.setName("SensorMotionDataSource");
                                    } catch (Throwable th2) {
                                        while (true) {
                                            th = th2;
                                            break;
                                        }
                                    }
                                }
                                handlerThread.start();
                                if (handlerThread.isAlive()) {
                                    synchronized (chX) {
                                        try {
                                            map.put(handlerThread, ThreadPoolImpl$LifeStatus.AVAILABLE);
                                        } catch (Throwable th3) {
                                            while (true) {
                                                th = th3;
                                                break;
                                            }
                                        }
                                    }
                                    String name = handlerThread.getName();
                                    if (C26294Cx6.A01.BfN(4)) {
                                        C26294Cx6.A06("ThreadPool", StringFormatUtil.formatStrLocaleSafe("New thread started %s with %s priority", name, 0));
                                    }
                                    handler = new Handler(handlerThread.getLooper(), (Handler.Callback) null);
                                    chX.A00.put(handler, handlerThread);
                                    synchronized (chX) {
                                        try {
                                            map.put(handlerThread, ThreadPoolImpl$LifeStatus.TAKEN);
                                        } catch (Throwable th4) {
                                            while (true) {
                                                th = th4;
                                                break;
                                            }
                                        }
                                    }
                                    C26294Cx6.A03(Integer.valueOf(map.size()), "ThreadPool", "Number of threads in pool: %d");
                                    dAs.A03 = handler;
                                } else {
                                    th = AnonymousClass8BR.A0w("Thread start was unsuccessful");
                                    throw th;
                                }
                            } else {
                                th = AnonymousClass8BR.A0w("Thread name cannot be empty");
                                throw th;
                            }
                        }
                        dAs.A01 = 2;
                        Sensor sensor = dAs.A0C;
                        if (sensor != null) {
                            sensorManager.registerListener(dAs.A0J, sensor, 0, handler);
                        }
                        Sensor sensor2 = dAs.A06;
                        if (sensor2 != null) {
                            sensorManager.registerListener(dAs.A0D, sensor2, 0, dAs.A03);
                        }
                        Sensor sensor3 = dAs.A07;
                        if (sensor3 != null) {
                            sensorManager.registerListener(dAs.A0E, sensor3, 0, dAs.A03);
                        }
                        Sensor sensor4 = dAs.A0B;
                        if (sensor4 != null) {
                            sensorManager.registerListener(dAs.A0I, sensor4, 0, dAs.A03);
                        }
                        Sensor sensor5 = dAs.A08;
                        if (sensor5 != null) {
                            sensorManager.registerListener(dAs.A0F, sensor5, 0, dAs.A03);
                        }
                        Sensor sensor6 = dAs.A09;
                        if (sensor6 != null) {
                            sensorManager.registerListener(dAs.A0G, sensor6, 0, dAs.A03);
                        }
                        Sensor sensor7 = dAs.A0A;
                        if (sensor7 != null) {
                            sensorManager.registerListener(dAs.A0H, sensor7, 0, dAs.A03);
                        }
                    }
                } else if (intValue == 1) {
                    try {
                        Matrix.setIdentityM(dAs.A0S, 0);
                        Matrix.setIdentityM(dAs.A0Q, 0);
                        Matrix.setIdentityM(dAs.A0R, 0);
                        float[] fArr = dAs.A0O;
                        float[] fArr2 = C26718DAs.A0U;
                        fArr[0] = fArr2[0];
                        fArr[1] = fArr2[1];
                        fArr[2] = fArr2[2];
                        float[] fArr3 = dAs.A0P;
                        float[] fArr4 = C26718DAs.A0V;
                        fArr3[0] = fArr4[0];
                        fArr3[1] = fArr4[1];
                        fArr3[2] = fArr4[2];
                        float[] fArr5 = dAs.A0T;
                        float[] fArr6 = C26718DAs.A0W;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                        dAs.A01 = 0;
                        C26718DAs.A00(dAs);
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:59|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00e6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r9 = this;
            X.E0n r2 = r9.mDataSource
            X.DAs r2 = (X.C26718DAs) r2
            monitor-enter(r2)
            boolean r0 = r2.A04     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x010d
            java.lang.Integer r0 = r2.A0M     // Catch:{ all -> 0x010f }
            int r1 = r0.intValue()     // Catch:{ all -> 0x010f }
            r4 = 0
            if (r1 == r4) goto L_0x0044
            r0 = 1
            if (r1 != r0) goto L_0x00a1
            r3 = 0
            r2.A00 = r3     // Catch:{ all -> 0x0041 }
            r1 = 0
            r2.A05 = r4     // Catch:{ all -> 0x0041 }
        L_0x001b:
            float[] r0 = r2.A0S     // Catch:{ all -> 0x0041 }
            r0[r1] = r3     // Catch:{ all -> 0x0041 }
            float[] r0 = r2.A0Q     // Catch:{ all -> 0x0041 }
            r0[r1] = r3     // Catch:{ all -> 0x0041 }
            float[] r0 = r2.A0R     // Catch:{ all -> 0x0041 }
            r0[r1] = r3     // Catch:{ all -> 0x0041 }
            int r1 = r1 + 1
            r0 = 16
            if (r1 < r0) goto L_0x001b
            r3 = 0
        L_0x002e:
            float[] r0 = r2.A0O     // Catch:{ all -> 0x0041 }
            r1 = 0
            r0[r3] = r1     // Catch:{ all -> 0x0041 }
            float[] r0 = r2.A0P     // Catch:{ all -> 0x0041 }
            r0[r3] = r1     // Catch:{ all -> 0x0041 }
            float[] r0 = r2.A0T     // Catch:{ all -> 0x0041 }
            r0[r3] = r1     // Catch:{ all -> 0x0041 }
            int r3 = r3 + 1
            r0 = 3
            if (r3 >= r0) goto L_0x00a1
            goto L_0x002e
        L_0x0041:
            r0 = move-exception
            goto L_0x010c
        L_0x0044:
            android.hardware.SensorManager r1 = r2.A0K     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x00a1
            android.hardware.Sensor r0 = r2.A0C     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0051
            android.hardware.SensorEventListener r0 = r2.A0J     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x0051:
            android.hardware.Sensor r0 = r2.A06     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x005a
            android.hardware.SensorEventListener r0 = r2.A0D     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x005a:
            android.hardware.Sensor r0 = r2.A07     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0063
            android.hardware.SensorEventListener r0 = r2.A0E     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x0063:
            android.hardware.Sensor r0 = r2.A0B     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x006c
            android.hardware.SensorEventListener r0 = r2.A0I     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x006c:
            android.hardware.Sensor r0 = r2.A08     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0075
            android.hardware.SensorEventListener r0 = r2.A0F     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x0075:
            android.hardware.Sensor r0 = r2.A09     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x007e
            android.hardware.SensorEventListener r0 = r2.A0G     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x007e:
            android.hardware.Sensor r0 = r2.A0A     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0087
            android.hardware.SensorEventListener r0 = r2.A0H     // Catch:{ all -> 0x010f }
            r1.unregisterListener(r0)     // Catch:{ all -> 0x010f }
        L_0x0087:
            android.os.Handler r7 = r2.A03     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x00a1
            X.ChX r6 = X.C25535ChX.A02     // Catch:{ all -> 0x010f }
            java.util.Map r5 = r6.A00     // Catch:{ all -> 0x010f }
            java.lang.Object r8 = r5.get(r7)     // Catch:{ all -> 0x010f }
            android.os.HandlerThread r8 = (android.os.HandlerThread) r8     // Catch:{ all -> 0x010f }
            if (r8 != 0) goto L_0x00ab
            java.lang.String r1 = "ThreadPool"
            java.lang.String r0 = "Trying to quit thread not managed by ThreadPool - abort"
            X.C26294Cx6.A07(r1, r0)     // Catch:{ all -> 0x010f }
        L_0x009e:
            r0 = 0
            r2.A03 = r0     // Catch:{ all -> 0x010f }
        L_0x00a1:
            r2.A04 = r4     // Catch:{ all -> 0x010f }
            r2.A05 = r4     // Catch:{ all -> 0x010f }
            java.util.ArrayList r0 = r2.A0N     // Catch:{ all -> 0x010f }
            r0.clear()     // Catch:{ all -> 0x010f }
            goto L_0x010d
        L_0x00ab:
            java.lang.String r3 = "ThreadPool"
            java.lang.String r1 = "Quitting thread %s"
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x010f }
            X.C26294Cx6.A03(r0, r3, r1)     // Catch:{ all -> 0x010f }
            r5.remove(r7)     // Catch:{ all -> 0x010f }
            monitor-enter(r6)     // Catch:{ all -> 0x010f }
            java.util.Map r5 = r6.A01     // Catch:{ all -> 0x010a }
            java.lang.Object r7 = r5.get(r8)     // Catch:{ all -> 0x010a }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r7 = (com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus) r7     // Catch:{ all -> 0x010a }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.TAKEN     // Catch:{ all -> 0x010a }
            if (r7 != r0) goto L_0x00f0
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r1 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.AVAILABLE     // Catch:{ all -> 0x010a }
            r5.put(r8, r1)     // Catch:{ all -> 0x010a }
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x0108 }
            if (r0 != r1) goto L_0x00ea
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.QUITTING     // Catch:{ all -> 0x0108 }
            r5.put(r8, r0)     // Catch:{ all -> 0x0108 }
            r8.quitSafely()     // Catch:{ all -> 0x0108 }
            r5.remove(r8)     // Catch:{ InterruptedException -> 0x00e6 }
            java.lang.String r1 = "Thread %s killed."
            java.lang.String r0 = r8.getName()     // Catch:{ InterruptedException -> 0x00e6 }
            X.C26294Cx6.A03(r0, r3, r1)     // Catch:{ InterruptedException -> 0x00e6 }
            goto L_0x00f9
        L_0x00e6:
            X.AnonymousClass8BS.A0x()     // Catch:{ all -> 0x0108 }
            goto L_0x00f9
        L_0x00ea:
            java.lang.String r0 = "Trying to kill thread that is not AVAILABLE"
            X.C26294Cx6.A07(r3, r0)     // Catch:{ all -> 0x0108 }
            goto L_0x00f9
        L_0x00f0:
            java.lang.String r1 = "Trying to quit thread that is not TAKEN but in %s"
            java.lang.Object[] r0 = X.BE7.A1b(r7)     // Catch:{ all -> 0x010a }
            X.C26294Cx6.A0G(r3, r1, r0)     // Catch:{ all -> 0x010a }
        L_0x00f9:
            monitor-exit(r6)     // Catch:{ all -> 0x010a }
            java.lang.String r1 = "Number of threads in pool: %d"
            int r0 = r5.size()     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010f }
            X.C26294Cx6.A03(r0, r3, r1)     // Catch:{ all -> 0x010f }
            goto L_0x009e
        L_0x0108:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x010a }
        L_0x010c:
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010d:
            monitor-exit(r2)
            return
        L_0x010f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper.stop():void");
    }

    public MotionDataSourceWrapper(C28422E0n e0n) {
        this.mDataSource = e0n;
        ((C26718DAs) e0n).A0N.add(this);
    }
}

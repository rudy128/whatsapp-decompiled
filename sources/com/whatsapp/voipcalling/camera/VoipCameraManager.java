package com.whatsapp.voipcalling.camera;

import X.A0D;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass10T;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass1DC;
import X.AnonymousClass1HQ;
import X.AnonymousClass1VE;
import X.AnonymousClass3MZ;
import X.AnonymousClass7RF;
import X.AnonymousClass8BR;
import X.AnonymousClass9Z3;
import X.B60;
import X.B61;
import X.B62;
import X.B63;
import X.B64;
import X.B65;
import X.C108965cb;
import X.C1594684q;
import X.C175258yP;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C187819gQ;
import X.C188239h6;
import X.C193689qV;
import X.C21137Af8;
import X.C21140AfB;
import X.C24156BwM;
import X.C25791Cm3;
import X.C28597E9o;
import X.C28608E9z;
import X.C40811vJ;
import X.C42171xk;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class VoipCameraManager extends AnonymousClass10T {
    public final C18030ve abProps;
    public Integer cachedCameraCount = null;
    public final AnonymousClass00H callArEffectsGatingUtil;
    public final C28608E9z cameraEventsListener = new C21140AfB(this);
    public final AnonymousClass00H cameraProcessorProvider;
    public B60 captureDeviceFactory;
    public B61 captureDeviceRefreshListener = null;
    public Integer currentApiVersion;
    public volatile VoipPhysicalCamera currentCamera;
    public final C18140vp enableVoiceServiceLevelGlassesService;
    public C28608E9z externalCameraEventsListener = null;
    public C28597E9o glassesService;
    public Integer hammerHeadIdx;
    public final AtomicBoolean hasBeenQueriedByDriver = C108965cb.A0w();
    public volatile Point lastAdjustedCameraPreviewSize;
    public C1594684q mediaProjectionProvider;
    public final AnonymousClass00H mediaStreamLiteCameraCoordinator;
    public B63 onCameraClosedListener = null;
    public B64 onCameraCreatedListener = null;
    public B65 onCameraOpenedListener = null;
    public final SparseArray rawCameraInfoCache = new SparseArray();
    public final AnonymousClass00H screenShareDisplayManager;
    public Integer screenShareIdx;
    public HandlerThread sharedCameraThread;
    public final AnonymousClass1DC systemFeatures;
    public final AnonymousClass11C systemServices;
    public final AnonymousClass1VE voipSharedPreferences;
    public final AnonymousClass118 waContext;
    public final AnonymousClass10I waWorkers;

    /* access modifiers changed from: private */
    public synchronized void closeCurrentCamera(VoipPhysicalCamera voipPhysicalCamera) {
        VoipPhysicalCamera voipPhysicalCamera2 = this.currentCamera;
        C17960vV.A0F(AnonymousClass000.A1Z(voipPhysicalCamera2, voipPhysicalCamera), "attempted to close orphaned camera");
        if (voipPhysicalCamera2 != null) {
            B63 b63 = this.onCameraClosedListener;
            if (b63 != null) {
                C187819gQ lastCachedFrame = voipPhysicalCamera2.getLastCachedFrame();
                boolean z = voipPhysicalCamera2.isBoundToCameraProcessor;
                C21137Af8 af8 = (C21137Af8) b63;
                if (lastCachedFrame != null) {
                    af8.A00.A01.post(new AnonymousClass7RF(af8, C175258yP.A01(lastCachedFrame), 16, z));
                }
            }
            if (voipPhysicalCamera2 != voipPhysicalCamera) {
                voipPhysicalCamera2.removeCameraEventsListener(this.cameraEventsListener);
                voipPhysicalCamera2.close(true);
            }
        }
        voipPhysicalCamera.removeCameraEventsListener(this.cameraEventsListener);
        unregisterDisplayListener();
        this.lastAdjustedCameraPreviewSize = voipPhysicalCamera.getAdjustedPreviewSize();
        this.currentCamera = null;
    }

    private synchronized int getCameraCountInternal() {
        int phoneDeviceCameraCount;
        phoneDeviceCameraCount = getPhoneDeviceCameraCount();
        if (this.systemFeatures.Bfb()) {
            this.screenShareIdx = Integer.valueOf(phoneDeviceCameraCount);
            phoneDeviceCameraCount++;
        } else {
            this.screenShareIdx = null;
        }
        if (C40811vJ.A0T(this.abProps)) {
            int i = phoneDeviceCameraCount + 1;
            this.hammerHeadIdx = Integer.valueOf(phoneDeviceCameraCount);
            phoneDeviceCameraCount = i;
        } else {
            this.hammerHeadIdx = null;
        }
        return phoneDeviceCameraCount;
    }

    private int getCameraInfoCacheKey(int i, int i2) {
        int i3 = i + i2;
        return ((i3 * (i3 + 1)) / 2) + i2;
    }

    public synchronized int getCameraCount(boolean z) {
        Integer num;
        num = this.cachedCameraCount;
        if (num == null || z) {
            num = Integer.valueOf(getCameraCountInternal());
            this.cachedCameraCount = num;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.pjsip.PjCameraInfo getCameraInfo(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 0
            if (r6 < 0) goto L_0x0060
            r3 = 0
            int r0 = r5.getCameraCount(r3)     // Catch:{ all -> 0x006b }
            if (r6 >= r0) goto L_0x0060
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.hasBeenQueriedByDriver     // Catch:{ all -> 0x006b }
            r0 = 1
            r1.compareAndSet(r3, r0)     // Catch:{ all -> 0x006b }
            boolean r0 = r5.isScreenShareDevice(r6)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0034
            X.0ve r2 = r5.abProps     // Catch:{ all -> 0x006b }
            r1 = 4773(0x12a5, float:6.688E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x006b }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x002f
            X.00H r0 = r5.screenShareDisplayManager     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006b }
            X.9h6 r0 = (X.C188239h6) r0     // Catch:{ all -> 0x006b }
            int r0 = r0.A00     // Catch:{ all -> 0x006b }
            int r3 = r0 * 90
        L_0x002f:
            org.pjsip.PjCameraInfo r0 = org.pjsip.PjCameraInfo.createScreenSharingInfo(r3)     // Catch:{ all -> 0x006b }
            goto L_0x003e
        L_0x0034:
            boolean r0 = r5.isHammerheadDevice(r6)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0040
            org.pjsip.PjCameraInfo r0 = org.pjsip.PjCameraInfo.createHammerheadCameraInfo()     // Catch:{ all -> 0x006b }
        L_0x003e:
            monitor-exit(r5)
            return r0
        L_0x0040:
            X.A0D r2 = r5.getRawCameraInfo(r6)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0069
            X.0ve r1 = r5.abProps     // Catch:{ all -> 0x006b }
            X.1VE r0 = r5.voipSharedPreferences     // Catch:{ all -> 0x006b }
            org.pjsip.PjCameraInfo r4 = org.pjsip.PjCameraInfo.createFromRawInfo(r2, r1, r0)     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "voip/VoipCameraManager/getCameraInfo camera "
            r1.append(r0)     // Catch:{ all -> 0x006b }
            r1.append(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = " info: "
            X.C17900vP.A0Y(r4, r0, r1)     // Catch:{ all -> 0x006b }
            goto L_0x0069
        L_0x0060:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "voip/VoipCameraManager/getCameraInfo bad idx: "
            X.C17900vP.A0i(r0, r1, r6)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r5)
            return r4
        L_0x006b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.getCameraInfo(int):org.pjsip.PjCameraInfo");
    }

    public synchronized int getCurrentApiVersion() {
        if (this.currentApiVersion == null) {
            if (!this.systemFeatures.BcY()) {
                return 0;
            }
            this.currentApiVersion = C17880vN.A0h();
            String A03 = this.voipSharedPreferences.A03();
            if (!TextUtils.isEmpty(A03) && C24156BwM.A06(A03, getCachedCam2HardwareLevel())) {
                this.currentApiVersion = C17880vN.A0i();
            }
        }
        Integer num = this.currentApiVersion;
        C17960vV.A07(num);
        return num.intValue();
    }

    public synchronized int getPhoneDeviceCameraCount() {
        int i;
        int currentApiVersion2 = getCurrentApiVersion();
        i = 0;
        if (currentApiVersion2 == 0) {
            i = 1;
        } else if (currentApiVersion2 == 1) {
            i = Camera.getNumberOfCameras();
        } else if (currentApiVersion2 == 2) {
            CameraManager A0B = this.systemServices.A0B();
            if (A0B == null) {
                Log.w("voip/VoipCameraManager/getPhoneDeviceCameraCount, cameraManager is null, can not get camera count");
            } else {
                try {
                    i = A0B.getCameraIdList().length;
                } catch (Exception unused) {
                    Log.w("voip/VoipCameraManager/getPhoneDeviceCameraCount, fail to get cameraIdList");
                }
            }
        }
        return i;
    }

    public synchronized void setCaptureDeviceFactory(B60 b60) {
        this.captureDeviceFactory = b60;
    }

    public synchronized void setCaptureDeviceRefreshListener(B61 b61) {
        this.captureDeviceRefreshListener = b61;
    }

    public synchronized void setCurrentApiVersion(int i) {
        this.currentApiVersion = Integer.valueOf(i);
    }

    public synchronized void setMediaProjectionProvider(C1594684q r2) {
        this.mediaProjectionProvider = r2;
    }

    /* access modifiers changed from: private */
    public void clearStoredRawCameraInfo(int i, int i2) {
        C17880vN.A1B(AnonymousClass3MZ.A08(this.voipSharedPreferences), AnonymousClass1VE.A01(i, i2));
    }

    private boolean isRawCameraInfoValid(int i, A0D a0d) {
        int i2;
        boolean z;
        int i3 = a0d.A00;
        if (i3 == 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.orientation != a0d.A01) {
                    return false;
                }
                i2 = cameraInfo.facing;
                z = a0d.A05;
            } catch (RuntimeException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else if (i3 != 2) {
            return false;
        } else {
            try {
                CameraManager A0B = this.systemServices.A0B();
                if (A0B == null) {
                    return false;
                }
                CameraCharacteristics cameraCharacteristics = A0B.getCameraCharacteristics(Integer.toString(i));
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num2 == null) {
                    Log.w("voip/VoipCameraManager/isRawCameraInfoValid metadata returned null values, invalidating cache");
                    return false;
                } else if (a0d.A01 != num.intValue()) {
                    return false;
                } else {
                    i2 = a0d.A05;
                    z = AnonymousClass000.A1P(num2.intValue());
                }
            } catch (Exception e2) {
                Log.w("voip/VoipCameraManager/isRawCameraInfoValid, camera is unavailable, invalidating info", e2);
                return false;
            }
        }
        if (i2 == z) {
            return true;
        }
        return false;
    }

    private A0D loadFromCameraService(int i) {
        Camera camera;
        ArrayList arrayList;
        C193689qV r8;
        C193689qV r0;
        int currentApiVersion2 = getCurrentApiVersion();
        if (currentApiVersion2 != 0) {
            int i2 = i;
            if (currentApiVersion2 == 1) {
                try {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i2, cameraInfo);
                    camera = Camera.open(i2);
                    try {
                        Camera.Parameters parameters = camera.getParameters();
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("voip/RawCameraInfo camera ");
                        A10.append(i2);
                        A10.append(" params, supported preview formats: {");
                        A10.append(parameters.get("preview-format-values"));
                        A10.append("}, preview format values: ");
                        A10.append(parameters.getSupportedPreviewFormats());
                        A10.append(", supported preview sizes: {");
                        A10.append(parameters.get("preview-size-values"));
                        A10.append("}, preferred preview size: ");
                        A10.append(parameters.get("preferred-preview-size-for-video"));
                        A10.append(", supported fps ranges: {");
                        A10.append(parameters.get("preview-fps-range-values"));
                        C17890vO.A1A(A10, "}");
                        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
                        if (supportedPreviewFormats == null) {
                            Log.e("voip/RawCameraInfo getSupportedPreviewFormats return null");
                            camera.release();
                            return null;
                        }
                        int[] iArr = new int[supportedPreviewFormats.size()];
                        int i3 = 0;
                        for (Integer intValue : supportedPreviewFormats) {
                            iArr[i3] = intValue.intValue();
                            i3++;
                        }
                        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                        if (supportedPreviewSizes != null) {
                            arrayList = AnonymousClass000.A14(supportedPreviewSizes);
                            for (Camera.Size next : supportedPreviewSizes) {
                                if (next != null) {
                                    r0 = new C193689qV(next.width, next.height);
                                } else {
                                    r0 = null;
                                }
                                arrayList.add(r0);
                            }
                        } else {
                            arrayList = null;
                        }
                        Camera.Size preferredPreviewSizeForVideo = parameters.getPreferredPreviewSizeForVideo();
                        if (preferredPreviewSizeForVideo != null) {
                            r8 = new C193689qV(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
                        } else {
                            r8 = null;
                        }
                        A0D a0d = new A0D(r8, arrayList, iArr, 1, cameraInfo.orientation, AnonymousClass000.A1T(cameraInfo.facing, 1), false);
                        camera.release();
                        return a0d;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    camera = null;
                    try {
                        Log.e((Throwable) e);
                        if (camera == null) {
                            return null;
                        }
                        camera.release();
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        if (camera != null) {
                            camera.release();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else if (currentApiVersion2 == 2) {
                return A0D.A00(this.systemServices, i2);
            } else {
                throw AnonymousClass001.A13("unsupported camera api version ", AnonymousClass000.A10(), currentApiVersion2);
            }
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            A13.add(new C193689qV(640, 400));
            return new A0D((C193689qV) null, A13, new int[]{35}, 0, 0, true, false);
        }
    }

    private void registerDisplayListener() {
        C188239h6 r3 = (C188239h6) this.screenShareDisplayManager.get();
        Context context = this.waContext.A00;
        C18070vi.A0d(context, 0);
        if (!r3.A04) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            r3.A02 = displayManager;
            if (displayManager != null) {
                displayManager.registerDisplayListener(r3.A05, C17890vO.A0D());
                r3.A04 = true;
            }
        }
        if (!AnonymousClass112.A0A()) {
            ((C188239h6) this.screenShareDisplayManager.get()).A03 = new AnonymousClass9Z3(this);
        }
    }

    private void unregisterDisplayListener() {
        ((C188239h6) this.screenShareDisplayManager.get()).A03 = null;
        C188239h6 r2 = (C188239h6) this.screenShareDisplayManager.get();
        if (r2.A04) {
            DisplayManager displayManager = r2.A02;
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(r2.A05);
            }
            r2.A04 = false;
        }
    }

    public void addCameraErrorListener(C28608E9z e9z) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.addCameraEventsListener(e9z);
        }
    }

    public boolean canCameraBindToCameraProcessor() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.canBindToCameraProcessor()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022e, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.whatsapp.voipcalling.camera.VoipCamera createCamera(int r29, int r30, int r31, int r32, int r33, long r34) {
        /*
            r28 = this;
            r6 = r28
            monitor-enter(r6)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r4 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            r5 = 0
            r9 = r29
            r10 = r30
            r8 = r31
            r7 = r32
            r0 = r34
            if (r4 == 0) goto L_0x0075
            boolean r2 = r4.useOutputFormatForSecondaryStream()     // Catch:{ all -> 0x0239 }
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "voip/VoipCameraManager/createCamera ignoring input parameters. Caller should query getCameraInfo directly."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0239 }
        L_0x001d:
            com.whatsapp.voipcalling.camera.VoipCamera r3 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x0239 }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0239 }
            goto L_0x022d
        L_0x0024:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r11 = r4.getCameraInfo()     // Catch:{ all -> 0x0239 }
            int r3 = r11.width     // Catch:{ all -> 0x0239 }
            if (r3 != r10) goto L_0x0038
            int r2 = r11.height     // Catch:{ all -> 0x0239 }
            if (r2 != r8) goto L_0x0038
            int r2 = r11.format     // Catch:{ all -> 0x0239 }
            if (r2 != r7) goto L_0x0038
            int r2 = r11.idx     // Catch:{ all -> 0x0239 }
            if (r2 == r9) goto L_0x001d
        L_0x0038:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera camera info doesn't match. Current cam: w/h: "
            r4.append(r0)     // Catch:{ all -> 0x0239 }
            r4.append(r3)     // Catch:{ all -> 0x0239 }
            java.lang.String r3 = "/"
            r4.append(r3)     // Catch:{ all -> 0x0239 }
            int r0 = r11.height     // Catch:{ all -> 0x0239 }
            r4.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r2 = ", format: "
            r4.append(r2)     // Catch:{ all -> 0x0239 }
            int r0 = r11.format     // Catch:{ all -> 0x0239 }
            r4.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r1 = ", idx: "
            r4.append(r1)     // Catch:{ all -> 0x0239 }
            int r0 = r11.idx     // Catch:{ all -> 0x0239 }
            r4.append(r0)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = ". New cam: w/h: "
            X.AnonymousClass000.A1E(r0, r3, r4, r10)     // Catch:{ all -> 0x0239 }
            r4.append(r8)     // Catch:{ all -> 0x0239 }
            r4.append(r2)     // Catch:{ all -> 0x0239 }
            r4.append(r7)     // Catch:{ all -> 0x0239 }
            X.C17900vP.A0i(r1, r4, r9)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x0075:
            boolean r2 = r6.isScreenShareDevice(r9)     // Catch:{ all -> 0x0239 }
            r27 = r33
            if (r2 == 0) goto L_0x00a6
            X.B60 r2 = r6.captureDeviceFactory     // Catch:{ all -> 0x0239 }
            if (r2 != 0) goto L_0x0089
            java.lang.String r1 = "CaptureDeviceFactory must be set to enable screen share device"
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x0089:
            X.84q r2 = r6.mediaProjectionProvider     // Catch:{ all -> 0x0239 }
            if (r2 != 0) goto L_0x0095
            java.lang.String r1 = "MediaProjectionProvider must be set to enable screen share device"
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x0095:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r2 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r2     // Catch:{ all -> 0x0239 }
            android.media.projection.MediaProjection r12 = r2.A01     // Catch:{ all -> 0x0239 }
            r2.A01 = r5     // Catch:{ all -> 0x0239 }
            if (r12 == 0) goto L_0x009f
            goto L_0x01b5
        L_0x009f:
            java.lang.String r0 = "MediaProjection is null, can't start screen share capture"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x00a6:
            boolean r2 = r6.isHammerheadDevice(r9)     // Catch:{ all -> 0x0239 }
            if (r2 == 0) goto L_0x0124
            X.0vp r2 = r6.enableVoiceServiceLevelGlassesService     // Catch:{ all -> 0x0239 }
            boolean r2 = X.C72463Mc.A1Z(r2)     // Catch:{ all -> 0x0239 }
            if (r2 == 0) goto L_0x00b7
            X.E9o r12 = r6.glassesService     // Catch:{ all -> 0x0239 }
            goto L_0x00e2
        L_0x00b7:
            X.00H r2 = r6.mediaStreamLiteCameraCoordinator     // Catch:{ all -> 0x0239 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0239 }
            X.0zA r2 = (X.C19880zA) r2     // Catch:{ all -> 0x0239 }
            boolean r2 = r2.A07()     // Catch:{ all -> 0x0239 }
            if (r2 != 0) goto L_0x00d2
            java.lang.String r1 = "MediaStreamLiteCameraCoordinator is absent in this build. Cannot create Hammerhead camera."
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "Media Stream Lite Camera Coordinator is not present. "
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x00d2:
            X.00H r2 = r6.mediaStreamLiteCameraCoordinator     // Catch:{ all -> 0x0239 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0239 }
            X.0zA r2 = (X.C19880zA) r2     // Catch:{ all -> 0x0239 }
            java.lang.Object r2 = r2.A03()     // Catch:{ all -> 0x0239 }
            X.CLo r2 = (X.C24821CLo) r2     // Catch:{ all -> 0x0239 }
            X.E9o r12 = r2.A00     // Catch:{ all -> 0x0239 }
        L_0x00e2:
            if (r12 != 0) goto L_0x00eb
            java.lang.String r0 = "No valid glasses service for Hammerhead camera. Failing. "
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x00eb:
            X.0ve r11 = r6.abProps     // Catch:{ Exception -> 0x0114 }
            X.1DC r4 = r6.systemFeatures     // Catch:{ Exception -> 0x0114 }
            X.11C r3 = r6.systemServices     // Catch:{ Exception -> 0x0114 }
            X.118 r2 = r6.waContext     // Catch:{ Exception -> 0x0114 }
            android.content.Context r2 = r2.A00     // Catch:{ Exception -> 0x0114 }
            r24 = 1
            com.whatsapp.voipcalling.camera.VoipLiteCamera r14 = new com.whatsapp.voipcalling.camera.VoipLiteCamera     // Catch:{ Exception -> 0x0114 }
            r15 = r11
            r16 = r4
            r17 = r9
            r18 = r10
            r19 = r8
            r20 = r7
            r21 = r27
            r22 = r3
            r23 = r2
            r25 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0114 }
            r2 = 0
            r14.passiveMode = r2     // Catch:{ Exception -> 0x0114 }
            goto L_0x01ef
        L_0x0114:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting Lite Camera. Idx: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r9)     // Catch:{ all -> 0x0239 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x0124:
            X.A0D r2 = r6.getRawCameraInfo(r9)     // Catch:{ RuntimeException -> 0x0231 }
            if (r2 == 0) goto L_0x01ae
            int r3 = r2.A00     // Catch:{ RuntimeException -> 0x0231 }
            if (r3 != 0) goto L_0x0146
            X.0ve r3 = r6.abProps     // Catch:{ RuntimeException -> 0x0231 }
            X.1DC r2 = r6.systemFeatures     // Catch:{ RuntimeException -> 0x0231 }
            X.BwK r14 = new X.BwK     // Catch:{ RuntimeException -> 0x0231 }
            r15 = r3
            r16 = r2
            r17 = r9
            r18 = r10
            r19 = r8
            r20 = r7
            r21 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x0231 }
            goto L_0x01ef
        L_0x0146:
            r2 = 1
            if (r3 != r2) goto L_0x014a
            goto L_0x0179
        L_0x014a:
            X.118 r2 = r6.waContext     // Catch:{ RuntimeException -> 0x0231 }
            android.content.Context r15 = r2.A00     // Catch:{ RuntimeException -> 0x0231 }
            X.0ve r13 = r6.abProps     // Catch:{ RuntimeException -> 0x0231 }
            X.10I r12 = r6.waWorkers     // Catch:{ RuntimeException -> 0x0231 }
            X.1DC r11 = r6.systemFeatures     // Catch:{ RuntimeException -> 0x0231 }
            X.11C r4 = r6.systemServices     // Catch:{ RuntimeException -> 0x0231 }
            X.00H r3 = r6.callArEffectsGatingUtil     // Catch:{ RuntimeException -> 0x0231 }
            X.00H r2 = r6.cameraProcessorProvider     // Catch:{ RuntimeException -> 0x0231 }
            android.os.HandlerThread r16 = r6.getSharedCameraThread()     // Catch:{ RuntimeException -> 0x0231 }
            X.BwM r14 = new X.BwM     // Catch:{ RuntimeException -> 0x0231 }
            r26 = r7
            r18 = r13
            r19 = r11
            r20 = r12
            r21 = r3
            r22 = r2
            r23 = r9
            r24 = r10
            r25 = r8
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x0231 }
            r2 = 0
            goto L_0x01ab
        L_0x0179:
            X.0ve r12 = r6.abProps     // Catch:{ RuntimeException -> 0x0231 }
            X.1DC r11 = r6.systemFeatures     // Catch:{ RuntimeException -> 0x0231 }
            X.11C r4 = r6.systemServices     // Catch:{ RuntimeException -> 0x0231 }
            X.00H r3 = r6.callArEffectsGatingUtil     // Catch:{ RuntimeException -> 0x0231 }
            X.00H r2 = r6.cameraProcessorProvider     // Catch:{ RuntimeException -> 0x0231 }
            android.os.HandlerThread r20 = r6.getSharedCameraThread()     // Catch:{ RuntimeException -> 0x0231 }
            org.pjsip.PjCamera r14 = new org.pjsip.PjCamera     // Catch:{ RuntimeException -> 0x0231 }
            r15 = r12
            r16 = r11
            r17 = r4
            r18 = r3
            r19 = r2
            r21 = r9
            r22 = r10
            r23 = r8
            r24 = r7
            r25 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ RuntimeException -> 0x0231 }
            X.1VE r2 = r6.voipSharedPreferences     // Catch:{ RuntimeException -> 0x0231 }
            android.content.SharedPreferences r3 = X.AnonymousClass1VE.A00(r2)     // Catch:{ RuntimeException -> 0x0231 }
            java.lang.String r2 = "force_passive_capture_dev_stream_role"
            boolean r2 = X.C17880vN.A1W(r3, r2)     // Catch:{ RuntimeException -> 0x0231 }
        L_0x01ab:
            r14.passiveMode = r2     // Catch:{ RuntimeException -> 0x0231 }
            goto L_0x01ef
        L_0x01ae:
            java.lang.String r2 = "voip/VoipCameraManager/createCamera couldn't get camera info"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0231 }
            r14 = r5
            goto L_0x01ef
        L_0x01b5:
            r6.registerDisplayListener()     // Catch:{ all -> 0x0239 }
            X.B60 r13 = r6.captureDeviceFactory     // Catch:{ all -> 0x0239 }
            X.Af6 r13 = (X.C21135Af6) r13     // Catch:{ all -> 0x0239 }
            X.11C r2 = r13.A04     // Catch:{ all -> 0x0239 }
            android.view.WindowManager r3 = r2.A0L()     // Catch:{ all -> 0x0239 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0239 }
            X.CUk r2 = X.C25791Cm3.A03     // Catch:{ all -> 0x0239 }
            android.content.Context r11 = r13.A00     // Catch:{ all -> 0x0239 }
            X.1DC r10 = r13.A06     // Catch:{ all -> 0x0239 }
            X.Cm3 r18 = r2.A00(r11, r3)     // Catch:{ all -> 0x0239 }
            X.0ve r8 = r13.A05     // Catch:{ all -> 0x0239 }
            X.1HQ r4 = r13.A01     // Catch:{ all -> 0x0239 }
            X.A1P r3 = r13.A02     // Catch:{ all -> 0x0239 }
            com.whatsapp.calling.screenshare.ScreenShareResourceManager r2 = r13.A03     // Catch:{ all -> 0x0239 }
            X.BwL r14 = new X.BwL     // Catch:{ all -> 0x0239 }
            r15 = r11
            r16 = r12
            r17 = r4
            r19 = r3
            r20 = r2
            r21 = r8
            r22 = r10
            r23 = r9
            r24 = r7
            r25 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0239 }
        L_0x01ef:
            r6.currentCamera = r14     // Catch:{ all -> 0x0239 }
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            if (r2 == 0) goto L_0x022f
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r3 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            X.E9z r2 = r6.cameraEventsListener     // Catch:{ all -> 0x0239 }
            r3.addCameraEventsListener(r2)     // Catch:{ all -> 0x0239 }
            X.B64 r8 = r6.onCameraCreatedListener     // Catch:{ all -> 0x0239 }
            if (r8 == 0) goto L_0x021b
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            boolean r7 = r2.canBindToCameraProcessor()     // Catch:{ all -> 0x0239 }
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            java.lang.String r5 = X.C108955ca.A0x(r2)     // Catch:{ all -> 0x0239 }
            X.Af9 r8 = (X.C21138Af9) r8     // Catch:{ all -> 0x0239 }
            X.8yP r2 = r8.A00     // Catch:{ all -> 0x0239 }
            android.os.Handler r4 = r2.A01     // Catch:{ all -> 0x0239 }
            r3 = 1
            X.4rN r2 = new X.4rN     // Catch:{ all -> 0x0239 }
            r2.<init>(r8, r5, r3, r7)     // Catch:{ all -> 0x0239 }
            r4.post(r2)     // Catch:{ all -> 0x0239 }
        L_0x021b:
            X.E9z r2 = r6.externalCameraEventsListener     // Catch:{ all -> 0x0239 }
            if (r2 == 0) goto L_0x0226
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r3 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            X.E9z r2 = r6.externalCameraEventsListener     // Catch:{ all -> 0x0239 }
            r3.addCameraEventsListener(r2)     // Catch:{ all -> 0x0239 }
        L_0x0226:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r6.currentCamera     // Catch:{ all -> 0x0239 }
            com.whatsapp.voipcalling.camera.VoipCamera r3 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x0239 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0239 }
        L_0x022d:
            monitor-exit(r6)
            return r3
        L_0x022f:
            monitor-exit(r6)
            return r5
        L_0x0231:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting camera"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0239 }
            monitor-exit(r6)
            return r5
        L_0x0239:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.createCamera(int, int, int, int, int, long):com.whatsapp.voipcalling.camera.VoipCamera");
    }

    public Point getAdjustedCameraPreviewSize(B62 b62) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getAdjustedPreviewSize();
        }
        return null;
    }

    public int getCachedCam2HardwareLevel() {
        int i = AnonymousClass1VE.A00(this.voipSharedPreferences).getInt("lowest_camera_hardware_support_level", -1);
        if (i == -1) {
            CameraManager A0B = this.systemServices.A0B();
            if (A0B == null) {
                Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel CameraManager is null");
            } else {
                int[] iArr = C24156BwM.A0L;
                int i2 = 4;
                try {
                    if (A0B.getCameraIdList().length > 0) {
                        for (String cameraCharacteristics : A0B.getCameraIdList()) {
                            Integer num = (Integer) A0B.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                            if (num != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= i2) {
                                        break;
                                    } else if (num.intValue() == iArr[i3]) {
                                        i2 = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (i2 < 4) {
                            i = iArr[i2];
                            C17880vN.A1C(AnonymousClass3MZ.A08(this.voipSharedPreferences), "lowest_camera_hardware_support_level", i);
                        }
                    }
                } catch (AssertionError | Exception e) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e);
                }
            }
            i = -1;
            C17880vN.A1C(AnonymousClass3MZ.A08(this.voipSharedPreferences), "lowest_camera_hardware_support_level", i);
        }
        C17900vP.A0j("voip/VoipCameraManager/getCachedCam2HardwareLevel got:", AnonymousClass000.A10(), i);
        return i;
    }

    public int getCameraStartMode() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getCameraStartMode();
        }
        return -1;
    }

    public int getHammerheadIndex() {
        Integer num = this.hammerHeadIdx;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public C187819gQ getLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getLastCachedFrame();
        }
        return null;
    }

    public synchronized A0D getRawCameraInfo(int i) {
        A0D a0d;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C193689qV r16;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        synchronized (this) {
            int currentApiVersion2 = getCurrentApiVersion();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/VoipCameraManager/getRawCameraInfo camera: ");
            int i2 = i;
            A10.append(i2);
            C17900vP.A0j(" enabled camera version: ", A10, currentApiVersion2);
            int i3 = i + currentApiVersion2;
            int i4 = ((i3 * (i3 + 1)) / 2) + currentApiVersion2;
            a0d = (A0D) this.rawCameraInfoCache.get(i4);
            if (a0d == null || (a0d.A04 && !isRawCameraInfoValid(i2, a0d))) {
                String A0r = C17880vN.A0r(AnonymousClass1VE.A00(this.voipSharedPreferences), AnonymousClass1VE.A01(i2, currentApiVersion2));
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("voip/VoipCameraManager/getRawCameraInfo, stored info for camera ");
                A102.append(i2);
                C17900vP.A0f(": ", A0r, A102);
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(A0r)) {
                    try {
                        JSONObject A16 = C17880vN.A16(A0r);
                        int i5 = A16.getInt("version");
                        boolean z = true;
                        if (i5 != 1) {
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("voip/RawCameraInfo/createFromJson, skip mismatched json version ");
                            A103.append(i5);
                            C17900vP.A0j(", required ", A103, 1);
                        } else {
                            int i6 = A16.getInt("apiVersion");
                            if (i6 == 1 || i6 == 2) {
                                boolean z2 = A16.getBoolean("isFrontCamera");
                                int i7 = A16.getInt("orientation");
                                if (!A16.has("has_unstable_orientation") || !A16.getBoolean("has_unstable_orientation")) {
                                    z = false;
                                }
                                JSONArray jSONArray5 = A16.getJSONArray("supportFormats");
                                if (jSONArray5 == null) {
                                    Log.e("voip/RawCameraInfo/createFromJson, cannot find formats");
                                } else {
                                    int[] iArr = new int[jSONArray5.length()];
                                    for (int i8 = 0; i8 < jSONArray5.length(); i8++) {
                                        iArr[i8] = jSONArray5.getInt(i8);
                                    }
                                    if (!A16.has("preferredSize") || (jSONArray4 = A16.getJSONArray("preferredSize")) == null) {
                                        r16 = null;
                                    } else if (jSONArray4.length() != 2) {
                                        C17900vP.A0X(jSONArray4, "voip/RawCameraInfo createFromJson bad preferred size ", AnonymousClass000.A10());
                                    } else {
                                        r16 = new C193689qV(jSONArray4.getInt(0), jSONArray4.getInt(1));
                                    }
                                    if (A16.has("previewSizes") && (jSONArray3 = A16.getJSONArray("previewSizes")) != null) {
                                        int length = jSONArray3.length();
                                        if (length % 2 == 0) {
                                            arrayList = C17880vN.A0z(length / 2);
                                            for (int i9 = 0; i9 < length; i9 += 2) {
                                                arrayList.add(new C193689qV(jSONArray3.getInt(i9), jSONArray3.getInt(i9 + 1)));
                                            }
                                        } else {
                                            throw new JSONException("length is not even");
                                        }
                                    }
                                    a0d = new A0D(r16, arrayList, iArr, i6, i7, z2, z);
                                    if (!isRawCameraInfoValid(i2, a0d)) {
                                        C17900vP.A0Z(a0d, "voip/VoipCameraManager/getRawCameraInfo, stored raw info is outdated ", AnonymousClass000.A10());
                                        clearStoredRawCameraInfo(i2, a0d.A00);
                                    }
                                    this.rawCameraInfoCache.put(i4, a0d);
                                }
                            } else {
                                C17900vP.A0j("voip/RawCameraInfo/createFromJson, skip unsupported api version ", AnonymousClass000.A10(), i6);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e((Throwable) e);
                    }
                }
                a0d = loadFromCameraService(i2);
                if (a0d != null) {
                    JSONObject A15 = C17880vN.A15();
                    String str = null;
                    try {
                        A15.put("version", 1);
                        A15.put("apiVersion", a0d.A00);
                        A15.put("isFrontCamera", a0d.A05);
                        A15.put("orientation", a0d.A01);
                        A15.put("has_unstable_orientation", a0d.A04);
                        JSONArray A1A = AnonymousClass8BR.A1A();
                        for (int put : a0d.A06) {
                            A1A.put(put);
                        }
                        A15.put("supportFormats", A1A);
                        C193689qV r4 = a0d.A02;
                        if (r4 != null) {
                            jSONArray = AnonymousClass8BR.A1A();
                            jSONArray.put(r4.A01);
                            jSONArray.put(r4.A00);
                        } else {
                            jSONArray = null;
                        }
                        A15.put("preferredSize", jSONArray);
                        List<C193689qV> list = a0d.A03;
                        if (list != null) {
                            jSONArray2 = AnonymousClass8BR.A1A();
                            for (C193689qV r1 : list) {
                                jSONArray2.put(r1.A01);
                                jSONArray2.put(r1.A00);
                            }
                        } else {
                            jSONArray2 = null;
                        }
                        A15.put("previewSizes", jSONArray2);
                        str = A15.toString();
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C17880vN.A1E(AnonymousClass3MZ.A08(this.voipSharedPreferences), AnonymousClass1VE.A01(i2, a0d.A00), str);
                    }
                } else {
                    clearStoredRawCameraInfo(i2, currentApiVersion2);
                }
                this.rawCameraInfoCache.put(i4, a0d);
            }
        }
        return a0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r1.A00, 10767) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.HandlerThread getSharedCameraThread() {
        /*
            r3 = this;
            X.00H r0 = r3.callArEffectsGatingUtil
            java.lang.Object r1 = r0.get()
            X.9l5 r1 = (X.C190519l5) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x001b
            X.0ve r2 = r1.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 10767(0x2a0f, float:1.5088E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x0020
            r0 = 0
            return r0
        L_0x0020:
            monitor-enter(r3)
            android.os.HandlerThread r0 = r3.sharedCameraThread     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002f
            X.8Co r0 = new X.8Co     // Catch:{ all -> 0x0033 }
            r0.<init>(r3)     // Catch:{ all -> 0x0033 }
            r3.sharedCameraThread = r0     // Catch:{ all -> 0x0033 }
            r0.start()     // Catch:{ all -> 0x0033 }
        L_0x002f:
            android.os.HandlerThread r0 = r3.sharedCameraThread     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.getSharedCameraThread():android.os.HandlerThread");
    }

    public boolean hasBeenQueriedByDriver() {
        return this.hasBeenQueriedByDriver.get();
    }

    public boolean hasLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.hasLastCachedFrame()) {
            return false;
        }
        return true;
    }

    public boolean isCameraOpen() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.isCameraOpen()) {
            return false;
        }
        return true;
    }

    public boolean isCameraTextureApiFailed() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.textureApiFailed) {
            return false;
        }
        return true;
    }

    public boolean isFrontCamera() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.getCameraInfo().isFrontCamera) {
            return false;
        }
        return true;
    }

    /* renamed from: lambda$registerDisplayListener$0$com-whatsapp-voipcalling-camera-VoipCameraManager  reason: not valid java name */
    public /* synthetic */ void m48lambda$registerDisplayListener$0$comwhatsappvoipcallingcameraVoipCameraManager() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            if (this.captureDeviceRefreshListener != null) {
                if (!C18020vd.A05(C18040vf.A02, this.abProps, 4773)) {
                    Voip.refreshCaptureDevice();
                }
            }
            voipPhysicalCamera.onScreenShareInfoChanged(C25791Cm3.A03.A00(this.waContext.A00, this.systemServices.A0L()));
        }
    }

    public void removeCameraErrorListener(C28608E9z e9z) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.removeCameraEventsListener(e9z);
        }
    }

    public int toggleCameraProcessor(boolean z, boolean z2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null) {
            if (!z2) {
                return -1;
            }
            return 0;
        } else if (voipPhysicalCamera.isBoundToCameraProcessor != z) {
            return voipPhysicalCamera.toggleCameraProcessor(z);
        } else {
            return 0;
        }
    }

    public void updateCameraPreviewOrientation() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.updatePreviewOrientation();
        }
    }

    public VoipCameraManager(AnonymousClass118 r3, C18030ve r4, AnonymousClass10I r5, AnonymousClass11C r6, AnonymousClass1DC r7, AnonymousClass1VE r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, C18140vp r14) {
        super(r12);
        this.waContext = r3;
        this.abProps = r4;
        this.waWorkers = r5;
        this.systemServices = r6;
        this.systemFeatures = r7;
        this.voipSharedPreferences = r8;
        this.callArEffectsGatingUtil = r9;
        this.cameraProcessorProvider = r10;
        this.screenShareDisplayManager = r11;
        this.mediaStreamLiteCameraCoordinator = r13;
        this.enableVoiceServiceLevelGlassesService = r14;
    }

    private boolean isHammerheadDevice(int i) {
        return C42171xk.A00(Integer.valueOf(i), this.hammerHeadIdx);
    }

    private boolean isScreenShareDevice(int i) {
        return C42171xk.A00(Integer.valueOf(i), this.screenShareIdx);
    }

    public Point getLastAdjustedCameraPreviewSize() {
        return this.lastAdjustedCameraPreviewSize;
    }

    public void registerGlassesService(C28597E9o e9o) {
        this.glassesService = e9o;
    }

    public void setCameraClosedListener(B63 b63) {
        this.onCameraClosedListener = b63;
    }

    public void setCameraCreatedListener(B64 b64) {
        this.onCameraCreatedListener = b64;
    }

    public void setCameraOpenedListener(B65 b65) {
        this.onCameraOpenedListener = b65;
    }

    public void setExternalCameraEventsListener(C28608E9z e9z) {
        this.externalCameraEventsListener = e9z;
    }

    public void setRequestedCamera2SupportLevel(String str, AnonymousClass1HQ r5) {
        int currentApiVersion2 = getCurrentApiVersion();
        if (!this.systemFeatures.BcY()) {
            setCurrentApiVersion(0);
        } else {
            int i = 1;
            if (str != null && C24156BwM.A06(str, getCachedCam2HardwareLevel())) {
                i = 2;
            }
            setCurrentApiVersion(i);
        }
        if (currentApiVersion2 != getCurrentApiVersion()) {
            Voip.refreshVideoDevice();
        }
    }

    @Deprecated
    public synchronized int getCameraCount() {
        return getCameraCount(true);
    }

    public int toggleCameraProcessor(boolean z) {
        return toggleCameraProcessor(z, false);
    }
}

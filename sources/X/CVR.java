package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public final class CVR {
    public final AnonymousClass118 A00;

    public CVR(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C195989uH A00() {
        Map map;
        RuntimeException runtimeException;
        boolean z;
        C24288Byl byl;
        Context context = this.A00.A00;
        ArrayList A13 = AnonymousClass000.A13();
        A13.add("faceTracker");
        A13.add("segmentation");
        A13.add("worldTracker");
        A13.add("realScaleEstimation");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager != null) {
            List<Sensor> sensorList = sensorManager.getSensorList(11);
            List<Sensor> sensorList2 = sensorManager.getSensorList(15);
            List<Sensor> sensorList3 = sensorManager.getSensorList(20);
            if (!sensorList.isEmpty() || !sensorList2.isEmpty() || !sensorList3.isEmpty()) {
                A13.add("deviceMotion");
            }
        }
        A13.add("halfFloatRenderPass");
        A13.add("depthShaderRead");
        A13.add("multipleRenderTargets");
        A13.add("vertexTextureFetch");
        String[] strArr = C24668CEi.A00;
        Pair A0N = C108945cZ.A0N(Double.valueOf(Double.parseDouble(strArr[0])), Double.valueOf(Double.parseDouble(strArr[42])));
        Object obj = A0N.first;
        C18070vi.A0W(obj);
        double A002 = AnonymousClass8BR.A00(obj);
        Object obj2 = A0N.second;
        C18070vi.A0W(obj2);
        C193379pz r6 = new C193379pz(A002, AnonymousClass8BR.A00(obj2));
        Pair A0N2 = C108945cZ.A0N(Double.valueOf(189.0d), Double.valueOf(191.0d));
        Object obj3 = A0N2.first;
        C18070vi.A0W(obj3);
        double A003 = AnonymousClass8BR.A00(obj3);
        Object obj4 = A0N2.second;
        C18070vi.A0W(obj4);
        C193379pz r3 = new C193379pz(A003, AnonymousClass8BR.A00(obj4));
        EGLSurface eGLSurface = null;
        C25111CYg cYg = null;
        if (C24726CHn.A02.contains(Build.MODEL)) {
            map = C17880vN.A11();
        } else {
            if (C24726CHn.A00 == null) {
                C24726CHn.A00 = C17880vN.A11();
                try {
                    if (((EGL10) EGLContext.getEGL()).eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                        cYg = new C25111CYg();
                        eGLSurface = EGL14.eglCreatePbufferSurface(cYg.A02, cYg.A00, new int[]{12375, 1, 12374, 1, 12344}, 0);
                        int eglGetError = EGL14.eglGetError();
                        if (eglGetError != 12288) {
                            StringBuilder A11 = AnonymousClass000.A11("eglCreatePbufferSurface");
                            BE9.A1J(": EGL error: 0x", A11, eglGetError);
                            runtimeException = BE8.A0f(A11);
                        } else if (eGLSurface != null) {
                            if (cYg.A02 == EGL14.EGL_NO_DISPLAY) {
                                Log.i("MsqrdEglCore", "NOTE: makeCurrent w/o display");
                            }
                            if (EGL14.eglMakeCurrent(cYg.A02, eGLSurface, eGLSurface, cYg.A01)) {
                                z = true;
                            } else {
                                runtimeException = AnonymousClass8BR.A0w("eglMakeCurrent failed");
                            }
                        } else {
                            runtimeException = AnonymousClass8BR.A0w("surface was null");
                        }
                        throw runtimeException;
                    }
                    z = false;
                    int[] iArr = new int[1];
                    GLES20.glGetIntegerv(34466, iArr, 0);
                    int[] iArr2 = new int[iArr[0]];
                    GLES20.glGetIntegerv(34467, iArr2, 0);
                    int i = 0;
                    while (true) {
                        if (i >= iArr2.length) {
                            break;
                        } else if (iArr2[i] == 37496) {
                            BE7.A1J("etc2_compression", C24726CHn.A00, true);
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (GLES10.glGetString(7939).contains("GL_IMG_texture_compression_pvrtc")) {
                        BE7.A1J("pvr_compression", C24726CHn.A00, true);
                    }
                    if (z) {
                        EGLDisplay eGLDisplay = cYg.A02;
                        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT)) {
                            EGL14.eglDestroySurface(cYg.A02, eGLSurface);
                            cYg.A00();
                        } else {
                            runtimeException = AnonymousClass8BR.A0w("eglMakeCurrent failed");
                            throw runtimeException;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("SDKInfo", "Error while checking for capabilities", th);
                }
            }
            map = C24726CHn.A00;
        }
        Iterator A0x = AnonymousClass8BU.A0x(map);
        while (true) {
            if (!A0x.hasNext()) {
                byl = C24288Byl.UNCOMPRESSED;
                break;
            }
            String A0v = C17880vN.A0v(A0x);
            C18070vi.A0b(A0v);
            if (!AnonymousClass1YE.A0A(A0v, "etc", false)) {
                if (!AnonymousClass1YE.A0A(A0v, "pvr", false)) {
                    if (AnonymousClass1YE.A0A(A0v, "astc", false)) {
                        byl = C24288Byl.ASTC;
                        break;
                    }
                } else {
                    byl = C24288Byl.PVR;
                    break;
                }
            } else {
                byl = C24288Byl.ETC;
                break;
            }
        }
        return new C195989uH(r6, r3, byl, A13);
    }
}

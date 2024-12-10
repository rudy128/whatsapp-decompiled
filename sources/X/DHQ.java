package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.List;

public class DHQ implements EAb {
    public final /* synthetic */ DHV A00;

    public void BB9(MediaEffect mediaEffect) {
    }

    public void BBq(int i) {
    }

    public void BJ1(long j) {
    }

    public void CEg(MediaEffect mediaEffect) {
    }

    public void CF5() {
    }

    public void flush() {
    }

    public DHQ(DHV dhv) {
        this.A00 = dhv;
    }

    public String BRF() {
        C25265Cc6 cc6 = this.A00.A06;
        C26159CtX.A01(cc6);
        try {
            return cc6.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public MediaFormat BVu() {
        C25265Cc6 cc6 = this.A00.A06;
        C26159CtX.A01(cc6);
        MediaFormat mediaFormat = cc6.A00;
        C199610h.A04(mediaFormat);
        return mediaFormat;
    }

    public int BVy() {
        C25752ClM clM = this.A00.A03;
        C26159CtX.A01(clM);
        return (clM.A09 + clM.A04) % 360;
    }

    public void CCO(Context context, C25092CXd cXd, C25752ClM clM, CZT czt) {
        C24354Bzp bzp = C24354Bzp.CODEC_VIDEO_H264;
        C25185Cab cab = clM.A0E;
        if (cab != null) {
            bzp = cab.A02;
        }
        int i = clM.A0A;
        int i2 = clM.A08;
        boolean z = false;
        int i3 = 1;
        int i4 = 256;
        int i5 = -1;
        int A002 = clM.A00();
        int i6 = clM.A02;
        int i7 = clM.A01;
        C25185Cab cab2 = clM.A0E;
        if (cab2 != null) {
            i3 = cab2.A01;
            i4 = cab2.A00;
            z = true;
        }
        int i8 = clM.A0B;
        if (i8 != -1) {
            i5 = i8;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(bzp.value, i, i2);
        createVideoFormat.setInteger("color-format", 2130708361);
        if (A002 > 0) {
            createVideoFormat.setInteger("bitrate", A002);
        }
        if (i7 > 0) {
            createVideoFormat.setInteger("frame-rate", i7);
        }
        if (i6 > -1) {
            createVideoFormat.setInteger("i-frame-interval", i6);
        }
        if (z) {
            createVideoFormat.setInteger("profile", i3);
            createVideoFormat.setInteger("level", i4);
        }
        if (i5 != -1) {
            createVideoFormat.setInteger("bitrate-mode", i5);
        }
        DHV dhv = this.A00;
        CZT czt2 = czt;
        C25265Cc6 A02 = C26259Cw4.A02(createVideoFormat, C24251By9.SURFACE, czt2, bzp.value, clM.A0G);
        dhv.A06 = A02;
        A02.A02();
        C25998CqE cqE = new C25998CqE(context.getResources());
        C25265Cc6 cc6 = dhv.A06;
        C26171Ctn.A03(AnonymousClass000.A1Z(cc6.A06, AnonymousClass00R.A01), (String) null);
        Surface surface = cc6.A05;
        C199610h.A04(surface);
        dhv.A07 = new C25624Cj4(surface, cqE, clM);
        dhv.A03 = clM;
        C24802CKv cKv = clM.A0D;
        C26159CtX.A01(cKv);
        dhv.A02 = cKv;
        dhv.A01 = -71000;
    }

    public void CEJ(DH2 dh2) {
        C25265Cc6 cc6 = this.A00.A06;
        C26159CtX.A01(cc6);
        cc6.A07.append("releaseOutputBuffer,");
        cc6.A04(dh2, cc6.A09);
    }

    public void CFD(long j) {
        DHV dhv = this.A00;
        C26159CtX.A01(dhv.A02);
        C26159CtX.A01(dhv.A07);
        if ((!dhv.A08 && j - dhv.A01 >= 71000) || dhv.A02.A00) {
            dhv.A01 = j;
            C25624Cj4 cj4 = dhv.A07;
            SurfaceTexture surfaceTexture = cj4.A02;
            C26159CtX.A01(surfaceTexture);
            float[] fArr = cj4.A0E;
            surfaceTexture.getTransformMatrix(fArr);
            C25752ClM clM = cj4.A06;
            int i = clM.A07;
            int i2 = clM.A05;
            CZA cza = new CZA(i, i2, false);
            List list = cj4.A0B;
            C26159CtX.A01(list);
            list.add(cza);
            BE7.A1S(cj4.A0D, j);
            GLES20.glBindFramebuffer(36160, cza.A00);
            GLES20.glViewport(0, 0, i, i2);
            C24995CSv cSv = cj4.A07;
            C26159CtX.A01(cSv);
            int i3 = cj4.A00;
            GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            C25710Ckg A01 = cSv.A00.A01();
            A01.A02("uSTMatrix", fArr);
            A01.A02("uConstMatrix", cSv.A03);
            A01.A02("uSceneMatrix", cSv.A05);
            A01.A02("uContentTransform", cSv.A04);
            C25739Cl9.A00(cSv.A01, A01.A00);
            GLES20.glFinish();
            GLES20.glBindFramebuffer(36160, 0);
            C24802CKv cKv = cj4.A05;
            C26159CtX.A01(cKv);
            if (!cKv.A00) {
                C25624Cj4.A00(cza, cj4, j);
            }
        }
    }

    public void CNL() {
        DHV dhv = this.A00;
        if (!dhv.A08) {
            DHV.A00(dhv);
        }
        C25265Cc6 cc6 = dhv.A06;
        C26159CtX.A01(cc6);
        C26171Ctn.A03(AnonymousClass000.A1Z(cc6.A06, AnonymousClass00R.A01), (String) null);
        cc6.A04.signalEndOfInputStream();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Cjg, java.lang.Object] */
    public void finish() {
        ? obj = new Object();
        DHV dhv = this.A00;
        BVu.A00(obj, dhv.A06, 9);
        C26159CtX.A01(dhv.A07);
        C26343Cy2 cy2 = dhv.A07.A0A;
        C26159CtX.A01(cy2);
        synchronized (cy2) {
        }
        C25624Cj4 cj4 = dhv.A07;
        C24460C5a c5a = cj4.A09;
        C26159CtX.A01(c5a);
        EGLDisplay eGLDisplay = c5a.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            BE7.A15(eGLDisplay);
        }
        C24460C5a c5a2 = cj4.A09;
        C26159CtX.A01(c5a2);
        EGLDisplay eGLDisplay2 = c5a2.A02;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            BE7.A15(eGLDisplay2);
            EGL14.eglDestroySurface(c5a2.A02, c5a2.A03);
            EGL14.eglDestroyContext(c5a2.A02, c5a2.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(c5a2.A02);
        }
        c5a2.A02 = EGL14.EGL_NO_DISPLAY;
        c5a2.A01 = EGL14.EGL_NO_CONTEXT;
        c5a2.A00 = null;
        cj4.A09 = null;
        GLES20.glDeleteTextures(1, new int[]{cj4.A00}, 0);
        cj4.A00 = -1;
        SurfaceTexture surfaceTexture = cj4.A02;
        C26159CtX.A01(surfaceTexture);
        surfaceTexture.release();
        cj4.A02 = null;
        Surface surface = cj4.A04;
        C26159CtX.A01(surface);
        surface.release();
        cj4.A04 = null;
        C24995CSv cSv = cj4.A07;
        C26159CtX.A01(cSv);
        cSv.A00.A02();
        cj4.A07 = null;
        C25000CTa cTa = cj4.A08;
        C26159CtX.A01(cTa);
        cTa.A01.A02();
        cj4.A08 = null;
        List<CZA> list = cj4.A0B;
        C26159CtX.A01(list);
        for (CZA A01 : list) {
            A01.A01();
        }
        List list2 = cj4.A0B;
        C26159CtX.A01(list2);
        list2.clear();
        cj4.A0B = null;
        cj4.A0A = null;
        HandlerThread handlerThread = cj4.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            cj4.A03 = null;
        }
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }

    public DH2 BIS() {
        C25265Cc6 cc6 = this.A00.A06;
        C26159CtX.A01(cc6);
        return cc6.A01(250000);
    }
}

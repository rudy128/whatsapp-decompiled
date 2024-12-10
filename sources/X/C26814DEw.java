package X;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.DEw  reason: case insensitive filesystem */
public final class C26814DEw implements EAW, C28553E7e {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CountDownLatch A07 = BE7.A0u();
    public final boolean A08;
    public final Object A09 = C17880vN.A0p();
    public volatile C26344Cy3 A0A;
    public volatile SurfaceTexture A0B;
    public volatile SurfaceTexture A0C;
    public volatile MediaRecorder A0D;
    public volatile Surface A0E;
    public volatile RandomAccessFile A0F;

    public void COd() {
        try {
            MediaRecorder mediaRecorder = this.A0D;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A0D;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                mediaRecorder2.release();
            }
            this.A0D = null;
            C26344Cy3 cy3 = this.A0A;
            if (cy3 != null) {
                cy3.A05((Surface) null);
            }
            Surface surface = this.A0E;
            if (surface != null) {
                surface.release();
            }
            this.A0E = null;
            try {
                RandomAccessFile randomAccessFile = this.A0F;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException unused) {
            }
            this.A0F = null;
        } catch (RuntimeException e) {
            throw AnonymousClass8BR.A0x(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A0D;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                mediaRecorder3.release();
            }
            this.A0D = null;
            C26344Cy3 cy32 = this.A0A;
            if (cy32 != null) {
                cy32.A05((Surface) null);
            }
            Surface surface2 = this.A0E;
            if (surface2 != null) {
                surface2.release();
            }
            this.A0E = null;
            try {
                RandomAccessFile randomAccessFile2 = this.A0F;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (IOException unused2) {
            }
            this.A0F = null;
            throw th;
        }
    }

    public /* synthetic */ E9U BX6() {
        return null;
    }

    public /* synthetic */ Surface BZz() {
        return null;
    }

    public SurfaceTexture Ba0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        SurfaceTexture surfaceTexture;
        this.A03 = i4;
        this.A02 = i5;
        this.A06 = i3;
        boolean A1O = AnonymousClass000.A1O(i3 % 180);
        int i8 = i;
        if (A1O) {
            i8 = i2;
        }
        this.A01 = i8;
        if (!A1O) {
            i = i2;
        }
        this.A00 = i;
        try {
            BE9.A1L(this.A07);
        } catch (InterruptedException e) {
            Log.e("GLSurfacePipeCoordinatorImpl", C17900vP.A0C("Timeout when creating SurfaceNode: ", AnonymousClass000.A10(), e));
        }
        synchronized (this.A09) {
            SurfaceTexture surfaceTexture2 = this.A0C;
            if (surfaceTexture2 != null) {
                C26344Cy3 cy3 = this.A0A;
                if (cy3 == null) {
                    cy3 = new C26344Cy3(this.A08);
                    this.A0A = cy3;
                }
                cy3.A03(surfaceTexture2, this.A02);
                int i9 = this.A01;
                int i10 = this.A00;
                SurfaceTexture surfaceTexture3 = cy3.A09;
                if (!(surfaceTexture3 != null && cy3.A01 == i9 && cy3.A00 == i10)) {
                    cy3.A01 = i9;
                    cy3.A00 = i10;
                    if (surfaceTexture3 != null) {
                        surfaceTexture3.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                        cy3.A09.release();
                        cy3.A09 = null;
                    }
                    int i11 = cy3.A03;
                    if (i11 != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i11}, 0);
                        cy3.A03 = -1;
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    C26344Cy3.A02("glGenTextures");
                    int i12 = iArr[0];
                    cy3.A03 = i12;
                    GLES20.glBindTexture(36197, i12);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("glBindTexture ");
                    C26344Cy3.A02(C17880vN.A0t(A10, cy3.A03));
                    GLES20.glTexParameterf(36197, 10241, 9729.0f);
                    BEA.A0z();
                    C26344Cy3.A02("glTexParameter");
                    SurfaceTexture surfaceTexture4 = new SurfaceTexture(cy3.A03);
                    cy3.A09 = surfaceTexture4;
                    surfaceTexture4.setOnFrameAvailableListener(cy3);
                    surfaceTexture3 = cy3.A09;
                }
                C18070vi.A0X(surfaceTexture3);
                this.A0B = surfaceTexture3;
                surfaceTexture = this.A0B;
            } else {
                throw AnonymousClass000.A0n("SurfaceNode was not created");
            }
        }
        return surfaceTexture;
    }

    public /* synthetic */ void Ba1() {
    }

    public C28553E7e BbR() {
        return this;
    }

    public void Bnd(int i) {
        this.A02 = i;
        synchronized (this.A09) {
            SurfaceTexture surfaceTexture = this.A0C;
            C26344Cy3 cy3 = this.A0A;
            if (!(cy3 == null || surfaceTexture == null)) {
                cy3.A03(surfaceTexture, this.A02);
            }
        }
    }

    public void C4T(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    public void C4U(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
        synchronized (this.A09) {
            this.A0C = surfaceTexture;
            this.A07.countDown();
        }
    }

    public void C4V() {
        synchronized (this.A09) {
            if (this.A0C != null) {
                this.A0B = null;
                this.A0C = null;
                this.A07 = BE7.A0u();
            }
            C26344Cy3 cy3 = this.A0A;
            if (cy3 != null) {
                cy3.A03((SurfaceTexture) null, 0);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CEN() {
        /*
            r10 = this;
            X.Cy3 r3 = r10.A0A
            if (r3 == 0) goto L_0x00d3
            android.opengl.EGLDisplay r1 = r3.A0D
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r5 = -1
            r2 = 0
            r4 = 0
            if (r1 == r0) goto L_0x00b3
            java.lang.Object r8 = r3.A0I
            monitor-enter(r8)
            android.opengl.EGLSurface r1 = r3.A0R     // Catch:{ all -> 0x007f }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007f }
            r6 = 1
            if (r1 == r0) goto L_0x0063
            android.opengl.EGLDisplay r9 = r3.A0D     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLSurface r7 = r3.A0R     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLSurface r1 = r3.A0R     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLContext r0 = r3.A0C     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGL14.eglMakeCurrent(r9, r7, r1, r0)     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLDisplay r7 = r3.A0D     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLSurface r1 = r3.A0R     // Catch:{ RuntimeException -> 0x004f }
            int[] r9 = r3.A0K     // Catch:{ RuntimeException -> 0x004f }
            r0 = 12375(0x3057, float:1.7341E-41)
            android.opengl.EGL14.eglQuerySurface(r7, r1, r0, r9, r4)     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLDisplay r7 = r3.A0D     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLSurface r1 = r3.A0R     // Catch:{ RuntimeException -> 0x004f }
            r0 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGL14.eglQuerySurface(r7, r1, r0, r9, r6)     // Catch:{ RuntimeException -> 0x004f }
            r1 = r9[r4]     // Catch:{ RuntimeException -> 0x004f }
            r0 = r9[r6]     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.GLES20.glViewport(r4, r4, r1, r0)     // Catch:{ RuntimeException -> 0x004f }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ RuntimeException -> 0x004f }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLDisplay r1 = r3.A0D     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGLSurface r0 = r3.A0R     // Catch:{ RuntimeException -> 0x004f }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ RuntimeException -> 0x004f }
        L_0x004f:
            android.opengl.EGLDisplay r7 = r3.A0D     // Catch:{ all -> 0x007f }
            android.opengl.EGLSurface r1 = r3.A0E     // Catch:{ all -> 0x007f }
            android.opengl.EGLContext r0 = r3.A0C     // Catch:{ all -> 0x007f }
            android.opengl.EGL14.eglMakeCurrent(r7, r1, r1, r0)     // Catch:{ all -> 0x007f }
            android.opengl.EGLDisplay r1 = r3.A0D     // Catch:{ all -> 0x007f }
            android.opengl.EGLSurface r0 = r3.A0R     // Catch:{ all -> 0x007f }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x007f }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007f }
            r3.A0R = r0     // Catch:{ all -> 0x007f }
        L_0x0063:
            r3.A0A = r2     // Catch:{ all -> 0x007f }
            monitor-exit(r8)     // Catch:{ all -> 0x007f }
            java.lang.Object r7 = r3.A0J
            monitor-enter(r7)
            android.opengl.EGLSurface r1 = r3.A0S     // Catch:{ all -> 0x007c }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007c }
            if (r1 == r0) goto L_0x007a
            android.opengl.EGLDisplay r1 = r3.A0D     // Catch:{ all -> 0x007c }
            android.opengl.EGLSurface r0 = r3.A0S     // Catch:{ all -> 0x007c }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x007c }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007c }
            r3.A0S = r0     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r7)     // Catch:{ all -> 0x007c }
            goto L_0x0082
        L_0x007c:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007c }
            throw r0
        L_0x007f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x007f }
            throw r0
        L_0x0082:
            android.opengl.EGLSurface r1 = r3.A0E
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r1 == r0) goto L_0x008d
            android.opengl.EGLDisplay r0 = r3.A0D
            android.opengl.EGL14.eglDestroySurface(r0, r1)
        L_0x008d:
            int r1 = r3.A03
            if (r1 == r5) goto L_0x0098
            int[] r0 = new int[r6]
            r0[r4] = r1
            android.opengl.GLES20.glDeleteTextures(r6, r0, r4)
        L_0x0098:
            int r0 = r3.A02
            if (r0 == 0) goto L_0x009f
            android.opengl.GLES20.glDeleteProgram(r0)
        L_0x009f:
            android.opengl.EGLDisplay r0 = r3.A0D
            X.BE7.A15(r0)
            android.opengl.EGLDisplay r1 = r3.A0D
            android.opengl.EGLContext r0 = r3.A0C
            android.opengl.EGL14.eglDestroyContext(r1, r0)
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = r3.A0D
            android.opengl.EGL14.eglTerminate(r0)
        L_0x00b3:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r3.A0D = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r3.A0C = r0
            r3.A0B = r2
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r3.A0E = r0
            r3.A02 = r4
            r3.A03 = r5
            android.graphics.SurfaceTexture r0 = r3.A09
            if (r0 == 0) goto L_0x00d3
            r0.setOnFrameAvailableListener(r2)
            android.graphics.SurfaceTexture r0 = r3.A09
            r0.release()
            r3.A09 = r2
        L_0x00d3:
            r0 = 0
            r10.A0A = r0
            r10.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26814DEw.CEN():void");
    }

    public C25815CmS COQ(CamcorderProfile camcorderProfile, C26225CvG cvG, String str, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        FileDescriptor fileDescriptor;
        if (this.A06 % 180 != 0) {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        } else {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        }
        if (!this.A08) {
            i5 = this.A01;
            i6 = this.A00;
        } else if (this.A02 % 180 != 0) {
            i5 = this.A04;
            i6 = this.A05;
        } else {
            i5 = this.A05;
            i6 = this.A04;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = ((float) i5) / ((float) i6);
        if (f / f2 > f3) {
            i3 = (int) (f2 * f3);
        } else {
            i4 = (int) (f / f3);
        }
        camcorderProfile.videoFrameWidth = i3 - (i3 % 16);
        camcorderProfile.videoFrameHeight = i4 - (i4 % 16);
        String str2 = str;
        this.A0F = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(5);
        mediaRecorder.setVideoSource(2);
        mediaRecorder.setOrientationHint(this.A03);
        mediaRecorder.setProfile(camcorderProfile);
        RandomAccessFile randomAccessFile = this.A0F;
        if (randomAccessFile != null) {
            fileDescriptor = randomAccessFile.getFD();
        } else {
            fileDescriptor = null;
        }
        mediaRecorder.setOutputFile(fileDescriptor);
        mediaRecorder.prepare();
        this.A0E = mediaRecorder.getSurface();
        C26344Cy3 cy3 = this.A0A;
        if (cy3 != null) {
            cy3.A05(mediaRecorder.getSurface());
        }
        mediaRecorder.start();
        this.A0D = mediaRecorder;
        return C25693CkO.A00(camcorderProfile, new C25693CkO(str2, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, this.A03, i));
    }

    public boolean CSA() {
        return true;
    }

    public C26814DEw(boolean z) {
        this.A08 = z;
    }

    public /* synthetic */ Object BVm(C24556C9c c9c) {
        return null;
    }

    public void BrQ(int i) {
        this.A03 = i;
    }
}

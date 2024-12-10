package X;

import android.content.Context;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.SurfaceHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public class DRB implements VideoPort {
    public static final float[] A0O = {0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] A0P = {0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] A0Q = {0.19607843f, 0.19607843f, 0.19607843f, 1.0f};
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public AnonymousClass1DC A03;
    public CZE A04;
    public E8J A05 = null;
    public C25244Cbg A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final HandlerThread A0B;
    public final C18030ve A0C;
    public final UserJid A0D;
    public final GlVideoRenderer A0E;
    public final AtomicBoolean A0F = BE6.A16(false);
    public final boolean A0G;
    public final C181279Pv A0H;
    public final C21141AfC A0I;
    public final Set A0J = C17880vN.A12();
    public final boolean A0K;
    public volatile WeakReference A0L;
    public volatile boolean A0M;
    public volatile boolean A0N;

    public static int A03(DRB drb, float[] fArr) {
        C17960vV.A04(drb.A0B);
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClear(16384);
        return A01(drb);
    }

    public Context getContext() {
        return null;
    }

    @Deprecated
    public SurfaceHolder getSurfaceHolder() {
        return null;
    }

    public Point getWindowSize() {
        return new Point(0, 0);
    }

    public void setListener(E2y e2y) {
    }

    public int useLanczosFilter(int i) {
        int A022 = A02(this, new DVV(this, i, 5));
        if (A022 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0b(BEA.A0W(this, "voip/CoreVideoPort/useLanczosFilter failed: ", A10, A022), A10);
        }
        return A022;
    }

    public static int A00(Message message, DRB drb, String str) {
        if (drb.A0A.sendMessage(message)) {
            return 0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/CoreVideoPort/");
        A10.append(str);
        A10.append(" failed: ");
        A10.append(-100);
        A10.append(" for ");
        A10.append(drb.A0D);
        C17890vO.A0w(A10);
        return -100;
    }

    public static int A01(DRB drb) {
        C17960vV.A04(drb.A0B);
        E04 e04 = (E04) drb.A06;
        E04.A02(e04);
        EGLSurface eGLSurface = e04.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass8BR.A0w("No EGLSurface - can't swap buffers");
        } else if (EGL14.eglSwapBuffers(e04.A02, eGLSurface)) {
            return 0;
        } else {
            return -3;
        }
    }

    public static int A02(DRB drb, Callable callable) {
        return AnonymousClass000.A0M(C24617CCd.A00(drb.A0A, BE7.A0Y(), callable));
    }

    public static void A04(DRB drb) {
        if (!drb.A0N) {
            drb.A0N = true;
            Set<E6Z> set = drb.A0J;
            synchronized (set) {
                for (E6Z C37 : set) {
                    C37.C37();
                }
            }
        }
    }

    public static void A05(DRB drb) {
        C17960vV.A04(drb.A0B);
        drb.A0E.release();
        drb.A0F.set(false);
        try {
            drb.A06.A03();
            drb.A06.A06();
            drb.A06.A05();
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
    }

    public static void A06(DRB drb) {
        C17960vV.A04(drb.A0B);
        C25244Cbg cbg = drb.A06;
        if (((E04) cbg).A03 != EGL14.EGL_NO_SURFACE) {
            cbg.A03();
            drb.A06.A06();
        }
    }

    public static void A07(DRB drb, int i, int i2) {
        C21141AfC afC = drb.A0I;
        C17960vV.A02();
        UserJid userJid = drb.A0D;
        if (!C40811vJ.A0K(afC.A03, userJid)) {
            C21434Ak1 ak1 = new C21434Ak1(afC, userJid, drb, 31);
            if (C18020vd.A05(C18040vf.A02, afC.A05, 7807)) {
                ((C200710s) afC.A07.get()).execute(ak1);
            } else {
                ak1.run();
            }
        } else if (AnonymousClass1HR.A00((AnonymousClass1HR) afC.A04)) {
            Log.i("VoipNative/setVideoPreviewSize skipping as call ended or ending");
        } else {
            Voip.setVideoPreviewSize(i, i2);
        }
    }

    public static boolean A08(DRB drb) {
        C17960vV.A04(drb.A0B);
        if (((E04) drb.A06).A03 == EGL14.EGL_NO_SURFACE || !drb.A0F.get()) {
            return false;
        }
        return true;
    }

    public void A09(E6Z e6z) {
        Set set = this.A0J;
        synchronized (set) {
            set.add(e6z);
        }
        if (this.A0N && this.A0L != null) {
            e6z.C37();
        }
    }

    public void A0A(E6Z e6z) {
        Set set = this.A0J;
        synchronized (set) {
            set.remove(e6z);
        }
    }

    public void A0B(Object obj) {
        boolean z;
        int i;
        if (!this.A0M) {
            if (this.A0L == null || (this.A0L != null && C42171xk.A00(this.A0L.get(), obj))) {
                z = false;
            } else {
                z = true;
            }
            if (this.A05 == null) {
                i = A02(this, new C27118DVd(this, obj, z));
            } else {
                i = 0;
            }
            this.A0N = false;
            if (i == 0) {
                if (!this.A09) {
                    this.A09 = true;
                    C21141AfC.A02(this, this.A0I);
                } else if (this.A0K) {
                    C21141AfC afC = this.A0I;
                    UserJid userJid = this.A0D;
                    if (!afC.A09.containsKey(userJid)) {
                        if (AnonymousClass1HR.A00((AnonymousClass1HR) afC.A04)) {
                            Log.i("VoipNative/startVideoRenderStream skipping as call ended or ending");
                        } else {
                            Voip.startVideoRenderStream(userJid);
                        }
                    }
                }
                this.A0L = AnonymousClass3MW.A0z(obj);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/CoreVideoPort/onSurfaceAvailable failed to create surface (");
            A10.append(i);
            A10.append(") for ");
            Log.w(C17890vO.A0V(this.A0D, A10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x0064
            java.lang.ref.WeakReference r0 = r3.A0L
            if (r0 == 0) goto L_0x0064
            java.lang.ref.WeakReference r0 = r3.A0L
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C42171xk.A00(r0, r4)
            if (r0 == 0) goto L_0x0064
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
            X.E8J r0 = r3.A05
            if (r0 != 0) goto L_0x0065
            r0 = 22
            X.DVt r2 = new X.DVt
            r2.<init>((java.lang.Object) r3, (int) r0)
            android.os.Handler r1 = r3.A0A
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            java.lang.Object r0 = X.C24617CCd.A00(r1, r0, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0065
            r1 = 26
            X.DVt r0 = new X.DVt
            r0.<init>((java.lang.Object) r3, (int) r1)
            A02(r3, r0)
        L_0x003e:
            java.lang.ref.WeakReference r0 = r3.A0L
            if (r0 == 0) goto L_0x0045
            r0 = 0
            r3.A0L = r0
        L_0x0045:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0064
            X.AfC r2 = r3.A0I
            com.whatsapp.jid.UserJid r1 = r3.A0D
            java.util.concurrent.ConcurrentHashMap r0 = r2.A09
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0064
            X.1HQ r0 = r2.A04
            X.1HR r0 = (X.AnonymousClass1HR) r0
            boolean r0 = X.AnonymousClass1HR.A00(r0)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "VoipNative/stopVideoRenderStream skipping as call ended or ending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0064:
            return
        L_0x0065:
            X.E8J r0 = r3.A05
            if (r0 == 0) goto L_0x003e
            r0.onSurfaceDestroyed(r4)
            goto L_0x003e
        L_0x006d:
            com.whatsapp.voipcalling.Voip.stopVideoRenderStream(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRB.A0C(java.lang.Object):void");
    }

    public void A0D(Object obj, int i, int i2) {
        String str;
        if (!this.A0M) {
            if (this.A0L == null || !C42171xk.A00(this.A0L.get(), obj)) {
                str = "voip/CoreVideoPort/onSurfaceSizeChanged invalid surface";
            } else {
                this.A02 = i;
                this.A00 = i2;
                E8J e8j = this.A05;
                if (e8j != null) {
                    e8j.onSurfaceSizeChanged(obj, i, i2);
                }
                if (BE8.A1W(this)) {
                    Handler handler = this.A0A;
                    handler.removeMessages(1);
                    A00(handler.obtainMessage(1, i, i2), this, "setWindowSize");
                    return;
                }
                if (this.A05 == null) {
                    int A0M2 = AnonymousClass000.A0M(C24617CCd.A00(this.A0A, BE7.A0Y(), new C27119DVe(this, i, i2)));
                    if (A0M2 != 0) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        str = C17890vO.A0V(BEA.A0W(this, "voip/CoreVideoPort/setWindowSize failed: ", A10, A0M2), A10);
                    }
                }
                A07(this, i, i2);
                return;
            }
            Log.i(str);
        }
    }

    public CZE createSurfaceTexture() {
        if (this.A0M) {
            Log.w("voip/CoreVideoPort/createSurfaceTexture called after release");
            return null;
        }
        return (CZE) C24617CCd.A00(this.A0A, (Object) null, new C27132DVt((Object) this, 25));
    }

    public void releaseSurfaceTexture(CZE cze) {
        if (this.A0M) {
            return;
        }
        if (BE8.A1W(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(7);
            A00(handler.obtainMessage(7, cze), this, "releaseSurfaceTexture");
            return;
        }
        A02(this, new DVY(this, cze, 18));
    }

    public int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5) {
        int A022 = A02(this, new C27128DVp(this, i, i2, i3, i4, i5, j));
        if (A022 == 0) {
            A04(this);
        }
        return A022;
    }

    public int resetBlackScreen() {
        return A02(this, new C27132DVt((Object) this, 27));
    }

    public void setPassthroughVideoPortCallback(E8J e8j) {
        Handler handler = this.A0A;
        handler.removeMessages(10);
        A00(handler.obtainMessage(10, e8j), this, "attach new surface manager");
    }

    public int setScaleType(int i) {
        if (this.A0G || this.A07) {
            return 0;
        }
        if (!BE8.A1W(this)) {
            int A022 = A02(this, new DVV(this, i, 6));
            if (A022 == 0) {
                return A022;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0b(BEA.A0W(this, "voip/CoreVideoPort/setScaleType failed: ", A10, A022), A10);
            return A022;
        } else if (!this.A0F.get()) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("voip/CoreVideoPort/setScaleType failed: -6 for ");
            A102.append(this.A0D);
            C17890vO.A0w(A102);
            return -6;
        } else {
            Handler handler = this.A0A;
            handler.removeMessages(2);
            return A00(handler.obtainMessage(2, Integer.valueOf(i)), this, "setScaleType");
        }
    }

    public int setScaleTypeForVR(int i, boolean z) {
        this.A07 = z;
        return setScaleType(i);
    }

    public DRB(C181279Pv r4, C21141AfC afC, C18030ve r6, UserJid userJid, AnonymousClass1DC r8, GlVideoRenderer glVideoRenderer, boolean z, boolean z2) {
        this.A0D = userJid;
        this.A0C = r6;
        this.A0E = glVideoRenderer;
        this.A0H = r4;
        this.A0I = afC;
        this.A03 = r8;
        this.A0K = z;
        this.A0G = C18020vd.A05(C18040vf.A02, r6, 4158);
        this.A07 = z2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoPort_");
        HandlerThread handlerThread = new HandlerThread(C17880vN.A0t(A10, hashCode()));
        this.A0B = handlerThread;
        BG0 bg0 = new BG0(BE7.A0G(handlerThread), this);
        this.A0A = bg0;
        if (BE8.A1W(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(4);
            A00(handler.obtainMessage(4), this, "initEgl");
            return;
        }
        int A0M2 = AnonymousClass000.A0M(C24617CCd.A00(bg0, BE7.A0Y(), new C27132DVt((Object) this, 24)));
        if (A0M2 != 0) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("voip/CoreVideoPort/create failed to init EGL (");
            A102.append(A0M2);
            C17900vP.A0X(userJid, ") for ", A102);
        }
    }

    public void release() {
        C17960vV.A02();
        UserJid userJid = this.A0D;
        this.A0M = true;
        Set set = this.A0J;
        synchronized (set) {
            set.clear();
        }
        if (this.A09) {
            this.A09 = false;
            C21141AfC afC = this.A0I;
            if (C40811vJ.A0K(afC.A03, userJid)) {
                if (afC.A02 != null) {
                    C21141AfC.A03(afC);
                }
            } else if (afC.A08.get(userJid) != null) {
                AnonymousClass7RL r3 = new AnonymousClass7RL(afC, userJid, 12);
                if (C18020vd.A05(C18040vf.A02, afC.A05, 7807)) {
                    ((C200710s) afC.A07.get()).execute(r3);
                } else {
                    r3.run();
                }
            }
        }
        Handler handler = this.A0A;
        handler.removeCallbacksAndMessages((Object) null);
        if (BE8.A1W(this)) {
            CZE cze = this.A04;
            handler.removeMessages(7);
            A00(handler.obtainMessage(7, cze), this, "releaseSurfaceTexture");
        } else {
            A02(this, new C27132DVt((Object) this, 28));
        }
        A02(this, new C27132DVt((Object) this, 29));
        this.A0B.quit();
    }

    public void renderTexture(CZE cze, int i, int i2) {
        if (BE8.A1W(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(6);
            A00(handler.obtainMessage(6, i, i2, cze), this, "renderTexture");
        } else if (A02(this, new C27122DVj(this, cze, i, i2)) == 0) {
            A04(this);
        }
    }

    public void setCornerRadius(float f) {
        if (BE8.A1W(this)) {
            Handler handler = this.A0A;
            handler.removeMessages(3);
            A00(handler.obtainMessage(3, Float.valueOf(f)), this, "setCornerRadius");
            return;
        }
        int A022 = A02(this, new DVX(this, f, 1));
        if (A022 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(BEA.A0W(this, "voip/CoreVideoPort/setCornerRadius failed: ", A10, A022));
            C17890vO.A1A(A10, ". Retrying on valid surface");
        }
    }
}

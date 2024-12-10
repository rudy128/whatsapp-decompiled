package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5e5  reason: invalid class name and case insensitive filesystem */
public class C109835e5 extends SurfaceView implements AnonymousClass009, C160918An {
    public int A00;
    public int A01;
    public Camera.Size A02;
    public Camera A03;
    public Handler A04;
    public Handler A05;
    public C23502BiB A06;
    public C18030ve A07;
    public AnonymousClass8AH A08;
    public AnonymousClass031 A09;
    public List A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public Handler A0F;
    public HandlerThread A0G;
    public HandlerThread A0H;
    public HandlerThread A0I;
    public boolean A0J;
    public final Camera.AutoFocusCallback A0K;
    public final Camera.PreviewCallback A0L;
    public final Handler A0M;
    public final SurfaceHolder.Callback A0N;
    public final SurfaceHolder A0O;
    public final C25640CjT A0P;
    public final Runnable A0Q;
    public final AtomicBoolean A0R;

    public C109835e5(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0C) {
            this.A0C = true;
            this.A07 = AnonymousClass10E.A8r(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A0M = C17890vO.A0D();
        this.A0P = new C25640CjT();
        this.A0R = new AtomicBoolean(true);
        this.A0D = false;
        C1420177v r2 = new C1420177v(this, 1);
        this.A0N = r2;
        this.A0L = new C26350CyC(this, 3);
        this.A0K = new AnonymousClass75J(this, 1);
        this.A0Q = new AnonymousClass7RB((Object) this, 29);
        SurfaceHolder holder = getHolder();
        this.A0O = holder;
        holder.addCallback(r2);
    }

    public static void A00(Camera.Parameters parameters, C109835e5 r4) {
        Log.i("QrScannerView/notifyQrCodeNotDetected");
        if (C18020vd.A05(C18040vf.A02, r4.A07, 12687) && r4.A08 != null && r4.A0R.get()) {
            r4.A0F.post(new C146517Pk(r4, parameters, 21));
        }
    }

    public static void A01(C109835e5 r2) {
        Camera camera = r2.A03;
        if (camera != null) {
            try {
                camera.release();
            } catch (Exception e) {
                Log.w("qrview/safeReleaseCamera error releaseing camera", e);
            }
        }
        r2.A03 = null;
    }

    public static void A02(C109835e5 r3, int i) {
        if (r3.A08 != null) {
            r3.A0M.post(new AnonymousClass7RM((Object) r3, i, 33));
        }
    }

    public boolean Bgi() {
        Camera camera = this.A03;
        if (camera == null || !this.A0E) {
            return false;
        }
        try {
            boolean equals = "torch".equals(camera.getParameters().getFlashMode());
            this.A0J = equals;
            return equals;
        } catch (RuntimeException e) {
            C108995ce.A1M("QrScannerView/isTorchEnabled runtimeexception trying to check the torch state ", AnonymousClass000.A10(), e);
            this.A0J = false;
            return false;
        }
    }

    public void CFY() {
        Handler handler = this.A04;
        if (handler != null) {
            AnonymousClass7RB.A00(handler, this, 24);
        }
    }

    public void CFw() {
        Handler handler = this.A04;
        if (handler != null) {
            AnonymousClass7RB.A00(handler, this, 28);
        }
    }

    public void CNk() {
        Log.i("qrview/startcameraPreview");
        Camera camera = this.A03;
        if (camera != null) {
            try {
                camera.startPreview();
            } catch (RuntimeException e) {
                Log.e("qrview/startCamerapreview ", e);
            }
        }
    }

    public void COW() {
        Log.i("qrview/stopcameraPreview");
        Camera camera = this.A03;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                Log.w("qrview/stopcamera error stopping camera preview", e);
            }
        }
    }

    public void CPa() {
        String str;
        Camera camera = this.A03;
        if (camera != null && this.A0E) {
            try {
                boolean z = !this.A0J;
                Camera.Parameters parameters = camera.getParameters();
                if (z) {
                    str = "torch";
                } else {
                    str = "off";
                }
                parameters.setFlashMode(str);
                camera.setParameters(parameters);
                this.A0J = z;
            } catch (RuntimeException e) {
                C108995ce.A1M("QrScannerView/toggleTorch exception while toggling torch : ", AnonymousClass000.A10(), e);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.BaJ] */
    public void onAttachedToWindow() {
        Log.i("qrview/onAttachedToWindow");
        super.onAttachedToWindow();
        HandlerThread handlerThread = new HandlerThread("QrScannerCamera");
        this.A0H = handlerThread;
        handlerThread.start();
        this.A04 = new Handler(this.A0H.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("QrScannerViewDecode");
        this.A0I = handlerThread2;
        handlerThread2.start();
        this.A05 = new Handler(this.A0I.getLooper());
        HandlerThread handlerThread3 = new HandlerThread("QrScannerViewAux");
        this.A0G = handlerThread3;
        handlerThread3.start();
        this.A0F = new Handler(this.A0G.getLooper());
        if (this.A0D) {
            Context applicationContext = getContext().getApplicationContext();
            ? obj = new Object();
            obj.A00 = 256;
            this.A06 = new C23502BiB(new C23493Bhx(applicationContext, obj));
        }
    }

    public void onDetachedFromWindow() {
        Log.i("qrview/onDetachedFromWindow");
        super.onDetachedFromWindow();
        HandlerThread handlerThread = this.A0H;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.A0I;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        C23502BiB biB = this.A06;
        if (biB != null) {
            biB.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1 == 2) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r11 = r18
            r1 = r19
            r0 = r20
            super.onMeasure(r1, r0)
            r10 = 0
            r11.A01 = r10
            r11.A00 = r10
            int r9 = r11.getMeasuredWidth()
            int r8 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A03
            java.lang.String r7 = "x"
            if (r0 == 0) goto L_0x00d3
            java.util.List r0 = r11.A0A
            if (r0 == 0) goto L_0x00d3
            android.content.Context r0 = r11.getContext()
            android.view.WindowManager r0 = X.AnonymousClass11C.A01(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0036
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            java.util.List r2 = r11.A0A
            r1 = r9
            r0 = r8
            if (r3 == 0) goto L_0x003f
            r1 = r8
            r0 = r9
        L_0x003f:
            android.hardware.Camera$Size r6 = X.Bq6.A01(r2, r1, r0)
            if (r6 == 0) goto L_0x00d3
            double r4 = (double) r9
            double r2 = (double) r8
            double r16 = r4 / r2
            int r15 = r6.width
            double r0 = (double) r15
            int r14 = r6.height
            double r12 = (double) r14
            double r0 = r0 / r12
            double r16 = r16 - r0
            double r12 = java.lang.Math.abs(r16)
            double r16 = r2 / r4
            double r16 = r16 - r0
            double r0 = java.lang.Math.abs(r16)
            double r0 = java.lang.Math.min(r12, r0)
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r12 = "qrview/measure optimalpreviewsize:"
            X.AnonymousClass000.A1E(r12, r7, r13, r15)
            r13.append(r14)
            java.lang.String r12 = " measured:"
            X.AnonymousClass000.A1E(r12, r7, r13, r9)
            r13.append(r8)
            java.lang.String r12 = " aspect diff:"
            r13.append(r12)
            r13.append(r0)
            java.lang.String r12 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r12)
            r13 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d3
            boolean r0 = X.C108975cc.A1D(r9, r8)
            int r12 = r6.width
            int r9 = r6.height
            if (r12 <= r9) goto L_0x0099
            r10 = 1
        L_0x0099:
            java.lang.String r8 = "qrview/measure optimalpreviewsize scale:"
            if (r0 != r10) goto L_0x00d4
            double r0 = (double) r12
            double r4 = r4 / r0
            double r0 = (double) r9
            double r2 = r2 / r0
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.width
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r6.height
        L_0x00ba:
            double r0 = (double) r0
            double r2 = r2 * r0
            int r4 = (int) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "qrview/measure result:"
            r1.append(r0)
            r1.append(r5)
            X.C17900vP.A0j(r7, r1, r4)
            r11.A01 = r5
            r11.A00 = r4
            r11.setMeasuredDimension(r5, r4)
        L_0x00d3:
            return
        L_0x00d4:
            double r0 = (double) r9
            double r4 = r4 / r0
            double r0 = (double) r12
            double r2 = r2 / r0
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.height
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r6.width
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109835e5.onMeasure(int, int):void");
    }

    public boolean COq() {
        return this.A0E;
    }

    public Camera.Size getPreviewSize() {
        return this.A02;
    }

    public void setQrDecodeHints(Map map) {
        this.A0B = map;
    }

    public void setQrScannerCallback(AnonymousClass8AH r1) {
        this.A08 = r1;
    }

    public void setShouldUseGoogleVisionScanner(boolean z) {
        this.A0D = z;
    }
}

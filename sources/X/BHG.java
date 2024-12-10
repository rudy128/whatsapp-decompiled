package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.WindowManager;
import java.util.Map;

public final class BHG extends TextureView implements TextureView.SurfaceTextureListener {
    public int A00 = -1;
    public int A01;
    public OrientationEventListener A02;
    public C24331BzS A03;
    public C24331BzS A04;
    public E9B A05 = new Object();
    public C25556Chu A06;
    public EAW A07;
    public C28555E7g A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public EBS A0K;
    public final GestureDetector.SimpleOnGestureListener A0L;
    public final GestureDetector A0M;
    public final ScaleGestureDetector.SimpleOnScaleGestureListener A0N;
    public final ScaleGestureDetector A0O;
    public final C6E A0P;
    public final C28614EAk A0Q;
    public final String A0R = "ScCameraPreview";

    /* JADX WARNING: type inference failed for: r0v3, types: [X.E9B, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BHG(Context context) {
        super(context, (AttributeSet) null, 0);
        String A0x = C108955ca.A0x(context);
        C18070vi.A0X(A0x);
        C24331BzS bzS = C24331BzS.HIGH;
        this.A03 = bzS;
        this.A04 = bzS;
        this.A0H = true;
        this.A0E = true;
        this.A0A = true;
        this.A0P = new C22901BUm(this, 16);
        BH3 bh3 = new BH3(this, 1);
        this.A0L = bh3;
        BHA bha = new BHA(this);
        this.A0N = bha;
        this.A09 = A0x;
        this.A0F = true;
        this.A0G = true;
        this.A0Q = C25316CdM.A00(context, (Handler) null, C24248By6.CAMERA1);
        setMediaOrientationLocked(false);
        super.setSurfaceTextureListener(this);
        this.A0M = new GestureDetector(context, bh3);
        this.A0O = new ScaleGestureDetector(context, bha);
    }

    public final void A03(E9C e9c) {
        C25729Ckz ckz = new C25729Ckz();
        ckz.A01(C25729Ckz.A08, new Rect(0, 0, getWidth(), getHeight()));
        ckz.A01(C25729Ckz.A04, false);
        ckz.A01(C25729Ckz.A07, true);
        this.A0Q.CP1(new C26802DEk(e9c), ckz);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C18070vi.A0d(surfaceTexture, 0);
        this.A0J = i;
        this.A0I = i2;
        if (!this.A0B) {
            A02(this);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C18070vi.A0d(surfaceTexture, 0);
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A0D = false;
        C28614EAk eAk = this.A0Q;
        eAk.CDk(this, "onSurfaceTextureDestroyed");
        eAk.BIp(new C22897BUi(surfaceTexture, this, 5));
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C18070vi.A0d(surfaceTexture, 0);
        this.A0J = i;
        this.A0I = i2;
        if (!this.A0B) {
            getSurfacePipeCoordinator().C4T(i, i2);
            C25556Chu chu = this.A06;
            C18070vi.A0b(chu);
            setCameraDeviceRotation(chu);
        }
    }

    public final void setPhotoCaptureQuality(C24331BzS bzS) {
        C18070vi.A0d(bzS, 0);
        this.A03 = bzS;
    }

    public final void setProductName(String str) {
        C18070vi.A0d(str, 0);
        this.A09 = str;
    }

    public final void setRuntimeParameters(EBS ebs) {
        C18070vi.A0d(ebs, 0);
        this.A0K = ebs;
    }

    public final void setSizeSetter(E9B e9b) {
        C18070vi.A0d(e9b, 0);
        this.A05 = e9b;
    }

    public final void setVideoCaptureQuality(C24331BzS bzS) {
        C18070vi.A0d(bzS, 0);
        this.A04 = bzS;
    }

    public static final void A01(C25556Chu chu, BHG bhg, int i, int i2) {
        C25971Cpe cpe = chu.A02;
        C26132Csv csv = (C26132Csv) cpe.A04(C25971Cpe.A0q);
        if (csv != null) {
            int i3 = csv.A02;
            int i4 = csv.A01;
            Matrix transform = bhg.getTransform(C108945cZ.A0J());
            C18070vi.A0X(transform);
            C28614EAk eAk = bhg.A0Q;
            if (eAk.CLb(transform, i, i2, i3, i4, bhg.A0A)) {
                if (bhg.A0H) {
                    bhg.setTransform(transform);
                }
                eAk.BdT(transform, bhg.getWidth(), bhg.getHeight(), chu.A00);
                if (bhg.A0E) {
                    bhg.A0D = true;
                    return;
                }
                return;
            }
            throw AnonymousClass8BR.A0w("CameraService doesn't support setting up preview matrix.");
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Cannot get preview size, maybe camera was never initialised.\n characteristics.settings=\n");
        throw BE9.A0n((String) cpe.A04(C25971Cpe.A0u), A10);
    }

    public static final void A02(BHG bhg) {
        C28614EAk eAk = bhg.A0Q;
        String str = bhg.A09;
        if (str == null) {
            C18070vi.A11("mProductName");
            throw null;
        }
        int i = bhg.A01;
        eAk.BFe(bhg.A0P, bhg.getRuntimeParameters(), (C28611EAf) null, new C25119CYs(new CRN(bhg.getSurfacePipeCoordinator(), bhg.A0J, bhg.A0I)), str, i, bhg.A00);
        bhg.getSurfacePipeCoordinator().C4U(bhg.getSurfaceTexture(), bhg.A0J, bhg.A0I);
    }

    private final C24331BzS getPhotoCaptureQuality() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.CUf, java.lang.Object] */
    private final EBS getRuntimeParameters() {
        EBS ebs = this.A0K;
        if (ebs != null) {
            return ebs;
        }
        Map map = DEX.A01;
        DEX dex = new DEX(this.A03, this.A04, new Object(), this.A05, false, false);
        this.A0K = dex;
        return dex;
    }

    private final E9B getSizeSetter() {
        return this.A05;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.DEt, java.lang.Object, X.EAW] */
    private final EAW getSurfacePipeCoordinator() {
        EAW eaw = this.A07;
        if (eaw != null) {
            return eaw;
        }
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        ? obj = new Object();
        obj.A01 = AnonymousClass3MW.A0z(surfaceTexture);
        obj.A00 = BE8.A0m();
        this.A07 = obj;
        return obj;
    }

    private final C24331BzS getVideoCaptureQuality() {
        return this.A04;
    }

    /* access modifiers changed from: private */
    public final void setCameraDeviceRotation(C25556Chu chu) {
        C28614EAk eAk = this.A0Q;
        if (eAk.isConnected()) {
            int displayRotation = getDisplayRotation();
            if (this.A00 != displayRotation) {
                this.A00 = displayRotation;
                eAk.CK5(new C22901BUm(this, 18), displayRotation);
            } else if (chu.A02.A04(C25971Cpe.A0q) != null) {
                A01(chu, this, getWidth(), getHeight());
            }
        }
    }

    public final C28614EAk getCameraService() {
        return this.A0Q;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.A0Q.BkU();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0D || !this.A0Q.isConnected()) {
            return false;
        }
        GestureDetector gestureDetector = this.A0M;
        C18070vi.A0b(motionEvent);
        boolean onTouchEvent = gestureDetector.onTouchEvent(motionEvent);
        boolean onTouchEvent2 = this.A0O.onTouchEvent(motionEvent);
        if (onTouchEvent || onTouchEvent2) {
            return true;
        }
        return false;
    }

    public final void setDoubleTapToZoomEnabled(boolean z) {
        this.A0O.setQuickScaleEnabled(z);
    }

    public final void setMediaOrientationLocked(boolean z) {
        this.A0Q.CJQ(z);
    }

    public final void setOnInitialisedListener(C28555E7g e7g) {
        if (!(e7g == null || this.A06 == null || !this.A0Q.isConnected())) {
            C25556Chu chu = this.A06;
            C18070vi.A0b(chu);
            e7g.Bvy(chu);
        }
        this.A08 = e7g;
    }

    private final int getDisplayRotation() {
        Object systemService = getContext().getSystemService("window");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getRotation();
        }
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.A02;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.A08 = null;
    }

    public final void setCropEnabled(boolean z) {
        this.A0A = z;
    }

    public final void setInitialCameraFacing(int i) {
        this.A01 = i;
    }

    public final void setPinchZoomEnabled(boolean z) {
        this.A0C = z;
    }

    public final void setSingleTapFocusEnabled(boolean z) {
        this.A0F = z;
    }

    public final void setSingleTapMeteringEnabled(boolean z) {
        this.A0G = z;
    }

    public final void setTransformMatrixEnabled(boolean z) {
        this.A0H = z;
    }
}

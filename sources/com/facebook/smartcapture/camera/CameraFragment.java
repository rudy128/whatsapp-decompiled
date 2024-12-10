package com.facebook.smartcapture.camera;

import X.AnonymousClass02n;
import X.AnonymousClass1GO;
import X.BE6;
import X.BHG;
import X.C110885hR;
import X.C18070vi;
import X.C19740yt;
import X.C20151A9n;
import X.C22901BUm;
import X.C25089CXa;
import X.C25556Chu;
import X.C25971Cpe;
import X.C26331Cxo;
import X.C26333Cxq;
import X.C27172DXh;
import X.C28236Dtw;
import X.C28614EAk;
import X.CKJ;
import X.D45;
import X.D5Y;
import X.E4h;
import X.E8K;
import X.EEE;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CameraFragment extends Fragment implements E4h {
    public static final AtomicBoolean A0A = BE6.A16(true);
    public static final /* synthetic */ EEE[] A0B;
    public C25556Chu A00;
    public BHG A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = true;
    public D45 A05 = new D45("", "", "", "", "", "", "", "");
    public boolean A06;
    public final AnonymousClass02n A07 = CDw(new D5Y(this, 0), new Object());
    public final E8K A08 = new C27172DXh();
    public final E8K A09 = new C27172DXh();

    static {
        Class<CameraFragment> cls = CameraFragment.class;
        A0B = new EEE[]{new C28236Dtw(cls, "camDelegate", "getCamDelegate()Lcom/facebook/smartcapture/camera/CameraDelegate;"), new C28236Dtw(cls, "initListener", "getInitListener()Lcom/facebook/smartcapture/camera/ScCameraPreview$OnInitialisedListener;")};
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(A14());
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    public void C1f(C25089CXa cXa) {
        C18070vi.A0d(cXa, 0);
        Object BbC = this.A08.BbC();
        if (BbC != null && cXa.A09 != null) {
            synchronized (BbC) {
            }
        }
    }

    public static final Object A00(CKJ ckj, CameraFragment cameraFragment) {
        C28614EAk eAk;
        C25971Cpe BZ5;
        Object A042;
        C25556Chu chu = cameraFragment.A00;
        if (chu != null && (A042 = chu.A02.A04(ckj)) != null) {
            return A042;
        }
        BHG bhg = cameraFragment.A01;
        if (bhg == null || (eAk = bhg.A0Q) == null || (BZ5 = eAk.BZ5()) == null) {
            return null;
        }
        return BZ5.A04(ckj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.DEa} */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.E9B] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.facebook.smartcapture.camera.CameraFragment r7) {
        /*
            android.os.Bundle r5 = r7.A06
            r6 = 33
            if (r5 == 0) goto L_0x001a
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "texts"
            if (r0 < r6) goto L_0x0022
            java.lang.Class<X.D45> r0 = X.D45.class
            java.lang.Object r0 = r5.getParcelable(r1, r0)
        L_0x0012:
            X.D45 r0 = (X.D45) r0
            if (r0 != 0) goto L_0x0018
            X.D45 r0 = r7.A05
        L_0x0018:
            r7.A05 = r0
        L_0x001a:
            boolean r0 = A01(r7)
            r4 = 1
            if (r0 != 0) goto L_0x0027
            return r4
        L_0x0022:
            android.os.Parcelable r0 = r5.getParcelable(r1)
            goto L_0x0012
        L_0x0027:
            boolean r0 = r7.A06
            r3 = 0
            if (r0 != 0) goto L_0x0086
            X.1FL r0 = r7.A1D()
            X.BHG r2 = new X.BHG
            r2.<init>(r0)
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            android.view.View r1 = r7.A0B
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C18070vi.A0z(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r2)
            r7.A01 = r2
            if (r5 == 0) goto L_0x0069
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "fixed_photo_size"
            if (r0 < r6) goto L_0x008e
            java.lang.Class<X.D3f> r0 = X.C26544D3f.class
            java.lang.Object r0 = r5.getParcelable(r1, r0)
        L_0x005a:
            X.D3f r0 = (X.C26544D3f) r0
            if (r0 == 0) goto L_0x0087
            X.DEa r1 = new X.DEa
            r1.<init>(r0)
            boolean r0 = r0.A02
        L_0x0065:
            r7.A04 = r0
            r2.A05 = r1
        L_0x0069:
            r2.A01 = r3
            r2.A0A = r3
            X.BzS r0 = X.C24331BzS.HIGH
            r2.setPhotoCaptureQuality(r0)
            X.BzS r0 = X.C24331BzS.DEACTIVATED
            r2.setVideoCaptureQuality(r0)
            X.DG0 r0 = new X.DG0
            r0.<init>(r7)
            r2.setOnInitialisedListener(r0)
            r2.setDoubleTapToZoomEnabled(r3)
            r2.A0C = r3
            r7.A06 = r4
        L_0x0086:
            return r3
        L_0x0087:
            X.DEZ r1 = new X.DEZ
            r1.<init>()
            r0 = 1
            goto L_0x0065
        L_0x008e:
            android.os.Parcelable r0 = r5.getParcelable(r1)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.camera.CameraFragment.A02(com.facebook.smartcapture.camera.CameraFragment):boolean");
    }

    public static final boolean A01(CameraFragment cameraFragment) {
        boolean z;
        AlertDialog.Builder negativeButton;
        C26333Cxq cxq;
        if (C19740yt.A01(cameraFragment.A14(), "android.permission.CAMERA") == 0) {
            return true;
        }
        if (!cameraFragment.A03) {
            if (!A0A.compareAndSet(true, false)) {
                AnonymousClass1GO r0 = cameraFragment.A0G;
                if (r0 != null) {
                    z = C110885hR.A0C(r0.A04, "android.permission.CAMERA");
                } else {
                    z = false;
                }
                if (z) {
                    negativeButton = new AlertDialog.Builder(cameraFragment.A14()).setTitle(cameraFragment.A05.A03).setMessage(cameraFragment.A05.A02).setPositiveButton(cameraFragment.A05.A01, new C26331Cxo(cameraFragment, 0)).setNegativeButton(cameraFragment.A05.A00, (DialogInterface.OnClickListener) null);
                    cxq = new C26333Cxq(cameraFragment, 0);
                } else if (cameraFragment.A02) {
                    negativeButton = new AlertDialog.Builder(cameraFragment.A14()).setTitle(cameraFragment.A05.A07).setMessage(cameraFragment.A05.A06).setPositiveButton(cameraFragment.A05.A05, new C20151A9n(cameraFragment, 1)).setNegativeButton(cameraFragment.A05.A04, (DialogInterface.OnClickListener) null);
                    cxq = new C26333Cxq(cameraFragment, 1);
                }
                negativeButton.setOnDismissListener(cxq).create().show();
                cameraFragment.A03 = true;
            }
            cameraFragment.A07.A03("android.permission.CAMERA");
            return false;
        }
        return false;
    }

    public void A1t() {
        BHG bhg;
        super.A1t();
        if (this.A06 && (bhg = this.A01) != null) {
            bhg.A0B = true;
            bhg.A0D = false;
            OrientationEventListener orientationEventListener = bhg.A02;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
            C28614EAk eAk = bhg.A0Q;
            eAk.CDk(bhg, "onPause");
            eAk.BIp(new C22901BUm(bhg, 17));
        }
    }

    public void A1u() {
        BHG bhg;
        super.A1u();
        if (!A02(this) && (bhg = this.A01) != null) {
            bhg.A0B = false;
            if (bhg.isAvailable()) {
                BHG.A02(bhg);
            }
        }
    }
}

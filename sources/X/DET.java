package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

public class DET implements E9A, E7d {
    public static final float[] A0A = new float[4];
    public static final int[] A0B = new int[18];
    public Long A00;
    public WeakReference A01 = BE8.A0m();
    public final C25648Cje A02;
    public final C25203Caw A03;
    public final CVC A04 = new CVC(this);
    public final boolean A05;
    public final C28502E4k A06;
    public volatile C27223Da2 A07 = new C27223Da2("Uninitialized exception.");
    public volatile C25581CiL A08;
    public volatile Boolean A09;

    public void BDG() {
        this.A03.A00();
    }

    public /* bridge */ /* synthetic */ Object BYK() {
        if (this.A09 == null) {
            throw AnonymousClass000.A0n("Photo capture operation hasn't completed yet.");
        } else if (this.A09.booleanValue()) {
            C25581CiL ciL = this.A08;
            if (ciL != null && (ciL.A04 != null || ciL.A01 != null)) {
                return ciL;
            }
            throw AnonymousClass000.A0n("Photo capture data is null.");
        } else {
            throw this.A07;
        }
    }

    public void Bnw(CKG ckg) {
        this.A01.clear();
    }

    public void BxW(int i) {
        WeakReference weakReference = this.A01;
        weakReference.get();
        if (i == 100) {
            weakReference.clear();
        }
    }

    public DET(boolean z, boolean z2) {
        long j;
        DES des = new DES(this, 2);
        this.A06 = des;
        this.A05 = z;
        if (z2) {
            j = 20000;
        } else {
            j = 10000;
        }
        C25203Caw caw = new C25203Caw();
        this.A03 = caw;
        caw.A00 = des;
        caw.A02(j);
        this.A02 = new C25648Cje();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bnu(X.E9T r5, X.CVD r6) {
        /*
            r4 = this;
            X.Cq0 r3 = X.C25986Cq0.A00()
            r2 = 6
            long r0 = r3.A02
            X.C25986Cq0.A01(r3, r2, r0)
            X.Cje r0 = r4.A02
            X.ClK r3 = r0.A01(r6)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.Object r0 = r6.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r0 == 0) goto L_0x0025
            float[] r1 = A0A     // Catch:{ IllegalArgumentException -> 0x0025 }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0025 }
            X.CKL r0 = X.C25750ClK.A0H     // Catch:{ IllegalArgumentException -> 0x0025 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0025 }
        L_0x0025:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.Object r0 = r6.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            int[] r1 = A0B     // Catch:{ IllegalArgumentException -> 0x0039 }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
            X.CKL r0 = X.C25750ClK.A0I     // Catch:{ IllegalArgumentException -> 0x0039 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0039:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r6.A00(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A00 = r0
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A09
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.Caw r0 = r4.A03
            r0.A01()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DET.Bnu(X.E9T, X.CVD):void");
    }

    public void Bnz(E9T e9t) {
        C25986Cq0.A00().A02 = SystemClock.elapsedRealtime();
    }
}

package X;

import android.graphics.Rect;
import android.util.Log;
import java.util.List;

/* renamed from: X.BUu  reason: case insensitive filesystem */
public class C22909BUu extends CKK {
    public C22903BUo A00;
    public C26114Csc A01;

    public void A02() {
        A04(this.A00.A03());
    }

    public void A03() {
        C22903BUo bUo = this.A00;
        Rect rect = C26170Ctm.A00;
        List A11 = BE6.A11(C25632CjI.A0s, bUo);
        int i = 4;
        if (!AnonymousClass3Ma.A1b(A11, 4)) {
            i = 1;
            if (!AnonymousClass3Ma.A1b(A11, 1)) {
                i = 6;
                if (!AnonymousClass3Ma.A1b(A11, 6)) {
                    return;
                }
            }
        }
        C26128Csq.A01(C25971Cpe.A0D, this.A00, i);
    }

    public void A04(C25093CXe cXe) {
        C22906BUr bUr;
        boolean z;
        String str;
        this.A00 = new C26128Csq();
        C26114Csc csc = this.A01;
        try {
            bUr = (C22906BUr) csc.A02.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            bUr = null;
        }
        if (cXe.A0y) {
            z = csc.A02(C25971Cpe.A0D, Integer.valueOf(cXe.A0C));
        } else {
            z = false;
        }
        if (cXe.A0b) {
            z = A00(csc, C25971Cpe.A00, cXe.A06, z);
        }
        if (cXe.A0p) {
            z = A00(csc, C25971Cpe.A07, cXe.A08, z);
        }
        if (cXe.A0w) {
            z = A00(csc, C25971Cpe.A0B, cXe.A0B, z);
        }
        if (cXe.A0s) {
            z = A00(csc, C25971Cpe.A09, cXe.A0A, z);
        }
        if (cXe.A0x) {
            z = A01(csc, C25971Cpe.A0C, cXe.A0Z, z);
        }
        if (cXe.A1F) {
            z = A00(csc, C25971Cpe.A0a, cXe.A0E, z);
        }
        if (cXe.A1G) {
            z = A00(csc, C25971Cpe.A0b, cXe.A0F, z);
        }
        if (cXe.A1H) {
            z = A01(csc, C25971Cpe.A0c, cXe.A0S, z);
        }
        if (cXe.A1K) {
            z = A01(csc, C25971Cpe.A0f, cXe.A0a, z);
        }
        if (cXe.A1O) {
            z = A00(csc, C25971Cpe.A0i, cXe.A0I, z);
        }
        if (cXe.A1P) {
            z = A01(csc, C25971Cpe.A0k, cXe.A0T, z);
        }
        if (cXe.A1Q) {
            z = A00(csc, C25971Cpe.A0m, cXe.A0J, z);
        }
        if (cXe.A1S) {
            z = A00(csc, C25971Cpe.A0o, cXe.A0K, z);
        }
        if (cXe.A1R) {
            z = A01(csc, C25971Cpe.A0n, cXe.A1k, z);
        }
        if (cXe.A1T) {
            z = A01(csc, C25971Cpe.A0q, cXe.A0U, z);
        }
        if (cXe.A1Y) {
            z = A00(csc, C25971Cpe.A0s, cXe.A0L, z);
        }
        if (cXe.A1e) {
            z = A01(csc, C25971Cpe.A0Z, Boolean.valueOf(cXe.A1d), z);
        }
        if (cXe.A1c) {
            z = A01(csc, C25971Cpe.A0y, cXe.A0V, z);
        }
        if (cXe.A1f) {
            z = A00(csc, C25971Cpe.A0z, cXe.A0N, z);
        }
        if (cXe.A1h) {
            z = A00(csc, C25971Cpe.A11, cXe.A0O, z);
        }
        if (cXe.A1B) {
            z = A01(csc, C25971Cpe.A0W, Boolean.valueOf(cXe.A1A), z);
        }
        if (cXe.A1X) {
            z = A01(csc, C25971Cpe.A0r, Boolean.valueOf(cXe.A1W), z);
        }
        if (cXe.A11) {
            z = A01(csc, C25971Cpe.A0E, Double.valueOf(cXe.A00), z);
        }
        if (cXe.A12) {
            z = A01(csc, C25971Cpe.A0F, Double.valueOf(cXe.A01), z);
        }
        if (cXe.A13) {
            z = A01(csc, C25971Cpe.A0G, Double.valueOf(cXe.A02), z);
        }
        if (cXe.A14) {
            z = A01(csc, C25971Cpe.A0H, cXe.A0X, z);
        }
        if (cXe.A15) {
            z = A01(csc, C25971Cpe.A0I, Long.valueOf(cXe.A0Q), z);
        }
        if (cXe.A1N) {
            z = A00(csc, C25971Cpe.A0g, cXe.A0H, z);
        }
        if (cXe.A1b) {
            z = A00(csc, C25971Cpe.A0x, cXe.A0M, z);
        }
        if (cXe.A1E) {
            z = A00(csc, C25971Cpe.A0L, cXe.A0D, z);
        }
        if (cXe.A0r) {
            z = A01(csc, C25971Cpe.A0l, (Object) null, z);
        }
        if (cXe.A1D) {
            z = A01(csc, C25971Cpe.A0V, Boolean.valueOf(cXe.A1C), z);
        }
        if (cXe.A0h) {
            z = A01(csc, C25971Cpe.A0N, Boolean.valueOf(cXe.A0g), z);
        }
        if (z) {
            int incrementAndGet = C26114Csc.A05.incrementAndGet();
            try {
                C26175Cts.A01((Object) null, 34, incrementAndGet);
                if (C25870Cne.A02(C25449Cg0.A00)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("applyModifications: [modification] ");
                    Log.i("ParametersModificationApplier", AnonymousClass000.A0y(cXe.A00(), A10));
                }
                csc.A01.setParameters(csc.A00);
                C26175Cts.A01((Object) null, 35, incrementAndGet);
            } catch (RuntimeException e2) {
                C26175Cts.A01(e2, 36, incrementAndGet);
                Object[] A1a = BE6.A1a();
                if (bUr != null) {
                    str = bUr.A05();
                } else {
                    str = "null";
                }
                A1a[0] = str;
                A1a[1] = csc.A02.A05();
                A1a[2] = csc.A00.flatten();
                A1a[3] = cXe.A00();
                throw BE6.A0o(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", A1a), e2);
            }
        }
    }

    public static boolean A00(C26114Csc csc, CKJ ckj, int i, boolean z) {
        return z | csc.A02(ckj, Integer.valueOf(i));
    }

    public static boolean A01(C26114Csc csc, CKJ ckj, Object obj, boolean z) {
        return z | csc.A02(ckj, obj);
    }
}

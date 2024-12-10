package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;

/* renamed from: X.7DX  reason: invalid class name */
public class AnonymousClass7DX implements C1606289h {
    public final int A00;
    public final Object A01;

    public AnonymousClass7DX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int BVn() {
        Intent intent;
        switch (this.A00) {
            case 0:
                return ((Activity) this.A01).getIntent().getIntExtra("camera_origin", 8);
            case 1:
                throw AnonymousClass04E.createAndThrow();
            default:
                AnonymousClass1FL A1B = ((Fragment) this.A01).A1B();
                if (A1B == null || (intent = A1B.getIntent()) == null) {
                    return 8;
                }
                return intent.getIntExtra("camera_origin", 8);
        }
    }

    public void BnQ() {
        switch (this.A00) {
            case 0:
                Log.e("CameraActivity/onCameraError");
                AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
                if (!C18020vd.A05(C18040vf.A02, r3.A0E, 12790)) {
                    r3.finish();
                    return;
                }
                return;
            case 1:
                return;
            default:
                C72463Mc.A1A((Fragment) this.A01);
                return;
        }
    }

    public void C52() {
        switch (this.A00) {
            case 0:
                C72453Mb.A14((Activity) this.A01);
                return;
            case 1:
                AnonymousClass4aY r0 = (AnonymousClass4aY) this.A01;
                r0.A2u.A07(r0.A3R, 1, C18020vd.A05(C18040vf.A02, r0.A3F, 4549));
                return;
            default:
                Fragment fragment = (Fragment) this.A01;
                AnonymousClass1FL A1B = fragment.A1B();
                if (A1B != null) {
                    A1B.setResult(-1);
                }
                C72463Mc.A1A(fragment);
                return;
        }
    }
}

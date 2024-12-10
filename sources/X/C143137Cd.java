package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.util.Map;

/* renamed from: X.7Cd  reason: invalid class name and case insensitive filesystem */
public class C143137Cd implements BAT {
    public final /* synthetic */ C109755dx A00;

    public C143137Cd(C109755dx r1) {
        this.A00 = r1;
    }

    public void BpU(C26235CvV cvV) {
        CXY cxy;
        C109755dx r3 = this.A00;
        C108975cc.A0q(r3.A01);
        C25813CmQ cmQ = r3.A02;
        if (cmQ != null) {
            cmQ.A02();
        }
        BloksDialogFragment bloksDialogFragment = r3.A05;
        if (bloksDialogFragment != null) {
            bloksDialogFragment.A03 = new C125576bJ(cvV);
        }
        Fragment fragment = r3.A00;
        if (!(fragment == null || (cxy = r3.A04) == null || !fragment.A1b())) {
            r3.A02 = C181119Pf.A00(fragment, cvV, cxy, (Map) null);
        }
        r3.A00();
        AnonymousClass6bI r0 = r3.A06;
        if (r0 != null) {
            r0.A00.A04();
        }
    }

    public void Bt0(String str) {
        Log.e("Whatsapp", str);
        AnonymousClass6bI r0 = this.A00.A06;
        if (r0 != null) {
            r0.A00.A04();
        }
    }
}

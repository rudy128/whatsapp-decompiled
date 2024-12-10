package X;

import android.hardware.display.DisplayManager;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;

/* renamed from: X.75L  reason: invalid class name */
public class AnonymousClass75L implements DisplayManager.DisplayListener {
    public final /* synthetic */ OrientationViewModel A00;

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public AnonymousClass75L(OrientationViewModel orientationViewModel) {
        this.A00 = orientationViewModel;
    }

    public void onDisplayChanged(int i) {
        OrientationViewModel orientationViewModel = this.A00;
        if ((C18020vd.A00(C18040vf.A02, orientationViewModel.A09, 11857) & 2) != 0) {
            orientationViewModel.A0A.CGF(new C146427Pb(orientationViewModel, 12));
        } else {
            OrientationViewModel.A00(orientationViewModel);
        }
    }
}

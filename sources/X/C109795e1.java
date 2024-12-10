package X;

import android.view.ScaleGestureDetector;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.5e1  reason: invalid class name and case insensitive filesystem */
public class C109795e1 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ C116185wX A00;

    public C109795e1(C116185wX r1) {
        this.A00 = r1;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        CallGridViewModel callGridViewModel = this.A00.A04;
        if (callGridViewModel != null) {
            C108945cZ.A0d(callGridViewModel.A16).A05++;
        }
    }
}

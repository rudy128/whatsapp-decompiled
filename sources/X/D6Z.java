package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

public class D6Z implements E3b {
    public final int A00;
    public final int A01;
    public final Object A02;

    public D6Z(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public boolean CBT(View view) {
        if (this.A00 != 0) {
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.A02;
            int i = this.A01;
            WeakReference weakReference = sideSheetBehavior.A0D;
            if (weakReference == null || weakReference.get() == null) {
                sideSheetBehavior.A0Q(i);
                return true;
            }
            View A0O = C108945cZ.A0O(weakReference);
            AnonymousClass7RP r1 = new AnonymousClass7RP(sideSheetBehavior, i, 15);
            ViewParent parent = A0O.getParent();
            if (parent == null || !parent.isLayoutRequested() || !A0O.isAttachedToWindow()) {
                r1.run();
                return true;
            }
            A0O.post(r1);
            return true;
        }
        ((BottomSheetBehavior) this.A02).A0W(this.A01);
        return true;
    }
}

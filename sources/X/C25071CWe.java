package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.CWe  reason: case insensitive filesystem */
public class C25071CWe {
    public int A00;
    public boolean A01;
    public final Runnable A02 = new C27080DTf((Object) this, 16);
    public final /* synthetic */ BottomSheetBehavior A03;

    public C25071CWe(BottomSheetBehavior bottomSheetBehavior) {
        this.A03 = bottomSheetBehavior;
    }

    public void A00(int i) {
        WeakReference weakReference = this.A03.A0S;
        if (weakReference != null && weakReference.get() != null) {
            this.A00 = i;
            if (!this.A01) {
                C108945cZ.A0O(weakReference).postOnAnimation(this.A02);
                this.A01 = true;
            }
        }
    }
}

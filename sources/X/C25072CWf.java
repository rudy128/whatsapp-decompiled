package X;

import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.CWf  reason: case insensitive filesystem */
public class C25072CWf {
    public int A00;
    public boolean A01;
    public final Runnable A02 = new C27080DTf((Object) this, 20);
    public final /* synthetic */ SideSheetBehavior A03;

    public C25072CWf(SideSheetBehavior sideSheetBehavior) {
        this.A03 = sideSheetBehavior;
    }

    public void A00(int i) {
        WeakReference weakReference = this.A03.A0D;
        if (weakReference != null && weakReference.get() != null) {
            this.A00 = i;
            if (!this.A01) {
                C108945cZ.A0O(weakReference).postOnAnimation(this.A02);
                this.A01 = true;
            }
        }
    }
}

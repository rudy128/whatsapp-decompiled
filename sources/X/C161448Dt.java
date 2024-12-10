package X;

import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;

/* renamed from: X.8Dt  reason: invalid class name and case insensitive filesystem */
public class C161448Dt extends AnonymousClass01T {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161448Dt(Object obj, int i) {
        super(true);
        this.A00 = i;
        this.A01 = obj;
    }

    public void A03() {
        if (this.A00 != 0) {
            ((BusinessDirectorySearchFragment) this.A01).A0A.A0U();
        } else {
            BusinessApiBrowseFragment.A00((BusinessApiBrowseFragment) this.A01).A4b();
        }
    }
}

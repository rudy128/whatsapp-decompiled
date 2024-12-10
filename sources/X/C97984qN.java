package X;

import android.view.View;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.4qN  reason: invalid class name and case insensitive filesystem */
public class C97984qN implements C107685aQ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C97984qN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean Bor() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((View.OnClickListener) obj).onClick(((WDSBannerCompact) this.A02).A00);
            return true;
        }
        C108885cS r4 = ((C98524rI) obj).A01;
        r4.CFa().startActivity(AnonymousClass1LU.A13(r4.CFa(), ((AnonymousClass1E7) this.A02).A0J, false, true, true));
        return true;
    }
}

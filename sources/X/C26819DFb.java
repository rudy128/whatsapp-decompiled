package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.DFb  reason: case insensitive filesystem */
public class C26819DFb implements C16890tO {
    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        C24912CPf cPf = (C24912CPf) obj3;
        C24912CPf cPf2 = (C24912CPf) obj4;
        return (cPf.A01 == cPf2.A01 && cPf.A00 == cPf2.A00 && cPf.A02.equals(cPf2.A02)) ? false : true;
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        C38251qy layoutManager;
        BV5 bv5 = (BV5) obj2;
        if (obj3 != null) {
            C22707BLr bLr = bv5.A0D;
            C24912CPf cPf = (C24912CPf) obj3;
            int i = bLr.A00;
            int i2 = cPf.A00;
            boolean z = true;
            boolean z2 = false;
            boolean A1S = AnonymousClass000.A1S(i, i2);
            int i3 = bLr.A01;
            int i4 = cPf.A01;
            boolean A1S2 = AnonymousClass000.A1S(i3, i4);
            RecyclerView recyclerView = bLr.A02;
            if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
                if ((!layoutManager.A1I() || !A1S) && (!layoutManager.A1J() || !A1S2)) {
                    z = false;
                }
                z2 = z;
            }
            bLr.A01 = i4;
            bLr.A00 = i2;
            List list = bLr.A03;
            bLr.A03 = cPf.A02;
            if (z2) {
                bLr.notifyDataSetChanged();
                return null;
            }
            C25367CeS.A00(new C22703BLh(bLr, list)).A02(bLr);
            return null;
        }
        throw AnonymousClass000.A0n("List data was not computed during layout");
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}

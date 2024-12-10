package X;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

public class BMX extends C65142vu {
    public final /* synthetic */ FragmentTransitionSupport A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public BMX(FragmentTransitionSupport fragmentTransitionSupport, Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = fragmentTransitionSupport;
        this.A01 = obj;
        this.A03 = arrayList;
        this.A02 = obj2;
        this.A04 = arrayList2;
    }

    public void C9K(AnonymousClass1LG r5) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A09(obj, this.A03, (ArrayList) null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A09(obj2, this.A04, (ArrayList) null);
        }
    }

    public void C9H(AnonymousClass1LG r1) {
        r1.A0O(this);
    }
}

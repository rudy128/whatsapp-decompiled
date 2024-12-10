package X;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

public class D79 implements AnonymousClass3M3 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentTransitionSupport A01;
    public final /* synthetic */ ArrayList A02;

    public void C9G(AnonymousClass1LG r1) {
    }

    public void C9I() {
    }

    public void C9J() {
    }

    public D79(View view, FragmentTransitionSupport fragmentTransitionSupport, ArrayList arrayList) {
        this.A01 = fragmentTransitionSupport;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void C9H(AnonymousClass1LG r6) {
        r6.A0O(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            BE6.A0R(arrayList, i).setVisibility(0);
        }
    }

    public void C9K(AnonymousClass1LG r1) {
        r1.A0O(this);
        r1.A0N(this);
    }
}

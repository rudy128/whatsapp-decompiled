package X;

import android.util.ArrayMap;
import android.view.View;

/* renamed from: X.Ae3  reason: case insensitive filesystem */
public final class C21073Ae3 implements C107705aS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C161508Fg A01;

    public C21073Ae3(C161508Fg r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void Bp3(View view) {
        if (view != null && view.getTag(2131432150) != null) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(Integer.valueOf(this.A00), view);
            this.A01.A07.A0E(arrayMap);
        }
    }
}

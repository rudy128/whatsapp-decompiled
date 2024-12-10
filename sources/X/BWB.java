package X;

import android.util.Pair;
import org.json.JSONObject;

public final class BWB extends CZT {
    public final C18030ve A00;
    public final boolean A01;
    public final boolean A02;

    public Pair A00() {
        C18030ve r1 = this.A00;
        if (r1 != null) {
            r1.A0J(10157);
            JSONObject A0J = r1.A0J(10157);
            int i = A0J.getInt("i_max");
            return C17890vO.A0E(Integer.valueOf(i), A0J.getInt("p_max"));
        }
        Integer A0Z = BE7.A0Z();
        return new Pair(A0Z, A0Z);
    }

    public BWB(C18030ve r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public BWB() {
        this((C18030ve) null, false, false);
    }
}

package X;

import android.net.Uri;
import java.util.List;

public class BP2 extends CPE {
    public final Uri A00;
    public final BP6 A01;
    public final CJ3 A02;

    public BP2(D48 d48, BP6 bp6, String str, List list) {
        super(d48, bp6, list);
        CJ3 cj3;
        this.A00 = Uri.parse(str);
        if (bp6.A00 <= 0) {
            cj3 = new CJ3(new C25200Car(0, (String) null, -1));
        } else {
            cj3 = null;
        }
        this.A02 = cj3;
        this.A01 = bp6;
    }
}

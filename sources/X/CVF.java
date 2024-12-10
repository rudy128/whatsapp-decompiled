package X;

import java.util.HashMap;

public class CVF {
    public final int A00;

    public CVF(int i) {
        this.A00 = i;
    }

    public String toString() {
        HashMap A11 = C17880vN.A11();
        A11.put("profile", Integer.valueOf(this.A00));
        return C26171Ctn.A01(CVF.class, A11);
    }
}

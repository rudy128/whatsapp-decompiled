package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CPT {
    public final int A00;
    public final List A01;
    public final Map A02;

    public CPT(C25555Cht cht) {
        this.A02 = Collections.unmodifiableMap(cht.A02);
        this.A01 = cht.A01;
        this.A00 = cht.A00;
    }
}

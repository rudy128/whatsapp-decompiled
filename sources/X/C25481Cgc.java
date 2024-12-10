package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Cgc  reason: case insensitive filesystem */
public final class C25481Cgc {
    public final Map A00;

    public C25481Cgc(C25511Ch9 ch9) {
        HashMap A11 = C17880vN.A11();
        this.A00 = A11;
        A11.putAll(ch9.A00);
    }

    public C25481Cgc(String str) {
        HashMap A11 = C17880vN.A11();
        this.A00 = A11;
        A11.put(C25511Ch9.A01, str);
    }
}

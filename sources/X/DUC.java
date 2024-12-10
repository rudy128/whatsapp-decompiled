package X;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public abstract class DUC implements AlgorithmParameterSpec {
    public static Map A00;

    static {
        HashMap A11 = C17880vN.A11();
        A00 = A11;
        A11.put(EBJ.A0P, "E-A");
        A00.put(EBJ.A0Q, "E-B");
        A00.put(EBJ.A0R, "E-C");
        A00.put(EBJ.A0S, "E-D");
        A00.put(EBC.A04, "Param-Z");
    }
}

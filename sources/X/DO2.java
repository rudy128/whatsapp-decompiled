package X;

public class DO2 implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        if (cmq instanceof C23751Bow) {
            boolean booleanValue = ((C23751Bow) cmq).A00.booleanValue();
            if (cmq2 instanceof C23751Bow) {
                return AnonymousClass000.A1T(booleanValue ? 1 : 0, ((C23751Bow) cmq2).A00.booleanValue() ? 1 : 0);
            }
            throw C23741Bom.A00("Expected boolean node");
        } else if (cmq2 instanceof C23751Bow) {
            throw C23741Bom.A00("Expected boolean node");
        } else {
            throw new C27232DaC("Failed to evaluate exists expression");
        }
    }
}

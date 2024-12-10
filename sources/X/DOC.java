package X;

public class DOC implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        boolean z2;
        C23756Bp1 bp1;
        C23755Bp0 bp0;
        String str;
        boolean z3 = cmq instanceof C23756Bp1;
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = cmq2 instanceof C23756Bp1;
        if (z4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 ^ z)) {
            return false;
        }
        if (z) {
            if (z3) {
                bp1 = (C23756Bp1) cmq;
                if ((cmq2 instanceof C23755Bp0) || (cmq2 instanceof C23757Bp2)) {
                    bp0 = cmq2.A06();
                    str = bp0.A01;
                } else {
                    if (cmq2 instanceof C23751Bow) {
                        str = ((C23751Bow) cmq2).toString();
                    }
                    str = "";
                }
            } else {
                throw C23741Bom.A00("Expected regexp node");
            }
        } else if (z4) {
            bp1 = (C23756Bp1) cmq2;
            if ((cmq instanceof C23755Bp0) || (cmq instanceof C23757Bp2)) {
                bp0 = cmq.A06();
                str = bp0.A01;
            } else {
                if (cmq instanceof C23751Bow) {
                    str = ((C23751Bow) cmq).toString();
                }
                str = "";
            }
        } else {
            throw C23741Bom.A00("Expected regexp node");
        }
        return AnonymousClass8BU.A1V(str, bp1.A00);
    }
}

package X;

public class DOE implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        if (cmq2 instanceof C23758Bp3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cmq2 = C23758Bp3.A00(cmq2);
            if (cmq2 instanceof C23749Bou) {
                return false;
            }
        }
        C23759Bp4 A07 = cmq2.A07();
        if (cmq instanceof C23758Bp3) {
            cmq = C23758Bp3.A00(cmq);
            if (cmq instanceof C23749Bou) {
                return false;
            }
        }
        for (Object contains : cmq.A07().A00) {
            if (!A07.A00.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}

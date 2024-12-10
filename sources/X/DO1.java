package X;

public class DO1 implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        if (!(cmq instanceof C23758Bp3) || !(cmq2 instanceof C23758Bp3)) {
            return cmq.equals(cmq2);
        }
        C23758Bp3 A03 = cmq.A03();
        C23758Bp3 A032 = cmq2.A03();
        if (A03 == A032) {
            return true;
        }
        Object obj = A03.A00;
        if (obj != null) {
            if (!obj.equals(A032.A09())) {
                return false;
            }
            return true;
        } else if (A032.A00 == null) {
            return true;
        }
        return false;
    }
}

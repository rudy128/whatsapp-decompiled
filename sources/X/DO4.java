package X;

public class DO4 implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        int compareTo;
        if (cmq instanceof C23757Bp2) {
            z = true;
        } else {
            z = false;
        }
        if (z && (cmq2 instanceof C23757Bp2)) {
            compareTo = C25836Cmq.A01(cmq, cmq2);
        } else if ((cmq instanceof C23755Bp0) && (cmq2 instanceof C23755Bp0)) {
            compareTo = C23755Bp0.A00(cmq, cmq2);
        } else if (!(cmq instanceof C23754Boz) || !(cmq2 instanceof C23754Boz)) {
            return false;
        } else {
            compareTo = cmq.A05().A08().compareTo(cmq2.A05().A08());
        }
        if (compareTo <= 0) {
            return false;
        }
        return true;
    }
}

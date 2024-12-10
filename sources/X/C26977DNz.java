package X;

/* renamed from: X.DNz  reason: case insensitive filesystem */
public class C26977DNz implements E6K {
    public boolean BKd(C25836Cmq cmq, C25836Cmq cmq2, C24957CRh cRh) {
        boolean z;
        if (!(cmq instanceof C23755Bp0) || !(cmq2 instanceof C23755Bp0)) {
            if (cmq instanceof C23758Bp3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C25836Cmq A00 = C23758Bp3.A00(cmq);
                if (!(A00 instanceof C23749Bou)) {
                    return A00.A07().A00.contains(cmq2);
                }
            }
            return false;
        }
        C23755Bp0 A06 = cmq.A06();
        return A06.A01.contains(cmq2.A06().A01);
    }
}

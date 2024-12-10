package X;

import java.util.HashMap;
import java.util.List;

public abstract class CC5 {
    public static final C25187Cad A00(C25487Cgi cgi, List list) {
        C25529ChR chR;
        C24808CLb cLb;
        CUK cuk;
        HashMap A11 = C17880vN.A11();
        String str = null;
        String str2 = null;
        for (COE coe : cgi.A00) {
            String str3 = coe.A01;
            if (!(str3 == null || (chR = coe.A00) == null || (cLb = chR.A00) == null || (cuk = cLb.A00) == null)) {
                if (str2 == null) {
                    str2 = cuk.A05;
                }
                if (str == null) {
                    str = cuk.A04;
                }
                A11.put(str3, C26235CvV.A02(cuk, list));
            }
        }
        return new C25187Cad(str, str2, A11);
    }
}

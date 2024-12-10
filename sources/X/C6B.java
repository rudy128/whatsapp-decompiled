package X;

import java.util.Arrays;

public abstract class C6B {
    public String A00() {
        if (this instanceof BNA) {
            return ((BNA) this).A03;
        }
        String A0U = C17890vO.A0U(this);
        return BE6.A0p(A0U.lastIndexOf(36), A0U);
    }

    public void A01() {
        if (this instanceof BNA) {
            BNA bna = (BNA) this;
            String str = bna.A02;
            String str2 = bna.A03;
            C26294Cx6.A03(str2, str, "[%s] entering state");
            C25118CYr cYr = bna.A00.A02;
            if (cYr != null) {
                String format = String.format("Enter state [%s]", Arrays.copyOf(new Object[]{str2}, 1));
                C18070vi.A0X(format);
                cYr.A01(new CN3(format));
            }
            bna.A01.A07();
        }
    }
}

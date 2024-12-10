package X;

import java.util.Arrays;

/* renamed from: X.23W  reason: invalid class name */
public class AnonymousClass23W extends C439721q {
    public String A00;
    public String A01;

    public void A14(int i) {
        boolean z = false;
        if (i == 2) {
            z = true;
        }
        C17960vV.A0G(z, "FMessageBlankReply can only be quote message.");
        super.A14(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass23W r5 = (AnonymousClass23W) obj;
            if (!C42171xk.A00(this.A00, r5.A00) || !C42171xk.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }
}

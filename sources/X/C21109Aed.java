package X;

import java.util.Map;

/* renamed from: X.Aed  reason: case insensitive filesystem */
public final class C21109Aed implements C22396B5z {
    public final C19980A1q A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final String A05;

    public C21109Aed(C19980A1q a1q, Integer num, String str, String str2, String str3, String str4, Map map) {
        C108985cd.A1D(str2, str3);
        this.A01 = num;
        this.A03 = str;
        this.A05 = str3;
        this.A02 = str4;
        this.A04 = map;
        this.A00 = a1q;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FcsResourceExecutionEvent: ");
        switch (this.A01.intValue()) {
            case 0:
                str = "ON_START";
                break;
            case 1:
                str = "ON_RESUME";
                break;
            case 2:
                str = "ON_RESTORE";
                break;
            case 3:
                str = "ON_COMPLETION";
                break;
            default:
                str = "ON_FAILURE";
                break;
        }
        A10.append(str);
        A10.append(" resourceId = ");
        A10.append(this.A03);
        A10.append(" stateName = ");
        A10.append(this.A05);
        A10.append(" error = ");
        return C17890vO.A0V(this.A00, A10);
    }
}

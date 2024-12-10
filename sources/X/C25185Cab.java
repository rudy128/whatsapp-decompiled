package X;

import java.util.HashMap;

/* renamed from: X.Cab  reason: case insensitive filesystem */
public class C25185Cab {
    public final int A00;
    public final int A01;
    public final C24354Bzp A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C25185Cab cab = (C25185Cab) obj;
                if (!(this.A02 == cab.A02 && this.A01 == cab.A01 && this.A00 == cab.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass3Ma.A1S(objArr, this.A00);
        Boolean A0h = AnonymousClass000.A0h();
        objArr[3] = A0h;
        return AnonymousClass000.A0P(A0h, objArr, 4);
    }

    public C25185Cab(C24354Bzp bzp, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bzp;
    }

    public String toString() {
        HashMap A11 = C17880vN.A11();
        A11.put("codec", this.A02);
        A11.put("profile", Integer.valueOf(this.A01));
        A11.put("level", Integer.valueOf(this.A00));
        A11.put("useBframe", AnonymousClass000.A0h());
        return C26171Ctn.A01(C25185Cab.class, A11);
    }
}

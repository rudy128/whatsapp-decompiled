package X;

import java.util.List;

public final class A1X {
    public final C20272AEf A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A1X) {
                A1X a1x = (A1X) obj;
                if (!C18070vi.A18(this.A00, a1x.A00) || !C18070vi.A18(this.A01, a1x.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public A1X(C20272AEf aEf, List list) {
        this.A00 = aEf;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SERPMapViewResult(mapviewConfig=");
        A10.append(this.A00);
        A10.append(", mapBusinesses=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public A1X() {
        this((C20272AEf) null, C18460wS.A00);
    }
}

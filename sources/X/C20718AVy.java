package X;

/* renamed from: X.AVy  reason: case insensitive filesystem */
public final class C20718AVy implements B5K {
    public final Integer A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20718AVy) {
                C20718AVy aVy = (C20718AVy) obj;
                if (!C18070vi.A18(this.A01, aVy.A01) || this.A00 != aVy.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A002 = C17900vP.A00(this.A01) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "BIZ";
                break;
            case 2:
                str = "BUTTON";
                break;
            default:
                str = "LIST";
                break;
        }
        return A002 + str.hashCode() + intValue;
    }

    public C20718AVy(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingNfmValues(nativeFlowName=");
        A10.append(this.A01);
        A10.append(", envelopeType=");
        switch (this.A00.intValue()) {
            case 1:
                str = "BIZ";
                break;
            case 2:
                str = "BUTTON";
                break;
            default:
                str = "LIST";
                break;
        }
        return C17900vP.A0B(str, A10);
    }
}

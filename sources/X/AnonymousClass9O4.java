package X;

/* renamed from: X.9O4  reason: invalid class name */
public class AnonymousClass9O4 {
    public long A00;
    public C22565BDa A01;
    public C1418477e A02;
    @Deprecated
    public C1418477e A03;
    public C1418477e A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass1KN A00() {
        C1418477e r1 = this.A03;
        if (C20061A5k.A03(r1)) {
            return null;
        }
        return AnonymousClass8BT.A0H(AnonymousClass1KL.A0B, (String) r1.A00);
    }

    public boolean A01() {
        String str;
        String str2;
        String str3 = this.A08;
        if (!str3.equals("UNKNOWN")) {
            if (str3.equals("ACCEPT")) {
                str = this.A09;
                str2 = "PENDING";
            }
            return false;
        }
        str = this.A09;
        str2 = "INIT";
        if (str.equals(str2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ pendingAmount: ");
        C1418477e r2 = this.A03;
        if (C17890vO.A0V(r2, A10) == null) {
            return "";
        }
        StringBuilder A102 = AnonymousClass000.A10();
        C20088A6q.A03(A102, r2.toString());
        A102.append(" errorCode: ");
        A102.append(this.A05);
        A102.append(" seqNum: ");
        A102.append(this.A04);
        A102.append(" mandateUpdateInfo: ");
        A102.append(this.A02);
        A102.append(" mandateUpdateAction: ");
        A102.append(this.A08);
        A102.append(" mandateUpdateStatus: ");
        A102.append(this.A09);
        return AnonymousClass000.A0z(A102);
    }
}

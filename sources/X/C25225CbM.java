package X;

/* renamed from: X.CbM  reason: case insensitive filesystem */
public class C25225CbM {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public String A04 = "";
    public String A05 = "";

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25225CbM cbM = (C25225CbM) obj;
            if (!(this.A03 == cbM.A03 && this.A00 == cbM.A00 && this.A02 == cbM.A02 && this.A01 == cbM.A01 && this.A05.equals(cbM.A05) && this.A04.equals(cbM.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        C17890vO.A1L(objArr, this.A03);
        C17890vO.A1M(objArr, this.A00);
        C17890vO.A1N(objArr, this.A02);
        C17890vO.A1O(objArr, this.A01);
        objArr[4] = this.A05;
        return AnonymousClass000.A0P(this.A04, objArr, 5);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("startReadTimeUs:");
        A10.append(this.A03);
        A10.append("\nendReadTimeUs:");
        A10.append(this.A00);
        A10.append("\nframeBeforeStartReadTimeUs:");
        A10.append(this.A02);
        A10.append("\nframeAfterEndReadTimeUs:");
        A10.append(this.A01);
        A10.append("\ntrackInfoMap:");
        A10.append(this.A05);
        A10.append("\nexceptions:");
        return AnonymousClass000.A0y(this.A04, A10);
    }
}

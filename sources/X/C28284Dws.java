package X;

/* renamed from: X.Dws  reason: case insensitive filesystem */
public class C28284Dws extends AnonymousClass1By {
    public C28337Dxj A00;
    public C28342Dxo A01;
    public C28317DxP A02;

    public AnonymousClass1Bz CP9() {
        C26135Csy csy = new C26135Csy(3);
        C28342Dxo dxo = this.A01;
        if (dxo != null) {
            C28341Dxn.A07(dxo, csy, false);
        }
        C28317DxP dxP = this.A02;
        if (dxP != null) {
            C28341Dxn.A05(dxP, csy);
        }
        C28337Dxj dxj = this.A00;
        if (dxj != null) {
            C28341Dxn.A06(dxj, csy, 2, false);
        }
        return new C28357Dy3(csy);
    }

    public String toString() {
        String str;
        C28342Dxo dxo = this.A01;
        if (dxo != null) {
            byte[] bArr = dxo.A00;
            str = AnonymousClass1Bo.A02(C20073A5z.A02(bArr, 0, bArr.length));
        } else {
            str = "null";
        }
        return BEA.A0l("AuthorityKeyIdentifier: KeyID(", str, AnonymousClass000.A10());
    }
}

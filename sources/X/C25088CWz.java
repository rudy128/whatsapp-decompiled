package X;

/* renamed from: X.CWz  reason: case insensitive filesystem */
public final class C25088CWz {
    public int A00 = -1;
    public C0A A01;
    public C26289Cwp A02;
    public CWH A03;
    public Integer A04;

    public String toString() {
        String str;
        StringBuilder A0t = BE6.A0t(200);
        A0t.append("<<\n");
        A0t.append(" mode: ");
        A0t.append(this.A01);
        A0t.append("\n ecLevel: ");
        Integer num = this.A04;
        if (num != null) {
            str = C25414CfM.A00(num);
        } else {
            str = "null";
        }
        A0t.append(str);
        A0t.append("\n version: ");
        A0t.append(this.A02);
        A0t.append("\n maskPattern: ");
        A0t.append(this.A00);
        CWH cwh = this.A03;
        if (cwh == null) {
            A0t.append("\n matrix: null\n");
        } else {
            A0t.append("\n matrix:\n");
            A0t.append(cwh);
        }
        return AnonymousClass000.A0y(">>\n", A0t);
    }
}

package X;

public class C63 {
    public C25046CVa A00;
    public DS2 A01;
    public Integer A02;

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(String.valueOf(this.A00));
        A10.append(" {...} (src=");
        if (this.A02.intValue() != 0) {
            str = "RenderOptions";
        } else {
            str = "Document";
        }
        A10.append(str);
        return AnonymousClass8BU.A0q(A10);
    }
}

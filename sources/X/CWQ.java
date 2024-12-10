package X;

public class CWQ {
    public C6B A00;
    public CWQ A01;
    public boolean A02;
    public final /* synthetic */ BG4 A03;

    public CWQ(BG4 bg4) {
        this.A03 = bg4;
    }

    public String toString() {
        String A002;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("state=");
        A10.append(this.A00.A00());
        A10.append(",active=");
        A10.append(this.A02);
        A10.append(",parent=");
        CWQ cwq = this.A01;
        if (cwq == null) {
            A002 = "null";
        } else {
            A002 = cwq.A00.A00();
        }
        return AnonymousClass000.A0y(A002, A10);
    }
}

package X;

public class DNT implements E87 {
    public final /* synthetic */ CBw A00;
    public final /* synthetic */ DFL A01;

    public DFL BCM(E9O e9o, DFL dfl) {
        E9O e9o2;
        DFL dfl2 = dfl;
        E9O e9o3 = dfl.A01;
        if (e9o3 != null) {
            e9o2 = e9o3.Bie(e9o);
        } else if (this.A00 == null) {
            return dfl;
        } else {
            e9o2 = null;
        }
        CBw cBw = this.A00;
        int i = dfl.A04;
        return new DFL(e9o2, cBw, dfl2, dfl.A08, dfl.A0A, i);
    }

    public void C9d(DFL dfl) {
    }

    public DNT(CBw cBw, DFL dfl) {
        this.A01 = dfl;
        this.A00 = cBw;
    }
}

package X;

public class DNW implements E6E {
    public DFL A00;
    public final E6I A01;

    public static DFL A00(DFL dfl, E6I e6i, int i) {
        DNW dnw = new DNW(e6i);
        C26081Crw.A00(dfl, dnw, i);
        return dnw.A00;
    }

    public boolean CRs(DFL dfl) {
        if (!this.A01.CP3(dfl)) {
            return false;
        }
        this.A00 = dfl;
        return true;
    }

    public DNW(E6I e6i) {
        this.A01 = e6i;
    }
}

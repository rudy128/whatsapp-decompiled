package X;

public class DP7 implements C107355Zj {
    public final int A00;
    public final Object A01;

    public DP7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CDU(String str) {
        switch (this.A00) {
            case 0:
                ((C24163BwW) this.A01).setNewDescription(str);
                return;
            case 1:
                ((C23797Bpg) this.A01).setNewDescription(str);
                return;
            default:
                C22821Di r0 = (C22821Di) this.A01;
                C18070vi.A0h(r0, str);
                r0.invoke(str);
                return;
        }
    }
}

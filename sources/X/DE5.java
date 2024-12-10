package X;

public class DE5 implements C28497E4c {
    public final int A00;
    public final Object A01;

    public DE5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bv1() {
        E9S e9s;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                e9s = ((BUO) obj).A0R;
                break;
            case 1:
                e9s = ((BUN) obj).A0Q;
                break;
            case 2:
                C26983DOf dOf = (C26983DOf) obj;
                C18070vi.A0d(dOf, 0);
                ((C22807BPv) ((EDC) dOf.A09.BP7(EDC.A01))).A07.A01((Long) null, false);
                return;
            default:
                e9s = (E9S) obj;
                break;
        }
        if (e9s == null) {
            return;
        }
        e9s.Bv1();
    }
}

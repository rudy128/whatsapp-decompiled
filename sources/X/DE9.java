package X;

public class DE9 implements C28498E4d {
    public final int A00;
    public final Object A01;

    public DE9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CFB() {
        E9S e9s;
        switch (this.A00) {
            case 2:
                BUO buo = (BUO) this.A01;
                ((C22807BPv) buo.A08).A07.A01((Long) null, false);
                e9s = buo.A0R;
                break;
            case 3:
                BUN bun = (BUN) this.A01;
                ((C22807BPv) bun.A06).A07.A01((Long) null, false);
                e9s = bun.A0Q;
                break;
            default:
                return;
        }
        if (e9s != null) {
            e9s.Bv2();
        }
    }
}

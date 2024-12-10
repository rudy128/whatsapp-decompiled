package X;

public class API implements C22430B7m {
    public final int A00;
    public final Object A01;

    public API(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final String BYs() {
        AEQ aeq;
        if (this.A00 != 0) {
            aeq = ((AnonymousClass8FD) this.A01).A0T();
            if (aeq == null) {
                return null;
            }
        } else {
            AnonymousClass8FG r1 = (AnonymousClass8FG) this.A01;
            C18070vi.A0d(r1, 0);
            aeq = r1.A0O;
        }
        return aeq.A00;
    }
}

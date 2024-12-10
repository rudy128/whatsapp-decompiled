package X;

public class AGZ implements E7A {
    public final int A00;
    public final Object A01;

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        C18070vi.A0d(obj, 0);
        C31761g5 r1 = (C31761g5) this.A01;
        if (r1.Be2()) {
            r1.resumeWith(obj);
        }
    }

    public AGZ(C31761g5 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ void Bsz(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        C31761g5 r1 = (C31761g5) this.A01;
        if (r1.Be2()) {
            r1.resumeWith(C108945cZ.A1J(th));
        }
    }
}

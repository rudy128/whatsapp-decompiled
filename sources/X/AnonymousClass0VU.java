package X;

/* renamed from: X.0VU  reason: invalid class name */
public class AnonymousClass0VU implements C16650sm {
    public final int A00;
    public final Object A01;

    public AnonymousClass0VU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BJD() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C04680Oi r1 = (C04680Oi) obj;
            r1.A01--;
            return;
        }
        AnonymousClass0VR r12 = (AnonymousClass0VR) obj;
        r12.A00--;
    }

    public void CNf() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((C04680Oi) obj).A01++;
            return;
        }
        ((AnonymousClass0VR) obj).A00++;
    }
}

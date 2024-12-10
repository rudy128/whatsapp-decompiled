package X;

/* renamed from: X.7DV  reason: invalid class name */
public class AnonymousClass7DV implements C1599086i {
    public final int A00;
    public final Object A01;

    public AnonymousClass7DV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Buk() {
        if (this.A00 == 0) {
            AnonymousClass7DY r1 = (AnonymousClass7DY) this.A01;
            C160978Av r0 = r1.A0K;
            if (r0 == null) {
                C18070vi.A11("camera");
                throw null;
            } else if (!r0.isRecording() && !r1.A0f) {
                AnonymousClass7DY.A0H(r1);
            }
        }
    }
}

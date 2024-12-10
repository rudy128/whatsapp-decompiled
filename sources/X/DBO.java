package X;

public class DBO implements E7V, C28656ECq {
    public final int A00;
    public final Object A01;

    public DBO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final long nowNanos() {
        switch (this.A00) {
            case 1:
                AnonymousClass4RN r1 = (AnonymousClass4RN) this.A01;
                C18070vi.A0d(r1, 0);
                r1.A05.get();
                break;
            case 3:
                break;
            default:
                C18070vi.A0d(this.A01, 0);
                break;
        }
        return System.nanoTime();
    }

    public /* synthetic */ long now() {
        return C24548C8t.$default$now(this);
    }
}

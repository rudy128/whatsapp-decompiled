package X;

/* renamed from: X.0WU  reason: invalid class name */
public class AnonymousClass0WU implements C16370s9 {
    public final int A00;

    public AnonymousClass0WU(int i) {
        this.A00 = i;
    }

    public C01990Cf BHh(C28644ECa eCa, C24246By4 by4, long j) {
        AnonymousClass0NU r4;
        switch (this.A00) {
            case 0:
                C17090tj r0 = AnonymousClass0GQ.A00;
                float CG9 = (float) eCa.CG9(30.0f);
                r4 = new AnonymousClass0NU(0.0f, -CG9, AnonymousClass0QG.A02(j), AnonymousClass0QG.A00(j) + CG9);
                break;
            case 1:
                C17090tj r02 = AnonymousClass0GQ.A00;
                float CG92 = (float) eCa.CG9(30.0f);
                r4 = new AnonymousClass0NU(-CG92, 0.0f, AnonymousClass0QG.A02(j) + CG92, AnonymousClass0QG.A00(j));
                break;
            default:
                r4 = C02470Ed.A00(AnonymousClass0QY.A03, j);
                break;
        }
        return new C015709a(r4);
    }

    public String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        return "RectangleShape";
    }
}

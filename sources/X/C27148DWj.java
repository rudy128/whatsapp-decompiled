package X;

/* renamed from: X.DWj  reason: case insensitive filesystem */
public class C27148DWj implements C18080vj, AnonymousClass1OS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C27148DWj(Object obj, int i, Object obj2, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        Object obj3 = this.A03;
        switch (i) {
            case 0:
                int i2 = this.A01;
                C17130tn r5 = (C17130tn) obj;
                C24620CCg.A00(r5, (C17090tj) obj3, (C36001nB) this.A04, AnonymousClass0L8.A00(i2), this.A02);
                break;
            case 1:
                int i3 = this.A01;
                C17130tn r52 = (C17130tn) obj;
                C24622CCi.A00(r52, (C17090tj) obj3, (C24323BzK) this.A04, AnonymousClass0L8.A00(i3), this.A02);
                break;
            case 2:
                int i4 = this.A01;
                C17130tn r53 = (C17130tn) obj;
                C24630CCq.A00(r53, (C17090tj) obj3, (C24265ByO) this.A04, AnonymousClass0L8.A00(i4), this.A02);
                break;
            default:
                int i5 = this.A01;
                C17130tn r54 = (C17130tn) obj;
                CDI.A00(r54, (C18090vk) obj3, (C18090vk) this.A04, AnonymousClass0L8.A00(i5), this.A02);
                break;
        }
        return C27621Wu.A00;
    }
}

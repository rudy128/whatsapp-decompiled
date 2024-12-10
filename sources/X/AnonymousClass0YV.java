package X;

/* renamed from: X.0YV  reason: invalid class name */
public class AnonymousClass0YV implements C22508BAp {
    public final int A00;
    public final Object A01;

    public AnonymousClass0YV(AnonymousClass0IX r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void BtA(C190599lD r3, int i) {
        int i2 = this.A00;
        AnonymousClass0IX r0 = (AnonymousClass0IX) this.A01;
        if (i2 != 0) {
            C16770sz r02 = r0.A01;
            if (r02 != null) {
                r02.Bu7(i);
                return;
            }
            return;
        }
        C16760sy r03 = r0.A00;
        if (r03 != null) {
            r03.BuJ(i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass0Jv r2 = (AnonymousClass0Jv) obj;
            C16770sz r0 = ((AnonymousClass0IX) this.A01).A01;
            if (r0 != null) {
                r0.Bu6(r2);
                return;
            }
            return;
        }
        AnonymousClass0Ju r22 = (AnonymousClass0Ju) obj;
        C16760sy r02 = ((AnonymousClass0IX) this.A01).A00;
        if (r02 != null) {
            r02.BuQ(r22);
        }
    }
}

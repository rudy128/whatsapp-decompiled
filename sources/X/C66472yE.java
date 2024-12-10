package X;

/* renamed from: X.2yE  reason: invalid class name and case insensitive filesystem */
public class C66472yE implements C25091Mv {
    public final int A00;
    public final Object A01;

    public C66472yE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C25131Mz BH3(String str, int i) {
        AnonymousClass10E r1;
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            r1 = ((AnonymousClass10H) obj).A00;
        } else {
            r1 = ((AnonymousClass10F) obj).A00;
        }
        return new C25131Mz((AnonymousClass11N) r1.A96.get(), (C24571Kv) r1.ABZ.get(), str, i);
    }
}

package X;

/* renamed from: X.0WV  reason: invalid class name */
public abstract class AnonymousClass0WV implements C16370s9 {
    public final C16220ru A00;
    public final C16220ru A01;
    public final C16220ru A02;
    public final C16220ru A03;

    public abstract C01990Cf A00(C24246By4 by4, float f, float f2, float f3, float f4, long j);

    public final C01990Cf BHh(C28644ECa eCa, C24246By4 by4, long j) {
        long j2 = j;
        float CPR = this.A03.CPR(eCa, j);
        float CPR2 = this.A02.CPR(eCa, j);
        float CPR3 = this.A00.CPR(eCa, j);
        float CPR4 = this.A01.CPR(eCa, j);
        float A012 = AnonymousClass0QG.A01(j);
        float f = CPR + CPR4;
        if (f > A012) {
            float f2 = A012 / f;
            CPR *= f2;
            CPR4 *= f2;
        }
        float f3 = CPR2 + CPR3;
        if (f3 > A012) {
            float f4 = A012 / f3;
            CPR2 *= f4;
            CPR3 *= f4;
        }
        if (CPR >= 0.0f && CPR2 >= 0.0f && CPR3 >= 0.0f && CPR4 >= 0.0f) {
            return A00(by4, CPR, CPR2, CPR3, CPR4, j2);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Corner size in Px can't be negative(topStart = ");
        A10.append(CPR);
        A10.append(", topEnd = ");
        A10.append(CPR2);
        A10.append(", bottomEnd = ");
        A10.append(CPR3);
        A10.append(", bottomStart = ");
        A10.append(CPR4);
        throw AnonymousClass001.A12(")!", A10);
    }

    public AnonymousClass0WV(C16220ru r1, C16220ru r2, C16220ru r3, C16220ru r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}

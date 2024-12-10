package X;

/* renamed from: X.C7c  reason: case insensitive filesystem */
public abstract class C24508C7c {
    public static final C25785Clw A00(float f) {
        Float valueOf = Float.valueOf(f);
        Integer num = AnonymousClass00R.A00;
        D7E d7e = D7E.A00;
        AnonymousClass3Ma.A1O(valueOf, 0, d7e);
        Object A01 = new C22724BMl(d7e, num, valueOf, "SplitAttributes").A00("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new C27927DoP(f)).A01();
        C18070vi.A0b(A01);
        float A04 = AnonymousClass000.A04(A01);
        C25785Clw clw = C25785Clw.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ratio:");
        A10.append(A04);
        return new C25785Clw(A10.toString(), A04);
    }
}

package X;

/* renamed from: X.BMm  reason: case insensitive filesystem */
public final class C22725BMm extends C6A {
    public final C1F A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final E0Q A05;

    public C22725BMm(E0Q e0q, Integer num, Object obj, String str, String str2) {
        C18070vi.A0g(e0q, 4, num);
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = e0q;
        this.A01 = num;
        C1F c1f = new C1F(AnonymousClass001.A1E(obj, " value: ", AnonymousClass000.A11(str2)));
        StackTraceElement[] stackTrace = c1f.getStackTrace();
        C18070vi.A0X(stackTrace);
        c1f.setStackTrace((StackTraceElement[]) C200410p.A0R(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.A00 = c1f;
    }
}

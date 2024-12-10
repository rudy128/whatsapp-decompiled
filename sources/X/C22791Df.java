package X;

/* renamed from: X.1Df  reason: invalid class name and case insensitive filesystem */
public abstract class C22791Df {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Dh, java.lang.Object] */
    public static final C22801Dg A00(AnonymousClass1DS r5) {
        C18070vi.A0d(r5, 0);
        C22801Dg r3 = new C22801Dg();
        ? obj = new Object();
        obj.element = true;
        if (r5.A08 != AnonymousClass1DS.A0A) {
            r3.A0F(r5.A06());
            obj.element = false;
        }
        r3.A0H(r5, new C65032vj(new C22831Dj(r3, obj), 0));
        return r3;
    }

    public static final C22801Dg A01(AnonymousClass1DS r4, C22821Di r5) {
        C18070vi.A0d(r4, 0);
        C22801Dg r3 = new C22801Dg();
        if (r4.A08 != AnonymousClass1DS.A0A) {
            r3.A0F(r5.invoke(r4.A06()));
        }
        r3.A0H(r4, new C65032vj(new AnonymousClass3IY(r3, r5), 0));
        return r3;
    }
}

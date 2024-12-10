package X;

/* renamed from: X.0wj  reason: invalid class name and case insensitive filesystem */
public abstract class C18580wj implements C18570wi {
    public final C23801Hr key;

    public C18580wj(C23801Hr r2) {
        C18070vi.A0d(r2, 1);
        this.key = r2;
    }

    public Object fold(Object obj, AnonymousClass1OS r3) {
        C18070vi.A0d(r3, 2);
        return r3.invoke(obj, this);
    }

    public C18570wi get(C23801Hr r2) {
        return AnonymousClass1OQ.A01(this, r2);
    }

    public C23801Hr getKey() {
        return this.key;
    }

    public C18560wh minusKey(C23801Hr r2) {
        return AnonymousClass1OQ.A02(this, r2);
    }

    public C18560wh plus(C18560wh r2) {
        return AnonymousClass1OQ.A03(this, r2);
    }
}

package X;

/* renamed from: X.9zU  reason: invalid class name and case insensitive filesystem */
public class C199129zU {
    public final Object A00;
    public final Object A01;

    public static C20125A8k A00(C172768tz r1) {
        C18070vi.A0d(r1, 0);
        return r1.A00;
    }

    public C199129zU(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        Object obj;
        Object obj2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GraphQlResult(data=");
        boolean z = this instanceof C172768tz;
        if (z) {
            obj = ((C172768tz) this).A00;
        } else {
            obj = this.A00;
        }
        A10.append(obj);
        A10.append(", errors=");
        if (z) {
            obj2 = ((C172768tz) this).A01;
        } else {
            obj2 = this.A01;
        }
        return AnonymousClass001.A1F(obj2, A10);
    }
}

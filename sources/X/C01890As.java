package X;

/* renamed from: X.0As  reason: invalid class name and case insensitive filesystem */
public class C01890As extends AnonymousClass0WA {
    public final int A00;
    public final Object A01;

    public C01890As(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        if (this.A00 != 0) {
            return ((AnonymousClass0WH) this.A01).A01;
        }
        return ((AnonymousClass0WK) this.A01).A01;
    }

    public int hashCode() {
        Object obj;
        int i = this.A00;
        Object obj2 = this.A01;
        if (i != 0) {
            obj = ((AnonymousClass0WH) obj2).A01;
        } else {
            obj = ((AnonymousClass0WK) obj2).A01;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return AnonymousClass000.A1Z(obj, this);
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r1) {
    }
}

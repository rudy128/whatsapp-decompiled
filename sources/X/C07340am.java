package X;

/* renamed from: X.0am  reason: invalid class name and case insensitive filesystem */
public class C07340am<K, V> extends DVN<K, V> implements C17820vH<K, V> {
    public static final C07340am A02 = new C07340am(C05180Qv.A04, 0);
    public final int A00;
    public final C05180Qv A01;

    public C07340am A02(Object obj) {
        C05180Qv r3 = this.A01;
        C05180Qv A0V = r3.A0V(obj, AnonymousClass001.A0l(obj), 0);
        if (r3 == A0V) {
            return this;
        }
        if (A0V == null) {
            return AnonymousClass0EP.A00();
        }
        return new C07340am(A0V, size() - 1);
    }

    public C07340am A03(Object obj, Object obj2) {
        AnonymousClass0HQ A0P = this.A01.A0P(obj, obj2, AnonymousClass001.A0l(obj), 0);
        if (A0P == null) {
            return this;
        }
        return new C07340am(A0P.A00, size() + A0P.A01);
    }

    /* renamed from: A04 */
    public C07370ap BDe() {
        return new C07370ap(this);
    }

    public boolean containsKey(Object obj) {
        return this.A01.A0X(obj, AnonymousClass001.A0l(obj), 0);
    }

    public Object get(Object obj) {
        return this.A01.A0W(obj, AnonymousClass001.A0l(obj), 0);
    }

    public C07340am(C05180Qv r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final C05180Qv A05() {
        return this.A01;
    }
}

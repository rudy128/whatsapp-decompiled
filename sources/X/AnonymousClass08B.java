package X;

/* renamed from: X.08B  reason: invalid class name */
public final class AnonymousClass08B extends C07370ap<AnonymousClass0OI<Object>, C16300s2<? extends Object>> implements C17340uV {
    public AnonymousClass084 A00;

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C16300s2)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return null;
        }
        return super.remove(obj);
    }

    public AnonymousClass08B(AnonymousClass084 r1) {
        super(r1);
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0EQ] */
    /* renamed from: A08 */
    public AnonymousClass084 BDO() {
        C05180Qv A02 = A02();
        AnonymousClass084 r1 = this.A00;
        if (A02 != r1.A05()) {
            A06(new Object());
            r1 = new AnonymousClass084(A02, size());
        }
        this.A00 = r1;
        return r1;
    }
}

package X;

/* renamed from: X.0YU  reason: invalid class name */
public class AnonymousClass0YU implements AnonymousClass0sZ {
    public final int A00;
    public final Object A01;

    public static AnonymousClass0I3 A00(AnonymousClass0YU r1, AnonymousClass0HI r2, Object obj) {
        C18070vi.A0d(r2, 1);
        return r1.A03(r2, obj);
    }

    public final AnonymousClass0I3 A03(AnonymousClass0HI r2, Object obj) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        return (AnonymousClass0I3) ((AnonymousClass1OS) this.A01).invoke(r2, obj);
    }

    public AnonymousClass0YU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ AnonymousClass0I3 BD2(AnonymousClass0HI r2, Object obj, Object obj2) {
        if (this.A00 == 0) {
            return A00(this, r2, obj);
        }
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(obj, 1);
        return (AnonymousClass0I3) ((C36001nB) this.A01).invoke(r2, obj, obj2);
    }

    public static boolean A01(Object obj, Object obj2) {
        return !C25322CdT.A00(obj, obj2);
    }

    public static boolean A02(Object obj, Object obj2, Object obj3, Object obj4) {
        if (!C25322CdT.A00(obj3, obj4) || !C25322CdT.A00(obj, obj2)) {
            return true;
        }
        return false;
    }
}

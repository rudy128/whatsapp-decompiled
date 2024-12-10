package X;

/* renamed from: X.3W2  reason: invalid class name */
public final class AnonymousClass3W2 extends C40411uf {
    public static final AnonymousClass3W2 A00 = new Object();

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        C106725Wy r3 = (C106725Wy) obj;
        C106725Wy r4 = (C106725Wy) obj2;
        C18070vi.A0h(r3, r4);
        if (!(r3 instanceof C93374is) || !(r4 instanceof C93374is)) {
            if ((r3 instanceof C93354iq) && (r4 instanceof C93354iq)) {
                obj3 = ((C93354iq) r3).A00;
                obj4 = ((C93354iq) r4).A00;
            } else if (!(r3 instanceof C93364ir) || !(r4 instanceof C93364ir)) {
                return false;
            } else {
                obj3 = ((C93364ir) r3).A00.A0J;
                obj4 = ((C93364ir) r4).A00.A0J;
            }
            return C18070vi.A18(obj3, obj4);
        }
        C89444cT r0 = ((C93374is) r3).A06.A04;
        return C18070vi.A18(r0, r0);
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C18070vi.A0h(obj, obj2);
        return obj.equals(obj2);
    }
}

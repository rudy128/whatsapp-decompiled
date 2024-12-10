package X;

/* renamed from: X.3W6  reason: invalid class name */
public final class AnonymousClass3W6 extends C40411uf {
    public static final AnonymousClass3W6 A00 = new Object();

    public /* bridge */ /* synthetic */ Object A00(Object obj, Object obj2) {
        C106535Wf r3 = (C106535Wf) obj;
        C106535Wf r4 = (C106535Wf) obj2;
        C18070vi.A0h(r3, r4);
        if (!(r3 instanceof C92434hI) || !(r4 instanceof C92434hI) || C18070vi.A18(((C92434hI) r3).A00, ((C92434hI) r4).A00)) {
            return null;
        }
        return "none_selected_drawable_changed";
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Object obj3 = (C106535Wf) obj;
        Object obj4 = (C106535Wf) obj2;
        C18070vi.A0h(obj3, obj4);
        if (obj3 instanceof C92444hJ) {
            if ((obj4 instanceof C92434hI) || (obj4 instanceof C92444hJ)) {
                return true;
            }
            return false;
        } else if ((obj3 instanceof C92434hI) && (obj4 instanceof C92434hI)) {
            return true;
        } else {
            if ((obj3 instanceof C92424hH) && (obj4 instanceof C92424hH)) {
                obj3 = ((C92424hH) obj3).A00.BUq().BSi();
                obj4 = ((C92424hH) obj4).A00.BUq().BSi();
            }
            return C18070vi.A18(obj3, obj4);
        }
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C18070vi.A0h(obj, obj2);
        return obj.equals(obj2);
    }
}

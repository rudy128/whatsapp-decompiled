package X;

/* renamed from: X.5jn  reason: invalid class name and case insensitive filesystem */
public final class C111485jn extends C40411uf {
    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        Object obj3 = (C123036Sw) obj;
        Object obj4 = (C123036Sw) obj2;
        C18070vi.A0h(obj3, obj4);
        if (!C18070vi.A14(obj3, obj4)) {
            return false;
        }
        if (!(obj3 instanceof C115475u4) || !(obj4 instanceof C115475u4)) {
            if ((obj3 instanceof C115445u1) && (obj4 instanceof C115445u1)) {
                obj3 = ((C115445u1) obj3).A01;
                obj4 = ((C115445u1) obj4).A01;
            } else if ((obj3 instanceof C115455u2) && (obj4 instanceof C115455u2)) {
                obj3 = ((C115455u2) obj3).A00;
                obj4 = ((C115455u2) obj4).A00;
            }
            return C18070vi.A18(obj3, obj4);
        } else if (((C115475u4) obj3).A00 == ((C115475u4) obj4).A00) {
            return true;
        } else {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C18070vi.A0h(obj, obj2);
        return obj.equals(obj2);
    }
}

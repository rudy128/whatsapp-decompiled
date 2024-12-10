package X;

import java.util.Iterator;

/* renamed from: X.0as  reason: invalid class name and case insensitive filesystem */
public final class C07400as<E> extends AnonymousClass3F0<E> implements C17840vJ<E> {
    public static final C07400as A03;
    public final C07340am A00;
    public final Object A01;
    public final Object A02;

    static {
        C04090Lu r2 = C04090Lu.A00;
        A03 = new C07400as(AnonymousClass0EP.A00(), r2, r2);
    }

    public int A0B() {
        return this.A00.size();
    }

    public C07400as BAm(Object obj) {
        C07340am r2 = this.A00;
        if (r2.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C07400as(r2.A03(obj, new C04160Mb()), obj, obj);
        }
        Object obj2 = this.A02;
        Object obj3 = r2.get(obj2);
        C18070vi.A0b(obj3);
        return new C07400as(r2.A03(obj2, new C04160Mb(((C04160Mb) obj3).A01, obj)).A03(obj, new C04160Mb(obj2, C04090Lu.A00)), this.A01, obj);
    }

    public C07400as CEW(Object obj) {
        C07340am r0 = this.A00;
        C04160Mb r3 = (C04160Mb) r0.get(obj);
        if (r3 == null) {
            return this;
        }
        C07340am A022 = r0.A02(obj);
        Object obj2 = r3.A01;
        C04090Lu r5 = C04090Lu.A00;
        boolean z = false;
        if (obj2 != r5) {
            z = true;
            Object obj3 = A022.get(obj2);
            C18070vi.A0b(obj3);
            A022 = A022.A03(obj2, new C04160Mb(((C04160Mb) obj3).A01, r3.A00));
        }
        Object obj4 = r3.A00;
        boolean z2 = false;
        if (obj4 != r5) {
            z2 = true;
            Object obj5 = A022.get(obj4);
            C18070vi.A0b(obj5);
            A022 = A022.A03(obj4, new C04160Mb(obj2, ((C04160Mb) obj5).A00));
        }
        if (z) {
            obj4 = this.A01;
        }
        if (z2) {
            obj2 = this.A02;
        }
        return new C07400as(A022, obj4, obj2);
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public Iterator iterator() {
        return new C06770Zp(this.A01, this.A00);
    }

    public C07400as(C07340am r1, Object obj, Object obj2) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = r1;
    }
}

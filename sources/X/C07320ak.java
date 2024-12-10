package X;

import java.util.List;

/* renamed from: X.0ak  reason: invalid class name and case insensitive filesystem */
public final class C07320ak<E> extends C19800z1<E> implements C17810vG<E> {
    public int A00;
    public final int A01;
    public final C17810vG A02;

    public static final void A00(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder A11 = AnonymousClass000.A11("fromIndex: ");
            A11.append(i);
            A11.append(", toIndex: ");
            A11.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass001.A1I(", size: ", A11, i3));
        } else if (i > i2) {
            StringBuilder A112 = AnonymousClass000.A11("fromIndex: ");
            A112.append(i);
            throw AnonymousClass001.A13(" > toIndex: ", A112, i2);
        }
    }

    public Object get(int i) {
        AnonymousClass0LB.A00(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        A00(i, i2, this.A00);
        C17810vG r2 = this.A02;
        int i3 = this.A01;
        return new C07320ak(r2, i + i3, i3 + i2);
    }

    public C07320ak(C17810vG r2, int i, int i2) {
        this.A02 = r2;
        this.A01 = i;
        A00(i, i2, r2.size());
        this.A00 = i2 - i;
    }

    public int A0B() {
        return this.A00;
    }
}

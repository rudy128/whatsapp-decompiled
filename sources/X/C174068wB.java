package X;

import java.util.Queue;

/* renamed from: X.8wB  reason: invalid class name and case insensitive filesystem */
public class C174068wB extends C174358we {
    public final BAV A00;
    public final Queue A01;

    public C174068wB(BAV bav, Queue queue) {
        super(41);
        this.A01 = queue;
        this.A00 = bav;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return C42171xk.A00(this.A01, ((C174068wB) obj).A01);
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, super.hashCode());
        A1a[1] = this.A01;
        return AnonymousClass000.A0P(this.A00, A1a, 2);
    }
}

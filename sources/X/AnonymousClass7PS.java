package X;

import java.io.Serializable;

/* renamed from: X.7PS  reason: invalid class name */
public final class AnonymousClass7PS implements Serializable {
    public final Object first;
    public final Object second;
    public final Object third;

    public final Object A00() {
        return this.first;
    }

    public final Object A01() {
        return this.second;
    }

    public final Object A02() {
        return this.third;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7PS) {
                AnonymousClass7PS r5 = (AnonymousClass7PS) obj;
                if (!C18070vi.A18(this.first, r5.first) || !C18070vi.A18(this.second, r5.second) || !C18070vi.A18(this.third, r5.third)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.first) * 31) + AnonymousClass001.A0k(this.second)) * 31) + C17880vN.A02(this.third);
    }

    public AnonymousClass7PS(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('(');
        A10.append(this.first);
        A10.append(", ");
        A10.append(this.second);
        A10.append(", ");
        return AnonymousClass001.A1F(this.third, A10);
    }
}

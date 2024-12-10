package X;

import java.util.List;

/* renamed from: X.4YB  reason: invalid class name */
public final class AnonymousClass4YB {
    public final Integer A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YB) {
                AnonymousClass4YB r5 = (AnonymousClass4YB) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public AnonymousClass4YB(Integer num, List list) {
        this.A01 = list;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(listItems=");
        A10.append(this.A01);
        A10.append(", upcomingEventsCount=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass4YB() {
        this((Integer) null, (List) null);
    }
}

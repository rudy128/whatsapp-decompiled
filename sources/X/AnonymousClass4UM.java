package X;

import java.util.List;

/* renamed from: X.4UM  reason: invalid class name */
public final class AnonymousClass4UM {
    public final Long A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UM) {
                AnonymousClass4UM r5 = (AnonymousClass4UM) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, (C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00)) * 31);
    }

    public AnonymousClass4UM(Long l, String str, List list) {
        this.A01 = str;
        this.A00 = l;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetricResponse(status=");
        A10.append(this.A01);
        A10.append(", lastUpdateMillis=");
        A10.append(this.A00);
        A10.append(", values=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}

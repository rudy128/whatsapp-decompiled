package X;

/* renamed from: X.9qX  reason: invalid class name and case insensitive filesystem */
public final class C193709qX {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193709qX) {
                C193709qX r5 = (C193709qX) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A00, C17880vN.A03(this.A01)) + 2131897367;
    }

    public C193709qX(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpcomingActivitySectionItemViewState(dayOfWeek=");
        A10.append(this.A01);
        A10.append(", date=");
        A10.append(this.A00);
        A10.append(", dateFormatStringId=");
        return AnonymousClass001.A1L(A10, 2131897367);
    }
}

package X;

/* renamed from: X.6rz  reason: invalid class name and case insensitive filesystem */
public final class C135306rz {
    public final Boolean A00;
    public final Integer A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135306rz) {
                C135306rz r5 = (C135306rz) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public C135306rz(Boolean bool, Integer num, Long l) {
        this.A02 = l;
        this.A00 = bool;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PickerData(hdToggleChange=");
        A10.append(this.A02);
        A10.append(", hdToggleEligible=");
        A10.append(this.A00);
        A10.append(", hdToggleState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}

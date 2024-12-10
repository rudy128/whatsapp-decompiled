package X;

/* renamed from: X.6t7  reason: invalid class name and case insensitive filesystem */
public final class C136006t7 {
    public final long A00;
    public final long A01;
    public final C133406oh A02;
    public final Long A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136006t7) {
                C136006t7 r8 = (C136006t7) obj;
                if (!C18070vi.A18(this.A04, r8.A04) || this.A01 != r8.A01 || this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A01, C17880vN.A03(this.A04))) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03);
    }

    public C136006t7(C133406oh r1, Long l, String str, long j, long j2) {
        this.A04 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = r1;
        this.A03 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SnaplEvent(eventName=");
        A10.append(this.A04);
        A10.append(", mediaTimeMs=");
        A10.append(this.A01);
        A10.append(", clientTimeMs=");
        A10.append(this.A00);
        A10.append(", tagMetadata=");
        A10.append(this.A02);
        A10.append(", mediaDurationMs=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}

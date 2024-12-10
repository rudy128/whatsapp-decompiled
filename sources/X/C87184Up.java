package X;

/* renamed from: X.4Up  reason: invalid class name and case insensitive filesystem */
public final class C87184Up {
    public final AnonymousClass1EC A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final C22821Di A04;

    public C87184Up(AnonymousClass1EC r2, Integer num, Integer num2, Integer num3, C22821Di r6) {
        C18070vi.A0d(r6, 4);
        this.A00 = r2;
        this.A03 = num;
        this.A02 = num2;
        this.A04 = r6;
        this.A01 = num3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87184Up) {
                C87184Up r5 = (C87184Up) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A04, (((AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunityNavigationItemsUiState(parentJid=");
        A10.append(this.A00);
        A10.append(", upcomingEventsCount=");
        A10.append(this.A03);
        A10.append(", pendingGroupsCount=");
        A10.append(this.A02);
        A10.append(", onPendingGroupsClick=");
        A10.append(this.A04);
        A10.append(", mediaCount=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}

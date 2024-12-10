package X;

/* renamed from: X.Ac8  reason: case insensitive filesystem */
public final class C20954Ac8 implements AnonymousClass229 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20954Ac8) && C18070vi.A18(this.A00, ((C20954Ac8) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public C20954Ac8(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PremiumMessageCampaignId(campaignId=");
        return C17900vP.A0B(this.A00, A10);
    }
}

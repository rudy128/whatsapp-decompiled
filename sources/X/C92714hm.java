package X;

/* renamed from: X.4hm  reason: invalid class name and case insensitive filesystem */
public final class C92714hm implements C108825cM {
    public final AnonymousClass20G A00;
    public final C92594ha A01;
    public final C86734Sv A02;
    public final AnonymousClass4ZN A03 = AnonymousClass3MX.A0t(2131886695);

    public C92714hm(C92594ha r4, AnonymousClass20G r5) {
        C18070vi.A0d(r5, 2);
        this.A01 = r4;
        this.A00 = r5;
        this.A02 = new C86734Sv(new AnonymousClass78Q((Object) this, (Object) r4, 16), AnonymousClass3MX.A0t(2131886712));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92714hm) {
                C92714hm r5 = (C92714hm) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4ZN BNZ() {
        return this.A03;
    }

    public C86734Sv BNt() {
        return this.A02;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EnablingErrorBannerContent(previousEnablingState=");
        A10.append(this.A01);
        A10.append(", retryEffect=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}

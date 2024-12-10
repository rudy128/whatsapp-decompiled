package X;

/* renamed from: X.4Uo  reason: invalid class name and case insensitive filesystem */
public final class C87174Uo {
    public final C63852tn A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87174Uo) {
                C87174Uo r5 = (C87174Uo) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02), this.A04), this.A01), this.A03);
    }

    public C87174Uo(C63852tn r1, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = r1;
        this.A02 = z;
        this.A04 = z2;
        this.A01 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncryptionInfoViewState(businessState=");
        A10.append(this.A00);
        A10.append(", isInAppSupportChatOrInAppSurvey=");
        A10.append(this.A02);
        A10.append(", isChatPSAJid=");
        A10.append(this.A04);
        A10.append(", isBusinessE2EE=");
        A10.append(this.A01);
        A10.append(", isMe=");
        return C17900vP.A0F(A10, this.A03);
    }
}

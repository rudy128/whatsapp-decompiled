package X;

import java.util.HashSet;

/* renamed from: X.4YT  reason: invalid class name */
public final class AnonymousClass4YT {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final HashSet A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YT) {
                AnonymousClass4YT r5 = (AnonymousClass4YT) obj;
                if (this.A01 != r5.A01 || this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, (AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A01), this.A02) + C17900vP.A00(this.A00)) * 31);
    }

    public AnonymousClass4YT() {
        this(C17880vN.A12());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaUserJourneyLogger(hasAdContext=");
        A10.append(this.A01);
        A10.append(", icebreakersShown=");
        A10.append(this.A02);
        A10.append(", adId=");
        A10.append(this.A00);
        A10.append(", performedAction=");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public AnonymousClass4YT(HashSet hashSet) {
        this.A01 = false;
        this.A02 = false;
        this.A00 = null;
        this.A03 = hashSet;
    }
}

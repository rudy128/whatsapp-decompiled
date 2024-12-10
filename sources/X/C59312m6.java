package X;

/* renamed from: X.2m6  reason: invalid class name and case insensitive filesystem */
public final class C59312m6 {
    public final C129996ii A00;
    public final C58252kO A01;
    public final C88344Zh A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59312m6) {
                C59312m6 r5 = (C59312m6) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00))) - 891611359;
    }

    public C59312m6(C129996ii r1, C58252kO r2, C88344Zh r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompanionDeviceAndKey(companionPairingData=");
        A10.append(this.A00);
        A10.append(", device=");
        A10.append(this.A02);
        A10.append(", identityPublicKey=");
        A10.append(this.A01);
        A10.append(", pairingCriticalDataHistorySyncState=");
        return C17900vP.A0B("ENABLED", A10);
    }
}

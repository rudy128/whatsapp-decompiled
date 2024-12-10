package X;

/* renamed from: X.4VS  reason: invalid class name */
public final class AnonymousClass4VS {
    public final AnonymousClass4V2 A00;
    public final AnonymousClass4TW A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VS) {
                AnonymousClass4VS r5 = (AnonymousClass4VS) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        AnonymousClass4TW r6 = this.A01;
        boolean z = r6.A01;
        if (z && r6.A00 == 0) {
            return AnonymousClass00R.A0j;
        }
        if (z && r6.A00 == 1) {
            return AnonymousClass00R.A0u;
        }
        if (z && r6.A00 == 2) {
            return AnonymousClass00R.A15;
        }
        if (!z || r6.A00 != 3) {
            if (z) {
                int i = r6.A00;
                if (i != 4) {
                    if (i == 5) {
                        return AnonymousClass00R.A19;
                    }
                }
            }
            AnonymousClass4V2 r1 = this.A00;
            if (!r1.A05) {
                return null;
            }
            int i2 = r1.A01;
            if (i2 == 0) {
                return AnonymousClass00R.A00;
            }
            if (i2 == 1) {
                return AnonymousClass00R.A0C;
            }
            if (i2 == 2) {
                return AnonymousClass00R.A0N;
            }
            if (i2 == 3) {
                return AnonymousClass00R.A0Y;
            }
            if (i2 == 4) {
                return AnonymousClass00R.A01;
            }
            return null;
        }
        return AnonymousClass00R.A18;
    }

    public final boolean A01() {
        if (this.A00.A05 || this.A01.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public AnonymousClass4VS(AnonymousClass4V2 r1, AnonymousClass4TW r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PushToRecordMediaTipControllerState(pushToRecordToolTipUiState=");
        A10.append(this.A00);
        A10.append(", pushToVideoCameraEntryPointToolTipUiState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}

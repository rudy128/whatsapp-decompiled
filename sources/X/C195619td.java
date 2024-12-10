package X;

/* renamed from: X.9td  reason: invalid class name and case insensitive filesystem */
public final class C195619td {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06 = null;
    public String A07 = "";
    public String A08 = "";

    public C195619td() {
        Integer A0f = AnonymousClass3MY.A0f();
        this.A00 = A0f;
        this.A05 = A0f;
        this.A04 = A0f;
        this.A02 = A0f;
        this.A03 = A0f;
        this.A01 = A0f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195619td) {
                C195619td r5 = (C195619td) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((C17890vO.A02(this.A08, C17890vO.A02(this.A07, AnonymousClass001.A0k(this.A06) * 31)) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WifiTelemetryData(rssi=");
        A10.append(this.A06);
        A10.append(", frequencyUnit=");
        A10.append(this.A07);
        A10.append(", speedUnit=");
        A10.append(this.A08);
        A10.append(", frequency=");
        A10.append(this.A00);
        A10.append(", wifiStandard=");
        A10.append(this.A05);
        A10.append(", txLinkSpeed=");
        A10.append(this.A04);
        A10.append(", maxSupportedTxLinkSpeed=");
        A10.append(this.A02);
        A10.append(", rxLinkSpeed=");
        A10.append(this.A03);
        A10.append(", maxSupportedRxLinkSpeed=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}

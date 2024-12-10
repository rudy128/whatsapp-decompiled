package X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BTb  reason: case insensitive filesystem */
public final class C22867BTb extends C3J {
    public C25647Cjd A00 = null;
    public C24496C6o A01;
    public C25057CVn A02 = null;
    public C24276ByZ A03;
    public C24276ByZ A04;
    public UUID A05;
    public UUID A06;
    public UUID A07 = null;
    public UUID A08 = null;
    public final AtomicBoolean A09;

    public C22867BTb(C24496C6o c6o, C24276ByZ byZ, C24276ByZ byZ2, UUID uuid, UUID uuid2, AtomicBoolean atomicBoolean) {
        C18070vi.A0g(byZ, 4, byZ2);
        this.A01 = c6o;
        this.A06 = uuid;
        this.A05 = uuid2;
        this.A04 = byZ;
        this.A03 = byZ2;
        this.A09 = atomicBoolean;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22867BTb) {
                C22867BTb bTb = (C22867BTb) obj;
                if (!C18070vi.A18(this.A01, bTb.A01) || !C18070vi.A18(this.A06, bTb.A06) || !C18070vi.A18(this.A05, bTb.A05) || this.A04 != bTb.A04 || this.A03 != bTb.A03 || !C18070vi.A18(this.A09, bTb.A09) || !C18070vi.A18(this.A02, bTb.A02) || !C18070vi.A18(this.A08, bTb.A08) || !C18070vi.A18(this.A07, bTb.A07) || !C18070vi.A18(this.A00, bTb.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A0N(this.A09, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0L(this.A01)))))) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SessionData(currentLink=");
        A10.append(this.A01);
        A10.append(", currentTxLinkId=");
        A10.append(this.A06);
        A10.append(", currentRxLinkId=");
        A10.append(this.A05);
        A10.append(", currentTxLinkType=");
        A10.append(this.A04);
        A10.append(", currentRxLinkType=");
        A10.append(this.A03);
        A10.append(", shouldSwitchInput=");
        A10.append(this.A09);
        A10.append(", inputRolloverData=");
        A10.append(this.A02);
        A10.append(", txLinkToSwitchToId=");
        A10.append(this.A08);
        A10.append(", rxLinkToSwitchToId=");
        A10.append(this.A07);
        A10.append(", linkSwitchBlockingResult=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}

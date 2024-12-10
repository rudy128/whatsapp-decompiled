package X;

import android.graphics.Point;

/* renamed from: X.7DM  reason: invalid class name */
public final class AnonymousClass7DM implements C1605188u {
    public final Point A00;
    public final AnonymousClass70A A01;
    public final AnonymousClass6T0 A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7DM) {
                AnonymousClass7DM r5 = (AnonymousClass7DM) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)), this.A03), this.A04) + AnonymousClass001.A0k(this.A02);
    }

    public AnonymousClass7DM(Point point, AnonymousClass70A r2, AnonymousClass6T0 r3, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = point;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = r3;
    }

    public AnonymousClass6T0 BN3() {
        return this.A02;
    }

    public boolean Bfr() {
        return this.A04;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(participantViewState=");
        A10.append(this.A01);
        A10.append(", size=");
        A10.append(this.A00);
        A10.append(", isFocused=");
        A10.append(this.A03);
        A10.append(", isPeerScreenSharing=");
        A10.append(this.A04);
        A10.append(", animation=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}

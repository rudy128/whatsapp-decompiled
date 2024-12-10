package X;

import android.graphics.Shader;

/* renamed from: X.09Y  reason: invalid class name */
public final class AnonymousClass09Y extends C03380Hv {
    public final long A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass09Y) {
                long j = this.A00;
                long j2 = ((AnonymousClass09Y) obj).A00;
                C02540Ek r0 = C05100Qk.A06;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public void A00(C16790tE r4, float f, long j) {
        long A05;
        r4.CHo(1.0f);
        if (f == 1.0f) {
            A05 = this.A00;
        } else {
            long j2 = this.A00;
            A05 = AnonymousClass0Oy.A03(AnonymousClass001.A11(j2), C05100Qk.A04(j2), C05100Qk.A03(j2), C05100Qk.A02(j2), C05100Qk.A01(j2) * f);
        }
        r4.CIO(A05);
        AnonymousClass0WR r42 = (AnonymousClass0WR) r4;
        if (r42.A02 != null) {
            r42.A02 = null;
            r42.A01.setShader((Shader) null);
        }
    }

    public int hashCode() {
        long j = this.A00;
        C02540Ek r0 = C05100Qk.A06;
        return AnonymousClass000.A0I(j);
    }

    public AnonymousClass09Y(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SolidColor(value=");
        return AnonymousClass001.A1F(C05100Qk.A08(this.A00), A10);
    }
}

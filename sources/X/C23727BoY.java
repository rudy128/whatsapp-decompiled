package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;

/* renamed from: X.BoY  reason: case insensitive filesystem */
public final class C23727BoY extends CO9 {
    public final C25187Cad A00;
    public final BloksComponentQueryResources A01;
    public final long A02;
    public final C24285Byi A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23727BoY) {
                C23727BoY boY = (C23727BoY) obj;
                if (!C18070vi.A18(this.A00, boY.A00) || !C18070vi.A18(this.A01, boY.A01) || this.A02 != boY.A02 || this.A03 != boY.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, AnonymousClass001.A0K(this.A02, (AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01)) * 31));
    }

    public C23727BoY(C25187Cad cad, C24285Byi byi, BloksComponentQueryResources bloksComponentQueryResources, long j) {
        super(byi, j);
        this.A00 = cad;
        this.A01 = bloksComponentQueryResources;
        this.A02 = j;
        this.A03 = byi;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CachedComponentQueryResponse(response=");
        A10.append(this.A00);
        A10.append(", resources=");
        A10.append(this.A01);
        A10.append(", responseTimestampMs=");
        A10.append(this.A02);
        A10.append(", queryPurpose=");
        A10.append(this.A03);
        A10.append(", cleanup=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}

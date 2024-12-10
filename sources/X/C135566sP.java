package X;

/* renamed from: X.6sP  reason: invalid class name and case insensitive filesystem */
public final class C135566sP {
    public final long A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135566sP) {
                C135566sP r8 = (C135566sP) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C135566sP(long j, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = z2;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0K(this.A00, AnonymousClass0DV.A00(38347, this.A02)), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A15(A10, "ScreenQueryParams(isPreFetch=");
        A10.append(", useScreenQuery=");
        A10.append(this.A02);
        A10.append(", staticTemplateTTL=");
        A10.append(this.A00);
        A10.append(", shouldPrefetchSubqueries=");
        return C17900vP.A0F(A10, this.A01);
    }
}

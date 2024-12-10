package X;

/* renamed from: X.CbC  reason: case insensitive filesystem */
public final class C25216CbC {
    public final C20269AEc A00;
    public final C20269AEc A01;
    public final C20269AEc A02;
    public final C20269AEc A03;
    public final C20278AEl A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25216CbC)) {
            return false;
        }
        C25216CbC cbC = (C25216CbC) obj;
        return this.A02.equals(cbC.A02) && this.A03.equals(cbC.A03) && this.A00.equals(cbC.A00) && this.A01.equals(cbC.A01) && this.A04.equals(cbC.A04);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A02, 527)))));
    }

    public C25216CbC(C20269AEc aEc, C20269AEc aEc2, C20269AEc aEc3, C20269AEc aEc4, C20278AEl aEl) {
        this.A02 = aEc;
        this.A03 = aEc2;
        this.A00 = aEc3;
        this.A01 = aEc4;
        this.A04 = aEl;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append("{nearLeft=");
        A10.append(this.A02);
        A10.append(", nearRight=");
        A10.append(this.A03);
        A10.append(", farLeft=");
        A10.append(this.A00);
        A10.append(", farRight=");
        A10.append(this.A01);
        A10.append(", latLngBounds=");
        return AnonymousClass8BX.A0d(this.A04, A10);
    }
}

package X;

/* renamed from: X.4oo  reason: invalid class name and case insensitive filesystem */
public class C97034oo implements C23691Hg {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public C97034oo(String str, boolean z, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public final void CGE(Object obj) {
        if (this.A00 != 0) {
            String str = this.A01;
            boolean z = this.A02;
            for (AnonymousClass8A4 Bwg : ((AnonymousClass6h1) obj).A03) {
                Bwg.Bwg(str, z);
            }
            return;
        }
        ((BDF) obj).BnP(this.A02, this.A01);
    }
}

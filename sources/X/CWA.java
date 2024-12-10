package X;

public abstract class CWA {
    public final C24271ByU A00;
    public final C24256ByE A01;
    public final String A02;

    public int hashCode() {
        int i = 0;
        int A0l = ((AnonymousClass001.A0l(this.A00) * 31) + AnonymousClass001.A0l(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0l + i;
    }

    public CWA(C5R c5r) {
        this.A00 = c5r.A00;
        C24256ByE byE = c5r.A01;
        this.A01 = byE;
        String str = c5r.A02;
        this.A02 = str;
        if (byE == C24256ByE.DYNAMIC) {
            if (str == null) {
                throw new C27205DZe("Disk cache id must be set for dynamic cache choice");
            }
        } else if (str != null && str.length() != 0) {
            throw new C27205DZe("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }
}

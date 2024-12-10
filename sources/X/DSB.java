package X;

public abstract class DSB implements Comparable {
    public static final DSB A01 = new C23746Bor();
    public Object A00;

    public Object A01() {
        if (this instanceof C23742Bon) {
            return "$";
        }
        if (this instanceof C23745Boq) {
            return ((C23745Boq) this).A00;
        }
        if (this instanceof C23744Bop) {
            return C25888Cnz.A00(((C23744Bop) this).A00, "&&", "");
        }
        if (this instanceof C23743Boo) {
            return Integer.valueOf(((C23743Boo) this).A00);
        }
        return null;
    }

    /* renamed from: A00 */
    public int compareTo(DSB dsb) {
        return -A01().toString().compareTo(dsb.A01().toString());
    }
}

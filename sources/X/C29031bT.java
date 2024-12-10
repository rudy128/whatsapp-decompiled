package X;

/* renamed from: X.1bT  reason: invalid class name and case insensitive filesystem */
public class C29031bT extends C29021bS {
    public final Object A00 = new Object();

    public boolean CEF(Object obj) {
        boolean CEF;
        C18070vi.A0d(obj, 0);
        synchronized (this.A00) {
            CEF = super.CEF(obj);
        }
        return CEF;
    }

    public Object BAf() {
        Object BAf;
        synchronized (this.A00) {
            BAf = super.BAf();
        }
        return BAf;
    }

    public C29031bT(int i) {
        super(i);
    }
}

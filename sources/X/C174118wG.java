package X;

/* renamed from: X.8wG  reason: invalid class name and case insensitive filesystem */
public class C174118wG extends C174358we {
    public final int A00;
    public final C38471rL A01;
    public final String A02;
    public final String A03;

    public C174118wG(C38471rL r5, String str, String str2) {
        super(6);
        Integer[] A002 = AnonymousClass00R.A00(31);
        int length = A002.length;
        int i = 0;
        while (i < length && !C196559vG.A00(A002[i]).equals(str)) {
            i++;
        }
        this.A00 = C181159Pj.A00(str);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A03.equals(((C174118wG) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }
}

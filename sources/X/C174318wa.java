package X;

/* renamed from: X.8wa  reason: invalid class name and case insensitive filesystem */
public class C174318wa extends C174358we {
    public final int A00;

    public C174318wa(int i) {
        super(1);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.A00 == ((C174318wa) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00;
    }

    public C174318wa() {
        this(0);
    }
}

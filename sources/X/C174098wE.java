package X;

/* renamed from: X.8wE  reason: invalid class name and case insensitive filesystem */
public class C174098wE extends C174358we {
    public final AF0 A00;
    public final B8N A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C174098wE) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C174098wE(AF0 af0, B8N b8n, int i) {
        super(i);
        this.A00 = af0;
        this.A01 = b8n;
    }
}

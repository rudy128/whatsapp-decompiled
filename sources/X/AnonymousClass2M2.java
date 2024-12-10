package X;

/* renamed from: X.2M2  reason: invalid class name */
public class AnonymousClass2M2 extends AnonymousClass205 {
    public final int A00;

    public AnonymousClass2M2(AnonymousClass205 r1, int i) {
        super(r1);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof AnonymousClass2M2) || ((AnonymousClass2M2) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Key[id=");
        A10.append(this.A01);
        A10.append(", from_me=");
        A10.append(this.A02);
        A10.append(", remote_jid=");
        A10.append(this.A00);
        A10.append(", card_index=");
        A10.append(this.A00);
        return AnonymousClass000.A0z(A10);
    }
}

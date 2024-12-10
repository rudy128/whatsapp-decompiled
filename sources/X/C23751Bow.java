package X;

/* renamed from: X.Bow  reason: case insensitive filesystem */
public class C23751Bow extends C25836Cmq {
    public final Boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C23751Bow)) {
                return false;
            }
            Boolean bool = this.A00;
            Boolean bool2 = ((C23751Bow) obj).A00;
            if (bool == null) {
                return bool2 == null;
            }
            if (!bool.equals(bool2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public C23751Bow(CharSequence charSequence) {
        this.A00 = Boolean.valueOf(Boolean.parseBoolean(charSequence.toString()));
    }
}

package X;

import java.time.OffsetDateTime;

/* renamed from: X.Boz  reason: case insensitive filesystem */
public class C23754Boz extends C25836Cmq {
    public final OffsetDateTime A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23754Boz) && !(obj instanceof C23755Bp0)) {
            return false;
        }
        return this.A00.compareTo(((C25836Cmq) obj).A05().A00) == 0;
    }

    public C23755Bp0 A06() {
        return new C23755Bp0(this.A00.toString(), false);
    }

    public OffsetDateTime A08() {
        return this.A00;
    }

    public String toString() {
        return this.A00.toString();
    }

    public C23754Boz(CharSequence charSequence) {
        this.A00 = OffsetDateTime.parse(charSequence);
    }
}

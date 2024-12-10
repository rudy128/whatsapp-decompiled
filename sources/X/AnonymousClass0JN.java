package X;

/* renamed from: X.0JN  reason: invalid class name */
public final class AnonymousClass0JN {
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass0JN) || j != ((AnonymousClass0JN) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        Object valueOf;
        long j = this.A00;
        C04660Og A002 = C02750Ff.A00((int) (j >>> 32));
        int A02 = A002.A02(j);
        Object obj = "Infinity";
        if (A02 == Integer.MAX_VALUE) {
            valueOf = obj;
        } else {
            valueOf = Integer.valueOf(A02);
        }
        C04660Og A003 = C02750Ff.A00((int) j);
        int A01 = A003.A01(j);
        if (A01 != Integer.MAX_VALUE) {
            obj = Integer.valueOf(A01);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SizeConstraints[minWidth = ");
        A10.append(A002.A04(j));
        A10.append(", maxWidth = ");
        A10.append(valueOf);
        A10.append(", minHeight = ");
        A10.append(A003.A03(j));
        A10.append(", maxHeight = ");
        A10.append(obj);
        A10.append(']');
        return A10.toString();
    }

    public /* synthetic */ AnonymousClass0JN(long j) {
        this.A00 = j;
    }
}

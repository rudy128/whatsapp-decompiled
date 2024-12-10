package X;

/* renamed from: X.2lQ  reason: invalid class name and case insensitive filesystem */
public final class C58892lQ {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C58892lQ) && this.A00 == ((C58892lQ) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C58892lQ(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterWamoValues(newsletterIsWamoSubMessage=");
        return C17900vP.A0F(A10, this.A00);
    }
}

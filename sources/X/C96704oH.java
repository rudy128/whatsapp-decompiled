package X;

/* renamed from: X.4oH  reason: invalid class name and case insensitive filesystem */
public final class C96704oH implements AnonymousClass5Y3 {
    public final boolean A00;

    public C96704oH() {
        this(false);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96704oH) && this.A00 == ((C96704oH) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextInput(isCreatingNewList=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C96704oH(boolean z) {
        this.A00 = z;
    }
}

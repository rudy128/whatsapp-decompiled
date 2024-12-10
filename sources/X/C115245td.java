package X;

/* renamed from: X.5td  reason: invalid class name and case insensitive filesystem */
public final class C115245td extends C147357Sv {
    public final Throwable error;
    public final String reason;

    public C115245td(String str) {
        super(str);
        this.reason = str;
        this.error = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115245td) {
                C115245td r5 = (C115245td) obj;
                if (!C18070vi.A18(this.reason, r5.reason) || !C18070vi.A18(this.error, r5.error)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.reason) * 31) + C17880vN.A02(this.error);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InvalidDataReceived(reason=");
        A10.append(this.reason);
        A10.append(", error=");
        return AnonymousClass001.A1F(this.error, A10);
    }

    public C115245td() {
        this((String) null);
    }
}

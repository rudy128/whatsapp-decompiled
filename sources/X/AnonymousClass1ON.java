package X;

/* renamed from: X.1ON  reason: invalid class name */
public abstract class AnonymousClass1ON extends AnonymousClass1OL implements AnonymousClass1OI, AnonymousClass1OG, AnonymousClass1OM {
    public AnonymousClass1OC A00;

    public AnonymousClass3JS BU1() {
        return null;
    }

    public boolean Be2() {
        return true;
    }

    public final AnonymousClass1OC A03() {
        AnonymousClass1OC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("job");
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[job@");
        sb.append(Integer.toHexString(System.identityHashCode(A03())));
        sb.append(']');
        return sb.toString();
    }

    public void dispose() {
        A03().A0r(this);
    }
}

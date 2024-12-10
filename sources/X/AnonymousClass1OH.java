package X;

/* renamed from: X.1OH  reason: invalid class name */
public final class AnonymousClass1OH implements AnonymousClass1OG {
    public final boolean A00;

    public AnonymousClass3JS BU1() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (this.A00) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass1OH(boolean z) {
        this.A00 = z;
    }

    public boolean Be2() {
        return this.A00;
    }
}

package X;

/* renamed from: X.1QM  reason: invalid class name */
public class AnonymousClass1QM {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("=");
        if (this.A02) {
            str = "skipped";
        } else {
            str = this.A00;
        }
        sb.append(str);
        return sb.toString();
    }

    public AnonymousClass1QM(String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = z;
    }
}

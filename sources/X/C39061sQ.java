package X;

/* renamed from: X.1sQ  reason: invalid class name and case insensitive filesystem */
public class C39061sQ implements Comparable {
    public C39031sN A00;
    public C38971sH A01;
    public final /* synthetic */ C39031sN A02;

    public C39061sQ(C39031sN r1, C39031sN r2) {
        this.A02 = r1;
        this.A00 = r2;
    }

    public int compareTo(Object obj) {
        return this.A01.A02 - ((C38971sH) obj).A02;
    }

    public String toString() {
        String str = "[ ";
        if (this.A01 != null) {
            int i = 0;
            do {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.A01.A09[i]);
                sb.append(" ");
                str = sb.toString();
                i++;
            } while (i < 9);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("] ");
        sb2.append(this.A01);
        return sb2.toString();
    }
}

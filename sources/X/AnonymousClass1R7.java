package X;

/* renamed from: X.1R7  reason: invalid class name */
public class AnonymousClass1R7 {
    public final AnonymousClass1Cd A00;

    public static void A00(AnonymousClass206 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A0x > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SendCountMessageStore/validateMessage/message must have row_id set; key=");
        AnonymousClass205 r2 = r8.A0v;
        sb.append(r2);
        C17960vV.A0F(z2, sb.toString());
        if (r8.A0E() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SendCountMessageStore/validateMessage/message in main storage; key=");
        sb2.append(r2);
        C17960vV.A0F(z, sb2.toString());
    }

    public AnonymousClass1R7(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}

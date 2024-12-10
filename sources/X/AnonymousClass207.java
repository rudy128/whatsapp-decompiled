package X;

/* renamed from: X.207  reason: invalid class name */
public class AnonymousClass207 {
    public final AnonymousClass190 A00;
    public final C18100vl A01;

    public AnonymousClass207(AnonymousClass190 r3, AnonymousClass00H r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r3;
        this.A01 = new C18110vm(new AnonymousClass209(r4));
    }

    public AnonymousClass206 A00(AnonymousClass205 r5, int i, long j) {
        StringBuilder sb;
        String str;
        C18070vi.A0d(r5, 0);
        C18100vl r1 = this.A01;
        try {
            return ((AnonymousClass20B) ((AnonymousClass20Z) r1.getValue()).A00(i)).BHR(r5, j);
        } catch (AnonymousClass208 e) {
            String num = Integer.toString(i);
            C18070vi.A0X(num);
            boolean A02 = ((AnonymousClass20Z) r1.getValue()).A02(i);
            AnonymousClass190 r12 = this.A00;
            if (A02) {
                r12.A0E("fmessage-factory-message-type-not-supported", num, e);
                sb = new StringBuilder();
                sb.append("FMessageFactorySubsystem; cannot create ");
                sb.append(num);
                str = " (not supported)";
            } else {
                r12.A0E("fmessage-factory-message-type-not-registered", num, e);
                sb = new StringBuilder();
                sb.append("FMessageFactorySubsystem; cannot crete ");
                sb.append(num);
                str = " (not registered)";
            }
            sb.append(str);
            C17960vV.A0F(false, sb.toString());
            return new AnonymousClass206(r5, i, j);
        }
    }
}

package X;

/* renamed from: X.1Th  reason: invalid class name and case insensitive filesystem */
public class C26741Th {
    public final AnonymousClass181 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass11Z A02;
    public final C18030ve A03;
    public final C219317y A04;
    public final C24371Kb A05;
    public final C24421Kg A06;
    public final AnonymousClass18O A07;

    public C26741Th(AnonymousClass18O r1, AnonymousClass181 r2, AnonymousClass11P r3, AnonymousClass11Z r4, C18030ve r5, C219317y r6, C24371Kb r7, C24421Kg r8) {
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A07 = r1;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
    }

    public static void A00(AnonymousClass2KP r3, String str, boolean z) {
        C1409173o r1 = r3.A03().A00;
        if (!r1.A03()) {
            if (r3.A01.delete()) {
                r3.A00.delete();
            }
            int i = r1.A01;
            boolean z2 = true;
            if (C1409173o.A02(i)) {
                if (i != 16) {
                    z2 = false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Transient error during downloading external mutations, status: ");
                sb.append(i);
                String obj = sb.toString();
                C18070vi.A0d(obj, 2);
                throw new AnonymousClass2E1(obj, (Throwable) null, z2);
            } else if (i != 5) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to download external mutation with status: ");
                sb2.append(i);
                String obj2 = sb2.toString();
                C18070vi.A0d(obj2, 2);
                throw new AnonymousClass2E1(obj2, (Throwable) null, true);
            } else if (z) {
                throw new C26831Tq(58, str);
            } else {
                throw new C26831Tq(4, str);
            }
        }
    }
}

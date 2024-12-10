package X;

import java.util.List;

/* renamed from: X.3U1  reason: invalid class name */
public final class AnonymousClass3U1 extends AnonymousClass1J2 {
    public List A00 = C18460wS.A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass1BI A02;
    public final C131606lN A03;
    public final C25749ClJ A04;
    public final AnonymousClass4OD A05;
    public final AnonymousClass1W6 A06;
    public final Integer A07;
    public final String A08;
    public final List A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5LK(this));
    public final C18600wl A0B;
    public final AnonymousClass1G3 A0C = new C25701Ph(C25691Pg.SUSPEND, 0, 0);
    public final AnonymousClass1G4 A0D;

    public AnonymousClass3U1(AnonymousClass11E r10, AnonymousClass1BI r11, C131606lN r12, C25749ClJ clJ, AnonymousClass4OD r14, AnonymousClass1W6 r15, Integer num, String str, List list, C18600wl r19) {
        int i;
        boolean z;
        C18070vi.A0w(r12, r10, r14, clJ, r15);
        Integer num2 = num;
        C18600wl r0 = r19;
        C18070vi.A0l(r0, num2);
        this.A03 = r12;
        this.A01 = r10;
        this.A05 = r14;
        this.A04 = clJ;
        this.A06 = r15;
        this.A0B = r0;
        this.A07 = num2;
        this.A08 = str;
        this.A02 = r11;
        this.A09 = list;
        int intValue = this.A07.intValue();
        if (intValue == 0 || intValue == 2 || intValue == 1) {
            i = 2131897079;
        } else if (intValue == 3) {
            i = 2131897080;
        } else {
            throw AnonymousClass3MW.A14();
        }
        long j = ((((long) ((AnonymousClass8Ak) this.A0A.getValue()).BV1().A00) + 1048576) - 1) / 1048576;
        AnonymousClass1LR A042 = this.A01.A04();
        if (A042 != null) {
            z = A042.A06;
        } else {
            z = false;
        }
        this.A0D = AnonymousClass3MW.A18(new AnonymousClass46F(new C87114Ui(num2, i, j, z)));
    }
}

package X;

import java.io.File;

/* renamed from: X.346  reason: invalid class name */
public final /* synthetic */ class AnonymousClass346 implements AnonymousClass3LA {
    public final /* synthetic */ AnonymousClass70S A00;
    public final /* synthetic */ AnonymousClass34B A01;
    public final /* synthetic */ C55982gh A02;
    public final /* synthetic */ AnonymousClass1T5 A03;
    public final /* synthetic */ C58192kI A04;
    public final /* synthetic */ C25811CmO A05;
    public final /* synthetic */ C26551So A06;

    public final void Bwz(C1409573s r15) {
        AnonymousClass1T5 r7 = this.A03;
        AnonymousClass34B r5 = this.A01;
        C58192kI r8 = this.A04;
        C55982gh r6 = this.A02;
        AnonymousClass70S r4 = this.A00;
        C25811CmO cmO = this.A05;
        C26551So r11 = this.A06;
        AnonymousClass2K7 r2 = (AnonymousClass2K7) r7.A05.get();
        File file = r8.A08;
        String str = r8.A0C;
        int i = r8.A00;
        C58032k2 r3 = new C58032k2(r4, r5, r6, r7, r8, cmO, r15, r11);
        if (file == null) {
            AnonymousClass736 r9 = r2.A00;
            C17960vV.A07(str);
            C18070vi.A0X(str);
            C144747In r82 = new C144747In(r9, r5, r3, str, i);
            r2.A04(r82.A00, r82);
            return;
        }
        r3.A00(file, false);
    }

    public /* synthetic */ AnonymousClass346(AnonymousClass70S r1, AnonymousClass34B r2, C55982gh r3, AnonymousClass1T5 r4, C58192kI r5, C25811CmO cmO, C26551So r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = cmO;
        this.A06 = r7;
    }
}

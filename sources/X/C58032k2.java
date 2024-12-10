package X;

import java.io.File;

/* renamed from: X.2k2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C58032k2 {
    public final /* synthetic */ AnonymousClass70S A00;
    public final /* synthetic */ AnonymousClass34B A01;
    public final /* synthetic */ C55982gh A02;
    public final /* synthetic */ AnonymousClass1T5 A03;
    public final /* synthetic */ C58192kI A04;
    public final /* synthetic */ C25811CmO A05;
    public final /* synthetic */ C1409573s A06;
    public final /* synthetic */ C26551So A07;

    public final void A00(File file, boolean z) {
        AnonymousClass1T5 r2 = this.A03;
        C55982gh r4 = this.A02;
        AnonymousClass34B r14 = this.A01;
        AnonymousClass70S r13 = this.A00;
        C58192kI r1 = this.A04;
        C25811CmO cmO = this.A05;
        C1409573s r10 = this.A06;
        C26551So r0 = this.A07;
        File file2 = file;
        if (z && file != null) {
            File file3 = file2;
            r4.A02.A04(new C54932ew(file3, file2.getName(), C1408873l.A04(file2), file2.length()));
        }
        AnonymousClass34E r16 = new AnonymousClass34E(r14, r4, r2, r1, 0);
        C52302ah r15 = r4.A06;
        C28533E6h e6h = r4.A08;
        File A002 = AnonymousClass1T5.A00(r2, file2, AnonymousClass000.A0y(".mp4", C17900vP.A0G()));
        long j = r1.A02;
        long j2 = r1.A03;
        long j3 = j2;
        long j4 = j;
        File file4 = file2;
        C1409573s r19 = r10;
        C25811CmO cmO2 = cmO;
        C28533E6h e6h2 = e6h;
        r2.A04.A00(new C24015Bu1(r13, r14, r15, r16, e6h2, cmO2, r19, A002, file4, j4, j3, r1.A0H, r1.A0G), r0);
    }

    public /* synthetic */ C58032k2(AnonymousClass70S r1, AnonymousClass34B r2, C55982gh r3, AnonymousClass1T5 r4, C58192kI r5, C25811CmO cmO, C1409573s r7, C26551So r8) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = cmO;
        this.A06 = r7;
        this.A07 = r8;
    }
}

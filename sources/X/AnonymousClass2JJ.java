package X;

import java.io.File;

/* renamed from: X.2JJ  reason: invalid class name */
public class AnonymousClass2JJ extends C96344nh {
    public final /* synthetic */ AnonymousClass126 A00;
    public final /* synthetic */ AnonymousClass1EB A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JJ(AnonymousClass11P r9, AnonymousClass1NN r10, AnonymousClass122 r11, AnonymousClass126 r12, AnonymousClass126 r13, C188679ho r14, AnonymousClass1EB r15, AnonymousClass1PQ r16, File file, File file2, String str) {
        super(r9, r10, r11, r13, r14, r16);
        this.A00 = r12;
        this.A02 = file;
        this.A03 = file2;
        this.A04 = str;
        this.A01 = r15;
    }

    public void C7e(AnonymousClass4OX r10, AnonymousClass1EC r11) {
        super.C7e(r10, r11);
        AnonymousClass126 r6 = this.A00;
        AnonymousClass1E7 A0H = r6.A08.A0H(r11);
        C24791Lr r8 = r6.A0B;
        File A002 = r8.A00(A0H);
        C17960vV.A07(A002);
        File file = this.A02;
        if (!file.renameTo(A002)) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0N(file, "group/create again, failed to rename ", A10);
            A10.append(" to ");
            C17890vO.A1B(A10, A002.getAbsolutePath());
        }
        File A012 = r8.A01(A0H);
        C17960vV.A07(A012);
        File file2 = this.A03;
        if (!file2.renameTo(A012)) {
            StringBuilder A102 = AnonymousClass000.A10();
            C17900vP.A0N(file2, "group/create again, failed to rename ", A102);
            A102.append(" to ");
            C17890vO.A1B(A102, A012.getAbsolutePath());
        }
        r6.A0g.A0E(A0H);
        if (this.A04 != null) {
            AnonymousClass1EB r1 = this.A01;
            C28791au A06 = ((C24861Ly) r6.A0q.get()).A00.A06();
            try {
                String[] A1Y = C17880vN.A1Y();
                A1Y[0] = r1.getRawString();
                C24861Ly.A02(A06, "wa_group_descriptions", "jid = ?", A1Y);
                A06.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }
}

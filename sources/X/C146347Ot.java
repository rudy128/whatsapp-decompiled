package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.7Ot  reason: invalid class name and case insensitive filesystem */
public final class C146347Ot implements AnonymousClass8A1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C134426qZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C146347Ot(C134426qZ r1, String str, List list, int i) {
        this.A02 = str;
        this.A01 = r1;
        this.A03 = list;
        this.A00 = i;
    }

    public void BrA() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/[New Status]Eligibility delivery failure for session: ");
        String str = this.A02;
        C108995ce.A1O(A10, str);
        this.A01.A02(AnonymousClass00R.A00, str);
    }

    public void Bsv(C147347Su r8) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/[New Status]Eligibility failed for session: ");
        String str = this.A02;
        A10.append(str);
        A10.append(" with exception: ");
        C108995ce.A1K(r8, A10);
        this.A01.A01(r8, AnonymousClass00R.A00, str, this.A03, this.A00);
    }

    public void C7P(C136316tc r15, C136456tq r16) {
        int i;
        int i2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestSessionManager/[New Status]Eligibility success for session: ");
        C108995ce.A1O(A10, this.A02);
        C134426qZ r12 = this.A01;
        C136316tc r10 = r15;
        C136456tq r11 = r16;
        if (r12 instanceof AnonymousClass6OE) {
            AnonymousClass6OE r122 = (AnonymousClass6OE) r12;
            C41801x5 r1 = r122.A01;
            C146617Py r8 = new C146617Py(r1.A07.get(), r10, r11, r122, 31);
            C30101dO A002 = C41801x5.A00(r1);
            if (A002 != null) {
                A002.A04("SEE_CROSSPOST_SUCCESS");
            }
            C139126yG r6 = (C139126yG) r1.A0A.get();
            AnonymousClass1IX r9 = r15.A02;
            r1.A02.get();
            Integer A003 = C139006y3.A00(r122.A03);
            C146387Ox r5 = new C146387Ox(r1, r15, r122.A02);
            C18070vi.A0d(A003, 3);
            Handler A0D = C17890vO.A0D();
            r9.size();
            switch (A003.intValue()) {
                case 0:
                    i2 = 2131898356;
                    break;
                case 1:
                    i2 = 2131898358;
                    break;
                default:
                    i2 = 2131898357;
                    break;
            }
            C139126yG.A00(new AnonymousClass6LC(A0D, r5, r6, A003, r8, r9), r6, "status_fragment", i2, 2131897301);
            A0D.postDelayed(r8, 4000);
        } else if (r12 instanceof AnonymousClass6OD) {
            AnonymousClass6OD r123 = (AnonymousClass6OD) r12;
            C41801x5 r2 = r123.A02;
            C146617Py r82 = new C146617Py(r2.A07.get(), r10, r11, r123, 31);
            C30101dO A004 = C41801x5.A00(r2);
            if (A004 != null) {
                A004.A04("SEE_CROSSPOST_SUCCESS");
            }
            C139126yG r3 = (C139126yG) r2.A0A.get();
            List list = r123.A04;
            r2.A02.get();
            C122646Re r13 = r123.A01;
            Integer A005 = C139006y3.A00(C18070vi.A0M(r13));
            String str = r123.A03;
            AnonymousClass7RO r83 = new AnonymousClass7RO(r2, r15, r13, 47);
            C18070vi.A0j(list, A005);
            C18070vi.A0d(str, 4);
            Handler A0D2 = C17890vO.A0D();
            list.size();
            switch (A005.intValue()) {
                case 0:
                    i = 2131898359;
                    break;
                case 1:
                    i = 2131898374;
                    break;
                default:
                    i = 2131898348;
                    break;
            }
            C139126yG.A00(new AnonymousClass6LE(r3, A0D2, list, A005, r82, r83, str, 0), r3, str, i, 2131897301);
            A0D2.postDelayed(r82, 4000);
        } else {
            throw AnonymousClass04E.createAndThrow();
        }
    }
}

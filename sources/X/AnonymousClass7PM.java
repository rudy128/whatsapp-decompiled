package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.7PM  reason: invalid class name */
public final class AnonymousClass7PM implements AnonymousClass8A3 {
    public final /* synthetic */ C123366Ue A00;
    public final /* synthetic */ String A01;

    public AnonymousClass7PM(C123366Ue r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void BrA() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility delivery failure for session: ");
        String str = this.A01;
        C108995ce.A1O(A10, str);
        this.A00.A00((Integer) null, (Integer) null, str, true);
    }

    public void Bsm(int i, Integer num) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility failed for session: ");
        String str = this.A01;
        A10.append(str);
        A10.append(" with errorCode: ");
        A10.append(i);
        A10.append(" and errorSubCode: ");
        C108995ce.A1K(num, A10);
        this.A00.A01(num, str, i, true);
    }

    public void C7Q(C135586sR r18, C136476ts r19) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility success for session: ");
        C108995ce.A1O(A10, this.A01);
        C123366Ue r11 = this.A00;
        C135586sR r9 = r18;
        C136476ts r10 = r19;
        if (r11 instanceof AnonymousClass6QI) {
            AnonymousClass6QI r112 = (AnonymousClass6QI) r11;
            C18070vi.A0d("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/success Eligibility check successful", 0);
            C41821x7 r3 = r112.A02;
            C146617Py r7 = new C146617Py(r3.A0F.get(), r9, r10, r112, 34);
            C108945cZ.A13(r3.A0H).A04("SEE_CROSSPOST_SUCCESS");
            AnonymousClass730 r2 = (AnonymousClass730) r3.A07.get();
            List list = r112.A05;
            String str = r9.A01;
            Integer num = r112.A03;
            C129246hU r4 = r112.A01;
            Handler A0D = C17890vO.A0D();
            AnonymousClass730.A01(new C114415ql(r4, 3), new AnonymousClass6LE(r2, A0D, r4, num, r7, list, str, 1), r2, "status_fragment", 2131889122, 2131897301, false);
            if (!C18020vd.A05(C18040vf.A02, r2.A04.A01, 10743)) {
                A0D.postDelayed(r7, 4000);
            }
        } else if (r11 instanceof AnonymousClass6QH) {
            AnonymousClass6QH r113 = (AnonymousClass6QH) r11;
            C41821x7 r22 = r113.A01;
            C146617Py r72 = new C146617Py(r22.A0F.get(), r9, r10, r113, 34);
            C108945cZ.A13(r22.A0H).A04("SEE_CROSSPOST_SUCCESS");
            AnonymousClass730 r32 = (AnonymousClass730) r22.A07.get();
            List list2 = r113.A05;
            String str2 = r9.A01;
            Integer num2 = r113.A02;
            String str3 = r113.A04;
            Handler A0D2 = C17890vO.A0D();
            AnonymousClass730.A01((C114375qh) null, new AnonymousClass6LD(A0D2, r32, num2, r72, str3, str2, list2), r32, str3, 2131889147, 2131897301, false);
            A0D2.postDelayed(r72, 4000);
        } else {
            throw AnonymousClass04E.createAndThrow();
        }
    }
}

package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.6Ue  reason: invalid class name and case insensitive filesystem */
public abstract class C123366Ue {
    public void A00(Integer num, Integer num2, String str, boolean z) {
        C30131dR r2;
        Integer num3 = num;
        Integer num4 = num2;
        String str2 = str;
        if (this instanceof AnonymousClass6QG) {
            AnonymousClass6QG r22 = (AnonymousClass6QG) this;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("XFamilyCrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ");
            C108995ce.A1O(A10, str2);
            C139026y5 r5 = (C139026y5) r22.A00.A02.get();
            List list = r22.A03;
            boolean z2 = r22.A04;
            int i = 10;
            if (z2) {
                i = 9;
            }
            r5.A01(r22.A01, Integer.valueOf(i), num3, num4, str2, list, 4, z2);
            return;
        }
        if (this instanceof AnonymousClass6QI) {
            AnonymousClass6QI r23 = (AnonymousClass6QI) this;
            C18070vi.A0d("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/delivery failure", 0);
            C41821x7 r6 = r23.A02;
            List list2 = r23.A05;
            ((C139026y5) C18070vi.A0E(r6.A05)).A01((Boolean) null, r23.A03, num3, num4, str2, list2, 4, true);
            AnonymousClass00H r8 = r6.A0H;
            C108995ce.A1G(C108945cZ.A11(r6.A0B), C108945cZ.A13(r8), C41821x7.A0I);
            C129246hU r52 = r23.A01;
            if (z) {
                AnonymousClass78B r4 = new AnonymousClass78B(r6, r52, list2, 4);
                C114415ql r3 = new C114415ql(r6, 2);
                AnonymousClass730 r24 = (AnonymousClass730) r6.A07.get();
                r24.A01.CGP(new C21462AkT((View.OnClickListener) r4, (C114375qh) r3, r52, r24));
                return;
            }
            ((AnonymousClass730) C18070vi.A0E(r6.A07)).A02("status_fragment");
            r2 = C108945cZ.A13(r8);
        } else {
            AnonymousClass6QH r25 = (AnonymousClass6QH) this;
            C41821x7 r32 = r25.A01;
            ((AnonymousClass730) C18070vi.A0E(r32.A07)).A02(r25.A04);
            ((C139026y5) C18070vi.A0E(r32.A05)).A01((Boolean) null, r25.A02, num3, num4, str2, r25.A05, 4, false);
            r2 = C108945cZ.A13(r32.A0H);
            C108995ce.A1G(C108945cZ.A11(r32.A0B), r2, C41821x7.A0I);
        }
        r2.A05("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
    }

    public void A01(Integer num, String str, int i, boolean z) {
        Integer num2 = num;
        String str2 = str;
        int i2 = i;
        if (this instanceof AnonymousClass6QG) {
            AnonymousClass6QG r0 = (AnonymousClass6QG) this;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("XFamilyCrosspostRequestSessionManager/[Retry]Error encountered for session: ");
            A10.append(str2);
            A10.append(" with errorCode: ");
            A10.append(i2);
            A10.append(" and errorSubCode: ");
            C108995ce.A1K(num2, A10);
            C139026y5 r4 = (C139026y5) r0.A00.A02.get();
            List list = r0.A03;
            boolean z2 = r0.A04;
            int i3 = 10;
            if (z2) {
                i3 = 9;
            }
            r4.A01(r0.A01, Integer.valueOf(i3), Integer.valueOf(i2), num2, str2, list, 3, z2);
        } else if (this instanceof AnonymousClass6QI) {
            AnonymousClass6QI r02 = (AnonymousClass6QI) this;
            C18070vi.A0d(AnonymousClass001.A1I("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/error Failed eligibility check. Errorcode: ", AnonymousClass000.A10(), i2), 0);
            C41821x7 r2 = r02.A02;
            List list2 = r02.A05;
            ((C139026y5) C18070vi.A0E(r2.A05)).A01((Boolean) null, r02.A03, Integer.valueOf(i2), num2, str2, list2, 3, true);
            AnonymousClass00H r7 = r2.A0H;
            C108995ce.A1G(C108945cZ.A11(r2.A0B), C108945cZ.A13(r7), C41821x7.A0I);
            Context context = r02.A00;
            C129246hU r5 = r02.A01;
            if (z) {
                AnonymousClass78B r42 = new AnonymousClass78B(r2, r5, list2, 4);
                C114395qj r3 = new C114395qj(context, r2, num2, i2);
                AnonymousClass730 r22 = (AnonymousClass730) r2.A07.get();
                r22.A01.CGP(new C21462AkT((View.OnClickListener) r42, (C114375qh) r3, r5, r22));
                return;
            }
            C41821x7.A00(context, r2, num2, "status_fragment", i2);
            C30131dR A13 = C108945cZ.A13(r7);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Error code: ");
            A102.append(i2);
            A13.A05("SEE_CROSSPOST_ERROR", AnonymousClass001.A1E(num2, ", error subcode: ", A102));
        } else {
            AnonymousClass6QH r03 = (AnonymousClass6QH) this;
            C41821x7 r43 = r03.A01;
            C41821x7.A00(r03.A00, r43, num2, r03.A04, i2);
            ((C139026y5) C18070vi.A0E(r43.A05)).A01((Boolean) null, r03.A02, Integer.valueOf(i2), num2, str2, r03.A05, 3, false);
            C30131dR A132 = C108945cZ.A13(r43.A0H);
            C108995ce.A1G(C108945cZ.A11(r43.A0B), A132, C41821x7.A0I);
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Error code: ");
            A103.append(i2);
            A132.A05("SEE_CROSSPOST_ERROR", AnonymousClass001.A1E(num2, ", error subcode: ", A103));
        }
    }
}

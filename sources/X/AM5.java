package X;

import android.text.TextUtils;
import java.util.Random;

public class AM5 implements BAD {
    public int A00;
    public String A01;
    public Random A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass1XN A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public void A03(int i, int i2) {
        C171788sH A0J = AnonymousClass8BW.A0J(i);
        A0J.A0E = Integer.valueOf(i2);
        A0J.A06 = 1;
        A02(this, A0J);
    }

    public void Bib(Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        Long A0o;
        C171458rk r1 = new C171458rk();
        r1.A09 = this.A01;
        r1.A00 = 0;
        r1.A06 = str;
        if (num == null) {
            A0o = null;
        } else {
            A0o = AnonymousClass8BT.A0o(num);
        }
        r1.A05 = A0o;
        if (num2 != null) {
            r1.A03 = AnonymousClass8BT.A0o(num2);
        }
        if (num3 != null) {
            r1.A04 = AnonymousClass8BT.A0o(num3);
        }
        r1.A08 = str2;
        r1.A07 = str3;
        this.A03.CC7(r1);
    }

    public static void A00(AM5 am5) {
        Random random = am5.A02;
        if (random == null) {
            random = new Random();
            am5.A02 = random;
        }
        am5.A01 = Long.toHexString(random.nextLong());
        String str = am5.A01;
        C18070vi.A0d(str, 0);
        ((AM7) am5.A06.get()).A01 = str;
    }

    public static void A01(AM5 am5, int i) {
        am5.A00 = i;
        ((AM7) am5.A06.get()).A00 = Integer.valueOf(i);
    }

    public static void A02(AM5 am5, C171788sH r2) {
        r2.A0S = am5.A01;
        r2.A0A = Integer.valueOf(am5.A00);
        r2.A0H = C17890vO.A0L();
        am5.A03.CC7(r2);
    }

    public void Bi1(Integer num, Integer num2) {
        Long l;
        C171458rk r2 = new C171458rk();
        r2.A00 = C17880vN.A0h();
        r2.A09 = this.A01;
        Long l2 = null;
        if (num != null) {
            l = AnonymousClass8BT.A0o(num);
        } else {
            l = null;
        }
        r2.A01 = l;
        if (num2 != null) {
            l2 = AnonymousClass8BT.A0o(num2);
        }
        r2.A02 = l2;
        this.A03.CC7(r2);
    }

    public AM5(AnonymousClass18K r1, AnonymousClass1XN r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = r3;
        this.A06 = r4;
    }

    public void A04(Double d, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        if (!TextUtils.isEmpty(str4) && num != null && str3 != null) {
            C171518rq r2 = new C171518rq();
            r2.A08 = str4;
            r2.A04 = C17880vN.A0n(i);
            r2.A01 = num;
            r2.A02 = Integer.valueOf(i2);
            r2.A07 = str;
            r2.A09 = str2;
            r2.A0A = str3;
            r2.A06 = str5;
            r2.A05 = str6;
            r2.A00 = d;
            AnonymousClass00H r1 = this.A05;
            r2.A03 = C17880vN.A0n(C17890vO.A00(((C185699d0) r1.get()).A01.A00(), "pref_saved_search_session_action_order"));
            C17880vN.A1C(AnonymousClass8BT.A05(((C185699d0) r1.get()).A01), "pref_saved_search_session_action_order", r2.A03.intValue() + 1);
            this.A03.CC7(r2);
        }
    }

    public void A05(Integer num, int i, int i2) {
        C171788sH A0J = AnonymousClass8BW.A0J(i);
        A0J.A0B = Integer.valueOf(i2);
        A0J.A09 = num;
        A02(this, A0J);
    }

    public void A06(Integer num, int i, int i2) {
        C171788sH A0J = AnonymousClass8BW.A0J(i);
        A0J.A0D = Integer.valueOf(i2);
        A0J.A09 = num;
        A02(this, A0J);
    }
}

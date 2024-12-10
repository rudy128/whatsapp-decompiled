package X;

import java.util.Collection;

/* renamed from: X.6Lp  reason: invalid class name and case insensitive filesystem */
public class C121816Lp extends A34 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C121816Lp(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str;
        if (this.A00 != 0) {
            AnonymousClass66T r6 = (AnonymousClass66T) this.A01;
            boolean A04 = C25291Nq.A04(r6.A05, 11434);
            String[] strArr = new String[2];
            strArr[0] = "key";
            if (A04) {
                strArr[1] = C197569wu.A0c;
                str = "https://tenor.googleapis.com/v2/featured";
            } else {
                strArr[1] = C197569wu.A0b;
                str = "https://wa.tenor.co/v1/trending";
            }
            String A002 = AnonymousClass6WU.A00(str, strArr);
            String str2 = this.A03;
            if (!(str2 == null || str2.length() == 0)) {
                A002 = AnonymousClass6WU.A00(A002, "pos", str2);
            }
            C1185363v r1 = new C1185363v();
            r1.A08 = "Tenor";
            r1.A00 = 1;
            return AnonymousClass66T.A01(r1, r6, A002);
        }
        String A003 = AnonymousClass6WU.A00("https://api.giphy.com/v1/gifs/trending", "api_key", C197569wu.A0J, "rating", "pg-13");
        String str3 = this.A03;
        if (!(str3 == null || str3.length() == 0)) {
            A003 = AnonymousClass6WU.A00(A003, "offset", str3);
        }
        C1185363v r12 = new C1185363v();
        r12.A08 = "Giphy";
        r12.A00 = 1;
        return AnonymousClass66S.A00(r12, (AnonymousClass66S) this.A01, A003);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r5 = (C19760yx) obj;
        if (r5 == null) {
            ((C133816pX) this.A02).A01((String) null, (Collection) null, true);
        } else {
            ((C133816pX) this.A02).A01((String) r5.A00, (Collection) r5.A01, false);
        }
    }
}

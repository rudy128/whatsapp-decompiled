package X;

import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.9Dd  reason: invalid class name and case insensitive filesystem */
public final class C178449Dd extends C198999zG implements C22472B9e {
    public final AnonymousClass9CX A00;
    public final AnonymousClass9DN A01;
    public final AnonymousClass9CY A02;
    public final AnonymousClass9CY A03;
    public final C29621ca A04;

    public void BAO(C182989Wm r9) {
        A6S a6s;
        C188569hd r4;
        AnonymousClass9CX r0;
        Date date;
        AnonymousClass9CY r02 = this.A03;
        if (r02 != null) {
            r9.A00.A07 = r02.A01;
        }
        AnonymousClass9CY r03 = this.A02;
        Date date2 = null;
        if (r03 != null) {
            String str = r03.A01;
            if (!AnonymousClass1EG.A0H(str)) {
                a6s = new A6S(str);
                r4 = r9.A00;
                r4.A05 = a6s;
                r0 = this.A00;
                if (!(a6s == null || r0 == null)) {
                    r4.A08 = C197309wU.A00(a6s, r0.A00);
                }
                AnonymousClass9DN r04 = this.A01;
                if (a6s != null && r04 != null) {
                    AnonymousClass9DI r7 = (AnonymousClass9DI) r04.A01;
                    BigDecimal A002 = C197309wU.A00(a6s, Long.parseLong(r7.A03));
                    try {
                        SimpleDateFormat A0q = AnonymousClass8BS.A0q("yyyy-MM-dd'T'HH:mmZ");
                        AnonymousClass8BV.A1P(A0q);
                        AnonymousClass9CY r05 = (AnonymousClass9CY) r7.A02;
                        if (r05 != null) {
                            date = A0q.parse(r05.A01);
                        } else {
                            date = null;
                        }
                        try {
                            AnonymousClass9CY r06 = (AnonymousClass9CY) r7.A00;
                            if (r06 != null) {
                                date2 = A0q.parse(r06.A01);
                            }
                        } catch (ParseException e) {
                            e = e;
                            Log.e("Unable to parse sale dates", e);
                            r4.A03 = new AE5(a6s, A002, date, date2);
                            return;
                        }
                    } catch (ParseException e2) {
                        e = e2;
                        date = null;
                        Log.e("Unable to parse sale dates", e);
                        r4.A03 = new AE5(a6s, A002, date, date2);
                        return;
                    }
                    r4.A03 = new AE5(a6s, A002, date, date2);
                    return;
                }
            }
        }
        a6s = null;
        r4 = r9.A00;
        r4.A05 = a6s;
        r0 = this.A00;
        r4.A08 = C197309wU.A00(a6s, r0.A00);
        AnonymousClass9DN r042 = this.A01;
        if (a6s != null) {
        }
    }

    public C178449Dd(C29621ca r1, AnonymousClass9CX r2, AnonymousClass9DN r3, AnonymousClass9CY r4, AnonymousClass9CY r5) {
        this.A03 = r4;
        this.A00 = r2;
        this.A02 = r5;
        this.A01 = r3;
        this.A04 = r1;
        this.A00 = r1;
    }
}

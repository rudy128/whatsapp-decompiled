package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: X.DxV  reason: case insensitive filesystem */
public class C28323DxV extends AnonymousClass1By implements E3M {
    public AnonymousClass1Bz A00;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    public String toString() {
        return A0D();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DxV, java.lang.Object] */
    public static C28323DxV A01(Object obj) {
        if (obj == null || (obj instanceof C28323DxV)) {
            return (C28323DxV) obj;
        }
        if ((obj instanceof C28332Dxe) || (obj instanceof C28338Dxk)) {
            AnonymousClass1Bz r2 = (AnonymousClass1Bz) obj;
            ? obj2 = new Object();
            if ((r2 instanceof C28332Dxe) || (r2 instanceof C28338Dxk)) {
                obj2.A00 = r2;
                return obj2;
            }
            throw AnonymousClass000.A0k("unknown object passed to Time");
        }
        throw BEB.A0T(obj, "unknown object in factory: ", AnonymousClass000.A10());
    }

    public String A0D() {
        String str;
        AnonymousClass1Bz r1 = this.A00;
        if (!(r1 instanceof C28332Dxe)) {
            return ((C28338Dxk) r1).A0K();
        }
        String A0K = ((C28332Dxe) r1).A0K();
        char A002 = BE7.A00(A0K);
        StringBuilder A10 = AnonymousClass000.A10();
        if (A002 < '5') {
            str = "20";
        } else {
            str = "19";
        }
        return AnonymousClass001.A1H(str, A0K, A10);
    }

    public Date A0E() {
        StringBuilder A10;
        String str;
        try {
            AnonymousClass1Bz r4 = this.A00;
            if (!(r4 instanceof C28332Dxe)) {
                return ((C28338Dxk) r4).A0L();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String A0K = ((C28332Dxe) r4).A0K();
            if (BE7.A00(A0K) < '5') {
                A10 = AnonymousClass000.A10();
                str = "20";
            } else {
                A10 = AnonymousClass000.A10();
                str = "19";
            }
            return C25454Cg6.A00(simpleDateFormat.parse(AnonymousClass001.A1H(str, A0K, A10)));
        } catch (ParseException e) {
            throw AnonymousClass000.A0n(C17900vP.A0C("invalid date string: ", AnonymousClass000.A10(), e));
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.Dxe, java.lang.Object] */
    public C28323DxV(Date date, Locale locale) {
        C28338Dxk dxk;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String A1H = AnonymousClass001.A1H(simpleDateFormat.format(date), "Z", AnonymousClass000.A10());
        int parseInt = Integer.parseInt(A1H.substring(0, 4));
        if (parseInt < 1950 || parseInt > 2049) {
            dxk = new C28338Dxk(A1H);
        } else {
            String substring = A1H.substring(2);
            ? obj = new Object();
            obj.A00 = AnonymousClass1Bo.A03(substring);
            try {
                C25454Cg6.A00(new SimpleDateFormat("yyMMddHHmmssz").parse(obj.A0K()));
                dxk = obj;
            } catch (ParseException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("invalid date string: ", AnonymousClass000.A10(), e));
            }
        }
        this.A00 = dxk;
    }
}

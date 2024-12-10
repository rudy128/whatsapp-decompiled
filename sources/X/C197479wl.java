package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: X.9wl  reason: invalid class name and case insensitive filesystem */
public abstract class C197479wl {
    public static final SimpleDateFormat A00;
    public static final SimpleDateFormat A01;

    static {
        SimpleDateFormat A0q = AnonymousClass8BS.A0q("yyyy-MM-dd");
        A01 = A0q;
        SimpleDateFormat A0q2 = AnonymousClass8BS.A0q("yyyy-MM");
        A00 = A0q2;
        A0q.setTimeZone(TimeZone.getTimeZone("UTC"));
        A0q2.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static final Date A00(String str, SimpleDateFormat simpleDateFormat, JSONObject jSONObject) {
        String A03;
        if (jSONObject == null || (A03 = A6n.A03(str, jSONObject, false)) == null) {
            return null;
        }
        try {
            return simpleDateFormat.parse(A03);
        } catch (ParseException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FlowsLogger/getCalendarPickerInputParams/");
            A10.append(A03);
            C17890vO.A19(A10, " is not a valid date format");
            return null;
        }
    }
}

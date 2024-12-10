package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class A5W {
    public final long A00;
    public final long A01;
    public final TimeUnit A02;

    public boolean A05(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            return (j >= A03(timeUnit) && j <= A02(timeUnit)) || (A02(timeUnit) < 0 && j >= A03(timeUnit));
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            A5W a5w = (A5W) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (A03(timeUnit) != a5w.A03(timeUnit)) {
                return false;
            }
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            return A02(timeUnit2) == a5w.A02(timeUnit2);
        }
    }

    public static A5W A00(JSONObject jSONObject) {
        long j = jSONObject.getLong("mStartTime");
        long j2 = jSONObject.getLong("mEndTime");
        String string = jSONObject.getString("mTimeUnit");
        for (TimeUnit timeUnit : TimeUnit.values()) {
            if (string.equals(A01(timeUnit))) {
                return new A5W(timeUnit, j, j2);
            }
        }
        throw new JSONException("invalid jsonObject for TimeRange");
    }

    public static String A01(TimeUnit timeUnit) {
        switch (AnonymousClass9TF.A00[timeUnit.ordinal()]) {
            case 1:
                return "DAYS";
            case 2:
                return "HOURS";
            case 3:
                return "MINUTES";
            case 4:
                return "SECONDS";
            case 5:
                return "NANOSECONDS";
            case 6:
                return "MICROSECONDS";
            case 7:
                return "MILLISECONDS";
            default:
                return "";
        }
    }

    public long A02(TimeUnit timeUnit) {
        return timeUnit.convert(this.A00, this.A02);
    }

    public long A03(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01, this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 < r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A5W(java.util.concurrent.TimeUnit r4, long r5, long r7) {
        /*
            r3 = this;
            r3.<init>()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "startTime: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " endTime: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r7)
            if (r2 == 0) goto L_0x002e
            r3.A01 = r5
            r3.A00 = r7
            r3.A02 = r4
            return
        L_0x002e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5W.<init>(java.util.concurrent.TimeUnit, long, long):void");
    }

    public JSONObject A04() {
        JSONObject A15 = C17880vN.A15();
        A15.put("mStartTime", this.A01);
        A15.put("mEndTime", this.A00);
        A15.put("mTimeUnit", A01(this.A02));
        return A15;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        C17890vO.A1L(A1a, this.A01);
        C17890vO.A1M(A1a, this.A00);
        return AnonymousClass000.A0P(this.A02, A1a, 2);
    }

    public String toString() {
        try {
            return A04().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}

package X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1vP  reason: invalid class name and case insensitive filesystem */
public final class C40861vP {
    public final C40841vM A00;
    public final C40831vL A01;
    public final C40831vL A02;
    public final String A03;

    public C40861vP(C40841vM r2, C40831vL r3, C40831vL r4, String str) {
        C18070vi.A0d(str, 4);
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A18(getClass(), obj.getClass())) {
                return false;
            }
            C40861vP r6 = (C40861vP) obj;
            C40831vL r3 = r6.A02;
            C40841vM r2 = r6.A00;
            C40831vL r1 = r6.A01;
            if (!C42171xk.A00(this.A02, r3) || !C42171xk.A00(this.A00, r2) || !C42171xk.A00(this.A01, r1)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01});
    }

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        C40831vL r0 = this.A02;
        if (r0 != null) {
            jSONObject.put("start", r0.A00);
        }
        C40841vM r7 = this.A00;
        if (r7 != null) {
            long[] jArr = r7.A01;
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : jArr) {
                    jSONArray.put(put);
                }
                jSONObject.put("repeat", jSONArray);
            }
            jSONObject.put("static", r7.A00);
        }
        C40831vL r02 = this.A01;
        if (r02 != null) {
            jSONObject.put("end", r02.A00);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeContentTiming{start=");
        sb.append(this.A02);
        sb.append(", duration=");
        sb.append(this.A00);
        sb.append(", end=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}

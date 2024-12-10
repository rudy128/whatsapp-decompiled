package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A6Z {
    public final Throwable A00;
    public final List A01;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BC4 A02() {
        /*
            r8 = this;
            java.util.List r0 = r8.A01
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r5 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0054
            r3 = r5
            X.BC4 r3 = (X.BC4) r3
            boolean r0 = r3 instanceof X.C20678AUk
            if (r0 == 0) goto L_0x006d
            r2 = r3
            X.AUk r2 = (X.C20678AUk) r2
            org.json.JSONObject r1 = r2.A00
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "summary"
            boolean r1 = r1.optBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0065
            r6 = 0
        L_0x002e:
            java.lang.Object r4 = r7.next()
            r3 = r4
            X.BC4 r3 = (X.BC4) r3
            boolean r0 = r3 instanceof X.C20678AUk
            if (r0 == 0) goto L_0x005f
            r2 = r3
            X.AUk r2 = (X.C20678AUk) r2
            org.json.JSONObject r1 = r2.A00
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "summary"
            boolean r1 = r1.optBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0057
            r0 = 0
        L_0x004a:
            if (r6 <= r0) goto L_0x004e
            r5 = r4
            r6 = r0
        L_0x004e:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x002e
        L_0x0054:
            X.BC4 r5 = (X.BC4) r5
            return r5
        L_0x0057:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x005f
            r0 = 1
            goto L_0x004a
        L_0x005f:
            boolean r0 = r3 instanceof X.C173518vD
            if (r0 == 0) goto L_0x004e
            r0 = 2
            goto L_0x004a
        L_0x0065:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x006d
            r6 = 1
            goto L_0x002e
        L_0x006d:
            boolean r0 = r3 instanceof X.C173518vD
            int r6 = X.AnonymousClass8BU.A01(r0)
            goto L_0x002e
        L_0x0074:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6Z.A02():X.BC4");
    }

    public final String A03() {
        List list = this.A01;
        if (!list.isEmpty()) {
            return C29431cG.A0h(",", list, B36.A00);
        }
        return null;
    }

    public final boolean A04() {
        List<Object> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof C172888uB) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A05() {
        List<BC4> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (BC4 bc4 : list) {
                if ((bc4 instanceof C20678AUk) && ((C20678AUk) bc4).A00()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A06() {
        List<Object> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof C173518vD) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String A1H;
        List list = this.A01;
        if (list.isEmpty() || (A1H = AnonymousClass001.A1H("Response errors: ", C29431cG.A0h(",", list, new C22198AzE(this)), AnonymousClass000.A10())) == null) {
            return "";
        }
        return A1H;
    }

    public A6Z(Throwable th, JSONArray jSONArray) {
        this.A00 = th;
        ArrayList A13 = AnonymousClass000.A13();
        this.A01 = A13;
        if (th != null) {
            A13.add(!(th instanceof C173518vD) ? new C172838u6((String) null, th) : th);
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                List list = this.A01;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C18070vi.A0X(jSONObject);
                list.add(new C20678AUk(jSONObject));
            }
        }
        if (!AnonymousClass000.A1a(this.A01)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MexErrorSummary was used but there are no errors. Failure and rawErrors should not both be null. Failure: ");
            A10.append(this.A00);
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(jSONArray, "  rawErrors: ", A10));
        }
    }

    public static int A00(A6Z a6z) {
        return a6z.A02().BOq();
    }

    public static final JSONObject A01(BC4 bc4) {
        JSONObject A15 = C17880vN.A15();
        A15.put("code", bc4.BOq());
        A15.put("detail", bc4.BQa());
        A15.put("category", bc4.BOP());
        return A15;
    }

    public A6Z() {
        this((Throwable) null, (JSONArray) null);
    }
}

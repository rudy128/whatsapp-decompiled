package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class A2A {
    public final AnonymousClass11P A00;
    public final AnonymousClass122 A01;
    public final AnonymousClass1R3 A02;
    public final C18030ve A03;
    public final AnonymousClass1W6 A04;
    public final AnonymousClass10I A05;
    public final C183989aE A06;

    public static final C20271AEe A00(AnonymousClass206 r2) {
        C20277AEk aEk;
        C20253ADl aDl;
        C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive");
        C20285AEt aEt = ((AnonymousClass21L) r2).A00;
        if (aEt == null || (aEk = aEt.A06) == null || (aDl = (C20253ADl) aEk.A03.get(0)) == null) {
            return null;
        }
        return aDl.A01;
    }

    public final A2Y A01(AnonymousClass21L r4) {
        String str;
        JSONObject optJSONObject;
        C20271AEe A002 = A00(r4);
        if (A002 == null || (str = A002.A00) == null || (optJSONObject = C17880vN.A16(str).optJSONObject("action_selected")) == null) {
            return null;
        }
        return A2Y.A02.A00(optJSONObject);
    }

    public final boolean A02(AnonymousClass21L r7) {
        long j;
        TimeUnit timeUnit;
        Long A0o;
        String str;
        JSONObject optJSONObject;
        String str2;
        JSONObject optJSONObject2;
        C18070vi.A0d(r7, 0);
        if (A03(r7, AnonymousClass00R.A01)) {
            return true;
        }
        A2Y A012 = A01(r7);
        if (A012 == null || A012.A00.ordinal() != 0) {
            C20271AEe A002 = A00(r7);
            if (!(A002 == null || (str = A002.A00) == null || (optJSONObject = C17880vN.A16(str).optJSONObject("action_selected_info")) == null)) {
                long optLong = optJSONObject.optLong("initial_timestamp");
                if (Long.valueOf(optLong) != null) {
                    timeUnit = TimeUnit.SECONDS;
                    j = timeUnit.toMillis(optLong);
                    A0o = C17880vN.A0o(j, timeUnit.toMillis(this.A06.A00));
                }
            }
            j = r7.A0G;
            if (j == 0) {
                j = r7.A0I;
            }
            timeUnit = TimeUnit.SECONDS;
            A0o = C17880vN.A0o(j, timeUnit.toMillis(this.A06.A00));
        } else {
            C20271AEe A003 = A00(r7);
            if (!(A003 == null || (str2 = A003.A00) == null || (optJSONObject2 = C17880vN.A16(str2).optJSONObject("action_selected")) == null)) {
                A0o = Long.valueOf(TimeUnit.SECONDS.toMillis(optJSONObject2.optLong("permission_expiry_timestamp")));
            }
            return true;
        }
        if (A0o == null || A0o.longValue() < AnonymousClass11P.A01(this.A00)) {
            return true;
        }
        return false;
    }

    public final boolean A03(AnonymousClass21L r4, Integer num) {
        String str;
        C18070vi.A0d(r4, 0);
        Integer num2 = null;
        C20271AEe A002 = A00(r4);
        if (!(A002 == null || (str = A002.A00) == null)) {
            String optString = C17880vN.A16(str).optString("status");
            if (C108955ca.A05(optString) != 0) {
                if (optString.equals("CALL_COMPLETED")) {
                    num2 = AnonymousClass00R.A00;
                } else if (optString.equals("EXPIRED")) {
                    num2 = AnonymousClass00R.A01;
                } else {
                    throw AnonymousClass000.A0k(optString);
                }
            }
        }
        return AnonymousClass000.A1Z(num2, num);
    }

    public A2A(C183989aE r1, AnonymousClass11P r2, AnonymousClass122 r3, AnonymousClass1R3 r4, C18030ve r5, AnonymousClass1W6 r6, AnonymousClass10I r7) {
        C18070vi.A0w(r2, r7, r6, r3, r4);
        C18070vi.A0l(r5, r1);
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = r1;
    }
}

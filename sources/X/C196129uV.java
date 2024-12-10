package X;

import android.content.SharedPreferences;

/* renamed from: X.9uV  reason: invalid class name and case insensitive filesystem */
public class C196129uV {
    public final C18010vc A00;
    public final AnonymousClass00H A01 = C18150vq.A01(new C21516AlP(this, 10));
    public final AnonymousClass190 A02;

    public C187719gG A00() {
        SharedPreferences A0B = C17880vN.A0B(this.A01);
        String string = A0B.getString("/export/enc/active/owner", (String) null);
        String string2 = A0B.getString("/export/enc/active/version", (String) null);
        String string3 = A0B.getString("/export/enc/active/account_hash", (String) null);
        String string4 = A0B.getString("/export/enc/active/server_salt", (String) null);
        long A05 = C17890vO.A05(A0B, "/export/enc/active/last_fetch_time");
        String string5 = A0B.getString("/export/enc/active/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                return new C187719gG(AnonymousClass8BR.A0X(string), string2, string3, string4, string5, A05);
            } catch (AnonymousClass11T e) {
                this.A02.A0E("xpm-export-preferences-active", AnonymousClass001.A1H("invalid jid: ", string, AnonymousClass000.A10()), e);
            }
        }
        return null;
    }

    public C187719gG A01() {
        SharedPreferences A0B = C17880vN.A0B(this.A01);
        String string = A0B.getString("/export/enc/prefetched/owner", (String) null);
        String string2 = A0B.getString("/export/enc/prefetched/version", (String) null);
        String string3 = A0B.getString("/export/enc/prefetched/account_hash", (String) null);
        String string4 = A0B.getString("/export/enc/prefetched/server_salt", (String) null);
        long A05 = C17890vO.A05(A0B, "/export/enc/prefetched/last_fetch_time");
        String string5 = A0B.getString("/export/enc/prefetched/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                return new C187719gG(AnonymousClass8BR.A0X(string), string2, string3, string4, string5, A05);
            } catch (AnonymousClass11T e) {
                this.A02.A0E("xpm-export-preferences-prefetched", AnonymousClass001.A1H("invalid jid: ", string, AnonymousClass000.A10()), e);
            }
        }
        return null;
    }

    public String A02() {
        AnonymousClass00H r3 = this.A01;
        String string = C17880vN.A0B(r3).getString("/export/logging/funnelId", (String) null);
        if (string != null) {
            return string;
        }
        String A0Q = C17890vO.A0Q();
        C17880vN.A1E(AnonymousClass8BV.A06(r3), "/export/logging/funnelId", A0Q);
        return A0Q;
    }

    public void A03() {
        C17880vN.A1B(AnonymousClass8BV.A06(this.A01), "/export/logging/funnelId");
    }

    public void A04() {
        C17880vN.A1B(AnonymousClass8BV.A06(this.A01).remove("/export/enc/prefetched/owner").remove("/export/enc/prefetched/version").remove("/export/enc/prefetched/account_hash").remove("/export/enc/prefetched/server_salt").remove("/export/enc/prefetched/last_fetch_time"), "/export/enc/prefetched/seed");
    }

    public C196129uV(AnonymousClass190 r3, C18010vc r4) {
        this.A02 = r3;
        this.A00 = r4;
    }
}

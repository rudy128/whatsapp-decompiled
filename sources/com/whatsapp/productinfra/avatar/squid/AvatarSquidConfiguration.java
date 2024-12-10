package com.whatsapp.productinfra.avatar.squid;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass6RP;
import X.AnonymousClass6RS;
import X.C108945cZ;
import X.C108995ce;
import X.C137856w8;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C27021Uk;
import X.C27031Ul;

public final class AvatarSquidConfiguration {
    public final C137856w8 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final C27021Uk A04;

    public final AnonymousClass6RP A00() {
        int A002 = C18020vd.A00(C18040vf.A02, C17880vN.A0P(this.A01), 7925);
        if (A002 != 0) {
            if (A002 == 1) {
                return AnonymousClass6RP.DAY_0;
            }
            if (A002 != 2) {
                if (A002 == 3) {
                    if (C17880vN.A1W(C108995ce.A0F(this.A02), "pref_automatic_squid")) {
                        return AnonymousClass6RP.DAY_60;
                    }
                }
            }
            return AnonymousClass6RP.DAY_45;
        }
        return AnonymousClass6RP.DISABLED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r4 >= 5) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r4 >= 3) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass6RS r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C147807Uo
            if (r0 == 0) goto L_0x00ce
            r2 = r10
            X.7Uo r2 = (X.C147807Uo) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00ce
            int r3 = r3 - r1
            r2.label = r3
        L_0x0012:
            java.lang.Object r1 = r2.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r2.label
            r3 = 1
            if (r0 == 0) goto L_0x009a
            if (r0 != r3) goto L_0x00da
            java.lang.Object r6 = r2.L$2
            X.6RP r6 = (X.AnonymousClass6RP) r6
            java.lang.Object r9 = r2.L$1
            java.lang.Object r2 = r2.L$0
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r2 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r2
            X.C30691eM.A01(r1)
        L_0x002a:
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0049
            X.00H r0 = r2.A02
            android.content.SharedPreferences r1 = X.C108995ce.A0F(r0)
            java.lang.String r0 = "pref_automatic_squid"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0049
        L_0x0044:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            return r0
        L_0x0049:
            X.00H r7 = r2.A02
            X.1Ul r0 = X.C108945cZ.A0o(r7)
            r4 = 0
            X.C18070vi.A0d(r6, r4)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "pref_has_dismissed_squid_upsell_"
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)
            boolean r0 = r2.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0044
            X.6RS r0 = X.AnonymousClass6RS.AVATAR_HOME
            r5 = 0
            if (r9 == r0) goto L_0x00d5
            android.content.SharedPreferences r2 = X.C108995ce.A0F(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "pref_squid_upsell_view_count_"
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)
            int r4 = r2.getInt(r0, r4)
            int r2 = r6.ordinal()
            r1 = 3
            if (r2 == r3) goto L_0x0097
            r0 = 2
            if (r2 == r0) goto L_0x0097
            if (r2 == r1) goto L_0x0093
            if (r2 == r5) goto L_0x0044
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0093:
            r0 = 5
            if (r4 < r0) goto L_0x00d5
            goto L_0x0044
        L_0x0097:
            if (r4 < r1) goto L_0x00d5
            goto L_0x0044
        L_0x009a:
            X.C30691eM.A01(r1)
            X.00H r0 = r8.A01
            X.0vd r1 = X.C17880vN.A0P(r0)
            r0 = 9859(0x2683, float:1.3815E-41)
            java.lang.String r1 = X.C108955ca.A0v(r1, r0)
            java.lang.String r0 = r9.value
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 == 0) goto L_0x0044
            X.6RP r6 = r8.A00()
            X.6RP r0 = X.AnonymousClass6RP.DISABLED
            if (r6 == r0) goto L_0x0044
            X.1Uk r1 = r8.A04
            r2.L$0 = r8
            r2.L$1 = r9
            r2.L$2 = r6
            r2.label = r3
            r0 = 0
            java.lang.Object r1 = r1.A00(r2, r0)
            if (r1 != r4) goto L_0x00cb
            return r4
        L_0x00cb:
            r2 = r8
            goto L_0x002a
        L_0x00ce:
            X.7Uo r2 = new X.7Uo
            r2.<init>(r8, r10)
            goto L_0x0012
        L_0x00d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x00da:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration.A01(X.6RS, X.1dr):java.lang.Object");
    }

    public final boolean A03() {
        return C18070vi.A18(C17880vN.A0r(C108995ce.A0F(this.A02), "pref_squid_version"), "Style2");
    }

    public AvatarSquidConfiguration(C27021Uk r1, C137856w8 r2, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0w(r3, r2, r1, r4, r5);
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r1;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void A02(AnonymousClass6RS r7) {
        AnonymousClass6RP A002 = A00();
        C27031Ul A0o = C108945cZ.A0o(this.A02);
        C18070vi.A0d(A002, 0);
        C18100vl r4 = A0o.A01;
        C17880vN.A1C(C17890vO.A0A(r4), AnonymousClass001.A1E(A002, "pref_squid_upsell_view_count_", AnonymousClass000.A10()), C17880vN.A0C(r4).getInt(AnonymousClass001.A1E(A002, "pref_squid_upsell_view_count_", AnonymousClass000.A10()), 0) + 1);
        C137856w8.A00(A002, this.A00, r7, 1);
    }
}

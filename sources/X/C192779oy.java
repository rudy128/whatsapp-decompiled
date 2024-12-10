package X;

import com.whatsapp.util.Log;

/* renamed from: X.9oy  reason: invalid class name and case insensitive filesystem */
public final class C192779oy {
    public final AnonymousClass11P A00;
    public final AnonymousClass19D A01;
    public final C19880zA A02;
    public final C19830z4 A03;
    public final AnonymousClass19F A04;
    public final A98 A05;
    public final AnonymousClass00H A06;

    public final String A00(String str, String str2) {
        if (str == null || str2 == null) {
            if (str == null && str2 == null) {
                str = "1";
                str2 = "2155550000";
            } else {
                C17960vV.A0F(false, "Country code/phone number is illegally null");
                return null;
            }
        }
        try {
            C198499yR A0M = this.A05.A0M(str, str2);
            if (A0M == null) {
                Log.e("CheckIfReinstalledTask/fetchPreChatdABProps/null abPropCheckResult");
                return null;
            }
            int i = A0M.A01;
            if (i != 1) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("CheckIfReinstalledTask/fetchPreChatdABProps/status/");
                A10.append(i);
                A10.append("/reason/");
                int i2 = A0M.A00;
                String str3 = "temporarily_unavailable";
                if (i2 != 0 && i2 == 1) {
                    str3 = "ab_server_error";
                }
                C17890vO.A19(A10, str3);
                if (i2 == 0) {
                    AnonymousClass19D r4 = this.A01;
                    C17880vN.A1D(r4.A0P().edit(), "pref_pre_chatd_ab_next_fetch_time", AnonymousClass11P.A01(this.A00) + A0M.A02);
                    return null;
                } else if (i2 == 2) {
                    return "wamsys initialization fails";
                } else {
                    return null;
                }
            } else {
                String str4 = A0M.A03;
                if (str4 == null) {
                    Log.i("CheckIfReinstalledTask/fetchPreChatdABProps/no abHash returned, no need to update PreChatdABProps storage");
                    return null;
                }
                Log.i("CheckIfReinstalledTask/fetchPreChatdABProps/success");
                C17880vN.A1E(AnonymousClass8BV.A06(this.A03.A00), "pref_pre_chatd_ab_hash", str4);
                return A0M.A04;
            }
        } catch (Exception e) {
            Log.e("CheckIfReinstalledTask/fetchPreChatdABProps/entrypoint call error: ", e);
            return null;
        }
    }

    public final boolean A01(String str) {
        if (str == null || str.equals("wamsys initialization fails")) {
            return false;
        }
        this.A04.A07(str);
        C19830z4 r3 = this.A03;
        AnonymousClass19D r1 = this.A01;
        C18040vf r5 = C18040vf.A02;
        C17880vN.A1C(C19830z4.A00(r3), "reg_skip_storage_perm", C18020vd.A00(r5, r1, 2736));
        C192679on r0 = (C192679on) this.A06.get();
        C19830z4 r4 = r0.A00;
        AnonymousClass19D r32 = r0.A01;
        C17880vN.A1F(C19830z4.A00(r4), "reg_abprop_passkey_create", C18020vd.A05(r5, r32, 4732));
        C17880vN.A1F(C19830z4.A00(r4), "reg_abprop_passkey_create_education_screen", C18020vd.A05(r5, r32, 5967));
        C52212aY r02 = (C52212aY) this.A02.A04();
        if (r02 == null) {
            return true;
        }
        r02.A00.A00();
        return true;
    }

    public C192779oy(C19880zA r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass19D r5, AnonymousClass19F r6, A98 a98, AnonymousClass00H r8) {
        C18070vi.A0w(r3, r6, r5, r8, r4);
        C18070vi.A0d(a98, 6);
        this.A00 = r3;
        this.A04 = r6;
        this.A01 = r5;
        this.A06 = r8;
        this.A03 = r4;
        this.A05 = a98;
        this.A02 = r2;
    }
}

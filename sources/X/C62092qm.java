package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.2qm  reason: invalid class name and case insensitive filesystem */
public final class C62092qm {
    public static volatile boolean A09;
    public static volatile boolean A0A;
    public AnonymousClass1KB A00;
    public C55192fN A01;
    public C19830z4 A02;
    public AnonymousClass10I A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public String A08;

    public final void A01(Context context, String str, int i, boolean z) {
        String str2;
        A0A = false;
        A09 = false;
        this.A08 = null;
        C55192fN r0 = this.A01;
        if (r0 != null) {
            C18030ve r02 = r0.A02;
            if (r02 != null) {
                C18040vf r1 = C18040vf.A02;
                Context context2 = context;
                int i2 = i;
                boolean z2 = z;
                if (!C18020vd.A05(r1, r02, 7779)) {
                    Log.i("AddAccountNavigator/executeAddAccountFlow/addAccountServerPrimer/not-enabled");
                    A09 = true;
                } else {
                    C55192fN r4 = this.A01;
                    if (r4 != null) {
                        C71753If r3 = new C71753If(context, this, i, z2);
                        C18030ve r03 = r4.A02;
                        if (r03 != null) {
                            if (!C18020vd.A05(r1, r03, 7779)) {
                                r3.invoke((Object) null);
                            } else {
                                AnonymousClass10I r2 = r4.A03;
                                if (r2 != null) {
                                    r2.CGF(new AnonymousClass3C0(r4, r3, 40));
                                }
                                str2 = "waWorkers";
                                C18070vi.A11(str2);
                                throw null;
                            }
                        }
                    }
                }
                C19830z4 r04 = this.A02;
                if (r04 != null) {
                    String A0g = r04.A0g();
                    C19830z4 r05 = this.A02;
                    if (r05 != null) {
                        C17880vN.A1E(C19830z4.A00(r05), "abandon_add_account_landing_screen", str);
                        if (A0g == null) {
                            Log.i("AddAccountNavigator/executeAddAccountFlow/pushId is null");
                            A0A = true;
                        } else {
                            Log.i("AddAccountNavigator/executeAddAccountFlow/pushId is not null");
                            C148037gn r9 = new C148037gn(this, 0);
                            Log.i("AddAccountNavigator/updatePushConfigForCurrentAccount");
                            AnonymousClass10I r06 = this.A03;
                            if (r06 != null) {
                                r06.CGF(new C70793Cn(context2, this, A0g, (C36001nB) r9, i2, z2));
                            }
                            str2 = "waWorkers";
                            C18070vi.A11(str2);
                            throw null;
                        }
                        A00(context, this, i, z2);
                        return;
                    }
                }
                str2 = "waSharedPreferences";
                C18070vi.A11(str2);
                throw null;
            }
            str2 = "abProps";
            C18070vi.A11(str2);
            throw null;
        }
        str2 = "multiAccountServerPrimer";
        C18070vi.A11(str2);
        throw null;
    }

    public static final void A00(Context context, C62092qm r11, int i, boolean z) {
        if ((!A09) || (!A0A)) {
            Log.i("AddAccountNavigator/maybeStartAddNewAccountFlow/waiting-for-a-job-finish");
            return;
        }
        AnonymousClass00H r0 = r11.A04;
        if (r0 != null) {
            if (((C29491cN) C18070vi.A0E(r0)).A0I(context, (String) null, (String) null, (String) null, r11.A08, (C18090vk) null, i, true, false, z)) {
                C19830z4 r1 = r11.A02;
                if (r1 != null) {
                    AnonymousClass00H r02 = r11.A04;
                    if (r02 != null) {
                        r1.A1H(C17880vN.A0I(r02).A0A.A0E() + 1);
                    } else {
                        C18070vi.A11("accountSwitcher");
                        throw null;
                    }
                } else {
                    C18070vi.A11("waSharedPreferences");
                    throw null;
                }
            }
        } else {
            C18070vi.A11("accountSwitcher");
            throw null;
        }
    }
}

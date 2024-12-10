package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.1wv  reason: invalid class name and case insensitive filesystem */
public final class C41701wv {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final C219217x A02;
    public final C41731wy A03 = new C41731wy();
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05 = C217517g.A00(16503);
    public final C18100vl A06 = new C18110vm(new C41721wx(this));
    public final C18100vl A07 = new C18110vm(new C41711ww(this));
    public final C19830z4 A08;
    public final AnonymousClass10I A09;

    public C41701wv(AnonymousClass1KB r3, AnonymousClass118 r4, C219217x r5, C19830z4 r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r8, 6);
        this.A00 = r3;
        this.A01 = r4;
        this.A09 = r7;
        this.A02 = r5;
        this.A08 = r6;
        this.A04 = r8;
    }

    public static final boolean A00(Activity activity, Fragment fragment, B9S b9s, C41701wv r9, String str, List list) {
        boolean A0I;
        C41701wv r5 = r9;
        C219217x r1 = r9.A02;
        Activity activity2 = activity;
        if (!r1.A0G()) {
            if (fragment != null) {
                A0I = AnonymousClass74O.A0Q(fragment, r1);
            } else {
                A0I = AnonymousClass74O.A0I(activity, r1);
            }
            if (!A0I) {
                return false;
            }
        }
        r9.A09.CGF(new C21462AkT(b9s, list, activity2, r5, str, 13));
        return true;
    }

    public final boolean A03(Activity activity, Fragment fragment, String str, List list) {
        return A00(activity, fragment, (AnonymousClass7MB) this.A07.getValue(), this, str, list);
    }

    public final void A01(Intent intent) {
        if (intent != null) {
            C19830z4 r4 = this.A08;
            boolean z = ((SharedPreferences) r4.A00.get()).getBoolean("is_status_sharing_with_fb_disabled", false);
            boolean booleanExtra = intent.getBooleanExtra("feature_disabled", z);
            if (booleanExtra != z) {
                C19830z4.A00(r4).putBoolean("is_status_sharing_with_fb_disabled", booleanExtra).apply();
            }
        }
    }

    public final boolean A02() {
        AnonymousClass8Ay[] r3 = ((AnonymousClass7MA) this.A06.getValue()).A00;
        int i = 0;
        while (true) {
            if (!r3[i].Bh1()) {
                i++;
                if (i >= 2) {
                    break;
                }
            } else if (((SharedPreferences) this.A08.A00.get()).getBoolean("is_status_sharing_with_fb_disabled", false)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}

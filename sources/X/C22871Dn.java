package X;

import android.content.SharedPreferences;

/* renamed from: X.1Dn  reason: invalid class name and case insensitive filesystem */
public class C22871Dn {
    public final AnonymousClass11R A00;
    public final C18030ve A01;
    public final AnonymousClass1CM A02;

    public int A00() {
        return this.A00.A01.A00.getInt("companion_registration_state", 0);
    }

    public void A01(int i) {
        AnonymousClass11R r3 = this.A00;
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A01, 12289);
        SharedPreferences.Editor putInt = r3.A01.A00.edit().putInt("companion_registration_state", i);
        if (A05) {
            putInt.apply();
        } else {
            putInt.commit();
        }
        if (i == 8) {
            this.A02.A01(3);
        }
    }

    public C22871Dn(AnonymousClass11R r1, C18030ve r2, AnonymousClass1CM r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public boolean A02() {
        int A002 = A00();
        if (A002 < 2) {
            return false;
        }
        if (A002 <= 6) {
            return true;
        }
        if (A002 < 10 || A002 > 14) {
            return false;
        }
        return true;
    }
}

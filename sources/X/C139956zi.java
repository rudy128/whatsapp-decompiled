package X;

import android.os.Build;
import android.os.Environment;

/* renamed from: X.6zi  reason: invalid class name and case insensitive filesystem */
public class C139956zi {
    public final AnonymousClass1KB A00;
    public final C18000vb A01;
    public final AnonymousClass00H A02;
    public final C219217x A03;

    public final void A03(AnonymousClass1FU r3) {
        C18070vi.A0d(r3, 0);
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            this.A02.get();
            int i = 2131892427;
            if (AnonymousClass11Z.A00()) {
                i = 2131892426;
            }
            r3.BhQ(i);
        }
        if (!A00(r3, this)) {
            r3.BhQ(A01());
        }
    }

    public static final boolean A00(AnonymousClass1FU r5, C139956zi r6) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || r6.A03.A04(AnonymousClass73I.A04()) != -1) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            i = 2131894425;
        } else {
            i = 2131894496;
            if (i2 < 33) {
                i = 2131894495;
            }
        }
        if (r5.isFinishing()) {
            return true;
        }
        r5.startActivityForResult(AnonymousClass74O.A03(r5, 2131894494, i, false), 151);
        return true;
    }

    public final int A01() {
        this.A02.get();
        if (AnonymousClass11Z.A00()) {
            return 2131890612;
        }
        return 2131890613;
    }

    public final void A02(int i) {
        AnonymousClass1KB r7 = this.A00;
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i, 0);
        r7.A0G(this.A01.A0K(objArr, 2131755487, (long) i), 1);
    }

    public C139956zi(AnonymousClass1KB r1, C219217x r2, C18000vb r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r4, r3, r2);
        this.A00 = r1;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r2;
    }
}

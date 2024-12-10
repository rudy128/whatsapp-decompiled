package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1SM  reason: invalid class name */
public final class AnonymousClass1SM implements AnonymousClass1SK {
    public final C18030ve A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass00H A02;

    public AnonymousClass1SM(AnonymousClass11E r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = r4;
    }

    public synchronized void BBK(C26551So r9, int i, long j, long j2) {
        synchronized (this) {
            int A002 = AnonymousClass1SL.A00(this.A01.A04());
            if (A002 != 5 && j >= 51200 && j2 >= 100) {
                int i2 = 1;
                if (A002 != 4) {
                    i2 = 0;
                }
                AnonymousClass00H r5 = this.A02;
                AnonymousClass2KF r1 = new AnonymousClass2KF(C29431cG.A0m(((C61982qb) r5.get()).A01(i, i2, A002)), C18020vd.A00(C18040vf.A02, this.A00, 11221));
                r1.A01((int) ((float) (j / j2)));
                C61982qb r6 = (C61982qb) r5.get();
                List list = r1.A00;
                C18070vi.A0d(list, 0);
                ((SharedPreferences) r6.A01.getValue()).edit().putString(C61982qb.A00(r6, i, i2, A002), C29431cG.A0g(",", "", ",", list, (C22821Di) null)).apply();
            }
        }
    }

    public synchronized Float BNL(int i) {
        int i2;
        Float f;
        float f2;
        float f3;
        int A002 = AnonymousClass1SL.A00(this.A01.A04());
        if (A002 != 4) {
            i2 = -1;
            if (A002 != 5) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        ArrayList A0m = C29431cG.A0m(((C61982qb) this.A02.get()).A01(i, i2, A002));
        C18030ve r3 = this.A00;
        C18040vf r2 = C18040vf.A02;
        AnonymousClass2KF r1 = new AnonymousClass2KF(A0m, C18020vd.A00(r2, r3, 11221));
        if (C18020vd.A05(r2, r3, 10526)) {
            if (!r1.A02()) {
                f3 = -1.0f;
            } else {
                f3 = (float) C50272Tu.A00(r1.A00);
            }
            f = Float.valueOf(f3);
        } else {
            if (!r1.A02()) {
                f2 = -1.0f;
            } else {
                List<Number> list = r1.A00;
                int intValue = ((Number) C50582Uz.A00(C29431cG.A0m(list))).intValue();
                C18070vi.A0d(list, 0);
                long j = 0;
                for (Number intValue2 : list) {
                    j += (long) intValue2.intValue();
                }
                f2 = (float) (((((double) j) / ((double) list.size())) * 0.5d) + (((double) intValue) * 0.5d));
            }
            if (f2 < 20.0f) {
                f = null;
            } else {
                f = Float.valueOf(f2);
            }
        }
        return f;
    }

    public Float BNM(int i) {
        return null;
    }
}

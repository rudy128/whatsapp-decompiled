package X;

import android.os.Bundle;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1oY  reason: invalid class name and case insensitive filesystem */
public class C36841oY {
    public final AnonymousClass1NP A00;
    public final C36801oU A01;
    public final AnonymousClass00H A02;
    public final AtomicLong A03 = new AtomicLong(0);
    public final AtomicLong A04 = new AtomicLong(0);
    public final AtomicLong A05 = new AtomicLong(0);
    public final AtomicLong A06 = new AtomicLong(0);
    public final AtomicLong A07 = new AtomicLong(0);
    public final C19830z4 A08;

    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putLong("total_bytes_to_be_downloaded", this.A05.get());
        bundle.putLong("total_bytes_downloaded", this.A04.get());
        bundle.putLong("total_bytes_to_be_uploaded", this.A06.get());
        return bundle;
    }

    public void A01(C36851oZ r10) {
        AnonymousClass10T r5;
        int i;
        Bundle bundle;
        int i2;
        AnonymousClass00H r52 = this.A02;
        ((AnonymousClass10T) r52.get()).registerObserver(r10);
        AnonymousClass1NP r4 = this.A00;
        AnonymousClass00H r0 = C20134A8u.A00;
        if (!C17890vO.A1R(r4.A05())) {
            C36801oU r2 = this.A01;
            if (!r2.A0P.get()) {
                if (r2.A0R.get() || C20134A8u.A07(r4)) {
                    if (!r2.A0V.get()) {
                        int i3 = r2.A02;
                        long j = this.A04.get();
                        long j2 = this.A05.get();
                        if (i3 == 0) {
                            r10.By4(j, j2);
                        } else {
                            r10.By0(j, j2);
                        }
                    } else if (!r2.A07) {
                        r10.By1(this.A04.get(), this.A05.get());
                    } else if (!r2.A09) {
                        boolean equals = "unmounted".equals(Environment.getExternalStorageState());
                        long j3 = this.A04.get();
                        long j4 = this.A05.get();
                        if (equals) {
                            r10.By3(j3, j4);
                        } else {
                            r10.By2(j3, j4);
                        }
                    } else {
                        AtomicLong atomicLong = this.A05;
                        if (atomicLong.get() > 0) {
                            r10.By7(this.A04.get(), atomicLong.get());
                        } else {
                            r10.By6();
                        }
                    }
                    r5 = (AnonymousClass10T) r52.get();
                    i = r4.A02();
                    bundle = A00();
                    i2 = 3;
                    r5.notifyAllObservers(new C20739AWu(bundle, i, i2));
                }
                if (r4.A05() == 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-service/observer/registered/error/");
                    sb.append(C41361wE.A03(r4.A02()));
                    Log.i(sb.toString());
                    return;
                }
                r5 = (AnonymousClass10T) r52.get();
                i = r4.A02();
                bundle = A00();
                i2 = 1;
                r5.notifyAllObservers(new C20739AWu(bundle, i, i2));
            }
        }
        C36801oU r22 = this.A01;
        if (!r22.A0T.get()) {
            int i4 = r22.A01;
            long j5 = this.A07.get();
            long j6 = this.A06.get();
            if (i4 == 0) {
                r10.BmJ(j5, j6);
            } else {
                r10.BmF(j5, j6);
            }
        } else if (!r22.A05) {
            r10.BmG(this.A07.get(), this.A06.get());
        } else if (!r22.A09) {
            boolean equals2 = "unmounted".equals(Environment.getExternalStorageState());
            long j7 = this.A07.get();
            long j8 = this.A06.get();
            if (equals2) {
                r10.BmI(j7, j8);
            } else {
                r10.BmH(j7, j8);
            }
        } else {
            AtomicLong atomicLong2 = this.A06;
            if (atomicLong2.get() > 0) {
                r10.BmM(this.A07.get(), atomicLong2.get());
            } else if (C17890vO.A1R(r4.A05())) {
                r10.BmL();
            } else {
                r10.C4d();
            }
        }
        r5 = (AnonymousClass10T) r52.get();
        i = r4.A02();
        bundle = A00();
        i2 = 1;
        r5.notifyAllObservers(new C20739AWu(bundle, i, i2));
    }

    public void A02(C36851oZ r2) {
        ((AnonymousClass10T) this.A02.get()).unregisterObserver(r2);
    }

    public C36841oY(AnonymousClass1NP r4, C36801oU r5, C19830z4 r6, AnonymousClass00H r7) {
        this.A08 = r6;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r7;
    }
}

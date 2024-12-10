package X;

import android.content.Context;
import android.database.Cursor;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.AkS  reason: case insensitive filesystem */
public class C21461AkS implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    public C21461AkS(AnonymousClass8GL r2, int i, int i2) {
        this.A00 = 3;
        this.A04 = r2;
        this.A01 = 2131897524;
        this.A02 = i;
        this.A03 = i2;
    }

    public final void run() {
        C188629hj A002;
        Cursor A0A;
        switch (this.A00) {
            case 0:
                AnonymousClass1KB r4 = (AnonymousClass1KB) this.A04;
                AnonymousClass1FR r1 = r4.A00;
                if (r1 != null) {
                    r1.BhU(new Object[0], 2131898047, 2131898046);
                    return;
                } else {
                    r4.A08(2131898046, 1);
                    return;
                }
            case 1:
                int i = this.A02;
                int i2 = this.A03;
                C171078r8 r12 = new C171078r8();
                r12.A00 = false;
                r12.A04 = 20;
                r12.A01 = Integer.valueOf(i);
                r12.A03 = Integer.valueOf(i2);
                r12.A02 = 4;
                ((C183959aB) this.A04).A00.CC7(r12);
                return;
            case 2:
                AnonymousClass4aY r5 = (AnonymousClass4aY) this.A04;
                int i3 = this.A01;
                int i4 = this.A02;
                int i5 = this.A03;
                Calendar instance = Calendar.getInstance(r5.A2k.A0N());
                instance.clear();
                instance.set(i3, i4, i5);
                AnonymousClass122 r6 = r5.A2z;
                long timeInMillis = instance.getTimeInMillis();
                String[] A1Y = C17880vN.A1Y();
                C17880vN.A1V(A1Y, 0, timeInMillis);
                C28781at A042 = r6.A0V.get();
                try {
                    A0A = ((C28801av) A042).A02.A0A(AnonymousClass203.A0K, "SELECT_FIRST_MESSAGE_AFTER_TIMESTAMP", A1Y);
                    if (!A0A.moveToFirst()) {
                        A0A.close();
                        A042.close();
                        return;
                    }
                    AnonymousClass206 A012 = C17880vN.A0c(r6.A1E).A01(A0A);
                    A0A.close();
                    A042.close();
                    if (A012 != null) {
                        r5.A1L.A0J(new C98704ra(r5, A012, 28));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
                break;
            case 3:
                AnonymousClass8GL r62 = (AnonymousClass8GL) this.A04;
                int i6 = this.A02;
                int i7 = this.A03;
                AnonymousClass1KH r2 = r62.A0C;
                AW0 aw0 = r62.A07;
                C20284AEs A08 = r2.A08(aw0.A0H);
                r62.A05 = A08;
                if (A08 == null) {
                    A002 = C188629hj.A00(3);
                    Context context = r62.A04.A00;
                    A002.A08 = context.getString(2131897524);
                    A002.A07 = context.getString(i6);
                } else {
                    A002 = C188629hj.A00(i7);
                    A002.A03 = aw0;
                }
                r62.A09.A0E(A002);
                return;
            default:
                int i8 = this.A02;
                int i9 = this.A03;
                List<AnonymousClass89N> list = ((C1409373q) this.A04).A02;
                if (list != null) {
                    for (AnonymousClass89N Blq : list) {
                        Blq.Blq(i8, i9);
                    }
                    return;
                }
                return;
        }
        throw th;
    }

    public C21461AkS(C183959aB r2, int i, int i2) {
        this.A00 = 1;
        this.A01 = 20;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = r2;
    }

    public C21461AkS(Object obj, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public C21461AkS(AnonymousClass1KB r4) {
        this.A00 = 0;
        this.A04 = r4;
        this.A01 = 2131898047;
        this.A02 = 2131898046;
        this.A03 = 1;
    }
}

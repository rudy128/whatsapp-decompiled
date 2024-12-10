package X;

import android.os.Build;
import androidx.work.OverwritingInputMerger;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9uj  reason: invalid class name and case insensitive filesystem */
public abstract class C196269uj {
    public A2t A00;
    public UUID A01;
    public boolean A02;
    public final Set A03;

    public C196269uj(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        C18070vi.A0X(randomUUID);
        this.A01 = randomUUID;
        String A0H = C18070vi.A0H(randomUUID);
        String name = cls.getName();
        C18070vi.A0X(name);
        Integer num = AnonymousClass00R.A00;
        String name2 = OverwritingInputMerger.class.getName();
        C18070vi.A0X(name2);
        A6Y a6y = A6Y.A01;
        C18070vi.A0Z(a6y);
        this.A00 = new A2t(C20078A6e.A08, a6y, a6y, num, num, num, A0H, name, name2, 0, 0, 0, 0, -256, 0, 0, 0, C20113A7w.A0L, -1, 0, -1, Long.MAX_VALUE, false);
        this.A03 = AnonymousClass1AP.A03(name);
    }

    public abstract C185319cO A01();

    public final void A03(C20078A6e a6e) {
        C18070vi.A0d(a6e, 0);
        this.A00.A0B = a6e;
    }

    public final void A06(Integer num, TimeUnit timeUnit, long j) {
        C18070vi.A0d(num, 0);
        this.A02 = true;
        A2t a2t = this.A00;
        a2t.A0E = num;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            A5Z.A00().A06(A2t.A0O, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            A5Z.A00().A06(A2t.A0O, "Backoff delay duration less than minimum value");
        }
        a2t.A03 = C28851b7.A05(millis, 10000, 18000000);
    }

    public final void A07(String str) {
        C18070vi.A0d(str, 0);
        this.A03.add(str);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.A6Y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.A6Y, java.lang.Object] */
    public final C185319cO A00() {
        boolean z;
        C185319cO A012 = A01();
        C20078A6e a6e = this.A00.A0B;
        int i = Build.VERSION.SDK_INT;
        if ((i < 24 || !a6e.A03()) && !a6e.A01 && !a6e.A02 && (i < 23 || !a6e.A04())) {
            z = false;
        } else {
            z = true;
        }
        A2t a2t = this.A00;
        if (a2t.A0J) {
            if (!(!z)) {
                throw AnonymousClass000.A0k("Expedited jobs only support network and storage constraints");
            } else if (a2t.A05 > 0) {
                throw AnonymousClass000.A0k("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        C18070vi.A0X(randomUUID);
        this.A01 = randomUUID;
        String A0H = C18070vi.A0H(randomUUID);
        A2t a2t2 = this.A00;
        String str = a2t2.A0I;
        Integer num = a2t2.A0G;
        String str2 = a2t2.A0H;
        A6Y a6y = a2t2.A0C;
        ? obj = new Object();
        obj.A00 = new HashMap(a6y.A00);
        A6Y a6y2 = a2t2.A0D;
        ? obj2 = new Object();
        obj2.A00 = new HashMap(a6y2.A00);
        long j = a2t2.A05;
        long j2 = a2t2.A06;
        long j3 = a2t2.A04;
        C20078A6e a6e2 = new C20078A6e(a2t2.A0B);
        int i2 = a2t2.A02;
        Integer num2 = a2t2.A0E;
        long j4 = a2t2.A03;
        long j5 = a2t2.A07;
        long j6 = a2t2.A08;
        long j7 = a2t2.A0A;
        boolean z2 = a2t2.A0J;
        boolean z3 = z2;
        C20078A6e a6e3 = a6e2;
        A6Y a6y3 = obj;
        A6Y a6y4 = obj2;
        Integer num3 = num;
        String str3 = str;
        this.A00 = new A2t(a6e3, a6y3, a6y4, num3, num2, a2t2.A0F, A0H, str3, str2, i2, a2t2.A01, 0, a2t2.A00, a2t2.A0L, j, j2, j3, j4, j5, j6, j7, a2t2.A09, z3);
        return A012;
    }

    public void A02(long j, TimeUnit timeUnit) {
        this.A00.A05 = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.A00.A05) {
            throw AnonymousClass000.A0k("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void A04(A6Y a6y) {
        this.A00.A0C = a6y;
    }

    public void A05(Integer num) {
        A2t a2t = this.A00;
        a2t.A0J = true;
        a2t.A0F = num;
    }
}

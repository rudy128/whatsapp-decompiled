package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0Bs  reason: invalid class name */
public class AnonymousClass0Bs extends AnonymousClass1J2 {
    public int A00 = 0;
    public int A01 = 0;
    public DialogInterface.OnClickListener A02;
    public C03480Ik A03;
    public C02120Cu A04;
    public AnonymousClass0PP A05;
    public C03320Hp A06;
    public C03490Il A07;
    public AnonymousClass1DT A08;
    public AnonymousClass1DT A09;
    public AnonymousClass1DT A0A;
    public AnonymousClass1DT A0B;
    public AnonymousClass1DT A0C;
    public AnonymousClass1DT A0D;
    public AnonymousClass1DT A0E;
    public AnonymousClass1DT A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public int A0T() {
        C03320Hp r0 = this.A06;
        if (r0 == null) {
            return 0;
        }
        AnonymousClass0PP r1 = this.A05;
        int i = r0.A00;
        if (i != 0) {
            return i;
        }
        if (r1 != null) {
            return 15;
        }
        return 255;
    }

    public DialogInterface.OnClickListener A0X() {
        DialogInterface.OnClickListener onClickListener = this.A02;
        if (onClickListener != null) {
            return onClickListener;
        }
        AnonymousClass0R1 r0 = new AnonymousClass0R1(this);
        this.A02 = r0;
        return r0;
    }

    public C03480Ik A0Y() {
        C03480Ik r1 = this.A03;
        if (r1 != null) {
            return r1;
        }
        C03480Ik r12 = new C03480Ik(new AnonymousClass06T(this));
        this.A03 = r12;
        return r12;
    }

    public C02120Cu A0Z() {
        C02120Cu r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass06U r02 = new AnonymousClass06U(this);
        this.A04 = r02;
        return r02;
    }

    public C03490Il A0b() {
        C03490Il r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C03490Il r02 = new C03490Il();
        this.A07 = r02;
        return r02;
    }

    public AnonymousClass1DS A0c() {
        AnonymousClass1DT r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A09 = r02;
        return r02;
    }

    public AnonymousClass1DS A0d() {
        AnonymousClass1DT r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0A = r02;
        return r02;
    }

    public AnonymousClass1DS A0e() {
        AnonymousClass1DT r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0B = r02;
        return r02;
    }

    public AnonymousClass1DS A0f() {
        AnonymousClass1DT r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0C = r02;
        return r02;
    }

    public AnonymousClass1DS A0g() {
        AnonymousClass1DT r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0D = r02;
        return r02;
    }

    public AnonymousClass1DS A0h() {
        AnonymousClass1DT r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0E = r02;
        return r02;
    }

    public AnonymousClass1DS A0i() {
        AnonymousClass1DT r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A0F = r02;
        return r02;
    }

    public AnonymousClass1DT A0j() {
        AnonymousClass1DT r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1DT r02 = new AnonymousClass1DT();
        this.A08 = r02;
        return r02;
    }

    public CharSequence A0k() {
        CharSequence charSequence = this.A0G;
        if (charSequence != null) {
            return charSequence;
        }
        C03320Hp r0 = this.A06;
        if (r0 == null) {
            return null;
        }
        CharSequence charSequence2 = r0.A01;
        if (charSequence2 == null) {
            return "";
        }
        return charSequence2;
    }

    public CharSequence A0l() {
        C03320Hp r0 = this.A06;
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public CharSequence A0m() {
        C03320Hp r0 = this.A06;
        if (r0 != null) {
            return r0.A03;
        }
        return null;
    }

    public Executor A0n() {
        Executor executor = this.A0H;
        if (executor == null) {
            return new C07050aH();
        }
        return executor;
    }

    public void A0q(int i) {
        AnonymousClass1DT r1 = this.A0C;
        if (r1 == null) {
            r1 = new AnonymousClass1DT();
            this.A0C = r1;
        }
        A00(r1, Integer.valueOf(i));
    }

    public void A0r(C03420Ia r2) {
        AnonymousClass1DT r0 = this.A08;
        if (r0 == null) {
            r0 = new AnonymousClass1DT();
            this.A08 = r0;
        }
        A00(r0, r2);
    }

    public void A0t(AnonymousClass0HL r2) {
        AnonymousClass1DT r0 = this.A0A;
        if (r0 == null) {
            r0 = new AnonymousClass1DT();
            this.A0A = r0;
        }
        A00(r0, r2);
    }

    public void A0w(CharSequence charSequence) {
        AnonymousClass1DT r0 = this.A09;
        if (r0 == null) {
            r0 = new AnonymousClass1DT();
            this.A09 = r0;
        }
        A00(r0, charSequence);
    }

    public void A0x(CharSequence charSequence) {
        AnonymousClass1DT r0 = this.A0B;
        if (r0 == null) {
            r0 = new AnonymousClass1DT();
            this.A0B = r0;
        }
        A00(r0, charSequence);
    }

    public void A10(boolean z) {
        AnonymousClass1DT r1 = this.A0D;
        if (r1 == null) {
            r1 = new AnonymousClass1DT();
            this.A0D = r1;
        }
        A00(r1, Boolean.valueOf(z));
    }

    public void A14(boolean z) {
        AnonymousClass1DT r1 = this.A0E;
        if (r1 == null) {
            r1 = new AnonymousClass1DT();
            this.A0E = r1;
        }
        A00(r1, Boolean.valueOf(z));
    }

    public void A17(boolean z) {
        AnonymousClass1DT r1 = this.A0F;
        if (r1 == null) {
            r1 = new AnonymousClass1DT();
            this.A0F = r1;
        }
        A00(r1, Boolean.valueOf(z));
    }

    public boolean A1A() {
        C03320Hp r0 = this.A06;
        if (r0 == null || r0.A04) {
            return true;
        }
        return false;
    }

    public static void A00(AnonymousClass1DT r2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.A0F(obj);
        } else {
            r2.A0E(obj);
        }
    }

    public int A0U() {
        return this.A00;
    }

    public int A0V() {
        return this.A01;
    }

    public int A0W() {
        int A0T = A0T();
        if ((A0T & 32767) == 0 || (A0T & 32768) != 0) {
            return -1;
        }
        return 2;
    }

    public AnonymousClass0PP A0a() {
        return this.A05;
    }

    public boolean A19() {
        return this.A0I;
    }

    public boolean A1B() {
        return this.A0J;
    }

    public boolean A1C() {
        return this.A0K;
    }

    public boolean A1D() {
        return this.A0L;
    }

    public boolean A1E() {
        return this.A0M;
    }

    public boolean A1F() {
        return this.A0N;
    }

    public void A0o(int i) {
        this.A00 = i;
    }

    public void A0p(int i) {
        this.A01 = i;
    }

    public void A0s(C02120Cu r1) {
        this.A04 = r1;
    }

    public void A0u(AnonymousClass0PP r1) {
        this.A05 = r1;
    }

    public void A0v(C03320Hp r1) {
        this.A06 = r1;
    }

    public void A0y(CharSequence charSequence) {
        this.A0G = charSequence;
    }

    public void A0z(Executor executor) {
        this.A0H = executor;
    }

    public void A11(boolean z) {
        this.A0I = z;
    }

    public void A12(boolean z) {
        this.A0J = z;
    }

    public void A13(boolean z) {
        this.A0K = z;
    }

    public void A15(boolean z) {
        this.A0L = z;
    }

    public void A16(boolean z) {
        this.A0M = z;
    }

    public void A18(boolean z) {
        this.A0N = z;
    }
}

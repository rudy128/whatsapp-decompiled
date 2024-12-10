package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A5E {
    public static A5E A0G;
    public static final C20382AIv A0H = new C20382AIv();
    public static final C197729xA A0I = new C197729xA();
    public AnonymousClass8QY A00 = null;
    public AnonymousClass8QZ A01 = null;
    public AnonymousClass8Qi A02 = null;
    public AnonymousClass8Qk A03 = null;
    public AnonymousClass8Qj A04 = null;
    public AnonymousClass8Qh A05 = null;
    public AnonymousClass8Ql A06 = null;
    public AnonymousClass8Qa A07 = null;
    public AnonymousClass8Qb A08 = null;
    public AnonymousClass8Qc A09 = null;
    public Map A0A = C17880vN.A11();
    public Map A0B = C17880vN.A11();
    public final List A0C = Collections.unmodifiableList(AnonymousClass9TB.A00);
    public final Set A0D = AnonymousClass9TC.A00;
    public final Map A0E = C17880vN.A11();
    public final Map A0F = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r2v2, types: [X.8Qd, X.8Qa] */
    public synchronized AnonymousClass8Qa A01() {
        AnonymousClass8Qa r2;
        AnonymousClass8Qj r3;
        synchronized (this) {
            AnonymousClass8Qa r22 = this.A07;
            r2 = r22;
            if (r22 == null) {
                if (this instanceof AnonymousClass8Qe) {
                    AnonymousClass8Qe r32 = (AnonymousClass8Qe) this;
                    A2W a2w = AnonymousClass8Qj.A01;
                    r3 = new AnonymousClass8Qj(A0I, A0H, r32.A01.A00());
                } else {
                    r3 = this.A04;
                    if (r3 == null) {
                        r3 = new AnonymousClass8Qj(A0I, A0H, AnonymousClass8Qj.A01);
                        this.A04 = r3;
                    }
                }
                ? r23 = new AnonymousClass8Qd(r3, this.A0C, this.A0D);
                this.A07 = r23;
                r2 = r23;
            }
        }
        return r2;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.8Qd, X.8Qb] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.8Qh, X.A8B] */
    public synchronized AnonymousClass8Qb A02() {
        AnonymousClass8Qb r3;
        synchronized (this) {
            AnonymousClass8Qb r32 = this.A08;
            r3 = r32;
            if (r32 == null) {
                AnonymousClass8Qh r2 = this.A05;
                AnonymousClass8Qh r22 = r2;
                if (r2 == null) {
                    ? a8b = new A8B(A0I, A0H);
                    this.A05 = a8b;
                    r22 = a8b;
                }
                ? r33 = new AnonymousClass8Qd(r22, this.A0C, this.A0D);
                this.A08 = r33;
                r3 = r33;
            }
        }
        return r3;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.8Qd, X.8Qc] */
    public synchronized AnonymousClass8Qc A03() {
        AnonymousClass8Qc r2;
        AnonymousClass8Ql r3;
        synchronized (this) {
            AnonymousClass8Qc r22 = this.A09;
            r2 = r22;
            if (r22 == null) {
                if (this instanceof AnonymousClass8Qe) {
                    r3 = new AnonymousClass8Ql(A0I, A0H, ((AnonymousClass8Qe) this).A01.A01());
                } else {
                    r3 = this.A06;
                    if (r3 == null) {
                        r3 = new AnonymousClass8Ql(A0I, A0H, C196409v0.A00());
                        this.A06 = r3;
                    }
                }
                ? r23 = new AnonymousClass8Qd(r3, this.A0C, this.A0D);
                this.A09 = r23;
                r2 = r23;
            }
        }
        return r2;
    }

    public static synchronized A5E A00() {
        A5E a5e;
        synchronized (A5E.class) {
            a5e = A0G;
            if (a5e == null) {
                a5e = new A5E();
                A0G = a5e;
            }
        }
        return a5e;
    }
}

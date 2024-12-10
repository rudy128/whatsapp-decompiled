package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.70W  reason: invalid class name */
public class AnonymousClass70W {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = -1;
    public long A0A = -1;
    public long A0B;
    public long A0C;
    public long A0D = -1;
    public long A0E = -1;
    public long A0F;
    public long A0G = -1;
    public C1409173o A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Exception A0M;
    public Float A0N;
    public Float A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public URL A0e;
    public boolean A0f;
    public boolean A0g;
    public long A0h;
    public long A0i = -1;
    public long A0j = -1;
    public long A0k;
    public final long A0l = SystemClock.elapsedRealtime();
    public final C26551So A0m;

    public AnonymousClass70W(C26551So r3, int i) {
        this.A0m = r3;
        this.A00 = i;
    }

    public final synchronized long A05() {
        return this.A0h;
    }

    public final synchronized long A06() {
        return this.A0k;
    }

    public final synchronized void A0B(long j, long j2) {
        this.A0k = j;
        this.A0h += j2;
    }

    public final long A01() {
        long j = this.A0A;
        if (j != -1) {
            long j2 = this.A0i;
            if (j2 != -1) {
                return j2;
            }
            if (this.A07 == -1) {
                return SystemClock.elapsedRealtime() - j;
            }
        }
        return 0;
    }

    public final long A02() {
        long j = this.A0A;
        if (j != -1) {
            long j2 = this.A0j;
            if (j2 != -1) {
                return j2;
            }
            if (this.A07 == -1) {
                return SystemClock.elapsedRealtime() - j;
            }
        }
        return 0;
    }

    public final long A03() {
        long j = this.A0A;
        if (j != -1) {
            long j2 = this.A0G;
            if (j2 != -1) {
                return j2;
            }
            if (this.A07 == -1) {
                return SystemClock.elapsedRealtime() - j;
            }
        }
        return 0;
    }

    public final long A04() {
        long j = this.A0A;
        if (j == -1) {
            return 0;
        }
        long j2 = this.A07;
        if (j2 == -1) {
            j2 = SystemClock.elapsedRealtime();
        }
        return j2 - j;
    }

    public final AnonymousClass64W A07() {
        int i;
        long j;
        String str;
        long j2;
        String str2;
        AnonymousClass64W r2 = new AnonymousClass64W();
        C1409173o r0 = this.A0H;
        if (r0 != null) {
            i = r0.A01;
        } else {
            i = -1;
        }
        int A002 = C1409973w.A00(i);
        r2.A0D = this.A0Q;
        if (!(A002 == 1 || A002 == 15)) {
            r2.A0l = this.A0a;
            r2.A0m = this.A0d;
            URL url = this.A0e;
            if (url != null) {
                str2 = url.toString();
            } else {
                str2 = null;
            }
            r2.A0n = str2;
        }
        r2.A08 = Double.valueOf((double) this.A0k);
        r2.A0Q = Long.valueOf(A01());
        r2.A0R = this.A0W;
        r2.A00 = this.A0I;
        r2.A01 = AnonymousClass000.A0h();
        r2.A0S = Long.valueOf(A02());
        r2.A0H = Integer.valueOf(this.A02);
        r2.A0h = Long.valueOf(this.A0F);
        r2.A0I = this.A0P;
        Long l = this.A0X;
        if (l != null) {
            r2.A0b = l;
        }
        r2.A0o = this.A0Z;
        r2.A0c = Long.valueOf(A04());
        long j3 = this.A0A;
        if (j3 == -1) {
            j = 0;
        } else {
            j = j3 - this.A0l;
        }
        r2.A0d = C17880vN.A0o(j, A04());
        URL url2 = this.A0e;
        if (url2 != null) {
            str = url2.getHost();
        } else {
            str = null;
        }
        r2.A0p = str;
        r2.A0L = Integer.valueOf(A002);
        r2.A06 = this.A0J;
        Long l2 = this.A0V;
        if (l2 == null) {
            l2 = Long.valueOf(this.A0k);
        }
        C18070vi.A0z(l2, "null cannot be cast to non-null type kotlin.Long");
        r2.A0C = Double.valueOf((double) l2.longValue());
        long j4 = this.A0A;
        if (j4 == -1) {
            j2 = 0;
        } else {
            j2 = j4 - this.A0l;
        }
        r2.A0g = Long.valueOf(j2);
        r2.A0i = Long.valueOf(A04());
        long j5 = this.A09;
        if (j5 == -1) {
            j5 = 0;
        }
        r2.A0T = Long.valueOf(j5);
        r2.A0U = Long.valueOf(A03());
        Float f = this.A0N;
        if (f != null) {
            float floatValue = f.floatValue();
            if (C108945cZ.A00(-1.0f, floatValue) > Float.MIN_VALUE) {
                r2.A09 = Double.valueOf((double) floatValue);
            }
        }
        r2.A0e = this.A0U;
        r2.A02 = Boolean.valueOf(this.A0f);
        r2.A0B = Double.valueOf((double) this.A0B);
        r2.A0V = Long.valueOf(this.A0C);
        r2.A0G = C1408173e.A02(this.A0c);
        r2.A0K = this.A0R;
        r2.A0M = this.A0T;
        Boolean bool = this.A0K;
        if (bool != null) {
            r2.A03 = bool;
        }
        return r2;
    }

    public final void A08() {
        long j = this.A0A;
        if (j != -1) {
            this.A0i = SystemClock.elapsedRealtime() - j;
            this.A03 = 1;
        }
    }

    public final void A09() {
        long j = this.A0D;
        if (j != -1) {
            this.A0U = C108945cZ.A1B(SystemClock.elapsedRealtime(), j);
        }
    }

    public final void A0A() {
        long j = this.A0A;
        if (j != -1) {
            this.A0j = SystemClock.elapsedRealtime() - j;
        }
    }

    public final void A0C(Exception exc) {
        Class<?> cls;
        if (exc instanceof C122836Sc) {
            Throwable cause = exc.getCause();
            if (cause == null) {
                cause = exc;
            }
            cls = cause.getClass();
        } else {
            if (exc != null) {
                cls = exc.getClass();
            }
            this.A0M = exc;
        }
        this.A0a = cls.getName();
        this.A0M = exc;
    }

    public static void A00(AnonymousClass70W r1, Exception exc, URL url) {
        r1.A0C(exc);
        r1.A0d = A7N.A01(url);
    }

    public final boolean A0D() {
        return AnonymousClass000.A1O((A01() > -1 ? 1 : (A01() == -1 ? 0 : -1)));
    }

    public String toString() {
        long j;
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("MMS type: ");
        A102.append(this.A0m);
        A102.append(' ');
        StringBuilder A0q = C108985cd.A0q(A102, A10);
        A0q.append("retry count: ");
        A0q.append(this.A0F);
        A0q.append(' ');
        StringBuilder A0q2 = C108985cd.A0q(A0q, A10);
        A0q2.append("network stack: ");
        A0q2.append(this.A02);
        A0q2.append(' ');
        StringBuilder A0q3 = C108985cd.A0q(A0q2, A10);
        A0q3.append("connection type: ");
        A0q3.append(this.A0Q);
        A0q3.append(' ');
        StringBuilder A0q4 = C108985cd.A0q(A0q3, A10);
        A0q4.append("connection class: ");
        A0q4.append(this.A0Z);
        A0q4.append(' ');
        StringBuilder A0q5 = C108985cd.A0q(A0q4, A10);
        A0q5.append("url: ");
        A0q5.append(this.A0e);
        StringBuilder A0q6 = C108985cd.A0q(A0q5, A10);
        A0q6.append("download time: ");
        A0q6.append(A04());
        StringBuilder A0q7 = C108985cd.A0q(A0q6, A10);
        A0q7.append("queue time: ");
        long j2 = this.A0A;
        if (j2 == -1) {
            j = 0;
        } else {
            j = j2 - this.A0l;
        }
        A0q7.append(j);
        StringBuilder A0q8 = C108985cd.A0q(A0q7, A10);
        A0q8.append("connection time: ");
        A0q8.append(A01());
        StringBuilder A0q9 = C108985cd.A0q(A0q8, A10);
        A0q9.append("route selection delay: ");
        A0q9.append(this.A0X);
        StringBuilder A0q10 = C108985cd.A0q(A0q9, A10);
        A0q10.append("network time: ");
        A0q10.append(A02());
        StringBuilder A0q11 = C108985cd.A0q(A0q10, A10);
        A0q11.append("connection reused: ");
        A0q11.append(this.A0I);
        StringBuilder A0q12 = C108985cd.A0q(A0q11, A10);
        A0q12.append("response code: ");
        A0q12.append(this.A0W);
        StringBuilder A0q13 = C108985cd.A0q(A0q12, A10);
        A0q13.append("total bytes transferred: ");
        A0q13.append(this.A0k);
        StringBuilder A0q14 = C108985cd.A0q(A0q13, A10);
        A0q14.append("media ip: ");
        A0q14.append(this.A0d);
        StringBuilder A0q15 = C108985cd.A0q(A0q14, A10);
        A0q15.append("exception: ");
        A0q15.append(this.A0a);
        StringBuilder A0q16 = C108985cd.A0q(A0q15, A10);
        A0q16.append("download stage: ");
        A0q16.append(this.A03);
        StringBuilder A0q17 = C108985cd.A0q(A0q16, A10);
        A0q17.append("download resume point: ");
        long j3 = this.A09;
        if (j3 == -1) {
            j3 = 0;
        }
        String A0y = AnonymousClass000.A0y(C17880vN.A0u(A0q17, j3), A10);
        C18070vi.A0X(A0y);
        return A0y;
    }
}

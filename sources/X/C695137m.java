package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.37m  reason: invalid class name and case insensitive filesystem */
public final class C695137m implements AnonymousClass19X {
    public final AnonymousClass19A A00;
    public final AnonymousClass19O A01;
    public final AnonymousClass19T A02;
    public final AnonymousClass19T A03;
    public final C48562My A04;
    public final C30071dL A05;
    public final C20104A7i A06;

    public void CKw(int i, int i2, String str) {
        this.A03.CKw(i, i2, str);
    }

    public void CKx(int i, String str) {
        this.A03.CKx(i, str);
    }

    public void markerEnd(int i, short s) {
        this.A03.markerEnd(i, s);
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        this.A03.markerPoint(i, i2, str, str2);
    }

    public void markerStart(int i) {
        AnonymousClass19T r0;
        int i2 = C20104A7i.A00(this.A06, i).A00;
        if (i2 == 1) {
            r0 = this.A03;
        } else if (i2 == 2) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.markerStart(i);
    }

    public C695137m(AnonymousClass19Y r1, AnonymousClass19A r2, AnonymousClass19O r3, AnonymousClass19T r4, C48562My r5, C30071dL r6, C20104A7i a7i) {
        C18070vi.A0w(r6, r2, r3, r4, a7i);
        C18070vi.A0l(r5, r1);
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = a7i;
        this.A02 = r1;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        C18070vi.A0d(str, 2);
        this.A03.markerAnnotate(i, i2, str, d);
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        C18070vi.A0d(str, 2);
        this.A03.markerAnnotate(i, i2, str, i3);
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        C18070vi.A0d(str, 2);
        this.A03.markerAnnotate(i, i2, str, j);
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        C18070vi.A0k(str, str2);
        this.A03.markerAnnotate(i, i2, str, str2);
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        C18070vi.A0d(str, 2);
        this.A03.markerAnnotate(i, i2, str, z);
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        C18070vi.A0k(str, dArr);
        this.A03.markerAnnotate(i, i2, str, dArr);
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        C18070vi.A0k(str, iArr);
        this.A03.markerAnnotate(i, i2, str, iArr);
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        C18070vi.A0k(str, jArr);
        this.A03.markerAnnotate(i, i2, str, jArr);
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        C18070vi.A0k(str, strArr);
        this.A03.markerAnnotate(i, i2, str, strArr);
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        C18070vi.A0k(str, zArr);
        this.A03.markerAnnotate(i, i2, str, zArr);
    }

    public void markerAnnotate(int i, String str, double d) {
        C18070vi.A0d(str, 1);
        this.A03.markerAnnotate(i, str, d);
    }

    public void markerAnnotate(int i, String str, int i2) {
        C18070vi.A0d(str, 1);
        this.A03.markerAnnotate(i, str, i2);
    }

    public void markerAnnotate(int i, String str, long j) {
        C18070vi.A0d(str, 1);
        this.A03.markerAnnotate(i, str, j);
    }

    public void markerAnnotate(int i, String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A03.markerAnnotate(i, str, str2);
    }

    public void markerAnnotate(int i, String str, boolean z) {
        C18070vi.A0d(str, 1);
        this.A03.markerAnnotate(i, str, z);
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        C18070vi.A0j(str, dArr);
        this.A03.markerAnnotate(i, str, dArr);
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        C18070vi.A0j(str, iArr);
        this.A03.markerAnnotate(i, str, iArr);
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        C18070vi.A0j(str, jArr);
        this.A03.markerAnnotate(i, str, jArr);
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        C18070vi.A0j(str, strArr);
        this.A03.markerAnnotate(i, str, strArr);
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        C18070vi.A0j(str, zArr);
        this.A03.markerAnnotate(i, str, zArr);
    }

    public void markerEnd(int i, int i2, short s) {
        this.A03.markerEnd(i, i2, s);
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        C18070vi.A0d(timeUnit, 4);
        this.A03.markerPoint(i, str, str2, j, timeUnit);
    }

    public void markerStart(int i, int i2) {
        AnonymousClass19T r0;
        int i3 = C20104A7i.A00(this.A06, i).A00;
        if (i3 == 1) {
            r0 = this.A03;
        } else if (i3 == 2) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.markerStart(i, i2);
    }

    public void markerPoint(int i, String str, String str2) {
        this.A03.markerPoint(i, str, str2);
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        this.A03.markerPoint(i, i2, str, str2, j, timeUnit);
    }
}

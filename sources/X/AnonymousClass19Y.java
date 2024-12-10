package X;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19Y  reason: invalid class name */
public class AnonymousClass19Y implements AnonymousClass19T, AnonymousClass19X {
    public final C18030ve A00;
    public final AnonymousClass19T A01;
    public volatile Boolean A02;

    public boolean A00() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(C18020vd.A05(C18040vf.A02, this.A00, 433));
                }
            }
        }
        return Boolean.TRUE.equals(this.A02);
    }

    public void BK8() {
        this.A01.BK8();
    }

    public Collection BMt() {
        return this.A01.BMt();
    }

    public boolean Bcc() {
        return this.A01.Bcc();
    }

    public boolean BfT(int i) {
        return this.A01.BfT(i);
    }

    public boolean Biy() {
        return this.A01.Biy();
    }

    public Long CBL() {
        return this.A01.CBL();
    }

    public Integer CBM() {
        return this.A01.CBM();
    }

    public String CBo() {
        return this.A01.CBo();
    }

    public void CGw() {
        this.A01.CGw();
    }

    public void CSP() {
        this.A01.CSP();
    }

    public long currentMonotonicTimestampNanos() {
        return this.A01.currentMonotonicTimestampNanos();
    }

    public void endAllInstancesOfMarker(int i, short s) {
        this.A01.endAllInstancesOfMarker(i, s);
    }

    public void endAllMarkers(short s, boolean z) {
        this.A01.endAllMarkers(s, z);
    }

    public boolean isMarkerOn(int i, int i2) {
        return this.A01.isMarkerOn(i, i2);
    }

    public void markerDrop(int i) {
        this.A01.markerDrop(i);
    }

    public AnonymousClass19Y(C18030ve r1, AnonymousClass19T r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bit(AnonymousClass1Bh r2, int i) {
        if (!A00()) {
            this.A01.Bit(r2, i);
        }
    }

    public void Biv(int i, int i2, short s, String str) {
        if (!A00()) {
            this.A01.Biv(i, i2, s, str);
        }
    }

    public void Biw(String str, short s) {
        if (!A00()) {
            this.A01.Biw(str, s);
        }
    }

    public void Bj1(int i, int i2, boolean z) {
        if (!A00()) {
            this.A01.Bj1(i, i2, z);
        }
    }

    public void Bj2(int i, boolean z) {
        if (!A00()) {
            this.A01.Bj2(i, z);
        }
    }

    public void Bj3(C30371dp r2) {
        if (!A00()) {
            this.A01.Bj3(r2);
        }
    }

    public void Bj4(String str, String str2, int i, int i2, boolean z) {
        if (!A00()) {
            this.A01.Bj4(str, str2, i, i2, z);
        }
    }

    public void CKw(int i, int i2, String str) {
        if (!A00()) {
            this.A01.CKw(i, i2, str);
        }
    }

    public void CKx(int i, String str) {
        if (!A00()) {
            this.A01.CKx(i, str);
        }
    }

    public void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerEnd(i, s, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, str, j, timeUnit);
        }
    }

    public void markerStart(int i) {
        if (!A00()) {
            this.A01.markerStart(i);
        }
    }

    public void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerStartWithCancelPolicy(i, z, i2, j, timeUnit);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double d) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, d);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int i3) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, i3);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long j) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, j);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String str2) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, str2);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean z) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, z);
        }
    }

    public void markerAnnotate(int i, int i2, String str, double[] dArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, dArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, int[] iArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, iArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, long[] jArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, jArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, String[] strArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, strArr);
        }
    }

    public void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, i2, str, zArr);
        }
    }

    public void markerAnnotate(int i, String str, double d) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, d);
        }
    }

    public void markerAnnotate(int i, String str, int i2) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, i2);
        }
    }

    public void markerAnnotate(int i, String str, long j) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, j);
        }
    }

    public void markerAnnotate(int i, String str, String str2) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, str2);
        }
    }

    public void markerAnnotate(int i, String str, boolean z) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, z);
        }
    }

    public void markerAnnotate(int i, String str, double[] dArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, dArr);
        }
    }

    public void markerAnnotate(int i, String str, int[] iArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, iArr);
        }
    }

    public void markerAnnotate(int i, String str, long[] jArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, jArr);
        }
    }

    public void markerAnnotate(int i, String str, String[] strArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, strArr);
        }
    }

    public void markerAnnotate(int i, String str, boolean[] zArr) {
        if (!A00()) {
            this.A01.markerAnnotate(i, str, zArr);
        }
    }

    public void markerDrop(int i, int i2) {
        if (!A00()) {
            this.A01.markerDrop(i, i2);
        }
    }

    public void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerEnd(i, i2, s, j, timeUnit);
        }
    }

    public void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str, j, timeUnit);
        }
    }

    public void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerStart(i, str, str2, j, timeUnit);
        }
    }

    public void markerEnd(int i, int i2, short s) {
        if (!A00()) {
            this.A01.markerEnd(i, i2, s);
        }
    }

    public void markerPoint(int i, int i2, String str) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str);
        }
    }

    public void markerStart(int i, String str, String str2) {
        if (!A00()) {
            this.A01.markerStart(i, str, str2);
        }
    }

    public void markerEnd(int i, short s) {
        if (!A00()) {
            this.A01.markerEnd(i, s);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str, str2);
        }
    }

    public void markerStart(int i, int i2, String str, String str2) {
        if (!A00()) {
            this.A01.markerStart(i, i2, str, str2);
        }
    }

    public void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerStart(i, i2, str, str2, j, timeUnit);
        }
    }

    public void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        if (!A00()) {
            this.A01.markerPoint(i, str, str2, j, timeUnit);
        }
    }

    public void markerStart(int i, int i2) {
        if (!A00()) {
            this.A01.markerStart(i, i2);
        }
    }

    public void markerPoint(int i, String str, String str2) {
        if (!A00()) {
            this.A01.markerPoint(i, str, str2);
        }
    }

    public void markerPoint(int i, String str) {
        if (!A00()) {
            this.A01.markerPoint(i, str);
        }
    }
}

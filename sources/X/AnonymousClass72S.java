package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import java.io.File;

/* renamed from: X.72S  reason: invalid class name */
public class AnonymousClass72S {
    public int A00;
    public int A01;
    public long A02;
    public Point A03;
    public Rect A04;
    public C26052CrM A05;
    public C134926rN A06;
    public C1405471x A07;
    public File A08;
    public File A09;
    public File A0A;
    public File A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public Point A0S;
    public RectF A0T;
    public File A0U;
    public String A0V;
    public String A0W;
    public final Uri A0X;

    public AnonymousClass72S(Uri uri) {
        C18070vi.A0d(uri, 1);
        this.A0X = uri;
    }

    public final synchronized int A01() {
        return this.A00;
    }

    public final synchronized int A02() {
        return this.A01;
    }

    public final synchronized Point A03() {
        return this.A0S;
    }

    public final synchronized Point A04() {
        return this.A03;
    }

    public final synchronized Rect A05() {
        return this.A04;
    }

    public final synchronized RectF A06() {
        return this.A0T;
    }

    public final synchronized C1405471x A07() {
        return this.A07;
    }

    public final synchronized File A08() {
        return this.A08;
    }

    public final synchronized File A09() {
        File file;
        file = this.A08;
        if (file == null) {
            file = this.A0U;
        }
        return file;
    }

    public final synchronized File A0A() {
        return this.A09;
    }

    public final synchronized File A0B() {
        return this.A0A;
    }

    public final synchronized File A0C() {
        return this.A0U;
    }

    public final synchronized Integer A0D() {
        return this.A0F;
    }

    public final synchronized String A0E() {
        return this.A0V;
    }

    public final synchronized String A0F() {
        return this.A0G;
    }

    public final synchronized String A0G() {
        return this.A0W;
    }

    public final synchronized String A0H() {
        StringBuilder A10;
        Object[] objArr;
        A10 = AnonymousClass000.A10();
        A10.append("MPI-");
        objArr = new Object[24];
        objArr[0] = this.A0X;
        objArr[1] = this.A0F;
        objArr[2] = this.A0U;
        objArr[3] = this.A0V;
        objArr[4] = this.A0T;
        objArr[5] = this.A0G;
        objArr[6] = this.A09;
        objArr[7] = this.A0I;
        objArr[8] = this.A0A;
        objArr[9] = this.A08;
        objArr[10] = this.A04;
        objArr[11] = this.A0S;
        objArr[12] = this.A03;
        objArr[13] = this.A07;
        objArr[14] = Integer.valueOf(this.A01);
        objArr[15] = Boolean.valueOf(this.A0P);
        objArr[16] = Boolean.valueOf(this.A0Q);
        Boolean valueOf = Boolean.valueOf(this.A0N);
        objArr[17] = valueOf;
        objArr[18] = Integer.valueOf(this.A00);
        objArr[19] = Boolean.valueOf(this.A0K);
        objArr[20] = valueOf;
        objArr[21] = this.A05;
        objArr[22] = this.A0H;
        return C17880vN.A0t(A10, AnonymousClass000.A0P(this.A06, objArr, 23));
    }

    public final synchronized void A0I() {
        this.A0R = true;
    }

    public final synchronized void A0J(int i) {
        this.A00 = i;
    }

    public final synchronized void A0K(Point point) {
        this.A0S = point;
    }

    public final synchronized void A0L(Point point) {
        this.A03 = point;
    }

    public final synchronized void A0M(RectF rectF) {
        this.A0T = rectF;
    }

    public final synchronized void A0N(File file) {
        this.A0U = file;
    }

    public final synchronized void A0O(Integer num) {
        this.A0F = num;
    }

    public final synchronized void A0P(String str) {
        this.A0V = str;
    }

    public final synchronized void A0Q(String str) {
        this.A0G = str;
    }

    public final synchronized void A0R(String str) {
        this.A0I = str;
    }

    public final synchronized void A0S(String str) {
        this.A0W = str;
    }

    public final synchronized void A0T(boolean z) {
        this.A0M = z;
    }

    public final synchronized boolean A0U() {
        return this.A0N;
    }

    public final synchronized boolean A0V() {
        return this.A0O;
    }

    public final synchronized boolean A0W() {
        return this.A0P;
    }

    public final synchronized boolean A0X() {
        return this.A0Q;
    }

    public static int A00(AnonymousClass72S r2, C34501ka r3) {
        int A012 = r3.A01(r2);
        r2.A0O(Integer.valueOf(A012));
        return A012;
    }

    public AnonymousClass72S(Uri uri, AnonymousClass72S r3) {
        C18070vi.A0d(uri, 1);
        this.A0X = uri;
        this.A0F = r3.A0F;
        this.A0U = r3.A0U;
        this.A0V = r3.A0V;
        this.A0W = r3.A0W;
        this.A0T = r3.A0T;
        this.A0G = r3.A0G;
        this.A09 = r3.A09;
        this.A0I = r3.A0I;
        this.A0A = r3.A0A;
        this.A08 = r3.A08;
        this.A04 = r3.A04;
        this.A0S = r3.A0S;
        this.A03 = r3.A03;
        this.A07 = r3.A07;
        this.A01 = r3.A01;
        this.A0P = r3.A0P;
        this.A0Q = r3.A0Q;
        this.A0N = r3.A0N;
        this.A00 = r3.A00;
        this.A0K = r3.A0K;
        this.A05 = r3.A05;
        this.A0H = r3.A0H;
        this.A06 = r3.A06;
    }
}

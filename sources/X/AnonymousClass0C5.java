package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.0C5  reason: invalid class name */
public abstract class AnonymousClass0C5 extends C05050Qf implements C17110tl {
    public static final C16890tO A08 = new AnonymousClass0YQ();
    public static final C16890tO A09 = new AnonymousClass0YR();
    public static final C16890tO A0A = new AnonymousClass0YS();
    public static final C16890tO A0B = new AnonymousClass0YO();
    public int A00 = -1;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public View.OnClickListener A04;
    public boolean A05 = true;
    public boolean A06;
    public final long A07;

    public AnonymousClass0C5(long j) {
        super(AnonymousClass00R.A01);
        this.A07 = j;
        AnonymousClass0Ij[] r3 = {new AnonymousClass0Ij(A08, this), new AnonymousClass0Ij(A09, this), new AnonymousClass0Ij(A0B, this), new AnonymousClass0Ij(A0A, this)};
        int i = 0;
        do {
            A0L(r3[i]);
            i++;
        } while (i < 4);
    }

    public long A0C() {
        return this.A07;
    }

    public C17110tl A0D() {
        return this;
    }

    public /* synthetic */ C22821Di BVg() {
        return null;
    }

    public /* synthetic */ Class BXG() {
        return getClass();
    }

    public /* synthetic */ AnonymousClass0HX BXH() {
        return AnonymousClass0C0.A00;
    }
}

package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;

/* renamed from: X.0C6  reason: invalid class name */
public final class AnonymousClass0C6 extends C05050Qf implements C17110tl {
    public static final AnonymousClass0P6 A0C = new Object();
    public static final AnonymousClass0YT A0D = new AnonymousClass0YT();
    public static final AnonymousClass0YN A0E = new AnonymousClass0YN();
    public static final AnonymousClass0YP A0F = new AnonymousClass0YP();
    public Rect A00;
    public C26738DBr A01;
    public final D4B A02;
    public final C28604E9v A03;
    public final C22825BRd A04;
    public final E13 A05;
    public final Object A06;
    public final boolean A07;
    public final long A08;
    public final E12 A09;
    public final C17110tl A0A;
    public final String A0B = "bloks";

    /* renamed from: A0M */
    public ImageView BHD(Context context) {
        C18070vi.A0d(context, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(C25869Cnd.A00().A04());
        return imageView;
    }

    public AnonymousClass0C6(D4B d4b, E12 e12, C28604E9v e9v, C22825BRd bRd, E13 e13, Object obj, long j, boolean z) {
        super(AnonymousClass00R.A01);
        this.A08 = j;
        this.A05 = e13;
        this.A03 = e9v;
        this.A09 = e12;
        this.A04 = bRd;
        this.A07 = z;
        this.A06 = obj;
        this.A02 = d4b;
        A0L(new AnonymousClass0Ij(A0E, this));
        A0L(new AnonymousClass0Ij(A0F, this));
        A0K(new AnonymousClass0Ij(A0D, this));
        this.A0A = this;
    }

    public static final boolean A03(AnonymousClass0C6 r2, AnonymousClass0C6 r3) {
        if (!C18070vi.A18(r2.A05, r3.A05) || !C18070vi.A18(r2.A04, r3.A04) || r2.A07 != r3.A07 || !C18070vi.A18(r2.A03, r3.A03) || !C18070vi.A18(r2.A09, r3.A09)) {
            return true;
        }
        return false;
    }

    public long A0C() {
        return this.A08;
    }

    public C17110tl A0D() {
        return this.A0A;
    }

    public final E13 A0N() {
        return this.A05;
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

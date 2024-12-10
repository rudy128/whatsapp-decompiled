package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: X.1zE  reason: invalid class name and case insensitive filesystem */
public final class C43081zE {
    public static final PorterDuffXfermode A0S = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public static final C18100vl A0T = new C18110vm(new AnonymousClass3Di(6));
    public BitmapDrawable A00;
    public ImageView.ScaleType A01 = ImageView.ScaleType.CENTER_CROP;
    public C39201sg A02;
    public C39191sf A03;
    public C43141zK A04;
    public C39221si A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final Path A09 = new Path();
    public final Path A0A = new Path();
    public final Path A0B = new Path();
    public final Rect A0C = new Rect();
    public final RectF A0D = new RectF();
    public final RectF A0E = new RectF();
    public final RectF A0F = new RectF();
    public final RectF A0G = new RectF();
    public final RectF A0H = new RectF();
    public final RectF A0I = new RectF();
    public final C18000vb A0J;
    public final C18030ve A0K;
    public final C43101zG A0L;
    public final C18100vl A0M = new C18110vm(new AnonymousClass3Di(7));
    public final C18100vl A0N = new C18110vm(new AnonymousClass3Di(8));
    public final C18100vl A0O = new C18110vm(new AnonymousClass3Di(5));
    public final C18100vl A0P = new C18110vm(new AnonymousClass3Di(9));
    public final C18100vl A0Q = new C18110vm(new C71013Dl(this, 21));
    public final C18100vl A0R = new C18110vm(new C71013Dl(this, 22));

    public static final void A00(C43081zE r4) {
        C18100vl r2 = r4.A0R;
        ((Paint) r2.getValue()).setStrokeWidth(r4.A04.A01);
        C39221si r1 = r4.A05;
        if (r1 instanceof C39231sj) {
            ((Paint) r2.getValue()).setColor(C43511zv.A00(r4.A08, r4.A0K, ((C39231sj) r1).A00));
        }
    }

    public C43081zE(Context context, C18000vb r4, C18030ve r5, C43101zG r6, C39201sg r7, C39191sf r8, boolean z) {
        this.A08 = context;
        this.A0J = r4;
        this.A0K = r5;
        this.A07 = z;
        this.A03 = r8;
        this.A02 = r7;
        this.A0L = r6;
        this.A04 = C43121zI.A00(context, C43111zH.A02(this.A03));
        this.A05 = new C39231sj(C39211sh.UNSEEN);
    }
}

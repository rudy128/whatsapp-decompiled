package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.expressionstray.expression.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.6nk  reason: invalid class name and case insensitive filesystem */
public final class C132866nk {
    public AnonymousClass1OX A00;
    public final Context A01;
    public final AnonymousClass10I A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C150457ki(this));
    public final C18600wl A04;
    public final HashMap A05 = C17880vN.A11();

    public C132866nk(Context context, AnonymousClass10I r3, C18600wl r4) {
        C72473Md.A1I(r3, r4);
        this.A02 = r3;
        this.A01 = context;
        this.A04 = r4;
    }

    public final void A00(ImageView imageView, C1417976z r8, C1409773u r9, boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("shape_");
        C134326qP r4 = new C134326qP(C17880vN.A0t(A10, r9.hashCode()));
        if (!C18070vi.A18(imageView.getTag(), r4)) {
            imageView.setImageDrawable((Drawable) null);
        }
        imageView.setTag(r4);
        HashMap hashMap = this.A05;
        AnonymousClass1OB r0 = (AnonymousClass1OB) hashMap.remove(r4);
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        if (r9.A0S() && r8 != null) {
            r9.A0K(r8.A01);
        }
        if (r9.A0T() && r8 != null) {
            r9.A0J(r8.A00 / 2.0f);
        }
        C135756si r2 = new C135756si(imageView, r4, r9, z);
        AnonymousClass1OX r1 = this.A00;
        if (r1 == null) {
            Executor executor = (Executor) this.A03.getValue();
            C18070vi.A0X(executor);
            r1 = C108995ce.A0f(new C23791Hq(executor));
            this.A00 = r1;
        }
        hashMap.put(r4, AnonymousClass3MY.A0s(new ShapeImageViewLoader$loadShape$job$1(r2, this, (C30391dr) null), r1));
    }
}

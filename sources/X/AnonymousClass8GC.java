package X;

import android.os.Build;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8GC  reason: invalid class name */
public final class AnonymousClass8GC extends AnonymousClass1J2 {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07;
    public final AnonymousClass1DT A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass1DT A0A;
    public final AnonymousClass1DT A0B;
    public final AnonymousClass11S A0C;
    public final C192829p3 A0D;
    public final C196149uX A0E;
    public final C185479ce A0F;
    public final C20114A7x A0G;
    public final A41 A0H;
    public final C20485AMw A0I;
    public final AnonymousClass11E A0J;
    public final C24921Me A0K;
    public final UserJid A0L;
    public final AnonymousClass10I A0M;
    public final AnonymousClass00H A0N;
    public final AtomicBoolean A0O;
    public final C196469v7 A0P;
    public final AnonymousClass2UJ A0Q;

    public AnonymousClass8GC(AnonymousClass11S r6, C192829p3 r7, C196149uX r8, C196469v7 r9, C185479ce r10, C20114A7x a7x, A41 a41, C20485AMw aMw, AnonymousClass11E r14, C24921Me r15, UserJid userJid, AnonymousClass2UJ r17, AnonymousClass10I r18, AnonymousClass00H r19, int i) {
        C18070vi.A0g(r7, 4, aMw);
        this.A0C = r6;
        this.A0L = userJid;
        this.A0K = r15;
        this.A0D = r7;
        this.A0I = aMw;
        this.A0J = r14;
        this.A02 = i;
        this.A0Q = r17;
        this.A0E = r8;
        this.A0H = a41;
        this.A0P = r9;
        this.A0F = r10;
        this.A0M = r18;
        this.A0N = r19;
        this.A0G = a7x;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A07 = A0L2;
        this.A0O = C108965cb.A0w();
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A0A = A0L3;
        AnonymousClass1DT A0L4 = AnonymousClass3MW.A0L();
        this.A09 = A0L4;
        AnonymousClass1DT A0L5 = AnonymousClass3MW.A0L();
        this.A04 = A0L5;
        this.A08 = AnonymousClass3MW.A0L();
        this.A03 = AnonymousClass3MW.A0L();
        this.A0B = AnonymousClass3MW.A0L();
        r7.A00 = A0L2;
        r7.A02 = A0L3;
        aMw.A00 = A0L5;
        r7.A01 = A0L4;
    }

    public final void A0T(ProductDetailActivity productDetailActivity) {
        if (productDetailActivity.getIntent().getBooleanExtra("is_from_product_detail_screen", false)) {
            if (Build.VERSION.SDK_INT < 29) {
                productDetailActivity.onStateNotSaved();
            }
            AnonymousClass3MY.A1L(this.A06, true);
            return;
        }
        productDetailActivity.onBackPressed();
    }

    public static boolean A00(C168648jP r4) {
        AEJ aej;
        r4.A4d();
        int i = r4.A01;
        C20287AEv aEv = r4.A0K;
        if (aEv == null || !aEv.A0K) {
            return false;
        }
        if ((i == 0 || i == 4) && !aEv.A02() && (aej = aEv.A03) != null && aej.A00 == 0 && !aEv.A0C) {
            return true;
        }
        return false;
    }
}

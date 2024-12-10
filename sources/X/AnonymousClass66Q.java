package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.66Q  reason: invalid class name */
public final class AnonymousClass66Q extends AnonymousClass65s {
    public WaImageView A00;
    public AnonymousClass77J A01;
    public C129706iE A02;
    public A34 A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final C18030ve A06;
    public final AnonymousClass18K A07;
    public final AnonymousClass736 A08;
    public final AnonymousClass87C A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass66Q(ViewGroup viewGroup, AnonymousClass11C r7, C18030ve r8, AnonymousClass18K r9, AnonymousClass736 r10, AnonymousClass87C r11, C18010vc r12) {
        super(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625452, false));
        C18070vi.A0d(r11, 7);
        this.A06 = r8;
        this.A08 = r10;
        this.A07 = r9;
        this.A09 = r11;
        View view = this.A0H;
        this.A05 = C108975cc.A0B(view, 2131436134);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass3MX.A0C(view, 2131436766);
        this.A04 = viewGroup2;
        if (C24191Jf.A01(r7, r12) >= 2012) {
            C129706iE r0 = new C129706iE(AnonymousClass3MY.A04(view));
            this.A02 = r0;
            viewGroup2.addView(r0.A02, new FrameLayout.LayoutParams(-1, -1));
            this.A00 = AnonymousClass3MW.A0R(viewGroup2, 2131431117);
            viewGroup2.setVisibility(0);
        }
    }

    public void A0B() {
        AnonymousClass893 r13;
        AnonymousClass77C r0;
        AnonymousClass77J r6 = this.A01;
        if (r6 == null) {
            ImageView imageView = this.A05;
            imageView.setOnClickListener((View.OnClickListener) null);
            this.A04.setOnClickListener((View.OnClickListener) null);
            imageView.setVisibility(8);
            return;
        }
        AnonymousClass6LF r7 = new AnonymousClass6LF(r6, this, 6);
        C18030ve r1 = this.A06;
        C18070vi.A0d(r1, 0);
        if (C25291Nq.A04(r1, 9452)) {
            C1421578j r12 = new C1421578j(this, r6, 9);
            this.A05.setOnLongClickListener(r12);
            this.A04.setOnLongClickListener(r12);
        }
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            AnonymousClass77C r14 = r6.A01;
            if (r14.A02 > 0) {
                r0 = r14;
            } else {
                r0 = r6.A02;
            }
            int i = r0.A02;
            if (r14.A00 <= 0) {
                r14 = r6.A02;
            }
            int i2 = r14.A00;
            if (i == 0 || i2 == 0) {
                i = 1;
                i2 = 1;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("h,");
            A10.append(i);
            A10.append(':');
            String A0t = C17880vN.A0t(A10, i2);
            C39151sZ r02 = (C39151sZ) C108965cb.A0A(waImageView);
            r02.A0t = A0t;
            waImageView.setLayoutParams(r02);
        }
        ImageView imageView2 = this.A05;
        imageView2.setOnClickListener(r7);
        ViewGroup viewGroup = this.A04;
        viewGroup.setOnClickListener(r7);
        String str = r6.A04;
        if (str == null || str.length() == 0) {
            str = viewGroup.getContext().getString(2131890772);
        }
        viewGroup.setContentDescription(str);
        imageView2.setVisibility(0);
        C108955ca.A1L(imageView2, 13421772);
        if (this.A02 == null) {
            this.A08.A02(imageView2, r6.A03.A03);
            return;
        }
        String str2 = r6.A02.A03;
        AnonymousClass736 r15 = this.A08;
        C144507Ho r122 = new C144507Ho(this, str2);
        C17960vV.A02();
        if (r15.A0H) {
            r13 = (AnonymousClass893) r15.A0F.get();
        } else {
            AnonymousClass893 r132 = r15.A00;
            r13 = r132;
            if (r132 == null) {
                AnonymousClass6L3 A002 = r15.A04.A00("gif_preview_obj_store", 256);
                r15.A00 = A002;
                r13 = A002;
            }
        }
        AnonymousClass118 r10 = r15.A0A;
        AnonymousClass11P r9 = r15.A09;
        C18030ve r11 = r15.A0B;
        AnonymousClass66M r5 = new AnonymousClass66M(r15.A03, r15.A07, r15.A08, r9, r10, r11, r122, r13, r15.A0D, r15.A0G, str2);
        r5.A02.executeOnExecutor(AnonymousClass736.A01(r15), new Void[0]);
        this.A03 = r5;
    }

    public void A0C() {
        A34 a34 = this.A03;
        if (a34 != null) {
            a34.A0B(false);
        }
        this.A03 = null;
        C129706iE r1 = this.A02;
        if (r1 != null) {
            BFF bff = r1.A00;
            if (bff != null) {
                bff.stop();
            }
            r1.A00 = null;
            DRK drk = r1.A01;
            if (drk != null) {
                drk.close();
            }
            r1.A01 = null;
            r1.A03.setImageDrawable((Drawable) null);
        }
    }
}

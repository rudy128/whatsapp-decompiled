package X;

import android.widget.ImageView;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;

/* renamed from: X.6oq  reason: invalid class name and case insensitive filesystem */
public final class C133486oq {
    public final C18030ve A00;
    public final C18140vp A01;

    public final AnonymousClass7C7 A00(C136336te r8, boolean z) {
        if (C72473Md.A1Z(this.A01)) {
            boolean z2 = r8.A04;
            long j = r8.A02;
            C122636Rd r6 = C122636Rd.A0B;
            int i = 2131892437;
            if (z2) {
                i = 2131892438;
            }
            AnonymousClass720 r2 = new AnonymousClass720(r6, C72453Mb.A0q(i), (AnonymousClass4ZN) null, 0);
            AnonymousClass720.A01(r2, 2131233496, 2131103398);
            r2.A05 = Long.valueOf(j);
            return r2.A02();
        }
        C122636Rd r3 = C122636Rd.A0B;
        AnonymousClass6IR A0t = AnonymousClass3MX.A0t(2131892435);
        AnonymousClass6IR r0 = null;
        if (r8.A04) {
            r0 = AnonymousClass3MX.A0t(2131892433);
        }
        AnonymousClass720 A03 = InCallBannerViewModel.A03(r3, A0t, r0, z);
        C95784mn r1 = new C95784mn(2131233375);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        A03.A02 = r1;
        A03.A01 = scaleType;
        A03.A05 = C17880vN.A0n(C18020vd.A00(C18040vf.A02, this.A00, 5874));
        return A03.A02();
    }

    public final AnonymousClass7C7 A01(C136336te r6, boolean z) {
        if (C72473Md.A1Z(this.A01)) {
            C122636Rd r4 = C122636Rd.A0D;
            int i = 2131892437;
            if (r6.A04) {
                i = 2131892438;
            }
            AnonymousClass720 r2 = new AnonymousClass720(r4, C72453Mb.A0q(i), (AnonymousClass4ZN) null, 0);
            AnonymousClass720.A01(r2, 2131233496, 2131103398);
            r2.A05 = Long.valueOf(r6.A02);
            return r2.A02();
        }
        C122636Rd r3 = C122636Rd.A0D;
        AnonymousClass6IR A0t = AnonymousClass3MX.A0t(2131892436);
        AnonymousClass6IR r0 = null;
        if (r6.A04) {
            r0 = AnonymousClass3MX.A0t(2131892433);
        }
        AnonymousClass720 A03 = InCallBannerViewModel.A03(r3, A0t, r0, z);
        C95784mn r1 = new C95784mn(2131233376);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        A03.A02 = r1;
        A03.A01 = scaleType;
        A03.A05 = C17880vN.A0n(C18020vd.A00(C18040vf.A02, this.A00, 4183));
        return A03.A02();
    }

    public C133486oq(C18030ve r1, C18140vp r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}

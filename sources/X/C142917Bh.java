package X;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.7Bh  reason: invalid class name and case insensitive filesystem */
public class C142917Bh implements C28582E8t {
    public View A00;
    public final AnonymousClass1GP A01;
    public final C22654BId A02;
    public final C36171nS A03;
    public final C133876pe A04;
    public final C123696Vm A05;
    public final AnonymousClass6XS A06;

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        return this.A04.A01();
    }

    public void CQJ() {
        AnonymousClass4XT r1;
        Spanned A002;
        C133876pe r7 = this.A04;
        if (r7.A01() && this.A00 == null) {
            C22654BId bId = this.A02;
            View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(bId), bId, 2131624995);
            this.A00 = A09;
            bId.addView(A09);
        }
        View view = this.A00;
        if (view == null) {
            C22654BId bId2 = this.A02;
            view = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(bId2), bId2, 2131624995);
            this.A00 = view;
        }
        C140056zs r5 = r7.A00;
        AnonymousClass78Q r8 = new AnonymousClass78Q((Object) this, (Object) r5, 23);
        AnonymousClass78Q r6 = new AnonymousClass78Q((Object) this, (Object) r5, 24);
        WDSBanner wDSBanner = (WDSBanner) view;
        Context context = view.getContext();
        boolean A16 = C18070vi.A16(context, r5);
        if (C18070vi.A18(r5.A07, "automation_bulk_messaging")) {
            r1 = new AnonymousClass4XT();
            r1.A02 = AnonymousClass4A9.A00;
            A002 = AnonymousClass4W6.A00(context, 2131898568);
        } else {
            r1 = new AnonymousClass4XT();
            r1.A02 = AnonymousClass4A9.A00;
            r1.A01 = 2131896220;
            A002 = AnonymousClass4W6.A00(context, 2131898567);
        }
        r1.A03 = A002;
        r1.A05 = A16;
        wDSBanner.setState(r1.A01());
        if (!C22891Dp.A02) {
            wDSBanner.A08();
        } else {
            wDSBanner.A07();
        }
        wDSBanner.setOnClickListener(r8);
        wDSBanner.setOnDismissListener((View.OnClickListener) r6);
        C108975cc.A0q(this.A00);
        r7.A00(A16 ? 1 : 0);
        C36171nS r3 = this.A03;
        Integer valueOf = Integer.valueOf(A16);
        C46922Gk r12 = new C46922Gk();
        C36171nS.A01(r12, r5);
        r12.A00 = 1;
        r12.A01 = 1;
        r12.A02 = valueOf;
        C36171nS.A00(r12, r3);
    }

    public C142917Bh(AnonymousClass1GP r1, C22654BId bId, C123696Vm r3, AnonymousClass6XS r4, C36171nS r5, C133876pe r6) {
        this.A01 = r1;
        this.A02 = bId;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r4;
        this.A05 = r3;
    }
}

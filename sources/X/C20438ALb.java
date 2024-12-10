package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.ALb  reason: case insensitive filesystem */
public class C20438ALb implements C28582E8t {
    public View A00;
    public String A01;
    public final AnonymousClass1L9 A02;
    public final C22654BId A03;
    public final C19830z4 A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final C18140vp A07;

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        C195759tr r0 = (C195759tr) this.A07.get();
        if (r0 == null) {
            return false;
        }
        return C31141f5.A06(this.A04, this.A05, r0.A06, r0.A05);
    }

    public void CQJ() {
        if (this.A01 == null) {
            AnonymousClass18K r2 = this.A06;
            C18070vi.A0d(r2, 1);
            this.A01 = C83974Hj.A00(r2, 3);
        }
        if (this.A00 == null) {
            boolean A052 = C18020vd.A05(C18040vf.A01, this.A05, 5332);
            C22654BId bId = this.A03;
            LayoutInflater A0D = AnonymousClass3MZ.A0D(bId);
            if (A052) {
                WDSBanner wDSBanner = (WDSBanner) A0D.inflate(2131627144, bId, false);
                AFU.A00(wDSBanner, this, 30);
                wDSBanner.setOnDismissListener((C18090vk) new C21528Alb(this, 3));
                if (!C22891Dp.A02) {
                    wDSBanner.A08();
                }
                this.A00 = wDSBanner;
            } else {
                View inflate = A0D.inflate(2131627127, bId, false);
                this.A00 = inflate;
                AFU.A00(inflate, this, 31);
                AFU.A00(AnonymousClass1HF.A06(this.A00, 2131435823), this, 32);
                View view = this.A00;
                view.setBackgroundResource(AnonymousClass1YL.A00(view.getContext(), 2130971832, 2131102975));
            }
            bId.addView(this.A00);
        }
        View view2 = this.A00;
        C17960vV.A05(view2);
        view2.setVisibility(0);
    }

    public C20438ALb(AnonymousClass1L9 r1, C22654BId bId, C19830z4 r3, C18030ve r4, AnonymousClass18K r5, C18140vp r6) {
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = r1;
        this.A03 = bId;
        this.A04 = r3;
        this.A07 = r6;
    }
}

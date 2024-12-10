package X;

import android.view.ViewGroup;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.3Wk  reason: invalid class name and case insensitive filesystem */
public final class C73553Wk extends C38391rD {
    public final C72043Kk A00;
    public final AnonymousClass1M9 A01;
    public final C37451pZ A02;
    public final List A03;
    public final AnonymousClass1LU A04;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C74183Yv(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626724, false), this.A00);
    }

    public int A0Q() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        C74183Yv r92 = (C74183Yv) r9;
        C18070vi.A0d(r92, 0);
        AnonymousClass1BI r7 = (AnonymousClass1BI) this.A03.get(i);
        AnonymousClass1E7 A0H = this.A01.A0H(r7);
        C42141xh r5 = r92.A00;
        r5.A05(A0H);
        WDSProfilePhoto wDSProfilePhoto = r92.A01;
        r5.A01.setTextColor(AnonymousClass3MZ.A02(wDSProfilePhoto.getContext(), wDSProfilePhoto.getContext(), 2130970343, 2131101314));
        this.A02.A07(wDSProfilePhoto, A0H);
        C90074dU.A01(r92.A0H, this, r7, 48);
    }

    public C73553Wk(C72043Kk r1, AnonymousClass1M9 r2, C37451pZ r3, AnonymousClass1LU r4, List list) {
        C18070vi.A0o(r4, r2, r1);
        this.A04 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }
}

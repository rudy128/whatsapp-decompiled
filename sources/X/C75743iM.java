package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.3iM  reason: invalid class name and case insensitive filesystem */
public class C75743iM extends C91944gV {
    public final AnonymousClass1KB A00;
    public final C36641oE A01;
    public final C18030ve A02;
    public final C38581rX A03;

    public C75743iM(C22654BId bId, AnonymousClass1KB r8, C36641oE r9, C189349iw r10, C18030ve r11, C38581rX r12, AnonymousClass10I r13) {
        super(bId, r9, r10, r11, r13);
        this.A02 = r11;
        this.A03 = r12;
        this.A00 = r8;
        this.A01 = r9;
    }

    public void A01(C195759tr r4) {
        if (r4.A01 != null && A04()) {
            this.A06.CGO(new C21453AkK(this, r4, 38), "chat_list_banner");
        }
    }

    public void A02(C195759tr r4, C85634Od r5, AnonymousClass5YR r6) {
        C188169gz r0;
        super.A02(r4, r5, r6);
        if (!(r6 == null || (r0 = ((C21319Ai4) r6).A07) == null)) {
            String str = r0.A06;
            if (str == null || str.isEmpty()) {
                r5.A05.setVisibility(8);
            } else {
                TextView textView = r5.A05;
                textView.setText(str);
                textView.setTextDirection(5);
            }
        }
        if (this.A03.A02()) {
            View view = r5.A00;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C72463Mc.A05(view);
            }
        }
    }

    public void A03(C195759tr r3, AnonymousClass5YR r4, WDSBanner wDSBanner) {
        super.A03(r3, r4, wDSBanner);
        if (this.A03.A02()) {
            ViewGroup.LayoutParams layoutParams = wDSBanner.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C72463Mc.A05(wDSBanner);
            }
        }
    }

    public /* synthetic */ void A05(C195759tr r1) {
        super.A01(r1);
    }
}

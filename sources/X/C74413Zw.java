package X;

import com.whatsapp.WaViewPager;
import com.whatsapp.greenalert.GreenAlertActivity;

/* renamed from: X.3Zw  reason: invalid class name and case insensitive filesystem */
public final class C74413Zw extends C23531Gq {
    public final /* synthetic */ GreenAlertActivity A00;

    public C74413Zw(GreenAlertActivity greenAlertActivity) {
        this.A00 = greenAlertActivity;
    }

    public void Bzy(int i) {
        String str;
        int i2;
        GreenAlertActivity greenAlertActivity = this.A00;
        WaViewPager waViewPager = greenAlertActivity.A02;
        if (waViewPager == null) {
            str = "viewPager";
        } else {
            int currentLogicalItem = waViewPager.getCurrentLogicalItem();
            AnonymousClass00H r0 = greenAlertActivity.A08;
            if (r0 != null) {
                C26106CsQ csQ = (C26106CsQ) r0.get();
                if (currentLogicalItem == 1) {
                    C33451iq r02 = greenAlertActivity.A03;
                    if (r02 != null) {
                        boolean A03 = C63802ti.A03(r02);
                        i2 = 7;
                        if (A03) {
                            i2 = 3;
                        }
                    } else {
                        str = "userNoticeManager";
                    }
                } else {
                    i2 = 11;
                }
                C26106CsQ.A00(csQ, i2);
                GreenAlertActivity.A0V(greenAlertActivity, currentLogicalItem);
                GreenAlertActivity.A0c(greenAlertActivity, currentLogicalItem);
                return;
            }
            str = "userNoticeLogger";
        }
        C18070vi.A11(str);
        throw null;
    }
}

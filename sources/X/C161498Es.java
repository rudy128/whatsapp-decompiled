package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;
import java.util.List;

/* renamed from: X.8Es  reason: invalid class name and case insensitive filesystem */
public class C161498Es extends C28861b9 implements AnonymousClass1bA {
    public int A00;
    public List A01 = AnonymousClass000.A13();
    public final /* synthetic */ IndiaUpiQrTabActivity A02;

    public static void A00(C161498Es r3, int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= r3.A00) {
                break;
            }
            C185139c5 r0 = (C185139c5) r3.A01.get(i4);
            if (i4 != i) {
                z = false;
            }
            r0.A00.setSelected(z);
            i4++;
        }
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = r3.A02;
        if (i == 0) {
            i2 = 1;
            i3 = 197;
        } else if (i == 1) {
            i2 = 1;
            i3 = 198;
        } else {
            return;
        }
        IndiaUpiQrTabActivity.A03(C20112A7u.A02(), indiaUpiQrTabActivity, i2, Integer.valueOf(i3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161498Es(AnonymousClass1GP r2, IndiaUpiQrTabActivity indiaUpiQrTabActivity, int i) {
        super(r2, 0);
        this.A02 = indiaUpiQrTabActivity;
        this.A00 = i;
    }

    public CharSequence A0C(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A02;
        int i2 = 2131888838;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass000.A0k("The item position is not defined");
            }
            i2 = 2131888828;
        }
        return indiaUpiQrTabActivity.getString(i2);
    }

    public Fragment A0I(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A02;
        if (i == 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = new IndiaUpiScanQrCodeFragment();
            indiaUpiScanQrCodeFragment.A1R(AnonymousClass3MY.A09(indiaUpiQrTabActivity));
            return indiaUpiScanQrCodeFragment;
        } else if (i == 1) {
            return IndiaUpiMyQrFragment.A00(IndiaUpiQrTabActivity.A0L);
        } else {
            throw AnonymousClass000.A0k("The item position is not defined");
        }
    }

    public View BW7(int i) {
        List list = this.A01;
        if (AnonymousClass3MX.A01(list) < i) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A02.A01;
            C185139c5 r2 = new C185139c5(AnonymousClass3MX.A0B(C72463Mc.A0K(pagerSlidingTabStrip, 0), pagerSlidingTabStrip, 2131626655, false));
            CharSequence A0C = A0C(i);
            C17960vV.A07(A0C);
            r2.A01.setText(A0C);
            list.add(r2);
        }
        return ((C185139c5) list.get(i)).A00;
    }

    public int A0E() {
        return this.A00;
    }
}

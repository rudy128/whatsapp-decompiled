package X;

import android.view.View;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.8Jd  reason: invalid class name and case insensitive filesystem */
public class C162148Jd extends C23531Gq {
    public final int A00;
    public final Object A01;

    public C162148Jd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bzx(int i, float f, int i2) {
        boolean z;
        if (this.A00 != 0) {
            AnonymousClass990 r2 = (AnonymousClass990) this.A01;
            boolean z2 = true;
            if (i != AnonymousClass3MY.A1b(r2.A0E) && f == 0.0f) {
                z2 = false;
            }
            if (r2.A0Z != z2) {
                r2.A0Z = z2;
                if (z2) {
                    AnonymousClass990.A03(r2);
                    return;
                }
                QrScanCodeFragment qrScanCodeFragment = r2.A0S;
                qrScanCodeFragment.A01.A0K(qrScanCodeFragment.A0E, 200);
                qrScanCodeFragment.A01.A0I(qrScanCodeFragment.A0D);
                return;
            }
            return;
        }
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A01;
        boolean z3 = false;
        if (C18020vd.A05(C18040vf.A02, indiaUpiQrTabActivity.A0E, 12944)) {
            z = false;
        } else {
            z = !AnonymousClass3MY.A1b(indiaUpiQrTabActivity.A00);
        }
        if (i == z || f != 0.0f) {
            z3 = true;
        }
        if (indiaUpiQrTabActivity.A0G != z3) {
            indiaUpiQrTabActivity.A0G = z3;
            if (z3) {
                View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
                if (currentFocus != null) {
                    indiaUpiQrTabActivity.A09.A01(currentFocus);
                }
                indiaUpiQrTabActivity.A4b();
            }
        }
    }

    public void Bzy(int i) {
        int i2;
        AnonymousClass1KB r1;
        if (this.A00 != 0) {
            AnonymousClass990 r4 = (AnonymousClass990) this.A01;
            r4.A2X();
            C161488Er r3 = r4.A0P;
            int i3 = 0;
            do {
                r3.A00[i3].A00.setSelected(AnonymousClass000.A1T(i3, i));
                i3++;
            } while (i3 < 2);
            boolean A1b = AnonymousClass3MY.A1b(r4.A0E);
            if (i == 0) {
                A1b = !A1b;
            } else if (i != 1) {
                return;
            }
            i2 = 1;
            if (!A1b) {
                C28281Zt.A07(r4, AnonymousClass1YL.A00(r4, 2130970285, 2131101276), 1);
                return;
            } else if (A1b) {
                C28281Zt.A07(r4, AnonymousClass1YL.A00(r4, 2130968798, 2131099872), 2);
                if (!r4.A0Z) {
                    r4.A0Z = true;
                    AnonymousClass990.A03(r4);
                }
                if (!r4.A07.A09()) {
                    r1 = r4.A05;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A01;
            indiaUpiQrTabActivity.A2X();
            C161498Es.A00(indiaUpiQrTabActivity.A0A, i);
            if (i == 0) {
                i2 = 1;
                View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
                if (currentFocus != null) {
                    indiaUpiQrTabActivity.A09.A01(currentFocus);
                }
                if (!indiaUpiQrTabActivity.A0G) {
                    indiaUpiQrTabActivity.A0G = true;
                    indiaUpiQrTabActivity.A4b();
                }
                if (!indiaUpiQrTabActivity.A07.A09()) {
                    r1 = indiaUpiQrTabActivity.A05;
                } else {
                    return;
                }
            } else if (i == 1) {
                indiaUpiQrTabActivity.A0B.A27();
                return;
            } else {
                return;
            }
        }
        r1.A08(2131892931, i2);
    }
}

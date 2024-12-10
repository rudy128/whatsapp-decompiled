package X;

import android.os.Build;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.8Fz  reason: invalid class name and case insensitive filesystem */
public abstract class C161568Fz extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final A54 A04;
    public final A4K A05;
    public final AnonymousClass11P A06;
    public final A5H A07;
    public final C195929uA A08;

    public void A0T(AnonymousClass1FY r13, FingerprintBottomSheet fingerprintBottomSheet, C187759gK r15, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        AnonymousClass11P r8 = this.A06;
        C195929uA r11 = this.A08;
        AnonymousClass1FY r6 = r13;
        FingerprintBottomSheet fingerprintBottomSheet2 = fingerprintBottomSheet;
        fingerprintBottomSheet.A02 = new C167278fk(r6, fingerprintBottomSheet2, r8, r15, new AZQ(r13, fingerprintBottomSheet, pinBottomSheetDialogFragment, this, str, str2, str3), r11);
        r13.CMl(fingerprintBottomSheet);
    }

    public void A0U(AnonymousClass1FY r18, FingerprintBottomSheet fingerprintBottomSheet, C187759gK r20, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        AnonymousClass1FY r3 = r18;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = pinBottomSheetDialogFragment;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (Build.VERSION.SDK_INT >= 23) {
            A5H a5h = this.A07;
            if (a5h.A05() && a5h.A02() == 1) {
                A0T(r3, fingerprintBottomSheet, r20, pinBottomSheetDialogFragment2, str4, str5, str6);
                return;
            }
        }
        pinBottomSheetDialogFragment2.A09 = new AZY(r3, pinBottomSheetDialogFragment2, this, str5, str6, str4);
        r3.CMl(pinBottomSheetDialogFragment2);
    }

    public boolean A0V(A7B a7b, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str) {
        int i = a7b.A00;
        if (i != 1440 && i != 444 && i != 478 && i != 1441 && i != 445 && i != 1448 && i != 10718) {
            return false;
        }
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A2M();
        }
        int i2 = a7b.A00;
        if (i2 != 1440) {
            if (i2 != 1441) {
                if (i2 == 1448) {
                    this.A04.A02(a7b, str, "PIN");
                } else if (i2 == 478 || i2 == 444) {
                    this.A04.A01.A02(str, "PIN");
                }
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A29();
                }
                this.A03.A0E(a7b);
                return true;
            }
            C195929uA r2 = this.A08;
            long j = a7b.A02;
            r2.A01(j);
            if (pinBottomSheetDialogFragment == null) {
                return true;
            }
            AnonymousClass8BX.A1E(pinBottomSheetDialogFragment, j);
            return true;
        } else if (pinBottomSheetDialogFragment == null) {
            return true;
        } else {
            pinBottomSheetDialogFragment.A2O(a7b.A01, 2131755316);
            return true;
        }
    }

    public C161568Fz(AnonymousClass11P r2, A54 a54, A5H a5h, A4K a4k, C195929uA r6) {
        this.A06 = r2;
        this.A05 = a4k;
        this.A08 = r6;
        this.A07 = a5h;
        this.A04 = a54;
    }
}

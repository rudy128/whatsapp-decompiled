package X;

import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class A5V {
    public String A00 = "payment_home";
    public boolean A01;
    public ADT A02;
    public List A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass1FY A05;
    public final AnonymousClass1QG A06;
    public final C33711jG A07;
    public final AnonymousClass1QD A08;
    public final C31061ex A09;
    public final A54 A0A;
    public final BD4 A0B;
    public final C195929uA A0C;
    public final BBX A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass11S A0F;
    public final AnonymousClass11P A0G;
    public final C33331ie A0H;
    public final C20110A7s A0I;
    public final C191529mk A0J;
    public final A5H A0K;
    public final AnonymousClass1QL A0L;

    public static void A01(C198959zC r7, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, A5V a5v, String str) {
        C198169xt r5 = new C198169xt(a5v.A0F, a5v.A0G, a5v.A09);
        a5v.A0J.A00(new C20770AXz(r7, a5v, pinBottomSheetDialogFragment, r5, 2), r7, str);
    }

    public void A07(String str, String str2) {
        C70513Bj r1;
        C70513Bj A032;
        A04();
        if (!TextUtils.isEmpty(str) && str.equals("STEP_UP")) {
            C17880vN.A1F(AnonymousClass8BU.A07(this.A08), "payment_step_up_update_ack", true);
            this.A00 = "push_notification";
            if (!(str2 == null || (A032 = this.A06.A03(str2)) == null)) {
                A032.A00 = false;
                if (this.A01) {
                    BD4 bd4 = this.A0B;
                    String str3 = this.A00;
                    bd4.Bi2(A032, (Integer) null, str3, str3, 1);
                }
            }
            this.A0H.A03(str2);
        }
        if (this.A01) {
            ArrayList A042 = this.A06.A04();
            if (!A042.isEmpty()) {
                if (A042.size() == 1) {
                    r1 = (C70513Bj) AnonymousClass8BS.A0Y(A042);
                } else {
                    r1 = null;
                }
                this.A0B.Bi2(r1, (Integer) null, "payment_home", this.A00, 0);
            }
        }
        this.A03 = AnonymousClass000.A13();
    }

    private void A00() {
        FingerprintBottomSheet A002 = FingerprintBottomSheet.A0A.A00();
        AnonymousClass11P r3 = this.A0G;
        C187759gK r4 = new C187759gK(this.A0F, r3, this.A09, this.A0K, "AUTH");
        C195929uA r6 = this.A0C;
        AnonymousClass1FY r1 = this.A05;
        A002.A02 = new C167278fk(r1, A002, r3, r4, new AZP(A002, this), r6);
        r1.CMk(A002, (String) null);
    }

    public void A02() {
        this.A0D.CHl(false);
        this.A08.A08();
        if (!this.A03.isEmpty()) {
            this.A06.A06(this.A03);
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                this.A0H.A03(C17880vN.A0v(it));
            }
        }
    }

    public void A03() {
        AnonymousClass1FY r2 = this.A05;
        C20110A7s.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(2131893867)).show();
    }

    public void A04() {
        if (this instanceof C1764694i) {
            C17890vO.A0u(new C177929Bd((Object) this, 12), this.A0E);
        } else {
            C17890vO.A0u(new C177929Bd((Object) this, 13), this.A0E);
        }
    }

    public void A05(C70513Bj r7) {
        AD9 ad9;
        C70513Bj r1 = r7;
        if (this.A01) {
            this.A0B.Bi2(r1, AnonymousClass3MY.A0f(), "payment_home", this.A00, 1);
        }
        ADT adt = r7.A03;
        this.A02 = adt;
        if (adt != null && (ad9 = adt.A00) != null && ad9.A00.equals("WEBVIEW")) {
            if (((C1762490b) ad9).A01) {
                if (Build.VERSION.SDK_INT >= 23) {
                    A5H a5h = this.A0K;
                    if (a5h.A05() && a5h.A02() == 1) {
                        A00();
                        return;
                    }
                }
                PinBottomSheetDialogFragment A002 = C196779vd.A00();
                A002.A09 = new AZW(A002, this, 1);
                this.A05.CMk(A002, (String) null);
                return;
            }
            A06((PinBottomSheetDialogFragment) null, (C29621ca) null);
        }
    }

    public void A06(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C29621ca r7) {
        new C191359mT(this.A05, this.A04, this.A07, this.A09).A00(new C20781AYk(pinBottomSheetDialogFragment, this, 1), this.A02, r7, (String) null);
    }

    public A5V(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass1FY r4, AnonymousClass11P r5, AnonymousClass1QG r6, AnonymousClass1QL r7, C33331ie r8, C33711jG r9, AnonymousClass1QD r10, C31061ex r11, C20110A7s a7s, C191529mk r13, A54 a54, BD4 bd4, A5H a5h, C195929uA r17, BBX bbx, AnonymousClass10I r19) {
        this.A0G = r5;
        this.A04 = r2;
        this.A0F = r3;
        this.A0E = r19;
        this.A06 = r6;
        this.A0J = r13;
        this.A08 = r10;
        this.A0L = r7;
        this.A0C = r17;
        this.A09 = r11;
        this.A0B = bd4;
        this.A0I = a7s;
        this.A07 = r9;
        this.A0K = a5h;
        this.A0A = a54;
        this.A0H = r8;
        this.A05 = r4;
        this.A0D = bbx;
    }
}

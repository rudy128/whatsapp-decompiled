package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Gd  reason: invalid class name */
public class AnonymousClass8Gd extends AnonymousClass1J2 implements C22556BCp {
    public boolean A00;
    public AnonymousClass1WR A01;
    public B5S A02;
    public final AnonymousClass1DS A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1PM A05;
    public final C18030ve A06;
    public final AnonymousClass1QS A07;
    public final C22556BCp A08;
    public final C189639jZ A09;
    public final AnonymousClass1R2 A0A;
    public final AnonymousClass205 A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass11C A0D;
    public final AnonymousClass11P A0E;
    public final C24681Lg A0F;
    public final UserJid A0G;
    public final AnonymousClass2L2 A0H;
    public final boolean A0I;

    public C20279AEn A0T(AnonymousClass205 r10, AnonymousClass21K r11, String str, String str2, int i) {
        C108985cd.A1D(r10, r11);
        C20279AEn A0U = A0U(r11, str, str2, i, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        CQb(A0U, r10, r11);
        return A0U;
    }

    public final C20279AEn A0U(AnonymousClass21K r40, String str, String str2, int i, long j) {
        String str3;
        int i2 = i;
        if (i2 == 2) {
            str3 = "payment_instruction";
        } else if (i2 == 3) {
            str3 = "confirm";
        } else if (i2 == 5) {
            str3 = "payment_link";
        } else if (i2 == 6) {
            str3 = "pix";
        } else if (i2 != 8) {
            AnonymousClass8BS.A1F("PaymentCheckoutOrderViewModel", "sendOrderNFM: invalid payment method was selected");
            str3 = "";
        } else {
            str3 = "boleto";
        }
        C20285AEt BPK = r40.BPK();
        C17960vV.A07(BPK);
        C18070vi.A0X(BPK);
        C20279AEn aEn = BPK.A02;
        C17960vV.A07(aEn);
        C18070vi.A0X(aEn);
        AEU aeu = aEn.A0D;
        String str4 = aEn.A0K;
        ADZ adz = aEn.A0E;
        List list = aEn.A0P;
        return new C20279AEn((AnonymousClass1KJ) null, (C22565BDa) null, aEn.A0B, (C20266ADy) null, (AE0) null, aeu, adz, (AE1) null, (String) null, str4, (String) null, (String) null, (String) null, (String) null, (String) null, str2, str3, (String) null, str, (String) null, (List) null, (List) null, (List) null, list, (List) null, (byte[]) null, 0, j, aEn.A01, true, false, aEn.A0T);
    }

    public void A0X(ARR arr, Integer num, String str) {
        if (this instanceof AnonymousClass93z) {
            A0Z(new AED((ADY) null, AnonymousClass9I2.INACTIVE, (String) null, (List) null));
            return;
        }
        UserJid userJid = this.A0G;
        if (userJid != null) {
            BL1(arr, userJid, new AYT(this, 1), num, str, false);
        }
    }

    public final void A0a(boolean z) {
        this.A04.A0E(this.A09.A00((AW0) null, this.A0G, (C20281AEp) null, (AnonymousClass9I2) null, (AnonymousClass21K) null, Boolean.valueOf(this.A0I), (String) null, (List) null, 0));
        this.A0C.CGN(new C70813Cp(this, z));
    }

    public void BL1(ARR arr, UserJid userJid, C22455B8n b8n, Integer num, String str, boolean z) {
        this.A08.BL1(arr, userJid, b8n, num, str, false);
    }

    public AnonymousClass21K Bhj(AnonymousClass205 r2) {
        C18070vi.A0d(r2, 0);
        return this.A08.Bhj(r2);
    }

    public void CHM(UserJid userJid, C20279AEn aEn, AnonymousClass21K r4) {
        C18070vi.A0d(userJid, 1);
        this.A08.CHM(userJid, aEn, r4);
    }

    public static final void A00(AW0 aw0, AnonymousClass8Gd r5) {
        AnonymousClass21K r2;
        String str;
        C20279AEn aEn;
        String str2 = null;
        A2J a2j = (A2J) r5.A09.A00.A01;
        if (a2j != null && (r2 = a2j.A05) != null && aw0.A0K != null) {
            AW0 A002 = AnonymousClass25B.A00((AnonymousClass206) r2);
            if (A002 != null) {
                str = A002.A0K;
            } else {
                str = null;
            }
            if (!C18070vi.A18(str, aw0.A0K)) {
                C20285AEt BPK = r2.BPK();
                if (!(BPK == null || (aEn = BPK.A02) == null)) {
                    str2 = aEn.A08;
                }
                if (!C18070vi.A18(str2, aw0.A0K)) {
                    return;
                }
            }
            r5.A0Y(aw0, r2, 1);
        }
    }

    public void A0S() {
        AnonymousClass1WR r1 = this.A01;
        if (r1 != null) {
            this.A0F.unregisterObserver(r1);
        }
        B5S b5s = this.A02;
        if (b5s != null) {
            this.A0H.unregisterObserver(b5s);
        }
    }

    public AnonymousClass21K A0V() {
        AnonymousClass205 r1;
        C22556BCp bCp;
        if (this instanceof AnonymousClass940) {
            AnonymousClass940 r0 = (AnonymousClass940) this;
            r1 = r0.A00;
            if (r1 == null) {
                return null;
            }
            bCp = r0.A08;
        } else {
            r1 = this.A0B;
            if (r1 == null) {
                return null;
            }
            bCp = this.A08;
        }
        return bCp.Bhj(r1);
    }

    public final void A0W(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("save_order_detail_state_key");
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("should_show_shimmer_key");
            Parcelable parcelable = bundle2.getParcelable("merchant_jid_key");
            Serializable serializable = bundle2.getSerializable("merchant_status_key");
            this.A0C.CGN(new AnonymousClass3CS(this, parcelable, bundle2.getSerializable("checkout_error_code_key"), bundle2.getParcelable("payment_transaction_key"), serializable, bundle2.getParcelableArrayList("installment_option_key"), 3, z));
        }
    }

    public final void A0Y(AW0 aw0, AnonymousClass21K r15, int i) {
        C198179xu A002;
        C189639jZ r3 = this.A09;
        AnonymousClass21K r8 = r15;
        int i2 = i;
        if (r15 == null) {
            A002 = r3.A00((AW0) null, (UserJid) null, new C20281AEp(AnonymousClass00R.A01, 2131893200, 2131893199), (AnonymousClass9I2) null, (AnonymousClass21K) null, (Boolean) null, (String) null, (List) null, i2);
        } else {
            A002 = r3.A00(aw0, (UserJid) null, (C20281AEp) null, (AnonymousClass9I2) null, r8, (Boolean) null, (String) null, (List) null, i2);
        }
        this.A04.A0E(A002);
    }

    public final void A0Z(AED aed) {
        this.A04.A0E(this.A09.A00((AW0) null, (UserJid) null, (C20281AEp) null, aed.A01, (AnonymousClass21K) null, (Boolean) null, aed.A02, aed.A03, 0));
    }

    public final boolean A0b() {
        AnonymousClass1PM r1 = this.A05;
        C22941Dw r0 = UserJid.Companion;
        C42741yf A012 = r1.A01(C22941Dw.A01(this.A0G));
        if (A012 == null || !A012.A02()) {
            return false;
        }
        return true;
    }

    public final boolean A0c(AW0 aw0, C20279AEn aEn) {
        A5D BUf;
        String str;
        AZ9 A052 = this.A07.A05("FBPAY");
        if (A052 == null || (BUf = A052.BUf()) == null) {
            return false;
        }
        UserJid userJid = this.A0G;
        if (userJid != null) {
            str = userJid.user;
        } else {
            str = null;
        }
        return BUf.A02(aw0, aEn, str);
    }

    public boolean A0d(String str) {
        ClipboardManager A092 = this.A0D.A09();
        if (A092 == null) {
            return false;
        }
        try {
            A092.setPrimaryClip(ClipData.newPlainText("pix_code", str));
            return true;
        } catch (NullPointerException | SecurityException e) {
            Log.e("serializeAndCopyPixCodeToClipboard/clipboard/", e);
            return false;
        }
    }

    public AW0 BL7(String str) {
        return this.A08.BL7(str);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.9jZ] */
    public AnonymousClass8Gd(AnonymousClass1PM r15, AnonymousClass11C r16, AnonymousClass11P r17, C24681Lg r18, C18030ve r19, UserJid userJid, AnonymousClass2L2 r21, AnonymousClass1QS r22, C22556BCp bCp, AnonymousClass1R2 r24, AnonymousClass205 r25, AnonymousClass10I r26, boolean z, boolean z2) {
        this.A06 = r19;
        this.A0C = r26;
        C24681Lg r3 = r18;
        this.A0F = r3;
        this.A05 = r15;
        AnonymousClass2L2 r2 = r21;
        this.A0H = r2;
        this.A08 = bCp;
        this.A0G = userJid;
        this.A0B = r25;
        this.A0I = z;
        this.A0A = r24;
        this.A07 = r22;
        this.A0E = r17;
        this.A0D = r16;
        C198179xu r1 = new C198179xu(new A2J((AW0) null, (UserJid) null, (C20281AEp) null, AnonymousClass9I2.NONE, (AnonymousClass21K) null, (Boolean) null, (String) null, (List) null, 0), (Throwable) null, 2);
        ? obj = new Object();
        obj.A00 = r1;
        this.A09 = obj;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A04 = A0L;
        this.A03 = A0L;
        if (!z2) {
            ARC arc = new ARC(this, 0);
            this.A01 = arc;
            r3.registerObserver(arc);
            C20759AXo aXo = new C20759AXo(this, 4);
            this.A02 = aXo;
            r2.registerObserver(aXo);
        }
    }

    public C20279AEn CQb(C20279AEn aEn, AnonymousClass205 r3, AnonymousClass21K r4) {
        C18070vi.A0h(r3, r4);
        return this.A08.CQb(aEn, r3, r4);
    }
}

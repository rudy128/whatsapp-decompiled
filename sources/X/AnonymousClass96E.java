package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.96E  reason: invalid class name */
public class AnonymousClass96E extends AnonymousClass9BY {
    public final /* synthetic */ C161588Gc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass96E(C161588Gc r1, AnonymousClass205 r2, String str, boolean z) {
        super(r1, r2, str, z);
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9NU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.2r3, java.lang.Object] */
    public AnonymousClass9NU A0J() {
        AW0 aw0;
        AnonymousClass21K r5;
        int i;
        UserJid userJid;
        int i2;
        Context context;
        int i3;
        List list;
        String str;
        C161588Gc r7 = this.A00;
        AnonymousClass205 r9 = r7.A07;
        C17960vV.A07(r9);
        AnonymousClass1BI r3 = r9.A00;
        AnonymousClass8pM r6 = null;
        if (r3 != null) {
            r5 = r7.A0R.A01(r9.A01);
            if (r5 != null) {
                C20285AEt BPK = r5.BPK();
                C17960vV.A07(BPK);
                C20279AEn aEn = BPK.A02;
                C17960vV.A07(aEn);
                AE1 ae1 = aEn.A0F;
                ? obj = new Object();
                C17960vV.A07(aEn);
                AnonymousClass1KJ r15 = aEn.A0A;
                obj.A02 = r15;
                C17960vV.A07(ae1);
                obj.A00 = ae1.A00;
                C17960vV.A07(ae1);
                obj.A01 = ae1.A01;
                ARR A002 = obj.A00();
                AnonymousClass206 r13 = (AnonymousClass206) r5;
                UserJid A0I = r13.A0I();
                C17960vV.A07(A0I);
                boolean z = r9.A02;
                if (z) {
                    i = 200;
                    userJid = (UserJid) r3;
                } else {
                    i = 100;
                    userJid = A0I;
                    A0I = (UserJid) r3;
                }
                C17960vV.A07(r15);
                String A0j = AnonymousClass8BS.A0j(r15);
                BigDecimal bigDecimal = A002.A02.A00;
                C17960vV.A07(aEn);
                long j = aEn.A02 * 1000;
                String str2 = "confirm";
                String str3 = aEn.A06;
                if (str2.equals(str3)) {
                    boolean equals = "captured".equals(aEn.A07);
                    if (z) {
                        i2 = 903;
                        if (equals) {
                            i2 = 904;
                        }
                    } else {
                        i2 = 803;
                        if (equals) {
                            i2 = 804;
                        }
                    }
                } else if ("payment_instruction".equals(str3)) {
                    boolean equals2 = "captured".equals(aEn.A07);
                    if (z) {
                        i2 = 901;
                        if (equals2) {
                            i2 = 902;
                        }
                    } else {
                        i2 = 801;
                        if (equals2) {
                            i2 = 802;
                        }
                    }
                } else if ("pix".equals(str3) || "boleto".equals(str3)) {
                    boolean equals3 = "captured".equals(aEn.A07);
                    if (z) {
                        i2 = 905;
                        if (equals3) {
                            i2 = 906;
                        }
                    } else {
                        i2 = 907;
                        if (equals3) {
                            i2 = 908;
                        }
                    }
                } else {
                    i2 = 401;
                    if (z) {
                        i2 = 101;
                    }
                }
                C63572tK r2 = C63572tK.A0E;
                C20128A8n a8n = C20128A8n.$redex_init_class;
                aw0 = new AW0(r15, AnonymousClass8BU.A0H(r15, bigDecimal), userJid, A0I, A0j, (String) null, (String) null, (String) null, (String) null, (String) null, "BR", i, i2, 1, 0, 0, j, j);
                aw0.A0R = null;
                aw0.A0E(false);
                aw0.A07 = r15;
                AnonymousClass8pG BdL = r7.A0T().BdL();
                if (BdL != null) {
                    aw0.A07(new C20280AEo(aEn.A0K, r13.A0v.A01), BdL);
                }
                AnonymousClass118 r8 = r7.A0P;
                boolean A1O = AnonymousClass000.A1O(AnonymousClass8BX.A03(r7.A0k.A07));
                String str4 = aEn.A06;
                if (!str2.equals(str4)) {
                    str2 = "payment_instruction";
                    if (str2.equals(str4) && (list = aEn.A0O) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            str = ((C20267ADz) it.next()).A00;
                            if (!TextUtils.isEmpty(str)) {
                                break;
                            }
                        }
                    } else {
                        str2 = "pix";
                        if (str2.equals(str4)) {
                            context = r8.A00;
                            i3 = 2131894091;
                        } else {
                            str2 = "payment_link";
                            if (str2.equals(str4)) {
                                context = r8.A00;
                                i3 = 2131894090;
                            } else {
                                str2 = "boleto";
                                if (str2.equals(str4)) {
                                    context = r8.A00;
                                    i3 = 2131894089;
                                }
                            }
                        }
                    }
                } else {
                    context = r8.A00;
                    i3 = 2131894087;
                    if (A1O) {
                        i3 = 2131894088;
                    }
                }
                str = context.getString(i3);
                r6 = new AnonymousClass8pM(str2);
                r6.A0B(str);
            } else {
                aw0 = null;
            }
        } else {
            aw0 = null;
            r5 = null;
        }
        ? obj2 = new Object();
        obj2.A00 = r6;
        obj2.A04 = true;
        obj2.A01 = aw0;
        obj2.A02 = null;
        obj2.A03 = r5;
        return obj2;
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8za  reason: invalid class name and case insensitive filesystem */
public class C175978za extends C175498yo {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public void A04(A7B a7b) {
        A7B a7b2 = a7b;
        switch (this.A00) {
            case 0:
                C17900vP.A0X(a7b, "PAY: IndiaUpiBlockListManager fetch error: ", AnonymousClass000.A10());
                ((C184679bL) this.A02).A01.C3f(a7b);
                return;
            case 1:
                super.A04(a7b);
                ((C22448B8g) this.A02).Bkl(a7b);
                return;
            case 2:
            case 4:
                super.A04(a7b);
                ((B8Z) this.A02).C2r(a7b);
                return;
            case 3:
                super.A04(a7b);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AnonymousClass9YZ) this.A02).A00;
                if (a7b == null) {
                    indiaUpiSendPaymentActivity.A0V.A02(indiaUpiSendPaymentActivity.A00, 2);
                }
                AnonymousClass91R.A19(a7b, indiaUpiSendPaymentActivity, true);
                return;
            case 9:
                super.A04(a7b);
                ((C189669jc) this.A02).A00((AnonymousClass1KN) null, (AnonymousClass1KN) null, a7b);
                return;
            case 10:
                super.A04(a7b);
                A07(a7b);
                BBD bbd = ((C175838zM) this.A01).A00;
                if (bbd != null) {
                    bbd.Bwk(a7b, (String) null);
                    return;
                }
                return;
            case 11:
                super.A04(a7b);
                ((C190279kf) this.A02).A00(a7b, (String) null);
                return;
            case 12:
                super.A04(a7b);
                AnonymousClass8GO r0 = ((C183459Yi) this.A02).A00;
                if (a7b != null) {
                    C187449fp.A00(r0.A00, 4);
                    return;
                } else {
                    AnonymousClass8GO.A00(r0);
                    return;
                }
            case 13:
                super.A04(a7b);
                C175778zG r4 = (C175778zG) this.A01;
                AZ6 az6 = r4.A05;
                C171858sO A05 = az6.A05(a7b, 5);
                A05.A0O = "";
                az6.BiH(A05);
                C22454B8m b8m = r4.A01;
                if (b8m != null) {
                    b8m.C2m((AnonymousClass8pN) null, a7b);
                    return;
                }
                return;
            case 14:
                C18070vi.A0d(a7b, 0);
                super.A04(a7b);
                ((C183439Yg) this.A01).A00.A00.A0F(new A28(a7b2, (A7B) null, false, false, false, false));
                return;
            default:
                super.A04(a7b);
                ((C22450B8i) this.A02).C3f(a7b);
                return;
        }
    }

    public void A05(A7B a7b) {
        A7B a7b2 = a7b;
        switch (this.A00) {
            case 0:
                C17900vP.A0X(a7b, "PAY: IndiaUpiBlockListManager fetch error: ", AnonymousClass000.A10());
                ((C184679bL) this.A02).A01.C3f(a7b);
                return;
            case 1:
                super.A05(a7b);
                ((C22448B8g) this.A02).Bkl(a7b);
                return;
            case 2:
            case 4:
                super.A05(a7b);
                ((B8Z) this.A02).C2r(a7b);
                return;
            case 3:
                super.A05(a7b);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AnonymousClass9YZ) this.A02).A00;
                if (a7b == null) {
                    indiaUpiSendPaymentActivity.A0V.A02(indiaUpiSendPaymentActivity.A00, 2);
                }
                AnonymousClass91R.A19(a7b, indiaUpiSendPaymentActivity, true);
                return;
            case 9:
                super.A05(a7b);
                ((C189669jc) this.A02).A00((AnonymousClass1KN) null, (AnonymousClass1KN) null, a7b);
                return;
            case 10:
                super.A05(a7b);
                A07(a7b);
                BBD bbd = ((C175838zM) this.A01).A00;
                if (bbd != null) {
                    bbd.Bwk(a7b, (String) null);
                    return;
                }
                return;
            case 11:
                super.A05(a7b);
                ((C190279kf) this.A02).A00(a7b, (String) null);
                return;
            case 12:
                super.A05(a7b);
                AnonymousClass8GO r0 = ((C183459Yi) this.A02).A00;
                if (a7b != null) {
                    C187449fp.A00(r0.A00, 4);
                    return;
                } else {
                    AnonymousClass8GO.A00(r0);
                    return;
                }
            case 13:
                super.A05(a7b);
                C175778zG r4 = (C175778zG) this.A01;
                AZ6 az6 = r4.A05;
                C171858sO A05 = az6.A05(a7b, 5);
                A05.A0O = "";
                az6.BiH(A05);
                C22454B8m b8m = r4.A01;
                if (b8m != null) {
                    b8m.C2m((AnonymousClass8pN) null, a7b);
                    return;
                }
                return;
            case 14:
                C18070vi.A0d(a7b, 0);
                super.A05(a7b);
                ((C183439Yg) this.A01).A00.A00.A0F(new A28(a7b2, (A7B) null, false, false, false, false));
                return;
            default:
                super.A05(a7b);
                ((C22450B8i) this.A02).C3f(a7b);
                return;
        }
    }

    public void A06(C29621ca r22) {
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        C29621ca r8 = r22;
        switch (this.A00) {
            case 0:
                C29621ca A0j = AnonymousClass8BR.A0j(r8);
                if (A0j != null) {
                    arrayList = AnonymousClass000.A13();
                    C29621ca[] r5 = A0j.A02;
                    if (r5 != null) {
                        for (C29621ca A022 : r5) {
                            String A023 = C29621ca.A02(A022, "vpa");
                            if (!TextUtils.isEmpty(A023)) {
                                arrayList.add(A023);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                C184679bL r52 = (C184679bL) this.A02;
                C196199uc r4 = r52.A00;
                synchronized (r4) {
                    long A012 = AnonymousClass11P.A01(r4.A02);
                    r4.A00 = A012;
                    if (arrayList != null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        C17890vO.A14("PAY: IndiaUpiBlockListManager fetch success size: ", A10, arrayList);
                        A10.append(" time: ");
                        C17890vO.A16(A10, r4.A00);
                        Set set = r4.A09;
                        set.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            set.add(new C192269o5(AnonymousClass8BX.A0K(C17880vN.A0v(it), "upiHandle"), r4));
                        }
                        r4.A06.A0L(TextUtils.join(";", arrayList));
                    } else {
                        C17900vP.A0m("PAY: IndiaUpiBlockListManager fetch success hash matched time: ", AnonymousClass000.A10(), A012);
                    }
                    C17880vN.A1D(AnonymousClass8BU.A07(r4.A06), "payments_block_list_last_sync_time", r4.A00);
                }
                r52.A01.C3f((A7B) null);
                return;
            case 1:
                super.A06(r8);
                ((C22448B8g) this.A02).Bkl((A7B) null);
                return;
            case 2:
            case 4:
                super.A06(r8);
                ((B8Z) this.A02).C2r((A7B) null);
                return;
            case 3:
                super.A06(r8);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AnonymousClass9YZ) this.A02).A00;
                indiaUpiSendPaymentActivity.A0V.A02(indiaUpiSendPaymentActivity.A00, 2);
                AnonymousClass91R.A19((A7B) null, indiaUpiSendPaymentActivity, true);
                return;
            case 9:
                super.A06(r8);
                C29621ca A0j2 = AnonymousClass8BR.A0j(r8);
                if (A0j2 == null) {
                    Log.e("PAY: IndiaUpiPaymentMethodAction sendCheckPin: empty account node");
                } else {
                    AnonymousClass8pH r6 = new AnonymousClass8pH();
                    r6.A05(((C175818zK) this.A01).A02, A0j2, 6);
                    Bundle bundle3 = r6.A00;
                    if (!((bundle3 != null && bundle3.getString("updatedVpaFor") != null) || (bundle = r6.A00) == null || !"1".equals(bundle.getString("valid")) || (bundle2 = r6.A00) == null || bundle2.getString("balance") == null)) {
                        Bundle bundle4 = r6.A00;
                        if (bundle4 != null) {
                            str = bundle4.getString("balance");
                        } else {
                            str = null;
                        }
                        int i = ((AnonymousClass1KK) AnonymousClass1KL.A0B).A01;
                        AnonymousClass1KN A002 = AnonymousClass2TQ.A00(str, i);
                        Bundle bundle5 = r6.A00;
                        if (bundle5 != null) {
                            str2 = bundle5.getString("usableBalance");
                        } else {
                            str2 = null;
                        }
                        ((C189669jc) this.A02).A00(A002, AnonymousClass2TQ.A00(str2, i), (A7B) null);
                        return;
                    }
                }
                ((C189669jc) this.A02).A00((AnonymousClass1KN) null, (AnonymousClass1KN) null, A7B.A00());
                return;
            case 10:
                super.A06(r8);
                C29621ca A0j3 = AnonymousClass8BR.A0j(r8);
                if (A0j3 == null) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: empty account node");
                    A07((A7B) null);
                    BBD bbd = ((C175838zM) this.A01).A00;
                    if (bbd != null) {
                        bbd.Bwk(A7B.A00(), (String) null);
                        return;
                    }
                    return;
                }
                String A0Q = A0j3.A0Q("keys", (String) null);
                if (TextUtils.isEmpty(A0Q)) {
                    Log.w("PAY: IndiaUpiPinActions sendGetListKeys: missing keys");
                    A07((A7B) null);
                    BBD bbd2 = ((C175838zM) this.A01).A00;
                    if (bbd2 != null) {
                        bbd2.Bwk(A7B.A00(), (String) null);
                        return;
                    }
                    return;
                }
                C175838zM r3 = (C175838zM) this.A01;
                r3.A02.A0P(A0Q);
                r3.A04.A04((Integer) this.A02, "upi-list-keys");
                BBD bbd3 = r3.A00;
                if (bbd3 != null) {
                    bbd3.Bwk((A7B) null, A0Q);
                    return;
                }
                return;
            case 11:
                super.A06(r8);
                C29621ca A0j4 = AnonymousClass8BR.A0j(r8);
                if (A0j4 != null) {
                    ((C190279kf) this.A02).A00((A7B) null, A0j4.A0Q("signed-qr-code", (String) null));
                    return;
                }
                return;
            case 12:
                super.A06(r8);
                AnonymousClass8GO.A00(((C183459Yi) this.A02).A00);
                return;
            case 13:
                super.A06(r8);
                C175778zG r13 = (C175778zG) this.A01;
                AnonymousClass1QS r18 = r13.A04;
                C22444B8c BWK = AnonymousClass8BU.A0U(r18).BWK();
                C17960vV.A07(BWK);
                ArrayList CB8 = BWK.CB8(r13.A02, r8);
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it2 = CB8.iterator();
                AnonymousClass8pW r17 = null;
                C20284AEs aEs = null;
                while (it2.hasNext()) {
                    AnonymousClass8pW r11 = (AnonymousClass8pW) ((C64502us) it2.next());
                    String str4 = (String) AnonymousClass8BT.A0q(r11.A02);
                    C63572tK r9 = C63572tK.A0F;
                    String str5 = r11.A06;
                    int A003 = AnonymousClass8BU.A00(r11.A08 ? 1 : 0);
                    int A004 = AnonymousClass8BU.A00(r11.A07 ? 1 : 0);
                    byte[] bArr = r11.A09;
                    C20284AEs aEs2 = new C20284AEs();
                    C17960vV.A07(r9);
                    aEs2.A07 = r9;
                    aEs2.A05 = -1;
                    aEs2.A06 = -1;
                    aEs2.A00 = A004;
                    aEs2.A01 = A003;
                    aEs2.A0A = str5;
                    aEs2.A0B(str4);
                    aEs2.A0B = (String) AnonymousClass8BT.A0q(r11.A01);
                    aEs2.A0D = bArr;
                    aEs2.A08 = r11;
                    A13.add(aEs2);
                    if ((str4 != null && str4.equals(AnonymousClass8BT.A0q(r13.A00.A02))) || (r17 == null && (r11.A07 || r11.A08))) {
                        r17 = r11;
                        aEs = aEs2;
                    }
                }
                AZ6 az6 = r13.A05;
                C171858sO A05 = az6.A05((A7B) null, 5);
                if (aEs != null) {
                    C170278pb r1 = aEs.A08;
                    if (r1 instanceof AnonymousClass8pS) {
                        str3 = ((AnonymousClass8pS) r1).A0B;
                        A05.A0O = str3;
                        az6.BiH(A05);
                        r18.A01().A05(new ARK(this.A02, r17, this, aEs, 0), A13);
                        return;
                    }
                }
                str3 = "";
                A05.A0O = str3;
                az6.BiH(A05);
                r18.A01().A05(new ARK(this.A02, r17, this, aEs, 0), A13);
                return;
            case 14:
                C18070vi.A0d(r8, 0);
                super.A06(r8);
                AnonymousClass9F2 r0 = (AnonymousClass9F2) this.A02;
                C18070vi.A0d(r0, 2);
                C108945cZ.A1N(r8);
                Object obj = r0.A02;
                C62672rm A0s = AnonymousClass8BR.A0s();
                Class<String> cls = String.class;
                if (A0s.A05(r8, cls, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "update-alias", new String[]{"account", "action"}, false) != null) {
                    A5x a5x = A5x.A00;
                    AnonymousClass9DH r12 = (AnonymousClass9DH) A0s.A03(r8, new C21283AhU(a5x, 5), new String[]{"account", "alias"});
                    if (r12 == null) {
                        throw AnonymousClass1O9.A00(A0s);
                    } else if (C21290Ahb.A00(obj, a5x, 33).BCF(r8, A0s) != null) {
                        C144717Ik A0Z = AnonymousClass8BR.A0Z();
                        C178369Cv r2 = (C178369Cv) r12.A01;
                        C1418477e A0Y = AnonymousClass8BR.A0Y(A0Z, cls, r2.A04, "upiAlias");
                        String str6 = r2.A03;
                        String str7 = r2.A01;
                        String str8 = r2.A02;
                        C18070vi.A0b(str8);
                        AEC aec = new AEC(A0Y, str6, str7, AnonymousClass8BW.A0i(str8));
                        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = ((C183439Yg) this.A01).A00;
                        indiaUpiNumberSettingsViewModel.A01.A03(aec);
                        indiaUpiNumberSettingsViewModel.A00.A0F(new A28((A7B) null, (A7B) null, false, false, true, false));
                        return;
                    } else {
                        throw AnonymousClass1O9.A00(A0s);
                    }
                } else {
                    throw AnonymousClass1O9.A00(A0s);
                }
            default:
                super.A06(r8);
                ((C22450B8i) this.A02).C3f((A7B) null);
                return;
        }
    }

    public void A07(A7B a7b) {
        ((C175838zM) this.A01).A04.A02.A01(a7b, (Integer) this.A02, "upi-list-keys");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175628z1 r12, C183459Yi r13) {
        super(context, r9, r10, r11, "upi-verify-qr-code");
        this.A00 = 12;
        this.A01 = r12;
        this.A02 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175628z1 r12, C190279kf r13) {
        super(context, r9, r10, r11, "upi-sign-qr-code");
        this.A00 = 11;
        this.A01 = r12;
        this.A02 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r13, C33711jG r14, C196259ui r15, C175778zG r16, AZ6 az6, B5W b5w, AnonymousClass90Z r19, String str) {
        super(context, r13, r14, r15, az6, r19, "upi-register-vpa", str, 5);
        this.A00 = 13;
        this.A01 = r16;
        this.A02 = b5w;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175818zK r12, C189669jc r13) {
        super(context, r9, r10, r11, "upi-check-balance");
        this.A00 = 9;
        this.A01 = r12;
        this.A02 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175828zL r12, AnonymousClass9YZ r13) {
        super(context, r9, r10, r11, "upi-collect-from-vpa");
        this.A00 = 3;
        this.A01 = r12;
        this.A02 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r11, C33711jG r12, C196259ui r13, C175838zM r14, AZ6 az6, Integer num) {
        super(context, r11, r12, r13, az6, "upi-list-keys", 1);
        this.A00 = 10;
        this.A01 = r14;
        this.A02 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C183439Yg r12, AnonymousClass9F2 r13) {
        super(context, r9, r10, r11, "update-alias");
        this.A00 = 14;
        this.A01 = r12;
        this.A02 = r13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r11, C33711jG r12, C196259ui r13, C22448B8g b8g, C175828zL r15, AZ6 az6) {
        super(context, r11, r12, r13, az6, "upi-accept-collect", 31);
        this.A00 = 1;
        this.A01 = r15;
        this.A02 = b8g;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175978za(android.content.Context r7, X.AnonymousClass1KB r8, X.C33711jG r9, X.C196259ui r10, X.C22450B8i r11, X.C175848zN r12, int r13) {
        /*
            r6 = this;
            r0 = r6
            r6.A00 = r13
            switch(r13) {
                case 5: goto L_0x0014;
                case 6: goto L_0x0017;
                case 7: goto L_0x001a;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r5 = "upi-resume-mandate"
        L_0x0008:
            r6.A01 = r12
            r6.A02 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0014:
            java.lang.String r5 = "upi-accept-mandate-request"
            goto L_0x0008
        L_0x0017:
            java.lang.String r5 = "upi-revoke-mandate"
            goto L_0x0008
        L_0x001a:
            java.lang.String r5 = "upi-pause-mandate"
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175978za.<init>(android.content.Context, X.1KB, X.1jG, X.9ui, X.B8i, X.8zN, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, C184679bL r10, C33711jG r11, C196259ui r12, C175638z2 r13) {
        super(context, r9, r11, r12, "upi-get-blocked-vpas");
        this.A00 = 0;
        this.A01 = r13;
        this.A02 = r10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, B8Z b8z, C33711jG r11, C196259ui r12, C175828zL r13) {
        super(context, r9, r11, r12, "upi-reject-collect");
        this.A00 = 2;
        this.A01 = r13;
        this.A02 = b8z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175978za(Context context, AnonymousClass1KB r9, B8Z b8z, C33711jG r11, C196259ui r12, C175848zN r13) {
        super(context, r9, r11, r12, "upi-reject-mandate-request");
        this.A00 = 4;
        this.A01 = r13;
        this.A02 = b8z;
    }
}

package com.whatsapp.payments.ui;

import X.A3V;
import X.A6X;
import X.ARR;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1KL;
import X.AnonymousClass1QO;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.BD4;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C20087A6p;
import X.C20112A7u;
import X.C20157A9t;
import X.C20279AEn;
import X.C20285AEt;
import X.C20934Abo;
import X.C22931Dv;
import X.C25181Nf;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.payments.ui.components.PixPaymentInfoView;
import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class BrazilPixBottomSheet extends Hilt_BrazilPixBottomSheet {
    public CoordinatorLayout A00;
    public AnonymousClass11S A01;
    public C25181Nf A02;
    public C18030ve A03;
    public AnonymousClass1BI A04;
    public C20157A9t A05 = new Object();
    public AnonymousClass1QO A06;
    public BD4 A07;
    public PixPaymentInfoView A08;
    public A6X A09;
    public Boolean A0A = AnonymousClass000.A0h();
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G = true;
    public int A0H = -1;
    public ARR A0I;
    public C20934Abo A0J;
    public C20285AEt A0K;
    public String A0L;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0K2;
        String str;
        C20279AEn aEn;
        String str2;
        String str3;
        C18070vi.A0d(layoutInflater, 0);
        Bundle A15 = A15();
        C22931Dv r0 = AnonymousClass1BI.A00;
        this.A04 = C22931Dv.A01(A15.getString("merchantJid"));
        this.A0L = A15.getString("referenceId");
        this.A0J = (C20934Abo) A15.getParcelable("payment_settings");
        this.A0K = (C20285AEt) A15.getParcelable("interactive_message_content");
        this.A0H = A15.getInt("message_type");
        this.A0I = (ARR) A15.getParcelable("total_amount_money_representation");
        this.A0E = AnonymousClass8BR.A0y(A15);
        this.A0A = Boolean.valueOf(A15.getBoolean("is_quick_launch_enabled"));
        this.A0G = A15.getBoolean("should_enable_pix_key_flow");
        C20934Abo abo = this.A0J;
        if (abo != null) {
            A0K2 = abo.A01;
        } else {
            AnonymousClass1BI r1 = this.A04;
            if (r1 == null) {
                A0K2 = null;
            } else {
                C25181Nf r02 = this.A02;
                if (r02 != null) {
                    AnonymousClass1E7 A012 = r02.A01(r1);
                    if (A012.A0L() != null) {
                        A0K2 = A012.A0L();
                    } else {
                        A0K2 = A012.A0K();
                    }
                } else {
                    C18070vi.A11("conversationContactManager");
                    throw null;
                }
            }
        }
        this.A0B = A0K2;
        C20934Abo abo2 = this.A0J;
        if (abo2 != null) {
            if (this.A0G) {
                str2 = A3V.A01(abo2.A03, abo2.A02);
            } else {
                str2 = abo2.A00;
                if (str2 == null || str2.length() == 0) {
                    String str4 = this.A0L;
                    ARR arr = this.A0I;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("0014br.gov.bcb.pix01");
                    String A0y = AnonymousClass000.A0y(A00(abo2.A02), A10);
                    StringBuilder sb = new StringBuilder("000201");
                    sb.append("26");
                    sb.append(A00(A0y));
                    sb.append("52040000");
                    sb.append("5303986");
                    sb.append("5802BR");
                    sb.append("59");
                    String str5 = abo2.A01;
                    try {
                        str5 = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+").matcher(Normalizer.normalize(str5, Normalizer.Form.NFD)).replaceAll("");
                    } catch (Exception unused) {
                    }
                    if (str5.length() > 25) {
                        str5 = str5.substring(0, 25);
                    }
                    sb.append(A00(str5));
                    sb.append("6001");
                    sb.append("*");
                    if (arr != null && AnonymousClass8BU.A0n(arr).equals(AnonymousClass8BS.A0j(AnonymousClass1KL.A0A))) {
                        sb.append("54");
                        sb.append(A00(arr.A02.toString()));
                    }
                    if (str4 != null) {
                        StringBuilder A0y2 = AnonymousClass8BT.A0y("62", sb);
                        A0y2.append("05");
                        str3 = A00(AnonymousClass000.A0y(A00(str4), A0y2));
                    } else {
                        sb.append("62");
                        str3 = "070503***";
                    }
                    sb.append(str3);
                    sb.append("6304");
                    Object[] A1a = AnonymousClass3MW.A1a();
                    short s = -1;
                    for (byte b : sb.toString().getBytes()) {
                        s = (short) (s ^ (((short) b) << 8));
                        int i = 0;
                        do {
                            short s2 = 32768 & s;
                            int i2 = s << 1;
                            if (s2 != 0) {
                                i2 ^= 4129;
                            }
                            s = (short) i2;
                            i++;
                        } while (i < 8);
                    }
                    A1a[0] = Short.valueOf(s);
                    str2 = AnonymousClass000.A0y(String.format("%X", A1a), sb);
                }
            }
            this.A0D = str2;
        }
        this.A0F = A15.getString("total_amount");
        A01(this, (Integer) null, 0);
        C18030ve r3 = this.A03;
        if (r3 != null) {
            if (C18020vd.A05(C18040vf.A02, r3, 8038)) {
                C20285AEt aEt = this.A0K;
                if (aEt == null || (aEn = aEt.A02) == null || (str = aEn.A05) == null || str.length() == 0) {
                    str = C17890vO.A0Q();
                }
                this.A0C = str;
            }
            return super.A1q(bundle, layoutInflater, viewGroup);
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (A03(this)) {
            A02(this, this.A0C);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        this.A05.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }

    public static final void A01(BrazilPixBottomSheet brazilPixBottomSheet, Integer num, int i) {
        String str;
        C18030ve r2 = brazilPixBottomSheet.A03;
        if (r2 != null) {
            Integer num2 = num;
            int i2 = i;
            if (!C18020vd.A05(C18040vf.A02, r2, 8038) || i != 1 || num == null || num.intValue() != 5) {
                C20112A7u A022 = C20112A7u.A02();
                A022.A07("payment_method", "pix");
                String str2 = brazilPixBottomSheet.A0E;
                BD4 bd4 = brazilPixBottomSheet.A07;
                if (bd4 != null) {
                    C20087A6p.A02(A022, bd4, num2, "payment_instructions_prompt", str2, i2);
                    return;
                }
                str = "fieldStatEventLogger";
            } else {
                int i3 = 36;
                if (brazilPixBottomSheet.A0G) {
                    i3 = 37;
                }
                AnonymousClass1BI r1 = brazilPixBottomSheet.A04;
                if (r1 != null) {
                    A6X a6x = brazilPixBottomSheet.A09;
                    if (a6x != null) {
                        a6x.A03(r1, brazilPixBottomSheet.A0K, (Integer) null, brazilPixBottomSheet.A0C, "pix", (List) null, i3, brazilPixBottomSheet.A0H, 1, false, true, true, false);
                        return;
                    }
                    str = "orderDetailsMessageLogging";
                } else {
                    return;
                }
            }
        } else {
            str = "abProps";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final boolean A03(BrazilPixBottomSheet brazilPixBottomSheet) {
        if (!C18070vi.A19(brazilPixBottomSheet.A0A, true) || !"chat".equals(brazilPixBottomSheet.A0E)) {
            return false;
        }
        return true;
    }

    public static String A00(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, str.length());
        return AnonymousClass001.A1H(String.format(locale, "%02d", A1a), str, A10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.whatsapp.payments.ui.BrazilPixBottomSheet r6, java.lang.String r7) {
        /*
            java.lang.Integer r1 = X.C17880vN.A0l()
            r0 = 1
            A01(r6, r1, r0)
            X.1FL r3 = r6.A1B()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPixBottomSheet.Callback"
            X.C18070vi.A0z(r3, r0)
            X.B5Y r3 = (X.B5Y) r3
            java.lang.String r1 = r6.A0D
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.1BI r2 = r6.A04
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            X.ARR r0 = r6.A0I
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            X.Abo r0 = r6.A0J
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r3 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r3
            X.8Gd r0 = r3.A0C
            boolean r0 = r0.A0d(r1)
            java.lang.String r1 = "BrazilOrderDetailActivity"
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "onCopyPixKeyCTAClicked failed"
        L_0x0041:
            X.AnonymousClass8BS.A1F(r1, r0)
        L_0x0044:
            r2 = 2131894617(0x7f122159, float:1.9424044E38)
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x004e
            r2 = 2131894607(0x7f12214f, float:1.9424024E38)
        L_0x004e:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r6.A00
            if (r1 == 0) goto L_0x007e
            r0 = 0
            X.Bik r5 = X.C23520Bik.A01(r1, r2, r0)
            X.BIE r4 = r5.A0J
            android.view.ViewGroup$MarginLayoutParams r3 = X.C72463Mc.A0P(r4)
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            r1 = 2131168774(0x7f070e06, float:1.795186E38)
            int r2 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r6)
            int r1 = r0.getDimensionPixelSize(r1)
            int r0 = r3.topMargin
            r3.setMargins(r2, r0, r2, r1)
            r4.setLayoutParams(r3)
            r5.A08()
        L_0x007e:
            return
        L_0x007f:
            X.21K r0 = r3.A0K
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = "onCopyPixKeyCTAClicked triggered before order message is initialized"
            goto L_0x0041
        L_0x0086:
            r0 = 6
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A0d(r2, r3, r7, r0)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPixBottomSheet.A02(com.whatsapp.payments.ui.BrazilPixBottomSheet, java.lang.String):void");
    }
}

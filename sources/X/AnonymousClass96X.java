package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.96X  reason: invalid class name */
public class AnonymousClass96X extends C196229uf {
    public final AnonymousClass1FL A00;
    public final C18000vb A01;
    public final AnonymousClass1QO A02;
    public final C36401np A03;
    public final AnonymousClass00H A04;
    public final Resources A05;
    public final AnonymousClass129 A06;

    public ArrayList A04(Context context, ADQ adq, C20279AEn aEn, HashMap hashMap, boolean z, boolean z2) {
        List list;
        SpannableString spannableString;
        C20264ADw A002;
        C194019r2 r9 = new C194019r2((SpannableString) null, false);
        Context context2 = context;
        ADQ adq2 = adq;
        if (adq != null) {
            boolean z3 = adq2.A02;
            if (C18020vd.A05(C18040vf.A02, this.A04, 4443) && (A002 = adq2.A00()) != null) {
                int i = A002.A00;
                ARR arr = A002.A01;
                if (arr != null) {
                    Resources resources = context2.getResources();
                    Object[] A1b = AnonymousClass3MW.A1b();
                    C17880vN.A1S(A1b, i, 0);
                    String A0x = AnonymousClass3MW.A0x(resources, AnonymousClass1KL.A0A.BLd(this.A01, arr.A02.A00), A1b, 1, 2131893678);
                    spannableString = new SpannableString(this.A03.A06(context2, new C21426Ajt(this, 28), A0x, "installment-learn-more", C72463Mc.A02(context2)));
                    r9 = new C194019r2(spannableString, z3);
                }
            }
            spannableString = null;
            r9 = new C194019r2(spannableString, z3);
        }
        HashMap hashMap2 = hashMap;
        C191559mn r6 = (C191559mn) hashMap2.get(C17880vN.A0i());
        Object A0r = AnonymousClass8BT.A0r(hashMap2, 0);
        C191559mn r4 = (C191559mn) hashMap2.get(C108955ca.A0e());
        Object obj = hashMap2.get(C17880vN.A0m());
        Object obj2 = hashMap2.get(C17880vN.A0l());
        Object obj3 = hashMap2.get(AnonymousClass3MY.A0g());
        ArrayList A13 = AnonymousClass000.A13();
        if (obj != null) {
            if (C18020vd.A05(C18040vf.A02, this.A02.A02, 4780)) {
                String string = context2.getString(2131893292);
                String string2 = context2.getString(2131887451);
                A13.add(new AEZ(new C194019r2((SpannableString) null, false), new C194029r3((SpannableString) null, false), new C194039r4(A00(context2, this), false), "pix", string, "", string2, 2131232821));
            }
        }
        if (obj2 != null && z) {
            String string3 = context2.getString(2131893214);
            String string4 = context2.getString(2131893214);
            A13.add(new AEZ(new C194019r2((SpannableString) null, false), new C194029r3((SpannableString) null, false), new C194039r4(A00(context2, this), false), "checkout_lite", string3, "", string4, 2131232043));
        }
        if (obj3 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A04, 11671)) {
                String string5 = context2.getString(2131893213);
                String string6 = context2.getString(2131893213);
                A13.add(new AEZ(new C194019r2((SpannableString) null, false), new C194029r3((SpannableString) null, false), new C194039r4(A00(context2, this), false), "boleto", string5, "", string6, 2131231835));
            }
        }
        if (r4 != null && (list = r4.A05) != null && !list.isEmpty()) {
            A13.add(list.get(0));
        } else if (A0r != null) {
            SpannableString spannableString2 = new SpannableString(this.A03.A06(context2, new C21426Ajt(this, 29), context2.getString(2131893289), "pay-natively-learn-more", C72463Mc.A02(context2)));
            String string7 = context2.getString(2131893288);
            String string8 = context2.getString(2131887451);
            C194039r4 r8 = new C194039r4(A00(context2, this), !z2);
            A13.add(new AEZ(r9, new C194029r3(spannableString2, z2), r8, "WhatsappPay", string7, "", string8, 2131231837));
        }
        if (r6 != null) {
            String string9 = context2.getString(2131893290);
            C20267ADz aDz = r6.A02;
            C17960vV.A07(aDz);
            String str = aDz.A00;
            String string10 = context2.getString(2131888701);
            A13.add(new AEZ(new C194019r2((SpannableString) null, false), new C194029r3((SpannableString) null, false), new C194039r4(A00(context2, this), false), "CustomPaymentInstructions", string9, str, string10, 2131231684));
        }
        return A13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass96X(android.content.res.Resources r15, X.AnonymousClass1FL r16, X.AnonymousClass1PM r17, X.AnonymousClass11P r18, X.C18000vb r19, X.C25181Nf r20, X.C18030ve r21, X.AnonymousClass1QO r22, X.AnonymousClass1QS r23, X.AnonymousClass1R2 r24, X.AnonymousClass129 r25, X.C36401np r26, X.AnonymousClass00H r27) {
        /*
            r14 = this;
            r0 = r27
            java.lang.Object r5 = r0.get()
            X.1o3 r5 = (X.C36531o3) r5
            r2 = r14
            r3 = r15
            r4 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = r16
            r14.A00 = r1
            r14.A03 = r13
            r14.A05 = r15
            r1 = r25
            r14.A06 = r1
            r14.A01 = r7
            r14.A02 = r10
            r14.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96X.<init>(android.content.res.Resources, X.1FL, X.1PM, X.11P, X.0vb, X.1Nf, X.0ve, X.1QO, X.1QS, X.1R2, X.129, X.1np, X.00H):void");
    }

    public static SpannableString A00(Context context, AnonymousClass96X r13) {
        String string = r13.A05.getString(2131893293);
        C18030ve r3 = r13.A04;
        boolean A052 = C18020vd.A05(C18040vf.A02, r3, 10231);
        C36401np r4 = r13.A03;
        Context context2 = context;
        if (A052) {
            return new SpannableString(r4.A06(context2, new C21426Ajt(r13, 27), string, "payment-protection-link", C72463Mc.A02(context)));
        }
        String[] strArr = {"payment-protection-link"};
        String[] strArr2 = {r3.A0I(3014)};
        Runnable[] runnableArr = new Runnable[3];
        C21422Ajp.A00(runnableArr, 25, 0);
        C21422Ajp.A00(runnableArr, 26, 1);
        runnableArr[2] = new C21422Ajp(27);
        return r4.A04(context2, string, runnableArr, strArr, strArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.ADz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.ADz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.ADz} */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A06(android.content.Context r14, X.AW0 r15, X.C20279AEn r16) {
        /*
            r13 = this;
            r0 = r16
            java.util.HashMap r1 = super.A06(r14, r15, r0)
            java.util.List r2 = r0.A0Q
            if (r2 == 0) goto L_0x00a0
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00a0
            java.util.Iterator r5 = r2.iterator()
        L_0x0014:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r8 = r5.next()
            X.ADj r8 = (X.C20251ADj) r8
            java.lang.String r0 = "pix_static_code"
            java.lang.String r4 = r8.A01
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "pix_dynamic_code"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0056
        L_0x0032:
            X.0ve r3 = r13.A04
            r2 = 4780(0x12ac, float:6.698E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0056
            java.lang.Integer r2 = X.C17880vN.A0m()
            r0 = 2131893215(0x7f121bdf, float:1.94212E38)
            java.lang.String r10 = r14.getString(r0)
            r7 = 0
            r12 = 6
        L_0x004b:
            X.9mn r6 = new X.9mn
            r11 = r7
            r9 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0052:
            r1.put(r2, r6)
            goto L_0x0014
        L_0x0056:
            X.1QO r2 = r13.A02
            java.util.List r0 = java.util.Collections.singletonList(r8)
            boolean r0 = r2.A0O(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r2 = X.C17880vN.A0l()
            r0 = 2131893214(0x7f121bde, float:1.9421198E38)
            java.lang.String r10 = r14.getString(r0)
            r7 = 0
            r12 = 5
            goto L_0x004b
        L_0x0070:
            X.0ve r3 = r13.A04
            r2 = 11671(0x2d97, float:1.6355E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "boleto"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r2 = X.AnonymousClass3MY.A0g()
            r0 = 2131888292(0x7f1208a4, float:1.9411215E38)
            java.lang.String r10 = r14.getString(r0)
            r0 = 2131231835(0x7f08045b, float:1.8079762E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r12 = 8
            r7 = 0
            X.9mn r6 = new X.9mn
            r11 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0052
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96X.A06(android.content.Context, X.AW0, X.AEn):java.util.HashMap");
    }

    public boolean A07(AW0 aw0, AnonymousClass1BI r5, C20279AEn aEn) {
        A5D BUf;
        AZ9 A052 = this.A06.A05("FBPAY");
        if (A052 == null || (BUf = A052.BUf()) == null || !BUf.A02(aw0, aEn, r5.user)) {
            return false;
        }
        return true;
    }

    public HashMap A05(Context context) {
        HashMap A052 = super.A05(context);
        A052.put(AnonymousClass3MY.A0f(), context.getString(2131893222));
        return A052;
    }
}

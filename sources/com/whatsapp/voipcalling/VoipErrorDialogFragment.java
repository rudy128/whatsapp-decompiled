package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C24921Me;
import X.C60592oI;
import X.C86294Rb;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipErrorDialogFragment extends Hilt_VoipErrorDialogFragment {
    public int A00;
    public AnonymousClass11S A01;
    public C86294Rb A02;
    public AnonymousClass1M9 A03;
    public C24921Me A04;
    public ArrayList A05 = AnonymousClass000.A13();
    public int A06;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        return X.AnonymousClass3MX.A16(r9, A03(r9.A05), new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        return A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
        r4 = r9.A06;
        r0 = new java.lang.Object[1];
        X.C17880vN.A1T(r0, r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        return r7.A0K(r0, r6, (long) r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A01() {
        /*
            r9 = this;
            int r0 = r9.A00
            r3 = 0
            r5 = 1
            switch(r0) {
                case 1: goto L_0x00e0;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00a1;
                case 5: goto L_0x009d;
                case 6: goto L_0x0099;
                case 7: goto L_0x0095;
                case 8: goto L_0x0091;
                case 9: goto L_0x008d;
                case 10: goto L_0x0089;
                case 11: goto L_0x0085;
                case 12: goto L_0x0081;
                case 13: goto L_0x007d;
                case 14: goto L_0x0079;
                case 15: goto L_0x0075;
                case 16: goto L_0x0071;
                case 17: goto L_0x006d;
                case 18: goto L_0x005d;
                case 19: goto L_0x0059;
                case 20: goto L_0x0055;
                case 21: goto L_0x0059;
                case 22: goto L_0x0051;
                case 23: goto L_0x004d;
                case 24: goto L_0x0095;
                case 25: goto L_0x0049;
                case 26: goto L_0x0045;
                case 27: goto L_0x005d;
                case 28: goto L_0x0059;
                case 29: goto L_0x0059;
                case 30: goto L_0x0041;
                case 31: goto L_0x003d;
                case 32: goto L_0x000f;
                case 33: goto L_0x0039;
                case 34: goto L_0x0035;
                case 35: goto L_0x0031;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Unknown error"
            X.C17960vV.A0F(r3, r0)
            java.lang.String r0 = ""
            return r0
        L_0x000f:
            java.util.ArrayList r2 = r9.A05
            int r0 = r2.size()
            if (r0 != r5) goto L_0x002d
            X.11S r1 = r9.A01
            java.lang.Object r0 = r2.get(r3)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x002d
            r0 = 2131889991(0x7f120f47, float:1.9414661E38)
            java.lang.String r0 = r9.A1H(r0)
            return r0
        L_0x002d:
            r2 = 2131889990(0x7f120f46, float:1.941466E38)
            goto L_0x0060
        L_0x0031:
            r0 = 2131890162(0x7f120ff2, float:1.9415008E38)
            goto L_0x00b3
        L_0x0035:
            r0 = 2131889064(0x7f120ba8, float:1.941278E38)
            goto L_0x00b3
        L_0x0039:
            r0 = 2131898020(0x7f122ea4, float:1.9430946E38)
            goto L_0x00b3
        L_0x003d:
            r0 = 2131895465(0x7f1224a9, float:1.9425764E38)
            goto L_0x00b3
        L_0x0041:
            r0 = 2131898169(0x7f122f39, float:1.9431248E38)
            goto L_0x00b3
        L_0x0045:
            r0 = 2131897254(0x7f122ba6, float:1.9429392E38)
            goto L_0x00b3
        L_0x0049:
            r2 = 2131895150(0x7f12236e, float:1.9425125E38)
            goto L_0x0060
        L_0x004d:
            r0 = 2131894630(0x7f122166, float:1.942407E38)
            goto L_0x00b3
        L_0x0051:
            r0 = 2131891437(0x7f1214ed, float:1.9417594E38)
            goto L_0x00b3
        L_0x0055:
            r0 = 2131888270(0x7f12088e, float:1.941117E38)
            goto L_0x00b3
        L_0x0059:
            r0 = 2131887653(0x7f120625, float:1.940992E38)
            goto L_0x00b3
        L_0x005d:
            r2 = 2131898156(0x7f122f2c, float:1.9431222E38)
        L_0x0060:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.util.ArrayList r0 = r9.A05
            java.lang.String r0 = r9.A03(r0)
            java.lang.String r0 = X.AnonymousClass3MX.A16(r9, r0, r1, r3, r2)
            return r0
        L_0x006d:
            r0 = 2131896640(0x7f122940, float:1.9428147E38)
            goto L_0x00b3
        L_0x0071:
            r0 = 2131891704(0x7f1215f8, float:1.9418136E38)
            goto L_0x00b3
        L_0x0075:
            r0 = 2131891695(0x7f1215ef, float:1.9418117E38)
            goto L_0x00b3
        L_0x0079:
            r0 = 2131891702(0x7f1215f6, float:1.9418132E38)
            goto L_0x00b3
        L_0x007d:
            r0 = 2131891703(0x7f1215f7, float:1.9418134E38)
            goto L_0x00b3
        L_0x0081:
            r0 = 2131891694(0x7f1215ee, float:1.9418115E38)
            goto L_0x00b3
        L_0x0085:
            r0 = 2131891693(0x7f1215ed, float:1.9418113E38)
            goto L_0x00b3
        L_0x0089:
            r0 = 2131891697(0x7f1215f1, float:1.9418121E38)
            goto L_0x00b3
        L_0x008d:
            r0 = 2131898172(0x7f122f3c, float:1.9431254E38)
            goto L_0x00b3
        L_0x0091:
            r0 = 2131898168(0x7f122f38, float:1.9431246E38)
            goto L_0x00b3
        L_0x0095:
            r0 = 2131898174(0x7f122f3e, float:1.9431258E38)
            goto L_0x00b3
        L_0x0099:
            r0 = 2131898175(0x7f122f3f, float:1.943126E38)
            goto L_0x00b3
        L_0x009d:
            r0 = 2131898170(0x7f122f3a, float:1.943125E38)
            goto L_0x00b3
        L_0x00a1:
            r2 = 2131898201(0x7f122f59, float:1.9431313E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 64
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.String r0 = r9.A1I(r2, r1)
            return r0
        L_0x00b0:
            r0 = 2131898208(0x7f122f60, float:1.9431327E38)
        L_0x00b3:
            java.lang.String r0 = r9.A1H(r0)
            return r0
        L_0x00b8:
            java.util.ArrayList r8 = r9.A05
            int r0 = r8.size()
            X.0vb r7 = r9.A01
            if (r0 != r5) goto L_0x00dc
            r6 = 2131755501(0x7f1001ed, float:1.9141883E38)
            int r0 = r9.A06
            long r1 = (long) r0
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = r9.A03(r8)
            r4[r3] = r0
            int r0 = r9.A06
            X.C17880vN.A1T(r4, r0, r5)
            java.lang.String r0 = r7.A0K(r4, r6, r1)
            return r0
        L_0x00dc:
            r6 = 2131755500(0x7f1001ec, float:1.9141881E38)
            goto L_0x00e5
        L_0x00e0:
            X.0vb r7 = r9.A01
            r6 = 2131755499(0x7f1001eb, float:1.914188E38)
        L_0x00e5:
            int r4 = r9.A06
            long r1 = (long) r4
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C17880vN.A1T(r0, r4, r3)
            java.lang.String r0 = r7.A0K(r0, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A01():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        return A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A02() {
        /*
            r9 = this;
            int r0 = r9.A00
            java.lang.String r1 = ""
            r7 = 0
            switch(r0) {
                case 1: goto L_0x0052;
                case 2: goto L_0x004a;
                case 3: goto L_0x0046;
                case 4: goto L_0x0042;
                case 5: goto L_0x003e;
                case 6: goto L_0x003e;
                case 7: goto L_0x003e;
                case 8: goto L_0x003a;
                case 9: goto L_0x0036;
                case 10: goto L_0x0032;
                case 11: goto L_0x0032;
                case 12: goto L_0x003a;
                case 13: goto L_0x0032;
                case 14: goto L_0x0032;
                case 15: goto L_0x0032;
                case 16: goto L_0x0032;
                case 17: goto L_0x0032;
                case 18: goto L_0x000d;
                case 19: goto L_0x002e;
                case 20: goto L_0x0046;
                case 21: goto L_0x002a;
                case 22: goto L_0x000d;
                case 23: goto L_0x0026;
                case 24: goto L_0x003e;
                case 25: goto L_0x000d;
                case 26: goto L_0x000d;
                case 27: goto L_0x000d;
                case 28: goto L_0x0022;
                case 29: goto L_0x001e;
                case 30: goto L_0x000d;
                case 31: goto L_0x001a;
                case 32: goto L_0x000d;
                case 33: goto L_0x0016;
                case 34: goto L_0x0012;
                case 35: goto L_0x000e;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Unknown error"
            X.C17960vV.A0F(r7, r0)
        L_0x000d:
            return r1
        L_0x000e:
            r0 = 2131890161(0x7f120ff1, float:1.9415006E38)
            goto L_0x004d
        L_0x0012:
            r0 = 2131889063(0x7f120ba7, float:1.9412779E38)
            goto L_0x004d
        L_0x0016:
            r0 = 2131898021(0x7f122ea5, float:1.9430948E38)
            goto L_0x004d
        L_0x001a:
            r0 = 2131895466(0x7f1224aa, float:1.9425766E38)
            goto L_0x004d
        L_0x001e:
            r0 = 2131895111(0x7f122347, float:1.9425046E38)
            goto L_0x004d
        L_0x0022:
            r0 = 2131895151(0x7f12236f, float:1.9425127E38)
            goto L_0x004d
        L_0x0026:
            r0 = 2131897254(0x7f122ba6, float:1.9429392E38)
            goto L_0x004d
        L_0x002a:
            r0 = 2131887833(0x7f1206d9, float:1.9410284E38)
            goto L_0x004d
        L_0x002e:
            r0 = 2131887654(0x7f120626, float:1.9409921E38)
            goto L_0x004d
        L_0x0032:
            r0 = 2131898113(0x7f122f01, float:1.9431135E38)
            goto L_0x004d
        L_0x0036:
            r0 = 2131898173(0x7f122f3d, float:1.9431256E38)
            goto L_0x004d
        L_0x003a:
            r0 = 2131898169(0x7f122f39, float:1.9431248E38)
            goto L_0x004d
        L_0x003e:
            r0 = 2131898176(0x7f122f40, float:1.9431262E38)
            goto L_0x004d
        L_0x0042:
            r0 = 2131898202(0x7f122f5a, float:1.9431315E38)
            goto L_0x004d
        L_0x0046:
            r0 = 2131898209(0x7f122f61, float:1.943133E38)
            goto L_0x004d
        L_0x004a:
            r0 = 2131898155(0x7f122f2b, float:1.943122E38)
        L_0x004d:
            java.lang.String r0 = r9.A1H(r0)
            return r0
        L_0x0052:
            java.util.ArrayList r8 = r9.A05
            int r1 = r8.size()
            r0 = 3
            r6 = 1
            X.0vb r5 = r9.A01
            if (r1 > r0) goto L_0x0073
            r4 = 2131755498(0x7f1001ea, float:1.9141877E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r9.A03(r8)
            r1[r7] = r0
            java.lang.String r0 = r5.A0K(r1, r4, r2)
            return r0
        L_0x0073:
            r4 = 2131755497(0x7f1001e9, float:1.9141875E38)
            int r0 = r8.size()
            int r0 = r0 - r6
            long r1 = (long) r0
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            java.util.List r0 = r8.subList(r7, r6)
            java.lang.String r0 = r9.A03(r0)
            r3[r7] = r0
            java.util.ArrayList r0 = r9.A05
            int r0 = r0.size()
            int r0 = r0 - r6
            X.C17880vN.A1T(r3, r0, r6)
            java.lang.String r0 = r5.A0K(r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A02():java.lang.String");
    }

    public static VoipErrorDialogFragment A00(C86294Rb r2, int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A1R(A0D);
        voipErrorDialogFragment.A02 = r2;
        return voipErrorDialogFragment;
    }

    private String A03(List list) {
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A14.add(AnonymousClass3MY.A0q(this.A04, this.A03.A0H(C17880vN.A0Q(it))));
        }
        if (A14.size() <= 3) {
            return C60592oI.A00(this.A04.A02, A14, true);
        }
        int size = A14.size() - 1;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = A14.get(0);
        C17880vN.A1T(A1b, size, 1);
        return this.A01.A0K(A1b, 2131755311, (long) size);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("error");
            this.A05 = bundle2.getParcelableArrayList("user_jids");
            this.A06 = bundle2.getInt("call_size");
        }
        if (this.A05 == null) {
            this.A05 = AnonymousClass000.A13();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r1 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r1 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r1.getBoolean("finish", false) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r3 = true;
        r4.A0P(new X.AnonymousClass4bD(r5, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = r4.create();
        r1.setCanceledOnTouchOutside(!r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r1 = new X.C88814ar(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r4.setNegativeButton(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.A02()
            java.lang.String r1 = r5.A01()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            X.C17960vV.A0C(r0)
            X.3Rj r4 = X.AnonymousClass4a6.A04(r5)
            java.lang.String r0 = r5.A02()
            r4.A0k(r0)
            java.lang.String r0 = r5.A01()
            r4.A0S(r0)
            r4.A0T(r2)
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x003a;
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                case 4: goto L_0x003a;
                case 5: goto L_0x0083;
                case 6: goto L_0x003a;
                case 7: goto L_0x003a;
                case 8: goto L_0x003a;
                case 9: goto L_0x003a;
                case 10: goto L_0x003a;
                case 11: goto L_0x003a;
                case 12: goto L_0x003a;
                case 13: goto L_0x003a;
                case 14: goto L_0x003a;
                case 15: goto L_0x003a;
                case 16: goto L_0x003a;
                case 17: goto L_0x003a;
                case 18: goto L_0x003a;
                case 19: goto L_0x0089;
                case 20: goto L_0x0089;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.String r0 = "Unknown error"
            X.C17960vV.A0F(r3, r0)
        L_0x003a:
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0064;
                case 2: goto L_0x0064;
                case 3: goto L_0x0064;
                case 4: goto L_0x0064;
                case 5: goto L_0x006a;
                case 6: goto L_0x0064;
                case 7: goto L_0x0064;
                case 8: goto L_0x0064;
                case 9: goto L_0x0064;
                case 10: goto L_0x0064;
                case 11: goto L_0x0075;
                case 12: goto L_0x0064;
                case 13: goto L_0x0064;
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0064;
                case 17: goto L_0x0064;
                case 18: goto L_0x0064;
                case 19: goto L_0x006a;
                case 20: goto L_0x006a;
                case 21: goto L_0x0075;
                case 22: goto L_0x0075;
                case 23: goto L_0x0075;
                case 24: goto L_0x0075;
                case 25: goto L_0x0064;
                case 26: goto L_0x0075;
                case 27: goto L_0x0064;
                case 28: goto L_0x0064;
                case 29: goto L_0x0064;
                case 30: goto L_0x0064;
                case 31: goto L_0x0064;
                case 32: goto L_0x0064;
                case 33: goto L_0x0064;
                case 34: goto L_0x0064;
                case 35: goto L_0x0064;
                default: goto L_0x003f;
            }
        L_0x003f:
            java.lang.String r0 = "Unknown error"
            X.C17960vV.A0F(r3, r0)
        L_0x0044:
            android.os.Bundle r1 = r5.A06
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "finish"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x005a
            r3 = 1
            r1 = 3
            X.4bD r0 = new X.4bD
            r0.<init>(r5, r1)
            r4.A0P(r0)
        L_0x005a:
            X.05w r1 = r4.create()
            r0 = r3 ^ 1
            r1.setCanceledOnTouchOutside(r0)
            return r1
        L_0x0064:
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 36
            goto L_0x006f
        L_0x006a:
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 37
        L_0x006f:
            X.4ar r1 = new X.4ar
            r1.<init>(r5, r0)
            goto L_0x007f
        L_0x0075:
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 37
            X.758 r1 = new X.758
            r1.<init>(r5, r0)
        L_0x007f:
            r4.setNegativeButton(r2, r1)
            goto L_0x0044
        L_0x0083:
            r2 = 2131898162(0x7f122f32, float:1.9431234E38)
            r1 = 34
            goto L_0x008e
        L_0x0089:
            r2 = 2131887687(0x7f120647, float:1.9409988E38)
            r1 = 35
        L_0x008e:
            X.4ar r0 = new X.4ar
            r0.<init>(r5, r1)
            r4.setPositiveButton(r2, r0)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}

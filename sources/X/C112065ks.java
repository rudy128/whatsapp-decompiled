package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5ks  reason: invalid class name and case insensitive filesystem */
public class C112065ks extends C38391rD {
    public final HashMap A00 = C17880vN.A11();
    public final List A01;
    public final /* synthetic */ ViewSharedContactArrayActivity A02;

    public C112065ks(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        this.A02 = viewSharedContactArrayActivity;
        this.A01 = list;
    }

    public int A0Q() {
        return this.A01.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0331, code lost:
        if (r9.A02.A0S == false) goto L_0x0333;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r23, int r24) {
        /*
            r22 = this;
            r6 = r23
            r9 = r22
            java.util.List r0 = r9.A01
            r1 = r24
            java.lang.Object r2 = r0.get(r1)
            int r1 = r6.A01
            r7 = 2
            r12 = 8
            r8 = 4
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0351
            if (r1 == r5) goto L_0x005c
            if (r1 == r7) goto L_0x0322
            r0 = 3
            if (r1 == r0) goto L_0x0023
            if (r1 == r8) goto L_0x0351
            r0 = 5
            if (r1 == r0) goto L_0x005c
        L_0x0022:
            return
        L_0x0023:
            X.5mh r6 = (X.C113195mh) r6
            X.6hh r2 = (X.C129376hh) r2
            android.widget.TextView r10 = r6.A01
            r10.setTextDirection(r0)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r8 = r9.A02
            X.11S r0 = r8.A02
            X.1E7 r7 = r2.A02
            boolean r0 = X.AnonymousClass3Ma.A1V(r0, r7)
            if (r0 == 0) goto L_0x004d
            r0 = 2131897739(0x7f122d8b, float:1.9430376E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x003f:
            r10.setText(r0)
            android.view.View r3 = r6.A00
            r0 = 34
            X.6LF r1 = new X.6LF
            r1.<init>(r9, r2, r0)
            goto L_0x0316
        L_0x004d:
            r3 = 2131897738(0x7f122d8a, float:1.9430374E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.1Me r0 = r8.A07
            X.AnonymousClass3MX.A1N(r0, r7, r1, r4)
            java.lang.String r0 = r8.getString(r3, r1)
            goto L_0x003f
        L_0x005c:
            r0 = r6
            X.5n4 r0 = (X.C113425n4) r0
            r21 = r0
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r1 = r9.A02
            android.view.View r3 = r0.A01
            r3.setClickable(r5)
            android.widget.ImageView r11 = r0.A04
            r11.setVisibility(r4)
            r11.setClickable(r5)
            android.widget.ImageView r10 = r0.A05
            r10.setVisibility(r4)
            r10.setClickable(r5)
            android.widget.ImageView r7 = r0.A03
            r7.setVisibility(r4)
            int r0 = r6.A01
            if (r0 != r5) goto L_0x011f
            X.6hf r2 = (X.C129356hf) r2
            int r14 = r2.A01
            int r13 = r2.A00
            java.lang.Object r0 = r2.A02
            java.lang.String r2 = r2.A03
            r6 = 0
        L_0x008c:
            java.util.ArrayList r15 = r1.A0X
            int r13 = r13 + r6
            java.lang.Object r6 = r15.get(r13)
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            X.6UK r6 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r6, r14)
            r13 = r21
            android.view.View r13 = r13.A00
            r20 = r13
            r13.setTag(r6)
            boolean r13 = r0 instanceof X.C129926ib
            if (r13 == 0) goto L_0x012c
            X.6ib r0 = (X.C129926ib) r0
            r6.A00 = r0
            r17 = 2131233235(0x7f0809d3, float:1.8082602E38)
            boolean r13 = r1.A0S
            if (r13 == 0) goto L_0x00b4
            r17 = 2131231762(0x7f080412, float:1.8079614E38)
        L_0x00b4:
            java.lang.String r13 = r0.A02
            r14 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r15 = X.AnonymousClass1EG.A0E(r13, r14)
            int r13 = r0.A00
            if (r13 != 0) goto L_0x0118
            java.lang.String r13 = r0.A03
            java.lang.String r16 = X.AnonymousClass1EG.A0E(r13, r14)
        L_0x00c6:
            boolean r6 = r6.A01
            r18 = r5
            r19 = r6
            r14 = r1
            r13 = r21
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0c(r13, r14, r15, r16, r17, r18, r19)
            boolean r6 = r1.A0S
            if (r6 != 0) goto L_0x031d
            com.whatsapp.jid.UserJid r6 = r0.A01
            if (r6 == 0) goto L_0x034a
            X.11S r0 = r1.A02
            boolean r0 = r0.A0O(r6)
            if (r0 != 0) goto L_0x034a
            X.1M9 r0 = r1.A04
            X.1E7 r5 = r0.A0H(r6)
            r7.setVisibility(r4)
            X.78R r0 = new X.78R
            r0.<init>(r9, r6, r2, r12)
            r3.setOnClickListener(r0)
            r2 = 1041865114(0x3e19999a, float:0.15)
            X.2vF r0 = new X.2vF
            r0.<init>(r2, r2, r2, r2)
            r11.setOnTouchListener(r0)
            r1 = 3
            X.78B r0 = new X.78B
            r0.<init>(r9, r6, r5, r1)
            r11.setOnClickListener(r0)
            X.2vF r0 = new X.2vF
            r0.<init>(r2, r2, r2, r2)
            r10.setOnTouchListener(r0)
            r10.setVisibility(r4)
            r0 = 19
            X.AnonymousClass78M.A00(r10, r9, r5, r0)
            return
        L_0x0118:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Phone> r14 = android.provider.ContactsContract.CommonDataKinds.Phone.class
            java.lang.String r16 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0Q(r1, r14, r13)
            goto L_0x00c6
        L_0x011f:
            X.6hg r2 = (X.C129366hg) r2
            r14 = 0
            int r13 = r2.A00
            int r6 = r2.A01
            java.lang.Object r0 = r2.A02
            java.lang.String r2 = r2.A03
            goto L_0x008c
        L_0x012c:
            boolean r10 = r0 instanceof X.C130276jA
            if (r10 == 0) goto L_0x01fa
            X.6jA r0 = (X.C130276jA) r0
            r6.A00 = r0
            java.lang.Class r2 = r0.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r8 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r2 != r8) goto L_0x016a
            java.lang.String r2 = r0.A02
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r10 = X.AnonymousClass1EG.A0E(r2, r3)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x0165
            java.lang.String r0 = r0.A03
            java.lang.String r11 = X.AnonymousClass1EG.A0E(r0, r3)
        L_0x014c:
            r12 = 2131232082(0x7f080552, float:1.8080263E38)
            r13 = 2
        L_0x0150:
            boolean r0 = r6.A01
            r14 = r0
            r9 = r1
            r8 = r21
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0c(r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0V(r21)
            r7.setVisibility(r4)
        L_0x015f:
            r0 = r20
            r0.setClickable(r5)
            return
        L_0x0165:
            java.lang.String r11 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0Q(r1, r8, r2)
            goto L_0x014c
        L_0x016a:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r8 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r2 != r8) goto L_0x0022
            X.6z2 r12 = r0.A04
            if (r12 == 0) goto L_0x01f7
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r3 = r12.A03
            if (r3 == 0) goto L_0x018c
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x018c
            java.lang.String r2 = X.C139556z2.A00(r3)
            r11.append(r2)
            r2 = 10
            r11.append(r2)
        L_0x018c:
            java.lang.String r3 = r12.A00
            r13 = 1
            if (r3 == 0) goto L_0x01f5
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01f5
            r11.append(r3)
            r10 = 1
        L_0x019b:
            java.lang.String r3 = r12.A02
            java.lang.String r9 = " "
            if (r3 == 0) goto L_0x01b0
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01b0
            if (r10 == 0) goto L_0x01ac
            r11.append(r9)
        L_0x01ac:
            r11.append(r3)
            r10 = 1
        L_0x01b0:
            java.lang.String r3 = r12.A04
            if (r3 == 0) goto L_0x01f3
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01f3
            if (r10 == 0) goto L_0x01bf
            r11.append(r9)
        L_0x01bf:
            r11.append(r3)
        L_0x01c2:
            java.lang.String r3 = r12.A01
            if (r3 == 0) goto L_0x01d4
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01d4
            if (r13 == 0) goto L_0x01d1
            r11.append(r9)
        L_0x01d1:
            r11.append(r3)
        L_0x01d4:
            java.lang.String r2 = r11.toString()
        L_0x01d8:
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r10 = X.AnonymousClass1EG.A0E(r2, r3)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x01ee
            java.lang.String r0 = r0.A03
            java.lang.String r11 = X.AnonymousClass1EG.A0E(r0, r3)
        L_0x01e8:
            r12 = 2131232057(0x7f080539, float:1.8080213E38)
            r13 = 3
            goto L_0x0150
        L_0x01ee:
            java.lang.String r11 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0Q(r1, r8, r2)
            goto L_0x01e8
        L_0x01f3:
            r13 = r10
            goto L_0x01c2
        L_0x01f5:
            r10 = 0
            goto L_0x019b
        L_0x01f7:
            java.lang.String r2 = "null"
            goto L_0x01d8
        L_0x01fa:
            boolean r10 = r0 instanceof X.C136406tl
            if (r10 == 0) goto L_0x029d
            X.6tl r0 = (X.C136406tl) r0
            r0.toString()
            java.lang.String r9 = r0.A02
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "BDAY"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0247
            java.lang.String r2 = "--"
            boolean r2 = r9.startsWith(r2)     // Catch:{ ParseException -> 0x0243 }
            if (r2 == 0) goto L_0x0236
            java.lang.String r10 = "--MM-dd"
        L_0x0219:
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ ParseException -> 0x0243 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0243 }
            r2.<init>(r10, r3)     // Catch:{ ParseException -> 0x0243 }
            java.util.Date r2 = r2.parse(r9)     // Catch:{ ParseException -> 0x0243 }
            X.C17960vV.A07(r2)     // Catch:{ ParseException -> 0x0243 }
            long r2 = r2.getTime()     // Catch:{ ParseException -> 0x0243 }
            if (r5 == 0) goto L_0x023a
            X.0vb r5 = r1.A0F     // Catch:{ ParseException -> 0x0243 }
            java.lang.String r9 = X.AnonymousClass11X.A02(r5, r2)     // Catch:{ ParseException -> 0x0243 }
            goto L_0x0247
        L_0x0236:
            java.lang.String r10 = "yyyy-MM-dd"
            r5 = 0
            goto L_0x0219
        L_0x023a:
            X.0vb r10 = r1.A0F     // Catch:{ ParseException -> 0x0243 }
            X.11Y r5 = X.AnonymousClass11X.A00     // Catch:{ ParseException -> 0x0243 }
            java.lang.String r9 = r5.A0B(r10, r2)     // Catch:{ ParseException -> 0x0243 }
            goto L_0x0247
        L_0x0243:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0247:
            java.util.HashMap r3 = X.AnonymousClass73C.A0E
            java.lang.String r2 = r0.A01
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x0278
            java.util.HashMap r3 = X.AnonymousClass73C.A0D
            java.lang.String r2 = r0.A01
            java.lang.Object r3 = r3.get(r2)
        L_0x0259:
            java.lang.String r3 = (java.lang.String) r3
        L_0x025b:
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r11 = X.AnonymousClass1EG.A0E(r9, r2)
            java.lang.String r12 = X.AnonymousClass1EG.A0E(r3, r2)
            boolean r2 = r6.A01
            r13 = 2131232057(0x7f080539, float:1.8080213E38)
            r14 = 3
            r15 = r2
            r10 = r1
            r9 = r21
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0c(r9, r10, r11, r12, r13, r14, r15)
            r6.A00 = r0
            r7.setVisibility(r8)
            goto L_0x02ca
        L_0x0278:
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "URL"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0296
            java.util.Set r2 = r0.A04
            java.lang.Object[] r3 = r2.toArray()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x028e
            r3 = r3[r4]
            goto L_0x0259
        L_0x028e:
            r2 = 2131897967(0x7f122e6f, float:1.9430838E38)
            java.lang.String r3 = r1.getString(r2)
            goto L_0x025b
        L_0x0296:
            java.util.HashMap r2 = X.AnonymousClass73C.A0D
            java.lang.Object r3 = r2.get(r3)
            goto L_0x0259
        L_0x029d:
            boolean r10 = r0 instanceof X.C128206fc
            if (r10 == 0) goto L_0x02ea
            X.6fc r0 = (X.C128206fc) r0
            java.lang.String r4 = r0.A01
            int r2 = r0.A00
            switch(r2) {
                case 1: goto L_0x02e6;
                case 2: goto L_0x02e2;
                case 3: goto L_0x02de;
                case 4: goto L_0x02da;
                case 5: goto L_0x02d6;
                case 6: goto L_0x02d2;
                case 7: goto L_0x02ce;
                default: goto L_0x02aa;
            }
        L_0x02aa:
            r2 = 2131897967(0x7f122e6f, float:1.9430838E38)
        L_0x02ad:
            java.lang.String r3 = r1.getString(r2)
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = X.AnonymousClass1EG.A0E(r4, r2)
            java.lang.String r10 = X.AnonymousClass1EG.A0E(r3, r2)
            boolean r2 = r6.A01
            r11 = 2131232228(0x7f0805e4, float:1.808056E38)
            r12 = 3
            r13 = r2
            r8 = r1
            r7 = r21
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0c(r7, r8, r9, r10, r11, r12, r13)
            r6.A00 = r0
        L_0x02ca:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0V(r21)
            return
        L_0x02ce:
            r2 = 2131898494(0x7f12307e, float:1.9431907E38)
            goto L_0x02ad
        L_0x02d2:
            r2 = 2131898491(0x7f12307b, float:1.9431901E38)
            goto L_0x02ad
        L_0x02d6:
            r2 = 2131898496(0x7f123080, float:1.9431911E38)
            goto L_0x02ad
        L_0x02da:
            r2 = 2131898492(0x7f12307c, float:1.9431903E38)
            goto L_0x02ad
        L_0x02de:
            r2 = 2131898495(0x7f12307f, float:1.943191E38)
            goto L_0x02ad
        L_0x02e2:
            r2 = 2131898490(0x7f12307a, float:1.94319E38)
            goto L_0x02ad
        L_0x02e6:
            r2 = 2131898493(0x7f12307d, float:1.9431905E38)
            goto L_0x02ad
        L_0x02ea:
            boolean r10 = r0 instanceof X.C128186fa
            if (r10 == 0) goto L_0x0022
            X.6fa r0 = (X.C128186fa) r0
            java.lang.String r11 = r0.A01
            r10 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r12 = X.AnonymousClass1EG.A0E(r11, r10)
            boolean r6 = r6.A01
            java.lang.String r13 = ""
            r14 = 2131233235(0x7f0809d3, float:1.8082602E38)
            r10 = r21
            r11 = r1
            r15 = r5
            r16 = r6
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0c(r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = r1.A0S
            if (r1 != 0) goto L_0x031a
            r7.setVisibility(r4)
            r4 = 9
            X.78R r1 = new X.78R
            r1.<init>(r9, r0, r2, r4)
        L_0x0316:
            r3.setOnClickListener(r1)
            return
        L_0x031a:
            r7.setVisibility(r8)
        L_0x031d:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0V(r21)
            goto L_0x015f
        L_0x0322:
            X.5mg r6 = (X.C113185mg) r6
            X.6d8 r2 = (X.C126686d8) r2
            android.view.View r3 = r6.A00
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0333
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r9.A02
            boolean r1 = r0.A0S
            r0 = 0
            if (r1 != 0) goto L_0x0335
        L_0x0333:
            r0 = 8
        L_0x0335:
            r3.setVisibility(r0)
            android.view.View r1 = r6.A01
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0348
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r9.A02
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x0348
        L_0x0344:
            r1.setVisibility(r12)
            return
        L_0x0348:
            r12 = 0
            goto L_0x0344
        L_0x034a:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0V(r21)
            r7.setVisibility(r8)
            return
        L_0x0351:
            X.5ms r6 = (X.C113305ms) r6
            if (r1 != r8) goto L_0x0420
            X.6fK r2 = (X.C128026fK) r2
            int r8 = r2.A00
            X.73C r10 = r2.A01
        L_0x035b:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = r9.A02
            boolean r0 = r3.A0T
            if (r0 == 0) goto L_0x041d
            java.util.HashMap r2 = r9.A00
            boolean r0 = r2.containsKey(r10)
            if (r0 == 0) goto L_0x03ec
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r2.get(r10)
            boolean r5 = r1.equals(r0)
        L_0x0373:
            boolean r0 = r3.A0S
            if (r0 != 0) goto L_0x03e6
            X.11S r0 = r3.A02
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x03e6
            if (r5 != 0) goto L_0x03e6
            android.widget.Button r1 = r6.A00
            r1.setVisibility(r4)
            r0 = 30
            X.AnonymousClass78T.A00(r1, r9, r10, r8, r0)
        L_0x038b:
            com.whatsapp.TextEmojiLabel r9 = r6.A03
            java.lang.String r0 = r10.A02()
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r8 = X.AnonymousClass1EG.A0E(r0, r5)
            android.text.TextPaint r2 = r9.getPaint()
            X.1KW r1 = r3.A0D
            if (r8 != 0) goto L_0x03dc
            r0 = 0
        L_0x03a0:
            r9.setText(r0)
            java.util.List r0 = r10.A05
            if (r0 == 0) goto L_0x03da
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03da
            java.util.List r0 = r10.A05
            java.lang.Object r0 = r0.get(r4)
            X.6fb r0 = (X.C128196fb) r0
            java.lang.String r2 = r0.A00
        L_0x03b7:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x03cd
            android.widget.TextView r0 = r6.A02
            r0.setVisibility(r12)
        L_0x03c2:
            X.1pZ r1 = r3.A08
            android.widget.ImageView r0 = r6.A01
            r1.A0D(r0, r10)
            r0.setImportantForAccessibility(r7)
            return
        L_0x03cd:
            android.widget.TextView r1 = r6.A02
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r2, r5)
            r1.setText(r0)
            r1.setVisibility(r4)
            goto L_0x03c2
        L_0x03da:
            r2 = 0
            goto L_0x03b7
        L_0x03dc:
            X.7G7 r0 = new X.7G7
            r0.<init>()
            java.lang.CharSequence r0 = X.C43251zV.A02(r3, r2, r0, r1, r8)
            goto L_0x03a0
        L_0x03e6:
            android.widget.Button r0 = r6.A00
            r0.setVisibility(r12)
            goto L_0x038b
        L_0x03ec:
            java.util.List r0 = r10.A06
            if (r0 == 0) goto L_0x041d
            java.util.Iterator r11 = r0.iterator()
        L_0x03f4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x041b
            java.lang.Object r0 = r11.next()
            X.6ib r0 = (X.C129926ib) r0
            X.1M9 r1 = r3.A04
            java.lang.String r0 = r0.A02
            X.1E7 r1 = r1.A0J(r0, r5)
            if (r1 == 0) goto L_0x03f4
            X.2lf r0 = r1.A0H
            if (r0 != 0) goto L_0x0412
            X.1E7 r0 = r1.A0I
            if (r0 == 0) goto L_0x03f4
        L_0x0412:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.put(r10, r0)
            goto L_0x0373
        L_0x041b:
            r5 = 0
            goto L_0x0412
        L_0x041d:
            r5 = 0
            goto L_0x0373
        L_0x0420:
            r8 = 0
            X.6d9 r2 = (X.C126696d9) r2
            X.73C r10 = r2.A00
            goto L_0x035b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112065ks.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        Object obj = this.A01.get(i);
        if (obj instanceof C126696d9) {
            return 0;
        }
        if (obj instanceof C129356hf) {
            return 1;
        }
        if (obj instanceof C126686d8) {
            return 2;
        }
        if (obj instanceof C129376hh) {
            return 3;
        }
        if (obj instanceof C128026fK) {
            return 4;
        }
        if (obj instanceof C129366hg) {
            return 5;
        }
        return -1;
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    List list = C42011xT.A0I;
                    return new C113185mg(A0D.inflate(2131624637, (ViewGroup) null, true));
                } else if (i == 3) {
                    List list2 = C42011xT.A0I;
                    return new C113195mh(A0D.inflate(2131624664, (ViewGroup) null, true));
                } else if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException();
                    }
                }
            }
            List list3 = C42011xT.A0I;
            return new C113425n4(A0D.inflate(2131624658, (ViewGroup) null, true));
        }
        List list4 = C42011xT.A0I;
        return new C113305ms(A0D.inflate(2131626747, (ViewGroup) null, true));
    }
}

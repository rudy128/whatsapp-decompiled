package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.InfoCard;
import com.whatsapp.biz.BusinessHoursView;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A4l  reason: case insensitive filesystem */
public final class C20042A4l {
    public InfoCard A00;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass1FU A05;
    public final BusinessHoursView A06;
    public final BusinessProfileFieldView A07;
    public final BusinessProfileFieldView A08;
    public final BusinessProfileFieldView A09;
    public final C192179nw A0A;
    public final AnonymousClass72R A0B;
    public final C1417376t A0C;
    public final C24921Me A0D;
    public final C18000vb A0E;
    public final AnonymousClass1E7 A0F;
    public final C18030ve A0G;
    public final AnonymousClass689 A0H;
    public final AnonymousClass1XN A0I;
    public final Integer A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final AnonymousClass11S A0O;
    public final AnonymousClass1LU A0P;

    /* JADX WARNING: type inference failed for: r9v8, types: [X.Btp, android.view.View, com.whatsapp.location.WaMapView] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x030d, code lost:
        if (r3.A0C() != true) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034b, code lost:
        if (r3.A0C() != true) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c3, code lost:
        if (r3.A0C() != true) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fd, code lost:
        if (r11.A0C() != true) goto L_0x01ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AEW r29) {
        /*
            r28 = this;
            r1 = 0
            r2 = r29
            X.C18070vi.A0d(r2, r1)
            X.AEH r9 = r2.A08
            java.lang.String r8 = r9.A03
            r0 = r28
            X.9nw r3 = r0.A0A
            int r3 = r3.A00()
            r3 = r3 & 8
            if (r3 <= 0) goto L_0x0090
            X.1FU r7 = r0.A05
            X.AEG r3 = r9.A00
            java.lang.String r13 = r3.A01
            java.lang.String r6 = r9.A02
            r12 = 2
            java.lang.String r11 = ""
            r10 = 1
            if (r8 == 0) goto L_0x006c
            int r3 = r8.length()
            if (r3 == 0) goto L_0x006c
            r5 = 2131889605(0x7f120dc5, float:1.9413878E38)
            java.lang.Object[] r4 = X.AnonymousClass8BR.A1a()
            r4[r1] = r8
            if (r13 == 0) goto L_0x003b
            int r3 = r13.length()
            if (r3 != 0) goto L_0x003c
        L_0x003b:
            r13 = r11
        L_0x003c:
            r4[r10] = r13
            if (r6 == 0) goto L_0x0046
            int r3 = r6.length()
            if (r3 != 0) goto L_0x0047
        L_0x0046:
            r6 = r11
        L_0x0047:
            r4[r12] = r6
        L_0x0049:
            java.lang.String r7 = r7.getString(r5, r4)
            int r6 = X.C108955ca.A05(r7)
            int r6 = r6 - r10
            r5 = 0
            r4 = 0
        L_0x0054:
            if (r5 > r6) goto L_0x0088
            r3 = r6
            if (r4 != 0) goto L_0x005a
            r3 = r5
        L_0x005a:
            boolean r3 = X.C109005cf.A0u(r7, r3)
            if (r4 != 0) goto L_0x0067
            if (r3 != 0) goto L_0x0064
            r4 = 1
            goto L_0x0054
        L_0x0064:
            int r5 = r5 + 1
            goto L_0x0054
        L_0x0067:
            if (r3 == 0) goto L_0x0088
            int r6 = r6 + -1
            goto L_0x0054
        L_0x006c:
            r5 = 2131889606(0x7f120dc6, float:1.941388E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            if (r13 == 0) goto L_0x0079
            int r3 = r13.length()
            if (r3 != 0) goto L_0x007a
        L_0x0079:
            r13 = r11
        L_0x007a:
            r4[r1] = r13
            if (r6 == 0) goto L_0x0084
            int r3 = r6.length()
            if (r3 != 0) goto L_0x0085
        L_0x0084:
            r6 = r11
        L_0x0085:
            r4[r10] = r6
            goto L_0x0049
        L_0x0088:
            java.lang.String r3 = X.C108985cd.A0g(r6, r5, r7)
            if (r3 == 0) goto L_0x008f
            r11 = r3
        L_0x008f:
            r8 = r11
        L_0x0090:
            r10 = 0
            r4 = 1
            if (r8 == 0) goto L_0x009a
            int r3 = r8.length()
            if (r3 != 0) goto L_0x01de
        L_0x009a:
            X.1XN r3 = r0.A0I
            X.0ve r6 = r3.A03
            r5 = 1810(0x712, float:2.536E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r6, r5)
            if (r3 == 0) goto L_0x01de
            java.util.List r6 = r2.A0U
            boolean r3 = X.AnonymousClass000.A1a(r6)
            if (r3 == 0) goto L_0x01de
            com.whatsapp.biz.BusinessProfileFieldView r7 = r0.A07
            X.0vb r3 = r0.A0E
            java.util.Locale r9 = r3.A0N()
            android.content.Context r5 = r7.getContext()
            r3 = 2131887070(0x7f1203de, float:1.9408737E38)
            java.lang.String r8 = X.C18070vi.A0F(r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object r3 = r6.get(r1)
            X.AE9 r3 = (X.AE9) r3
            java.lang.String r3 = r3.A03
            java.lang.Object[] r3 = X.C108945cZ.A1b(r3, r5, r1, r4)
            java.lang.String r3 = X.C108955ca.A12(r9, r8, r3)
            r7.setText(r3, r10)
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x016c
            X.689 r12 = r0.A0H
            android.content.Context r3 = r7.getContext()
            boolean r3 = r12.A06(r3)
            if (r3 == 0) goto L_0x016c
            java.lang.Object r13 = r6.get(r1)
            X.AE9 r13 = (X.AE9) r13
            android.view.View r5 = r0.A03
            r3 = 2131428560(0x7f0b04d0, float:1.8478768E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0D(r5, r3)
            X.1FU r6 = r0.A05
            r3 = 2131624383(0x7f0e01bf, float:1.8875944E38)
            android.view.View.inflate(r6, r3, r4)
            r3 = 2131432277(0x7f0b1355, float:1.8486307E38)
            android.view.View r11 = r5.findViewById(r3)
            r3 = 2131432267(0x7f0b134b, float:1.8486287E38)
            android.view.View r8 = r5.findViewById(r3)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "geo:0,0?q="
            r4.append(r3)
            java.lang.String r3 = r13.A03
            java.lang.String r3 = X.AnonymousClass000.A0y(r3, r4)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            X.C18070vi.A0b(r3)
            android.content.Intent r5 = X.AnonymousClass1LU.A1p(r3)
            r4 = 28
            X.78Q r3 = new X.78Q
            r3.<init>((java.lang.Object) r0, (java.lang.Object) r5, (int) r4)
            if (r8 == 0) goto L_0x0135
            r8.setOnClickListener(r3)
        L_0x0135:
            r7.setOnClickListener(r3)
            r3 = 2131432278(0x7f0b1356, float:1.8486309E38)
            android.view.ViewGroup r10 = X.AnonymousClass3MX.A0F(r6, r3)
            if (r10 == 0) goto L_0x0163
            android.content.Context r3 = r10.getContext()
            X.Btp r9 = new X.Btp
            r9.<init>(r3)
            double r5 = r13.A00
            double r3 = r13.A01
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r8.<init>(r5, r3)
            int r3 = r13.A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.A05(r8, r12, r3)
            r3 = -1
            r10.addView(r9, r3, r3)
            r9.setVisibility(r1)
        L_0x0163:
            X.C18070vi.A0b(r11)
            r0.A00(r11)
        L_0x0169:
            r7.setVisibility(r1)
        L_0x016c:
            java.util.List r3 = r0.A0L
            java.util.Iterator r9 = r3.iterator()
            r5 = 0
        L_0x0173:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x02af
            int r8 = r5 + 1
            java.lang.Object r11 = r9.next()
            com.whatsapp.biz.BusinessProfileFieldView r11 = (com.whatsapp.biz.BusinessProfileFieldView) r11
            java.util.List r4 = r2.A0V
            int r3 = r4.size()
            if (r5 >= r3) goto L_0x01dc
            java.lang.String r5 = X.C17880vN.A0w(r4, r5)
        L_0x018d:
            boolean r3 = r0.A0N
            if (r3 == 0) goto L_0x0197
            boolean r3 = X.C83544Fn.A00(r5)
            if (r3 != 0) goto L_0x01da
        L_0x0197:
            r3 = 0
            r11.setText(r3, r3)
            r11.setSubText(r3)
            r3 = 2131232228(0x7f0805e4, float:1.808056E38)
            r11.setIcon((int) r3)
            r4 = 0
            r11.setText(r5, r4)
            X.1L9 r10 = r0.A04
            X.689 r6 = r0.A0H
            X.72R r12 = r0.A0B
            X.1E7 r3 = r0.A0F
            if (r3 == 0) goto L_0x01b6
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r3)
        L_0x01b6:
            java.lang.String r16 = X.C22971Dz.A06(r4)
            if (r3 == 0) goto L_0x01c5
            boolean r4 = r3.A0C()
            r3 = 1
            r18 = 1
            if (r4 == r3) goto L_0x01c7
        L_0x01c5:
            r18 = 0
        L_0x01c7:
            X.76t r13 = r0.A0C
            java.lang.Integer r5 = r0.A0J
            boolean r4 = r0.A02
            boolean r3 = r0.A01
            r14 = r6
            r15 = r5
            r17 = r1
            r19 = r4
            r20 = r3
            X.AnonymousClass4ZB.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x01da:
            r5 = r8
            goto L_0x0173
        L_0x01dc:
            r5 = 0
            goto L_0x018d
        L_0x01de:
            com.whatsapp.biz.BusinessProfileFieldView r7 = r0.A07
            r7.setText(r8, r10)
            X.1L9 r12 = r0.A04
            X.689 r6 = r0.A0H
            X.72R r10 = r0.A0B
            X.1E7 r11 = r0.A0F
            if (r11 == 0) goto L_0x0291
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r11)
        L_0x01f1:
            java.lang.String r18 = X.C22971Dz.A06(r3)
            if (r11 == 0) goto L_0x01ff
            boolean r3 = r11.A0C()
            r20 = 1
            if (r3 == r4) goto L_0x0201
        L_0x01ff:
            r20 = 0
        L_0x0201:
            X.76t r8 = r0.A0C
            java.lang.Integer r5 = r0.A0J
            boolean r4 = r0.A02
            boolean r3 = r0.A01
            r19 = 2
            r13 = r7
            r14 = r10
            r15 = r8
            r16 = r6
            r17 = r5
            r21 = r4
            r22 = r3
            X.AnonymousClass4ZB.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = 2131428560(0x7f0b04d0, float:1.8478768E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0D(r7, r3)
            X.AEG r3 = r9.A00
            java.lang.Double r10 = r3.A02
            if (r10 == 0) goto L_0x0294
            java.lang.Double r9 = r3.A03
            if (r9 == 0) goto L_0x0294
            X.1FU r5 = r0.A05
            r3 = 2131624383(0x7f0e01bf, float:1.8875944E38)
            android.view.View.inflate(r5, r3, r4)
            android.view.View r4 = r0.A03
            r3 = 2131432277(0x7f0b1355, float:1.8486307E38)
            android.view.View r8 = r4.findViewById(r3)
            r3 = 2131432267(0x7f0b134b, float:1.8486287E38)
            android.view.View r12 = r4.findViewById(r3)
            double r3 = r10.doubleValue()
            com.google.android.gms.maps.model.LatLng r10 = X.AnonymousClass8BV.A09(r9, r3)
            java.lang.String r16 = r7.getText()
            r9 = 0
            if (r11 == 0) goto L_0x028e
            X.1Me r3 = r0.A0D
            java.lang.String r17 = r3.A0I(r11)
        L_0x0257:
            X.AFI r3 = new X.AFI
            r13 = r3
            r14 = r0
            r15 = r2
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r12.setOnClickListener(r3)
            r7.setOnClickListener(r3)
            r3 = 2131432278(0x7f0b1356, float:1.8486309E38)
            android.view.ViewGroup r5 = X.AnonymousClass3MX.A0F(r5, r3)
            if (r5 == 0) goto L_0x0286
            android.content.Context r3 = r5.getContext()
            com.whatsapp.location.WaMapView r4 = new com.whatsapp.location.WaMapView
            r4.<init>(r3)
            r4.A02(r10, r9, r6)
            r4.A01(r10)
            r3 = -1
            r5.addView(r4, r3, r3)
            r4.setVisibility(r1)
        L_0x0286:
            X.C18070vi.A0b(r8)
            r0.A00(r8)
            goto L_0x0169
        L_0x028e:
            r17 = r9
            goto L_0x0257
        L_0x0291:
            r3 = 0
            goto L_0x01f1
        L_0x0294:
            java.lang.String r3 = r7.getText()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x02a1
            r7.setVisibility(r1)
        L_0x02a1:
            r3 = 2131432277(0x7f0b1355, float:1.8486307E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L_0x016c
            r4.removeView(r3)
            goto L_0x016c
        L_0x02af:
            boolean r3 = r0.A0N
            if (r3 == 0) goto L_0x0328
            java.util.List r3 = r0.A0K
            java.util.Iterator r9 = r3.iterator()
            r5 = 0
        L_0x02ba:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0328
            int r8 = r5 + 1
            java.lang.Object r11 = r9.next()
            com.whatsapp.biz.BusinessProfileFieldView r11 = (com.whatsapp.biz.BusinessProfileFieldView) r11
            java.util.List r4 = r2.A0V
            int r3 = r4.size()
            if (r5 >= r3) goto L_0x0326
            java.lang.String r5 = X.C17880vN.A0w(r4, r5)
        L_0x02d4:
            boolean r3 = X.C83544Fn.A00(r5)
            if (r3 == 0) goto L_0x0324
            com.whatsapp.InfoCard r4 = r0.A00
            if (r4 == 0) goto L_0x0324
            r3 = 0
            r11.setText(r3, r3)
            r11.setSubText(r3)
            r3 = 2131232228(0x7f0805e4, float:1.808056E38)
            r11.setIcon((int) r3)
            r4.setVisibility(r1)
            r4 = 0
            r11.setText(r5, r4)
            X.1L9 r10 = r0.A04
            X.689 r6 = r0.A0H
            X.72R r12 = r0.A0B
            X.1E7 r3 = r0.A0F
            if (r3 == 0) goto L_0x0300
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r3)
        L_0x0300:
            java.lang.String r16 = X.C22971Dz.A06(r4)
            if (r3 == 0) goto L_0x030f
            boolean r4 = r3.A0C()
            r3 = 1
            r18 = 1
            if (r4 == r3) goto L_0x0311
        L_0x030f:
            r18 = 0
        L_0x0311:
            X.76t r13 = r0.A0C
            java.lang.Integer r5 = r0.A0J
            boolean r4 = r0.A02
            boolean r3 = r0.A01
            r14 = r6
            r15 = r5
            r17 = r1
            r19 = r4
            r20 = r3
            X.AnonymousClass4ZB.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0324:
            r5 = r8
            goto L_0x02ba
        L_0x0326:
            r5 = 0
            goto L_0x02d4
        L_0x0328:
            java.lang.String r3 = r2.A0I
            com.whatsapp.biz.BusinessProfileFieldView r10 = r0.A09
            r4 = 0
            r10.setText(r3, r4)
            X.1L9 r9 = r0.A04
            X.689 r8 = r0.A0H
            X.72R r6 = r0.A0B
            X.1E7 r3 = r0.A0F
            if (r3 == 0) goto L_0x033e
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r3)
        L_0x033e:
            java.lang.String r15 = X.C22971Dz.A06(r4)
            if (r3 == 0) goto L_0x034d
            boolean r4 = r3.A0C()
            r3 = 1
            r17 = 1
            if (r4 == r3) goto L_0x034f
        L_0x034d:
            r17 = 0
        L_0x034f:
            X.76t r5 = r0.A0C
            java.lang.Integer r3 = r0.A0J
            r27 = r3
            boolean r4 = r0.A02
            boolean r3 = r0.A01
            r16 = 1
            r11 = r6
            r12 = r5
            r13 = r8
            r14 = r27
            r18 = r4
            r19 = r3
            X.AnonymousClass4ZB.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.whatsapp.biz.BusinessHoursView r12 = r0.A06
            X.ADs r11 = r2.A04
            com.whatsapp.jid.UserJid r3 = r2.A09
            java.lang.String r24 = X.C72463Mc.A0n(r3)
            boolean r3 = r0.A02
            r25 = r3
            boolean r3 = r0.A01
            r26 = r3
            r10 = 1
            if (r11 != 0) goto L_0x03ed
            r1 = 8
        L_0x037e:
            r12.setVisibility(r1)
        L_0x0381:
            X.ADg r4 = r2.A06
            r3 = 1
            if (r4 == 0) goto L_0x038e
            X.AEB r1 = r4.A00
            if (r1 != 0) goto L_0x03eb
            X.AEB r1 = r4.A01
            if (r1 != 0) goto L_0x03eb
        L_0x038e:
            r1 = 0
        L_0x038f:
            r0.A02 = r1
            X.AEA r1 = r2.A05
            if (r1 == 0) goto L_0x039d
            java.lang.String r1 = r1.A00
            int r1 = r1.length()
            if (r1 != 0) goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r0.A01 = r3
            java.util.List r8 = r2.A0P
            boolean r1 = X.AnonymousClass000.A1a(r8)
            if (r1 == 0) goto L_0x0578
            boolean r1 = r0.A0M
            if (r1 != 0) goto L_0x0578
            android.content.Context r5 = r7.getContext()
            r4 = 2131887508(0x7f120594, float:1.9409625E38)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r1 = " "
            r7 = 0
            java.lang.String r6 = X.AnonymousClass3Ma.A10(r5, r1, r3, r7, r4)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.util.Iterator r4 = r8.iterator()
        L_0x03c4:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0537
            java.lang.Object r1 = r4.next()
            X.AEQ r1 = (X.AEQ) r1
            if (r1 == 0) goto L_0x03e1
            java.lang.String r3 = r1.A01
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x03e1
            r5.append(r3)
            r5.append(r6)
            goto L_0x03c4
        L_0x03e1:
            java.lang.String r1 = "Category is null"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r1)
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            goto L_0x03c4
        L_0x03eb:
            r1 = 1
            goto L_0x038f
        L_0x03ed:
            X.0vb r14 = r12.getWhatsAppLocale()
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r3 = 7
            int r5 = r4.get(r3)
            int[] r23 = X.AnonymousClass9TJ.A00
            r4 = 7
            r13 = 0
        L_0x03fe:
            r3 = r23[r13]
            if (r3 == r5) goto L_0x0407
            int r13 = r13 + 1
            if (r13 < r4) goto L_0x03fe
            r13 = 6
        L_0x0407:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>(r4)
            java.util.List r3 = r11.A02
            java.util.Iterator r6 = r3.iterator()
        L_0x0412:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x043f
            java.lang.Object r5 = r6.next()
            X.AE8 r5 = (X.AE8) r5
            if (r5 == 0) goto L_0x0412
            int r3 = r5.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r3 = r9.containsKey(r4)
            if (r3 != 0) goto L_0x0433
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r9.put(r4, r3)
        L_0x0433:
            java.lang.Object r3 = r9.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0412
            r3.add(r5)
            goto L_0x0412
        L_0x043f:
            java.util.ArrayList r22 = X.AnonymousClass000.A13()
            r8 = 7
            r21 = 7
            int r8 = r8 + r13
        L_0x0447:
            if (r13 >= r8) goto L_0x050c
            int r3 = r13 % r21
            r3 = r23[r3]
            java.lang.Object r5 = X.AnonymousClass8BT.A0r(r9, r3)
            java.util.List r5 = (java.util.List) r5
            java.lang.String r20 = X.AnonymousClass11Y.A00(r14, r3)
            if (r5 != 0) goto L_0x046d
            r3 = 2131887545(0x7f1205b9, float:1.94097E38)
            java.lang.String r5 = r14.A09(r3)
            X.C18070vi.A0b(r5)
        L_0x0463:
            r4 = r20
            r3 = r22
            X.C108965cb.A1Q(r4, r5, r3)
            int r13 = r13 + 1
            goto L_0x0447
        L_0x046d:
            int r3 = r5.size()
            if (r3 <= r10) goto L_0x047d
            X.B3g r4 = X.C22329B3g.A00
            X.Akk r3 = new X.Akk
            r3.<init>(r4, r10)
            X.C29391cC.A0H(r5, r3)
        L_0x047d:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r19 = r5.iterator()
        L_0x0485:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L_0x0504
            java.lang.Object r4 = r19.next()
            X.AE8 r4 = (X.AE8) r4
            if (r4 == 0) goto L_0x0485
            int r5 = r4.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            if (r3 == 0) goto L_0x0485
            if (r5 != r10) goto L_0x04b0
            r3 = 2131887547(0x7f1205bb, float:1.9409704E38)
            java.util.Locale r4 = r14.A0N()
            java.lang.String r3 = r14.A09(r3)
            java.lang.String r5 = X.AnonymousClass1X0.A06(r4, r3)
        L_0x04ac:
            X.C18070vi.A0X(r5)
            goto L_0x0463
        L_0x04b0:
            r3 = 2
            if (r5 != r3) goto L_0x04bb
            r3 = 2131887546(0x7f1205ba, float:1.9409702E38)
            java.lang.String r5 = r14.A09(r3)
            goto L_0x04ac
        L_0x04bb:
            if (r5 != 0) goto L_0x0485
            java.lang.Integer r3 = r4.A03
            int r18 = X.AnonymousClass8BV.A03(r3)
            java.lang.Integer r3 = r4.A02
            int r17 = X.AnonymousClass8BV.A03(r3)
            java.util.Locale r16 = r14.A0N()
            X.C18070vi.A0X(r16)
            java.util.Calendar r5 = java.util.Calendar.getInstance(r16)
            int r4 = r18 / 60
            r3 = 11
            r5.set(r3, r4)
            r15 = 12
            int r4 = r18 % 60
            r5.set(r15, r4)
            r4 = 13
            r5.set(r4, r1)
            java.util.Calendar r4 = java.util.Calendar.getInstance(r16)
            int r15 = r17 / 60
            r4.set(r3, r15)
            r15 = 12
            int r3 = r17 % 60
            r4.set(r15, r3)
            r3 = 13
            r4.set(r3, r1)
            java.lang.String r3 = X.A8I.A05(r14, r5, r4)
            r6.add(r3)
            goto L_0x0485
        L_0x0504:
            java.lang.String r3 = "\n"
            java.lang.String r5 = X.C108995ce.A0X(r3, r6)
            goto L_0x0463
        L_0x050c:
            int r1 = r22.size()
            if (r1 == 0) goto L_0x0381
            com.whatsapp.biz.BusinessHoursContentView r5 = r12.A00
            if (r5 == 0) goto L_0x0523
            X.11P r1 = r12.getTime()
            long r3 = X.AnonymousClass11P.A01(r1)
            r1 = r22
            r5.setupWithOpenNow(r1, r3, r11)
        L_0x0523:
            X.AFJ r1 = new X.AFJ
            r21 = r1
            r22 = r12
            r23 = r27
            r21.<init>(r22, r23, r24, r25, r26)
            r12.setOnClickListener(r1)
            com.whatsapp.biz.BusinessHoursView.A01(r12)
            r1 = 0
            goto L_0x037e
        L_0x0537:
            int r1 = r5.length()
            int r3 = r6.length()
            if (r1 <= r3) goto L_0x0575
            int r1 = r5.length()
            int r1 = r1 - r3
            java.lang.String r1 = r5.substring(r7, r1)
            X.C18070vi.A0X(r1)
        L_0x054d:
            android.text.SpannableStringBuilder r6 = X.AnonymousClass3MW.A09(r1)
            X.ADt r5 = r2.A07
            r4 = 0
            if (r5 == 0) goto L_0x056c
            X.0ve r3 = r0.A0G
            r2 = 3465(0xd89, float:4.855E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x056c
            java.lang.String r1 = " • "
            r6.append(r1)
            java.lang.String r1 = r5.A02
            r6.append(r1)
        L_0x056c:
            com.whatsapp.biz.BusinessProfileFieldView r0 = r0.A08
            r0.setText(r6, r4)
            r0.setVisibility(r7)
            return
        L_0x0575:
            java.lang.String r1 = ""
            goto L_0x054d
        L_0x0578:
            com.whatsapp.biz.BusinessProfileFieldView r1 = r0.A08
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20042A4l.A02(X.AEW):void");
    }

    public C20042A4l(View view, AnonymousClass1L9 r5, AnonymousClass1FU r6, AnonymousClass11S r7, C192179nw r8, AnonymousClass72R r9, C1417376t r10, C24921Me r11, C18000vb r12, AnonymousClass1E7 r13, C18030ve r14, AnonymousClass1LU r15, AnonymousClass689 r16, AnonymousClass1XN r17, Integer num, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass689 r2 = r16;
        C18070vi.A0w(r14, r7, r5, r2, r11);
        AnonymousClass1XN r1 = r17;
        C18070vi.A0q(r12, r8, r1);
        C18070vi.A0d(r9, 9);
        C18070vi.A0d(view, 13);
        C18070vi.A0d(r15, 19);
        this.A0G = r14;
        this.A0O = r7;
        this.A04 = r5;
        this.A0H = r2;
        this.A0D = r11;
        this.A0E = r12;
        this.A0A = r8;
        this.A0I = r1;
        this.A0B = r9;
        this.A0C = r10;
        this.A0J = num;
        this.A03 = view;
        this.A0P = r15;
        this.A07 = (BusinessProfileFieldView) AnonymousClass3MX.A0C(view, 2131428553);
        this.A09 = (BusinessProfileFieldView) AnonymousClass3MX.A0C(view, 2131428524);
        ArrayList A13 = AnonymousClass000.A13();
        this.A0L = A13;
        ArrayList A132 = AnonymousClass000.A13();
        this.A0K = A132;
        A13.add(AnonymousClass3MX.A0C(view, 2131428550));
        A13.add(AnonymousClass3MX.A0C(view, 2131428551));
        InfoCard infoCard = null;
        boolean z4 = z;
        if (z) {
            A132.add(AnonymousClass3MX.A0C(view, 2131428405));
            A132.add(AnonymousClass3MX.A0C(view, 2131428406));
            infoCard = (InfoCard) view.findViewById(2131428407);
        }
        this.A00 = infoCard;
        BusinessHoursView businessHoursView = (BusinessHoursView) AnonymousClass3MX.A0C(view, 2131428529);
        this.A06 = businessHoursView;
        businessHoursView.setContentViewGravity(i);
        this.A08 = (BusinessProfileFieldView) AnonymousClass3MX.A0C(view, 2131428502);
        this.A05 = r6;
        this.A0F = r13;
        this.A0N = z4;
        this.A02 = z2;
        this.A0M = z3;
    }

    private final void A00(View view) {
        int A012;
        int i;
        BusinessProfileFieldView businessProfileFieldView = this.A07;
        View A052 = C18070vi.A05(businessProfileFieldView, 2131430838);
        if (businessProfileFieldView.getText().length() == 0) {
            A052.setVisibility(8);
        } else {
            A052.setVisibility(0);
        }
        int length = businessProfileFieldView.getText().length();
        Resources resources = A052.getResources();
        int i2 = 2131165553;
        if (length == 0) {
            i2 = 2131165554;
        }
        int A013 = AnonymousClass3MW.A01(resources, i2);
        C18000vb r2 = this.A0E;
        if (AnonymousClass3MY.A1b(r2)) {
            A012 = 0;
        } else {
            A012 = AnonymousClass3MW.A01(A052.getResources(), 2131165552);
        }
        if (AnonymousClass3MY.A1b(r2)) {
            i = AnonymousClass3MW.A01(A052.getResources(), 2131165552);
        } else {
            i = 0;
        }
        view.setPadding(A012, A013, i, AnonymousClass3MW.A01(A052.getResources(), 2131165551));
        view.setVisibility(0);
    }

    public static final void A01(C20042A4l a4l) {
        UserJid userJid;
        AnonymousClass72R r2 = a4l.A0B;
        AnonymousClass1E7 r1 = a4l.A0F;
        if (r1 != null) {
            userJid = AnonymousClass3MZ.A0x(r1);
        } else {
            userJid = null;
        }
        r2.A07((Integer) null, a4l.A0J, C22971Dz.A06(userJid), 3, a4l.A02, a4l.A01);
        if (r1 != null && r1.A0C()) {
            r2.A03(a4l.A0C, 8);
        }
    }
}

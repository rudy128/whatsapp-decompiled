package com.whatsapp.payments.ui.orderdetails;

import X.A2H;
import X.A8Q;
import X.ADQ;
import X.ARR;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11E;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1QO;
import X.AnonymousClass1R2;
import X.AnonymousClass21K;
import X.AnonymousClass2UJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass78A;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8F5;
import X.BD6;
import X.C000200d;
import X.C108945cZ;
import X.C18000vb;
import X.C18030ve;
import X.C182519Ur;
import X.C191559mn;
import X.C191979nV;
import X.C192789oz;
import X.C195019sf;
import X.C20005A2v;
import X.C20764AXt;
import X.C22417B6z;
import X.C27201Vd;
import X.C27691Xc;
import X.C32021gV;
import X.C36401np;
import X.C36531o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class PaymentCheckoutOrderDetailsViewV2 extends LinearLayout implements AnonymousClass009 {
    public View A00;
    public LinearLayout A01;
    public RelativeLayout A02;
    public RelativeLayout A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public RecyclerView A06;
    public C182519Ur A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public WaButtonWithLoader A0A;
    public WaButtonWithLoader A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public C22417B6z A0G;
    public A2H A0H;
    public A8Q A0I;
    public C192789oz A0J;
    public C20005A2v A0K;
    public AnonymousClass11E A0L;
    public C27201Vd A0M;
    public C36531o3 A0N;
    public AnonymousClass11C A0O;
    public AnonymousClass118 A0P;
    public C18000vb A0Q;
    public C18030ve A0R;
    public AnonymousClass2UJ A0S;
    public AnonymousClass1QO A0T;
    public AnonymousClass1R2 A0U;
    public C36401np A0V;
    public C32021gV A0W;
    public AnonymousClass10I A0X;
    public WDSButton A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass031 A0c;
    public boolean A0d;
    public AnonymousClass8F5 A0e;

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void setVisibilityForTotalAmount(int i) {
        this.A0F.setVisibility(i);
        this.A0E.setVisibility(i);
    }

    public void A01(Context context, C191559mn r17, C191979nV r18, String str) {
        String str2 = str;
        C191559mn r4 = r17;
        C191979nV r13 = r18;
        if (!((C195019sf) this.A0b.get()).A02(new C20764AXt(context, this, r4, r13, str2))) {
            BD6 bd6 = r13.A0A;
            AnonymousClass21K r5 = r13.A0B;
            AnonymousClass1BI r2 = r13.A08;
            ARR arr = r13.A06;
            String str3 = r13.A0M;
            ADQ adq = r13.A09;
            String str4 = r13.A0D;
            HashMap hashMap = r13.A0N;
            if (str == null) {
                str2 = "order_details";
            }
            bd6.Bob(arr, r2, adq, r4, r5, str3, str4, str2, hashMap);
        }
    }

    public boolean A03(C191559mn r4, C191979nV r5, int i) {
        if (r5.A0T && i != 4) {
            if (r4 == null) {
                AnonymousClass8BS.A1F("PaymentCheckoutOrderDetailsViewV2", "renderUi, this payment method is not supported");
            } else {
                this.A0B.A00 = new AnonymousClass78A(this, r4, r5, 30);
                return true;
            }
        }
        return false;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0c;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0c = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C191559mn A00(X.AnonymousClass9I2 r14, X.C191979nV r15, java.lang.String r16, java.util.List r17, int r18) {
        /*
            r13 = this;
            android.content.Context r2 = r13.getContext()
            X.0ve r1 = r13.A0R
            r6 = 0
            boolean r12 = X.C18070vi.A17(r2, r1)
            r0 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r1.A0I(r0)
            r7 = 0
            r1 = r17
            java.util.LinkedHashMap r0 = X.A3T.A01(r2, r0, r1)
            r1 = r16
            X.C18070vi.A0d(r1, r6)
            java.lang.Object r0 = r0.get(r1)
            X.AEZ r0 = (X.AEZ) r0
            r1 = r18
            if (r1 != r12) goto L_0x003f
            if (r0 == 0) goto L_0x003f
            X.A2H r2 = r13.A0H
            X.C18070vi.A0d(r2, r6)
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r0.A04
            java.lang.String r10 = X.A2H.A00(r2, r1, r0)
            X.9mn r6 = new X.9mn
            r9 = r7
            r11 = r7
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x003e:
            return r6
        L_0x003f:
            X.9I2 r0 = X.AnonymousClass9I2.NONE
            if (r14 != r0) goto L_0x0090
            java.util.HashMap r0 = r15.A0N
            java.lang.Object r6 = X.AnonymousClass8BT.A0r(r0, r1)
        L_0x0049:
            X.9mn r6 = (X.C191559mn) r6
            if (r6 == 0) goto L_0x003e
        L_0x004d:
            X.9I2 r0 = X.AnonymousClass9I2.INACTIVE
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0063
            boolean r0 = r15.A0P
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "WhatsappPay"
            r15.A00(r0)
            java.lang.String r0 = "hpp"
            r15.A00(r0)
        L_0x0063:
            int r3 = r6.A01
            r2 = -1
            if (r3 == r2) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            android.widget.LinearLayout r1 = r13.A01
            r0 = 8
        L_0x006e:
            r1.setVisibility(r0)
            if (r3 != r2) goto L_0x003e
            X.1QO r0 = r13.A0T
            boolean r2 = r0.A0G()
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131899288(0x7f123398, float:1.9433518E38)
            if (r2 == 0) goto L_0x0085
            r0 = 2131893180(0x7f121bbc, float:1.942113E38)
        L_0x0085:
            java.lang.String r0 = r1.getString(r0)
            r6.A00 = r0
            return r6
        L_0x008c:
            android.widget.LinearLayout r1 = r13.A01
            r0 = 0
            goto L_0x006e
        L_0x0090:
            X.9I2 r0 = X.AnonymousClass9I2.ACTIVE
            r5 = 0
            r4 = 3
            r3 = 7
            if (r14 != r0) goto L_0x00c7
            java.util.HashMap r1 = r15.A0N
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00a4
            r5 = 7
        L_0x00a4:
            r6 = 1
        L_0x00a5:
            java.util.HashMap r2 = r15.A0N
            java.util.Iterator r1 = X.C17890vO.A0i(r2)
        L_0x00ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)
            int r0 = X.AnonymousClass8BV.A04(r0)
            if (r0 == r5) goto L_0x00ab
            if (r0 == r4) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            if (r0 == r3) goto L_0x00ab
            if (r5 != r4) goto L_0x00c4
            r5 = r0
        L_0x00c4:
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00c7:
            X.9I2 r0 = X.AnonymousClass9I2.INACTIVE
            if (r14 != r0) goto L_0x00e3
            r5 = 3
            goto L_0x00a5
        L_0x00cd:
            if (r6 <= r12) goto L_0x00dd
            java.util.List r11 = r15.A0O
            java.lang.String r10 = ""
            r12 = -1
            X.9mn r6 = new X.9mn
            r9 = r7
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x004d
        L_0x00dd:
            java.lang.Object r6 = X.AnonymousClass8BT.A0r(r2, r5)
            goto L_0x0049
        L_0x00e3:
            java.lang.String r0 = "Unknown merchant status"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A00(X.9I2, X.9nV, java.lang.String, java.util.List, int):X.9mn");
    }

    /* JADX WARNING: type inference failed for: r1v26, types: [X.944] */
    /* JADX WARNING: type inference failed for: r12v17, types: [X.9Yc, X.942] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02c8  */
    public void A02(X.AnonymousClass01E r41, X.AnonymousClass11S r42, X.AES r43, X.AnonymousClass9I2 r44, X.C191979nV r45, java.lang.String r46, java.util.List r47, int r48, int r49) {
        /*
            r40 = this;
            r6 = r40
            X.118 r10 = r6.A0P
            X.0ve r0 = r6.A0R
            r39 = r0
            X.1np r9 = r6.A0V
            X.1Vd r8 = r6.A0M
            X.1R2 r4 = r6.A0U
            X.11C r0 = r6.A0O
            r38 = r0
            X.A2v r3 = r6.A0K
            X.1QO r0 = r6.A0T
            r37 = r0
            X.0vb r0 = r6.A0Q
            r36 = r0
            X.1gV r2 = r6.A0W
            X.A2H r7 = r6.A0H
            X.10I r1 = r6.A0X
            X.1o3 r0 = r6.A0N
            X.8Ho r5 = new X.8Ho
            r11 = r42
            r14 = r8
            r15 = r0
            r16 = r38
            r17 = r10
            r18 = r36
            r19 = r39
            r20 = r37
            r21 = r4
            r22 = r9
            r23 = r2
            r24 = r1
            r10 = r5
            r12 = r7
            r13 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r9 = r45
            X.AW0 r8 = r9.A07
            if (r8 == 0) goto L_0x048e
            X.8pG r0 = r8.A0A
            if (r0 == 0) goto L_0x048e
            X.AEh r21 = r0.A0C()
        L_0x0050:
            r13 = r44
            r20 = r46
            r11 = r47
            r17 = r48
            r12 = r6
            r14 = r9
            r15 = r20
            r16 = r11
            X.9mn r1 = r12.A00(r13, r14, r15, r16, r17)
            r19 = r49
            r0 = r19
            boolean r0 = r6.A03(r1, r9, r0)
            r2 = 8
            if (r0 == 0) goto L_0x047d
            android.widget.RelativeLayout r0 = r6.A03
            r4 = 0
            r0.setVisibility(r4)
            android.widget.RelativeLayout r0 = r6.A04
            r0.setVisibility(r4)
            android.view.View r0 = r6.A00
            r0.setVisibility(r4)
            android.content.Context r12 = r6.getContext()
            r10 = 0
            r0 = r39
            X.AnonymousClass3Ma.A1N(r12, r4, r0)
            r3 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r0.A0I(r3)
            java.util.LinkedHashMap r3 = X.A3T.A01(r12, r0, r11)
            X.C18070vi.A0d(r15, r4)
            java.lang.Object r0 = r3.get(r15)
            X.AEZ r0 = (X.AEZ) r0
            if (r0 != 0) goto L_0x046b
            if (r1 == 0) goto L_0x0461
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0461
            com.whatsapp.WaButtonWithLoader r4 = r6.A0B
            java.lang.String r0 = r1.A00
            r4.setButtonText((java.lang.String) r0)
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L_0x00c3
            int r3 = r0.intValue()
            if (r3 <= 0) goto L_0x00c3
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r0, r3)
            r4.setIcon(r0)
        L_0x00c3:
            android.widget.RelativeLayout r0 = r6.A05
            r0.setVisibility(r2)
            android.content.Context r10 = r6.getContext()
            X.21K r0 = r9.A0B
            r35 = r0
            X.AEt r2 = r35.BPK()
            X.C17960vV.A07(r2)
            X.AEn r0 = r2.A02
            X.C17960vV.A07(r0)
            X.AEU r0 = r0.A0D
            java.util.List r0 = r0.A09
            X.C17960vV.A07(r0)
            java.util.List r7 = r5.A0E
            r7.clear()
            X.AEn r4 = r2.A02
            X.AEt r11 = r35.BPK()
            X.C17960vV.A07(r11)
            X.AEn r0 = r11.A02
            X.C17960vV.A07(r0)
            X.AEU r0 = r0.A0D
            java.util.List r0 = r0.A09
            X.C17960vV.A07(r0)
            r7.clear()
            int r2 = r7.size()
            X.AEn r0 = r11.A02
            X.C17960vV.A07(r0)
            X.1R2 r3 = r5.A0A
            X.1QO r12 = r3.A09
            java.lang.String r13 = r4.A0I
            java.util.List r0 = r4.A0Q
            r34 = r0
            boolean r0 = r12.A0N(r13, r0)
            if (r0 == 0) goto L_0x0122
            if (r8 == 0) goto L_0x0122
            boolean r12 = r8.A0L()
            r0 = 1
            if (r12 != 0) goto L_0x0123
        L_0x0122:
            r0 = 0
        L_0x0123:
            r14 = 1
            r12 = 0
            if (r0 == 0) goto L_0x03a3
            int r0 = X.C20089A6r.A00(r4)
            if (r0 != r14) goto L_0x03a3
            r2 = 2131232254(0x7f0805fe, float:1.8080612E38)
            r0 = 2131897061(0x7f122ae5, float:1.9429E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131893451(0x7f121ccb, float:1.9421679E38)
        L_0x013a:
            java.lang.String r0 = r10.getString(r0)
            X.94E r11 = new X.94E
            r11.<init>(r12, r1, r0, r2)
        L_0x0143:
            r7.add(r11)
        L_0x0146:
            r11 = 2131168106(0x7f070b6a, float:1.7950504E38)
            r17 = 0
            X.94B r2 = new X.94B
            r1 = r17
            r2.<init>(r1, r11, r1)
            r7.add(r2)
            X.1E7 r12 = r9.A04
            boolean r11 = r9.A0Q
            java.lang.String r0 = r9.A0E
            r33 = r0
            java.lang.String r2 = r9.A0K
            X.94C r1 = new X.94C
            r1.<init>(r12, r0, r2, r11)
            r7.add(r1)
            X.1QO r2 = r5.A09
            boolean r29 = r2.A0M(r13)
            boolean r13 = r9.A0S
            java.lang.String r15 = r9.A0J
            X.ARR r0 = r9.A06
            r18 = r0
            X.1KJ r14 = r0.A01
            r1 = 1
            if (r29 == 0) goto L_0x0182
            r0 = r19
            if (r0 != r1) goto L_0x0182
            r31 = 0
            if (r13 != 0) goto L_0x0184
        L_0x0182:
            r31 = 1
        L_0x0184:
            X.0ve r12 = r3.A07
            r11 = 10873(0x2a79, float:1.5236E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r11 = X.C18020vd.A05(r0, r12, r11)
            r32 = 0
            if (r11 == 0) goto L_0x01b0
            int r11 = X.C20089A6r.A00(r4)
            if (r1 != r11) goto L_0x01b0
            boolean r11 = r4.A0T
            if (r11 == 0) goto L_0x01b0
            java.lang.String r12 = "pix"
            java.lang.String r11 = r4.A06
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x01ae
            java.lang.String r12 = "boleto"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x01b0
        L_0x01ae:
            r32 = 1
        L_0x01b0:
            X.94H r11 = new X.94H
            r25 = r11
            r26 = r14
            r27 = r15
            r28 = r19
            r30 = r13
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r7.add(r11)
            X.0ve r15 = r5.A08
            r11 = 11527(0x2d07, float:1.6153E-41)
            boolean r11 = X.C18020vd.A05(r0, r15, r11)
            if (r11 == 0) goto L_0x01ec
            X.AEt r11 = r35.BPK()
            if (r11 == 0) goto L_0x01ec
            X.AEE r11 = r11.A05
            if (r11 == 0) goto L_0x01ec
            X.AEi r11 = r11.A00
            if (r11 == 0) goto L_0x01ec
            boolean r11 = r11.A00()
            if (r11 == 0) goto L_0x01ec
            X.BD6 r13 = r9.A0A
            X.949 r12 = new X.949
            r11 = r35
            r12.<init>(r13, r11)
            r7.add(r12)
        L_0x01ec:
            X.AEU r12 = r4.A0D
            java.lang.String r13 = r12.A08
            java.lang.String r11 = "PAYMENT_REQUEST"
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x02d4
            X.0ve r13 = r2.A02
            r11 = 5574(0x15c6, float:7.811E-42)
            boolean r11 = X.C18020vd.A05(r0, r13, r11)
            if (r11 != 0) goto L_0x020a
            r11 = 5575(0x15c7, float:7.812E-42)
            boolean r11 = X.C18020vd.A05(r0, r13, r11)
            if (r11 == 0) goto L_0x02d4
        L_0x020a:
            java.lang.String r11 = r9.A0D
            r1 = 18
            X.942 r12 = new X.942
            r12.<init>(r1)
            r12.A00 = r11
        L_0x0215:
            r7.add(r12)
        L_0x0218:
            r11 = 2130971654(0x7f040c06, float:1.7552052E38)
            r1 = 2131102738(0x7f060c12, float:1.7817922E38)
            int r12 = X.AnonymousClass1YL.A00(r10, r11, r1)
            r11 = 2131169443(0x7f0710a3, float:1.7953216E38)
            X.1KJ r1 = r4.A0A
            X.C17960vV.A07(r1)
            X.26n r16 = r3.A0M(r10, r1, r12, r11)
            r10 = 180(0xb4, float:2.52E-43)
            r4 = 2131168107(0x7f070b6b, float:1.7950506E38)
            X.94B r3 = new X.94B
            r1 = r17
            r3.<init>(r10, r1, r4)
            r7.add(r3)
            X.0ve r1 = r2.A02
            r12 = 8583(0x2187, float:1.2027E-41)
            boolean r1 = X.C18020vd.A05(r0, r1, r12)
            r13 = r43
            if (r1 == 0) goto L_0x026a
            if (r43 == 0) goto L_0x026a
            java.util.List r1 = r13.A04
            boolean r1 = X.C137476vW.A00(r1)
            if (r1 != 0) goto L_0x02c8
            int r3 = r13.A00
            r1 = -1
            if (r3 != r1) goto L_0x025c
            X.AEV r1 = r13.A02
            if (r1 == 0) goto L_0x02c8
        L_0x025c:
            X.9b1 r4 = r9.A05
            boolean r3 = r9.A0T
            X.BD6 r1 = r9.A0A
            X.94D r10 = new X.94D
            r10.<init>(r4, r13, r1, r3)
        L_0x0267:
            r7.add(r10)
        L_0x026a:
            if (r29 == 0) goto L_0x0280
            boolean r1 = r9.A0T
            if (r1 == 0) goto L_0x0280
            java.lang.String r3 = r9.A0H
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0280
            X.946 r1 = new X.946
            r1.<init>(r3)
            r7.add(r1)
        L_0x0280:
            boolean r14 = r9.A0R
            boolean r1 = r9.A0U
            r27 = r1
            X.BD6 r1 = r9.A0A
            r17 = r1
            X.1BI r11 = r9.A08
            java.lang.String r15 = r9.A0M
            long r3 = r9.A01
            X.9b1 r10 = r9.A05
            X.94J r1 = new X.94J
            r18 = r8
            r19 = r11
            r20 = r17
            r21 = r35
            r22 = r15
            r23 = r33
            r24 = r3
            r26 = r14
            r15 = r1
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            r7.add(r1)
            r1 = r34
            boolean r1 = r2.A0O(r1)
            if (r1 == 0) goto L_0x02c1
            boolean r1 = r9.A0T
            if (r1 != 0) goto L_0x02c1
            X.943 r1 = new X.943
            r1.<init>()
            r7.add(r1)
        L_0x02c1:
            if (r14 != 0) goto L_0x04b1
            if (r8 == 0) goto L_0x04b1
            monitor-enter(r8)
            goto L_0x0492
        L_0x02c8:
            X.9b1 r4 = r9.A05
            X.BD6 r3 = r9.A0A
            boolean r1 = r13.A01
            X.948 r10 = new X.948
            r10.<init>(r4, r3, r1)
            goto L_0x0267
        L_0x02d4:
            java.util.List r11 = r12.A09
            X.C17960vV.A07(r11)
            java.util.Iterator r16 = r11.iterator()
        L_0x02dd:
            boolean r11 = r16.hasNext()
            if (r11 == 0) goto L_0x02f4
            java.lang.Object r13 = r16.next()
            X.AET r13 = (X.AET) r13
            X.94A r14 = new X.94A
            r11 = r35
            r14.<init>(r13, r11)
            r7.add(r14)
            goto L_0x02dd
        L_0x02f4:
            boolean r11 = r9.A0V
            if (r11 == 0) goto L_0x0316
            java.lang.String r11 = r9.A0M
            r16 = r11
            X.BD6 r14 = r9.A0A
            java.util.List r13 = r9.A0O
            X.94G r11 = new X.94G
            r22 = r11
            r23 = r18
            r24 = r14
            r25 = r35
            r26 = r16
            r27 = r20
            r28 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7.add(r11)
        L_0x0316:
            boolean r28 = r2.A0L(r4)
            if (r28 == 0) goto L_0x033a
            X.ADy r11 = r4.A04
            if (r11 != 0) goto L_0x038d
            java.lang.String r11 = r12.A01
            int r11 = X.C20089A6r.A01(r11)
            if (r11 != r1) goto L_0x033a
            if (r8 == 0) goto L_0x0330
            boolean r1 = r8.A0L()
            if (r1 != 0) goto L_0x033a
        L_0x0330:
            X.BD6 r11 = r9.A0A
            X.944 r1 = new X.944
            r1.<init>(r11)
        L_0x0337:
            r7.add(r1)
        L_0x033a:
            boolean r1 = r4.A08()
            if (r1 == 0) goto L_0x0368
            X.0vb r1 = r5.A07
            r20 = r1
            boolean r1 = r9.A0W
            r16 = r1
            java.lang.String r14 = r9.A0G
            java.lang.String r13 = r9.A0I
            java.lang.String r12 = r9.A0F
            X.BD6 r11 = r9.A0A
            X.94I r1 = new X.94I
            r22 = r11
            r23 = r4
            r24 = r14
            r25 = r13
            r26 = r12
            r27 = r16
            r18 = r1
            r19 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7.add(r1)
        L_0x0368:
            java.lang.String r11 = r9.A0L
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x0218
            X.11S r1 = r5.A00
            X.1BI r12 = r9.A08
            boolean r1 = r1.A0O(r12)
            if (r1 != 0) goto L_0x0218
            r1 = 6012(0x177c, float:8.425E-42)
            boolean r1 = X.C18020vd.A05(r0, r15, r1)
            if (r1 != 0) goto L_0x0218
            boolean r1 = r3.A0o(r12)
            X.947 r12 = new X.947
            r12.<init>(r11, r1)
            goto L_0x0215
        L_0x038d:
            X.0vb r13 = r5.A07
            X.BD6 r12 = r9.A0A
            X.94F r1 = new X.94F
            r22 = r1
            r23 = r13
            r24 = r8
            r25 = r12
            r26 = r11
            r27 = r4
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x0337
        L_0x03a3:
            X.AEn r0 = r11.A02
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x03c5
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x03c5
            r14 = 2131232010(0x7f08050a, float:1.8080117E38)
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
            java.lang.String r1 = r10.getString(r0)
            r11 = 23
            X.78T r0 = new X.78T
            r0.<init>(r5, r2, r11, r7)
            X.94E r11 = new X.94E
            r11.<init>(r0, r12, r1, r14)
            goto L_0x0143
        L_0x03c5:
            X.1QO r0 = r5.A09
            X.0ve r2 = r0.A02
            r0 = 4252(0x109c, float:5.958E-42)
            org.json.JSONObject r11 = r2.A0J(r0)
            java.lang.String r2 = "buyer_ed_nudge_enabled"
            boolean r0 = r11.has(r2)
            if (r0 == 0) goto L_0x0146
            int r0 = r11.getInt(r2)     // Catch:{ JSONException -> 0x0459 }
            if (r0 != r14) goto L_0x0146
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x0146
            if (r1 == 0) goto L_0x0146
            int r1 = r1.A01
            r0 = -1
            if (r1 != r0) goto L_0x0406
            r2 = 2131232010(0x7f08050a, float:1.8080117E38)
            X.0ve r0 = r5.A08
            int r0 = X.AnonymousClass8BX.A03(r0)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r0 = 2131893263(0x7f121c0f, float:1.9421298E38)
            if (r1 == 0) goto L_0x03fd
            r0 = 2131893264(0x7f121c10, float:1.94213E38)
        L_0x03fd:
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131893262(0x7f121c0e, float:1.9421296E38)
            goto L_0x013a
        L_0x0406:
            r0 = 2
            if (r1 != r0) goto L_0x0418
            r2 = 2131232010(0x7f08050a, float:1.8080117E38)
            r0 = 2131893261(0x7f121c0d, float:1.9421294E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131893260(0x7f121c0c, float:1.9421292E38)
            goto L_0x013a
        L_0x0418:
            r11 = 3
            if (r1 != r11) goto L_0x0146
            X.0ve r2 = r5.A08
            int r0 = X.AnonymousClass8BX.A03(r2)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r0 = 2131893258(0x7f121c0a, float:1.9421287E38)
            if (r1 == 0) goto L_0x042d
            r0 = 2131893259(0x7f121c0b, float:1.942129E38)
        L_0x042d:
            java.lang.String r16 = r10.getString(r0)
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            r15 = 4248(0x1098, float:5.953E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r15)
            r2 = 2131893256(0x7f121c08, float:1.9421283E38)
            if (r0 != r11) goto L_0x0445
            r2 = 2131893257(0x7f121c09, float:1.9421285E38)
        L_0x0445:
            java.lang.Object[] r11 = new java.lang.Object[r14]
            java.lang.String r0 = r9.A0E
            java.lang.String r2 = X.C17880vN.A0q(r10, r0, r11, r1, r2)
            r1 = 2131232010(0x7f08050a, float:1.8080117E38)
            X.94E r11 = new X.94E
            r0 = r16
            r11.<init>(r12, r0, r2, r1)
            goto L_0x0143
        L_0x0459:
            r1 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#buyer_ed_nudge_enabled"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0146
        L_0x0461:
            com.whatsapp.WaButtonWithLoader r3 = r6.A0B
            r0 = 2131899288(0x7f123398, float:1.9433518E38)
            r3.setButtonText((int) r0)
            goto L_0x00c3
        L_0x046b:
            com.whatsapp.WaButtonWithLoader r4 = r6.A0B
            X.C18070vi.A0d(r7, r10)
            java.lang.String r3 = r0.A05
            java.lang.String r0 = r0.A04
            java.lang.String r0 = X.A2H.A00(r7, r3, r0)
            r4.setButtonText((java.lang.String) r0)
            goto L_0x00c3
        L_0x047d:
            android.view.View r0 = r6.A00
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r6.A03
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r6.A04
            r0.setVisibility(r2)
            goto L_0x00c3
        L_0x048e:
            r21 = 0
            goto L_0x0050
        L_0x0492:
            X.8pG r2 = r8.A0A     // Catch:{ all -> 0x049f }
            if (r2 == 0) goto L_0x04a5
            boolean r1 = r2 instanceof X.C170318pf     // Catch:{ all -> 0x049f }
            if (r1 == 0) goto L_0x04a5
            X.8pf r2 = (X.C170318pf) r2     // Catch:{ all -> 0x049f }
            boolean r2 = r2.A0a     // Catch:{ all -> 0x049f }
            goto L_0x04a2
        L_0x049f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x04a2:
            r1 = 1
            if (r2 != 0) goto L_0x04a6
        L_0x04a5:
            r1 = 0
        L_0x04a6:
            monitor-exit(r8)
            if (r1 == 0) goto L_0x04b1
            X.945 r1 = new X.945
            r1.<init>(r11)
            r7.add(r1)
        L_0x04b1:
            androidx.recyclerview.widget.RecyclerView r2 = r6.A06
            r2.setAdapter(r5)
            r1 = r37
            X.0ve r1 = r1.A02
            boolean r1 = X.C18020vd.A05(r0, r1, r12)
            if (r1 == 0) goto L_0x04d1
            if (r43 == 0) goto L_0x04d1
            boolean r1 = r9.A0T
            if (r1 == 0) goto L_0x04d1
            boolean r1 = r13.A01
            if (r1 == 0) goto L_0x04d1
            int r1 = X.AnonymousClass3MX.A01(r7)
            r2.A0g(r1)
        L_0x04d1:
            com.whatsapp.WaTextView r8 = r6.A0D
            r7 = 8
            r8.setVisibility(r7)
            com.whatsapp.TextEmojiLabel r3 = r6.A08
            r3.setVisibility(r7)
            X.AEt r1 = r35.BPK()
            X.C17960vV.A07(r1)
            X.AEn r2 = r1.A02
            X.C17960vV.A07(r2)
            java.lang.String r4 = r2.A0I
            r1 = r37
            boolean r16 = r1.A0M(r4)
            boolean r1 = r9.A0W
            r4 = 0
            if (r1 != 0) goto L_0x05f0
            boolean r1 = r2.A08()
            if (r1 == 0) goto L_0x05f0
            com.whatsapp.WaTextView r10 = r6.A0F
            java.lang.String r1 = r9.A0D
            r10.setText(r1)
            r6.setVisibilityForTotalAmount(r4)
            X.ADQ r13 = r9.A09
            android.text.SpannableString r10 = r9.A02
            if (r13 == 0) goto L_0x0561
            boolean r1 = r13.A02
            if (r1 == 0) goto L_0x0561
            r12 = 4443(0x115b, float:6.226E-42)
            r1 = r39
            boolean r0 = X.C18020vd.A05(r0, r1, r12)
            if (r0 == 0) goto L_0x0561
            X.ADw r0 = r13.A00()
            if (r0 == 0) goto L_0x0561
            int r1 = r0.A00
            X.ARR r0 = r0.A01
            if (r0 == 0) goto L_0x0561
            android.content.res.Resources r14 = r6.getResources()
            r13 = 2131893680(0x7f121db0, float:1.9422143E38)
            java.lang.Object[] r12 = X.AnonymousClass3MW.A1b()
            X.C17880vN.A1S(r12, r1, r4)
            X.1KJ r15 = X.AnonymousClass1KL.A0A
            X.1KN r0 = r0.A02
            java.math.BigDecimal r1 = r0.A00
            r0 = r36
            java.lang.String r1 = r15.BLd(r0, r1)
            r0 = 1
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r14, r1, r12, r0, r13)
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x055e
            r3.setVisibility(r4)
            r0 = r38
            X.AnonymousClass3Ma.A1K(r3, r0)
            r0 = r39
            X.AnonymousClass3Ma.A1L(r0, r3)
            r3.setText(r10)
        L_0x055e:
            r8.setVisibility(r4)
        L_0x0561:
            java.lang.String r1 = r9.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x05ea
            if (r16 != 0) goto L_0x05ea
            com.whatsapp.WaTextView r0 = r6.A0C
            r0.setText(r1)
            r0.setVisibility(r4)
        L_0x0573:
            android.widget.LinearLayout r0 = r6.A01
            r0.setVisibility(r7)
            java.lang.CharSequence r1 = r9.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            com.whatsapp.TextEmojiLabel r9 = r6.A09
            if (r0 == 0) goto L_0x05de
            r9.setVisibility(r7)
        L_0x0585:
            android.widget.RelativeLayout r1 = r6.A02
            int r0 = r9.getVisibility()
            if (r0 == 0) goto L_0x05a9
            com.whatsapp.WaTextView r0 = r6.A0E
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x05a9
            com.whatsapp.WaTextView r0 = r6.A0F
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x05a9
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L_0x05a9
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x05aa
        L_0x05a9:
            r7 = 0
        L_0x05aa:
            r1.setVisibility(r7)
            boolean r0 = X.C22971Dz.A0d(r11)
            X.C17960vV.A0C(r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            X.AEU r0 = r2.A0D
            java.util.List r8 = r0.A09
            X.C17960vV.A07(r8)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r8.iterator()
        L_0x05c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05f5
            java.lang.Object r0 = r3.next()
            X.AET r0 = (X.AET) r0
            java.lang.String r1 = r0.A00()
            X.ADb r0 = new X.ADb
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x05c5
        L_0x05de:
            r0 = r39
            X.AnonymousClass3Ma.A1L(r0, r9)
            r9.setVisibility(r4)
            r9.setText(r1)
            goto L_0x0585
        L_0x05ea:
            com.whatsapp.WaTextView r0 = r6.A0C
            r0.setVisibility(r7)
            goto L_0x0573
        L_0x05f0:
            r6.setVisibilityForTotalAmount(r7)
            goto L_0x0561
        L_0x05f5:
            r0 = 0
            X.ADm r3 = new X.ADm
            r3.<init>(r0, r7)
            java.lang.Object r0 = r8.get(r4)
            X.AET r0 = (X.AET) r0
            java.lang.String r1 = r0.A00()
            byte[] r0 = r2.A0U
            X.AE3 r2 = new X.AE3
            r2.<init>(r0, r1, r4)
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.AER r1 = new X.AER
            r1.<init>(r11, r2, r0)
            X.8F5 r0 = r6.A0e
            r3 = r41
            if (r0 != 0) goto L_0x063b
            X.B6z r0 = r6.A0G
            X.9p3 r9 = r0.BGF(r11)
            X.2UJ r0 = r6.A0S
            X.9Ur r8 = r6.A07
            X.AH8 r7 = new X.AH8
            r10 = r11
            r11 = r0
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            X.1It r1 = X.AnonymousClass8BR.A0C(r7, r3)
            java.lang.Class<X.8F5> r0 = X.AnonymousClass8F5.class
            X.1J2 r0 = r1.A00(r0)
            X.8F5 r0 = (X.AnonymousClass8F5) r0
            r6.A0e = r0
        L_0x063b:
            X.1DS r2 = r0.A00
            r1 = 5
            X.AGm r0 = new X.AGm
            r0.<init>(r5, r6, r1)
            r2.A0A(r3, r0)
            X.8F5 r0 = r6.A0e
            r0.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2.A02(X.01E, X.11S, X.AES, X.9I2, X.9nV, java.lang.String, java.util.List, int, int):void");
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A0d) {
            this.A0d = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r2 = r1.A10;
            this.A0R = AnonymousClass10E.A8r(r2);
            AnonymousClass10G r3 = r2.A00;
            this.A0V = AnonymousClass3MY.A0e(r3);
            this.A0P = AnonymousClass3MZ.A0l(r2);
            this.A0X = AnonymousClass10E.AL1(r2);
            this.A0Z = C000200d.A00(r2.A1o);
            this.A0U = AnonymousClass8BU.A0V(r2);
            this.A0M = AnonymousClass3MZ.A0i(r2);
            this.A0O = AnonymousClass3Ma.A0a(r2);
            this.A0Q = AnonymousClass10E.A6Q(r2);
            this.A0S = (AnonymousClass2UJ) r3.A3d.get();
            this.A0W = (C32021gV) r2.A6k.get();
            AnonymousClass1K1 r12 = r1.A0z;
            this.A0K = (C20005A2v) r12.A0X.get();
            this.A0J = (C192789oz) r2.A8n.get();
            this.A0N = (C36531o3) r2.A2n.get();
            this.A0T = AnonymousClass3Ma.A0q(r2);
            this.A0I = AnonymousClass8BU.A0D(r2);
            this.A0L = AnonymousClass3MZ.A0d(r2);
            this.A0b = C000200d.A00(r2.Acm);
            this.A0H = (A2H) r2.AHZ.get();
            this.A0a = C000200d.A00(r12.A0V);
            this.A07 = (C182519Ur) r12.A2l.get();
            this.A0G = (C22417B6z) r12.A2N.get();
        }
        LayoutInflater.from(context).inflate(2131626322, this, true);
        this.A06 = C108945cZ.A0U(this, 2131433319);
        this.A0E = AnonymousClass3MW.A0T(this, 2131436322);
        this.A0F = AnonymousClass3MW.A0T(this, 2131436317);
        this.A0D = AnonymousClass3MW.A0T(this, 2131431706);
        this.A08 = AnonymousClass3MX.A0V(this, 2131431965);
        this.A0B = (WaButtonWithLoader) AnonymousClass1HF.A06(this, 2131434094);
        this.A0A = (WaButtonWithLoader) AnonymousClass1HF.A06(this, 2131429351);
        this.A0Y = AnonymousClass3MW.A0q(this, 2131433192);
        this.A0C = AnonymousClass3MW.A0T(this, 2131430720);
        this.A01 = AnonymousClass3MX.A0K(this, 2131435027);
        this.A09 = AnonymousClass3MX.A0V(this, 2131436040);
        this.A00 = AnonymousClass1HF.A06(this, 2131435340);
        this.A03 = (RelativeLayout) AnonymousClass1HF.A06(this, 2131428625);
        this.A04 = (RelativeLayout) AnonymousClass1HF.A06(this, 2131433507);
        this.A02 = (RelativeLayout) AnonymousClass1HF.A06(this, 2131428583);
        this.A05 = (RelativeLayout) AnonymousClass1HF.A06(this, 2131433757);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PaymentCheckoutOrderDetailsViewV2(Context context) {
        this(context, (AttributeSet) null);
    }
}

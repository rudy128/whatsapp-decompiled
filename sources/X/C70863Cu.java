package X;

import android.widget.LinearLayout;
import com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Cu  reason: invalid class name and case insensitive filesystem */
public class C70863Cu implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Integer} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:513:0x0d63=Splitter:B:513:0x0d63, B:509:0x0d38=Splitter:B:509:0x0d38} */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0d08;
                case 1: goto L_0x0cc2;
                case 2: goto L_0x0cb4;
                case 3: goto L_0x0c93;
                case 4: goto L_0x0c85;
                case 5: goto L_0x0c74;
                case 6: goto L_0x0c65;
                case 7: goto L_0x0c49;
                case 8: goto L_0x0c49;
                case 9: goto L_0x03b1;
                case 10: goto L_0x0c31;
                case 11: goto L_0x0b96;
                case 12: goto L_0x0384;
                case 13: goto L_0x0324;
                case 14: goto L_0x0b7c;
                case 15: goto L_0x0b6c;
                case 16: goto L_0x0b5e;
                case 17: goto L_0x02ae;
                case 18: goto L_0x024c;
                case 19: goto L_0x021f;
                case 20: goto L_0x0b49;
                case 21: goto L_0x0b32;
                case 22: goto L_0x0aef;
                case 23: goto L_0x0aa3;
                case 24: goto L_0x0a7d;
                case 25: goto L_0x01ea;
                case 26: goto L_0x09dc;
                case 27: goto L_0x09bd;
                case 28: goto L_0x095f;
                case 29: goto L_0x0184;
                case 30: goto L_0x0951;
                case 31: goto L_0x08eb;
                case 32: goto L_0x016c;
                case 33: goto L_0x012f;
                case 34: goto L_0x012f;
                case 35: goto L_0x08a4;
                case 36: goto L_0x085c;
                case 37: goto L_0x00e3;
                case 38: goto L_0x00c1;
                case 39: goto L_0x0843;
                case 40: goto L_0x082e;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x07f5;
                case 44: goto L_0x0060;
                case 45: goto L_0x0799;
                case 46: goto L_0x0658;
                case 47: goto L_0x048c;
                case 48: goto L_0x0476;
                case 49: goto L_0x0022;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A02
            X.478 r1 = (X.AnonymousClass478) r1
            int r4 = r0.A01
            java.lang.Object r3 = r0.A03
            X.47S r3 = (X.AnonymousClass47S) r3
            r2 = 0
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            boolean[] r1 = r1.A00
            boolean r0 = r1[r4]
            if (r0 == 0) goto L_0x0021
            r3.A00()
            r1[r4] = r2
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r4 = r0.A02
            X.6Js r4 = (X.C121456Js) r4
            int r3 = r0.A01
            java.lang.Object r5 = r0.A03
            java.lang.ref.Reference r5 = (java.lang.ref.Reference) r5
            java.util.List r0 = X.C42011xT.A0I
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            android.view.View r2 = r4.A0H
            android.content.Context r1 = r2.getContext()
            r0 = 2131233036(0x7f08090c, float:1.8082198E38)
            android.graphics.drawable.Drawable r7 = X.C24261Jm.A00(r1, r0)
            android.content.Context r0 = r2.getContext()
            android.graphics.drawable.Drawable r8 = X.C24261Jm.A00(r0, r3)
            java.lang.Object r6 = r5.get()
            if (r6 == 0) goto L_0x0021
            X.00H r0 = r4.A0H
            java.lang.Object r0 = r0.get()
            X.1KB r0 = (X.AnonymousClass1KB) r0
            r9 = 23
            X.7Py r4 = new X.7Py
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A0J(r4)
            return
        L_0x0060:
            java.lang.Object r3 = r0.A02
            X.6Gm r3 = (X.C120906Gm) r3
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r2 = r0.A01
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x007c
            r0 = r4
            X.21V r0 = (X.AnonymousClass21V) r0
            boolean r0 = X.AnonymousClass4H3.A00(r0)
            r1 = 1
            if (r0 != 0) goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00a9
            if (r1 != 0) goto L_0x00a9
            r3.A0a()
        L_0x0086:
            int r1 = r4.A0D()
            r0 = 4
            int r0 = X.C446824j.A00(r1, r0)
            if (r0 > 0) goto L_0x00a5
            r0 = 28
            if (r2 == r0) goto L_0x0099
            r0 = 27
            if (r2 != r0) goto L_0x0021
        L_0x0099:
            X.0ve r2 = r3.A0L
            r1 = 7497(0x1d49, float:1.0506E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0021
        L_0x00a5:
            X.C120906Gm.A01(r3)
            return
        L_0x00a9:
            r3.A0Q()
            r0 = 3
            if (r0 != r2) goto L_0x0086
            X.70O r0 = r3.A0K()
            r0.A0D()
            boolean r0 = r3.A0X()
            r3.A0V(r0)
            r3.A0O()
            goto L_0x0086
        L_0x00c1:
            java.lang.Object r4 = r0.A02
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r4 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r4
            java.lang.Object r1 = r0.A03
            X.1EC r1 = (X.AnonymousClass1EC) r1
            r3 = 3
            r2 = 0
            X.00H r0 = r4.A0N
            if (r0 == 0) goto L_0x0d21
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r1 = r0.A05(r1)
            if (r1 == 0) goto L_0x0021
            X.2iB r0 = r4.A0F
            if (r0 == 0) goto L_0x0d1e
            r0.A00(r1, r3, r2)
            return
        L_0x00e3:
            java.lang.Object r3 = r0.A02
            X.7DT r3 = (X.AnonymousClass7DT) r3
            int r2 = r0.A01
            java.lang.Object r4 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ptvcameraui/error: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", exception: "
            X.C17900vP.A0Z(r4, r0, r1)
            r0 = 4
            if (r2 != r0) goto L_0x010c
            java.lang.Object r0 = r3.A01
            X.74G r0 = (X.AnonymousClass74G) r0
            X.1KB r2 = r0.A0W
            r1 = 2131897838(0x7f122dee, float:1.9430577E38)
            r0 = 1
            r2.A08(r1, r0)
        L_0x010c:
            java.lang.Object r1 = r3.A01
            X.74G r1 = (X.AnonymousClass74G) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r3 = 0
            X.AnonymousClass74G.A06(r1, r0, r3)
            X.89h r0 = r1.A0a
            r0.BnQ()
            X.0vt r0 = r1.A0m
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0021
            X.190 r2 = r1.A0R
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "ptvcameraui/onCameraError"
            r2.A0G(r0, r1, r3)
            return
        L_0x012f:
            java.lang.Object r4 = r0.A02
            X.1mT r4 = (X.C35581mT) r4
            java.lang.Object r3 = r0.A03
            X.2rV r3 = (X.C62502rV) r3
            int r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "prekey count running low; remainingPreKeys="
            X.C17900vP.A0j(r0, r1, r2)
            java.lang.String r0 = "appending additional prekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Os r0 = r4.A04
            X.3Ez r2 = r0.A07()
            X.1P3 r1 = r4.A03     // Catch:{ all -> 0x0d2c }
            boolean r0 = r1.A0Z()     // Catch:{ all -> 0x0d2c }
            if (r0 != 0) goto L_0x015d
            java.lang.String r0 = "no unsent prekeys; generating some new ones"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d2c }
            r1.A0P()     // Catch:{ all -> 0x0d2c }
        L_0x015d:
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0d2c }
            r0.A07()     // Catch:{ all -> 0x0d2c }
            r0 = 0
            X.C62502rV.A00(r0, r3, r0)     // Catch:{ all -> 0x0d2c }
            if (r2 == 0) goto L_0x0021
            r2.close()
            return
        L_0x016c:
            java.lang.Object r2 = r0.A02
            X.1j0 r2 = (X.C33551j0) r2
            int r1 = r0.A01
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            X.1iz r0 = r2.A00
            X.1iw r2 = r0.A00(r1)
            if (r2 == 0) goto L_0x0021
            r1 = 1
            r0 = 0
            r2.BcE(r3, r1, r0)
            return
        L_0x0184:
            java.lang.Object r3 = r0.A02
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r3
            int r5 = r0.A01
            java.lang.Object r10 = r0.A03
            X.AES r10 = (X.AES) r10
            android.content.Intent r0 = r3.getIntent()
            X.205 r6 = X.AnonymousClass1R2.A03(r0)
            X.2f7 r9 = r3.A05
            java.lang.String r8 = r3.A0g
            X.Aa6 r7 = r3.A09
            r4 = 1
            X.C18070vi.A0d(r10, r4)
            X.C18070vi.A0k(r8, r6)
            r0 = 4
            X.C18070vi.A0d(r7, r0)
            X.AZ6 r2 = r9.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "in_address_message_select"
            r2.BiL(r1, r0, r8, r4)
            X.00H r0 = r9.A03
            java.lang.Object r0 = r0.get()
            X.A0J r0 = (X.A0J) r0
            r0.A01(r6)
            r10.A00 = r5
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r0 = r7.A05
            androidx.recyclerview.widget.RecyclerView r0 = r0.A06
            X.1rD r0 = r0.A0B
            if (r0 == 0) goto L_0x01ca
            r0.notifyDataSetChanged()
        L_0x01ca:
            X.9jf r2 = r9.A01
            X.8Gd r1 = r7.A06
            X.C18070vi.A0W(r1)
            X.35e r0 = new X.35e
            r0.<init>(r5)
            r2.A00(r1, r0, r6)
            boolean r0 = r3.Bg0()
            if (r0 == 0) goto L_0x0021
            r3.CEx()
            r3.finish()
            r0 = 0
            r3.overridePendingTransition(r0, r0)
            return
        L_0x01ea:
            java.lang.Object r3 = r0.A02
            X.1md r3 = (X.C35681md) r3
            java.lang.Object r2 = r0.A03
            X.1BI r2 = (X.AnonymousClass1BI) r2
            int r1 = r0.A01
            X.00H r0 = r3.A0V
            java.lang.Object r4 = r0.get()
            X.1i5 r4 = (X.C32991i5) r4
            X.1CJ r0 = r4.A02
            X.1ci r3 = r0.A0A(r2)
            boolean r0 = r3 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0021
            X.2Dk r3 = (X.C46162Dk) r3
            if (r3 == 0) goto L_0x0021
            r3.A00 = r1
            android.content.ContentValues r2 = X.C17880vN.A08()
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "admin_count"
            r2.put(r0, r1)
            X.C32991i5.A01(r2, r3, r4)
            return
        L_0x021f:
            java.lang.Object r4 = r0.A02
            X.2qF r4 = (X.C61782qF) r4
            java.lang.Object r3 = r0.A03
            X.1BI r3 = (X.AnonymousClass1BI) r3
            int r2 = r0.A01
            X.1Rj r0 = r4.A09
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0F
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L_0x023b
            X.1zh r1 = new X.1zh
            r1.<init>()
            r0.put(r3, r1)
        L_0x023b:
            X.1zh r1 = (X.C43371zh) r1
            r0 = 1
            r1.A02 = r0
            int r0 = r1.A00
            if (r0 == r2) goto L_0x0021
            r1.A00 = r2
            X.1mk r0 = r4.A04
            r0.A00(r3)
            return
        L_0x024c:
            java.lang.Object r6 = r0.A02
            X.2si r6 = (X.C63222si) r6
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r7 = r0.iterator()
        L_0x0258:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r7.next()
            X.205 r2 = (X.AnonymousClass205) r2
            X.00H r0 = r6.A0W
            java.lang.Object r1 = r0.get()
            X.2ip r1 = (X.C57282ip) r1
            r0 = 0
            X.206 r5 = r1.A00(r2, r0)
            if (r5 == 0) goto L_0x0258
            X.00H r0 = r6.A0h
            java.lang.Object r1 = r0.get()
            X.1Qw r1 = (X.C26111Qw) r1
            X.205 r0 = r5.A0v
            java.util.Set r4 = r1.A03(r0)
            boolean r0 = r5 instanceof X.AnonymousClass212
            if (r0 == 0) goto L_0x02a1
            r3 = 1
        L_0x0286:
            X.00H r0 = r6.A0U
            java.lang.Object r2 = r0.get()
            X.1PT r2 = (X.AnonymousClass1PT) r2
            X.2qt r1 = new X.2qt
            r1.<init>(r5)
            r0 = 4
            r1.A04 = r0
            r1.A03 = r3
            X.190 r0 = r6.A02
            X.C22971Dz.A0E(r0, r1, r4)
            X.C62162qt.A00(r1, r2, r4)
            goto L_0x0258
        L_0x02a1:
            X.00H r0 = r6.A0I
            java.lang.Object r0 = r0.get()
            X.122 r0 = (X.AnonymousClass122) r0
            int r3 = r0.BYx(r5)
            goto L_0x0286
        L_0x02ae:
            java.lang.Object r8 = r0.A02
            com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment r8 = (com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment) r8
            java.lang.Object r9 = r0.A03
            java.util.Map r9 = (java.util.Map) r9
            r7 = 2131891938(0x7f1216e2, float:1.941861E38)
            r6 = 0
            r5 = 1
            X.C18070vi.A0d(r9, r5)
            java.util.SortedMap r0 = r8.A03
            java.util.Iterator r10 = X.AnonymousClass000.A15(r0)
        L_0x02c4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0021
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r10)
            java.lang.Object r3 = r0.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r0 = r0.getValue()
            X.6r7 r0 = (X.C134766r7) r0
            int r0 = r0.A00
            java.lang.Object r2 = X.AnonymousClass000.A0w(r9, r0)
            X.6r6 r2 = (X.C134756r6) r2
            if (r2 == 0) goto L_0x02c4
            android.view.View r1 = r8.A0B
            if (r1 == 0) goto L_0x02c4
            X.C18070vi.A0b(r3)
            int r0 = r3.intValue()
            android.view.View r4 = r1.findViewById(r0)
            com.whatsapp.radio.RadioButtonWithSubtitle r4 = (com.whatsapp.radio.RadioButtonWithSubtitle) r4
            if (r4 == 0) goto L_0x02c4
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r0 = r2.A01
            X.C17880vN.A1T(r1, r0, r6)
            int r0 = r2.A00
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r3 = r8.A1I(r7, r1)
            java.lang.CharSequence r2 = r4.A00
            if (r3 == 0) goto L_0x0320
            if (r2 == 0) goto L_0x031f
            r1 = 2131891932(0x7f1216dc, float:1.9418598E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r3
            r0[r5] = r2
            java.lang.String r0 = r8.A1I(r1, r0)
            if (r0 == 0) goto L_0x031f
            r3 = r0
        L_0x031f:
            r2 = r3
        L_0x0320:
            r4.setSubTitle(r2)
            goto L_0x02c4
        L_0x0324:
            java.lang.Object r4 = r0.A02
            X.31p r4 = (X.C679831p) r4
            java.lang.Object r1 = r0.A03
            X.184 r1 = (X.AnonymousClass184) r1
            int r6 = r0.A01
            X.C679831p.A03(r1, r4)
            int r0 = r1.bufferChannel
            r7 = 2
            java.lang.Object r5 = r1.clone()
            X.184 r5 = (X.AnonymousClass184) r5
            if (r0 != r7) goto L_0x0360
            boolean r0 = X.C679831p.A0D(r4)
            if (r0 == 0) goto L_0x0021
            boolean r0 = r4.A0Z
            if (r0 != 0) goto L_0x0d38
            X.0z4 r0 = r4.A0I
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "private_stats_id"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            X.182 r1 = r4.A0L
            java.util.ArrayList r0 = X.C24311Jr.A00()
            r1.A06(r0, r2)
            r0 = 1
            r4.A0Z = r0
            goto L_0x0d38
        L_0x0360:
            boolean r0 = X.C679831p.A0C(r4)
            if (r0 == 0) goto L_0x0021
            boolean r0 = r4.A0Z
            if (r0 != 0) goto L_0x0d63
            X.0z4 r0 = r4.A0I
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "private_stats_id"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            X.182 r1 = r4.A0L
            java.util.ArrayList r0 = X.C24311Jr.A00()
            r1.A06(r0, r2)
            r0 = 1
            r4.A0Z = r0
            goto L_0x0d63
        L_0x0384:
            java.lang.Object r4 = r0.A02
            X.31p r4 = (X.C679831p) r4
            java.lang.Object r1 = r0.A03
            X.184 r1 = (X.AnonymousClass184) r1
            int r3 = r0.A01
            X.C679831p.A03(r1, r4)
            int r2 = r1.bufferChannel
            r0 = 1
            java.lang.Object r1 = r1.clone()
            X.184 r1 = (X.AnonymousClass184) r1
            if (r2 != r0) goto L_0x0d94
            boolean r0 = X.C679831p.A0E(r4)
            if (r0 == 0) goto L_0x0021
            X.Cmk r0 = r4.A07
            r0.A02(r1, r3)
            X.Cmk r1 = r4.A07
            r0 = 0
            r1.A03(r0)
            X.C679831p.A07(r4)
            return
        L_0x03b1:
            java.lang.Object r1 = r0.A02
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r2 = r0.A03
            X.2rS r2 = (X.C62472rS) r2
            int r15 = r0.A01
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r8 = r1.get()
            com.whatsapp.deeplink.DeepLinkActivity r8 = (com.whatsapp.deeplink.DeepLinkActivity) r8
            if (r8 == 0) goto L_0x0021
            java.lang.Integer r1 = r2.A01
            X.1E7 r5 = r2.A00
            java.lang.String r4 = r2.A03
            java.lang.Long r12 = r2.A02
            r8.CEx()
            android.os.Handler r0 = r8.A00
            r3 = 1
            r2 = 4
            r0.removeMessages(r3)
            X.1i4 r0 = r8.A0X
            X.0ve r7 = r0.A01
            r6 = 12744(0x31c8, float:1.7858E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r6)
            r10 = 0
            if (r0 == 0) goto L_0x0415
            if (r5 == 0) goto L_0x0413
            boolean r0 = r5.A0B()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            X.1yf r0 = r5.A0G
            java.lang.Integer r11 = X.C1408473h.A02(r0)
        L_0x03f8:
            java.lang.String r13 = r8.A1E
        L_0x03fa:
            X.4Rg r9 = r8.A0Y
            r14 = 153(0x99, float:2.14E-43)
            r9.A00(r10, r11, r12, r13, r14, r15)
            int r1 = r1.intValue()
            if (r1 == r2) goto L_0x0419
            r0 = 2
            if (r1 == r0) goto L_0x0445
            if (r1 == r3) goto L_0x0dad
            r0 = 3
            if (r1 == r0) goto L_0x0d99
            r8.BtF()
            return
        L_0x0413:
            r11 = r10
            goto L_0x03f8
        L_0x0415:
            r13 = r10
            r11 = r10
            r12 = r10
            goto L_0x03fa
        L_0x0419:
            if (r5 == 0) goto L_0x0dba
            if (r4 == 0) goto L_0x0dba
            r8.A0W = r5
            java.lang.String[] r3 = new java.lang.String[r3]
            r2 = 0
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r4.replace(r1, r0)
            r3[r2] = r0
            r0 = 2131887809(0x7f1206c1, float:1.9410236E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = 2131887811(0x7f1206c3, float:1.941024E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 2131887810(0x7f1206c2, float:1.9410238E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.String r14 = "call_phone_number_deep_link_start_call_dialog_tag"
            goto L_0x046e
        L_0x0445:
            if (r4 == 0) goto L_0x0021
            java.lang.String[] r3 = new java.lang.String[r3]
            r2 = 0
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r4.replace(r1, r0)
            r3[r2] = r0
            r8.A1D = r4
            r0 = 2131887808(0x7f1206c0, float:1.9410234E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = 2131888815(0x7f120aaf, float:1.9412276E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 2131887810(0x7f1206c2, float:1.9410238E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.String r14 = "call_phone_number_deep_link_not_on_wa_dialog_tag"
        L_0x046e:
            r15 = r9
            r13 = r9
            r16 = r3
            r8.CMx(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0476:
            java.lang.Object r2 = r0.A02
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A03
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2.setBackgroundColor(r1)
            r2.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2.setScaleType(r0)
            return
        L_0x048c:
            java.lang.Object r4 = r0.A02
            X.1ni r4 = (X.C36331ni) r4
            java.lang.Object r5 = r0.A03
            X.206 r5 = (X.AnonymousClass206) r5
            int r9 = r0.A01
            X.2HI r3 = new X.2HI
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3.A08 = r0
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.205 r0 = r5.A0v
            X.1BI r2 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x0632
            r1 = 2
        L_0x04b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A0A = r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11P r0 = r4.A04
            long r0 = X.AnonymousClass11P.A01(r0)
            long r6 = r5.A0G
            long r0 = r0 - r6
            long r0 = r8.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0F = r0
            int r6 = r5.A0u
            r0 = 11
            r1 = 1
            if (r6 == r0) goto L_0x04e7
            r0 = 31
            r1 = 2
            if (r6 == r0) goto L_0x04e7
            r0 = 98
            r1 = 5
            if (r6 == r0) goto L_0x04e7
            r0 = 95
            r1 = 4
            if (r6 == r0) goto L_0x04e7
            r0 = 96
            r1 = 6
            if (r6 == r0) goto L_0x04e7
            r1 = 0
        L_0x04e7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A0B = r0
            int r0 = X.C64002u3.A05(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A07 = r0
            X.00H r0 = r4.A0F
            int r0 = X.C62242r5.A00(r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
            r8 = 1
            if (r9 != r8) goto L_0x0519
            boolean r0 = r5 instanceof X.AnonymousClass23Z
            if (r0 == 0) goto L_0x0519
            r0 = r5
            X.23Z r0 = (X.AnonymousClass23Z) r0
            int r0 = r0.A00
            switch(r0) {
                case 1: goto L_0x062f;
                case 2: goto L_0x062c;
                case 3: goto L_0x0629;
                case 4: goto L_0x0626;
                case 5: goto L_0x0623;
                case 6: goto L_0x0620;
                case 7: goto L_0x061d;
                case 8: goto L_0x0619;
                case 9: goto L_0x0615;
                case 10: goto L_0x0611;
                case 11: goto L_0x060d;
                case 12: goto L_0x0609;
                case 13: goto L_0x0605;
                default: goto L_0x0512;
            }
        L_0x0512:
            r0 = 0
        L_0x0513:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A09 = r0
        L_0x0519:
            X.1PT r1 = r4.A0B
            com.whatsapp.jid.UserJid r0 = r5.A0I()
            boolean r0 = r1.A0K(r2, r0, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x0548
            X.00H r0 = r4.A0D
            java.lang.Object r1 = r0.get()
            X.2mo r1 = (X.C59742mo) r1
            r0 = r2
            X.1E9 r0 = (X.AnonymousClass1E9) r0
            java.lang.String r0 = r1.A01(r0)
            int r0 = X.C64002u3.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
        L_0x0548:
            X.1CJ r0 = r4.A06
            X.C18070vi.A0d(r0, r8)
            java.lang.Integer r0 = X.C64002u3.A07(r0, r2)
            r3.A0C = r0
            if (r2 == 0) goto L_0x05ff
            X.1MZ r0 = r4.A07
            java.util.HashSet r1 = r0.A08(r2)
        L_0x055b:
            X.190 r0 = r4.A01
            java.util.Set r0 = X.C22971Dz.A0D(r0, r1)
            int r0 = r0.size()
            int r7 = r1.size()
            if (r0 <= 0) goto L_0x0579
            long r0 = (long) r0
            r9 = 32
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0573
            r9 = r0
        L_0x0573:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r3.A0E = r0
        L_0x0579:
            if (r7 <= 0) goto L_0x0593
            long r0 = (long) r7
            r9 = 32
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0583
            r9 = r0
        L_0x0583:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r3.A0D = r0
            int r0 = X.C64002u3.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
        L_0x0593:
            if (r2 == 0) goto L_0x05ca
            java.lang.String r1 = X.C64002u3.A0B(r5)
            if (r1 == 0) goto L_0x05a7
            X.1Nl r0 = r4.A0A
            byte[] r0 = r0.A08()
            java.lang.String r0 = X.C25241Nl.A00(r0, r1)
            r3.A0G = r0
        L_0x05a7:
            X.00H r0 = r4.A0E
            java.lang.Object r1 = r0.get()
            X.12B r1 = (X.AnonymousClass12B) r1
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x05c3
            X.00H r0 = r1.A01
            r0.get()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r1 = r1.A01(r2)
            r0 = 1
            if (r1 != 0) goto L_0x05c4
        L_0x05c3:
            r0 = 0
        L_0x05c4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
        L_0x05ca:
            X.0z4 r0 = r4.A05
            long r6 = r0.A0R()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x05dd
            long r1 = r5.A0I
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x05dd
            r8 = 0
        L_0x05dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r3.A02 = r0
            com.whatsapp.jid.DeviceJid r1 = r5.A13
            if (r1 != 0) goto L_0x05f6
            X.36d r0 = X.C50362Ud.A00(r5)
            if (r0 == 0) goto L_0x05f0
            X.C50362Ud.A00(r5)
        L_0x05f0:
            X.18K r0 = r4.A09
            r0.CC4(r3)
            return
        L_0x05f6:
            X.11S r0 = r4.A02
            java.lang.Integer r0 = X.A8F.A05(r0, r1)
            r3.A04 = r0
            goto L_0x05f0
        L_0x05ff:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x055b
        L_0x0605:
            r0 = 13
            goto L_0x0513
        L_0x0609:
            r0 = 12
            goto L_0x0513
        L_0x060d:
            r0 = 11
            goto L_0x0513
        L_0x0611:
            r0 = 10
            goto L_0x0513
        L_0x0615:
            r0 = 9
            goto L_0x0513
        L_0x0619:
            r0 = 8
            goto L_0x0513
        L_0x061d:
            r0 = 3
            goto L_0x0513
        L_0x0620:
            r0 = 7
            goto L_0x0513
        L_0x0623:
            r0 = 2
            goto L_0x0513
        L_0x0626:
            r0 = 6
            goto L_0x0513
        L_0x0629:
            r0 = 5
            goto L_0x0513
        L_0x062c:
            r0 = 4
            goto L_0x0513
        L_0x062f:
            r0 = 1
            goto L_0x0513
        L_0x0632:
            boolean r0 = X.C22971Dz.A0a(r2)
            if (r0 == 0) goto L_0x063b
            r1 = 3
            goto L_0x04b0
        L_0x063b:
            boolean r0 = X.C22971Dz.A0O(r2)
            if (r0 != 0) goto L_0x0655
            X.1BI r0 = r5.A0H()
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 != 0) goto L_0x0655
            boolean r0 = X.C22971Dz.A0S(r2)
            r1 = 1
            if (r0 == 0) goto L_0x04b0
            r1 = 6
            goto L_0x04b0
        L_0x0655:
            r1 = 4
            goto L_0x04b0
        L_0x0658:
            java.lang.Object r7 = r0.A02
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r7 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r7
            java.lang.Object r6 = r0.A03
            X.725 r6 = (X.AnonymousClass725) r6
            int r5 = r0.A01
            r13 = 0
            r4 = 1
            X.00H r0 = r7.A0K
            if (r0 == 0) goto L_0x0d24
            java.lang.Object r8 = r0.get()
            X.72N r8 = (X.AnonymousClass72N) r8
            X.AnonymousClass72N.A01(r6, r8, r4)
            java.lang.String r3 = r6.A05     // Catch:{ IOException -> 0x0704 }
            if (r3 == 0) goto L_0x069d
            X.1Ns r0 = r8.A00     // Catch:{ IOException -> 0x0704 }
            X.17r r0 = r0.A00     // Catch:{ IOException -> 0x0704 }
            java.io.File r1 = r0.A0I()     // Catch:{ IOException -> 0x0704 }
            r0 = 47
            java.lang.String r0 = X.AnonymousClass1YF.A0M(r3, r3, r0)     // Catch:{ IOException -> 0x0704 }
            java.io.File r2 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x0704 }
            X.00H r0 = r8.A03     // Catch:{ IOException -> 0x0704 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0704 }
            X.17r r1 = (X.C218617r) r1     // Catch:{ IOException -> 0x0704 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0704 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0704 }
            r1.A0i(r0, r2)     // Catch:{ IOException -> 0x0704 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0704 }
            r6.A05 = r0     // Catch:{ IOException -> 0x0704 }
        L_0x069d:
            java.util.List r0 = r6.A07     // Catch:{ IOException -> 0x0704 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x0704 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ IOException -> 0x0704 }
            if (r0 == 0) goto L_0x070c
            java.util.List r0 = r6.A07     // Catch:{ IOException -> 0x0704 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x0704 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x0704 }
        L_0x06b1:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0704 }
            if (r0 == 0) goto L_0x070c
            java.lang.Object r2 = r12.next()     // Catch:{ IOException -> 0x0704 }
            X.77d r2 = (X.C1418377d) r2     // Catch:{ IOException -> 0x0704 }
            java.lang.String r0 = r2.A0B     // Catch:{ IOException -> 0x0704 }
            if (r0 == 0) goto L_0x06b1
            java.lang.String r11 = r2.A0F     // Catch:{ IOException -> 0x0704 }
            if (r11 == 0) goto L_0x06b1
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0704 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0704 }
            X.1Ns r0 = r8.A00     // Catch:{ IOException -> 0x0704 }
            X.17r r0 = r0.A00     // Catch:{ IOException -> 0x0704 }
            java.io.File r10 = r0.A0I()     // Catch:{ IOException -> 0x0704 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0704 }
            r1 = 47
            r0 = 45
            java.lang.String r0 = r11.replace(r1, r0)     // Catch:{ IOException -> 0x0704 }
            r9.append(r0)     // Catch:{ IOException -> 0x0704 }
            r0 = 46
            r9.append(r0)     // Catch:{ IOException -> 0x0704 }
            java.lang.String r0 = X.C21721ArX.A03(r3)     // Catch:{ IOException -> 0x0704 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r9)     // Catch:{ IOException -> 0x0704 }
            java.io.File r1 = X.C17880vN.A0e(r10, r0)     // Catch:{ IOException -> 0x0704 }
            X.00H r0 = r8.A03     // Catch:{ IOException -> 0x0704 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0704 }
            X.17r r0 = (X.C218617r) r0     // Catch:{ IOException -> 0x0704 }
            r0.A0i(r3, r1)     // Catch:{ IOException -> 0x0704 }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0704 }
            r2.A0B = r0     // Catch:{ IOException -> 0x0704 }
            goto L_0x06b1
        L_0x0704:
            r1 = move-exception
            java.lang.String r0 = "StickerDBStorage/moveStickerPackFilesToTray/failed to copy sticker"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x070d
        L_0x070c:
            r0 = 1
        L_0x070d:
            r3 = 0
            if (r0 == 0) goto L_0x0757
            X.00H r0 = r8.A05
            java.lang.Object r0 = r0.get()
            X.73Q r0 = (X.AnonymousClass73Q) r0
            r0.A04(r6)
            java.util.List r0 = r6.A07
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x0736
            X.00H r0 = r8.A07
            java.lang.Object r1 = r0.get()
            X.6uZ r1 = (X.C136886uZ) r1
            java.util.List r0 = r6.A07
            X.C18070vi.A0X(r0)
            r1.A04(r0)
        L_0x0736:
            X.00H r0 = r8.A08
            java.lang.Object r0 = r0.get()
            X.6qY r0 = (X.C134416qY) r0
            java.lang.String r2 = r6.A0H
            X.C18070vi.A0X(r2)
            r0.A02(r2)
            X.6lW r0 = r8.A02
            int r1 = r0.A00(r2)
            X.725 r0 = r8.A04(r2)
            if (r0 == 0) goto L_0x0757
            r0.A00 = r1
            r0.A0B = r4
            r3 = r0
        L_0x0757:
            X.63t r8 = new X.63t
            r8.<init>()
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r8.A02 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r8.A05 = r0
            r8.A01 = r1
            if (r3 != 0) goto L_0x076e
            r2 = 1
        L_0x076e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8.A04 = r0
            X.00H r0 = r7.A0S
            if (r0 == 0) goto L_0x0794
            java.lang.Object r0 = r0.get()
            X.18K r0 = (X.AnonymousClass18K) r0
            r0.CC7(r8)
            X.1KB r2 = r7.A05
            r1 = 10
            X.7RO r0 = new X.7RO
            r0.<init>(r3, r7, r6, r1)
            r2.A0J(r0)
            return
        L_0x0794:
            java.lang.String r0 = "wamRuntime"
            goto L_0x0d27
        L_0x0799:
            java.lang.Object r7 = r0.A02
            X.6KR r7 = (X.AnonymousClass6KR) r7
            int r8 = r0.A01
            java.lang.Object r6 = r0.A03
            android.view.View r6 = (android.view.View) r6
            java.util.List r0 = X.C42011xT.A0I
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            X.0vl r1 = r7.A0H
            java.lang.Object r0 = r1.getValue()
            X.1qy r0 = (X.C38251qy) r0
            android.view.View r4 = r0.A0j(r8)
            if (r4 == 0) goto L_0x07de
            X.0vl r0 = r7.A0J
            java.lang.Object r3 = r0.getValue()
            X.5ka r3 = (X.C111885ka) r3
            java.lang.Object r1 = r1.getValue()
            X.1qy r1 = (X.C38251qy) r1
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1P(r8)
            int[] r0 = r3.A0B(r4, r1, r0)
            r1 = r0[r5]
            r0 = r0[r2]
            r6.scrollBy(r1, r0)
            com.whatsapp.collections.ObservableRecyclerView r0 = r7.A09
            X.C18070vi.A0W(r0)
            r0.setVisibility(r5)
            return
        L_0x07de:
            java.lang.Object r2 = r1.getValue()
            X.1qy r2 = (X.C38251qy) r2
            com.whatsapp.collections.ObservableRecyclerView r1 = r7.A09
            X.1qZ r0 = new X.1qZ
            r0.<init>()
            r2.A1G(r1, r8)
            X.C18070vi.A0W(r1)
            r1.setVisibility(r5)
            return
        L_0x07f5:
            java.lang.Object r2 = r0.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r0.A01
            java.lang.Object r6 = r0.A03
            X.2fs r6 = (X.C55502fs) r6
            X.2Fl r5 = new X.2Fl
            r5.<init>()
            r5.A00 = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A01 = r0
            X.00H r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.9iv r0 = (X.C189339iv) r0
            java.lang.String r0 = r0.A00()
            r5.A03 = r0
            long r3 = r6.A00
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0828
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A02 = r0
        L_0x0828:
            X.18K r0 = r6.A02
            r0.CC7(r5)
            return
        L_0x082e:
            java.lang.Object r1 = r0.A02
            X.6yj r1 = (X.C139376yj) r1
            java.lang.Object r2 = r0.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r0 = r0.A01
            int r6 = X.C139376yj.A00(r0)
            r3 = 0
            r5 = r3
            r4 = r3
            r1.A01(r2, r3, r4, r5, r6)
            return
        L_0x0843:
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A03
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1 = -1
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r3.setLayoutParams(r0)
            r2.run()
            return
        L_0x085c:
            java.lang.Object r5 = r0.A02
            X.A6X r5 = (X.A6X) r5
            java.lang.Object r3 = r0.A03
            X.21K r3 = (X.AnonymousClass21K) r3
            r2 = 4
            X.9za r1 = r5.A05
            r0 = r3
            X.206 r0 = (X.AnonymousClass206) r0
            X.8ri r4 = r1.A01(r0, r2)
            X.AEt r0 = r3.BPK()     // Catch:{ JSONException -> 0x08a1 }
            X.C17960vV.A07(r0)     // Catch:{ JSONException -> 0x08a1 }
            java.lang.String r3 = X.A6X.A00(r0, r5)     // Catch:{ JSONException -> 0x08a1 }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x08a1 }
            java.lang.String r1 = "cta"
            java.lang.String r0 = "order_status"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x08a1 }
            X.1QL r0 = r5.A03     // Catch:{ JSONException -> 0x08a1 }
            boolean r1 = r0.A0E()     // Catch:{ JSONException -> 0x08a1 }
            java.lang.String r0 = "wa_pay_registered"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x08a1 }
            java.lang.String r0 = "p2m_type"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x08a1 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x08a1 }
            r4.A07 = r0     // Catch:{ JSONException -> 0x08a1 }
            X.18K r0 = r5.A02     // Catch:{ JSONException -> 0x08a1 }
            r0.CC4(r4)     // Catch:{ JSONException -> 0x08a1 }
            return
        L_0x08a1:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetailsUpdate failed to construct message class attributes"
            goto L_0x08e7
        L_0x08a4:
            java.lang.Object r4 = r0.A02
            X.A6X r4 = (X.A6X) r4
            java.lang.Object r5 = r0.A03
            X.21K r5 = (X.AnonymousClass21K) r5
            r2 = 4
            X.9za r1 = r4.A05
            r0 = r5
            X.206 r0 = (X.AnonymousClass206) r0
            X.8ri r3 = r1.A01(r0, r2)
            X.AEt r0 = r5.BPK()     // Catch:{ JSONException -> 0x08e5 }
            X.C17960vV.A07(r0)     // Catch:{ JSONException -> 0x08e5 }
            java.lang.String r1 = X.A6X.A00(r0, r4)     // Catch:{ JSONException -> 0x08e5 }
            r0 = 0
            org.json.JSONObject r2 = X.A6X.A02(r4, r1, r0)     // Catch:{ JSONException -> 0x08e5 }
            X.AEt r0 = r5.BPK()     // Catch:{ JSONException -> 0x08e5 }
            if (r0 == 0) goto L_0x08d9
            java.lang.String r1 = "is_template"
            java.lang.String r0 = r0.A0E     // Catch:{ JSONException -> 0x08e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x08e5 }
            r0 = r0 ^ 1
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x08e5 }
        L_0x08d9:
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x08e5 }
            r3.A07 = r0     // Catch:{ JSONException -> 0x08e5 }
            X.18K r0 = r4.A02     // Catch:{ JSONException -> 0x08e5 }
            r0.CC4(r3)     // Catch:{ JSONException -> 0x08e5 }
            return
        L_0x08e5:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetails failed to construct message class attributes"
        L_0x08e7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x08eb:
            java.lang.Object r6 = r0.A02
            com.whatsapp.pnh.RequestPhoneNumberViewModel r6 = (com.whatsapp.pnh.RequestPhoneNumberViewModel) r6
            java.lang.Object r5 = r0.A03
            X.1E2 r5 = (X.AnonymousClass1E2) r5
            int r7 = r0.A01
            X.1iW r8 = r6.A02
            X.1PP r0 = r8.A0x
            X.205 r4 = X.C17880vN.A0Z(r5, r0)
            X.11P r0 = r8.A0K
            long r2 = X.AnonymousClass11P.A01(r0)
            r0 = 72
            X.22x r1 = new X.22x
            r1.<init>(r4, r0, r2)
            X.122 r0 = r8.A0U
            r0.BBM(r1)
            X.1RL r8 = r6.A04
            monitor-enter(r8)
            X.1DL r0 = r8.A02     // Catch:{ all -> 0x094e }
            long r3 = r0.A09(r5)     // Catch:{ all -> 0x094e }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x093c
            boolean r0 = r8.A09(r5)     // Catch:{ all -> 0x094e }
            if (r0 != 0) goto L_0x093c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x094e }
            X.00H r0 = r8.A05     // Catch:{ all -> 0x094e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x094e }
            X.2nB r0 = (X.C59972nB) r0     // Catch:{ all -> 0x094e }
            boolean r0 = r0.A03(r3, r1)     // Catch:{ all -> 0x094e }
            if (r0 == 0) goto L_0x093c
            X.AnonymousClass1RL.A01(r8, r3, r1)     // Catch:{ all -> 0x094e }
            X.AnonymousClass1RL.A03(r8, r5, r3)     // Catch:{ all -> 0x094e }
        L_0x093c:
            monitor-exit(r8)
            X.00H r0 = r6.A06
            java.lang.Object r2 = r0.get()
            X.CVx r2 = (X.C25065CVx) r2
            r1 = 3
            r0 = 1
            r2.A00(r5, r1, r7, r0)
            com.whatsapp.pnh.RequestPhoneNumberViewModel.A00(r5, r6)
            return
        L_0x094e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0951:
            java.lang.Object r2 = r0.A02
            X.4VP r2 = (X.AnonymousClass4VP) r2
            java.lang.Object r1 = r0.A03
            X.1E2 r1 = (X.AnonymousClass1E2) r1
            int r0 = r0.A01
            r2.A02(r1, r0)
            return
        L_0x095f:
            java.lang.Object r2 = r0.A02
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r2
            java.lang.Object r3 = r0.A03
            X.AES r3 = (X.AES) r3
            int r6 = r0.A01
            X.Aa6 r0 = r2.A09
            X.8Gd r1 = r0.A06
            X.205 r0 = r2.A07
            X.C17960vV.A07(r0)
            X.21K r5 = r1.Bhj(r0)
            if (r5 == 0) goto L_0x09b2
            X.AEt r0 = r5.BPK()
            if (r0 == 0) goto L_0x09b2
            X.AEn r1 = r0.A02
            if (r1 == 0) goto L_0x09b2
            X.1QO r0 = r2.A0P
            boolean r0 = r0.A0L(r1)
            if (r0 == 0) goto L_0x09b2
            java.util.List r4 = r3.A04
            if (r4 == 0) goto L_0x09b2
            int r0 = r4.size()
            if (r6 >= r0) goto L_0x09b2
            r1 = 20
            X.AkE r0 = new X.AkE
            r0.<init>(r2, r1)
            r2.runOnUiThread(r0)
            X.8F3 r3 = r2.A0B
            X.205 r2 = r2.A07
            X.AEt r0 = r5.BPK()
            X.AEn r1 = r0.A02
            java.lang.Object r0 = r4.get(r6)
            X.AEV r0 = (X.AEV) r0
            r3.A0T(r0, r1, r2)
            return
        L_0x09b2:
            r1 = 29
            X.3Cu r0 = new X.3Cu
            r0.<init>(r2, r6, r1, r3)
            r2.runOnUiThread(r0)
            return
        L_0x09bd:
            java.lang.Object r1 = r0.A02
            X.70P r1 = (X.AnonymousClass70P) r1
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            int r9 = r0.A01
            X.00H r0 = r1.A04
            java.lang.Object r1 = r0.get()
            X.72y r1 = (X.C1407672y) r1
            r8 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r6 = r4
            r7 = r4
            r5 = r4
            X.C1407672y.A02(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x09dc:
            java.lang.Object r6 = r0.A02
            X.2gQ r6 = (X.C55822gQ) r6
            java.lang.Object r5 = r0.A03
            X.205 r5 = (X.AnonymousClass205) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.1BI r4 = r5.A00
            boolean r0 = r4 instanceof X.C29681ch
            if (r0 == 0) goto L_0x0a76
            r7 = r4
            X.1ch r7 = (X.C29681ch) r7
            if (r7 == 0) goto L_0x0a76
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.2nT r0 = (X.C60152nT) r0
            X.00H r0 = r0.A07
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.2ip r0 = (X.C57282ip) r0
            r13 = 0
            X.206 r3 = r0.A00(r5, r13)
            if (r3 != 0) goto L_0x0a23
            X.00H r0 = r6.A02
            X.1W6 r2 = X.C17880vN.A0c(r0)
            boolean r0 = r5.A02
            r1 = r0 ^ 1
            java.lang.String r0 = r5.A01
            X.205 r1 = X.AnonymousClass205.A01(r4, r0, r1)
            X.1W2 r0 = r2.A01
            X.206 r3 = r0.A05(r1)
            if (r3 != 0) goto L_0x0a23
            return
        L_0x0a23:
            r0 = 21
            r3.A0a(r0)
            boolean r0 = r3 instanceof X.AnonymousClass212
            if (r0 == 0) goto L_0x0a5e
            X.1WM r5 = r6.A00
            r4 = r3
            X.212 r4 = (X.AnonymousClass212) r4
            X.11m r2 = r5.A0E
            X.205 r0 = r4.A0v
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 7
            r2.A0A(r1, r0)
            X.AnonymousClass1WM.A06(r5, r4)
        L_0x0a40:
            boolean r0 = r3 instanceof X.AnonymousClass23N
            if (r0 == 0) goto L_0x0a6a
            X.35A r8 = new X.35A
            r8.<init>(r3, r6, r13)
            X.00H r0 = r6.A05
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.2rC r6 = (X.C62312rC) r6
            long r0 = r3.A0y
            r11 = 1
            java.lang.Long r9 = X.C17880vN.A0o(r0, r11)
            r10 = 0
            r6.A01(r7, r8, r9, r10, r11, r13)
            return
        L_0x0a5e:
            X.00H r0 = r6.A02
            X.1W6 r1 = X.C17880vN.A0c(r0)
            r0 = 23
            r1.A05(r3, r0)
            goto L_0x0a40
        L_0x0a6a:
            X.00H r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.2jH r0 = (X.C57562jH) r0
            r0.A00(r3)
            return
        L_0x0a76:
            java.lang.String r0 = "NewsletterJid expected"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0a7d:
            java.lang.Object r4 = r0.A02
            X.A7P r4 = (X.A7P) r4
            java.lang.Object r3 = r0.A03
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 8
            r2 = 0
            X.8sG r1 = X.A7P.A00(r4, r0)
            if (r3 == 0) goto L_0x0aa1
            int r0 = r3.intValue()
            if (r0 == 0) goto L_0x0a97
            r2 = 1
            if (r0 != r2) goto L_0x0aa1
        L_0x0a97:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0a9b:
            r1.A05 = r0
            X.A7P.A01(r1, r4)
            return
        L_0x0aa1:
            r0 = 0
            goto L_0x0a9b
        L_0x0aa3:
            java.lang.Object r5 = r0.A02
            X.1kx r5 = (X.C34711kx) r5
            java.lang.Object r4 = r0.A03
            int r2 = r0.A01
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A07
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L_0x0ac1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OfflineResumeManager/onOfflineCompleteProcessed all offline completes processed count="
            X.C17900vP.A0j(r0, r1, r2)
            X.3Du r0 = X.C71103Du.A00
            r5.notifyAllObservers(r0)
        L_0x0ac1:
            X.1fW r3 = r5.A04
            X.0ve r2 = r3.A0B
            X.0vf r1 = X.C18040vf.A01
            r0 = 4353(0x1101, float:6.1E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0add
            if (r4 == 0) goto L_0x0add
            X.10s r2 = r3.A0C
            r1 = 48
            X.3By r0 = new X.3By
            r0.<init>(r3, r4, r1)
            r2.execute(r0)
        L_0x0add:
            X.1Hc r3 = r5.A01
            r0 = 0
            r3.A01 = r0
            X.11A r2 = r3.A03
            r1 = 12
            X.3Bu r0 = new X.3Bu
            r0.<init>(r3, r1)
            r2.CGP(r0)
            return
        L_0x0aef:
            int r5 = r0.A01
            java.lang.Object r4 = r0.A02
            X.1kx r4 = (X.C34711kx) r4
            java.lang.Object r3 = r0.A03
            if (r5 != 0) goto L_0x0b23
            X.1ft r0 = r4.A03
            X.0vl r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            X.2q7 r2 = (X.C61702q7) r2
            monitor-enter(r2)
            java.util.LinkedHashSet r1 = r2.A00     // Catch:{ all -> 0x0c2e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0c2e }
            if (r0 != 0) goto L_0x0b22
            r1.size()     // Catch:{ all -> 0x0c2e }
            r1.clear()     // Catch:{ all -> 0x0c2e }
            r0 = 0
            r2.A02 = r0     // Catch:{ all -> 0x0c2e }
            r2.A03 = r0     // Catch:{ all -> 0x0c2e }
            android.content.SharedPreferences r0 = r2.A04     // Catch:{ all -> 0x0c2e }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0c2e }
            java.lang.String r0 = "key"
            X.C17880vN.A1B(r1, r0)     // Catch:{ all -> 0x0c2e }
        L_0x0b22:
            monitor-exit(r2)
        L_0x0b23:
            X.1gM r2 = r4.A02
            r0 = 21
            X.3Cu r1 = new X.3Cu
            r1.<init>(r4, r5, r0, r3)
            r0 = 14
            r2.A01(r1, r0)
            return
        L_0x0b32:
            java.lang.Object r5 = r0.A02
            X.1kx r5 = (X.C34711kx) r5
            java.lang.Object r4 = r0.A03
            int r3 = r0.A01
            X.1gM r2 = r5.A02
            r0 = 20
            X.3Cu r1 = new X.3Cu
            r1.<init>(r5, r3, r0, r4)
            r0 = 14
            r2.A02(r1, r0)
            return
        L_0x0b49:
            java.lang.Object r5 = r0.A02
            X.1kx r5 = (X.C34711kx) r5
            java.lang.Object r4 = r0.A03
            int r3 = r0.A01
            android.os.Handler r2 = r5.A00
            r1 = 23
            X.3Cu r0 = new X.3Cu
            r0.<init>(r5, r3, r1, r4)
            r2.post(r0)
            return
        L_0x0b5e:
            java.lang.Object r2 = r0.A02
            X.1Sa r2 = (X.C26411Sa) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A03
            X.2gb r0 = (X.C55932gb) r0
            X.C26411Sa.A00(r0, r2, r1)
            return
        L_0x0b6c:
            java.lang.Object r3 = r0.A02
            X.1hB r3 = (X.C32431hB) r3
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            int r1 = r0.A01
            X.1Lg r0 = r3.A08
            r0.A02(r2, r1)
            return
        L_0x0b7c:
            java.lang.Object r4 = r0.A02
            X.6oC r4 = (X.C133116oC) r4
            java.lang.Object r3 = r0.A03
            X.34B r3 = (X.AnonymousClass34B) r3
            int r2 = r0.A01
            X.1T6 r1 = r4.A04
            r0 = 0
            r1.A0J(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = r4.A00
            r0.put(r1, r3)
            return
        L_0x0b96:
            java.lang.Object r2 = r0.A02
            X.2E5 r2 = (X.AnonymousClass2E5) r2
            java.lang.Object r3 = r0.A03
            X.3Ld r3 = (X.C72233Ld) r3
            int r6 = r0.A01
            monitor-enter(r2)
            r0 = -1
            int r5 = r2.A05(r0)     // Catch:{ all -> 0x0c2e }
            monitor-exit(r2)
            monitor-enter(r2)
            r1 = 5
            r4 = 1
            if (r5 == 0) goto L_0x0be4
            if (r5 == r4) goto L_0x0bd2
            r0 = 2
            if (r5 == r0) goto L_0x0be4
            r0 = 3
            if (r5 == r0) goto L_0x0bd2
            r0 = 4
            if (r5 == r0) goto L_0x0be4
            if (r5 == r1) goto L_0x0c19
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c2e }
            java.lang.String r0 = "FilterManager/getFilesAsync/Unexpected state "
            r4.append(r0)     // Catch:{ all -> 0x0c2e }
            java.util.HashMap r1 = X.C24531Kr.A0J     // Catch:{ all -> 0x0c2e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c2e }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0c2e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0c2e }
            X.C17890vO.A19(r4, r0)     // Catch:{ all -> 0x0c2e }
            goto L_0x0c0d
        L_0x0bd2:
            java.util.HashMap r1 = X.C24531Kr.A0J     // Catch:{ all -> 0x0c2e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c2e }
            r1.get(r0)     // Catch:{ all -> 0x0c2e }
            if (r3 == 0) goto L_0x0c29
            monitor-enter(r2)     // Catch:{ all -> 0x0c2e }
            r0 = -1
            r2.A0B(r3, r0)     // Catch:{ all -> 0x0c2b }
            monitor-exit(r2)     // Catch:{ all -> 0x0c2e }
            goto L_0x0c29
        L_0x0be4:
            boolean r0 = r2.A0G()     // Catch:{ all -> 0x0c2e }
            if (r0 != 0) goto L_0x0c13
            if (r6 != 0) goto L_0x0bfc
            X.0z4 r1 = r2.A08     // Catch:{ all -> 0x0c2e }
            X.11E r0 = r2.A05     // Catch:{ all -> 0x0c2e }
            int r0 = r0.A03(r4)     // Catch:{ all -> 0x0c2e }
            int r0 = X.AnonymousClass2TA.A00(r1, r0)     // Catch:{ all -> 0x0c2e }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0c0d
        L_0x0bfc:
            monitor-enter(r2)     // Catch:{ all -> 0x0c2e }
            r0 = -1
            r2.A0A(r4, r0)     // Catch:{ all -> 0x0c2b }
            monitor-exit(r2)     // Catch:{ all -> 0x0c2e }
            if (r3 == 0) goto L_0x0c09
            monitor-enter(r2)     // Catch:{ all -> 0x0c2e }
            r2.A0B(r3, r0)     // Catch:{ all -> 0x0c2b }
            monitor-exit(r2)     // Catch:{ all -> 0x0c2e }
        L_0x0c09:
            r2.A09(r6, r0)     // Catch:{ all -> 0x0c2e }
            goto L_0x0c29
        L_0x0c0d:
            if (r3 == 0) goto L_0x0c29
            r3.Bsl()     // Catch:{ all -> 0x0c2e }
            goto L_0x0c29
        L_0x0c13:
            monitor-enter(r2)     // Catch:{ all -> 0x0c2e }
            r0 = -1
            r2.A0A(r1, r0)     // Catch:{ all -> 0x0c2b }
            monitor-exit(r2)     // Catch:{ all -> 0x0c2e }
        L_0x0c19:
            if (r3 == 0) goto L_0x0c29
            boolean r0 = r2.A0G()     // Catch:{ all -> 0x0c2e }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0c2e }
            java.util.HashMap r0 = r2.A0E()     // Catch:{ all -> 0x0c2e }
            r3.C2Y(r0)     // Catch:{ all -> 0x0c2e }
        L_0x0c29:
            monitor-exit(r2)
            return
        L_0x0c2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0c2e }
            throw r0     // Catch:{ all -> 0x0c2e }
        L_0x0c2e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0c31:
            java.lang.Object r8 = r0.A02
            X.1Kr r8 = (X.C24531Kr) r8
            java.lang.Object r7 = r0.A03
            X.2rg r7 = (X.C62612rg) r7
            int r6 = r0.A01
            r5 = 0
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.1Kj r0 = new X.1Kj
            r0.<init>(r1, r3)
            X.C24531Kr.A01(r8, r7, r0, r5, r6)
            return
        L_0x0c49:
            java.lang.Object r1 = r0.A02
            X.123 r1 = (X.AnonymousClass123) r1
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            int r2 = r0.A01
            X.00H r0 = r1.A02
            java.lang.Object r1 = r0.get()
            X.1U5 r1 = (X.AnonymousClass1U5) r1
            r0 = 406(0x196, float:5.69E-43)
            boolean r0 = X.AnonymousClass000.A1T(r2, r0)
            r1.A0B(r3, r0)
            return
        L_0x0c65:
            java.lang.Object r3 = r0.A02
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            int r1 = r0.A01
            r0 = 0
            r3.A0d(r2, r1, r0, r0)
            return
        L_0x0c74:
            java.lang.Object r4 = r0.A02
            X.4Yi r4 = (X.C88104Yi) r4
            java.lang.Object r3 = r0.A03
            X.206 r3 = (X.AnonymousClass206) r3
            int r2 = r0.A01
            r1 = 0
            X.1hH r0 = r4.A05
            r0.A01(r3, r2, r1)
            return
        L_0x0c85:
            java.lang.Object r2 = r0.A02
            X.1Q2 r2 = (X.AnonymousClass1Q2) r2
            java.lang.Object r1 = r0.A03
            X.206 r1 = (X.AnonymousClass206) r1
            int r0 = r0.A01
            X.AnonymousClass1Q2.A00(r2, r1, r0)
            return
        L_0x0c93:
            java.lang.Object r1 = r0.A02
            X.122 r1 = (X.AnonymousClass122) r1
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r3 = r0.A01
            X.00H r0 = r1.A1E
            X.1W6 r0 = X.C17880vN.A0c(r0)
            r0.A05(r4, r3)
            X.1Q2 r0 = r1.A0O
            android.os.Handler r2 = r0.A02
            r1 = 2
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r3, r0, r4)
            r0.sendToTarget()
            return
        L_0x0cb4:
            java.lang.Object r2 = r0.A02
            X.122 r2 = (X.AnonymousClass122) r2
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r0.A01
            r2.A0V(r1, r0)
            return
        L_0x0cc2:
            java.lang.Object r2 = r0.A02
            X.122 r2 = (X.AnonymousClass122) r2
            java.lang.Object r6 = r0.A03
            X.206 r6 = (X.AnonymousClass206) r6
            int r1 = r0.A01
            X.1R7 r0 = r2.A0b
            X.1Cd r0 = r0.A00
            X.1au r5 = r0.A05()
            X.AnonymousClass1R7.A00(r6)     // Catch:{ all -> 0x0d03 }
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x0d03 }
            X.AnonymousClass206.A04(r4, r6)     // Catch:{ all -> 0x0d03 }
            java.lang.String r0 = "send_count"
            X.C17880vN.A18(r4, r0, r1)     // Catch:{ all -> 0x0d03 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d03 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0d03 }
            java.lang.String r2 = "message_send_count"
            java.lang.String r1 = "INSERT_MESSAGE_SEND_COUNT_SQL"
            r0 = 5
            long r3 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x0d03 }
            long r1 = r6.A0x     // Catch:{ all -> 0x0d03 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "SendCountMessageStore/insertOrUpdateSendCount/inserted row should have same row_id"
            X.C17960vV.A0H(r1, r0)     // Catch:{ all -> 0x0d03 }
            r5.close()
            return
        L_0x0d03:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0d33 }
            throw r1
        L_0x0d08:
            java.lang.Object r1 = r0.A02
            X.122 r1 = (X.AnonymousClass122) r1
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r3 = r0.A01
            X.1Lg r2 = r1.A0S
            r1 = 5
            X.AWu r0 = new X.AWu
            r0.<init>(r4, r3, r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0d1e:
            java.lang.String r0 = "pnhDailyActionLoggingStore"
            goto L_0x0d27
        L_0x0d21:
            java.lang.String r0 = "communityChatManager"
            goto L_0x0d27
        L_0x0d24:
            java.lang.String r0 = "stickerDBStorage"
        L_0x0d27:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0d2c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0d37
            r2.close()     // Catch:{ all -> 0x0d33 }
            throw r1
        L_0x0d33:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x0d37:
            throw r1
        L_0x0d38:
            X.189 r3 = r4.A0M     // Catch:{ IllegalArgumentException -> 0x0d8e }
            X.182 r1 = r4.A0L     // Catch:{ IllegalArgumentException -> 0x0d8e }
            int r0 = r5.psId     // Catch:{ IllegalArgumentException -> 0x0d8e }
            java.lang.String r2 = r1.A03(r0)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            r1 = 3
            r0 = 6005(0x1775, float:8.415E-42)
            r3.CHx(r2, r0, r1)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            r3.CHx(r2, r0, r7)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            X.Cmk r0 = r4.A06
            r0.A02(r5, r6)
            X.Cmk r1 = r4.A06
            int r0 = r5.psId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r0)
            X.C679831p.A06(r4)
            return
        L_0x0d63:
            X.189 r3 = r4.A0M     // Catch:{ IllegalArgumentException -> 0x0d8e }
            X.182 r1 = r4.A0L     // Catch:{ IllegalArgumentException -> 0x0d8e }
            int r0 = r5.psId     // Catch:{ IllegalArgumentException -> 0x0d8e }
            java.lang.String r2 = r1.A03(r0)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            r1 = 3
            r0 = 6005(0x1775, float:8.415E-42)
            r3.CHx(r2, r0, r1)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            r3.CHx(r2, r0, r7)     // Catch:{ IllegalArgumentException -> 0x0d8e }
            X.Cmk r0 = r4.A05
            r0.A02(r5, r6)
            X.Cmk r1 = r4.A05
            int r0 = r5.psId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03(r0)
            X.C679831p.A05(r4)
            return
        L_0x0d8e:
            java.lang.String r0 = "invalid ps-id key"
            X.C679831p.A09(r4, r0)
            return
        L_0x0d94:
            r0 = 0
            X.C679831p.A04(r1, r4, r3, r0)
            return
        L_0x0d99:
            r0 = 2131887805(0x7f1206bd, float:1.9410227E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.String r14 = "call_phone_number_deep_link_call_not_allowed_dialog_tag"
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r9
            r11 = r9
            r8.CMx(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0dad:
            X.10I r2 = r8.A05
            r1 = 18
            X.4rM r0 = new X.4rM
            r0.<init>(r8, r1)
            r2.CGF(r0)
            return
        L_0x0dba:
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70863Cu.run():void");
    }

    public C70863Cu(AnonymousClass1EC r2, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        this.A00 = 38;
        this.A02 = reactionsBottomSheetDialogFragment;
        this.A03 = r2;
        this.A01 = 3;
    }

    public C70863Cu(C24531Kr r2, C62612rg r3, int i) {
        this.A00 = 10;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
    }

    public C70863Cu(C33251iW r2, AnonymousClass206 r3, int i) {
        this.A00 = 6;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
    }

    public C70863Cu(AnonymousClass21K r2, A6X a6x, int i) {
        this.A00 = i;
        this.A02 = a6x;
        this.A03 = r2;
        this.A01 = 4;
    }

    public C70863Cu(C63222si r2, List list) {
        this.A00 = 18;
        this.A02 = r2;
        this.A03 = list;
        this.A01 = 4;
    }

    public C70863Cu(C88104Yi r2, AnonymousClass206 r3, int i) {
        this.A00 = 5;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
    }

    public C70863Cu(A7P a7p, Integer num) {
        this.A00 = 24;
        this.A02 = a7p;
        this.A01 = 8;
        this.A03 = num;
    }

    public C70863Cu(LinearLayout linearLayout, Runnable runnable) {
        this.A00 = 39;
        this.A02 = linearLayout;
        this.A01 = -1;
        this.A03 = runnable;
    }

    public C70863Cu(ImageQualitySettingsBottomSheetFragment imageQualitySettingsBottomSheetFragment, Map map) {
        this.A00 = 17;
        this.A02 = imageQualitySettingsBottomSheetFragment;
        this.A03 = map;
        this.A01 = 2131891938;
    }

    public C70863Cu(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
    }
}

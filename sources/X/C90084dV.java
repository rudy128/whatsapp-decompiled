package X;

import android.view.View;

/* renamed from: X.4dV  reason: invalid class name and case insensitive filesystem */
public class C90084dV implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C90084dV(DOZ doz, DFL dfl, E8A e8a, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A02 = dfl;
                this.A03 = e8a;
                this.A01 = doz;
                return;
            default:
                this.A01 = dfl;
                this.A02 = e8a;
                this.A03 = doz;
                return;
        }
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new C90084dV(obj, obj2, obj3, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.2yM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v97, resolved type: X.2yM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v204, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: X.2yN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v207, resolved type: X.2CW} */
    /* JADX WARNING: type inference failed for: r4v82, types: [com.whatsapp.flows.ui.Hilt_CtwaFlowContextLoadingBottomSheet, com.whatsapp.flows.ui.CtwaFlowContextLoadingBottomSheet, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04d0, code lost:
        r3 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04d7, code lost:
        if (r3 == -1337936983) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04dc, code lost:
        if (r3 == 28903346) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04e1, code lost:
        if (r3 != 497130182) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e3, code lost:
        r0 = r1.equals("facebook");
        r2 = 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04eb, code lost:
        if (r0 != false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04ed, code lost:
        r2 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04ef, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04f1, code lost:
        if (r0 == null) goto L_0x0e62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f3, code lost:
        r7 = (X.AnonymousClass4P3) r0.get();
        r6 = X.AnonymousClass3MY.A04(r5);
        r5 = new X.AnonymousClass4QO(r4, r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0506, code lost:
        if (r3 == -1337936983) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x050b, code lost:
        if (r3 == 28903346) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0510, code lost:
        if (r3 != 497130182) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0518, code lost:
        if (r1.equals("facebook") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x051a, code lost:
        r11 = (X.C108215bK) r7.A03.get();
        r3 = r7.A02;
        r1 = (X.C108215bK) X.C18070vi.A0E(r3);
        X.C18070vi.A0d(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x053a, code lost:
        if (X.C24211Jh.A01(r6, r1.BVz()) == -1) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x053c, code lost:
        r11 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0540, code lost:
        r11 = (X.C108215bK) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0542, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0544, code lost:
        r8 = r11.BVz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0550, code lost:
        if (X.C24211Jh.A01(r6, r8) == -1) goto L_0x0e10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0552, code lost:
        r1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r11.BQN()));
        r1.addFlags(335544320);
        r1.setPackage(r8);
        r7.A00.A08(r6, r1);
        r5.A00(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0572, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0579, code lost:
        if (r1.equals("threads") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x057b, code lost:
        r0 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0584, code lost:
        if (r1.equals("instagram") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0586, code lost:
        r0 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0588, code lost:
        r11 = r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x058d, code lost:
        r0 = r1.equals("instagram");
        r2 = 34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0597, code lost:
        r0 = r1.equals("threads");
        r2 = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x09f6, code lost:
        if (X.C40811vJ.A0X(r6.A0T) != false) goto L_0x09f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09fd, code lost:
        r6.A0C.A0Z(r4, r5.A0J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a04, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a05, code lost:
        com.whatsapp.util.Log.w("voip/CallsFragment no activity registered to join ongoing call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0a0a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a2a, code lost:
        r0 = r1.A03;
        r8 = r3.A02;
        r3 = r3;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0aaf, code lost:
        r0 = r1.A01;
        r8 = r3.A02;
        r3 = r3;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0ab3, code lost:
        r5 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0ab7, code lost:
        if (r5.A02 == null) goto L_0x0abd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0ab9, code lost:
        com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A07(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0abc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0abd, code lost:
        r6 = 3;
        r9 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0ac6, code lost:
        if (r7.A0F() == false) goto L_0x0b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0ac8, code lost:
        r11 = X.AnonymousClass3MY.A0a(r7);
        r10 = X.C63982u1.A04(r5.A09, r5.A0G, r5.A0P, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0ad6, code lost:
        if (r4 != false) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0ad8, code lost:
        r2 = r5.A0D;
        r1 = r5.A1n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0aea, code lost:
        if ((!android.text.TextUtils.isEmpty(r5.A0C.A0Y.A01)) == false) goto L_0x0b17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0aec, code lost:
        r9 = 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0af2, code lost:
        if (r2.BjS(r1, r11, r10, r9) != false) goto L_0x0b11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0af4, code lost:
        if (r8 == false) goto L_0x0b0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0af6, code lost:
        r8 = (X.C192539oZ) r5.A0l.get();
        r8.A00();
        r8.A01(20, 3, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0b0e, code lost:
        com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0B(r5, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0b11, code lost:
        r5.A0C.A0Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0b16, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0b17, code lost:
        if (r8 != false) goto L_0x0aee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0b19, code lost:
        r9 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0b1c, code lost:
        X.C72453Mb.A1P(r5.A0q);
        r2 = r5.A0D;
        r1 = r5.A14();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0b33, code lost:
        if ((!android.text.TextUtils.isEmpty(r5.A0C.A0Y.A01)) == false) goto L_0x0b56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0b35, code lost:
        r9 = 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0b37, code lost:
        r2.CNw(r1, r7, r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0b3a, code lost:
        if (r8 == false) goto L_0x0b11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0b3c, code lost:
        r2 = (X.C192539oZ) r5.A0l.get();
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0b4b, code lost:
        if (r4 != false) goto L_0x0b4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0b4d, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0b4e, code lost:
        r2.A01(20, X.C17880vN.A0h(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0b56, code lost:
        if (r8 != false) goto L_0x0b37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0b58, code lost:
        r9 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0c20, code lost:
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0c24, code lost:
        r4.C1v(r3, X.C20109A7p.A00(r7, r5), X.C20109A7p.A02(r7, r5), X.C20109A7p.A01(r7, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0c33, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0c38, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0e1c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A01, 10316) == false) goto L_0x0e37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0e1e, code lost:
        r1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r11.Bbm()));
        r1.addFlags(335544320);
        r6.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0e33, code lost:
        r5.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0e36, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0e37, code lost:
        r1 = r6 instanceof android.app.Activity;
        r7.A04.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0e3e, code lost:
        if (r1 == false) goto L_0x0e5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0e40, code lost:
        r0 = X.AnonymousClass1L9.A00(r6);
        r2 = X.C1405872b.A00(r0, r8, true);
        r2.putExtra("callerId", r0.getPackageName());
        r2.putExtra("overlay", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0e57, code lost:
        r7.A00.A08(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0e5d, code lost:
        r2 = X.C1405872b.A00(r6, r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0e62, code lost:
        r0 = "appSwitchHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0e80, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0e84, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0495  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r10 = r23
            r6 = r22
            int r0 = r6.A00
            switch(r0) {
                case 2: goto L_0x0db5;
                case 3: goto L_0x0d92;
                case 4: goto L_0x06c8;
                case 5: goto L_0x0641;
                case 6: goto L_0x0d72;
                case 7: goto L_0x0d4c;
                case 8: goto L_0x05ff;
                case 9: goto L_0x05d3;
                case 10: goto L_0x05a1;
                case 11: goto L_0x0d2f;
                case 12: goto L_0x04c2;
                case 13: goto L_0x04b3;
                case 14: goto L_0x04a4;
                case 15: goto L_0x03f0;
                case 16: goto L_0x037e;
                case 17: goto L_0x0c70;
                case 18: goto L_0x0c3a;
                case 19: goto L_0x0bf7;
                case 20: goto L_0x0bd6;
                case 21: goto L_0x0bbb;
                case 22: goto L_0x0b95;
                case 23: goto L_0x0b81;
                case 24: goto L_0x0b5b;
                case 25: goto L_0x0aa0;
                case 26: goto L_0x0a90;
                case 27: goto L_0x0a30;
                case 28: goto L_0x0a1b;
                case 29: goto L_0x0a0b;
                case 30: goto L_0x09ce;
                case 31: goto L_0x09aa;
                case 32: goto L_0x0971;
                case 33: goto L_0x0939;
                case 34: goto L_0x0337;
                case 35: goto L_0x0919;
                case 36: goto L_0x08e9;
                case 37: goto L_0x08d1;
                case 38: goto L_0x02a8;
                case 39: goto L_0x0884;
                case 40: goto L_0x0275;
                case 41: goto L_0x025b;
                case 42: goto L_0x0865;
                case 43: goto L_0x01ec;
                case 44: goto L_0x00c7;
                case 45: goto L_0x084d;
                case 46: goto L_0x083e;
                case 47: goto L_0x071e;
                case 48: goto L_0x070e;
                case 49: goto L_0x002a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r6.A02
            X.DFL r4 = (X.DFL) r4
            java.lang.Object r3 = r6.A03
            X.E8A r3 = (X.E8A) r3
            X.A4p r2 = new X.A4p
            r2.<init>()
            r0 = 0
            r2.A03(r4, r0)
            r0 = 1
            java.lang.Object r1 = r6.A01
            X.DOZ r1 = (X.DOZ) r1
            r2.A03(r1, r0)
            X.9zJ r0 = r2.A02()
            X.C26209Cul.A01(r1, r4, r0, r3)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r4 = r6.A01
            X.4kt r4 = (X.C94604kt) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r7 = r6.A03
            java.util.Set r7 = (java.util.Set) r7
            X.5c6 r0 = r4.A0J
            X.10I r2 = r0.getWaWorkers()
            r1 = 42
            X.4rl r0 = new X.4rl
            r0.<init>(r4, r3, r1)
            r2.CGN(r0)
            X.18K r3 = r4.A0Z
            X.1Nl r6 = r4.A0a
            X.00H r0 = r4.A18
            java.lang.Object r5 = r0.get()
            X.2r5 r5 = (X.C62242r5) r5
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0029
            java.util.Iterator r8 = r7.iterator()
            r2 = -1
            r4 = 0
            r9 = r4
            r1 = -1
        L_0x005e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x008e
            X.206 r0 = X.C17880vN.A0Y(r8)
            if (r1 != r2) goto L_0x006d
            int r1 = r0.A0u
            r9 = r0
        L_0x006d:
            int r0 = r0.A0u
            if (r1 == r0) goto L_0x005e
        L_0x0071:
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0090
            X.206 r0 = X.C17880vN.A0Y(r1)
            if (r2 != 0) goto L_0x0087
            X.205 r0 = r0.A0v
            X.1BI r2 = r0.A00
            goto L_0x0076
        L_0x0087:
            boolean r0 = X.AnonymousClass3Ma.A1X(r0, r2)
            if (r0 != 0) goto L_0x0076
            return
        L_0x008e:
            r4 = r9
            goto L_0x0071
        L_0x0090:
            if (r2 == 0) goto L_0x0029
            X.3zS r1 = new X.3zS
            r1.<init>()
            boolean r0 = X.C22971Dz.A0e(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            int r0 = r7.size()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A03 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A02 = r0
            java.lang.String r0 = X.AnonymousClass3Ma.A14(r6, r2)
            r1.A04 = r0
            if (r4 == 0) goto L_0x00c3
            int r0 = r5.A01(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
        L_0x00c3:
            r3.CC7(r1)
            return
        L_0x00c7:
            java.lang.Object r1 = r6.A01
            X.3sy r1 = (X.C78543sy) r1
            java.lang.Object r10 = r6.A02
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.Object r0 = r6.A03
            X.4FP r0 = (X.AnonymousClass4FP) r0
            X.4OU r11 = r1.A0D
            X.4U7 r9 = X.C78543sy.A04(r1)
            java.lang.String r12 = X.C78543sy.A05(r1, r0)
            r13 = 2
            X.10I r2 = r11.A03
            r14 = 5
            X.4rm r8 = new X.4rm
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.CGF(r8)
            java.lang.String r5 = r0.A08
            java.lang.String r4 = r0.A07
            java.lang.String r3 = r0.A09
            if (r5 == 0) goto L_0x0198
            if (r3 == 0) goto L_0x0198
            java.lang.String r2 = X.C78543sy.A05(r1, r0)
            java.lang.String r14 = r0.A08
            if (r14 == 0) goto L_0x0115
            X.5Xd r6 = r1.getFlowsPreloaderWrapper()
            X.4ln r6 = (X.C95164ln) r6
            X.0ve r8 = r6.A00
            r0 = 5333(0x14d5, float:7.473E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x011f
            r0 = 1319(0x527, float:1.848E-42)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x011f
        L_0x0115:
            r7 = r10
            r10 = r3
            r11 = r2
            r6 = r1
            r8 = r5
            r9 = r4
            X.C78543sy.A08(r6, r7, r8, r9, r10, r11)
            return
        L_0x011f:
            X.9ph r18 = X.AnonymousClass9Q7.A00(r2, r14)
            r0 = 5764(0x1684, float:8.077E-42)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x0172
            X.00H r0 = r6.A04
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r0 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r0
            r15 = 1
            r16 = r0
            r17 = r10
            r19 = r14
            r20 = r2
            r21 = r15
            r16.A0B(r17, r18, r19, r20, r21)
        L_0x0141:
            X.00H r9 = r6.A02
            java.lang.Object r7 = r9.get()
            X.8sh r7 = (X.C172048sh) r7
            java.lang.String r0 = "prefetch_conversation"
            int r7 = r7.A0E(r10, r0)
            X.00H r8 = r6.A01
            java.lang.Object r0 = r8.get()
            X.A5U r0 = (X.A5U) r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            X.9dK r0 = r0.A03(r11, r14)
            if (r0 != 0) goto L_0x0189
            java.lang.Object r8 = r8.get()
            X.A5U r8 = (X.A5U) r8
            X.4nF r9 = new X.4nF
            r9.<init>(r6, r7)
            r12 = 0
            r13 = r12
            r8.A04(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0115
        L_0x0172:
            X.00H r0 = r6.A03
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.A8c r0 = (X.C20119A8c) r0
            r15 = 1
            r16 = r0
            r17 = r10
            r19 = r14
            r20 = r2
            r21 = r15
            r16.A08(r17, r18, r19, r20, r21)
            goto L_0x0141
        L_0x0189:
            java.lang.Object r6 = r9.get()
            X.8sh r6 = (X.C172048sh) r6
            java.lang.Short r0 = java.lang.Short.valueOf(r13)
            r6.A0G(r11, r0)
            goto L_0x0115
        L_0x0198:
            java.lang.String r5 = r0.A05
            if (r5 == 0) goto L_0x0029
            java.lang.String r6 = r0.A0A
            if (r6 == 0) goto L_0x0029
            java.lang.Boolean r2 = r0.A02
            boolean r7 = X.C72453Mb.A1Y(r2)
            java.lang.Boolean r2 = r0.A03
            boolean r8 = X.C72453Mb.A1Y(r2)
            com.whatsapp.flows.ui.CtwaFlowContextLoadingBottomSheet r4 = new com.whatsapp.flows.ui.CtwaFlowContextLoadingBottomSheet
            r4.<init>()
            X.1FY r3 = r1.A08
            java.lang.String r2 = "CtwaFlowContextLoadingBottomSheet"
            r3.CMk(r4, r2)
            X.1KB r11 = r1.A0S
            X.10I r3 = r1.A1X
            X.00H r2 = r1.getMessageClient()
            X.1OZ r15 = X.C17880vN.A0U(r2)
            X.1Hc r12 = r1.getXmppStateManager()
            X.4m9 r14 = new X.4m9
            r14.<init>(r1, r0, r4)
            X.00H r1 = r1.getCtwaFlowContextStore()
            java.lang.Object r13 = r1.get()
            X.44b r13 = (X.C822444b) r13
            X.4pj r10 = new X.4pj
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r4 = r0.A06
            com.whatsapp.jid.UserJid r3 = r0.A01
            r9 = 0
            X.4Ox r2 = new X.4Ox
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A01(r2)
            return
        L_0x01ec:
            java.lang.Object r4 = r6.A01
            X.3to r4 = (X.C78863to) r4
            java.lang.Object r5 = r6.A02
            java.lang.Object r7 = r6.A03
            X.4rF r7 = (X.C98494rF) r7
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            X.00H r0 = r4.getBotGating()
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            X.0ve r1 = r0.A00
            X.0vf r6 = X.C18040vf.A01
            r0 = 10665(0x29a9, float:1.4945E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0221
            X.9Ic r0 = X.C179479Ic.GOOGLE
            if (r5 != r0) goto L_0x0221
            java.lang.Object r3 = r7.element
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "app-meta-whatsapp-sa-r"
            java.lang.String r1 = "app-meta-whatsapp-sa-e"
            r0 = 0
            java.lang.String r0 = X.AnonymousClass1YE.A07(r3, r2, r1, r0)
            r7.element = r0
        L_0x0221:
            java.lang.Object r0 = r7.element
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r3 = android.net.Uri.parse(r0)
            X.1L9 r2 = r4.A0Q
            android.content.Context r1 = r4.getContext()
            r0 = 0
            r2.CGU(r1, r3, r0)
            X.00H r0 = r4.getBotGating()
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            X.0ve r1 = r0.A00
            r0 = 10706(0x29d2, float:1.5002E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0029
            X.9Ic r0 = X.C179479Ic.GOOGLE
            if (r5 != r0) goto L_0x0029
            X.206 r0 = r4.A0I
            X.205 r0 = r0.A0v
            X.1BI r2 = r0.A00
            if (r2 == 0) goto L_0x0029
            X.1i1 r1 = r4.getChatMessageCounts()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A0E(r2, r0)
            return
        L_0x025b:
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r6.A02
            X.0zA r2 = (X.C19880zA) r2
            java.lang.Object r1 = r6.A03
            X.0vk r1 = (X.C18090vk) r1
            r0 = 1
            android.content.Intent r0 = X.C1408473h.A00(r3, r2, r0)
            r3.startActivity(r0)
            if (r1 == 0) goto L_0x0029
            r1.invoke()
            return
        L_0x0275:
            java.lang.Object r7 = r6.A01
            X.3WX r7 = (X.AnonymousClass3WX) r7
            java.lang.Object r5 = r6.A02
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.Object r1 = r6.A03
            X.5mj r1 = (X.C113215mj) r1
            boolean r0 = r5.A0y
            if (r0 == 0) goto L_0x0029
            android.view.View r0 = r1.A00
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131886195(0x7f120073, float:1.9406962E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.1Me r0 = r7.A00
            java.lang.String r1 = r0.A0I(r5)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r4, r1, r2, r0, r3)
            r10.announceForAccessibility(r0)
            com.whatsapp.contact.picker.SelectedContactsList r0 = r7.A01
            X.5bh r0 = r0.A08
            r0.BEb(r5)
            return
        L_0x02a8:
            java.lang.Object r3 = r6.A01
            X.3gf r3 = (X.AnonymousClass3gf) r3
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r6.A03
            X.4OT r7 = (X.AnonymousClass4OT) r7
            int r0 = r1.size()
            r5 = 0
            r8 = 1
            if (r0 != r8) goto L_0x02e0
            java.lang.Object r0 = r1.get(r5)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.String r4 = X.AnonymousClass17K.A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0029
            java.lang.Integer r2 = r3.A4n()
            if (r2 == 0) goto L_0x0029
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0029
            X.733 r1 = r3.A0B
            java.lang.String r0 = "sms:"
            r1.A04(r3, r2, r4, r0)
            return
        L_0x02e0:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r1.iterator()
        L_0x02e8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0311
            X.1E7 r1 = X.C17880vN.A0O(r6)
            X.0vb r0 = r3.A0F
            java.lang.String r2 = X.C24921Me.A02(r3, r0, r1)
            java.lang.String r1 = X.AnonymousClass17K.A02(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x02e8
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02e8
            X.4cK r0 = new X.4cK
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x02e8
        L_0x0311:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0029
            r2 = 2131892049(0x7f121751, float:1.9418835E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.whatsapp.TextEmojiLabel r0 = r7.A02
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C17880vN.A0q(r3, r0, r1, r5, r2)
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r2 = com.whatsapp.contact.picker.PhoneNumberSelectionDialog.A00(r0, r4)
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r3)
            java.lang.String r0 = "phone_number_selection_dialog"
            r1.A0B(r2, r0)
            r1.A02()
            return
        L_0x0337:
            java.lang.Object r3 = r6.A01
            X.8Au r3 = (X.C160968Au) r3
            java.lang.Object r2 = r6.A02
            X.7C7 r2 = (X.AnonymousClass7C7) r2
            java.lang.Object r0 = r6.A03
            X.4VL r0 = (X.AnonymousClass4VL) r0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel r3 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel) r3
            X.1bI r0 = r0.A00
            android.view.View r1 = X.AnonymousClass3MX.A0D(r0)
            android.view.View$OnClickListener r0 = r2.A02
            if (r0 == 0) goto L_0x0353
            r0.onClick(r1)
            return
        L_0x0353:
            X.6Rd r0 = r2.A04
            int r1 = r0.ordinal()
            r0 = 13
            if (r1 == r0) goto L_0x0375
            r0 = 17
            if (r1 == r0) goto L_0x0372
            r0 = 0
            if (r1 != r0) goto L_0x0029
            X.1wy r1 = r3.A05
            r0 = 1
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1wy r1 = r3.A0A
        L_0x036c:
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0F(r0)
            return
        L_0x0372:
            X.1wy r1 = r3.A06
            goto L_0x036c
        L_0x0375:
            X.1wy r1 = r3.A05
            r0 = 1
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1wy r1 = r3.A07
            goto L_0x036c
        L_0x037e:
            java.lang.Object r3 = r6.A01
            X.3Wj r3 = (X.C73543Wj) r3
            java.lang.Object r1 = r6.A02
            X.1xT r1 = (X.C42011xT) r1
            java.lang.Object r2 = r6.A03
            X.4cI r2 = (X.C89334cI) r2
            java.util.List r0 = X.C42011xT.A0I
            int r1 = r1.A05()
            r0 = -1
            if (r1 == r0) goto L_0x039b
            java.util.List r0 = r3.A04
            r0.remove(r1)
            r3.A0I(r1)
        L_0x039b:
            X.5Wp r0 = r3.A00
            if (r0 == 0) goto L_0x0029
            X.4iE r0 = (X.C92974iE) r0
            X.4Ys r6 = r0.A00
            X.73D r5 = r6.A04
            android.net.Uri r4 = r2.A00
            X.72S r0 = r5.A02(r4)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r2, r0)
            java.util.List r3 = X.C18070vi.A0M(r0)
            X.10I r2 = r6.A0A
            r1 = 17
            X.AkI r0 = new X.AkI
            r0.<init>(r6, r3, r1)
            r2.CGF(r0)
            r5.A03(r4)
            java.util.ArrayList r0 = r5.A04()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03d1
            X.2K6 r0 = r6.A08
            r0.A06()
        L_0x03d1:
            X.3rd r0 = r6.A00
            if (r0 == 0) goto L_0x03d8
            r0.A06()
        L_0x03d8:
            X.3rd r0 = r6.A00
            if (r0 == 0) goto L_0x0029
            X.5Wq r1 = r0.A01
            if (r1 == 0) goto L_0x0029
            boolean r0 = r6.A05()
            X.4iF r1 = (X.C92984iF) r1
            X.4aY r1 = r1.A01
            int r0 = X.C72453Mb.A07(r0)
            X.AnonymousClass4aY.A1P(r1, r0)
            return
        L_0x03f0:
            java.lang.Object r4 = r6.A01
            X.5Wn r4 = (X.C106615Wn) r4
            java.lang.Object r2 = r6.A02
            X.3Z4 r2 = (X.AnonymousClass3Z4) r2
            java.lang.Object r1 = r6.A03
            X.24c r1 = (X.C446124c) r1
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.WaImageView r0 = r2.A00
            android.content.Context r6 = X.AnonymousClass3MY.A04(r0)
            java.lang.String r5 = r1.A02
            X.AEe r9 = r1.A00
            X.4iC r4 = (X.C92954iC) r4
            if (r9 != 0) goto L_0x0472
            r1 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131101293(0x7f06066d, float:1.7814992E38)
            int r1 = X.AnonymousClass3Ma.A00(r6, r1, r0)
            com.whatsapp.mentions.MentionableEntry r0 = r4.A05
            android.text.Editable r7 = r0.getText()
            if (r7 == 0) goto L_0x045e
            X.3Nk r6 = new X.3Nk
            r6.<init>(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "/"
            java.lang.String r8 = X.AnonymousClass001.A1H(r0, r5, r1)
            java.lang.String r2 = r7.toString()
            r1 = 47
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            int r0 = r2.length()
            int r0 = r0 + -1
            int r3 = X.AnonymousClass1YF.A0B(r2, r1, r0)
            int r2 = r7.length()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)
            r0 = 32
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
            r7.replace(r3, r2, r0)
            int r0 = r5.length()
            int r0 = r0 + r3
            int r1 = r0 + 1
            r0 = 33
            r7.setSpan(r6, r3, r1, r0)
        L_0x045e:
            com.whatsapp.jid.UserJid r2 = r4.A01
            if (r2 == 0) goto L_0x0029
            java.lang.String r0 = "imagine"
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x0029
            X.1i1 r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r1.A0D(r2, r0)
            return
        L_0x0472:
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0495
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x0029
            X.1l7 r2 = r4.A04
            r7 = 0
            java.lang.String r10 = "-1"
            java.lang.String r1 = "messageless_flow"
            java.lang.String r0 = r9.A00
            X.9ul r5 = r2.A02(r1, r0)
            if (r5 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r8 = r4.A01
            boolean r0 = r5 instanceof X.AnonymousClass8nz
            if (r0 != 0) goto L_0x0dfc
            java.lang.String r0 = "NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0495:
            boolean r0 = r6 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0029
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            if (r6 == 0) goto L_0x0029
            android.content.Context r6 = r6.getBaseContext()
            if (r6 == 0) goto L_0x0029
            goto L_0x0472
        L_0x04a4:
            java.lang.Object r4 = r6.A01
            X.4Nj r4 = (X.C85434Nj) r4
            java.lang.Object r5 = r6.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r8 = r6.A03
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r1 = "threads"
            goto L_0x04d0
        L_0x04b3:
            java.lang.Object r4 = r6.A01
            X.4Nj r4 = (X.C85434Nj) r4
            java.lang.Object r5 = r6.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r8 = r6.A03
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r1 = "facebook"
            goto L_0x04d0
        L_0x04c2:
            java.lang.Object r4 = r6.A01
            X.4Nj r4 = (X.C85434Nj) r4
            java.lang.Object r5 = r6.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r8 = r6.A03
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r1 = "instagram"
        L_0x04d0:
            int r3 = r1.hashCode()
            r0 = -1337936983(0xffffffffb040b3a9, float:-7.0104506E-10)
            if (r3 == r0) goto L_0x0597
            r0 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r3 == r0) goto L_0x058d
            r0 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r3 != r0) goto L_0x04ed
            java.lang.String r0 = "facebook"
            boolean r0 = r1.equals(r0)
            r2 = 35
        L_0x04eb:
            if (r0 != 0) goto L_0x04ef
        L_0x04ed:
            r2 = 22
        L_0x04ef:
            X.00H r0 = r4.A01
            if (r0 == 0) goto L_0x0e62
            java.lang.Object r7 = r0.get()
            X.4P3 r7 = (X.AnonymousClass4P3) r7
            android.content.Context r6 = X.AnonymousClass3MY.A04(r5)
            X.4QO r5 = new X.4QO
            r5.<init>(r4, r8, r2)
            r4 = 0
            r0 = -1337936983(0xffffffffb040b3a9, float:-7.0104506E-10)
            if (r3 == r0) goto L_0x0573
            r0 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r3 == r0) goto L_0x057e
            r0 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r3 != r0) goto L_0x0029
            java.lang.String r0 = "facebook"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.00H r0 = r7.A03
            java.lang.Object r11 = r0.get()
            X.5bK r11 = (X.C108215bK) r11
            X.00H r3 = r7.A02
            java.lang.Object r1 = X.C18070vi.A0E(r3)
            X.5bK r1 = (X.C108215bK) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = r1.BVz()
            long r8 = X.C24211Jh.A01(r6, r0)
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0542
            java.lang.Object r11 = r3.get()
        L_0x0540:
            X.5bK r11 = (X.C108215bK) r11
        L_0x0542:
            if (r11 == 0) goto L_0x0029
            java.lang.String r8 = r11.BVz()
            long r9 = X.C24211Jh.A01(r6, r8)
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0e10
            java.lang.String r0 = r11.BQN()
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)
            r1.setPackage(r8)
            X.1L9 r0 = r7.A00
            r0.A08(r6, r1)
            r0 = 1
            r5.A00(r0)
            return
        L_0x0573:
            java.lang.String r0 = "threads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.00H r0 = r7.A06
            goto L_0x0588
        L_0x057e:
            java.lang.String r0 = "instagram"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            X.00H r0 = r7.A05
        L_0x0588:
            java.lang.Object r11 = r0.get()
            goto L_0x0540
        L_0x058d:
            java.lang.String r0 = "instagram"
            boolean r0 = r1.equals(r0)
            r2 = 34
            goto L_0x04eb
        L_0x0597:
            java.lang.String r0 = "threads"
            boolean r0 = r1.equals(r0)
            r2 = 37
            goto L_0x04eb
        L_0x05a1:
            java.lang.Object r2 = r6.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            java.lang.Object r5 = r6.A02
            X.DFL r5 = (X.DFL) r5
            java.lang.Object r4 = r6.A03
            X.DOZ r4 = (X.DOZ) r4
            boolean r0 = r2.isChecked()
            r1 = r0 ^ 1
            r2.setChecked(r1)
            r0 = 40
            X.E8A r3 = r5.A0A(r0)
            if (r3 == 0) goto L_0x0029
            X.A4p r2 = new X.A4p
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0 = 0
            r2.A03(r1, r0)
            X.9zJ r0 = r2.A02()
            X.C26209Cul.A01(r4, r5, r0, r3)
            return
        L_0x05d3:
            java.lang.Object r0 = r6.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r3 = r6.A03
            X.8Fv r3 = (X.C161558Fv) r3
            if (r0 == 0) goto L_0x0029
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L_0x0029
            X.1FL r1 = X.C72453Mb.A0Z(r1)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r1.CNA(r0)
            if (r3 == 0) goto L_0x0029
            r3.A0U(r2)
            return
        L_0x05ff:
            java.lang.Object r0 = r6.A01
            X.1xT r0 = (X.C42011xT) r0
            java.lang.Object r3 = r6.A02
            X.B79 r3 = (X.B79) r3
            java.lang.Object r2 = r6.A03
            com.whatsapp.biz.cart.view.fragment.CartFragment r2 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r2
            X.AnonymousClass3MX.A1O(r0)
            int r1 = r0.A05()
            r0 = -1
            if (r1 == r0) goto L_0x0029
            X.9Wb r1 = r3.BQj(r1)
            boolean r0 = r1 instanceof X.C168018i9
            if (r0 == 0) goto L_0x0029
            X.8i9 r1 = (X.C168018i9) r1
            if (r1 == 0) goto L_0x0029
            X.9rM r0 = r1.A00
            X.AEv r0 = r0.A01
            java.lang.String r6 = r0.A0H
            if (r6 == 0) goto L_0x0029
            android.os.Bundle r1 = r2.A15()
            java.lang.String r0 = "extra_product_id"
            java.lang.String r0 = r1.getString(r0)
            X.8G8 r1 = r2.A2K()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0e65
            r2.A28()
            return
        L_0x0641:
            java.lang.Object r1 = r6.A01
            com.whatsapp.areffects.ArEffectsTrayCollectionFragment r1 = (com.whatsapp.areffects.ArEffectsTrayCollectionFragment) r1
            java.lang.Object r2 = r6.A02
            X.4Su r2 = (X.C86724Su) r2
            java.lang.Object r3 = r6.A03
            X.1bI r3 = (X.C28931bI) r3
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            java.lang.String r0 = "ArEffectsTrayCollectionFragment Flip camera accessory button clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11C r0 = r1.A01
            if (r0 == 0) goto L_0x0e7b
            X.AnonymousClass4a5.A01(r10, r0)
            X.0vl r0 = r1.A05
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r1 = X.AnonymousClass3MX.A0Y(r0)
            boolean r0 = r1 instanceof X.C75603ho
            if (r0 == 0) goto L_0x06b8
            X.3ho r1 = (X.C75603ho) r1
            X.7DY r1 = r1.A07
            r0 = 0
            r1.C87(r0)
        L_0x066f:
            java.lang.Long r5 = r2.A01
            if (r5 == 0) goto L_0x0029
            android.view.View r0 = r3.A02()
            com.whatsapp.areffects.button.ArEffectsAccessoryButton r0 = (com.whatsapp.areffects.button.ArEffectsAccessoryButton) r0
            com.whatsapp.wds.components.button.WDSButton r0 = r0.getButton()
            float r4 = r0.getRotation()
            android.view.View r0 = r3.A02()
            com.whatsapp.areffects.button.ArEffectsAccessoryButton r0 = (com.whatsapp.areffects.button.ArEffectsAccessoryButton) r0
            com.whatsapp.wds.components.button.WDSButton r0 = r0.getButton()
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1127481344(0x43340000, float:180.0)
            float r0 = r4 - r0
            android.view.ViewPropertyAnimator r2 = r1.rotation(r0)
            long r0 = r5.longValue()
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            android.view.ViewPropertyAnimator r2 = r1.setInterpolator(r0)
            r1 = 1
            X.7Pg r0 = new X.7Pg
            r0.<init>(r3, r4, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r0.start()
            return
        L_0x06b8:
            com.whatsapp.calling.areffects.CallArEffectsViewModel r1 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r1
            X.0vl r0 = r1.A0I
            java.lang.Object r1 = r0.getValue()
            X.1DS r1 = (X.AnonymousClass1DS) r1
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0E(r0)
            goto L_0x066f
        L_0x06c8:
            java.lang.Object r9 = r6.A01
            X.4aN r9 = (X.AnonymousClass4aN) r9
            java.lang.Object r2 = r6.A02
            X.0vc r2 = (X.C18010vc) r2
            java.lang.Object r4 = r6.A03
            X.0z4 r4 = (X.C19830z4) r4
            X.3RO r0 = r9.A04
            if (r0 == 0) goto L_0x06df
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x06df
            return
        L_0x06df:
            X.5gg r0 = r9.A03
            if (r0 == 0) goto L_0x06ea
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x06ea
            return
        L_0x06ea:
            X.3O9 r10 = (X.AnonymousClass3O9) r10
            android.graphics.drawable.Drawable r0 = r10.A01
            if (r0 == 0) goto L_0x0029
            int[] r3 = r10.A04
            if (r3 == 0) goto L_0x0029
            boolean r0 = X.AnonymousClass74I.A02(r3)
            if (r0 == 0) goto L_0x0e8a
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r2.A05(r0)
            java.lang.String r0 = X.C1409873v.A01(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0e85
            X.AnonymousClass4aN.A01(r10, r9)
            return
        L_0x070e:
            java.lang.Object r2 = r6.A01
            X.8nW r2 = (X.AnonymousClass8nW) r2
            java.lang.Object r1 = r6.A02
            X.23j r1 = (X.C444223j) r1
            java.lang.Object r0 = r6.A03
            android.content.Context r0 = (android.content.Context) r0
            r2.A2j(r0, r1)
            return
        L_0x071e:
            java.lang.Object r2 = r6.A01
            X.8nY r2 = (X.AnonymousClass8nY) r2
            java.lang.Object r3 = r6.A02
            X.AW0 r3 = (X.AW0) r3
            java.lang.Object r4 = r6.A03
            X.206 r4 = (X.AnonymousClass206) r4
            X.8pG r0 = r3.A0A
            r14 = 0
            if (r0 == 0) goto L_0x075f
            X.AEo r0 = r0.A02
            if (r0 == 0) goto L_0x075f
            X.1QO r7 = r2.A09
            X.ALX r6 = r2.A1K
            X.1BI r1 = r3.A0C
            if (r1 != 0) goto L_0x073d
            com.whatsapp.jid.UserJid r1 = r3.A0D
        L_0x073d:
            java.lang.String r0 = r0.A02
            X.205 r9 = new X.205
            r9.<init>(r1, r0, r14)
            X.1BI r5 = r9.A00
            X.C17960vV.A07(r5)
            android.content.Context r4 = r2.getContext()
            X.8pG r0 = r3.A0A
            X.AEo r0 = r0.A02
            java.lang.String r12 = r0.A01
            r15 = -1
            java.lang.String r13 = "chat"
            r8 = 0
            r11 = r8
            r10 = r8
            r16 = r14
            X.AnonymousClass9R5.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x075f:
            X.AW0 r6 = X.AnonymousClass25B.A00(r4)
            X.00H r0 = r2.A1g
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            X.C17960vV.A07(r6)
            com.whatsapp.jid.UserJid r0 = r6.A0D
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            boolean r0 = r1.A0P(r0)
            r7 = 1
            if (r0 == 0) goto L_0x07a6
            X.1M9 r1 = r2.A0j
            com.whatsapp.jid.UserJid r0 = r6.A0D
            X.1E7 r5 = r1.A0H(r0)
            android.content.Context r4 = r2.getContext()
            r3 = 2131893764(0x7f121e04, float:1.9422314E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.1Me r0 = r2.A0l
            X.AnonymousClass3MX.A1N(r0, r5, r1, r14)
            java.lang.String r1 = r4.getString(r3, r1)
            X.4i9 r0 = new X.4i9
            r0.<init>(r6, r2, r14)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = X.C87374Vi.A01(r0, r1, r14, r14)
            android.content.Context r0 = r2.getContext()
            X.1FR r0 = (X.AnonymousClass1FR) r0
            r0.CMl(r1)
            return
        L_0x07a6:
            X.ALX r1 = r2.A1K
            android.content.Context r0 = r2.getContext()
            android.content.Intent r3 = r1.A00(r0, r7, r14)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "chat"
            r3.putExtra(r1, r0)
            X.205 r0 = r4.A0v
            X.1BI r5 = r0.A00
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r1 = "extra_jid"
            if (r0 == 0) goto L_0x0837
            X.AnonymousClass3MY.A12(r3, r5, r1)
            com.whatsapp.jid.UserJid r0 = r6.A0D
            java.lang.String r0 = X.C22971Dz.A06(r0)
            java.lang.String r1 = "extra_receiver_jid"
        L_0x07cc:
            r3.putExtra(r1, r0)
            java.lang.String r5 = "extra_conversation_message_type"
            java.lang.String r1 = "extra_payment_note"
            java.lang.String r0 = r4.A0P()
            r3.putExtra(r1, r0)
            r3.putExtra(r5, r7)
            boolean r0 = r4.A0s()
            if (r0 == 0) goto L_0x07ee
            java.util.List r0 = r4.A0h
            java.lang.String r1 = X.AnonymousClass4aJ.A01(r0)
            java.lang.String r0 = "extra_mentioned_jids"
            r3.putExtra(r0, r1)
        L_0x07ee:
            X.1KN r0 = r6.A09
            if (r0 == 0) goto L_0x080a
            X.1QJ r0 = r2.A08
            X.1KJ r5 = r0.A01()
            X.0vb r1 = r2.A0D
            X.1KN r0 = r6.A09
            java.lang.String r1 = r5.BLa(r1, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            r3.putExtra(r0, r1)
            X.9oS r0 = r2.A0D
            r0.A01(r3)
        L_0x080a:
            X.AEX r1 = r6.A04()
            if (r1 == 0) goto L_0x0815
            java.lang.String r0 = "extra_payment_background"
            r3.putExtra(r0, r1)
        L_0x0815:
            boolean r0 = r4 instanceof X.C441322g
            if (r0 == 0) goto L_0x0833
            X.22g r4 = (X.C441322g) r4
            X.00H r0 = r2.A0H
            java.lang.Object r0 = r0.get()
            X.70H r0 = (X.AnonymousClass70H) r0
            X.77d r1 = r0.A01(r4)
            java.lang.String r0 = "extra_payment_sticker"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "extra_payment_sticker_send_origin"
            java.lang.Integer r0 = r4.A06
            r3.putExtra(r1, r0)
        L_0x0833:
            X.AnonymousClass3MY.A11(r3, r2)
            return
        L_0x0837:
            com.whatsapp.jid.UserJid r0 = r6.A0D
            java.lang.String r0 = X.C22971Dz.A06(r0)
            goto L_0x07cc
        L_0x083e:
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            r0.getContext()
            android.content.Context r0 = r0.getContext()
            X.C88404Zo.A01(r0)
            return
        L_0x084d:
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r6.A02
            X.BD1 r3 = (X.BD1) r3
            java.lang.Object r2 = r6.A03
            X.AW0 r2 = (X.AW0) r2
            android.content.Context r1 = r0.getContext()
            X.5cS r0 = X.C88404Zo.A02(r0)
            r3.Bkm(r1, r0, r2)
            return
        L_0x0865:
            java.lang.Object r0 = r6.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            java.lang.Object r4 = r6.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r6.A03
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.4mc r2 = r0.A1N
            X.206 r0 = r0.getFMessage()
            boolean r1 = r0.A0w()
            r0 = 0
            com.whatsapp.product.searchtheweb.GoogleSearchContentBottomSheet r0 = r2.A00(r4, r0, r1)
            r3.CMl(r0)
            return
        L_0x0884:
            java.lang.Object r4 = r6.A01
            X.3gf r4 = (X.AnonymousClass3gf) r4
            java.lang.Object r3 = r6.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r5 = r6.A03
            X.4SL r5 = (X.AnonymousClass4SL) r5
            boolean r0 = r4 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x08aa
            r2 = r4
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r2
            X.00H r0 = r2.A0G
            java.lang.Object r1 = r0.get()
            X.1VD r1 = (X.AnonymousClass1VD) r1
            r0 = 0
            boolean r0 = r1.A01(r3, r0)
            if (r0 == 0) goto L_0x08aa
            X.C74803cp.A0x(r2)
            return
        L_0x08aa:
            boolean r0 = r4.A5C(r3)
            if (r0 == 0) goto L_0x08b8
            boolean r0 = r3.A0y
            if (r0 != 0) goto L_0x08b8
            r4.A51(r3)
            return
        L_0x08b8:
            boolean r0 = r4.A5C(r3)
            if (r0 == 0) goto L_0x08cd
            boolean r0 = r3.A0y
            if (r0 == 0) goto L_0x08cd
            r0 = 2131896778(0x7f1229ca, float:1.9428427E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 1
            r5.A00(r1, r0, r0)
        L_0x08cd:
            r4.BEb(r3)
            return
        L_0x08d1:
            java.lang.Object r2 = r6.A01
            X.5yK r2 = (X.C116625yK) r2
            java.lang.Object r1 = r6.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Object r0 = r6.A03
            X.5xy r0 = (X.C116555xy) r0
            com.whatsapp.contact.picker.ContactPickerFragment r2 = r2.A04
            java.lang.String r1 = r1.A0K()
            java.util.List r0 = r0.A00
            r2.A2e(r1, r0)
            return
        L_0x08e9:
            java.lang.Object r2 = r6.A01
            com.whatsapp.companiondevice.SetDeviceNicknameFragment r2 = (com.whatsapp.companiondevice.SetDeviceNicknameFragment) r2
            java.lang.Object r5 = r6.A02
            java.lang.Object r1 = r6.A03
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.0vl r0 = r2.A07
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel r4 = (com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel) r4
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x090b
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L_0x090d
        L_0x090b:
            java.lang.String r3 = ""
        L_0x090d:
            X.10I r2 = r4.A02
            r1 = 6
            X.AkY r0 = new X.AkY
            r0.<init>(r4, r5, r3, r1)
            r2.CGF(r0)
            return
        L_0x0919:
            java.lang.Object r7 = r6.A01
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2 r7 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2) r7
            java.lang.Object r5 = r6.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r6.A03
            X.6Rd r4 = (X.C122636Rd) r4
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.1OX r3 = X.C41561wd.A00(r7)
            X.0wl r2 = r7.A0K
            r1 = 0
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1 r0 = new com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$getButtonOnClickForParticipantBanner$1$1
            r0.<init>(r4, r7, r5, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0939:
            java.lang.Object r4 = r6.A01
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r4 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r4
            java.lang.Object r3 = r6.A02
            X.7C7 r3 = (X.AnonymousClass7C7) r3
            java.lang.Object r2 = r6.A03
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel r2 = (com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel) r2
            java.util.List r1 = r3.A0B
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0956
            X.1wy r0 = r2.A09
            r0.A0F(r1)
        L_0x0952:
            r4.A01()
            return
        L_0x0956:
            X.6Rd r1 = r3.A04
            X.6Rd r0 = X.C122636Rd.A07
            if (r1 != r0) goto L_0x096a
            X.1wy r1 = r2.A05
            r0 = 1
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1wy r1 = r2.A07
        L_0x0964:
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0F(r0)
            goto L_0x0952
        L_0x096a:
            X.6Rd r0 = X.C122636Rd.A06
            if (r1 != r0) goto L_0x0952
            X.1wy r1 = r2.A06
            goto L_0x0964
        L_0x0971:
            java.lang.Object r1 = r6.A01
            X.3my r1 = (X.C76253my) r1
            java.lang.Object r5 = r6.A03
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.util.List r0 = X.C42011xT.A0I
            X.5Yt r4 = r1.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r4 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r4
            boolean r2 = r5.A0F()
            X.1L9 r3 = r4.A01
            X.00H r0 = r4.A0B
            if (r0 == 0) goto L_0x09a6
            java.lang.Object r1 = r0.get()
            X.1LU r1 = (X.AnonymousClass1LU) r1
            if (r2 == 0) goto L_0x099d
            X.1BI r2 = r5.A0J
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A13(r4, r2, r1, r0, r1)
        L_0x0999:
            r3.A08(r4, r0)
            return
        L_0x099d:
            java.lang.Integer r0 = X.C17880vN.A0m()
            android.content.Intent r0 = r1.A1v(r4, r5, r0)
            goto L_0x0999
        L_0x09a6:
            java.lang.String r0 = "waIntents"
            goto L_0x0e80
        L_0x09aa:
            java.lang.Object r0 = r6.A01
            X.BMN r0 = (X.BMN) r0
            java.lang.Object r5 = r6.A02
            X.9Bw r5 = (X.C178119Bw) r5
            java.lang.Object r4 = r6.A03
            X.2yI r4 = (X.C66512yI) r4
            X.AnonymousClass3MX.A1P(r5)
            X.1mC r0 = r0.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r6 = r0.A00
            X.1FL r3 = r6.A1B()
            if (r3 == 0) goto L_0x0a05
            boolean r2 = r5.A0W()
            X.1VP r1 = r6.A0D
            r0 = 3
            r1.BhC(r3, r5, r0, r2)
            goto L_0x09fd
        L_0x09ce:
            java.lang.Object r0 = r6.A01
            X.BMN r0 = (X.BMN) r0
            java.lang.Object r5 = r6.A02
            X.9Bw r5 = (X.C178119Bw) r5
            java.lang.Object r4 = r6.A03
            X.2yI r4 = (X.C66512yI) r4
            X.AnonymousClass3MX.A1P(r5)
            X.1mC r0 = r0.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r6 = r0.A00
            X.1FL r3 = r6.A1B()
            if (r3 == 0) goto L_0x0a05
            boolean r0 = r5.A0W()
            X.1VP r2 = r6.A0D
            if (r0 == 0) goto L_0x09f8
            X.0ve r0 = r6.A0T
            boolean r0 = X.C40811vJ.A0X(r0)
            r1 = 1
            if (r0 == 0) goto L_0x09f9
        L_0x09f8:
            r1 = 0
        L_0x09f9:
            r0 = 3
            r2.BhC(r3, r5, r0, r1)
        L_0x09fd:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r1 = r6.A0C
            boolean r0 = r5.A0J
            r1.A0Z(r4, r0)
            return
        L_0x0a05:
            java.lang.String r0 = "voip/CallsFragment no activity registered to join ongoing call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0a0b:
            java.lang.Object r1 = r6.A01
            X.2CW r1 = (X.AnonymousClass2CW) r1
            java.lang.Object r3 = r6.A02
            X.2yN r3 = (X.C66562yN) r3
            java.lang.Object r7 = r6.A03
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.util.List r0 = X.C42011xT.A0I
            r4 = 1
            goto L_0x0a2a
        L_0x0a1b:
            java.lang.Object r1 = r6.A01
            X.2CW r1 = (X.AnonymousClass2CW) r1
            java.lang.Object r3 = r6.A02
            X.2yN r3 = (X.C66562yN) r3
            java.lang.Object r7 = r6.A03
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.util.List r0 = X.C42011xT.A0I
            r4 = 0
        L_0x0a2a:
            X.1mB r0 = r1.A03
            boolean r8 = r3.A02
            goto L_0x0ab3
        L_0x0a30:
            java.lang.Object r3 = r6.A01
            X.0vd r3 = (X.C18020vd) r3
            java.lang.Object r2 = r6.A02
            X.00H r2 = (X.AnonymousClass00H) r2
            java.lang.Object r4 = r6.A03
            android.view.View r4 = (android.view.View) r4
            java.util.List r0 = X.C42011xT.A0I
            r0 = 3
            X.C18070vi.A0d(r10, r0)
            r0 = 5370(0x14fa, float:7.525E-42)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r3, r0)
            if (r0 <= 0) goto L_0x0a66
            r0 = 5757(0x167d, float:8.067E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x0a66
            java.lang.Object r3 = r2.get()
            X.73j r3 = (X.C1408673j) r3
            X.10s r2 = r3.A02
            r1 = 14
            X.3Bp r0 = new X.3Bp
            r0.<init>(r3, r1)
            r2.execute(r0)
        L_0x0a66:
            android.content.Context r5 = r4.getContext()
            android.content.Context r0 = X.AnonymousClass3MY.A04(r10)
            r4 = 16
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "hidden_jids"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "call_from_ui"
            r1.putExtra(r0, r4)
            r5.startActivity(r1)
            return
        L_0x0a90:
            java.lang.Object r1 = r6.A01
            X.2CV r1 = (X.AnonymousClass2CV) r1
            java.lang.Object r3 = r6.A02
            X.2yM r3 = (X.C66552yM) r3
            java.lang.Object r7 = r6.A03
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.util.List r0 = X.C42011xT.A0I
            r4 = 1
            goto L_0x0aaf
        L_0x0aa0:
            java.lang.Object r1 = r6.A01
            X.2CV r1 = (X.AnonymousClass2CV) r1
            java.lang.Object r3 = r6.A02
            X.2yM r3 = (X.C66552yM) r3
            java.lang.Object r7 = r6.A03
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.util.List r0 = X.C42011xT.A0I
            r4 = 0
        L_0x0aaf:
            X.1mB r0 = r1.A01
            boolean r8 = r3.A02
        L_0x0ab3:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r5 = r0.A00
            X.02B r0 = r5.A02
            if (r0 == 0) goto L_0x0abd
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A07(r1, r5)
            return
        L_0x0abd:
            boolean r0 = r7.A0F()
            r6 = 3
            r12 = 20
            r9 = 49
            if (r0 == 0) goto L_0x0b1c
            com.whatsapp.jid.GroupJid r11 = X.AnonymousClass3MY.A0a(r7)
            X.1MZ r2 = r5.A0P
            X.11S r1 = r5.A09
            X.1M9 r0 = r5.A0G
            java.util.List r10 = X.C63982u1.A04(r1, r0, r2, r7)
            if (r4 != 0) goto L_0x0af4
            X.1VP r2 = r5.A0D
            android.content.Context r1 = r5.A1n()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r5.A0C
            X.1vo r0 = r0.A0Y
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b17
            r9 = 35
        L_0x0aee:
            boolean r0 = r2.BjS(r1, r11, r10, r9)
            if (r0 != 0) goto L_0x0b11
        L_0x0af4:
            if (r8 == 0) goto L_0x0b0e
            X.00H r0 = r5.A0l
            java.lang.Object r8 = r0.get()
            X.9oZ r8 = (X.C192539oZ) r8
            r8.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r8.A01(r2, r0, r1)
        L_0x0b0e:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0B(r5, r7, r4)
        L_0x0b11:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r5.A0C
            r0.A0Z(r3, r4)
            return
        L_0x0b17:
            if (r8 != 0) goto L_0x0aee
            r9 = 16
            goto L_0x0aee
        L_0x0b1c:
            X.00H r0 = r5.A0q
            X.C72453Mb.A1P(r0)
            X.1VP r2 = r5.A0D
            android.content.Context r1 = r5.A14()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r5.A0C
            X.1vo r0 = r0.A0Y
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b56
            r9 = 35
        L_0x0b37:
            r2.CNw(r1, r7, r9, r4)
            if (r8 == 0) goto L_0x0b11
            X.00H r0 = r5.A0l
            java.lang.Object r2 = r0.get()
            X.9oZ r2 = (X.C192539oZ) r2
            r2.A00()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            if (r4 != 0) goto L_0x0b4e
            r6 = 2
        L_0x0b4e:
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.A01(r1, r0, r6)
            goto L_0x0b11
        L_0x0b56:
            if (r8 != 0) goto L_0x0b37
            r9 = 16
            goto L_0x0b37
        L_0x0b5b:
            java.lang.Object r4 = r6.A01
            X.3XM r4 = (X.AnonymousClass3XM) r4
            java.lang.Object r0 = r6.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.Object r1 = r6.A03
            X.3ZP r1 = (X.AnonymousClass3ZP) r1
            X.1BI r3 = X.AnonymousClass1E7.A00(r0)
            r2 = 0
            java.util.List r0 = X.C42011xT.A0I
            android.widget.ImageView r0 = r1.A02
            X.A09 r1 = new X.A09
            r1.<init>(r0, r3, r2)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            r1.A02 = r0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = r4.A01
            r1.A01(r0)
            return
        L_0x0b81:
            java.lang.Object r2 = r6.A02
            X.77M r2 = (X.AnonymousClass77M) r2
            java.lang.Object r1 = r6.A03
            X.1Di r1 = (X.C22821Di) r1
            X.C18070vi.A0j(r2, r1)
            X.76v r0 = r2.A05
            r0.A00()
            r1.invoke(r2)
            return
        L_0x0b95:
            java.lang.Object r4 = r6.A01
            X.43J r4 = (X.AnonymousClass43J) r4
            java.lang.Object r3 = r6.A02
            X.4Rk r3 = (X.C86384Rk) r3
            java.lang.Object r2 = r6.A03
            androidx.appcompat.widget.AppCompatCheckBox r1 = r4.A00
            boolean r0 = r1.isChecked()
            r3.A00 = r0
            boolean r1 = r1.isChecked()
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = r4.A01
            X.3T7 r0 = r0.A03
            java.util.Set r0 = r0.A03
            if (r1 == 0) goto L_0x0bb7
            r0.add(r2)
            return
        L_0x0bb7:
            r0.remove(r2)
            return
        L_0x0bbb:
            java.lang.Object r3 = r6.A01
            X.AA9 r3 = (X.AA9) r3
            java.lang.Object r0 = r6.A02
            X.5Ym r0 = (X.C107125Ym) r0
            java.lang.Object r2 = r6.A03
            android.app.Dialog r2 = (android.app.Dialog) r2
            r0.BxH()
            r1 = 1
            r3.A0D = r1
            X.8ve r0 = r3.A0J
            r0.A02(r1)
            r2.dismiss()
            return
        L_0x0bd6:
            java.lang.Object r7 = r6.A01
            X.A7p r7 = (X.C20109A7p) r7
            java.lang.Object r5 = r6.A02
            X.8wY r5 = (X.C174298wY) r5
            java.lang.Object r4 = r6.A03
            android.view.View r4 = (android.view.View) r4
            X.AF0 r0 = r5.A0B
            X.B7r r3 = r5.A09
            X.BD3 r2 = r5.A0A
            X.A6I r1 = r7.A0F
            java.lang.String r0 = r0.A0F
            r1.A04(r4, r3, r2, r0)
            X.BAb r4 = r5.A08
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0c38
            r0 = 2
            goto L_0x0c20
        L_0x0bf7:
            java.lang.Object r7 = r6.A01
            X.A7p r7 = (X.C20109A7p) r7
            java.lang.Object r5 = r6.A02
            X.8wY r5 = (X.C174298wY) r5
            java.lang.Object r4 = r6.A03
            android.view.View r4 = (android.view.View) r4
            X.AF0 r6 = r5.A0B
            X.B7r r3 = r5.A09
            X.BD3 r2 = r5.A0A
            X.A6I r1 = r7.A0F
            java.lang.String r0 = r6.A0F
            r1.A04(r4, r3, r2, r0)
            X.BAb r4 = r5.A08
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0c38
            boolean r0 = r6.A0P
            boolean r1 = r6.A0R
            if (r0 == 0) goto L_0x0c34
            r0 = 0
            if (r1 == 0) goto L_0x0c20
            r0 = 5
        L_0x0c20:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0c24:
            java.lang.Integer r2 = X.C20109A7p.A00(r7, r5)
            java.lang.Integer r1 = X.C20109A7p.A02(r7, r5)
            java.lang.Integer r0 = X.C20109A7p.A01(r7, r5)
            r4.C1v(r3, r2, r1, r0)
            return
        L_0x0c34:
            if (r1 == 0) goto L_0x0c38
            r0 = 4
            goto L_0x0c20
        L_0x0c38:
            r3 = 0
            goto L_0x0c24
        L_0x0c3a:
            java.lang.Object r4 = r6.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r1 = r6.A02
            X.1vD r1 = (X.C40751vD) r1
            java.lang.Object r0 = r6.A03
            X.1o3 r0 = (X.C36531o3) r0
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            java.lang.String r2 = "android.intent.action.VIEW"
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r0 = r1.A03()
            X.C18070vi.A0X(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r3.queryIntentActivities(r1, r0)
            if (r0 == 0) goto L_0x0c6c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0c6c
            r4.startActivity(r1)
        L_0x0c6c:
            r4.finish()
            return
        L_0x0c70:
            java.lang.Object r5 = r6.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeConsentBottomSheet r5 = (com.whatsapp.bot.metaai.imagineme.ImagineMeConsentBottomSheet) r5
            java.lang.Object r4 = r6.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r6 = r6.A03
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r3 = r4
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.LayoutInflater r2 = r5.A16()
            X.C18070vi.A0X(r2)
            r1 = 0
            r0 = 2131626053(0x7f0e0845, float:1.8879331E38)
            android.view.View r3 = X.AnonymousClass3MX.A0B(r2, r3, r0, r1)
            r0 = 2131432719(0x7f0b150f, float:1.8487203E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r3, r0)
            r0 = 17
            X.AnonymousClass3MZ.A1H(r1, r5, r0)
            r0 = 2131432725(0x7f0b1515, float:1.8487216E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r3, r0)
            r0 = 18
            X.AnonymousClass3MZ.A1H(r1, r5, r0)
            X.1o3 r1 = r5.A00
            if (r1 == 0) goto L_0x0d2b
            java.lang.String r0 = "1892120137920091"
            java.lang.String r9 = r1.A00(r0)
            X.1np r10 = r5.A03
            if (r10 == 0) goto L_0x0e7e
            android.content.Context r11 = r5.A14()
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r5)
            r0 = 2131892130(0x7f1217a2, float:1.9419E38)
            java.lang.String r12 = r1.getString(r0)
            r8 = 3
            java.lang.String[] r14 = new java.lang.String[r8]
            java.lang.String r0 = "ai-disclosures"
            r7 = 0
            r14[r7] = r0
            java.lang.String r0 = "ai-terms"
            r2 = 1
            r14[r2] = r0
            java.lang.String r0 = "privacy-center"
            r1 = 2
            r14[r1] = r0
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r7] = r9
            java.lang.String r0 = "https://www.facebook.com/policies/other-policies/ais-terms"
            r15[r2] = r0
            java.lang.String r0 = "https://www.facebook.com/privacy/genai/"
            r15[r1] = r0
            r13 = 0
            android.text.SpannableString r2 = r10.A04(r11, r12, r13, r14, r15)
            r0 = 2131432726(0x7f0b1516, float:1.8487218E38)
            com.whatsapp.TextEmojiLabel r1 = X.C72453Mb.A0c(r3, r0)
            android.graphics.Rect r0 = X.C39401t1.A0A
            X.11C r0 = r5.A01
            if (r0 == 0) goto L_0x0d27
            X.AnonymousClass3Ma.A1K(r1, r0)
            X.0ve r0 = r5.A02
            if (r0 == 0) goto L_0x0d23
            X.AnonymousClass3Ma.A1L(r0, r1)
            r1.setText(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            r2.setInterpolator(r0)
            X.3bv r0 = new X.3bv
            r0.<init>(r3, r6, r5)
            r2.setAnimationListener(r0)
            r4.startAnimation(r2)
            return
        L_0x0d23:
            X.AnonymousClass3MW.A1A()
            throw r13
        L_0x0d27:
            X.AnonymousClass3MW.A1N()
            throw r13
        L_0x0d2b:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x0e80
        L_0x0d2f:
            java.lang.Object r4 = r6.A01
            X.DFL r4 = (X.DFL) r4
            java.lang.Object r3 = r6.A02
            X.E8A r3 = (X.E8A) r3
            java.lang.Object r2 = r6.A03
            X.DOZ r2 = (X.DOZ) r2
            X.A4p r1 = new X.A4p
            r1.<init>()
            r0 = 0
            r1.A03(r4, r0)
            X.9zJ r0 = r1.A02()
            X.C26209Cul.A01(r2, r4, r0, r3)
            return
        L_0x0d4c:
            java.lang.Object r4 = r6.A01
            X.ALd r4 = (X.C20440ALd) r4
            java.lang.Object r0 = r6.A02
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r6.A03
            android.net.Uri r3 = (android.net.Uri) r3
            android.content.Context r2 = X.AnonymousClass3MY.A04(r0)
            X.6wd r1 = r4.A04
            r0 = 2
            X.C138166wd.A00(r1, r0)
            X.C20440ALd.A00(r4)
            android.content.Intent r0 = X.AnonymousClass1LU.A1p(r3)     // Catch:{ all -> 0x0d6d }
            r2.startActivity(r0)     // Catch:{ all -> 0x0d6d }
            return
        L_0x0d6d:
            r0 = move-exception
            X.C30691eM.A00(r0)
            return
        L_0x0d72:
            java.lang.Object r3 = r6.A01
            X.4gW r3 = (X.C91954gW) r3
            java.lang.Object r2 = r6.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r6.A03
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 2
            r3.A01(r0)
            r2.startActivity(r1)
            X.0z4 r0 = r3.A02
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "should_show_smb_enforcement_banner"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x0d92:
            java.lang.Object r4 = r6.A01
            X.4aN r4 = (X.AnonymousClass4aN) r4
            java.lang.Object r0 = r6.A02
            X.0vb r0 = (X.C18000vb) r0
            java.lang.Object r3 = r6.A03
            X.4Xi r3 = (X.C87854Xi) r3
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0dad
            int r1 = r3.A02
        L_0x0da7:
            androidx.viewpager.widget.ViewPager r0 = r4.A0J
            r0.A0J(r1, r2)
            return
        L_0x0dad:
            X.3Oo[] r0 = r4.A0O
            int r1 = r0.length
            int r1 = r1 - r2
            int r0 = r3.A02
            int r1 = r1 - r0
            goto L_0x0da7
        L_0x0db5:
            java.lang.Object r4 = r6.A01
            X.4aN r4 = (X.AnonymousClass4aN) r4
            java.lang.Object r2 = r6.A02
            int[] r2 = (int[]) r2
            java.lang.Object r5 = r6.A03
            X.3O9 r5 = (X.AnonymousClass3O9) r5
            X.AnonymousClass4aN.A04(r4, r2)
            X.0vc r0 = r4.A0M
            X.C1409873v.A04(r0, r2)
            r5.setEmoji(r2)
            X.5z5 r1 = new X.5z5
            r1.<init>(r2)
            r0 = 0
            long r10 = X.C43291zZ.A00(r1, r0)
            X.1KW r6 = r4.A0L
            android.content.Context r0 = r4.A09
            android.content.res.Resources r7 = r0.getResources()
            X.5z5 r8 = new X.5z5
            r8.<init>(r2)
            r9 = 1061158912(0x3f400000, float:0.75)
            android.graphics.drawable.Drawable r3 = r6.A08(r7, r8, r9, r10)
            long r1 = r5.A00
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0df4
            r5.A01 = r3
            r5.invalidate()
        L_0x0df4:
            android.view.View r1 = r4.A0D
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0dfc:
            java.lang.String r11 = X.C17890vO.A0Q()
            X.C18070vi.A0X(r11)
            java.lang.String r0 = "NativeFlowActionUtils/sendWamEvent: message was null, can't send event"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.8nz r5 = (X.AnonymousClass8nz) r5
            r12 = -1
            r5.A0H(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0e10:
            java.lang.String r3 = "android.intent.action.VIEW"
            X.0ve r2 = r7.A01
            r1 = 10316(0x284c, float:1.4456E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0e37
            java.lang.String r0 = r11.Bbm()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)
            r6.startActivity(r1)
        L_0x0e33:
            r5.A00(r4)
            return
        L_0x0e37:
            boolean r1 = r6 instanceof android.app.Activity
            X.00H r0 = r7.A04
            r0.get()
            if (r1 == 0) goto L_0x0e5d
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r6)
            r3 = 1
            android.content.Intent r2 = X.C1405872b.A00(r0, r8, r3)
            java.lang.String r1 = "callerId"
            java.lang.String r0 = r0.getPackageName()
            r2.putExtra(r1, r0)
            java.lang.String r0 = "overlay"
            r2.putExtra(r0, r3)
        L_0x0e57:
            X.1L9 r0 = r7.A00
            r0.A08(r6, r2)
            goto L_0x0e33
        L_0x0e5d:
            android.content.Intent r2 = X.C1405872b.A00(r6, r8, r4)
            goto L_0x0e57
        L_0x0e62:
            java.lang.String r0 = "appSwitchHelper"
            goto L_0x0e80
        L_0x0e65:
            com.whatsapp.jid.UserJid r3 = r1.A0O
            r8 = 0
            r2.A28()
            android.content.Context r1 = r2.A14()
            android.content.Intent r2 = X.AnonymousClass1LU.A1n(r1, r8, r8)
            r7 = 8
            r4 = 0
            r5 = r4
            X.C20057A5g.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0e7b:
            java.lang.String r0 = "systemServices"
            goto L_0x0e80
        L_0x0e7e:
            java.lang.String r0 = "linkifier"
        L_0x0e80:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0e85:
            X.C1409873v.A03(r2, r3)
            goto L_0x0f48
        L_0x0e8a:
            boolean r0 = X.AnonymousClass74I.A03(r3)
            if (r0 == 0) goto L_0x0f48
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r4)
            java.lang.String r0 = "skin_emoji_tip"
            int r1 = X.C17890vO.A00(r1, r0)
            r0 = 1
            if (r1 >= r0) goto L_0x0f31
            int r0 = r1 + 1
            r4.A1J(r0)
            int[] r12 = r10.A04
            android.view.View r8 = r9.A0D
            r0 = 2131427776(0x7f0b01c0, float:1.8477178E38)
            android.view.ViewGroup r7 = X.AnonymousClass3MW.A0D(r8, r0)
            r7.removeAllViews()
            android.content.Context r13 = r9.A09
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166635(0x7f0705ab, float:1.794752E38)
            int r6 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166633(0x7f0705a9, float:1.7947517E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r6 - r0
            int r5 = r0 / 2
            int[][] r14 = X.AnonymousClass74I.A0B(r12)
            r4 = 6
            r11 = 0
            r3 = 0
        L_0x0ed3:
            r2 = r14[r3]
            android.widget.ImageView r1 = X.C72453Mb.A0U(r8)
            r1.setPadding(r5, r5, r5, r5)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r6)
            r1.setLayoutParams(r0)
            X.1KW r15 = r9.A0L
            android.content.res.Resources r16 = r13.getResources()
            X.5z5 r0 = new X.5z5
            r0.<init>(r2)
            r18 = 1061158912(0x3f400000, float:0.75)
            r19 = -1
            r17 = r0
            android.graphics.drawable.Drawable r0 = r15.A08(r16, r17, r18, r19)
            r1.setImageDrawable(r0)
            r0 = 2
            A00(r1, r9, r2, r10, r0)
            r7.addView(r1)
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0ed3
            r0 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0H(r8, r0)
            r1.setPadding(r5, r5, r5, r5)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            android.content.res.Resources r16 = r13.getResources()
            X.5z5 r0 = new X.5z5
            r0.<init>(r12)
            r17 = r0
            android.graphics.drawable.Drawable r0 = r15.A08(r16, r17, r18, r19)
            r1.setImageDrawable(r0)
            r8.setVisibility(r11)
            return
        L_0x0f31:
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r2.A05(r0)
            java.lang.String r0 = X.C1409873v.A02(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0f45
            X.AnonymousClass4aN.A02(r10, r9)
            return
        L_0x0f45:
            X.C1409873v.A04(r2, r3)
        L_0x0f48:
            X.AnonymousClass4aN.A04(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90084dV.onClick(android.view.View):void");
    }

    public C90084dV(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}

package com.whatsapp.calling.callhistory.viewmodel;

import X.A8I;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass11X;
import X.AnonymousClass126;
import X.AnonymousClass18O;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1HR;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1TD;
import X.AnonymousClass1X0;
import X.AnonymousClass2G9;
import X.AnonymousClass2PW;
import X.AnonymousClass4ZN;
import X.C1402670q;
import X.C177929Bd;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C19880zA;
import X.C200710s;
import X.C22971Dz;
import X.C24901Mc;
import X.C24921Me;
import X.C27081Uq;
import X.C34261kC;
import X.C36671oH;
import X.C36681oI;
import X.C39521tD;
import X.C40811vJ;
import X.C40971vb;
import X.C41001ve;
import X.C41011vf;
import X.C41031vh;
import X.C41041vi;
import X.C41051vj;
import X.C41061vk;
import X.C41071vl;
import X.C41081vm;
import X.C41091vn;
import X.C41101vo;
import X.C41111vp;
import X.C41121vq;
import X.C41131vr;
import X.C49072Pb;
import X.C49102Pe;
import X.C49112Pf;
import X.C49142Pi;
import X.C49162Pk;
import X.C49262Pu;
import X.C58742lB;
import X.C59822mw;
import X.C61472pk;
import X.C64052u8;
import X.C66482yF;
import X.C66492yG;
import X.C66502yH;
import X.C66522yJ;
import X.C66532yK;
import X.C70483Bg;
import android.text.TextUtils;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class CallsHistoryFragmentViewModel extends AnonymousClass1J2 {
    public int A00 = 0;
    public int A01;
    public C66482yF A02;
    public C66492yG A03;
    public C66502yH A04;
    public C66532yK A05;
    public C66522yJ A06;
    public C49102Pe A07;
    public C49142Pi A08;
    public C49072Pb A09;
    public C49262Pu A0A;
    public C49112Pf A0B;
    public AnonymousClass2PW A0C;
    public C200710s A0D;
    public ArrayList A0E;
    public ArrayList A0F;
    public List A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass1DT A0M;
    public final C19880zA A0N;
    public final AnonymousClass11S A0O;
    public final C36681oI A0P;
    public final C36671oH A0Q;
    public final C40971vb A0R;
    public final C41041vi A0S;
    public final C41051vj A0T;
    public final C41081vm A0U;
    public final C41091vn A0V;
    public final C41061vk A0W;
    public final C41071vl A0X;
    public final C41101vo A0Y;
    public final AnonymousClass1M9 A0Z;
    public final C24921Me A0a;
    public final AnonymousClass11P A0b;
    public final C18000vb A0c;
    public final AnonymousClass1TD A0d;
    public final AnonymousClass1CJ A0e;
    public final AnonymousClass1MZ A0f;
    public final C27081Uq A0g;
    public final C18030ve A0h;
    public final AnonymousClass126 A0i;
    public final C24901Mc A0j;
    public final C41111vp A0k;
    public final AnonymousClass1DC A0l;
    public final AnonymousClass00H A0m;
    public final AnonymousClass00H A0n;
    public final AnonymousClass00H A0o;
    public final ArrayList A0p;
    public final HashMap A0q;
    public final LinkedHashMap A0r;
    public final Lock A0s;
    public final AnonymousClass1DT A0t;
    public final AnonymousClass18O A0u;
    public final C41031vh A0v;
    public final AnonymousClass1HR A0w;
    public final C34261kC A0x;
    public final C39521tD A0y;
    public final C41011vf A0z;
    public final C41001ve A10;
    public final AnonymousClass10I A11;
    public final AnonymousClass00H A12;

    public C58742lB A0W(C59822mw r17, int i, long j) {
        AnonymousClass4ZN A002;
        int i2 = 2131100004;
        int i3 = 0;
        int i4 = i;
        if (i4 == 1) {
            i3 = 2131232518;
            i2 = 2131103410;
        }
        C59822mw r11 = r17;
        boolean z = false;
        int i5 = 2131231762;
        int i6 = 2131898713;
        if (r11.A00 == 2) {
            z = true;
            i5 = 2131232406;
            i6 = 2131899576;
        }
        int i7 = 2131102368;
        if (i4 != 2) {
            i7 = 2131101098;
            if (i == 0) {
                C18000vb r14 = this.A0c;
                long j2 = r11.A03;
                String A003 = A8I.A00(r14, j2);
                A002 = C1402670q.A02(new Object[]{AnonymousClass11X.A00.A06(r14, j2), A003}, 2131895404);
                StringBuilder sb = new StringBuilder();
                sb.append(CallsHistoryFragment.class.getName());
                sb.append(r11.A04.getRawString());
                sb.append(" ");
                sb.append(r11.A01);
                String obj = sb.toString();
                String A004 = r11.A00();
                C58742lB r0 = new C58742lB();
                r0.A00 = i7;
                r0.A01 = i4;
                r0.A06 = A002;
                r0.A07 = A004;
                r0.A02 = i3;
                r0.A03 = i6;
                r0.A04 = i5;
                r0.A05 = i2;
                r0.A08 = obj;
                r0.A09 = z;
                return r0;
            }
        }
        A002 = C1402670q.A00(C64052u8.A08(this.A0c, j));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CallsHistoryFragment.class.getName());
        sb2.append(r11.A04.getRawString());
        sb2.append(" ");
        sb2.append(r11.A01);
        String obj2 = sb2.toString();
        String A0042 = r11.A00();
        C58742lB r02 = new C58742lB();
        r02.A00 = i7;
        r02.A01 = i4;
        r02.A06 = A002;
        r02.A07 = A0042;
        r02.A02 = i3;
        r02.A03 = i6;
        r02.A04 = i5;
        r02.A05 = i2;
        r02.A08 = obj2;
        r02.A09 = z;
        return r02;
    }

    public synchronized void A0b(boolean z) {
        if (C18020vd.A05(C18040vf.A02, this.A0h, 6792)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CallsHistoryFragmentV2ViewModel/setHasActiveObserver ");
            sb.append(z);
            Log.i(sb.toString());
            boolean z2 = this.A0J;
            this.A0J = z;
            if (z && !z2) {
                this.A0R.A01();
            }
        }
    }

    public static String A03(AnonymousClass1E7 r3) {
        if (r3 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CallsHistoryFragment.class.getName());
        sb.append(C22971Dz.A06(r3.A0J));
        sb.append(" ");
        sb.append(r3.A0E);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r8) {
        /*
            X.0ve r1 = r8.A0h
            X.11S r0 = r8.A0O
            boolean r0 = X.C40811vJ.A0D(r0, r1)
            if (r0 == 0) goto L_0x0086
            java.util.ArrayList r3 = r8.A0E
            r2 = 2131887799(0x7f1206b7, float:1.9410215E38)
            java.util.List r0 = r8.A0G
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r7 = 0
            r1 = 0
            if (r0 != 0) goto L_0x0022
            r1 = 2131899186(0x7f123332, float:1.943331E38)
        L_0x0022:
            X.1vr r0 = new X.1vr
            r0.<init>(r2, r1)
            r3.add(r0)
            java.util.List r0 = r8.A0G
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.util.List r0 = r8.A0G
            int r1 = r0.size()
            r0 = 3
            int r6 = java.lang.Math.min(r1, r0)
        L_0x003f:
            if (r7 >= r6) goto L_0x0086
            java.util.List r0 = r8.A0G
            java.lang.Object r2 = r0.get(r7)
            X.2rT r2 = (X.C62482rT) r2
            X.2Qt r1 = r2.A02
            X.2Qt r0 = X.C49512Qt.ONE_TO_ONE
            r5 = 0
            r4 = -1
            r3 = 1
            if (r1 != r0) goto L_0x0069
            X.1BI r1 = r2.A03
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r1)
            if (r0 == 0) goto L_0x0066
            java.util.ArrayList r2 = r8.A0E
            X.2yM r1 = new X.2yM
            r1.<init>(r0, r5, r4, r3)
        L_0x0063:
            r2.add(r1)
        L_0x0066:
            int r7 = r7 + 1
            goto L_0x003f
        L_0x0069:
            X.2Qt r0 = X.C49512Qt.GROUP
            if (r1 != r0) goto L_0x0066
            X.1BI r1 = r2.A03
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r1)
            if (r0 == 0) goto L_0x0066
            java.util.ArrayList r2 = r8.A0E
            X.2yN r1 = new X.2yN
            r1.<init>(r0, r5, r4, r3)
            goto L_0x0063
        L_0x007f:
            java.util.ArrayList r1 = r8.A0E
            X.2yO r0 = X.C66572yO.A00
            r1.add(r0)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A04(com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel):void");
    }

    public static void A05(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel) {
        int i;
        if (C40811vJ.A0W(callsHistoryFragmentViewModel.A0h) && (i = callsHistoryFragmentViewModel.A01) > 0) {
            C18000vb r0 = callsHistoryFragmentViewModel.A0c;
            String A062 = AnonymousClass1X0.A06(r0.A0N(), String.valueOf(i));
            ArrayList arrayList = callsHistoryFragmentViewModel.A0E;
            arrayList.add(new C41131vr(A062));
            C66522yJ r6 = callsHistoryFragmentViewModel.A06;
            if (r6 != null && r6.A00 < System.currentTimeMillis() + 604800000) {
                arrayList.add(r6);
            }
        }
    }

    public static void A06(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel) {
        C41101vo r1 = callsHistoryFragmentViewModel.A0Y;
        if (!TextUtils.isEmpty(r1.A01)) {
            r1.filter(r1.A01);
            callsHistoryFragmentViewModel.A0X();
            return;
        }
        new C177929Bd((Object) callsHistoryFragmentViewModel, 6).A02.executeOnExecutor(callsHistoryFragmentViewModel.A0D, new Void[0]);
    }

    public static void A07(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, C59822mw r9) {
        C66522yJ r0;
        if (r9 == null) {
            r0 = null;
        } else {
            r0 = new C66522yJ((C70483Bg) null, callsHistoryFragmentViewModel.A0W(r9, 0, 0), r9.A04, r9.A03, r9.A02);
        }
        callsHistoryFragmentViewModel.A06 = r0;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.2yH, java.lang.Object] */
    public static void A08(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        ArrayList arrayList2 = new ArrayList();
        callsHistoryFragmentViewModel.A0E = arrayList2;
        C66532yK r1 = callsHistoryFragmentViewModel.A05;
        if (r1 != null && callsHistoryFragmentViewModel.A0p.isEmpty() && !linkedHashMap.isEmpty()) {
            arrayList2.add(r1);
        }
        C66482yF r2 = callsHistoryFragmentViewModel.A02;
        if (r2 != null) {
            if (!C40811vJ.A0E(callsHistoryFragmentViewModel.A0O, callsHistoryFragmentViewModel.A0h)) {
                callsHistoryFragmentViewModel.A0E.add(r2);
            }
        }
        C66492yG r12 = callsHistoryFragmentViewModel.A03;
        if (r12 != null) {
            callsHistoryFragmentViewModel.A0E.add(r12);
        }
        if (arrayList.size() > 0) {
            callsHistoryFragmentViewModel.A0E.add(callsHistoryFragmentViewModel.A0q.get(0));
            callsHistoryFragmentViewModel.A0E.addAll(arrayList);
        }
        A05(callsHistoryFragmentViewModel);
        A04(callsHistoryFragmentViewModel);
        if (linkedHashMap.size() > 0) {
            callsHistoryFragmentViewModel.A0E.add(callsHistoryFragmentViewModel.A0q.get(1));
            callsHistoryFragmentViewModel.A0E.addAll(linkedHashMap.values());
        }
        if (callsHistoryFragmentViewModel.A0L && (!callsHistoryFragmentViewModel.A0r.isEmpty() || !callsHistoryFragmentViewModel.A0p.isEmpty())) {
            C66502yH r13 = callsHistoryFragmentViewModel.A04;
            C66502yH r14 = r13;
            if (r13 == null) {
                ? obj = new Object();
                callsHistoryFragmentViewModel.A04 = obj;
                r14 = obj;
            }
            callsHistoryFragmentViewModel.A0E.add(r14);
        }
        callsHistoryFragmentViewModel.A0k.A0F(callsHistoryFragmentViewModel.A0E);
    }

    public void A0S() {
        C40971vb r2 = this.A0R;
        r2.A0V.unregisterObserver(r2.A0U);
        r2.A0T.unregisterObserver(r2.A0S);
        r2.A0F.unregisterObserver(r2.A0E);
        C49162Pk r1 = r2.A03;
        if (r1 != null) {
            r1.A0B(true);
        }
        if (C40811vJ.A0W(r2.A0K)) {
            r2.A0P.unregisterObserver(r2.A0O);
            r2.A0N.unregisterObserver(r2.A0M);
        }
        r2.A07 = null;
        this.A10.unregisterObserver(this.A0z);
        if (C40811vJ.A0D(this.A0O, this.A0h)) {
            this.A0y.unregisterObserver(this.A0x);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x021e, code lost:
        if (r1.A0T() == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0232, code lost:
        if (r1.A0S() == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0276, code lost:
        if (r1.A0T() == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (X.C40811vJ.A0J(r0.A0O, r5, r0.A0f.A08.A0A((X.AnonymousClass1E9) r6), false) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r25 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r5 == 5) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        if (((X.C42211xo) r0.A12.get()).A02(r3) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58792lG A0T(X.C70483Bg r24, X.AnonymousClass1E7 r25) {
        /*
            r23 = this;
            r12 = r24
            X.1E7 r10 = r12.A01()
            X.C17960vV.A07(r10)
            java.util.List r0 = r12.A03()
            r9 = 0
            java.lang.Object r2 = r0.get(r9)
            X.C17960vV.A07(r2)
            X.9Bw r2 = (X.C178119Bw) r2
            boolean r0 = r12.A04()
            r3 = r25
            if (r0 == 0) goto L_0x0022
            r8 = 1
            if (r25 == 0) goto L_0x0023
        L_0x0022:
            r8 = 0
        L_0x0023:
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = r23
            if (r8 == 0) goto L_0x005d
            X.11S r1 = r0.A0O
            java.util.ArrayList r7 = X.C62792s0.A01(r1, r2)
            r6 = 0
        L_0x0038:
            int r1 = r7.size()
            if (r6 >= r1) goto L_0x0067
            X.1M9 r4 = r0.A0Z
            java.lang.Object r1 = r7.get(r6)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1E7 r5 = r4.A0E(r1)
            r4 = 3
            if (r5 == 0) goto L_0x0054
            if (r6 >= r4) goto L_0x0054
            r1 = r21
            r1.add(r5)
        L_0x0054:
            int r1 = r21.size()
            if (r1 >= r4) goto L_0x0067
            int r6 = r6 + 1
            goto L_0x0038
        L_0x005d:
            if (r25 == 0) goto L_0x0068
            boolean r1 = r12.A04()
            if (r1 == 0) goto L_0x0068
            r10 = r3
            goto L_0x0068
        L_0x0067:
            r10 = 0
        L_0x0068:
            X.1M9 r13 = r0.A0Z
            X.1Me r14 = r0.A0a
            if (r10 != 0) goto L_0x02e9
            r16 = 3
            r18 = r9
            r15 = r7
            r17 = r9
            X.4ZN r20 = X.AnonymousClass74H.A04(r13, r14, r15, r16, r17, r18)
            X.C17960vV.A07(r20)
        L_0x007c:
            java.lang.String r19 = A03(r3)
            if (r25 == 0) goto L_0x00b4
            java.util.List r1 = r12.A04
            X.C18070vi.A0W(r1)
            java.lang.Object r1 = X.C29431cG.A0c(r1)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x00b4
            com.whatsapp.jid.GroupJid r1 = r1.A0C
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r2.A0W()
            if (r1 == 0) goto L_0x00b4
            X.1BI r6 = r3.A0J
            boolean r1 = r6 instanceof X.AnonymousClass1EC
            if (r1 == 0) goto L_0x00b4
            X.0ve r5 = r0.A0h
            X.11S r4 = r0.A0O
            X.1MZ r1 = r0.A0f
            X.1E9 r6 = (X.AnonymousClass1E9) r6
            X.1MW r1 = r1.A08
            int r1 = r1.A0A(r6)
            boolean r1 = X.C40811vJ.A0J(r4, r5, r1, r9)
            r15 = 1
            if (r1 != 0) goto L_0x00b5
        L_0x00b4:
            r15 = 0
        L_0x00b5:
            java.util.List r4 = r12.A04
            int r18 = r4.size()
            int r5 = r12.A00()
            if (r5 == 0) goto L_0x02d5
            r1 = 1
            if (r5 == r1) goto L_0x02c1
            r1 = 2
            if (r5 == r1) goto L_0x02ad
            r1 = 4
            if (r5 == r1) goto L_0x0299
            r1 = 5
            if (r5 == r1) goto L_0x0285
            r13 = 0
        L_0x00ce:
            int r5 = r12.A00()
            if (r5 == 0) goto L_0x0280
            r1 = 1
            if (r5 == r1) goto L_0x027b
            r1 = 2
            if (r5 == r1) goto L_0x027b
            r1 = 4
            if (r5 == r1) goto L_0x00e1
            r1 = 5
            r11 = 0
            if (r5 != r1) goto L_0x00e4
        L_0x00e1:
            r11 = 2131233226(0x7f0809ca, float:1.8082584E38)
        L_0x00e4:
            int r17 = X.AnonymousClass4aR.A02(r2)
            int r16 = X.AnonymousClass4aR.A03(r2)
            if (r25 == 0) goto L_0x00fd
            X.00H r1 = r0.A12
            java.lang.Object r1 = r1.get()
            X.1xo r1 = (X.C42211xo) r1
            boolean r1 = r1.A02(r3)
            r14 = 0
            if (r1 != 0) goto L_0x00fe
        L_0x00fd:
            r14 = 1
        L_0x00fe:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x0109
            boolean r1 = r1.A0J
            if (r1 == 0) goto L_0x0109
            r9 = 1
        L_0x0109:
            X.0ve r2 = r0.A0h
            boolean r1 = X.C40811vJ.A0R(r2)
            if (r1 != 0) goto L_0x0278
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0237
            boolean r1 = r1.A0R()
            if (r1 == 0) goto L_0x0237
            r6 = 2131887846(0x7f1206e6, float:1.941031E38)
        L_0x0122:
            boolean r1 = X.C40811vJ.A0R(r2)
            if (r1 == 0) goto L_0x0234
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0136
            boolean r1 = r1.A0R()
            if (r1 != 0) goto L_0x015c
        L_0x0136:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0144
            boolean r1 = r1.A0T()
            if (r1 != 0) goto L_0x015c
        L_0x0144:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0223
            boolean r1 = r1.A0U()
            if (r1 == 0) goto L_0x0223
            r3 = 6307(0x18a3, float:8.838E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r2, r3)
            if (r1 == 0) goto L_0x0223
        L_0x015c:
            r5 = 2131233383(0x7f080a67, float:1.8082902E38)
        L_0x015f:
            boolean r1 = X.C40811vJ.A0R(r2)
            if (r1 == 0) goto L_0x0220
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x01df
            boolean r1 = r1.A0R()
            if (r1 == 0) goto L_0x01df
            r4 = 2131887847(0x7f1206e7, float:1.9410313E38)
        L_0x0176:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x01dc
            long r1 = r1.A01
            X.11P r3 = r12.A02
            long r2 = r3.A09(r1)
        L_0x0184:
            X.0vb r0 = r0.A0c
            r22 = r0
            X.9Bw r0 = X.C18070vi.A0C(r12)
            if (r0 == 0) goto L_0x01d9
            long r0 = r0.A01
            X.11P r12 = r12.A02
            long r0 = r12.A09(r0)
        L_0x0196:
            r12 = r22
            java.lang.String r12 = X.C64052u8.A08(r12, r0)
            X.2lG r1 = new X.2lG
            r1.<init>()
            r0 = r18
            r1.A00 = r0
            r0 = 2131887627(0x7f12060b, float:1.9409866E38)
            r1.A01 = r0
            r1.A02 = r13
            r1.A03 = r11
            r0 = r17
            r1.A04 = r0
            r1.A0A = r10
            r0 = r21
            r1.A0E = r0
            r0 = r16
            r1.A05 = r0
            r0 = r20
            r1.A0B = r0
            r1.A0G = r14
            r1.A0I = r9
            r1.A0F = r7
            r1.A0H = r8
            r1.A08 = r6
            r1.A07 = r5
            r1.A06 = r4
            r0 = r19
            r1.A0D = r0
            r1.A09 = r2
            r1.A0C = r12
            r1.A0J = r15
            return r1
        L_0x01d9:
            r0 = 0
            goto L_0x0196
        L_0x01dc:
            r2 = 0
            goto L_0x0184
        L_0x01df:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x01fc
            boolean r1 = r1.A0U()
            if (r1 == 0) goto L_0x01fc
            r3 = 6307(0x18a3, float:8.838E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r2, r3)
            if (r1 == 0) goto L_0x01fc
            r4 = 2131887843(0x7f1206e3, float:1.9410305E38)
            goto L_0x0176
        L_0x01fc:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x020f
            boolean r1 = r1.A0S()
            if (r1 == 0) goto L_0x020f
            r4 = 2131887845(0x7f1206e5, float:1.9410309E38)
            goto L_0x0176
        L_0x020f:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0220
            boolean r1 = r1.A0T()
            r4 = 2131887751(0x7f120687, float:1.9410118E38)
            if (r1 != 0) goto L_0x0176
        L_0x0220:
            r4 = 0
            goto L_0x0176
        L_0x0223:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0234
            boolean r1 = r1.A0S()
            r5 = 2131233278(0x7f0809fe, float:1.8082689E38)
            if (r1 != 0) goto L_0x015f
        L_0x0234:
            r5 = 0
            goto L_0x015f
        L_0x0237:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0254
            boolean r1 = r1.A0U()
            if (r1 == 0) goto L_0x0254
            r3 = 6307(0x18a3, float:8.838E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r2, r3)
            if (r1 == 0) goto L_0x0254
            r6 = 2131887842(0x7f1206e2, float:1.9410302E38)
            goto L_0x0122
        L_0x0254:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0267
            boolean r1 = r1.A0S()
            if (r1 == 0) goto L_0x0267
            r6 = 2131887844(0x7f1206e4, float:1.9410307E38)
            goto L_0x0122
        L_0x0267:
            java.lang.Object r1 = X.C29431cG.A0c(r4)
            X.9Bw r1 = (X.C178119Bw) r1
            if (r1 == 0) goto L_0x0278
            boolean r1 = r1.A0T()
            r6 = 2131887751(0x7f120687, float:1.9410118E38)
            if (r1 != 0) goto L_0x0122
        L_0x0278:
            r6 = 0
            goto L_0x0122
        L_0x027b:
            r11 = 2131233228(0x7f0809cc, float:1.8082588E38)
            goto L_0x00e4
        L_0x0280:
            r11 = 2131233227(0x7f0809cb, float:1.8082586E38)
            goto L_0x00e4
        L_0x0285:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x0297
            boolean r1 = r1.A0J
        L_0x028d:
            r13 = 2131887664(0x7f120630, float:1.9409941E38)
            if (r1 == 0) goto L_0x00ce
            r13 = 2131887662(0x7f12062e, float:1.9409937E38)
            goto L_0x00ce
        L_0x0297:
            r1 = 0
            goto L_0x028d
        L_0x0299:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x02ab
            boolean r1 = r1.A0J
        L_0x02a1:
            r13 = 2131887663(0x7f12062f, float:1.940994E38)
            if (r1 == 0) goto L_0x00ce
            r13 = 2131887661(0x7f12062d, float:1.9409935E38)
            goto L_0x00ce
        L_0x02ab:
            r1 = 0
            goto L_0x02a1
        L_0x02ad:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x02bf
            boolean r1 = r1.A0J
        L_0x02b5:
            r13 = 2131892256(0x7f121820, float:1.9419255E38)
            if (r1 == 0) goto L_0x00ce
            r13 = 2131892255(0x7f12181f, float:1.9419253E38)
            goto L_0x00ce
        L_0x02bf:
            r1 = 0
            goto L_0x02b5
        L_0x02c1:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x02d3
            boolean r1 = r1.A0J
        L_0x02c9:
            r13 = 2131891333(0x7f121485, float:1.9417383E38)
            if (r1 == 0) goto L_0x00ce
            r13 = 2131891331(0x7f121483, float:1.941738E38)
            goto L_0x00ce
        L_0x02d3:
            r1 = 0
            goto L_0x02c9
        L_0x02d5:
            X.9Bw r1 = X.C18070vi.A0C(r12)
            if (r1 == 0) goto L_0x02e7
            boolean r1 = r1.A0J
        L_0x02dd:
            r13 = 2131893427(0x7f121cb3, float:1.942163E38)
            if (r1 == 0) goto L_0x00ce
            r13 = 2131893426(0x7f121cb2, float:1.9421628E38)
            goto L_0x00ce
        L_0x02e7:
            r1 = 0
            goto L_0x02dd
        L_0x02e9:
            r1 = -1
            X.1yg r1 = r14.A0D(r10, r1)
            java.lang.String r1 = r1.A01
            X.482 r20 = X.C1402670q.A00(r1)
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A0T(X.3Bg, X.1E7):X.2lG");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r13.A0F() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r13.A0F() == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58782lF A0V(X.C58782lF r27, X.AnonymousClass1E7 r28, java.lang.String r29, int r30) {
        /*
            r26 = this;
            r1 = r27
            int r0 = r1.A00
            r25 = r0
            int r0 = r1.A01
            r24 = r0
            java.util.List r0 = r1.A0A
            r23 = r0
            int r0 = r1.A02
            r22 = r0
            boolean r0 = r1.A0D
            r21 = r0
            boolean r0 = r1.A0F
            r20 = r0
            X.4ZN r11 = r1.A07
            java.util.List r10 = r1.A0B
            X.4ZN r9 = r1.A08
            X.4ZN r8 = r1.A06
            int r7 = r1.A03
            boolean r6 = r1.A0G
            boolean r5 = r1.A0C
            r13 = r28
            if (r28 == 0) goto L_0x0033
            boolean r0 = r13.A0F()
            r4 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            java.util.List r0 = r1.A0B
            r18 = r0
            r0 = r26
            X.1M9 r15 = r0.A0Z
            X.1Me r3 = r0.A0a
            X.11S r14 = r0.A0O
            boolean r2 = r1.A0C
            r1 = 1
            r0 = 0
            if (r28 == 0) goto L_0x004e
            boolean r12 = r13.A0F()
            r16 = 1
            if (r12 != 0) goto L_0x0050
        L_0x004e:
            r16 = 0
        L_0x0050:
            r12 = r29
            if (r29 == 0) goto L_0x00ab
            X.482 r2 = new X.482
            r2.<init>(r12)
        L_0x0059:
            X.C17960vV.A07(r2)
            r14 = 0
            if (r28 == 0) goto L_0x0073
            boolean r0 = r13.A0F()
            if (r0 == 0) goto L_0x0073
            if (r29 == 0) goto L_0x0073
            r0 = -1
            java.lang.String r0 = r3.A0T(r13, r0)
            if (r0 == 0) goto L_0x0073
            X.482 r14 = new X.482
            r14.<init>(r0)
        L_0x0073:
            java.lang.String r3 = A03(r13)
            X.2lF r1 = new X.2lF
            r1.<init>()
            r0 = r25
            r1.A00 = r0
            r0 = r24
            r1.A01 = r0
            r0 = r23
            r1.A0A = r0
            r0 = r22
            r1.A02 = r0
            r1.A05 = r2
            r1.A04 = r14
            r0 = r21
            r1.A0D = r0
            r1.A0E = r4
            r0 = r20
            r1.A0F = r0
            r1.A07 = r11
            r1.A0B = r10
            r1.A08 = r9
            r1.A06 = r8
            r1.A09 = r3
            r1.A03 = r7
            r1.A0G = r6
            r1.A0C = r5
            return r1
        L_0x00ab:
            if (r28 == 0) goto L_0x00e7
            java.lang.String r15 = r3.A0I(r13)
            if (r16 == 0) goto L_0x00bd
            if (r15 != 0) goto L_0x00b7
            java.lang.String r15 = ""
        L_0x00b7:
            X.482 r2 = new X.482
            r2.<init>(r15)
            goto L_0x0059
        L_0x00bd:
            X.1BI r15 = r13.A0J
            boolean r14 = r14.A0O(r15)
            if (r2 == 0) goto L_0x00cf
            if (r14 == 0) goto L_0x00cb
            r1 = 2131898597(0x7f1230e5, float:1.9432116E38)
            goto L_0x00ec
        L_0x00cb:
            r2 = 2131891750(0x7f121626, float:1.9418229E38)
            goto L_0x00d8
        L_0x00cf:
            if (r14 == 0) goto L_0x00d5
            r1 = 2131898599(0x7f1230e7, float:1.943212E38)
            goto L_0x00ec
        L_0x00d5:
            r2 = 2131891751(0x7f121627, float:1.941823E38)
        L_0x00d8:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r1 = -1
            java.lang.String r1 = r3.A0T(r13, r1)
            r14[r0] = r1
            X.6IR r2 = X.C1402670q.A02(r14, r2)
            goto L_0x0059
        L_0x00e7:
            if (r30 != 0) goto L_0x00f4
            r1 = 2131898234(0x7f122f7a, float:1.943138E38)
        L_0x00ec:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.6IR r2 = X.C1402670q.A02(r0, r1)
            goto L_0x0059
        L_0x00f4:
            r17 = 3
            r19 = r0
            r14 = r15
            r15 = r3
            r16 = r18
            r18 = r0
            X.4ZN r2 = X.AnonymousClass74H.A04(r14, r15, r16, r17, r18, r19)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A0V(X.2lF, X.1E7, java.lang.String, int):X.2lF");
    }

    public void A0X() {
        if (this.A0I) {
            this.A11.CGD(new C177929Bd((Object) this, 5), new Void[0]);
        }
    }

    public void A0Y(C41121vq r7) {
        if (!TextUtils.isEmpty(this.A0Y.A01)) {
            int BYi = r7.BYi();
            boolean z = false;
            if (BYi >= 0) {
                z = true;
            }
            C17960vV.A0F(z, "search result is -1");
            C61472pk r5 = (C61472pk) this.A0o.get();
            long j = (long) BYi;
            Integer A002 = A00(r7);
            if (r5.A00 == null) {
                C17960vV.A0F(false, "sessionId is null");
                return;
            }
            AnonymousClass2G9 A003 = C61472pk.A00(r5);
            A003.A02 = A002;
            A003.A04 = Long.valueOf(j);
            A003.A01 = 0;
            A003.A03 = 4;
            r5.A02.CC7(A003);
        }
    }

    public void A0Z(C41121vq r7, boolean z) {
        if (!TextUtils.isEmpty(this.A0Y.A01)) {
            int BYi = r7.BYi();
            boolean z2 = false;
            if (BYi >= 0) {
                z2 = true;
            }
            C17960vV.A0F(z2, "search result is -1");
            C61472pk r5 = (C61472pk) this.A0o.get();
            long j = (long) BYi;
            Integer A002 = A00(r7);
            if (r5.A00 == null) {
                C17960vV.A0F(false, "sessionId is null");
                return;
            }
            AnonymousClass2G9 A003 = C61472pk.A00(r5);
            A003.A02 = A002;
            A003.A04 = Long.valueOf(j);
            A003.A01 = 0;
            A003.A03 = 2;
            A003.A00 = Integer.valueOf(z ? 1 : 0);
            r5.A02.CC7(A003);
        }
    }

    public void A0a(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        C41101vo r1 = this.A0Y;
        if (!TextUtils.isEmpty(r1.A01)) {
            r1.filter(r1.A01);
        } else {
            A08(this, arrayList, linkedHashMap);
        }
        A0X();
    }

    public boolean A0c() {
        List list = this.A0G;
        if ((list == null || list.isEmpty()) && !this.A0E.isEmpty() && this.A0R.A04 == null) {
            if (!C40811vJ.A0E(this.A0O, this.A0h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static Integer A00(C41121vq r3) {
        int BTW = r3.BTW();
        if (BTW == 1) {
            return 0;
        }
        if (BTW == 2 || BTW == 3 || BTW == 4 || BTW == 7) {
            return 2;
        }
        if (BTW == 8) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown itemType: ");
        sb.append(BTW);
        C17960vV.A0F(false, sb.toString());
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r11 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        if (r1.callState == com.whatsapp.voipcalling.CallState.REJOINING) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58782lF A0U(X.C70483Bg r22, X.AnonymousClass1E7 r23, java.lang.String r24) {
        /*
            r21 = this;
            java.util.List r0 = r22.A03()
            r9 = 0
            java.lang.Object r8 = r0.get(r9)
            X.C17960vV.A07(r8)
            X.9Bw r8 = (X.C178119Bw) r8
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r0 = X.C62792s0.A02(r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r2 = r3.next()
            X.9Bv r2 = (X.C178109Bv) r2
            int r1 = r2.A01
            r0 = 5
            if (r1 != r0) goto L_0x0020
            com.whatsapp.jid.UserJid r0 = r2.A00
            r10.add(r0)
            goto L_0x0020
        L_0x0037:
            r3 = 0
        L_0x0038:
            int r2 = r10.size()
            int r1 = r10.size()
            r0 = 8
            if (r1 <= r0) goto L_0x0045
            r0 = 5
        L_0x0045:
            int r0 = java.lang.Math.min(r2, r0)
            r7 = r21
            if (r3 >= r0) goto L_0x005f
            X.1M9 r1 = r7.A0Z
            java.lang.Object r0 = r10.get(r3)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r0 = r1.A0H(r0)
            r13.add(r0)
            int r3 = r3 + 1
            goto L_0x0038
        L_0x005f:
            int r0 = r13.size()
            if (r0 != 0) goto L_0x0071
            X.11S r0 = r7.A0O
            r0.A0I()
            X.1E8 r0 = r0.A0D
            if (r0 == 0) goto L_0x0071
            r13.add(r0)
        L_0x0071:
            X.9Bw r0 = X.C18070vi.A0C(r22)
            if (r0 == 0) goto L_0x01a0
            boolean r11 = r0.A0J
        L_0x0079:
            X.1HR r0 = r7.A0w
            com.whatsapp.voipcalling.CallInfo r1 = r0.BO3()
            if (r1 == 0) goto L_0x0095
            com.whatsapp.voipcalling.CallState r2 = r1.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 != r0) goto L_0x0171
            boolean r0 = r1.isAudioChat()
            if (r0 == 0) goto L_0x0171
            X.0ve r0 = r7.A0h
            boolean r0 = X.C40811vJ.A0X(r0)
            if (r0 == 0) goto L_0x0171
        L_0x0095:
            r12 = 0
        L_0x0096:
            boolean r0 = r8.A0W()
            if (r0 == 0) goto L_0x0162
            r15 = 2131233309(0x7f080a1d, float:1.8082752E38)
            if (r11 == 0) goto L_0x016c
        L_0x00a1:
            r14 = 2131898229(0x7f122f75, float:1.943137E38)
        L_0x00a4:
            if (r12 == 0) goto L_0x0158
            r0 = 2131898161(0x7f122f31, float:1.9431232E38)
        L_0x00a9:
            r6 = 2131101264(0x7f060650, float:1.7814933E38)
            r20 = r24
            if (r24 != 0) goto L_0x00b3
            r6 = 2131102896(0x7f060cb0, float:1.7818243E38)
        L_0x00b3:
            r19 = 0
            java.lang.String r18 = ""
            X.2m4 r2 = r8.A0B
            r5 = 0
            if (r2 == 0) goto L_0x00bd
            r5 = 1
        L_0x00bd:
            boolean r2 = r8.A0W()
            if (r2 == 0) goto L_0x014e
            r3 = 2131891753(0x7f121629, float:1.9418235E38)
        L_0x00c6:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            X.6IR r17 = X.C1402670q.A02(r2, r3)
            int r3 = r10.size()
            int r2 = r13.size()
            r4 = 0
            if (r3 <= r2) goto L_0x00f1
            r4 = 2131894262(0x7f121ff6, float:1.9423324E38)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r16 = r10.size()
            int r2 = r13.size()
            int r16 = r16 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r3[r9] = r2
            X.6IR r4 = X.C1402670q.A02(r3, r4)
        L_0x00f1:
            if (r12 == 0) goto L_0x00fc
            com.whatsapp.voipcalling.CallState r3 = r1.callState
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.REJOINING
            r2 = 2131898286(0x7f122fae, float:1.9431485E38)
            if (r3 != r1) goto L_0x00ff
        L_0x00fc:
            r2 = 2131899582(0x7f1234be, float:1.9434114E38)
        L_0x00ff:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.6IR r3 = X.C1402670q.A02(r1, r2)
            int r2 = r10.size()
            r1 = 1
            if (r2 > r1) goto L_0x010e
            if (r12 != 0) goto L_0x010f
        L_0x010e:
            r9 = 1
        L_0x010f:
            r2 = 0
            X.2lF r1 = new X.2lF
            r1.<init>()
            r1.A00 = r15
            r1.A01 = r0
            r1.A0A = r13
            r1.A02 = r14
            r0 = r19
            r1.A05 = r0
            r1.A04 = r0
            r1.A0D = r12
            r1.A0E = r2
            r1.A0F = r11
            r0 = r17
            r1.A07 = r0
            r1.A0B = r10
            r1.A08 = r4
            r1.A06 = r3
            r0 = r18
            r1.A09 = r0
            r1.A03 = r6
            r1.A0G = r9
            r1.A0C = r5
            java.util.ArrayList r0 = r8.A0B()
            int r2 = r0.size()
            r3 = r23
            r0 = r20
            X.2lF r0 = r7.A0V(r1, r3, r0, r2)
            return r0
        L_0x014e:
            r3 = 2131891754(0x7f12162a, float:1.9418237E38)
            if (r11 == 0) goto L_0x00c6
            r3 = 2131891752(0x7f121628, float:1.9418233E38)
            goto L_0x00c6
        L_0x0158:
            r0 = 2131898231(0x7f122f77, float:1.9431374E38)
            if (r11 == 0) goto L_0x00a9
            r0 = 2131898228(0x7f122f74, float:1.9431368E38)
            goto L_0x00a9
        L_0x0162:
            r15 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r11 == 0) goto L_0x016c
            r15 = 2131232406(0x7f080696, float:1.808092E38)
            goto L_0x00a1
        L_0x016c:
            r14 = 2131898232(0x7f122f78, float:1.9431376E38)
            goto L_0x00a4
        L_0x0171:
            X.4cT r0 = r8.A09()
            java.lang.String r0 = r0.A02
            java.lang.String r2 = X.C40811vJ.A09(r0)
            java.lang.String r0 = r1.callId
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0095
            com.whatsapp.voipcalling.CallState r2 = r1.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r2 == r0) goto L_0x019d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r2 == r0) goto L_0x019d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x019d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r2 == r0) goto L_0x019d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x019d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 != r0) goto L_0x0095
        L_0x019d:
            r12 = 1
            goto L_0x0096
        L_0x01a0:
            r11 = 0
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A0U(X.3Bg, X.1E7, java.lang.String):X.2lF");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1DT, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.1DT, X.1DS] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.2yF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v11, types: [X.2yG, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallsHistoryFragmentViewModel(X.C19880zA r14, X.AnonymousClass11S r15, X.AnonymousClass18O r16, X.C36681oI r17, X.C36671oH r18, X.C40971vb r19, X.AnonymousClass1HR r20, X.AnonymousClass1M9 r21, X.C24921Me r22, X.AnonymousClass11P r23, X.C18000vb r24, X.AnonymousClass1TD r25, X.AnonymousClass1CJ r26, X.AnonymousClass1MZ r27, X.C27081Uq r28, X.C39521tD r29, X.C18030ve r30, X.AnonymousClass126 r31, X.C41001ve r32, X.C24901Mc r33, X.AnonymousClass1DC r34, X.AnonymousClass10I r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38, X.AnonymousClass00H r39) {
        /*
            r13 = this;
            r13.<init>()
            r2 = 0
            r13.A00 = r2
            X.1vg r9 = new X.1vg
            r9.<init>(r13)
            r13.A0z = r9
            X.31g r8 = new X.31g
            r8.<init>(r13, r2)
            r13.A0x = r8
            X.1vh r7 = new X.1vh
            r7.<init>(r13)
            r13.A0v = r7
            X.1vi r0 = new X.1vi
            r0.<init>(r13)
            r13.A0S = r0
            X.1vj r0 = new X.1vj
            r0.<init>(r13)
            r13.A0T = r0
            X.1vk r0 = new X.1vk
            r0.<init>(r13)
            r13.A0W = r0
            X.1vl r0 = new X.1vl
            r0.<init>(r13)
            r13.A0X = r0
            X.1vm r0 = new X.1vm
            r0.<init>(r13)
            r13.A0U = r0
            X.1vn r0 = new X.1vn
            r0.<init>(r13)
            r13.A0V = r0
            X.1DT r0 = new X.1DT
            r0.<init>()
            r13.A0t = r0
            X.1DT r0 = new X.1DT
            r0.<init>()
            r13.A0M = r0
            X.1vo r0 = new X.1vo
            r0.<init>(r13)
            r13.A0Y = r0
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r13.A0q = r5
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r13.A0r = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r13.A0s = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0E = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.1vp r4 = new X.1vp
            r4.<init>(r0)
            r13.A0k = r4
            r0 = r23
            r13.A0b = r0
            r6 = r30
            r13.A0h = r6
            r13.A0O = r15
            r1 = r35
            r13.A11 = r1
            r0 = r26
            r13.A0e = r0
            r0 = r16
            r13.A0u = r0
            r0 = r20
            r13.A0w = r0
            r0 = r33
            r13.A0j = r0
            r0 = r37
            r13.A0o = r0
            r0 = r21
            r13.A0Z = r0
            r0 = r22
            r13.A0a = r0
            r0 = r34
            r13.A0l = r0
            r0 = r24
            r13.A0c = r0
            r12 = r19
            r13.A0R = r12
            r0 = r31
            r13.A0i = r0
            r0 = r36
            r13.A12 = r0
            r0 = r25
            r13.A0d = r0
            r0 = r38
            r13.A0n = r0
            r0 = r39
            r13.A0m = r0
            r0 = r28
            r13.A0g = r0
            r10 = r32
            r13.A10 = r10
            r11 = r29
            r13.A0y = r11
            r0 = r27
            r13.A0f = r0
            r3 = 1
            X.10s r0 = new X.10s
            r0.<init>(r1, r3)
            r13.A0D = r0
            r13.A0N = r14
            r0 = r17
            r13.A0P = r0
            r0 = r18
            r13.A0Q = r0
            r0 = 6792(0x1a88, float:9.518E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r6, r0)
            r0 = r0 ^ 1
            r13.A0J = r0
            r12.A07 = r7
            r10.registerObserver(r9)
            boolean r0 = X.C40811vJ.A0D(r15, r6)
            if (r0 == 0) goto L_0x010f
            r11.registerObserver(r8)
        L_0x010f:
            r0 = 5370(0x14fa, float:7.525E-42)
            int r0 = X.C18020vd.A00(r1, r6, r0)
            if (r0 != r3) goto L_0x01a2
            X.2yG r1 = new X.2yG
            r1.<init>()
            r13.A03 = r1
        L_0x011e:
            java.util.ArrayList r0 = r13.A0E
            r0.add(r2, r1)
        L_0x0123:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 2131887801(0x7f1206b9, float:1.941022E38)
            X.1vr r0 = new X.1vr
            r0.<init>((int) r1)
            r5.put(r2, r0)
            boolean r0 = X.C40811vJ.A0D(r15, r6)
            if (r0 == 0) goto L_0x014b
            r0 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r2 = 2131887799(0x7f1206b7, float:1.9410215E38)
            r1 = 2131889602(0x7f120dc2, float:1.9413872E38)
            X.1vr r0 = new X.1vr
            r0.<init>(r2, r1)
            r5.put(r6, r0)
        L_0x014b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1 = 2131887802(0x7f1206ba, float:1.9410221E38)
            X.1vr r0 = new X.1vr
            r0.<init>((int) r1)
            r5.put(r2, r0)
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131887798(0x7f1206b6, float:1.9410213E38)
            X.1vr r0 = new X.1vr
            r0.<init>((int) r1)
            r5.put(r2, r0)
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131887800(0x7f1206b8, float:1.9410217E38)
            X.1vr r0 = new X.1vr
            r0.<init>((int) r1)
            r5.put(r2, r0)
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131887797(0x7f1206b5, float:1.9410211E38)
            X.1vr r0 = new X.1vr
            r0.<init>((int) r1)
            r5.put(r2, r0)
            r0 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131888815(0x7f120aaf, float:1.9412276E38)
            X.1vr r0 = new X.1vr
            r0.<init>((int) r1)
            r5.put(r2, r0)
            r13.A0L = r3
            java.util.ArrayList r0 = r13.A0E
            r4.A0F(r0)
            return
        L_0x01a2:
            boolean r0 = X.C40811vJ.A0E(r15, r6)
            if (r0 != 0) goto L_0x0123
            X.2yF r1 = new X.2yF
            r1.<init>()
            r13.A02 = r1
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.<init>(X.0zA, X.11S, X.18O, X.1oI, X.1oH, X.1vb, X.1HR, X.1M9, X.1Me, X.11P, X.0vb, X.1TD, X.1CJ, X.1MZ, X.1Uq, X.1tD, X.0ve, X.126, X.1ve, X.1Mc, X.1DC, X.10I, X.00H, X.00H, X.00H, X.00H):void");
    }
}

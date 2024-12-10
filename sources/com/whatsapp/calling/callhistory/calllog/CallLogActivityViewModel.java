package com.whatsapp.calling.callhistory.calllog;

import X.A09;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass11X;
import X.AnonymousClass11Y;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1E7;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1HQ;
import X.AnonymousClass1I8;
import X.AnonymousClass1J2;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NG;
import X.AnonymousClass1OX;
import X.AnonymousClass1TB;
import X.AnonymousClass1TD;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IV;
import X.AnonymousClass4Z7;
import X.AnonymousClass4Z8;
import X.AnonymousClass4ZR;
import X.C104795Pn;
import X.C1402670q;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C19880zA;
import X.C24921Me;
import X.C27081Uq;
import X.C29401cD;
import X.C29431cG;
import X.C30391dr;
import X.C34071js;
import X.C37361pP;
import X.C41561wd;
import X.C41731wy;
import X.C42211xo;
import X.C42571yO;
import X.C72453Mb;
import X.C72473Md;
import X.C87484Vt;
import X.C89444cT;
import X.C93354iq;
import X.C93374is;
import X.C99654tF;
import android.app.Activity;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class CallLogActivityViewModel extends AnonymousClass1J2 {
    public C89444cT A00;
    public final AnonymousClass1DS A01;
    public final C19880zA A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1VP A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final C18000vb A07;
    public final AnonymousClass1TB A08;
    public final AnonymousClass1TD A09;
    public final AnonymousClass1CJ A0A;
    public final AnonymousClass1MZ A0B;
    public final C27081Uq A0C;
    public final C18030ve A0D;
    public final C42211xo A0E;
    public final AnonymousClass1BI A0F;
    public final C41731wy A0G;
    public final AnonymousClass1DC A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final Boolean A0M;
    public final Integer A0N;
    public final String A0O;
    public final HashSet A0P;
    public final C18100vl A0Q = AnonymousClass1DF.A01(C104795Pn.A00);
    public final C18600wl A0R;
    public final C18600wl A0S;
    public final AnonymousClass1G4 A0T;
    public final AnonymousClass1G4 A0U;
    public final AnonymousClass1G4 A0V;
    public final AnonymousClass1G4 A0W;
    public final AnonymousClass1G4 A0X;
    public final AnonymousClass1G4 A0Y;
    public final AnonymousClass1G4 A0Z;
    public final AnonymousClass1G1 A0a;
    public final boolean A0b;
    public final AnonymousClass1HQ A0c;
    public final C42571yO A0d;
    public final AnonymousClass11P A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;
    public final C18600wl A0h;

    public final void A0T(Context context, C89444cT r13, List list, boolean z, boolean z2, boolean z3) {
        AnonymousClass1OX A12 = C72453Mb.A12(this, context);
        AnonymousClass3MW.A1X(this.A0h, new CallLogActivityViewModel$onCallClick$1(context, this, r13, list, (C30391dr) null, z3, z, z2), A12);
    }

    public static final AnonymousClass1E7 A00(CallLogActivityViewModel callLogActivityViewModel, AnonymousClass1BI r2) {
        AnonymousClass1BI A012 = ((AnonymousClass1NG) callLogActivityViewModel.A0J.get()).A01(r2);
        if (A012 != null) {
            r2 = A012;
        }
        return callLogActivityViewModel.A05.A0H(r2);
    }

    public static String A03(C18000vb r8, int i, int i2) {
        int i3;
        if (i2 != 0) {
            i3 = 285;
            if (i2 != 1) {
                i3 = 280;
            }
        } else {
            i3 = 291;
        }
        Object[] objArr = new Object[1];
        Object[] objArr2 = new Object[1];
        objArr[C72453Mb.A1b(objArr2, i)] = String.format(r8.A0N(), "%d", objArr2);
        return r8.A0J(objArr, i3, (long) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r2.A09 == 3) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A05(com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r6, java.util.List r7) {
        /*
            X.1HQ r0 = r6.A0c
            X.4cT r6 = X.C40811vJ.A05(r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r7.iterator()
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.9Bw r2 = (X.C178119Bw) r2
            int r0 = r2.A07
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 != 0) goto L_0x0037
            boolean r0 = r2.A0W()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0046
            X.C178119Bw.A00(r2)
            int r0 = r2.A09
            if (r0 != r1) goto L_0x0046
        L_0x0037:
            r1 = 1
        L_0x0038:
            X.4cT r0 = r2.A04
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r1 != 0) goto L_0x000e
            if (r0 != 0) goto L_0x000e
            r5.add(r3)
            goto L_0x000e
        L_0x0046:
            r1 = 0
            goto L_0x0038
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A05(com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel, java.util.List):java.util.List");
    }

    public static final void A08(Activity activity, CallLogActivityViewModel callLogActivityViewModel, AnonymousClass1BI r5) {
        Log.i("callLogActivityViewModel/new_conversation");
        int i = 0;
        if (C87484Vt.A01(callLogActivityViewModel.A0D)) {
            i = 32;
        }
        ((AnonymousClass1L9) callLogActivityViewModel.A0f.get()).A09(activity, ((AnonymousClass1LU) callLogActivityViewModel.A0g.get()).A1w(activity, r5, i));
        activity.finish();
    }

    public static final void A09(CallLogActivityViewModel callLogActivityViewModel) {
        AnonymousClass1G4 r1 = callLogActivityViewModel.A0Y;
        HashSet hashSet = callLogActivityViewModel.A0P;
        AnonymousClass3MY.A1Y(r1, C17880vN.A1X(hashSet));
        callLogActivityViewModel.A0Z.setValue(Integer.valueOf(hashSet.size()));
    }

    public final void A0U(View view, AnonymousClass1BI r5) {
        this.A0g.get();
        A09 a09 = new A09(view, r5, C17880vN.A0m());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass4ZR.A01(AnonymousClass3MY.A04(view)));
        a09.A02 = AnonymousClass000.A0y("-avatar", A10);
        a09.A01(AnonymousClass3Ma.A05(view));
    }

    public final boolean A0V() {
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : (Iterable) this.A0T.getValue()) {
            if (next instanceof C93374is) {
                A13.add(next);
            }
        }
        return AnonymousClass000.A1a(A13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r10.intValue() != 2131233309) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A04(X.AnonymousClass4DF r9, java.lang.Integer r10, java.util.Map r11, float r12, boolean r13, boolean r14) {
        /*
            r1 = 2131233309(0x7f080a1d, float:1.8082752E38)
            r8 = 0
            if (r10 == 0) goto L_0x000d
            int r0 = r10.intValue()
            r7 = 0
            if (r0 == r1) goto L_0x000e
        L_0x000d:
            r7 = 1
        L_0x000e:
            r1 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r10 == 0) goto L_0x0019
            int r0 = r10.intValue()
            if (r0 == r1) goto L_0x001a
        L_0x0019:
            r8 = 1
        L_0x001a:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.Object r0 = r11.get(r9)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0028
            X.0wS r0 = X.C18460wS.A00
        L_0x0028:
            java.util.Iterator r5 = r0.iterator()
        L_0x002c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r4 = r5.next()
            X.4DJ r4 = (X.AnonymousClass4DJ) r4
            X.4DJ r3 = X.AnonymousClass4DJ.VOICE
            if (r4 != r3) goto L_0x003e
            if (r8 != 0) goto L_0x002c
        L_0x003e:
            X.4DJ r2 = X.AnonymousClass4DJ.VOICE_CHAT
            if (r4 != r2) goto L_0x0044
            if (r7 != 0) goto L_0x002c
        L_0x0044:
            X.4DJ r0 = X.AnonymousClass4DJ.VIDEO
            if (r4 != r0) goto L_0x004a
            if (r14 != 0) goto L_0x002c
        L_0x004a:
            r1 = 0
            if (r4 != r0) goto L_0x0058
            if (r13 != 0) goto L_0x0065
        L_0x004f:
            X.4T5 r0 = new X.4T5
            r0.<init>(r4, r1)
            r6.add(r0)
            goto L_0x002c
        L_0x0058:
            if (r4 == r3) goto L_0x005c
            if (r4 != r2) goto L_0x0065
        L_0x005c:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x004f
            if (r13 == 0) goto L_0x004f
        L_0x0065:
            r1 = 1
            goto L_0x004f
        L_0x0067:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A04(X.4DF, java.lang.Integer, java.util.Map, float, boolean, boolean):java.util.ArrayList");
    }

    public static final List A06(CallLogActivityViewModel callLogActivityViewModel, List list) {
        String A0A2;
        LinkedHashMap A13 = C17880vN.A13();
        for (Object next : list) {
            long j = ((C93374is) next).A06.A01;
            if (DateUtils.isToday(j)) {
                C18000vb r2 = callLogActivityViewModel.A07;
                Locale A0N2 = r2.A0N();
                C18070vi.A0X(A0N2);
                String A082 = r2.A08(272);
                C18070vi.A0X(A082);
                A0A2 = AnonymousClass11Y.A02(A0N2, A082);
            } else {
                boolean isToday = DateUtils.isToday(86400000 + j);
                AnonymousClass11Y r1 = AnonymousClass11X.A00;
                C18000vb r0 = callLogActivityViewModel.A07;
                if (isToday) {
                    A0A2 = r1.A05(r0);
                } else {
                    A0A2 = r1.A0A(r0, j);
                }
            }
            ((List) C72473Md.A0h(A0A2, A13)).add(next);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator A15 = AnonymousClass000.A15(A13);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            C29401cD.A0J(C29431cG.A0k((Iterable) A16.getValue(), C18070vi.A0M(new C93354iq(C1402670q.A00((String) A16.getKey())))), A132);
        }
        return A132;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022b, code lost:
        if (r2.A0S() != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0268, code lost:
        if (r2.A0R() == false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0149 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A07(com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r38, java.util.List r39) {
        /*
            java.util.ArrayList r21 = X.C29351c6.A0D(r39)
            java.util.Iterator r20 = r39.iterator()
        L_0x0008:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0297
            java.lang.Object r2 = r20.next()
            X.9Bw r2 = (X.C178119Bw) r2
            X.2kW r0 = r2.A0F
            r3 = r38
            if (r0 == 0) goto L_0x028a
            com.whatsapp.jid.GroupJid r0 = r2.A0C
            if (r0 == 0) goto L_0x028a
            X.0ve r0 = r3.A0D
            boolean r0 = X.C40811vJ.A0W(r0)
            if (r0 == 0) goto L_0x028a
            X.2kW r1 = r2.A0F
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x0292
            java.lang.String r4 = r1.A00
            X.C18070vi.A0X(r4)
            com.whatsapp.jid.GroupJid r1 = r2.A0C
            if (r1 == 0) goto L_0x028d
            X.1Uq r0 = r3.A0C
            X.2mw r4 = r0.A02(r1, r4)
        L_0x003b:
            X.0ve r10 = r3.A0D
            if (r4 == 0) goto L_0x026c
            r32 = 2131233223(0x7f0809c7, float:1.8082577E38)
        L_0x0042:
            int r33 = X.AnonymousClass4aR.A02(r2)
            boolean r0 = X.C40811vJ.A0R(r10)
            if (r0 != 0) goto L_0x005e
            com.whatsapp.jid.GroupJid r1 = r2.A0C
            X.2m4 r0 = r2.A0B
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C40811vJ.A0a(r10, r1, r0)
            if (r0 == 0) goto L_0x0232
        L_0x005e:
            boolean r0 = r2.A0R()
            if (r0 != 0) goto L_0x022d
            boolean r0 = r2.A0U()
            if (r0 == 0) goto L_0x0227
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x0227
        L_0x0074:
            r1 = 2131892251(0x7f12181b, float:1.9419245E38)
        L_0x0077:
            X.6IR r15 = X.AnonymousClass3MX.A0t(r1)
        L_0x007b:
            boolean r14 = r3.A0b
            r28 = 0
            if (r14 != 0) goto L_0x021d
            boolean r0 = X.C40811vJ.A0R(r10)
            if (r0 != 0) goto L_0x021d
            r27 = r28
        L_0x0089:
            boolean r0 = X.C40811vJ.A0R(r10)
            if (r0 != 0) goto L_0x009f
            if (r14 != 0) goto L_0x009f
            boolean r1 = r2.A0J
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r1 == 0) goto L_0x009b
            r0 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x009b:
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)
        L_0x009f:
            X.11P r5 = r3.A0e
            long r0 = r2.A01
            long r34 = r5.A09(r0)
            int r5 = r2.A06
            r0 = 5
            if (r5 != r0) goto L_0x01f4
            X.0vb r8 = r3.A07
            int r0 = r2.A08
            long r0 = (long) r0
            if (r14 == 0) goto L_0x01ed
            r18 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r18
            r11 = 0
            r7 = 0
            r6 = 1
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r5 = 0
            if (r9 < 0) goto L_0x00c1
            r5 = 1
        L_0x00c1:
            X.C17960vV.A0D(r5)
            r16 = 3600000(0x36ee80, double:1.7786363E-317)
            long r11 = r0 / r16
            int r13 = (int) r11
            long r0 = r0 % r16
            r16 = 60000(0xea60, double:2.9644E-319)
            long r11 = r0 / r16
            int r5 = (int) r11
            long r0 = r0 % r16
            long r0 = r0 / r18
            int r9 = (int) r0
            java.lang.String r12 = A03(r8, r9, r7)
            r9 = 239(0xef, float:3.35E-43)
            r0 = 2
            if (r13 <= 0) goto L_0x01db
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r11 = A03(r8, r13, r0)
            r1[r7] = r11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = A03(r8, r5, r6)
            r0[r7] = r5
            r0[r6] = r12
            java.lang.String r0 = r8.A0B(r9, r0)
            r1[r6] = r0
            java.lang.String r12 = r8.A0B(r9, r1)
        L_0x00fc:
            X.C18070vi.A0b(r12)
            X.482 r24 = X.C1402670q.A00(r12)
        L_0x0103:
            int r1 = r2.A06
            r0 = 5
            if (r1 != r0) goto L_0x01d7
            long r0 = r2.A0A
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d7
            X.0vb r5 = r3.A07
            java.lang.String r29 = X.C88584aA.A04(r5, r0)
        L_0x0116:
            r5 = 1
            r0 = 0
            r25 = 0
            if (r4 == 0) goto L_0x01a4
            com.whatsapp.jid.UserJid r1 = r4.A05
            X.11S r4 = r3.A03
            boolean r4 = r4.A0O(r1)
            if (r4 == 0) goto L_0x01c2
            r1 = 2131895431(0x7f122487, float:1.9425695E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
        L_0x012b:
            X.6IR r25 = X.C1402670q.A02(r4, r1)
        L_0x012f:
            boolean r1 = X.C40811vJ.A0R(r10)
            r30 = 0
            if (r1 != 0) goto L_0x0164
            com.whatsapp.jid.GroupJid r4 = r2.A0C
            X.2m4 r1 = r2.A0B
            boolean r1 = X.AnonymousClass000.A1W(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = X.C40811vJ.A0a(r10, r4, r1)
            if (r1 != 0) goto L_0x0164
        L_0x0149:
            r1 = 3
            X.5Am r31 = X.AnonymousClass3MW.A16(r3, r1)
            X.4is r1 = new X.4is
            r22 = r1
            r23 = r15
            r26 = r2
            r36 = r14
            r37 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37)
            r0 = r21
            r0.add(r1)
            goto L_0x0008
        L_0x0164:
            boolean r1 = r2.A0R()
            if (r1 == 0) goto L_0x0179
            r5 = 2131887847(0x7f1206e7, float:1.9410313E38)
        L_0x016d:
            r4 = 2131233383(0x7f080a67, float:1.8082902E38)
        L_0x0170:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.1D6 r30 = X.AnonymousClass1D6.A00(r1, r4)
            goto L_0x0149
        L_0x0179:
            boolean r1 = r2.A0U()
            if (r1 == 0) goto L_0x018d
            r4 = 6307(0x18a3, float:8.838E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r10, r4)
            if (r1 == 0) goto L_0x018d
            r5 = 2131887843(0x7f1206e3, float:1.9410305E38)
            goto L_0x016d
        L_0x018d:
            boolean r1 = r2.A0S()
            if (r1 == 0) goto L_0x019a
            r5 = 2131887845(0x7f1206e5, float:1.9410309E38)
            r4 = 2131233278(0x7f0809fe, float:1.8082689E38)
            goto L_0x0170
        L_0x019a:
            boolean r1 = r2.A0T()
            r5 = 2131887751(0x7f120687, float:1.9410118E38)
            if (r1 != 0) goto L_0x016d
            goto L_0x0149
        L_0x01a4:
            boolean r1 = r2.A0O()
            if (r1 == 0) goto L_0x012f
            X.4cT r1 = r2.A04
            boolean r4 = r1.A03
            if (r4 != 0) goto L_0x012f
            X.1Me r4 = r3.A06
            com.whatsapp.jid.UserJid r1 = r1.A01
            X.1E7 r1 = A00(r3, r1)
            java.lang.String r6 = X.AnonymousClass3MY.A0q(r4, r1)
            if (r6 == 0) goto L_0x012f
            r1 = 2131891692(0x7f1215ec, float:1.9418111E38)
            goto L_0x01d1
        L_0x01c2:
            X.1Me r4 = r3.A06
            X.1E7 r1 = A00(r3, r1)
            java.lang.String r6 = X.AnonymousClass3MY.A0q(r4, r1)
            if (r6 == 0) goto L_0x012f
            r1 = 2131895430(0x7f122486, float:1.9425693E38)
        L_0x01d1:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r0] = r6
            goto L_0x012b
        L_0x01d7:
            r29 = 0
            goto L_0x0116
        L_0x01db:
            if (r5 <= 0) goto L_0x00fc
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = A03(r8, r5, r6)
            r0[r7] = r1
            r0[r6] = r12
            java.lang.String r12 = r8.A0B(r9, r0)
            goto L_0x00fc
        L_0x01ed:
            r5 = 0
            java.lang.String r12 = X.C64052u8.A0D(r8, r5, r0)
            goto L_0x00fc
        L_0x01f4:
            X.4cT r0 = r2.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0219
            if (r4 != 0) goto L_0x0219
            r0 = 2
            if (r5 == r0) goto L_0x0215
            r0 = 3
            if (r5 == r0) goto L_0x0211
            r1 = 4
            r0 = 2131898126(0x7f122f0e, float:1.943116E38)
            if (r5 == r1) goto L_0x020b
            r0 = 2131887621(0x7f120605, float:1.9409854E38)
        L_0x020b:
            X.6IR r24 = X.AnonymousClass3MX.A0t(r0)
            goto L_0x0103
        L_0x0211:
            r0 = 2131898290(0x7f122fb2, float:1.9431494E38)
            goto L_0x020b
        L_0x0215:
            r0 = 2131898252(0x7f122f8c, float:1.9431416E38)
            goto L_0x020b
        L_0x0219:
            r24 = 0
            goto L_0x0103
        L_0x021d:
            int r0 = X.AnonymousClass4aR.A03(r2)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r0)
            goto L_0x0089
        L_0x0227:
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L_0x0232
        L_0x022d:
            r1 = 2131896146(0x7f122752, float:1.9427145E38)
            goto L_0x0077
        L_0x0232:
            if (r4 == 0) goto L_0x0242
            java.lang.String r0 = r4.A00()
            X.C18070vi.A0X(r0)
            X.482 r15 = new X.482
            r15.<init>(r0)
            goto L_0x007b
        L_0x0242:
            X.4cT r0 = r2.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x024d
            r1 = 2131893425(0x7f121cb1, float:1.9421626E38)
            goto L_0x0077
        L_0x024d:
            int r1 = r2.A06
            r0 = 5
            if (r1 != r0) goto L_0x0257
            r1 = 2131891320(0x7f121478, float:1.9417357E38)
            goto L_0x0077
        L_0x0257:
            int r1 = r2.A06
            r0 = 6
            if (r1 != r0) goto L_0x0261
            r1 = 2131886182(0x7f120066, float:1.9406936E38)
            goto L_0x0077
        L_0x0261:
            boolean r0 = r2.A0R()
            r1 = 2131887846(0x7f1206e6, float:1.941031E38)
            if (r0 != 0) goto L_0x0077
            goto L_0x0074
        L_0x026c:
            boolean r0 = r3.A0b
            if (r0 != 0) goto L_0x0284
            boolean r0 = X.C40811vJ.A0R(r10)
            if (r0 != 0) goto L_0x0284
            X.4cT r0 = r2.A04
            boolean r0 = r0.A03
            r32 = 2131233228(0x7f0809cc, float:1.8082588E38)
            if (r0 == 0) goto L_0x0042
            r32 = 2131233227(0x7f0809cb, float:1.8082586E38)
            goto L_0x0042
        L_0x0284:
            int r32 = X.C42571yO.A00(r2)
            goto L_0x0042
        L_0x028a:
            r4 = 0
            goto L_0x003b
        L_0x028d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0292:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0297:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A07(com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel, java.util.List):java.util.List");
    }

    public CallLogActivityViewModel(C37361pP r29, C19880zA r30, AnonymousClass11S r31, AnonymousClass1HQ r32, AnonymousClass1VP r33, C42571yO r34, AnonymousClass1M9 r35, C24921Me r36, AnonymousClass11P r37, C18000vb r38, AnonymousClass1TB r39, AnonymousClass1TD r40, AnonymousClass1CJ r41, AnonymousClass1MZ r42, C27081Uq r43, C18030ve r44, C42211xo r45, AnonymousClass1DC r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51, AnonymousClass00H r52, C18600wl r53, C18600wl r54, C18600wl r55) {
        C18030ve r0 = r44;
        AnonymousClass1TD r17 = r40;
        AnonymousClass1TB r18 = r39;
        C42571yO r23 = r34;
        AnonymousClass1VP r24 = r33;
        C18070vi.A0w(r0, r24, r18, r17, r23);
        C27081Uq r14 = r43;
        AnonymousClass1MZ r15 = r42;
        AnonymousClass1CJ r16 = r41;
        AnonymousClass1M9 r22 = r35;
        AnonymousClass11S r26 = r31;
        C18070vi.A0x(r16, r22, r15, r26, r14);
        AnonymousClass1DC r11 = r46;
        C42211xo r13 = r45;
        AnonymousClass11P r20 = r37;
        C24921Me r21 = r36;
        AnonymousClass1HQ r25 = r32;
        C18070vi.A0y(r13, r11, r20, r25, r21);
        C18000vb r19 = r38;
        AnonymousClass00H r8 = r49;
        AnonymousClass00H r9 = r48;
        AnonymousClass00H r10 = r47;
        C18070vi.A0t(r19, r10, r9, r8);
        C18600wl r3 = r54;
        C18600wl r4 = r53;
        AnonymousClass00H r6 = r51;
        AnonymousClass00H r7 = r50;
        C18070vi.A0u(r7, r6, r4, r3);
        C18600wl r2 = r55;
        AnonymousClass00H r5 = r52;
        C37361pP r12 = r29;
        C19880zA r27 = r30;
        C18070vi.A0v(r2, r12, r27, r5);
        this.A0D = r0;
        this.A04 = r24;
        this.A08 = r18;
        this.A09 = r17;
        this.A0d = r23;
        this.A0A = r16;
        this.A05 = r22;
        this.A0B = r15;
        this.A03 = r26;
        this.A0C = r14;
        this.A0E = r13;
        this.A0H = r11;
        this.A0e = r20;
        this.A0c = r25;
        this.A06 = r21;
        this.A07 = r19;
        this.A0f = r10;
        this.A0L = r9;
        this.A0K = r8;
        this.A0g = r7;
        this.A0J = r6;
        this.A0R = r4;
        this.A0h = r3;
        this.A0S = r2;
        this.A02 = r27;
        this.A0I = r5;
        String str = (String) r12.A02("jid");
        this.A0O = str;
        this.A0b = C72453Mb.A1Y((Boolean) r12.A02("is_call_info_optimized"));
        this.A0N = (Integer) r12.A02("call_size_type");
        this.A0M = (Boolean) r12.A02("is_video_call_log_group");
        C18460wS r72 = C18460wS.A00;
        this.A0T = C34071js.A00(r72);
        AnonymousClass1I8 r56 = AnonymousClass4IV.A01;
        this.A0W = AnonymousClass3MW.A18(r56);
        AnonymousClass1G7 A002 = C34071js.A00(r72);
        this.A0U = A002;
        this.A0a = AnonymousClass4Z7.A01(r72, C41561wd.A00(this), AnonymousClass4Z8.A00(new CallLogActivityViewModel$callInfoItemRows$1(this, (C30391dr) null), this.A0T, A002), C99654tF.A00());
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A0G = A0o;
        this.A01 = A0o;
        this.A0P = C17880vN.A12();
        this.A0Y = AnonymousClass3MW.A18(false);
        this.A0Z = AnonymousClass3MW.A18(0);
        this.A0V = AnonymousClass3MW.A18(r56);
        this.A0X = AnonymousClass3MW.A18(false);
        this.A0F = AnonymousClass3MX.A0l(str);
    }
}

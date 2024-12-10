package X;

import android.view.View;

/* renamed from: X.4dA  reason: invalid class name and case insensitive filesystem */
public class C89874dA implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89874dA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89874dA(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0487, code lost:
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0489, code lost:
        if (r2 == null) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x048b, code lost:
        r3.A09.A00(r2, r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0491, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0492, code lost:
        r0 = "CallsHistoryCallItemViewHolder/videoCallButtonClicked call item is null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x049b, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x049e, code lost:
        if (r1 == null) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04a0, code lost:
        r3.A09.A00(r1, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04a6, code lost:
        r0 = "CallsHistoryCallItemViewHolder/voiceCallButtonClicked call item is null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04a8, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x060d, code lost:
        r1.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0610, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0667, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x066b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0249, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x024b, code lost:
        r3 = r0.A00;
        r3.A0r.get();
        r0 = r3.A14();
        r2 = X.C17880vN.A0A();
        r2.setClassName(r0.getPackageName(), "com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity");
        r3.A1k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0266, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x026f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0271, code lost:
        r4 = r0.A00;
        r4.A0E.A00(43, 15);
        r2 = (X.C192539oZ) r4.A0l.get();
        r2.A00();
        r2.A01((java.lang.Integer) null, (java.lang.Integer) null, 17);
        r4.A0r.get();
        r0 = r4.A14();
        r2 = X.C17880vN.A0A();
        r2.setClassName(r0.getPackageName(), "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity");
        r2.putExtra("com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit", false);
        r4.A1k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0605;
                case 1: goto L_0x03a3;
                case 2: goto L_0x05fc;
                case 3: goto L_0x0386;
                case 4: goto L_0x05f0;
                case 5: goto L_0x05dc;
                case 6: goto L_0x05d0;
                case 7: goto L_0x05ca;
                case 8: goto L_0x05b6;
                case 9: goto L_0x0544;
                case 10: goto L_0x0333;
                case 11: goto L_0x0307;
                case 12: goto L_0x053a;
                case 13: goto L_0x04fa;
                case 14: goto L_0x04e4;
                case 15: goto L_0x04d6;
                case 16: goto L_0x04d0;
                case 17: goto L_0x02f5;
                case 18: goto L_0x02e7;
                case 19: goto L_0x02be;
                case 20: goto L_0x02ad;
                case 21: goto L_0x04c8;
                case 22: goto L_0x04be;
                case 23: goto L_0x04b4;
                case 24: goto L_0x04ac;
                case 25: goto L_0x0495;
                case 26: goto L_0x0481;
                case 27: goto L_0x047c;
                case 28: goto L_0x0477;
                case 29: goto L_0x0444;
                case 30: goto L_0x0432;
                case 31: goto L_0x0267;
                case 32: goto L_0x0241;
                case 33: goto L_0x0238;
                case 34: goto L_0x022f;
                case 35: goto L_0x0420;
                case 36: goto L_0x00b9;
                case 37: goto L_0x0414;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x00a0;
                case 41: goto L_0x03f8;
                case 42: goto L_0x03dc;
                case 43: goto L_0x0031;
                case 44: goto L_0x03d4;
                case 45: goto L_0x03cc;
                case 46: goto L_0x03c4;
                case 47: goto L_0x03bc;
                case 48: goto L_0x03b4;
                case 49: goto L_0x03ac;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r14.A01
            com.whatsapp.calling.capi.view.CapiCallingConfirmationBottomSheetDialogFragment r5 = (com.whatsapp.calling.capi.view.CapiCallingConfirmationBottomSheetDialogFragment) r5
            android.content.Context r4 = r5.A1n()
            if (r4 == 0) goto L_0x002a
            X.9sx r0 = r5.A01
            if (r0 == 0) goto L_0x0662
            r0.A01()
            X.1VP r3 = r5.A00
            if (r3 == 0) goto L_0x039f
            X.1E7 r2 = r5.A04
            android.os.Bundle r1 = r5.A06
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = "call_from"
            int r1 = r1.getInt(r0)
        L_0x0026:
            r0 = 0
            r3.CNw(r4, r2, r1, r0)
        L_0x002a:
            r5.A29()
        L_0x002d:
            return
        L_0x002e:
            r1 = 8
            goto L_0x0026
        L_0x0031:
            java.lang.Object r0 = r14.A01
            X.3ZY r0 = (X.AnonymousClass3ZY) r0
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r6 = r0.A00
            if (r6 == 0) goto L_0x002d
            android.content.Context r5 = r15.getContext()
            X.6lg r0 = r6.A00
            if (r0 == 0) goto L_0x002d
            if (r5 == 0) goto L_0x002d
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r0)
            if (r2 == 0) goto L_0x0087
            com.whatsapp.voipcalling.CallState r0 = r2.callState
            boolean r0 = X.C40811vJ.A0f(r0)
            if (r0 != 0) goto L_0x0087
            X.1M9 r1 = r6.A0A
            com.whatsapp.jid.UserJid r0 = r2.getPeerJid()
            X.C17960vV.A07(r0)
            X.1E7 r1 = r1.A0H(r0)
            X.3Rj r4 = X.AnonymousClass4a6.A00(r5)
            boolean r0 = r2.isGroupCall
            r3 = 2131898179(0x7f122f43, float:1.9431268E38)
            if (r0 == 0) goto L_0x006e
            r3 = 2131898178(0x7f122f42, float:1.9431266E38)
        L_0x006e:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.1Me r0 = r6.A0B
            java.lang.String r1 = r0.A0I(r1)
            r0 = 0
            java.lang.String r0 = X.C17880vN.A0q(r5, r1, r2, r0, r3)
            r4.A0S(r0)
            X.C73203Rj.A06(r4)
            X.AnonymousClass3MY.A1G(r4)
            return
        L_0x0087:
            X.6lg r0 = r6.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r0.A00
            X.0vp r0 = r2.A23
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0611
            X.1HQ r0 = r2.A0Y
            com.whatsapp.voipcalling.CallInfo r1 = r0.BO3()
            if (r1 == 0) goto L_0x002d
            r0 = 0
            com.whatsapp.voipcalling.VoipActivityV2.A1P(r1, r2, r0)
            return
        L_0x00a0:
            java.lang.Object r1 = r14.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x002d
            X.1GP r2 = r1.A1F()
            com.whatsapp.voipcalling.WASecuredDialogFragment r1 = new com.whatsapp.voipcalling.WASecuredDialogFragment
            r1.<init>()
            java.lang.String r0 = "WASecuredDialogFragment"
            X.C20098A7b.A04(r1, r2, r0)
            return
        L_0x00b9:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.callrating.CallRatingBottomSheet r0 = (com.whatsapp.calling.callrating.CallRatingBottomSheet) r0
            X.0vl r0 = r0.A04
            com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel r4 = X.AnonymousClass3MX.A0Z(r0)
            com.whatsapp.fieldstats.events.WamCall r6 = r4.A00
            if (r6 == 0) goto L_0x002d
            X.1vp r0 = r4.A0C
            int r5 = X.C72463Mc.A0A(r0)
            r0 = -1
            if (r5 != r0) goto L_0x021c
            r2 = 0
        L_0x00d2:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.userRating = r0
            if (r0 == 0) goto L_0x0217
            long r7 = r0.longValue()
            r1 = 4
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0217
            java.util.HashSet r0 = r4.A0E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0217
            java.util.ArrayList r5 = r4.A0D
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0206
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            r0 = 7
            X.4Y5[] r8 = new X.AnonymousClass4Y5[r0]
            r0 = 2131886785(0x7f1202c1, float:1.9408159E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r7)
            r0 = 0
            r8[r0] = r1
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            r0 = 2131886791(0x7f1202c7, float:1.940817E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r3)
            r0 = 1
            r8[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            r0 = 2131886776(0x7f1202b8, float:1.940814E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 2
            r8[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y
            r0 = 2131886798(0x7f1202ce, float:1.9408185E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 3
            r8[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A0j
            r0 = 2131887617(0x7f120601, float:1.9409846E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 4
            r8[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A0u
            r0 = 2131887615(0x7f1205ff, float:1.9409842E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 5
            r8[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A15
            r1 = 2131886775(0x7f1202b7, float:1.9408138E38)
            X.4Y5 r0 = new X.4Y5
            r0.<init>(r1, r2)
            r2 = 6
            r8[r2] = r0
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A06(r8)
            java.util.Collections.shuffle(r1)
            X.4T7 r0 = new X.4T7
            r0.<init>(r7, r1)
            r5.add(r0)
            java.lang.Boolean r0 = r6.videoEnabled
            boolean r0 = X.C72463Mc.A1Y(r0)
            if (r0 == 0) goto L_0x01cd
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            X.4Y5[] r7 = new X.AnonymousClass4Y5[r2]
            java.lang.Integer r2 = X.AnonymousClass00R.A18
            r0 = 2131897842(0x7f122df2, float:1.9430585E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 0
            r7[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A19
            r0 = 2131897833(0x7f122de9, float:1.9430567E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 1
            r7[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A03
            r0 = 2131887853(0x7f1206ed, float:1.9410325E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 2
            r7[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A02
            r0 = 2131887851(0x7f1206eb, float:1.941032E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 3
            r7[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A04
            r0 = 2131897832(0x7f122de8, float:1.9430565E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 4
            r7[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A05
            r0 = 2131897840(0x7f122df0, float:1.943058E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 5
            r7[r0] = r1
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A06(r7)
            java.util.Collections.shuffle(r1)
            X.4T7 r0 = new X.4T7
            r0.<init>(r6, r1)
            r5.add(r0)
            java.util.Collections.shuffle(r5)
        L_0x01cd:
            r0 = 3
            X.4Y5[] r6 = new X.AnonymousClass4Y5[r0]
            java.lang.Integer r2 = X.AnonymousClass00R.A06
            r0 = 2131887641(0x7f120619, float:1.9409895E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 0
            r6[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A07
            r0 = 2131887849(0x7f1206e9, float:1.9410317E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 1
            r6[r0] = r1
            java.lang.Integer r2 = X.AnonymousClass00R.A08
            r0 = 2131887626(0x7f12060a, float:1.9409864E38)
            X.4Y5 r1 = new X.4Y5
            r1.<init>(r0, r2)
            r0 = 2
            r6[r0] = r1
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A06(r6)
            java.util.Collections.shuffle(r1)
            X.4T7 r0 = new X.4T7
            r0.<init>(r3, r1)
            r5.add(r0)
        L_0x0206:
            X.1DT r1 = r4.A04
            X.3mT r0 = X.C76063mT.A00
            r1.A0F(r0)
            X.1DT r1 = r4.A06
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
        L_0x0213:
            r1.A0F(r0)
            return
        L_0x0217:
            X.1DT r1 = r4.A04
            X.3mR r0 = X.C76043mR.A00
            goto L_0x0213
        L_0x021c:
            int[] r3 = com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel.A0F
            r2 = 5
            r1 = 0
        L_0x0220:
            r0 = r3[r1]
            if (r5 == r0) goto L_0x0229
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x0220
            r1 = -1
        L_0x0229:
            long r2 = (long) r1
            r0 = 1
            long r2 = r2 + r0
            goto L_0x00d2
        L_0x022f:
            java.lang.Object r1 = r14.A01
            X.2CX r1 = (X.AnonymousClass2CX) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1mF r0 = r1.A00
            goto L_0x026f
        L_0x0238:
            java.lang.Object r1 = r14.A01
            X.2CX r1 = (X.AnonymousClass2CX) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1mF r0 = r1.A00
            goto L_0x0249
        L_0x0241:
            java.lang.Object r1 = r14.A01
            X.5nL r1 = (X.C113595nL) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1mF r0 = r1.A00
        L_0x0249:
            if (r0 == 0) goto L_0x002d
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r3 = r0.A00
            X.00H r0 = r3.A0r
            r0.get()
            android.content.Context r0 = r3.A14()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity"
            r2.setClassName(r1, r0)
            r3.A1k(r2)
            return
        L_0x0267:
            java.lang.Object r1 = r14.A01
            X.5nL r1 = (X.C113595nL) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1mF r0 = r1.A00
        L_0x026f:
            if (r0 == 0) goto L_0x002d
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r4 = r0.A00
            X.1V9 r2 = r4.A0E
            r1 = 43
            r0 = 15
            r2.A00(r1, r0)
            X.00H r0 = r4.A0l
            java.lang.Object r2 = r0.get()
            X.9oZ r2 = (X.C192539oZ) r2
            r2.A00()
            r1 = 0
            r0 = 17
            r2.A01(r1, r1, r0)
            X.00H r0 = r4.A0r
            r0.get()
            android.content.Context r0 = r4.A14()
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit"
            r2.putExtra(r0, r3)
            r4.A1k(r2)
            return
        L_0x02ad:
            java.lang.Object r1 = r14.A01
            X.5wX r1 = (X.C116185wX) r1
            X.5bq r0 = r1.A03
            if (r0 == 0) goto L_0x002d
            X.AnonymousClass3Ma.A16(r15)
            X.5bq r0 = r1.A03
            r0.Bnh()
            return
        L_0x02be:
            java.lang.Object r2 = r14.A01
            X.5wX r2 = (X.C116185wX) r2
            X.5bq r0 = r2.A03
            if (r0 == 0) goto L_0x002d
            X.AnonymousClass3Ma.A16(r15)
            X.5bq r0 = r2.A03
            r0.BlZ()
            X.1VF r1 = r2.A0Q
            X.1VH r0 = X.AnonymousClass1VH.AR_EFFECT
            r1.A00(r0)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A04
            if (r0 == 0) goto L_0x002d
            r3 = 61
            X.1V9 r2 = r0.A0Z
            java.lang.Integer r1 = X.C17880vN.A0j()
            r0 = 16
            r2.A01(r1, r3, r0)
            return
        L_0x02e7:
            java.lang.Object r1 = r14.A01
            X.5wR r1 = (X.C116125wR) r1
            java.util.List r0 = X.C42011xT.A0I
            X.5bq r0 = r1.A00
            if (r0 == 0) goto L_0x002d
            r0.Bye()
            return
        L_0x02f5:
            java.lang.Object r2 = r14.A01
            X.5wQ r2 = (X.C116115wQ) r2
            java.util.List r0 = X.C42011xT.A0I
            X.5bq r1 = r2.A00
            if (r1 == 0) goto L_0x002d
            X.70A r0 = r2.A05
            if (r0 == 0) goto L_0x002d
            r1.Bon(r0)
            return
        L_0x0307:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.callconfirmationsheet.ui.PreCallSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.PreCallSheet) r1
            android.content.Context r6 = X.AnonymousClass3MY.A04(r15)
            boolean r0 = r1 instanceof com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet
            if (r0 == 0) goto L_0x002d
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet) r1
            X.00H r0 = r1.A09
            if (r0 == 0) goto L_0x0662
            X.C72453Mb.A1P(r0)
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r5 = X.AnonymousClass3Ma.A0P(r1)
            r4 = 1
            r5.A00 = r4
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0F
            r1 = 0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1 r0 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1
            r0.<init>(r6, r5, r1, r4)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0333:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.callconfirmationsheet.ui.PreCallSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.PreCallSheet) r1
            android.content.Context r6 = X.AnonymousClass3MY.A04(r15)
            boolean r0 = r1 instanceof com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet
            if (r0 == 0) goto L_0x0619
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet r1 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet) r1
            r0 = 1
            r1.A06 = r0
            X.00H r0 = r1.A05
            if (r0 == 0) goto L_0x0662
            X.C72453Mb.A1P(r0)
            X.00H r0 = r1.A04
            if (r0 == 0) goto L_0x0616
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.9sP r7 = (X.C194859sP) r7
            java.lang.Integer r10 = X.AnonymousClass3MY.A0h()
            X.0vl r0 = r1.A07
            java.lang.Object r11 = r0.getValue()
            java.lang.Integer r11 = (java.lang.Integer) r11
            r8 = 0
            r13 = 4
            r12 = r8
            r9 = r8
            r7.A01(r8, r9, r10, r11, r12, r13)
            X.0vl r0 = r1.A08
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r4 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel) r4
            X.9Bw r3 = r4.A00
            if (r3 == 0) goto L_0x002d
            r0 = 1
            r4.A02 = r0
            X.1OX r2 = X.C41561wd.A00(r4)
            X.0wl r1 = r4.A0J
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1 r0 = new com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1
            r0.<init>(r6, r4, r3, r8)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            return
        L_0x0386:
            java.lang.Object r1 = r14.A01
            X.99s r1 = (X.C1776199s) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r3 = r1.A00
            if (r3 == 0) goto L_0x002d
            X.9tx r0 = r1.A02
            java.lang.String r2 = r0.A06
            java.lang.String r1 = r0.A07
            X.8lH r0 = new X.8lH
            r0.<init>(r2, r1)
            r3.invoke(r0)
            return
        L_0x039f:
            java.lang.String r0 = "callsManager"
            goto L_0x0667
        L_0x03a3:
            java.util.List r0 = X.C42011xT.A0I
            java.lang.String r0 = "setLocationClick"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x03ac:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setAcceptDeclineClickListeners$lambda$20(r0, r15)
            return
        L_0x03b4:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setAcceptDeclineClickListeners$lambda$19(r0, r15)
            return
        L_0x03bc:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setLobbyClickListeners$lambda$22(r0, r15)
            return
        L_0x03c4:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setLobbyClickListeners$lambda$21(r0, r15)
            return
        L_0x03cc:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$13(r0, r15)
            return
        L_0x03d4:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setCallOnHoldClickListeners$lambda$23(r0, r15)
            return
        L_0x03dc:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r1 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet) r1
            X.00H r0 = r1.A0A
            if (r0 == 0) goto L_0x0662
            X.C72453Mb.A1P(r0)
            X.0vl r0 = r1.A0B
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r2 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel) r2
            android.content.Context r1 = X.AnonymousClass3MY.A04(r15)
            r0 = 1
            r2.A0T(r1, r0)
            return
        L_0x03f8:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r1 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet) r1
            r2 = 0
            X.00H r0 = r1.A0A
            if (r0 == 0) goto L_0x0662
            X.C72453Mb.A1P(r0)
            X.0vl r0 = r1.A0B
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r1 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel) r1
            android.content.Context r0 = X.AnonymousClass3MY.A04(r15)
            r1.A0T(r0, r2)
            return
        L_0x0414:
            java.lang.Object r1 = r14.A01
            X.3Z6 r1 = (X.AnonymousClass3Z6) r1
            java.util.List r0 = X.C42011xT.A0I
            androidx.appcompat.widget.AppCompatCheckBox r0 = r1.A00
            r0.performClick()
            return
        L_0x0420:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.callrating.CallRatingBottomSheet r0 = (com.whatsapp.calling.callrating.CallRatingBottomSheet) r0
            X.0vl r0 = r0.A04
            com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel r0 = X.AnonymousClass3MX.A0Z(r0)
            X.1DT r1 = r0.A04
            X.3mR r0 = X.C76043mR.A00
            r1.A0F(r0)
            return
        L_0x0432:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r0 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r0
            X.1nc r2 = r0.A0A
            X.1FL r1 = r0.A1D()
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.A01(r1, r0)
            return
        L_0x0444:
            java.lang.Object r1 = r14.A01
            X.3Zb r1 = (X.C74243Zb) r1
            java.util.List r0 = X.C42011xT.A0I
            r2 = 0
            X.11E r0 = r1.A02
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x046e
            android.view.View r0 = r1.A0H
            android.content.Context r3 = r0.getContext()
            android.content.Context r0 = r15.getContext()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.calllink.view.CallLinkActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x046e:
            X.1KB r1 = r1.A01
            r0 = 2131887665(0x7f120631, float:1.9409944E38)
            r1.A08(r0, r2)
            return
        L_0x0477:
            java.lang.Object r3 = r14.A01
            X.Bq2 r3 = (X.Bq2) r3
            goto L_0x049b
        L_0x047c:
            java.lang.Object r3 = r14.A01
            X.Bq2 r3 = (X.Bq2) r3
            goto L_0x0487
        L_0x0481:
            java.lang.Object r3 = r14.A01
            X.Bq2 r3 = (X.Bq2) r3
            java.util.List r0 = X.C42011xT.A0I
        L_0x0487:
            X.2yP r2 = r3.A00
            if (r2 == 0) goto L_0x0492
            X.1mD r1 = r3.A09
            r0 = 1
            r1.A00(r2, r3, r0)
            return
        L_0x0492:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/videoCallButtonClicked call item is null"
            goto L_0x04a8
        L_0x0495:
            java.lang.Object r3 = r14.A01
            X.Bq2 r3 = (X.Bq2) r3
            java.util.List r0 = X.C42011xT.A0I
        L_0x049b:
            r2 = 0
            X.2yP r1 = r3.A00
            if (r1 == 0) goto L_0x04a6
            X.1mD r0 = r3.A09
            r0.A00(r1, r3, r2)
            return
        L_0x04a6:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/voiceCallButtonClicked call item is null"
        L_0x04a8:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x04ac:
            java.lang.Object r1 = r14.A01
            X.0vk r1 = (X.C18090vk) r1
            java.util.List r0 = X.C42011xT.A0I
            goto L_0x060d
        L_0x04b4:
            java.lang.Object r0 = r14.A01
            com.whatsapp.contact.picker.SelectedContactsList r0 = (com.whatsapp.contact.picker.SelectedContactsList) r0
            X.5bh r0 = r0.A08
            r0.C4w()
            return
        L_0x04be:
            java.lang.Object r0 = r14.A01
            com.whatsapp.contact.picker.SelectedContactsList r0 = (com.whatsapp.contact.picker.SelectedContactsList) r0
            X.5bh r0 = r0.A08
            r0.C4v()
            return
        L_0x04c8:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r0 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r0
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet.A11(r0)
            return
        L_0x04d0:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x04d6:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r0.A0A
            android.content.Context r0 = r15.getContext()
            r1.A0X(r0)
            return
        L_0x04e4:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r0.A0A
            X.8yP r1 = r2.A0W
            r0 = 0
            r1.A0B(r0)
            X.1V9 r2 = r2.A0Z
            r1 = 75
            r0 = 35
            r2.A00(r1, r0)
            return
        L_0x04fa:
            java.lang.Object r3 = r14.A01
            com.whatsapp.calling.callgrid.view.CallGrid r3 = (com.whatsapp.calling.callgrid.view.CallGrid) r3
            X.1V9 r2 = r3.A0D
            boolean r0 = r3.A0X
            r1 = 16
            if (r0 == 0) goto L_0x0508
            r1 = 35
        L_0x0508:
            r0 = 5
            r2.A00(r0, r1)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r3.A0A
            X.8yP r1 = r4.A0W
            r1.A08()
            r0 = 1
            r4.A0E = r0
            X.4Sa r0 = r1.A07()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0B(r0, r4)
            android.os.Handler r1 = r4.A02
            if (r1 != 0) goto L_0x0527
            android.os.Handler r1 = X.C17890vO.A0D()
            r4.A02 = r1
        L_0x0527:
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            android.os.Handler r3 = r4.A02
            r0 = 10
            X.7Pb r2 = new X.7Pb
            r2.<init>(r4, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x053a:
            java.lang.Object r1 = r14.A01
            X.1Di r1 = (X.C22821Di) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.invoke(r15)
            return
        L_0x0544:
            java.lang.Object r1 = r14.A01
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet) r1
            X.00H r0 = r1.A06
            if (r0 == 0) goto L_0x0665
            java.lang.Object r0 = r0.get()
            X.1rD r0 = (X.C38391rD) r0
            int r0 = r0.A0Q()
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r5 = X.AnonymousClass3Ma.A0P(r1)
            if (r0 != 0) goto L_0x058b
            X.4US r1 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A00(r5)
            r0 = 1
            r1.A00 = r0
            int r0 = r5.A01
            boolean r0 = X.C83614Fz.A00(r0)
            if (r0 == 0) goto L_0x057b
            X.1VP r4 = r5.A05
            java.lang.Integer r3 = X.AnonymousClass3MY.A0h()
            java.lang.Integer r2 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A03(r5)
            r1 = 24
            r0 = 0
            r4.BiX(r3, r2, r1, r0)
        L_0x057b:
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0F
            r0 = 0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onListExpandRequest$1 r1 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onListExpandRequest$1
            r1.<init>(r5, r0)
        L_0x0587:
            X.AnonymousClass3MW.A1X(r2, r1, r3)
            return
        L_0x058b:
            X.4US r0 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A00(r5)
            r4 = 0
            r0.A00 = r4
            int r0 = r5.A01
            boolean r0 = X.C83614Fz.A00(r0)
            if (r0 == 0) goto L_0x05a9
            X.1VP r3 = r5.A05
            java.lang.Integer r2 = X.AnonymousClass3MY.A0h()
            java.lang.Integer r1 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A03(r5)
            r0 = 26
            r3.BiX(r2, r1, r0, r4)
        L_0x05a9:
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0F
            r0 = 0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onListCollapseRequest$1 r1 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onListCollapseRequest$1
            r1.<init>(r5, r0)
            goto L_0x0587
        L_0x05b6:
            java.lang.Object r0 = r14.A01
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r0 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r0
            X.00H r0 = r0.A04
            X.4jI r0 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase.A00(r0)
            X.5cO r1 = r0.A02()
            X.1Wu r0 = X.C27621Wu.A00
            r1.Bop(r0)
            return
        L_0x05ca:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x05d0:
            java.lang.Object r1 = r14.A01
            com.whatsapp.businessupsell.BusinessProfileEducation r1 = (com.whatsapp.businessupsell.BusinessProfileEducation) r1
            r1.onBackPressed()
            r0 = 3
            com.whatsapp.businessupsell.BusinessProfileEducation.A03(r1, r0)
            return
        L_0x05dc:
            java.lang.Object r2 = r14.A01
            com.whatsapp.businessupsell.BusinessAppEducation r2 = (com.whatsapp.businessupsell.BusinessAppEducation) r2
            X.9jn r1 = r2.A01
            java.lang.String r0 = "smb_cs_chats_banner"
            android.content.Intent r0 = r1.A00(r0)
            r2.startActivity(r0)
            r0 = 2
            com.whatsapp.businessupsell.BusinessAppEducation.A03(r2, r0)
            return
        L_0x05f0:
            java.lang.Object r1 = r14.A01
            com.whatsapp.businessupsell.BusinessAppEducation r1 = (com.whatsapp.businessupsell.BusinessAppEducation) r1
            r1.onBackPressed()
            r0 = 3
            com.whatsapp.businessupsell.BusinessAppEducation.A03(r1, r0)
            return
        L_0x05fc:
            java.lang.Object r1 = r14.A01
            X.99q r1 = (X.AnonymousClass99q) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r1 = r1.A00
            goto L_0x060d
        L_0x0605:
            java.lang.Object r1 = r14.A01
            X.6FI r1 = (X.AnonymousClass6FI) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r1 = r1.A01
        L_0x060d:
            r1.invoke()
            return
        L_0x0611:
            r0 = 0
            com.whatsapp.voipcalling.VoipActivityV2.A1m(r2, r0)
            return
        L_0x0616:
            java.lang.String r0 = "preCallChatThreadLogger"
            goto L_0x0667
        L_0x0619:
            boolean r0 = r1 instanceof com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet
            if (r0 == 0) goto L_0x0641
            com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet) r1
            X.00H r0 = r1.A01
            if (r0 == 0) goto L_0x0662
            X.C72453Mb.A1P(r0)
            X.0vl r0 = r1.A02
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel r4 = (com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel) r4
            r0 = 1
            r4.A00 = r0
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A06
            r1 = 0
            com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel$onStartClicked$1 r0 = new com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel$onStartClicked$1
            r0.<init>(r6, r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0641:
            com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet r1 = (com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet) r1
            X.00H r0 = r1.A09
            if (r0 == 0) goto L_0x0662
            X.C72453Mb.A1P(r0)
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r5 = X.AnonymousClass3Ma.A0P(r1)
            r4 = 0
            r0 = 1
            r5.A00 = r0
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r2 = r5.A0F
            r1 = 0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1 r0 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1
            r0.<init>(r6, r5, r1, r4)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0662:
            java.lang.String r0 = "voipUXResponsivenessLogger"
            goto L_0x0667
        L_0x0665:
            java.lang.String r0 = "adapter"
        L_0x0667:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89874dA.onClick(android.view.View):void");
    }
}

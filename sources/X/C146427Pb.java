package X;

/* renamed from: X.7Pb  reason: invalid class name and case insensitive filesystem */
public class C146427Pb implements Runnable {
    public final int A00;
    public final Object A01;

    public C146427Pb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0390, code lost:
        if (r3.intersect(r1) == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0392, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0393, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0396, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0421, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0424, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x048a, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x048d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0499, code lost:
        r0 = X.A99.A4B;
        r2.A0H.removeMessages(60);
        r2.A0H.sendEmptyMessage(60);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        ((com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel) r0).A0T();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x02dd;
                case 1: goto L_0x02ee;
                case 2: goto L_0x02f8;
                case 3: goto L_0x0301;
                case 4: goto L_0x0011;
                case 5: goto L_0x003b;
                case 6: goto L_0x004f;
                case 7: goto L_0x006d;
                case 8: goto L_0x0367;
                case 9: goto L_0x0309;
                case 10: goto L_0x0311;
                case 11: goto L_0x0320;
                case 12: goto L_0x032d;
                case 13: goto L_0x0335;
                case 14: goto L_0x0343;
                case 15: goto L_0x0356;
                case 16: goto L_0x00ae;
                case 17: goto L_0x035c;
                case 18: goto L_0x0374;
                case 19: goto L_0x0397;
                case 20: goto L_0x00c2;
                case 21: goto L_0x039f;
                case 22: goto L_0x03b2;
                case 23: goto L_0x03d5;
                case 24: goto L_0x00cf;
                case 25: goto L_0x014a;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x014e;
                case 29: goto L_0x03de;
                case 30: goto L_0x03e8;
                case 31: goto L_0x03fc;
                case 32: goto L_0x0406;
                case 33: goto L_0x0411;
                case 34: goto L_0x01d7;
                case 35: goto L_0x0429;
                case 36: goto L_0x04b0;
                case 37: goto L_0x0431;
                case 38: goto L_0x043b;
                case 39: goto L_0x043f;
                case 40: goto L_0x0447;
                case 41: goto L_0x01e5;
                case 42: goto L_0x0453;
                case 43: goto L_0x0458;
                case 44: goto L_0x0464;
                case 45: goto L_0x0482;
                case 46: goto L_0x048e;
                case 47: goto L_0x02cf;
                case 48: goto L_0x04a8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.4ne r0 = (X.C96314ne) r0
            java.lang.Object r0 = r0.A01
        L_0x000b:
            com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel r0 = (com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel) r0
            r0.A0T()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r15.A01
            X.78v r1 = (X.C1422778v) r1
            boolean r0 = X.C1422778v.A01(r1)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r1.A0J
            X.5nN r2 = r3.A09
            X.70A r0 = r2.A05
            r1 = 0
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0U
            if (r0 == 0) goto L_0x0034
            android.view.View r0 = r2.A0H
            r0.performHapticFeedback(r1)
            X.5nN r0 = r3.A09
            android.view.View r0 = r0.A0H
            r0.performLongClick()
        L_0x0034:
            com.whatsapp.calling.callgrid.view.PipViewContainer.A05(r3, r1)
            com.whatsapp.calling.callgrid.view.PipViewContainer.A01(r3)
            return
        L_0x003b:
            java.lang.Object r1 = r15.A01
            X.5wX r1 = (X.C116185wX) r1
            java.util.List r0 = X.C42011xT.A0I
            X.70A r0 = r1.A05
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.A0c
            if (r0 != 0) goto L_0x0010
            r0 = 8
            r1.A0L(r0)
            return
        L_0x004f:
            java.lang.Object r3 = r15.A01
            X.5wX r3 = (X.C116185wX) r3
            X.DRB r2 = r3.A05
            if (r2 == 0) goto L_0x0010
            X.E6Z r0 = r3.A04
            if (r0 == 0) goto L_0x0010
            r1 = 21
            X.DVt r0 = new X.DVt
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.DRB.A02(r2, r0)
            X.DRB r1 = r3.A05
            X.E6Z r0 = r3.A04
            r1.A09(r0)
            return
        L_0x006d:
            java.lang.Object r2 = r15.A01
            X.5wX r2 = (X.C116185wX) r2
            X.DRB r1 = r2.A05
            if (r1 == 0) goto L_0x007c
            X.E6Z r0 = r2.A04
            if (r0 == 0) goto L_0x007c
            r1.A0A(r0)
        L_0x007c:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r2.A04
            if (r4 == 0) goto L_0x0010
            X.70A r0 = r2.A05
            if (r0 == 0) goto L_0x0010
            com.whatsapp.jid.UserJid r3 = r0.A0h
            X.6ih r1 = r4.A0Y
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            java.util.Map r0 = r1.A02
            java.lang.Object r0 = r0.remove(r3)
            X.1OB r0 = (X.AnonymousClass1OB) r0
            X.AnonymousClass3Ma.A1R(r0)
            java.util.Set r0 = r1.A03
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L_0x00a6
            X.1DT r1 = r1.A01
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0F(r0)
        L_0x00a6:
            X.4Sa r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r4)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r0, r4, r2)
            return
        L_0x00ae:
            java.lang.Object r2 = r15.A01
            X.3mi r2 = (X.C76173mi) r2
            r2.A0C()
            X.3nV r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x0010
            X.C76173mi.A01(r2)
            return
        L_0x00c2:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A02
            if (r1 == 0) goto L_0x0010
            r0 = 3
            r1.A0W(r0)
            return
        L_0x00cf:
            java.lang.Object r3 = r15.A01
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r3 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r3
            com.whatsapp.jid.GroupJid r5 = r3.A01
            if (r5 == 0) goto L_0x0010
            X.1M9 r0 = r3.A0F
            X.1E7 r1 = r0.A0H(r5)
            X.1Me r0 = r3.A0G
            java.lang.String r0 = r0.A0I(r1)
            r2 = 0
            X.3nH r8 = new X.3nH
            r8.<init>(r2, r0)
            X.1DT r6 = r3.A0B
            boolean r1 = r3.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            java.util.ArrayList r10 = com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel.A03(r3, r0, r2, r1, r2)
            X.0ve r4 = r3.A0K
            X.1MZ r0 = r3.A0I
            X.1MW r2 = r0.A08
            int r0 = r2.A0A(r5)
            boolean r12 = X.C40811vJ.A0Z(r4, r0)
            X.0vf r1 = X.C18040vf.A01
            r0 = 7875(0x1ec3, float:1.1035E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            r1 = 1
            r13 = r0 ^ 1
            r9 = 0
            r11 = 0
            X.4VB r7 = new X.4VB
            r14 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r6.A0E(r7)
            X.1DT r0 = r3.A0A
            X.AnonymousClass3MY.A1M(r0, r1)
            int r5 = r2.A0A(r5)
            r0 = 5429(0x1535, float:7.608E-42)
            X.0vf r2 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r2, r4, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0010
            r0 = 6083(0x17c3, float:8.524E-42)
            int r0 = X.C18020vd.A00(r2, r4, r0)
            if (r0 <= 0) goto L_0x0010
            r0 = 6119(0x17e7, float:8.575E-42)
            int r0 = X.C18020vd.A00(r2, r4, r0)
            if (r5 < r0) goto L_0x0010
            X.1OX r2 = X.C41561wd.A00(r3)
            X.0wl r1 = r3.A0N
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1 r0 = new com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1
            r0.<init>(r3, r9)
            X.AnonymousClass3MW.A1X(r1, r0, r2)
            return
        L_0x014a:
            java.lang.Object r0 = r15.A01
            goto L_0x000b
        L_0x014e:
            java.lang.Object r5 = r15.A01
            X.1VQ r5 = (X.AnonymousClass1VQ) r5
            X.1TA r0 = r5.A0I
            java.util.ArrayList r6 = r0.A05()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0169
            java.lang.Boolean r0 = X.C17970vW.A03
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r0 == 0) goto L_0x0169
            r6.remove(r0)
        L_0x0169:
            r6.size()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0010
            X.0ve r10 = r5.A0J
            r9 = 522(0x20a, float:7.31E-43)
            X.0vf r2 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r2, r10, r9)
            if (r0 == 0) goto L_0x0010
            long r3 = java.lang.System.currentTimeMillis()
            X.1VE r8 = r5.A08
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r8)
            java.lang.String r7 = "zombie_cleanup"
            long r0 = X.C17890vO.A05(r0, r7)
            long r3 = r3 - r0
            long r3 = X.C17880vN.A04(r3)
            r0 = 60
            long r3 = r3 / r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallsManagerImpl/shouldCleanupZombieCalls Interval = "
            r1.append(r0)
            int r0 = X.C18020vd.A00(r2, r10, r9)
            r1.append(r0)
            java.lang.String r0 = " diff = "
            X.C17900vP.A0m(r0, r1, r3)
            int r0 = X.C18020vd.A00(r2, r10, r9)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            java.lang.String r0 = "CallsManagerImpl/onOfflineResumeCompleted Cleaning up zombie calls"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass3MZ.A08(r8)
            X.C17880vN.A1D(r0, r7, r1)
            r1 = 0
            r0 = 0
            android.os.Message r3 = android.os.Message.obtain(r1, r0, r6)
            X.1V7 r2 = r5.A0A
            java.lang.String r1 = "check_ongoing_calls"
            X.A69 r0 = new X.A69
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            return
        L_0x01d7:
            java.lang.Object r0 = r15.A01
            X.A99 r0 = (X.A99) r0
            boolean r0 = X.A99.A0L(r0)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.voipcalling.Voip.cleanupUnfinishedCallStats()
            return
        L_0x01e5:
            java.lang.Object r0 = r15.A01
            X.A99 r0 = (X.A99) r0
            X.71B r2 = r0.A2O
            java.util.HashSet r1 = X.C17880vN.A12()
            X.0ve r8 = r2.A00
            r0 = 4514(0x11a2, float:6.325E-42)
            X.0vf r7 = X.C18040vf.A02
            java.lang.String r0 = X.C18020vd.A01(r7, r8, r0)
            X.AnonymousClass71B.A00(r0, r1)
            r0 = 6230(0x1856, float:8.73E-42)
            java.lang.String r0 = X.C18020vd.A01(r7, r8, r0)
            X.AnonymousClass71B.A00(r0, r1)
            int r4 = r1.size()
            int[] r3 = new int[r4]
            java.util.Iterator r6 = r1.iterator()
            r5 = 0
        L_0x0210:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r5 + 1
            int r0 = r0.intValue()
            r3[r5] = r0
            r5 = r1
            goto L_0x0210
        L_0x0226:
            r0 = 12439(0x3097, float:1.7431E-41)
            boolean r10 = X.C18020vd.A05(r7, r8, r0)
            r1 = 0
        L_0x022d:
            if (r1 >= r4) goto L_0x024a
            X.6tQ r6 = r2.A01
            r9 = r3[r1]
            r0 = 2
            X.7SB r7 = X.AnonymousClass7SB.A00(r2, r0)
            r0 = 3
            X.7SB r8 = X.AnonymousClass7SB.A00(r2, r0)
            X.10I r0 = r6.A03
            X.3Cn r5 = new X.3Cn
            r5.<init>(r6, r7, r8, r9, r10)
            r0.CGF(r5)
            int r1 = r1 + 1
            goto L_0x022d
        L_0x024a:
            X.6tQ r0 = r2.A01
            java.lang.String r7 = "wa_bwe_pl_classifier_mobile"
            X.6y8 r6 = r0.A01
            X.118 r0 = r6.A01
            android.content.Context r0 = r0.A00
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getCanonicalPath()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "/ML_MODEL"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r7)
            java.lang.String r2 = java.util.Arrays.toString(r3)
            X.C18070vi.A0X(r2)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModels/Delete model files for "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", but keep versions "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " #"
            X.C17890vO.A1A(r1, r0)
            java.util.ArrayList r2 = X.C17880vN.A0z(r4)
            r1 = 0
        L_0x029c:
            if (r1 >= r4) goto L_0x02aa
            r0 = r3[r1]
            java.io.File r0 = r6.A01(r7, r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x029c
        L_0x02aa:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.DXj r1 = new X.DXj
            r1.<init>(r5, r0)
            X.82S r0 = new X.82S
            r0.<init>(r5, r2)
            X.7Sa r0 = X.AnonymousClass1b2.A09(r0, r1)
            X.7Rp r1 = new X.7Rp
            r1.<init>((X.C147157Sa) r0)
        L_0x02bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x02bf
        L_0x02cf:
            java.lang.Object r0 = r15.A01
            X.Ad1 r0 = (X.C21009Ad1) r0
            X.A99 r0 = r0.A00
            X.BCr r0 = r0.A0f
            if (r0 == 0) goto L_0x0010
            r0.finish()
            return
        L_0x02dd:
            java.lang.Object r0 = r15.A01
            X.AfA r0 = (X.C21139AfA) r0
            X.8yP r2 = r0.A00
            r1 = 20
            X.AWq r0 = new X.AWq
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x02ee:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            X.5lE r0 = r0.A06
            r0.notifyDataSetChanged()
            return
        L_0x02f8:
            java.lang.Object r1 = r15.A01
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r0 = 3
            r1.A1T(r0)
            return
        L_0x0301:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.callgrid.view.PipViewContainer r0 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r0
            com.whatsapp.calling.callgrid.view.PipViewContainer.A01(r0)
            return
        L_0x0309:
            java.lang.Object r0 = r15.A01
            X.Cuy r0 = (X.C26216Cuy) r0
            X.C26216Cuy.A02(r0)
            return
        L_0x0311:
            java.lang.Object r1 = r15.A01
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            r0 = 0
            r1.A0E = r0
            X.4Sa r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r1)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0B(r0, r1)
            return
        L_0x0320:
            java.lang.Object r2 = r15.A01
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r2 = (com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel) r2
            int r1 = r2.A0T()
            r0 = 0
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.A03(r2, r1, r0)
            return
        L_0x032d:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel) r0
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.A00(r0)
            return
        L_0x0335:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            X.3Or r1 = r0.A0n
            X.2mw r0 = r0.A0J
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x0343:
            java.lang.Object r2 = r15.A01
            com.whatsapp.contact.picker.SelectedContactsList r2 = (com.whatsapp.contact.picker.SelectedContactsList) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A05
            X.3WX r0 = r2.A07
            int r0 = r0.A0Q()
            r1.A0g(r0)
            r2.A02()
            return
        L_0x0356:
            java.lang.Object r0 = r15.A01
            X.C108945cZ.A1Q(r0)
            return
        L_0x035c:
            java.lang.Object r0 = r15.A01
            X.3mi r0 = (X.C76173mi) r0
            r0.A0C()
            X.C76173mi.A01(r0)
            return
        L_0x0367:
            java.lang.Object r0 = r15.A01
            X.77y r0 = (X.C1420477y) r0
            java.lang.Object r1 = r0.A01
            X.5wX r1 = (X.C116185wX) r1
            java.util.List r0 = X.C42011xT.A0I
            android.view.View r2 = r1.A0G
            goto L_0x0392
        L_0x0374:
            java.lang.Object r2 = r15.A01
            X.3mh r2 = (X.C76163mh) r2
            android.graphics.Rect r3 = X.AnonymousClass3MW.A07()
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            com.whatsapp.TextEmojiLabel r0 = r2.A00
            r0.getGlobalVisibleRect(r3)
            com.whatsapp.WaTextView r2 = r2.A01
            r2.getGlobalVisibleRect(r1)
            boolean r1 = r3.intersect(r1)
            r0 = 8
            if (r1 != 0) goto L_0x0393
        L_0x0392:
            r0 = 0
        L_0x0393:
            r2.setVisibility(r0)
            return
        L_0x0397:
            java.lang.Object r0 = r15.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x039f:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.whatsapp.calling.participantlist.view.VoiceChatParticipantListBottomSheetDialog r2 = new com.whatsapp.calling.participantlist.view.VoiceChatParticipantListBottomSheetDialog
            r2.<init>()
            X.1GP r1 = r0.A1E()
            java.lang.String r0 = "VoiceChatParticipantListBottomSheetDialog"
            r2.A2C(r1, r0)
            return
        L_0x03b2:
            java.lang.Object r1 = r15.A01
            X.5g1 r1 = (X.C110505g1) r1
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = r1.A02
            if (r0 != 0) goto L_0x03c1
            java.lang.String r0 = "audioChatViewModel"
        L_0x03bc:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x03c1:
            X.1DT r3 = r0.A0F
            X.1F9 r2 = r1.A00
            if (r2 != 0) goto L_0x03ca
            java.lang.String r0 = "lifeCycleOwner"
            goto L_0x03bc
        L_0x03ca:
            r0 = 6
            X.7gh r1 = X.C108945cZ.A1K(r1, r0)
            r0 = 20
            X.AnonymousClass7AT.A01(r2, r3, r1, r0)
            return
        L_0x03d5:
            java.lang.Object r1 = r15.A01
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x03de:
            java.lang.Object r0 = r15.A01
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r0.cancel()
            java.lang.String r0 = "voip/vibrate/stop complete"
            goto L_0x0421
        L_0x03e8:
            java.lang.Object r0 = r15.A01
            X.A7v r0 = (X.A7v) r0
            android.media.Ringtone r1 = r0.A01
            if (r1 == 0) goto L_0x03f9
            boolean r0 = r1.isPlaying()
            if (r0 != 0) goto L_0x03f9
            r1.play()
        L_0x03f9:
            java.lang.String r0 = "voip/ringtone/play complete"
            goto L_0x0421
        L_0x03fc:
            java.lang.Object r0 = r15.A01
            android.media.Ringtone r0 = (android.media.Ringtone) r0
            r0.stop()
            java.lang.String r0 = "voip/ringtone/stop complete"
            goto L_0x0421
        L_0x0406:
            java.lang.Object r1 = r15.A01
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r0 = 1
            r1.setMode(r0)
            java.lang.String r0 = "voip/ringtone/setmode complete"
            goto L_0x0421
        L_0x0411:
            java.lang.Object r0 = r15.A01
            X.A99 r0 = (X.A99) r0
            X.1HQ r0 = r0.A29
            X.1HR r0 = (X.AnonymousClass1HR) r0
            boolean r0 = X.AnonymousClass1HR.A00(r0)
            if (r0 == 0) goto L_0x0425
            java.lang.String r0 = "VoipNative/startVideoCaptureStream skipping as call ended or ending"
        L_0x0421:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0425:
            com.whatsapp.voipcalling.Voip.startVideoCaptureStream()
            return
        L_0x0429:
            java.lang.Object r0 = r15.A01
            android.media.SoundPool r0 = (android.media.SoundPool) r0
            r0.release()
            return
        L_0x0431:
            java.lang.Object r1 = r15.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.util.concurrent.atomic.AtomicInteger r0 = X.A99.A4B
            com.whatsapp.voipcalling.Voip.cancelInviteToGroupCall(r1)
            return
        L_0x043b:
            com.whatsapp.voipcalling.Voip.joinCallLink()
            return
        L_0x043f:
            java.lang.Object r1 = r15.A01
            X.4R3 r1 = (X.AnonymousClass4R3) r1
            java.util.concurrent.atomic.AtomicInteger r0 = X.A99.A4B
            r0 = 0
            goto L_0x048a
        L_0x0447:
            java.lang.Object r2 = r15.A01
            X.A99 r2 = (X.A99) r2
            com.whatsapp.voipcalling.Voip.requestVideoUpgrade()
            r0 = 1
            com.whatsapp.voipcalling.Voip.toggleToHammerheadDev(r0)
            goto L_0x0499
        L_0x0453:
            java.lang.Object r2 = r15.A01
            X.A99 r2 = (X.A99) r2
            goto L_0x0499
        L_0x0458:
            java.lang.Object r2 = r15.A01
            X.A99 r2 = (X.A99) r2
            r0 = 0
            com.whatsapp.voipcalling.Voip.toggleToHammerheadDev(r0)
            com.whatsapp.voipcalling.Voip.turnCameraOff()
            goto L_0x0499
        L_0x0464:
            java.lang.Object r1 = r15.A01
            X.A99 r1 = (X.A99) r1
            X.00H r0 = r1.A3Z
            java.lang.Object r4 = r0.get()
            X.9xI r4 = (X.C197809xI) r4
            X.9X9 r3 = r1.A0Y
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.10I r2 = r4.A01
            r1 = 4
            X.7RL r0 = new X.7RL
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x0482:
            java.lang.Object r0 = r15.A01
            X.A99 r0 = (X.A99) r0
            X.4R3 r1 = r0.A0k
            X.5Yv r0 = r0.A0j
        L_0x048a:
            r1.A00(r0)
            return
        L_0x048e:
            java.lang.Object r2 = r15.A01
            X.A99 r2 = (X.A99) r2
            r0 = 1
            com.whatsapp.voipcalling.Voip.toggleToHammerheadDev(r0)
            com.whatsapp.voipcalling.Voip.turnCameraOn()
        L_0x0499:
            java.util.concurrent.atomic.AtomicInteger r0 = X.A99.A4B
            android.os.Handler r0 = r2.A0H
            r1 = 60
            r0.removeMessages(r1)
            android.os.Handler r0 = r2.A0H
            r0.sendEmptyMessage(r1)
            return
        L_0x04a8:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r0 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r0
            r0.m40lambda$linkCreateNacked$1$comwhatsappcallingserviceVoiceServiceEventCallback()
            return
        L_0x04b0:
            java.lang.Object r0 = r15.A01
            X.A99 r0 = (X.A99) r0
            X.0zA r0 = r0.A1t
            r0.A03()
            java.lang.String r0 = "handleCommand"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146427Pb.run():void");
    }
}

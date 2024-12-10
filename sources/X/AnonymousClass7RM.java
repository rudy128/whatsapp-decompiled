package X;

/* renamed from: X.7RM  reason: invalid class name */
public class AnonymousClass7RM implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass7RM(AnonymousClass73O r2, int i, int i2) {
        this.A00 = i2;
        if (31 - i2 != 0) {
            this.A02 = r2;
            this.A01 = i;
            return;
        }
        this.A02 = r2;
        this.A01 = 401;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.6yb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.1Wi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.6yb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.6yb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.6yb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: X.6yb} */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c7, code lost:
        r0.BnR(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x051a, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x051b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0110;
                case 5: goto L_0x0166;
                case 6: goto L_0x0189;
                case 7: goto L_0x000d;
                case 8: goto L_0x01a5;
                case 9: goto L_0x01d7;
                case 10: goto L_0x0020;
                case 11: goto L_0x01eb;
                case 12: goto L_0x01f5;
                case 13: goto L_0x005b;
                case 14: goto L_0x022f;
                case 15: goto L_0x0239;
                case 16: goto L_0x02b3;
                case 17: goto L_0x02c6;
                case 18: goto L_0x02d3;
                case 19: goto L_0x02df;
                case 20: goto L_0x02ef;
                case 21: goto L_0x0302;
                case 22: goto L_0x0329;
                case 23: goto L_0x0335;
                case 24: goto L_0x0366;
                case 25: goto L_0x0366;
                case 26: goto L_0x0366;
                case 27: goto L_0x006d;
                case 28: goto L_0x0370;
                case 29: goto L_0x00a3;
                case 30: goto L_0x00ba;
                case 31: goto L_0x037f;
                case 32: goto L_0x03a6;
                case 33: goto L_0x03b2;
                case 34: goto L_0x03bb;
                case 35: goto L_0x03cb;
                case 36: goto L_0x00cf;
                case 37: goto L_0x03d5;
                case 38: goto L_0x03e8;
                case 39: goto L_0x0405;
                case 40: goto L_0x044d;
                case 41: goto L_0x0462;
                case 42: goto L_0x0473;
                case 43: goto L_0x047d;
                case 44: goto L_0x04a1;
                case 45: goto L_0x04d3;
                case 46: goto L_0x04d3;
                case 47: goto L_0x051f;
                case 48: goto L_0x0546;
                case 49: goto L_0x00e2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A02
            X.871 r0 = (X.AnonymousClass871) r0
            r0.BtF()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r2 = r14.A02
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r2
            int r1 = r14.A01
            X.8Ah r0 = r2.A0G
            if (r0 == 0) goto L_0x000c
            X.8B2 r0 = r0.CCk(r1)
            if (r0 == 0) goto L_0x000c
            monitor-enter(r2)
            goto L_0x0564
        L_0x0020:
            java.lang.Object r8 = r14.A02
            X.4VI r8 = (X.AnonymousClass4VI) r8
            int r1 = r14.A01
            r0 = 400(0x190, float:5.6E-43)
            r7 = 0
            if (r1 == r0) goto L_0x0576
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0576
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0576
            r0 = 406(0x196, float:5.69E-43)
            if (r1 != r0) goto L_0x000c
            X.18O r1 = r8.A04
            X.18Q r0 = X.AnonymousClass18O.A1O
            int r6 = r1.A04(r0)
            X.1KB r5 = r8.A03
            X.0vb r4 = r8.A05
            r3 = 2131755175(0x7f1000a7, float:1.9141222E38)
            long r1 = (long) r6
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            X.C17880vN.A1T(r0, r6, r7)
            java.lang.String r0 = r4.A0K(r0, r3, r1)
            r5.A0G(r0, r7)
            X.1Mn r0 = r8.A08
            r0.A04(r7)
            return
        L_0x005b:
            java.lang.Object r0 = r14.A02
            X.7I8 r0 = (X.AnonymousClass7I8) r0
            int r2 = r14.A01
            X.897 r1 = r0.A00
            if (r1 == 0) goto L_0x000c
            X.6ti r0 = r0.A02
            com.whatsapp.jid.UserJid r0 = r0.A03
            r1.Bto(r0, r2)
            return
        L_0x006d:
            java.lang.Object r5 = r14.A02
            X.1ie r5 = (X.C33331ie) r5
            int r4 = r14.A01
            X.1QO r1 = r5.A01
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x000c
            X.118 r0 = r5.A00
            android.content.Context r1 = r0.A00
            r0 = 2131893030(0x7f121b26, float:1.9420825E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 37
            r2 = 0
            if (r4 != r0) goto L_0x0099
            r0 = 2131893038(0x7f121b2e, float:1.9420841E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "DOC_VERIF_SUCCESS"
        L_0x0095:
            X.C33331ie.A02(r5, r3, r1, r0, r2)
            return
        L_0x0099:
            r0 = 2131893037(0x7f121b2d, float:1.942084E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "DOC_VERIF_FAILURE"
            goto L_0x0095
        L_0x00a3:
            java.lang.Object r0 = r14.A02
            X.73N r0 = (X.AnonymousClass73N) r0
            int r2 = r14.A01
            r1 = 0
            java.lang.ref.WeakReference r0 = r0.A06
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.get()
            X.8AE r0 = (X.AnonymousClass8AE) r0
            if (r0 == 0) goto L_0x000c
            r0.Bqe(r2, r1)
            return
        L_0x00ba:
            int r2 = r14.A01
            java.lang.Object r1 = r14.A02
            X.73N r1 = (X.AnonymousClass73N) r1
            X.6Kw r0 = r1.A02
            if (r0 == 0) goto L_0x00c7
            r0.A0A(r2)
        L_0x00c7:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x000c
            r0 = -1
            r1.A01 = r0
            return
        L_0x00cf:
            java.lang.Object r0 = r14.A02
            X.6cV r0 = (X.C126296cV) r0
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.1nU r0 = r2.A05
            int r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x000c
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r2)
            return
        L_0x00e2:
            java.lang.Object r0 = r14.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            int r2 = r14.A01
            X.1FL r1 = r0.A1B()
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x000c
            X.1FU r1 = (X.AnonymousClass1FU) r1
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x000c
            r1.BhQ(r2)
            return
        L_0x0104:
            java.lang.Object r0 = r14.A02
            X.4pj r0 = (X.C97594pj) r0
            int r1 = r14.A01
            X.3Lq r0 = r0.A07
            r0.onError(r1)
            return
        L_0x0110:
            int r9 = r14.A01
            java.lang.Object r5 = r14.A02
            com.whatsapp.dmsetting.ChangeDMSettingActivity r5 = (com.whatsapp.dmsetting.ChangeDMSettingActivity) r5
            r8 = 1
            r0 = -1
            if (r9 != r0) goto L_0x0122
            X.1PS r0 = r5.A07
            if (r0 == 0) goto L_0x015c
            int r9 = r0.A00()
        L_0x0122:
            X.00H r0 = r5.A0B
            if (r0 == 0) goto L_0x015f
            java.lang.Object r6 = r0.get()
            X.4S2 r6 = (X.AnonymousClass4S2) r6
            int r11 = r5.A00
            int r12 = com.whatsapp.dmsetting.ChangeDMSettingActivity.A03(r5)
            r7 = 0
            r10 = 0
            r6.A01(r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r1 = X.C72483Me.A0B(r5, r0, r8)
            X.C108995ce.A0n(r1, r4, r3)
            java.lang.String r0 = "multi_select_ddm"
            r1.putExtra(r0, r4)
            if (r2 == 0) goto L_0x0158
            java.lang.String r0 = "dm_duration"
            r1.putExtra(r0, r2)
        L_0x0158:
            r5.startActivityForResult(r1, r8)
            return
        L_0x015c:
            java.lang.String r0 = "disappearingModeSettingsManager"
            goto L_0x0161
        L_0x015f:
            java.lang.String r0 = "ephemeralSettingLogger"
        L_0x0161:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0166:
            java.lang.Object r5 = r14.A02
            X.31p r5 = (X.C679831p) r5
            int r4 = r14.A01
            X.00H r0 = r5.A09
            java.lang.Object r1 = r0.get()
            X.88z r1 = (X.C1605688z) r1
            X.Cn3 r0 = r5.A03
            r3 = 0
            r2 = 1
            r1.CHK(r0, r4, r3, r2)
            X.00H r0 = r5.A09
            java.lang.Object r1 = r0.get()
            X.88z r1 = (X.C1605688z) r1
            X.Cn3 r0 = r5.A02
            r1.CHK(r0, r4, r3, r2)
            return
        L_0x0189:
            java.lang.Object r2 = r14.A02
            X.18M r2 = (X.AnonymousClass18M) r2
            int r1 = r14.A01
            java.util.concurrent.CountDownLatch r0 = X.AnonymousClass18M.A0E
            X.00H r0 = r2.A0A
            java.lang.Object r0 = r0.get()
            com.whatsapp.wamsys.JniBridge r0 = (com.whatsapp.wamsys.JniBridge) r0
            long r2 = (long) r1
            java.util.concurrent.atomic.AtomicReference r0 = r0.wajContext
            java.lang.Object r1 = r0.get()
            r0 = 5
            com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r0, r2, r1)
            return
        L_0x01a5:
            java.lang.Object r5 = r14.A02
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            int r2 = r14.A01
            X.1EC r0 = r5.A1L
            if (r0 != 0) goto L_0x01bf
            X.00H r0 = r5.A1p
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r5.A4l()
            X.1EC r0 = r1.A05(r0)
            r5.A1L = r0
        L_0x01bf:
            X.1KB r1 = r5.A05
            X.1Fx r4 = X.C23401Fx.RESUMED
            r0 = 9
            X.7RM r3 = new X.7RM
            r3.<init>((java.lang.Object) r5, (int) r2, (int) r0)
            android.os.Handler r2 = r1.A02
            r1 = 43
            X.DTg r0 = new X.DTg
            r0.<init>(r3, r5, r4, r1)
            r2.post(r0)
            return
        L_0x01d7:
            java.lang.Object r0 = r14.A02
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            int r5 = r14.A01
            com.whatsapp.group.view.custom.GroupDetailsCard r1 = r0.A1E
            boolean r6 = r0.A2B
            X.1E7 r2 = r0.A0u
            X.4fi r3 = r0.A13
            X.1EC r4 = r0.A1L
            r1.A05(r2, r3, r4, r5, r6)
            return
        L_0x01eb:
            java.lang.Object r1 = r14.A02
            X.A4i r1 = (X.C20039A4i) r1
            int r0 = r14.A01
            X.C20039A4i.A00(r1, r0)
            return
        L_0x01f5:
            java.lang.Object r5 = r14.A02
            X.1FU r5 = (X.AnonymousClass1FU) r5
            int r4 = r14.A01
            r5.CEx()
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            r1 = 2131891406(0x7f1214ce, float:1.9417531E38)
            r0 = 0
            r3.A0g(r5, r0, r1)
            r1 = 29
            X.7AO r0 = new X.7AO
            r0.<init>(r5, r1)
            r3.A0d(r5, r0)
            r2 = 2131891408(0x7f1214d0, float:1.9417535E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 0
            X.C17880vN.A1T(r1, r4, r0)
            java.lang.String r0 = r5.getString(r2, r1)
            r3.A0k(r0)
            r0 = 2131891407(0x7f1214cf, float:1.9417533E38)
            r3.A0D(r0)
            r3.A0C()
            return
        L_0x022f:
            java.lang.Object r1 = r14.A02
            X.1Sa r1 = (X.C26411Sa) r1
            int r0 = r14.A01
            X.C26411Sa.A01(r1, r0)
            return
        L_0x0239:
            java.lang.Object r8 = r14.A02
            X.5nO r8 = (X.C113625nO) r8
            int r9 = r14.A01
            X.5kz r4 = r8.A05
            X.740 r1 = r4.A09
            int r0 = r1.A01
            androidx.recyclerview.widget.RecyclerView r7 = r1.A0S
            X.1xT r10 = r7.A0O(r0)
            X.5nO r10 = (X.C113625nO) r10
            r1 = 100
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            if (r10 == 0) goto L_0x02af
            com.whatsapp.components.SelectionCheckView r3 = r10.A04
            r0 = 0
            r3.A04(r0, r5)
            android.view.View r0 = r10.A00
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r6)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r6)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
        L_0x026f:
            X.0vl r0 = X.C137726vv.A00
            int r3 = X.C72463Mc.A0D(r0)
            if (r9 <= 0) goto L_0x02a5
            int r0 = r3 / 2
            if (r9 >= r0) goto L_0x02a5
            int r9 = r9 + -1
        L_0x027d:
            r7.A0g(r9)
            com.whatsapp.components.SelectionCheckView r0 = r8.A04
            r0.setScaleX(r6)
            r0.setScaleY(r6)
            r0.A04(r5, r5)
            android.view.View r0 = r8.A00
            android.view.ViewPropertyAnimator r3 = r0.animate()
            float r0 = r4.A05
            android.view.ViewPropertyAnimator r3 = r3.scaleX(r0)
            float r0 = r4.A04
            android.view.ViewPropertyAnimator r0 = r3.scaleY(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r0.start()
            return
        L_0x02a5:
            int r0 = r3 / 2
            if (r9 <= r0) goto L_0x027d
            int r3 = r3 - r5
            if (r9 >= r3) goto L_0x027d
            int r9 = r9 + 1
            goto L_0x027d
        L_0x02af:
            r4.A0G(r0)
            goto L_0x026f
        L_0x02b3:
            java.lang.Object r0 = r14.A02
            X.5nO r0 = (X.C113625nO) r0
            int r4 = r14.A01
            X.5kz r3 = r0.A05
            boolean[] r2 = r3.A02
            int r1 = r4 + -1
            r0 = 0
            r2[r1] = r0
            r3.A0G(r4)
            return
        L_0x02c6:
            java.lang.Object r0 = r14.A02
            X.6Md r0 = (X.C121956Md) r0
            int r2 = r14.A01
            r1 = 0
            X.1KB r0 = r0.A02
            r0.A06(r2, r1)
            return
        L_0x02d3:
            java.lang.Object r0 = r14.A02
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r0 = (com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel) r0
            int r1 = r14.A01
            X.1DT r0 = r0.A00
            X.AnonymousClass3MX.A1J(r0, r1)
            return
        L_0x02df:
            java.lang.Object r3 = r14.A02
            X.10T r3 = (X.AnonymousClass10T) r3
            int r2 = r14.A01
            r1 = 2
            X.7KO r0 = new X.7KO
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x02ef:
            java.lang.Object r0 = r14.A02
            X.2si r0 = (X.C63222si) r0
            int r2 = r14.A01
            X.00H r0 = r0.A0P
            java.lang.Object r1 = r0.get()
            X.1Do r1 = (X.C22881Do) r1
            r0 = 1
            r1.A00(r0, r2)
            return
        L_0x0302:
            int r3 = r14.A01
            java.lang.Object r2 = r14.A02
            X.1fO r2 = (X.C31331fO) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PassiveModeManager/onConnectedPassiveMode passive-mode timeout ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " seconds), sending active-iq"
            X.C17890vO.A1A(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A03
            r0 = 0
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r2.A00
            r0 = 0
            r1.set(r0)
            X.C31331fO.A00(r2)
            return
        L_0x0329:
            java.lang.Object r0 = r14.A02
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            int r1 = r14.A01
            X.A7w r0 = r0.A02
            r0.A0F(r1)
            return
        L_0x0335:
            java.lang.Object r4 = r14.A02
            X.A7P r4 = (X.A7P) r4
            int r2 = r14.A01
            X.8sG r3 = X.A7P.A00(r4, r2)
            java.lang.Integer r0 = r4.A00
            if (r0 == 0) goto L_0x034d
            int r1 = r0.intValue()
            if (r1 != 0) goto L_0x0351
            r0 = 13
            if (r2 != r0) goto L_0x0358
        L_0x034d:
            X.A7P.A01(r3, r4)
            return
        L_0x0351:
            r0 = 1
            if (r1 != r0) goto L_0x034d
            r0 = 15
            if (r2 == r0) goto L_0x034d
        L_0x0358:
            monitor-enter(r4)
            X.1Ez r2 = r4.A0A     // Catch:{ all -> 0x0543 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0543 }
            r2.A00 = r0     // Catch:{ all -> 0x0543 }
            r2.A04()     // Catch:{ all -> 0x0543 }
            monitor-exit(r4)
            goto L_0x034d
        L_0x0366:
            java.lang.Object r1 = r14.A02
            X.1rD r1 = (X.C38391rD) r1
            int r0 = r14.A01
            r1.A0G(r0)
            return
        L_0x0370:
            java.lang.Object r4 = r14.A02
            X.1iv r4 = (X.C33501iv) r4
            r3 = 1
            r2 = 20240306(0x134d7b2, float:3.3215532E-38)
            r1 = 162(0xa2, float:2.27E-43)
            r0 = 0
            r4.A03(r2, r1, r3, r0)
            return
        L_0x037f:
            java.lang.Object r4 = r14.A02
            X.73O r4 = (X.AnonymousClass73O) r4
            X.1BI r3 = r4.A0F
            r2 = 401(0x191, float:5.62E-43)
            X.1M9 r0 = r4.A07
            X.1E7 r1 = r0.A0H(r3)
            X.1Tv r0 = r4.A0A
            r0.A00(r1)
            X.1Lf r0 = r4.A08
            r0.A00(r3)
            X.1Ui r0 = r4.A0H
            r0.A01(r3, r2)
            X.1KB r2 = r4.A05
            r1 = 2131890332(0x7f12109c, float:1.9415353E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x03a6:
            java.lang.Object r2 = r14.A02
            X.73O r2 = (X.AnonymousClass73O) r2
            int r1 = r14.A01
            X.1BI r0 = r2.A0F
            X.AnonymousClass73O.A00(r0, r2, r1)
            return
        L_0x03b2:
            java.lang.Object r0 = r14.A02
            X.5e5 r0 = (X.C109835e5) r0
            int r1 = r14.A01
            X.8AH r0 = r0.A08
            goto L_0x03c7
        L_0x03bb:
            java.lang.Object r0 = r14.A02
            X.7DT r0 = (X.AnonymousClass7DT) r0
            int r1 = r14.A01
            java.lang.Object r0 = r0.A01
            X.5g2 r0 = (X.C110515g2) r0
            X.8AH r0 = r0.A06
        L_0x03c7:
            r0.BnR(r1)
            return
        L_0x03cb:
            java.lang.Object r1 = r14.A02
            X.89K r1 = (X.AnonymousClass89K) r1
            int r0 = r14.A01
            r1.onError(r0)
            return
        L_0x03d5:
            java.lang.Object r0 = r14.A02
            X.6cU r0 = (X.C126286cU) r0
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.1DT r1 = r2.A01
            r0 = 2
            X.AnonymousClass3MX.A1J(r1, r0)
            X.1DT r1 = r2.A02
            r0 = 0
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x03e8:
            java.lang.Object r4 = r14.A02
            com.whatsapp.report.activity.banreport.BanReportViewModel r4 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r4
            int r3 = r14.A01
            r0 = 5
            if (r3 <= r0) goto L_0x03f8
            X.1DT r1 = r4.A02
            r0 = 1
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x03f8:
            X.10I r2 = r4.A08
            r1 = 39
            X.7RM r0 = new X.7RM
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.CGF(r0)
            return
        L_0x0405:
            java.lang.Object r2 = r14.A02
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r2
            int r1 = r14.A01
            X.6bE r0 = r2.A05
            java.lang.String r9 = r2.A00
            X.1pS r0 = r0.A00
            X.10E r3 = r0.A00
            X.181 r4 = X.C108965cb.A0H(r3)
            X.0z4 r5 = X.AnonymousClass3Ma.A0c(r3)
            X.00H r8 = X.C108945cZ.A14(r3)
            X.00S r0 = r3.ABB
            java.lang.Object r7 = r0.get()
            X.11W r7 = (X.AnonymousClass11W) r7
            X.0ve r6 = X.AnonymousClass10E.A8r(r3)
            X.C18070vi.A0w(r4, r5, r8, r7, r6)
            r0 = 37
            X.7Rx r10 = X.C147127Rx.A00(r0)
            r0 = 38
            X.7Rx r11 = X.C147127Rx.A00(r0)
            r12 = 4258516730836909(0xf21193102f7ad, double:2.1039868189466913E-308)
            X.6Ez r3 = new X.6Ez
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.7Hy r0 = new X.7Hy
            r0.<init>(r2, r1)
            r3.CBv(r0)
            return
        L_0x044d:
            java.lang.Object r2 = r14.A02
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            int r1 = r14.A01
            X.1bI r0 = r2.A0d
            r0.A04(r1)
            com.whatsapp.search.views.TokenizedSearchInput.A0D(r2)
            com.whatsapp.search.views.TokenizedSearchInput.A0F(r2)
            com.whatsapp.search.views.TokenizedSearchInput.A0E(r2)
            return
        L_0x0462:
            java.lang.Object r2 = r14.A02
            com.whatsapp.settings.SettingsContactsActivity r2 = (com.whatsapp.settings.SettingsContactsActivity) r2
            int r1 = r14.A01
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            com.whatsapp.settings.SettingsContactsActivity.A0c(r2, r0)
            com.whatsapp.settings.SettingsContactsActivity.A0V(r2, r1)
            return
        L_0x0473:
            java.lang.Object r1 = r14.A02
            com.whatsapp.text.AutoSizeTextView r1 = (com.whatsapp.text.AutoSizeTextView) r1
            int r0 = r14.A01
            r1.A0N(r0)
            return
        L_0x047d:
            java.lang.Object r1 = r14.A02
            X.48A r1 = (X.AnonymousClass48A) r1
            int r8 = r14.A01
            android.widget.TextView r0 = r1.A04
            android.content.Context r7 = r0.getContext()
            X.11C r6 = r1.A05
            X.0vb r5 = r1.A06
            r4 = 2131755454(0x7f1001be, float:1.9141788E38)
            long r2 = (long) r8
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 0
            X.C17880vN.A1T(r1, r8, r0)
            java.lang.String r0 = r5.A0K(r1, r4, r2)
            X.AnonymousClass1Y5.A00(r7, r6, r0)
            return
        L_0x04a1:
            java.lang.Object r7 = r14.A02
            X.1Wi r7 = (X.C27501Wi) r7
            int r8 = r14.A01
            monitor-enter(r7)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04d0 }
            long r5 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x04d0 }
            long r3 = r7.A01     // Catch:{ all -> 0x04d0 }
            long r1 = r5 - r3
            boolean r0 = r7.A04     // Catch:{ all -> 0x04d0 }
            if (r0 != 0) goto L_0x04bd
            X.C27501Wi.A01(r7, r5)     // Catch:{ all -> 0x04d0 }
            r1 = 0
        L_0x04bd:
            if (r8 != 0) goto L_0x04c4
            int r0 = (int) r1     // Catch:{ all -> 0x04d0 }
            r7.A00 = r0     // Catch:{ all -> 0x04d0 }
            r0 = 1
            goto L_0x04cd
        L_0x04c4:
            boolean r0 = r7.A03     // Catch:{ all -> 0x04d0 }
            if (r0 == 0) goto L_0x051a
            int r0 = (int) r1     // Catch:{ all -> 0x04d0 }
            X.C27501Wi.A00(r7, r0)     // Catch:{ all -> 0x04d0 }
            r0 = 0
        L_0x04cd:
            r7.A03 = r0     // Catch:{ all -> 0x04d0 }
            goto L_0x051a
        L_0x04d0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x04d3:
            java.lang.Object r7 = r14.A02
            X.6yb r7 = (X.C139296yb) r7
            int r6 = r14.A01
            monitor-enter(r7)
            java.util.HashMap r1 = r7.A00     // Catch:{ all -> 0x051c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x051c }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ all -> 0x051c }
            X.6UM r5 = (X.AnonymousClass6UM) r5     // Catch:{ all -> 0x051c }
            if (r5 == 0) goto L_0x051a
            X.C139296yb.A00(r5, r7)     // Catch:{ all -> 0x051c }
            X.11P r4 = r7.A01     // Catch:{ all -> 0x051c }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x051c }
            r5.A00 = r0     // Catch:{ all -> 0x051c }
            X.63a r3 = r5.A01     // Catch:{ all -> 0x051c }
            X.1Wh r2 = r7.A03     // Catch:{ all -> 0x051c }
            long r0 = X.AnonymousClass11P.A01(r4)     // Catch:{ all -> 0x051c }
            long r0 = r2.A01(r0)     // Catch:{ all -> 0x051c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x051c }
            r3.A01 = r0     // Catch:{ all -> 0x051c }
            X.10I r4 = r7.A05     // Catch:{ all -> 0x051c }
            X.0vl r0 = r7.A06     // Catch:{ all -> 0x051c }
            long r2 = X.C72453Mb.A0K(r0)     // Catch:{ all -> 0x051c }
            r1 = 46
            X.7RM r0 = new X.7RM     // Catch:{ all -> 0x051c }
            r0.<init>((java.lang.Object) r7, (int) r6, (int) r1)     // Catch:{ all -> 0x051c }
            X.25d r0 = r4.CGv(r0, r2)     // Catch:{ all -> 0x051c }
            r5.A02 = r0     // Catch:{ all -> 0x051c }
        L_0x051a:
            monitor-exit(r7)
            return
        L_0x051c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x051f:
            java.lang.Object r4 = r14.A02
            X.6yb r4 = (X.C139296yb) r4
            int r0 = r14.A01
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x0543 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0543 }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x0543 }
            X.6UM r0 = (X.AnonymousClass6UM) r0     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x0541
            X.C139296yb.A00(r0, r4)     // Catch:{ all -> 0x0543 }
            X.10I r1 = r4.A05     // Catch:{ all -> 0x0543 }
            java.lang.Runnable r0 = r0.A02     // Catch:{ all -> 0x0543 }
            r1.CEz(r0)     // Catch:{ all -> 0x0543 }
            r3.remove(r2)     // Catch:{ all -> 0x0543 }
        L_0x0541:
            monitor-exit(r4)
            return
        L_0x0543:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0546:
            java.lang.Object r2 = r14.A02
            X.1FU r2 = (X.AnonymousClass1FU) r2
            int r1 = r14.A01
            r2.CEx()
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x055d
            r1 = 2131897164(0x7f122b4c, float:1.942921E38)
            r0 = 2131897163(0x7f122b4b, float:1.9429208E38)
            X.C108965cb.A18(r2, r1, r0)
            return
        L_0x055d:
            r0 = 2131897192(0x7f122b68, float:1.9429267E38)
            r2.BhQ(r0)
            return
        L_0x0564:
            X.1KB r1 = r2.A26()     // Catch:{ all -> 0x0573 }
            r0 = 38
            X.7Ql r0 = X.C146747Ql.A00(r2, r0)     // Catch:{ all -> 0x0573 }
            r1.A0J(r0)     // Catch:{ all -> 0x0573 }
            monitor-exit(r2)
            return
        L_0x0573:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0576:
            X.1KB r1 = r8.A03
            r0 = 2131890990(0x7f12132e, float:1.9416687E38)
            r1.A08(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RM.run():void");
    }

    public AnonymousClass7RM(C121956Md r2, int i) {
        this.A00 = 17;
        this.A02 = r2;
        this.A01 = i;
    }

    public AnonymousClass7RM(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public AnonymousClass7RM(C33501iv r2) {
        this.A00 = 28;
        this.A02 = r2;
        this.A01 = 20240306;
    }
}

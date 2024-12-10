package X;

import android.os.Handler;
import com.whatsapp.status.StatusesFragment;

/* renamed from: X.7RH  reason: invalid class name */
public class AnonymousClass7RH implements Runnable {
    public final int A00;
    public final Object A01;

    public AnonymousClass7RH(StatusesFragment statusesFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.A01 = statusesFragment;
                return;
            default:
                this.A01 = statusesFragment;
                return;
        }
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new AnonymousClass7RH(obj, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new AnonymousClass7RH(obj, i));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f6, code lost:
        if (r0 != null) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03bc, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03c0, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0425, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0M.A01, 10970) != false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x042d, code lost:
        if (r7 != false) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0470, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0473, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0532, code lost:
        r1.A08(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0535, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        com.whatsapp.status.playback.MessageReplyActivity.A0x(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0170, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x006d;
                case 2: goto L_0x0075;
                case 3: goto L_0x0085;
                case 4: goto L_0x0098;
                case 5: goto L_0x00a5;
                case 6: goto L_0x0005;
                case 7: goto L_0x00c3;
                case 8: goto L_0x00e2;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0113;
                case 12: goto L_0x011d;
                case 13: goto L_0x0125;
                case 14: goto L_0x012e;
                case 15: goto L_0x0138;
                case 16: goto L_0x014e;
                case 17: goto L_0x015f;
                case 18: goto L_0x0169;
                case 19: goto L_0x0171;
                case 20: goto L_0x018d;
                case 21: goto L_0x0197;
                case 22: goto L_0x01a2;
                case 23: goto L_0x01b0;
                case 24: goto L_0x01b8;
                case 25: goto L_0x0211;
                case 26: goto L_0x0219;
                case 27: goto L_0x0236;
                case 28: goto L_0x023e;
                case 29: goto L_0x025a;
                case 30: goto L_0x026c;
                case 31: goto L_0x028b;
                case 32: goto L_0x02a8;
                case 33: goto L_0x0329;
                case 34: goto L_0x0335;
                case 35: goto L_0x0343;
                case 36: goto L_0x035c;
                case 37: goto L_0x0384;
                case 38: goto L_0x0548;
                case 39: goto L_0x00cb;
                case 40: goto L_0x03c1;
                case 41: goto L_0x03e4;
                case 42: goto L_0x0481;
                case 43: goto L_0x048b;
                case 44: goto L_0x04a3;
                case 45: goto L_0x04ab;
                case 46: goto L_0x04c6;
                case 47: goto L_0x04e9;
                case 48: goto L_0x0549;
                case 49: goto L_0x0551;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r9.A01
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r5 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r5
            java.lang.String r8 = "StatusPrivacyActivity/fetchFbUserFullName User error"
            X.1mM r0 = r5.A0B
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r7 = X.AnonymousClass00R.A0J
            X.6qd r1 = r0.A00(r7)
            r4 = 0
            if (r1 == 0) goto L_0x053c
            r6 = 1
            X.00H r0 = r5.A0G     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r3 = r0.get()     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            X.6w9 r3 = (X.C137866w9) r3     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            X.77S r2 = r1.A00     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            java.lang.String r0 = "FbProfileDataFetcher/fetchFbUserFullName called by "
            r1.append(r0)     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            java.lang.String r0 = "STATUS_PRIVACY_ACTIVITY"
            X.C108995ce.A1O(r1, r0)     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            X.7vs r1 = new X.7vs     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            r1.<init>(r2, r3)     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            r0 = 2
            java.lang.Object r4 = X.C20017A3j.A00(r1, r0)     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            goto L_0x053c
        L_0x003f:
            java.lang.String r0 = "fbProfileDataFetcher"
            X.C18070vi.A11(r0)     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
            throw r4     // Catch:{ 6Q5 | 6Q6 | 6Q7 | 6Q8 | 6QB | 6QC -> 0x004a, 6Q9 -> 0x0045, 6Sn -> 0x0536 }
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "StatusPrivacyActivity/fetchFbUserFullName Network error"
            goto L_0x0539
        L_0x004a:
            r0 = move-exception
            X.AnonymousClass6YJ.A00(r8, r0)
            X.1mM r0 = r5.A0B
            if (r0 == 0) goto L_0x0057
            r0.A04(r7, r6)
            goto L_0x053c
        L_0x0057:
            java.lang.String r0 = "fbAccountManager"
            X.C18070vi.A11(r0)
            throw r4
        L_0x005d:
            java.lang.String r0 = "fbAccountManager"
            goto L_0x03bc
        L_0x0061:
            java.lang.Object r1 = r9.A01
            X.7AE r1 = (X.AnonymousClass7AE) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A00()
            return
        L_0x006d:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A0c = r0
            return
        L_0x0075:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.00H r0 = r0.A0v
            java.lang.Object r0 = r0.get()
            X.72w r0 = (X.C1407572w) r0
            r0.A02()
            return
        L_0x0085:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.6yN r0 = r1.A0k
            java.util.List r0 = r0.A02
            com.whatsapp.status.StatusesFragment.A0A(r1, r0)
            X.6yN r0 = r1.A0k
            java.util.List r0 = r0.A01
            com.whatsapp.status.StatusesFragment.A0A(r1, r0)
            return
        L_0x0098:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.5fE r0 = r1.A0e
            r0.notifyDataSetChanged()
            com.whatsapp.status.StatusesFragment.A09(r1)
            return
        L_0x00a5:
            java.lang.Object r3 = r9.A01
            com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel r3 = (com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel) r3
            X.00H r0 = r3.A04
            java.lang.Object r2 = r0.get()
            X.1o6 r2 = (X.C36561o6) r2
            r1 = 11139(0x2b83, float:1.5609E-41)
            java.lang.String r0 = "whatsapp_status_created"
            X.Ai4 r1 = r2.A01(r0, r1)
            if (r1 == 0) goto L_0x0548
            r3.A00 = r1
            X.1wy r0 = r3.A02
            r0.A0E(r1)
            return
        L_0x00c3:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r0 = 0
            r1.A07 = r0
            return
        L_0x00cb:
            java.lang.Object r1 = r9.A01
            X.72l r1 = (X.C1406672l) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0548
            X.5l5 r0 = r1.A03
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "adapter"
            goto L_0x03bc
        L_0x00db:
            r0.notifyDataSetChanged()
            X.C1406672l.A01(r1)
            return
        L_0x00e2:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r3 = 0
            X.1Le r0 = r1.A06
            if (r0 == 0) goto L_0x010f
            r2 = 0
            r0.A0G(r2, r3)
            X.1xI r0 = r1.A04
            if (r0 == 0) goto L_0x0109
            r0.A02()
            X.1Mm r1 = r1.A03
            if (r1 == 0) goto L_0x0103
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r2, r3)
            r1.A01(r0)
            return
        L_0x0103:
            java.lang.String r0 = "waJobManager"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0109:
            java.lang.String r0 = "syncdUpdateHelper"
            X.C18070vi.A11(r0)
            throw r2
        L_0x010f:
            java.lang.String r0 = "statusStore"
            goto L_0x03bc
        L_0x0113:
            java.lang.Object r0 = r9.A01
            X.7FX r0 = (X.AnonymousClass7FX) r0
            java.util.LinkedHashMap r0 = r0.A03
            r0.clear()
            return
        L_0x011d:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity r1 = (com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0125:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = -1
            r1.setResult(r0)
            goto L_0x016d
        L_0x012e:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.5tO r0 = r0.A0R
            r0.A0K()
            return
        L_0x0138:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            X.73X r1 = r2.A13
            X.1BI r0 = r2.A0h
            X.6gj r1 = r1.A05(r0)
            X.1KB r4 = r2.A05
            r0 = 0
            X.7RQ r3 = new X.7RQ
            r3.<init>(r2, r1, r0)
            goto L_0x0470
        L_0x014e:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.0vb r4 = r0.A00
            X.1KB r1 = r0.A05
            X.1bI r5 = r0.A11
            X.3V4 r2 = r0.A0U
            r3 = 0
            X.AnonymousClass4HU.A00(r0, r1, r2, r3, r4, r5)
            return
        L_0x015f:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.1bI r0 = r0.A0z
            X.C72463Mc.A1G(r0)
            return
        L_0x0169:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
        L_0x016d:
            com.whatsapp.status.playback.MessageReplyActivity.A0x(r1)
            return
        L_0x0171:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.1eX r1 = r0.A0X
            X.1BI r0 = r0.A0h
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r0)
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "status"
            java.lang.String r4 = "whatsapp"
            r1.A05(r2, r3, r4, r5, r7)
            return
        L_0x018d:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            java.util.Set r0 = r0.A13
            r0.clear()
            return
        L_0x0197:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A0z(r0)
            com.whatsapp.status.playback.MyStatusesActivity.A12(r0)
            return
        L_0x01a2:
            java.lang.Object r1 = r9.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 8
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r0)
            r1.CMl(r0)
            return
        L_0x01b0:
            java.lang.Object r1 = r9.A01
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            r0 = 0
            r1.A0Q = r0
            return
        L_0x01b8:
            java.lang.Object r3 = r9.A01
            com.whatsapp.status.playback.StatusPlaybackActivity r3 = (com.whatsapp.status.playback.StatusPlaybackActivity) r3
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x0548
            r0 = 2131433895(0x7f0b19a7, float:1.8489589E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0548
            X.1bI r4 = new X.1bI
            r4.<init>(r0)
            r3.A0E = r4
            android.view.View r1 = X.C72463Mc.A0N(r4)
            r0 = 2131435412(0x7f0b1f94, float:1.8492665E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A03 = r0
            android.graphics.Rect r0 = r3.A0g
            com.whatsapp.status.playback.StatusPlaybackActivity.A0V(r0, r3)
            boolean r0 = r3.A0U
            if (r0 == 0) goto L_0x01fe
            android.view.View r0 = r3.A03
            int r2 = X.C72453Mb.A0D(r0)
            android.view.View r1 = r4.A02()
            r0 = 2131428017(0x7f0b02b1, float:1.8477667E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x01fe
            r0.setVisibility(r2)
        L_0x01fe:
            android.view.View r1 = r4.A02()
            r0 = 2131428017(0x7f0b02b1, float:1.8477667E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x0548
            r0 = 10
            X.AnonymousClass78P.A00(r1, r3, r0)
            return
        L_0x0211:
            java.lang.Object r0 = r9.A01
            com.whatsapp.status.playback.StatusReplyActivity r0 = (com.whatsapp.status.playback.StatusReplyActivity) r0
            com.whatsapp.status.playback.StatusReplyActivity.A0r(r0)
            return
        L_0x0219:
            java.lang.Object r0 = r9.A01
            X.5dm r0 = (X.C109645dm) r0
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r1 = r0.get()
            X.6GX r1 = (X.AnonymousClass6GX) r1
            if (r1 == 0) goto L_0x0548
            X.73q r0 = r1.A0A
            r0.A06(r1)
            r3 = 0
            r1.A02 = r3
            X.1KB r1 = r1.A01
            r0 = 2131890601(0x7f1211a9, float:1.9415898E38)
            goto L_0x0532
        L_0x0236:
            java.lang.Object r0 = r9.A01
            X.5dm r0 = (X.C109645dm) r0
            X.C109645dm.A01(r0)
            return
        L_0x023e:
            java.lang.Object r1 = r9.A01
            X.5dm r1 = (X.C109645dm) r1
            X.70T r0 = r1.A03
            if (r0 == 0) goto L_0x0249
            r0.A09()
        L_0x0249:
            X.70T r0 = r1.A03
            if (r0 == 0) goto L_0x0250
            r0.A06()
        L_0x0250:
            r0 = 0
            r1.A03 = r0
            r1.quit()
            r1.interrupt()
            return
        L_0x025a:
            java.lang.Object r1 = r9.A01
            X.5dm r1 = (X.C109645dm) r1
            r0 = 1
            r1.A05 = r0
            X.C109645dm.A03(r1)
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0548
            X.C109645dm.A02(r1)
            return
        L_0x026c:
            java.lang.Object r5 = r9.A01
            X.5dm r5 = (X.C109645dm) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0277
            X.C109645dm.A02(r5)
        L_0x0277:
            r0 = 0
            r5.A00 = r0
            X.70T r1 = r5.A03
            if (r1 == 0) goto L_0x0295
            int r0 = X.C109645dm.A00(r5)     // Catch:{ IOException -> 0x0286 }
            r1.A0A(r0)     // Catch:{ IOException -> 0x0286 }
            goto L_0x0295
        L_0x0286:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x0295
        L_0x028b:
            java.lang.Object r5 = r9.A01
            X.5dm r5 = (X.C109645dm) r5
            r0 = 0
            r5.A05 = r0
            X.C109645dm.A03(r5)
        L_0x0295:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0548
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0548
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
            return
        L_0x02a8:
            java.lang.Object r4 = r9.A01
            X.5dm r4 = (X.C109645dm) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r0 = -16
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x02b6 }
            goto L_0x02ba
        L_0x02b6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x02ba:
            java.lang.String r6 = "StatusPlaybackVoice/failed to prepare audio player"
            X.70T r0 = r4.A03
            if (r0 != 0) goto L_0x02f8
            X.118 r5 = r4.A08     // Catch:{ IOException -> 0x02f0 }
            java.io.File r3 = r4.A0B     // Catch:{ IOException -> 0x02f0 }
            X.0ve r2 = r4.A09     // Catch:{ IOException -> 0x02f0 }
            X.00H r0 = r4.A0A     // Catch:{ IOException -> 0x02f0 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x02f0 }
            X.6gC r1 = (X.AnonymousClass6gC) r1     // Catch:{ IOException -> 0x02f0 }
            r0 = 3
            X.70T r0 = X.AnonymousClass70T.A00(r5, r2, r1, r3, r0)     // Catch:{ IOException -> 0x02f0 }
            r4.A03 = r0     // Catch:{ IOException -> 0x02f0 }
            r3 = 1
            r0.A05()     // Catch:{ IllegalStateException -> 0x02e5, IOException -> 0x02da }
            goto L_0x02f4
        L_0x02da:
            r2 = move-exception
            X.190 r1 = r4.A07     // Catch:{ IOException -> 0x02f0 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x02f0 }
            r1.A0G(r6, r0, r3)     // Catch:{ IOException -> 0x02f0 }
            goto L_0x02ef
        L_0x02e5:
            r2 = move-exception
            X.190 r1 = r4.A07     // Catch:{ IOException -> 0x02f0 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x02f0 }
            r1.A0G(r6, r0, r3)     // Catch:{ IOException -> 0x02f0 }
        L_0x02ef:
            throw r2     // Catch:{ IOException -> 0x02f0 }
        L_0x02f0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x02f4:
            X.70T r0 = r4.A03
            if (r0 == 0) goto L_0x0300
        L_0x02f8:
            r0.A08()     // Catch:{ IOException -> 0x02fc }
            goto L_0x0302
        L_0x02fc:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0300:
            r3 = 0
            goto L_0x0303
        L_0x0302:
            r3 = 1
        L_0x0303:
            android.os.Handler r2 = r4.A06
            r1 = 36
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.post(r0)
            if (r3 != 0) goto L_0x0548
            X.70T r0 = r4.A03
            if (r0 == 0) goto L_0x0318
            r0.A09()
        L_0x0318:
            X.70T r0 = r4.A03
            if (r0 == 0) goto L_0x031f
            r0.A06()
        L_0x031f:
            r0 = 0
            r4.A03 = r0
            r4.quit()
            r4.interrupt()
            return
        L_0x0329:
            java.lang.Object r1 = r9.A01
            X.5dm r1 = (X.C109645dm) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.C109645dm.A01(r1)
            return
        L_0x0335:
            java.lang.Object r1 = r9.A01
            X.5dm r1 = (X.C109645dm) r1
            X.C109645dm.A02(r1)
            r0 = 0
            r1.A04 = r0
            X.C109645dm.A03(r1)
            return
        L_0x0343:
            java.lang.Object r5 = r9.A01
            X.5dm r5 = (X.C109645dm) r5
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0355
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
        L_0x0355:
            r0 = 1
            r5.A04 = r0
            X.C109645dm.A03(r5)
            return
        L_0x035c:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r2
            X.6kV r0 = r2.A05
            if (r0 == 0) goto L_0x036b
            X.1bI r1 = r0.A0F
            r0 = 8
            r1.A04(r0)
        L_0x036b:
            X.6kV r0 = r2.A05
            if (r0 == 0) goto L_0x0548
            X.1bI r0 = r0.A0F
            android.view.View r3 = r0.A02()
            if (r3 == 0) goto L_0x0548
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0384:
            java.lang.Object r2 = r9.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r2
            boolean r0 = r2.A0j
            if (r0 != 0) goto L_0x0548
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0548
            java.util.List r1 = r2.A0w
            if (r1 == 0) goto L_0x03ab
            int r0 = r2.A00
            X.206 r0 = X.AnonymousClass3MW.A0k(r1, r0)
            if (r0 == 0) goto L_0x03ab
            X.70K r1 = r2.A2G(r0)
            boolean r0 = r1 instanceof X.C120896Gl
            if (r0 == 0) goto L_0x03ab
            X.6Gl r1 = (X.C120896Gl) r1
            if (r1 == 0) goto L_0x03ab
            r1.A0b()
        L_0x03ab:
            X.0z4 r0 = r2.A0F
            if (r0 == 0) goto L_0x03ba
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "status_mention_impression"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x03ba:
            java.lang.String r0 = "waSharedPrefs"
        L_0x03bc:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x03c1:
            java.lang.Object r5 = r9.A01
            X.6Go r5 = (X.AnonymousClass6Go) r5
            r4 = 0
            X.0ve r2 = r5.A0L
            r1 = 11819(0x2e2b, float:1.6562E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0548
            X.1Qe r3 = r5.A04
            r0 = 1
            X.25F[] r2 = new X.AnonymousClass25F[r0]
            X.6Gn r5 = (X.AnonymousClass6Gn) r5
            X.206 r1 = r5.A07
            X.C18070vi.A0d(r1, r4)
            java.lang.Class<X.7LD> r0 = X.AnonymousClass7LD.class
            X.C108985cd.A19(r3, r1, r0, r2)
            return
        L_0x03e4:
            java.lang.Object r6 = r9.A01
            X.6Gp r6 = (X.AnonymousClass6Gp) r6
            r4 = r6
            X.6Go r4 = (X.AnonymousClass6Go) r4
            X.00H r0 = r4.A07
            java.lang.Object r1 = r0.get()
            X.1Nt r1 = (X.C25321Nt) r1
            r0 = r4
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.206 r3 = r0.A07
            r1.A04(r3)
            X.77U r2 = X.AnonymousClass6XJ.A00(r3)
            X.1Dh r8 = new X.1Dh
            r8.<init>()
            r0 = 0
            com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1 r1 = new com.whatsapp.status.playback.page.StatusPlaybackPageItemBase$loadFutureProofingContentIfAny$1$1
            r1.<init>(r2, r6, r0, r8)
            r5 = 1
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r1)
            if (r2 == 0) goto L_0x0427
            boolean r0 = r2.A00()
            if (r0 != r5) goto L_0x0427
            X.1Lc r0 = r6.A0M
            X.0ve r2 = r0.A01
            r1 = 10970(0x2ada, float:1.5372E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r7 = 1
            if (r0 == 0) goto L_0x0428
        L_0x0427:
            r7 = 0
        L_0x0428:
            boolean r0 = r8.element
            if (r0 != 0) goto L_0x042f
            r0 = 0
            if (r7 == 0) goto L_0x0430
        L_0x042f:
            r0 = 1
        L_0x0430:
            r6.A04 = r0
            X.1Qe r2 = r4.A04
            X.25F[] r1 = new X.AnonymousClass25F[r5]
            r4 = 0
            X.C18070vi.A0d(r3, r4)
            java.lang.Class<X.7LF> r0 = X.AnonymousClass7LF.class
            X.C108985cd.A19(r2, r3, r0, r1)
            X.25F r0 = X.C18070vi.A09(r3, r0)
            X.229 r0 = r0.A02
            X.7LF r0 = (X.AnonymousClass7LF) r0
            if (r0 == 0) goto L_0x0451
            java.util.ArrayList r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0467
        L_0x0451:
            boolean r0 = r3 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0464
            X.21V r3 = (X.AnonymousClass21V) r3
            if (r3 == 0) goto L_0x0464
            X.2rc r0 = r3.A02
            if (r0 == 0) goto L_0x0464
            com.whatsapp.InteractiveAnnotation[] r3 = r0.A0b
            if (r3 == 0) goto L_0x0464
            int r2 = r3.length
            if (r2 != 0) goto L_0x0474
        L_0x0464:
            if (r7 != 0) goto L_0x0467
            r5 = 0
        L_0x0467:
            X.1KB r4 = r6.A0F
            r0 = 37
            X.3Cp r3 = new X.3Cp
            r3.<init>((int) r0, (java.lang.Object) r6, (boolean) r5)
        L_0x0470:
            r4.A0J(r3)
            return
        L_0x0474:
            r0 = r3[r4]
            X.2Qq r1 = r0.type
            X.2Qq r0 = X.C49482Qq.FUTURE_PROOF
            if (r1 == r0) goto L_0x0467
            int r4 = r4 + 1
            if (r4 >= r2) goto L_0x0464
            goto L_0x0474
        L_0x0481:
            java.lang.Object r2 = r9.A01
            X.6Gp r2 = (X.AnonymousClass6Gp) r2
            r1 = 0
            r0 = 1
            X.AnonymousClass6Gp.A09(r2, r1, r0)
            return
        L_0x048b:
            java.lang.Object r2 = r9.A01
            X.6Gp r2 = (X.AnonymousClass6Gp) r2
            X.70O r0 = r2.A0K()
            android.view.View r1 = r0.A0B()
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            r2.A0Q()
            r2.A0O()
            return
        L_0x04a3:
            java.lang.Object r0 = r9.A01
            X.6Gp r0 = (X.AnonymousClass6Gp) r0
            X.AnonymousClass6Gp.A08(r0)
            return
        L_0x04ab:
            java.lang.Object r1 = r9.A01
            X.6Gp r1 = (X.AnonymousClass6Gp) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0548
            r0 = 0
            r1.A06 = r0
            X.70O r0 = r1.A0K()
            r0.A0C()
            X.1Ez r0 = r1.A0Q
            r0.A02()
            X.AnonymousClass6Gp.A07(r1)
            return
        L_0x04c6:
            java.lang.Object r1 = r9.A01
            X.6Gp r1 = (X.AnonymousClass6Gp) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0548
            r0 = 0
            r1.A07 = r0
            X.6p9 r3 = r1.A0N
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StatusPlaybackBaseFragment/onPlaybackFinished "
            r1.append(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r3.A01
            X.C17900vP.A0b(r0, r1)
            r2 = 4
            r1 = 6
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r3.A02
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0C(r0, r2, r1)
            return
        L_0x04e9:
            java.lang.Object r0 = r9.A01
            X.6Go r0 = (X.AnonymousClass6Go) r0
            X.6zi r5 = r0.A06
            android.content.Context r0 = r0.A0J()
            X.1FU r4 = X.C108985cd.A0L(r0)
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0526
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0526
            X.1KB r2 = r5.A00
            X.00H r0 = r5.A02
            r0.get()
            boolean r1 = X.AnonymousClass11Z.A00()
            r0 = 2131892427(0x7f1218cb, float:1.9419602E38)
            if (r1 == 0) goto L_0x0523
            r0 = 2131892426(0x7f1218ca, float:1.94196E38)
        L_0x0523:
            r2.A08(r0, r3)
        L_0x0526:
            boolean r0 = X.C139956zi.A00(r4, r5)
            if (r0 != 0) goto L_0x0548
            X.1KB r1 = r5.A00
            int r0 = r5.A01()
        L_0x0532:
            r1.A08(r0, r3)
            return
        L_0x0536:
            r1 = move-exception
            java.lang.String r0 = "StatusPrivacyActivity/fetchFbUserFullName Unknown error"
        L_0x0539:
            X.AnonymousClass6YJ.A00(r0, r1)
        L_0x053c:
            X.1KB r2 = r5.A05
            r1 = 42
            X.7Pl r0 = new X.7Pl
            r0.<init>(r5, r4, r1)
            r2.CGP(r0)
        L_0x0548:
            return
        L_0x0549:
            java.lang.Object r0 = r9.A01
            X.6Gl r0 = (X.C120896Gl) r0
            X.C120896Gl.A00(r0)
            return
        L_0x0551:
            java.lang.Object r0 = r9.A01
            X.6Gl r0 = (X.C120896Gl) r0
            r0.A0Q()
            X.1Lg r1 = r0.A06
            X.1WR r0 = r0.A05
            r1.registerObserver(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RH.run():void");
    }

    public AnonymousClass7RH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}

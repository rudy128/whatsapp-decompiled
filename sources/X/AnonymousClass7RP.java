package X;

import com.facebook.smartcapture.view.IdCaptureActivity;
import com.google.android.material.slider.Slider;

/* renamed from: X.7RP  reason: invalid class name */
public class AnonymousClass7RP implements Runnable {
    public int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass7RP(Object obj, int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0635, code lost:
        r0.A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0638, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        r1.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0708, code lost:
        r1.A0g(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x070d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07cd, code lost:
        if (r4 == 8) goto L_0x07cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07dc, code lost:
        if (r2.callState == com.whatsapp.voipcalling.CallState.CALLING) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0803, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0806, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0807, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x080a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x0704;
                case 1: goto L_0x06f8;
                case 2: goto L_0x0468;
                case 3: goto L_0x06ee;
                case 4: goto L_0x06e4;
                case 5: goto L_0x0416;
                case 6: goto L_0x03c4;
                case 7: goto L_0x0370;
                case 8: goto L_0x0011;
                case 9: goto L_0x0354;
                case 10: goto L_0x0346;
                case 11: goto L_0x030f;
                case 12: goto L_0x02e8;
                case 13: goto L_0x06da;
                case 14: goto L_0x06d3;
                case 15: goto L_0x02d5;
                case 16: goto L_0x06c6;
                case 17: goto L_0x06b4;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x068b;
                case 21: goto L_0x0639;
                case 22: goto L_0x062d;
                case 23: goto L_0x0624;
                case 24: goto L_0x05ff;
                case 25: goto L_0x0250;
                case 26: goto L_0x05a5;
                case 27: goto L_0x020f;
                case 28: goto L_0x01ff;
                case 29: goto L_0x059b;
                case 30: goto L_0x058f;
                case 31: goto L_0x055b;
                case 32: goto L_0x0551;
                case 33: goto L_0x0159;
                case 34: goto L_0x0547;
                case 35: goto L_0x04e4;
                case 36: goto L_0x04da;
                case 37: goto L_0x014c;
                case 38: goto L_0x04d0;
                case 39: goto L_0x04c6;
                case 40: goto L_0x04b2;
                case 41: goto L_0x04a0;
                case 42: goto L_0x011d;
                case 43: goto L_0x0493;
                case 44: goto L_0x00dc;
                case 45: goto L_0x0071;
                case 46: goto L_0x0012;
                case 47: goto L_0x0483;
                case 48: goto L_0x0475;
                case 49: goto L_0x0051;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A02
            X.1KB r3 = (X.AnonymousClass1KB) r3
            int r1 = r2.A00
            r0 = 0
            r3.A06(r1, r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r3 = r2.A02
            X.3V0 r3 = (X.AnonymousClass3V0) r3
            int r5 = r2.A00
            if (r5 == 0) goto L_0x0048
            r0 = 1
            if (r5 == r0) goto L_0x0048
            r0 = 2
            if (r5 == r0) goto L_0x0048
            r0 = 4
            if (r5 != r0) goto L_0x002f
            X.0z4 r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)
            java.lang.String r1 = "push_to_video_first_time_watching_educational_nux_shown_individual_chat"
        L_0x002b:
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
        L_0x002f:
            X.1vp r1 = r3.A03
            java.lang.Object r0 = r1.A06()
            X.4YX r0 = (X.AnonymousClass4YX) r0
            boolean r3 = r0.A02
            boolean r2 = r0.A01
            boolean r0 = r0.A03
            r6 = 1
            X.4YX r4 = new X.4YX
            r7 = r3
            r8 = r2
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x00d8
        L_0x0048:
            X.0z4 r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)
            java.lang.String r1 = "push_to_video_camera_entry_point_nux_shown"
            goto L_0x002b
        L_0x0051:
            java.lang.Object r0 = r2.A02
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r0 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r0
            int r4 = r2.A00
            X.00H r0 = r0.A0B
            java.lang.Object r3 = r0.get()
            com.whatsapp.lists.ListsRepository r3 = (com.whatsapp.lists.ListsRepository) r3
            java.lang.Integer r2 = X.C17880vN.A0l()
            if (r4 == 0) goto L_0x0011
            r0 = 0
            com.whatsapp.lists.ListsRepository$deleteLabel$1 r1 = new com.whatsapp.lists.ListsRepository$deleteLabel$1
            r1.<init>(r3, r2, r0, r4)
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.AnonymousClass4GT.A00(r0, r1)
            return
        L_0x0071:
            java.lang.Object r3 = r2.A02
            X.3V4 r3 = (X.AnonymousClass3V4) r3
            X.0ve r2 = r3.A03
            r1 = 10960(0x2ad0, float:1.5358E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0011
            X.1vp r1 = r3.A05
            java.lang.Object r0 = r1.A06()
            X.4Yl r0 = (X.C88134Yl) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0011
            X.1L1 r0 = r3.A04
            android.content.SharedPreferences r7 = r0.A00
            java.lang.String r6 = "ptt_reply_nux_shown"
            boolean r0 = X.C17880vN.A1W(r7, r6)
            if (r0 != 0) goto L_0x0011
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "ptt_last_sent_timestamp_ms"
            long r2 = X.C17890vO.A05(r7, r0)
            long r4 = r4 - r2
            r2 = 1209600000(0x48190800, double:5.97621805E-315)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            android.content.SharedPreferences$Editor r0 = r7.edit()
            X.C18070vi.A0X(r0)
            r7 = 1
            X.C17880vN.A1F(r0, r6, r7)
            java.lang.Object r0 = r1.A06()
            X.4Yl r0 = (X.C88134Yl) r0
            r6 = 4
            boolean r8 = r0.A04
            boolean r9 = r0.A03
            boolean r10 = r0.A02
            int r5 = r0.A00
            boolean r11 = r0.A07
            boolean r12 = r0.A08
            boolean r13 = r0.A0A
            boolean r14 = r0.A09
            boolean r15 = r0.A05
            boolean r0 = r0.A06
            X.4Yl r4 = new X.4Yl
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00d8:
            r1.A0F(r4)
            return
        L_0x00dc:
            java.lang.Object r0 = r2.A02
            X.3X1 r0 = (X.AnonymousClass3X1) r0
            int r5 = r2.A00
            X.3UB r4 = r0.A00
            X.1DT r3 = r4.A01
            java.lang.Object r1 = r3.A06()
            X.4Q9 r1 = (X.AnonymousClass4Q9) r1
            if (r1 == 0) goto L_0x0011
            java.util.LinkedList r2 = r1.A00
            int r0 = X.AnonymousClass1ZU.A04(r2)
            if (r5 > r0) goto L_0x0011
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x011b
            int r0 = X.AnonymousClass1ZU.A04(r2)
        L_0x0100:
            if (r5 != r0) goto L_0x070e
            int r0 = r4.A00
            int r2 = r0 + 1
            X.1vp r1 = r4.A02
            int r0 = X.C108975cc.A02(r1)
            int r2 = r2 % r0
            r4.A00 = r2
            java.util.List r0 = X.AnonymousClass3MW.A10(r1)
            java.lang.Object r0 = r0.get(r2)
            r3.A0F(r0)
            return
        L_0x011b:
            r0 = -1
            goto L_0x0100
        L_0x011d:
            java.lang.Object r3 = r2.A02
            X.73j r3 = (X.C1408673j) r3
            int r1 = r2.A00
            X.6to r2 = r3.A00
            if (r2 == 0) goto L_0x0011
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "onSearchTermChanged"
            X.63d r1 = X.C1408673j.A00(r3, r0)
            if (r1 == 0) goto L_0x0011
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A02 = r0
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r3.A01
            r0.CC7(r1)
            r0 = 1
            r2.A01 = r0
            return
        L_0x014c:
            java.lang.Object r4 = r2.A02
            X.5lB r4 = (X.C112255lB) r4
            int r1 = r2.A00
            X.8Ah r3 = r4.A00
            if (r3 == 0) goto L_0x0011
            monitor-enter(r3)
            goto L_0x0718
        L_0x0159:
            java.lang.Object r1 = r2.A02
            X.A99 r1 = (X.A99) r1
            int r4 = r2.A00
            X.1HQ r0 = r1.A29
            com.whatsapp.voipcalling.CallInfo r2 = X.C40811vJ.A04(r0)
            if (r2 == 0) goto L_0x0011
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/signal_thread/end_call/"
            r3.append(r0)
            int r0 = r1.A43
            X.C17900vP.A0o(r3, r0)
            r3 = 1
            if (r4 != r3) goto L_0x07a6
            java.lang.Integer r0 = r1.A0v
            if (r0 == 0) goto L_0x0743
            long r7 = r0.longValue()
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0743
            boolean r0 = r2.isCaller
            if (r0 == 0) goto L_0x0743
            com.whatsapp.voipcalling.CallState r5 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r5 != r0) goto L_0x0743
            long r5 = r2.callDuration
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0743
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1.A05
            long r7 = r7 - r5
            r5 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0743
            X.00H r0 = r1.A3I
            java.lang.Object r0 = r0.get()
            X.2pG r0 = (X.C61182pG) r0
            boolean r0 = X.C61182pG.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0743
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A0y = r0
            android.content.Context r7 = r1.A1r
            r6 = 2131898111(0x7f122eff, float:1.943113E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r4 = 0
            com.whatsapp.jid.UserJid r2 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r2 != 0) goto L_0x01f2
            java.lang.String r0 = "voip/getPeerDisplayNameShort/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x01cd:
            java.lang.String r2 = X.C17880vN.A0q(r7, r0, r5, r4, r6)
            X.195 r0 = r1.A1w
            boolean r0 = r0.A00
            java.lang.Boolean r8 = X.C108945cZ.A1A(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r9 = 0
            r12 = r9
            r11 = r9
            android.content.Intent r1 = X.AnonymousClass1LU.A1H(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = X.AnonymousClass6Z8.A07
            r1.setAction(r0)
            java.lang.String r0 = "confirmationString"
            r1.putExtra(r0, r2)
            r7.startActivity(r1)
            return
        L_0x01f2:
            X.1M9 r0 = r1.A2T
            X.1E7 r2 = r0.A0H(r2)
            X.1Me r0 = r1.A2V
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r2)
            goto L_0x01cd
        L_0x01ff:
            java.lang.Object r3 = r2.A02
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            int r1 = r2.A00
            int r0 = r3.getMode()
            if (r0 == r1) goto L_0x0011
            r3.setMode(r1)
            return
        L_0x020f:
            java.lang.Object r5 = r2.A02
            X.Adx r5 = (X.C21067Adx) r5
            int r6 = r2.A00
            int r2 = r5.A00
            if (r2 == r6) goto L_0x0011
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/audio_route/changeAudioRoute: change audioRoute "
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A06(r2)
            r1.append(r0)
            java.lang.String r0 = " -> "
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A06(r6)
            X.C17890vO.A1A(r1, r0)
            X.1HQ r0 = r5.A0B
            com.whatsapp.voipcalling.CallInfo r4 = r0.BO3()
            r3 = 3
            r2 = 1
            if (r6 == 0) goto L_0x07e9
            if (r6 == r2) goto L_0x07e5
            r0 = 2
            if (r6 == r0) goto L_0x07e9
            if (r6 == r3) goto L_0x07e1
            r0 = 4
            if (r6 == r0) goto L_0x07e9
            java.lang.String r1 = "UNKNOWN AudioRoute"
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            return
        L_0x0250:
            int r3 = r2.A00
            java.lang.Object r0 = r2.A02
            X.71k r0 = (X.C1404371k) r0
            r1 = 1
            if (r3 != r1) goto L_0x0011
            X.1Ty r5 = r0.A01
            X.0vl r0 = r5.A04
            java.lang.Object r7 = r0.getValue()
            X.9CB r7 = (X.AnonymousClass9CB) r7
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.1Lt r0 = r7.A00
            X.1at r4 = r0.get()
            java.lang.String r3 = "SELECT jid FROM wa_biz_profiles WHERE automated_type = ?"
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0804 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0804 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0804 }
            java.lang.String r0 = "GET_BUSINESS_JIDS_BY_AUTOMATED_TYPE"
            android.database.Cursor r3 = X.C24861Ly.A03(r4, r3, r0, r2)     // Catch:{ all -> 0x0804 }
        L_0x027e:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x07fd }
            if (r0 == 0) goto L_0x02a0
            java.lang.String r0 = "jid"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07fd }
            X.1Lx r2 = r7.A00     // Catch:{ all -> 0x07fd }
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x07fd }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x07fd }
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)     // Catch:{ all -> 0x07fd }
            com.whatsapp.jid.UserJid r0 = r2.A00(r0)     // Catch:{ all -> 0x07fd }
            if (r0 == 0) goto L_0x027e
            r6.add(r0)     // Catch:{ all -> 0x07fd }
            goto L_0x027e
        L_0x02a0:
            r3.close()     // Catch:{ all -> 0x0804 }
            r4.close()
            java.util.Iterator r4 = r6.iterator()
        L_0x02aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0011
            X.1BI r3 = X.C17880vN.A0Q(r4)
            X.0vl r0 = r5.A06
            java.lang.Object r2 = r0.getValue()
            X.121 r2 = (X.AnonymousClass121) r2
            X.122 r2 = (X.AnonymousClass122) r2
            X.1NK r0 = r2.A0a
            boolean r0 = r0.A09(r3)
            if (r0 == 0) goto L_0x02aa
            r1 = 0
            X.1PV r0 = r2.A15
            X.2M8 r1 = r0.A01(r3, r1)
            r0 = -1
            X.AnonymousClass122.A07(r2, r1, r0)
            r2.A0P(r1)
            goto L_0x02aa
        L_0x02d5:
            java.lang.Object r3 = r2.A02
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            int r2 = r2.A00
            java.lang.ref.WeakReference r0 = r3.A0D
            android.view.View r1 = X.C108945cZ.A0O(r0)
            if (r1 == 0) goto L_0x0011
            r0 = 0
            com.google.android.material.sidesheet.SideSheetBehavior.A01(r1, r3, r2, r0)
            return
        L_0x02e8:
            java.lang.Object r0 = r2.A02
            X.DHE r0 = (X.DHE) r0
            X.CrM r1 = r0.A0V
            X.BzJ r0 = X.C24322BzJ.VIDEO
            java.util.HashMap r1 = r1.A05(r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0011
            java.util.Iterator r1 = r0.iterator()
        L_0x0305:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0011
            r1.next()
            goto L_0x0305
        L_0x030f:
            java.lang.Object r4 = r2.A02
            X.BLP r4 = (X.BLP) r4
            r3 = 2131899365(0x7f1233e5, float:1.9433674E38)
            r2 = 0
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0011
            X.D3k r0 = r4.A2m()
            int r0 = r0.A00
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r4, r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r1)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r3)
            android.app.AlertDialog$Builder r2 = r0.setCancelable(r2)
            r0 = 2
            X.Cxo r1 = new X.Cxo
            r1.<init>(r4, r0)
            r0 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r0, r1)
            r0.show()
            return
        L_0x0346:
            java.lang.Object r0 = r2.A02
            com.facebook.smartcapture.camera.CameraFragment r0 = (com.facebook.smartcapture.camera.CameraFragment) r0
            int r1 = r2.A00
            X.BHG r0 = r0.A01
            if (r0 == 0) goto L_0x0011
            r0.setVisibility(r1)
            return
        L_0x0354:
            java.lang.Object r0 = r2.A02
            X.CXw r0 = (X.C25103CXw) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x035e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r3.next()
            X.BCw r1 = (X.BCw) r1
            int r0 = r2.A00
            r1.C6N(r0)
            goto L_0x035e
        L_0x0370:
            java.lang.Object r0 = r2.A02
            X.CVB r0 = (X.CVB) r0
            int r9 = r2.A00
            X.DEr r8 = r0.A00
            X.CZh r0 = r8.A0Z
            java.util.List r7 = r0.A00
            int r6 = r7.size()
            r5 = 0
        L_0x0381:
            if (r5 >= r6) goto L_0x0011
            r0 = 2
            boolean r4 = X.AnonymousClass000.A1T(r9, r0)
            X.BUs r0 = r8.A09
            if (r0 == 0) goto L_0x039d
            X.CKJ r3 = X.C25971Cpe.A0e
            java.lang.Object r0 = r0.A04(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = X.C72463Mc.A0B(r0)
            r0 = 2
            if (r4 == 0) goto L_0x03a9
            if (r1 == 0) goto L_0x03ab
        L_0x039d:
            java.lang.Object r0 = r7.get(r5)
            X.CVB r0 = (X.CVB) r0
            r0.A00(r9)
            int r5 = r5 + 1
            goto L_0x0381
        L_0x03a9:
            if (r1 != r0) goto L_0x039d
        L_0x03ab:
            X.BUs r2 = r8.A09
            X.Csq r1 = new X.Csq
            r1.<init>()
            if (r4 != 0) goto L_0x03b5
            r0 = 0
        L_0x03b5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r3, r0)
            X.CXe r0 = r1.A03()
            r2.A06(r0)
            goto L_0x039d
        L_0x03c4:
            java.lang.Object r3 = r2.A02
            X.DEv r3 = (X.C26813DEv) r3
            int r1 = r2.A00
            int r4 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x03d9
            int r0 = r1 + 45
            int r0 = r0 + 360
            int r0 = r0 / 90
            int r0 = r0 % 4
            int r4 = r0 * 90
        L_0x03d9:
            r2 = 0
            X.BUN r0 = r3.A08     // Catch:{ RuntimeException -> 0x0403 }
            X.E9h r0 = r0.A00     // Catch:{ RuntimeException -> 0x0403 }
            android.content.Context r1 = r0.getContext()     // Catch:{ RuntimeException -> 0x0403 }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0403 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ RuntimeException -> 0x0403 }
            if (r0 == 0) goto L_0x0403
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0403 }
            int r1 = r0.getRotation()     // Catch:{ RuntimeException -> 0x0403 }
            r0 = 1
            if (r1 == r0) goto L_0x03f8
            goto L_0x03fb
        L_0x03f8:
            r2 = 90
            goto L_0x0403
        L_0x03fb:
            r0 = 2
            if (r1 == r0) goto L_0x0413
            r0 = 3
            if (r1 != r0) goto L_0x0403
            r2 = 270(0x10e, float:3.78E-43)
        L_0x0403:
            int r0 = r3.A00
            if (r0 != r4) goto L_0x040b
            int r0 = r3.A02
            if (r0 == r2) goto L_0x0011
        L_0x040b:
            r3.A00 = r4
            r3.A02 = r2
            X.C26813DEv.A00(r3)
            return
        L_0x0413:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x0403
        L_0x0416:
            java.lang.Object r3 = r2.A02
            X.DEu r3 = (X.C26812DEu) r3
            int r1 = r2.A00
            int r4 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x042b
            int r0 = r1 + 45
            int r0 = r0 + 360
            int r0 = r0 / 90
            int r0 = r0 % 4
            int r4 = r0 * 90
        L_0x042b:
            r2 = 0
            X.BUO r0 = r3.A08     // Catch:{ RuntimeException -> 0x0455 }
            X.E9h r0 = r0.A00     // Catch:{ RuntimeException -> 0x0455 }
            android.content.Context r1 = r0.getContext()     // Catch:{ RuntimeException -> 0x0455 }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0455 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ RuntimeException -> 0x0455 }
            if (r0 == 0) goto L_0x0455
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0455 }
            int r1 = r0.getRotation()     // Catch:{ RuntimeException -> 0x0455 }
            r0 = 1
            if (r1 == r0) goto L_0x044a
            goto L_0x044d
        L_0x044a:
            r2 = 90
            goto L_0x0455
        L_0x044d:
            r0 = 2
            if (r1 == r0) goto L_0x0465
            r0 = 3
            if (r1 != r0) goto L_0x0455
            r2 = 270(0x10e, float:3.78E-43)
        L_0x0455:
            int r0 = r3.A00
            if (r0 != r4) goto L_0x045d
            int r0 = r3.A02
            if (r0 == r2) goto L_0x0011
        L_0x045d:
            r3.A00 = r4
            r3.A02 = r2
            X.C26812DEu.A00(r3)
            return
        L_0x0465:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x0455
        L_0x0468:
            java.lang.Object r3 = r2.A02
            X.ALM r3 = (X.ALM) r3
            int r1 = r2.A00
            r0 = -1
            if (r1 == r0) goto L_0x0011
            X.ALM.A00(r3, r1)
            return
        L_0x0475:
            java.lang.Object r0 = r2.A02
            X.30Z r0 = (X.AnonymousClass30Z) r0
            int r1 = r2.A00
            java.lang.Object r0 = r0.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            com.whatsapp.conversationslist.ConversationsFragment.A0h(r0, r1)
            return
        L_0x0483:
            java.lang.Object r4 = r2.A02
            X.3TA r4 = (X.AnonymousClass3TA) r4
            int r3 = r2.A00
            X.1T6 r2 = r4.A0h
            X.7Fe r1 = r4.A00
            X.2Qz r0 = X.C49572Qz.WEB_THUMBNAIL
            r2.A0G(r1, r4, r0, r3)
            return
        L_0x0493:
            java.lang.Object r0 = r2.A02
            X.3uP r0 = (X.AnonymousClass3uP) r0
            int r2 = r2.A00
            X.1KB r1 = r0.A0S
            r0 = 1
            r1.A06(r2, r0)
            return
        L_0x04a0:
            java.lang.Object r0 = r2.A02
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            int r1 = r2.A00
            X.00H r0 = r0.A2c
            java.lang.Object r0 = r0.get()
            X.6zi r0 = (X.C139956zi) r0
            r0.A02(r1)
            return
        L_0x04b2:
            java.lang.Object r0 = r2.A02
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            int r3 = r2.A00
            android.widget.ImageView r2 = com.whatsapp.contact.picker.ContactPickerFragment.A05(r0)
            X.0vb r1 = r0.A19
            android.content.Context r0 = r0.A1n()
            X.AnonymousClass3NL.A01(r0, r2, r1, r3)
            return
        L_0x04c6:
            java.lang.Object r1 = r2.A02
            com.whatsapp.companionmode.registration.CompanionBootstrapActivity r1 = (com.whatsapp.companionmode.registration.CompanionBootstrapActivity) r1
            int r0 = r2.A00
            com.whatsapp.companionmode.registration.CompanionBootstrapActivity.A03(r1, r0)
            return
        L_0x04d0:
            java.lang.Object r1 = r2.A02
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView r1 = (com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView) r1
            int r0 = r2.A00
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView.A04(r1, r0)
            return
        L_0x04da:
            java.lang.Object r1 = r2.A02
            android.view.View r1 = (android.view.View) r1
            int r0 = r2.A00
            r1.setVisibility(r0)
            return
        L_0x04e4:
            int r5 = r2.A00
            java.lang.Object r4 = r2.A02
            X.7DY r4 = (X.AnonymousClass7DY) r4
            r3 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CameraUi/error "
            X.C17900vP.A0k(r0, r1, r5)
            X.1HS r2 = r4.A12
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0500
            X.AnonymousClass7DY.A0F(r4)
            return
        L_0x0500:
            r0 = 2
            if (r5 == r0) goto L_0x0520
            X.AnonymousClass7DY.A0K(r4)
            X.1Vi r0 = r4.A14
            X.17x r1 = r0.A00
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x053c
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0529
            X.1KB r2 = r4.A0y
            r1 = 2131890022(0x7f120f66, float:1.9414724E38)
        L_0x051d:
            r2.A08(r1, r3)
        L_0x0520:
            X.AnonymousClass7DY.A0O(r4)
            X.89h r0 = r4.A1Y
            r0.BnQ()
            return
        L_0x0529:
            r0 = 3
            X.1KB r2 = r4.A0y
            if (r5 != r0) goto L_0x0532
            r1 = 2131894539(0x7f12210b, float:1.9423886E38)
            goto L_0x051d
        L_0x0532:
            r0 = 4
            r1 = 2131887932(0x7f12073c, float:1.9410485E38)
            if (r5 != r0) goto L_0x051d
            r1 = 2131897838(0x7f122dee, float:1.9430577E38)
            goto L_0x051d
        L_0x053c:
            java.lang.String r0 = "CameraUi/no-camera-permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r2 = r4.A0y
            r1 = 2131887933(0x7f12073d, float:1.9410487E38)
            goto L_0x051d
        L_0x0547:
            java.lang.Object r1 = r2.A02
            com.whatsapp.calling.service.VoiceServiceEventCallback r1 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r1
            int r0 = r2.A00
            r1.m42lambda$linkEditNacked$10$comwhatsappcallingserviceVoiceServiceEventCallback(r0)
            return
        L_0x0551:
            java.lang.Object r1 = r2.A02
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r1
            int r0 = r2.A00
            r1.A00(r0)
            return
        L_0x055b:
            java.lang.Object r4 = r2.A02
            X.73c r4 = (X.C1407973c) r4
            int r3 = r2.A00
            r2 = 5
            if (r3 != r2) goto L_0x056b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0G
            boolean r0 = r0.A0X
            if (r0 != 0) goto L_0x056b
            return
        L_0x056b:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0580
            r4.A01 = r3
            X.C6X r1 = r4.A0F
            android.view.View r0 = r4.A0D
            r1.A03(r0, r3)
            boolean r0 = X.AnonymousClass000.A1S(r3, r2)
            X.C1407973c.A03(r4, r0)
            return
        L_0x0580:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController setBottomSheetState "
            X.C17900vP.A0j(r0, r1, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0G
            r0.A0W(r3)
            return
        L_0x058f:
            java.lang.Object r0 = r2.A02
            X.5wX r0 = (X.C116185wX) r0
            int r1 = r2.A00
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r0.A0M
            X.C123806Vx.A00(r0, r1)
            return
        L_0x059b:
            java.lang.Object r1 = r2.A02
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            int r0 = r2.A00
            r1.A1T(r0)
            return
        L_0x05a5:
            int r6 = r2.A00
            java.lang.Object r5 = r2.A02
            X.5jD r5 = (X.C111225jD) r5
            r4 = 1
            if (r4 > r6) goto L_0x05e2
            r8 = 1
        L_0x05af:
            X.1DT r7 = r5.A0G
            java.util.List r0 = X.AnonymousClass3MW.A10(r7)
            if (r0 == 0) goto L_0x05dd
            java.util.Iterator r3 = r0.iterator()
        L_0x05bb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05dd
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6dh r0 = (X.C127036dh) r0
            X.1DT r0 = r0.A01
            java.lang.Object r1 = r0.A06()
            X.6R5 r0 = X.AnonymousClass6R5.LOADING
            if (r1 != r0) goto L_0x05bb
            if (r2 == 0) goto L_0x05dd
            java.util.List r0 = X.AnonymousClass3MW.A10(r7)
            if (r0 == 0) goto L_0x05dd
            r0.remove(r2)
        L_0x05dd:
            if (r8 == r6) goto L_0x05e2
            int r8 = r8 + 1
            goto L_0x05af
        L_0x05e2:
            X.1DT r2 = r5.A0H
            java.lang.Number r0 = X.C108945cZ.A1C(r2)
            if (r0 != 0) goto L_0x05ee
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
        L_0x05ee:
            int r1 = r0.intValue()
            int r1 = r1 + r6
            r0 = 3
            int r0 = java.lang.Math.min(r1, r0)
            X.AnonymousClass3MX.A1K(r2, r0)
            X.C111225jD.A0C(r5, r4)
            return
        L_0x05ff:
            int r0 = r2.A00
            java.lang.Object r2 = r2.A02
            X.72R r2 = (X.AnonymousClass72R) r2
            X.8r8 r1 = new X.8r8
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A02 = r0
            X.18K r0 = r2.A01
            r0.CC7(r1)
            return
        L_0x0624:
            java.lang.Object r0 = r2.A02
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            int r1 = r2.A00
            X.1oU r0 = r0.A0L
            goto L_0x0635
        L_0x062d:
            java.lang.Object r0 = r2.A02
            X.8gR r0 = (X.C167498gR) r0
            int r1 = r2.A00
            X.1oU r0 = r0.A02
        L_0x0635:
            r0.A0G(r1)
            return
        L_0x0639:
            java.lang.Object r4 = r2.A02
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            int r3 = r2.A00
            X.1KB r0 = r4.A2H()
            r0.A04()
            r2 = 405(0x195, float:5.68E-43)
            r0 = 2131897192(0x7f122b68, float:1.9429267E38)
            if (r3 != r2) goto L_0x0650
            r0 = 2131897163(0x7f122b4b, float:1.9429208E38)
        L_0x0650:
            X.3Rj r1 = X.AnonymousClass4a6.A03(r4)
            r1.A0D(r0)
            if (r3 != r2) goto L_0x065f
            r0 = 2131897164(0x7f122b4c, float:1.942921E38)
            r1.A0E(r0)
        L_0x065f:
            X.05w r3 = r1.create()
            r0 = 2131895332(0x7f122424, float:1.9425494E38)
            java.lang.String r2 = r4.A1H(r0)
            r0 = 13
            X.4aq r1 = new X.4aq
            r1.<init>(r4, r0)
            r0 = -1
            r3.A08(r0, r2, r1)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r2 = r4.A1H(r0)
            r0 = 14
            X.4aq r1 = new X.4aq
            r1.<init>(r4, r0)
            r0 = -2
            r3.A08(r0, r2, r1)
            r3.show()
            return
        L_0x068b:
            java.lang.Object r3 = r2.A02
            X.4nt r3 = (X.C96464nt) r3
            int r1 = r2.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x06a5
            switch(r1) {
                case 403: goto L_0x06ab;
                case 404: goto L_0x069f;
                case 405: goto L_0x0699;
                default: goto L_0x0698;
            }
        L_0x0698:
            return
        L_0x0699:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131896581(0x7f122905, float:1.9428027E38)
            goto L_0x06b0
        L_0x069f:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131896580(0x7f122904, float:1.9428025E38)
            goto L_0x06b0
        L_0x06a5:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131896578(0x7f122902, float:1.9428021E38)
            goto L_0x06b0
        L_0x06ab:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131896579(0x7f122903, float:1.9428023E38)
        L_0x06b0:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity.A0Q(r1, r0)
            return
        L_0x06b4:
            java.lang.Object r0 = r2.A02
            X.1Gr r0 = (X.C23541Gr) r0
            int r1 = r2.A00
            com.whatsapp.HomeActivity r0 = r0.A00
            X.00H r0 = r0.A1E
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            r0.A0E(r1)
            return
        L_0x06c6:
            java.lang.Object r0 = r2.A02
            com.google.android.material.slider.Slider r0 = (com.google.android.material.slider.Slider) r0
            X.BL7 r3 = r0.A0n
            int r1 = r2.A00
            r0 = 4
            r3.A1e(r1, r0)
            return
        L_0x06d3:
            java.lang.Object r0 = r2.A02
            com.google.android.material.datepicker.MaterialCalendar r0 = (com.google.android.material.datepicker.MaterialCalendar) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A04
            goto L_0x0708
        L_0x06da:
            java.lang.Object r1 = r2.A02
            X.DIr r1 = (X.C26910DIr) r1
            int r0 = r2.A00
            X.C26910DIr.A06(r1, r0)
            return
        L_0x06e4:
            java.lang.Object r1 = r2.A02
            X.DBV r1 = (X.DBV) r1
            int r0 = r2.A00
            r1.A00(r0)
            return
        L_0x06ee:
            java.lang.Object r1 = r2.A02
            android.app.Activity r1 = (android.app.Activity) r1
            int r0 = r2.A00
            r1.setRequestedOrientation(r0)
            return
        L_0x06f8:
            java.lang.Object r0 = r2.A02
            androidx.work.impl.foreground.SystemForegroundService r0 = (androidx.work.impl.foreground.SystemForegroundService) r0
            android.app.NotificationManager r1 = r0.A00
            int r0 = r2.A00
            r1.cancel(r0)
            return
        L_0x0704:
            java.lang.Object r1 = r2.A02
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
        L_0x0708:
            int r0 = r2.A00
            r1.A0g(r0)
            return
        L_0x070e:
            X.1wy r1 = r4.A03
            java.lang.Object r0 = r2.get(r5)
            r1.A0F(r0)
            return
        L_0x0718:
            X.8Ah r0 = r4.A00     // Catch:{ Exception -> 0x072d }
            X.8B2 r0 = r0.CCk(r1)     // Catch:{ Exception -> 0x072d }
            if (r0 == 0) goto L_0x073e
            X.1KB r2 = r4.A02     // Catch:{ Exception -> 0x072d }
            r1 = 26
            X.7R9 r0 = new X.7R9     // Catch:{ Exception -> 0x072d }
            r0.<init>((java.lang.Object) r4, (int) r1)     // Catch:{ Exception -> 0x072d }
            r2.A0J(r0)     // Catch:{ Exception -> 0x072d }
            goto L_0x073e
        L_0x072d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0740 }
            java.lang.String r0 = "RecentMediaAdapter/refreshMediaElement/e"
            r1.append(r0)     // Catch:{ all -> 0x0740 }
            java.lang.String r0 = r2.getLocalizedMessage()     // Catch:{ all -> 0x0740 }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0740 }
        L_0x073e:
            monitor-exit(r3)     // Catch:{ all -> 0x0740 }
            return
        L_0x0740:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0740 }
            throw r0
        L_0x0743:
            boolean r0 = r2.isCaller
            if (r0 != 0) goto L_0x07ad
            boolean r0 = r2.isGroupCall
            if (r0 == 0) goto L_0x07ad
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1.A06
            long r7 = r7 - r5
            X.0ve r6 = r1.A2p
            r5 = 11132(0x2b7c, float:1.5599E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r6, r5)
            long r5 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x07ad
            X.00H r0 = r1.A3I
            java.lang.Object r0 = r0.get()
            X.2pG r0 = (X.C61182pG) r0
            boolean r0 = X.C61182pG.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x07ad
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A0y = r0
            android.content.Context r4 = r1.A1r
            r0 = 2131898112(0x7f122f00, float:1.9431133E38)
            java.lang.String r2 = r4.getString(r0)
            X.195 r0 = r1.A1w
            boolean r0 = r0.A00
            java.lang.Boolean r5 = X.C108945cZ.A1A(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r6 = 0
            r9 = r6
            r8 = r6
            android.content.Intent r1 = X.AnonymousClass1LU.A1H(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = X.AnonymousClass6Z8.A07
            r1.setAction(r0)
            java.lang.String r0 = "confirmationString"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "isGroupCall"
            r1.putExtra(r0, r3)
            r4.startActivity(r1)
            return
        L_0x07a6:
            r0 = 2
            if (r4 != r0) goto L_0x07d4
            java.lang.Integer r0 = r1.A0y
            r1.A0w = r0
        L_0x07ad:
            int r1 = r2.callLinkState
            if (r1 == r3) goto L_0x07df
            r0 = 2
            if (r1 == r0) goto L_0x07df
            r0 = 3
            if (r1 == r0) goto L_0x07df
            r0 = 32
            if (r4 != r0) goto L_0x07c1
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x07df
        L_0x07c1:
            r2 = 1
        L_0x07c2:
            r1 = 2
            if (r4 == r3) goto L_0x07d0
            if (r4 == r1) goto L_0x07d0
            r0 = 7
            if (r4 == r0) goto L_0x07cf
            r0 = 8
            r1 = 0
            if (r4 != r0) goto L_0x07d0
        L_0x07cf:
            r1 = 1
        L_0x07d0:
            com.whatsapp.voipcalling.Voip.endCall(r2, r1)
            return
        L_0x07d4:
            r0 = 25
            if (r4 != r0) goto L_0x07ad
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x07df
            goto L_0x07ad
        L_0x07df:
            r2 = 0
            goto L_0x07c2
        L_0x07e1:
            r5.A09(r4, r2)
            return
        L_0x07e5:
            r5.A0A(r4, r2)
            return
        L_0x07e9:
            int r1 = r5.A00
            r0 = 0
            if (r1 != r2) goto L_0x07f2
            r5.A0A(r4, r0)
            return
        L_0x07f2:
            if (r1 != r3) goto L_0x07f8
            r5.A09(r4, r0)
            return
        L_0x07f8:
            r0 = 0
            r5.A07(r4, r0)
            return
        L_0x07fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x07ff }
        L_0x07ff:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0804 }
            throw r0     // Catch:{ all -> 0x0804 }
        L_0x0804:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0806 }
        L_0x0806:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RP.run():void");
    }

    public AnonymousClass7RP(AnonymousClass1KB r2, int i) {
        this.A01 = 19;
        this.A02 = r2;
        this.A00 = i;
    }

    public AnonymousClass7RP(Slider slider) {
        this.A01 = 16;
        this.A02 = slider;
        this.A00 = -1;
    }

    public AnonymousClass7RP(IdCaptureActivity idCaptureActivity) {
        this.A01 = 11;
        this.A02 = idCaptureActivity;
        this.A00 = 2131899365;
    }

    public AnonymousClass7RP(AnonymousClass3V4 r2) {
        this.A01 = 45;
        this.A02 = r2;
        this.A00 = 4;
    }
}

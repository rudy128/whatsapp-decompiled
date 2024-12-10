package X;

/* renamed from: X.2kF  reason: invalid class name and case insensitive filesystem */
public class C58162kF {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public final A7S A03;
    public final A99 A04;
    public final A4u A05;
    public final C32951i1 A06;
    public final C18030ve A07;
    public final AnonymousClass126 A08;
    public final C57322it A09;
    public final C24901Mc A0A;
    public final C23651Hc A0B;
    public final AnonymousClass11E A0C;
    public final AnonymousClass11P A0D;
    public final C26241Rj A0E;

    public C58162kF(C23651Hc r1, A7S a7s, A99 a99, A4u a4u, AnonymousClass11E r5, C32951i1 r6, AnonymousClass11P r7, C18030ve r8, AnonymousClass126 r9, C26241Rj r10, C57322it r11, C24901Mc r12) {
        this.A04 = a99;
        this.A07 = r8;
        this.A0A = r12;
        this.A03 = a7s;
        this.A0E = r10;
        this.A08 = r9;
        this.A0B = r1;
        this.A06 = r6;
        this.A09 = r11;
        this.A05 = a4u;
        this.A0C = r5;
        this.A0D = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.fieldstats.events.WamCall r8, com.whatsapp.jid.UserJid r9, java.lang.Boolean r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.Long r19, java.lang.Long r20, java.lang.Long r21, java.lang.Long r22, java.lang.String r23, java.lang.String r24, java.lang.StringBuilder r25) {
        /*
            r7 = this;
            X.11E r0 = r7.A0C
            r1 = 1
            int r0 = r0.A03(r1)
            if (r0 != 0) goto L_0x0044
            r1 = 3
        L_0x000a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.callNetwork = r0
            X.1Hc r2 = r7.A0B
            boolean r0 = r2.A02()
            java.lang.Integer r4 = X.C17880vN.A0j()
            r1 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0036
            r8.xmppStatus = r4
        L_0x0023:
            java.lang.Boolean r0 = r7.A00
            if (r0 != 0) goto L_0x0031
            boolean r0 = com.whatsapp.voipcalling.Voip.A08()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
        L_0x0031:
            java.lang.Boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0058
            goto L_0x0048
        L_0x0036:
            int r0 = r2.A05
            if (r0 != r1) goto L_0x0041
            java.lang.Integer r0 = X.C17880vN.A0i()
            r8.xmppStatus = r0
            goto L_0x0023
        L_0x0041:
            r8.xmppStatus = r3
            goto L_0x0023
        L_0x0044:
            if (r0 != r1) goto L_0x000a
            r1 = 2
            goto L_0x000a
        L_0x0048:
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()     // Catch:{ all -> 0x004d }
            goto L_0x0052
        L_0x004d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0052:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A01 = r0
        L_0x0058:
            java.lang.Boolean r1 = r7.A02
            if (r1 != 0) goto L_0x006c
            boolean r0 = android.media.audiofx.NoiseSuppressor.isAvailable()     // Catch:{ all -> 0x0061 }
            goto L_0x0066
        L_0x0061:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0066:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r7.A02 = r1
        L_0x006c:
            java.lang.Boolean r0 = r7.A00
            r8.builtinAecAvailable = r0
            java.lang.Boolean r0 = r7.A01
            r8.builtinAgcAvailable = r0
            r8.builtinNsAvailable = r1
            r0 = r19
            r8.callOfferElapsedT = r0
            r8.callFromUi = r11
            r8.callWakeupSource = r14
            r0 = r23
            r8.callPeerPlatform = r0
            r0 = r24
            r8.callPeerAppVersion = r0
            X.0ve r2 = r7.A07
            r0 = 11689(0x2da9, float:1.638E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0094
            r8.connectedToVpnAtCallStart = r10
        L_0x0094:
            r0 = 9674(0x25ca, float:1.3556E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00a2
            r0 = r17
            if (r17 == 0) goto L_0x00a2
            r8.busyReason = r0
        L_0x00a2:
            r1 = 0
            if (r9 == 0) goto L_0x0140
            X.1Rj r0 = r7.A0E
            long r5 = r0.A07(r9)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0140
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            r8.peerXmppStatus = r4
        L_0x00b8:
            if (r12 == 0) goto L_0x00c4
            long r0 = r12.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.callAndroidAudioMode = r0
        L_0x00c4:
            if (r13 == 0) goto L_0x00c8
            r8.ringerMode = r13
        L_0x00c8:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r8.androidApiLevel = r0
            X.A99 r1 = r7.A04
            android.content.Context r0 = r1.A1r
            int r0 = X.C41371wF.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.googlePlayServicesStatus = r0
            X.0z4 r1 = r1.A2f
            java.lang.String r0 = r1.A0e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.hasFbnsPushToken = r0
            java.lang.String r0 = r1.A0g()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.hasFcmPushToken = r0
            r8.offerPushProvider = r15
            r0 = r16
            r8.callTrigger = r0
            r0 = r20
            r8.firstOfferPushReceivedSinceCallInitiationMs = r0
            r0 = r21
            r8.firstOfferPushSentByPushdSinceCallInitiationMs = r0
            r0 = r22
            r8.firstOfferPushSentByProviderSinceCallInitiationMs = r0
            r0 = r18
            r8.firstOfferPushDeliveredPriority = r0
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r1)
            java.lang.String r0 = "push:most_recent_push_received_ts"
            r1 = -1
            long r3 = r3.getLong(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            X.11P r0 = r7.A0D
            long r0 = X.AnonymousClass11P.A01(r0)
            long r0 = r0 - r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.timeSinceLastPushReceivedMs = r0
        L_0x0133:
            if (r25 == 0) goto L_0x013b
            java.lang.String r0 = r25.toString()
            r8.networkReachabilityResult = r0
        L_0x013b:
            return
        L_0x013c:
            r8.peerXmppStatus = r3
            goto L_0x00b8
        L_0x0140:
            java.lang.Integer r0 = X.C17880vN.A0k()
            r8.peerXmppStatus = r0
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58162kF.A00(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.jid.UserJid, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.StringBuilder):void");
    }
}

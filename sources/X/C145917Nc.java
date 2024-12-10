package X;

/* renamed from: X.7Nc  reason: invalid class name and case insensitive filesystem */
public class C145917Nc implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;

    public C145917Nc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x031b, code lost:
        r2.CGF(new X.C146807Qr(r4, r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0323, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034d, code lost:
        r0.A04(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0350, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x045a, code lost:
        r5.A0J(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x045d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0195, code lost:
        r1.A01(r0);
        r3.notifyAllObservers(new X.AnonymousClass7KO((r3.A0A.incrementAndGet() * 100) / 3, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x043b;
                case 1: goto L_0x042f;
                case 2: goto L_0x0187;
                case 3: goto L_0x0178;
                case 4: goto L_0x0169;
                case 5: goto L_0x0153;
                case 6: goto L_0x040e;
                case 7: goto L_0x03ff;
                case 8: goto L_0x03ce;
                case 9: goto L_0x03a4;
                case 10: goto L_0x0351;
                case 11: goto L_0x0145;
                case 12: goto L_0x0343;
                case 13: goto L_0x0338;
                case 14: goto L_0x032b;
                case 15: goto L_0x02f9;
                case 16: goto L_0x02b0;
                case 17: goto L_0x02a3;
                case 18: goto L_0x012e;
                case 19: goto L_0x0096;
                case 20: goto L_0x0059;
                case 21: goto L_0x0225;
                case 22: goto L_0x0447;
                case 23: goto L_0x0219;
                case 24: goto L_0x0205;
                case 25: goto L_0x000d;
                case 26: goto L_0x01f7;
                case 27: goto L_0x01e0;
                case 28: goto L_0x01d8;
                case 29: goto L_0x01ac;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.6Ms r0 = (X.C122086Ms) r0
            X.C122086Ms.A00(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r12.A01
            X.6hT r4 = (X.C129236hT) r4
            X.2fe r13 = (X.C55362fe) r13
            X.C18070vi.A0h(r4, r13)
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "StatusMediaGeneratorHelper/transcodeVideo process media request failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.ref.WeakReference r0 = r4.A03
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x000c
            X.6ws r2 = r4.A02
            X.6cp r1 = r4.A01
            X.1KB r5 = r2.A01
            r0 = 1
            X.7RO r4 = new X.7RO
            r4.<init>(r2, r3, r1, r0)
            goto L_0x045a
        L_0x0035:
            java.io.File r1 = r13.A00
            if (r1 == 0) goto L_0x000c
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            X.C18070vi.A0X(r0)
            X.72S r3 = new X.72S
            r3.<init>(r0)
            r3.A0N(r1)
            java.lang.Integer r0 = X.C17880vN.A0j()
            r3.A0O(r0)
            X.6ws r2 = r4.A02
            java.lang.ref.WeakReference r1 = r4.A03
            X.206 r0 = r4.A00
            X.C138316ws.A00(r3, r0, r2, r1)
            return
        L_0x0059:
            java.lang.Object r8 = r12.A01
            X.7Rr r8 = (X.C147067Rr) r8
            long r4 = X.C17880vN.A05(r13)
            long r2 = r8.A01
            long r2 = r2 + r4
            r8.A01 = r2
            long r6 = r8.A02
            r10 = 0
            r9 = 100
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x008e
            r1 = 100
        L_0x0072:
            int r0 = r8.A00
            int r0 = r0 + 5
            if (r1 >= r0) goto L_0x007a
            if (r1 != r9) goto L_0x0081
        L_0x007a:
            r8.A00 = r1
            X.87M r0 = r8.A08
            r0.BsB(r2)
        L_0x0081:
            X.70W r6 = r8.A06
            if (r6 == 0) goto L_0x000c
            long r2 = r8.A01
            long r0 = r8.A03
            long r2 = r2 - r0
            r6.A0B(r2, r4)
            return
        L_0x008e:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = (float) r2
            float r1 = r1 * r0
            float r0 = (float) r6
            float r1 = r1 / r0
            int r1 = (int) r1
            goto L_0x0072
        L_0x0096:
            java.lang.Object r4 = r12.A01
            X.68m r4 = (X.C1195268m) r4
            X.1D6 r13 = (X.AnonymousClass1D6) r13
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r1 = r13.first
            X.2Ql r0 = X.C49432Ql.EXPRESS_PATH_MEDIA_AUTO
            if (r1 != r0) goto L_0x000c
            X.23f r3 = r4.A0B
            java.lang.String r2 = r3.A01
            java.lang.Object r0 = r13.second
            X.2fd r0 = (X.C55352fd) r0
            X.21V r0 = r0.A03
            java.lang.String r1 = r0.A08
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A09(r2, r1, r0)
            if (r0 == 0) goto L_0x000c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExpressPathDownload/found a matching media message "
            X.C17900vP.A0f(r0, r2, r1)
            java.lang.Object r0 = r13.second
            X.2fd r0 = (X.C55352fd) r0
            X.21V r0 = r0.A03
            r4.A01 = r0
            X.68q r2 = r4.A09
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "ExpressPathMediaDownloadStat/onPairedDownloadSubscribe get called more than once"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d5:
            X.10I r5 = r4.A0C
            long r2 = r3.A00
            X.1SK r1 = r4.A06
            r0 = 1
            java.lang.Float r0 = r1.BNL(r0)
            if (r0 == 0) goto L_0x011a
            float r1 = r0.floatValue()
            float r0 = (float) r2
            float r0 = r0 / r1
            long r2 = (long) r0
        L_0x00e9:
            X.0ve r6 = r4.A04
            r1 = 6575(0x19af, float:9.214E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r6, r1)
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
            long r2 = java.lang.Math.max(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExpressPathDownload/wait "
            X.C17900vP.A0m(r0, r1, r2)
            r1 = 34
            X.7RA r0 = new X.7RA
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.25d r0 = r5.CGv(r0, r2)
            r4.A02 = r0
            return
        L_0x011a:
            r0 = 300(0x12c, double:1.48E-321)
            long r2 = r2 / r0
            goto L_0x00e9
        L_0x011e:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            long r0 = r2.A06()
            r2.A00 = r0
            r0 = 1
            r2.A02 = r0
            goto L_0x00d5
        L_0x012e:
            java.lang.Object r1 = r12.A01
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            X.206 r13 = (X.AnonymousClass206) r13
            X.C18070vi.A0h(r1, r13)
            boolean r0 = r13 instanceof X.AnonymousClass21V
            if (r0 != 0) goto L_0x000c
            X.36w r0 = X.C60502o8.A00(r13)
            if (r0 == 0) goto L_0x000c
            r1.add(r13)
            return
        L_0x0145:
            java.lang.Object r1 = r12.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r0 = X.AnonymousClass000.A1Y(r13)
            if (r0 == 0) goto L_0x000c
            r1.run()
            return
        L_0x0153:
            java.lang.Object r1 = r12.A01
            com.whatsapp.companiondevice.sync.HistorySyncWorker r1 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r1
            java.util.Map r13 = (java.util.Map) r13
            r1.A02 = r13
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            boolean r0 = r13.containsValue(r0)
            if (r0 == 0) goto L_0x000c
            com.whatsapp.companiondevice.sync.HistorySyncWorker.A01(r1)
            return
        L_0x0169:
            java.lang.Object r3 = r12.A01
            X.2Km r3 = (X.C47922Km) r3
            X.2Ri r13 = (X.C49652Ri) r13
            boolean r0 = r13 instanceof X.C46192Dn
            if (r0 == 0) goto L_0x000c
            X.A15 r1 = r3.A08
            java.lang.String r0 = "cmp_crit_sec_notif_comp"
            goto L_0x0195
        L_0x0178:
            java.lang.Object r3 = r12.A01
            X.2Km r3 = (X.C47922Km) r3
            X.2Ri r13 = (X.C49652Ri) r13
            boolean r0 = r13 instanceof X.C46192Dn
            if (r0 == 0) goto L_0x000c
            X.A15 r1 = r3.A08
            java.lang.String r0 = "cmp_crit_syncd_comp"
            goto L_0x0195
        L_0x0187:
            java.lang.Object r3 = r12.A01
            X.2Km r3 = (X.C47922Km) r3
            X.2Ri r13 = (X.C49652Ri) r13
            boolean r0 = r13 instanceof X.C46192Dn
            if (r0 == 0) goto L_0x000c
            X.A15 r1 = r3.A08
            java.lang.String r0 = "cmp_crit_hist_sync_comp"
        L_0x0195:
            r1.A01(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0A
            int r0 = r0.incrementAndGet()
            int r2 = r0 * 100
            r0 = 3
            int r2 = r2 / r0
            r1 = 1
            X.7KO r0 = new X.7KO
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x01ac:
            java.lang.Object r3 = r12.A01
            X.6Ms r3 = (X.C122086Ms) r3
            X.6r1 r13 = (X.C134706r1) r13
            org.json.JSONObject r1 = r3.A06
            if (r1 == 0) goto L_0x01d4
            java.lang.String r0 = "playerVars"
            java.lang.Object r2 = r1.get(r0)     // Catch:{ ClassCastException | JSONException -> 0x01ce }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ ClassCastException | JSONException -> 0x01ce }
            java.lang.String r1 = "rctn"
            java.lang.String r0 = r13.A01     // Catch:{ ClassCastException | JSONException -> 0x01ce }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ ClassCastException | JSONException -> 0x01ce }
            java.lang.String r1 = "rct"
            java.lang.String r0 = r13.A00     // Catch:{ ClassCastException | JSONException -> 0x01ce }
            r2.put(r1, r0)     // Catch:{ ClassCastException | JSONException -> 0x01ce }
            goto L_0x01d4
        L_0x01ce:
            r1 = move-exception
            java.lang.String r0 = "InlineYoutubeVideoPlayer/addCounterAbuseDataIfNeeded"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01d4:
            X.C122086Ms.A00(r3)
            return
        L_0x01d8:
            java.lang.Object r0 = r12.A01
            X.1Sf r0 = (X.C26461Sf) r0
            r0.A08(r13)
            return
        L_0x01e0:
            java.lang.Object r2 = r12.A01
            X.2bF r2 = (X.C52642bF) r2
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r0 = X.C18070vi.A15(r2, r13)
            java.util.ArrayList r1 = X.C29351c6.A0F(r13)
            X.C18070vi.A0d(r1, r0)
            X.Af0 r0 = r2.A00
            r0.A0B(r1)
            return
        L_0x01f7:
            java.lang.Object r1 = r12.A01
            X.2bF r1 = (X.C52642bF) r1
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.Af0 r0 = r1.A00
            r0.A0B(r13)
            return
        L_0x0205:
            java.lang.Object r1 = r12.A01
            X.1Di r1 = (X.C22821Di) r1
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            java.lang.String r0 = "AlbumArtworkDirectDownloader/download error"
            com.whatsapp.util.Log.e(r0, r13)
            r0 = 0
            r1.invoke(r0)
            return
        L_0x0219:
            java.lang.Object r1 = r12.A01
            X.1Di r1 = (X.C22821Di) r1
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            r1.invoke(r13)
            return
        L_0x0225:
            java.lang.Object r3 = r12.A01
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            android.net.Uri r13 = (android.net.Uri) r13
            X.1KB r0 = r3.A0F
            r0.A04()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.C108945cZ.A0G(r0)
            java.lang.String r0 = "video/*"
            r2.setDataAndType(r13, r0)
            r0 = 1
            r2.setFlags(r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Sony"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0292
            X.1FL r0 = r3.A1D()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 0
            java.util.List r0 = r1.queryIntentActivities(r2, r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x025a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0292
            java.lang.Object r5 = r6.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaViewFragment/launchExternalVideoPlayer/share"
            r4.append(r0)
            android.content.pm.ActivityInfo r1 = r5.activityInfo
            java.lang.String r0 = r1.packageName
            r4.append(r0)
            java.lang.String r0 = " | "
            r4.append(r0)
            java.lang.String r0 = r1.name
            X.C17890vO.A1A(r4, r0)
            android.content.pm.ActivityInfo r0 = r5.activityInfo
            java.lang.String r0 = r0.name
            java.lang.String r1 = "com.sonyericsson.gallery.MovieView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x025a
            java.lang.String r0 = "com.sonyericsson.gallery"
            r2.setClassName(r0, r1)
            goto L_0x025a
        L_0x0292:
            android.content.Context r1 = r3.A14()
            X.8Aj r0 = r3.A0m
            if (r0 == 0) goto L_0x029d
            r0.Byw()
        L_0x029d:
            X.1L9 r0 = r3.A0D
            r0.A08(r1, r2)
            return
        L_0x02a3:
            java.lang.Object r0 = r12.A01
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.String r13 = (java.lang.String) r13
            X.2rc r0 = X.AnonymousClass206.A00(r0)
            r0.A0L = r13
            return
        L_0x02b0:
            java.lang.Object r4 = r12.A01
            X.5ti r4 = (X.C115295ti) r4
            boolean r0 = r13 instanceof java.io.IOException
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x02dc
            r0 = 9
            X.73o r5 = new X.73o
            r5.<init>(r0, r3, r2)
            X.0ve r2 = r4.A0Q
            r1 = 7091(0x1bb3, float:9.937E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02d2
            X.10I r2 = r4.A0v
            r1 = 26
            goto L_0x031b
        L_0x02d2:
            X.C115295ti.A04(r5, r4, r3)
            r4.A0H(r5)
            X.C115295ti.A03(r5, r4)
            return
        L_0x02dc:
            boolean r0 = r13 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x02eb
            r0 = 13
            X.73o r1 = new X.73o
            r1.<init>(r0, r3, r2)
        L_0x02e7:
            X.C115295ti.A03(r1, r4)
            return
        L_0x02eb:
            r0 = 35
            X.73o r1 = new X.73o
            r1.<init>(r0, r3, r2)
            X.C115295ti.A04(r1, r4, r3)
            r4.A0H(r1)
            goto L_0x02e7
        L_0x02f9:
            java.lang.Object r4 = r12.A01
            X.5ti r4 = (X.C115295ti) r4
            X.6zF r0 = r4.A0e
            X.C139666zF.A00(r0)
            r1 = 0
            r0 = 13
            r3 = 0
            X.73o r5 = new X.73o
            r5.<init>(r0, r3, r1)
            X.0ve r2 = r4.A0Q
            r1 = 7091(0x1bb3, float:9.937E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0324
            X.10I r2 = r4.A0v
            r1 = 28
        L_0x031b:
            X.7Qr r0 = new X.7Qr
            r0.<init>(r4, r5, r1)
            r2.CGF(r0)
            return
        L_0x0324:
            X.C115295ti.A04(r5, r4, r3)
            r4.A0H(r5)
            return
        L_0x032b:
            java.lang.Object r0 = r12.A01
            X.5ti r0 = (X.C115295ti) r0
            X.73o r13 = (X.C1409173o) r13
            r0.A0H(r13)
            X.C115295ti.A03(r13, r0)
            return
        L_0x0338:
            java.lang.Object r1 = r12.A01
            X.34B r1 = (X.AnonymousClass34B) r1
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.1TJ r0 = r1.A0E
            goto L_0x034d
        L_0x0343:
            java.lang.Object r1 = r12.A01
            X.34B r1 = (X.AnonymousClass34B) r1
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.1TJ r0 = r1.A0I
        L_0x034d:
            r0.A04(r13)
            return
        L_0x0351:
            java.lang.Object r3 = r12.A01
            X.11w r3 = (X.C203711w) r3
            X.2Ri r13 = (X.C49652Ri) r13
            boolean r0 = r13 instanceof X.C46192Dn
            if (r0 == 0) goto L_0x0389
            r1 = 8
            X.1Dn r0 = r3.A0P
            r0.A01(r1)
            X.00H r1 = r3.A0r
            java.lang.Object r0 = r1.get()
            X.7Mz r0 = (X.C145887Mz) r0
            r0.A02()
            java.lang.Object r0 = r1.get()
            X.7Mz r0 = (X.C145887Mz) r0
            r4 = 0
            X.10I r1 = r0.A07
            java.lang.Runnable r0 = r0.A0A
            r1.CGv(r0, r4)
            X.A15 r1 = r3.A0h
            java.lang.String r0 = "cmp_reg_complete"
            r1.A01(r0)
            r0 = 9
            X.AnonymousClass7KX.A00(r3, r0)
            return
        L_0x0389:
            X.5yg r13 = (X.C116825yg) r13
            X.A15 r2 = r3.A0h
            java.lang.Throwable r0 = r13.A00
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "companion_critical_sync_timeout"
            r2.A02(r0, r1)
            java.lang.String r0 = "companion/registration/onRegistrationSuccess critical bootstrap fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "critical_sync_timeout"
            r0 = 1
            r3.A0A(r1, r0, r0)
            return
        L_0x03a4:
            java.lang.Object r5 = r12.A01
            X.11w r5 = (X.C203711w) r5
            int r3 = X.AnonymousClass000.A0M(r13)
            X.A15 r2 = r5.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Code="
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.lang.String r0 = "companion_hello_error_with_code"
            r2.A02(r0, r1)
            long r3 = (long) r3
            r1 = 429(0x1ad, double:2.12E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03ca
            r0 = 11
            X.AnonymousClass7KX.A00(r5, r0)
            return
        L_0x03ca:
            r5.A05()
            return
        L_0x03ce:
            java.lang.Object r4 = r12.A01
            X.11w r4 = (X.C203711w) r4
            java.lang.String r0 = "companion/registration/companion-hello/received IQ response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0t
            r0.set(r13)
            X.1Dn r1 = r4.A0P
            r0 = 12
            r1.A01(r0)
            java.lang.Runnable r1 = r4.A0B
            if (r1 == 0) goto L_0x03ec
            X.10I r0 = r4.A0i
            r0.CEz(r1)
        L_0x03ec:
            X.10I r3 = r4.A0i
            r0 = 14
            X.7Pc r2 = new X.7Pc
            r2.<init>(r4, r0)
            r0 = 195000(0x2f9b8, double:9.6343E-319)
            X.25d r0 = r3.CGv(r2, r0)
            r4.A0B = r0
            return
        L_0x03ff:
            java.lang.Object r0 = r12.A01
            X.1lk r0 = (X.C35161lk) r0
            X.1ll r1 = r0.A01
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x040b }
            monitor-exit(r1)
            return
        L_0x040b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x040e:
            java.lang.Object r2 = r12.A01
            X.1lA r2 = (X.C34841lA) r2
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            X.1Co r1 = r2.A08
            r0 = 0
            X.C22621Co.A02(r1, r0)
            X.1To r0 = r2.A04
            X.10I r3 = r0.A0W
            X.1S3 r2 = r0.A0K
            r2.getClass()
            r1 = 2
            X.7Pc r0 = new X.7Pc
            r0.<init>(r2, r1)
            r3.CGF(r0)
            return
        L_0x042f:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            X.1dr r0 = (X.C30391dr) r0
            r0.resumeWith(r13)
            return
        L_0x043b:
            java.lang.Object r1 = r12.A01
            X.5bn r1 = (X.C108495bn) r1
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            r1.CQ0(r13)
            return
        L_0x0447:
            java.lang.Object r1 = r12.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.String r13 = (java.lang.String) r13
            r0 = 1
            X.C18070vi.A0d(r13, r0)
            X.1KB r5 = r1.A05
            r0 = 43
            X.7Qs r4 = new X.7Qs
            r4.<init>(r0, r13, r1)
        L_0x045a:
            r5.A0J(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145917Nc.accept(java.lang.Object):void");
    }
}

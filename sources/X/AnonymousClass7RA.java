package X;

/* renamed from: X.7RA  reason: invalid class name */
public class AnonymousClass7RA implements Runnable {
    public final int A00;
    public final Object A01;

    public AnonymousClass7RA(C143087By r1, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
                this.A01 = r1;
                return;
            default:
                this.A01 = r1;
                return;
        }
    }

    public static void A00(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new AnonymousClass7RA(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0468, code lost:
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x046c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0522, code lost:
        r1.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0525, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05a6, code lost:
        com.whatsapp.location.LocationSharingService.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x064b, code lost:
        r3.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x064e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0694, code lost:
        r0.postDelayed(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0697, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        r3.BhU(new java.lang.Object[0], r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01af, code lost:
        if (r3 == 15) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01da, code lost:
        if (r9 >= r6.A05()) goto L_0x01dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r8 = r16
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0657;
                case 1: goto L_0x02b8;
                case 2: goto L_0x064f;
                case 3: goto L_0x0635;
                case 4: goto L_0x0607;
                case 5: goto L_0x05e1;
                case 6: goto L_0x05c8;
                case 7: goto L_0x05be;
                case 8: goto L_0x05b2;
                case 9: goto L_0x05b2;
                case 10: goto L_0x05aa;
                case 11: goto L_0x0263;
                case 12: goto L_0x059f;
                case 13: goto L_0x0597;
                case 14: goto L_0x058d;
                case 15: goto L_0x067f;
                case 16: goto L_0x0578;
                case 17: goto L_0x0249;
                case 18: goto L_0x0564;
                case 19: goto L_0x01f0;
                case 20: goto L_0x054e;
                case 21: goto L_0x0546;
                case 22: goto L_0x0532;
                case 23: goto L_0x0526;
                case 24: goto L_0x051a;
                case 25: goto L_0x00c2;
                case 26: goto L_0x009b;
                case 27: goto L_0x0512;
                case 28: goto L_0x007a;
                case 29: goto L_0x050a;
                case 30: goto L_0x0564;
                case 31: goto L_0x04fc;
                case 32: goto L_0x04f0;
                case 33: goto L_0x04f0;
                case 34: goto L_0x04e7;
                case 35: goto L_0x04df;
                case 36: goto L_0x04d6;
                case 37: goto L_0x0007;
                case 38: goto L_0x04bc;
                case 39: goto L_0x0496;
                case 40: goto L_0x0007;
                case 41: goto L_0x0062;
                case 42: goto L_0x0486;
                case 43: goto L_0x046d;
                case 44: goto L_0x045d;
                case 45: goto L_0x0428;
                case 46: goto L_0x03ff;
                case 47: goto L_0x03eb;
                case 48: goto L_0x000d;
                case 49: goto L_0x03e6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r8.A01
            X.C108945cZ.A1Q(r0)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r7 = r8.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r7 = (com.whatsapp.mediacomposer.VideoComposerFragment) r7
            X.70X r0 = r7.A0W
            if (r0 == 0) goto L_0x000c
            int r0 = r0.A05()
            long r5 = (long) r0
            long r3 = r7.A07
            r1 = 50
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004f
            boolean r0 = r7.A0g
            if (r0 != 0) goto L_0x003a
            boolean r0 = com.whatsapp.mediacomposer.VideoComposerFragment.A0F(r7)
            if (r0 != 0) goto L_0x003a
            r7.A2T()
        L_0x002f:
            X.70X r3 = r7.A0W
            if (r3 == 0) goto L_0x000c
            long r1 = r7.A06
            int r0 = (int) r1
            r3.A0M(r0)
            return
        L_0x003a:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r7.A0Q
            if (r0 == 0) goto L_0x0041
            r0.invalidate()
        L_0x0041:
            X.70X r0 = r7.A0W
            if (r0 == 0) goto L_0x002f
            android.view.View r0 = r0.A09()
            if (r0 == 0) goto L_0x002f
            r0.postDelayed(r8, r1)
            goto L_0x002f
        L_0x004f:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r7.A0Q
            if (r0 == 0) goto L_0x0056
            r0.invalidate()
        L_0x0056:
            X.70X r0 = r7.A0W
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r0.A09()
            if (r0 == 0) goto L_0x000c
            goto L_0x0694
        L_0x0062:
            java.lang.Object r0 = r8.A01
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = (com.whatsapp.mediacomposer.MediaComposerFragment) r0
            X.7JF r2 = r0.A0J
            if (r2 == 0) goto L_0x000c
            X.6yX r0 = r2.A0R
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x000c
            X.6uj r1 = r2.A0W
            r0 = 1
            r1.A07(r0)
            r2.A09()
            return
        L_0x007a:
            java.lang.Object r0 = r8.A01
            X.7Ek r0 = (X.AnonymousClass7Ek) r0
            android.app.Activity r3 = r0.A00
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x000c
            X.C17960vV.A07(r3)
            X.1FR r3 = (X.AnonymousClass1FR) r3
            r2 = 2131889562(0x7f120d9a, float:1.9413791E38)
            boolean r0 = X.AnonymousClass11Z.A00()
            r1 = 2131888975(0x7f120b4f, float:1.94126E38)
            if (r0 == 0) goto L_0x00bb
            r1 = 2131888974(0x7f120b4e, float:1.9412598E38)
            goto L_0x00bb
        L_0x009b:
            java.lang.Object r0 = r8.A01
            X.7Ek r0 = (X.AnonymousClass7Ek) r0
            android.app.Activity r3 = r0.A00
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x000c
            X.C17960vV.A07(r3)
            X.1FR r3 = (X.AnonymousClass1FR) r3
            r2 = 2131889562(0x7f120d9a, float:1.9413791E38)
            boolean r0 = X.AnonymousClass11Z.A00()
            r1 = 2131888977(0x7f120b51, float:1.9412605E38)
            if (r0 == 0) goto L_0x00bb
            r1 = 2131888976(0x7f120b50, float:1.9412603E38)
        L_0x00bb:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.BhU(r0, r2, r1)
            return
        L_0x00c2:
            java.lang.Object r0 = r8.A01
            X.5ti r0 = (X.C115295ti) r0
            X.1h6 r8 = r0.A0V
            X.6zF r7 = r0.A0e
            X.70W r6 = r0.A0k
            X.2h4 r2 = r0.A01
            X.0ve r5 = r8.A01
            r1 = 5367(0x14f7, float:7.521E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = r6.A0Y
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x000c
            X.1SU r0 = r8.A04
            X.0vt r0 = r0.A03
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x000c
            X.64I r4 = new X.64I
            r4.<init>()
            r4.A0E = r1
            if (r2 != 0) goto L_0x01de
            r2 = 0
        L_0x00f7:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A0D = r0
            int r1 = r6.A00
            boolean r0 = r7.A0a
            int r0 = X.C1409973w.A02(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A04 = r0
            long r0 = r6.A05()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r2 = X.C1409973w.A04(r0)
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            long r0 = r6.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0A = r0
            long r0 = r6.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C1409973w.A04(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0B = r0
            java.lang.Boolean r0 = r6.A0I
            r4.A00 = r0
            long r0 = r7.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r2 = X.C1409973w.A04(r0)
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A03 = r0
            X.11E r0 = r8.A00
            X.1LR r0 = r0.A04()
            java.lang.Integer r0 = X.AnonymousClass1LS.A00(r0)
            r4.A05 = r0
            java.lang.String r1 = r7.A0F
            java.lang.String r0 = r7.A0L
            int r0 = r8.A01(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A06 = r0
            java.lang.Boolean r1 = r6.A0L
            X.73o r0 = r6.A0H
            int r3 = X.C32381h6.A00(r5, r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.A07 = r0
            int r0 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A09 = r0
            long r0 = r6.A0B
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r9 = X.C1409973w.A04(r0)
            double r0 = (double) r9
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A02 = r0
            long r0 = r6.A0C
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.C1409973w.A04(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0C = r0
            boolean r0 = r6.A0f
            if (r0 != 0) goto L_0x01c1
            r1 = 4
        L_0x01a3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x01a7:
            r4.A08 = r0
            r0 = 1
            if (r3 == r0) goto L_0x01b1
            r0 = 15
            r1 = 1
            if (r3 != r0) goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            X.18K r0 = r8.A02
            if (r1 == 0) goto L_0x01bd
            X.C108965cb.A1E(r4, r0)
        L_0x01b9:
            r0.Bio()
            return
        L_0x01bd:
            r0.CC7(r4)
            goto L_0x01b9
        L_0x01c1:
            long r9 = r6.A0B
            long r1 = r6.A05()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01cd
            r1 = 3
            goto L_0x01a3
        L_0x01cd:
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01dc
            long r1 = r6.A05()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r1 = 2
            if (r0 < 0) goto L_0x01a3
        L_0x01dc:
            r0 = 0
            goto L_0x01a7
        L_0x01de:
            java.lang.String r0 = r2.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r2 = r0.getLeastSignificantBits()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            goto L_0x00f7
        L_0x01f0:
            java.lang.Object r2 = r8.A01
            X.1j3 r2 = (X.C33581j3) r2
            X.11E r0 = r2.A01
            r1 = 1
            int r0 = r0.A03(r1)
            X.1hA r4 = r2.A07
            X.7Nd r3 = new X.7Nd
            r3.<init>(r2, r0, r1)
            X.2KB r0 = r4.A00()
            r0.A06(r3)
            X.00H r2 = r4.A04
            boolean r0 = X.C72453Mb.A1X(r2)
            if (r0 == 0) goto L_0x000c
            X.1c4 r1 = X.C108955ca.A0W(r2)
            r0 = 3
            boolean r0 = X.AnonymousClass1c4.A00(r1, r0)
            if (r0 != 0) goto L_0x0227
            X.1c4 r1 = X.C108955ca.A0W(r2)
            r0 = 2
            boolean r0 = X.AnonymousClass1c4.A00(r1, r0)
            if (r0 == 0) goto L_0x000c
        L_0x0227:
            X.00H r0 = r4.A05
            java.lang.Object r0 = r0.get()
            X.1Sf r0 = (X.C26461Sf) r0
            java.util.HashSet r0 = r0.A05()
            java.util.Iterator r2 = r0.iterator()
        L_0x0237:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0237
            r3.accept(r1)
            goto L_0x0237
        L_0x0249:
            java.lang.Object r0 = r8.A01
            X.1NM r0 = (X.AnonymousClass1NM) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0253:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.86y r0 = (X.C1600586y) r0
            r0.C6W()
            goto L_0x0253
        L_0x0263:
            java.lang.Object r3 = r8.A01
            X.75M r3 = (X.AnonymousClass75M) r3
            r4 = 1
            r3.A0g = r4
            android.location.Location r1 = r3.A05
            if (r1 == 0) goto L_0x0283
            X.AEr r0 = r3.A0V
            if (r0 != 0) goto L_0x0283
            float r0 = r1.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r2 = java.lang.Math.max(r1, r0)
            android.location.Location r1 = r3.A05
            r0 = 0
            X.AnonymousClass75M.A04(r1, r3, r0, r2, r4)
        L_0x0283:
            X.17x r0 = r3.A19
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x000c
            android.location.Location r0 = r3.A05
            if (r0 == 0) goto L_0x0299
            float r1 = r0.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x000c
        L_0x0299:
            X.11C r0 = r3.A16
            android.location.LocationManager r1 = r0.A0C()
            if (r1 == 0) goto L_0x000c
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x02b1
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x000c
        L_0x02b1:
            X.01E r1 = r3.A0P
            r0 = 2
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x02b8:
            java.lang.Object r7 = r8.A01
            X.7By r7 = (X.C143087By) r7
            boolean r0 = r7.A1Z
            android.os.Handler r3 = r7.A0v
            java.lang.Runnable r2 = r7.A19
            if (r0 == 0) goto L_0x02ca
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x02ca:
            r3.removeCallbacks(r2)
            java.util.Map r2 = r7.A1D
            monitor-enter(r2)
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x067c }
            java.util.ArrayList r1 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x067c }
            r2.clear()     // Catch:{ all -> 0x067c }
            monitor-exit(r2)     // Catch:{ all -> 0x067c }
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000c
            X.C6N r6 = r7.A0L()
            if (r6 == 0) goto L_0x000c
            X.6hC r5 = r7.A0M
            java.util.List r9 = r7.A1B
            java.util.HashSet r8 = X.C17880vN.A12()
            java.util.Iterator r15 = r1.iterator()
        L_0x02f4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x065f
            java.lang.Object r10 = r15.next()
            X.2nL r10 = (X.C60072nL) r10
            X.C18070vi.A0h(r9, r10)
            java.util.Iterator r3 = r9.iterator()
        L_0x0307:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03dd
            java.lang.Object r4 = r3.next()
            X.6yC r4 = (X.C139086yC) r4
            java.util.List r11 = r4.A04
            java.util.Iterator r2 = r11.iterator()
        L_0x0319:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0307
            java.lang.Object r0 = r2.next()
            X.2nL r0 = (X.C60072nL) r0
            com.whatsapp.jid.UserJid r1 = r0.A06
            com.whatsapp.jid.UserJid r0 = r10.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0319
            int r0 = r4.A00
            r3 = 1
            if (r0 == r3) goto L_0x03e1
            X.1Ur r2 = r5.A02
            long r0 = r10.A05
            X.11P r2 = r2.A03
            long r12 = X.AnonymousClass11P.A01(r2)
            long r12 = r12 - r0
            r1 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            int r0 = r4.A01
            if (r0 == r3) goto L_0x034d
            r3 = 0
        L_0x034d:
            if (r1 != r3) goto L_0x03dd
            int r1 = r11.size()
            r0 = 1
            if (r1 == r0) goto L_0x038f
            double r2 = r10.A00
            double r0 = r10.A01
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r10.<init>(r2, r0)
            android.graphics.Point r14 = r6.A00(r10)
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r13 = r6.A00(r0)
            int r1 = r14.x
            int r0 = r13.x
            int r0 = X.C108945cZ.A05(r1, r0)
            double r2 = (double) r0
            float r0 = r5.A00
            double r0 = (double) r0
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x03dd
            int r1 = r14.y
            int r0 = r13.y
            int r0 = X.C108945cZ.A05(r1, r0)
            double r2 = (double) r0
            float r0 = r5.A01
            double r0 = (double) r0
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x03dd
        L_0x038f:
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r2 = r6.A00(r0)
            java.util.Iterator r11 = r9.iterator()
        L_0x039b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03e1
            java.lang.Object r10 = r11.next()
            X.6yC r10 = (X.C139086yC) r10
            if (r10 == r4) goto L_0x039b
            java.util.List r0 = r10.A04
            int r3 = r0.size()
            r0 = 2
            r1 = 1
            if (r3 > r0) goto L_0x03b7
            int r0 = r10.A00
            if (r1 == r0) goto L_0x039b
        L_0x03b7:
            com.google.android.gms.maps.model.LatLng r0 = r10.A00()
            android.graphics.Point r3 = r6.A00(r0)
            int r1 = r3.x
            int r0 = r2.x
            int r0 = X.C108945cZ.A05(r1, r0)
            float r1 = (float) r0
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x039b
            int r1 = r3.y
            int r0 = r2.y
            int r0 = X.C108945cZ.A05(r1, r0)
            float r1 = (float) r0
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x039b
        L_0x03dd:
            X.C143087By.A06(r7)
            return
        L_0x03e1:
            r8.add(r4)
            goto L_0x02f4
        L_0x03e6:
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
            goto L_0x0468
        L_0x03eb:
            java.lang.Object r2 = r8.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            X.7JN r0 = r2.A0a
            X.7J3 r0 = r0.A0B
            X.5l1 r1 = r0.A09
            r0 = 1
            r1.A00 = r0
            r1.notifyDataSetChanged()
            r0 = 0
            r2.A1N = r0
            return
        L_0x03ff:
            java.lang.Object r3 = r8.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = (com.whatsapp.mediacomposer.MediaComposerActivity) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            X.73D r0 = r3.A1q
            android.os.Bundle r1 = X.C17880vN.A0D()
            X.AnonymousClass73D.A01(r1, r0)
            java.lang.String r0 = "media_preview_params"
            r2.putExtra(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7JS.A02(r3)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r0, r1)
            r0 = -1
            r3.A01 = r0
            r3.setResult(r0, r2)
            r3.finish()
            return
        L_0x0428:
            java.lang.Object r1 = r8.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            X.18K r2 = r1.A0P
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            r10 = 1
            X.C18070vi.A0d(r2, r10)
            X.72S r0 = com.whatsapp.mediacomposer.MediaComposerActivity.A0c(r1)
            X.71x r0 = r0.A07()
            if (r0 != 0) goto L_0x0454
            r6 = 0
            r8 = 0
        L_0x0442:
            X.6tV r3 = r1.A0o
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            X.AnonymousClass6XK.A00(r2, r3, r4, r5, r6, r8, r10)
            X.1KB r3 = r1.A05
            r0 = 42
            X.7RA r2 = new X.7RA
            r2.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x064b
        L_0x0454:
            long r6 = r0.A03
            java.io.File r0 = r0.A05
            long r8 = r0.length()
            goto L_0x0442
        L_0x045d:
            java.lang.Object r1 = r8.A01
            X.01E r1 = (X.AnonymousClass01E) r1
            r0 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x0468:
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x046d:
            java.lang.Object r3 = r8.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = (com.whatsapp.mediacomposer.MediaComposerActivity) r3
            X.1Sl r1 = r3.A0u
            java.util.Collection r2 = r3.A1v
            X.73D r0 = r3.A1q
            java.util.ArrayList r0 = r0.A04()
            X.C26521Sl.A0a(r1, r2, r0)
            X.1Sl r1 = r3.A0u
            java.util.HashSet r0 = r3.A1x
            X.C26521Sl.A0a(r1, r2, r0)
            return
        L_0x0486:
            java.lang.Object r2 = r8.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r2.finish()
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            r0 = 17432577(0x10a0001, float:2.53466E-38)
            r2.overridePendingTransition(r1, r0)
            return
        L_0x0496:
            java.lang.Object r3 = r8.A01
            X.6kU r3 = (X.C131086kU) r3
            android.view.View r2 = r3.A05
            r0 = 1962934272(0x75000000, float:1.6225928E32)
            r2.setBackgroundColor(r0)
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x04b4
            android.widget.TextView r1 = r3.A0A
            r0 = -1291845633(0xffffffffb2ffffff, float:-2.980232E-8)
            r1.setTextColor(r0)
            android.graphics.drawable.Drawable r1 = r3.A03
            r0 = 178(0xb2, float:2.5E-43)
            r1.setAlpha(r0)
        L_0x04b4:
            android.view.animation.AlphaAnimation r0 = X.C72463Mc.A0Q()
            X.C108985cd.A11(r2, r0)
            return
        L_0x04bc:
            java.lang.Object r0 = r8.A01
            X.8ff r0 = (X.C167228ff) r0
            X.9dV r4 = r0.A0e
            X.99o r3 = r0.A02
            X.C17960vV.A07(r3)
            X.9kM r2 = r0.A01
            X.C17960vV.A07(r2)
            r1 = 1
            X.AVU r0 = new X.AVU
            r0.<init>(r4, r3, r1)
            r2.A00(r0)
            return
        L_0x04d6:
            java.lang.Object r0 = r8.A01
            X.73e r0 = (X.C1408173e) r0
            X.1SS r1 = r0.A0L
            X.2h4 r0 = r0.A0K
            goto L_0x0522
        L_0x04df:
            java.lang.Object r0 = r8.A01
            com.whatsapp.media.download.service.MediaDownloadJobService r0 = (com.whatsapp.media.download.service.MediaDownloadJobService) r0
            com.whatsapp.media.download.service.MediaDownloadJobService.A06(r0)
            return
        L_0x04e7:
            java.lang.Object r1 = r8.A01
            X.7RU r1 = (X.AnonymousClass7RU) r1
            r0 = 0
            X.AnonymousClass7RU.A01(r1, r0)
            return
        L_0x04f0:
            java.lang.Object r0 = r8.A01
            X.68m r0 = (X.C1195268m) r0
            X.1j3 r1 = r0.A08
            X.2Ql r0 = X.C49432Ql.EXPRESS_PATH_MEDIA_AUTO
            r1.A02(r0)
            return
        L_0x04fc:
            java.lang.Object r0 = r8.A01
            X.1hB r0 = (X.C32431hB) r0
            X.11C r1 = r0.A06
            X.118 r0 = r0.A07
            android.content.Context r0 = r0.A00
            X.C123866Wd.A00(r0, r1)
            return
        L_0x050a:
            java.lang.Object r0 = r8.A01
            X.7Ek r0 = (X.AnonymousClass7Ek) r0
            r0.A00()
            return
        L_0x0512:
            java.lang.Object r0 = r8.A01
            X.7Ek r0 = (X.AnonymousClass7Ek) r0
            r0.A01()
            return
        L_0x051a:
            java.lang.Object r0 = r8.A01
            X.5ti r0 = (X.C115295ti) r0
            X.1SS r1 = r0.A0b
            X.2h4 r0 = r0.A01
        L_0x0522:
            r1.A04(r0)
            return
        L_0x0526:
            java.lang.Object r0 = r8.A01
            X.5ti r0 = (X.C115295ti) r0
            X.1SS r1 = r0.A0b
            X.2h4 r0 = r0.A01
            r1.A05(r0)
            return
        L_0x0532:
            java.lang.Object r0 = r8.A01
            X.5ti r0 = (X.C115295ti) r0
            java.io.File r1 = r0.A02
            if (r1 == 0) goto L_0x0540
            X.17r r0 = r0.A0B
            X.C115295ti.A08(r0, r1)
            return
        L_0x0540:
            java.lang.String r0 = "MediaDownload/deleteDownloadFileLegacyFlow/download file is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0546:
            java.lang.Object r0 = r8.A01
            X.5ti r0 = (X.C115295ti) r0
            X.C115295ti.A05(r0)
            return
        L_0x054e:
            java.lang.Object r2 = r8.A01
            X.1j3 r2 = (X.C33581j3) r2
            java.util.ArrayList r1 = r2.A0A
            monitor-enter(r1)
            java.util.ArrayList r0 = X.C17880vN.A10(r1)     // Catch:{ all -> 0x0561 }
            r1.clear()     // Catch:{ all -> 0x0561 }
            monitor-exit(r1)     // Catch:{ all -> 0x0561 }
            X.C33581j3.A01(r2, r0)
            return
        L_0x0561:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0561 }
            throw r0
        L_0x0564:
            java.lang.Object r2 = r8.A01
            X.BC9 r2 = (X.BC9) r2
            r0 = 8
            X.73o r1 = new X.73o
            r1.<init>(r0)
            X.6uk r0 = new X.6uk
            r0.<init>()
            r2.BsD(r1, r0)
            return
        L_0x0578:
            java.lang.Object r2 = r8.A01
            com.whatsapp.loginfailure.PCRLogoutMessageActivity r2 = (com.whatsapp.loginfailure.PCRLogoutMessageActivity) r2
            X.1o3 r1 = r2.A00
            if (r1 == 0) goto L_0x0586
            java.lang.String r0 = "post-compromise-recovery"
            r1.A01(r2, r0)
            return
        L_0x0586:
            java.lang.String r0 = "contextualHelpHandler"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x058d:
            java.lang.Object r0 = r8.A01
            com.whatsapp.location.LocationSharingService r0 = (com.whatsapp.location.LocationSharingService) r0
            X.1Uv r0 = r0.A0A
            r0.A0T()
            return
        L_0x0597:
            java.lang.Object r1 = r8.A01
            com.whatsapp.location.LocationSharingService r1 = (com.whatsapp.location.LocationSharingService) r1
            r0 = 0
            r1.A0I = r0
            goto L_0x05a6
        L_0x059f:
            java.lang.Object r1 = r8.A01
            com.whatsapp.location.LocationSharingService r1 = (com.whatsapp.location.LocationSharingService) r1
            r0 = 0
            r1.A0H = r0
        L_0x05a6:
            com.whatsapp.location.LocationSharingService.A04(r1)
            return
        L_0x05aa:
            java.lang.Object r0 = r8.A01
            X.75M r0 = (X.AnonymousClass75M) r0
            X.AnonymousClass75M.A08(r0)
            return
        L_0x05b2:
            java.lang.Object r0 = r8.A01
            X.7Ih r0 = (X.C144687Ih) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = (com.whatsapp.location.LiveLocationPrivacyActivity) r0
            com.whatsapp.location.LiveLocationPrivacyActivity.A03(r0)
            return
        L_0x05be:
            java.lang.Object r0 = r8.A01
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = (com.whatsapp.location.LiveLocationPrivacyActivity) r0
            X.1Uv r0 = r0.A09
            r0.A0O()
            return
        L_0x05c8:
            java.lang.Object r2 = r8.A01
            X.6jr r2 = (X.C130696jr) r2
            X.4UI r1 = r2.A06
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x05d8
            r0 = 1
            r1.A00(r0)
        L_0x05d8:
            android.widget.ImageButton r1 = r2.A03
            r0 = 2131232028(0x7f08051c, float:1.8080154E38)
            r1.setImageResource(r0)
            return
        L_0x05e1:
            java.lang.Object r5 = r8.A01
            X.7By r5 = (X.C143087By) r5
            X.1Uv r1 = r5.A14
            X.1BI r0 = r5.A0I
            X.1BI r0 = r1.A0K(r0)
            X.68F r4 = new X.68F
            r4.<init>((X.AnonymousClass7RA) r8, (X.AnonymousClass1BI) r0)
            android.os.Handler r3 = r5.A0v
            java.lang.Runnable r2 = r5.A18
            r3.removeCallbacks(r2)
            long r0 = r5.A03
            r3.postDelayed(r2, r0)
            X.1Us r0 = r5.A16
            r0.A02(r4)
            X.C143087By.A06(r5)
            return
        L_0x0607:
            java.lang.Object r5 = r8.A01
            X.7By r5 = (X.C143087By) r5
            r0 = 1
            r5.A1Z = r0
            java.lang.String r0 = "group-chat-live-location-ui-update-locations"
            X.C143087By.A0C(r5, r0)
            X.C143087By.A07(r5)
            java.util.List r4 = r5.A1A
            X.11S r3 = r5.A0y
            X.1M9 r2 = r5.A0z
            X.1Me r1 = r5.A10
            X.7Rf r0 = new X.7Rf
            r0.<init>(r3, r2, r1)
            java.util.Collections.sort(r4, r0)
            r1 = 0
            X.C143087By.A0D(r5, r1)
            X.5kr r0 = r5.A0K
            r0.notifyDataSetChanged()
            r5.A0S()
            r5.A1Z = r1
            return
        L_0x0635:
            java.lang.Object r2 = r8.A01
            X.7By r2 = (X.C143087By) r2
            X.1Uv r1 = r2.A14
            X.1BI r0 = r2.A0I
            r1.A0V(r0)
            X.1KB r3 = r2.A0x
            r3.getClass()
            r0 = 2
            X.7RA r2 = new X.7RA
            r2.<init>((java.lang.Object) r3, (int) r0)
        L_0x064b:
            r3.A0J(r2)
            return
        L_0x064f:
            java.lang.Object r0 = r8.A01
            X.1KB r0 = (X.AnonymousClass1KB) r0
            r0.A04()
            return
        L_0x0657:
            java.lang.Object r0 = r8.A01
            X.7By r0 = (X.C143087By) r0
            X.C143087By.A07(r0)
            return
        L_0x065f:
            java.util.Iterator r1 = r8.iterator()
        L_0x0663:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0673
            java.lang.Object r0 = r1.next()
            X.6yC r0 = (X.C139086yC) r0
            r7.A0W(r0)
            goto L_0x0663
        L_0x0673:
            r7.A0R()
            X.5kr r0 = r7.A0K
            r0.notifyDataSetChanged()
            return
        L_0x067c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x067c }
            throw r0
        L_0x067f:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.AnonymousClass6UB.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0698
            java.lang.Object r0 = r8.A01
            X.797 r0 = (X.AnonymousClass797) r0
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
        L_0x0694:
            r0.postDelayed(r8, r1)
            return
        L_0x0698:
            java.lang.Object r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            X.797 r0 = (X.AnonymousClass797) r0     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            java.lang.Object r2 = r0.A01     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            com.whatsapp.location.WaMapView r2 = (com.whatsapp.location.WaMapView) r2     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            X.BIC r1 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            X.C17960vV.A05(r1)     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            r0 = 0
            r1.A05(r0)     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            X.BIC r0 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            r0.A04()     // Catch:{ IncompatibleClassChangeError -> 0x06af }
            goto L_0x06b3
        L_0x06af:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x06b3:
            java.lang.Object r0 = r8.A01
            X.797 r0 = (X.AnonymousClass797) r0
            java.lang.Object r1 = r0.A02
            X.1Ur r1 = (X.C27091Ur) r1
            r0 = 1
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RA.run():void");
    }

    public AnonymousClass7RA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}

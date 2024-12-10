package X;

/* renamed from: X.Aik  reason: case insensitive filesystem */
public class C21355Aik implements Runnable {
    public final int A00;
    public final Object A01;

    public C21355Aik(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v301, resolved type: com.whatsapp.group.newgroup.NewGroup} */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.lang.Object, X.9eh] */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0514, code lost:
        r3.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0517, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07f8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07fb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07fc, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x07ff, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x018d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0R, 5191) != false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08fe, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08ff, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0902, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0927, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0928, code lost:
        r2.A08(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x092b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0940, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0944, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x09a6, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x09a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0256, code lost:
        if (r1 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0258, code lost:
        X.C72453Mb.A14(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        r5.A0E(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0131 A[LOOP:1: B:27:0x012b->B:29:0x0131, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x032a;
                case 1: goto L_0x0332;
                case 2: goto L_0x003b;
                case 3: goto L_0x0345;
                case 4: goto L_0x034e;
                case 5: goto L_0x0045;
                case 6: goto L_0x037f;
                case 7: goto L_0x0441;
                case 8: goto L_0x045b;
                case 9: goto L_0x046f;
                case 10: goto L_0x048c;
                case 11: goto L_0x09a2;
                case 12: goto L_0x005b;
                case 13: goto L_0x0496;
                case 14: goto L_0x04a2;
                case 15: goto L_0x04be;
                case 16: goto L_0x04d7;
                case 17: goto L_0x0518;
                case 18: goto L_0x0520;
                case 19: goto L_0x0530;
                case 20: goto L_0x0541;
                case 21: goto L_0x055a;
                case 22: goto L_0x055a;
                case 23: goto L_0x0564;
                case 24: goto L_0x056c;
                case 25: goto L_0x0574;
                case 26: goto L_0x0580;
                case 27: goto L_0x059d;
                case 28: goto L_0x080b;
                case 29: goto L_0x0834;
                case 30: goto L_0x083d;
                case 31: goto L_0x0848;
                case 32: goto L_0x0915;
                case 33: goto L_0x091e;
                case 34: goto L_0x092c;
                case 35: goto L_0x0197;
                case 36: goto L_0x0945;
                case 37: goto L_0x0960;
                case 38: goto L_0x0229;
                case 39: goto L_0x0229;
                case 40: goto L_0x096a;
                case 41: goto L_0x023a;
                case 42: goto L_0x0249;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x0972;
                case 47: goto L_0x097a;
                case 48: goto L_0x025c;
                case 49: goto L_0x0982;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A01
            X.3oS r1 = (X.C76803oS) r1
            r3 = 0
            X.C18070vi.A0d(r1, r3)
            X.1kb r0 = r1.A04
            java.util.List r0 = r0.A09()
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            X.1vp r5 = r1.A0B
            if (r0 == 0) goto L_0x0034
            r0 = 2
            X.4CX[] r1 = new X.AnonymousClass4CX[r0]
            X.4CX r0 = X.AnonymousClass4CX.CREATE_COMMUNITY
            r1[r3] = r0
            X.4CX r0 = X.AnonymousClass4CX.LINK_TO_COMMUNITY
            java.util.List r0 = X.AnonymousClass8BR.A15(r0, r1, r2)
        L_0x002d:
            X.C18070vi.A0X(r0)
        L_0x0030:
            r5.A0E(r0)
        L_0x0033:
            return
        L_0x0034:
            X.4CX r0 = X.AnonymousClass4CX.CREATE_COMMUNITY
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x002d
        L_0x003b:
            java.lang.Object r0 = r1.A01
            X.DOr r0 = (X.C26995DOr) r0
            X.0vk r0 = r0.A09
            if (r0 == 0) goto L_0x0033
            goto L_0x09a6
        L_0x0045:
            java.lang.Object r2 = r1.A01
            X.Cms r2 = (X.C25838Cms) r2
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "event_timed_out"
            r2.A04(r1, r0)
            r0 = 3
            r2.A01(r0)
            return
        L_0x005b:
            java.lang.Object r3 = r1.A01
            X.8GZ r3 = (X.AnonymousClass8GZ) r3
            X.1M9 r0 = r3.A0L
            X.1EC r4 = r3.A03
            X.1E7 r0 = r0.A0H(r4)
            r3.A02 = r0
            X.1MZ r2 = r3.A0Q
            X.1EC r0 = X.AnonymousClass3MW.A0i(r4)
            int r0 = r2.A02(r0)
            int r1 = r0 + -1
            X.1MW r6 = r2.A08
            int r0 = r6.A09(r4)
            int r1 = r1 - r0
            r3.A01 = r1
            X.9u7 r0 = r3.A0P
            int r0 = r0.A00(r4)
            r3.A00 = r0
            X.1PU r0 = r3.A0Z
            boolean r1 = r0.A02(r4)
            X.1DT r0 = r3.A09
            java.lang.Boolean r1 = X.C108945cZ.A1A(r1)
            r0.A0E(r1)
            X.1DT r0 = r3.A0J
            r9 = 1
            r0.A0E(r1)
            X.1DT r1 = r3.A0H
            X.126 r0 = r3.A0T
            boolean r0 = r0.A0n(r4)
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r5 = r3.A0G
            X.2kV r1 = r3.A0W
            X.1E7 r0 = r3.A02
            boolean r0 = r1.A00(r0)
            X.AnonymousClass3MY.A1M(r5, r0)
            X.1DT r1 = r3.A0E
            X.1E7 r0 = r3.A02
            boolean r0 = X.C62822s3.A02(r0)
            X.AnonymousClass3MY.A1M(r1, r0)
            X.3TB r5 = r3.A0S
            X.1EC r1 = r3.A04
            X.1E7 r0 = r3.A02
            boolean r0 = X.C62822s3.A02(r0)
            r5.A0G(r1, r0)
            X.1DT r1 = r3.A0D
            X.1E7 r0 = r3.A02
            boolean r0 = r0.A12
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r8 = r3.A07
            X.1CJ r0 = r3.A0N
            int r1 = r0.A06(r4)
            r0 = 3
            if (r1 == r0) goto L_0x013d
            boolean r0 = r2.A0K(r4)
            if (r0 == 0) goto L_0x013d
            X.2tp r0 = r6.A0C(r4)
            X.10f r0 = r0.A08()
            X.1IZ r7 = r0.iterator()
        L_0x00f1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r5 = r7.next()
            X.2sr r5 = (X.C63312sr) r5
            X.11S r1 = r3.A0K
            com.whatsapp.jid.UserJid r0 = r5.A04
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x00f1
            int r1 = r5.A01
            r0 = 2
            if (r1 == r0) goto L_0x00f1
            r0 = 1
        L_0x010d:
            X.AnonymousClass3MY.A1M(r8, r0)
            X.1DT r1 = r3.A0F
            X.1E7 r0 = r3.A02
            boolean r0 = r0.A0r
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r8 = r3.A06
            X.2tp r0 = r6.A0C(r4)
            java.util.ArrayList r0 = r0.A0K()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x012b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r1.next()
            X.2sr r0 = (X.C63312sr) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r7.add(r0)
            goto L_0x012b
        L_0x013d:
            r0 = 0
            goto L_0x010d
        L_0x013f:
            X.1Me r6 = r3.A0M
            java.util.HashSet r5 = X.C17880vN.A12()
            boolean r1 = X.C24921Me.A05(r6, r7, r5)
            r0 = -1
            java.util.ArrayList r0 = r6.A0e(r5, r0, r1)
            r8.A0E(r0)
            X.1DT r1 = r3.A0I
            X.1E7 r0 = r3.A02
            boolean r0 = r0.A0f
            r0 = r0 ^ 1
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r1 = r3.A08
            X.1E7 r0 = r3.A02
            boolean r0 = r0.A13
            r0 = r0 ^ 1
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r1 = r3.A0C
            X.1E7 r0 = r3.A02
            boolean r0 = r0.A0j
            r0 = r0 ^ 1
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r1 = r3.A0A
            X.1E7 r0 = r3.A02
            boolean r0 = r0.A0i
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1DT r5 = r3.A0B
            boolean r0 = r2.A0K(r4)
            if (r0 == 0) goto L_0x0195
            X.0ve r2 = r3.A0R
            r1 = 5191(0x1447, float:7.274E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0195
        L_0x018f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            goto L_0x0030
        L_0x0195:
            r9 = 0
            goto L_0x018f
        L_0x0197:
            java.lang.Object r5 = r1.A01
            com.whatsapp.group.newgroup.NewGroup r5 = (com.whatsapp.group.newgroup.NewGroup) r5
            java.util.List r0 = r5.A0j
            java.util.ArrayList r3 = X.AnonymousClass1E7.A02(r0)
            com.whatsapp.WaEditText r0 = r5.A08
            java.lang.String r6 = X.AnonymousClass3Ma.A12(r0)
            X.1EC r0 = r5.A0S
            if (r0 == 0) goto L_0x01d8
            X.00H r0 = r5.A0Z
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r5.A0S
            boolean r0 = r1.A0V(r0)
            if (r0 != 0) goto L_0x01d8
            r0 = 2131891949(0x7f1216ed, float:1.9418632E38)
            java.lang.String r0 = r5.getString(r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            r3.A0S(r0)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 40
            X.4fx r0 = new X.4fx
            r0.<init>(r5, r1)
            r3.A0g(r5, r0, r2)
            r3.A0C()
            return
        L_0x01d8:
            boolean r0 = com.whatsapp.group.newgroup.NewGroup.A0w(r5, r6)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r5.A0k
            if (r0 == 0) goto L_0x098b
            java.io.File r0 = com.whatsapp.group.newgroup.NewGroup.A03(r5)
            if (r0 == 0) goto L_0x0227
            android.net.Uri r7 = android.net.Uri.fromFile(r0)
        L_0x01ec:
            X.00H r0 = r5.A0d
            java.lang.Object r0 = r0.get()
            X.2jS r0 = (X.C57672jS) r0
            X.1EB r1 = r0.A00()
            android.content.Intent r4 = X.C17880vN.A0A()
            int r3 = r5.A00
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "key_raw_jid"
            X.AnonymousClass3MY.A15(r2, r1, r0)
            java.lang.String r1 = "key_raw_photo_uri"
            if (r7 == 0) goto L_0x0225
            java.lang.String r0 = r7.toString()
        L_0x020f:
            r2.putString(r1, r0)
            java.lang.String r0 = "key_group_name"
            r2.putString(r0, r6)
            java.lang.String r0 = "key_ephemeral_duration"
            r2.putInt(r0, r3)
            java.lang.String r0 = "group_created"
            r4.putExtra(r0, r2)
            X.C72453Mb.A16(r5, r4)
            return
        L_0x0225:
            r0 = 0
            goto L_0x020f
        L_0x0227:
            r7 = 0
            goto L_0x01ec
        L_0x0229:
            java.lang.Object r0 = r1.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0033
            boolean r1 = r0.isFinishing()
            goto L_0x0256
        L_0x023a:
            java.lang.Object r1 = r1.A01
            X.4UI r1 = (X.AnonymousClass4UI) r1
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0033
            r0 = 1
            r1.A00(r0)
            return
        L_0x0249:
            java.lang.Object r0 = r1.A01
            X.414 r0 = (X.AnonymousClass414) r0
            com.whatsapp.group.newgroup.NewGroup r0 = r0.A00
            r0.CEx()
            boolean r1 = r0.Bed()
        L_0x0256:
            if (r1 != 0) goto L_0x0033
            X.C72453Mb.A14(r0)
            return
        L_0x025c:
            java.lang.Object r4 = r1.A01
            X.A4H r4 = (X.A4H) r4
            X.1D9 r2 = r4.A02     // Catch:{ IOException -> 0x026e }
            java.lang.String r1 = X.C197569wu.A0a     // Catch:{ IOException -> 0x026e }
            r0 = 0
            X.AUZ r0 = r2.A07(r0, r1, r0)     // Catch:{ IOException -> 0x026e }
            r0.close()     // Catch:{ IOException -> 0x026e }
            goto L_0x099e
        L_0x026e:
            r1 = move-exception
            java.lang.String r0 = "DomainFrontingManager/probe-regd/cant connect to regd "
            com.whatsapp.util.Log.e(r0, r1)
            X.A4H.A00(r4)     // Catch:{ IOException -> 0x0278 }
            goto L_0x027e
        L_0x0278:
            r1 = move-exception
            java.lang.String r0 = "DomainFrontingManager/probe-providers/error getting providers from the file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x027e:
            java.util.List r5 = r4.A06
            java.util.ArrayList r0 = X.C17880vN.A10(r5)
            java.util.Collections.shuffle(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x028b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r3 = r7.next()
            X.9el r3 = (X.C186789el) r3
            java.lang.String r6 = "/"
            java.lang.String r2 = ""
            java.lang.String r1 = r3.A01     // Catch:{ IOException -> 0x02fb }
            java.lang.String r0 = "{PATH}"
            java.lang.String r1 = r1.replace(r0, r6)     // Catch:{ IOException -> 0x02fb }
            java.lang.String r0 = "{QS}"
            java.lang.String r0 = r1.replace(r0, r2)     // Catch:{ IOException -> 0x02fb }
            java.net.URLConnection r6 = X.AnonymousClass8BV.A0v(r0)     // Catch:{ IOException -> 0x02fb }
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ IOException -> 0x02fb }
            r0 = 60000(0xea60, float:8.4078E-41)
            r6.setConnectTimeout(r0)     // Catch:{ IOException -> 0x02fb }
            r6.setReadTimeout(r0)     // Catch:{ IOException -> 0x02fb }
            X.11W r0 = r3.A00     // Catch:{ IOException -> 0x02fb }
            java.lang.String r1 = r0.A02()     // Catch:{ IOException -> 0x02fb }
            java.lang.String r0 = "User-Agent"
            r6.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x02fb }
            java.lang.String r1 = "Host"
            java.lang.String r0 = r3.A03     // Catch:{ IOException -> 0x02fb }
            r6.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x02fb }
            javax.net.SocketFactory r1 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch:{ IOException -> 0x02fb }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory"
            X.C18070vi.A0z(r1, r0)     // Catch:{ IOException -> 0x02fb }
            javax.net.ssl.SSLSocketFactory r1 = (javax.net.ssl.SSLSocketFactory) r1     // Catch:{ IOException -> 0x02fb }
            r6.setSSLSocketFactory(r1)     // Catch:{ IOException -> 0x02fb }
            r6.connect()     // Catch:{ IOException -> 0x02fb }
            r0 = 0
            X.AUZ r2 = new X.AUZ     // Catch:{ IOException -> 0x02fb }
            r2.<init>(r0, r6)     // Catch:{ IOException -> 0x02fb }
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x02f1 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x02f1 }
            r0 = 200(0xc8, float:2.8E-43)
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            r2.close()     // Catch:{ IOException -> 0x02fb }
            goto L_0x0315
        L_0x02f1:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02f6 }
            goto L_0x02fa
        L_0x02f6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x02fb }
        L_0x02fa:
            throw r1     // Catch:{ IOException -> 0x02fb }
        L_0x02fb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "domainFrontingProvider/cant reach "
            r1.append(r0)
            java.lang.String r0 = r3.A02
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r3.A01
            X.C17890vO.A13(r0, r1, r2)
            r1 = 0
        L_0x0315:
            monitor-enter(r4)
            if (r1 == 0) goto L_0x031e
            java.util.List r0 = r4.A05     // Catch:{ all -> 0x099f }
            r0.add(r3)     // Catch:{ all -> 0x099f }
            goto L_0x0323
        L_0x031e:
            java.util.List r0 = r4.A04     // Catch:{ all -> 0x099f }
            r0.add(r3)     // Catch:{ all -> 0x099f }
        L_0x0323:
            r5.remove(r3)     // Catch:{ all -> 0x099f }
            monitor-exit(r4)
            if (r1 == 0) goto L_0x028b
            return
        L_0x032a:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x0332:
            java.lang.Object r0 = r1.A01
            X.6iE r0 = (X.C129706iE) r0
            com.whatsapp.WaImageView r1 = r0.A03     // Catch:{ all -> 0x033e }
            X.BFF r0 = r0.A00     // Catch:{ all -> 0x033e }
            r1.setImageDrawable(r0)     // Catch:{ all -> 0x033e }
            return
        L_0x033e:
            r1 = move-exception
            java.lang.String r0 = "Gif/settingDrawable/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0345:
            java.lang.Object r1 = r1.A01
            X.DOr r1 = (X.C26995DOr) r1
            r0 = 0
            X.C26995DOr.A04(r1, r0)
            return
        L_0x034e:
            java.lang.Object r6 = r1.A01
            com.whatsapp.glasses.layouts.StatusIndicator r6 = (com.whatsapp.glasses.layouts.StatusIndicator) r6
            android.graphics.Rect r5 = X.AnonymousClass3MW.A07()
            android.widget.TextView r4 = r6.A0K
            r4.getHitRect(r5)
            android.view.View r3 = r6.A0G
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168816(0x7f070e30, float:1.7951945E38)
            r2 = 2131168816(0x7f070e30, float:1.7951945E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = -r0
            int r0 = X.AnonymousClass3Ma.A02(r3, r2)
            int r0 = -r0
            r5.inset(r1, r0)
            android.widget.LinearLayout r1 = r6.A03
            android.view.TouchDelegate r0 = new android.view.TouchDelegate
            r0.<init>(r5, r4)
            r1.setTouchDelegate(r0)
            return
        L_0x037f:
            java.lang.Object r8 = r1.A01
            X.ALz r8 = (X.C20462ALz) r8
            X.9eh r3 = new X.9eh
            r3.<init>()
            X.9mx r9 = r8.A04     // Catch:{ Exception -> 0x0411 }
            boolean r0 = r8 instanceof X.C172198t2     // Catch:{ Exception -> 0x0411 }
            if (r0 == 0) goto L_0x0391
            r15 = 20
            goto L_0x0393
        L_0x0391:
            r15 = 19
        L_0x0393:
            java.lang.String r10 = X.C197569wu.A0Q     // Catch:{ Exception -> 0x0411 }
            if (r0 == 0) goto L_0x03a4
            java.lang.String r11 = X.C197569wu.A07     // Catch:{ Exception -> 0x0411 }
        L_0x0399:
            org.json.JSONObject r13 = r8.A0C()     // Catch:{ Exception -> 0x0411 }
            java.lang.String r12 = r8.A0A()     // Catch:{ Exception -> 0x0411 }
            if (r0 == 0) goto L_0x03aa
            goto L_0x03a7
        L_0x03a4:
            java.lang.String r11 = X.C197569wu.A09     // Catch:{ Exception -> 0x0411 }
            goto L_0x0399
        L_0x03a7:
            r14 = 33
            goto L_0x03ac
        L_0x03aa:
            r14 = 19
        L_0x03ac:
            X.9kK r7 = new X.9kK     // Catch:{ Exception -> 0x0411 }
            r7.<init>(r8, r3)     // Catch:{ Exception -> 0x0411 }
            X.11E r0 = r9.A01     // Catch:{ Exception -> 0x0411 }
            boolean r0 = r0.A09()     // Catch:{ Exception -> 0x0411 }
            if (r0 != 0) goto L_0x03bc
            r2 = -1
            r1 = 2
            goto L_0x03c8
        L_0x03bc:
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0411 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0411 }
            if (r0 == 0) goto L_0x03d1
            r2 = 3
            r1 = 1
        L_0x03c8:
            X.9xl r0 = new X.9xl     // Catch:{ Exception -> 0x0411 }
            r0.<init>((int) r2, (int) r1)     // Catch:{ Exception -> 0x0411 }
            r7.A00(r0)     // Catch:{ Exception -> 0x0411 }
            return
        L_0x03d1:
            X.2DU r2 = r9.A02     // Catch:{ Exception -> 0x0411 }
            X.9n6 r6 = new X.9n6     // Catch:{ Exception -> 0x0411 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0411 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0411 }
            boolean r0 = X.C26234CvS.A04()     // Catch:{ all -> 0x040e }
            if (r0 == 0) goto L_0x03e6
            r2.A00()     // Catch:{ all -> 0x040e }
            r6.A00()     // Catch:{ all -> 0x040e }
            goto L_0x0409
        L_0x03e6:
            java.lang.Class<X.1KY> r5 = X.AnonymousClass1KY.class
            monitor-enter(r5)     // Catch:{ all -> 0x040e }
            boolean r0 = X.C26234CvS.A04()     // Catch:{ all -> 0x040b }
            if (r0 != 0) goto L_0x0402
            X.118 r0 = r2.A00     // Catch:{ all -> 0x040b }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x040b }
            com.google.android.gms.tasks.zzw r4 = X.C26234CvS.A01(r0)     // Catch:{ all -> 0x040b }
            r1 = 1
            X.AJC r0 = new X.AJC     // Catch:{ all -> 0x040b }
            r0.<init>(r6, r2, r1)     // Catch:{ all -> 0x040b }
            r4.addOnCompleteListener(r0)     // Catch:{ all -> 0x040b }
        L_0x0400:
            monitor-exit(r5)     // Catch:{ all -> 0x040b }
            goto L_0x0409
        L_0x0402:
            r2.A00()     // Catch:{ all -> 0x040b }
            r6.A00()     // Catch:{ all -> 0x040b }
            goto L_0x0400
        L_0x0409:
            monitor-exit(r2)     // Catch:{ Exception -> 0x0411 }
            return
        L_0x040b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x040b }
            throw r0     // Catch:{ all -> 0x040e }
        L_0x040e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0411 }
            throw r0     // Catch:{ Exception -> 0x0411 }
        L_0x0411:
            r5 = move-exception
            boolean r0 = r5 instanceof org.json.JSONException
            if (r0 == 0) goto L_0x043b
            X.190 r4 = r8.A02
            java.lang.String r2 = r5.getMessage()
            r1 = 1
            java.lang.String r0 = "GraphApiACSNetworkRequest/startCronetRequest: Error while generating the JSON: "
            r4.A0G(r0, r2, r1)
        L_0x0422:
            java.lang.String r0 = X.C108955ca.A0x(r5)
            r8.A0G(r0)
            r0 = 3
            r3.A00 = r0
            android.os.Handler r2 = X.C17890vO.A0D()
            r1 = 26
            X.7Qq r0 = new X.7Qq
            r0.<init>(r8, r3, r1)
            r2.post(r0)
            return
        L_0x043b:
            java.lang.String r0 = "GraphApiACSNetworkRequest/startCronetRequest: generic error - "
            com.whatsapp.util.Log.e(r0, r5)
            goto L_0x0422
        L_0x0441:
            java.lang.Object r1 = r1.A01
            android.os.Looper.prepare()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 27
            X.7Qq r2 = new X.7Qq
            r2.<init>(r1, r3, r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r2, r0)
            android.os.Looper.loop()
            return
        L_0x045b:
            java.lang.Object r0 = r1.A01
            X.9Ap r0 = (X.C177789Ap) r0
            X.ALz r0 = r0.A01
            X.BAp r3 = r0.A03
            r2 = 0
            r0 = 3
            X.9lD r1 = new X.9lD
            r1.<init>(r2, r2, r0)
            r0 = 1
            r3.BtA(r1, r0)
            return
        L_0x046f:
            java.lang.Object r1 = r1.A01
            X.4X6 r1 = (X.AnonymousClass4X6) r1
            X.1FU r0 = r1.A05
            android.view.View r2 = r0.A00
            X.C18070vi.A0X(r2)
            android.content.Context r0 = r1.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131893535(0x7f121d1f, float:1.942185E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -1
            X.AnonymousClass8BS.A15(r2, r1, r0)
            return
        L_0x048c:
            java.lang.Object r0 = r1.A01
            X.4X6 r0 = (X.AnonymousClass4X6) r0
            X.1KB r0 = r0.A06
            r0.A04()
            return
        L_0x0496:
            java.lang.Object r0 = r1.A01
            X.4kY r0 = (X.C94394kY) r0
            X.1KB r2 = r0.A00
            r1 = 2131895168(0x7f122380, float:1.9425161E38)
            r0 = 1
            goto L_0x0928
        L_0x04a2:
            java.lang.Object r2 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.00H r0 = r2.A1p
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r2.A1K
            X.1EC r0 = r1.A05(r0)
            r2.A1L = r0
            X.1KB r3 = r2.A05
            r0 = 15
            X.Aik r1 = new X.Aik
            r1.<init>(r2, r0)
            goto L_0x0514
        L_0x04be:
            java.lang.Object r4 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            android.view.View r1 = r4.A05
            r0 = 2131431813(0x7f0b1185, float:1.8485366E38)
            android.view.View r3 = r1.findViewById(r0)
            com.whatsapp.components.InviteViaLinkView r3 = (com.whatsapp.components.InviteViaLinkView) r3
            X.1EC r2 = r4.A1K
            X.3zh r1 = r4.A10
            X.1EC r0 = r4.A1L
            r3.setupOnClick(r2, r4, r1, r0)
            return
        L_0x04d7:
            java.lang.Object r5 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            X.126 r6 = r5.A1A
            X.1EC r3 = r5.A4l()
            r4 = 0
            if (r3 == 0) goto L_0x050b
            X.00H r0 = r6.A0m
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r2 = r0.A05(r3)
            X.1CJ r0 = r6.A0I
            int r1 = r0.A06(r3)
            r0 = 2
            if (r1 == r0) goto L_0x04fa
            r0 = 6
            if (r1 != r0) goto L_0x050b
        L_0x04fa:
            if (r2 == 0) goto L_0x050b
            X.1MZ r1 = r6.A0O
            boolean r0 = r1.A0K(r2)
            if (r0 != 0) goto L_0x050a
            boolean r0 = r1.A0K(r3)
            if (r0 == 0) goto L_0x050b
        L_0x050a:
            r4 = 1
        L_0x050b:
            X.1KB r3 = r5.A05
            r0 = 10
            X.3Cp r1 = new X.3Cp
            r1.<init>((int) r0, (java.lang.Object) r5, (boolean) r4)
        L_0x0514:
            r3.A0J(r1)
            return
        L_0x0518:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A1F(r0)
            return
        L_0x0520:
            java.lang.Object r0 = r1.A01
            X.6LF r0 = (X.AnonymousClass6LF) r0
            java.lang.Object r2 = r0.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.1o3 r1 = r2.A0k
            java.lang.String r0 = "community-hidden-groups"
            r1.A01(r2, r0)
            return
        L_0x0530:
            java.lang.Object r0 = r1.A01
            X.4mF r0 = (X.C95444mF) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A1E(r0)
            X.4XY r0 = r0.A0T
            r0.A01()
            return
        L_0x0541:
            java.lang.Object r0 = r1.A01
            X.4em r0 = (X.C90874em) r0
            java.lang.Object r1 = r0.A01
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            X.00H r0 = r1.A0X
            java.lang.Object r3 = r0.get()
            X.1pz r3 = (X.C37701pz) r3
            X.1EC r2 = r1.A1K
            X.1i2 r1 = X.C32961i2.CONTACT_INFO
            r0 = 0
            r3.A01(r2, r1, r0)
            return
        L_0x055a:
            java.lang.Object r0 = r1.A01
            X.4VH r0 = (X.AnonymousClass4VH) r0
            X.1FU r0 = r0.A01
            r0.A3e()
            return
        L_0x0564:
            java.lang.Object r0 = r1.A01
            X.3VF r0 = (X.AnonymousClass3VF) r0
            X.AnonymousClass3VF.A04(r0)
            return
        L_0x056c:
            java.lang.Object r0 = r1.A01
            X.3VF r0 = (X.AnonymousClass3VF) r0
            X.AnonymousClass3VF.A03(r0)
            return
        L_0x0574:
            java.lang.Object r0 = r1.A01
            X.4VI r0 = (X.AnonymousClass4VI) r0
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0580:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupMembershipApprovalRequestsFragment r0 = (com.whatsapp.group.GroupMembershipApprovalRequestsFragment) r0
            android.content.Context r3 = r0.A14()
            android.content.Context r2 = r0.A14()
            X.1EC r1 = r0.A07
            if (r1 == 0) goto L_0x0599
            r0 = 4
            android.content.Intent r0 = X.AnonymousClass1LU.A0o(r2, r1, r0)
            r3.startActivity(r0)
            return
        L_0x0599:
            java.lang.String r0 = "groupJid"
            goto L_0x0940
        L_0x059d:
            java.lang.Object r1 = r1.A01
            X.8GR r1 = (X.AnonymousClass8GR) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r2 = "GroupPendingRequestsViewModel/loadPendingRequests"
            X.1Ez r3 = new X.1Ez
            r3.<init>((java.lang.String) r2)
            X.1M9 r2 = r1.A06
            X.1EC r6 = r1.A0E
            X.1E7 r4 = r2.A0E(r6)
            r1.A00 = r4
            if (r4 == 0) goto L_0x0800
            boolean r4 = r4.A12
            r5 = 1
            if (r4 != r5) goto L_0x0800
            X.9u7 r4 = r1.A0A
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            java.lang.String[] r8 = new java.lang.String[r5]
            X.C17880vN.A1J(r6, r8, r0)
            X.1Lt r4 = r4.A00
            X.1at r7 = r4.get()
            r4 = r7
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x07f9 }
            X.1Ev r6 = r4.A02     // Catch:{ all -> 0x07f9 }
            java.lang.String r5 = "SELECT group_jid, requester_jid, request_creation_time, request_method, parent_group_jid, requested_by_jid FROM group_membership_approval_requests WHERE group_jid = ? ORDER BY request_creation_time DESC "
            java.lang.String r4 = "GET_GROUP_MEMBERSHIP_APPROVAL_REQUESTS_WITH_JID_SQL"
            android.database.Cursor r6 = r6.A0A(r5, r4, r8)     // Catch:{ all -> 0x07f9 }
            java.lang.String r4 = "group_jid"
            int r13 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x07f2 }
            java.lang.String r4 = "requester_jid"
            int r12 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x07f2 }
            java.lang.String r4 = "request_creation_time"
            int r11 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x07f2 }
            java.lang.String r4 = "request_method"
            int r10 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x07f2 }
            java.lang.String r4 = "parent_group_jid"
            int r5 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x07f2 }
            java.lang.String r4 = "requested_by_jid"
            int r4 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x07f2 }
        L_0x05ff:
            boolean r8 = r6.moveToNext()     // Catch:{ all -> 0x07f2 }
            if (r8 == 0) goto L_0x0646
            X.1yz r9 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x063f }
            java.lang.String r8 = r6.getString(r13)     // Catch:{ 11T -> 0x063f }
            X.1EC r16 = X.C42941yz.A01(r8)     // Catch:{ 11T -> 0x063f }
            X.1Dw r8 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 11T -> 0x063f }
            java.lang.String r8 = r6.getString(r12)     // Catch:{ 11T -> 0x063f }
            com.whatsapp.jid.UserJid r18 = X.C22941Dw.A03(r8)     // Catch:{ 11T -> 0x063f }
            long r21 = r6.getLong(r11)     // Catch:{ 11T -> 0x063f }
            java.lang.String r20 = r6.getString(r10)     // Catch:{ 11T -> 0x063f }
            java.lang.String r8 = r6.getString(r5)     // Catch:{ 11T -> 0x063f }
            X.1EC r17 = r9.A02(r8)     // Catch:{ 11T -> 0x063f }
            X.1Dw r9 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 11T -> 0x063f }
            java.lang.String r8 = r6.getString(r4)     // Catch:{ 11T -> 0x063f }
            com.whatsapp.jid.UserJid r19 = r9.A04(r8)     // Catch:{ 11T -> 0x063f }
            X.C18070vi.A0b(r20)     // Catch:{ 11T -> 0x063f }
            X.9tC r15 = new X.9tC     // Catch:{ 11T -> 0x063f }
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ 11T -> 0x063f }
            r14.add(r15)     // Catch:{ 11T -> 0x063f }
            goto L_0x05ff
        L_0x063f:
            r9 = move-exception
            java.lang.String r8 = "GroupMembershipApprovalRequestStore/invalid group or requester jid"
            com.whatsapp.util.Log.e(r8, r9)     // Catch:{ all -> 0x07f2 }
            goto L_0x05ff
        L_0x0646:
            r6.close()     // Catch:{ all -> 0x07f9 }
            r7.close()
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            java.util.Iterator r7 = r14.iterator()
        L_0x0654:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x0682
            java.lang.Object r10 = r7.next()
            X.9tC r10 = (X.C195349tC) r10
            com.whatsapp.jid.UserJid r6 = r10.A04
            X.1E7 r11 = r2.A0H(r6)
            com.whatsapp.jid.UserJid r5 = r10.A03
            if (r5 == 0) goto L_0x0680
            X.1E7 r12 = r2.A0H(r5)
        L_0x066e:
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            X.9Iv r9 = X.C179659Iv.A04
            X.AUA r8 = new X.AUA
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.List r5 = r1.A0K
            r5.add(r8)
            r4.put(r6, r8)
            goto L_0x0654
        L_0x0680:
            r12 = 0
            goto L_0x066e
        L_0x0682:
            X.1MZ r6 = r1.A0B
            java.util.Set r5 = r4.keySet()
            java.util.HashMap r11 = X.C17880vN.A11()
            X.11S r2 = r6.A02
            r2.A0I()
            X.1E8 r2 = r2.A0D
            if (r2 == 0) goto L_0x06a7
            X.1BI r12 = r2.A0J
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            if (r12 == 0) goto L_0x06a7
            X.1MW r10 = r6.A08
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x06cf
            java.util.Map r11 = java.util.Collections.emptyMap()
        L_0x06a7:
            X.C18070vi.A0X(r11)
            java.util.Iterator r6 = X.AnonymousClass000.A15(r11)
        L_0x06ae:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0800
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r6)
            java.lang.Object r0 = r5.getKey()
            java.lang.Object r2 = r4.get(r0)
            X.AUA r2 = (X.AUA) r2
            if (r2 == 0) goto L_0x06ae
            java.lang.Object r0 = r5.getValue()
            int r0 = X.AnonymousClass8BU.A03(r0)
            r2.A00 = r0
            goto L_0x06ae
        L_0x06cf:
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.Iterator r8 = r5.iterator()
        L_0x06d7:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x06ef
            java.lang.Object r7 = r8.next()
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            long r5 = X.AnonymousClass1MW.A00(r10, r7)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r9.put(r2, r7)
            goto L_0x06d7
        L_0x06ef:
            long r5 = X.AnonymousClass1MW.A00(r10, r12)
            java.lang.String r18 = java.lang.String.valueOf(r5)
            java.util.Set r5 = r9.keySet()
            java.lang.String[] r2 = X.C19620yd.A0M
            java.lang.Object[] r6 = r5.toArray(r2)
            r2 = 974(0x3ce, float:1.365E-42)
            X.23b r5 = new X.23b
            r5.<init>(r6, r2)
            java.util.HashMap r6 = X.C17880vN.A11()
            java.util.HashSet r8 = X.C17880vN.A12()
            X.1Cd r2 = r10.A06
            X.1at r17 = r2.get()
            java.util.Iterator r16 = r5.iterator()     // Catch:{ all -> 0x07e8 }
        L_0x071a:
            boolean r2 = r16.hasNext()     // Catch:{ all -> 0x07e8 }
            if (r2 == 0) goto L_0x0779
            java.lang.Object r7 = r16.next()     // Catch:{ all -> 0x07e8 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x07e8 }
            int r12 = r7.length     // Catch:{ all -> 0x07e8 }
            r5 = 1
            int r2 = r12 + 1
            java.lang.String[] r11 = new java.lang.String[r2]     // Catch:{ all -> 0x07e8 }
            java.lang.System.arraycopy(r7, r0, r11, r5, r12)     // Catch:{ all -> 0x07e8 }
            r11[r0] = r18     // Catch:{ all -> 0x07e8 }
            r2 = r17
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x07e8 }
            X.1Ev r7 = r2.A02     // Catch:{ all -> 0x07e8 }
            java.lang.String r5 = X.AnonymousClass2TP.A00(r12)     // Catch:{ all -> 0x07e8 }
            java.lang.String r2 = "GET_GROUPS_BY_USER_JIDS_SQL"
            android.database.Cursor r14 = r7.A0A(r5, r2, r11)     // Catch:{ all -> 0x07e8 }
            java.lang.String r2 = "group_jid_row_id"
            int r15 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x07dc }
            java.lang.String r2 = "user_jid_row_id"
            int r13 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x07dc }
        L_0x074d:
            boolean r2 = r14.moveToNext()     // Catch:{ all -> 0x07dc }
            if (r2 == 0) goto L_0x0775
            long r11 = r14.getLong(r15)     // Catch:{ all -> 0x07dc }
            java.lang.Long r7 = X.C17890vO.A0M(r14, r13)     // Catch:{ all -> 0x07dc }
            java.lang.Object r5 = r6.get(r7)     // Catch:{ all -> 0x07dc }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x07dc }
            if (r5 != 0) goto L_0x0767
            java.util.HashSet r5 = X.C17880vN.A12()     // Catch:{ all -> 0x07dc }
        L_0x0767:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x07dc }
            r5.add(r2)     // Catch:{ all -> 0x07dc }
            r8.add(r2)     // Catch:{ all -> 0x07dc }
            r6.put(r7, r5)     // Catch:{ all -> 0x07dc }
            goto L_0x074d
        L_0x0775:
            r14.close()     // Catch:{ all -> 0x07e8 }
            goto L_0x071a
        L_0x0779:
            r17.close()
            java.util.HashMap r11 = X.C17880vN.A11()
            X.1DL r2 = r10.A05
            java.lang.Class<X.1E9> r0 = X.AnonymousClass1E9.class
            java.util.HashMap r12 = r2.A0F(r0, r8)
            X.1M9 r2 = r10.A02
            java.util.Collection r0 = r12.values()
            java.util.HashMap r8 = r2.A0P(r0)
            java.util.Iterator r13 = X.C17890vO.A0i(r6)
        L_0x0796:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x06a7
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r13)
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r7 = r9.get(r0)
            if (r7 == 0) goto L_0x0796
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L_0x07b9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x07d8
            java.lang.Object r0 = r6.next()
            java.lang.Object r2 = r12.get(r0)
            X.1E9 r2 = (X.AnonymousClass1E9) r2
            java.lang.Object r0 = r8.get(r2)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            boolean r0 = r10.A0M(r0, r2)
            if (r0 == 0) goto L_0x07b9
            int r5 = r5 + 1
            goto L_0x07b9
        L_0x07d8:
            X.C17890vO.A0z(r7, r11, r5)
            goto L_0x0796
        L_0x07dc:
            r1 = move-exception
            if (r14 == 0) goto L_0x07e7
            r14.close()     // Catch:{ all -> 0x07e3 }
            goto L_0x07e7
        L_0x07e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x07e8 }
        L_0x07e7:
            throw r1     // Catch:{ all -> 0x07e8 }
        L_0x07e8:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x07ed }
            throw r1
        L_0x07ed:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x07f2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x07f4 }
        L_0x07f4:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x07f9 }
            throw r0     // Catch:{ all -> 0x07f9 }
        L_0x07f9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07fb }
        L_0x07fb:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x0800:
            java.lang.String r0 = "loading finished"
            r3.A03(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            X.AnonymousClass8GR.A03(r1, r0)
            return
        L_0x080b:
            java.lang.Object r5 = r1.A01
            com.whatsapp.group.GroupPermissionsLayout r5 = (com.whatsapp.group.GroupPermissionsLayout) r5
            android.content.Context r4 = r5.getContext()
            X.1LC r1 = r5.getWaLinkFactory()
            java.lang.String r0 = "https://faq.whatsapp.com/1110600769849613/"
            android.net.Uri r0 = r1.A00(r0)
            java.lang.String r3 = r0.toString()
            r2 = 0
            r1 = 1
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A1g(r4, r3, r2, r1, r0)
            X.1L9 r1 = r5.getActivityUtils()
            android.content.Context r0 = r5.getContext()
            r1.A08(r0, r2)
            return
        L_0x0834:
            java.lang.Object r1 = r1.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            r0 = 4
            r1.A0W(r0)
            return
        L_0x083d:
            java.lang.Object r0 = r1.A01
            X.9BN r0 = (X.AnonymousClass9BN) r0
            X.1KB r2 = r0.A00
            r1 = 2131890974(0x7f12131e, float:1.9416655E38)
            goto L_0x0927
        L_0x0848:
            java.lang.Object r9 = r1.A01
            X.8FW r9 = (X.AnonymousClass8FW) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.1M9 r8 = r9.A01
            X.1EC r4 = r9.A03
            X.1E7 r0 = r8.A0E(r4)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            if (r0 == 0) goto L_0x0903
            boolean r0 = r0.A12
            r2 = 1
            if (r0 != r2) goto L_0x0903
            X.9re r1 = r9.A02
            r0 = 0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String[] r3 = new java.lang.String[r2]
            X.C17880vN.A1J(r4, r3, r0)
            X.1Lt r0 = r1.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x08fc }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x08fc }
            java.lang.String r1 = "SELECT group_jid, requested_by_jid, requested_for_jid, request_creation_time FROM non_admin_group_membership_approval_requests WHERE group_jid = ? ORDER BY request_creation_time DESC "
            java.lang.String r0 = "GET_GROUP_MEMBERSHIP_APPROVAL_REQUESTS_WITH_JID_SQL"
            android.database.Cursor r4 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x08fc }
            java.lang.String r0 = "group_jid"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x08f5 }
            java.lang.String r0 = "requested_for_jid"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x08f5 }
            java.lang.String r0 = "request_creation_time"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x08f5 }
            java.lang.String r0 = "requested_by_jid"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x08f5 }
        L_0x089a:
            boolean r10 = r4.moveToNext()     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x08d0
            X.1yz r10 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x08c9 }
            java.lang.String r10 = r4.getString(r3)     // Catch:{ 11T -> 0x08c9 }
            X.1EC r12 = X.C42941yz.A01(r10)     // Catch:{ 11T -> 0x08c9 }
            X.1Dw r11 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 11T -> 0x08c9 }
            java.lang.String r10 = r4.getString(r2)     // Catch:{ 11T -> 0x08c9 }
            com.whatsapp.jid.UserJid r14 = X.C22941Dw.A03(r10)     // Catch:{ 11T -> 0x08c9 }
            long r15 = r4.getLong(r1)     // Catch:{ 11T -> 0x08c9 }
            java.lang.String r10 = r4.getString(r0)     // Catch:{ 11T -> 0x08c9 }
            com.whatsapp.jid.UserJid r13 = r11.A04(r10)     // Catch:{ 11T -> 0x08c9 }
            X.9sD r11 = new X.9sD     // Catch:{ 11T -> 0x08c9 }
            r11.<init>(r12, r13, r14, r15)     // Catch:{ 11T -> 0x08c9 }
            r6.add(r11)     // Catch:{ 11T -> 0x08c9 }
            goto L_0x089a
        L_0x08c9:
            r11 = move-exception
            java.lang.String r10 = "NonAdminGJRSTore/invalid group or requester jid"
            com.whatsapp.util.Log.e(r10, r11)     // Catch:{ all -> 0x08f5 }
            goto L_0x089a
        L_0x08d0:
            r4.close()     // Catch:{ all -> 0x08fc }
            r5.close()
            java.util.Iterator r3 = r6.iterator()
        L_0x08da:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0903
            java.lang.Object r2 = r3.next()
            X.9sD r2 = (X.C194739sD) r2
            com.whatsapp.jid.UserJid r0 = r2.A03
            X.1E7 r1 = r8.A0H(r0)
            X.AU9 r0 = new X.AU9
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x08da
        L_0x08f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x08f7 }
        L_0x08f7:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x08fc }
            throw r0     // Catch:{ all -> 0x08fc }
        L_0x08fc:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x08fe }
        L_0x08fe:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x0903:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.AUB r0 = X.AUB.A00
            r1.add(r0)
            r1.addAll(r7)
            X.1DT r0 = r9.A00
            r0.A0E(r1)
            return
        L_0x0915:
            java.lang.Object r1 = r1.A01
            X.A4i r1 = (X.C20039A4i) r1
            r0 = -2
            X.C20039A4i.A00(r1, r0)
            return
        L_0x091e:
            java.lang.Object r0 = r1.A01
            X.4RX r0 = (X.AnonymousClass4RX) r0
            X.1KB r2 = r0.A03
            r1 = 2131890750(0x7f12123e, float:1.94162E38)
        L_0x0927:
            r0 = 0
        L_0x0928:
            r2.A08(r1, r0)
            return
        L_0x092c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.newgroup.GroupVisibilitySettingDialog r0 = (com.whatsapp.group.newgroup.GroupVisibilitySettingDialog) r0
            X.1o3 r2 = r0.A00
            if (r2 == 0) goto L_0x093e
            X.1FL r1 = r0.A1D()
            java.lang.String r0 = "community-hidden-groups"
            r2.A01(r1, r0)
            return
        L_0x093e:
            java.lang.String r0 = "contextualHelpHandler"
        L_0x0940:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0945:
            java.lang.Object r2 = r1.A01
            com.whatsapp.group.newgroup.NewGroup r2 = (com.whatsapp.group.newgroup.NewGroup) r2
            X.129 r1 = r2.A0X
            java.lang.String r0 = "205306122327447"
            android.net.Uri r1 = r1.A03(r0)
            X.00H r0 = r2.A0g
            r0.get()
            android.content.Intent r1 = X.AnonymousClass1LU.A1p(r1)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x0960:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            X.3d3 r0 = r0.A0M
            r0.A0D()
            return
        L_0x096a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            com.whatsapp.group.newgroup.NewGroup.A0d(r0)
            return
        L_0x0972:
            java.lang.Object r0 = r1.A01
            com.whatsapp.home.ui.HomePlaceholderActivity$HomePlaceholderView r0 = (com.whatsapp.home.ui.HomePlaceholderActivity.HomePlaceholderView) r0
            com.whatsapp.home.ui.HomePlaceholderActivity.HomePlaceholderView.setPlaceholderE2EText$lambda$6(r0)
            return
        L_0x097a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.home.ui.StarredMessagesPlaceholderActivity$StarredMessagePlaceholderView r0 = (com.whatsapp.home.ui.StarredMessagesPlaceholderActivity.StarredMessagePlaceholderView) r0
            com.whatsapp.home.ui.StarredMessagesPlaceholderActivity.StarredMessagePlaceholderView.setPlaceholderE2EText$lambda$0(r0)
            return
        L_0x0982:
            java.lang.Object r1 = r1.A01
            com.whatsapp.identity.IdentityVerificationActivity r1 = (com.whatsapp.identity.IdentityVerificationActivity) r1
            r0 = 0
            com.whatsapp.identity.IdentityVerificationActivity.A0x(r1, r0)
            return
        L_0x098b:
            r0 = 2131889109(0x7f120bd5, float:1.9412872E38)
            r5.CNA(r0)
            X.10I r2 = r5.A05
            r1 = 33
            X.AkY r0 = new X.AkY
            r0.<init>(r5, r3, r6, r1)
            r2.CGN(r0)
            return
        L_0x099e:
            return
        L_0x099f:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x09a2:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
        L_0x09a6:
            r0.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21355Aik.run():void");
    }
}

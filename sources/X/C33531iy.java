package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.1iy  reason: invalid class name and case insensitive filesystem */
public final class C33531iy implements C33511iw {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final C33491iu A03;
    public final C200710s A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final Object A07 = new Object();
    public final AnonymousClass00H A08;
    public volatile boolean A09;

    public C33531iy(AnonymousClass1L9 r3, AnonymousClass11P r4, C18030ve r5, C33491iu r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r10, 8);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A08 = r8;
        this.A03 = r6;
        this.A05 = r9;
        this.A06 = r10;
        this.A04 = new C200710s(r7, false);
    }

    public final void A01(C62302rB r9, int i) {
        Integer valueOf;
        C18070vi.A0d(r9, 0);
        int i2 = r9.A05.A00;
        int i3 = r9.A00;
        List list = C62992sK.A01;
        if (999 != i) {
            if (!C62992sK.A00.containsKey(Integer.valueOf(i))) {
                StringBuilder sb = new StringBuilder();
                sb.append("UserNoticeBadgeManager/transitionUserNoticeBadgeState encountered invalid stage value=");
                sb.append(i);
                sb.append(" when trying to update the stage for notice with id=");
                sb.append(i2);
                Log.e(sb.toString());
                return;
            }
        }
        A00(r9, i);
        Integer valueOf2 = Integer.valueOf(i3);
        if ((valueOf2 != null && 999 == valueOf2.intValue()) || ((valueOf = Integer.valueOf(i)) != null && 999 == valueOf.intValue())) {
            ((C62582rd) this.A05.get()).A03(i2);
            this.A03.A00(i2, 999, false);
        } else if (C62992sK.A01(valueOf, valueOf2)) {
            if (valueOf2 != null) {
                int intValue = valueOf2.intValue();
                if (1 == intValue || 100 == intValue) {
                    if (valueOf == null || !C62992sK.A00.containsKey(valueOf)) {
                        return;
                    }
                    r9.A00 = i;
                    ((C62582rd) this.A05.get()).A04(r9);
                    this.A03.A00(i2, i, false);
                } else if (110 == intValue || 120 == intValue || 130 == intValue) {
                    Object obj = C62992sK.A00.get(valueOf2);
                    if (obj == null) {
                        obj = C18460wS.A00;
                    }
                    List list2 = (List) obj;
                    if (!(i == 150 || !(!list2.isEmpty()) || ((Number) list2.get(0)).intValue() == i)) {
                        return;
                    }
                    r9.A00 = i;
                    ((C62582rd) this.A05.get()).A04(r9);
                    this.A03.A00(i2, i, false);
                }
            }
            if (150 != i3) {
                if (170 != i3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("UserNoticeBadgeManager/transitionUserNoticeBadgeStage notice with id:");
                    sb2.append(i2);
                    sb2.append(" has invalid stage TRIGGERED on client side. Removing this notice's content from client side.");
                    Log.e(sb2.toString());
                    ((C62582rd) this.A05.get()).A03(i2);
                    return;
                }
                return;
            }
            r9.A00 = i;
            ((C62582rd) this.A05.get()).A04(r9);
            this.A03.A00(i2, i, false);
        }
    }

    public final boolean A03(C62302rB r13, boolean z) {
        C62302rB r8 = r13;
        C18070vi.A0d(r13, 0);
        int i = r13.A00;
        List list = C62992sK.A01;
        if ((Integer.valueOf(i) != null && 999 == i) || 170 == i || 150 == i) {
            return false;
        }
        long A012 = AnonymousClass11P.A01(this.A01);
        long j = r13.A01;
        int i2 = r13.A03;
        if (j == -1) {
            if (!z) {
                this.A04.execute(new AnonymousClass3C3(this, r8, 15, A012));
                return true;
            }
            A02(r13, A012);
            return true;
        } else if (A012 / 1000 <= j + (((long) i2) * 3600)) {
            return true;
        } else {
            if (!z) {
                this.A04.execute(new C21433Ak0(this, r13, 29));
                return false;
            }
            A01(r13, 150);
            return false;
        }
    }

    public void BcD(String str, JSONObject jSONObject, int[] iArr) {
    }

    public void Brk(int[] iArr, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r12 != 999) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C62302rB r11, int r12) {
        /*
            r10 = this;
            X.00H r0 = r10.A08
            java.lang.Object r2 = r0.get()
            X.CsQ r2 = (X.C26106CsQ) r2
            java.util.List r0 = X.C62992sK.A01
            r1 = 0
            r0 = 1
            if (r12 == r0) goto L_0x002f
            r0 = 100
            if (r12 == r0) goto L_0x002f
            r0 = 110(0x6e, float:1.54E-43)
            if (r12 == r0) goto L_0x002f
            r0 = 120(0x78, float:1.68E-43)
            if (r12 == r0) goto L_0x002f
            r0 = 130(0x82, float:1.82E-43)
            if (r12 == r0) goto L_0x002f
            r0 = 150(0x96, float:2.1E-43)
            if (r12 == r0) goto L_0x002f
            r0 = 170(0xaa, float:2.38E-43)
            if (r12 == r0) goto L_0x002f
            r0 = 999(0x3e7, float:1.4E-42)
            if (r12 == r0) goto L_0x002f
        L_0x002a:
            r3 = 0
        L_0x002b:
            X.C26106CsQ.A01(r2, r3, r1)
            return
        L_0x002f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x002a
            X.2mZ r0 = r11.A05
            int r4 = r0.A00
            int r5 = r1.intValue()
            long r7 = r11.A01
            int r6 = r11.A04
            r9 = 1
            X.2tN r3 = new X.2tN
            r3.<init>(r4, r5, r6, r7, r9)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33531iy.A00(X.2rB, int):void");
    }

    public final void A02(C62302rB r8, long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (r8.A01 == -1) {
            r8.A01 = seconds;
            ((C62582rd) this.A05.get()).A04(r8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r4 = new java.util.HashSet();
        r1 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r1.hasNext() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (X.C63592tN) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r4.add(java.lang.Integer.valueOf(r0.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r3 = r10.A05;
        r2 = ((X.C62582rd) r3.get()).A01().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r2.hasNext() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r1 = ((X.C62302rB) r2.next()).A05.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r4.contains(java.lang.Integer.valueOf(r1)) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        ((X.C62582rd) r3.get()).A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        r2 = X.AnonymousClass1D7.A0F((java.util.Map) ((X.C62582rd) r3.get()).A07.getValue()).values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r2.hasNext() == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r1 = ((X.C59762mq) r2.next()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        if (r4.contains(java.lang.Integer.valueOf(r1)) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        ((X.C62582rd) r3.get()).A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cc, code lost:
        r6 = new java.util.ArrayList();
        r9 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r9.hasNext() == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        r5 = (X.C63592tN) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r5 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        com.whatsapp.util.Log.e("UserNoticeBadgeManager/getUpdatedUserNoticeList encountered null when parsing through list of notice metadata objects retrieved from the server.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        r1 = X.AnonymousClass1D7.A0F((java.util.Map) ((X.C62582rd) r3.get()).A07.getValue());
        r4 = java.lang.Integer.valueOf(r5.A01);
        r8 = (X.C59762mq) r1.get(r4);
        r7 = (X.C63592tN) X.AnonymousClass1D7.A0F((java.util.Map) ((X.C62582rd) r3.get()).A09.getValue()).get(r4);
        r2 = X.C62992sK.A00(r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        if (r2 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        if (999 != r2.intValue()) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        if (r8 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0131, code lost:
        X.C62582rd.A00((X.C62582rd) r3.get(), r8.A06, r8.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013f, code lost:
        if (r8 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0145, code lost:
        if (r5.A03 > r8.A01) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0147, code lost:
        if (r7 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        if (X.C62992sK.A01(r2, X.C62992sK.A00(r7.A00)) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        r0 = X.C62992sK.A00(r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015b, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015d, code lost:
        r1 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0162, code lost:
        if (1 == r1) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0164, code lost:
        if (r1 == 0) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0168, code lost:
        if (100 == r1) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016c, code lost:
        if (999 == r1) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0178, code lost:
        if (X.C62992sK.A00.containsKey(java.lang.Integer.valueOf(r1)) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017a, code lost:
        r2 = (X.C62582rd) r3.get();
        r1 = r5.A00;
        r0 = (X.C63592tN) ((java.util.Map) r2.A09.getValue()).get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        if (r0 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0192, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0194, code lost:
        r0 = (X.C62302rB) ((java.util.Map) r2.A06.getValue()).get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a2, code lost:
        if (r0 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a4, code lost:
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
        ((X.C62582rd) r3.get()).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        r6.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bc, code lost:
        if ((!r6.isEmpty()) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01be, code lost:
        r5 = (X.C62582rd) r3.get();
        r6.size();
        ((X.C63332st) r5.A05.get()).A06(r6);
        r4 = r5.A09;
        ((java.util.Map) r4.getValue()).clear();
        r3 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e5, code lost:
        if (r3.hasNext() == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e7, code lost:
        r2 = (X.C63592tN) r3.next();
        ((java.util.Map) r4.getValue()).put(java.lang.Integer.valueOf(r2.A01), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fd, code lost:
        r7 = new java.util.ArrayList(X.C29351c6.A0C(r6, 10));
        r1 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0210, code lost:
        if (r1.hasNext() == false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0212, code lost:
        r7.add(java.lang.Integer.valueOf(((X.C63592tN) r1.next()).A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0222, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/notices id ");
        r1.append(r7);
        com.whatsapp.util.Log.i(r1.toString());
        r3 = new X.C192939pH();
        r3.A01("notices_id", X.C29431cG.A1B(r7));
        r0 = r5.A00;
        r0.A0I();
        r6 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x024b, code lost:
        if (r6 != null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x024d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0250, code lost:
        if (r0 != null) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0252, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notices id ");
        r2.append(X.C29431cG.A0g(",", "", "", r7, (X.C22821Di) null));
        com.whatsapp.util.Log.e(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x026d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026e, code lost:
        r2 = new android.net.Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v2").appendQueryParameter("ids", X.C29431cG.A0g(",", "", "", r7, (X.C22821Di) null));
        r4 = r5.A03;
        r4 = r2.appendQueryParameter("lg", r4.A05()).appendQueryParameter("lc", r4.A04()).appendQueryParameter("cc", X.AnonymousClass1K3.A00(r6.cc)).appendQueryParameter("platform", "android");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02d9, code lost:
        if (r5.A02.A00.getResources().getDisplayMetrics().densityDpi > 240) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02db, code lost:
        r0 = "hdpi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02dd, code lost:
        r0 = r4.appendQueryParameter("img-size", r0).build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02e7, code lost:
        r0 = "xxhdpi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02eb, code lost:
        r3.A00.put("url", r0.toString());
        r8 = r3.A00();
        r1 = new X.A1B();
        r1.A00 = X.AnonymousClass00R.A01;
        r1 = r1.A01();
        r3 = new X.C196269uj(com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.class);
        r3.A07("tag.whatsapp.usernotice.cms.content.fetch");
        r3.A03(r1);
        r4 = X.AnonymousClass00R.A00;
        r3.A06(r4, java.util.concurrent.TimeUnit.HOURS, 1);
        r3.A04(r8);
        r2 = new java.lang.StringBuilder();
        r2.append("tag.whatsapp.usernotice.cms.content.fetch.");
        r2.append(X.C29431cG.A0g(",", "", "", r7, (X.C22821Di) null));
        r1 = r2.toString();
        ((X.A7W) r5.A04.get()).A03((X.C162248Jv) r3.A00(), r4, r1).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0352, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcE(java.util.List r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeManager/handleDisclosures/metadata list size: "
            r1.append(r0)
            int r0 = r11.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r2 = r10.A02
            X.0vf r1 = X.C18040vf.A01
            r0 = 1799(0x707, float:2.521E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0357
            java.lang.Object r3 = r10.A07
            monitor-enter(r3)
            r2 = 0
        L_0x0028:
            boolean r1 = r10.A09     // Catch:{ all -> 0x0353 }
            r0 = 15
            if (r1 != 0) goto L_0x0038
            if (r2 >= r0) goto L_0x0356
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0035 }
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0038:
            if (r2 >= r0) goto L_0x0356
            monitor-exit(r3)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r1.next()
            X.2tN r0 = (X.C63592tN) r0
            if (r0 == 0) goto L_0x0044
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L_0x0044
        L_0x005c:
            X.00H r3 = r10.A05
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            java.util.List r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r2.next()
            X.2rB r0 = (X.C62302rB) r0
            X.2mZ r0 = r0.A05
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x006c
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            r0.A03(r1)
            goto L_0x006c
        L_0x0090:
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            X.0vl r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = X.AnonymousClass1D7.A0F(r0)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x00aa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r2.next()
            X.2mq r0 = (X.C59762mq) r0
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x00aa
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            r0.A03(r1)
            goto L_0x00aa
        L_0x00cc:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r9 = r11.iterator()
        L_0x00d5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r5 = r9.next()
            X.2tN r5 = (X.C63592tN) r5
            if (r5 != 0) goto L_0x00e9
            java.lang.String r0 = "UserNoticeBadgeManager/getUpdatedUserNoticeList encountered null when parsing through list of notice metadata objects retrieved from the server."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00d5
        L_0x00e9:
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            X.0vl r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r1 = X.AnonymousClass1D7.A0F(r0)
            int r0 = r5.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r8 = r1.get(r4)
            X.2mq r8 = (X.C59762mq) r8
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            X.0vl r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = X.AnonymousClass1D7.A0F(r0)
            java.lang.Object r7 = r0.get(r4)
            X.2tN r7 = (X.C63592tN) r7
            int r0 = r5.A00
            java.lang.Integer r2 = X.C62992sK.A00(r0)
            if (r2 == 0) goto L_0x013f
            r1 = 999(0x3e7, float:1.4E-42)
            int r0 = r2.intValue()
            if (r1 != r0) goto L_0x013f
            if (r8 == 0) goto L_0x00d5
            java.lang.Object r2 = r3.get()
            X.2rd r2 = (X.C62582rd) r2
            int r1 = r8.A00
            java.lang.String r0 = r8.A06
            X.C62582rd.A00(r2, r0, r1)
            goto L_0x00d5
        L_0x013f:
            if (r8 == 0) goto L_0x01b1
            int r1 = r5.A03
            int r0 = r8.A01
            if (r1 > r0) goto L_0x01b1
            if (r7 == 0) goto L_0x00d5
            int r0 = r7.A00
            java.lang.Integer r0 = X.C62992sK.A00(r0)
            boolean r0 = X.C62992sK.A01(r2, r0)
            if (r0 == 0) goto L_0x00d5
            int r0 = r5.A00
            java.lang.Integer r0 = X.C62992sK.A00(r0)
            if (r0 == 0) goto L_0x00d5
            int r1 = r0.intValue()
            r0 = 1
            if (r0 == r1) goto L_0x017a
            if (r1 == 0) goto L_0x017a
            r0 = 100
            if (r0 == r1) goto L_0x017a
            r0 = 999(0x3e7, float:1.4E-42)
            if (r0 == r1) goto L_0x017a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map r0 = X.C62992sK.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00d5
        L_0x017a:
            java.lang.Object r2 = r3.get()
            X.2rd r2 = (X.C62582rd) r2
            int r1 = r5.A00
            X.0vl r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r4)
            X.2tN r0 = (X.C63592tN) r0
            if (r0 == 0) goto L_0x0194
            r0.A00 = r1
        L_0x0194:
            X.0vl r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r4)
            X.2rB r0 = (X.C62302rB) r0
            if (r0 == 0) goto L_0x01a6
            r0.A00 = r1
        L_0x01a6:
            java.lang.Object r0 = r3.get()
            X.2rd r0 = (X.C62582rd) r0
            r0.A02()
            goto L_0x00d5
        L_0x01b1:
            r6.add(r5)
            goto L_0x00d5
        L_0x01b6:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0357
            java.lang.Object r5 = r3.get()
            X.2rd r5 = (X.C62582rd) r5
            r6.size()
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.2st r0 = (X.C63332st) r0
            r0.A06(r6)
            X.0vl r4 = r5.A09
            java.lang.Object r0 = r4.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            java.util.Iterator r3 = r6.iterator()
        L_0x01e1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r2 = r3.next()
            X.2tN r2 = (X.C63592tN) r2
            java.lang.Object r1 = r4.getValue()
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r0, r2)
            goto L_0x01e1
        L_0x01fd:
            r0 = 10
            int r0 = X.C29351c6.A0C(r6, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x020c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r0 = r1.next()
            X.2tN r0 = (X.C63592tN) r0
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.add(r0)
            goto L_0x020c
        L_0x0222:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/notices id "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9pH r3 = new X.9pH
            r3.<init>()
            int[] r1 = X.C29431cG.A1B(r7)
            java.lang.String r0 = "notices_id"
            r3.A01(r0, r1)
            X.11S r0 = r5.A00
            r0.A0I()
            com.whatsapp.Me r6 = r0.A00
            if (r6 != 0) goto L_0x026e
            r0 = 0
        L_0x024e:
            java.lang.String r6 = ","
            if (r0 != 0) goto L_0x02eb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "UserNoticeCmsContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notices id "
            r2.append(r0)
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C29431cG.A0g(r6, r0, r0, r7, r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x026e:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "whatsapp.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "user-notice"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r4 = r1.appendPath(r0)
            java.lang.String r2 = ","
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.C29431cG.A0g(r2, r0, r0, r7, r1)
            java.lang.String r0 = "ids"
            android.net.Uri$Builder r2 = r4.appendQueryParameter(r0, r1)
            X.0vb r4 = r5.A03
            java.lang.String r1 = r4.A05()
            java.lang.String r0 = "lg"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = r4.A04()
            java.lang.String r0 = "lc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r0 = r6.cc
            java.lang.String r1 = X.AnonymousClass1K3.A00(r0)
            java.lang.String r0 = "cc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            android.net.Uri$Builder r4 = r2.appendQueryParameter(r0, r1)
            java.lang.String r2 = "img-size"
            X.118 r0 = r5.A02
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x02e7
            java.lang.String r0 = "hdpi"
        L_0x02dd:
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r2, r0)
            android.net.Uri r0 = r0.build()
            goto L_0x024e
        L_0x02e7:
            java.lang.String r0 = "xxhdpi"
            goto L_0x02dd
        L_0x02eb:
            java.lang.String r2 = "url"
            java.lang.String r1 = r0.toString()
            java.util.Map r0 = r3.A00
            r0.put(r2, r1)
            X.A6Y r8 = r3.A00()
            X.A1B r1 = new X.A1B
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A00 = r0
            X.A6e r1 = r1.A01()
            java.lang.Class<com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker> r0 = com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.class
            X.8Jt r3 = new X.8Jt
            r3.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.usernotice.cms.content.fetch"
            r3.A07(r0)
            r3.A03(r1)
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            r1 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r3.A06(r4, r0, r1)
            r3.A04(r8)
            X.9cO r3 = r3.A00()
            X.8Jv r3 = (X.C162248Jv) r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "tag.whatsapp.usernotice.cms.content.fetch."
            r2.append(r0)
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r0 = X.C29431cG.A0g(r6, r0, r0, r7, r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            X.19K r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.A7W r0 = (X.A7W) r0
            X.A7G r0 = r0.A03(r3, r4, r1)
            r0.A02()
            return
        L_0x0353:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0356:
            monitor-exit(r3)
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33531iy.BcE(java.util.List, boolean, boolean):void");
    }
}

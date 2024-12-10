package X;

import android.net.Uri;
import org.json.JSONObject;

/* renamed from: X.72q  reason: invalid class name and case insensitive filesystem */
public final class C1407072q {
    public static final int A03 = C95874mw.A06;
    public final AnonymousClass00H A00;
    public final C32981i4 A01;
    public final AnonymousClass00H A02 = C217517g.A00(65560);

    public static String A00(Uri uri, C1406172f r3, String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return C1406172f.A01(uri, r3, str);
        }
        return C20064A5n.A01(str, (String) null, jSONObject);
    }

    public C1407072q(C32981i4 r2, AnonymousClass00H r3) {
        C18070vi.A0j(r3, r2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public static String A01(Uri uri, C1406172f r2, String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return C1406172f.A01(uri, r2, str);
        }
        return String.valueOf(jSONObject.getInt(str));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0292 A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x029f A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a2 A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02ac A[Catch:{ IllegalArgumentException -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ca A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e1 A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e7 A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06ab  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ff A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0200 A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0278 A[Catch:{ IllegalArgumentException | JSONException -> 0x0435 }] */
    public final X.C140036zq A02(android.net.Uri r115, X.AnonymousClass4TX r116, X.C36391no r117, X.C128436fz r118, X.C18030ve r119, boolean r120) {
        /*
            r114 = this;
            r1 = 0
            r111 = r119
            r0 = r111
            X.C18070vi.A0d(r0, r1)
            r2 = 1
            r113 = r116
            r112 = r117
            r3 = r118
            r1 = r112
            r0 = r113
            X.C72473Md.A1M(r1, r0, r3, r2)
            r4 = 0
            X.4Xd r16 = X.C87814Xd.A0e
            r110 = r114
            r0 = r110
            X.00H r0 = r0.A00
            r109 = r0
            r109.get()
            java.lang.String r6 = "token"
            r2 = r115
            java.lang.String r0 = r2.getQueryParameter(r6)
            if (r0 == 0) goto L_0x006c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006c
            r5 = 508(0x1fc, float:7.12E-43)
            X.0vf r1 = X.C18040vf.A02
            r0 = r111
            boolean r0 = X.C18020vd.A05(r1, r0, r5)
            if (r0 == 0) goto L_0x006c
            r17 = 1
            java.lang.String r1 = "deep_link"
            r0 = r113
            r0.A01(r1)
            java.lang.String r1 = "ctwa_deeplink_parsing_starts"
            r0.A00(r1)
        L_0x004e:
            java.lang.String r8 = r2.getQueryParameter(r6)
            r1 = 0
            if (r8 == 0) goto L_0x00f1
            X.00H r0 = r3.A00
            java.lang.Object r7 = r0.get()
            X.71C r7 = (X.AnonymousClass71C) r7
            java.lang.String r0 = "token_bypass_override"
            r2.getQueryParameter(r0)
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            monitor-enter(r0)
            monitor-exit(r0)
            r6 = 0
            goto L_0x006f
        L_0x006c:
            r17 = 0
            goto L_0x004e
        L_0x006f:
            X.A4E r5 = new X.A4E     // Catch:{ 9Ks -> 0x00df }
            r5.<init>(r8)     // Catch:{ 9Ks -> 0x00df }
            X.00H r0 = r7.A02     // Catch:{ 9Ks -> 0x00df }
            java.lang.Object r0 = r0.get()     // Catch:{ 9Ks -> 0x00df }
            X.6wA r0 = (X.C137876wA) r0     // Catch:{ 9Ks -> 0x00df }
            X.00H r0 = r0.A00     // Catch:{ 9Ks -> 0x00df }
            r0.get()     // Catch:{ 9Ks -> 0x00df }
            java.util.Map r0 = X.C137876wA.A01     // Catch:{ 9Ks -> 0x00df }
            X.9ME r8 = X.C196649vP.A00(r5, r0)     // Catch:{ 9Ks -> 0x00df }
            boolean r0 = r8 instanceof X.AnonymousClass8oO     // Catch:{ 9Ks -> 0x00df }
            if (r0 == 0) goto L_0x00b3
            r0 = 1
            X.AnonymousClass71C.A01(r7, r4, r0)     // Catch:{ 9Ks -> 0x00df }
            X.00H r0 = r7.A00     // Catch:{ 9Ks -> 0x00df }
            java.lang.Object r9 = r0.get()     // Catch:{ 9Ks -> 0x00df }
            X.4aI r9 = (X.C88654aI) r9     // Catch:{ 9Ks -> 0x00df }
            org.json.JSONObject r8 = r5.A03     // Catch:{ 9Ks -> 0x00df }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass71C.A00(r7, r8)     // Catch:{ 9Ks -> 0x00df }
            boolean r0 = X.C18020vd.A04(r9)     // Catch:{ 9Ks -> 0x00df }
            if (r0 == 0) goto L_0x00a8
            r0 = 26
            X.C88654aI.A03(r9, r5, r4, r0, r6)     // Catch:{ 9Ks -> 0x00df }
        L_0x00a8:
            if (r8 == 0) goto L_0x00b0
            X.5yx r5 = new X.5yx     // Catch:{ 9Ks -> 0x00df }
            r5.<init>(r8)     // Catch:{ 9Ks -> 0x00df }
            goto L_0x00e9
        L_0x00b0:
            X.5yy r5 = X.C116995yy.A00     // Catch:{ 9Ks -> 0x00df }
            goto L_0x00e9
        L_0x00b3:
            boolean r0 = r8 instanceof X.AnonymousClass8oN     // Catch:{ 9Ks -> 0x00df }
            if (r0 == 0) goto L_0x00da
            X.8oN r8 = (X.AnonymousClass8oN) r8     // Catch:{ 9Ks -> 0x00df }
            java.lang.String r0 = r8.A00     // Catch:{ 9Ks -> 0x00df }
            X.AnonymousClass71C.A01(r7, r0, r6)     // Catch:{ 9Ks -> 0x00df }
            X.00H r0 = r7.A00     // Catch:{ 9Ks -> 0x00df }
            java.lang.Object r8 = r0.get()     // Catch:{ 9Ks -> 0x00df }
            X.4aI r8 = (X.C88654aI) r8     // Catch:{ 9Ks -> 0x00df }
            org.json.JSONObject r0 = r5.A03     // Catch:{ 9Ks -> 0x00df }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass71C.A00(r7, r0)     // Catch:{ 9Ks -> 0x00df }
            boolean r0 = X.C18020vd.A04(r8)     // Catch:{ 9Ks -> 0x00df }
            if (r0 == 0) goto L_0x00d7
            r0 = 27
            X.C88654aI.A03(r8, r5, r4, r0, r6)     // Catch:{ 9Ks -> 0x00df }
        L_0x00d7:
            X.5yy r5 = X.C116995yy.A00     // Catch:{ 9Ks -> 0x00df }
            goto L_0x00e9
        L_0x00da:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ 9Ks -> 0x00df }
            throw r0     // Catch:{ 9Ks -> 0x00df }
        L_0x00df:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.AnonymousClass71C.A01(r7, r0, r6)
            X.5yy r5 = X.C116995yy.A00
        L_0x00e9:
            boolean r0 = r5 instanceof X.C116985yx
            if (r0 == 0) goto L_0x00f1
            X.5yx r5 = (X.C116985yx) r5
            org.json.JSONObject r1 = r5.A00
        L_0x00f1:
            X.00H r0 = r3.A01
            java.lang.Object r3 = r0.get()
            X.72f r3 = (X.C1406172f) r3
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.6ls r0 = (X.C131916ls) r0
            boolean r0 = r0.A00()
            r32 = 0
            if (r0 == 0) goto L_0x0138
            if (r1 == 0) goto L_0x0117
            X.1Dw r5 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "lid"
        L_0x010f:
            java.lang.String r0 = X.C20064A5n.A01(r0, r4, r1)
            com.whatsapp.jid.UserJid r32 = r5.A04(r0)
        L_0x0117:
            java.lang.String r6 = "data_filter_required"
            java.lang.String r0 = r2.getQueryParameter(r6)
            if (r0 == 0) goto L_0x0126
            int r5 = r0.length()
            r0 = 0
            if (r5 != 0) goto L_0x0127
        L_0x0126:
            r0 = 1
        L_0x0127:
            r103 = r0 ^ 1
            if (r1 == 0) goto L_0x0178
            java.lang.String r0 = "client_filters"
            boolean r0 = r1.has(r0)
            if (r0 == 0) goto L_0x0178
            java.lang.String r7 = "Error during parsing of payload object "
            r74 = 0
            goto L_0x013f
        L_0x0138:
            if (r1 == 0) goto L_0x0117
            X.1Dw r5 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "jid"
            goto L_0x010f
        L_0x013f:
            java.lang.String r0 = "payload"
            java.lang.String r5 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x015d }
            if (r5 == 0) goto L_0x014e
            int r0 = r5.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x015d }
            if (r0 == 0) goto L_0x014e
            goto L_0x019b
        L_0x014e:
            X.00H r0 = r3.A02     // Catch:{ IllegalArgumentException | JSONException -> 0x015d }
            java.lang.Object r6 = r0.get()     // Catch:{ IllegalArgumentException | JSONException -> 0x015d }
            X.4Qj r6 = (X.C86144Qj) r6     // Catch:{ IllegalArgumentException | JSONException -> 0x015d }
            r5 = 7
            r0 = r32
            r6.A00(r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x015d }
            goto L_0x019d
        L_0x015d:
            r5 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r7, r0, r5)
            X.C1406172f.A02(r3, r0)
            X.00H r0 = r3.A02
            java.lang.Object r6 = r0.get()
            X.4Qj r6 = (X.C86144Qj) r6
            r5 = 6
            r0 = r32
            r6.A00(r0, r5)
            goto L_0x019d
        L_0x0178:
            if (r103 != 0) goto L_0x017c
            java.lang.String r6 = "data"
        L_0x017c:
            java.lang.String r74 = r2.getQueryParameter(r6)
            if (r74 == 0) goto L_0x0188
            int r0 = r74.length()
            if (r0 != 0) goto L_0x0198
        L_0x0188:
            X.00H r0 = r3.A02
            java.lang.Object r6 = r0.get()
            X.4Qj r6 = (X.C86144Qj) r6
            r5 = 7
            r0 = r32
            r6.A00(r0, r5)
            r74 = 0
        L_0x0198:
            if (r1 == 0) goto L_0x0458
            goto L_0x019d
        L_0x019b:
            r74 = r5
        L_0x019d:
            java.lang.String r11 = "jid"
            java.lang.String r31 = "app"
            java.lang.String r30 = "flow_cta_text"
            java.lang.String r29 = "always_show_ad_attribution"
            java.lang.String r28 = "category_id"
            java.lang.String r27 = "disable_nudge"
            java.lang.String r26 = "land_on_whatsapp_catalog"
            java.lang.String r19 = "product_id"
            java.lang.String r18 = "entry_point"
            java.lang.String r15 = "source_url"
            java.lang.String r14 = "auto_greeting_msg_cta_payload"
            java.lang.String r13 = "auto_greeting_msg_cta_type"
            java.lang.String r12 = "auto_greeting_msg"
            java.lang.String r8 = "show_keyboard"
            java.lang.String r7 = "show_ad_attribution"
            java.lang.String r6 = "have_wm"
            java.lang.String r5 = "have_ib"
            java.lang.String r10 = "1"
            X.1Dw r9 = com.whatsapp.jid.UserJid.Companion     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = X.C1406172f.A01(r2, r3, r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = X.C20064A5n.A01(r11, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            com.whatsapp.jid.UserJid r38 = r9.A04(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.1yH r11 = X.AnonymousClass1E2.A01     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r9 = "lid"
            java.lang.String r0 = X.C1406172f.A01(r2, r3, r9)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = X.C20064A5n.A01(r9, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.1E2 r37 = r11.A03(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "source"
            r25 = 0
            java.lang.String r40 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r40 == 0) goto L_0x01ef
            int r9 = r40.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r9 != 0) goto L_0x01f5
        L_0x01ef:
            java.lang.String r40 = X.C1406172f.A01(r2, r3, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r40 == 0) goto L_0x0200
        L_0x01f5:
            int r9 = r40.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r9 == 0) goto L_0x0200
            r0 = 32
            if (r9 > r0) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r40 = 0
        L_0x0202:
            java.lang.String r0 = "context"
            java.lang.String r11 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r45 = 0
            if (r11 == 0) goto L_0x0212
            int r9 = r11.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r9 != 0) goto L_0x0218
        L_0x0212:
            java.lang.String r11 = X.C1406172f.A01(r2, r3, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r11 == 0) goto L_0x0220
        L_0x0218:
            int r0 = r11.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r0 == 0) goto L_0x0220
            r45 = r11
        L_0x0220:
            java.lang.String r24 = A01(r2, r3, r5, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r23 = A01(r2, r3, r6, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r22 = A01(r2, r3, r7, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r21 = A01(r2, r3, r8, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r20 = A01(r2, r3, r12, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r42 = A00(r2, r3, r13, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r43 = A00(r2, r3, r14, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r44 = A00(r2, r3, r15, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r18
            java.lang.String r41 = A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "icebreaker"
            java.lang.String r0 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r46 = X.C1406172f.A00(r2, r3, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r19
            java.lang.String r47 = A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r26
            java.lang.String r48 = A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "redirect"
            java.lang.String r60 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r27
            java.lang.String r19 = A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.00H r0 = r3.A00     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.0vd r5 = X.C17880vN.A0P(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = 11035(0x2b1b, float:1.5463E-41)
            X.0vf r14 = X.C18040vf.A02     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            boolean r0 = X.C18020vd.A05(r14, r5, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r0 == 0) goto L_0x029f
            java.lang.String r0 = "signals"
            java.lang.String r59 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
        L_0x027e:
            r0 = r28
            java.lang.String r49 = A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "banner"
            org.json.JSONObject r65 = r1.optJSONObject(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "cdv"
            boolean r5 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r5 == 0) goto L_0x02a2
            int r0 = r1.optInt(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.4DN r34 = X.AnonymousClass4GV.A00(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            goto L_0x02a4
        L_0x029f:
            r59 = 0
            goto L_0x027e
        L_0x02a2:
            r34 = 0
        L_0x02a4:
            java.lang.String r0 = "client_filters"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ IllegalArgumentException -> 0x02b1 }
            if (r0 == 0) goto L_0x02ca
            java.util.List r9 = X.AnonymousClass4GW.A00(r0)     // Catch:{ IllegalArgumentException -> 0x02b1 }
            goto L_0x02cb
        L_0x02b1:
            r6 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r5 = "Data payload dropped due to client filter parsing error: "
            r0.append(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0.append(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r5 = ".message"
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.C1406172f.A02(r3, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r5 = 1
            r9 = 0
            goto L_0x02cc
        L_0x02ca:
            r9 = 0
        L_0x02cb:
            r5 = 0
        L_0x02cc:
            if (r103 != 0) goto L_0x02d8
            if (r9 == 0) goto L_0x02db
            X.4DT r0 = X.AnonymousClass4DT.GREEN_TOS     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            boolean r0 = r9.contains(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r0 == 0) goto L_0x02db
        L_0x02d8:
            r68 = 1
            goto L_0x02dd
        L_0x02db:
            r68 = 0
        L_0x02dd:
            r39 = r74
            if (r5 == 0) goto L_0x02e5
            r39 = 0
            r40 = 0
        L_0x02e5:
            if (r45 != 0) goto L_0x02e9
            r45 = r74
        L_0x02e9:
            X.00H r0 = r3.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.Object r5 = r0.get()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            monitor-enter(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            monitor-exit(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            monitor-enter(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            monitor-exit(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r29
            java.lang.String r15 = A01(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r30
            java.lang.String r7 = A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "flow_id"
            boolean r5 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r5 == 0) goto L_0x037e
            java.lang.String r6 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
        L_0x030f:
            java.lang.String r0 = "flow_first_screen"
            boolean r5 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r5 == 0) goto L_0x037c
            java.lang.String r5 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
        L_0x031b:
            X.4UE r18 = new X.4UE     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r18
            r0.<init>(r7, r6, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r31
            boolean r0 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r0 != 0) goto L_0x0374
            r0 = r31
            java.lang.String r52 = X.C1406172f.A01(r2, r3, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r6 = 0
        L_0x0331:
            java.lang.String r0 = "headline"
            java.lang.String r53 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "body"
            java.lang.String r54 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "source_id"
            java.lang.String r55 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "ref_param"
            java.lang.String r56 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "wel_msg"
            java.lang.String r57 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "ctwa_clid"
            java.lang.String r58 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r0 = "icebreakers"
            boolean r5 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r13 = 0
            if (r5 == 0) goto L_0x03a1
            org.json.JSONArray r8 = r1.optJSONArray(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r8 == 0) goto L_0x03a1
            int r0 = r8.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r0 <= 0) goto L_0x03a1
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            int r12 = r8.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = 0
            goto L_0x0380
        L_0x0374:
            r6 = 0
            r0 = r31
            java.lang.String r52 = X.C20064A5n.A01(r0, r4, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            goto L_0x0331
        L_0x037c:
            r5 = 0
            goto L_0x031b
        L_0x037e:
            r6 = 0
            goto L_0x030f
        L_0x0380:
            if (r0 >= r12) goto L_0x03a1
            org.json.JSONObject r5 = r8.optJSONObject(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r5 == 0) goto L_0x039e
            java.lang.String r7 = "question"
            java.lang.String r7 = X.C20064A5n.A01(r7, r4, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r7 == 0) goto L_0x039e
            java.lang.String r11 = "response"
            java.lang.String r11 = X.C20064A5n.A01(r11, r4, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.4cE r5 = new X.4cE     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r5.<init>(r7, r11)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r13.add(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
        L_0x039e:
            int r0 = r0 + 1
            goto L_0x0380
        L_0x03a1:
            java.lang.String r0 = "media"
            boolean r5 = r1.has(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r5 == 0) goto L_0x03f4
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r0 == 0) goto L_0x03e1
            java.lang.String r1 = "video_url"
            java.lang.String r7 = X.C20064A5n.A01(r1, r4, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r1 = "thumb_url"
            java.lang.String r6 = X.C20064A5n.A01(r1, r4, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r1 = "thumb_data"
            java.lang.String r1 = X.C20064A5n.A01(r1, r4, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            if (r1 == 0) goto L_0x03e2
            r5 = 0
            byte[] r1 = android.util.Base64.decode(r1, r5)     // Catch:{ IllegalArgumentException -> 0x03c9 }
            goto L_0x03e7
        L_0x03c9:
            r8 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r5 = "Failed to decode thumbnail data: "
            r1.append(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r1.append(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            java.lang.String r5 = ".message"
            java.lang.String r1 = X.AnonymousClass000.A0y(r5, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.C1406172f.A02(r3, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r1 = 0
            goto L_0x03e7
        L_0x03e1:
            r7 = 0
        L_0x03e2:
            r1 = 0
            if (r0 != 0) goto L_0x03e7
            r5 = 0
            goto L_0x03ed
        L_0x03e7:
            java.lang.String r5 = "og_img_url"
            java.lang.String r5 = X.C20064A5n.A01(r5, r4, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
        L_0x03ed:
            X.4Ue r25 = new X.4Ue     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r25
            r0.<init>(r7, r6, r5, r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
        L_0x03f4:
            r0 = r24
            boolean r66 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r23
            boolean r67 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r22
            boolean r69 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r21
            boolean r70 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            boolean r72 = r10.equalsIgnoreCase(r15)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r19
            boolean r73 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r0 = r20
            boolean r71 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            X.4Xd r15 = new X.4Xd     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            r51 = r4
            r61 = r4
            r62 = r4
            r33 = r15
            r35 = r18
            r36 = r25
            r50 = r4
            r63 = r13
            r64 = r9
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ IllegalArgumentException | JSONException -> 0x0435 }
            goto L_0x0568
        L_0x0435:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error during parsing of payload object "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r6)
            X.C1406172f.A02(r3, r0)
            X.00H r0 = r3.A02
            java.lang.Object r5 = r0.get()
            X.4Qj r5 = (X.C86144Qj) r5
            r1 = 6
            r0 = r32
            r5.A00(r0, r1)
            java.lang.String r0 = r6.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0458:
            X.00H r0 = r3.A00
            X.0vd r1 = X.C17880vN.A0P(r0)
            r0 = 8587(0x218b, float:1.2033E-41)
            X.0vf r14 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r14, r1, r0)
            if (r0 != 0) goto L_0x05e5
            java.lang.String r0 = "source"
            java.lang.String r75 = X.C1406172f.A01(r2, r3, r0)
            if (r75 == 0) goto L_0x05e1
            int r1 = r75.length()
            if (r1 == 0) goto L_0x05e1
            r0 = 32
            if (r1 > r0) goto L_0x05e1
        L_0x047a:
            r80 = 0
            java.lang.String r0 = "context"
            java.lang.String r1 = X.C1406172f.A01(r2, r3, r0)
            if (r1 == 0) goto L_0x048c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x048c
            r80 = r1
        L_0x048c:
            java.lang.String r0 = "have_ib"
            java.lang.String r6 = r2.getQueryParameter(r0)
            java.lang.String r0 = "have_wm"
            java.lang.String r8 = r2.getQueryParameter(r0)
            java.lang.String r0 = "show_ad_attribution"
            java.lang.String r9 = r2.getQueryParameter(r0)
            java.lang.String r0 = "show_keyboard"
            java.lang.String r10 = r2.getQueryParameter(r0)
            java.lang.String r0 = "product_id"
            java.lang.String r82 = r2.getQueryParameter(r0)
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.getQueryParameter(r0)
            com.whatsapp.jid.UserJid r73 = r1.A04(r0)
            X.1yH r1 = X.AnonymousClass1E2.A01
            java.lang.String r0 = "lid"
            java.lang.String r0 = r2.getQueryParameter(r0)
            X.1E2 r72 = r1.A03(r0)
            java.lang.String r0 = "source_url"
            java.lang.String r79 = r2.getQueryParameter(r0)
            java.lang.String r81 = X.C1406172f.A00(r2, r3, r4)
            java.lang.String r0 = "land_on_whatsapp_catalog"
            java.lang.String r83 = r2.getQueryParameter(r0)
            java.lang.String r0 = "category_id"
            java.lang.String r84 = r2.getQueryParameter(r0)
            java.lang.String r0 = "entry_point"
            java.lang.String r76 = r2.getQueryParameter(r0)
            if (r80 != 0) goto L_0x04e2
            r80 = r74
        L_0x04e2:
            X.00H r0 = r3.A03
            java.lang.Object r1 = r0.get()
            monitor-enter(r1)
            monitor-exit(r1)
            java.lang.Object r0 = r0.get()
            monitor-enter(r0)
            monitor-exit(r0)
            java.lang.String r0 = "always_show_ad_attribution"
            java.lang.String r1 = r2.getQueryParameter(r0)
            java.lang.String r0 = "flow_cta_text"
            java.lang.String r7 = r2.getQueryParameter(r0)
            java.lang.String r0 = "app"
            java.lang.String r87 = r2.getQueryParameter(r0)
            java.lang.String r0 = "disable_nudge"
            java.lang.String r5 = r2.getQueryParameter(r0)
            java.lang.String r0 = "auto_greeting_msg"
            java.lang.String r3 = r2.getQueryParameter(r0)
            java.lang.String r0 = "auto_greeting_msg_cta_type"
            java.lang.String r77 = r2.getQueryParameter(r0)
            java.lang.String r0 = "auto_greeting_msg_cta_payload"
            java.lang.String r78 = r2.getQueryParameter(r0)
            java.lang.String r0 = "1"
            boolean r101 = r0.equalsIgnoreCase(r6)
            boolean r102 = r0.equalsIgnoreCase(r8)
            boolean r104 = r0.equalsIgnoreCase(r9)
            boolean r105 = r0.equalsIgnoreCase(r10)
            boolean r107 = r0.equalsIgnoreCase(r1)
            X.4UE r1 = new X.4UE
            r1.<init>(r7, r4, r4)
            boolean r108 = r0.equalsIgnoreCase(r5)
            boolean r106 = r0.equalsIgnoreCase(r3)
            X.4Xd r15 = new X.4Xd
            r71 = r4
            r85 = r4
            r86 = r4
            r88 = r4
            r89 = r4
            r90 = r4
            r91 = r4
            r92 = r4
            r93 = r4
            r94 = r4
            r95 = r4
            r96 = r4
            r97 = r4
            r98 = r4
            r99 = r4
            r100 = r4
            r68 = r15
            r69 = r4
            r70 = r1
            r68.<init>(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108)
        L_0x0568:
            r6 = 0
            r1 = 508(0x1fc, float:7.12E-43)
            r0 = r111
            boolean r0 = X.C18020vd.A05(r14, r0, r1)
            if (r0 == 0) goto L_0x0648
            java.lang.String r8 = r15.A0G
            if (r8 != 0) goto L_0x057d
            java.lang.String r0 = "entry_point"
            java.lang.String r8 = r2.getQueryParameter(r0)
        L_0x057d:
            java.lang.String r7 = r15.A07
            if (r7 != 0) goto L_0x0587
            java.lang.String r0 = "app"
            java.lang.String r7 = r2.getQueryParameter(r0)
        L_0x0587:
            java.lang.Object r1 = r109.get()
            X.6bl r1 = (X.C125836bl) r1
            if (r8 == 0) goto L_0x0595
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0597
        L_0x0595:
            java.lang.String r8 = "click_to_chat_link"
        L_0x0597:
            int r0 = r8.length()
            if (r0 == 0) goto L_0x05e8
            X.0ve r1 = r1.A00
            r0 = 533(0x215, float:7.47E-43)
            java.lang.String r1 = X.C108955ca.A0v(r1, r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x05e9
            java.lang.String r0 = ","
            java.util.List r3 = X.C108965cb.A0v(r1, r0, r6)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x05de
            java.util.ListIterator r1 = X.C108955ca.A18(r3)
        L_0x05bb:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x05de
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x05bb
            java.util.List r0 = X.C108985cd.A0t(r3, r1)
        L_0x05cb:
            java.lang.String[] r5 = X.C108955ca.A1b(r0)
            int r3 = r5.length
            r1 = 0
        L_0x05d1:
            if (r1 >= r3) goto L_0x05e8
            r0 = r5[r1]
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x05e9
            int r1 = r1 + 1
            goto L_0x05d1
        L_0x05de:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x05cb
        L_0x05e1:
            r75 = 0
            goto L_0x047a
        L_0x05e5:
            r15 = r16
            goto L_0x0568
        L_0x05e8:
            r8 = 0
        L_0x05e9:
            java.lang.Object r1 = r109.get()
            X.6bl r1 = (X.C125836bl) r1
            if (r120 == 0) goto L_0x063d
            java.lang.String r7 = "whatsapp"
        L_0x05f3:
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0642
            X.0ve r1 = r1.A00
            r0 = 534(0x216, float:7.48E-43)
            java.lang.String r1 = X.C108955ca.A0v(r1, r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0642
            java.lang.String r0 = ","
            java.util.List r3 = X.C108965cb.A0v(r1, r0, r6)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x063a
            java.util.ListIterator r1 = X.C108955ca.A18(r3)
        L_0x0617:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x063a
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0617
            java.util.List r0 = X.C108985cd.A0t(r3, r1)
        L_0x0627:
            java.lang.String[] r5 = X.C108955ca.A1b(r0)
            int r3 = r5.length
            r1 = 0
        L_0x062d:
            if (r1 >= r3) goto L_0x0640
            r0 = r5[r1]
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0642
            int r1 = r1 + 1
            goto L_0x062d
        L_0x063a:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0627
        L_0x063d:
            if (r7 == 0) goto L_0x0642
            goto L_0x05f3
        L_0x0640:
            java.lang.String r7 = "external"
        L_0x0642:
            X.6qv r5 = new X.6qv
            r5.<init>(r8, r7)
            goto L_0x064d
        L_0x0648:
            X.6qv r5 = new X.6qv
            r5.<init>(r4, r4)
        L_0x064d:
            java.lang.String r1 = r15.A0R
            if (r1 == 0) goto L_0x0686
            X.1Dv r0 = X.AnonymousClass1BI.A00
            r0 = r112
            java.util.Set r14 = r0.A00(r4, r1)
        L_0x0659:
            java.lang.String r0 = "text"
            java.lang.String r13 = r2.getQueryParameter(r0)
            if (r13 == 0) goto L_0x0688
            int r12 = A03
            X.1zY r11 = new X.1zY
            r11.<init>(r13)
            r10 = 0
            r9 = 0
        L_0x066a:
            int r0 = r13.length()
            if (r10 >= r0) goto L_0x068b
            if (r9 >= r12) goto L_0x068b
            r11.A00 = r10
            long r0 = X.C43291zZ.A00(r11, r6)
            r7 = -1
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0680
            int r9 = r9 + 1
        L_0x0680:
            int r0 = r11.A02(r0, r10)
            int r10 = r10 + r0
            goto L_0x066a
        L_0x0686:
            r14 = r4
            goto L_0x0659
        L_0x0688:
            r19 = r4
            goto L_0x0697
        L_0x068b:
            java.lang.String r1 = r13.substring(r6, r10)
            if (r1 == 0) goto L_0x0688
            r0 = 8000(0x1f40, float:1.121E-41)
            java.lang.String r19 = X.AnonymousClass1EG.A0E(r1, r0)
        L_0x0697:
            if (r14 == 0) goto L_0x06a9
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x06a1
            r15 = r16
        L_0x06a1:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x06a9
            r19 = r4
        L_0x06a9:
            if (r17 == 0) goto L_0x06b2
            java.lang.String r1 = "ctwa_deeplink_parsing_completes"
            r0 = r113
            r0.A00(r1)
        L_0x06b2:
            java.lang.String r16 = X.C32981i4.A07(r2)
            r0 = r110
            X.1i4 r0 = r0.A01
            X.1D6 r0 = r0.A0G(r2)
            if (r0 != 0) goto L_0x06c5
            X.1D6 r0 = new X.1D6
            r0.<init>(r4, r4)
        L_0x06c5:
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r5.A00
            X.6zq r14 = new X.6zq
            r17 = r3
            r18 = r2
            r20 = r1
            r21 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407072q.A02(android.net.Uri, X.4TX, X.1no, X.6fz, X.0ve, boolean):X.6zq");
    }
}

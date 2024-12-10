package X;

/* renamed from: X.7RE  reason: invalid class name */
public class AnonymousClass7RE implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass7RE(AnonymousClass70Q r3) {
        this.A00 = 3;
        this.A03 = r3;
        this.A01 = 2131888762;
        this.A02 = 2131888763;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [X.6UM, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024b, code lost:
        r2 = (X.C25993Cq8) r3.A03;
        r7 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0252, code lost:
        if (r7 >= 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0254, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0255, code lost:
        r22 = r3.A02;
        r21 = r3.A01;
        r20 = r2.A05;
        r0 = r2.A03;
        r19 = r0;
        r0 = X.C28851b7.A08(0, r0);
        r8 = X.C29351c6.A0D(r0);
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0276, code lost:
        if (r6.hasNext() == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0278, code lost:
        r1 = r20.A00;
        r5 = (((X.AnonymousClass20T) r6).A00() + r7) % r1;
        r0 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0289, code lost:
        if (r5 < 0) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028b, code lost:
        if (r0 == null) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028d, code lost:
        X.C17890vO.A1D(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0291, code lost:
        r5 = r5 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0293, code lost:
        r18 = X.AnonymousClass000.A13();
        r6 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029f, code lost:
        if (r6.hasNext() == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a1, code lost:
        r5 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02af, code lost:
        if (X.C108965cb.A1b(r2.A02, X.AnonymousClass000.A0M(r5)) == false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b1, code lost:
        r18.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02b7, code lost:
        r9 = X.C29431cG.A12(r18);
        r8 = r2.A08;
        r0 = r8.keySet();
        X.C18070vi.A0X(r0);
        r0 = new java.util.ArrayDeque(X.C41841x9.A06(r9, r0));
        r16 = r18.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02d8, code lost:
        if (r16.hasNext() == false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02da, code lost:
        r12 = X.C72453Mb.A0H(r16);
        r10 = java.lang.Integer.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e6, code lost:
        if (r8.get(r10) != null) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e8, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02eb, code lost:
        if (r0 == -1) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f1, code lost:
        if (X.C108965cb.A1b(r9, r0) != false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f5, code lost:
        r0 = (java.lang.Number) r0.pollFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fb, code lost:
        if (r0 != null) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02fd, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0301, code lost:
        r7 = java.lang.Integer.valueOf(r0.intValue());
        r11 = (X.CNB) r8.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030f, code lost:
        if (r11 == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0311, code lost:
        r6 = r11.A01.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0317, code lost:
        if (r6 == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0319, code lost:
        r11.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031c, code lost:
        r0 = r2.A07.A00(android.graphics.Bitmap.Config.ARGB_8888, r22, r21);
        X.C18070vi.A0X(r0);
        r11 = new X.CNB(r0);
        r6 = r11.A01.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r5 = r20.A00;
        r13 = new X.C25411Oc(0, r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0348, code lost:
        if (r13.hasNext() == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x034a, code lost:
        r15 = (r12 - ((X.AnonymousClass20T) r13).A00()) % r5;
        r0 = java.lang.Integer.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0358, code lost:
        if (r15 < 0) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035a, code lost:
        if (r0 == null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x035d, code lost:
        r15 = r15 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035e, code lost:
        r1 = (X.CNB) r8.get(java.lang.Integer.valueOf(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0368, code lost:
        if (r1 == null) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x036c, code lost:
        if (r1.A00 != false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x036e, code lost:
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0374, code lost:
        if (r1.A06() == false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0376, code lost:
        r5 = r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x037a, code lost:
        if (r5 == null) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037c, code lost:
        if (r15 >= r12) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r14 = r5.A05();
        X.C18070vi.A0X(r14);
        r14 = (android.graphics.Bitmap) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x038b, code lost:
        if (r6.A06() == false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0395, code lost:
        if (X.C18070vi.A18(r6.A05(), r14) != false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0397, code lost:
        r13 = X.C108945cZ.A0I((android.graphics.Bitmap) r6.A05());
        r13.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        r13.drawBitmap(r14, 0.0f, 0.0f, (android.graphics.Paint) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ab, code lost:
        r13 = new X.C25411Oc(r15 + 1, r12).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03ba, code lost:
        if (r13.hasNext() == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bc, code lost:
        r12 = ((X.AnonymousClass20T) r13).A00();
        r1 = r2.A06;
        r0 = r6.A05();
        X.C18070vi.A0X(r0);
        r1.A00((android.graphics.Bitmap) r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d6, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03dd, code lost:
        if (r6.A06() == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03df, code lost:
        X.C108945cZ.A0I((android.graphics.Bitmap) r6.A05()).drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ee, code lost:
        r12 = new X.C25411Oc(0, r12).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03fb, code lost:
        if (r12.hasNext() == false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03fd, code lost:
        r5 = ((X.AnonymousClass20T) r12).A00();
        r1 = r2.A06;
        r0 = r6.A05();
        X.C18070vi.A0X(r0);
        r1.A00((android.graphics.Bitmap) r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0413, code lost:
        r6.close();
        r8.remove(r7);
        r11.A00 = false;
        r8.put(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0422, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0426, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0429, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x042a, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x042d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0434, code lost:
        if (r18.isEmpty() == false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0436, code lost:
        r0 = (int) (((float) r19) * 0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x043b, code lost:
        r2.A0A = r0;
        r2.A0B = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x043f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0440, code lost:
        r1 = r18.size();
        r0 = X.AnonymousClass001.A0n(r18, X.C28851b7.A03((int) (((float) r1) * 0.5f), 0, r1 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        if (r3 == 3) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x024b;
                case 1: goto L_0x048e;
                case 2: goto L_0x023f;
                case 3: goto L_0x04b2;
                case 4: goto L_0x0225;
                case 5: goto L_0x016e;
                case 6: goto L_0x0216;
                case 7: goto L_0x0208;
                case 8: goto L_0x013f;
                case 9: goto L_0x0121;
                case 10: goto L_0x0196;
                case 11: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A03
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r0 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r0
            int r4 = r3.A01
            int r2 = r3.A02
            X.6om r1 = X.C108975cc.A0Q(r0)
            java.lang.String r0 = "tos_link_opened"
            r1.A01(r0, r4, r2)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r4 = r3.A03
            X.6ld r4 = (X.C131766ld) r4
            int r2 = r3.A01
            int r3 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InlineYoutubeVideoPlayer/YoutubeJsInterface/postPlayerEvent:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " data: "
            X.C17900vP.A0j(r0, r1, r3)
            if (r2 == 0) goto L_0x00a0
            r5 = 1
            if (r2 == r5) goto L_0x0453
            r0 = 2
            if (r2 == r0) goto L_0x006a
            r0 = 3
            X.6Ms r4 = r4.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r2 == r0) goto L_0x005a
            java.lang.String r0 = "Invalid postPlayerEvent"
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r3)
            if (r3 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "player_error_"
        L_0x0052:
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            X.C122086Ms.A03(r4, r2, r0, r5)
            return
        L_0x005a:
            java.lang.String r0 = "Youtube player Error="
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r3)
            if (r3 == 0) goto L_0x0063
            r5 = 0
        L_0x0063:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "youtube_error_"
            goto L_0x0052
        L_0x006a:
            X.6Ms r5 = r4.A00
            int r0 = r3 * 1000
            long r6 = (long) r0
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0018
            long r3 = r5.A04
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            r5.A04 = r6
            android.webkit.WebView r1 = r5.A0C
            java.lang.String r0 = "javascript:(function() { loaded = true; })()"
            r1.loadUrl(r0)
            long r3 = r5.A04
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0018
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid duration="
            java.lang.String r2 = X.C17890vO.A0a(r0, r1, r3)
            r1 = 0
            java.lang.String r0 = "invalid_duration"
            X.C122086Ms.A03(r5, r2, r0, r1)
            return
        L_0x00a0:
            X.6Ms r2 = r4.A00
            r0 = 3
            if (r3 <= r0) goto L_0x00fd
            r0 = 5
            if (r3 != r0) goto L_0x0018
        L_0x00a8:
            int r1 = r2.A02
            r0 = 2
            r5 = 1
            if (r1 == r0) goto L_0x00e8
            if (r3 != r0) goto L_0x00b3
            r2.A0B()
        L_0x00b3:
            X.88S r0 = r2.A0B
            if (r0 == 0) goto L_0x00ba
            r0.C0q(r5, r3)
        L_0x00ba:
            r2.A03 = r3
            int r1 = r2.A00
            if (r1 != r5) goto L_0x00db
            if (r3 == r5) goto L_0x00e0
        L_0x00c2:
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x010b
            if (r3 != r5) goto L_0x010b
            long r6 = r2.A04
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            java.lang.String r1 = "Video started playing before duration loaded."
            java.lang.String r0 = "playback_started_before_duration_loaded"
            X.C122086Ms.A03(r2, r1, r0, r5)
            return
        L_0x00db:
            r0 = 2
            if (r1 != r0) goto L_0x00c2
            if (r3 != r0) goto L_0x00c2
        L_0x00e0:
            r1 = 0
            r2.A00 = r1
            X.BwF r0 = r2.A0F
            r0.A0J = r1
            goto L_0x00c2
        L_0x00e8:
            if (r3 != r5) goto L_0x00b3
            android.webkit.WebView r1 = r2.A0C
            java.lang.String r0 = "javascript:(function() { player.playVideo(); })()"
            r1.loadUrl(r0)
            r2.A02 = r5
            r2.A00 = r5
            X.BwF r0 = r2.A0F
            r0.A0G()
            r0.A0J = r5
            goto L_0x00b3
        L_0x00fd:
            if (r3 != 0) goto L_0x00a8
            int r0 = r2.A03
            if (r0 == r3) goto L_0x00a8
            X.88P r0 = r2.A08
            if (r0 == 0) goto L_0x00a8
            r0.BpQ(r2)
            goto L_0x00a8
        L_0x010b:
            r0 = 3
            if (r3 != r0) goto L_0x011f
        L_0x010e:
            X.88O r0 = r2.A07
            if (r0 == 0) goto L_0x0018
            r0.Bmq(r2, r5)
            return
        L_0x0116:
            r2.A08 = r5
            X.88R r0 = r2.A0A
            if (r0 == 0) goto L_0x011f
            r0.C6F()
        L_0x011f:
            r5 = 0
            goto L_0x010e
        L_0x0121:
            java.lang.Object r4 = r3.A03
            android.widget.EditText r4 = (android.widget.EditText) r4
            int r2 = r3.A01
            int r1 = r3.A02
            java.lang.String[] r0 = com.whatsapp.mentions.MentionableEntry.A0S
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x013d
            int r0 = r0.length()
        L_0x0135:
            if (r2 > r0) goto L_0x0018
            if (r1 > r0) goto L_0x0018
            r4.setSelection(r2, r1)
            return
        L_0x013d:
            r0 = 0
            goto L_0x0135
        L_0x013f:
            java.lang.Object r0 = r3.A03
            X.5dm r0 = (X.C109645dm) r0
            int r2 = r3.A01
            int r4 = r3.A02
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r3 = r0.get()
            X.6GX r3 = (X.AnonymousClass6GX) r3
            if (r3 == 0) goto L_0x0018
            r1 = 0
            int r0 = r2 - r4
            int r7 = java.lang.Math.max(r1, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r7
            long r5 = r5.toSeconds(r0)
            int r1 = (int) r5
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x045d
            X.5fj r0 = r3.A09
            com.whatsapp.status.playback.widget.VoiceStatusContentView r0 = r0.A02
            if (r0 != 0) goto L_0x045a
            java.lang.String r0 = "voiceStatusContentView"
            goto L_0x04cb
        L_0x016e:
            java.lang.Object r5 = r3.A03
            X.4ed r5 = (X.C90784ed) r5
            int r4 = r3.A01
            int r3 = r3.A02
            X.4aY r1 = r5.A05
            X.AnonymousClass4aY.A1I(r1)
            r0 = 0
            r5.A00 = r0
            java.lang.Boolean r0 = r1.A8J
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0018
            X.5cQ r0 = r1.A2Q
            X.1KB r2 = r0.getGlobalUI()
            r1 = 4
            X.7RE r0 = new X.7RE
            r0.<init>(r5, r3, r4, r1)
            r2.A0J(r0)
            return
        L_0x0196:
            java.lang.Object r5 = r3.A03
            X.6yb r5 = (X.C139296yb) r5
            int r0 = r3.A01
            int r7 = r3.A02
            monitor-enter(r5)
            X.63a r6 = new X.63a     // Catch:{ all -> 0x0205 }
            r6.<init>()     // Catch:{ all -> 0x0205 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0205 }
            r6.A00 = r0     // Catch:{ all -> 0x0205 }
            X.1Wh r3 = r5.A03     // Catch:{ all -> 0x0205 }
            int r0 = r3.A00()     // Catch:{ all -> 0x0205 }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0205 }
            r6.A03 = r0     // Catch:{ all -> 0x0205 }
            X.11P r2 = r5.A01     // Catch:{ all -> 0x0205 }
            long r0 = X.AnonymousClass11P.A01(r2)     // Catch:{ all -> 0x0205 }
            long r0 = r3.A01(r0)     // Catch:{ all -> 0x0205 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0205 }
            r6.A01 = r0     // Catch:{ all -> 0x0205 }
            X.1Oe r0 = r5.A04     // Catch:{ all -> 0x0205 }
            java.lang.String r0 = r0.A03()     // Catch:{ all -> 0x0205 }
            r6.A05 = r0     // Catch:{ all -> 0x0205 }
            long r0 = X.AnonymousClass11P.A01(r2)     // Catch:{ all -> 0x0205 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0205 }
            r6.A04 = r0     // Catch:{ all -> 0x0205 }
            X.10I r4 = r5.A05     // Catch:{ all -> 0x0205 }
            X.0vl r0 = r5.A06     // Catch:{ all -> 0x0205 }
            long r2 = X.C72453Mb.A0K(r0)     // Catch:{ all -> 0x0205 }
            r1 = 45
            X.7RM r0 = new X.7RM     // Catch:{ all -> 0x0205 }
            r0.<init>((java.lang.Object) r5, (int) r7, (int) r1)     // Catch:{ all -> 0x0205 }
            X.25d r3 = r4.CGv(r0, r2)     // Catch:{ all -> 0x0205 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0205 }
            X.6UM r2 = new X.6UM     // Catch:{ all -> 0x0205 }
            r2.<init>()     // Catch:{ all -> 0x0205 }
            r2.A02 = r3     // Catch:{ all -> 0x0205 }
            r2.A01 = r6     // Catch:{ all -> 0x0205 }
            r2.A00 = r0     // Catch:{ all -> 0x0205 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0205 }
            java.util.HashMap r0 = r5.A00     // Catch:{ all -> 0x0205 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0205 }
            monitor-exit(r5)
            return
        L_0x0205:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0208:
            java.lang.Object r5 = r3.A03
            X.1iv r5 = (X.C33501iv) r5
            int r4 = r3.A01
            int r2 = r3.A02
            r1 = 1
            r0 = 0
            r5.A03(r4, r2, r1, r0)
            return
        L_0x0216:
            java.lang.Object r0 = r3.A03
            X.6Md r0 = (X.C121956Md) r0
            int r2 = r3.A02
            r1 = 2131896086(0x7f122716, float:1.9427023E38)
            X.1KB r0 = r0.A02
            r0.A08(r1, r2)
            return
        L_0x0225:
            java.lang.Object r4 = r3.A03
            X.4ed r4 = (X.C90784ed) r4
            int r2 = r3.A01
            int r1 = r3.A02
            X.4aY r0 = r4.A05
            X.1BI r0 = r0.A3R
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x023b
            X.C90784ed.A01(r4, r2, r1)
            return
        L_0x023b:
            X.C90784ed.A00(r4, r2, r1)
            return
        L_0x023f:
            java.lang.Object r2 = r3.A03
            X.DRB r2 = (X.DRB) r2
            int r1 = r3.A01
            int r0 = r3.A02
            X.DRB.A07(r2, r1, r0)
            return
        L_0x024b:
            java.lang.Object r2 = r3.A03
            X.Cq8 r2 = (X.C25993Cq8) r2
            int r7 = r2.A00
            r0 = 0
            if (r7 >= r0) goto L_0x0255
            r7 = 0
        L_0x0255:
            int r0 = r3.A02
            r22 = r0
            int r0 = r3.A01
            r21 = r0
            r4 = 0
            X.CJp r0 = r2.A05
            r20 = r0
            int r0 = r2.A03
            r19 = r0
            X.1Oc r0 = X.C28851b7.A08(r4, r0)
            java.util.ArrayList r8 = X.C29351c6.A0D(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0272:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0293
            r0 = r6
            X.20T r0 = (X.AnonymousClass20T) r0
            int r5 = r0.A00()
            int r5 = r5 + r7
            r0 = r20
            int r1 = r0.A00
            int r5 = r5 % r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r5 < 0) goto L_0x0291
            if (r0 == 0) goto L_0x0291
        L_0x028d:
            X.C17890vO.A1D(r8, r5)
            goto L_0x0272
        L_0x0291:
            int r5 = r5 + r1
            goto L_0x028d
        L_0x0293:
            java.util.ArrayList r18 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r8.iterator()
        L_0x029b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r5 = r6.next()
            int r1 = X.AnonymousClass000.A0M(r5)
            java.util.Set r0 = r2.A02
            boolean r0 = X.C108965cb.A1b(r0, r1)
            if (r0 == 0) goto L_0x029b
            r0 = r18
            r0.add(r5)
            goto L_0x029b
        L_0x02b7:
            java.util.Set r9 = X.C29431cG.A12(r18)
            java.util.concurrent.ConcurrentHashMap r8 = r2.A08
            java.util.Set r0 = r8.keySet()
            X.C18070vi.A0X(r0)
            java.util.Set r1 = X.C41841x9.A06(r9, r0)
            java.util.ArrayDeque r17 = new java.util.ArrayDeque
            r0 = r17
            r0.<init>(r1)
            java.util.Iterator r16 = r18.iterator()
        L_0x02d3:
            boolean r0 = r16.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x042e
            int r12 = X.C72453Mb.A0H(r16)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            java.lang.Object r0 = r8.get(r10)
            if (r0 != 0) goto L_0x02d3
            int r0 = r2.A00
            r1 = -1
            if (r0 == r1) goto L_0x02f5
            boolean r0 = X.C108965cb.A1b(r9, r0)
            if (r0 != 0) goto L_0x02f5
            goto L_0x024b
        L_0x02f5:
            java.lang.Object r0 = r17.pollFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x0301
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0301:
            int r0 = r0.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r8.get(r7)
            X.CNB r11 = (X.CNB) r11
            if (r11 == 0) goto L_0x031c
            X.DRN r0 = r11.A01
            X.DRN r6 = r0.A04()
            if (r6 == 0) goto L_0x031c
        L_0x0319:
            r11.A00 = r5
            goto L_0x0337
        L_0x031c:
            X.CUc r11 = r2.A07
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = r22
            r0 = r21
            X.DRN r0 = r11.A00(r6, r1, r0)
            X.C18070vi.A0X(r0)
            X.CNB r11 = new X.CNB
            r11.<init>(r0)
            X.DRN r0 = r11.A01
            X.DRN r6 = r0.clone()
            goto L_0x0319
        L_0x0337:
            r0 = r20
            int r5 = r0.A00     // Catch:{ all -> 0x0427 }
            X.1Oc r0 = new X.1Oc     // Catch:{ all -> 0x0427 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0427 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0344:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x03d9
            r0 = r13
            X.20T r0 = (X.AnonymousClass20T) r0     // Catch:{ all -> 0x0427 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0427 }
            int r15 = r12 - r0
            int r15 = r15 % r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0427 }
            if (r15 < 0) goto L_0x035d
            if (r0 == 0) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            int r15 = r15 + r5
        L_0x035e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0427 }
            java.lang.Object r1 = r8.get(r0)     // Catch:{ all -> 0x0427 }
            X.CNB r1 = (X.CNB) r1     // Catch:{ all -> 0x0427 }
            if (r1 == 0) goto L_0x0344
            boolean r0 = r1.A00     // Catch:{ all -> 0x0427 }
            if (r0 != 0) goto L_0x0344
            X.DRN r1 = r1.A01     // Catch:{ all -> 0x0427 }
            boolean r0 = r1.A06()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x0344
            X.DRN r5 = r1.A04()     // Catch:{ all -> 0x0427 }
            if (r5 == 0) goto L_0x03d9
            if (r15 >= r12) goto L_0x03d6
            java.lang.Object r14 = r5.A05()     // Catch:{ all -> 0x0420 }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x0420 }
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch:{ all -> 0x0420 }
            boolean r0 = r6.A06()     // Catch:{ all -> 0x0420 }
            if (r0 == 0) goto L_0x03ab
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x0420 }
            boolean r0 = X.C18070vi.A18(r0, r14)     // Catch:{ all -> 0x0420 }
            if (r0 != 0) goto L_0x03ab
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x0420 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0420 }
            android.graphics.Canvas r13 = X.C108945cZ.A0I(r0)     // Catch:{ all -> 0x0420 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x0420 }
            r13.drawColor(r4, r0)     // Catch:{ all -> 0x0420 }
            r0 = 0
            r1 = 0
            r13.drawBitmap(r14, r1, r1, r0)     // Catch:{ all -> 0x0420 }
        L_0x03ab:
            int r1 = r15 + 1
            X.1Oc r0 = new X.1Oc     // Catch:{ all -> 0x0420 }
            r0.<init>(r1, r12)     // Catch:{ all -> 0x0420 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0420 }
        L_0x03b6:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0420 }
            if (r0 == 0) goto L_0x03d2
            r0 = r13
            X.20T r0 = (X.AnonymousClass20T) r0     // Catch:{ all -> 0x0420 }
            int r12 = r0.A00()     // Catch:{ all -> 0x0420 }
            X.CWs r1 = r2.A06     // Catch:{ all -> 0x0420 }
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x0420 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0420 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0420 }
            r1.A00(r0, r12)     // Catch:{ all -> 0x0420 }
            goto L_0x03b6
        L_0x03d2:
            r5.close()     // Catch:{ all -> 0x0427 }
            goto L_0x0413
        L_0x03d6:
            r5.close()     // Catch:{ all -> 0x0427 }
        L_0x03d9:
            boolean r0 = r6.A06()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x03ee
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x0427 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0427 }
            android.graphics.Canvas r1 = X.C108945cZ.A0I(r0)     // Catch:{ all -> 0x0427 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x0427 }
            r1.drawColor(r4, r0)     // Catch:{ all -> 0x0427 }
        L_0x03ee:
            X.1Oc r0 = new X.1Oc     // Catch:{ all -> 0x0427 }
            r0.<init>(r4, r12)     // Catch:{ all -> 0x0427 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0427 }
        L_0x03f7:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x0413
            r0 = r12
            X.20T r0 = (X.AnonymousClass20T) r0     // Catch:{ all -> 0x0427 }
            int r5 = r0.A00()     // Catch:{ all -> 0x0427 }
            X.CWs r1 = r2.A06     // Catch:{ all -> 0x0427 }
            java.lang.Object r0 = r6.A05()     // Catch:{ all -> 0x0427 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0427 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0427 }
            r1.A00(r0, r5)     // Catch:{ all -> 0x0427 }
            goto L_0x03f7
        L_0x0413:
            r6.close()
            r8.remove(r7)
            r11.A00 = r4
            r8.put(r10, r11)
            goto L_0x02d3
        L_0x0420:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0422 }
        L_0x0422:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0427 }
            throw r0     // Catch:{ all -> 0x0427 }
        L_0x0427:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0429 }
        L_0x0429:
            r1 = move-exception
            X.CDX.A00(r6, r0)
            throw r1
        L_0x042e:
            boolean r0 = r18.isEmpty()
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x0440
            r0 = r19
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
        L_0x043b:
            r2.A0A = r0
            r2.A0B = r4
            return
        L_0x0440:
            int r1 = r18.size()
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            int r1 = r1 - r5
            int r1 = X.C28851b7.A03(r0, r4, r1)
            r0 = r18
            int r0 = X.AnonymousClass001.A0n(r0, r1)
            goto L_0x043b
        L_0x0453:
            X.6Ms r1 = r4.A00
            int r0 = r3 * 1000
            r1.A01 = r0
            return
        L_0x045a:
            r0.setDuration(r1)
        L_0x045d:
            r0 = 50
            if (r7 > r0) goto L_0x0471
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0471
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0471
            X.6oj r0 = r3.A05
            r0.A00()
            r0 = 1
            r3.A05 = r0
        L_0x0471:
            float r1 = (float) r4
            float r0 = (float) r2
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            r3.A00 = r1
            X.7MH r3 = r3.A0B
            X.1DT r0 = r3.A02
            X.AnonymousClass3MX.A1J(r0, r2)
            int r0 = r4 / 150
            int r2 = r0 + -2
            r1 = -1
            X.1DT r0 = r3.A03
            if (r2 >= r1) goto L_0x048a
            r2 = -4
        L_0x048a:
            X.AnonymousClass3MX.A1J(r0, r2)
            return
        L_0x048e:
            java.lang.Object r1 = r3.A03
            com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet r1 = (com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet) r1
            int r7 = r3.A01
            int r8 = r3.A02
            r10 = 0
            X.00H r0 = r1.A0G
            if (r0 == 0) goto L_0x04af
            java.lang.Object r2 = r0.get()
            X.A5M r2 = (X.A5M) r2
            X.0vl r0 = r1.A0I
            X.1BI r3 = X.AnonymousClass3MX.A0m(r0)
            r9 = 1
            r4 = 0
            r6 = r4
            r5 = r4
            r2.A03(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x04af:
            java.lang.String r0 = "bizIntegrityLogger"
            goto L_0x04cb
        L_0x04b2:
            java.lang.Object r3 = r3.A03
            X.70Q r3 = (X.AnonymousClass70Q) r3
            r2 = 2131888762(0x7f120a7a, float:1.9412168E38)
            X.1bI r0 = r3.A05
            if (r0 == 0) goto L_0x04e2
            android.view.View r1 = r0.A02()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x04e2
            com.whatsapp.WaEditText r0 = r3.A04
            if (r0 != 0) goto L_0x04d0
            java.lang.String r0 = "phoneField"
        L_0x04cb:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x04d0:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x04df
            int r0 = r0.length()
            if (r0 == 0) goto L_0x04df
            r2 = 2131888763(0x7f120a7b, float:1.941217E38)
        L_0x04df:
            r1.setText(r2)
        L_0x04e2:
            r0 = 1
            r3.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RE.run():void");
    }

    public AnonymousClass7RE(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }

    public AnonymousClass7RE(C121956Md r2, int i) {
        this.A00 = 6;
        this.A03 = r2;
        this.A01 = 2131896086;
        this.A02 = i;
    }
}

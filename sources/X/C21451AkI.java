package X;

import android.util.JsonWriter;

/* renamed from: X.AkI  reason: case insensitive filesystem */
public class C21451AkI implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21451AkI(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(JsonWriter jsonWriter, C198049xh r3, String str) {
        r3.A01.get();
        jsonWriter.value(C20015A3h.A01(r3.A00, (C22661Cs) r3.A02.get(), str));
    }

    public static void A01(AnonymousClass10I r1, Object obj, Object obj2, int i) {
        r1.CGF(new C21451AkI(obj, obj2, i));
    }

    /* JADX WARNING: type inference failed for: r1v71, types: [X.24B, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0401, code lost:
        if (r0.intValue() != 7) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0423, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        com.whatsapp.util.Log.e("SearchLocationStateLiveData/onLocationUpdated Failed to store the search location", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0429, code lost:
        r3 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0450, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0451, code lost:
        r2 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0461, code lost:
        r5.A00 = r0;
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0468, code lost:
        if (r0.A05() != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x046a, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x046b, code lost:
        X.AnonymousClass3MX.A1K(r5.A02, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0470, code lost:
        X.AnonymousClass3MX.A1K(r5.A04, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0475, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b9, code lost:
        if (r1.isEmpty() != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0673, code lost:
        if (X.C18020vd.A05(r1, r2, 5114) == false) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x067a, code lost:
        r3.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x067d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0699, code lost:
        X.C63082sT.A01(r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x069c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x074c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x074d, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0750, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x07c6, code lost:
        X.C111225jD.A0A(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x088e, code lost:
        r4.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0891, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0908, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A0D, 4588) != false) goto L_0x090a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0b6d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0b93, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0b96, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0254, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0257, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x029f, code lost:
        if (r4.A0B() == false) goto L_0x02a1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x041e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0311;
                case 1: goto L_0x0abe;
                case 2: goto L_0x0ab0;
                case 3: goto L_0x0830;
                case 4: goto L_0x023b;
                case 5: goto L_0x0aa2;
                case 6: goto L_0x0005;
                case 7: goto L_0x0145;
                case 8: goto L_0x0a94;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0108;
                case 13: goto L_0x00df;
                case 14: goto L_0x0a86;
                case 15: goto L_0x0a76;
                case 16: goto L_0x0a6a;
                case 17: goto L_0x0a5e;
                case 18: goto L_0x0a3e;
                case 19: goto L_0x0807;
                case 20: goto L_0x07ca;
                case 21: goto L_0x07bd;
                case 22: goto L_0x07ad;
                case 23: goto L_0x079d;
                case 24: goto L_0x0790;
                case 25: goto L_0x0784;
                case 26: goto L_0x0774;
                case 27: goto L_0x079d;
                case 28: goto L_0x0765;
                case 29: goto L_0x0751;
                case 30: goto L_0x009f;
                case 31: goto L_0x0070;
                case 32: goto L_0x0717;
                case 33: goto L_0x0b6e;
                case 34: goto L_0x0707;
                case 35: goto L_0x06d1;
                case 36: goto L_0x06c2;
                case 37: goto L_0x06c2;
                case 38: goto L_0x069d;
                case 39: goto L_0x068c;
                case 40: goto L_0x067e;
                case 41: goto L_0x0647;
                case 42: goto L_0x0518;
                case 43: goto L_0x01bb;
                case 44: goto L_0x04c1;
                case 45: goto L_0x04ac;
                case 46: goto L_0x0476;
                case 47: goto L_0x0015;
                case 48: goto L_0x03e3;
                case 49: goto L_0x03ab;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A01
            X.1pj r2 = (X.C37551pj) r2
            java.lang.Object r1 = r12.A02
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.C37551pj.A07(r2, r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r6 = r12.A01
            X.9gZ r6 = (X.C187909gZ) r6
            java.lang.Object r2 = r12.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1Ty r0 = r6.A01
            X.AEW r1 = r0.A08(r2)
            X.4S5 r0 = r6.A05
            com.whatsapp.jid.UserJid r7 = r0.A00(r2)
            if (r1 == 0) goto L_0x0014
            boolean r8 = r1.A0a
            X.9uT r0 = r6.A04
            java.lang.String r5 = r7.getRawString()
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            X.0vl r4 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r4)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r3 = "last_business_profile_shopping_flows_for_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r3, r5, r0)
            boolean r0 = r1.getBoolean(r0, r2)
            if (r8 == r0) goto L_0x0014
            java.lang.String r2 = r7.getRawString()
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r4)
            java.lang.String r0 = X.C17900vP.A0A(r3, r2)
            X.C17880vN.A1F(r1, r0, r8)
            X.A8S r0 = r6.A03
            r0.A0C(r7)
            X.1KB r2 = r6.A00
            r0 = 25
            X.AkD r1 = new X.AkD
            r1.<init>(r6, r0)
            goto L_0x0b93
        L_0x0070:
            java.lang.Object r4 = r12.A01
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r4 = (com.whatsapp.bot.prompts.BonsaiPromptsViewModel) r4
            java.lang.Object r3 = r12.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.00H r0 = r4.A07
            java.lang.Object r1 = r0.get()
            X.1Pl r1 = (X.C25741Pl) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r3, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.24e r2 = r1.A00(r3)
            if (r2 == 0) goto L_0x0014
            r4.A08 = r2
            X.1NK r0 = r4.A04
            boolean r0 = r0.A08(r3)
            if (r0 != 0) goto L_0x0014
            X.1vp r1 = r4.A05
            java.util.List r0 = r2.A0H
            r1.A0E(r0)
            return
        L_0x009f:
            java.lang.Object r3 = r12.A01
            X.3Uy r3 = (X.C73343Uy) r3
            java.lang.Object r2 = r12.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.1Ty r0 = r3.A07
            X.AEW r0 = r0.A08(r2)
            if (r0 == 0) goto L_0x00bb
            java.util.List r1 = r0.A0T
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00cb
        L_0x00bb:
            X.00H r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            X.24e r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0014
            java.util.List r1 = r0.A0H
        L_0x00cb:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            r3.A02 = r1
            X.1NK r0 = r3.A08
            boolean r0 = r0.A08(r2)
            r3.A03 = r0
            X.C73343Uy.A00(r3)
            return
        L_0x00df:
            java.lang.Object r4 = r12.A01
            X.8qR r4 = (X.C170648qR) r4
            java.lang.Object r3 = r12.A02
            r2 = 0
        L_0x00e6:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x00f7
            if (r3 == 0) goto L_0x0014
            X.1KB r2 = r4.A04
            r0 = 34
        L_0x00f0:
            X.AkC r1 = new X.AkC
            r1.<init>(r3, r0)
            goto L_0x0b93
        L_0x00f7:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0014 }
            int r2 = r2 + 1
            r0 = 5
            if (r2 < r0) goto L_0x00e6
            if (r3 == 0) goto L_0x0014
            X.1KB r2 = r4.A04
            r0 = 35
            goto L_0x00f0
        L_0x0108:
            java.lang.Object r4 = r12.A01
            X.1pj r4 = (X.C37551pj) r4
            java.lang.Object r1 = r12.A02
            X.1ca r1 = (X.C29621ca) r1
            r2 = 0
            java.lang.String r0 = "blocking"
            X.1ca r1 = r1.A0K(r0)
            if (r1 != 0) goto L_0x011d
            java.lang.String r0 = "null blocking child returned for get chat psa block status"
            goto L_0x0254
        L_0x011d:
            java.lang.String r0 = "status"
            java.lang.String r1 = X.C29621ca.A02(r1, r0)
            if (r1 != 0) goto L_0x0129
            java.lang.String r0 = "null status child returned for get chat psa block status"
            goto L_0x0254
        L_0x0129:
            java.lang.String r0 = "blocked"
            boolean r0 = r1.equals(r0)
            com.whatsapp.jid.UserJid r1 = X.C37551pj.A00(r4)
            java.util.LinkedHashSet r3 = X.C17880vN.A14()
            if (r0 == 0) goto L_0x0140
            if (r1 != 0) goto L_0x0014
            X.1yL r2 = X.C42541yL.A00
            monitor-enter(r4)
            goto L_0x0acc
        L_0x0140:
            if (r1 == 0) goto L_0x0014
            monitor-enter(r4)
            goto L_0x0ae0
        L_0x0145:
            java.lang.Object r5 = r12.A01
            X.9hX r5 = (X.C188509hX) r5
            java.lang.Object r4 = r12.A02
            X.1pj r4 = (X.C37551pj) r4
            r8 = 0
            r7 = 1
            com.whatsapp.jid.UserJid r10 = r5.A03
            X.0ve r2 = r4.A0D
            r1 = 2522(0x9da, float:3.534E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0014
            X.1M9 r0 = r4.A03
            X.1E7 r1 = r0.A0H(r10)
            X.8rC r3 = new X.8rC
            r3.<init>()
            java.lang.String r0 = r5.A07
            int r0 = X.C83554Fo.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            boolean r0 = r5.A0A
            r0 = r0 ^ 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            X.1Mc r0 = r4.A0F
            boolean r0 = r0.A0A(r10)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
            r3.A00 = r0
            X.2lf r0 = r1.A0H
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
            r3.A01 = r0
            X.1TB r2 = r4.A0A
            X.11P r0 = r4.A06
            long r5 = X.AnonymousClass11P.A01(r0)
            long r0 = X.AnonymousClass8BW.A05()
            long r5 = r5 - r0
            java.lang.String[] r9 = X.C17880vN.A1Z()
            X.1DL r0 = r2.A04
            long r0 = r0.A09(r10)
            X.C17880vN.A1V(r9, r8, r0)
            X.C17880vN.A1V(r9, r7, r5)
            X.1Cd r0 = r2.A06
            X.1at r5 = r0.get()
            goto L_0x0afc
        L_0x01bb:
            java.lang.Object r4 = r12.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r4 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r4
            java.lang.Object r1 = r12.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.8FG r6 = r4.A4b()
            java.lang.Object r0 = r1.get(r0)
            X.8we r0 = (X.C174358we) r0
            int r1 = r0.A00
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            java.lang.String r5 = "horizontalBusinessListView"
            if (r0 == 0) goto L_0x0b69
            int r3 = r0.getHeight()
            r0 = 75
            if (r1 != r0) goto L_0x01fc
            android.app.Application r1 = r6.A00
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.C18070vi.A0z(r1, r0)
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = X.C62762rw.A01(r1, r0)
            int r3 = r3 + r0
            X.AF1 r2 = r6.A07
            if (r2 == 0) goto L_0x01fc
            X.A5P r1 = r6.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A05(r2, r0)
        L_0x01fc:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            if (r0 == 0) goto L_0x0b69
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0014
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            if (r0 == 0) goto L_0x0b69
            int r0 = r0.getHeight()
            float r3 = (float) r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.A02
            if (r1 == 0) goto L_0x0b69
            r0 = 0
            r1.setVisibility(r0)
            r0 = 0
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r0, r0, r3, r0)
            X.D5O r0 = new X.D5O
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r1 = 0
            X.AFo r0 = new X.AFo
            r0.<init>(r4, r1)
            r2.setAnimationListener(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            if (r0 == 0) goto L_0x0b69
            r0.startAnimation(r2)
            return
        L_0x023b:
            java.lang.Object r7 = r12.A01
            X.9hX r7 = (X.C188509hX) r7
            java.lang.Object r6 = r12.A02
            X.1pj r6 = (X.C37551pj) r6
            r5 = 1
            X.1E7 r4 = r7.A02
            boolean r0 = r7.A0A
            boolean r0 = r6.A0O(r4, r0)
            if (r0 == 0) goto L_0x0014
            java.util.List r0 = r7.A01
            if (r0 != 0) goto L_0x0258
            java.lang.String r0 = "BlockListManager/should record message template blocks fieldstat, but messages not set!"
        L_0x0254:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0258:
            java.util.Iterator r9 = r0.iterator()
        L_0x025c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r9.next()
            X.9rQ r1 = (X.C194249rQ) r1
            X.8rr r3 = new X.8rr
            r3.<init>()
            java.lang.String r0 = r1.A01
            r3.A0A = r0
            java.lang.String r0 = r7.A08
            r8 = 0
            if (r0 == 0) goto L_0x030e
            int r0 = X.C88244Yx.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x027e:
            r3.A05 = r0
            java.lang.String r0 = r7.A07
            int r0 = X.C83554Fo.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            java.lang.Long r0 = r1.A00
            r3.A07 = r0
            if (r4 == 0) goto L_0x02a1
            boolean r1 = r4.A0B()
            r0 = 0
            if (r1 != 0) goto L_0x02a2
        L_0x02a1:
            r0 = 1
        L_0x02a2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A03 = r0
            com.whatsapp.jid.UserJid r0 = r7.A03
            java.lang.String r0 = r0.user
            java.lang.Long r0 = X.C108965cb.A0m(r0)
            r3.A08 = r0
            if (r4 == 0) goto L_0x030c
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r4)
        L_0x02b8:
            java.lang.Integer r1 = r7.A05
            if (r0 != 0) goto L_0x02fb
            r0 = 0
        L_0x02bd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A01 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11P r0 = r6.A06
            long r0 = X.AnonymousClass11P.A01(r0)
            long r0 = r2.toSeconds(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A09 = r0
            X.0ve r2 = r6.A0D
            r1 = 4588(0x11ec, float:6.429E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02f1
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L_0x02ef
            java.lang.Long r8 = X.C17890vO.A0N(r0)
        L_0x02ef:
            r3.A06 = r8
        L_0x02f1:
            X.18K r0 = r6.A0E
            r0.CC7(r3)
            r0.CHJ(r5)
            goto L_0x025c
        L_0x02fb:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x030a
            X.0ve r2 = r6.A0D
            r1 = 4588(0x11ec, float:6.429E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            goto L_0x02bd
        L_0x030a:
            r0 = 1
            goto L_0x02bd
        L_0x030c:
            r0 = r8
            goto L_0x02b8
        L_0x030e:
            r0 = r8
            goto L_0x027e
        L_0x0311:
            java.lang.Object r0 = r12.A01
            X.4OL r0 = (X.AnonymousClass4OL) r0
            java.lang.Object r6 = r12.A02
            X.9qK r6 = (X.C193579qK) r6
            X.A5M r5 = r0.A00
            X.96s r7 = r5.A01
            java.util.ArrayList r0 = r7.A04()
            java.util.Iterator r11 = r0.iterator()
        L_0x0325:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r4 = r11.next()
            X.9sv r4 = (X.C195179sv) r4
            X.00H r3 = r5.A0H
            X.A8x r1 = X.AnonymousClass8BR.A0K(r3)
            X.C18070vi.A0b(r4)
            if (r6 == 0) goto L_0x03a9
            X.1BI r10 = r6.A01
        L_0x033e:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.11P r0 = r1.A02
            long r8 = X.AnonymousClass11P.A01(r0)
            long r0 = r4.A01
            long r8 = r8 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x035a
            X.1BI r0 = r4.A02
            boolean r0 = X.C18070vi.A18(r0, r10)
            if (r0 == 0) goto L_0x0325
        L_0x035a:
            X.A8x r8 = X.AnonymousClass8BR.A0K(r3)
            r2 = 0
            if (r6 == 0) goto L_0x0390
            X.1BI r1 = r6.A01
            X.1BI r0 = r4.A02
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0390
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11P r0 = r8.A02
            long r2 = X.AnonymousClass11P.A01(r0)
            long r0 = r6.A00
            long r2 = r2 - r0
            r0 = 0
            long r0 = java.lang.Math.max(r2, r0)
            long r2 = r9.toSeconds(r0)
            X.0ve r1 = r8.A07
            r0 = 8997(0x2325, float:1.2607E-41)
            long r0 = X.AnonymousClass8BR.A05(r1, r0)
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x0390:
            r1 = 35
            X.AkM r0 = new X.AkM
            r0.<init>(r4, r5, r2, r1)
            X.A5M.A01(r5, r0)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1BI r0 = r4.A02
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r0)
            if (r0 == 0) goto L_0x0325
            r7.A05(r0)
            goto L_0x0325
        L_0x03a9:
            r10 = 0
            goto L_0x033e
        L_0x03ab:
            java.lang.Object r2 = r12.A01
            X.A8w r2 = (X.C20135A8w) r2
            java.lang.Object r1 = r12.A02
            X.9qT r1 = (X.C193669qT) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.6pH r0 = r2.A0D
            X.77M r3 = r0.A00()
            java.util.List r0 = r1.A01
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x03c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03d9
            java.lang.Object r0 = r1.next()
            X.9qS r0 = (X.C193659qS) r0
            java.lang.String r0 = r0.A01
            r2.add(r0)
            goto L_0x03c7
        L_0x03d9:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            X.C29431cG.A17(r2, r0)
            r3.A01 = r0
            return
        L_0x03e3:
            java.lang.Object r5 = r12.A01
            X.9uP r5 = (X.C196069uP) r5
            java.lang.Object r6 = r12.A02
            X.A6f r6 = (X.C20079A6f) r6
            boolean r4 = X.C18070vi.A16(r5, r6)
            X.9eR r3 = r5.A03     // Catch:{ Exception -> 0x0423 }
            X.1DT r0 = r5.A02     // Catch:{ Exception -> 0x0423 }
            java.lang.Object r0 = r0.A06()     // Catch:{ Exception -> 0x0423 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0423 }
            if (r0 == 0) goto L_0x0403
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x0423 }
            r0 = 7
            r1 = 1
            if (r2 == r0) goto L_0x0404
        L_0x0403:
            r1 = 0
        L_0x0404:
            monitor-enter(r3)     // Catch:{ Exception -> 0x0423 }
            X.00H r0 = r3.A03     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
            X.8vd r0 = (X.C173728vd) r0     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
            r0.A01(r6)     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x041c }
            if (r0 == 0) goto L_0x0419
            if (r1 != 0) goto L_0x0419
            r3.A01 = r6     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
            goto L_0x041e
        L_0x0419:
            r3.A00 = r6     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
            goto L_0x041e
        L_0x041c:
            r0 = move-exception
            throw r0     // Catch:{ Exception -> 0x041e, all -> 0x0420 }
        L_0x041e:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0423 }
            goto L_0x042b
        L_0x0420:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0423 }
            throw r0     // Catch:{ Exception -> 0x0423 }
        L_0x0423:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationStateLiveData/onLocationUpdated Failed to store the search location"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0450 }
            X.9eR r3 = r5.A03
        L_0x042b:
            X.A6f r1 = r3.A00
            X.A6f r0 = r5.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0448
            X.A6f r0 = r3.A00
            if (r0 == 0) goto L_0x0448
            r5.A00 = r0
            boolean r0 = r0.A05()
            r1 = 2
            if (r0 == 0) goto L_0x0443
            r1 = 4
        L_0x0443:
            X.1DT r0 = r5.A02
            X.AnonymousClass3MX.A1K(r0, r1)
        L_0x0448:
            X.1wy r3 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x067a
        L_0x0450:
            r3 = move-exception
            X.9eR r2 = r5.A03
            X.A6f r1 = r2.A00
            X.A6f r0 = r5.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0470
            X.A6f r0 = r2.A00
            if (r0 == 0) goto L_0x0470
            r5.A00 = r0
            boolean r0 = r0.A05()
            r1 = 2
            if (r0 == 0) goto L_0x046b
            r1 = 4
        L_0x046b:
            X.1DT r0 = r5.A02
            X.AnonymousClass3MX.A1K(r0, r1)
        L_0x0470:
            X.1wy r0 = r5.A04
            X.AnonymousClass3MX.A1K(r0, r4)
            throw r3
        L_0x0476:
            java.lang.Object r3 = r12.A01
            X.8FJ r3 = (X.AnonymousClass8FJ) r3
            java.lang.Object r2 = r12.A02
            X.A6f r2 = (X.C20079A6f) r2
            X.8ve r0 = r3.A03     // Catch:{ Exception -> 0x048f }
            r0.A01(r2)     // Catch:{ Exception -> 0x048f }
            X.A5L r1 = r3.A04     // Catch:{ Exception -> 0x048f }
            r0 = 0
            r1.A01 = r0     // Catch:{ Exception -> 0x048f }
            java.lang.Long r0 = X.C108955ca.A0m()     // Catch:{ Exception -> 0x048f }
            r1.A00 = r0     // Catch:{ Exception -> 0x048f }
            goto L_0x0495
        L_0x048f:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationItemLiveData/onLocationUpdated Failed to store the search location"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04a0 }
        L_0x0495:
            X.AnonymousClass8FJ.A01(r2, r3)
            X.8we r0 = X.AnonymousClass8FJ.A00(r3)
            r3.A0E(r0)
            return
        L_0x04a0:
            r1 = move-exception
            X.AnonymousClass8FJ.A01(r2, r3)
            X.8we r0 = X.AnonymousClass8FJ.A00(r3)
            r3.A0E(r0)
            throw r1
        L_0x04ac:
            java.lang.Object r0 = r12.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r1 = r12.A02
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r0 == 0) goto L_0x04ba
            r1.setImageBitmap(r0)
            return
        L_0x04ba:
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r1.setImageResource(r0)
            return
        L_0x04c1:
            java.lang.Object r5 = r12.A01
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r5 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r5
            java.lang.Object r6 = r12.A02
            android.location.Address r6 = (android.location.Address) r6
            if (r6 == 0) goto L_0x0509
            X.Ccm r0 = r5.A01
            if (r0 == 0) goto L_0x0509
            X.AA9 r2 = r5.A0A
            r0 = 0
            r2.A0F = r0
            double r0 = r6.getLatitude()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A09 = r0
            X.AA9 r2 = r5.A0A
            double r0 = r6.getLongitude()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A0A = r0
            double r3 = r6.getLatitude()
            double r0 = r6.getLongitude()
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r3, r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            X.Ccm r1 = r5.A01
            X.C17960vV.A07(r1)
            X.CLK r0 = X.C26080Crv.A02(r2, r0)
            r1.A09(r0)
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0c(r5)
            return
        L_0x0509:
            X.AA9 r0 = r5.A0A
            com.whatsapp.CircularProgressBar r1 = r0.A06
            r0 = 8
            r1.setVisibility(r0)
            X.AA9 r0 = r5.A0A
            r0.A00()
            return
        L_0x0518:
            java.lang.Object r5 = r12.A01
            X.A08 r5 = (X.A08) r5
            java.lang.Object r6 = r12.A02
            java.util.List r6 = (java.util.List) r6
            X.2ir r0 = r5.A02
            java.io.File r2 = r0.A00()
            X.190 r4 = r5.A00
            java.util.concurrent.locks.ReadWriteLock r3 = r5.A04
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.lock()
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ Exception -> 0x062f }
            r1.<init>(r2)     // Catch:{ Exception -> 0x062f }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x062f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x062f }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ Exception -> 0x062f }
            r2.<init>(r0)     // Catch:{ Exception -> 0x062f }
            r2.beginArray()     // Catch:{ all -> 0x0625 }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ all -> 0x0625 }
        L_0x0547:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0625 }
            if (r0 == 0) goto L_0x061e
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0625 }
            X.B7g r7 = (X.C22424B7g) r7     // Catch:{ all -> 0x0625 }
            X.9xh r6 = r5.A01     // Catch:{ all -> 0x0625 }
            boolean r0 = r7 instanceof X.C20288AEw     // Catch:{ all -> 0x0625 }
            if (r0 == 0) goto L_0x0587
            X.AEw r7 = (X.C20288AEw) r7     // Catch:{ all -> 0x0625 }
            r2.beginObject()     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "type"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "TEXT_QUERY"
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "query"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0625 }
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "timestamp"
            android.util.JsonWriter r8 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            long r0 = r7.A00     // Catch:{ all -> 0x0625 }
        L_0x057c:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0625 }
            A00(r8, r6, r0)     // Catch:{ all -> 0x0625 }
        L_0x0583:
            r2.endObject()     // Catch:{ all -> 0x0625 }
            goto L_0x0547
        L_0x0587:
            boolean r0 = r7 instanceof X.C20289AEx     // Catch:{ all -> 0x0625 }
            if (r0 == 0) goto L_0x05d2
            X.AEx r7 = (X.C20289AEx) r7     // Catch:{ all -> 0x0625 }
            r2.beginObject()     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "type"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "BUSINESS_PROFILE"
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "business_name"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0625 }
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "timestamp"
            android.util.JsonWriter r8 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            long r0 = r7.A00     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0625 }
            A00(r8, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r1 = r7.A02     // Catch:{ all -> 0x0625 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0625 }
            if (r0 != 0) goto L_0x05c6
            java.lang.String r0 = "categories"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            A00(r0, r6, r1)     // Catch:{ all -> 0x0625 }
        L_0x05c6:
            java.lang.String r0 = "jid"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x0625 }
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            goto L_0x0583
        L_0x05d2:
            boolean r0 = r7 instanceof X.C20290AEy     // Catch:{ all -> 0x0625 }
            if (r0 == 0) goto L_0x0617
            X.AEy r7 = (X.C20290AEy) r7     // Catch:{ all -> 0x0625 }
            r2.beginObject()     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "type"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "CATEGORY_SEARCH"
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "category_name"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x0625 }
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = "category_id"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0625 }
            A00(r1, r6, r0)     // Catch:{ all -> 0x0625 }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x0625 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0625 }
            if (r0 != 0) goto L_0x060d
            java.lang.String r0 = "parent_category"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            A00(r0, r6, r1)     // Catch:{ all -> 0x0625 }
        L_0x060d:
            java.lang.String r0 = "timestamp"
            android.util.JsonWriter r8 = r2.name(r0)     // Catch:{ all -> 0x0625 }
            long r0 = r7.A00     // Catch:{ all -> 0x0625 }
            goto L_0x057c
        L_0x0617:
            java.lang.String r0 = "DirectoryRecentSearchJsonIOManager/write Could not store one of DirectoryRecentSearch. Unknown type."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0625 }
            goto L_0x0547
        L_0x061e:
            r2.endArray()     // Catch:{ all -> 0x0625 }
            r2.close()     // Catch:{ Exception -> 0x062f }
            goto L_0x0636
        L_0x0625:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x062a }
            goto L_0x062e
        L_0x062a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x062f }
        L_0x062e:
            throw r1     // Catch:{ Exception -> 0x062f }
        L_0x062f:
            java.lang.String r2 = "DirectoryRecentSearchManagerImpl/storeRecentSearch Failed to store recent search"
            r1 = 0
            r0 = 1
            r4.A0G(r2, r1, r0)     // Catch:{ all -> 0x063e }
        L_0x0636:
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            return
        L_0x063e:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L_0x0647:
            java.lang.Object r0 = r12.A01
            X.8F1 r0 = (X.AnonymousClass8F1) r0
            java.lang.Object r1 = r12.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1DT r3 = r0.A01
            X.9ce r2 = r0.A03
            X.1PM r0 = r2.A01
            X.1yf r0 = r0.A01(r1)
            int r1 = X.A78.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0675
            X.0ve r2 = r2.A02
            r0 = 4893(0x131d, float:6.857E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0675
            r0 = 5114(0x13fa, float:7.166E-42)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0676
        L_0x0675:
            r0 = 0
        L_0x0676:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x067a:
            r3.A0E(r0)
            return
        L_0x067e:
            java.lang.Object r3 = r12.A01
            X.2sT r3 = (X.C63082sT) r3
            java.lang.Object r0 = r12.A02
            X.2Jo r0 = (X.C47712Jo) r0
            long r1 = X.C63082sT.A00(r3, r0)
            r0 = 5
            goto L_0x0699
        L_0x068c:
            java.lang.Object r3 = r12.A01
            X.2sT r3 = (X.C63082sT) r3
            java.lang.Object r0 = r12.A02
            X.2Jo r0 = (X.C47712Jo) r0
            long r1 = X.C63082sT.A00(r3, r0)
            r0 = 6
        L_0x0699:
            X.C63082sT.A01(r3, r0, r1)
            return
        L_0x069d:
            java.lang.Object r3 = r12.A01
            X.BAU r3 = (X.BAU) r3
            java.lang.Object r2 = r12.A02
            X.9pQ r2 = (X.C193029pQ) r2
            boolean r1 = X.C18070vi.A16(r3, r2)
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r3 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r3
            X.00H r0 = r3.A03
            if (r0 == 0) goto L_0x06bb
            X.9nK r0 = X.AnonymousClass8BX.A0J(r0)
            r0.A00 = r2
            r0.A01 = r1
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity.A11(r3)
            return
        L_0x06bb:
            java.lang.String r0 = "wfsBridgeFactory"
            X.C18070vi.A11(r0)
            goto L_0x0b6c
        L_0x06c2:
            java.lang.Object r0 = r12.A01
            X.35Z r0 = (X.AnonymousClass35Z) r0
            java.lang.Object r2 = r12.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A00
            r0 = -1
            r1.A02(r2, r0)
            return
        L_0x06d1:
            java.lang.Object r0 = r12.A01
            X.6z3 r0 = (X.C139566z3) r0
            java.lang.Object r3 = r12.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.00H r0 = r0.A03
            java.lang.Object r6 = r0.get()
            X.9oI r6 = (X.C192379oI) r6
            X.9JU r5 = X.AnonymousClass9JU.A01
            X.11P r2 = r6.A01
            X.11S r0 = r6.A00
            r1 = 1
            java.lang.String r0 = X.AnonymousClass8BS.A0e(r0, r2)
            X.205 r4 = X.AnonymousClass205.A01(r3, r0, r1)
            long r2 = X.AnonymousClass11P.A01(r2)
            r0 = 88
            X.24B r1 = new X.24B
            r1.<init>(r4, r0, r2)
            X.9Ka r0 = X.C179819Ka.BOT_FEEDBACK_NEGATIVE_OTHER
            r1.A01 = r0
            r1.A02 = r5
            X.121 r0 = r6.A02
            r0.BBM(r1)
            return
        L_0x0707:
            java.lang.Object r2 = r12.A01
            X.3Uv r2 = (X.AnonymousClass3Uv) r2
            java.lang.Object r1 = r12.A02
            X.206 r1 = (X.AnonymousClass206) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.AnonymousClass3Uv.A00(r2, r1)
            return
        L_0x0717:
            java.lang.Object r1 = r12.A01
            X.3Uv r1 = (X.AnonymousClass3Uv) r1
            java.lang.Object r0 = r12.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.2Zc r2 = r1.A08
            long r0 = r0.A0x
            java.lang.String r8 = "message_row_id = ?"
            X.1Cd r2 = r2.A00
            X.1au r4 = r2.A05()
            r2 = r4
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x074a }
            X.1Ev r5 = r2.A02     // Catch:{ all -> 0x074a }
            java.lang.String r7 = "bot_message_prompts"
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x074a }
            java.lang.String r3 = "impression_logged"
            r2 = 1
            X.C17880vN.A18(r6, r3, r2)     // Catch:{ all -> 0x074a }
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x074a }
            X.C17890vO.A1J(r10, r0)     // Catch:{ all -> 0x074a }
            java.lang.String r9 = "BotMessagePromptsStore/markImpressionLoggedForMessageRowId"
            r5.A02(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x074a }
            r4.close()
            return
        L_0x074a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x074c }
        L_0x074c:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        L_0x0751:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r12.A02
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.AnonymousClass000.A1a(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            return
        L_0x0765:
            java.lang.Object r1 = r12.A01
            X.1Pp r1 = (X.C25781Pp) r1
            java.lang.Object r0 = r12.A02
            X.1BI r0 = (X.AnonymousClass1BI) r0
            java.lang.Integer r0 = r1.A03(r0)
            r1.A03 = r0
            return
        L_0x0774:
            java.lang.Object r2 = r12.A01
            X.5jD r2 = (X.C111225jD) r2
            java.lang.Object r1 = r12.A02
            X.6jC r1 = (X.C130296jC) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.C111225jD.A09(r2, r1)
            return
        L_0x0784:
            java.lang.Object r0 = r12.A01
            X.5jD r0 = (X.C111225jD) r0
            java.lang.Object r1 = r12.A02
            X.1DT r0 = r0.A0J
            X.C137196v4.A01(r0, r1)
            return
        L_0x0790:
            java.lang.Object r2 = r12.A01
            X.5jD r2 = (X.C111225jD) r2
            java.lang.Object r1 = r12.A02
            X.6jC r1 = (X.C130296jC) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            goto L_0x07c6
        L_0x079d:
            java.lang.Object r2 = r12.A01
            X.5jD r2 = (X.C111225jD) r2
            java.lang.Object r1 = r12.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r2.A0X(r1)
            return
        L_0x07ad:
            java.lang.Object r3 = r12.A01
            X.5jD r3 = (X.C111225jD) r3
            java.lang.Object r0 = r12.A02
            X.6jC r0 = (X.C130296jC) r0
            r2 = 0
            java.lang.String r1 = r0.A02
            r0 = 3
            X.C111225jD.A0B(r3, r1, r0, r2)
            return
        L_0x07bd:
            java.lang.Object r2 = r12.A01
            X.5jD r2 = (X.C111225jD) r2
            java.lang.Object r1 = r12.A02
            X.6jC r1 = (X.C130296jC) r1
            r0 = 1
        L_0x07c6:
            X.C111225jD.A0A(r2, r1, r0)
            return
        L_0x07ca:
            java.lang.Object r6 = r12.A01
            X.Af0 r6 = (X.C21132Af0) r6
            java.lang.Object r1 = r12.A02
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.util.ArrayList r5 = X.C29351c6.A0D(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x07de:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0803
            com.whatsapp.jid.Jid r3 = X.C17880vN.A0S(r4)
            X.2qw r2 = X.C42711yc.A01
            java.lang.String r1 = r3.user
            java.util.Map r0 = X.C60882ol.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.Map r0 = X.C60882ol.A00
            java.lang.String r0 = X.C17880vN.A0s(r1, r0)
            X.1yc r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x07ff
            r3 = r0
        L_0x07ff:
            r5.add(r3)
            goto L_0x07de
        L_0x0803:
            r6.A0B(r5)
            return
        L_0x0807:
            java.lang.Object r2 = r12.A01
            X.1z1 r2 = (X.C42961z1) r2
            java.lang.Object r4 = r12.A02
            X.1DS r4 = (X.AnonymousClass1DS) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1E7 r0 = r2.A08
            if (r0 != 0) goto L_0x081b
            r0 = 0
            X.C42961z1.A00(r2, r0)
        L_0x081b:
            X.1E7 r0 = r2.A08
            if (r0 != 0) goto L_0x088e
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.24f r0 = (X.C446424f) r0
            X.Af0 r1 = r0.A01()
            r0 = 0
            X.C21133Af1.A00(r1, r2, r4, r0)
            return
        L_0x0830:
            java.lang.Object r7 = r12.A01
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel r7 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel) r7
            java.lang.Object r6 = r12.A02
            X.1BI r6 = (X.AnonymousClass1BI) r6
            X.12L r0 = r7.A0A
            boolean r0 = X.C42761yh.A01(r0, r6)
            if (r0 == 0) goto L_0x0892
            X.1DT r4 = r7.A02
            r0 = 4
            X.4Ty[] r3 = new X.C87014Ty[r0]
            android.app.Application r6 = r7.A00
            r0 = 2131898324(0x7f122fd4, float:1.9431563E38)
            java.lang.String r2 = X.C18070vi.A0F(r6, r0)
            r5 = 0
            java.lang.String r0 = "messages_not_helpful"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r5, r0, r2)
            r0 = 0
            r3[r0] = r1
            r0 = 2131898326(0x7f122fd6, float:1.9431567E38)
            java.lang.String r2 = X.C18070vi.A0F(r6, r0)
            java.lang.String r0 = "too_many_messages"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r5, r0, r2)
            r0 = 1
            r3[r0] = r1
            r0 = 2131898325(0x7f122fd5, float:1.9431565E38)
            java.lang.String r2 = X.C18070vi.A0F(r6, r0)
            java.lang.String r0 = "suspicious"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r5, r0, r2)
            r0 = 2
            r3[r0] = r1
            r0 = 2131886993(0x7f120391, float:1.940858E38)
            java.lang.String r2 = X.C18070vi.A0F(r6, r0)
            java.lang.String r0 = "other"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r5, r0, r2)
            r0 = 3
            java.util.List r0 = X.C18070vi.A0O(r1, r3, r0)
        L_0x088e:
            r4.A0E(r0)
            return
        L_0x0892:
            X.1DT r5 = r7.A02
            X.1R3 r1 = r7.A08
            r0 = 1
            java.util.ArrayList r3 = r1.A08(r6, r0)
            boolean r0 = X.C17880vN.A1X(r3)
            r2 = 0
            if (r0 == 0) goto L_0x092d
            X.00H r0 = r7.A0F
            java.lang.Object r1 = r0.get()
            X.70P r1 = (X.AnonymousClass70P) r1
            java.lang.Object r0 = X.AnonymousClass8BS.A0Z(r3, r2)
            X.206 r0 = (X.AnonymousClass206) r0
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x092d
            r0 = 3
            X.4Ty[] r4 = new X.C87014Ty[r0]
            android.app.Application r8 = r7.A00
            r0 = 2131886991(0x7f12038f, float:1.9408576E38)
            java.lang.String r2 = X.C18070vi.A0F(r8, r0)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.lang.String r0 = "no_longer_interested"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 0
            r4[r0] = r1
            r0 = 2131886994(0x7f120392, float:1.9408583E38)
            java.lang.String r2 = X.C18070vi.A0F(r8, r0)
            java.lang.String r0 = "otp_did_not_request"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 1
            r4[r0] = r1
            r0 = 2131886993(0x7f120391, float:1.940858E38)
            java.lang.String r2 = X.C18070vi.A0F(r8, r0)
            java.lang.String r0 = "other"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 2
            java.util.List r8 = X.C18070vi.A0O(r1, r4, r0)
        L_0x08f2:
            X.00H r0 = r7.A0E
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            if (r6 == 0) goto L_0x0a3a
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 != r0) goto L_0x090a
            X.0ve r2 = r1.A0D
            r1 = 4588(0x11ec, float:6.429E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0a3a
        L_0x090a:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0a3a
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r8.iterator()
        L_0x0918:
            boolean r0 = r2.hasNext()
            java.lang.String r4 = "other"
            if (r0 == 0) goto L_0x0a14
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4Ty r0 = (X.C87014Ty) r0
            java.lang.String r0 = r0.A01
            X.C108975cc.A13(r0, r4, r1, r6)
            goto L_0x0918
        L_0x092d:
            X.00H r1 = r7.A0E
            X.1pj r0 = X.AnonymousClass3MW.A0V(r1)
            r0.A0E()
            X.1pj r0 = X.AnonymousClass3MW.A0V(r1)
            java.util.LinkedHashMap r0 = r0.A09()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x09e8
            r0 = 5
            X.4Ty[] r8 = new X.C87014Ty[r0]
            android.app.Application r9 = r7.A00
            r0 = 2131886991(0x7f12038f, float:1.9408576E38)
            java.lang.String r2 = X.C18070vi.A0F(r9, r0)
            r4 = 4
            r3 = 0
            java.lang.String r0 = "no_longer_interested"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 0
            r8[r0] = r1
            r0 = 2131886989(0x7f12038d, float:1.9408572E38)
            java.lang.String r2 = X.C18070vi.A0F(r9, r0)
            java.lang.String r0 = "no_sign_up"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 1
            r8[r0] = r1
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r2 = X.C18070vi.A0F(r9, r0)
            java.lang.String r0 = "spam"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 2
            r8[r0] = r1
            r0 = 2131886992(0x7f120390, float:1.9408578E38)
            java.lang.String r2 = X.C18070vi.A0F(r9, r0)
            java.lang.String r0 = "offensive_messages"
            X.4Ty r1 = new X.4Ty
            r1.<init>(r3, r0, r2)
            r0 = 3
            r8[r0] = r1
            r0 = 2131886993(0x7f120391, float:1.940858E38)
            java.lang.String r2 = X.C18070vi.A0F(r9, r0)
            java.lang.String r1 = "other"
            X.4Ty r0 = new X.4Ty
            r0.<init>(r3, r1, r2)
            java.util.List r8 = X.C18070vi.A0O(r0, r8, r4)
        L_0x09a1:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.0ve r10 = r7.A09
            r0 = 11325(0x2c3d, float:1.587E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            if (r0 == 0) goto L_0x09c5
            android.app.Application r1 = r7.A00
            r0 = 2131886995(0x7f120393, float:1.9408585E38)
            java.lang.String r3 = X.C18070vi.A0F(r1, r0)
            r2 = 0
            java.lang.String r1 = "scam"
            X.4Ty r0 = new X.4Ty
            r0.<init>(r2, r1, r3)
            r4.add(r0)
        L_0x09c5:
            r0 = 11362(0x2c62, float:1.5922E-41)
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            if (r0 == 0) goto L_0x09e1
            android.app.Application r1 = r7.A00
            r0 = 2131886990(0x7f12038e, float:1.9408574E38)
            java.lang.String r3 = X.C18070vi.A0F(r1, r0)
            r2 = 0
            java.lang.String r1 = "impersonation"
            X.4Ty r0 = new X.4Ty
            r0.<init>(r2, r1, r3)
            r4.add(r0)
        L_0x09e1:
            java.util.ArrayList r8 = X.C29431cG.A0k(r8, r4)
            r3 = 0
            goto L_0x08f2
        L_0x09e8:
            X.1pj r0 = X.AnonymousClass3MW.A0V(r1)
            java.util.LinkedHashMap r0 = r0.A09()
            java.util.ArrayList r8 = X.C72453Mb.A11(r0)
            java.util.Iterator r4 = X.AnonymousClass000.A15(r0)
        L_0x09f8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09a1
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)
            java.lang.String r3 = X.C17880vN.A0x(r0)
            java.lang.String r2 = X.AnonymousClass8BR.A10(r0)
            r1 = 0
            X.4Ty r0 = new X.4Ty
            r0.<init>(r1, r3, r2)
            r8.add(r0)
            goto L_0x09f8
        L_0x0a14:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r8.iterator()
        L_0x0a1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a33
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4Ty r0 = (X.C87014Ty) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C18070vi.A18(r0, r4)
            X.AnonymousClass3MZ.A1V(r1, r3, r0)
            goto L_0x0a1c
        L_0x0a33:
            java.util.Collections.shuffle(r3)
            java.util.ArrayList r8 = X.C29431cG.A0k(r6, r3)
        L_0x0a3a:
            r5.A0E(r8)
            return
        L_0x0a3e:
            java.lang.Object r2 = r12.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r12.A02
            X.00H r1 = (X.AnonymousClass00H) r1
            r0 = 8
            r2.setVisibility(r0)
            java.lang.Object r0 = r1.get()
            X.1rn r0 = (X.C38731rn) r0
            r2 = 1
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "imagine_me_retake_onboarding_seen"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x0a5e:
            java.lang.Object r1 = r12.A01
            X.4Ys r1 = (X.C88204Ys) r1
            java.lang.Object r0 = r12.A02
            java.util.List r0 = (java.util.List) r0
            X.C88204Ys.A00(r1, r0)
            return
        L_0x0a6a:
            java.lang.Object r1 = r12.A01
            X.4Ys r1 = (X.C88204Ys) r1
            java.lang.Object r0 = r12.A02
            X.72S r0 = (X.AnonymousClass72S) r0
            r1.A04(r0)
            return
        L_0x0a76:
            java.lang.Object r0 = r12.A01
            java.lang.Object r2 = r12.A02
            X.E8A r2 = (X.E8A) r2
            X.Boh r1 = X.ALS.A06(r0)
            X.9zJ r0 = X.C199029zJ.A01
            X.C25974Cph.A00(r1, r0, r2)
            return
        L_0x0a86:
            java.lang.Object r0 = r12.A01
            X.Cqj r0 = (X.C26025Cqj) r0
            java.lang.Object r1 = r12.A02
            android.view.View r1 = (android.view.View) r1
            X.1L4 r0 = r0.A06
            r0.A02(r1)
            return
        L_0x0a94:
            java.lang.Object r1 = r12.A01
            X.1pj r1 = (X.C37551pj) r1
            java.lang.Object r0 = r12.A02
            java.util.Set r0 = X.C18070vi.A0P(r0)
            X.C37551pj.A07(r1, r0)
            return
        L_0x0aa2:
            java.lang.Object r0 = r12.A01
            X.1pj r0 = (X.C37551pj) r0
            java.lang.Object r1 = r12.A02
            java.util.Map r1 = (java.util.Map) r1
            X.1M4 r0 = r0.A09
            r0.Bda(r1)
            return
        L_0x0ab0:
            java.lang.Object r0 = r12.A01
            X.34W r0 = (X.AnonymousClass34W) r0
            java.lang.Object r1 = r12.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.A1E r0 = r0.A00
            r0.A02(r1)
            return
        L_0x0abe:
            java.lang.Object r0 = r12.A01
            X.A1E r0 = (X.A1E) r0
            java.lang.Object r2 = r12.A02
            X.1Lf r1 = r0.A04
            r0 = 13
            X.C17890vO.A0s(r1, r2, r0)
            return
        L_0x0acc:
            java.util.Set r0 = r4.A0K     // Catch:{ all -> 0x0af9 }
            r0.add(r2)     // Catch:{ all -> 0x0af9 }
            monitor-exit(r4)
            X.1pe r1 = r4.A02
            r0 = 1
            r1.A0K(r2, r0)
            r3.add(r2)
            X.1KB r2 = r4.A00
            r0 = 9
            goto L_0x0af2
        L_0x0ae0:
            java.util.Set r0 = r4.A0K     // Catch:{ all -> 0x0af9 }
            r0.remove(r1)     // Catch:{ all -> 0x0af9 }
            monitor-exit(r4)
            X.1pe r0 = r4.A02
            r0.A0K(r1, r2)
            r3.add(r1)
            X.1KB r2 = r4.A00
            r0 = 10
        L_0x0af2:
            X.AkI r1 = new X.AkI
            r1.<init>(r4, r3, r0)
            goto L_0x0b93
        L_0x0af9:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x0afc:
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0b5f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0b5f }
            java.lang.String r1 = "SELECT call_result FROM call_log WHERE jid_row_id = ? AND from_me = 0 AND timestamp >= ? ORDER BY timestamp DESC LIMIT 1"
            java.lang.String r0 = "GET_MOST_RECENT_CALL_RESULT_BY_JID_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r9)     // Catch:{ all -> 0x0b5f }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0b53 }
            if (r0 == 0) goto L_0x0b41
            java.lang.String r0 = "call_result"
            int r1 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0b53 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0b53 }
            r2.close()     // Catch:{ all -> 0x0b5f }
            r5.close()
            if (r0 == 0) goto L_0x0b47
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3.A02 = r0
            r0 = 0
            switch(r1) {
                case 1: goto L_0x0b3e;
                case 2: goto L_0x0b3c;
                case 3: goto L_0x0b39;
                case 4: goto L_0x0b37;
                case 5: goto L_0x0b35;
                case 6: goto L_0x0b32;
                default: goto L_0x0b2b;
            }
        L_0x0b2b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
            goto L_0x0b4d
        L_0x0b32:
            r0 = 22
            goto L_0x0b2b
        L_0x0b35:
            r0 = 1
            goto L_0x0b2b
        L_0x0b37:
            r0 = 2
            goto L_0x0b2b
        L_0x0b39:
            r0 = 17
            goto L_0x0b2b
        L_0x0b3c:
            r0 = 4
            goto L_0x0b2b
        L_0x0b3e:
            r0 = 18
            goto L_0x0b2b
        L_0x0b41:
            r2.close()     // Catch:{ all -> 0x0b5f }
            r5.close()
        L_0x0b47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r3.A02 = r0
        L_0x0b4d:
            X.18K r0 = r4.A0E
            r0.CC7(r3)
            return
        L_0x0b53:
            r1 = move-exception
            if (r2 == 0) goto L_0x0b5e
            r2.close()     // Catch:{ all -> 0x0b5a }
            goto L_0x0b5e
        L_0x0b5a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0b5f }
        L_0x0b5e:
            throw r1     // Catch:{ all -> 0x0b5f }
        L_0x0b5f:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0b64 }
            throw r1
        L_0x0b64:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0b69:
            X.C18070vi.A11(r5)
        L_0x0b6c:
            r1 = 0
            throw r1
        L_0x0b6e:
            java.lang.Object r5 = r12.A01
            X.3Uv r5 = (X.AnonymousClass3Uv) r5
            java.lang.Object r4 = r12.A02
            X.206 r4 = (X.AnonymousClass206) r4
            r3 = 0
            X.C18070vi.A0d(r5, r3)
            r0 = 1
            X.1Qe r2 = r5.A0D
            X.25F[] r1 = new X.AnonymousClass25F[r0]
            java.lang.Class<X.Ac9> r0 = X.C20955Ac9.class
            X.25F r0 = X.C18070vi.A09(r4, r0)
            r1[r3] = r0
            r2.A0A(r1)
            X.1KB r2 = r5.A04
            r0 = 34
            X.AkI r1 = new X.AkI
            r1.<init>(r5, r4, r0)
        L_0x0b93:
            r2.A0J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21451AkI.run():void");
    }
}

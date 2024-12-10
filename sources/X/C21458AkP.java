package X;

import android.os.PowerManager;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.AkP  reason: case insensitive filesystem */
public class C21458AkP implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21458AkP(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.i("ExportFlowManager/onStartCommand/wakelock released");
            wakeLock.release();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.8yK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.43Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: X.43Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v134, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v337, resolved type: X.43Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.43Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: com.whatsapp.newsletter.ui.NewsletterCreationActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0342, code lost:
        r7.A0J(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0345, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0362, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0364, code lost:
        r0.setImageBitmap(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0367, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0512, code lost:
        r4 = java.lang.Integer.valueOf(r0);
        r2 = 2131892813;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x051b, code lost:
        if ((r1 instanceof X.C21598Amm) == false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0523, code lost:
        if (((X.C21598Amm) r1).code != 403) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0525, code lost:
        r2 = 2131892749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0528, code lost:
        r3.CMx(r4, java.lang.Integer.valueOf(r2), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Object[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0535, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05e6, code lost:
        r2.startActivity(r0);
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ed, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0625, code lost:
        r0.A04();
        r1.C7U(X.C18460wS.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x062d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06e6, code lost:
        r2.A03(new X.C172738tw(r3, r5, r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06ee, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x070a, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x070d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r3.A4j(r0, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0acb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0acf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0c0a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:?, code lost:
        X.CDX.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0c0e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0c11, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0c12, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0c15, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0d49, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r6 = r23
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0bfa;
                case 1: goto L_0x0461;
                case 2: goto L_0x0414;
                case 3: goto L_0x081b;
                case 4: goto L_0x0368;
                case 5: goto L_0x0351;
                case 6: goto L_0x0346;
                case 7: goto L_0x0292;
                case 8: goto L_0x07fc;
                case 9: goto L_0x024b;
                case 10: goto L_0x0756;
                case 11: goto L_0x072a;
                case 12: goto L_0x0186;
                case 13: goto L_0x071a;
                case 14: goto L_0x00a3;
                case 15: goto L_0x070e;
                case 16: goto L_0x0700;
                case 17: goto L_0x0063;
                case 18: goto L_0x0063;
                case 19: goto L_0x06ef;
                case 20: goto L_0x06aa;
                case 21: goto L_0x066d;
                case 22: goto L_0x0659;
                case 23: goto L_0x064d;
                case 24: goto L_0x064d;
                case 25: goto L_0x0051;
                case 26: goto L_0x0641;
                case 27: goto L_0x062e;
                case 28: goto L_0x0617;
                case 29: goto L_0x060c;
                case 30: goto L_0x05f1;
                case 31: goto L_0x05ca;
                case 32: goto L_0x078d;
                case 33: goto L_0x0007;
                case 34: goto L_0x0048;
                case 35: goto L_0x05b7;
                case 36: goto L_0x0007;
                case 37: goto L_0x05a5;
                case 38: goto L_0x0036;
                case 39: goto L_0x0561;
                case 40: goto L_0x0536;
                case 41: goto L_0x0504;
                case 42: goto L_0x04e9;
                case 43: goto L_0x04da;
                case 44: goto L_0x04da;
                case 45: goto L_0x04cb;
                case 46: goto L_0x0017;
                case 47: goto L_0x04bd;
                case 48: goto L_0x04ae;
                case 49: goto L_0x0486;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r6.A01
            X.6BJ r3 = (X.AnonymousClass6BJ) r3
            java.lang.Object r0 = r6.A02
            X.4Yb r0 = (X.C88034Yb) r0
            X.1ch r0 = r0.A01
        L_0x0011:
            r2 = 1
            r1 = 0
            r3.A4j(r0, r2, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r3 = r6.A01
            X.AQC r3 = (X.AQC) r3
            java.lang.Object r2 = r6.A02
            X.118 r0 = r3.A01
            android.content.Context r1 = r0.A00
            int r0 = r3.A00
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r1, r0)
            X.00H r0 = r3.A02
            X.1KB r7 = X.C108945cZ.A0a(r0)
            r0 = 19
            X.Ak2 r6 = new X.Ak2
            r6.<init>(r3, r2, r1, r0)
            goto L_0x0342
        L_0x0036:
            java.lang.Object r0 = r6.A01
            X.5lQ r0 = (X.C112405lQ) r0
            java.lang.Object r1 = r6.A02
            X.1ch r1 = (X.C29681ch) r1
            X.6BS r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            X.7KN r0 = r0.A01
            r0.A01(r1)
            return
        L_0x0048:
            java.lang.Object r3 = r6.A01
            X.6BJ r3 = (X.AnonymousClass6BJ) r3
            java.lang.Object r0 = r6.A02
            X.1ch r0 = (X.C29681ch) r0
            goto L_0x0011
        L_0x0051:
            java.lang.Object r2 = r6.A01
            X.2rF r2 = (X.C62342rF) r2
            java.lang.Object r1 = r6.A02
            X.206 r1 = (X.AnonymousClass206) r1
            boolean r0 = X.C62342rF.A00(r2, r1)
            if (r0 == 0) goto L_0x0016
            r2.A01(r1)
            return
        L_0x0063:
            java.lang.Object r7 = r6.A01
            X.9mz r7 = (X.C191679mz) r7
            java.lang.Object r5 = r6.A02
            X.1ch r5 = (X.C29681ch) r5
            X.1ch r0 = r7.A06
            if (r0 == 0) goto L_0x0016
            X.00H r4 = r7.A03
            java.lang.String r11 = X.C17890vO.A0T(r4)
            X.9F7 r3 = new X.9F7
            r3.<init>((X.C29681ch) r5, (java.lang.String) r11)
            X.00H r0 = r7.A05
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.1i5 r2 = (X.C32991i5) r2
            X.1md r0 = r7.A01
            X.9oP r1 = new X.9oP
            r1.<init>(r2, r5, r0)
            X.9Xz r0 = new X.9Xz
            r0.<init>(r1)
            X.1OZ r8 = X.C17880vN.A0U(r4)
            java.lang.Object r10 = r3.A00
            X.1ca r10 = (X.C29621ca) r10
            X.Aco r9 = new X.Aco
            r9.<init>(r5, r7, r0, r3)
            r13 = 32000(0x7d00, double:1.581E-319)
            r12 = 404(0x194, float:5.66E-43)
            r8.A0I(r9, r10, r11, r12, r13)
            return
        L_0x00a3:
            java.lang.Object r5 = r6.A01
            X.1hE r5 = (X.C32461hE) r5
            java.lang.Object r4 = r6.A02
            X.206 r4 = (X.AnonymousClass206) r4
            X.36a r3 = X.C50382Uf.A00(r4)
            if (r3 == 0) goto L_0x0016
            r6 = 1
            long r1 = r3.A01
            long r1 = r1 & r6
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            X.00H r0 = r5.A04
            java.lang.Object r2 = r0.get()
            X.2co r2 = (X.C53612co) r2
            r6 = 0
            X.205 r0 = r4.A0v
            X.1BI r11 = r0.A00
            boolean r0 = X.C22971Dz.A0V(r11)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r11, r0)
            X.1ch r11 = (X.C29681ch) r11
            java.lang.String[] r8 = X.C17880vN.A1Y()
            long r0 = r4.A0x
            X.C17880vN.A1V(r8, r6, r0)
            X.1Cd r0 = r2.A01
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0c0f }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0c0f }
            java.lang.String r1 = "SELECT reaction, reaction_count FROM newsletter_message_reaction WHERE message_row_id = ?"
            java.lang.String r0 = "GET_ALL_REACTIONS_FOR_NEWSLETTER_MESSAGE"
            android.database.Cursor r1 = r7.A0A(r1, r0, r8)     // Catch:{ all -> 0x0c0f }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0c08 }
            java.lang.String r7 = "reaction_count"
            int r8 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0c08 }
            java.lang.String r7 = "reaction"
            int r7 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0c08 }
        L_0x0100:
            boolean r9 = r1.moveToNext()     // Catch:{ all -> 0x0c08 }
            if (r9 == 0) goto L_0x012c
            long r13 = r1.getLong(r8)     // Catch:{ all -> 0x0c08 }
            java.lang.String r12 = r1.getString(r7)     // Catch:{ all -> 0x0c08 }
            X.11S r10 = r2.A00     // Catch:{ all -> 0x0c08 }
            X.C72453Mb.A1R(r12)     // Catch:{ all -> 0x0c08 }
            X.36a r9 = X.C50382Uf.A00(r4)     // Catch:{ all -> 0x0c08 }
            if (r9 == 0) goto L_0x012a
            java.lang.String r9 = r9.A05     // Catch:{ all -> 0x0c08 }
        L_0x011b:
            boolean r17 = r12.equals(r9)     // Catch:{ all -> 0x0c08 }
            long r15 = r4.A0x     // Catch:{ all -> 0x0c08 }
            X.5tR r9 = new X.5tR     // Catch:{ all -> 0x0c08 }
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0c08 }
            r0.add(r9)     // Catch:{ all -> 0x0c08 }
            goto L_0x0100
        L_0x012a:
            r9 = 0
            goto L_0x011b
        L_0x012c:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0c08 }
            if (r2 != 0) goto L_0x013a
            X.7C9 r2 = new X.7C9     // Catch:{ all -> 0x0c08 }
            r2.<init>(r0)     // Catch:{ all -> 0x0c08 }
            X.C63892tr.A07(r2, r4)     // Catch:{ all -> 0x0c08 }
        L_0x013a:
            r1.close()     // Catch:{ all -> 0x0c0f }
            r6.close()
        L_0x0140:
            X.8BG r1 = X.C63892tr.A01(r4)
            boolean r0 = r1 instanceof X.AnonymousClass7C9
            if (r0 == 0) goto L_0x0175
            X.7C9 r1 = (X.AnonymousClass7C9) r1
            if (r1 == 0) goto L_0x0175
            java.lang.String r6 = r3.A05
            if (r6 == 0) goto L_0x0175
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0175
            java.util.List r3 = r1.A00
            monitor-enter(r3)
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0c16 }
        L_0x015d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0c16 }
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0c16 }
            X.5tR r1 = (X.C115125tR) r1     // Catch:{ all -> 0x0c16 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0c16 }
            boolean r0 = X.C18070vi.A18(r0, r6)     // Catch:{ all -> 0x0c16 }
            if (r0 == 0) goto L_0x015d
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x0c16 }
        L_0x0174:
            monitor-exit(r3)
        L_0x0175:
            X.8BG r0 = X.C63892tr.A01(r4)
            if (r0 == 0) goto L_0x0016
            X.1KB r7 = r5.A00
            r0 = 13
            X.AkP r6 = new X.AkP
            r6.<init>(r5, r4, r0)
            goto L_0x0342
        L_0x0186:
            java.lang.Object r5 = r6.A01
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r7 = r6.A02
            X.3VS r7 = (X.AnonymousClass3VS) r7
            boolean r0 = r5 instanceof X.AnonymousClass1E2
            r6 = 0
            if (r0 == 0) goto L_0x01a1
            r1 = r5
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            if (r1 == 0) goto L_0x01a1
            X.1Ln r0 = r7.A08
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x01a1
            r5 = r0
        L_0x01a1:
            X.1M9 r0 = r7.A07
            X.1E7 r4 = r0.A0H(r5)
            X.1DT r3 = r7.A05
            java.util.List r0 = X.AnonymousClass3MW.A10(r3)
            if (r0 == 0) goto L_0x01f7
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x01b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass43Q
            if (r0 == 0) goto L_0x01b7
            r8.add(r1)
            goto L_0x01b7
        L_0x01c9:
            java.util.Iterator r2 = r8.iterator()
        L_0x01cd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.43Q r0 = (X.AnonymousClass43Q) r0
            X.4NS r0 = r0.A00
            X.1E7 r0 = r0.A00
            X.1BI r0 = r0.A0J
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 == 0) goto L_0x01cd
        L_0x01e6:
            X.43Q r1 = (X.AnonymousClass43Q) r1
            if (r1 == 0) goto L_0x01f7
            X.4NS r0 = r1.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.A06()
            if (r0 == 0) goto L_0x01f7
            r3.A0E(r0)
        L_0x01f7:
            X.1DT r3 = r7.A04
            java.util.List r0 = X.AnonymousClass3MW.A10(r3)
            if (r0 == 0) goto L_0x0016
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0207:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass43Q
            if (r0 == 0) goto L_0x0207
            r7.add(r1)
            goto L_0x0207
        L_0x0219:
            r1 = r6
            goto L_0x01e6
        L_0x021b:
            java.util.Iterator r2 = r7.iterator()
        L_0x021f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0239
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.43Q r0 = (X.AnonymousClass43Q) r0
            X.4NS r0 = r0.A00
            X.1E7 r0 = r0.A00
            X.1BI r0 = r0.A0J
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 == 0) goto L_0x021f
            r6 = r1
        L_0x0239:
            X.43Q r6 = (X.AnonymousClass43Q) r6
            if (r6 == 0) goto L_0x0016
            X.4NS r0 = r6.A00
            r0.A00 = r4
            java.lang.Object r0 = r3.A06()
            if (r0 == 0) goto L_0x0016
            r3.A0E(r0)
            return
        L_0x024b:
            java.lang.Object r4 = r6.A01
            X.A1I r4 = (X.A1I) r4
            java.lang.Object r3 = r6.A02
            X.C0L r3 = (X.C0L) r3
            X.1Oh r2 = r4.A03
            java.lang.String r0 = r3.id
            int r1 = r2.A01(r0)
            r0 = 5
            if (r1 == r0) goto L_0x0016
            X.00H r0 = r4.A05
            java.lang.Object r0 = r0.get()
            X.9xp r0 = (X.C198129xp) r0
            X.9lH r0 = X.C198129xp.A00(r3, r0)
            java.io.File r1 = r0.A00(r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x027a
            boolean r0 = r1.delete()
            if (r0 == 0) goto L_0x0016
        L_0x027a:
            java.lang.String r3 = r3.id
            android.content.SharedPreferences r0 = X.C25461Oh.A00(r2)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "downloadstate/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.C17880vN.A1B(r2, r0)
            return
        L_0x0292:
            java.lang.Object r4 = r6.A01
            com.whatsapp.mute.ui.MuteDialogViewModel r4 = (com.whatsapp.mute.ui.MuteDialogViewModel) r4
            java.lang.Object r8 = r6.A02
            java.util.List r8 = (java.util.List) r8
            r7 = 1
            X.4Dc r0 = r4.A00
            long r1 = r0.durationInMillis
            r14 = -1
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x02aa
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 + r1
        L_0x02aa:
            java.util.Iterator r10 = r8.iterator()
        L_0x02ae:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0335
            X.1BI r11 = X.C17880vN.A0Q(r10)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x02d0
            if (r11 == 0) goto L_0x02ae
            boolean r0 = X.C22971Dz.A0N(r11)
            if (r0 != 0) goto L_0x02ae
            boolean r0 = X.C22971Dz.A0c(r11)
            if (r0 != 0) goto L_0x02ae
            X.1Nb r0 = r4.A0B
            r0.A0j(r11, r14)
            goto L_0x02ae
        L_0x02d0:
            int r0 = r8.size()
            r16 = 1
            if (r0 > r7) goto L_0x02da
            r16 = 0
        L_0x02da:
            if (r11 == 0) goto L_0x02ae
            boolean r0 = X.C22971Dz.A0N(r11)
            if (r0 != 0) goto L_0x02ae
            boolean r0 = X.C22971Dz.A0c(r11)
            if (r0 != 0) goto L_0x02ae
            X.00H r0 = r4.A0D
            java.lang.Object r12 = r0.get()
            X.1pz r12 = (X.C37701pz) r12
            X.1i2 r13 = r4.A01
            if (r13 != 0) goto L_0x02f6
            X.1i2 r13 = X.C32961i2.CHAT_LIST_SCREEN
        L_0x02f6:
            X.C37701pz.A00(r11, r12, r13, r14, r16)
            X.1To r9 = r12.A00
            r0 = -1
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x030e
            X.11P r0 = r12.A01
            long r0 = X.AnonymousClass11P.A01(r0)
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r14 - r5
            long r0 = r0 + r2
        L_0x030e:
            java.util.Set r1 = r9.A03(r11, r0, r7)
            X.C18070vi.A0X(r1)
            X.1Nb r0 = r12.A03
            boolean r0 = r0.A0z(r11, r13, r14)
            if (r0 == 0) goto L_0x0331
            r9.A0R(r1)
        L_0x0320:
            boolean r0 = X.C22971Dz.A0e(r11)
            if (r0 == 0) goto L_0x02ae
            X.118 r0 = r12.A02
            android.content.Context r1 = r0.A00
            X.1Mu r0 = r12.A04
            com.whatsapp.push.RegistrationIntentService.A02(r1, r0)
            goto L_0x02ae
        L_0x0331:
            r9.A0Q(r1)
            goto L_0x0320
        L_0x0335:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0016
            X.1KB r7 = r4.A05
            r0 = 10
            X.Ail r6 = new X.Ail
            r6.<init>(r4, r0)
        L_0x0342:
            r7.A0J(r6)
            return
        L_0x0346:
            java.lang.Object r0 = r6.A01
            com.whatsapp.music.musiceditor.ui.MusicEditorDialog r0 = (com.whatsapp.music.musiceditor.ui.MusicEditorDialog) r0
            java.lang.Object r1 = r6.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.widget.ImageView r0 = r0.A04
            goto L_0x0362
        L_0x0351:
            java.lang.Object r0 = r6.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r6.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.AnonymousClass3MX.A1O(r0)
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
        L_0x0362:
            if (r0 == 0) goto L_0x0016
            r0.setImageBitmap(r1)
            return
        L_0x0368:
            java.lang.Object r0 = r6.A01
            X.8va r0 = (X.C173698va) r0
            java.lang.Object r4 = r6.A02
            android.content.Intent r4 = (android.content.Intent) r4
            boolean r1 = r0 instanceof com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService
            if (r1 == 0) goto L_0x0c2e
            com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService r0 = (com.whatsapp.migration.transferinfra.service.WifiGroupScannerP2pTransferService) r0
            r5 = 0
            java.lang.String r3 = "details_key"
            boolean r2 = r4.hasExtra(r3)
            java.lang.String r1 = "intent.getExtras()[EXTRA_DETAILS_KEY] is required but is not present"
            X.C17960vV.A0G(r2, r1)
            java.lang.Class<X.AEj> r1 = X.C20276AEj.class
            java.lang.Object r9 = X.C87314Vc.A00(r4, r1, r3)
            X.AEj r9 = (X.C20276AEj) r9
            java.lang.String r1 = "scanner_connection_type"
            int r1 = r4.getIntExtra(r1, r5)
            if (r9 == 0) goto L_0x0412
            X.9VY r2 = r0.A00
            if (r2 == 0) goto L_0x0c2a
            X.9Xo r10 = new X.9Xo
            r10.<init>(r0)
            X.9kP r11 = new X.9kP
            r11.<init>(r9, r0)
            X.1fE r2 = r2.A00
            X.10E r3 = r2.A01
            X.118 r7 = X.AnonymousClass3MZ.A0l(r3)
            X.10I r12 = X.AnonymousClass10E.AL1(r3)
            X.11C r6 = X.AnonymousClass3Ma.A0a(r3)
            X.10G r2 = r3.A00
            X.00S r2 = r2.A3g
            java.lang.Object r8 = r2.get()
            X.8yO r8 = (X.C175248yO) r8
            X.00S r2 = r3.A9c
            java.lang.Object r5 = r2.get()
            X.1cw r5 = (X.C29831cw) r5
            X.0wl r13 = X.AnonymousClass3MZ.A1B(r3)
            X.00S r2 = r3.A9C
            java.lang.Object r14 = r2.get()
            X.1OX r14 = (X.AnonymousClass1OX) r14
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r4 = new com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x03d3:
            r0.A02 = r4
            if (r4 == 0) goto L_0x0016
            if (r1 == 0) goto L_0x040f
            r0 = 1
            if (r1 == r0) goto L_0x040c
            r0 = 2
            if (r1 == r0) goto L_0x0409
            java.lang.String r3 = "UNKNOWN"
        L_0x03e1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ startScanner/scannerConnectionType: "
            X.C17900vP.A0f(r0, r3, r2)
            X.AEj r0 = r4.A07
            java.lang.String r5 = r0.A03
            java.lang.String r6 = r0.A04
            java.lang.String r7 = r0.A01
            if (r1 == 0) goto L_0x0c1f
            if (r5 == 0) goto L_0x0c1f
            if (r6 == 0) goto L_0x0c1f
            if (r7 == 0) goto L_0x0c1f
            r0 = 2
            if (r1 != r0) goto L_0x0c19
            X.1OX r0 = r4.A0C
            r8 = 0
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectToHotspot$1 r3 = new com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectToHotspot$1
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass3MX.A1Q(r3, r0)
            return
        L_0x0409:
            java.lang.String r3 = "HOTSPOT_WITH_WIFI_DIRECT_FALLBACK"
            goto L_0x03e1
        L_0x040c:
            java.lang.String r3 = "WIFI_DIRECT_WITH_HOTSPOT_FALLBACK"
            goto L_0x03e1
        L_0x040f:
            java.lang.String r3 = "WIFI_DIRECT_ONLY"
            goto L_0x03e1
        L_0x0412:
            r4 = 0
            goto L_0x03d3
        L_0x0414:
            java.lang.Object r7 = r6.A01
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r7 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r7
            java.lang.Object r6 = r6.A02
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            X.11C r0 = r7.A01
            android.os.PowerManager r2 = r0.A0G()
            java.lang.String r1 = "GoogleMigrateService/"
            if (r2 != 0) goto L_0x0431
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
        L_0x042c:
            java.lang.String r4 = "GoogleMigrateService/onStartCommand/wakelock released"
            if (r5 == 0) goto L_0x0442
            goto L_0x0437
        L_0x0431:
            r0 = 1
            android.os.PowerManager$WakeLock r5 = X.C181789Rv.A00(r2, r1, r0)
            goto L_0x042c
        L_0x0437:
            java.lang.String r0 = "GoogleMigrateService/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0446 }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r5.acquire(r0)     // Catch:{ Exception -> 0x0446 }
        L_0x0442:
            r6.run()     // Catch:{ Exception -> 0x0446 }
            goto L_0x0452
        L_0x0446:
            r3 = move-exception
            X.190 r2 = r7.A00     // Catch:{ all -> 0x0d4a }
            java.lang.String r1 = "xpm-gms-async"
            java.lang.String r0 = X.C17890vO.A0U(r6)     // Catch:{ all -> 0x0d4a }
            r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x0d4a }
        L_0x0452:
            if (r5 == 0) goto L_0x0016
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0016
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
            return
        L_0x0461:
            java.lang.Object r4 = r6.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r4 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r4
            java.lang.Object r3 = r6.A02
            X.1FL r3 = (X.AnonymousClass1FL) r3
            X.00H r0 = r4.A0R
            java.lang.Object r0 = r0.get()
            X.1Ps r0 = (X.C25811Ps) r0
            X.1E7 r0 = r0.A02()
            if (r0 == 0) goto L_0x0016
            X.1BI r2 = r0.A0J
            if (r2 == 0) goto L_0x0016
            X.1KB r1 = r4.A0H
            X.7R0 r0 = new X.7R0
            r0.<init>(r3, r2, r4)
            r1.A0J(r0)
            return
        L_0x0486:
            java.lang.Object r4 = r6.A01
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r6.A02
            X.2jH r3 = (X.C57562jH) r3
            r2 = 0
            X.205 r0 = r4.A0v
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x04a0
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.1Q1 r0 = (X.AnonymousClass1Q1) r0
            r0.A03(r1, r2)
        L_0x04a0:
            X.1Lg r3 = r3.A00
            r2 = 33
            r1 = 5
            X.AWu r0 = new X.AWu
            r0.<init>(r4, r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x04ae:
            java.lang.Object r0 = r6.A01
            X.2jH r0 = (X.C57562jH) r0
            java.lang.Object r3 = r6.A02
            X.1Lg r2 = r0.A00
            r1 = 33
            r0 = 6
            X.C20739AWu.A00(r2, r3, r1, r0)
            return
        L_0x04bd:
            java.lang.Object r0 = r6.A01
            X.2jH r0 = (X.C57562jH) r0
            java.lang.Object r2 = r6.A02
            X.1Lg r1 = r0.A00
            r0 = 16
            X.C17890vO.A0s(r1, r2, r0)
            return
        L_0x04cb:
            java.lang.Object r1 = r6.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.Object r0 = r6.A02
            X.0vk r0 = (X.C18090vk) r0
            r1.CEx()
            r0.invoke()
            return
        L_0x04da:
            java.lang.Object r3 = r6.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r1 = r6.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r3.CEx()
            r0 = 2131892585(0x7f121969, float:1.9419922E38)
            goto L_0x0512
        L_0x04e9:
            java.lang.Object r2 = r6.A01
            X.8yK r2 = (X.C175208yK) r2
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r2.CEx()
            X.00H r0 = r2.A03
            if (r0 == 0) goto L_0x05ed
            java.lang.Object r0 = r0.get()
            X.1LU r0 = (X.AnonymousClass1LU) r0
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r2, r0, r1)
            goto L_0x05e6
        L_0x0504:
            java.lang.Object r3 = r6.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r1 = r6.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r3.CEx()
            r0 = 2131892545(0x7f121941, float:1.9419841E38)
        L_0x0512:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2 = 2131892813(0x7f121a4d, float:1.9420385E38)
            boolean r0 = r1 instanceof X.C21598Amm
            if (r0 == 0) goto L_0x0528
            X.Amm r1 = (X.C21598Amm) r1
            int r1 = r1.code
            r0 = 403(0x193, float:5.65E-43)
            if (r1 != r0) goto L_0x0528
            r2 = 2131892749(0x7f121a0d, float:1.9420255E38)
        L_0x0528:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r7 = r6
            r3.CMx(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0536:
            java.lang.Object r2 = r6.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            java.lang.Object r0 = r6.A02
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r0 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet) r0
            r7 = 0
            android.view.View r1 = r2.A00
            X.C18070vi.A0X(r1)
            r5 = 2131895342(0x7f12242e, float:1.9425514E38)
            java.util.List r4 = java.util.Collections.emptyList()
            X.C18070vi.A0X(r4)
            X.11C r3 = r0.A02
            if (r3 == 0) goto L_0x055d
            r6 = 2000(0x7d0, float:2.803E-42)
            X.4eK r0 = new X.4eK
            r0.<init>((android.view.View) r1, (X.AnonymousClass1F9) r2, (X.AnonymousClass11C) r3, (java.util.List) r4, (int) r5, (int) r6, (boolean) r7)
            r0.A03()
            return
        L_0x055d:
            java.lang.String r0 = "systemServices"
            goto L_0x0d45
        L_0x0561:
            java.lang.Object r2 = r6.A01
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r2 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r2
            java.lang.Object r6 = r6.A02
            X.1ch r6 = (X.C29681ch) r6
            r10 = 0
            X.1nj r3 = r2.A04
            if (r3 == 0) goto L_0x05a1
            android.content.Context r4 = r2.A14()
            java.lang.Integer r7 = X.AnonymousClass00R.A0Y
            r8 = 0
            r11 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "whatsapp://channel/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)
            android.net.Uri r5 = android.net.Uri.parse(r0)
            r9 = r8
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11)
            X.1KB r1 = r2.A00
            if (r1 == 0) goto L_0x059b
            r0 = 2131886177(0x7f120061, float:1.9406925E38)
            java.lang.String r0 = r2.A1H(r0)
            r1.A0H(r0, r10)
            r2.A29()
            return
        L_0x059b:
            java.lang.String r0 = "globalUI"
            X.C18070vi.A11(r0)
            throw r8
        L_0x05a1:
            java.lang.String r0 = "newsletterLinkLauncher"
            goto L_0x0d45
        L_0x05a5:
            java.lang.Object r3 = r6.A01
            X.5lQ r3 = (X.C112405lQ) r3
            java.lang.Object r0 = r6.A02
            X.2Dk r0 = (X.C46162Dk) r0
            X.1ch r2 = r0.A0M()
            r1 = 1
            r0 = 0
            r3.A0V(r2, r1, r0)
            return
        L_0x05b7:
            java.lang.Object r3 = r6.A01
            X.6BJ r3 = (X.AnonymousClass6BJ) r3
            java.lang.Object r0 = r6.A02
            X.4Ts r0 = (X.C86954Ts) r0
            r2 = 1
            X.C18070vi.A0d(r0, r2)
            X.1ch r1 = r0.A00
            r0 = 0
            r3.A4j(r1, r2, r0)
            return
        L_0x05ca:
            java.lang.Object r2 = r6.A01
            com.whatsapp.newsletter.ui.NewsletterCreationActivity r2 = (com.whatsapp.newsletter.ui.NewsletterCreationActivity) r2
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r2.CEx()
            X.00H r0 = r2.A01
            if (r0 == 0) goto L_0x05ed
            java.lang.Object r0 = r0.get()
            X.1LU r0 = (X.AnonymousClass1LU) r0
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r2, r0, r1)
            X.C18070vi.A0X(r0)
        L_0x05e6:
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x05ed:
            java.lang.String r0 = "waIntents"
            goto L_0x0d45
        L_0x05f1:
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r6.A02
            X.749 r0 = (X.AnonymousClass749) r0
            X.00H r0 = r0.A0C
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x060c:
            java.lang.Object r0 = r6.A01
            X.4Qm r0 = (X.C86164Qm) r0
            java.lang.Object r1 = r6.A02
            X.5bA r1 = (X.C108125bA) r1
            X.1KB r0 = r0.A01
            goto L_0x0625
        L_0x0617:
            java.lang.Object r2 = r6.A01
            X.4Qm r2 = (X.C86164Qm) r2
            java.lang.Object r1 = r6.A02
            X.5bA r1 = (X.C108125bA) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1KB r0 = r2.A01
        L_0x0625:
            r0.A04()
            X.0wS r0 = X.C18460wS.A00
            r1.C7U(r0)
            return
        L_0x062e:
            java.lang.Object r2 = r6.A01
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r2 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r2
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.util.List r0 = r2.A5D(r1)
            r2.A06 = r0
            return
        L_0x0641:
            java.lang.Object r0 = r6.A01
            X.A8r r0 = (X.C20131A8r) r0
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Lf r0 = r0.A01
            goto L_0x070a
        L_0x064d:
            java.lang.Object r1 = r6.A01
            X.2rF r1 = (X.C62342rF) r1
            java.lang.Object r0 = r6.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.C62342rF.A00(r1, r0)
            return
        L_0x0659:
            java.lang.Object r0 = r6.A01
            X.9er r0 = (X.C186849er) r0
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.1mk r0 = (X.C35751mk) r0
            r0.A00(r1)
            return
        L_0x066d:
            java.lang.Object r1 = r6.A01
            X.1md r1 = (X.C35681md) r1
            java.lang.Object r3 = r6.A02
            X.1ch r3 = (X.C29681ch) r3
            X.00H r0 = r1.A0U
            java.lang.Object r4 = r0.get()
            X.9es r4 = (X.C186859es) r4
            X.00H r0 = r1.A0V
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1i5 r0 = (X.C32991i5) r0
            X.9oP r5 = new X.9oP
            r5.<init>(r0, r3, r1)
            X.A7K r2 = X.A7K.A00()
            boolean r0 = X.A7K.A03(r2, r3)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl.class
            java.lang.String r0 = "NewsletterMute"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r4.A00
            r0.get()
            X.00H r0 = r4.A01
            X.A2g r2 = X.C108975cc.A0J(r1, r0)
            r1 = 2
            goto L_0x06e6
        L_0x06aa:
            java.lang.Object r1 = r6.A01
            X.1md r1 = (X.C35681md) r1
            java.lang.Object r3 = r6.A02
            X.1ch r3 = (X.C29681ch) r3
            X.00H r0 = r1.A0U
            java.lang.Object r4 = r0.get()
            X.9es r4 = (X.C186859es) r4
            X.00H r0 = r1.A0V
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1i5 r0 = (X.C32991i5) r0
            X.9oP r5 = new X.9oP
            r5.<init>(r0, r3, r1)
            X.A7K r2 = X.A7K.A00()
            boolean r0 = X.A7K.A03(r2, r3)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl.class
            java.lang.String r0 = "NewsletterUnmute"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r4.A00
            r0.get()
            X.00H r0 = r4.A01
            X.A2g r2 = X.C108975cc.A0J(r1, r0)
            r1 = 3
        L_0x06e6:
            X.8tw r0 = new X.8tw
            r0.<init>(r3, r5, r4, r1)
            r2.A03(r0)
            return
        L_0x06ef:
            java.lang.Object r2 = r6.A01
            X.BAz r2 = (X.C22516BAz) r2
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r0 = 0
            r2.CDZ(r1, r0)
            return
        L_0x0700:
            java.lang.Object r0 = r6.A01
            X.9mi r0 = (X.C191509mi) r0
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Lf r0 = r0.A02
        L_0x070a:
            r0.A00(r1)
            return
        L_0x070e:
            java.lang.Object r1 = r6.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r0 = r6.A02
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.setImageBitmap(r0)
            return
        L_0x071a:
            java.lang.Object r0 = r6.A01
            X.1hE r0 = (X.C32461hE) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A01
            r0 = 28
            r1.A02(r2, r0)
            return
        L_0x072a:
            java.lang.Object r5 = r6.A01
            X.3VS r5 = (X.AnonymousClass3VS) r5
            java.lang.Object r4 = r6.A02
            X.9IV r4 = (X.AnonymousClass9IV) r4
            r3 = 0
            r0 = 0
            X.AnonymousClass3VS.A00(r4, r5, r0)
            X.9IV r0 = X.AnonymousClass9IV.SHORT
            if (r4 == r0) goto L_0x073f
            X.9IV r0 = X.AnonymousClass9IV.FULL
            if (r4 != r0) goto L_0x0746
        L_0x073f:
            com.whatsapp.newsletter.iq.BaseNewslettersJob r0 = r5.A00
            if (r0 == 0) goto L_0x0746
            r0.cancel()
        L_0x0746:
            X.9p0 r2 = r5.A0C
            X.1ch r1 = r5.A09
            X.AWV r0 = new X.AWV
            r0.<init>(r4, r5)
            com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob r0 = r2.A00(r4, r1, r0, r3)
            r5.A00 = r0
            return
        L_0x0756:
            java.lang.Object r5 = r6.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r4 = r6.A02
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            r2 = 2131895338(0x7f12242a, float:1.9425506E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.00H r0 = r5.A14
            if (r0 == 0) goto L_0x0789
            java.lang.Object r0 = r0.get()
            X.4XL r0 = (X.AnonymousClass4XL) r0
            java.lang.String r0 = r0.A01(r4)
            java.lang.String r3 = X.AnonymousClass3Ma.A10(r5, r0, r1, r3, r2)
            X.1GP r2 = r5.getSupportFragmentManager()
            X.9IF r1 = X.AnonymousClass9IF.REVOKE
            r0 = 0
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C181519Qu.A00(r1, r3, r0, r4)
            X.C20098A7b.A02(r0, r2)
            return
        L_0x0789:
            java.lang.String r0 = "newsletterMultiAdminUtils"
            goto L_0x0d45
        L_0x078d:
            java.lang.Object r8 = r6.A01
            com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity r8 = (com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity) r8
            java.lang.Object r9 = r6.A02
            android.content.Context r9 = (android.content.Context) r9
            r7 = 0
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            X.73D r11 = new X.73D
            r11.<init>()
            X.1Nf r1 = r8.A04
            if (r1 == 0) goto L_0x07f8
            X.1ch r0 = r8.A06
            java.lang.String r2 = "jid"
            if (r0 == 0) goto L_0x07f3
            X.1E7 r1 = r1.A01(r0)
            X.1Me r0 = r8.A02
            if (r0 == 0) goto L_0x07ef
            java.lang.String r5 = r0.A0I(r1)
            if (r5 != 0) goto L_0x07b9
            java.lang.String r5 = ""
        L_0x07b9:
            X.1ch r3 = r8.A06
            if (r3 == 0) goto L_0x07f3
            X.9Id r4 = X.AnonymousClass9Id.LINK_CARD
            X.Ac1 r2 = new X.Ac1
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            X.00H r0 = r8.A09
            if (r0 == 0) goto L_0x0d43
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.6GM r0 = (X.AnonymousClass6GM) r0
            X.72S r1 = r0.A04(r9, r1, r2)
            if (r1 == 0) goto L_0x07e3
            java.io.File r0 = r1.A0C()
            if (r0 == 0) goto L_0x07e3
            android.net.Uri r0 = r1.A0X
            r10.add(r0)
            r11.A06(r1)
        L_0x07e3:
            X.1KB r0 = r8.A05
            r12 = 6
            X.7Py r7 = new X.7Py
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0J(r7)
            return
        L_0x07ef:
            java.lang.String r0 = "waContactNames"
            goto L_0x0d45
        L_0x07f3:
            X.C18070vi.A11(r2)
            goto L_0x0d48
        L_0x07f8:
            java.lang.String r0 = "conversationContactManager"
            goto L_0x0d45
        L_0x07fc:
            java.lang.Object r0 = r6.A01
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r0
            X.118 r0 = r0.A02
            android.content.Context r3 = r0.A00
            android.content.Intent r2 = X.C72463Mc.A0G(r3)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.corruptinstallation.CorruptInstallationActivity"
            r2.setClassName(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r2.setFlags(r0)
            r3.startActivity(r0)
            return
        L_0x081b:
            java.lang.Object r0 = r6.A01
            com.whatsapp.migration.export.service.MessagesExporterService r0 = (com.whatsapp.migration.export.service.MessagesExporterService) r0
            java.lang.Object r1 = r6.A02
            android.content.Intent r1 = (android.content.Intent) r1
            X.A7R r8 = r0.A00
            java.lang.String r0 = "IS_FIRST_PARTY"
            r7 = 0
            boolean r19 = r1.getBooleanExtra(r0, r7)
            monitor-enter(r8)
            X.1Ez r2 = r8.A0H     // Catch:{ all -> 0x0bf7 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0bf7 }
            r2.A00 = r0     // Catch:{ all -> 0x0bf7 }
            r2.A04()     // Catch:{ all -> 0x0bf7 }
            monitor-exit(r8)
            X.AW7 r6 = r8.A0C
            r6.A00 = r7
            monitor-enter(r8)
            android.os.CancellationSignal r0 = r8.A00     // Catch:{ all -> 0x0bf4 }
            if (r0 != 0) goto L_0x0bed
            java.util.concurrent.CountDownLatch r0 = r8.A01     // Catch:{ all -> 0x0bf4 }
            if (r0 != 0) goto L_0x0bed
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x0bf4 }
            r0.<init>()     // Catch:{ all -> 0x0bf4 }
            r8.A00 = r0     // Catch:{ all -> 0x0bf4 }
            r5 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0bf4 }
            r0.<init>(r5)     // Catch:{ all -> 0x0bf4 }
            r8.A01 = r0     // Catch:{ all -> 0x0bf4 }
            android.os.CancellationSignal r10 = r8.A00     // Catch:{ all -> 0x0bf4 }
            monitor-exit(r8)     // Catch:{ all -> 0x0bf4 }
            java.lang.String r1 = "ExportFlowManager/"
            X.11C r0 = r8.A03
            android.os.PowerManager r0 = r0.A0G()
            if (r0 != 0) goto L_0x086e
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4 = 0
        L_0x0868:
            r3 = 0
            r2 = 16
            if (r4 == 0) goto L_0x087e
            goto L_0x0873
        L_0x086e:
            android.os.PowerManager$WakeLock r4 = X.C181789Rv.A00(r0, r1, r5)
            goto L_0x0868
        L_0x0873:
            java.lang.String r0 = "ExportFlowManager/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r4.acquire(r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
        L_0x087e:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r0 = 3
            X.A7R.A03(r8, r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.8ro r11 = new X.8ro     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r11.<init>()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.8ro r9 = new X.8ro     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r9.<init>()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.8ro r1 = X.A7R.A01(r8, r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.Integer r0 = X.C108955ca.A0g()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r11.A05 = r0     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r9.A05 = r0     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            monitor-enter(r8)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.util.List r12 = r8.A0K     // Catch:{ all -> 0x0ae4 }
            r12.clear()     // Catch:{ all -> 0x0ae4 }
            r12.add(r11)     // Catch:{ all -> 0x0ae4 }
            r12.add(r9)     // Catch:{ all -> 0x0ae4 }
            r12.add(r1)     // Catch:{ all -> 0x0ae4 }
            monitor-exit(r8)     // Catch:{ all -> 0x0ae4 }
            X.2Ki r0 = r8.A0D     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r22 = r0
            r1 = 34
            X.C20735AWq.A00(r0, r1)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r8.A07()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.9uZ r1 = r8.A0A     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r1.A02(r10)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r1.A00()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.1jT r9 = r8.A0G     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r9.A0G()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.11y r0 = r8.A06     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r0.A03(r7)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.9nj r11 = r8.A0B     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.String r0 = "messages"
            java.io.File r14 = r11.A00(r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.A8U r0 = r8.A07     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r0.A0G(r10, r14)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.String r0 = "ExportFlowManager/doExport()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.9uW r13 = r8.A0F     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.String r0 = "migration/messages_export.zip"
            long r14 = r13.A02(r14, r0, r5)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r17 = 0
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0ada
            X.9uV r0 = r8.A09     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r21 = r0
            java.lang.String r0 = "enc-metadata"
            java.io.File r16 = r11.A00(r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.0ve r14 = r8.A04     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r11 = 1387(0x56b, float:1.944E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            boolean r11 = X.C18020vd.A05(r0, r14, r11)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r0 = 10
            X.8ro r0 = X.A7R.A01(r8, r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r12.add(r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r16)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.util.zip.ZipOutputStream r14 = new java.util.zip.ZipOutputStream     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r14.<init>(r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r1.A03(r10, r14, r5)     // Catch:{ all -> 0x0ad0 }
            X.9dY r1 = r8.A0E     // Catch:{ all -> 0x0ad0 }
            if (r11 != 0) goto L_0x0920
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0ad0 }
        L_0x0920:
            X.C18070vi.A0d(r12, r5)     // Catch:{ all -> 0x0ad0 }
            X.AiE r11 = new X.AiE     // Catch:{ all -> 0x0ad0 }
            r11.<init>(r14)     // Catch:{ all -> 0x0ad0 }
            X.9uV r0 = r1.A01     // Catch:{ all -> 0x0ac9 }
            java.lang.String r15 = r0.A02()     // Catch:{ all -> 0x0ac9 }
            android.util.JsonWriter r10 = r11.A01     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "attemptInfo"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            r10.beginObject()     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "attemptId"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            r10.value(r15)     // Catch:{ all -> 0x0ac9 }
            r10.endObject()     // Catch:{ all -> 0x0ac9 }
            X.11C r0 = r1.A00     // Catch:{ all -> 0x0ac9 }
            r20 = r0
            X.0vc r1 = r1.A02     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "donorInfo"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            r10.beginObject()     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "deviceName"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0ac9 }
            r15.append(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "-"
            r15.append(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r15)     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "appVersion"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "2.24.24.78"
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "osVersion"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "buildType"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Integer r0 = X.C17880vN.A0k()     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "yearClass2016"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            r0 = r20
            int r0 = X.C24191Jf.A02(r0, r1)     // Catch:{ all -> 0x0ac9 }
            long r0 = (long) r0     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
            r10.endObject()     // Catch:{ all -> 0x0ac9 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0ac9 }
            if (r0 != 0) goto L_0x0a30
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            r0.beginArray()     // Catch:{ all -> 0x0ac9 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0ac9 }
        L_0x09b2:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x0a2d
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0ac9 }
            X.8ro r1 = (X.C171498ro) r1     // Catch:{ all -> 0x0ac9 }
            java.lang.Integer r0 = r1.A05     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x09b2
            int r0 = r0.intValue()     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x09b2
            r10.beginObject()     // Catch:{ all -> 0x0ac9 }
            java.lang.String r0 = "eventTypeCode"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Integer r0 = r1.A05     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Long r0 = r1.A07     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x09e3
            java.lang.String r0 = "duration"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Long r0 = r1.A07     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
        L_0x09e3:
            java.lang.Long r0 = r1.A08     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x09f1
            java.lang.String r0 = "progress"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Long r0 = r1.A08     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
        L_0x09f1:
            java.lang.Double r0 = r1.A02     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x09ff
            java.lang.String r0 = "exportedDbSize"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Double r0 = r1.A02     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
        L_0x09ff:
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x0a0d
            java.lang.String r0 = "storageAvailableSize"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
        L_0x0a0d:
            java.lang.Double r0 = r1.A00     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x0a1b
            java.lang.String r0 = "waDbSize"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Double r0 = r1.A00     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
        L_0x0a1b:
            java.lang.Double r0 = r1.A01     // Catch:{ all -> 0x0ac9 }
            if (r0 == 0) goto L_0x0a29
            java.lang.String r0 = "mediaSize"
            r10.name(r0)     // Catch:{ all -> 0x0ac9 }
            java.lang.Double r0 = r1.A01     // Catch:{ all -> 0x0ac9 }
            r10.value(r0)     // Catch:{ all -> 0x0ac9 }
        L_0x0a29:
            r10.endObject()     // Catch:{ all -> 0x0ac9 }
            goto L_0x09b2
        L_0x0a2d:
            r10.endArray()     // Catch:{ all -> 0x0ac9 }
        L_0x0a30:
            r11.close()     // Catch:{ all -> 0x0ad0 }
            r14.close()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.String r12 = "migration/enc.zip"
            X.9zK r0 = r13.A00     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.String r11 = r16.getCanonicalPath()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            X.C18070vi.A0X(r11)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            long r14 = r16.length()     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            java.lang.String r13 = ""
            r10 = r0
            r16 = r5
            long r10 = r10.A00(r11, r12, r13, r14, r16)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0ae7
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r8)
            java.util.concurrent.CountDownLatch r0 = r8.A01     // Catch:{ all -> 0x0ac6 }
            r0.countDown()     // Catch:{ all -> 0x0ac6 }
            r8.A01 = r3     // Catch:{ all -> 0x0ac6 }
            r8.A00 = r3     // Catch:{ all -> 0x0ac6 }
            monitor-exit(r8)     // Catch:{ all -> 0x0ac6 }
            A00(r4)
            r0 = 10
            X.A7R.A03(r8, r0)
            X.A7R.A02(r8)
            if (r19 != 0) goto L_0x0abe
            X.A2w r0 = r8.A08
            r0.A03()
            java.lang.String r0 = "RegistrationManager/unregisterUserFromDevice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Mn r0 = r9.A0H
            r0.A00()
            X.00H r0 = r9.A0P
            java.lang.Object r0 = r0.get()
            X.17v r0 = (X.C219017v) r0
            r0.A0F(r5, r2)
            X.1gx r0 = r9.A0I
            r0.A0E(r5)
            X.11S r0 = r9.A05
            r0.A0F()
            r0.A0G()
            java.lang.String r0 = "RegistrationManager/setMigrationExportStage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r0 = r9.A0C
            r0.A14()
            r0 = 11
            X.C33841jT.A03(r9, r0, r5)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r21
            X.00H r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BV.A06(r0)
            java.lang.String r0 = "/export/start_time"
            X.C17880vN.A1D(r1, r0, r2)
            r21.A03()
            java.lang.String r0 = "ExportFlowManager/exportProviderAndLogout/complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0abe:
            r1 = 33
            r0 = r22
            X.C20735AWq.A00(r0, r1)
            return
        L_0x0ac6:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0ac6 }
            throw r1
        L_0x0ac9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0acb }
        L_0x0acb:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x0ad0 }
            throw r0     // Catch:{ all -> 0x0ad0 }
        L_0x0ad0:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0ad5 }
            goto L_0x0ad9
        L_0x0ad5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
        L_0x0ad9:
            throw r1     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
        L_0x0ada:
            r1 = 502(0x1f6, float:7.03E-43)
            java.lang.String r0 = "ExportFlowManager/Failed to register master file."
            X.9HZ r9 = new X.9HZ     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r9.<init>((int) r1, (java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            goto L_0x0af0
        L_0x0ae4:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0ae4 }
            goto L_0x0af0
        L_0x0ae7:
            r1 = 503(0x1f7, float:7.05E-43)
            java.lang.String r0 = "ExportFlowManager/Failed to register encryption metadata file."
            X.9HZ r9 = new X.9HZ     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
            r9.<init>((int) r1, (java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
        L_0x0af0:
            throw r9     // Catch:{ OperationCanceledException -> 0x0b6e, Exception -> 0x0af1 }
        L_0x0af1:
            r11 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/failed"
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x0b56 }
            boolean r0 = r11 instanceof X.B8K     // Catch:{ all -> 0x0b56 }
            if (r0 == 0) goto L_0x0b22
            r0 = r11
            X.B8K r0 = (X.B8K) r0     // Catch:{ all -> 0x0b56 }
            int r5 = r0.BUv()     // Catch:{ all -> 0x0b56 }
            r0 = 103(0x67, float:1.44E-43)
            if (r5 == r0) goto L_0x0b20
            switch(r5) {
                case 501: goto L_0x0b17;
                case 502: goto L_0x0b1a;
                case 503: goto L_0x0b1d;
                default: goto L_0x0b09;
            }     // Catch:{ all -> 0x0b56 }
        L_0x0b09:
            X.190 r2 = r8.A02     // Catch:{ all -> 0x0b56 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0b56 }
            java.lang.String r0 = "xpm-export-unexpected-migration-error-code"
            r2.A0G(r0, r1, r7)     // Catch:{ all -> 0x0b56 }
            r2 = 16
            goto L_0x0b22
        L_0x0b17:
            r2 = 9
            goto L_0x0b22
        L_0x0b1a:
            r2 = 8
            goto L_0x0b22
        L_0x0b1d:
            r2 = 12
            goto L_0x0b22
        L_0x0b20:
            r2 = 13
        L_0x0b22:
            boolean r0 = r11 instanceof X.C173668vV     // Catch:{ all -> 0x0b56 }
            if (r0 == 0) goto L_0x0b3d
            java.lang.String r10 = "EncryptionKeyException"
        L_0x0b28:
            X.190 r9 = r8.A02     // Catch:{ all -> 0x0b56 }
            java.lang.String r7 = "xpm-export-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0b56 }
            r1.append(r5)     // Catch:{ all -> 0x0b56 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)     // Catch:{ all -> 0x0b56 }
            r9.A0E(r7, r0, r11)     // Catch:{ all -> 0x0b56 }
            goto L_0x0b42
        L_0x0b3d:
            java.lang.String r10 = X.C108955ca.A0x(r11)     // Catch:{ all -> 0x0b56 }
            goto L_0x0b28
        L_0x0b42:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r8)
            java.util.concurrent.CountDownLatch r0 = r8.A01     // Catch:{ all -> 0x0b53 }
            r0.countDown()     // Catch:{ all -> 0x0b53 }
            r8.A01 = r3     // Catch:{ all -> 0x0b53 }
            r8.A00 = r3     // Catch:{ all -> 0x0b53 }
            monitor-exit(r8)     // Catch:{ all -> 0x0b53 }
            goto L_0x0b82
        L_0x0b53:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0b53 }
            throw r1
        L_0x0b56:
            r1 = move-exception
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r8)
            java.util.concurrent.CountDownLatch r0 = r8.A01     // Catch:{ all -> 0x0b6b }
            r0.countDown()     // Catch:{ all -> 0x0b6b }
            r8.A01 = r3     // Catch:{ all -> 0x0b6b }
            r8.A00 = r3     // Catch:{ all -> 0x0b6b }
            monitor-exit(r8)     // Catch:{ all -> 0x0b6b }
            A00(r4)
            throw r1
        L_0x0b6b:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0b6b }
            throw r1
        L_0x0b6e:
            java.lang.String r0 = "ExportFlowManager/prepareExportData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            monitor-enter(r8)
            java.util.concurrent.CountDownLatch r0 = r8.A01     // Catch:{ all -> 0x0bea }
            r0.countDown()     // Catch:{ all -> 0x0bea }
            r8.A01 = r3     // Catch:{ all -> 0x0bea }
            r8.A00 = r3     // Catch:{ all -> 0x0bea }
            monitor-exit(r8)     // Catch:{ all -> 0x0bea }
            A00(r4)
            goto L_0x0be1
        L_0x0b82:
            A00(r4)
            X.9uV r4 = r8.A09
            java.lang.String r9 = r4.A02()
            X.00H r0 = r8.A0I
            java.lang.Object r7 = r0.get()
            X.1a6 r7 = (X.AnonymousClass1a6) r7
            X.00H r0 = r8.A0J
            long r0 = X.AnonymousClass8BV.A05(r0)
            X.8ro r3 = new X.8ro
            r3.<init>()
            r3.A09 = r9
            java.lang.Integer r9 = X.C17880vN.A0h()
            r3.A03 = r9
            java.lang.Integer r9 = X.C17880vN.A0k()
            r3.A05 = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A04 = r2
            long r9 = X.A7R.A00(r8)
            long r9 = X.C17880vN.A04(r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r3.A07 = r2
            int r2 = r6.A00
            java.lang.Long r2 = X.C17880vN.A0n(r2)
            r3.A08 = r2
            long r0 = r7.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
            X.18K r0 = r8.A05
            r0.CC4(r3)
            r4.A03()
            X.2Ki r1 = r8.A0D
            r0 = 10
            X.C20736AWr.A00(r1, r5, r0)
        L_0x0be1:
            X.2Ki r0 = r8.A0D
            r0.unregisterObserver(r6)
            r8.A07()
            return
        L_0x0bea:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0bea }
            throw r1
        L_0x0bed:
            java.lang.String r0 = "ExportFlowManager/prepareExportData() already running, cannot start another export."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0bf4 }
            throw r0     // Catch:{ all -> 0x0bf4 }
        L_0x0bf4:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0bf4 }
            throw r1
        L_0x0bf7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0bfa:
            java.lang.Object r0 = r6.A01
            X.352 r0 = (X.AnonymousClass352) r0
            java.lang.Object r1 = r6.A02
            X.2mG r1 = (X.C59412mG) r1
            X.1fG r0 = r0.A01
            r0.A06(r1)
            return
        L_0x0c08:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0c0a }
        L_0x0c0a:
            r0 = move-exception
            X.CDX.A00(r1, r2)     // Catch:{ all -> 0x0c0f }
            throw r0     // Catch:{ all -> 0x0c0f }
        L_0x0c0f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0c11 }
        L_0x0c11:
            r1 = move-exception
            X.CDX.A00(r6, r0)
            throw r1
        L_0x0c16:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0c19:
            X.Aln r0 = new X.Aln
            r0.<init>(r4, r5, r6, r7)
            goto L_0x0c26
        L_0x0c1f:
            r1 = 32
            X.Alb r0 = new X.Alb
            r0.<init>(r4, r1)
        L_0x0c26:
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler.A04(r4, r0)
            return
        L_0x0c2a:
            java.lang.String r0 = "connectionHandlerFactory"
            goto L_0x0d45
        L_0x0c2e:
            com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService r0 = (com.whatsapp.migration.transferinfra.service.WifiGroupCreatorP2pTransferService) r0
            java.lang.String r1 = "dynamicPort"
            boolean r8 = X.AnonymousClass3MY.A1a(r4, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.lang.String r1 = "authToken"
            java.lang.String r9 = r4.getStringExtra(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r9 == 0) goto L_0x0d17
            java.lang.String r1 = "privateKey"
            java.io.Serializable r7 = r4.getSerializableExtra(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.security.PrivateKey r7 = (java.security.PrivateKey) r7     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r7 == 0) goto L_0x0d10
            java.lang.String r1 = "certificate"
            java.io.Serializable r6 = r4.getSerializableExtra(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.security.cert.Certificate r6 = (java.security.cert.Certificate) r6     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r6 == 0) goto L_0x0d09
            X.00H r1 = r0.A04     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r1 == 0) goto L_0x0d02
            java.lang.Object r2 = r1.get()     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.8yO r2 = (X.C175248yO) r2     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r3 = 0
            r2.A01(r1, r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r5 = 8988(0x231c, float:1.2595E-41)
            if (r8 == 0) goto L_0x0c67
            r5 = 0
        L_0x0c67:
            X.Amw r2 = new X.Amw     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r2.<init>(r7, r6)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.net.ServerSocket r10 = r2.createServerSocket(r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.9VX r2 = r0.A01     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r2 == 0) goto L_0x0cfc
            X.9Xn r7 = new X.9Xn     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r7.<init>(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.1fE r2 = r2.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.10E r2 = r2.A01     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.10I r8 = X.AnonymousClass10E.AL1(r2)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.10G r2 = r2.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.00S r2 = r2.A3g     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.lang.Object r6 = r2.get()     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.8yO r6 = (X.C175248yO) r6     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.9Bn r5 = new X.9Bn     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r0.A04 = r5     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r5.start()     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            int r9 = r10.getLocalPort()     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r5 = 0
            java.lang.String r2 = "sessionId"
            java.lang.String r6 = r4.getStringExtra(r2)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r6 == 0) goto L_0x0d1e
            java.lang.String r2 = "shouldCreateWifiDirectGroup"
            boolean r10 = r4.getBooleanExtra(r2, r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.lang.String r2 = "networkNamePostfix"
            java.lang.String r7 = r4.getStringExtra(r2)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r7 == 0) goto L_0x0cf5
            X.9VW r2 = r0.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            if (r2 == 0) goto L_0x0cef
            X.9Xm r13 = new X.9Xm     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r13.<init>(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.1fE r2 = r2.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.10E r3 = r2.A01     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.10I r14 = X.AnonymousClass10E.AL1(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.10G r2 = r3.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.00S r2 = r2.A3g     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.lang.Object r12 = r2.get()     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.8yO r12 = (X.C175248yO) r12     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.00S r2 = r3.A9C     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.1OX r2 = (X.AnonymousClass1OX) r2     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.0wl r15 = X.AnonymousClass3MZ.A1B(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.9gk r5 = new X.9gk     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r11 = r5
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.1OX r3 = r5.A06     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r8 = 0
            com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorConnectionHandler$startWifiDirect$1 r4 = new com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorConnectionHandler$startWifiDirect$1     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.1OR r2 = X.AnonymousClass1OR.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            X.C30451dy.A02(r1, r2, r4, r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r0.A03 = r5     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            return
        L_0x0cef:
            java.lang.String r1 = "connectionHandlerFactory"
            X.C18070vi.A11(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            throw r3     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
        L_0x0cf5:
            java.lang.String r1 = "p2p//WifiGroupCreatorP2pTransferService/startConnectionHandler/networkName is null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            goto L_0x0d24
        L_0x0cfc:
            java.lang.String r1 = "networkingThreadFactory"
            X.C18070vi.A11(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            throw r3     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
        L_0x0d02:
            java.lang.String r1 = "p2pTransferObservers"
            X.C18070vi.A11(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            r1 = 0
            goto L_0x0d24
        L_0x0d09:
            java.lang.String r1 = "p2p//WifiGroupCreatorP2pTransferService/startServerThread/certificate is null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            goto L_0x0d24
        L_0x0d10:
            java.lang.String r1 = "p2p//WifiGroupCreatorP2pTransferService/startServerThread/privateKey is null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            goto L_0x0d24
        L_0x0d17:
            java.lang.String r1 = "p2p//WifiGroupCreatorP2pTransferService/startServerThread/authToken is null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
            goto L_0x0d24
        L_0x0d1e:
            java.lang.String r1 = "p2p//WifiGroupCreatorP2pTransferService/startConnectionHandler/sessionId is null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
        L_0x0d24:
            throw r1     // Catch:{ IOException | IllegalArgumentException -> 0x0d25 }
        L_0x0d25:
            r2 = move-exception
            java.lang.String r1 = "p2p//WifiGroupCreatorP2pTransferService/failed to start receiver service"
            com.whatsapp.util.Log.e(r1, r2)
            X.00H r1 = r0.A04
            if (r1 == 0) goto L_0x0d40
            java.lang.Object r3 = r1.get()
            X.8yO r3 = (X.C175248yO) r3
            r2 = 601(0x259, float:8.42E-43)
            java.lang.String r1 = "failed to start receiver service"
            r3.A00(r2, r1)
            r0.stopSelf()
            return
        L_0x0d40:
            java.lang.String r0 = "p2pTransferObservers"
            goto L_0x0d45
        L_0x0d43:
            java.lang.String r0 = "newsletterStatusMediaGenerator"
        L_0x0d45:
            X.C18070vi.A11(r0)
        L_0x0d48:
            r0 = 0
            throw r0
        L_0x0d4a:
            r1 = move-exception
            if (r5 == 0) goto L_0x0d59
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0d59
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
        L_0x0d59:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21458AkP.run():void");
    }

    public C21458AkP(AnonymousClass9IV r2, AnonymousClass3VS r3) {
        this.A00 = 11;
        this.A01 = r3;
        this.A02 = r2;
    }

    public C21458AkP(AnonymousClass1FL r2, MetaAiVoiceViewModel metaAiVoiceViewModel) {
        this.A00 = 1;
        this.A01 = metaAiVoiceViewModel;
        this.A02 = r2;
    }
}

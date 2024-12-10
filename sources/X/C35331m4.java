package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1m4  reason: invalid class name and case insensitive filesystem */
public class C35331m4 implements AnonymousClass1RJ {
    public int A00;
    public final C19880zA A01;
    public final C19880zA A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass11S A04;
    public final C26261Rl A05;
    public final C34641kp A06;
    public final AnonymousClass1PM A07;
    public final C34811l7 A08;
    public final AnonymousClass11P A09;
    public final C19830z4 A0A;
    public final AnonymousClass122 A0B;
    public final AnonymousClass1MZ A0C;
    public final C26111Qw A0D;
    public final AnonymousClass1NK A0E;
    public final C33231iU A0F;
    public final AnonymousClass1U5 A0G;
    public final AnonymousClass1MR A0H;
    public final C18030ve A0I;
    public final AnonymousClass18K A0J;
    public final AnonymousClass126 A0K;
    public final AnonymousClass12M A0L;
    public final C34651kr A0M;
    public final AnonymousClass1O2 A0N;
    public final AnonymousClass1OZ A0O;
    public final AnonymousClass1N9 A0P;
    public final C35211lq A0Q;
    public final AnonymousClass1N7 A0R;
    public final AnonymousClass1PT A0S;
    public final AnonymousClass1QS A0T;
    public final C31661fv A0U;
    public final C34661ks A0V;
    public final C35301lz A0W;
    public final AnonymousClass1PQ A0X;
    public final C35361m7 A0Y;
    public final C35311m1 A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final Set A0e = new HashSet();
    public final C23651Hc A0f;
    public final AnonymousClass1S2 A0g;
    public final C26191Re A0h;
    public final C34711kx A0i;
    public final C35321m3 A0j;
    public final C32201go A0k;
    public final AnonymousClass00H A0l;
    public final AnonymousClass00H A0m;

    private void A00(AnonymousClass206 r3, AnonymousClass205 r4, int i) {
        if (r3 != null) {
            try {
                A01(r3, r4, 20);
            } catch (Exception e) {
                Log.e("MessagingXmppHandler/markAndLogMessageSendFailure/", e);
            }
            A02(r3, r4, 3, i);
        }
    }

    private void A01(AnonymousClass206 r5, AnonymousClass205 r6, int i) {
        if (r5 instanceof AnonymousClass212) {
            C33231iU r3 = this.A0F;
            if (!AnonymousClass25A.A0P(r3.A01, r5)) {
                Log.e("MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self");
            } else {
                ((C31931gM) r3.A0G.get()).A01(new C70733Ch(r3, r5, 9), 57);
            }
        } else if (r5 != null) {
            r5.A0a(i);
            this.A0B.CQx(r5, 23);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("MessagingXmppHandler/onMessageError/bounce unable to find message ");
            sb.append(r6);
            Log.w(sb.toString());
        }
    }

    private void A02(AnonymousClass206 r6, AnonymousClass205 r7, int i, int i2) {
        int i3;
        try {
            Set A032 = this.A0D.A03(r7);
            AnonymousClass1PT r2 = this.A0S;
            C62162qt r1 = new C62162qt(r6);
            r1.A04 = i;
            r1.A05 = i2;
            if (r6.A0E() == 1) {
                i3 = this.A0B.BYx(r6);
            } else {
                i3 = 0;
            }
            r1.A03 = i3;
            r1.A02 = C22971Dz.A0D(this.A03, A032).size();
            r1.A00 = A032.size();
            r1.A0B = true;
            r1.A0D = true;
            r1.A0C = this.A0N.A04.contains(r7);
            r1.A09 = A032;
            r2.A08(r1.A01());
        } catch (Exception e) {
            Log.e("MessagingXmppHandler/logMessageSendFailure/", e);
        }
    }

    private void A03(AnonymousClass205 r15, boolean z, boolean z2) {
        Object obj;
        long j;
        long j2;
        AnonymousClass205 r7 = r15;
        HashSet hashSet = new HashSet(C26111Qw.A01(this.A0D, r15).A05(r15));
        AnonymousClass11S r0 = this.A04;
        if (z2) {
            obj = r0.A08();
        } else {
            r0.A0I();
            obj = r0.A02;
        }
        hashSet.add(obj);
        Set A0D2 = C22971Dz.A0D(this.A03, hashSet);
        C26191Re r6 = this.A0h;
        UserJid[] userJidArr = (UserJid[]) A0D2.toArray(new UserJid[0]);
        if (z) {
            j2 = 0;
        } else {
            long A012 = AnonymousClass11P.A01(this.A09);
            long A002 = (long) C18020vd.A00(C18040vf.A02, this.A0I, 2257);
            if (A002 <= 0 || A002 > 60) {
                j = 300000;
            } else {
                j = A002 * 60000;
            }
            j2 = A012 + j;
        }
        boolean A013 = this.A0f.A01();
        if (userJidArr.length == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("SyncDeviceAndResendMessageJob/empty recipients for ");
            sb.append(r15);
            Log.w(sb.toString());
        } else if (r6.A02.A01(r15)) {
            r6.A00.A01(new SyncDeviceAndResendMessageJob(r7, userJidArr, AnonymousClass11P.A01(r6.A04), j2, A013));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        if (X.C18070vi.A18(r5, "vote") != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017e, code lost:
        if (r13 == null) goto L_0x0180;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C63362sw r18, X.C35331m4 r19, java.util.Map r20) {
        /*
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe id="
            r6.append(r0)
            r3 = r18
            java.lang.String r0 = r3.A0h
            r6.append(r0)
            java.lang.String r0 = " t="
            r6.append(r0)
            long r0 = r3.A0X
            r6.append(r0)
            java.lang.String r2 = " now="
            r6.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r6.append(r4)
            java.lang.String r2 = " retry="
            r6.append(r2)
            int r2 = r3.A02()
            r6.append(r2)
            java.lang.String r2 = " offline="
            r6.append(r2)
            java.lang.Integer r2 = r3.A0G
            r6.append(r2)
            java.lang.String r2 = " edit="
            r6.append(r2)
            int r2 = r3.A01
            r6.append(r2)
            java.lang.String r2 = " stanzaAttrshash="
            r6.append(r2)
            java.lang.Integer r2 = r3.A0I
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r5 = r19
            X.0ve r6 = r5.A0I
            r4 = 12608(0x3140, float:1.7668E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r6, r4)
            if (r2 == 0) goto L_0x0079
            X.2rY r8 = r3.A06
            if (r8 == 0) goto L_0x0079
            X.1fv r7 = r5.A0U
            X.205 r2 = r3.A0B
            boolean r6 = r2.A02
            com.whatsapp.jid.UserJid r4 = r3.A05()
            com.whatsapp.jid.UserJid r2 = r3.A0f
            r7.A00(r4, r2, r8, r6)
        L_0x0079:
            com.whatsapp.jid.Jid r4 = r3.A0Z
            boolean r2 = X.C22971Dz.A0a(r4)
            if (r2 == 0) goto L_0x009e
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r0 + r6
            X.11P r2 = r5.A09
            long r6 = X.AnonymousClass11P.A01(r2)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x009e
            X.9r6 r2 = r3.A08
            if (r2 != 0) goto L_0x009e
            X.1N9 r2 = r5.A0P
            java.lang.String r1 = "status-old"
            r0 = 0
            r2.A0F(r3, r1, r0)
            return
        L_0x009e:
            boolean r2 = X.C22971Dz.A0V(r4)
            if (r2 == 0) goto L_0x0148
            X.1m3 r7 = r5.A0j
            android.os.Parcelable$Creator r2 = X.C29681ch.CREATOR
            boolean r2 = r4 instanceof X.C29681ch
            if (r2 == 0) goto L_0x0133
            X.1ch r4 = (X.C29681ch) r4
        L_0x00ae:
            X.C17960vV.A07(r4)
            r2 = 0
            X.C18070vi.A0d(r4, r2)
            java.lang.Class<X.34z> r5 = X.C688634z.class
            X.20F r2 = new X.20F
            r2.<init>(r5)
            java.util.HashMap r9 = r3.A0i
            java.lang.Object r8 = r9.get(r2)
            X.B5K r8 = (X.B5K) r8
            X.34z r8 = (X.C688634z) r8
            java.lang.String r6 = "NewsletterIncomingMessageManager/unsupported"
            if (r8 == 0) goto L_0x0143
            X.2lP r2 = r8.A02
            if (r2 == 0) goto L_0x00d2
            X.8cr r2 = r2.A00
            if (r2 != 0) goto L_0x0136
        L_0x00d2:
            X.00H r2 = r7.A08
            r2.get()
            int r5 = r3.A01
            r2 = 8
            if (r5 == r2) goto L_0x0136
            X.205 r2 = r3.A0B
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x0143
            java.lang.Class<X.AVt> r5 = X.C20713AVt.class
            X.20F r2 = new X.20F
            r2.<init>(r5)
            java.lang.Object r9 = r9.get(r2)
            X.B5K r9 = (X.B5K) r9
            X.AVt r9 = (X.C20713AVt) r9
            java.lang.String r5 = r3.A0R
            java.lang.String r2 = "reaction"
            boolean r2 = X.C18070vi.A18(r5, r2)
            if (r2 != 0) goto L_0x0113
            java.lang.String r5 = r3.A0R
            java.lang.String r2 = "poll"
            boolean r2 = X.C18070vi.A18(r5, r2)
            if (r2 == 0) goto L_0x0143
            if (r9 == 0) goto L_0x0131
            java.lang.String r5 = r9.A00
        L_0x010a:
            java.lang.String r2 = "vote"
            boolean r2 = X.C18070vi.A18(r5, r2)
            if (r2 == 0) goto L_0x0143
        L_0x0113:
            long r5 = r8.A00
            java.lang.String r2 = r8.A03
            r9 = r7
            r10 = r4
            r11 = r2
            r12 = r5
            r14 = r0
            r9.A01(r10, r11, r12, r14)
            java.util.Set r2 = r8.A04
            r8 = r4
            r9 = r2
            r10 = r5
            r12 = r0
            r7.A02(r8, r9, r10, r12)
            r0 = 0
            X.2nR r0 = r3.A07(r0)
            X.C35321m3.A00(r7, r0)
            return
        L_0x0131:
            r5 = 0
            goto L_0x010a
        L_0x0133:
            r4 = 0
            goto L_0x00ae
        L_0x0136:
            X.10s r2 = r7.A05
            r1 = 14
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r7, r3, r8, r1)
            r2.execute(r0)
            return
        L_0x0143:
            r0 = 0
            X.C17960vV.A0F(r0, r6)
            return
        L_0x0148:
            X.00H r2 = r5.A0m
            java.lang.Object r2 = r2.get()
            X.1HV r2 = (X.AnonymousClass1HV) r2
            X.0z4 r2 = r2.A01
            boolean r2 = r2.A2S()
            if (r2 == 0) goto L_0x039b
            X.1S2 r8 = r5.A0g
            r10 = 0
            X.1N7 r2 = r8.A02
            long r6 = r3.A04
            X.2tQ r6 = X.AnonymousClass1N7.A00(r2, r10, r6)
            if (r6 == 0) goto L_0x0169
            r2 = 7
            r6.A05(r2)
        L_0x0169:
            X.205 r11 = r3.A0B
            X.1BI r6 = r11.A00
            r2 = 0
            if (r6 == 0) goto L_0x0180
            boolean r6 = X.C22971Dz.A0e(r6)
            if (r6 == 0) goto L_0x018b
            boolean r6 = r11.A02
            if (r6 != 0) goto L_0x018b
            com.whatsapp.jid.UserJid r13 = r3.A05()
            if (r13 != 0) goto L_0x018c
        L_0x0180:
            X.205 r13 = r3.A0B
            if (r2 == 0) goto L_0x039b
            X.1BI r7 = r2.A01
            X.C18070vi.A0W(r7)
            monitor-enter(r8)
            goto L_0x01a0
        L_0x018b:
            r13 = r2
        L_0x018c:
            boolean r9 = r11.A02
            java.lang.String r7 = r11.A01
            X.1BI r6 = r11.A00
            if (r6 == 0) goto L_0x0393
            X.9uL r2 = new X.9uL
            r14 = r7
            r15 = r0
            r17 = r9
            r11 = r2
            r12 = r6
            r11.<init>(r12, r13, r14, r15, r17)
            goto L_0x0180
        L_0x01a0:
            java.util.Set r6 = r8.A00     // Catch:{ all -> 0x0390 }
            if (r6 != 0) goto L_0x0232
            X.1Rs r14 = r8.A01     // Catch:{ all -> 0x0390 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0390 }
            r12.<init>()     // Catch:{ all -> 0x0390 }
            X.1Oq r6 = r14.A00     // Catch:{ all -> 0x0390 }
            X.1at r16 = r6.get()     // Catch:{ all -> 0x0390 }
            r6 = r16
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x021f }
            X.1Ev r15 = r6.A02     // Catch:{ all -> 0x021f }
            java.lang.String r11 = "SELECT mutation_index, chat_jid FROM syncd_mutations WHERE chat_jid IS NOT NULL  AND are_dependencies_missing = 1"
            java.lang.String r9 = "SyncdMutationsTable.SELECT_ALL_CHAT_JIDS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            r6 = 0
            android.database.Cursor r11 = r15.A0A(r11, r9, r6)     // Catch:{ all -> 0x021f }
        L_0x01c0:
            boolean r6 = r11.moveToNext()     // Catch:{ all -> 0x0213 }
            if (r6 == 0) goto L_0x020f
            java.lang.String r6 = "mutation_index"
            int r6 = r11.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0213 }
            java.lang.String r9 = r11.getString(r6)     // Catch:{ all -> 0x0213 }
            X.00H r6 = r14.A01     // Catch:{ all -> 0x0213 }
            java.lang.Object r15 = r6.get()     // Catch:{ all -> 0x0213 }
            X.2lN r15 = (X.C58862lN) r15     // Catch:{ all -> 0x0213 }
            java.lang.String r6 = X.A4M.A00(r9)     // Catch:{ all -> 0x0213 }
            X.C18070vi.A0d(r6, r10)     // Catch:{ all -> 0x0213 }
            X.2nY r6 = r15.A00(r6)     // Catch:{ all -> 0x0213 }
            if (r6 == 0) goto L_0x01c0
            boolean r6 = r6.A0J()     // Catch:{ all -> 0x0213 }
            if (r6 == 0) goto L_0x01c0
            X.C18070vi.A0d(r9, r10)     // Catch:{ all -> 0x0213 }
            java.lang.String r6 = X.A4M.A00(r9)     // Catch:{ all -> 0x0213 }
            boolean r6 = X.AnonymousClass2T1.A00(r6)     // Catch:{ all -> 0x0213 }
            if (r6 == 0) goto L_0x01c0
            java.lang.String r6 = "chat_jid"
            int r6 = r11.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0213 }
            java.lang.String r9 = r11.getString(r6)     // Catch:{ all -> 0x0213 }
            X.1Dv r6 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0213 }
            X.1BI r6 = r6.A02(r9)     // Catch:{ all -> 0x0213 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0213 }
            r12.add(r6)     // Catch:{ all -> 0x0213 }
            goto L_0x01c0
        L_0x020f:
            r11.close()     // Catch:{ all -> 0x021f }
            goto L_0x0229
        L_0x0213:
            r1 = move-exception
            if (r11 == 0) goto L_0x021e
            r11.close()     // Catch:{ all -> 0x021a }
            goto L_0x021e
        L_0x021a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x021f }
        L_0x021e:
            throw r1     // Catch:{ all -> 0x021f }
        L_0x021f:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0224 }
            goto L_0x0228
        L_0x0224:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0390 }
        L_0x0228:
            throw r1     // Catch:{ all -> 0x0390 }
        L_0x0229:
            r16.close()     // Catch:{ all -> 0x0390 }
            java.util.Set r6 = X.C29431cG.A11(r12)     // Catch:{ all -> 0x0390 }
            r8.A00 = r6     // Catch:{ all -> 0x0390 }
        L_0x0232:
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0390 }
            monitor-exit(r8)
            if (r6 == 0) goto L_0x039b
            X.1Rs r12 = r8.A01
            r6 = 1
            java.lang.String[] r14 = new java.lang.String[r6]
            java.lang.String r6 = r7.getRawString()
            r14[r10] = r6
            java.lang.String r9 = "SyncdMutationsTable.SELECT_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r7 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.1Oq r6 = r12.A00
            X.1at r11 = r6.get()
            r6 = r11
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x0386 }
            X.1Ev r6 = r6.A02     // Catch:{ all -> 0x0386 }
            android.database.Cursor r9 = r6.A0A(r7, r9, r14)     // Catch:{ all -> 0x0386 }
        L_0x025c:
            boolean r6 = r9.moveToNext()     // Catch:{ all -> 0x037a }
            if (r6 == 0) goto L_0x0290
            java.lang.String r6 = "mutation_index"
            int r6 = r9.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x037a }
            java.lang.String r7 = r9.getString(r6)     // Catch:{ all -> 0x037a }
            X.C18070vi.A0d(r7, r10)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = X.A4M.A00(r7)     // Catch:{ all -> 0x037a }
            boolean r6 = X.AnonymousClass2T1.A00(r6)     // Catch:{ all -> 0x037a }
            if (r6 != 0) goto L_0x0286
            java.lang.String r7 = X.A4M.A00(r7)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = "star"
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x037a }
            if (r6 == 0) goto L_0x025c
        L_0x0286:
            X.A8l r6 = X.C26331Rs.A01(r9, r12)     // Catch:{ all -> 0x037a }
            if (r6 == 0) goto L_0x025c
            r8.add(r6)     // Catch:{ all -> 0x037a }
            goto L_0x025c
        L_0x0290:
            r9.close()     // Catch:{ all -> 0x0386 }
            r11.close()
            java.util.Iterator r9 = r8.iterator()
        L_0x029a:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0376
            java.lang.Object r7 = r9.next()
            X.A8l r7 = (X.C20126A8l) r7
            boolean r6 = r7 instanceof X.C170488pw
            if (r6 == 0) goto L_0x029a
            X.8px r7 = (X.C170498px) r7
            X.205 r6 = r7.A01
            boolean r6 = X.C18070vi.A18(r6, r13)
            if (r6 == 0) goto L_0x029a
            r19 = 1
        L_0x02b6:
            java.util.Iterator r18 = r8.iterator()
        L_0x02ba:
            boolean r6 = r18.hasNext()
            if (r6 == 0) goto L_0x039b
            java.lang.Object r7 = r18.next()
            X.A8l r7 = (X.C20126A8l) r7
            boolean r15 = r7 instanceof X.C170518pz
            r11 = 1
            if (r15 != 0) goto L_0x030d
            boolean r6 = r7 instanceof X.C170508py
            if (r6 != 0) goto L_0x030d
            boolean r6 = r7 instanceof X.C170478pv
            if (r6 == 0) goto L_0x02ba
            r6 = r7
            X.8px r6 = (X.C170498px) r6
            X.205 r6 = r6.A01
            boolean r6 = X.C18070vi.A18(r6, r13)
            if (r6 == 0) goto L_0x02ba
            r7.A0C(r10)
            java.util.Set r0 = java.util.Collections.singleton(r7)
            X.C18070vi.A0X(r0)
            r12.A0J(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted deleteForMeMutation: deletedId = "
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
        L_0x02fa:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1PT r1 = r5.A0S
            r0 = 0
            r1.A0I(r3, r0, r11)
            X.1N9 r0 = r5.A0P
            r0.A0D(r3)
            return
        L_0x030d:
            r6 = r7
            X.8q2 r6 = (X.AnonymousClass8q2) r6
            X.A7L r14 = r6.A00
            if (r15 == 0) goto L_0x031c
            X.8pz r7 = (X.C170518pz) r7
            boolean r6 = r7.A01
            if (r6 != 0) goto L_0x031c
            if (r19 != 0) goto L_0x02ba
        L_0x031c:
            long r8 = r2.A00
            long r6 = r14.A00
            int r16 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0349
            java.lang.String r16 = "MessageRangeUtil/isKeyEnclosedByRange enclosed by the range"
            com.whatsapp.util.Log.i((java.lang.String) r16)
            long r16 = X.AnonymousClass9QP.A00(r6, r8)
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 >= 0) goto L_0x0349
        L_0x0331:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted: deletedId = "
            r1.append(r0)
            java.lang.String r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = "; isClearChat="
            r1.append(r0)
            r1.append(r15)
            goto L_0x02fa
        L_0x0349:
            java.util.Set r6 = r14.A02
            boolean r7 = r6.contains(r2)
            java.util.Set r6 = r14.A03
            boolean r6 = r6.contains(r2)
            if (r7 != 0) goto L_0x0359
            if (r6 == 0) goto L_0x02ba
        L_0x0359:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageRangeUtil/isKeyEnclosedByRange messageRangeContains:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " messagesWithoutTimestampContains:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0331
        L_0x0376:
            r19 = 0
            goto L_0x02b6
        L_0x037a:
            r1 = move-exception
            if (r9 == 0) goto L_0x0385
            r9.close()     // Catch:{ all -> 0x0381 }
            goto L_0x0385
        L_0x0381:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0386 }
        L_0x0385:
            throw r1     // Catch:{ all -> 0x0386 }
        L_0x0386:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x038b }
            throw r1
        L_0x038b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0390:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0393:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x039b:
            java.lang.Class<X.34n> r2 = X.C687434n.class
            X.B5K r2 = r3.A06(r2)
            if (r2 == 0) goto L_0x03af
            X.1ks r2 = r5.A0V
            r1 = 3
            X.7Pk r0 = new X.7Pk
            r0.<init>(r5, r3, r1)
            r2.A00(r0)
            return
        L_0x03af:
            com.whatsapp.jid.Jid r6 = r3.A0Y
            boolean r7 = r6 instanceof X.C47712Jo
            if (r7 == 0) goto L_0x0419
            boolean r2 = X.C62832s4.A01(r6)
        L_0x03b9:
            if (r2 == 0) goto L_0x041e
            if (r7 == 0) goto L_0x0412
            boolean r2 = X.C62832s4.A00(r4)
        L_0x03c1:
            if (r2 == 0) goto L_0x041e
            X.1PT r8 = r5.A0S
            r7 = 12
            boolean r2 = X.C22971Dz.A0a(r4)
            if (r2 == 0) goto L_0x03eb
            r2 = 72
        L_0x03cf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x03d3:
            r8.A0I(r3, r2, r7)
            X.1N9 r4 = r5.A0P
            r2 = 493(0x1ed, float:6.91E-43)
            r4.A0E(r3, r2)
            X.122 r5 = r5.A0B
            X.205 r7 = r3.A0B
            X.1BI r6 = X.C22971Dz.A00(r6)
            r8 = r2
            r9 = r0
            r5.BBO(r6, r7, r8, r9)
            return
        L_0x03eb:
            boolean r2 = X.C22971Dz.A0e(r4)
            if (r2 == 0) goto L_0x03f4
            r2 = 73
            goto L_0x03cf
        L_0x03f4:
            boolean r2 = X.C22971Dz.A0O(r6)
            if (r2 == 0) goto L_0x03fd
            r2 = 74
            goto L_0x03cf
        L_0x03fd:
            boolean r2 = X.C22971Dz.A00
            if (r2 == 0) goto L_0x040b
            int r4 = r4.getType()
            r2 = 6
            if (r4 != r2) goto L_0x0410
        L_0x0408:
            r2 = 75
            goto L_0x03cf
        L_0x040b:
            boolean r2 = r4 instanceof X.C173408v1
            if (r2 == 0) goto L_0x0410
            goto L_0x0408
        L_0x0410:
            r2 = 0
            goto L_0x03d3
        L_0x0412:
            if (r6 == 0) goto L_0x041e
            boolean r2 = X.C62832s4.A00(r6)
            goto L_0x03c1
        L_0x0419:
            boolean r2 = X.C62832s4.A01(r4)
            goto L_0x03b9
        L_0x041e:
            int r0 = r3.A02()
            if (r0 != 0) goto L_0x044f
            java.lang.String r1 = r3.A0O
            if (r1 == 0) goto L_0x044f
            X.1MR r0 = r5.A0H
            X.1MQ r2 = r0.A03
            java.lang.String r0 = r2.A08
            if (r0 != 0) goto L_0x043d
            monitor-enter(r2)
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x043a }
            if (r0 != 0) goto L_0x0438
            r2.A06()     // Catch:{ all -> 0x043a }
        L_0x0438:
            monitor-exit(r2)     // Catch:{ all -> 0x043a }
            goto L_0x043d
        L_0x043a:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x043a }
            throw r1
        L_0x043d:
            java.lang.String r0 = r2.A08
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x044f
            X.18K r1 = r5.A0J
            X.2EU r0 = new X.2EU
            r0.<init>()
            r1.CC7(r0)
        L_0x044f:
            X.205 r0 = r3.A0B
            X.1BI r1 = r0.A00
            java.lang.Class<X.34v> r0 = X.C688234v.class
            X.B5K r0 = r3.A06(r0)
            X.34v r0 = (X.C688234v) r0
            if (r0 == 0) goto L_0x04a3
            X.1ya r8 = r0.A00
        L_0x045f:
            java.lang.Class<X.34x> r0 = X.C688434x.class
            X.B5K r9 = r3.A06(r0)
            X.34x r9 = (X.C688434x) r9
            if (r1 == 0) goto L_0x0483
            X.1NK r0 = r5.A0E
            boolean r0 = r0.A09(r1)
            if (r0 != 0) goto L_0x0483
            if (r8 == 0) goto L_0x0483
            int r0 = r8.actualActors
            if (r0 != 0) goto L_0x048b
            long r6 = r8.privacyModeTs
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x048b
            int r0 = r8.hostStorage
            if (r0 != 0) goto L_0x048b
        L_0x0483:
            java.util.Set r4 = r5.A0e
            monitor-enter(r4)
            r6 = r20
            if (r20 == 0) goto L_0x04ae
            goto L_0x04a5
        L_0x048b:
            if (r9 == 0) goto L_0x049d
            byte[] r4 = r9.A02
            if (r4 == 0) goto L_0x049d
            X.1PM r2 = r5.A07
            com.whatsapp.jid.UserJid r1 = r3.A05()
            int r0 = r9.A00
            r2.A06(r1, r8, r4, r0)
            goto L_0x0483
        L_0x049d:
            java.lang.String r0 = "MessagingXmppHandler/Missing vname cert"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0483
        L_0x04a3:
            r8 = 0
            goto L_0x045f
        L_0x04a5:
            boolean r0 = r4.contains(r6)     // Catch:{ all -> 0x0507 }
            if (r0 != 0) goto L_0x04da
            r4.add(r6)     // Catch:{ all -> 0x0507 }
        L_0x04ae:
            int r0 = r5.A00     // Catch:{ all -> 0x0507 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0507 }
            X.1N7 r7 = r5.A0R     // Catch:{ all -> 0x0507 }
            long r0 = r3.A04     // Catch:{ all -> 0x0507 }
            r2 = 0
            X.2tQ r2 = X.AnonymousClass1N7.A00(r7, r2, r0)     // Catch:{ all -> 0x0507 }
            X.8vJ r2 = (X.C173578vJ) r2     // Catch:{ all -> 0x0507 }
            if (r2 == 0) goto L_0x04cc
            int r0 = r5.A00     // Catch:{ all -> 0x0507 }
            int r0 = r0 + -1
            long r0 = (long) r0     // Catch:{ all -> 0x0507 }
            r2.A01 = r0     // Catch:{ all -> 0x0507 }
            r0 = 2
            r2.A05(r0)     // Catch:{ all -> 0x0507 }
        L_0x04cc:
            X.1ks r2 = r5.A0V     // Catch:{ all -> 0x0507 }
            r1 = 20
            X.3C5 r0 = new X.3C5     // Catch:{ all -> 0x0507 }
            r0.<init>(r5, r3, r6, r1)     // Catch:{ all -> 0x0507 }
            r2.A00(r0)     // Catch:{ all -> 0x0507 }
        L_0x04d8:
            monitor-exit(r4)     // Catch:{ all -> 0x0507 }
            goto L_0x0506
        L_0x04da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0507 }
            r1.<init>()     // Catch:{ all -> 0x0507 }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe message in queue; skipping id:"
            r1.append(r0)     // Catch:{ all -> 0x0507 }
            java.lang.String r0 = "id"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0507 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0507 }
            r1.append(r0)     // Catch:{ all -> 0x0507 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0507 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0507 }
            X.1PT r2 = r5.A0S     // Catch:{ all -> 0x0507 }
            r1 = 16
            r0 = 0
            r2.A0I(r3, r0, r1)     // Catch:{ all -> 0x0507 }
            X.1N7 r2 = r5.A0R     // Catch:{ all -> 0x0507 }
            long r0 = r3.A04     // Catch:{ all -> 0x0507 }
            r2.A03(r0)     // Catch:{ all -> 0x0507 }
            goto L_0x04d8
        L_0x0506:
            return
        L_0x0507:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0507 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35331m4.A04(X.2sw, X.1m4, java.util.Map):void");
    }

    public int[] BSG() {
        return new int[]{264, 0, 262, 19, 86, 16, 15, 215, 227, 259};
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r25v5, types: [X.3CN] */
    /* JADX WARNING: type inference failed for: r21v9, types: [X.3C3] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0532, code lost:
        if (r10 == 8) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0693, code lost:
        if (r10 == 3) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x07f5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        X.CDX.A00(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07f9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07fc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        X.CDX.A00(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0800, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x08d8 A[Catch:{ Exception -> 0x09aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x08fa A[Catch:{ Exception -> 0x09aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0923 A[Catch:{ Exception -> 0x09aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x092a A[Catch:{ Exception -> 0x09aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0978 A[Catch:{ Exception -> 0x09aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BcT(android.os.Message r35, int r36) {
        /*
            r34 = this;
            r16 = 1
            r0 = r34
            r5 = r35
            r3 = r36
            if (r36 == 0) goto L_0x09dd
            r2 = 19
            java.lang.String r4 = "msgid"
            r1 = 0
            if (r3 == r2) goto L_0x038a
            r2 = 86
            if (r3 == r2) goto L_0x0382
            r2 = 215(0xd7, float:3.01E-43)
            if (r3 == r2) goto L_0x0375
            r2 = 227(0xe3, float:3.18E-43)
            if (r3 == r2) goto L_0x02fb
            r2 = 259(0x103, float:3.63E-43)
            if (r3 == r2) goto L_0x0294
            r2 = 262(0x106, float:3.67E-43)
            if (r3 == r2) goto L_0x0282
            r2 = 264(0x108, float:3.7E-43)
            if (r3 == r2) goto L_0x0278
            r2 = 15
            if (r3 == r2) goto L_0x022f
            r2 = 16
            if (r3 == r2) goto L_0x0032
            return r1
        L_0x0032:
            java.lang.Object r2 = r5.obj
            X.2fg r2 = (X.C55382fg) r2
            X.205 r5 = r2.A03
            com.whatsapp.jid.DeviceJid r11 = r2.A01
            com.whatsapp.jid.DeviceJid r7 = r2.A02
            int r4 = r2.A00
            java.lang.String r6 = r2.A04
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessagingXmppHandler/onMessageError; key="
            r3.append(r2)
            r3.append(r5)
            java.lang.String r9 = "; participant="
            r3.append(r9)
            r3.append(r11)
            java.lang.String r8 = "; remoteJid="
            r3.append(r8)
            r3.append(r7)
            java.lang.String r2 = "; error="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "; phash="
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1O2 r10 = r0.A0N
            java.util.Map r6 = r10.A03
            monitor-enter(r6)
            java.lang.Object r2 = r6.get(r5)     // Catch:{ all -> 0x022c }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x022c }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r3 = r2.second     // Catch:{ all -> 0x022c }
            X.206 r3 = (X.AnonymousClass206) r3     // Catch:{ all -> 0x022c }
            monitor-exit(r6)     // Catch:{ all -> 0x022c }
            if (r3 == 0) goto L_0x0091
            r2 = 14
            goto L_0x008e
        L_0x008b:
            monitor-exit(r6)     // Catch:{ all -> 0x022c }
            r3 = 0
            goto L_0x0091
        L_0x008e:
            r0.A02(r3, r5, r2, r4)     // Catch:{ Exception -> 0x0985 }
        L_0x0091:
            r10.A04(r7, r5)     // Catch:{ Exception -> 0x0985 }
            X.1BI r6 = r5.A00     // Catch:{ Exception -> 0x0985 }
            boolean r12 = X.C22971Dz.A0e(r6)     // Catch:{ Exception -> 0x0985 }
            r10 = 7
            if (r12 == 0) goto L_0x00ec
            r2 = 401(0x191, float:5.62E-43)
            if (r4 != r2) goto L_0x00ec
            X.122 r14 = r0.A0B     // Catch:{ Exception -> 0x0985 }
            X.1PQ r12 = r0.A0X     // Catch:{ Exception -> 0x0985 }
            X.11P r1 = r0.A09     // Catch:{ Exception -> 0x0985 }
            long r1 = X.AnonymousClass11P.A01(r1)     // Catch:{ Exception -> 0x0985 }
            X.1PP r13 = r12.A02     // Catch:{ Exception -> 0x0985 }
            r12 = r16
            X.205 r15 = r13.A01(r6, r12)     // Catch:{ Exception -> 0x0985 }
            r13 = 8
            X.2Mh r12 = new X.2Mh     // Catch:{ Exception -> 0x0985 }
            r12.<init>(r15, r13, r1)     // Catch:{ Exception -> 0x0985 }
            r14.BBM(r12)     // Catch:{ Exception -> 0x0985 }
            r0.A01(r3, r5, r10)     // Catch:{ Exception -> 0x0985 }
            X.1MZ r2 = r0.A0C     // Catch:{ Exception -> 0x0985 }
            r1 = r6
            X.1EC r1 = (X.AnonymousClass1EC) r1     // Catch:{ Exception -> 0x0985 }
            boolean r1 = r2.A0J(r1)     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x020b
            X.126 r10 = r0.A0K     // Catch:{ Exception -> 0x0985 }
            android.os.Parcelable$Creator r1 = X.AnonymousClass1EC.CREATOR     // Catch:{ Exception -> 0x0985 }
            X.1EC r2 = X.C42941yz.A00(r6)     // Catch:{ Exception -> 0x0985 }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x0985 }
            X.11S r1 = r0.A04     // Catch:{ Exception -> 0x0985 }
            r1.A0I()     // Catch:{ Exception -> 0x0985 }
            X.1E8 r1 = r1.A0D     // Catch:{ Exception -> 0x0985 }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x0985 }
            X.1BI r1 = r1.A0J     // Catch:{ Exception -> 0x0985 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ Exception -> 0x0985 }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x0985 }
            r10.A0a(r2, r1)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x00ec:
            r2 = 405(0x195, float:5.68E-43)
            if (r4 == r2) goto L_0x01f8
            if (r12 != 0) goto L_0x00f8
            r2 = 403(0x193, float:5.65E-43)
            if (r4 != r2) goto L_0x0108
            goto L_0x01fc
        L_0x00f8:
            r2 = 420(0x1a4, float:5.89E-43)
            if (r4 != r2) goto L_0x00fe
            goto L_0x01e5
        L_0x00fe:
            r2 = 460(0x1cc, float:6.45E-43)
            if (r4 == r2) goto L_0x01d2
            r2 = 421(0x1a5, float:5.9E-43)
            if (r4 != r2) goto L_0x0108
            goto L_0x01d2
        L_0x0108:
            if (r3 == 0) goto L_0x014e
            X.AW0 r2 = X.AnonymousClass25B.A00(r3)     // Catch:{ Exception -> 0x0985 }
            if (r2 == 0) goto L_0x014e
            int r24 = r3.A0D()     // Catch:{ Exception -> 0x0985 }
            r0.A01(r3, r5, r10)     // Catch:{ Exception -> 0x0985 }
            boolean r10 = r2.A0K()     // Catch:{ Exception -> 0x0985 }
            r21 = 406(0x196, float:5.69E-43)
            if (r10 == 0) goto L_0x0121
            r21 = 13
        L_0x0121:
            X.11P r10 = r0.A09     // Catch:{ Exception -> 0x0985 }
            long r18 = X.AnonymousClass11P.A01(r10)     // Catch:{ Exception -> 0x0985 }
            java.lang.String r10 = r2.A0H     // Catch:{ Exception -> 0x0985 }
            java.lang.String r22 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x0985 }
            r23 = 0
            r17 = r2
            r20 = r10
            r17.A06(r18, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0985 }
            X.1QS r10 = r0.A0T     // Catch:{ Exception -> 0x0985 }
            X.AnonymousClass1QS.A00(r10)     // Catch:{ Exception -> 0x0985 }
            X.1QR r12 = r10.A04     // Catch:{ Exception -> 0x0985 }
            X.205 r10 = r3.A0v     // Catch:{ Exception -> 0x0985 }
            r26 = 0
            r21 = r12
            r22 = r2
            r23 = r10
            r25 = r1
            r21.A0f(r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x014e:
            boolean r1 = r3 instanceof X.AnonymousClass21L     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x0184
            r1 = 473(0x1d9, float:6.63E-43)
            if (r4 != r1) goto L_0x0184
            X.1l7 r12 = r0.A08     // Catch:{ Exception -> 0x0985 }
            r2 = r3
            X.21L r2 = (X.AnonymousClass21L) r2     // Catch:{ Exception -> 0x0985 }
            java.lang.String r1 = "review_and_pay"
            boolean r1 = r12.A04(r2, r1)     // Catch:{ Exception -> 0x0985 }
            if (r1 != 0) goto L_0x01f8
            java.lang.String r1 = "review_and_pay_v2"
            boolean r1 = r12.A04(r2, r1)     // Catch:{ Exception -> 0x0985 }
            if (r1 != 0) goto L_0x01f8
            java.lang.String r1 = "review_order"
            boolean r1 = r12.A04(r2, r1)     // Catch:{ Exception -> 0x0985 }
            if (r1 != 0) goto L_0x01f8
            java.lang.String r1 = "payment_method"
            boolean r1 = r12.A04(r2, r1)     // Catch:{ Exception -> 0x0985 }
            if (r1 != 0) goto L_0x01f8
            java.lang.String r1 = "payment_status"
            boolean r1 = r12.A04(r2, r1)     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x020b
            goto L_0x01f8
        L_0x0184:
            boolean r1 = X.C22971Dz.A0V(r6)     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x019f
            X.00H r1 = r0.A0c     // Catch:{ Exception -> 0x0985 }
            java.lang.Object r12 = r1.get()     // Catch:{ Exception -> 0x0985 }
            X.2gQ r12 = (X.C55822gQ) r12     // Catch:{ Exception -> 0x0985 }
            X.10I r10 = r12.A01     // Catch:{ Exception -> 0x0985 }
            r2 = 26
            X.3Cu r1 = new X.3Cu     // Catch:{ Exception -> 0x0985 }
            r1.<init>(r12, r4, r2, r5)     // Catch:{ Exception -> 0x0985 }
            r10.CGF(r1)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x019f:
            X.0zA r2 = r0.A02     // Catch:{ Exception -> 0x0985 }
            boolean r1 = r2.A07()     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x01b4
            r1 = 430(0x1ae, float:6.03E-43)
            if (r4 == r1) goto L_0x0220
            r1 = 432(0x1b0, float:6.05E-43)
            if (r4 == r1) goto L_0x0220
            r1 = 433(0x1b1, float:6.07E-43)
            if (r4 != r1) goto L_0x01b4
            goto L_0x0220
        L_0x01b4:
            boolean r1 = X.C22971Dz.A0S(r6)     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x01cc
            X.1kr r2 = r0.A0M     // Catch:{ Exception -> 0x0985 }
            X.1OX r12 = r2.A05     // Catch:{ Exception -> 0x0985 }
            r1 = 0
            com.whatsapp.interop.integrator.IntegratorManager$refreshIntegratorsAfterError$1 r10 = new com.whatsapp.interop.integrator.IntegratorManager$refreshIntegratorsAfterError$1     // Catch:{ Exception -> 0x0985 }
            r10.<init>(r2, r1)     // Catch:{ Exception -> 0x0985 }
            X.1OR r2 = X.AnonymousClass1OR.A00     // Catch:{ Exception -> 0x0985 }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x0985 }
            X.C30451dy.A02(r1, r2, r10, r12)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x01cc:
            r1 = 20
            r0.A01(r3, r5, r1)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x01d2:
            r1 = 21
            r0.A01(r3, r5, r1)     // Catch:{ Exception -> 0x0985 }
            X.12M r12 = r0.A0L     // Catch:{ Exception -> 0x0985 }
            r10 = r6
            X.1EC r10 = (X.AnonymousClass1EC) r10     // Catch:{ Exception -> 0x0985 }
            java.lang.String r2 = "send_failure"
            r1 = r16
            r12.A0H(r10, r2, r1)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x01e5:
            X.122 r13 = r0.A0B     // Catch:{ Exception -> 0x0985 }
            X.1PQ r14 = r0.A0X     // Catch:{ Exception -> 0x0985 }
            X.11P r1 = r0.A09     // Catch:{ Exception -> 0x0985 }
            long r1 = X.AnonymousClass11P.A01(r1)     // Catch:{ Exception -> 0x0985 }
            r12 = 33
            X.20i r1 = r14.A02(r6, r12, r1)     // Catch:{ Exception -> 0x0985 }
            r13.BBM(r1)     // Catch:{ Exception -> 0x0985 }
        L_0x01f8:
            r0.A01(r3, r5, r10)     // Catch:{ Exception -> 0x0985 }
            goto L_0x020b
        L_0x01fc:
            r0.A01(r3, r5, r10)     // Catch:{ Exception -> 0x0985 }
            X.00H r1 = r0.A0a     // Catch:{ Exception -> 0x0985 }
            java.lang.Object r2 = r1.get()     // Catch:{ Exception -> 0x0985 }
            X.1pj r2 = (X.C37551pj) r2     // Catch:{ Exception -> 0x0985 }
            r1 = 0
            r2.A0L(r1)     // Catch:{ Exception -> 0x0985 }
        L_0x020b:
            X.0zA r2 = r0.A01     // Catch:{ Exception -> 0x0985 }
            boolean r1 = r2.A07()     // Catch:{ Exception -> 0x0985 }
            if (r1 == 0) goto L_0x09a9
            if (r6 == 0) goto L_0x09a9
            r2.A03()     // Catch:{ Exception -> 0x0985 }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0985 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0985 }
            goto L_0x022b
        L_0x0220:
            r2.A03()     // Catch:{ Exception -> 0x0985 }
            java.lang.String r1 = "setReceivedCertRelatedNack"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0985 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0985 }
        L_0x022b:
            throw r2     // Catch:{ Exception -> 0x0985 }
        L_0x022c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x022c }
            throw r0
        L_0x022f:
            java.lang.Object r1 = r5.obj
            X.2ck r1 = (X.C53572ck) r1
            X.1kx r5 = r0.A0i
            X.2lo r4 = r1.A01
            int r3 = r1.A00
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "OfflineResumeManager/onOfflineCompleteReceived count="
            r2.append(r0)
            r2.append(r3)
            r0 = 32
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " runningOfflineCompletes="
            r2.append(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A07
            int r0 = r1.get()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.incrementAndGet()
            X.1ks r2 = r5.A05
            r1 = 22
            X.3Cu r0 = new X.3Cu
            r0.<init>(r5, r3, r1, r4)
            r2.A00(r0)
            X.3Dv r0 = X.C71113Dv.A00
            r5.notifyAllObservers(r0)
            return r16
        L_0x0278:
            java.lang.Object r2 = r5.obj
            r1 = 2
            X.7Pk r3 = new X.7Pk
            r3.<init>(r0, r2, r1)
            goto L_0x09ea
        L_0x0282:
            java.lang.Object r3 = r5.obj
            X.3M9 r3 = (X.AnonymousClass3M9) r3
            X.00H r0 = r0.A0l
            java.lang.Object r2 = r0.get()
            X.2rG r2 = (X.C62352rG) r2
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.A01(r3, r0)
            return r16
        L_0x0294:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = "callCount"
            int r7 = r2.getInt(r1)
            java.lang.String r1 = "statusCount"
            int r6 = r2.getInt(r1)
            java.lang.String r1 = "messageCount"
            int r5 = r2.getInt(r1)
            java.lang.String r1 = "receiptCount"
            int r4 = r2.getInt(r1)
            java.lang.String r1 = "notificationCount"
            int r3 = r2.getInt(r1)
            X.1kx r2 = r0.A0i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OfflineResumeManager/onOfflinePreviewReceived "
            r1.append(r0)
            r1.append(r5)
            r0 = 47
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A06
            r0.set(r5)
            int r5 = r5 + r4
            int r5 = r5 + r7
            int r5 = r5 + r3
            r1 = 0
            X.AWf r0 = new X.AWf
            r0.<init>(r5, r6, r1)
            r2.notifyAllObservers(r0)
            X.1ks r3 = r2.A05
            X.1ft r2 = r2.A03
            r1 = 21
            X.3Bs r0 = new X.3Bs
            r0.<init>(r2, r1)
            r3.A00(r0)
            return r16
        L_0x02fb:
            java.lang.Object r3 = r5.obj
            X.1ca r3 = (X.C29621ca) r3
            java.lang.String r9 = "readreceipts"
            r2 = 0
            java.lang.String r3 = r3.A0Q(r9, r2)
            java.lang.String r2 = "all"
            boolean r8 = r2.equals(r3)
            java.lang.String r7 = "none"
            if (r8 != 0) goto L_0x032b
            boolean r2 = r7.equals(r3)
            if (r2 != 0) goto L_0x032b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onSyncPrivacySetting unknown readreceipts setting: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r16
        L_0x032b:
            X.0z4 r6 = r0.A0A
            boolean r5 = r6.A2U()
            if (r8 == r5) goto L_0x09a9
            X.190 r4 = r0.A03
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "server="
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = "; client="
            r3.append(r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = "readReceipt-setting-inconsistency"
            r4.A0G(r2, r3, r1)
            if (r5 == 0) goto L_0x036f
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r6)
            java.lang.String r1 = "read_receipts_enabled"
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r1, r8)
            r1.apply()
            X.1Rl r2 = r0.A05
            r1 = 3
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return r16
        L_0x036f:
            X.1Rl r0 = r0.A05
            r0.A03(r9, r7)
            return r16
        L_0x0375:
            X.1go r3 = r0.A0k
            int r2 = r5.arg2
            r0 = r16
            if (r2 != r0) goto L_0x037e
            r1 = 1
        L_0x037e:
            r3.A01(r1)
            return r16
        L_0x0382:
            java.lang.Object r0 = r5.obj
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            r0.getString(r4)
            return r16
        L_0x038a:
            android.os.Bundle r3 = r5.getData()
            java.lang.String r2 = "edit"
            java.lang.String r3 = r3.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x04ce
            r10 = 0
        L_0x039b:
            android.os.Bundle r3 = r5.getData()
            java.lang.String r2 = "remote_chat_jid"
            java.lang.String r3 = r3.getString(r2)
            X.1Dv r2 = X.AnonymousClass1BI.A00
            X.1BI r3 = r2.A02(r3)
            r2 = 8
            if (r10 == r2) goto L_0x03b0
            r1 = 1
        L_0x03b0:
            android.os.Bundle r2 = r5.getData()
            java.lang.String r2 = r2.getString(r4)
            X.205 r6 = new X.205
            r6.<init>(r3, r2, r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "participant"
            java.lang.String r1 = r2.getString(r1)
            X.1Dt r3 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r18 = r3.A02(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "remoteJid"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r17 = r3.A02(r1)
            r1 = r17
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            r17 = r1
            android.os.Bundle r2 = r5.getData()
            java.lang.String r25 = "phash"
            r1 = r25
            java.lang.String r9 = r2.getString(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "counter_abuse_token"
            java.lang.String r24 = r2.getString(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "count"
            int r23 = r2.getInt(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "timestamp"
            long r3 = r2.getLong(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "smid"
            long r1 = r2.getLong(r1)
            android.os.Bundle r7 = r5.getData()
            java.lang.String r5 = "addressing_mode"
            java.lang.String r22 = r7.getString(r5)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = "MessagingXmppHandler/onMessageReceivedByServer; key="
            r13.append(r5)
            r13.append(r6)
            java.lang.String r20 = "; participant="
            r5 = r20
            r13.append(r5)
            r5 = r18
            r13.append(r5)
            java.lang.String r19 = "; remoteJid="
            r5 = r19
            r13.append(r5)
            r5 = r17
            r13.append(r5)
            java.lang.String r12 = "; serverParticipantHash="
            r13.append(r12)
            r13.append(r9)
            java.lang.String r11 = "; recipientCount="
            r13.append(r11)
            r5 = r23
            r13.append(r5)
            java.lang.String r8 = "; counterAbuseToken="
            r13.append(r8)
            r5 = r24
            r13.append(r5)
            java.lang.String r7 = "; edit="
            r13.append(r7)
            r13.append(r10)
            java.lang.String r5 = "; timestamp="
            r13.append(r5)
            r13.append(r3)
            java.lang.String r14 = "; smid="
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r13)
            if (r18 == 0) goto L_0x04d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onMessageReceivedByServer message received by server ignored; key="
            r1.append(r0)
            r1.append(r6)
            r0 = r20
            r1.append(r0)
            r0 = r18
            r1.append(r0)
            r0 = r19
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            r1.append(r12)
            r1.append(r9)
            r1.append(r11)
            r0 = r23
            r1.append(r0)
            r1.append(r8)
            r0 = r24
            r1.append(r0)
            r1.append(r7)
            r1.append(r10)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r16
        L_0x04ce:
            int r10 = java.lang.Integer.parseInt(r3)
            goto L_0x039b
        L_0x04d4:
            X.1O2 r12 = r0.A0N
            java.util.Map r7 = r12.A03
            monitor-enter(r7)
            java.lang.Object r5 = r7.get(r6)     // Catch:{ all -> 0x09da }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x09da }
            if (r5 == 0) goto L_0x04e7
            java.lang.Object r5 = r5.second     // Catch:{ all -> 0x09da }
            X.206 r5 = (X.AnonymousClass206) r5     // Catch:{ all -> 0x09da }
            monitor-exit(r7)     // Catch:{ all -> 0x09da }
            goto L_0x04e9
        L_0x04e7:
            monitor-exit(r7)     // Catch:{ all -> 0x09da }
            r5 = 0
        L_0x04e9:
            X.126 r13 = r0.A0K     // Catch:{ Exception -> 0x09ac }
            X.1BI r8 = r6.A00     // Catch:{ Exception -> 0x09ac }
            android.os.Parcelable$Creator r7 = X.AnonymousClass1EC.CREATOR     // Catch:{ Exception -> 0x09ac }
            X.1EC r11 = X.C42941yz.A00(r8)     // Catch:{ Exception -> 0x09ac }
            if (r22 == 0) goto L_0x0521
            boolean r7 = android.text.TextUtils.isEmpty(r22)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x0521
            java.lang.String r7 = X.C42671yY.A00(r22)     // Catch:{ Exception -> 0x09ac }
            X.00H r14 = r13.A0y     // Catch:{ Exception -> 0x09ac }
            java.lang.Object r14 = r14.get()     // Catch:{ Exception -> 0x09ac }
            X.2mo r14 = (X.C59742mo) r14     // Catch:{ Exception -> 0x09ac }
            boolean r14 = r14.A02(r11, r7)     // Catch:{ Exception -> 0x09ac }
            if (r14 == 0) goto L_0x0521
            r14 = 2
            java.lang.Integer r28 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x09ac }
            r29 = 0
            r32 = 6
            r26 = r13
            r27 = r11
            r30 = r7
            r31 = r29
            r26.A0d(r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x09ac }
        L_0x0521:
            r7 = r17
            r12.A04(r7, r6)     // Catch:{ Exception -> 0x09ac }
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x09ac }
            r12 = r7 ^ 1
            r7 = 7
            if (r10 == r7) goto L_0x0534
            r7 = 8
            r14 = 0
            if (r10 != r7) goto L_0x0535
        L_0x0534:
            r14 = 1
        L_0x0535:
            X.1Dw r7 = com.whatsapp.jid.UserJid.Companion     // Catch:{ Exception -> 0x09ac }
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A01(r8)     // Catch:{ Exception -> 0x09ac }
            if (r11 == 0) goto L_0x0548
            X.00H r7 = r0.A0d     // Catch:{ Exception -> 0x09ac }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x09ac }
            X.2nK r7 = (X.C60062nK) r7     // Catch:{ Exception -> 0x09ac }
            r7.A02(r11)     // Catch:{ Exception -> 0x09ac }
        L_0x0548:
            boolean r7 = X.C22971Dz.A0a(r8)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x0556
            boolean r7 = X.C22971Dz.A0O(r8)     // Catch:{ Exception -> 0x09ac }
            if (r7 == 0) goto L_0x055a
            if (r14 != 0) goto L_0x055a
        L_0x0556:
            r11 = 1
        L_0x0557:
            if (r12 == 0) goto L_0x0678
            goto L_0x055c
        L_0x055a:
            r11 = 0
            goto L_0x0557
        L_0x055c:
            boolean r7 = X.C22971Dz.A0e(r8)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x0592
            if (r11 != 0) goto L_0x0592
            boolean r7 = X.C22971Dz.A0d(r8)     // Catch:{ Exception -> 0x09ac }
            if (r7 == 0) goto L_0x0678
            r11 = 0
            X.1Qw r7 = r0.A0D     // Catch:{ Exception -> 0x09ac }
            X.1Qt r7 = X.C26111Qw.A01(r7, r6)     // Catch:{ Exception -> 0x09ac }
            java.util.Set r7 = r7.A05(r6)     // Catch:{ Exception -> 0x09ac }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x09ac }
            r12.<init>(r7)     // Catch:{ Exception -> 0x09ac }
            X.11S r7 = r0.A04     // Catch:{ Exception -> 0x09ac }
            r7.A0I()     // Catch:{ Exception -> 0x09ac }
            X.1E3 r7 = r7.A02     // Catch:{ Exception -> 0x09ac }
            r12.add(r7)     // Catch:{ Exception -> 0x09ac }
            java.lang.String r7 = X.C63442t5.A03(r12)     // Catch:{ Exception -> 0x09ac }
            boolean r7 = android.text.TextUtils.equals(r7, r9)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x0678
            r0.A03(r6, r14, r11)     // Catch:{ Exception -> 0x09ac }
            goto L_0x0610
        L_0x0592:
            X.1E9 r21 = X.C50242Tr.A00(r8)     // Catch:{ Exception -> 0x09ac }
            X.C17960vV.A07(r21)     // Catch:{ Exception -> 0x09ac }
            X.00H r7 = r0.A0b     // Catch:{ Exception -> 0x09ac }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x09ac }
            X.2jB r7 = (X.C57502jB) r7     // Catch:{ Exception -> 0x09ac }
            boolean r11 = r7.A00(r5)     // Catch:{ Exception -> 0x09ac }
            X.1Qw r7 = r0.A0D     // Catch:{ Exception -> 0x09ac }
            X.1Qt r7 = X.C26111Qw.A01(r7, r6)     // Catch:{ Exception -> 0x09ac }
            java.util.Set r7 = r7.A05(r6)     // Catch:{ Exception -> 0x09ac }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x09ac }
            r12.<init>(r7)     // Catch:{ Exception -> 0x09ac }
            X.11S r7 = r0.A04     // Catch:{ Exception -> 0x09ac }
            if (r11 == 0) goto L_0x05de
            X.1yJ r7 = r7.A08()     // Catch:{ Exception -> 0x09ac }
        L_0x05bc:
            r12.add(r7)     // Catch:{ Exception -> 0x09ac }
            java.lang.String r13 = X.C63442t5.A03(r12)     // Catch:{ Exception -> 0x09ac }
            boolean r7 = android.text.TextUtils.equals(r13, r9)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x0678
            r0.A03(r6, r14, r11)     // Catch:{ Exception -> 0x09ac }
            boolean r7 = X.C22971Dz.A0e(r21)     // Catch:{ Exception -> 0x09ac }
            if (r7 == 0) goto L_0x0610
            X.12M r15 = r0.A0L     // Catch:{ Exception -> 0x09ac }
            X.1EC r12 = X.C42941yz.A00(r21)     // Catch:{ Exception -> 0x09ac }
            X.C17960vV.A07(r12)     // Catch:{ Exception -> 0x09ac }
            X.1PT r9 = r0.A0S     // Catch:{ Exception -> 0x09ac }
            goto L_0x05e4
        L_0x05de:
            r7.A0I()     // Catch:{ Exception -> 0x09ac }
            X.1E3 r7 = r7.A02     // Catch:{ Exception -> 0x09ac }
            goto L_0x05bc
        L_0x05e4:
            if (r5 == 0) goto L_0x05e7
            goto L_0x05e9
        L_0x05e7:
            r7 = 0
            goto L_0x05ed
        L_0x05e9:
            com.whatsapp.jid.UserJid r7 = r5.A0I()     // Catch:{ Exception -> 0x09ac }
        L_0x05ed:
            boolean r31 = r9.A0K(r8, r7, r5)     // Catch:{ Exception -> 0x09ac }
            X.0ve r11 = r0.A0I     // Catch:{ Exception -> 0x09ac }
            r9 = 7053(0x1b8d, float:9.883E-42)
            X.0vf r7 = X.C18040vf.A02     // Catch:{ Exception -> 0x09ac }
            boolean r7 = X.C18020vd.A05(r7, r11, r9)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x05fe
            r13 = 0
        L_0x05fe:
            X.2sm r7 = new X.2sm     // Catch:{ Exception -> 0x09ac }
            r26 = r7
            r27 = r25
            r28 = r13
            r29 = r16
            r30 = r14
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x09ac }
            r15.A0C(r7, r12)     // Catch:{ Exception -> 0x09ac }
        L_0x0610:
            X.1PT r11 = r0.A0S     // Catch:{ Exception -> 0x09ac }
            X.2GV r9 = new X.2GV     // Catch:{ Exception -> 0x09ac }
            r9.<init>()     // Catch:{ Exception -> 0x09ac }
            java.lang.Integer r7 = X.AnonymousClass1PT.A02(r8)     // Catch:{ Exception -> 0x09ac }
            r9.A02 = r7     // Catch:{ Exception -> 0x09ac }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r14)     // Catch:{ Exception -> 0x09ac }
            r9.A01 = r7     // Catch:{ Exception -> 0x09ac }
            if (r5 == 0) goto L_0x0626
            goto L_0x0628
        L_0x0626:
            r7 = 0
            goto L_0x062c
        L_0x0628:
            com.whatsapp.jid.UserJid r7 = r5.A0I()     // Catch:{ Exception -> 0x09ac }
        L_0x062c:
            boolean r7 = r11.A0K(r8, r7, r5)     // Catch:{ Exception -> 0x09ac }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x09ac }
            r9.A00 = r7     // Catch:{ Exception -> 0x09ac }
            boolean r7 = X.C22971Dz.A0e(r8)     // Catch:{ Exception -> 0x09ac }
            if (r7 == 0) goto L_0x0665
            X.00H r7 = r11.A0O     // Catch:{ Exception -> 0x09ac }
            java.lang.Object r12 = r7.get()     // Catch:{ Exception -> 0x09ac }
            X.2mo r12 = (X.C59742mo) r12     // Catch:{ Exception -> 0x09ac }
            r7 = r8
            X.1E9 r7 = (X.AnonymousClass1E9) r7     // Catch:{ Exception -> 0x09ac }
            java.lang.String r7 = r12.A01(r7)     // Catch:{ Exception -> 0x09ac }
            int r12 = X.C64002u3.A06(r7)     // Catch:{ Exception -> 0x09ac }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x09ac }
            r9.A04 = r7     // Catch:{ Exception -> 0x09ac }
            boolean r7 = android.text.TextUtils.isEmpty(r22)     // Catch:{ Exception -> 0x09ac }
            if (r7 != 0) goto L_0x065f
            int r12 = X.C64002u3.A06(r22)     // Catch:{ Exception -> 0x09ac }
        L_0x065f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x09ac }
            r9.A05 = r7     // Catch:{ Exception -> 0x09ac }
        L_0x0665:
            X.1CJ r7 = r11.A07     // Catch:{ Exception -> 0x09ac }
            java.lang.Integer r7 = X.C64002u3.A07(r7, r8)     // Catch:{ Exception -> 0x09ac }
            r9.A06 = r7     // Catch:{ Exception -> 0x09ac }
            java.lang.Integer r7 = X.AnonymousClass1PT.A03(r5)     // Catch:{ Exception -> 0x09ac }
            r9.A03 = r7     // Catch:{ Exception -> 0x09ac }
            X.18K r7 = r11.A0C     // Catch:{ Exception -> 0x09ac }
            r7.CC7(r9)     // Catch:{ Exception -> 0x09ac }
        L_0x0678:
            boolean r7 = X.C22971Dz.A0V(r8)     // Catch:{ Exception -> 0x09ac }
            if (r7 == 0) goto L_0x0842
            X.00H r7 = r0.A0c     // Catch:{ Exception -> 0x09ac }
            java.lang.Object r11 = r7.get()     // Catch:{ Exception -> 0x09ac }
            X.2gQ r11 = (X.C55822gQ) r11     // Catch:{ Exception -> 0x09ac }
            java.lang.Long r21 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x09ac }
            r9 = 0
            r7 = 8
            r13 = 0
            r15 = 1
            if (r10 == r7) goto L_0x0695
            r15 = 0
            r7 = 3
            if (r10 != r7) goto L_0x0696
        L_0x0695:
            r13 = 1
        L_0x0696:
            boolean r10 = r6.A02     // Catch:{ Exception -> 0x09aa }
            java.lang.String r12 = "Failed requirement."
            if (r10 != 0) goto L_0x06a5
            if (r13 != 0) goto L_0x06a5
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x09aa }
            r2.<init>(r12)     // Catch:{ Exception -> 0x09aa }
            goto L_0x0977
        L_0x06a5:
            boolean r7 = r8 instanceof X.C29681ch     // Catch:{ Exception -> 0x09aa }
            if (r7 == 0) goto L_0x083b
            X.00H r7 = r11.A03     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x09aa }
            X.2nT r7 = (X.C60152nT) r7     // Catch:{ Exception -> 0x09aa }
            X.00H r7 = r7.A07     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x09aa }
            X.C18070vi.A0X(r7)     // Catch:{ Exception -> 0x09aa }
            X.2ip r7 = (X.C57282ip) r7     // Catch:{ Exception -> 0x09aa }
            X.206 r7 = r7.A00(r6, r9)     // Catch:{ Exception -> 0x09aa }
            if (r13 == 0) goto L_0x06db
            if (r7 != 0) goto L_0x06db
            X.00H r7 = r11.A02     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r14 = r7.get()     // Catch:{ Exception -> 0x09aa }
            X.1W6 r14 = (X.AnonymousClass1W6) r14     // Catch:{ Exception -> 0x09aa }
            r13 = r10 ^ 1
            java.lang.String r7 = r6.A01     // Catch:{ Exception -> 0x09aa }
            X.205 r10 = new X.205     // Catch:{ Exception -> 0x09aa }
            r10.<init>(r8, r7, r13)     // Catch:{ Exception -> 0x09aa }
            X.1W2 r7 = r14.A01     // Catch:{ Exception -> 0x09aa }
            X.206 r7 = r7.A05(r10)     // Catch:{ Exception -> 0x09aa }
        L_0x06db:
            r13 = 0
            if (r15 != 0) goto L_0x06f2
            boolean r8 = r7 instanceof X.AnonymousClass212     // Catch:{ Exception -> 0x09aa }
            if (r8 != 0) goto L_0x06f2
            if (r21 == 0) goto L_0x06eb
            int r8 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x06f2
            goto L_0x0972
        L_0x06eb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x09aa }
            r2.<init>(r12)     // Catch:{ Exception -> 0x09aa }
            goto L_0x0977
        L_0x06f2:
            boolean r8 = r7 instanceof X.AnonymousClass212     // Catch:{ Exception -> 0x09aa }
            if (r8 == 0) goto L_0x070c
            boolean r1 = r7 instanceof X.AnonymousClass227     // Catch:{ Exception -> 0x09aa }
            X.1WM r8 = r11.A00     // Catch:{ Exception -> 0x09aa }
            X.212 r7 = (X.AnonymousClass212) r7     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x0707
            long r1 = r7.A0x     // Catch:{ Exception -> 0x09aa }
            X.11m r3 = r8.A0E     // Catch:{ Exception -> 0x09aa }
            r3.A08(r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08d0
        L_0x0707:
            r8.A0J(r7, r3)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08d0
        L_0x070c:
            if (r7 == 0) goto L_0x0832
            if (r21 == 0) goto L_0x0719
            int r8 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0719
        L_0x0714:
            int r8 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0812
            goto L_0x071c
        L_0x0719:
            long r1 = r7.A0y     // Catch:{ Exception -> 0x09aa }
            goto L_0x0714
        L_0x071c:
            r7.A0y = r1     // Catch:{ Exception -> 0x09aa }
            r1 = 4
            r7.A0a(r1)     // Catch:{ Exception -> 0x09aa }
            r7.A0H = r3     // Catch:{ Exception -> 0x09aa }
            X.36c r1 = X.C60492o7.A00(r7)     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x073e
            X.205 r10 = r1.A02     // Catch:{ Exception -> 0x09aa }
            long r1 = r1.A01     // Catch:{ Exception -> 0x09aa }
            X.36c r8 = new X.36c     // Catch:{ Exception -> 0x09aa }
            r21 = r8
            r22 = r10
            r23 = r3
            r25 = r1
            r21.<init>(r22, r23, r25)     // Catch:{ Exception -> 0x09aa }
            X.C60492o7.A01(r7, r8)     // Catch:{ Exception -> 0x09aa }
        L_0x073e:
            X.00H r1 = r11.A06     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x09aa }
            X.1hF r3 = (X.C32471hF) r3     // Catch:{ Exception -> 0x09aa }
            X.1Cd r1 = r3.A03     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            X.1au r8 = r1.A05()     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            X.1xA r12 = r8.BD0()     // Catch:{ all -> 0x07fa }
            r1 = r8
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x07f3 }
            X.1Ev r10 = r1.A02     // Catch:{ all -> 0x07f3 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x07f3 }
            r4.<init>()     // Catch:{ all -> 0x07f3 }
            long r1 = r7.A0y     // Catch:{ all -> 0x07f3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x07f3 }
            java.lang.String r1 = "sort_id"
            r4.put(r1, r2)     // Catch:{ all -> 0x07f3 }
            int r1 = r7.A0D()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07f3 }
            java.lang.String r1 = "status"
            r4.put(r1, r2)     // Catch:{ all -> 0x07f3 }
            long r1 = r7.A0H     // Catch:{ all -> 0x07f3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x07f3 }
            java.lang.String r1 = "receipt_server_timestamp"
            r4.put(r1, r2)     // Catch:{ all -> 0x07f3 }
            r1 = r16
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch:{ all -> 0x07f3 }
            long r1 = r7.A0x     // Catch:{ all -> 0x07f3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07f3 }
            r11[r9] = r1     // Catch:{ all -> 0x07f3 }
            java.lang.String r25 = "UPDATE_MAIN_MESSAGE_TABLE_FOR_NEWSLETTER"
            java.lang.String r23 = "message"
            java.lang.String r24 = "_id = ?"
            r21 = r10
            r22 = r4
            r26 = r11
            r21.A02(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x07f3 }
            r3.A03(r8, r7)     // Catch:{ all -> 0x07f3 }
            X.1CJ r2 = r3.A01     // Catch:{ all -> 0x07f3 }
            X.205 r1 = r7.A0v     // Catch:{ all -> 0x07f3 }
            X.1BI r1 = r1.A00     // Catch:{ all -> 0x07f3 }
            X.1ci r4 = r2.A0A(r1)     // Catch:{ all -> 0x07f3 }
            boolean r1 = r4 instanceof X.C46162Dk     // Catch:{ all -> 0x07f3 }
            if (r1 == 0) goto L_0x07eb
            X.2Dk r4 = (X.C46162Dk) r4     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x07eb
            long r10 = r4.A0W     // Catch:{ all -> 0x07f3 }
            long r1 = r7.A0x     // Catch:{ all -> 0x07f3 }
            int r13 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x07ca
            long r1 = r7.A0y     // Catch:{ all -> 0x07f3 }
            r4.A0X = r1     // Catch:{ all -> 0x07f3 }
            long r1 = r7.A0y     // Catch:{ all -> 0x07f3 }
            r4.A0Q = r1     // Catch:{ all -> 0x07f3 }
            long r1 = r7.A0y     // Catch:{ all -> 0x07f3 }
            r4.A0S = r1     // Catch:{ all -> 0x07f3 }
            r4.A0g = r7     // Catch:{ all -> 0x07f3 }
            r4.A0f = r7     // Catch:{ all -> 0x07f3 }
            X.C46162Dk.A02(r4, r7)     // Catch:{ all -> 0x07f3 }
        L_0x07ca:
            X.00H r1 = r3.A07     // Catch:{ all -> 0x07f3 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x07f3 }
            X.1i5 r1 = (X.C32991i5) r1     // Catch:{ all -> 0x07f3 }
            r1.A02(r4)     // Catch:{ all -> 0x07f3 }
            r12.A00()     // Catch:{ all -> 0x07f3 }
            r12.close()     // Catch:{ all -> 0x07fa }
            r8.close()     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            X.00H r1 = r3.A06     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            java.lang.Object r1 = r1.get()     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            X.2jH r1 = (X.C57562jH) r1     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            r1.A00(r7)     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            goto L_0x08d0
        L_0x07eb:
            java.lang.String r2 = "Corrupt newsletter in cache"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x07f3 }
            r1.<init>(r2)     // Catch:{ all -> 0x07f3 }
            throw r1     // Catch:{ all -> 0x07f3 }
        L_0x07f3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x07f5 }
        L_0x07f5:
            r1 = move-exception
            X.CDX.A00(r12, r2)     // Catch:{ all -> 0x07fa }
            throw r1     // Catch:{ all -> 0x07fa }
        L_0x07fa:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x07fc }
        L_0x07fc:
            r1 = move-exception
            X.CDX.A00(r8, r2)     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
            throw r1     // Catch:{ SQLNonTransientException -> 0x0801, IllegalArgumentException -> 0x0805 }
        L_0x0801:
            r2 = move-exception
            java.lang.String r1 = "NewsletterMessageStore/failed to update the message"
            goto L_0x0808
        L_0x0805:
            r2 = move-exception
            java.lang.String r1 = "NewsletterMessageStore/failed to update the message due to message constraints"
        L_0x0808:
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x09aa }
            java.lang.String r1 = "NewsletterMessageManager/failed to insert a message"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08d0
        L_0x0812:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09aa }
            r4.<init>()     // Catch:{ Exception -> 0x09aa }
            java.lang.String r3 = "NewsletterMessageManager/unexpected server message id "
            r4.append(r3)     // Catch:{ Exception -> 0x09aa }
            r4.append(r1)     // Catch:{ Exception -> 0x09aa }
            r1 = 32
            r4.append(r1)     // Catch:{ Exception -> 0x09aa }
            r4.append(r6)     // Catch:{ Exception -> 0x09aa }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x09aa }
            X.1UI r2 = new X.1UI     // Catch:{ Exception -> 0x09aa }
            r2.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x0977
        L_0x0832:
            java.lang.String r1 = "NewsletterMessageManager/unable to find a message to update"
            X.1UI r2 = new X.1UI     // Catch:{ Exception -> 0x09aa }
            r2.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x0977
        L_0x083b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x09aa }
            r2.<init>(r12)     // Catch:{ Exception -> 0x09aa }
            goto L_0x0977
        L_0x0842:
            r9 = 0
            if (r5 == 0) goto L_0x0846
            goto L_0x08a1
        L_0x0846:
            boolean r1 = r5 instanceof X.AnonymousClass212     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x0877
            X.1iU r10 = r0.A0F     // Catch:{ Exception -> 0x09aa }
            r2 = r5
            X.212 r2 = (X.AnonymousClass212) r2     // Catch:{ Exception -> 0x09aa }
            X.11S r1 = r10.A01     // Catch:{ Exception -> 0x09aa }
            boolean r1 = X.AnonymousClass25A.A0P(r1, r2)     // Catch:{ Exception -> 0x09aa }
            if (r1 != 0) goto L_0x085d
            java.lang.String r1 = "MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08d0
        L_0x085d:
            X.00H r1 = r10.A0G     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r8 = r1.get()     // Catch:{ Exception -> 0x09aa }
            X.1gM r8 = (X.C31931gM) r8     // Catch:{ Exception -> 0x09aa }
            r24 = 11
            X.3C3 r7 = new X.3C3     // Catch:{ Exception -> 0x09aa }
            r21 = r7
            r22 = r10
            r23 = r2
            r25 = r3
            r21.<init>(r22, r23, r24, r25)     // Catch:{ Exception -> 0x09aa }
            r1 = 56
            goto L_0x089d
        L_0x0877:
            X.122 r2 = r0.A0B     // Catch:{ Exception -> 0x09aa }
            java.util.Map r1 = r2.A1M     // Catch:{ Exception -> 0x09aa }
            r1.remove(r6)     // Catch:{ Exception -> 0x09aa }
            X.00H r1 = r2.A16     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r8 = r1.get()     // Catch:{ Exception -> 0x09aa }
            X.1gM r8 = (X.C31931gM) r8     // Catch:{ Exception -> 0x09aa }
            X.3CN r7 = new X.3CN     // Catch:{ Exception -> 0x09aa }
            r25 = r7
            r26 = r2
            r27 = r6
            r28 = r5
            r29 = r24
            r30 = r23
            r31 = r9
            r32 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x09aa }
            r1 = 23
        L_0x089d:
            r8.A01(r7, r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08d0
        L_0x08a1:
            r1 = 131072(0x20000, double:6.47582E-319)
            boolean r1 = r5.A11(r1)     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x0846
            X.0ve r10 = r0.A0I     // Catch:{ Exception -> 0x09aa }
            boolean r1 = r5.A0w()     // Catch:{ Exception -> 0x09aa }
            if (r1 != 0) goto L_0x0846
            boolean r1 = r5 instanceof X.C445823z     // Catch:{ Exception -> 0x09aa }
            if (r1 != 0) goto L_0x0846
            long r7 = r5.A0I     // Catch:{ Exception -> 0x09aa }
            r2 = 2983(0xba7, float:4.18E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x09aa }
            int r1 = X.C18020vd.A00(r1, r10, r2)     // Catch:{ Exception -> 0x09aa }
            long r1 = (long) r1     // Catch:{ Exception -> 0x09aa }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r10
            long r7 = r7 + r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0846
            X.205 r2 = r5.A0v     // Catch:{ Exception -> 0x09aa }
            r1 = 21
            r0.A01(r5, r2, r1)     // Catch:{ Exception -> 0x09aa }
        L_0x08d0:
            X.1kp r1 = r0.A06     // Catch:{ Exception -> 0x09aa }
            X.1ko r2 = r1.A0B     // Catch:{ Exception -> 0x09aa }
            boolean r1 = r2.A03     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x08e8
            r2.A03 = r9     // Catch:{ Exception -> 0x09aa }
            X.00H r1 = r2.A02     // Catch:{ Exception -> 0x09aa }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x09aa }
            X.1Vn r3 = (X.C27301Vn) r3     // Catch:{ Exception -> 0x09aa }
            r2 = 6
            java.lang.String r1 = "UnsentMessagesNotification2"
            r3.BEJ(r2, r1)     // Catch:{ Exception -> 0x09aa }
        L_0x08e8:
            X.1m1 r10 = r0.A0Z     // Catch:{ Exception -> 0x09aa }
            boolean r4 = r5 instanceof X.C444323k     // Catch:{ Exception -> 0x09aa }
            if (r4 != 0) goto L_0x0905
            boolean r1 = r5 instanceof X.C444923q     // Catch:{ Exception -> 0x09aa }
            if (r1 != 0) goto L_0x0905
        L_0x08f2:
            X.0zA r2 = r0.A01     // Catch:{ Exception -> 0x09aa }
            boolean r1 = r2.A07()     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x0978
            r2.A03()     // Catch:{ Exception -> 0x09aa }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x09aa }
            r2.<init>(r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x0977
        L_0x0905:
            X.0ve r3 = r10.A07     // Catch:{ Exception -> 0x09aa }
            r2 = 4411(0x113b, float:6.181E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x09aa }
            boolean r1 = X.C18020vd.A05(r1, r3, r2)     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x08f2
            X.11S r1 = r10.A01     // Catch:{ Exception -> 0x09aa }
            boolean r1 = X.AnonymousClass25A.A0P(r1, r5)     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x08f2
            X.205 r11 = r5.A0v     // Catch:{ Exception -> 0x09aa }
            X.1BI r1 = r11.A00     // Catch:{ Exception -> 0x09aa }
            com.whatsapp.jid.GroupJid r8 = X.C36321nh.A00(r1)     // Catch:{ Exception -> 0x09aa }
            if (r8 != 0) goto L_0x092a
            java.lang.String r1 = "updateServerReminder/groupJid is null"
        L_0x0926:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08f2
        L_0x092a:
            r7 = 0
            if (r4 == 0) goto L_0x092e
            goto L_0x0951
        L_0x092e:
            boolean r1 = r5 instanceof X.C444923q     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x08f2
            r1 = r5
            X.212 r1 = (X.AnonymousClass212) r1     // Catch:{ Exception -> 0x09aa }
            X.205 r1 = r1.A18()     // Catch:{ Exception -> 0x09aa }
            if (r1 != 0) goto L_0x093f
            java.lang.String r1 = "updateServerReminder/parentMessageKey is null"
            goto L_0x0926
        L_0x093f:
            java.lang.String r4 = r1.A01     // Catch:{ Exception -> 0x09aa }
            r1 = -1
            X.9rV r3 = new X.9rV     // Catch:{ Exception -> 0x09aa }
            r3.<init>(r4, r8, r1)     // Catch:{ Exception -> 0x09aa }
            android.os.Message r4 = android.os.Message.obtain(r7, r9, r3)     // Catch:{ Exception -> 0x09aa }
            X.1V7 r3 = r10.A02     // Catch:{ Exception -> 0x09aa }
            java.lang.String r2 = "cancel_scheduled_call_reminder"
            goto L_0x0969
        L_0x0951:
            r1 = r5
            X.23j r1 = (X.C444223j) r1     // Catch:{ Exception -> 0x09aa }
            long r1 = r1.A01     // Catch:{ Exception -> 0x09aa }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r4 = r11.A01     // Catch:{ Exception -> 0x09aa }
            X.9rV r3 = new X.9rV     // Catch:{ Exception -> 0x09aa }
            r3.<init>(r4, r8, r1)     // Catch:{ Exception -> 0x09aa }
            android.os.Message r4 = android.os.Message.obtain(r7, r9, r3)     // Catch:{ Exception -> 0x09aa }
            X.1V7 r3 = r10.A02     // Catch:{ Exception -> 0x09aa }
            java.lang.String r2 = "set_scheduled_call_reminder"
        L_0x0969:
            X.A69 r1 = new X.A69     // Catch:{ Exception -> 0x09aa }
            r1.<init>((android.os.Message) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x09aa }
            r3.A00(r1)     // Catch:{ Exception -> 0x09aa }
            goto L_0x08f2
        L_0x0972:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x09aa }
            r2.<init>(r12)     // Catch:{ Exception -> 0x09aa }
        L_0x0977:
            throw r2     // Catch:{ Exception -> 0x09aa }
        L_0x0978:
            boolean r1 = r5 instanceof X.AnonymousClass21L     // Catch:{ Exception -> 0x09aa }
            if (r1 == 0) goto L_0x09a9
            r2 = r5
            X.21L r2 = (X.AnonymousClass21L) r2     // Catch:{ Exception -> 0x09aa }
            X.122 r1 = r0.A0B     // Catch:{ Exception -> 0x09aa }
            r1.A0T(r2)     // Catch:{ Exception -> 0x09aa }
            return r16
        L_0x0985:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/Error handling nack/key="
            r2.append(r1)
            r2.append(r5)
            r2.append(r9)
            r2.append(r11)
            r2.append(r8)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e(r1, r6)
            r0.A00(r3, r5, r4)
        L_0x09a9:
            return r16
        L_0x09aa:
            r3 = move-exception
            goto L_0x09ae
        L_0x09ac:
            r3 = move-exception
            r9 = 0
        L_0x09ae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/Error handling ack/key="
            r2.append(r1)
            r2.append(r6)
            r1 = r20
            r2.append(r1)
            r1 = r18
            r2.append(r1)
            r1 = r19
            r2.append(r1)
            r1 = r17
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e(r1, r3)
            r0.A00(r5, r6, r9)
            return r16
        L_0x09da:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x09da }
            throw r0
        L_0x09dd:
            java.lang.Object r4 = r5.obj
            X.2cj r4 = (X.C53562cj) r4
            X.2sw r2 = r4.A00
            r1 = 19
            X.3C5 r3 = new X.3C5
            r3.<init>(r0, r2, r4, r1)
        L_0x09ea:
            r3.run()
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35331m4.BcT(android.os.Message, int):boolean");
    }

    public C35331m4(C19880zA r14, C19880zA r15, AnonymousClass190 r16, AnonymousClass11S r17, C26261Rl r18, C34641kp r19, C23651Hc r20, AnonymousClass1S2 r21, AnonymousClass1PM r22, C26191Re r23, C34811l7 r24, AnonymousClass11P r25, C19830z4 r26, AnonymousClass122 r27, AnonymousClass1MZ r28, C26111Qw r29, AnonymousClass1NK r30, C33231iU r31, AnonymousClass1U5 r32, AnonymousClass1MR r33, C18030ve r34, AnonymousClass18K r35, AnonymousClass126 r36, AnonymousClass12M r37, C34651kr r38, AnonymousClass1O2 r39, AnonymousClass1OZ r40, AnonymousClass1N9 r41, C35211lq r42, AnonymousClass1N7 r43, C31441fZ r44, AnonymousClass1PT r45, C34711kx r46, C35321m3 r47, C32201go r48, AnonymousClass1QS r49, C31661fv r50, C34661ks r51, C35301lz r52, AnonymousClass1PQ r53, C31621fr r54, C31631fs r55, C35311m1 r56, AnonymousClass00H r57, AnonymousClass00H r58, AnonymousClass00H r59, AnonymousClass00H r60, AnonymousClass00H r61, AnonymousClass00H r62) {
        AnonymousClass11P r3 = r25;
        this.A09 = r3;
        C18030ve r5 = r34;
        this.A0I = r5;
        this.A03 = r16;
        this.A04 = r17;
        this.A0E = r30;
        AnonymousClass18K r6 = r35;
        this.A0J = r6;
        this.A0P = r41;
        AnonymousClass1OZ r1 = r40;
        this.A0O = r1;
        AnonymousClass1PT r8 = r45;
        this.A0S = r8;
        this.A06 = r19;
        this.A0T = r49;
        this.A0a = r57;
        AnonymousClass122 r4 = r27;
        this.A0B = r4;
        this.A0K = r36;
        this.A0L = r37;
        this.A0N = r39;
        this.A0f = r20;
        this.A0h = r23;
        this.A0M = r38;
        this.A0m = r58;
        this.A0H = r33;
        this.A0R = r43;
        this.A0k = r48;
        this.A07 = r22;
        this.A0A = r26;
        this.A0G = r32;
        this.A0i = r46;
        this.A0D = r29;
        this.A0X = r53;
        this.A05 = r18;
        this.A08 = r24;
        this.A0V = r51;
        this.A0W = r52;
        this.A0Q = r42;
        this.A0b = r59;
        this.A0d = r60;
        this.A0C = r28;
        this.A02 = r14;
        this.A0l = r61;
        this.A0Z = r56;
        this.A0F = r31;
        this.A0c = r62;
        this.A0g = r21;
        C31661fv r9 = r50;
        this.A0U = r9;
        this.A0j = r47;
        this.A01 = r15;
        r1.getClass();
        this.A0Y = new C35361m7(new C64892vV(r1, 9), r3, r4, r5, r6, r44, r8, r9, new C35351m6(this), r54, r55);
    }
}

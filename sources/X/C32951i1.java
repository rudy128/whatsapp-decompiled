package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1i1  reason: invalid class name and case insensitive filesystem */
public class C32951i1 implements C28741ap, C25231Nk, C25221Nj, C25471Oi, AnonymousClass1M1, C32941i0, C201511a {
    public static final Set A0n = C199410f.of(C32961i2.CHAT_LIST_SCREEN, C32961i2.CONTACT_INFO, C32961i2.CONVERSATION_SCREEN, C32961i2.LEAVE_GROUPS, C32961i2.NOTIFICATION, C32961i2.COMMUNITY_NAVIGATION, new C32961i2[0]);
    public static final Set A0o = C199410f.of("thread_user_secret");
    public SharedPreferences A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11S A02;
    public final C26911Ty A03;
    public final C25741Pl A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass1PM A06;
    public final C33001i6 A07;
    public final C19830z4 A08;
    public final C30801eX A09;
    public final AnonymousClass1LW A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass121 A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass1R3 A0E;
    public final AnonymousClass1NK A0F;
    public final AnonymousClass1NJ A0G;
    public final C28521aN A0H;
    public final C24751Ln A0I;
    public final AnonymousClass1RL A0J;
    public final AnonymousClass1WM A0K;
    public final C32981i4 A0L;
    public final AnonymousClass1PS A0M;
    public final C18030ve A0N;
    public final C25241Nl A0O;
    public final C25841Pv A0P;
    public final AnonymousClass1Nb A0Q;
    public final C33211iS A0R;
    public final AnonymousClass1PU A0S;
    public final C200710s A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final AnonymousClass00H A0f;
    public final C19880zA A0g;
    public final C33221iT A0h;
    public final AnonymousClass11P A0i;
    public final AnonymousClass1NH A0j;
    public final AnonymousClass18K A0k;
    public final C18010vc A0l;
    public final C33171iO A0m;

    public static String A01(String str, int i) {
        StringBuilder sb;
        String str2;
        if (i == 1) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_messageToAgent";
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_messageFromAgent";
        } else if (i == 3) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "_editFromAgent";
        } else {
            throw new IllegalArgumentException("agent type does not exit");
        }
        sb.append(str2);
        return sb.toString();
    }

    public synchronized SharedPreferences.Editor A08() {
        SharedPreferences A002 = A00(this);
        SharedPreferences.Editor edit = A002.edit();
        if (!C18020vd.A05(C18040vf.A02, this.A0N, 10290)) {
            return edit.clear();
        }
        for (Map.Entry next : A002.getAll().entrySet()) {
            if (!A0o.contains(next.getKey())) {
                edit.remove((String) next.getKey());
            }
        }
        return edit;
    }

    public void A0D(AnonymousClass1BI r9, Integer num) {
        SharedPreferences A002 = A00(this);
        String rawString = r9.getRawString();
        C18070vi.A0d(rawString, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(rawString);
        sb.append("_BotMentionsRowCount");
        this.A0T.execute(new C21456AkN(this, A002, num, sb.toString(), 21));
    }

    public void A0E(AnonymousClass1BI r9, Integer num) {
        SharedPreferences A002 = A00(this);
        String rawString = r9.getRawString();
        C18070vi.A0d(rawString, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(rawString);
        sb.append("_BotSearchPlugInRowCount");
        this.A0T.execute(new C21456AkN(this, A002, num, sb.toString(), 20));
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public void BoE(AnonymousClass1BI r5) {
        if (C18020vd.A05(C18040vf.A02, this.A0N, 10292)) {
            this.A0T.execute(new AnonymousClass7RF(this, r5, 27, true));
        }
    }

    public void BoF(AnonymousClass1BI r8, Integer num) {
        AnonymousClass1BI r3 = r8;
        if (!C22971Dz.A0e(r8)) {
            this.A0T.execute(new AnonymousClass7RT(this, r3, num, 17, true));
        }
    }

    public /* synthetic */ void BoG(AnonymousClass1BI r1, boolean z) {
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoK() {
    }

    public void BoO(AnonymousClass1BI r2, C32961i2 r3) {
        A06(r2, r3, true);
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public /* synthetic */ void BoR(AnonymousClass1BI r1) {
    }

    public void BoW(AnonymousClass1BI r5) {
        if (C18020vd.A05(C18040vf.A02, this.A0N, 10292)) {
            this.A0T.execute(new AnonymousClass7RF(this, r5, 27, false));
        }
    }

    public void BoX(AnonymousClass1BI r8, Integer num) {
        AnonymousClass1BI r3 = r8;
        if (!C22971Dz.A0e(r8)) {
            this.A0T.execute(new AnonymousClass7RT(this, r3, num, 17, false));
        }
    }

    public void BoY(AnonymousClass1BI r2, C32961i2 r3) {
        A06(r2, r3, false);
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bpx(AnonymousClass1E7 r1) {
    }

    public /* synthetic */ void Bq3(Collection collection) {
    }

    public /* synthetic */ void BqF(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqG(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqH(AnonymousClass1BI r1, boolean z) {
    }

    public /* synthetic */ void BqI(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqK(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BqN(int i) {
    }

    public /* synthetic */ void BqO() {
    }

    public /* synthetic */ void BvN(AnonymousClass1E9 r1) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public /* synthetic */ void BwP(Collection collection) {
    }

    public /* synthetic */ void Bxd(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxe(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxf(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxg(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxh(AnonymousClass1EC r1) {
    }

    public static SharedPreferences A00(C32951i1 r2) {
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A052 = r2.A0l.A05("chatCounts");
        r2.A00 = A052;
        return A052;
    }

    public static void A03(AnonymousClass1GV r3, C32951i1 r4, UserJid userJid) {
        AnonymousClass1E7 A0E2;
        if (!r4.A02.A0O(userJid) && (A0E2 = r4.A05.A0E(userJid)) != null && A0E2.A0C()) {
            r4.A0T.execute(new C70773Cl(r4, userJid, r3, 41));
        }
    }

    /* JADX WARNING: type inference failed for: r0v257, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v262, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01de, code lost:
        if (((X.C441822l) r7).A1L() == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020c, code lost:
        if (X.C22971Dz.A0a(r0.A0v.A00) != false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r40.intValue() != 1) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x048c, code lost:
        if (r13.A11(4194304) == false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04b3, code lost:
        if (r12.A11(4194304) == false) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x055f, code lost:
        if (r1.A0K(r7) == false) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        if (r5 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fe, code lost:
        if (r17 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0124, code lost:
        if (r5 != null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0131, code lost:
        if (r5.A0K() == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0150, code lost:
        if (X.AnonymousClass25A.A0j(r7) == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0160, code lost:
        if (r4.A0K.A09(r3) != 93) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016f, code lost:
        if (r7.A11(16777216) == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019b, code lost:
        if (r7.A11(1) != false) goto L_0x019d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x04f0 A[SYNTHETIC, Splitter:B:302:0x04f0] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06b4 A[SYNTHETIC, Splitter:B:389:0x06b4] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A04(X.C32951i1 r36, X.AnonymousClass1BI r37, com.whatsapp.jid.UserJid r38, X.AnonymousClass205 r39, java.lang.Integer r40, boolean r41, boolean r42, boolean r43) {
        /*
            r4 = r36
            monitor-enter(r4)
            X.1Nl r1 = r4.A0O     // Catch:{ all -> 0x06df }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x06df }
            r0.<init>()     // Catch:{ all -> 0x06df }
            long r6 = r1.A02(r0)     // Catch:{ all -> 0x06df }
            X.00H r0 = r4.A0Z     // Catch:{ all -> 0x06df }
            r36 = r0
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x06df }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x06df }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x06df }
            r3 = r39
            X.206 r0 = r0.A05(r3)     // Catch:{ all -> 0x06df }
            r2 = r41
            if (r0 == 0) goto L_0x005e
            long r0 = r0.A0I     // Catch:{ all -> 0x06df }
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x005e
            X.1BI r0 = r3.A00     // Catch:{ all -> 0x06df }
            int r5 = X.C64002u3.A04(r0)     // Catch:{ all -> 0x06df }
            X.0ve r3 = r4.A0N     // Catch:{ all -> 0x06df }
            r1 = 3098(0xc1a, float:4.341E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x06df }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x0100
            X.190 r3 = r4.A01     // Catch:{ all -> 0x06df }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06df }
            r1.<init>()     // Catch:{ all -> 0x06df }
            java.lang.String r0 = "message-out-of-logging-window-"
            r1.append(r0)     // Catch:{ all -> 0x06df }
            r1.append(r2)     // Catch:{ all -> 0x06df }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ all -> 0x06df }
            r1.append(r5)     // Catch:{ all -> 0x06df }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x06df }
            r1 = 0
            r0 = 0
            r3.A0G(r2, r1, r0)     // Catch:{ all -> 0x06df }
            goto L_0x0100
        L_0x005e:
            X.11S r0 = r4.A02     // Catch:{ all -> 0x06df }
            r35 = r0
            r6 = r37
            boolean r0 = r0.A0O(r6)     // Catch:{ all -> 0x06df }
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x06df }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x06df }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x06df }
            X.206 r5 = r0.A05(r3)     // Catch:{ all -> 0x06df }
            X.00H r1 = r4.A0X     // Catch:{ all -> 0x06df }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x06df }
            X.1PW r0 = (X.AnonymousClass1PW) r0     // Catch:{ all -> 0x06df }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x06df }
            r17 = 0
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r9 = r1.get()     // Catch:{ all -> 0x06df }
            X.1PW r9 = (X.AnonymousClass1PW) r9     // Catch:{ all -> 0x06df }
            if (r5 == 0) goto L_0x0092
            java.util.List r0 = r5.A0h     // Catch:{ all -> 0x06df }
            r17 = r0
        L_0x0092:
            r8 = 1
            X.C18070vi.A0d(r6, r8)     // Catch:{ all -> 0x06df }
            r7 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x06df }
            if (r41 != 0) goto L_0x00ba
            boolean r0 = X.C42701yb.A01(r6)     // Catch:{ all -> 0x06df }
            if (r0 != 0) goto L_0x00ab
            if (r38 == 0) goto L_0x00c9
            boolean r0 = X.C42701yb.A01(r38)     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x00c9
        L_0x00ab:
            if (r40 == 0) goto L_0x00b4
            int r0 = r40.intValue()     // Catch:{ all -> 0x06df }
            r1 = 3
            if (r0 == r8) goto L_0x00b5
        L_0x00b4:
            r1 = 2
        L_0x00b5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x06df }
            goto L_0x00c9
        L_0x00ba:
            boolean r0 = X.C42701yb.A01(r6)     // Catch:{ all -> 0x06df }
            if (r0 != 0) goto L_0x00c8
            r0 = r17
            com.whatsapp.jid.UserJid r0 = r9.A03(r0)     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x00c9
        L_0x00c8:
            r7 = r1
        L_0x00c9:
            r17 = r7
        L_0x00cb:
            if (r41 != 0) goto L_0x00d0
            r7 = 1
            if (r5 == 0) goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            X.0ve r12 = r4.A0N     // Catch:{ all -> 0x06df }
            r0 = 5963(0x174b, float:8.356E-42)
            X.0vf r9 = X.C18040vf.A02     // Catch:{ all -> 0x06df }
            boolean r0 = X.C18020vd.A05(r9, r12, r0)     // Catch:{ all -> 0x06df }
            r34 = 0
            if (r0 == 0) goto L_0x00ed
            if (r5 != 0) goto L_0x00ed
            X.1WM r0 = r4.A0K     // Catch:{ all -> 0x06df }
            int r1 = r0.A09(r3)     // Catch:{ all -> 0x06df }
            r0 = 67
            if (r1 != r0) goto L_0x00ed
            r34 = 1
        L_0x00ed:
            if (r7 != 0) goto L_0x00f3
            boolean r0 = r5 instanceof X.C442522s     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x0102
        L_0x00f3:
            boolean r0 = A07(r4, r5, r3)     // Catch:{ all -> 0x06df }
            if (r0 != 0) goto L_0x0102
            if (r5 != 0) goto L_0x00fc
            goto L_0x010e
        L_0x00fc:
            if (r34 != 0) goto L_0x0102
            if (r17 != 0) goto L_0x0102
        L_0x0100:
            monitor-exit(r4)
            return
        L_0x0102:
            if (r5 == 0) goto L_0x0118
            int r0 = r5.A0u     // Catch:{ all -> 0x06df }
            boolean r0 = X.AnonymousClass25A.A0J(r0)     // Catch:{ all -> 0x06df }
            r11 = 1
            if (r0 != 0) goto L_0x0126
            goto L_0x0123
        L_0x010e:
            X.1WM r0 = r4.A0K     // Catch:{ all -> 0x06df }
            int r1 = r0.A09(r3)     // Catch:{ all -> 0x06df }
            r0 = 93
            if (r1 != r0) goto L_0x00fc
        L_0x0118:
            X.1WM r0 = r4.A0K     // Catch:{ all -> 0x06df }
            int r1 = r0.A09(r3)     // Catch:{ all -> 0x06df }
            r0 = 68
            if (r0 != r1) goto L_0x0123
            goto L_0x0100
        L_0x0123:
            r11 = 0
            if (r5 == 0) goto L_0x0133
        L_0x0126:
            int r1 = r5.A0u     // Catch:{ all -> 0x06df }
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L_0x0133
            X.206 r0 = r5.A0K()     // Catch:{ all -> 0x06df }
            r10 = 1
            if (r0 != 0) goto L_0x0134
        L_0x0133:
            r10 = 0
        L_0x0134:
            android.content.SharedPreferences r33 = A00(r4)     // Catch:{ all -> 0x06dd }
            java.lang.String r32 = r6.getRawString()     // Catch:{ all -> 0x06dd }
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x06dd }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x06dd }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x06dd }
            X.206 r7 = r0.A05(r3)     // Catch:{ all -> 0x06dd }
            if (r7 == 0) goto L_0x0152
            boolean r0 = X.AnonymousClass25A.A0j(r7)     // Catch:{ all -> 0x06dd }
            r31 = 1
            if (r0 != 0) goto L_0x0162
        L_0x0152:
            r31 = 0
            if (r7 != 0) goto L_0x0162
            X.1WM r0 = r4.A0K     // Catch:{ all -> 0x06dd }
            int r1 = r0.A09(r3)     // Catch:{ all -> 0x06dd }
            r0 = 93
            r30 = 1
            if (r1 == r0) goto L_0x0171
        L_0x0162:
            r30 = 0
            if (r7 == 0) goto L_0x0171
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r7.A11(r0)     // Catch:{ all -> 0x06dd }
            r29 = 1
            if (r0 != 0) goto L_0x0173
        L_0x0171:
            r29 = 0
        L_0x0173:
            r28 = 1
            if (r7 == 0) goto L_0x01e3
            boolean r13 = r7 instanceof X.AnonymousClass210     // Catch:{ all -> 0x06dd }
            boolean r27 = X.AnonymousClass25A.A0t(r7)     // Catch:{ all -> 0x06dd }
            int r8 = r7.A0u     // Catch:{ all -> 0x06dd }
            boolean r26 = X.AnonymousClass25A.A0G(r8)     // Catch:{ all -> 0x06dd }
            if (r41 == 0) goto L_0x0193
            java.lang.Long r0 = r7.A0V     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x0193
            long r18 = r0.longValue()     // Catch:{ all -> 0x06dd }
            r14 = 0
            int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x019d
        L_0x0193:
            r0 = 1
            boolean r0 = r7.A11(r0)     // Catch:{ all -> 0x06dd }
            r25 = 0
            if (r0 == 0) goto L_0x019f
        L_0x019d:
            r25 = 1
        L_0x019f:
            r0 = 5963(0x174b, float:8.356E-42)
            boolean r0 = X.C18020vd.A05(r9, r12, r0)     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = "video"
            java.lang.String r1 = X.AnonymousClass25A.A0B(r8)     // Catch:{ all -> 0x06dd }
            boolean r24 = r0.equals(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "gif"
            boolean r23 = r0.equals(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "audio"
            boolean r22 = r0.equals(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "document"
            boolean r21 = r0.equals(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "sticker"
            boolean r20 = r0.equals(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "ptv"
            boolean r19 = r0.equals(r1)     // Catch:{ all -> 0x06dd }
            boolean r0 = r7 instanceof X.C441822l     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x01e0
            r0 = r7
            X.22l r0 = (X.C441822l) r0     // Catch:{ all -> 0x06dd }
            boolean r0 = r0.A1L()     // Catch:{ all -> 0x06dd }
            r18 = 1
            if (r0 != 0) goto L_0x01fc
        L_0x01e0:
            r18 = 0
            goto L_0x01fc
        L_0x01e3:
            r25 = 0
            r13 = 0
            r26 = 0
            r27 = 0
        L_0x01ea:
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r14 = 0
        L_0x01f9:
            r28 = 0
            goto L_0x020e
        L_0x01fc:
            boolean r14 = r7 instanceof X.AnonymousClass22H     // Catch:{ all -> 0x06dd }
            X.206 r0 = r7.A0K()     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x01f9
            X.205 r0 = r0.A0v     // Catch:{ all -> 0x06dd }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x06dd }
            boolean r0 = X.C22971Dz.A0a(r0)     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x01f9
        L_0x020e:
            boolean r1 = r7 instanceof X.C445823z     // Catch:{ all -> 0x06dd }
            r8 = 0
            r0 = r32
            X.C18070vi.A0d(r0, r8)     // Catch:{ all -> 0x06dd }
            java.lang.String r15 = X.C60332nq.A01()     // Catch:{ all -> 0x06dd }
            r8 = r33
            java.lang.String r0 = r8.getString(r0, r15)     // Catch:{ all -> 0x06dd }
            X.2S9 r8 = X.C60332nq.A00(r0)     // Catch:{ all -> 0x06dd }
            r16 = r42
            if (r41 == 0) goto L_0x02ee
            X.2R2 r0 = X.AnonymousClass2R2.A13     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0234
            X.2R2 r0 = X.AnonymousClass2R2.A0T     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0234:
            if (r42 == 0) goto L_0x023b
            X.2R2 r0 = X.AnonymousClass2R2.A0C     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x023b:
            if (r11 == 0) goto L_0x0242
            X.2R2 r0 = X.AnonymousClass2R2.A1J     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0242:
            if (r10 == 0) goto L_0x0249
            X.2R2 r0 = X.AnonymousClass2R2.A12     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0249:
            if (r43 == 0) goto L_0x0250
            X.2R2 r0 = X.AnonymousClass2R2.A10     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0250:
            if (r31 == 0) goto L_0x0257
            X.2R2 r0 = X.AnonymousClass2R2.A0A     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0257:
            if (r13 == 0) goto L_0x0265
            X.2R2 r0 = X.AnonymousClass2R2.A1C     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0265
            X.2R2 r0 = X.AnonymousClass2R2.A0X     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0265:
            if (r26 == 0) goto L_0x0273
            X.2R2 r0 = X.AnonymousClass2R2.A0o     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0273
            X.2R2 r0 = X.AnonymousClass2R2.A0R     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0273:
            if (r27 == 0) goto L_0x0281
            X.2R2 r0 = X.AnonymousClass2R2.A1E     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0281
            X.2R2 r0 = X.AnonymousClass2R2.A0Z     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0281:
            if (r24 == 0) goto L_0x028f
            X.2R2 r0 = X.AnonymousClass2R2.A1G     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x028f
            X.2R2 r0 = X.AnonymousClass2R2.A0b     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x028f:
            if (r23 == 0) goto L_0x029d
            X.2R2 r0 = X.AnonymousClass2R2.A0d     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x029d
            X.2R2 r0 = X.AnonymousClass2R2.A0P     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x029d:
            if (r22 == 0) goto L_0x02ab
            X.2R2 r0 = X.AnonymousClass2R2.A03     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x02ab
            X.2R2 r0 = X.AnonymousClass2R2.A0L     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02ab:
            if (r21 == 0) goto L_0x02b9
            X.2R2 r0 = X.AnonymousClass2R2.A09     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x02b9
            X.2R2 r0 = X.AnonymousClass2R2.A0N     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02b9:
            if (r20 == 0) goto L_0x02c7
            X.2R2 r0 = X.AnonymousClass2R2.A1A     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x02c7
            X.2R2 r0 = X.AnonymousClass2R2.A0V     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02c7:
            if (r19 == 0) goto L_0x02ce
            X.2R2 r0 = X.AnonymousClass2R2.A0y     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02ce:
            if (r18 == 0) goto L_0x02d5
            X.2R2 r0 = X.AnonymousClass2R2.A0w     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02d5:
            if (r14 == 0) goto L_0x02dc
            X.2R2 r0 = X.AnonymousClass2R2.A0q     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02dc:
            if (r34 == 0) goto L_0x02e3
            X.2R2 r0 = X.AnonymousClass2R2.A0s     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02e3:
            if (r1 == 0) goto L_0x02ea
            X.2R2 r0 = X.AnonymousClass2R2.A0F     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02ea:
            if (r30 == 0) goto L_0x03ba
            goto L_0x03b5
        L_0x02ee:
            X.2R2 r0 = X.AnonymousClass2R2.A11     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x02fa
            X.2R2 r0 = X.AnonymousClass2R2.A0S     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x02fa:
            if (r42 == 0) goto L_0x0301
            X.2R2 r0 = X.AnonymousClass2R2.A0B     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0301:
            if (r11 == 0) goto L_0x0308
            X.2R2 r0 = X.AnonymousClass2R2.A1I     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0308:
            if (r43 == 0) goto L_0x030f
            X.2R2 r0 = X.AnonymousClass2R2.A0z     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x030f:
            if (r29 == 0) goto L_0x0316
            X.2R2 r0 = X.AnonymousClass2R2.A07     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0316:
            if (r13 == 0) goto L_0x0324
            X.2R2 r0 = X.AnonymousClass2R2.A1B     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0324
            X.2R2 r0 = X.AnonymousClass2R2.A0W     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0324:
            if (r26 == 0) goto L_0x0332
            X.2R2 r0 = X.AnonymousClass2R2.A0n     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0332
            X.2R2 r0 = X.AnonymousClass2R2.A0Q     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0332:
            if (r27 == 0) goto L_0x0340
            X.2R2 r0 = X.AnonymousClass2R2.A1D     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0340
            X.2R2 r0 = X.AnonymousClass2R2.A0Y     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0340:
            if (r24 == 0) goto L_0x034e
            X.2R2 r0 = X.AnonymousClass2R2.A1F     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x034e
            X.2R2 r0 = X.AnonymousClass2R2.A0a     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x034e:
            if (r23 == 0) goto L_0x035c
            X.2R2 r0 = X.AnonymousClass2R2.A0c     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x035c
            X.2R2 r0 = X.AnonymousClass2R2.A0O     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x035c:
            if (r22 == 0) goto L_0x036a
            X.2R2 r0 = X.AnonymousClass2R2.A02     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x036a
            X.2R2 r0 = X.AnonymousClass2R2.A0K     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x036a:
            if (r21 == 0) goto L_0x0378
            X.2R2 r0 = X.AnonymousClass2R2.A08     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0378
            X.2R2 r0 = X.AnonymousClass2R2.A0M     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0378:
            if (r20 == 0) goto L_0x0386
            X.2R2 r0 = X.AnonymousClass2R2.A19     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
            if (r25 == 0) goto L_0x0386
            X.2R2 r0 = X.AnonymousClass2R2.A0U     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0386:
            if (r19 == 0) goto L_0x038d
            X.2R2 r0 = X.AnonymousClass2R2.A0x     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x038d:
            if (r18 == 0) goto L_0x0394
            X.2R2 r0 = X.AnonymousClass2R2.A0v     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x0394:
            if (r14 == 0) goto L_0x039b
            X.2R2 r0 = X.AnonymousClass2R2.A0p     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x039b:
            if (r34 == 0) goto L_0x03a2
            X.2R2 r0 = X.AnonymousClass2R2.A0r     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x03a2:
            if (r28 == 0) goto L_0x03a9
            X.2R2 r0 = X.AnonymousClass2R2.A17     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x03a9:
            if (r1 == 0) goto L_0x03b0
            X.2R2 r0 = X.AnonymousClass2R2.A0E     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x03b0:
            if (r30 == 0) goto L_0x03ba
            X.2R2 r0 = X.AnonymousClass2R2.A0G     // Catch:{ all -> 0x06dd }
            goto L_0x03b7
        L_0x03b5:
            X.2R2 r0 = X.AnonymousClass2R2.A0H     // Catch:{ all -> 0x06dd }
        L_0x03b7:
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x03ba:
            X.1M9 r0 = r4.A05     // Catch:{ all -> 0x06db }
            X.1E7 r13 = r0.A0E(r6)     // Catch:{ all -> 0x06db }
            if (r13 != 0) goto L_0x03dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06db }
            r1.<init>()     // Catch:{ all -> 0x06db }
            java.lang.String r0 = "ChatMessageCounts/recordEngagementConversationRows/Can't get contact for jid - "
            r1.append(r0)     // Catch:{ all -> 0x06db }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x06db }
            r1.append(r0)     // Catch:{ all -> 0x06db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06db }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06db }
            goto L_0x045e
        L_0x03dc:
            boolean r0 = X.C22971Dz.A0e(r6)     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x03f7
            java.lang.Boolean r0 = r8.A0B     // Catch:{ all -> 0x06db }
            if (r0 != 0) goto L_0x045e
            r0 = 8278(0x2056, float:1.16E-41)
            boolean r0 = X.C18020vd.A05(r9, r12, r0)     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x045e
            r0 = r41 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06db }
            r8.A0B = r0     // Catch:{ all -> 0x06db }
            goto L_0x045e
        L_0x03f7:
            java.lang.Boolean r0 = r8.A0B     // Catch:{ all -> 0x06db }
            if (r0 != 0) goto L_0x040f
            r0 = r41 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06db }
            r8.A0B = r0     // Catch:{ all -> 0x06db }
            if (r41 != 0) goto L_0x040f
            if (r7 == 0) goto L_0x040f
            long r0 = r7.A0G     // Catch:{ all -> 0x06db }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06db }
            r8.A0R = r0     // Catch:{ all -> 0x06db }
        L_0x040f:
            boolean r0 = r13.A0C()     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x0421
            java.lang.Long r1 = r8.A0F     // Catch:{ all -> 0x06db }
            if (r1 != 0) goto L_0x0428
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06db }
            r8.A0F = r0     // Catch:{ all -> 0x06db }
        L_0x0421:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x06db }
            r8.A0C = r0     // Catch:{ all -> 0x06db }
            goto L_0x0442
        L_0x0428:
            java.lang.Boolean r0 = r8.A0C     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x0421
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x06db }
            r0 = r0 ^ r41
            if (r0 == 0) goto L_0x0421
            long r12 = r1.longValue()     // Catch:{ all -> 0x06db }
            r0 = 1
            long r12 = r12 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06db }
            r8.A0F = r0     // Catch:{ all -> 0x06db }
            goto L_0x0421
        L_0x0442:
            if (r41 == 0) goto L_0x045e
            java.lang.Long r9 = r8.A0R     // Catch:{ all -> 0x06db }
            if (r9 == 0) goto L_0x045e
            java.lang.Long r0 = r8.A0S     // Catch:{ all -> 0x06db }
            if (r0 != 0) goto L_0x045e
            if (r7 == 0) goto L_0x045e
            long r0 = r7.A0I     // Catch:{ all -> 0x06db }
            long r12 = r9.longValue()     // Catch:{ all -> 0x06db }
            long r0 = r0 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06db }
            r8.A0S = r0     // Catch:{ all -> 0x06db }
        L_0x045e:
            r9 = r7
            if (r43 == 0) goto L_0x0479
            X.1WM r0 = r4.A0K     // Catch:{ all -> 0x06db }
            X.212 r1 = r0.A0C(r3)     // Catch:{ all -> 0x06db }
            if (r1 == 0) goto L_0x04ee
            X.00H r0 = r0.A0F     // Catch:{ all -> 0x06db }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x06db }
            X.1W6 r9 = (X.AnonymousClass1W6) r9     // Catch:{ all -> 0x06db }
            long r0 = r1.A02     // Catch:{ all -> 0x06db }
            X.1W2 r9 = r9.A01     // Catch:{ all -> 0x06db }
            X.206 r9 = r9.A03(r0)     // Catch:{ all -> 0x06db }
        L_0x0479:
            if (r9 == 0) goto L_0x04ee
            X.206 r13 = r9.A0K()     // Catch:{ all -> 0x06db }
            r14 = 1
            if (r10 == 0) goto L_0x048e
            if (r13 == 0) goto L_0x048e
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r13.A11(r0)     // Catch:{ all -> 0x06db }
            r15 = 1
            if (r0 != 0) goto L_0x048f
        L_0x048e:
            r15 = 0
        L_0x048f:
            r12 = 0
            X.1R3 r0 = r4.A0E     // Catch:{ all -> 0x06db }
            java.util.ArrayList r1 = r0.A08(r6, r14)     // Catch:{ all -> 0x06db }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x06db }
            if (r0 != 0) goto L_0x04a3
            r0 = 0
            java.lang.Object r12 = r1.get(r0)     // Catch:{ all -> 0x06db }
            X.206 r12 = (X.AnonymousClass206) r12     // Catch:{ all -> 0x06db }
        L_0x04a3:
            if (r41 == 0) goto L_0x04b5
            if (r43 != 0) goto L_0x04b5
            if (r13 != 0) goto L_0x04b5
            if (r12 == 0) goto L_0x04b5
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r1 = r12.A11(r0)     // Catch:{ all -> 0x06db }
            r0 = 1
            if (r1 != 0) goto L_0x04b6
        L_0x04b5:
            r0 = 0
        L_0x04b6:
            if (r15 != 0) goto L_0x04ba
            if (r0 == 0) goto L_0x04bf
        L_0x04ba:
            X.2R2 r0 = X.AnonymousClass2R2.A0j     // Catch:{ all -> 0x06db }
            r8.A00(r0)     // Catch:{ all -> 0x06db }
        L_0x04bf:
            if (r43 == 0) goto L_0x04cf
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r9.A11(r0)     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x04cf
            X.2R2 r0 = X.AnonymousClass2R2.A0h     // Catch:{ all -> 0x06db }
            r8.A00(r0)     // Catch:{ all -> 0x06db }
        L_0x04cf:
            if (r41 == 0) goto L_0x04e0
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r9.A11(r0)     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x04ee
            X.2R2 r0 = X.AnonymousClass2R2.A0k     // Catch:{ all -> 0x06db }
            r8.A00(r0)     // Catch:{ all -> 0x06db }
            goto L_0x04ee
        L_0x04e0:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r9.A11(r0)     // Catch:{ all -> 0x06db }
            if (r0 == 0) goto L_0x04ee
            X.2R2 r0 = X.AnonymousClass2R2.A0i     // Catch:{ all -> 0x06db }
            r8.A00(r0)     // Catch:{ all -> 0x06db }
        L_0x04ee:
            if (r7 == 0) goto L_0x04fb
            boolean r0 = r7.A0l     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x04fb
            if (r41 != 0) goto L_0x04fb
            X.2R2 r0 = X.AnonymousClass2R2.A05     // Catch:{ all -> 0x06dd }
            r8.A00(r0)     // Catch:{ all -> 0x06dd }
        L_0x04fb:
            r1 = r33
            r0 = r32
            A02(r1, r8, r0)     // Catch:{ all -> 0x06dd }
            boolean r0 = X.C22971Dz.A0e(r6)     // Catch:{ all -> 0x06dd }
            if (r0 != 0) goto L_0x05e2
            android.content.SharedPreferences r13 = A00(r4)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x06dd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06dd }
            r1.<init>()     // Catch:{ all -> 0x06dd }
            r1.append(r0)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "_commerce"
            r1.append(r0)     // Catch:{ all -> 0x06dd }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r13.getString(r9, r0)     // Catch:{ all -> 0x06dd }
            X.2kC r12 = X.C58132kC.A00(r0)     // Catch:{ all -> 0x06dd }
            java.lang.Object r0 = r36.get()     // Catch:{ all -> 0x06dd }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x06dd }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x06dd }
            X.206 r14 = r0.A05(r3)     // Catch:{ all -> 0x06dd }
            if (r14 == 0) goto L_0x0597
            boolean r8 = r14 instanceof X.AnonymousClass22U     // Catch:{ all -> 0x06dd }
            if (r8 != 0) goto L_0x0561
            boolean r0 = r14 instanceof X.AnonymousClass22Q     // Catch:{ all -> 0x06dd }
            if (r0 != 0) goto L_0x0561
            int r1 = r14.A0u     // Catch:{ all -> 0x06dd }
            r0 = 52
            if (r1 == r0) goto L_0x0561
            r0 = 54
            if (r1 == r0) goto L_0x0561
            boolean r0 = r14 instanceof X.AnonymousClass210     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x0597
            java.lang.String r7 = r14.A0P()     // Catch:{ all -> 0x06dd }
            X.1i4 r1 = r4.A0L     // Catch:{ all -> 0x06dd }
            boolean r0 = r1.A0J(r7)     // Catch:{ all -> 0x06dd }
            if (r0 != 0) goto L_0x0561
            boolean r0 = r1.A0K(r7)     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x0597
        L_0x0561:
            if (r41 == 0) goto L_0x058e
            if (r8 == 0) goto L_0x0579
            java.lang.Long r0 = r12.A03     // Catch:{ all -> 0x06dd }
            r7 = 1
            if (r0 != 0) goto L_0x056e
            r0 = 0
            goto L_0x0572
        L_0x056e:
            long r0 = r0.longValue()     // Catch:{ all -> 0x06dd }
        L_0x0572:
            long r0 = r0 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06dd }
            r12.A03 = r0     // Catch:{ all -> 0x06dd }
        L_0x0579:
            java.lang.Long r0 = r12.A02     // Catch:{ all -> 0x06dd }
            r7 = 1
            if (r0 != 0) goto L_0x0582
            r0 = 0
            goto L_0x0586
        L_0x0582:
            long r0 = r0.longValue()     // Catch:{ all -> 0x06dd }
        L_0x0586:
            long r0 = r0 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06dd }
            r12.A02 = r0     // Catch:{ all -> 0x06dd }
            goto L_0x05d3
        L_0x058e:
            java.lang.Long r0 = r12.A01     // Catch:{ all -> 0x06dd }
            r7 = 1
            if (r0 != 0) goto L_0x05c8
            r0 = 0
            goto L_0x05cc
        L_0x0597:
            boolean r0 = r14 instanceof X.AnonymousClass210     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x05e2
            if (r41 == 0) goto L_0x0682
            X.206 r1 = r14.A0K()     // Catch:{ all -> 0x06dd }
            boolean r0 = r1 instanceof X.AnonymousClass22Q     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x05d3
            X.22Q r1 = (X.AnonymousClass22Q) r1     // Catch:{ all -> 0x06dd }
            X.205 r0 = r1.A0v     // Catch:{ all -> 0x06dd }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x05d3
            java.lang.Long r0 = r12.A05     // Catch:{ all -> 0x06dd }
            r7 = 1
            if (r0 != 0) goto L_0x05bc
            r0 = 0
            goto L_0x05c0
        L_0x05bc:
            long r0 = r0.longValue()     // Catch:{ all -> 0x06dd }
        L_0x05c0:
            long r0 = r0 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06dd }
            r12.A05 = r0     // Catch:{ all -> 0x06dd }
            goto L_0x05d3
        L_0x05c8:
            long r0 = r0.longValue()     // Catch:{ all -> 0x06dd }
        L_0x05cc:
            long r0 = r0 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06dd }
            r12.A01 = r0     // Catch:{ all -> 0x06dd }
        L_0x05d3:
            android.content.SharedPreferences$Editor r1 = r13.edit()     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x06dd }
            android.content.SharedPreferences$Editor r0 = r1.putString(r9, r0)     // Catch:{ all -> 0x06dd }
            r0.apply()     // Catch:{ all -> 0x06dd }
        L_0x05e2:
            if (r41 == 0) goto L_0x0682
            X.1BI r7 = r3.A00     // Catch:{ all -> 0x06dd }
            boolean r0 = X.C22971Dz.A0O(r7)     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x05f1
            X.2R2 r0 = X.AnonymousClass2R2.A06     // Catch:{ all -> 0x06dd }
            r4.A0A(r0, r6)     // Catch:{ all -> 0x06dd }
        L_0x05f1:
            X.1i6 r1 = r4.A07     // Catch:{ all -> 0x06dd }
            if (r7 == 0) goto L_0x0682
            android.content.SharedPreferences r9 = X.C33001i6.A00(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r3 = r3.A01     // Catch:{ all -> 0x06dd }
            java.lang.String r8 = X.C33001i6.A02(r7, r3)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = ""
            java.lang.String r8 = r9.getString(r8, r0)     // Catch:{ all -> 0x06dd }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x06dd }
            if (r0 == 0) goto L_0x060c
            goto L_0x0613
        L_0x060c:
            java.lang.String r0 = "quick_reply"
            boolean r0 = r8.contains(r0)     // Catch:{ all -> 0x06dd }
            goto L_0x0614
        L_0x0613:
            r0 = 0
        L_0x0614:
            r12 = 3
            if (r0 == 0) goto L_0x063e
            r0 = r35
            boolean r0 = r0.A0O(r6)     // Catch:{ all -> 0x06dd }
            if (r0 != 0) goto L_0x062b
            X.10s r9 = r4.A0T     // Catch:{ all -> 0x06dd }
            r8 = 32
            X.Akb r0 = new X.Akb     // Catch:{ all -> 0x06dd }
            r0.<init>((X.C32951i1) r4, (X.AnonymousClass1BI) r6, (int) r12, (int) r8)     // Catch:{ all -> 0x06dd }
            r9.execute(r0)     // Catch:{ all -> 0x06dd }
        L_0x062b:
            android.content.SharedPreferences r0 = X.C33001i6.A00(r1)     // Catch:{ all -> 0x06dd }
            android.content.SharedPreferences$Editor r8 = r0.edit()     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = X.C33001i6.A02(r7, r3)     // Catch:{ all -> 0x06dd }
            android.content.SharedPreferences$Editor r0 = r8.remove(r0)     // Catch:{ all -> 0x06dd }
            r0.apply()     // Catch:{ all -> 0x06dd }
        L_0x063e:
            android.content.SharedPreferences r9 = X.C33001i6.A01(r1)     // Catch:{ all -> 0x06dd }
            java.lang.String r8 = X.C33001i6.A02(r7, r3)     // Catch:{ all -> 0x06dd }
            r0 = 0
            int r8 = r9.getInt(r8, r0)     // Catch:{ all -> 0x06dd }
            if (r8 == 0) goto L_0x0682
            r0 = 1
            if (r8 == r0) goto L_0x0664
            r0 = 2
            if (r8 == r0) goto L_0x065e
            if (r8 == r12) goto L_0x066a
            r0 = 4
            if (r8 != r0) goto L_0x066f
            X.2R2 r0 = X.AnonymousClass2R2.A16     // Catch:{ all -> 0x06dd }
            r4.A0A(r0, r6)     // Catch:{ all -> 0x06dd }
            goto L_0x066f
        L_0x065e:
            X.2R2 r0 = X.AnonymousClass2R2.A0f     // Catch:{ all -> 0x06dd }
            r4.A0A(r0, r6)     // Catch:{ all -> 0x06dd }
            goto L_0x066f
        L_0x0664:
            X.2R2 r0 = X.AnonymousClass2R2.A0t     // Catch:{ all -> 0x06dd }
            r4.A0A(r0, r6)     // Catch:{ all -> 0x06dd }
            goto L_0x066f
        L_0x066a:
            X.2R2 r0 = X.AnonymousClass2R2.A0e     // Catch:{ all -> 0x06dd }
            r4.A0A(r0, r6)     // Catch:{ all -> 0x06dd }
        L_0x066f:
            android.content.SharedPreferences r0 = X.C33001i6.A01(r1)     // Catch:{ all -> 0x06dd }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = X.C33001i6.A02(r7, r3)     // Catch:{ all -> 0x06dd }
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x06dd }
            r0.apply()     // Catch:{ all -> 0x06dd }
        L_0x0682:
            if (r17 == 0) goto L_0x06b2
            android.content.SharedPreferences r12 = A00(r4)     // Catch:{ all -> 0x06dd }
            java.lang.String r1 = r6.getRawString()     // Catch:{ all -> 0x06dd }
            int r0 = r17.intValue()     // Catch:{ all -> 0x06dd }
            java.lang.String r9 = A01(r1, r0)     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = "0"
            java.lang.String r3 = r12.getString(r9, r0)     // Catch:{ all -> 0x06dd }
            r0 = 0
            long r7 = X.C20099A7c.A04(r3, r0)     // Catch:{ all -> 0x06dd }
            r0 = 1
            long r7 = r7 + r0
            android.content.SharedPreferences$Editor r1 = r12.edit()     // Catch:{ all -> 0x06dd }
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x06dd }
            android.content.SharedPreferences$Editor r0 = r1.putString(r9, r0)     // Catch:{ all -> 0x06dd }
            r0.apply()     // Catch:{ all -> 0x06dd }
        L_0x06b2:
            if (r5 == 0) goto L_0x0100
            android.content.SharedPreferences r7 = A00(r4)     // Catch:{ all -> 0x06df }
            X.1iO r3 = r4.A0m     // Catch:{ all -> 0x06df }
            X.2me r1 = new X.2me     // Catch:{ all -> 0x06df }
            r0 = r16
            r1.<init>(r2, r0, r11, r10)     // Catch:{ all -> 0x06df }
            r0 = 3
            X.C18070vi.A0d(r7, r0)     // Catch:{ all -> 0x06df }
            java.util.Set r0 = r3.A00     // Catch:{ all -> 0x06df }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x06df }
        L_0x06cb:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x06df }
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x06df }
            X.1iL r0 = (X.C33141iL) r0     // Catch:{ all -> 0x06df }
            r0.CDb(r7, r6, r5, r1)     // Catch:{ all -> 0x06df }
            goto L_0x06cb
        L_0x06db:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06dd }
        L_0x06dd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06df }
        L_0x06df:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32951i1.A04(X.1i1, X.1BI, com.whatsapp.jid.UserJid, X.205, java.lang.Integer, boolean, boolean, boolean):void");
    }

    private void A06(AnonymousClass1BI r4, C32961i2 r5, boolean z) {
        if (A0n.contains(r5)) {
            if (C18020vd.A05(C18040vf.A02, this.A0N, 10292)) {
                this.A0T.execute(new AnonymousClass7RF(this, r4, 28, z));
            }
        }
    }

    public static boolean A07(C32951i1 r0, AnonymousClass206 r1, AnonymousClass205 r2) {
        if (r1 == null && r0.A0K.A09(r2) == 56) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x06d6, code lost:
        if ("null".equals(r1) != false) goto L_0x06d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0cff, code lost:
        if (r1 == 1) goto L_0x0d01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0e6f, code lost:
        if (r10.A0k == false) goto L_0x0e71;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x051d A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0586 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x05c9 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x061d A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x06c3 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0702 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0765 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x07e5 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x07fa A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x08c8 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x08e6 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x08f7 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0908 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0976 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0986 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x09aa A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x09f3 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0a22 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0a8a A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0b68 A[Catch:{ all -> 0x117e }, LOOP:2: B:256:0x0b62->B:258:0x0b68, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0bb1 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0bce A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0c67 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0c7d A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0cba A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0cca A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0cfc A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0d1a A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0d30 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0d7e A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0d8c A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0d9b A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0db1 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0dfe A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0e19 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0e59 A[ADDED_TO_REGION, Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0ebf A[Catch:{ all -> 0x116d, all -> 0x1174, all -> 0x1179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0ede A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0f46 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0ff4 A[Catch:{ all -> 0x117e }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0484 A[Catch:{ all -> 0x117e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A09() {
        /*
            r44 = this;
            r8 = r44
            monitor-enter(r8)
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.11P r0 = r8.A0i     // Catch:{ all -> 0x1253 }
            r43 = r0
            long r25 = X.AnonymousClass11P.A01(r43)     // Catch:{ all -> 0x1253 }
            X.1Nl r0 = r8.A0O     // Catch:{ all -> 0x1253 }
            r42 = r0
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            long r22 = r0.A02(r1)     // Catch:{ all -> 0x1253 }
            long r20 = r25 - r22
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x1251
            java.util.Map r0 = r2.getAll()     // Catch:{ all -> 0x1253 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x1253 }
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch:{ all -> 0x1253 }
            r3.<init>()     // Catch:{ all -> 0x1253 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x1253 }
        L_0x0036:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x006c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "thread_user_secret"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0036
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "_"
            int r1 = r2.lastIndexOf(r0)     // Catch:{ all -> 0x1253 }
            r0 = -1
            if (r1 == r0) goto L_0x0068
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ all -> 0x1253 }
        L_0x0068:
            r3.add(r2)     // Catch:{ all -> 0x1253 }
            goto L_0x0036
        L_0x006c:
            java.util.Iterator r30 = r3.iterator()     // Catch:{ all -> 0x1253 }
        L_0x0070:
            boolean r0 = r30.hasNext()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x1188
            java.lang.Object r1 = r30.next()     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x1253 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x1253 }
            X.1BI r7 = r0.A02(r1)     // Catch:{ all -> 0x1253 }
            if (r7 == 0) goto L_0x0070
            X.2HW r6 = new X.2HW     // Catch:{ all -> 0x1253 }
            r6.<init>()     // Catch:{ all -> 0x1253 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r22 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2Y = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = X.C50542Uv.A00()     // Catch:{ all -> 0x1253 }
            r6.A2y = r0     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x025f
            X.2S9 r4 = X.C60332nq.A00(r1)     // Catch:{ all -> 0x1253 }
            long r0 = r4.A07     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A21 = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A06     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A20 = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A01     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1L = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A00     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1K = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A0A     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2v = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A09     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2u = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A08     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2t = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0M     // Catch:{ all -> 0x1253 }
            r6.A1M = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0y     // Catch:{ all -> 0x1253 }
            r6.A2H = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0x     // Catch:{ all -> 0x1253 }
            r6.A2G = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1A     // Catch:{ all -> 0x1253 }
            r6.A2d = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A18     // Catch:{ all -> 0x1253 }
            r6.A2b = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0n     // Catch:{ all -> 0x1253 }
            r6.A1p = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0o     // Catch:{ all -> 0x1253 }
            r6.A1q = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0H     // Catch:{ all -> 0x1253 }
            r6.A0x = r0     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = r4.A0B     // Catch:{ all -> 0x1253 }
            r6.A0G = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0F     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0121
            long r2 = r0.longValue()     // Catch:{ all -> 0x1253 }
            r0 = 2
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1253 }
            r6.A0m = r0     // Catch:{ all -> 0x1253 }
        L_0x0121:
            java.lang.Long r0 = r4.A0S     // Catch:{ all -> 0x1253 }
            r6.A1R = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0G     // Catch:{ all -> 0x1253 }
            r6.A0w = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A15     // Catch:{ all -> 0x1253 }
            r6.A2Q = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A14     // Catch:{ all -> 0x1253 }
            r6.A2O = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A13     // Catch:{ all -> 0x1253 }
            r6.A2N = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0L     // Catch:{ all -> 0x1253 }
            r6.A1G = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0I     // Catch:{ all -> 0x1253 }
            r6.A1B = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0O     // Catch:{ all -> 0x1253 }
            r6.A1O = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0N     // Catch:{ all -> 0x1253 }
            r6.A1N = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0Q     // Catch:{ all -> 0x1253 }
            r6.A1Q = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0P     // Catch:{ all -> 0x1253 }
            r6.A1P = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1E     // Catch:{ all -> 0x1253 }
            r6.A2j = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0s     // Catch:{ all -> 0x1253 }
            r6.A2B = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1G     // Catch:{ all -> 0x1253 }
            r6.A2p = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1D     // Catch:{ all -> 0x1253 }
            r6.A2i = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0r     // Catch:{ all -> 0x1253 }
            r6.A2A = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1F     // Catch:{ all -> 0x1253 }
            r6.A2o = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0g     // Catch:{ all -> 0x1253 }
            r6.A1f = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0c     // Catch:{ all -> 0x1253 }
            r6.A1b = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0i     // Catch:{ all -> 0x1253 }
            r6.A1h = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0f     // Catch:{ all -> 0x1253 }
            r6.A1e = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0b     // Catch:{ all -> 0x1253 }
            r6.A1a = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0h     // Catch:{ all -> 0x1253 }
            r6.A1g = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0a     // Catch:{ all -> 0x1253 }
            r6.A1Z = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0Z     // Catch:{ all -> 0x1253 }
            r6.A1Y = r0     // Catch:{ all -> 0x1253 }
            X.0ve r3 = r8.A0N     // Catch:{ all -> 0x1253 }
            r0 = 5963(0x174b, float:8.356E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C18020vd.A05(r2, r3, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0205
            java.lang.Long r0 = r4.A1I     // Catch:{ all -> 0x1253 }
            r6.A2s = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1H     // Catch:{ all -> 0x1253 }
            r6.A2r = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0k     // Catch:{ all -> 0x1253 }
            r6.A1j = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0j     // Catch:{ all -> 0x1253 }
            r6.A1i = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0m     // Catch:{ all -> 0x1253 }
            r6.A1l = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0l     // Catch:{ all -> 0x1253 }
            r6.A1k = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0Y     // Catch:{ all -> 0x1253 }
            r6.A1X = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0X     // Catch:{ all -> 0x1253 }
            r6.A1W = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0E     // Catch:{ all -> 0x1253 }
            r6.A0k = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0D     // Catch:{ all -> 0x1253 }
            r6.A0j = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0U     // Catch:{ all -> 0x1253 }
            r6.A1T = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0T     // Catch:{ all -> 0x1253 }
            r6.A1S = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0K     // Catch:{ all -> 0x1253 }
            r6.A1F = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0J     // Catch:{ all -> 0x1253 }
            r6.A1E = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0W     // Catch:{ all -> 0x1253 }
            r6.A1V = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0V     // Catch:{ all -> 0x1253 }
            r6.A1U = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1C     // Catch:{ all -> 0x1253 }
            r6.A2f = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A1B     // Catch:{ all -> 0x1253 }
            r6.A2e = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0e     // Catch:{ all -> 0x1253 }
            r6.A1d = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0d     // Catch:{ all -> 0x1253 }
            r6.A1c = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A12     // Catch:{ all -> 0x1253 }
            r6.A2L = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A11     // Catch:{ all -> 0x1253 }
            r6.A2K = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A10     // Catch:{ all -> 0x1253 }
            r6.A2J = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0z     // Catch:{ all -> 0x1253 }
            r6.A2I = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0u     // Catch:{ all -> 0x1253 }
            r6.A2D = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0t     // Catch:{ all -> 0x1253 }
            r6.A2C = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0w     // Catch:{ all -> 0x1253 }
            r6.A2F = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0v     // Catch:{ all -> 0x1253 }
            r6.A2E = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A19     // Catch:{ all -> 0x1253 }
            r6.A2c = r0     // Catch:{ all -> 0x1253 }
        L_0x0205:
            long r0 = r4.A05     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2W = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A03     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2V = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A04     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2T = r0     // Catch:{ all -> 0x1253 }
            long r0 = r4.A02     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2S = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A0q     // Catch:{ all -> 0x1253 }
            r6.A1z = r0     // Catch:{ all -> 0x1253 }
            r0 = 8728(0x2218, float:1.223E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x025f
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            X.1cg r0 = X.C29671cg.A00     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x1253 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x025f
            java.lang.Long r0 = r4.A16     // Catch:{ all -> 0x1253 }
            r2 = 0
            if (r0 == 0) goto L_0x1142
            long r0 = r0.longValue()     // Catch:{ all -> 0x1253 }
        L_0x024b:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2Z = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r4.A17     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0259
            long r2 = r0.longValue()     // Catch:{ all -> 0x1253 }
        L_0x0259:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1253 }
            r6.A2a = r0     // Catch:{ all -> 0x1253 }
        L_0x025f:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_businessTools"
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x02a5
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.Long r3 = X.C63782tg.A05(r4, r0)     // Catch:{ all -> 0x1253 }
            r0 = 1
            java.lang.Long r2 = X.C63782tg.A05(r4, r0)     // Catch:{ all -> 0x1253 }
            r0 = 2
            java.lang.Long r1 = X.C63782tg.A05(r4, r0)     // Catch:{ all -> 0x1253 }
            r0 = 3
            java.lang.Long r0 = X.C63782tg.A05(r4, r0)     // Catch:{ all -> 0x1253 }
            r6.A1v = r3     // Catch:{ all -> 0x1253 }
            r6.A0l = r2     // Catch:{ all -> 0x1253 }
            r6.A1o = r1     // Catch:{ all -> 0x1253 }
            r6.A2M = r0     // Catch:{ all -> 0x1253 }
        L_0x02a5:
            X.1NK r0 = r8.A0F     // Catch:{ all -> 0x1183 }
            r41 = r0
            r9 = 0
            long r0 = r0.A05(r7, r9)     // Catch:{ all -> 0x1183 }
            r3 = 1
            r12 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x047b
            X.00H r2 = r8.A0Z     // Catch:{ all -> 0x1183 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x1183 }
            X.1W6 r2 = (X.AnonymousClass1W6) r2     // Catch:{ all -> 0x1183 }
            X.1W2 r2 = r2.A01     // Catch:{ all -> 0x1183 }
            X.206 r14 = r2.A03(r0)     // Catch:{ all -> 0x1183 }
            if (r14 != 0) goto L_0x02db
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1183 }
            r3.<init>()     // Catch:{ all -> 0x1183 }
            java.lang.String r2 = "ChatMessageCounts/getGaStatus/Null message for id - "
            r3.append(r2)     // Catch:{ all -> 0x1183 }
            r3.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x1183 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1183 }
            goto L_0x047b
        L_0x02db:
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x1183 }
            r0 = 11
            r1.set(r0, r9)     // Catch:{ all -> 0x1183 }
            r0 = 12
            r1.set(r0, r9)     // Catch:{ all -> 0x1183 }
            r0 = 13
            r1.set(r0, r9)     // Catch:{ all -> 0x1183 }
            r0 = 14
            r1.set(r0, r9)     // Catch:{ all -> 0x1183 }
            long r2 = r1.getTimeInMillis()     // Catch:{ all -> 0x1183 }
            long r31 = r2 - r16
            long r27 = r42.A01()     // Catch:{ all -> 0x1183 }
            r11 = 1
            int[] r10 = new int[r11]     // Catch:{ all -> 0x1183 }
            r0 = 7
            r10[r9] = r0     // Catch:{ all -> 0x1183 }
            X.1NJ r15 = r8.A0G     // Catch:{ all -> 0x1183 }
            X.1CJ r0 = r15.A01     // Catch:{ all -> 0x1183 }
            X.1ci r13 = X.AnonymousClass1CJ.A00(r0, r7)     // Catch:{ all -> 0x1183 }
            r0 = -9223372036854775808
            if (r13 == 0) goto L_0x0398
            long r4 = r13.A0J     // Catch:{ all -> 0x1183 }
            int r18 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r18 != 0) goto L_0x0396
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1183 }
            r1.<init>()     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x1183 }
            r4.<init>()     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = " AND "
            r4.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = X.C26121Qx.A00(r10)     // Catch:{ all -> 0x1183 }
            r4.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x1183 }
            r1.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r5 = "sort_id"
            r1.append(r5)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = " ASC LIMIT 1"
            r1.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x1183 }
            java.lang.String[] r1 = new java.lang.String[r11]     // Catch:{ all -> 0x1183 }
            X.1LW r0 = r15.A00     // Catch:{ all -> 0x1183 }
            long r18 = r0.A09(r7)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x1183 }
            r1[r9] = r0     // Catch:{ all -> 0x1183 }
            X.1Cd r0 = r15.A02     // Catch:{ all -> 0x1183 }
            X.1at r18 = r0.get()     // Catch:{ all -> 0x1183 }
            r0 = r18
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1152 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x1152 }
            java.lang.String r0 = "GET_FIRST_SORT_REF_SQL_EXCLUDE_TYPES"
            android.database.Cursor r4 = r15.A0A(r4, r0, r1)     // Catch:{ all -> 0x1152 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x1146 }
            if (r0 == 0) goto L_0x037c
            int r0 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x1146 }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x1146 }
            r13.A0J = r0     // Catch:{ all -> 0x1146 }
            goto L_0x0390
        L_0x037c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1146 }
            r1.<init>()     // Catch:{ all -> 0x1146 }
            java.lang.String r0 = "msgstore/getfirstsortrefexcludetypes can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x1146 }
            r1.append(r7)     // Catch:{ all -> 0x1146 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1146 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x1146 }
        L_0x0390:
            r4.close()     // Catch:{ all -> 0x1152 }
            r18.close()     // Catch:{ all -> 0x1183 }
        L_0x0396:
            long r0 = r13.A0J     // Catch:{ all -> 0x1183 }
        L_0x0398:
            X.121 r4 = r8.A0C     // Catch:{ all -> 0x1183 }
            X.206 r4 = r4.BUh(r0)     // Catch:{ all -> 0x1183 }
            if (r4 != 0) goto L_0x03b6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1183 }
            r3.<init>()     // Catch:{ all -> 0x1183 }
            java.lang.String r2 = "Failed to get message from coreMessageStore, sortId - "
            r3.append(r2)     // Catch:{ all -> 0x1183 }
            r3.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x1183 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1183 }
            goto L_0x047b
        L_0x03b6:
            long r0 = r4.A0I     // Catch:{ all -> 0x1183 }
            int r4 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r4 <= 0) goto L_0x03c2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1183 }
            goto L_0x047c
        L_0x03c2:
            r4 = r41
            r0 = r31
            long r27 = r4.A07(r7, r10, r0)     // Catch:{ all -> 0x1183 }
            long r18 = r4.A07(r7, r10, r2)     // Catch:{ all -> 0x1183 }
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x1183 }
            X.1LW r0 = r4.A00     // Catch:{ all -> 0x1183 }
            long r0 = r0.A09(r7)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1183 }
            r4 = 0
            r5[r9] = r0     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x1183 }
            r5[r11] = r0     // Catch:{ all -> 0x1183 }
            r1 = 2
            java.lang.String r0 = java.lang.Long.toString(r18)     // Catch:{ all -> 0x1183 }
            r5[r1] = r0     // Catch:{ all -> 0x1183 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x1183 }
            r9.<init>()     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND _id>? AND _id<=?"
            r9.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1183 }
            r1.<init>()     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = X.C26121Qx.A00(r10)     // Catch:{ all -> 0x1183 }
            r1.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1183 }
            r9.append(r0)     // Catch:{ all -> 0x1183 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x1183 }
            r0 = r41
            X.1Cd r0 = r0.A01     // Catch:{ all -> 0x1183 }
            X.1at r10 = r0.get()     // Catch:{ all -> 0x1183 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1163 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x1163 }
            java.lang.String r0 = "COUNT_MESSAGES_EXCLUDE_TYPES"
            android.database.Cursor r5 = r1.A0A(r9, r0, r5)     // Catch:{ all -> 0x1163 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x1157 }
            if (r0 == 0) goto L_0x0449
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x1157 }
            int r4 = r5.getInt(r0)     // Catch:{ all -> 0x1157 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1157 }
            r1.<init>()     // Catch:{ all -> 0x1157 }
            java.lang.String r0 = "msgstore/getmessagesatid pos:"
            r1.append(r0)     // Catch:{ all -> 0x1157 }
            r1.append(r4)     // Catch:{ all -> 0x1157 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1157 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1157 }
            goto L_0x045d
        L_0x0449:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1157 }
            r1.<init>()     // Catch:{ all -> 0x1157 }
            java.lang.String r0 = "msgstore/getmessagesatid/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x1157 }
            r1.append(r7)     // Catch:{ all -> 0x1157 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1157 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1157 }
        L_0x045d:
            r5.close()     // Catch:{ all -> 0x1163 }
            r10.close()     // Catch:{ all -> 0x1183 }
            long r4 = (long) r4     // Catch:{ all -> 0x1183 }
            long r0 = r14.A0I     // Catch:{ all -> 0x1183 }
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0475
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0475
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x1183 }
            goto L_0x047c
        L_0x0475:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1183 }
            goto L_0x047c
        L_0x047b:
            r0 = r12
        L_0x047c:
            r6.A0f = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C22971Dz.A0d(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x04fa
            r0 = r7
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x1253 }
            X.1M9 r1 = r8.A05     // Catch:{ all -> 0x1253 }
            X.1E7 r1 = r1.A0E(r0)     // Catch:{ all -> 0x1253 }
            if (r1 != 0) goto L_0x04a4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = "ChatMessageCounts/getBizCatalogType/Contact is null for jid - "
        L_0x0496:
            r2.append(r1)     // Catch:{ all -> 0x1253 }
            r2.append(r0)     // Catch:{ all -> 0x1253 }
        L_0x049c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x1253 }
        L_0x04a0:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1253 }
            goto L_0x04f2
        L_0x04a4:
            boolean r1 = r1.A0C()     // Catch:{ all -> 0x1253 }
            if (r1 == 0) goto L_0x04f2
            X.1Ty r1 = r8.A03     // Catch:{ all -> 0x1253 }
            X.AEW r1 = r1.A08(r0)     // Catch:{ all -> 0x1253 }
            if (r1 != 0) goto L_0x04ba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = "ChatMessageCounts/getBizCatalogType/Failed to get profile for jid - "
            goto L_0x0496
        L_0x04ba:
            java.lang.String r0 = "catalog"
            java.lang.String r1 = r1.A0E     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x04c5
            goto L_0x04ee
        L_0x04c5:
            java.lang.String r0 = "shop"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x04cf
            goto L_0x04f0
        L_0x04cf:
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x04f2
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x04eb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Unknown commerceExperience value - "
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            r2.append(r1)     // Catch:{ all -> 0x1253 }
            goto L_0x049c
        L_0x04eb:
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Empty commerceExperience value"
            goto L_0x04a0
        L_0x04ee:
            r0 = 1
            goto L_0x04f4
        L_0x04f0:
            r0 = 0
            goto L_0x04f4
        L_0x04f2:
            r0 = r12
            goto L_0x04f8
        L_0x04f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1253 }
        L_0x04f8:
            r6.A0X = r0     // Catch:{ all -> 0x1253 }
        L_0x04fa:
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_commerce"
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.getString(r0, r12)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0563
            X.2kC r1 = X.C58132kC.A00(r1)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x1253 }
            r6.A29 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x1253 }
            r6.A26 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A05     // Catch:{ all -> 0x1253 }
            r6.A28 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A04     // Catch:{ all -> 0x1253 }
            r6.A27 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x1253 }
            r6.A1D = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x1253 }
            r6.A1C = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = r1.A00     // Catch:{ all -> 0x1253 }
            r6.A19 = r0     // Catch:{ all -> 0x1253 }
            X.1M9 r0 = r8.A05     // Catch:{ all -> 0x1253 }
            X.1E7 r0 = r0.A0E(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0563
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0563
            boolean r0 = r1.A07     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0A = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r1.A09     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0C = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r1.A08     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0B = r0     // Catch:{ all -> 0x1253 }
        L_0x0563:
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_integrity"
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.getString(r0, r12)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x05bd
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x1253 }
            r0 = 0
            long r9 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 3
            long r4 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 1
            java.lang.Integer r3 = X.C63782tg.A03(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 2
            java.lang.Boolean r2 = X.C63782tg.A02(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 4
            java.lang.Boolean r1 = X.C63782tg.A02(r1, r0)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1253 }
            r6.A2X = r0     // Catch:{ all -> 0x1253 }
            r6.A0J = r1     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C22971Dz.A0e(r7)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x05b7
            r6.A0Y = r3     // Catch:{ all -> 0x1253 }
            r6.A09 = r2     // Catch:{ all -> 0x1253 }
        L_0x05b7:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x1253 }
            r6.A2U = r0     // Catch:{ all -> 0x1253 }
        L_0x05bd:
            X.0ve r5 = r8.A0N     // Catch:{ all -> 0x1253 }
            r13 = 8278(0x2056, float:1.16E-41)
            X.0vf r4 = X.C18040vf.A02     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C18020vd.A05(r4, r5, r13)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0601
            X.1M9 r0 = r8.A05     // Catch:{ all -> 0x1253 }
            X.1E7 r1 = r0.A0E(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = r6.A0J     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x05df
            if (r1 != 0) goto L_0x05d7
            r0 = 0
            goto L_0x05d9
        L_0x05d7:
            boolean r0 = r1.A0x     // Catch:{ all -> 0x1253 }
        L_0x05d9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0J = r0     // Catch:{ all -> 0x1253 }
        L_0x05df:
            java.lang.Boolean r0 = r6.A09     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0601
            boolean r0 = X.C22971Dz.A0d(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0601
            X.00H r0 = r8.A0W     // Catch:{ all -> 0x1253 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x1253 }
            X.1pj r1 = (X.C37551pj) r1     // Catch:{ all -> 0x1253 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r7)     // Catch:{ all -> 0x1253 }
            boolean r0 = r1.A0P(r0)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A09 = r0     // Catch:{ all -> 0x1253 }
        L_0x0601:
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_voip"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.getString(r0, r12)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x069f
            java.lang.String r0 = ","
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x1253 }
            r0 = 0
            long r39 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 1
            long r37 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 2
            long r35 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 3
            long r33 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 4
            long r31 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 5
            long r27 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 6
            long r18 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 7
            long r14 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 8
            long r11 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 9
            long r9 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            r0 = 10
            long r1 = X.C63782tg.A01(r1, r0)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r39)     // Catch:{ all -> 0x1253 }
            r6.A0z = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r37)     // Catch:{ all -> 0x1253 }
            r6.A0y = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r35)     // Catch:{ all -> 0x1253 }
            r6.A2k = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r33)     // Catch:{ all -> 0x1253 }
            r6.A2q = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x1253 }
            r6.A2w = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x1253 }
            r6.A12 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x1253 }
            r6.A14 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1253 }
            r6.A15 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x1253 }
            r6.A10 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1253 }
            r6.A11 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x1253 }
            r6.A13 = r0     // Catch:{ all -> 0x1253 }
        L_0x069f:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_discovery"
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x06eb
            java.lang.String r0 = ","
            java.lang.String[] r9 = r1.split(r0)     // Catch:{ all -> 0x1253 }
            r0 = 0
            int r3 = r9.length     // Catch:{ all -> 0x1253 }
            r2 = 0
            if (r3 <= r0) goto L_0x06d8
            r1 = r9[r0]     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x06d9
        L_0x06d8:
            r1 = r2
        L_0x06d9:
            r0 = 1
            if (r3 <= r0) goto L_0x06e7
            r3 = r9[r0]     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x06e7
            r2 = r3
        L_0x06e7:
            r6.A2z = r1     // Catch:{ all -> 0x1253 }
            r6.A30 = r2     // Catch:{ all -> 0x1253 }
        L_0x06eb:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = X.AnonymousClass72V.A03(r0)     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x075f
            r1 = 0
            X.C18070vi.A0d(r2, r1)     // Catch:{ all -> 0x1253 }
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x1253 }
            java.lang.String r3 = ","
            r0[r1] = r3     // Catch:{ all -> 0x1253 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r2, r0, r1)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x1253 }
            java.lang.Object[] r14 = r0.toArray(r1)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r14 = (java.lang.String[]) r14     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.Long r12 = X.C63782tg.A05(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 1
            java.lang.Boolean r11 = X.C63782tg.A02(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 2
            java.lang.Long r10 = X.C63782tg.A05(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 3
            java.lang.Long r9 = X.C63782tg.A05(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 4
            java.lang.Boolean r3 = X.C63782tg.A02(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 5
            java.lang.Boolean r2 = X.C63782tg.A02(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 6
            java.lang.Boolean r1 = X.C63782tg.A02(r14, r0)     // Catch:{ all -> 0x1253 }
            r0 = 7
            java.lang.Boolean r0 = X.C63782tg.A02(r14, r0)     // Catch:{ all -> 0x1253 }
            r6.A18 = r12     // Catch:{ all -> 0x1253 }
            r6.A0D = r11     // Catch:{ all -> 0x1253 }
            r6.A1x = r10     // Catch:{ all -> 0x1253 }
            r6.A1y = r9     // Catch:{ all -> 0x1253 }
            r6.A07 = r3     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x1253 }
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x1253 }
            r2 = 2
            if (r3 != 0) goto L_0x0755
            r2 = 1
        L_0x0755:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1253 }
            r6.A0Z = r2     // Catch:{ all -> 0x1253 }
            r6.A04 = r1     // Catch:{ all -> 0x1253 }
            r6.A05 = r0     // Catch:{ all -> 0x1253 }
        L_0x075f:
            boolean r0 = X.C18020vd.A05(r4, r5, r13)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x07bd
            java.lang.Boolean r0 = r6.A07     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0775
            X.1CJ r0 = r8.A0B     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A0Q(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A07 = r0     // Catch:{ all -> 0x1253 }
        L_0x0775:
            java.lang.Integer r0 = r6.A0Z     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0797
            X.1Nb r0 = r8.A0Q     // Catch:{ all -> 0x1253 }
            X.1yM r1 = r0.A0a(r7)     // Catch:{ all -> 0x1253 }
            boolean r1 = r1.A0A()     // Catch:{ all -> 0x1253 }
            X.1yM r0 = r0.A0a(r7)     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A0T     // Catch:{ all -> 0x1253 }
            if (r1 != 0) goto L_0x078d
            r1 = 1
            goto L_0x0791
        L_0x078d:
            r1 = 2
            if (r0 == 0) goto L_0x0791
            r1 = 3
        L_0x0791:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1253 }
            r6.A0Z = r0     // Catch:{ all -> 0x1253 }
        L_0x0797:
            java.lang.Boolean r0 = r6.A04     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x07bd
            X.1M9 r0 = r8.A05     // Catch:{ all -> 0x1253 }
            X.1E7 r2 = r0.A0E(r7)     // Catch:{ all -> 0x1253 }
            if (r2 == 0) goto L_0x07bd
            X.1BI r1 = r2.A0J     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C22971Dz.A0X(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x07bd
            X.1CJ r0 = r8.A0B     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A0P(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x07bd
            boolean r0 = r2.A0B()     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A04 = r0     // Catch:{ all -> 0x1253 }
        L_0x07bd:
            android.content.SharedPreferences r2 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            r3 = 0
            X.C18070vi.A0d(r0, r3)     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_cart"
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x07f4
            X.C18070vi.A0d(r2, r3)     // Catch:{ all -> 0x1253 }
            r0 = 0
            long r0 = X.C20099A7c.A04(r2, r0)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A16 = r0     // Catch:{ all -> 0x1253 }
        L_0x07f4:
            boolean r0 = r7 instanceof X.AnonymousClass1EC     // Catch:{ all -> 0x1253 }
            r27 = r0
            if (r0 == 0) goto L_0x086c
            r9 = r7
            X.1E9 r9 = (X.AnonymousClass1E9) r9     // Catch:{ all -> 0x1253 }
            X.1M9 r0 = r8.A05     // Catch:{ all -> 0x1253 }
            X.1E7 r0 = r0.A0E(r9)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x086c
            android.content.SharedPreferences r3 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            r2 = 0
            X.C18070vi.A0d(r0, r2)     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_group"
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r1 = r3.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x084f
            X.C18070vi.A0d(r1, r2)     // Catch:{ all -> 0x1253 }
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x1253 }
            java.lang.String r3 = ","
            r0[r2] = r3     // Catch:{ all -> 0x1253 }
            java.util.List r1 = X.AnonymousClass1YF.A0S(r1, r0, r2)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x1253 }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x1253 }
            X.6RI r0 = X.AnonymousClass6RI.A02     // Catch:{ all -> 0x1253 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = X.C63782tg.A05(r1, r0)     // Catch:{ all -> 0x1253 }
            r6.A1r = r0     // Catch:{ all -> 0x1253 }
        L_0x084f:
            boolean r0 = X.C18020vd.A05(r4, r5, r13)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x08c9
            java.lang.Long r0 = r6.A1r     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x086c
            X.00H r0 = r8.A0c     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x1253 }
            X.1MW r0 = (X.AnonymousClass1MW) r0     // Catch:{ all -> 0x1253 }
            int r0 = r0.A09(r9)     // Catch:{ all -> 0x1253 }
        L_0x0865:
            long r0 = (long) r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1r = r0     // Catch:{ all -> 0x1253 }
        L_0x086c:
            r2 = 1
            java.lang.Integer r24 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x1253 }
            r8.A05(r6, r7, r2)     // Catch:{ all -> 0x1253 }
            r13 = 2
            r8.A05(r6, r7, r13)     // Catch:{ all -> 0x1253 }
            r29 = 3
            r0 = r29
            r8.A05(r6, r7, r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            r9 = 0
            X.C18070vi.A0d(r0, r9)     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_BotMentionsRowCount"
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ all -> 0x1253 }
            X.C18070vi.A0d(r1, r2)     // Catch:{ all -> 0x1253 }
            char[] r0 = new char[r2]     // Catch:{ all -> 0x1253 }
            r10 = 44
            r0[r9] = r10     // Catch:{ all -> 0x1253 }
            java.util.List r1 = X.AnonymousClass1YF.A0R(r1, r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ all -> 0x1253 }
            java.lang.Object[] r10 = r1.toArray(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x1253 }
            java.lang.Long r9 = X.C63782tg.A05(r10, r9)     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r15 = r14
            if (r9 != 0) goto L_0x08d7
            goto L_0x08d6
        L_0x08c9:
            X.1MZ r0 = r8.A0D     // Catch:{ all -> 0x1253 }
            X.1MW r0 = r0.A08     // Catch:{ all -> 0x1253 }
            X.2tp r0 = r0.A0C(r9)     // Catch:{ all -> 0x1253 }
            int r0 = r0.A06()     // Catch:{ all -> 0x1253 }
            goto L_0x0865
        L_0x08d6:
            r9 = r14
        L_0x08d7:
            long r0 = r9.longValue()     // Catch:{ all -> 0x1253 }
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x1253 }
            r11.<init>(r0)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = X.C63782tg.A05(r10, r13)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x08e7
            r0 = r14
        L_0x08e7:
            long r0 = r0.longValue()     // Catch:{ all -> 0x1253 }
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x1253 }
            r9.<init>(r0)     // Catch:{ all -> 0x1253 }
            r0 = 4
            java.lang.Long r0 = X.C63782tg.A05(r10, r0)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x08f8
            r0 = r14
        L_0x08f8:
            long r0 = r0.longValue()     // Catch:{ all -> 0x1253 }
            java.util.concurrent.atomic.AtomicLong r12 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x1253 }
            r12.<init>(r0)     // Catch:{ all -> 0x1253 }
            r0 = 5
            java.lang.Long r0 = X.C63782tg.A05(r10, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0909
            r14 = r0
        L_0x0909:
            long r0 = r14.longValue()     // Catch:{ all -> 0x1253 }
            java.util.concurrent.atomic.AtomicLong r10 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x1253 }
            r10.<init>(r0)     // Catch:{ all -> 0x1253 }
            long r0 = r11.get()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A25 = r0     // Catch:{ all -> 0x1253 }
            long r0 = r9.get()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A24 = r0     // Catch:{ all -> 0x1253 }
            long r0 = r12.get()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1A = r0     // Catch:{ all -> 0x1253 }
            long r0 = r10.get()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1s = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            r9 = 0
            X.C18070vi.A0d(r0, r9)     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_BotSearchPlugInRowCount"
            r1.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ all -> 0x1253 }
            X.C18070vi.A0d(r1, r2)     // Catch:{ all -> 0x1253 }
            char[] r0 = new char[r2]     // Catch:{ all -> 0x1253 }
            r10 = 44
            r0[r9] = r10     // Catch:{ all -> 0x1253 }
            java.util.List r1 = X.AnonymousClass1YF.A0R(r1, r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ all -> 0x1253 }
            java.lang.Object[] r10 = r1.toArray(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = X.C63782tg.A05(r10, r9)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0977
            r0 = r15
        L_0x0977:
            long r0 = r0.longValue()     // Catch:{ all -> 0x1253 }
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x1253 }
            r9.<init>(r0)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = X.C63782tg.A05(r10, r2)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0987
            r15 = r0
        L_0x0987:
            long r0 = r15.longValue()     // Catch:{ all -> 0x1253 }
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x1253 }
            r2.<init>(r0)     // Catch:{ all -> 0x1253 }
            long r0 = r9.get()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1n = r0     // Catch:{ all -> 0x1253 }
            long r0 = r2.get()     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1m = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C42701yb.A01(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x09e3
            X.00H r0 = r8.A0Y     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x1253 }
            X.1UD r0 = (X.AnonymousClass1UD) r0     // Catch:{ all -> 0x1253 }
            X.0ve r2 = r0.A00     // Catch:{ all -> 0x1253 }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ all -> 0x1253 }
            r0 = 8200(0x2008, float:1.149E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x09e3
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2ga r2 = new X.2ga     // Catch:{ all -> 0x1253 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x1253 }
            long r0 = r2.A02     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1I = r0     // Catch:{ all -> 0x1253 }
            long r0 = r2.A01     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1J = r0     // Catch:{ all -> 0x1253 }
            long r0 = r2.A00     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1H = r0     // Catch:{ all -> 0x1253 }
        L_0x09e3:
            X.00H r0 = r8.A0Y     // Catch:{ all -> 0x1253 }
            r33 = r0
            java.lang.Object r0 = r33.get()     // Catch:{ all -> 0x1253 }
            X.1UD r0 = (X.AnonymousClass1UD) r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0a10
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2ga r2 = new X.2ga     // Catch:{ all -> 0x1253 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x1253 }
            long r0 = r2.A04     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1u = r0     // Catch:{ all -> 0x1253 }
            long r0 = r2.A03     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A1t = r0     // Catch:{ all -> 0x1253 }
        L_0x0a10:
            java.lang.Object r0 = r33.get()     // Catch:{ all -> 0x1253 }
            X.1UD r0 = (X.AnonymousClass1UD) r0     // Catch:{ all -> 0x1253 }
            X.0ve r2 = r0.A00     // Catch:{ all -> 0x1253 }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ all -> 0x1253 }
            r0 = 6358(0x18d6, float:8.91E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0a7e
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            r1 = 0
            X.C18070vi.A0d(r0, r1)     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_BotMessagePromptsRowCount"
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.String r3 = r0.getString(r2, r3)     // Catch:{ all -> 0x1253 }
            r2 = 1
            X.C18070vi.A0d(r3, r2)     // Catch:{ all -> 0x1253 }
            char[] r0 = new char[r2]     // Catch:{ all -> 0x1253 }
            r9 = 44
            r0[r1] = r9     // Catch:{ all -> 0x1253 }
            java.util.List r3 = X.AnonymousClass1YF.A0R(r3, r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x1253 }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r1 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r11 = 0
            if (r1 != 0) goto L_0x0a64
            r9 = 0
            goto L_0x0a68
        L_0x0a64:
            long r9 = r1.longValue()     // Catch:{ all -> 0x1253 }
        L_0x0a68:
            java.lang.Long r0 = X.C63782tg.A05(r0, r2)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0a72
            long r11 = r0.longValue()     // Catch:{ all -> 0x1253 }
        L_0x0a72:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1253 }
            r6.A2g = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x1253 }
            r6.A2h = r0     // Catch:{ all -> 0x1253 }
        L_0x0a7e:
            java.lang.Object r0 = r33.get()     // Catch:{ all -> 0x1253 }
            X.1UD r0 = (X.AnonymousClass1UD) r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0b53
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A03     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0q = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A04     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0t = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A07     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0u = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A08     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0v = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A02     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0p = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A01     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0n = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A00     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0o = r0     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r33.get()     // Catch:{ all -> 0x1253 }
            X.1UD r0 = (X.AnonymousClass1UD) r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0b53
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A06     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0r = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.2gx r0 = new X.2gx     // Catch:{ all -> 0x1253 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x1253 }
            long r0 = r0.A05     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0s = r0     // Catch:{ all -> 0x1253 }
        L_0x0b53:
            X.1iS r0 = r8.A0R     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            X.C18070vi.A0d(r1, r13)     // Catch:{ all -> 0x1253 }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x1253 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x1253 }
        L_0x0b62:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0b72
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x1253 }
            X.1iP r0 = (X.C33181iP) r0     // Catch:{ all -> 0x1253 }
            r0.BKL(r1, r6, r7)     // Catch:{ all -> 0x1253 }
            goto L_0x0b62
        L_0x0b72:
            r2 = 28800000(0x1b77400, double:1.42290906E-316)
            long r0 = r22 - r2
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x1253 }
            r2.<init>(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r15 = "yyyy/MM/dd"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x1253 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x1253 }
            r0.<init>(r15, r1)     // Catch:{ all -> 0x1253 }
            java.lang.String r3 = r0.format(r2)     // Catch:{ all -> 0x1253 }
            byte[] r2 = r42.A08()     // Catch:{ all -> 0x1253 }
            r6.A32 = r3     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r0.<init>()     // Catch:{ all -> 0x1253 }
            r0.append(r1)     // Catch:{ all -> 0x1253 }
            r0.append(r3)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = X.C25241Nl.A00(r2, r0)     // Catch:{ all -> 0x1253 }
            r6.A33 = r0     // Catch:{ all -> 0x1253 }
            r0 = 10528(0x2920, float:1.4753E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0bbf
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            byte[] r0 = r42.A08()     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = X.C25241Nl.A00(r0, r1)     // Catch:{ all -> 0x1253 }
            r6.A2x = r0     // Catch:{ all -> 0x1253 }
        L_0x0bbf:
            X.1M9 r11 = r8.A05     // Catch:{ all -> 0x1253 }
            X.1E7 r10 = r11.A0E(r7)     // Catch:{ all -> 0x1253 }
            r12 = 0
            if (r10 == 0) goto L_0x0c67
            boolean r0 = r10.A0F()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0c67
            r0 = r28
            r6.A06 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r10.A06(r0)     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r0 = r11.A0K(r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0c20
            X.1E7 r9 = r11.A0E(r0)     // Catch:{ all -> 0x1253 }
        L_0x0be4:
            boolean r0 = X.C22971Dz.A0W(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0c60
            X.1MZ r0 = r8.A0D     // Catch:{ all -> 0x1253 }
            r1 = r7
            X.1E9 r1 = (X.AnonymousClass1E9) r1     // Catch:{ all -> 0x1253 }
            X.1MW r0 = r0.A08     // Catch:{ all -> 0x1253 }
            X.2tp r0 = r0.A0C(r1)     // Catch:{ all -> 0x1253 }
            X.10f r0 = r0.A08()     // Catch:{ all -> 0x1253 }
            X.1IZ r2 = r0.iterator()     // Catch:{ all -> 0x1253 }
        L_0x0bfd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0c24
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x1253 }
            X.2sr r0 = (X.C63312sr) r0     // Catch:{ all -> 0x1253 }
            X.11S r1 = r8.A02     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r0 = r0.A04     // Catch:{ all -> 0x1253 }
            boolean r1 = r1.A0O(r0)     // Catch:{ all -> 0x1253 }
            if (r1 != 0) goto L_0x0bfd
            X.1E7 r0 = r11.A0E(r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0bfd
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0bfd
            goto L_0x0c22
        L_0x0c20:
            r9 = 0
            goto L_0x0be4
        L_0x0c22:
            r0 = 1
            goto L_0x0c25
        L_0x0c24:
            r0 = 0
        L_0x0c25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A01 = r0     // Catch:{ all -> 0x1253 }
            X.1CJ r0 = r8.A0B     // Catch:{ all -> 0x1253 }
            r1 = r7
            X.1EC r1 = (X.AnonymousClass1EC) r1     // Catch:{ all -> 0x1253 }
            X.C18070vi.A0d(r0, r12)     // Catch:{ all -> 0x1253 }
            boolean r2 = X.C22971Dz.A0e(r1)     // Catch:{ all -> 0x1253 }
            if (r2 != 0) goto L_0x0c3b
            r0 = 0
            goto L_0x0c52
        L_0x0c3b:
            int r2 = r0.A06(r1)     // Catch:{ all -> 0x1253 }
            if (r2 == r13) goto L_0x0c49
            r3 = 3
            if (r2 == r3) goto L_0x0c4e
            r0 = 6
            if (r2 == r0) goto L_0x0c49
            r3 = 1
            goto L_0x0c4e
        L_0x0c49:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x1253 }
            goto L_0x0c52
        L_0x0c4e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1253 }
        L_0x0c52:
            r6.A0i = r0     // Catch:{ all -> 0x1253 }
            X.1Pv r0 = r8.A0P     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A00(r10, r1)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A00 = r0     // Catch:{ all -> 0x1253 }
        L_0x0c60:
            boolean r0 = r10.A13     // Catch:{ all -> 0x1253 }
            r1 = 2
            if (r0 == 0) goto L_0x0c6f
            r1 = 1
            goto L_0x0c6f
        L_0x0c67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x1253 }
            r6.A06 = r0     // Catch:{ all -> 0x1253 }
            r9 = r10
            goto L_0x0c75
        L_0x0c6f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1253 }
            r6.A0g = r0     // Catch:{ all -> 0x1253 }
        L_0x0c75:
            r0 = 9512(0x2528, float:1.3329E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0cac
            X.1LW r14 = r8.A0A     // Catch:{ all -> 0x1253 }
            long r2 = r14.A09(r7)     // Catch:{ all -> 0x1253 }
            long r0 = r14.A07(r2)     // Catch:{ all -> 0x1253 }
            r31 = 0
            int r18 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r18 >= 0) goto L_0x0c96
            X.121 r0 = r8.A0C     // Catch:{ all -> 0x1253 }
            long r0 = r0.BVc(r2)     // Catch:{ all -> 0x1253 }
            r14.A0E(r2, r0)     // Catch:{ all -> 0x1253 }
        L_0x0c96:
            int r2 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r2 <= 0) goto L_0x0cac
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x1253 }
            r2.<init>(r0)     // Catch:{ all -> 0x1253 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x1253 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x1253 }
            r0.<init>(r15, r1)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r0.format(r2)     // Catch:{ all -> 0x1253 }
            r6.A31 = r0     // Catch:{ all -> 0x1253 }
        L_0x0cac:
            X.00H r0 = r8.A0X     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x1253 }
            X.1PW r0 = (X.AnonymousClass1PW) r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0cc4
            boolean r0 = X.C42701yb.A01(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0M = r0     // Catch:{ all -> 0x1253 }
        L_0x0cc4:
            boolean r0 = X.C84104Hw.A00(r5)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0ce2
            X.00H r0 = r8.A0e     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x1253 }
            X.2bu r0 = (X.C53052bu) r0     // Catch:{ all -> 0x1253 }
            X.1Nf r0 = r0.A00     // Catch:{ all -> 0x1253 }
            X.1E7 r0 = r0.A01(r7)     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0L = r0     // Catch:{ all -> 0x1253 }
        L_0x0ce2:
            if (r10 == 0) goto L_0x0d07
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0d07
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r10.A06(r0)     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0d07
            X.1E7 r0 = r11.A0E(r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0d38
            int r1 = r0.A00     // Catch:{ all -> 0x1253 }
            r0 = 1
            if (r1 != r0) goto L_0x0d38
        L_0x0d01:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0K = r0     // Catch:{ all -> 0x1253 }
        L_0x0d07:
            X.1PS r2 = r8.A0M     // Catch:{ all -> 0x1253 }
            int r0 = r2.A00()     // Catch:{ all -> 0x1253 }
            long r0 = (long) r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2R = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C22971Dz.A0d(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0d28
            r0 = r7
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x1253 }
            int r0 = r2.A01(r0)     // Catch:{ all -> 0x1253 }
            long r0 = (long) r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A2P = r0     // Catch:{ all -> 0x1253 }
        L_0x0d28:
            X.1CJ r14 = r8.A0B     // Catch:{ all -> 0x1253 }
            X.1ci r1 = X.AnonymousClass1CJ.A00(r14, r7)     // Catch:{ all -> 0x1253 }
            if (r1 == 0) goto L_0x0d6e
            X.1cl r0 = r1.A0e     // Catch:{ all -> 0x1253 }
            int r0 = r0.disappearingMessagesInitiator     // Catch:{ all -> 0x1253 }
            r2 = 1
            if (r0 == 0) goto L_0x0d3e
            goto L_0x0d3a
        L_0x0d38:
            r0 = 0
            goto L_0x0d01
        L_0x0d3a:
            r2 = 2
            if (r0 != r13) goto L_0x0d3e
            r2 = 3
        L_0x0d3e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1253 }
            r6.A0c = r0     // Catch:{ all -> 0x1253 }
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0d6e
            X.2lr r1 = r1.A0d     // Catch:{ all -> 0x1253 }
            if (r1 == 0) goto L_0x0d6e
            int r0 = r1.A00     // Catch:{ all -> 0x1253 }
            int r0 = X.C64002u3.A01(r0)     // Catch:{ all -> 0x1253 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0e = r0     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = r1.A01     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0d6e
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x1253 }
            r0 = 2
            if (r1 == 0) goto L_0x0d68
            r0 = 1
        L_0x0d68:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0d = r0     // Catch:{ all -> 0x1253 }
        L_0x0d6e:
            X.1LW r15 = r8.A0A     // Catch:{ all -> 0x1253 }
            long r2 = r15.A09(r7)     // Catch:{ all -> 0x1253 }
            long r0 = r15.A07(r2)     // Catch:{ all -> 0x1253 }
            r18 = 0
            int r31 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r31 >= 0) goto L_0x0d87
            X.121 r0 = r8.A0C     // Catch:{ all -> 0x1253 }
            long r0 = r0.BVc(r2)     // Catch:{ all -> 0x1253 }
            r15.A0E(r2, r0)     // Catch:{ all -> 0x1253 }
        L_0x0d87:
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            r0 = 0
            if (r2 <= 0) goto L_0x0d8d
            r0 = 1
        L_0x0d8d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0O = r0     // Catch:{ all -> 0x1253 }
            r0 = 4505(0x1199, float:6.313E-42)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0daf
            X.1Nb r0 = r8.A0Q     // Catch:{ all -> 0x1253 }
            X.1yM r0 = r0.A0a(r7)     // Catch:{ all -> 0x1253 }
            int r1 = r0.A00     // Catch:{ all -> 0x1253 }
            r0 = 1
            if (r1 == r13) goto L_0x0da9
            if (r1 == r0) goto L_0x0da9
            r0 = 0
        L_0x0da9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A08 = r0     // Catch:{ all -> 0x1253 }
        L_0x0daf:
            if (r9 == 0) goto L_0x0de6
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r9.A06(r0)     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x1253 }
            boolean r0 = r9.A0C()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0dce
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x1253 }
            r6.A0b = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r9.A0A()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0dea
            if (r1 == 0) goto L_0x0dea
            goto L_0x0dda
        L_0x0dce:
            boolean r0 = X.C22971Dz.A0S(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0de6
            r0 = 4
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1253 }
            goto L_0x0de6
        L_0x0dda:
            X.1PM r0 = r8.A06     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A04(r1)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0dea
            java.lang.Integer r24 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x1253 }
        L_0x0de6:
            r0 = r24
            r6.A0b = r0     // Catch:{ all -> 0x1253 }
        L_0x0dea:
            X.1Nb r0 = r8.A0Q     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A0y(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0H = r0     // Catch:{ all -> 0x1253 }
            r0 = 8278(0x2056, float:1.16E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0e15
            boolean r0 = r14.A0Q(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A07 = r0     // Catch:{ all -> 0x1253 }
            if (r9 == 0) goto L_0x0e0f
            X.2lf r0 = r9.A0H     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0e0f
            r12 = 1
        L_0x0e0f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x1253 }
            r6.A04 = r0     // Catch:{ all -> 0x1253 }
        L_0x0e15:
            boolean r0 = r7 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0e59
            r0 = r28
            r6.A0I = r0     // Catch:{ all -> 0x1253 }
            r2 = r7
            X.1E2 r2 = (X.AnonymousClass1E2) r2     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = r6.A0G     // Catch:{ all -> 0x1253 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x1253 }
            X.1RL r1 = r8.A0J     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0e52
            monitor-enter(r1)     // Catch:{ all -> 0x1253 }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ all -> 0x1185 }
            long r31 = X.AnonymousClass1RL.A00(r1, r2)     // Catch:{ all -> 0x1185 }
            int r3 = (r31 > r18 ? 1 : (r31 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x0e3a
            r0 = 1
        L_0x0e3a:
            monitor-exit(r1)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0R = r0     // Catch:{ all -> 0x1253 }
            X.1Ln r0 = r8.A0I     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0D(r2)     // Catch:{ all -> 0x1253 }
            r0 = 0
            if (r1 != 0) goto L_0x0e4b
            r0 = 1
        L_0x0e4b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0S = r0     // Catch:{ all -> 0x1253 }
            goto L_0x0e78
        L_0x0e52:
            java.lang.Boolean r0 = r1.A06(r2)     // Catch:{ all -> 0x1253 }
            r6.A0T = r0     // Catch:{ all -> 0x1253 }
            goto L_0x0e78
        L_0x0e59:
            if (r10 == 0) goto L_0x0e71
            boolean r0 = r10.A0F()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0e71
            r0 = r7
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x1253 }
            int r1 = r14.A06(r0)     // Catch:{ all -> 0x1253 }
            r0 = r29
            if (r1 != r0) goto L_0x0e71
            boolean r0 = r10.A0k     // Catch:{ all -> 0x1253 }
            r1 = 1
            if (r0 != 0) goto L_0x0e72
        L_0x0e71:
            r1 = 0
        L_0x0e72:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x1253 }
            r6.A0I = r0     // Catch:{ all -> 0x1253 }
        L_0x0e78:
            if (r10 == 0) goto L_0x0eed
            X.1BI r0 = r10.A0J     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C22971Dz.A0d(r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0eed
            r0 = 11794(0x2e12, float:1.6527E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0eed
            X.1BI r1 = r10.A0J     // Catch:{ all -> 0x1253 }
            r15 = 1
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x1253 }
            r0 = r41
            X.1LW r0 = r0.A00     // Catch:{ all -> 0x1253 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r12 = 0
            r2[r12] = r0     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x1253 }
            r2[r15] = r0     // Catch:{ all -> 0x1253 }
            r0 = r41
            X.1Cd r0 = r0.A01     // Catch:{ all -> 0x1253 }
            X.1at r9 = r0.get()     // Catch:{ all -> 0x1253 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1179 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x1179 }
            java.lang.String r1 = "SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type != 7 AND from_me = ? LIMIT 1"
            java.lang.String r0 = "HAS_NON_SYSTEM_MESSAGE_FROM_ID_SQL"
            android.database.Cursor r2 = r3.A0A(r1, r0, r2)     // Catch:{ all -> 0x1179 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x116d }
            if (r0 <= 0) goto L_0x0ec0
            r12 = 1
        L_0x0ec0:
            r2.close()     // Catch:{ all -> 0x1179 }
            r9.close()     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x1253 }
            r6.A02 = r0     // Catch:{ all -> 0x1253 }
            X.00H r0 = r8.A0a     // Catch:{ all -> 0x1253 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x1253 }
            X.1UL r1 = (X.AnonymousClass1UL) r1     // Catch:{ all -> 0x1253 }
            X.1BI r0 = r10.A0J     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x1253 }
            X.1EC r0 = r1.A02(r0)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0edf
            r15 = 0
        L_0x0edf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x1253 }
            r6.A0U = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r10.A0g     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0Q = r0     // Catch:{ all -> 0x1253 }
        L_0x0eed:
            int r0 = r14.A03(r7)     // Catch:{ all -> 0x1253 }
            long r0 = (long) r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A23 = r0     // Catch:{ all -> 0x1253 }
            X.1aN r0 = r8.A0H     // Catch:{ all -> 0x1253 }
            long r0 = r0.A02(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A22 = r0     // Catch:{ all -> 0x1253 }
            int r0 = X.C43391zj.A00(r11, r14, r7)     // Catch:{ all -> 0x1253 }
            long r0 = (long) r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A17 = r0     // Catch:{ all -> 0x1253 }
            X.0z4 r0 = r8.A08     // Catch:{ all -> 0x1253 }
            X.00H r11 = r0.A00     // Catch:{ all -> 0x1253 }
            java.lang.Object r2 = r11.get()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x1253 }
            java.lang.String r1 = "1on1_invite_sender"
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)     // Catch:{ all -> 0x1253 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r0 = r0.A04(r1)     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A01(r7)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0f32
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0f40
        L_0x0f32:
            X.00H r0 = r8.A0d     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x1253 }
            X.2kd r0 = (X.C58402kd) r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A01(r9)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0f44
        L_0x0f40:
            r0 = r28
            r6.A0E = r0     // Catch:{ all -> 0x1253 }
        L_0x0f44:
            if (r9 == 0) goto L_0x0f69
            java.lang.String r3 = r9.getRawString()     // Catch:{ all -> 0x1253 }
            if (r3 != 0) goto L_0x0f4e
            r0 = 0
            goto L_0x0f63
        L_0x0f4e:
            java.lang.Object r2 = r11.get()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x1253 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "contactless_jids_store"
            java.util.Set r0 = r2.getStringSet(r0, r1)     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x1253 }
        L_0x0f63:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0W = r0     // Catch:{ all -> 0x1253 }
        L_0x0f69:
            X.11S r0 = r8.A02     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = r0.A0C()     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x1253 }
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A03 = r0     // Catch:{ all -> 0x1253 }
            X.00H r1 = r8.A0f     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x1253 }
            X.2l2 r0 = (X.C58652l2) r0     // Catch:{ all -> 0x1253 }
            java.lang.Integer r0 = r0.A01(r9)     // Catch:{ all -> 0x1253 }
            r6.A0h = r0     // Catch:{ all -> 0x1253 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x1253 }
            X.2l2 r0 = (X.C58652l2) r0     // Catch:{ all -> 0x1253 }
            java.lang.Integer r0 = r0.A00(r9)     // Catch:{ all -> 0x1253 }
            r6.A0a = r0     // Catch:{ all -> 0x1253 }
            if (r10 == 0) goto L_0x0fc7
            java.lang.Object r0 = r33.get()     // Catch:{ all -> 0x1253 }
            X.1UD r0 = (X.AnonymousClass1UD) r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x0fc7
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r10.A06(r0)     // Catch:{ all -> 0x1253 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x1253 }
            if (r1 == 0) goto L_0x0fc7
            X.1Pl r0 = r8.A04     // Catch:{ all -> 0x1253 }
            X.24e r1 = r0.A00(r1)     // Catch:{ all -> 0x1253 }
            if (r1 == 0) goto L_0x0fc7
            boolean r0 = r1.A0J     // Catch:{ all -> 0x1253 }
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0N = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = r1.A0I     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r6.A0F = r0     // Catch:{ all -> 0x1253 }
        L_0x0fc7:
            X.18K r0 = r8.A0k     // Catch:{ all -> 0x1253 }
            r39 = r0
            r0.CC7(r6)     // Catch:{ all -> 0x1253 }
            java.lang.String r38 = r7.getRawString()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r1 = A00(r8)     // Catch:{ all -> 0x1253 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1253 }
            r2.<init>()     // Catch:{ all -> 0x1253 }
            r0 = r38
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "_notification"
            r2.append(r0)     // Catch:{ all -> 0x1253 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x1253 }
            r0 = 0
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ all -> 0x1253 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x1253 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ all -> 0x1253 }
            r1 = 0
            java.lang.Long r37 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 1
            java.lang.Long r36 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            java.lang.Long r35 = X.C63782tg.A05(r0, r13)     // Catch:{ all -> 0x1253 }
            r1 = r29
            java.lang.Long r34 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 4
            java.lang.Long r33 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 5
            java.lang.Long r32 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 6
            java.lang.Long r31 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 7
            java.lang.Long r24 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 8
            java.lang.Long r14 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 9
            java.lang.Long r13 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 10
            java.lang.Long r12 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 11
            java.lang.Long r11 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 12
            java.lang.Long r10 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 13
            java.lang.Long r9 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 14
            java.lang.Long r6 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 15
            java.lang.Long r3 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            r1 = 16
            java.lang.Long r2 = X.C63782tg.A05(r0, r1)     // Catch:{ all -> 0x1253 }
            if (r37 == 0) goto L_0x1062
            long r28 = r37.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x1062:
            if (r13 == 0) goto L_0x106c
            long r28 = r13.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x106c:
            if (r12 == 0) goto L_0x1076
            long r28 = r12.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x1076:
            if (r11 == 0) goto L_0x1080
            long r28 = r11.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x1080:
            if (r10 == 0) goto L_0x108a
            long r28 = r10.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x108a:
            if (r9 == 0) goto L_0x1094
            long r28 = r9.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x1094:
            if (r6 == 0) goto L_0x109e
            long r28 = r6.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x109e:
            if (r3 == 0) goto L_0x10a8
            long r28 = r3.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
        L_0x10a8:
            if (r2 == 0) goto L_0x0070
            long r28 = r2.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x10b4
            goto L_0x0070
        L_0x10b4:
            X.2HN r1 = new X.2HN     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            r15 = r42
            r0 = r38
            java.lang.String r0 = r15.A05(r0)     // Catch:{ all -> 0x1253 }
            r1.A0K = r0     // Catch:{ all -> 0x1253 }
            boolean r0 = X.C22971Dz.A0e(r7)     // Catch:{ all -> 0x1253 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r1.A00 = r0     // Catch:{ all -> 0x1253 }
            if (r27 == 0) goto L_0x10df
            X.1PU r0 = r8.A0S     // Catch:{ all -> 0x1253 }
            r15 = r0
            r0 = r7
            X.1EC r0 = (X.AnonymousClass1EC) r0     // Catch:{ all -> 0x1253 }
            int r0 = r15.A00(r0)     // Catch:{ all -> 0x1253 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r1.A02 = r0     // Catch:{ all -> 0x1253 }
        L_0x10df:
            boolean r0 = r7 instanceof X.AnonymousClass1E9     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x10f7
            X.1MZ r0 = r8.A0D     // Catch:{ all -> 0x1253 }
            X.1E9 r7 = (X.AnonymousClass1E9) r7     // Catch:{ all -> 0x1253 }
            X.1MW r0 = r0.A08     // Catch:{ all -> 0x1253 }
            int r0 = r0.A09(r7)     // Catch:{ all -> 0x1253 }
            int r0 = X.C64002u3.A03(r0)     // Catch:{ all -> 0x1253 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1253 }
            r1.A01 = r0     // Catch:{ all -> 0x1253 }
        L_0x10f7:
            if (r14 == 0) goto L_0x1103
            long r27 = r14.longValue()     // Catch:{ all -> 0x1253 }
            int r0 = (r27 > r18 ? 1 : (r27 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x1103
            r1.A03 = r14     // Catch:{ all -> 0x1253 }
        L_0x1103:
            r0 = r24
            r1.A0C = r0     // Catch:{ all -> 0x1253 }
            r0 = r34
            r1.A0D = r0     // Catch:{ all -> 0x1253 }
            r0 = r33
            r1.A0E = r0     // Catch:{ all -> 0x1253 }
            r0 = r35
            r1.A0F = r0     // Catch:{ all -> 0x1253 }
            r0 = r32
            r1.A0G = r0     // Catch:{ all -> 0x1253 }
            r0 = r31
            r1.A0H = r0     // Catch:{ all -> 0x1253 }
            r0 = r37
            r1.A0I = r0     // Catch:{ all -> 0x1253 }
            r0 = r36
            r1.A0J = r0     // Catch:{ all -> 0x1253 }
            r1.A0A = r13     // Catch:{ all -> 0x1253 }
            r1.A0B = r12     // Catch:{ all -> 0x1253 }
            r0 = 10039(0x2737, float:1.4068E-41)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x113b
            r1.A04 = r11     // Catch:{ all -> 0x1253 }
            r1.A07 = r10     // Catch:{ all -> 0x1253 }
            r1.A05 = r9     // Catch:{ all -> 0x1253 }
            r1.A08 = r6     // Catch:{ all -> 0x1253 }
            r1.A06 = r3     // Catch:{ all -> 0x1253 }
            r1.A09 = r2     // Catch:{ all -> 0x1253 }
        L_0x113b:
            r0 = r39
            r0.CC7(r1)     // Catch:{ all -> 0x1253 }
            goto L_0x0070
        L_0x1142:
            r0 = 0
            goto L_0x024b
        L_0x1146:
            r1 = move-exception
            if (r4 == 0) goto L_0x1151
            r4.close()     // Catch:{ all -> 0x114d }
            goto L_0x1151
        L_0x114d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1152 }
        L_0x1151:
            throw r1     // Catch:{ all -> 0x1152 }
        L_0x1152:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x1168 }
            goto L_0x116c
        L_0x1157:
            r1 = move-exception
            if (r5 == 0) goto L_0x1162
            r5.close()     // Catch:{ all -> 0x115e }
            goto L_0x1162
        L_0x115e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1163 }
        L_0x1162:
            throw r1     // Catch:{ all -> 0x1163 }
        L_0x1163:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x1168 }
            goto L_0x116c
        L_0x1168:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1183 }
        L_0x116c:
            throw r1     // Catch:{ all -> 0x1183 }
        L_0x116d:
            r1 = move-exception
            if (r2 == 0) goto L_0x1178
            r2.close()     // Catch:{ all -> 0x1174 }
            goto L_0x1178
        L_0x1174:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1179 }
        L_0x1178:
            throw r1     // Catch:{ all -> 0x1179 }
        L_0x1179:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x117e }
            goto L_0x1182
        L_0x117e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1253 }
        L_0x1182:
            throw r1     // Catch:{ all -> 0x1253 }
        L_0x1183:
            r0 = move-exception
            goto L_0x1187
        L_0x1185:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1253 }
        L_0x1187:
            throw r0     // Catch:{ all -> 0x1253 }
        L_0x1188:
            long r0 = r22 + r16
            long r3 = r0 + r16
            int r2 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x1196
            long r20 = r20 / r16
            long r20 = r20 * r16
            long r0 = r20 + r22
        L_0x1196:
            android.content.SharedPreferences$Editor r2 = r8.A08()     // Catch:{ all -> 0x1253 }
            r2.apply()     // Catch:{ all -> 0x1253 }
            r2 = r42
            r2.A06(r0)     // Catch:{ all -> 0x1253 }
            X.1i6 r5 = r8.A07     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = X.C33001i6.A01(r5)     // Catch:{ all -> 0x1253 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x1253 }
            java.util.Set r2 = r0.keySet()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = X.C33001i6.A00(r5)     // Catch:{ all -> 0x1253 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x1253 }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x1253 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x1253 }
            r0.<init>()     // Catch:{ all -> 0x1253 }
            r0.addAll(r2)     // Catch:{ all -> 0x1253 }
            r0.addAll(r1)     // Catch:{ all -> 0x1253 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x1253 }
        L_0x11cb:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x1253 }
            if (r0 == 0) goto L_0x1237
            java.lang.Object r6 = r9.next()     // Catch:{ all -> 0x1253 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = ","
            java.lang.String[] r7 = r6.split(r0)     // Catch:{ all -> 0x1253 }
            int r1 = r7.length     // Catch:{ all -> 0x1253 }
            r0 = 2
            if (r1 != r0) goto L_0x1218
            r0 = 0
            r1 = r7[r0]     // Catch:{ all -> 0x1253 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x1253 }
            X.1BI r4 = r0.A02(r1)     // Catch:{ all -> 0x1253 }
            if (r4 == 0) goto L_0x1218
            X.00H r0 = r5.A03     // Catch:{ all -> 0x1253 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x1253 }
            X.1W6 r3 = (X.AnonymousClass1W6) r3     // Catch:{ all -> 0x1253 }
            r2 = 1
            r0 = r7[r2]     // Catch:{ all -> 0x1253 }
            X.205 r1 = new X.205     // Catch:{ all -> 0x1253 }
            r1.<init>(r4, r0, r2)     // Catch:{ all -> 0x1253 }
            X.1W2 r0 = r3.A01     // Catch:{ all -> 0x1253 }
            X.206 r1 = r0.A05(r1)     // Catch:{ all -> 0x1253 }
            if (r1 == 0) goto L_0x1218
            X.11P r0 = r5.A02     // Catch:{ all -> 0x1253 }
            long r3 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x1253 }
            long r1 = r1.A0I     // Catch:{ all -> 0x1253 }
            r7 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x1253 }
            int r0 = X.A87.A00(r0, r3, r1)     // Catch:{ all -> 0x1253 }
            if (r0 >= r7) goto L_0x1218
            goto L_0x11cb
        L_0x1218:
            android.content.SharedPreferences r0 = X.C33001i6.A01(r5)     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)     // Catch:{ all -> 0x1253 }
            r0.apply()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences r0 = X.C33001i6.A00(r5)     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x1253 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)     // Catch:{ all -> 0x1253 }
            r0.apply()     // Catch:{ all -> 0x1253 }
            goto L_0x11cb
        L_0x1237:
            long r2 = X.AnonymousClass11P.A01(r43)     // Catch:{ all -> 0x1253 }
            long r2 = r2 - r25
            X.1Cu r1 = new X.1Cu     // Catch:{ all -> 0x1253 }
            r1.<init>()     // Catch:{ all -> 0x1253 }
            java.lang.String r0 = "WamChatMessageCounts"
            r1.A02 = r0     // Catch:{ all -> 0x1253 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1253 }
            r1.A00 = r0     // Catch:{ all -> 0x1253 }
            X.18K r0 = r8.A0k     // Catch:{ all -> 0x1253 }
            r0.CC7(r1)     // Catch:{ all -> 0x1253 }
        L_0x1251:
            monitor-exit(r8)
            return
        L_0x1253:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32951i1.A09():void");
    }

    public void A0A(AnonymousClass2R2 r4, AnonymousClass1BI r5) {
        if (!this.A02.A0O(r5)) {
            this.A0T.execute(new C70773Cl(this, r5, r4, 33));
        }
    }

    public void A0B(AnonymousClass1BI r4, int i) {
        if (!this.A02.A0O(r4)) {
            this.A0T.execute(new C21470Akb(this, r4, i, 34));
        }
    }

    public void A0C(AnonymousClass1BI r4, int i) {
        if (!this.A02.A0O(r4)) {
            this.A0T.execute(new C21470Akb(this, r4, i, 33));
        }
    }

    public void A0F(UserJid userJid, int i) {
        A03(new C64872vT(i), this, userJid);
    }

    public void A0G(C178119Bw r5, Integer num) {
        Object obj;
        if (r5 != null && num != null) {
            if (r5.A0O()) {
                obj = r5.A0C;
            } else {
                obj = r5.A09().A01;
            }
            if (obj != null) {
                this.A0T.execute(new C70773Cl(this, obj, num, 43));
            }
        }
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public void BoD(AnonymousClass1BI r4) {
        if (C18020vd.A05(C18040vf.A02, this.A0N, 10472)) {
            this.A0T.execute(new C146497Pi(this, r4, 39));
        }
    }

    public void BoL(AnonymousClass1BI r4, AnonymousClass205 r5) {
        this.A0T.execute(new C70773Cl(this, r5, r4, 22));
    }

    public void BoM(AnonymousClass1BI r4, AnonymousClass205 r5) {
        this.A0T.execute(new C70773Cl(this, r4, r5, 36));
    }

    public void BoN(AnonymousClass205 r4, List list) {
        this.A0T.execute(new C70773Cl(this, list, r4, 46));
    }

    public void BoQ(AnonymousClass1BI r4, Collection collection, int i, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            if (C18020vd.A05(C18040vf.A02, this.A0N, 10292)) {
                this.A0T.execute(new C70773Cl(this, r4, collection, 45));
            }
        }
    }

    public void BoS(AnonymousClass1BI r4, Collection collection) {
        this.A0T.execute(new C70773Cl(this, r4, collection, 24));
    }

    public void Bq0(Collection collection) {
        if (C18020vd.A05(C18040vf.A02, this.A0N, 10343)) {
            ArrayList newArrayList = C220618l.newArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 r2 = (AnonymousClass1E7) it.next();
                if (r2 != null) {
                    AnonymousClass1BI r1 = r2.A0J;
                    if (C22971Dz.A0X(r1) && this.A0B.A0P(r1)) {
                        newArrayList.add(r2);
                    }
                }
            }
            if (!newArrayList.isEmpty()) {
                this.A0T.execute(new C146497Pi(this, newArrayList, 36));
            }
        }
    }

    public void BqJ(AnonymousClass1BI r4) {
        if (C18020vd.A05(C18040vf.A02, this.A0N, 10291)) {
            this.A0T.execute(new C146497Pi(this, r4, 40));
        }
    }

    public void BvO(Set set) {
        if (C18020vd.A05(C18040vf.A02, this.A0N, 10292)) {
            this.A0T.execute(new C146497Pi(this, set, 38));
        }
    }

    public void Bvt(C63362sw r5) {
        AnonymousClass1BI r3 = r5.A0B.A00;
        if (r3 == null) {
            r3 = r5.A03();
        }
        if (r5.A0C()) {
            this.A0T.execute(new C70773Cl(this, r3, r5, 28));
        }
    }

    public static void A02(SharedPreferences sharedPreferences, AnonymousClass2S9 r2, String str) {
        sharedPreferences.edit().putString(str, r2.toString()).apply();
    }

    private void A05(AnonymousClass2HW r5, AnonymousClass1BI r6, int i) {
        String string = A00(this).getString(A01(r6.getRawString(), i), (String) null);
        if (!TextUtils.isEmpty(string)) {
            long A042 = C20099A7c.A04(string, 0);
            if (i != 1) {
                Long valueOf = Long.valueOf(A042);
                if (i != 2) {
                    r5.A2l = valueOf;
                } else {
                    r5.A2m = valueOf;
                }
            } else {
                r5.A2n = Long.valueOf(A042);
            }
        }
    }

    public void A0H(boolean z) {
        AnonymousClass2R2 r0;
        SharedPreferences A002 = A00(this);
        String rawString = C29671cg.A00.getRawString();
        C18070vi.A0d(rawString, 0);
        AnonymousClass2S9 A003 = C60332nq.A00(A002.getString(rawString, C60332nq.A01()));
        boolean z2 = !z;
        if (z) {
            r0 = AnonymousClass2R2.A15;
        } else if (z2) {
            r0 = AnonymousClass2R2.A14;
        } else {
            r0 = AnonymousClass2R2.A11;
        }
        A003.A00(r0);
        A02(A002, A003, rawString);
    }

    public String BSr() {
        return "ChatMessageCounts";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }

    public C32951i1(C19880zA r4, AnonymousClass190 r5, AnonymousClass11S r6, C26911Ty r7, C25741Pl r8, C33221iT r9, AnonymousClass1M9 r10, AnonymousClass1PM r11, C33001i6 r12, AnonymousClass11P r13, C19830z4 r14, C30801eX r15, AnonymousClass1LW r16, AnonymousClass1CJ r17, AnonymousClass121 r18, AnonymousClass1MZ r19, AnonymousClass1NH r20, AnonymousClass1R3 r21, AnonymousClass1NK r22, AnonymousClass1NJ r23, C28521aN r24, C24751Ln r25, AnonymousClass1RL r26, AnonymousClass1WM r27, C32981i4 r28, AnonymousClass1PS r29, C18030ve r30, AnonymousClass18K r31, C25241Nl r32, C25841Pv r33, C18010vc r34, AnonymousClass1Nb r35, C33211iS r36, C33171iO r37, AnonymousClass1PU r38, AnonymousClass10I r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51) {
        this.A0i = r13;
        this.A0N = r30;
        this.A0Y = r40;
        this.A0A = r16;
        this.A01 = r5;
        this.A02 = r6;
        this.A0B = r17;
        this.A0k = r31;
        this.A0F = r22;
        this.A0G = r23;
        this.A0j = r20;
        this.A0X = r41;
        this.A05 = r10;
        this.A0L = r28;
        this.A0S = r38;
        this.A0P = r33;
        this.A0W = r42;
        this.A0Z = r43;
        this.A0E = r21;
        this.A0I = r25;
        this.A0Q = r35;
        this.A0U = r44;
        this.A0O = r32;
        this.A0K = r27;
        this.A0H = r24;
        this.A06 = r11;
        this.A08 = r14;
        this.A0a = r45;
        this.A0V = r46;
        this.A0b = r47;
        this.A0c = r48;
        this.A03 = r7;
        this.A0J = r26;
        this.A0C = r18;
        this.A0e = r49;
        this.A0D = r19;
        this.A0l = r34;
        this.A0g = r4;
        this.A0f = r50;
        this.A09 = r15;
        this.A0d = r51;
        this.A07 = r12;
        this.A0M = r29;
        this.A0m = r37;
        this.A0R = r36;
        this.A04 = r8;
        this.A0h = r9;
        this.A0T = new C200710s(r39, false);
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.calling.dialer.DialerContactQuerySyncManager;
import com.whatsapp.data.repository.MetaAISearchRepository;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$onSearchExit$1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.5jU  reason: invalid class name and case insensitive filesystem */
public class C111295jU extends AnonymousClass1J2 implements C108625c1, AnonymousClass87Z, C218317o {
    public long A00;
    public SparseIntArray A01;
    public C20135A8w A02;
    public UserJid A03;
    public AnonymousClass77M A04;
    public C131056kR A05;
    public C139096yD A06;
    public C130976kJ A07;
    public AnonymousClass7T2 A08;
    public AnonymousClass6FF A09;
    public AnonymousClass6FJ A0A;
    public AnonymousClass77Z A0B;
    public Integer A0C;
    public Runnable A0D;
    public Runnable A0E;
    public String A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public int A0Q;
    public C134186qB A0R;
    public C130856k7 A0S;
    public final Handler A0T;
    public final AnonymousClass1DS A0U;
    public final AnonymousClass1DS A0V;
    public final AnonymousClass1DS A0W;
    public final AnonymousClass1DS A0X;
    public final AnonymousClass1DS A0Y;
    public final C22801Dg A0Z = C108945cZ.A0R();
    public final C22801Dg A0a;
    public final C22801Dg A0b;
    public final C22801Dg A0c;
    public final C22801Dg A0d;
    public final C22801Dg A0e = C108945cZ.A0R();
    public final C22801Dg A0f;
    public final C22801Dg A0g;
    public final C22801Dg A0h;
    public final AnonymousClass1DT A0i;
    public final AnonymousClass1DT A0j;
    public final AnonymousClass1DT A0k = C108945cZ.A0S();
    public final C37361pP A0l;
    public final C19880zA A0m;
    public final C19880zA A0n;
    public final AnonymousClass190 A0o;
    public final AnonymousClass6ZJ A0p;
    public final AnonymousClass1KB A0q;
    public final AnonymousClass1NP A0r;
    public final AnonymousClass118 A0s;
    public final C18000vb A0t;
    public final AnonymousClass1QB A0u;
    public final AnonymousClass1WR A0v;
    public final C24681Lg A0w;
    public final C24751Ln A0x;
    public final C18030ve A0y;
    public final C32011gU A0z;
    public final C38581rX A10;
    public final C41461wR A11;
    public final C131036kP A12;
    public final C131046kQ A13;
    public final C134156q8 A14;
    public final C139976zk A15;
    public final C143687Ej A16;
    public final C130916kD A17;
    public final C25021CTx A18;
    public final C139376yj A19;
    public final C138036wQ A1A;
    public final C36331ni A1B;
    public final C132916nr A1C;
    public final C41731wy A1D = AnonymousClass3MW.A0o();
    public final C41731wy A1E = AnonymousClass3MW.A0o();
    public final C41731wy A1F = AnonymousClass3MW.A0o();
    public final C41731wy A1G = AnonymousClass3MW.A0o();
    public final C41731wy A1H = AnonymousClass3MW.A0o();
    public final C41731wy A1I = AnonymousClass3MW.A0o();
    public final C41731wy A1J = AnonymousClass3MW.A0o();
    public final C41731wy A1K = AnonymousClass3MW.A0o();
    public final C41731wy A1L = AnonymousClass3MW.A0o();
    public final C41731wy A1M = AnonymousClass3MW.A0o();
    public final C41731wy A1N = AnonymousClass3MW.A0o();
    public final C41731wy A1O = AnonymousClass3MW.A0o();
    public final C41731wy A1P = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A1Q;
    public final AnonymousClass00H A1R;
    public final Map A1S;
    public final AtomicBoolean A1T;
    public final AtomicBoolean A1U;
    public final C22821Di A1V;
    public final AnonymousClass1DS A1W;
    public final AnonymousClass1DS A1X;
    public final C19880zA A1Y;
    public final C49992Ss A1Z;
    public final C37451pZ A1a;
    public final C25161Nd A1b;
    public final AnonymousClass11P A1c;
    public final C42221xp A1d;
    public final AnonymousClass6nA A1e;
    public final C32491hH A1f;
    public final AnonymousClass1XN A1g;
    public final C126336cZ A1h;
    public final C62112qo A1i;
    public final C30361do A1j;
    public final C200710s A1k;
    public final AnonymousClass00H A1l;
    public final Map A1m;

    public void A0d() {
        A0i(0);
        A0k((UserJid) null);
        A0o((AnonymousClass77Z) null);
        C30(false);
        C2N(false);
        CKI("");
        this.A0l.A04("user_grid_view_choice", (Object) null);
        this.A1I.A0F((Object) null);
        this.A0K = AnonymousClass000.A13();
        this.A0I = AnonymousClass000.A13();
        this.A0M = AnonymousClass000.A13();
        this.A0J = AnonymousClass000.A13();
        this.A06 = new C139096yD();
        Runnable runnable = this.A0E;
        if (runnable != null) {
            runnable.run();
        }
        this.A0L = AnonymousClass000.A13();
        this.A08 = new AnonymousClass7T2();
        this.A14.A01.A0F(new C139096yD());
        this.A13.A00.A0F(AnonymousClass000.A13());
        this.A12.A01.A0F(AnonymousClass000.A13());
        C20135A8w a8w = this.A02;
        if (a8w != null) {
            a8w.A07.A0F(C18460wS.A00);
        }
        C25021CTx cTx = this.A18;
        if (cTx != null) {
            cTx.A00.A0F((Object) null);
        }
        this.A15.A02 = false;
        A08(this);
    }

    public void C4j() {
        AnonymousClass77E A002;
        C2N(false);
        C38581rX r4 = this.A10;
        if (!C18020vd.A05(C18040vf.A01, r4.A01, 8211) || !r4.A01() || (A002 = A00(A05(this))) == null) {
            r4.A00();
            AnonymousClass3MY.A1L(this.A0d, false);
            return;
        }
        this.A1P.A0E(new C19760yx(A002, new AnonymousClass772(AnonymousClass6R7.USER_INPUT, 5)));
        C139976zk r2 = this.A15;
        r2.A03(C108965cb.A1W(this.A0d, Boolean.TRUE));
        AnonymousClass64Y r1 = new AnonymousClass64Y();
        Long A0X2 = C108975cc.A0X();
        r1.A04 = A0X2;
        r1.A0A = A0X2;
        r1.A01 = C108955ca.A0e();
        r1.A02 = C17880vN.A0h();
        r2.A03.CC7(r1);
    }

    public void C4k() {
        A0k((UserJid) null);
    }

    public void C4n() {
        A0i(0);
    }

    public void C5p() {
        A0o((AnonymousClass77Z) null);
    }

    private C39611tM A03(Integer num) {
        Map map = this.A1m;
        C39611tM r2 = (C39611tM) map.get(num);
        if (r2 != null) {
            return r2;
        }
        int intValue = num.intValue();
        C39611tM r22 = new C39611tM(new C135676sa(this.A1V, 2131895529, intValue, C17890vO.A1R(intValue) ? 1 : 0), 48);
        map.put(num, r22);
        return r22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0302, code lost:
        if (r9 == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0359, code lost:
        if (r11 == false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0455, code lost:
        if (r11 == false) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04cd, code lost:
        if (r1 == false) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x054d, code lost:
        if (r10.A03.size() <= 0) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0572, code lost:
        if (r10.A00.size() <= 0) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05a2, code lost:
        if (r4.A0E() != false) goto L_0x05a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05b2, code lost:
        if (r4.A0H.isEmpty() == false) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0726, code lost:
        if (r17 == false) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d9, code lost:
        if (X.C108965cb.A1W(r4.A0k, java.lang.Boolean.TRUE) != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0294, code lost:
        if (A0J(java.lang.Integer.valueOf(r4.A0U())) == false) goto L_0x0296;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x070e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0287  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C147387Sy A04(X.C111295jU r23) {
        /*
            r4 = r23
            X.118 r2 = r4.A0s
            X.1gU r5 = r4.A0z
            X.0vb r1 = r4.A0t
            X.6wQ r0 = r4.A1A
            X.7Sy r3 = new X.7Sy
            r3.<init>(r2, r1, r5, r0)
            X.6zk r6 = r4.A15
            java.util.concurrent.ConcurrentHashMap r5 = r6.A01
            r5.clear()
            X.1Dg r0 = r4.A0g
            r23 = r0
            java.lang.Object r0 = r23.A06()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0226
            com.whatsapp.jid.UserJid r0 = r4.A0Y()
            if (r0 != 0) goto L_0x0226
            int r0 = r4.A0U()
            if (r0 != 0) goto L_0x0226
            X.77Z r0 = r4.A0a()
            if (r0 != 0) goto L_0x0226
            X.77M r0 = r4.A0Z()
            if (r0 != 0) goto L_0x0226
            monitor-enter(r4)
            X.A8w r0 = r4.A02     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x0054
            android.util.SparseIntArray r7 = r4.A01     // Catch:{ all -> 0x0223 }
            r0 = 98
            r1 = -1
            int r0 = r7.get(r0, r1)     // Catch:{ all -> 0x0223 }
            if (r0 == r1) goto L_0x0054
            android.util.SparseIntArray r0 = r4.A01     // Catch:{ all -> 0x0223 }
            r0.clear()     // Catch:{ all -> 0x0223 }
        L_0x0054:
            X.0ve r12 = r4.A0y     // Catch:{ all -> 0x0223 }
            r0 = 1608(0x648, float:2.253E-42)
            X.0vf r11 = X.C18040vf.A02     // Catch:{ all -> 0x0223 }
            boolean r0 = X.C18020vd.A05(r11, r12, r0)     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x0069
            android.util.SparseIntArray r7 = r4.A01     // Catch:{ all -> 0x0223 }
            r1 = 117(0x75, float:1.64E-43)
            r0 = 9
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
        L_0x0069:
            android.util.SparseIntArray r7 = r4.A01     // Catch:{ all -> 0x0223 }
            r1 = 105(0x69, float:1.47E-43)
            r0 = 8
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
            r1 = 118(0x76, float:1.65E-43)
            r0 = 7
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
            r1 = 108(0x6c, float:1.51E-43)
            r0 = 6
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
            r1 = 103(0x67, float:1.44E-43)
            r0 = 5
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
            r1 = 97
            r0 = 4
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
            r1 = 100
            r0 = 3
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
            r0 = 11311(0x2c2f, float:1.585E-41)
            boolean r0 = X.C25291Nq.A04(r12, r0)     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x00a0
            android.util.SparseIntArray r7 = r4.A01     // Catch:{ all -> 0x0223 }
            r1 = 115(0x73, float:1.61E-43)
            r0 = 2
            r7.put(r1, r0)     // Catch:{ all -> 0x0223 }
        L_0x00a0:
            r0 = 2662(0xa66, float:3.73E-42)
            boolean r0 = X.C18020vd.A05(r11, r12, r0)     // Catch:{ all -> 0x0223 }
            r7 = 1
            if (r0 == 0) goto L_0x00b0
            android.util.SparseIntArray r1 = r4.A01     // Catch:{ all -> 0x0223 }
            r0 = 111(0x6f, float:1.56E-43)
            r1.put(r0, r7)     // Catch:{ all -> 0x0223 }
        L_0x00b0:
            android.util.SparseIntArray r0 = r4.A01     // Catch:{ all -> 0x0223 }
            r0.put(r8, r7)     // Catch:{ all -> 0x0223 }
            monitor-exit(r4)     // Catch:{ all -> 0x0223 }
            X.6sd r7 = new X.6sd
            r7.<init>()
            X.1rX r9 = r4.A10
            boolean r1 = r9.A03()
            android.util.SparseIntArray r0 = r4.A01
            if (r1 == 0) goto L_0x00e5
            r7.A00 = r0
        L_0x00c7:
            android.util.SparseIntArray r0 = r4.A01
            int r13 = r0.size()
            java.util.concurrent.ConcurrentHashMap r1 = r6.A01
            java.lang.String r10 = "filter"
            int r0 = r6.A01(r10)
            int r0 = r0 + r13
            X.C17890vO.A0z(r10, r1, r0)
            r0 = 1287(0x507, float:1.803E-42)
            boolean r0 = X.C18020vd.A05(r11, r12, r0)
            if (r0 == 0) goto L_0x0118
            X.2qo r13 = r4.A1i
            monitor-enter(r13)
            goto L_0x00ee
        L_0x00e5:
            android.util.SparseIntArray r1 = r0.clone()
            r0 = 4
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x00c7
        L_0x00ee:
            java.util.List r1 = r13.A00     // Catch:{ all -> 0x00fa }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00fd
            X.C62112qo.A00(r13)     // Catch:{ all -> 0x00fa }
            goto L_0x00fd
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00fd:
            monitor-exit(r13)
            java.util.ArrayList r13 = X.C17880vN.A10(r1)
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x0218
            r7.A03 = r13
        L_0x010a:
            int r13 = r13.size()
            java.util.concurrent.ConcurrentHashMap r1 = r6.A01
            int r0 = r6.A01(r10)
            int r0 = r0 + r13
            X.C17890vO.A0z(r10, r1, r0)
        L_0x0118:
            X.A4o r0 = X.C20135A8w.A0R
            boolean r0 = r0.A02(r12)
            if (r0 == 0) goto L_0x0142
            X.00H r0 = r4.A1l
            java.lang.Object r0 = r0.get()
            X.6pH r0 = (X.C133666pH) r0
            java.util.List r12 = r0.A01()
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x020d
            r7.A02 = r12
        L_0x0134:
            int r12 = r12.size()
            java.util.concurrent.ConcurrentHashMap r1 = r6.A01
            int r0 = r6.A01(r10)
            int r0 = r0 + r12
            X.C17890vO.A0z(r10, r1, r0)
        L_0x0142:
            X.1XN r12 = r4.A1g
            X.0ve r1 = r12.A03
            r0 = 1206(0x4b6, float:1.69E-42)
            boolean r0 = X.C18020vd.A05(r11, r1, r0)
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x01bf
            android.content.Context r13 = r2.A00
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.lang.String r12 = "273819889375819"
            r0 = 2131887013(0x7f1203a5, float:1.9408621E38)
            java.lang.String r2 = r13.getString(r0)
            int r1 = X.C181159Pj.A00(r12)
            X.4cQ r0 = new X.4cQ
            r0.<init>(r12, r2, r1)
            r11.add(r0)
            java.lang.String r12 = "150108431712141"
            r0 = 2131887012(0x7f1203a4, float:1.940862E38)
            java.lang.String r2 = r13.getString(r0)
            int r1 = X.C181159Pj.A00(r12)
            X.4cQ r0 = new X.4cQ
            r0.<init>(r12, r2, r1)
            r11.add(r0)
            java.lang.String r12 = "1086422341396773"
            r0 = 2131887010(0x7f1203a2, float:1.9408615E38)
            java.lang.String r2 = r13.getString(r0)
            int r1 = X.C181159Pj.A00(r12)
            X.4cQ r0 = new X.4cQ
            r0.<init>(r12, r2, r1)
            r11.add(r0)
            r0 = 2131899186(0x7f123332, float:1.943331E38)
            java.lang.String r2 = r13.getString(r0)
            r1 = 0
            X.4cQ r0 = new X.4cQ
            r0.<init>(r1, r2, r8)
            r11.add(r0)
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x0207
            r7.A01 = r11
        L_0x01b1:
            int r2 = r11.size()
            java.util.concurrent.ConcurrentHashMap r1 = r6.A01
            int r0 = r6.A01(r10)
            int r0 = r0 + r2
            X.C17890vO.A0z(r10, r1, r0)
        L_0x01bf:
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x01ff
            X.0ve r2 = r9.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 12184(0x2f98, float:1.7073E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x01db
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.1DT r0 = r4.A0k
            boolean r0 = X.C108965cb.A1W(r0, r1)
            if (r0 == 0) goto L_0x01ff
        L_0x01db:
            X.6nA r0 = r4.A1e
            X.1DT r0 = r0.A00()
            java.util.List r1 = X.AnonymousClass3MW.A10(r0)
            if (r1 == 0) goto L_0x01fa
            r0 = 47
            X.AnonymousClass6FD.A02(r1, r3, r0)
            int r2 = r1.size()
            java.lang.String r1 = "empty_suggestion"
            int r0 = r6.A01(r1)
            int r0 = r0 + r2
            X.C17890vO.A0z(r1, r5, r0)
        L_0x01fa:
            r0 = 46
            X.AnonymousClass6FD.A02(r7, r3, r0)
        L_0x01ff:
            X.1Dg r0 = r4.A0c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            goto L_0x0816
        L_0x0207:
            r0 = 23
            X.AnonymousClass6FD.A02(r11, r3, r0)
            goto L_0x01b1
        L_0x020d:
            java.util.ArrayList r1 = X.C17880vN.A10(r12)
            r0 = 100
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x0134
        L_0x0218:
            java.util.ArrayList r1 = X.C17880vN.A10(r13)
            r0 = 22
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x010a
        L_0x0223:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0223 }
            throw r0
        L_0x0226:
            X.6yD r0 = r4.A06
            X.6yD r10 = r0.A00()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.6kP r0 = r4.A12
            X.1DT r0 = r0.A03
            boolean r15 = X.C108965cb.A1W(r0, r1)
            X.6kQ r0 = r4.A13
            X.1DT r0 = r0.A02
            boolean r14 = X.C108965cb.A1W(r0, r1)
            if (r15 != 0) goto L_0x024e
            if (r14 != 0) goto L_0x024e
            X.6kR r0 = r4.A05
            if (r0 == 0) goto L_0x081a
            X.1DT r0 = r0.A07
            boolean r0 = X.C108965cb.A1W(r0, r1)
            if (r0 == 0) goto L_0x081a
        L_0x024e:
            r20 = 1
        L_0x0250:
            r19 = 1
        L_0x0252:
            boolean r17 = A0H(r4)
            boolean r7 = r4.A0C()
            java.util.List r0 = r10.A02
            r22 = r0
            int r1 = r22.size()
            r0 = 5
            boolean r18 = X.C108975cc.A1D(r1, r0)
            if (r7 == 0) goto L_0x027d
            int r13 = r4.A0U()
            r12 = 118(0x76, float:1.65E-43)
            r11 = 115(0x73, float:1.61E-43)
            r9 = 105(0x69, float:1.47E-43)
            r8 = 103(0x67, float:1.44E-43)
            if (r13 == r8) goto L_0x0755
            if (r13 == r9) goto L_0x0755
            if (r13 == r11) goto L_0x0755
            if (r13 == r12) goto L_0x0755
        L_0x027d:
            X.1Dg r2 = r4.A0c
            java.util.List r0 = r10.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0296
            int r0 = r4.A0U()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = A0J(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0297
        L_0x0296:
            r0 = 0
        L_0x0297:
            X.AnonymousClass3MY.A1M(r2, r0)
            X.1Dg r0 = r4.A0b
            X.AnonymousClass3MY.A1M(r0, r7)
            if (r15 != 0) goto L_0x0819
            X.1rX r0 = r4.A10
            r21 = r0
            boolean r0 = r21.A01()
            if (r0 == 0) goto L_0x02c1
            android.util.SparseIntArray r0 = r4.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02c1
            X.6sd r1 = new X.6sd
            r1.<init>()
            android.util.SparseIntArray r0 = r4.A01
            r1.A00 = r0
            r0 = 46
            X.AnonymousClass6FD.A02(r1, r3, r0)
        L_0x02c1:
            X.6FF r0 = r4.A09
            if (r0 == 0) goto L_0x02c8
            r3.add(r0)
        L_0x02c8:
            java.util.List r0 = r4.A0I
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02e2
            X.0ve r2 = r4.A0y
            r1 = 6740(0x1a54, float:9.445E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 1
            if (r1 != r0) goto L_0x02e2
            X.6FD r0 = X.C147387Sy.A00
            r3.add(r0)
        L_0x02e2:
            java.lang.Integer r12 = X.C17880vN.A0h()
            java.util.List r11 = r4.A0I
            X.0ve r7 = r4.A0y
            r0 = 9055(0x235f, float:1.2689E-41)
            X.0vf r2 = X.C18040vf.A02
            int r13 = X.C18020vd.A00(r2, r7, r0)
            java.util.Map r1 = r4.A1S
            java.lang.Object r0 = r1.get(r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r8 = 0
            if (r0 == 0) goto L_0x0304
            boolean r9 = r0.booleanValue()
            r0 = 1
            if (r9 != 0) goto L_0x0305
        L_0x0304:
            r0 = 0
        L_0x0305:
            if (r13 < 0) goto L_0x0750
            if (r0 != 0) goto L_0x0750
            int r9 = r11.size()
            int r0 = r13 + 1
            if (r9 < r0) goto L_0x0750
            java.util.List r0 = r11.subList(r8, r13)
            A0B(r4, r12, r3, r0, r11)
        L_0x0318:
            java.util.List r0 = r4.A0I
            int r11 = r0.size()
            java.lang.String r9 = "chat"
            int r0 = r6.A01(r9)
            int r0 = r0 + r11
            X.C17890vO.A0z(r9, r5, r0)
            if (r14 != 0) goto L_0x0819
            java.util.List r0 = r4.A0K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0340
            r0 = 6740(0x1a54, float:9.445E-42)
            int r9 = X.C18020vd.A00(r2, r7, r0)
            r0 = 1
            if (r9 != r0) goto L_0x0340
            X.6FD r0 = X.C147387Sy.A0A
            r3.add(r0)
        L_0x0340:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.util.List r12 = r4.A0K
            r0 = 9057(0x2361, float:1.2692E-41)
            int r13 = X.C18020vd.A00(r2, r7, r0)
            java.lang.Object r0 = r1.get(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x035b
            boolean r11 = r0.booleanValue()
            r0 = 1
            if (r11 != 0) goto L_0x035c
        L_0x035b:
            r0 = 0
        L_0x035c:
            if (r13 < 0) goto L_0x074b
            if (r0 != 0) goto L_0x074b
            int r11 = r12.size()
            int r0 = r13 + 1
            if (r11 < r0) goto L_0x074b
            java.util.List r0 = r12.subList(r8, r13)
            A0B(r4, r9, r3, r0, r12)
        L_0x036f:
            java.util.List r0 = r4.A0K
            int r12 = r0.size()
            java.lang.String r11 = "contact"
            int r0 = r6.A01(r11)
            int r0 = r0 + r12
            X.C17890vO.A0z(r11, r5, r0)
            java.lang.Object r0 = r23.A06()
            if (r0 == 0) goto L_0x0416
            java.lang.String r0 = X.C108945cZ.A1F(r23)
            int r11 = r0.length()
            r0 = 3
            if (r11 < r0) goto L_0x0416
            java.util.List r0 = r4.A0G
            if (r0 == 0) goto L_0x0416
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0416
            boolean r0 = r4.A0q()
            if (r0 == 0) goto L_0x0416
            r0 = 2131895522(0x7f1224e2, float:1.942588E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.AnonymousClass6FD.A02(r11, r3, r0)
            java.util.List r0 = r4.A0K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03bb
            java.util.List r0 = r4.A0I
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03e0
        L_0x03bb:
            java.util.List r0 = r4.A0G
            if (r0 == 0) goto L_0x03e0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03e0
            java.util.List r0 = r4.A0G
            java.lang.Object r0 = r0.get(r8)
            X.77E r0 = (X.AnonymousClass77E) r0
            java.lang.String r11 = X.C108945cZ.A1F(r23)
            if (r11 == 0) goto L_0x03e0
            java.lang.String r0 = r0.A03
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03e0
            java.util.List r0 = r4.A0G
            r0.remove(r8)
        L_0x03e0:
            java.util.List r14 = r4.A0G
            int r13 = r4.A0Q
            int r16 = X.C108955ca.A08(r14, r13)
            r12 = 0
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
        L_0x03ed:
            int r0 = r14.size()
            if (r12 >= r0) goto L_0x0403
            r0 = r16
            if (r12 >= r0) goto L_0x0403
            java.lang.Object r15 = r14.get(r12)
            r0 = 43
            X.AnonymousClass6FD.A02(r15, r11, r0)
            int r12 = r12 + 1
            goto L_0x03ed
        L_0x0403:
            r3.addAll(r11)
            java.util.List r0 = r4.A0G
            int r12 = X.C108955ca.A08(r0, r13)
            java.lang.String r11 = "ai_suggestion"
            int r0 = r6.A01(r11)
            int r0 = r0 + r12
            X.C17890vO.A0z(r11, r5, r0)
        L_0x0416:
            X.6kR r11 = r4.A05
            if (r11 == 0) goto L_0x042b
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x042b
            X.1KB r2 = r4.A0q
            r1 = 13
            X.7Qo r0 = new X.7Qo
            r0.<init>((X.C111295jU) r4, (int) r1)
            r2.A0J(r0)
            return r3
        L_0x042b:
            if (r20 != 0) goto L_0x0819
            if (r11 == 0) goto L_0x046b
            java.util.List r0 = r4.A0M
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x046b
            X.6FD r0 = X.C147387Sy.A04
            r3.add(r0)
            java.lang.Integer r13 = X.C17880vN.A0j()
            java.util.List r12 = r4.A0M
            r0 = 9056(0x2360, float:1.269E-41)
            int r14 = X.C18020vd.A00(r2, r7, r0)
            java.lang.Object r0 = r1.get(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0457
            boolean r11 = r0.booleanValue()
            r0 = 1
            if (r11 != 0) goto L_0x0458
        L_0x0457:
            r0 = 0
        L_0x0458:
            if (r14 < 0) goto L_0x051c
            if (r0 != 0) goto L_0x051c
            int r11 = r12.size()
            int r0 = r14 + 1
            if (r11 < r0) goto L_0x051c
            java.util.List r0 = r12.subList(r8, r14)
            A0B(r4, r13, r3, r0, r12)
        L_0x046b:
            java.lang.Object r0 = r23.A06()
            if (r0 == 0) goto L_0x04a5
            X.6FJ r0 = r4.A0A
            if (r0 == 0) goto L_0x04a5
            boolean r0 = r4.A0q()
            if (r0 == 0) goto L_0x04a5
            java.util.List r0 = r4.A0M
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04a5
            java.util.List r0 = r4.A0K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04a5
            java.util.List r0 = r4.A0I
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04a5
            r0 = 11117(0x2b6d, float:1.5578E-41)
            boolean r0 = X.C18020vd.A05(r2, r7, r0)
            if (r0 == 0) goto L_0x04a5
            X.6FD r0 = X.C147387Sy.A09
            r3.add(r0)
            X.6FJ r0 = r4.A0A
            r3.add(r0)
        L_0x04a5:
            if (r19 != 0) goto L_0x0819
            java.util.List r0 = r4.A0L
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x04f3
            X.6FD r0 = X.C147387Sy.A02
            r3.add(r0)
            java.lang.Integer r12 = X.C17880vN.A0i()
            java.util.List r11 = r4.A0L
            r0 = 9054(0x235e, float:1.2687E-41)
            int r13 = X.C18020vd.A00(r2, r7, r0)
            java.lang.Object r0 = r1.get(r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x04cf
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x04d0
        L_0x04cf:
            r0 = 0
        L_0x04d0:
            if (r13 < 0) goto L_0x0518
            if (r0 != 0) goto L_0x0518
            int r1 = r11.size()
            int r0 = r13 + 1
            if (r1 < r0) goto L_0x0518
            java.util.List r0 = r11.subList(r8, r13)
            A0B(r4, r12, r3, r0, r11)
        L_0x04e3:
            java.util.List r0 = r4.A0L
            int r11 = r0.size()
            java.lang.String r1 = "group"
            int r0 = r6.A01(r1)
            int r0 = r0 + r11
            X.C17890vO.A0z(r1, r5, r0)
        L_0x04f3:
            X.1QB r0 = r4.A0u
            boolean r0 = r0.A0O()
            if (r0 != 0) goto L_0x052a
            X.1NP r0 = r4.A0r
            int r1 = r0.A01()
            r0 = 512(0x200, float:7.175E-43)
            if (r1 != r0) goto L_0x052a
            int r0 = r3.size()
            if (r0 == 0) goto L_0x0521
            java.lang.Object r0 = r23.A06()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0521
            return r3
        L_0x0518:
            r3.addAll(r11)
            goto L_0x04e3
        L_0x051c:
            r3.addAll(r12)
            goto L_0x046b
        L_0x0521:
            X.6FD r0 = X.C147387Sy.A06
            r3.add(r0)
            X.6FD r2 = X.C147387Sy.A01
            goto L_0x05da
        L_0x052a:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x0540
            boolean r0 = r21.A01()
            if (r0 != 0) goto L_0x0540
            android.util.SparseIntArray r0 = r4.A01
            android.util.SparseIntArray r1 = r0.clone()
            r0 = 4
            X.AnonymousClass6FD.A02(r1, r3, r0)
        L_0x0540:
            int r0 = r4.A0U()
            if (r0 != 0) goto L_0x054f
            java.util.List r0 = r10.A03
            int r0 = r0.size()
            r13 = 1
            if (r0 > 0) goto L_0x0550
        L_0x054f:
            r13 = 0
        L_0x0550:
            java.util.List r0 = r4.A0I
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0565
            java.util.List r0 = r4.A0K
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0565
            if (r13 != 0) goto L_0x0565
            r4.A0E()
        L_0x0565:
            int r0 = r4.A0U()
            if (r0 != 0) goto L_0x0574
            java.util.List r0 = r10.A00
            int r0 = r0.size()
            r12 = 1
            if (r0 > 0) goto L_0x0575
        L_0x0574:
            r12 = 0
        L_0x0575:
            java.util.List r0 = r4.A0I
            int r0 = r0.size()
            if (r0 > 0) goto L_0x05a4
            java.util.List r0 = r4.A0K
            int r0 = r0.size()
            if (r0 > 0) goto L_0x05a4
            java.util.List r0 = r4.A0M
            int r0 = r0.size()
            if (r0 > 0) goto L_0x05a4
            X.6FJ r0 = r4.A0A
            if (r0 != 0) goto L_0x05a4
            if (r13 != 0) goto L_0x0595
            if (r12 == 0) goto L_0x059d
        L_0x0595:
            java.util.List r0 = r10.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x05a4
        L_0x059d:
            boolean r0 = r4.A0E()
            r14 = 0
            if (r0 == 0) goto L_0x05a5
        L_0x05a4:
            r14 = 1
        L_0x05a5:
            X.77M r0 = r4.A0Z()
            if (r0 != 0) goto L_0x05b4
            java.util.List r0 = r4.A0H
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x05b5
        L_0x05b4:
            r1 = 0
        L_0x05b5:
            r11 = r14 ^ 1
            r11 = r11 & r18
            if (r14 == 0) goto L_0x05de
            boolean r0 = r4.A0E()
            if (r0 != 0) goto L_0x05de
            if (r1 == 0) goto L_0x05de
            int r0 = r22.size()
            if (r0 != 0) goto L_0x05de
            if (r17 != 0) goto L_0x05de
            X.1DS r0 = r4.A0Y
            java.lang.Object r0 = r0.A06()
            if (r0 != 0) goto L_0x05de
            X.6FD r0 = X.C147387Sy.A06
            r3.add(r0)
            X.6FD r2 = X.C147387Sy.A07
        L_0x05da:
            r3.add(r2)
            return r3
        L_0x05de:
            int r0 = r22.size()
            if (r0 <= 0) goto L_0x0672
            if (r13 == 0) goto L_0x05f0
            X.6FD r0 = X.C147387Sy.A0C
            r3.add(r0)
            java.util.List r0 = r10.A03
            r3.A00(r7, r0, r8)
        L_0x05f0:
            if (r12 == 0) goto L_0x0641
            X.1hH r1 = r4.A1f
            java.lang.Runnable r13 = r1.A01
            if (r13 == 0) goto L_0x0612
            android.os.Handler r12 = r1.A00
            if (r12 != 0) goto L_0x060f
            X.00H r0 = r1.A09
            java.lang.Object r0 = r0.get()
            X.1Nc r0 = (X.C25151Nc) r0
            android.os.Looper r0 = r0.A00()
            android.os.Handler r12 = new android.os.Handler
            r12.<init>(r0)
            r1.A00 = r12
        L_0x060f:
            r12.removeCallbacks(r13)
        L_0x0612:
            r0 = 44
            X.4rM r12 = new X.4rM
            r12.<init>(r1, r0)
            r1.A01 = r12
            android.os.Handler r13 = r1.A00
            if (r13 != 0) goto L_0x0632
            X.00H r0 = r1.A09
            java.lang.Object r0 = r0.get()
            X.1Nc r0 = (X.C25151Nc) r0
            android.os.Looper r0 = r0.A00()
            android.os.Handler r13 = new android.os.Handler
            r13.<init>(r0)
            r1.A00 = r13
        L_0x0632:
            r0 = 450(0x1c2, double:2.223E-321)
            r13.postDelayed(r12, r0)
            X.6FD r0 = X.C147387Sy.A05
            r3.add(r0)
            java.util.List r0 = r10.A00
            r3.A00(r7, r0, r8)
        L_0x0641:
            if (r14 == 0) goto L_0x0648
            X.6FD r0 = X.C147387Sy.A06
            r3.add(r0)
        L_0x0648:
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x065f
            java.util.List r0 = r4.A0J
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            X.6ca r1 = new X.6ca
            r1.<init>(r0)
            r0 = 6
            X.AnonymousClass6FD.A02(r1, r3, r0)
        L_0x065f:
            java.util.List r0 = r10.A04
            r3.A00(r7, r0, r11)
            int r10 = r22.size()
            java.lang.String r1 = "message"
            int r0 = r6.A01(r1)
            int r0 = r0 + r10
            X.C17890vO.A0z(r1, r5, r0)
        L_0x0672:
            X.77M r0 = r4.A0Z()
            if (r0 != 0) goto L_0x067a
            if (r17 != 0) goto L_0x067f
        L_0x067a:
            java.util.List r0 = r4.A0H
            r3.addAll(r0)
        L_0x067f:
            X.A8w r0 = r4.A02
            if (r0 == 0) goto L_0x0726
            X.77M r0 = r4.A0Z()
            if (r0 != 0) goto L_0x0726
            if (r17 != 0) goto L_0x06ce
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x06a7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.A8w r0 = r4.A02
            X.1DT r0 = r0.A09
            boolean r0 = X.C108965cb.A1W(r0, r1)
            if (r0 == 0) goto L_0x06a7
            r1 = 29
            X.6FG r0 = new X.6FG
            r0.<init>(r9, r1)
            r3.add(r0)
        L_0x06a7:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x06bc
            int r1 = r3.size()
            r0 = 1
            if (r1 != r0) goto L_0x071f
            int r1 = X.C108955ca.A07(r3, r8)
            r0 = 39
            if (r1 != r0) goto L_0x071f
        L_0x06bc:
            r0 = 4911(0x132f, float:6.882E-42)
            boolean r0 = X.C18020vd.A05(r2, r7, r0)
            if (r0 == 0) goto L_0x071c
            X.6FD r0 = X.C147387Sy.A07
            r3.add(r0)
            X.6FD r0 = X.C147387Sy.A03
        L_0x06cb:
            r3.add(r0)
        L_0x06ce:
            boolean r0 = A0H(r4)
            if (r0 != 0) goto L_0x0819
            int r1 = r3.size()
            r0 = 2
            if (r1 < r0) goto L_0x0819
            r2 = 1
            int r0 = X.C108955ca.A07(r3, r2)
            r1 = 43
            if (r0 != r1) goto L_0x0819
            int r0 = r3.size()
            int r0 = r0 - r2
            int r0 = X.C108955ca.A07(r3, r0)
            if (r0 != r1) goto L_0x0819
            java.util.List r0 = r4.A0G
            if (r0 == 0) goto L_0x073e
            int r0 = r0.size()
            int r11 = r4.A0Q
            if (r0 <= r11) goto L_0x073e
            java.util.List r10 = r4.A0G
            int r9 = r4.A0P
            int r8 = X.C108955ca.A08(r10, r9)
            r7 = r11
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
        L_0x0708:
            int r0 = r10.size()
            if (r7 >= r0) goto L_0x072a
            if (r7 >= r8) goto L_0x072a
            java.lang.Object r1 = r10.get(r7)
            r0 = 43
            X.AnonymousClass6FD.A02(r1, r2, r0)
            int r7 = r7 + 1
            goto L_0x0708
        L_0x071c:
            X.6FD r0 = X.C147387Sy.A08
            goto L_0x06cb
        L_0x071f:
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x06ce
            X.6FD r0 = X.C147387Sy.A0B
            goto L_0x06cb
        L_0x0726:
            if (r17 != 0) goto L_0x06ce
            goto L_0x06a7
        L_0x072a:
            r3.addAll(r2)
            java.util.List r0 = r4.A0G
            int r2 = X.C108955ca.A08(r0, r9)
            int r2 = r2 - r11
            java.lang.String r1 = "ai_suggestion"
            int r0 = r6.A01(r1)
            int r0 = r0 + r2
            X.C17890vO.A0z(r1, r5, r0)
        L_0x073e:
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 13
            X.6FD r2 = new X.6FD
            r2.<init>(r1, r0)
            goto L_0x05da
        L_0x074b:
            r3.addAll(r12)
            goto L_0x036f
        L_0x0750:
            r3.addAll(r11)
            goto L_0x0318
        L_0x0755:
            java.util.List r2 = r10.A01
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0807
            java.util.List r0 = r4.A0J
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0774
            java.util.List r0 = r4.A0J
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            X.6ca r1 = new X.6ca
            r1.<init>(r0)
            r0 = 6
            X.AnonymousClass6FD.A02(r1, r3, r0)
        L_0x0774:
            if (r13 == r8) goto L_0x07e6
            if (r13 == r9) goto L_0x07c5
            if (r13 == r11) goto L_0x079d
            if (r13 != r12) goto L_0x0807
            r2.size()
            java.util.Iterator r2 = r2.iterator()
        L_0x0783:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0807
            X.206 r1 = X.C17880vN.A0Y(r2)
            if (r18 == 0) goto L_0x0793
            r0 = 1
            r3.A01(r1, r0)
        L_0x0793:
            boolean r0 = r1 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x0783
            r0 = 10
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x0783
        L_0x079d:
            r2.size()
            java.util.Iterator r2 = r2.iterator()
        L_0x07a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0807
            X.206 r1 = X.C17880vN.A0Y(r2)
            if (r18 == 0) goto L_0x07b4
            r0 = 1
            r3.A01(r1, r0)
        L_0x07b4:
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x07be
            r0 = 50
        L_0x07ba:
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x07a4
        L_0x07be:
            boolean r0 = r1 instanceof X.C441522i
            if (r0 == 0) goto L_0x07a4
            r0 = 52
            goto L_0x07ba
        L_0x07c5:
            r2.size()
            java.util.Iterator r2 = r2.iterator()
        L_0x07cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0807
            X.206 r1 = X.C17880vN.A0Y(r2)
            boolean r0 = r1 instanceof X.C438421d
            if (r0 == 0) goto L_0x07cc
            if (r18 == 0) goto L_0x07e0
            r0 = 1
            r3.A01(r1, r0)
        L_0x07e0:
            r0 = 9
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x07cc
        L_0x07e6:
            r2.size()
            java.util.Iterator r2 = r2.iterator()
        L_0x07ed:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0807
            X.206 r1 = X.C17880vN.A0Y(r2)
            boolean r0 = r1 instanceof X.C440021t
            if (r0 == 0) goto L_0x07ed
            if (r18 == 0) goto L_0x0801
            r0 = 1
            r3.A01(r1, r0)
        L_0x0801:
            r0 = 8
            X.AnonymousClass6FD.A02(r1, r3, r0)
            goto L_0x07ed
        L_0x0807:
            int r0 = r3.size()
            if (r0 == 0) goto L_0x027d
            X.1Dg r0 = r4.A0c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.A0E(r1)
            X.1Dg r0 = r4.A0b
        L_0x0816:
            r0.A0E(r1)
        L_0x0819:
            return r3
        L_0x081a:
            r20 = 0
            X.6k7 r0 = r4.A0S
            if (r0 == 0) goto L_0x082a
            X.1DT r0 = r0.A03
            boolean r0 = X.C108965cb.A1W(r0, r1)
            if (r0 == 0) goto L_0x082a
            goto L_0x0250
        L_0x082a:
            r19 = 0
            goto L_0x0252
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111295jU.A04(X.5jU):X.7Sy");
    }

    public static C147387Sy A05(C111295jU r2) {
        C22801Dg r1 = r2.A0h;
        if (r1.A06() == null) {
            return A04(r2);
        }
        return (C147387Sy) r1.A06();
    }

    public static void A06(SparseIntArray sparseIntArray, C111295jU r4) {
        if (r4.A02 != null && !TextUtils.isEmpty(r4.A0b()) && r4.A0U() == 0) {
            if (C20135A8w.A0R.A03(r4.A0y)) {
                synchronized (r4) {
                    boolean A1W2 = C108965cb.A1W(r4.A02.A09, Boolean.FALSE);
                    boolean A1a2 = AnonymousClass000.A1a(r4.A0H);
                    if (A1W2) {
                        if (A1a2) {
                            if (sparseIntArray.size() != 0) {
                                sparseIntArray.put(98, 0);
                            }
                        } else if (r4.A01.get(98, -1) != -1) {
                            sparseIntArray.delete(98);
                        }
                    }
                }
            }
        }
    }

    public static void A07(C111295jU r6) {
        r6.A1U.set(true);
        Map map = r6.A1S;
        for (Object put : map.keySet()) {
            map.put(put, false);
        }
        if (TextUtils.isEmpty(r6.A0b()) && r6.A0U() == 0 && r6.A0Y() == null && r6.A0a() == null && r6.A0Z() == null) {
            r6.A1T.set(true);
            r6.A15.A02 = false;
            r6.A0N = true;
        } else if (r6.A0N) {
            r6.A00 = SystemClock.uptimeMillis();
            r6.A0N = false;
        }
    }

    public static void A08(C111295jU r2) {
        r2.A0D = new C146777Qo(r2, 15);
        C200710s r1 = r2.A1k;
        r1.A03();
        r1.execute(r2.A0D);
    }

    public static void A09(C111295jU r8, int i) {
        C19880zA r2 = r8.A0m;
        boolean A072 = r2.A07();
        Integer A0k2 = C17880vN.A0k();
        if (A072) {
            r2.A03();
            r8.A0a();
            throw AnonymousClass000.A0s("logSmartFilterEvent");
        }
        if (C20045A4o.A01(r8.A0y)) {
            r8.A19.A01(5, A0k2, Integer.valueOf(i), (String) null, C109005cf.A01(r8.A0U()));
        }
        C139976zk r3 = r8.A15;
        Boolean bool = Boolean.TRUE;
        C22801Dg r22 = r8.A0d;
        r3.A03(C108965cb.A1W(r22, bool));
        r3.A02(AnonymousClass00R.A01, C108965cb.A1W(r22, Boolean.TRUE));
    }

    public static void A0A(C111295jU r9, int i, int i2) {
        Integer num;
        int i3;
        if (C20045A4o.A01(r9.A0y)) {
            C139376yj r2 = r9.A19;
            int A0U2 = r9.A0U();
            AnonymousClass77Z r6 = (AnonymousClass77Z) r9.A0Y.A06();
            if (i == 4) {
                C22801Dg r1 = r9.A14.A02;
                if (r1.A06() == null || ((Pair) r1.A06()).second == null) {
                    i3 = 0;
                } else {
                    i3 = C108965cb.A00((Pair) r1.A06());
                }
                num = Integer.valueOf(i3);
            } else {
                num = null;
            }
            if (C20045A4o.A01(r2.A07)) {
                AM6 am6 = (AM6) r2.A08.get();
                Long valueOf = Long.valueOf(r2.A02);
                if (C20045A4o.A01(am6.A00)) {
                    AnonymousClass2H5 r4 = new AnonymousClass2H5();
                    r4.A00 = 54;
                    r4.A03 = Integer.valueOf(i);
                    HashMap A112 = C17880vN.A11();
                    if (num != null) {
                        A112.put("page_no", num);
                    }
                    A112.put("serp_size", Integer.valueOf(i2));
                    r4.A0A = new JSONObject(A112).toString();
                    if (valueOf != null) {
                        r4.A07 = valueOf;
                    }
                    AM6.A03(am6, r4);
                    int i4 = 2;
                    int A012 = C109005cf.A01(A0U2);
                    if (r6 != null) {
                        int i5 = r6.A01;
                        if (i5 == 0) {
                            i4 = 10;
                        } else if (i5 == 1) {
                            i4 = 11;
                        } else if (i5 != 2) {
                            i4 = 3;
                            if (i5 == 3) {
                                i4 = 18;
                            } else if (i5 != 4) {
                                i4 = 22;
                                if (i5 != 5) {
                                    i4 = A012;
                                }
                            }
                        }
                        A012 = i4;
                    }
                    r4.A01 = Integer.valueOf(A012);
                    am6.A01.CC7(r4);
                }
            }
        }
    }

    private boolean A0C() {
        if (this.A06.A02.isEmpty()) {
            return false;
        }
        Boolean bool = (Boolean) this.A0l.A02("user_grid_view_choice");
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!A0J(Integer.valueOf(A0U())) || A0U() == 115 || !A0b().isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean A0D() {
        Boolean bool = Boolean.TRUE;
        if (C108965cb.A1W(this.A12.A03, bool) || C108965cb.A1W(this.A13.A02, bool)) {
            return true;
        }
        C130856k7 r0 = this.A0S;
        if (r0 == null || !C108965cb.A1W(r0.A03, bool)) {
            return false;
        }
        return true;
    }

    private boolean A0E() {
        if ((!C108965cb.A1W(this.A14.A04, Boolean.TRUE) || this.A06.A02.size() > 0) && this.A01.size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean A0G(C111295jU r2) {
        Boolean bool = C17970vW.A03;
        return AnonymousClass000.A1R(C18020vd.A00(new C18040vf(true), r2.A0y, 8585));
    }

    public static boolean A0H(C111295jU r3) {
        Boolean bool = Boolean.TRUE;
        C130916kD r1 = r3.A17;
        if (!C108965cb.A1W(r1.A03, bool) && !C108965cb.A1W(r3.A14.A04, bool) && !C108965cb.A1W(r1.A04, bool) && !r3.A0D()) {
            return false;
        }
        if (r3.A02 == null || 98 != r3.A0U()) {
            return true;
        }
        return false;
    }

    public static boolean A0I(C111295jU r4) {
        int A0A2;
        C22801Dg r1 = r4.A14.A02;
        boolean z = false;
        if (r1.A06() != null) {
            Boolean bool = (Boolean) ((Pair) r1.A06()).first;
            Number number = (Number) ((Pair) r1.A06()).second;
            if (bool != null && !bool.booleanValue() && number != null && number.intValue() > 0) {
                z = true;
            }
        }
        if (z) {
            if (r4.A0D()) {
                return false;
            }
            AnonymousClass1DT r12 = r4.A0j;
            if (r12.A06() == null) {
                A0A2 = 0;
            } else {
                A0A2 = C72463Mc.A0A(r12);
            }
            if (A0A2 + 300 <= A05(r4).size()) {
                return false;
            }
        }
        return true;
    }

    public int A0T() {
        Number number = (Number) this.A0l.A02("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A0U() {
        Number A1C2 = C108945cZ.A1C(this.A0l.A00(0, "search_type"));
        if (A1C2 != null) {
            return A1C2.intValue();
        }
        return 0;
    }

    public int A0X(AnonymousClass21V r6) {
        int i;
        int i2 = -2;
        if (this.A06.A01.contains(r6)) {
            C147387Sy A052 = A05(this);
            for (int i3 = 0; i3 < A052.size(); i3++) {
                if (i3 < 0 || i3 >= A052.size()) {
                    i = -1;
                } else {
                    i = C108955ca.A07(A052, i3);
                }
                if ((C39611tM.A00(i) || i == 17 || i == 18 || i == 16 || i == 14 || i == 51 || i == 53) && C42171xk.A00((AnonymousClass206) C108955ca.A0o(A052, i3), r6)) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    public UserJid A0Y() {
        return (UserJid) this.A0l.A00((Object) null, "search_jid").A06();
    }

    public AnonymousClass77M A0Z() {
        return (AnonymousClass77M) this.A0l.A00((Object) null, "remote_entity_filter").A06();
    }

    public AnonymousClass77Z A0a() {
        return (AnonymousClass77Z) this.A0l.A00((Object) null, "smart_filter").A06();
    }

    public String A0b() {
        String A1F2 = C108945cZ.A1F(this.A0l.A00("", "query_text"));
        if (A1F2 != null) {
            return A1F2;
        }
        return "";
    }

    public void A0e() {
        C131036kP r0 = this.A12;
        r0.A02.A0E(r0.A0B);
        C131046kQ r02 = this.A13;
        r02.A01.A0E(r02.A0B);
    }

    public void A0f() {
        this.A19.A01(2, (Integer) null, (Integer) null, (String) null, 2);
        A0o(new AnonymousClass77Z(2, 2131434973, 2131890409, 2131232371));
    }

    public void A0j(AnonymousClass1BI r12, int i) {
        int A0U2;
        Integer num;
        int intValue;
        int intValue2;
        String str;
        AnonymousClass3MY.A1L(this.A0k, false);
        C42621yT r0 = this.A14.A0I;
        if (r0 != null) {
            r0.A01();
        }
        C130916kD r02 = this.A17;
        C42621yT r1 = r02.A09;
        C42621yT r03 = r02.A0A;
        if (r1 != null) {
            r1.A01();
        }
        if (r03 != null) {
            r03.A01();
        }
        A0g(1);
        C139976zk r2 = this.A15;
        Boolean bool = Boolean.TRUE;
        C22801Dg r3 = this.A0d;
        r2.A03(C108965cb.A1W(r3, bool));
        if (r12 != null) {
            int A0W2 = A0W(r12);
            C20135A8w a8w = this.A02;
            if (a8w == null || !a8w.A0C(r12)) {
                C19880zA r5 = this.A0m;
                if (r5.A07()) {
                    r5.A03();
                    A0a();
                    throw AnonymousClass000.A0s("logSmartFilterEvent");
                }
                AnonymousClass77Z A0a2 = A0a();
                if (A0a2 == null || 2 != A0a2.A01) {
                    A0U2 = A0U();
                } else {
                    A0U2 = 117;
                }
                this.A19.A01(5, Integer.valueOf(A0W2), Integer.valueOf(i), (String) null, C109005cf.A01(A0U2));
            } else {
                A0g(5);
                C20135A8w a8w2 = this.A02;
                if (a8w2 != null) {
                    UserJid A002 = C22941Dw.A00(r12);
                    List<C39611tM> A102 = AnonymousClass3MW.A10(a8w2.A07);
                    if (A102 != null) {
                        for (C39611tM r6 : A102) {
                            if (r6 instanceof C1776199s) {
                                String str2 = ((C1776199s) r6).A02.A07;
                                if (A002 != null) {
                                    str = A002.getRawString();
                                } else {
                                    str = null;
                                }
                                if (C18070vi.A18(str2, str)) {
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    r6 = null;
                    C1776199s r62 = (C1776199s) r6;
                    if (r62 != null) {
                        C195819tx r63 = r62.A02;
                        if (r63.A0C) {
                            JSONObject A152 = C17880vN.A15();
                            String str3 = r63.A05;
                            if (str3 != null) {
                                A152.put("biz_creation_date", str3);
                            }
                            Integer num2 = r63.A02;
                            if (num2 != null && (intValue2 = num2.intValue()) >= 0) {
                                A152.put("fb_follower_count", intValue2);
                            }
                            Integer num3 = r63.A03;
                            if (num3 != null && (intValue = num3.intValue()) >= 0) {
                                A152.put("ig_follower_count", intValue);
                            }
                            if (C18020vd.A05(C18040vf.A02, this.A0y, 7135)) {
                                this.A1Q.CGF(new AnonymousClass3C5(this, r12, A152, 40));
                            }
                        }
                    }
                }
            }
            this.A1E.A0F(r12);
            if (A0W2 == 1) {
                num = AnonymousClass00R.A0Y;
            } else if (A0W2 == 2) {
                num = AnonymousClass00R.A0C;
            } else if (A0W2 != 5) {
                num = AnonymousClass00R.A0N;
            } else {
                num = AnonymousClass00R.A0j;
            }
            r2.A02(num, C108965cb.A1W(r3, Boolean.TRUE));
        }
    }

    public void A0l(AnonymousClass77M r4) {
        C20135A8w a8w = this.A02;
        if (a8w != null) {
            AM6 am6 = (AM6) a8w.A0H.get();
            if (C20045A4o.A01(am6.A00)) {
                C171228rN r1 = new C171228rN();
                r1.A00 = AnonymousClass3MY.A0f();
                r1.A01 = C17880vN.A0h();
                AM6.A01(am6, r1);
                am6.A01.CC7(r1);
            }
        }
        A0m(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r2 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0n(X.AnonymousClass206 r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0047
            r1 = 1
            int r0 = r6.A0C()
            if (r1 != r0) goto L_0x0047
            X.1hH r4 = r5.A1f
            X.205 r0 = r6.A0v
            X.1BI r2 = r0.A00
            r0 = 5
            X.2HB r3 = new X.2HB
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            if (r2 == 0) goto L_0x0042
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x0042
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1MZ r1 = r4.A04
            boolean r0 = r1.A0J(r2)
            boolean r2 = r1.A0K(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0035
            r0 = 1
            if (r2 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r0
        L_0x0042:
            X.18K r0 = r4.A05
            r0.CC7(r3)
        L_0x0047:
            r0 = 0
            r5.C2N(r0)
            X.6q8 r0 = r5.A14
            X.1yT r0 = r0.A0I
            if (r0 == 0) goto L_0x0054
            r0.A01()
        L_0x0054:
            X.6kD r0 = r5.A17
            X.1yT r1 = r0.A09
            X.1yT r0 = r0.A0A
            if (r1 == 0) goto L_0x005f
            r1.A01()
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            r0.A01()
        L_0x0064:
            r0 = 2
            r5.A0g(r0)
            A09(r5, r7)
            X.1wy r0 = r5.A1O
            r0.A0F(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111295jU.A0n(X.206, int):void");
    }

    public void A0p(boolean z) {
        this.A15.A03(C108965cb.A1W(this.A0d, Boolean.TRUE));
        A0d();
        A0h(1);
        A0g(4);
        C134186qB r3 = this.A0R;
        if (r3 != null) {
            r3.A00();
            AnonymousClass3MX.A1Q(new AISearchTypeAheadSuggestionsProvider$onSearchExit$1(r3, (C30391dr) null), r3.A0J);
        }
        C130976kJ r0 = this.A07;
        if (r0 != null) {
            AnonymousClass3Ma.A1R(r0.A00);
        }
        AnonymousClass3MY.A1M(this.A1I, z);
    }

    public C160898Aj BHd(AnonymousClass21V r2) {
        return new AnonymousClass7JU(this);
    }

    public void BlK() {
        this.A1D.A0E((Object) null);
    }

    public void Bok() {
        Integer num;
        if (!(this.A02 == null || A0Z() == null)) {
            C20135A8w a8w = this.A02;
            List A102 = AnonymousClass3MW.A10(a8w.A07);
            if (A102 != null) {
                ArrayList A132 = AnonymousClass000.A13();
                for (Object next : A102) {
                    if (next instanceof C1776199s) {
                        A132.add(next);
                    }
                }
                num = Integer.valueOf(A132.size());
            } else {
                num = null;
            }
            AM6 am6 = (AM6) a8w.A0H.get();
            int A032 = C108955ca.A03(a8w.A0F);
            int A0B2 = C72463Mc.A0B(num);
            String A0A2 = a8w.A0A();
            if (C20045A4o.A01(am6.A00)) {
                C171228rN r5 = new C171228rN();
                r5.A00 = AnonymousClass3MY.A0g();
                r5.A01 = C17880vN.A0h();
                AM6.A01(am6, r5);
                AM6.A02(am6, r5, (Boolean) null, Integer.valueOf(A032), (Integer) null, (Integer) null, Integer.valueOf(A0B2), (Integer) null, (Integer) null, (Integer) null, (Long) null, A0A2, (List) null);
                am6.A01.CC7(r5);
            }
        }
        A0d();
        C2N(true);
    }

    public void C30(boolean z) {
        if (C20135A8w.A0R.A02(this.A0y)) {
            A0m((AnonymousClass77M) null);
            if (z) {
                A0i(0);
                C22801Dg r1 = this.A0g;
                r1.A0F(r1.A06());
            }
        }
    }

    public void C54() {
        C38581rX r3 = this.A10;
        if (C18020vd.A05(C18040vf.A01, r3.A01, 8294) && r3.A01()) {
            String A0b2 = A0b();
            int i = 4;
            if (A0b2.isEmpty()) {
                i = 3;
            }
            this.A1P.A0E(new C19760yx(new AnonymousClass77E((AnonymousClass775) null, A0b2, (String) null, "entrypoint_echo_enter", (String) null), new AnonymousClass772(AnonymousClass6R7.USER_INPUT, i)));
            C139976zk r2 = this.A15;
            AnonymousClass64Y r1 = new AnonymousClass64Y();
            Long A0X2 = C108975cc.A0X();
            r1.A04 = A0X2;
            r1.A0A = A0X2;
            r1.A01 = AnonymousClass3MY.A0g();
            r1.A02 = C17880vN.A0h();
            r2.A03.CC7(r1);
            r2.A03(C108965cb.A1W(this.A0d, Boolean.TRUE));
        }
    }

    public static AnonymousClass77E A00(C147387Sy r5) {
        int i;
        if (!r5.isEmpty()) {
            int i2 = 1;
            if (C108955ca.A07(r5, 0) == 46) {
                i2 = 2;
            }
            if (r5.size() > i2) {
                C39611tM r3 = (C39611tM) r5.get(i2);
                C39611tM r2 = (C39611tM) r5.get(r5.size() - 1);
                if (r3.A00 == 43 && ((i = r2.A00) == 43 || i == 13)) {
                    return (AnonymousClass77E) r3.A01;
                }
            }
        }
        return null;
    }

    public static void A0B(C111295jU r2, Integer num, AbstractCollection abstractCollection, List list, List list2) {
        abstractCollection.addAll(list);
        if (list.size() < list2.size()) {
            abstractCollection.add(r2.A03(num));
        }
    }

    private boolean A0F(long j) {
        long longValue;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0l.A02("last_nav_time");
        if (number == null) {
            longValue = 0;
        } else {
            longValue = number.longValue();
        }
        return AnonymousClass000.A1R(((elapsedRealtime - longValue) > j ? 1 : ((elapsedRealtime - longValue) == j ? 0 : -1)));
    }

    public static boolean A0J(Integer num) {
        int intValue = num.intValue();
        if (intValue == 103 || intValue == 105 || intValue == 118 || intValue == 115) {
            return true;
        }
        return false;
    }

    public void A0S() {
        A0d();
        this.A1a.A02();
        C20135A8w a8w = this.A02;
        if (a8w != null) {
            ((A2R) a8w.A0I.get()).A03();
        }
        C24681Lg r1 = this.A0w;
        r1.unregisterObserver(this.A14.A0A);
        r1.unregisterObserver(this.A17.A06);
        r1.unregisterObserver(this.A0v);
        C134186qB r2 = this.A0R;
        if (r2 != null) {
            r2.A07.A0D(r2.A0B);
            r2.A09.A0D(r2.A0C);
            r2.A05.A0D(r2.A0A);
        }
        C130976kJ r22 = this.A07;
        if (r22 != null) {
            r22.A02.A0D(r22.A05);
            r22.A03.A0D(r22.A06);
        }
    }

    public int A0V(AnonymousClass1BI r6) {
        C147387Sy A052 = A05(this);
        int i = -2;
        for (int i2 = 0; i2 < A052.size(); i2++) {
            if ((C108955ca.A07(A052, i2) == 3 || C108955ca.A07(A052, i2) == 2 || C108955ca.A07(A052, i2) == 49) && C42171xk.A00(((C39621tN) A052.get(i2)).BTb(), r6)) {
                i = i2;
            }
        }
        return i;
    }

    public int A0W(AnonymousClass1BI r3) {
        if (C22971Dz.A0e(r3)) {
            return 2;
        }
        if (C22971Dz.A0O(r3)) {
            return 3;
        }
        if (this.A1b.A06().contains(r3)) {
            return 1;
        }
        C20135A8w a8w = this.A02;
        if (a8w == null || !a8w.A0C(r3)) {
            return 0;
        }
        return 5;
    }

    public void A0c() {
        AnonymousClass77Z A0a2 = A0a();
        if (A0a2 != null && 2 == A0a2.A01) {
            A0e();
        }
    }

    public void A0g(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C37361pP r2 = this.A0l;
        r2.A04("last_nav_time", Long.valueOf(elapsedRealtime));
        r2.A04("last_nav_type", Integer.valueOf(i));
    }

    public void A0h(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!C42171xk.A00(valueOf, this.A0U.A06())) {
            this.A0l.A04("current_screen", valueOf);
        }
    }

    public void A0i(int i) {
        String str;
        if (A0a() == null && i != A0U()) {
            C139376yj r6 = this.A19;
            int A012 = C109005cf.A01(i);
            if (i == 98) {
                str = A0b();
            } else {
                str = null;
            }
            r6.A01(2, (Integer) null, (Integer) null, str, A012);
            A0o((AnonymousClass77Z) null);
            if (i == 98 && A0Z() == null) {
                A0m(((C133666pH) this.A1l.get()).A00());
            } else {
                C30(false);
            }
            AnonymousClass7T2 r4 = this.A08;
            Integer valueOf = Integer.valueOf(i);
            r4.A00(new AnonymousClass71J(A0Y(), valueOf, A0b(), 2));
            this.A0l.A04("search_type", valueOf);
        }
    }

    public void A0k(UserJid userJid) {
        if (!C42171xk.A00(userJid, A0Y())) {
            this.A08.A00(new AnonymousClass71J(userJid, Integer.valueOf(A0U()), A0b(), 3));
            this.A0l.A04("search_jid", userJid);
        }
    }

    public void A0m(AnonymousClass77M r5) {
        if (!C42171xk.A00(r5, A0Z())) {
            this.A08.A00(new AnonymousClass71J(r5, 98, A0b()));
            C37361pP r1 = this.A0l;
            r1.A04("remote_entity_filter", r5);
            r1.A04("search_type", 98);
        }
    }

    public void A0o(AnonymousClass77Z r4) {
        if (A0U() == 0 && !C42171xk.A00(r4, A0a())) {
            this.A08.A00(new AnonymousClass71J(r4, A0b()));
            this.A0l.A04("smart_filter", r4);
        }
    }

    public boolean A0q() {
        if (A0Y() == null && A0U() == 0 && A0a() == null && A0Z() == null) {
            return true;
        }
        return false;
    }

    public void C2N(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass1DT r1 = this.A0k;
        if (!C108965cb.A1W(r1, valueOf)) {
            r1.A0F(valueOf);
        }
    }

    public void CKI(String str) {
        if (!C42171xk.A00(str, A0b())) {
            this.A08.A00(new AnonymousClass71J(A0Y(), Integer.valueOf(A0U()), str, 1));
            this.A0l.A04("query_text", str);
            AnonymousClass3MY.A1L(this.A0d, AnonymousClass000.A1O(this.A10.A00() ? 1 : 0));
        }
    }

    public void CPX() {
        this.A0l.A04("user_grid_view_choice", C108945cZ.A1A(A0C()));
    }

    @OnLifecycleEvent(C27581Wq.ON_PAUSE)
    public void onPause() {
        A0T();
        if (A0T() != 2 && A0T() != 1 && A0T() != 5 && A0T() != 4) {
            if (A0T() != 0 || A0F(500)) {
                A0g(3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1 == 5) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    @androidx.lifecycle.OnLifecycleEvent(X.C27581Wq.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r6 = this;
            r6.A0T()
            int r1 = r6.A0T()
            r3 = 0
            if (r1 == 0) goto L_0x001c
            r4 = 1
            if (r1 == r4) goto L_0x004d
            r0 = 2
            r4 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == r0) goto L_0x003f
            r0 = 3
            if (r1 == r0) goto L_0x0048
            r0 = 4
            if (r1 == r0) goto L_0x001c
            r0 = 5
            if (r1 == r0) goto L_0x008c
        L_0x001c:
            r4 = 0
        L_0x001d:
            X.1wR r5 = r6.A11
            X.0ve r2 = r6.A0y
            X.C18070vi.A0d(r2, r3)
            r1 = 7495(0x1d47, float:1.0503E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r5.A00()
        L_0x0032:
            r6.A0O = r0
            if (r4 == 0) goto L_0x007a
            r6.A0T()
            r6.A0p(r3)
            return
        L_0x003d:
            r0 = 0
            goto L_0x0032
        L_0x003f:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r6.A0F(r0)
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r4 = r6.A0F(r4)
            goto L_0x001d
        L_0x004d:
            X.0ve r2 = r6.A0y
            r1 = 1608(0x648, float:2.253E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0068
            X.77Z r0 = r6.A0a()
            if (r0 == 0) goto L_0x0068
            r1 = 2
            int r0 = r0.A01
            if (r1 != r0) goto L_0x0068
            r6.A0e()
            goto L_0x001c
        L_0x0068:
            X.77M r0 = r6.A0Z()
            if (r0 == 0) goto L_0x001d
            X.A8w r0 = r6.A02
            if (r0 == 0) goto L_0x001c
            X.1Dg r1 = r0.A08
            X.1jz r0 = r0.A0F
            r1.A0E(r0)
            goto L_0x001c
        L_0x007a:
            X.6q8 r0 = r6.A14
            X.1Dg r1 = r0.A00
            X.1jz r0 = r0.A0D
            r1.A0E(r0)
            X.6kD r0 = r6.A17
            X.1Dg r1 = r0.A02
            X.1jz r0 = r0.A08
            r1.A0E(r0)
        L_0x008c:
            r6.A0g(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111295jU.onResume():void");
    }

    public C111295jU(C37361pP r47, C19880zA r48, C19880zA r49, C19880zA r50, AnonymousClass190 r51, AnonymousClass6ZJ r52, C51072Ww r53, C61842qN r54, C51092Wy r55, C51102Wz r56, AnonymousClass2X2 r57, AnonymousClass2X3 r58, C51252Xo r59, AnonymousClass2Y5 r60, AnonymousClass2Y8 r61, AnonymousClass1KB r62, AnonymousClass1NP r63, C37451pZ r64, C25161Nd r65, AnonymousClass11P r66, AnonymousClass118 r67, C18000vb r68, AnonymousClass1QB r69, C24681Lg r70, C24751Ln r71, C42221xp r72, AnonymousClass6nA r73, C32491hH r74, C18030ve r75, AnonymousClass18K r76, C32011gU r77, C38581rX r78, AnonymousClass1XN r79, C41461wR r80, C139976zk r81, C139376yj r82, C62112qo r83, C138036wQ r84, C30361do r85, C36331ni r86, AnonymousClass10I r87, AnonymousClass00H r88, AnonymousClass00H r89, AnonymousClass00H r90) {
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A0g = A0R2;
        this.A0i = C108945cZ.A0S();
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A0j = A0S2;
        this.A0O = false;
        this.A1U = new AtomicBoolean();
        this.A1T = new AtomicBoolean();
        this.A0b = C108945cZ.A0R();
        this.A0c = C108945cZ.A0R();
        C22801Dg A0R3 = C108945cZ.A0R();
        this.A0d = A0R3;
        this.A1S = C17880vN.A11();
        this.A1m = C17880vN.A11();
        this.A0I = AnonymousClass000.A13();
        this.A0K = AnonymousClass000.A13();
        this.A0M = AnonymousClass000.A13();
        this.A0A = null;
        this.A0J = AnonymousClass000.A13();
        this.A0L = AnonymousClass000.A13();
        this.A0H = AnonymousClass000.A13();
        this.A09 = null;
        this.A0G = null;
        this.A0Q = 0;
        this.A0P = 0;
        this.A01 = new SparseIntArray();
        this.A06 = new C139096yD();
        this.A08 = new AnonymousClass7T2();
        this.A00 = 0;
        this.A0N = true;
        C22801Dg A0R4 = C108945cZ.A0R();
        this.A0h = A0R4;
        C22801Dg A0R5 = C108945cZ.A0R();
        this.A0f = A0R5;
        C22801Dg A0R6 = C108945cZ.A0R();
        this.A0a = A0R6;
        this.A0T = new Handler(Looper.getMainLooper(), new AnonymousClass75Y(this, 6));
        this.A0v = new AnonymousClass7FH(this, 6);
        this.A1h = new C126336cZ(this);
        this.A1Z = (C49992Ss) AnonymousClass12Q.A03(C49992Ss.class);
        this.A16 = new C143687Ej(this);
        this.A1V = new AnonymousClass7S6(this, 0);
        this.A0s = r67;
        AnonymousClass11P r45 = r66;
        this.A1c = r45;
        C18030ve r44 = r75;
        this.A0y = r44;
        this.A0q = r62;
        this.A0o = r51;
        AnonymousClass10I r6 = r87;
        this.A1Q = r6;
        this.A0z = r77;
        this.A11 = r80;
        this.A0t = r68;
        this.A0u = r69;
        this.A0w = r70;
        C37361pP r4 = r47;
        this.A0l = r4;
        this.A0n = r48;
        this.A1B = r86;
        this.A1d = r72;
        this.A1a = r64;
        this.A1g = r79;
        C38581rX r43 = r78;
        this.A10 = r43;
        this.A0r = r63;
        this.A1b = r65;
        this.A1R = r89;
        this.A0m = r49;
        this.A1i = r83;
        this.A19 = r82;
        this.A1j = r85;
        this.A15 = r81;
        this.A1f = r74;
        this.A1l = r90;
        this.A1A = r84;
        this.A1Y = r50;
        this.A0p = r52;
        this.A1e = r73;
        this.A0x = r71;
        this.A1k = new C200710s(r6, true);
        this.A0U = r4.A01("current_screen");
        A0R2.A0H(r4.A01("query_text"), new AnonymousClass7AR(A0R2, 49));
        AnonymousClass1DT A012 = r4.A01("search_type");
        this.A0X = A012;
        AnonymousClass1DT A013 = r4.A01("search_jid");
        this.A0W = A013;
        AnonymousClass1DT A014 = r4.A01("smart_filter");
        this.A0Y = A014;
        AnonymousClass1DT A015 = r4.A01("remote_entity_filter");
        this.A0V = A015;
        AnonymousClass1DT A016 = r4.A01("user_grid_view_choice");
        this.A1X = A016;
        AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M(Collections.EMPTY_LIST);
        this.A1W = A0M2;
        AnonymousClass1K2 r2 = r59.A00;
        AnonymousClass10E r5 = r2.A01;
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r5);
        AnonymousClass18K A0g2 = AnonymousClass3Ma.A0g(r5);
        AnonymousClass10G r7 = r5.A00;
        C18000vb A6Q = AnonymousClass10E.A6Q(r5);
        AnonymousClass1K1 r22 = r2.A00;
        C22801Dg r26 = A0R2;
        AnonymousClass1DT r27 = A012;
        AnonymousClass1DT r28 = A013;
        AnonymousClass1DT r29 = A014;
        C131036kP r25 = new C131036kP(r26, r27, r28, r29, (C131326ku) r22.A3g.get(), (C31191fA) r5.A25.get(), (C25161Nd) r5.A2v.get(), A6O, A6Q, AnonymousClass3MZ.A0m(r5), A0g2, (AnonymousClass19Y) r5.A3h.get(), (C1602687u) r22.A3c.get(), (C62112qo) r7.A4X.get(), (CW0) r7.A31.get());
        this.A12 = r25;
        AnonymousClass1K2 r23 = r61.A00;
        AnonymousClass10E r510 = r23.A01;
        AnonymousClass11P A6O2 = AnonymousClass10E.A6O(r510);
        r510.A04.get();
        AnonymousClass18K A0g3 = AnonymousClass3Ma.A0g(r510);
        AnonymousClass10G r610 = r510.A00;
        AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r510);
        C24921Me A0g4 = AnonymousClass3MZ.A0g(r510);
        C18000vb A6Q2 = AnonymousClass10E.A6Q(r510);
        AnonymousClass1K1 r24 = r23.A00;
        C131046kQ r252 = new C131046kQ(r26, r27, r28, r29, (C131326ku) r24.A3g.get(), (C31191fA) r510.A25.get(), A4z, A0g4, (C25161Nd) r510.A2v.get(), A6O2, A6Q2, AnonymousClass3MZ.A0m(r510), A0g3, (AnonymousClass19Y) r510.A3h.get(), (C62112qo) r610.A4X.get(), (C52682bJ) r24.A4W.get(), (CW0) r610.A31.get());
        this.A13 = r252;
        C134156q8 A017 = r54.A01(A0R2, A012, A013, A014, A0M2);
        this.A14 = A017;
        AnonymousClass10E r611 = r55.A00.A01;
        AnonymousClass1DT r30 = A015;
        C130916kD r253 = new C130916kD(r26, r27, r28, r29, r30, AnonymousClass10E.A6Q(r611), (AnonymousClass1QB) r611.A4T.get(), AnonymousClass10E.A8r(r611), (CW0) r611.A00.A31.get());
        this.A17 = r253;
        C18040vf r9 = C18040vf.A02;
        if (C18020vd.A05(r9, r44, 1448)) {
            C22801Dg r282 = r253.A00;
            C22801Dg r14 = r252.A00;
            AnonymousClass1K2 r612 = r60.A00;
            AnonymousClass10E r710 = r612.A01;
            C18030ve A8r = AnonymousClass10E.A8r(r710);
            this.A0S = new C130856k7(A012, A014, r282, r14, (C131326ku) r612.A00.A3g.get(), r45, A8r, r76, (AnonymousClass1UL) r710.A4x.get(), (AnonymousClass19Y) r710.A3h.get(), (CW0) r710.A00.A31.get());
        }
        if (C18020vd.A00(r9, this.A0y, 6740) == 1) {
            AnonymousClass1K2 r613 = r56.A00;
            AnonymousClass10E r8 = r613.A01;
            C18000vb A6Q3 = AnonymousClass10E.A6Q(r8);
            AnonymousClass10G r711 = r8.A00;
            AnonymousClass11P A6O3 = AnonymousClass10E.A6O(r8);
            AnonymousClass18K A0g5 = AnonymousClass3Ma.A0g(r8);
            this.A05 = new C131056kR(A0R2, A012, A013, A014, (C131326ku) r613.A00.A3g.get(), AnonymousClass3MZ.A0g(r8), A6O3, A6Q3, (C132336mc) r711.A3U.get(), A0g5, (CW0) r711.A31.get());
        }
        if (C18020vd.A05(r9, this.A0y, 11117)) {
            AnonymousClass10E r712 = r57.A00.A01;
            AnonymousClass18K A0g6 = AnonymousClass3Ma.A0g(r712);
            this.A07 = new C130976kJ(A0R2, A012, (DialerContactQuerySyncManager) r712.A00.A1O.get(), AnonymousClass10E.A4z(r712), A0g6, AnonymousClass3MZ.A1B(r712), (AnonymousClass1OX) r712.A9C.get());
        }
        if (r43.A00()) {
            AnonymousClass1DT A002 = r4.A00(0, "search_type");
            AnonymousClass1K2 r713 = r58.A00;
            AnonymousClass10E r614 = r713.A01;
            C18030ve A8r2 = AnonymousClass10E.A8r(r614);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r614);
            AnonymousClass11E A0d2 = AnonymousClass3MZ.A0d(r614);
            C134186qB r254 = new C134186qB(A0R2, A0S2, A0R4, A002, (C131326ku) r713.A00.A3g.get(), A0d2, (MetaAISearchRepository) r614.A00.A3D.get(), A8r2, AL1, AnonymousClass3MZ.A1B(r614), (AnonymousClass1OX) r614.A9C.get());
            this.A0R = r254;
            this.A0Q = 3;
            this.A0P = r254.A03;
        }
        AnonymousClass7S4 r714 = new AnonymousClass7S4(this, 17);
        AnonymousClass10E r810 = r53.A00.A01;
        C22801Dg r262 = A0R2;
        AnonymousClass1DT r272 = A012;
        AnonymousClass1DT r283 = A013;
        AnonymousClass1DT r292 = A014;
        C25021CTx cTx = new C25021CTx(r262, r272, r283, r292, AnonymousClass10E.A6Q(r810), (CW0) r810.A00.A31.get(), C000200d.A00(r810.A25), C000200d.A00(r810.A26), r714);
        this.A18 = cTx;
        C24681Lg r715 = this.A0w;
        r715.registerObserver(this.A14.A0A);
        r715.registerObserver(this.A17.A06);
        r715.registerObserver(this.A0v);
        AnonymousClass7AP.A01(r25.A01, A0R4, this, 0);
        AnonymousClass7AP.A01(r252.A00, A0R4, this, 1);
        C131056kR r615 = this.A05;
        if (r615 != null) {
            AnonymousClass7AP.A01(r615.A05, A0R4, this, 2);
        }
        C130976kJ r616 = this.A07;
        if (r616 != null) {
            AnonymousClass7AP.A01(r616.A04, A0R4, this, 3);
        }
        C134186qB r617 = this.A0R;
        if (r617 != null) {
            AnonymousClass7AP.A01(r617.A08, A0R4, this, 4);
        }
        A0R4.A0H(cTx.A00, new AnonymousClass7AH(r88, this, 14));
        AnonymousClass7AR.A02(A017.A01, A0R4, this, 39);
        AnonymousClass7AR.A02(r253.A00, A0R4, this, 40);
        AnonymousClass7AR.A02(r253.A01, A0R4, this, 41);
        AnonymousClass7AR.A02(A016, A0R4, this, 42);
        if (r43.A00()) {
            AnonymousClass7AR.A02(A0R3, A0R4, this, 43);
        }
        C130856k7 r618 = this.A0S;
        if (r618 != null) {
            AnonymousClass7AR.A02(r618.A01, A0R4, this, 44);
        }
        AnonymousClass7AR.A02(r253.A03, A0R5, this, 45);
        AnonymousClass7AR.A02(r253.A04, A0R5, this, 45);
        AnonymousClass7AR.A02(A017.A04, A0R5, this, 45);
        AnonymousClass7AR.A02(r25.A03, A0R5, this, 45);
        AnonymousClass7AR.A02(r252.A02, A0R5, this, 45);
        AnonymousClass7AR.A02(A0S2, A0R5, this, 46);
        AnonymousClass7AR.A02(A0R4, A0R5, this, 47);
        C130856k7 r210 = this.A0S;
        if (r210 != null) {
            AnonymousClass7AR.A02(r210.A03, A0R5, this, 45);
        }
        A0R2.A0H(A017.A05, new AnonymousClass7AH(r4, this, 15));
        if (A0G(this)) {
            Boolean bool = C17970vW.A03;
            AnonymousClass11P r211 = r45;
            this.A1C = new C132916nr(r211, TimeUnit.MILLISECONDS, (long) C18020vd.A00(new C18040vf(true), this.A0y, 8585));
            AnonymousClass7AR.A02(A0R4, A0R6, this, 48);
            return;
        }
        this.A1C = null;
    }
}

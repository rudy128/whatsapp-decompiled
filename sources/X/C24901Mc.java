package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Mc  reason: invalid class name and case insensitive filesystem */
public class C24901Mc {
    public final C24891Mb A00;
    public final AnonymousClass11P A01;
    public final C24621La A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass1LX A06;
    public final C18030ve A07;
    public final AnonymousClass12L A08;
    public final AnonymousClass18K A09;
    public final C24881Ma A0A;
    public final AnonymousClass1MB A0B;
    public final AnonymousClass00H A0C = C217517g.A00(49498);

    public C24901Mc(AnonymousClass11S r2, C24891Mb r3, AnonymousClass1M9 r4, AnonymousClass11P r5, AnonymousClass1CJ r6, C24621La r7, AnonymousClass1LX r8, C18030ve r9, AnonymousClass12L r10, AnonymousClass18K r11, C24881Ma r12, AnonymousClass1MB r13) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r4, 8);
        C18070vi.A0d(r7, 9);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r12, 11);
        C18070vi.A0d(r3, 12);
        this.A01 = r5;
        this.A07 = r9;
        this.A03 = r2;
        this.A06 = r8;
        this.A05 = r6;
        this.A09 = r11;
        this.A08 = r10;
        this.A04 = r4;
        this.A02 = r7;
        this.A0B = r13;
        this.A0A = r12;
        this.A00 = r3;
    }

    public final void A03(AnonymousClass1BI r6, int i, boolean z) {
        C18070vi.A0d(r6, 0);
        C24891Mb r4 = this.A00;
        long A012 = AnonymousClass11P.A01(this.A01);
        try {
            JSONObject A002 = C24891Mb.A00(r4, r6);
            if (A002 == null) {
                A002 = new JSONObject();
            }
            A002.put("tb_last_action_ts", A012);
            C24891Mb.A01(r4, r6, A002);
        } catch (JSONException unused) {
        }
        if (z) {
            A02(r6, this, i);
        }
    }

    public final boolean A06(AnonymousClass1BI r3) {
        C18070vi.A0d(r3, 0);
        int A002 = A00(r3, this);
        if (A002 == -1 || A002 == -3 || A002 == -2 || A002 == 0) {
            return true;
        }
        return false;
    }

    public final boolean A07(AnonymousClass1BI r9) {
        C18070vi.A0d(r9, 0);
        C24891Mb r2 = this.A00;
        long A012 = AnonymousClass11P.A01(this.A01);
        try {
            JSONObject A002 = C24891Mb.A00(r2, r9);
            if (A002 == null || !A002.has("tb_expired_ts") || !A002.has("tb_cooldown") || A002.getLong("tb_expired_ts") < A012) {
                return false;
            }
            if (!A002.has("tb_last_action_ts") || A002.getLong("tb_last_action_ts") + A002.getLong("tb_cooldown") <= A012) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2Rt, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r5 != 1) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.AnonymousClass1BI r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.1LX r5 = r7.A06
            X.1CJ r0 = r5.A00
            X.1ci r4 = X.AnonymousClass1CJ.A00(r0, r8)
            if (r4 == 0) goto L_0x005b
            int r3 = r4.A06
            if (r3 == r9) goto L_0x0027
            r4.A06 = r9
            X.00H r0 = r5.A01
            java.lang.Object r2 = r0.get()
            X.1gM r2 = (X.C31931gM) r2
            r0 = 0
            X.3Ch r1 = new X.3Ch
            r1.<init>(r5, r4, r0)
            r0 = 34
            r2.A01(r1, r0)
        L_0x0027:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x002b:
            r6 = 0
            if (r0 == 0) goto L_0x009e
            int r5 = r0.intValue()
            r2 = 1
            if (r5 == r9) goto L_0x009e
            r6 = 1
            if (r9 != r2) goto L_0x009e
            boolean r0 = r8 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x008c
            X.1Ma r4 = r7.A0A
            X.2Rt r3 = new X.2Rt
            r3.<init>()
            r0 = -3
            r1 = 1
            if (r5 == r0) goto L_0x0053
            r0 = -2
            if (r5 == r0) goto L_0x0059
            r0 = -1
            if (r5 == r0) goto L_0x0053
            if (r5 == 0) goto L_0x0052
            r1 = 3
            if (r5 == r2) goto L_0x0053
        L_0x0052:
            r1 = 2
        L_0x0053:
            r3.A00 = r1
            java.util.Set r2 = r4.A0A
            monitor-enter(r2)
            goto L_0x005d
        L_0x0059:
            r1 = 0
            goto L_0x0053
        L_0x005b:
            r0 = 0
            goto L_0x002b
        L_0x005d:
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x007a }
            boolean r1 = r2.add(r0)     // Catch:{ all -> 0x007a }
            monitor-exit(r2)
            java.util.Set r2 = r4.A0B
            monitor-enter(r2)
            X.C24881Ma.A00(r4)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x007a }
            boolean r0 = r2.add(r0)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x007d
            X.C24881Ma.A01(r4)     // Catch:{ all -> 0x007a }
            goto L_0x007d
        L_0x007a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x007d:
            monitor-exit(r2)
            if (r1 == 0) goto L_0x008c
            X.10I r2 = r4.A07
            r1 = 42
            X.3C4 r0 = new X.3C4
            r0.<init>(r4, r8, r3, r1)
            r2.CGF(r0)
        L_0x008c:
            X.00H r0 = r7.A0C
            java.lang.Object r2 = r0.get()
            X.10T r2 = (X.AnonymousClass10T) r2
            r1 = 32
            X.4om r0 = new X.4om
            r0.<init>(r8, r1)
            r2.notifyAllObservers(r0)
        L_0x009e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24901Mc.A08(X.1BI, int):boolean");
    }

    public final boolean A09(AnonymousClass1EC r4, boolean z) {
        C18070vi.A0d(r4, 0);
        AnonymousClass1M9 r1 = this.A04;
        UserJid A0K = r1.A0K(r4);
        if (A0K != null) {
            AnonymousClass1E7 A0H = r1.A0H(A0K);
            if (this.A03.A0O(A0H.A0J) || A0H.A0H != null) {
                return false;
            }
        }
        if (this.A0B.A03(r4) || z) {
            return false;
        }
        int A002 = A00(r4, this);
        if (A002 == -1 || A002 == -3) {
            return true;
        }
        return false;
    }

    public final boolean A0A(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        if (!C42761yh.A01(this.A08, userJid) && !C43381zi.A01(this.A07, userJid) && !this.A03.A0N()) {
            if (A07(userJid)) {
                return false;
            }
            int A002 = A00(userJid, this);
            if ((A002 == -1 || A002 == -3) && this.A04.A0H(userJid).A0H == null) {
                return false;
            }
        }
        return true;
    }

    public static final int A00(AnonymousClass1BI r4, C24901Mc r5) {
        int i;
        C29691ci A002 = AnonymousClass1CJ.A00(r5.A05, r4);
        int i2 = 0;
        ArrayList A012 = A01(r5);
        if (A012 != null && A012.contains(r4)) {
            i2 = 1;
        }
        int i3 = i2 ^ 1;
        if (A002 == null) {
            return i3 ^ 1;
        }
        if (i3 == 0) {
            return 1;
        }
        synchronized (A002) {
            i = A002.A06;
        }
        return i;
    }

    public static final ArrayList A01(C24901Mc r4) {
        String A022 = r4.A02.A02("call_not_spam_jids");
        if (A022 == null || A022.length() <= 0) {
            return null;
        }
        return C22971Dz.A0A(AnonymousClass1BI.class, AnonymousClass1YF.A0S(A022, new String[]{","}, 0));
    }

    public static final void A02(AnonymousClass1BI r2, C24901Mc r3, int i) {
        C46572Fb r1 = new C46572Fb();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = 1;
        r1.A02 = r2.getRawString();
        AnonymousClass18K r0 = r3.A09;
        r0.CC7(r1);
        r0.Bio();
    }

    public final void A05(GroupJid groupJid, UserJid userJid, boolean z) {
        if (z) {
            C24881Ma r2 = this.A0A;
            Set set = r2.A0B;
            synchronized (set) {
                C24881Ma.A00(r2);
                if (set.remove(groupJid.getRawString())) {
                    C24881Ma.A01(r2);
                }
            }
        } else if (userJid == null || this.A04.A0G(userJid) == null) {
            A04(groupJid);
        }
    }

    public final void A04(GroupJid groupJid) {
        int A002 = A00(groupJid, this);
        if (A002 != 1 && A002 != -2 && A002 != -1 && A002 != -3) {
            AnonymousClass1LX r4 = this.A06;
            C29691ci A003 = AnonymousClass1CJ.A00(r4.A00, groupJid);
            if (A003 != null && A003.A06 != -1) {
                A003.A06 = -1;
                ((C31931gM) r4.A01.get()).A01(new AnonymousClass3Bx(r4, A003, 49), 34);
            }
        }
    }
}

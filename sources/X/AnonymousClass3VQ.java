package X;

import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3VQ  reason: invalid class name */
public class AnonymousClass3VQ extends AnonymousClass1J2 {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 8;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08 = -1;
    public long A09 = Long.MIN_VALUE;
    public long A0A = 1;
    public long A0B = Long.MIN_VALUE;
    public AEW A0C;
    public C54242dp A0D = null;
    public AnonymousClass206 A0E = null;
    public AnonymousClass206 A0F = null;
    public AnonymousClass206 A0G;
    public AnonymousClass00H A0H;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K = true;
    public boolean A0L;
    public AnonymousClass206 A0M;
    public Set A0N;
    public final long A0O;
    public final Intent A0P;
    public final Handler A0Q = C17890vO.A0D();
    public final AnonymousClass1DT A0R;
    public final AnonymousClass1DT A0S;
    public final AnonymousClass1DT A0T;
    public final AnonymousClass1DT A0U;
    public final AnonymousClass1DT A0V = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0W = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0X = AnonymousClass3MW.A0o();
    public final AnonymousClass1DT A0Y;
    public final AnonymousClass1DT A0Z;
    public final C19880zA A0a;
    public final AnonymousClass11S A0b;
    public final A5M A0c;
    public final C51852Zw A0d;
    public final C51862Zx A0e;
    public final MessageSelectionViewModel A0f;
    public final C108715cB A0g;
    public final AnonymousClass4RF A0h;
    public final AnonymousClass11P A0i;
    public final C18000vb A0j;
    public final AnonymousClass1QT A0k;
    public final AnonymousClass1CJ A0l;
    public final AnonymousClass122 A0m;
    public final AnonymousClass1Q9 A0n;
    public final AnonymousClass1WP A0o;
    public final AnonymousClass1NK A0p;
    public final AnonymousClass1E7 A0q;
    public final AnonymousClass1WF A0r;
    public final AnonymousClass1PS A0s;
    public final C18030ve A0t;
    public final AnonymousClass1BI A0u;
    public final C42431yA A0v;
    public final AW1 A0w;
    public final AnonymousClass1PP A0x;
    public final AnonymousClass1W6 A0y;
    public final C26521Sl A0z;
    public final C41731wy A10 = AnonymousClass3MW.A0o();
    public final C41731wy A11 = AnonymousClass3MW.A0o();
    public final C41731wy A12 = AnonymousClass3MW.A0o();
    public final C41731wy A13;
    public final C41731wy A14 = AnonymousClass3MW.A0o();
    public final C41731wy A15 = AnonymousClass3MW.A0o();
    public final C41731wy A16 = new C41731wy(Collections.emptyList());
    public final C41731wy A17 = AnonymousClass3MW.A0o();
    public final C41731wy A18 = AnonymousClass3MW.A0o();
    public final C41731wy A19;
    public final C41731wy A1A = AnonymousClass3MW.A0o();
    public final C41731wy A1B = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A1C;
    public final C108645c3 A1D;
    public final C86034Px A1E;
    public final AnonymousClass00H A1F;
    public final ArrayList A1G = AnonymousClass000.A13();
    public final List A1H = AnonymousClass000.A13();
    public final Map A1I = C17880vN.A11();
    public final C22821Di A1J;
    public final boolean A1K;
    public final boolean A1L;
    public final C37361pP A1M;
    public final C34171k3 A1N;
    public final C35751mk A1O;
    public final AnonymousClass1WR A1P;
    public final C24681Lg A1Q;
    public final C26021Qn A1R;
    public final C54262dr A1S;
    public final AnonymousClass1NJ A1T;
    public final C26061Qr A1U;
    public final AnonymousClass1RU A1V;
    public final C26241Rj A1W;
    public final C32551hN A1X;
    public final Set A1Y = C17880vN.A12();

    public static int A00(AnonymousClass3VQ r2) {
        int i;
        synchronized (r2) {
            i = r2.A02;
        }
        return i + r2.A1H.size() + (AnonymousClass000.A1R(r2.A07) ? 1 : 0);
    }

    public static void A07(AnonymousClass3VQ r2) {
        r2.A07 = 0;
        r2.A05 = 0;
        r2.A06 = 0;
        r2.A09 = Long.MIN_VALUE;
    }

    public synchronized void A0Z(C54242dp r4) {
        int i;
        this.A0D = r4;
        Cursor cursor = r4.A00;
        if (cursor == null || cursor.isClosed() || !cursor.moveToFirst()) {
            this.A0F = null;
            i = 0;
        } else {
            this.A0F = this.A0y.A02(cursor, this.A0u);
            i = cursor.getCount();
        }
        this.A02 = i;
        A08(this);
    }

    public static int A03(AnonymousClass3VQ r4) {
        int i = r4.A07;
        int i2 = r4.A00;
        int i3 = i2 - 10;
        StringBuilder A102 = AnonymousClass000.A10();
        if (i > i3) {
            A102.append("conversation/page size (from unseen):");
            C17900vP.A0o(A102, i + 10);
            return r4.A07 + 10;
        }
        C17900vP.A0j("conversation/page size:", A102, i2);
        return r4.A00;
    }

    public static void A06(AnonymousClass3VQ r5) {
        r5.A1B.A0F(new C86494Rv(r5.A05, r5.A06, r5.A07));
    }

    public static void A09(AnonymousClass3VQ r4, long j) {
        AnonymousClass1BI r2 = r4.A0u;
        if (C22971Dz.A0V(r2)) {
            Set set = r4.A0N;
            if (set == null) {
                set = C17880vN.A12();
                r4.A0N = set;
            }
            Long valueOf = Long.valueOf(j);
            if (!set.contains(valueOf)) {
                r4.A0N.add(valueOf);
                r4.A1C.CGL(new C146487Ph(r4, j, 12), AnonymousClass001.A1E(r2, "MessageViewModel/scheduleCheckForGapsInNewsletter/", AnonymousClass000.A10()));
            }
        }
    }

    public static void A0A(AnonymousClass3VQ r5, AnonymousClass1BI r6) {
        if (r6.equals(r5.A0u)) {
            C41731wy r4 = r5.A13;
            C26241Rj r2 = r5.A1W;
            C43371zh r1 = (C43371zh) r2.A0F.get(r6);
            ArrayList A132 = AnonymousClass000.A13();
            if (r1 != null) {
                if (C22971Dz.A0e(r6)) {
                    HashMap hashMap = r1.A06;
                    if (hashMap != null) {
                        Iterator it = C17880vN.A10(hashMap.entrySet()).iterator();
                        while (it.hasNext()) {
                            Map.Entry A162 = AnonymousClass000.A16(it);
                            if (C26241Rj.A02(((C53722cz) A162.getValue()).A01)) {
                                A132.add(new C53732d0((AnonymousClass1BI) A162.getKey(), ((C53722cz) A162.getValue()).A00));
                            }
                        }
                    }
                } else {
                    int A062 = r2.A06(r6, (UserJid) null);
                    if (A062 != -1) {
                        A132.add(new C53732d0(r6, A062));
                    }
                }
            }
            r4.A0F(A132);
        }
    }

    public static void A0B(AnonymousClass3VQ r7, AnonymousClass206 r8) {
        long A002 = (long) C18020vd.A00(C18040vf.A02, r7.A0t, 4736);
        r7.A0Q.postDelayed(new C146487Ph(r7, A002, 13), A002 - AnonymousClass3MZ.A05(r7.A0i, r8));
    }

    public static void A0C(AnonymousClass3VQ r6, AnonymousClass206 r7) {
        int i;
        if (r7 != null && (i = r7.A0u) != 7 && i != 87 && i != 102) {
            C41731wy r5 = r6.A19;
            if (!C72463Mc.A1O(r5) && r6.A0a.A07() && A0D(r6, r7) && r7.A0v.A02 && r7.A0D() >= 4) {
                if (AnonymousClass3MZ.A05(r6.A0i, r7) < ((long) C18020vd.A00(C18040vf.A02, r6.A0t, 4736)) && r6.A0T().A0v.A02) {
                    AnonymousClass3MY.A1L(r5, true);
                    A0B(r6, r7);
                }
            }
        }
    }

    public static boolean A0D(AnonymousClass3VQ r2, AnonymousClass206 r3) {
        C19880zA r1 = r2.A0a;
        if ((r1.A07() && ((C25811Ps) r1.A03()).A0D(r3.A0v.A00)) || r2.A0q.A0E()) {
            return true;
        }
        AEW aew = r2.A0C;
        if (aew == null || !aew.A0e) {
            return false;
        }
        return true;
    }

    public static boolean A0E(AnonymousClass3VQ r1, AnonymousClass206 r2) {
        if (!r1.A1U.A02(r2.A0S) || r2.A0u == 8 || C83574Fq.A00(r2) || r2.A11(16777216) || (r2 instanceof C442522s)) {
            return true;
        }
        return false;
    }

    public void A0S() {
        this.A1Q.unregisterObserver(this.A1P);
        this.A1O.unregisterObserver(this.A1N);
        C61142pC r2 = C61142pC.A01;
        C22821Di r1 = this.A1J;
        C18070vi.A0d(r1, 0);
        synchronized (r2) {
            C61142pC.A02.remove(r1);
        }
    }

    public AnonymousClass206 A0T() {
        AnonymousClass206 r0;
        List list = this.A1H;
        if (!list.isEmpty()) {
            return AnonymousClass3MW.A0k(list, AnonymousClass3MX.A01(list));
        }
        synchronized (this) {
            r0 = this.A0F;
        }
        return r0;
    }

    public void A0U() {
        List list = this.A1H;
        list.clear();
        this.A11.A0F(new AnonymousClass4SI(AnonymousClass1IX.copyOf((Collection) list), (C54242dp) null, (Boolean) null, (Boolean) null, (Collection) null, true, false));
        A08(this);
    }

    public void A0W(long j) {
        this.A0A = j;
        this.A1M.A04("start_ref", Long.valueOf(j));
    }

    public void A0X(long j) {
        this.A0B = j;
        this.A1M.A04("start_sort_ref", Long.valueOf(j));
    }

    public void A0Y(C216416v r22, AnonymousClass206 r23, AnonymousClass206 r24, List list, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        C54242dp r10;
        AnonymousClass206 r11 = r23;
        AnonymousClass206 r5 = r24;
        if (r11.A0y < this.A0B) {
            z2 = true;
            long j = this.A0O;
            AnonymousClass1BI r8 = this.A0u;
            long j2 = r11.A0x;
            AnonymousClass122 r7 = this.A0m;
            AnonymousClass1BI r13 = r8;
            long j3 = j;
            r10 = r7.BUp(r13, 100, r7.A0a.A06(r13, 100, j2, j3), j3);
            r10.A00.getCount();
            A0W(r10.A01);
            A0X(r10.A02);
            A0Z(r10);
            A0U();
        } else {
            z2 = false;
            r10 = null;
        }
        C41731wy r72 = this.A18;
        if (r24 == null) {
            r5 = r11;
        }
        int BG4 = this.A0g.BG4(this.A0u, this.A0B, r5.A0y);
        if (this.A07 > 0 && BG4 >= i2) {
            BG4++;
        }
        r72.A0F(new AnonymousClass4SQ(r22, r10, r11, list, BG4, i, i3, i4, this.A0O, z2, z));
    }

    public void A0a(AnonymousClass206 r4) {
        if (!C42171xk.A00(this.A0M, r4)) {
            this.A0M = r4;
            C37361pP r1 = this.A1M;
            if (r4 != null) {
                A04(r1, r4.A0v, "commentedParentMessage_");
            } else {
                A05(r1, "commentedParentMessage_");
            }
            this.A0R.A0F(r4);
        }
    }

    public void A0b(AnonymousClass206 r5) {
        if (!C42171xk.A00(this.A0G, r5)) {
            this.A0G = r5;
            HashMap hashMap = this.A0d.A00;
            C37361pP r1 = this.A1M;
            if (r5 != null) {
                A04(r1, r5.A0v, "quotedMessage_");
                hashMap.put(this.A0u, r5);
            } else {
                A05(r1, "quotedMessage_");
                hashMap.remove(this.A0u);
            }
            this.A0Z.A0F(r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r12.A0K != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(boolean r33) {
        /*
            r32 = this;
            r2 = 100
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r12 = r32
            X.1BI r0 = r12.A0u
            r17 = r0
            java.lang.String r0 = r17.getRawString()
            r1.append(r0)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            long r2 = r12.A0O
            r1.append(r2)
            java.lang.String r13 = r1.toString()
            java.util.Set r11 = r12.A1Y
            monitor-enter(r11)
            if (r33 != 0) goto L_0x0030
            boolean r0 = r12.A0K     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
        L_0x0030:
            boolean r0 = r11.add(r13)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            X.10I r14 = r12.A1C     // Catch:{ all -> 0x0074 }
            X.122 r0 = r12.A0m     // Catch:{ all -> 0x0074 }
            r16 = r0
            X.1W6 r15 = r12.A0y     // Catch:{ all -> 0x0074 }
            long r7 = r12.A0A     // Catch:{ all -> 0x0074 }
            long r5 = r12.A0B     // Catch:{ all -> 0x0074 }
            X.1CJ r10 = r12.A0l     // Catch:{ all -> 0x0074 }
            X.1NJ r9 = r12.A1T     // Catch:{ all -> 0x0074 }
            X.AW1 r4 = r12.A0w     // Catch:{ all -> 0x0074 }
            java.util.List r1 = r12.A1H     // Catch:{ all -> 0x0074 }
            X.4LZ r0 = new X.4LZ     // Catch:{ all -> 0x0074 }
            r0.<init>(r12)     // Catch:{ all -> 0x0074 }
            X.4rZ r12 = new X.4rZ     // Catch:{ all -> 0x0074 }
            r30 = r5
            r26 = r2
            r28 = r7
            r23 = r13
            r24 = r1
            r25 = r11
            r20 = r17
            r21 = r4
            r22 = r15
            r17 = r10
            r18 = r16
            r19 = r9
            r15 = r12
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)     // Catch:{ all -> 0x0074 }
            r14.CGN(r12)     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r11)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0074 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VQ.A0c(boolean):void");
    }

    public static void A04(C37361pP r4, AnonymousClass205 r5, String str) {
        String A0y2 = AnonymousClass000.A0y("fMessageKeyJid", AnonymousClass000.A11(str));
        String A0y3 = AnonymousClass000.A0y("fMessageKeyFromMe", AnonymousClass000.A11(str));
        r4.A04(AnonymousClass000.A0y("fMessageKeyId", AnonymousClass000.A11(str)), r5.A01);
        r4.A04(A0y3, Boolean.valueOf(r5.A02));
        r4.A04(A0y2, C22971Dz.A06(r5.A00));
    }

    public static void A05(C37361pP r4, String str) {
        String A0y2 = AnonymousClass000.A0y("fMessageKeyJid", AnonymousClass000.A11(str));
        String A0y3 = AnonymousClass000.A0y("fMessageKeyFromMe", AnonymousClass000.A11(str));
        r4.A03(AnonymousClass000.A0y("fMessageKeyId", AnonymousClass000.A11(str)));
        r4.A03(A0y3);
        r4.A03(A0y2);
    }

    public static void A08(AnonymousClass3VQ r2) {
        AnonymousClass206 A0T2 = r2.A0T();
        if (r2.A0E == null) {
            r2.A0E = A0T2;
        }
        r2.A0U.A0F(A0T2);
    }

    public void A0V() {
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("messagesViewModel/recreatemessagelist ");
        A102.append(this.A0A);
        A102.append(" ");
        C17900vP.A0r(A102, this.A0K);
        int A002 = A00(this);
        C54242dp BUp = this.A0g.BUp(this.A0u, A03(this), this.A0A, this.A0O);
        A0W(BUp.A01);
        A0X(BUp.A02);
        Cursor cursor = BUp.A00;
        if (cursor != null && this.A07 > cursor.getCount()) {
            A07(this);
        }
        A0Z(BUp);
        this.A0X.A0F(new AnonymousClass4S1(new C86494Rv(this.A05, this.A06, this.A07), BUp, this.A01, this.A0K));
        this.A1H.clear();
        if (this.A0K && A002 > A00(this)) {
            Log.i("messagesViewModel/messagesViewModel/loadMoreMessages");
            A0c(false);
        }
        A08(this);
    }

    public AnonymousClass3VQ(Intent intent, C37361pP r20, C19880zA r21, AnonymousClass11S r22, A5M a5m, C35751mk r24, C51852Zw r25, C51862Zx r26, MessageSelectionViewModel messageSelectionViewModel, C108715cB r28, AnonymousClass4RF r29, AnonymousClass11P r30, C18000vb r31, AnonymousClass1QT r32, AnonymousClass1CJ r33, AnonymousClass122 r34, AnonymousClass1Q9 r35, AnonymousClass1WP r36, C24681Lg r37, C26021Qn r38, C54262dr r39, AnonymousClass1NK r40, AnonymousClass1NJ r41, AnonymousClass1E7 r42, AnonymousClass1WF r43, AnonymousClass1PS r44, C18030ve r45, AnonymousClass1BI r46, C42431yA r47, C26061Qr r48, AW1 aw1, AnonymousClass1RU r50, C26241Rj r51, AnonymousClass1PP r52, C32551hN r53, AnonymousClass1W6 r54, C26521Sl r55, AnonymousClass10I r56, C108645c3 r57, C86034Px r58, AnonymousClass00H r59) {
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A0Z = A0L2;
        this.A0R = AnonymousClass3MW.A0L();
        this.A0Y = AnonymousClass3MW.A0L();
        this.A19 = new C41731wy(false);
        this.A0U = AnonymousClass3MW.A0L();
        this.A0S = AnonymousClass3MW.A0L();
        this.A0T = AnonymousClass3MW.A0L();
        this.A13 = new C41731wy(Collections.emptyList());
        this.A1J = C99244sV.A00(this, 20);
        C95504mL r3 = new C95504mL(this, 12);
        this.A1P = r3;
        C76693nw r2 = new C76693nw(this, 2);
        this.A1N = r2;
        C18030ve r8 = r45;
        this.A0t = r8;
        this.A1T = r41;
        this.A0m = r34;
        this.A0y = r54;
        this.A1C = r56;
        this.A0l = r33;
        this.A0p = r40;
        this.A0j = r31;
        this.A0k = r32;
        this.A0b = r22;
        this.A1F = r59;
        this.A0w = aw1;
        this.A0r = r43;
        this.A1D = r57;
        C51852Zw r12 = r25;
        this.A0d = r12;
        this.A0s = r44;
        this.A1E = r58;
        this.A0z = r55;
        this.A0x = r52;
        this.A0i = r30;
        this.A0e = r26;
        this.A0h = r29;
        AnonymousClass1Q9 r11 = r35;
        this.A0n = r11;
        this.A0o = r36;
        C24681Lg r10 = r37;
        this.A1Q = r10;
        this.A0a = r21;
        C37361pP r13 = r20;
        this.A1M = r13;
        AnonymousClass1BI r7 = r46;
        this.A0u = r7;
        AnonymousClass1E7 r9 = r42;
        this.A0q = r9;
        this.A0P = intent;
        this.A0f = messageSelectionViewModel;
        this.A0c = a5m;
        this.A1R = r38;
        this.A1S = r39;
        this.A1U = r48;
        this.A1V = r50;
        this.A0g = r28;
        C35751mk r17 = r24;
        this.A1O = r17;
        this.A1W = r51;
        this.A1X = r53;
        this.A0v = r47;
        Number number = (Number) r13.A02("start_ref");
        if (number != null) {
            this.A0A = number.longValue();
        }
        Number number2 = (Number) r13.A02("start_sort_ref");
        if (number2 != null) {
            this.A0B = number2.longValue();
        }
        String A0y2 = AnonymousClass000.A0y("fMessageKeyJid", AnonymousClass000.A11("quotedMessage_"));
        String A0y3 = AnonymousClass000.A0y("fMessageKeyFromMe", AnonymousClass000.A11("quotedMessage_"));
        String A0y4 = AnonymousClass000.A0y("fMessageKeyId", AnonymousClass000.A11("quotedMessage_"));
        C18070vi.A0d(A0y2, 0);
        Map map = r13.A03;
        if (map.containsKey(A0y2)) {
            C18070vi.A0d(A0y3, 0);
            if (map.containsKey(A0y3)) {
                C18070vi.A0d(A0y4, 0);
                if (map.containsKey(A0y4)) {
                    AnonymousClass206 A052 = this.A0y.A01.A05(new AnonymousClass205(AnonymousClass3MX.A0l((String) r13.A02(A0y2)), (String) r13.A02(A0y4), Boolean.TRUE.equals(r13.A02(A0y3))));
                    this.A0G = A052;
                    if (A052 != null) {
                        A0L2.A0E(A052);
                        r12.A00.put(r7, this.A0G);
                    }
                }
            }
        }
        this.A0O = r11.A00;
        this.A1K = r9.A0F();
        this.A1L = C22971Dz.A0N(r9.A0J);
        r10.registerObserver(r3);
        if (C36301nf.A00(r8, 10056, 0) > 0) {
            A0A(this, r7);
            r17.registerObserver(r2);
        }
    }
}

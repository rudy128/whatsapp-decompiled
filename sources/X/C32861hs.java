package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.1hs  reason: invalid class name and case insensitive filesystem */
public class C32861hs {
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass121 A03;
    public final C24681Lg A04;
    public final C26111Qw A05;
    public final AnonymousClass1RK A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final AnonymousClass1T6 A09;
    public final C32821ho A0A;
    public final C32571hP A0B;
    public final C32811hn A0C;
    public final AnonymousClass1RO A0D;
    public final AnonymousClass1SU A0E;
    public final C26411Sa A0F;
    public final C32841hq A0G;
    public final C26431Sc A0H;
    public final C26471Sg A0I;
    public final C32851hr A0J;
    public final C32781hk A0K;
    public final AnonymousClass1PT A0L;
    public final AnonymousClass10I A0M;
    public final AnonymousClass3DM A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final Object A0R = new Object();
    public final WeakHashMap A0S = new WeakHashMap();
    public final Executor A0T;
    public final AnonymousClass11P A0U;
    public final C25241Nl A0V;
    public final AnonymousClass1PP A0W;
    public final Executor A0X;

    public static C63642tS A00(C32861hs r6, AnonymousClass21V r7) {
        Object obj;
        synchronized (r6.A0R) {
            for (Map.Entry entry : r6.A0S.entrySet()) {
                C18070vi.A0d(r7, 0);
                AnonymousClass205 r3 = r7.A0v;
                Iterator it = ((C63642tS) entry.getKey()).A03.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C18070vi.A18(r3, ((AnonymousClass206) obj).A0v)) {
                        break;
                    }
                }
                if (((AnonymousClass21V) obj) != null) {
                    C63642tS r0 = (C63642tS) entry.getKey();
                    return r0;
                }
            }
            return null;
        }
    }

    public static void A01(C32861hs r2, AnonymousClass34B r3, C63642tS r4) {
        synchronized (r2.A0R) {
            if (r3 == null) {
                r2.A0S.remove(r4);
            } else {
                r2.A0S.put(r4, r3);
            }
        }
    }

    public static void A03(C32861hs r15, C63642tS r16, int i, int i2, int i3) {
        String str;
        String str2;
        for (AnonymousClass206 r2 : C29431cG.A0t(r16.A03)) {
            AnonymousClass1PT r1 = r15.A0L;
            if (r1.A0b) {
                C25281Np r4 = r1.A0G;
                int hashCode = r2.A0v.A01.hashCode();
                synchronized (r4) {
                    if (C18020vd.A05(C18040vf.A02, r4.A00, 7774)) {
                        if (!r4.A07(hashCode)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("MessageSendPerfQplTracker");
                            sb.append("/markerMediaStagePoint qpl not started");
                            Log.w(sb.toString());
                        } else {
                            int i4 = i;
                            if (i4 == -3) {
                                str = "media_upload_finish";
                            } else if (i4 != -2) {
                                str = "media_upload_start";
                            } else {
                                str = "media_upload_http_start";
                            }
                            int i5 = i2;
                            if (i2 > 0) {
                                C222119a r9 = r4.A01;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append("_attempt_count");
                                r9.A09(sb2.toString(), hashCode, (long) i5, true);
                            }
                            AnonymousClass00H r7 = r4.A02;
                            if (!((AnonymousClass165) r7.get()).A02(hashCode, i4)) {
                                C222119a r12 = r4.A01;
                                if (i3 != 0) {
                                    str2 = String.valueOf(i3);
                                } else {
                                    str2 = null;
                                }
                                C222219b r22 = r12.A05;
                                if (r22.A01()) {
                                    r12.A07.markerPoint(r22.A06, hashCode, str, str2);
                                }
                                ((AnonymousClass165) r7.get()).A00(hashCode, i4);
                            }
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass34B A04(C63642tS r3) {
        AnonymousClass34B r0;
        synchronized (this.A0R) {
            r0 = (AnonymousClass34B) this.A0S.get(r3);
        }
        return r0;
    }

    public void A07(AnonymousClass206 r5, boolean z) {
        if (!(r5 instanceof AnonymousClass21V)) {
            return;
        }
        if (!C446824j.A02(r5.A0D(), 2)) {
            this.A0K.A02(r5);
            C45802Bs r2 = new C45802Bs(this, Collections.singletonList(r5), false, true);
            this.A0M.CGF(r2);
            r2.A0A(new C145937Ne(r5, this, 11), this.A0T);
        } else if (z) {
            this.A01.A09(2131890390, 0);
        }
    }

    public C32861hs(AnonymousClass190 r6, AnonymousClass1KB r7, AnonymousClass11S r8, AnonymousClass11P r9, AnonymousClass121 r10, C24681Lg r11, C26111Qw r12, AnonymousClass1RK r13, C18030ve r14, AnonymousClass18K r15, C25241Nl r16, AnonymousClass1T6 r17, C32821ho r18, C32571hP r19, C32811hn r20, AnonymousClass1RO r21, AnonymousClass1SU r22, C26411Sa r23, C32841hq r24, C26431Sc r25, C26471Sg r26, C32851hr r27, C32781hk r28, AnonymousClass1PT r29, AnonymousClass1PP r30, AnonymousClass10I r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34) {
        AnonymousClass3DM r0;
        this.A0U = r9;
        this.A07 = r14;
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = r8;
        AnonymousClass10I r4 = r31;
        this.A0M = r4;
        this.A08 = r15;
        this.A0O = r32;
        this.A0L = r29;
        this.A0H = r25;
        this.A0D = r21;
        this.A0W = r30;
        this.A09 = r17;
        this.A03 = r10;
        this.A0I = r26;
        this.A04 = r11;
        this.A0C = r20;
        this.A0V = r16;
        this.A0B = r19;
        this.A0E = r22;
        this.A05 = r12;
        this.A0Q = r33;
        this.A0P = r34;
        this.A0K = r28;
        this.A06 = r13;
        this.A0A = r18;
        this.A0G = r24;
        this.A0F = r23;
        this.A0J = r27;
        C18070vi.A0d(r7, 0);
        this.A0T = new AnonymousClass3DL(r7, 3);
        this.A0X = new C200710s(r4, false);
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A00(r1, r14, 776) > 0) {
            r0 = new AnonymousClass3DM(r4, C18020vd.A00(r1, r14, 776), false);
        } else {
            r0 = null;
        }
        this.A0N = r0;
    }

    public static void A02(C32861hs r3, AnonymousClass34B r4, C63642tS r5) {
        AnonymousClass21V A012;
        String A0B2;
        if (r5.A01().A0u == 82) {
            C1408173e r2 = r4.A0O;
            synchronized (r2) {
                r2.A08 = true;
            }
        }
        if (!(!C18020vd.A05(C18040vf.A02, r3.A07, 7773) || (A012 = r5.A01()) == null || (A0B2 = C64002u3.A0B(A012)) == null)) {
            C1408173e r22 = r4.A0O;
            String A002 = C25241Nl.A00(r3.A0V.A08(), A0B2);
            synchronized (r22) {
                r22.A0C = A002;
            }
        }
        A03(r3, r5, -1, r4.A0N.A03, 0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.23f, X.206] */
    public void A05(AnonymousClass1BI r6, String str, String str2, String str3, long j) {
        if (!C42701yb.A01(r6)) {
            ? r2 = new AnonymousClass206(this.A0W.A01(r6, true), 69, AnonymousClass11P.A01(this.A0U));
            r2.A03 = str;
            r2.A02 = str2;
            r2.A01 = str3;
            r2.A00 = j;
            this.A03.BBM(r2);
        }
    }

    public void A06(AnonymousClass34B r7, C63642tS r8, boolean z, boolean z2) {
        String str;
        Executor executor;
        r8.A02();
        A01(this, r7, r8);
        r7.A01 = AnonymousClass1SR.A00(r8);
        C26551So r3 = r7.A01().A06;
        if (C63972u0.A06(r3)) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        r7.A0Z = str;
        AnonymousClass1RO r4 = this.A0D;
        if (!r4.A05(r3, true) && (r3 == C26551So.A0B || r3 == C26551So.A0E || r3 == C26551So.A0q)) {
            if (C18020vd.A05(C18040vf.A01, this.A07, 1539) && r4.A06(C29431cG.A0t(r8.A03))) {
                r7.A0Z = "express";
                r7.A0O.A0A(4);
            }
        }
        C18030ve r2 = this.A07;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 11380)) {
            executor = this.A0X;
        } else {
            executor = this.A0T;
        }
        r7.A0C.A03(new AnonymousClass3AW(r7, this, r8, 9), executor);
        r7.A0A.A03(new C145937Ne(r8, this, 12), (Executor) null);
        r7.A0B.A03(new AnonymousClass3AW(r7, this, r8, 4), (Executor) null);
        r7.A0G.A03(new C70173Aa(this, r7, r8, 0), executor);
        r7.A0F.A03(new AnonymousClass3AW(r7, this, r8, 5), executor);
        r7.A0H.A03(new AnonymousClass3AW(r7, this, r8, 6), (Executor) null);
        r7.A0J.A03(new AnonymousClass3AW(r7, this, r8, 7), executor);
        r7.A0K.A03(new C70173Aa(this, r7, r8, 1), executor);
        r7.A09.A03(new C70183Ab(this, r7, r3, r8), (Executor) null);
        r7.A08.A03(new AnonymousClass3AW(r7, this, r8, 8), (Executor) null);
        r7.A07(new AnonymousClass3AY(this, r7, r8, z, z2), this.A0T);
    }

    public boolean A08(AnonymousClass21V r4) {
        boolean containsKey;
        AnonymousClass34B A042 = A04(A00(this, r4));
        if (A042 != null) {
            C26471Sg r2 = this.A09.A0B;
            synchronized (r2) {
                containsKey = r2.A01.containsKey(A042);
            }
            if (!containsKey) {
                return false;
            }
            return true;
        }
        return false;
    }
}

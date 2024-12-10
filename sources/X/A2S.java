package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

public final class A2S {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C63262sm A08;
    public final AnonymousClass1EC A09;
    public final PhoneUserJid A0A;
    public final PhoneUserJid A0B;
    public final UserJid A0C;
    public final UserJid A0D;
    public final C42661yX A0E;
    public final C29741cn A0F;
    public final String A0G;
    public final String A0H;
    public final Map A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2S) {
                A2S a2s = (A2S) obj;
                if (!(C18070vi.A18(this.A0C, a2s.A0C) && C18070vi.A18(this.A0A, a2s.A0A) && this.A06 == a2s.A06 && C18070vi.A18(this.A0H, a2s.A0H) && C18070vi.A18(this.A0D, a2s.A0D) && C18070vi.A18(this.A0B, a2s.A0B) && this.A07 == a2s.A07 && this.A05 == a2s.A05 && C18070vi.A18(this.A0E, a2s.A0E) && this.A0L == a2s.A0L && this.A0U == a2s.A0U && this.A0K == a2s.A0K && this.A0T == a2s.A0T && this.A0S == a2s.A0S && C18070vi.A18(this.A0F, a2s.A0F) && this.A02 == a2s.A02 && C18070vi.A18(this.A08, a2s.A08) && this.A03 == a2s.A03 && C18070vi.A18(this.A09, a2s.A09) && C18070vi.A18(this.A0I, a2s.A0I) && this.A0P == a2s.A0P && this.A0Q == a2s.A0Q && this.A00 == a2s.A00 && C18070vi.A18(this.A0G, a2s.A0G) && this.A04 == a2s.A04 && this.A0M == a2s.A0M && this.A0R == a2s.A0R && this.A0J == a2s.A0J && this.A0O == a2s.A0O && this.A0V == a2s.A0V && this.A01 == a2s.A01 && this.A0N == a2s.A0N)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A06;
        int A0K2 = AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(this.A07, (((((AnonymousClass001.A0K(j, ((AnonymousClass001.A0k(this.A0C) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + C17900vP.A00(this.A0H)) * 31) + AnonymousClass001.A0k(this.A0D)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31));
        C63262sm r0 = this.A08;
        return C17880vN.A01((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((C17890vO.A02(this.A0G, (AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((AnonymousClass000.A0N(r0, (((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A0E, A0K2), this.A0L), this.A0U), this.A0K), this.A0T), this.A0S) + AnonymousClass001.A0k(this.A0F)) * 31) + this.A02) * 31) + this.A03) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + C17880vN.A02(this.A0I)) * 31, this.A0P), this.A0Q) + this.A00) * 31) + this.A04) * 31, this.A0M), this.A0R), this.A0J), this.A0O), this.A0V) + this.A01) * 31, this.A0N);
    }

    public A2S(C63262sm r3, AnonymousClass1EC r4, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, UserJid userJid, UserJid userJid2, C42661yX r9, C29741cn r10, String str, String str2, Map map, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A0C = userJid;
        this.A0A = phoneUserJid;
        this.A06 = j;
        this.A0H = str;
        this.A0D = userJid2;
        this.A0B = phoneUserJid2;
        this.A07 = j2;
        this.A05 = j3;
        this.A0E = r9;
        this.A0L = z;
        this.A0U = z2;
        this.A0K = z3;
        this.A0T = z4;
        this.A0S = z5;
        this.A0F = r10;
        this.A02 = i;
        this.A08 = r3;
        this.A03 = i2;
        this.A09 = r4;
        this.A0I = map;
        this.A0P = z6;
        this.A0Q = z7;
        this.A00 = i3;
        this.A0G = str2;
        this.A04 = i4;
        this.A0M = z8;
        this.A0R = z9;
        this.A0J = z10;
        this.A0O = z11;
        this.A0V = z12;
        this.A01 = i5;
        this.A0N = z13;
    }

    public String toString() {
        int i;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupInfoData {\n      | groupType=");
        A10.append(this.A03);
        A10.append("\n      | isSuspended=");
        A10.append(this.A0S);
        A10.append("\n      | numberOfParticipants=");
        Map map = this.A0I;
        if (map != null) {
            i = map.size();
        } else {
            i = 0;
        }
        A10.append(i);
        return AnonymousClass1Y7.A02(AnonymousClass000.A0y("\n      |}\n    ", A10));
    }

    public A2S() {
        this(AnonymousClass8BV.A0E(), (AnonymousClass1EC) null, (PhoneUserJid) null, (PhoneUserJid) null, (UserJid) null, (UserJid) null, C42661yX.A05, (C29741cn) null, (String) null, "pn", (Map) null, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }
}

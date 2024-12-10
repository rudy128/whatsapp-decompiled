package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6xa  reason: invalid class name and case insensitive filesystem */
public final class C138726xa {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C19880zA A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11S A05;
    public final C25001Mm A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1P3 A09;
    public final C25581Ot A0A;
    public final AnonymousClass1MZ A0B;
    public final C32331h1 A0C;
    public final C26111Qw A0D;
    public final C18030ve A0E;
    public final C25931Qe A0F;
    public final AnonymousClass12N A0G;
    public final Jid A0H;
    public final UserJid A0I;
    public final C62242r5 A0J;
    public final AnonymousClass1PT A0K;
    public final C190799lX A0L;
    public final AnonymousClass206 A0M;
    public final AnonymousClass1W9 A0N;
    public final AnonymousClass1W6 A0O;
    public final C26971Uf A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final Integer A0S;
    public final String A0T;
    public final Map A0U;
    public final Set A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final byte[] A0b;

    public static void A00(AnonymousClass1E9 r4, C138726xa r5, AnonymousClass8X8 r6) {
        AnonymousClass11S r0 = r5.A05;
        r0.A0I();
        AnonymousClass1E3 r02 = r0.A02;
        C17960vV.A07(r02);
        byte[] bArr = r5.A09.A0E(new C59982nC(C63962tz.A02(r02), r4.getRawString())).A00;
        C17960vV.A07(bArr);
        AnonymousClass8ZH r03 = ((C166418cr) r6.A00).senderKeyDistributionMessage_;
        if (r03 == null) {
            r03 = AnonymousClass8ZH.DEFAULT_INSTANCE;
        }
        C163908Wu r2 = (C163908Wu) r03.A0O();
        r2.A0H(r4.getRawString());
        r2.A0G(DSQ.A01(bArr, 0, bArr.length));
        r6.A0P(r2);
    }

    public C138726xa(C19880zA r3, AnonymousClass190 r4, AnonymousClass11S r5, C25001Mm r6, AnonymousClass1M9 r7, AnonymousClass11P r8, AnonymousClass1P3 r9, C25581Ot r10, AnonymousClass1MZ r11, C32331h1 r12, C26111Qw r13, C18030ve r14, C25931Qe r15, AnonymousClass12N r16, Jid jid, UserJid userJid, C62242r5 r19, AnonymousClass1PT r20, C190799lX r21, AnonymousClass206 r22, AnonymousClass1W9 r23, AnonymousClass1W6 r24, C26971Uf r25, AnonymousClass00H r26, AnonymousClass00H r27, Integer num, String str, Map map, Set set, byte[] bArr, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A08 = r8;
        this.A0E = r14;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A0R = r26;
        this.A0Q = r27;
        this.A07 = r7;
        this.A0K = r20;
        this.A0A = r10;
        this.A0O = r24;
        this.A09 = r9;
        this.A0C = r12;
        this.A0D = r13;
        this.A0N = r23;
        this.A0J = r19;
        this.A03 = r3;
        this.A0F = r15;
        this.A0B = r11;
        this.A0G = r16;
        this.A0L = r21;
        this.A0M = r22;
        this.A0H = jid;
        this.A0I = userJid;
        this.A0V = set;
        this.A0P = r25;
        this.A0b = bArr;
        this.A0S = num;
        this.A0U = map;
        this.A0T = str;
        this.A0X = z;
        this.A0W = z2;
        this.A0a = z3;
        this.A0Z = z4;
        this.A0Y = z5;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }
}

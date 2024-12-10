package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.2sw  reason: invalid class name and case insensitive filesystem */
public final class C63362sw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C62532rY A06;
    public C166418cr A07;
    public C194059r6 A08;
    public C194059r6 A09;
    public AnonymousClass206 A0A;
    public AnonymousClass205 A0B;
    public C29621ca A0C;
    public C59812mv A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M = "pn";
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public byte[] A0V;
    public byte[] A0W;
    public final long A0X;
    public final Jid A0Y;
    public final Jid A0Z;
    public final AnonymousClass1E2 A0a;
    public final AnonymousClass1E2 A0b;
    public final PhoneUserJid A0c;
    public final PhoneUserJid A0d;
    public final PhoneUserJid A0e;
    public final UserJid A0f;
    public final AnonymousClass205 A0g;
    public final String A0h;
    public final HashMap A0i = C17880vN.A11();
    public final AnonymousClass1E2 A0j;

    public static B5K A00(C63362sw r2, Class cls) {
        return (B5K) r2.A0i.get(new AnonymousClass20F(cls));
    }

    public int A02() {
        Integer num = this.A0H;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public AnonymousClass1BI A03() {
        AnonymousClass1BI A002 = C22971Dz.A00(this.A0Z);
        C17960vV.A07(A002);
        C18070vi.A0X(A002);
        return A002;
    }

    public Jid A04() {
        Jid jid = this.A0Z;
        if (!C22971Dz.A0e(jid) && !C22971Dz.A0a(jid)) {
            return jid;
        }
        Jid jid2 = this.A0Y;
        C17960vV.A07(jid2);
        C18070vi.A0b(jid2);
        return jid2;
    }

    public UserJid A05() {
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(C22971Dz.A00(A04()));
    }

    public B5K A06(Class cls) {
        return (B5K) this.A0i.get(new AnonymousClass20F(cls));
    }

    public C60132nR A07(String str) {
        Jid jid;
        Jid jid2;
        C58762lD r2 = new C58762lD();
        r2.A06 = "message";
        r2.A08 = this.A0h;
        r2.A00 = this.A04;
        boolean z = this.A0S;
        if (z) {
            jid = this.A0Y;
        } else {
            jid = this.A0Z;
        }
        r2.A02 = jid;
        if (z) {
            jid2 = this.A0Z;
        } else {
            jid2 = this.A0Y;
        }
        r2.A01 = jid2;
        r2.A09 = this.A0R;
        if (!(str == null || str.length() == 0)) {
            r2.A01(str);
        }
        return r2.A00();
    }

    public final void A08(B5K b5k) {
        this.A0i.put(new AnonymousClass20F(b5k.getClass()), b5k);
    }

    public final void A0A(AnonymousClass206 r3) {
        this.A0A = r3;
        r3.A13 = DeviceJid.Companion.A02(A04());
        if (this.A0B.A02) {
            r3.A0a(4);
            r3.A19 = true;
        } else {
            Jid jid = this.A0Y;
            if (jid != null) {
                r3.A0d(C22971Dz.A00(jid));
            }
        }
        Integer num = this.A0H;
        if (num != null) {
            r3.A0B = num.intValue();
        }
        r3.A0A = this.A03;
        Long l = this.A0K;
        if (l != null) {
            r3.A0G = l.longValue();
        }
        r3.A10 = this.A04;
        Integer num2 = this.A0G;
        if (num2 != null) {
            r3.A0R = num2;
        }
        String str = this.A0Q;
        if (str != null) {
            r3.A0e = str;
        }
        String str2 = this.A0P;
        if (str2 != null) {
            r3.A0Y = str2;
        }
        r3.A0p = this.A0U;
    }

    public final void A0B(AnonymousClass205 r3) {
        AnonymousClass205 r0;
        if (this.A0A != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("IncomingMessageStanza/forceUpdateMessageKey trying to update with ");
            A10.append(r3);
            A10.append(" when fMessage=");
            AnonymousClass206 r02 = this.A0A;
            if (r02 != null) {
                r0 = r02.A0v;
            } else {
                r0 = null;
            }
            A10.append(r0);
            C17890vO.A19(A10, " is already set, ignoring.");
            C17960vV.A0F(false, "messageKey must be updated before building FMessage");
        }
        this.A0B = r3;
    }

    public final boolean A0C() {
        Jid jid = this.A0Z;
        if (C22971Dz.A0Q(jid) || C22971Dz.A0e(jid) || C22971Dz.A0d(jid)) {
            return true;
        }
        return false;
    }

    public C63362sw(Jid jid, Jid jid2, AnonymousClass1E2 r4, AnonymousClass1E2 r5, AnonymousClass1E2 r6, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, PhoneUserJid phoneUserJid3, UserJid userJid, AnonymousClass205 r11, AnonymousClass205 r12, String str, long j) {
        this.A0Z = jid;
        this.A0h = str;
        this.A0X = j;
        this.A0g = r11;
        this.A0f = userJid;
        this.A0Y = jid2;
        this.A0e = phoneUserJid;
        this.A0b = r4;
        this.A0d = phoneUserJid2;
        this.A0j = r5;
        this.A0c = phoneUserJid3;
        this.A0a = r6;
        this.A0B = r12;
    }

    public static void A01(C63362sw r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0B);
    }

    public final void A09(AnonymousClass206 r6) {
        A0A(r6);
        C62532rY r1 = this.A06;
        if (r1 != null) {
            r6.A16 = r1.A06;
            r6.A15 = r1.A05;
            r6.A0n = r1.A07;
        }
        r6.A0l = this.A0S;
        int i = this.A01;
        if (i != 0) {
            r6.A01 = i;
        }
        long j = this.A05;
        if (j != 0) {
            r6.A0b(j);
        }
    }
}

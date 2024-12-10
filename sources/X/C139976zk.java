package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6zk  reason: invalid class name and case insensitive filesystem */
public final class C139976zk {
    public Long A00;
    public ConcurrentHashMap A01 = new ConcurrentHashMap();
    public boolean A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass11P A04;

    public final int A01(String str) {
        Number A1D = C108945cZ.A1D(str, this.A01);
        if (A1D != null) {
            return A1D.intValue();
        }
        return 0;
    }

    public final void A02(Integer num, boolean z) {
        AnonymousClass64Y r2 = new AnonymousClass64Y();
        r2.A01 = C17880vN.A0k();
        int intValue = num.intValue();
        Long A0X = C108975cc.A0X();
        switch (intValue) {
            case 0:
                r2.A04 = A0X;
                break;
            case 1:
                r2.A09 = A0X;
                break;
            case 2:
                r2.A08 = A0X;
                break;
            case 3:
                r2.A06 = A0X;
                break;
            case 4:
                r2.A05 = A0X;
                break;
            default:
                r2.A03 = A0X;
                break;
        }
        if (!z) {
            r2.A00 = true;
        }
        r2.A02 = 1;
        this.A03.CC7(r2);
    }

    public final void A03(boolean z) {
        AnonymousClass64Y r2 = new AnonymousClass64Y();
        r2.A01 = C17880vN.A0j();
        r2.A09 = A00(this, "message");
        r2.A06 = A00(this, "contact");
        r2.A08 = A00(this, "group");
        r2.A05 = A00(this, "chat");
        r2.A04 = A00(this, "ai_suggestion");
        r2.A07 = A00(this, "filter");
        if (!z) {
            r2.A00 = true;
        }
        r2.A02 = 1;
        this.A03.CC7(r2);
    }

    public C139976zk(AnonymousClass11P r2, AnonymousClass18K r3) {
        C18070vi.A0j(r2, r3);
        this.A04 = r2;
        this.A03 = r3;
    }

    public static Long A00(C139976zk r0, String str) {
        return Long.valueOf((long) r0.A01(str));
    }
}

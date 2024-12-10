package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1Qy  reason: invalid class name and case insensitive filesystem */
public final class C26131Qy {
    public final AnonymousClass11S A00;
    public final AnonymousClass1PM A01;
    public final AnonymousClass1PS A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass1CJ A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;

    public C26131Qy(AnonymousClass11S r2, AnonymousClass18O r3, AnonymousClass1M9 r4, AnonymousClass1PM r5, AnonymousClass1CJ r6, AnonymousClass1PS r7, C18030ve r8, AnonymousClass00H r9) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r5, 6);
        C18070vi.A0d(r9, 7);
        C18070vi.A0d(r7, 8);
        this.A06 = r8;
        this.A00 = r2;
        this.A05 = r6;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A07 = r9;
        this.A02 = r7;
    }

    public final int A01(AnonymousClass206 r8) {
        C20285AEt aEt;
        C20277AEk aEk;
        C18070vi.A0d(r8, 0);
        AnonymousClass1CJ r3 = this.A05;
        AnonymousClass1M9 r1 = this.A04;
        AnonymousClass1BI r0 = r8.A0v.A00;
        if (r0 != null) {
            if (C43391zj.A04(r1, r3, r0)) {
                Long l = r8.A0T;
                boolean z = false;
                if (l != null && l.longValue() > 0) {
                    z = true;
                }
                if (r8.A05 <= 0 && ((r8.A0T == null || !z) && (r8 instanceof AnonymousClass21L) && (aEt = ((AnonymousClass21L) r8).A00) != null)) {
                    if (C18020vd.A05(C18040vf.A02, this.A06, 3240) && (aEk = aEt.A06) != null && aEk.A03.size() == 1) {
                        String str = ((C20253ADl) aEk.A03.get(0)).A01.A02;
                        if ("review_and_pay".equals(str) || "review_and_pay_v2".equals(str) || "review_order".equals(str) || "payment_method".equals(str) || "payment_status".equals(str)) {
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A02(int i) {
        String A072;
        ArrayList arrayList;
        if (i < 0) {
            return false;
        }
        if (i != 0) {
            AnonymousClass18O r1 = this.A03;
            synchronized (AnonymousClass18O.class) {
                A072 = r1.A07(AnonymousClass18O.A1W);
            }
            if (A072 == null) {
                A072 = "604800";
            }
            try {
                arrayList = new ArrayList();
                for (String valueOf : A072.split(",")) {
                    arrayList.add(Integer.valueOf(valueOf));
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
                for (String valueOf2 : "604800".split(",")) {
                    arrayList.add(Integer.valueOf(valueOf2));
                }
            }
            if (!arrayList.contains(Integer.valueOf(i))) {
                this.A07.get();
                C24521Kq r0 = C24521Kq.$redex_init_class;
                return false;
            }
        }
        return true;
    }

    public static final boolean A00(C26131Qy r6, AnonymousClass1BI r7, C29721cl r8, Long l, int i, long j) {
        if (C22971Dz.A0d(r7)) {
            if (r8 == null) {
                return true;
            }
            if (!(i == r8.expiration || l == null)) {
                long longValue = l.longValue();
                if (longValue <= j) {
                    long j2 = r8.ephemeralSettingTimestamp;
                    if (longValue == j2) {
                        C22941Dw r0 = UserJid.Companion;
                        UserJid A012 = C22941Dw.A01(r7);
                        if (A012 != null) {
                            AnonymousClass11S r02 = r6.A00;
                            r02.A0I();
                            PhoneUserJid phoneUserJid = r02.A0E;
                            if (phoneUserJid == null || A012.compareTo((Jid) phoneUserJid) >= 0) {
                                return false;
                            }
                            return true;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } else if (longValue > j2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

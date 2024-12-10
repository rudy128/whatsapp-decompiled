package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tc  reason: invalid class name and case insensitive filesystem */
public final class C195609tc {
    public final UserJid A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195609tc) {
                C195609tc r5 = (C195609tc) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A06)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17900vP.A00(this.A07)) * 31) + C108955ca.A06(this.A08);
    }

    public C195609tc(UserJid userJid, Boolean bool, Boolean bool2, Long l, Long l2, Long l3, String str, String str2, String str3) {
        this.A00 = userJid;
        this.A06 = str;
        this.A03 = l;
        this.A04 = l2;
        this.A01 = bool;
        this.A02 = bool2;
        this.A05 = l3;
        this.A07 = str2;
        this.A08 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizIntegritySignals(userJid=");
        A10.append(this.A00);
        A10.append(", dhash=");
        A10.append(this.A06);
        A10.append(", fbLinkedPageNumberOfLikes=");
        A10.append(this.A03);
        A10.append(", igLinkedPageNumberOfFollowers=");
        A10.append(this.A04);
        A10.append(", isBanned=");
        A10.append(this.A01);
        A10.append(", isSuspicious=");
        A10.append(this.A02);
        A10.append(", joinDateMs=");
        A10.append(this.A05);
        A10.append(", phoneCountryCode=");
        A10.append(this.A07);
        A10.append(", trustTier=");
        return C17900vP.A0B(this.A08, A10);
    }
}

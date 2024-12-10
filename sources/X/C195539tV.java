package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tV  reason: invalid class name and case insensitive filesystem */
public final class C195539tV {
    public C194359rb A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C173438v4 A04;
    public final UserJid A05;
    public final String A06;
    public final String A07;

    public C195539tV(C194359rb r2, C173438v4 r3, UserJid userJid, String str, String str2, int i, int i2, int i3) {
        C18070vi.A0d(userJid, 5);
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A07 = str;
        this.A05 = userJid;
        this.A04 = r3;
        this.A06 = str2;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195539tV) {
                C195539tV r5 = (C195539tV) obj;
                if (this.A03 != r5.A03 || this.A02 != r5.A02 || this.A01 != r5.A01 || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A05, ((((((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + C17900vP.A00(this.A07)) * 31)) + 3) * 31) + C17900vP.A00(this.A06)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogCollectionsPageRequest(width=");
        A10.append(this.A03);
        A10.append(", height=");
        A10.append(this.A02);
        A10.append(", collectionLimit=");
        A10.append(this.A01);
        A10.append(", sessionId=");
        A10.append(this.A07);
        A10.append(", bizJid=");
        A10.append(this.A05);
        A10.append(", serverJid=");
        A10.append(this.A04);
        A10.append(", itemPreCollectionLimit=");
        A10.append(3);
        A10.append(", afterCursor=");
        A10.append(this.A06);
        A10.append(", catalogVariantsRequestData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}

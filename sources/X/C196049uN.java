package X;

import java.util.Set;

/* renamed from: X.9uN  reason: invalid class name and case insensitive filesystem */
public final class C196049uN {
    public int A00;
    public final BC8 A01;
    public final BCY A02;
    public final C191449mc A03;
    public final Set A04 = C17880vN.A14();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196049uN) {
                C196049uN r5 = (C196049uN) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)));
    }

    public C196049uN(BC8 bc8, BCY bcy, C191449mc r4) {
        this.A01 = bc8;
        this.A02 = bcy;
        this.A03 = r4;
    }

    public final void A00(AnonymousClass9IM r3, C72443Lz r4) {
        C17960vV.A0F(r4.CGK().contains(r3), "The contributor should override 'runBefore' with the contributorTag");
        this.A04.add(r3);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageSerializationApi(messageStanzaEncryptor=");
        A10.append(this.A01);
        A10.append(", messageTreeNodeFactory=");
        A10.append(this.A02);
        A10.append(", encryptedMessagesDataHolder=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}

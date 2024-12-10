package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

public final class AUN implements C437020o, C22512BAt {
    public final AnonymousClass00H A00;

    public AUN(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Set BSF() {
        return C18070vi.A0P(C179859Ke.A1q);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.23U, X.206] */
    public AnonymousClass206 CBA(C166388co r6) {
        ? r2 = new AnonymousClass206(C20106A7k.A02(r6, this.A00), 12, C20106A7k.A00(r6));
        if ((r6.bitField0_ & 16) != 0) {
            AnonymousClass8BT.A1F(UserJid.Companion, r2, r6.participant_);
        }
        if ((r6.bitField0_ & 536870912) != 0) {
            r2.A0o(r6.futureproofData_.A06());
        }
        if (AnonymousClass8BR.A03(r6) > 0) {
            String A0w = C17880vN.A0w(r6.messageStubParameters_, 0);
            C18070vi.A0X(A0w);
            r2.A01 = Integer.parseInt(A0w);
        }
        return r2;
    }

    public void BDZ(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        AnonymousClass23U r72;
        boolean A15 = C18070vi.A15(r7, r6);
        if (!(r7 instanceof AnonymousClass23U) || (r72 = (AnonymousClass23U) r7) == null) {
            throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
        } else if (r72.A00 != 1000) {
            byte[] A12 = r72.A12();
            r6.A0I(C179859Ke.A1q);
            if (A12 != null) {
                C23581BmB A03 = C17900vP.A03(r6, A12);
                C166388co r2 = (C166388co) r6.A00;
                int i = C166388co.AGENT_ID_FIELD_NUMBER;
                r2.bitField0_ |= 536870912;
                r2.futureproofData_ = A03;
            }
            r6.A0J(String.valueOf(r72.A01));
        } else {
            throw new AnonymousClass1T8(69, "SkipFutureBotMessage");
        }
    }

    public Integer BSW() {
        return AnonymousClass00R.A01;
    }
}

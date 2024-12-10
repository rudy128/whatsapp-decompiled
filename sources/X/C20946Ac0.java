package X;

/* renamed from: X.Ac0  reason: case insensitive filesystem */
public final class C20946Ac0 implements AnonymousClass25D {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;

    public C20946Ac0(C165488bE r8) {
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        C18070vi.A0d(r8, 1);
        int i = r8.bitField0_;
        Integer num4 = null;
        if (AnonymousClass8BW.A1Q(i)) {
            num = Integer.valueOf(r8.sentiment_);
        } else {
            num = null;
        }
        if ((i & 2) != 0) {
            str = r8.behaviorGraph_;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = Integer.valueOf(r8.action_);
        } else {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = Integer.valueOf(r8.intensity_);
        } else {
            num3 = null;
        }
        num4 = (i & 16) != 0 ? Integer.valueOf(r8.wordCount_) : num4;
        this.A02 = num;
        this.A04 = str;
        this.A00 = num2;
        this.A01 = num3;
        this.A03 = num4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20946Ac0) {
                C20946Ac0 ac0 = (C20946Ac0) obj;
                if (!C18070vi.A18(this.A02, ac0.A02) || !C18070vi.A18(this.A04, ac0.A04) || !C18070vi.A18(this.A00, ac0.A00) || !C18070vi.A18(this.A01, ac0.A01) || !C18070vi.A18(this.A03, ac0.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass001.A0k(this.A02) * 31) + C17900vP.A00(this.A04)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotAvatarMetadata(sentiment=");
        A10.append(this.A02);
        A10.append(", behaviorGraph=");
        A10.append(this.A04);
        A10.append(", action=");
        A10.append(this.A00);
        A10.append(", intensity=");
        A10.append(this.A01);
        A10.append(", wordCount=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}

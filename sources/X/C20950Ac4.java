package X;

/* renamed from: X.Ac4  reason: case insensitive filesystem */
public final class C20950Ac4 implements AnonymousClass25D {
    public final Integer A00;

    public C20950Ac4(AnonymousClass8XU r4) {
        Integer num;
        C18070vi.A0d(r4, 1);
        AnonymousClass9KO A002 = AnonymousClass9KO.A00(r4.imagineType_);
        int ordinal = (A002 == null ? AnonymousClass9KO.UNKNOWN : A002).ordinal();
        if (ordinal == 1) {
            num = AnonymousClass00R.A01;
        } else if (ordinal == 2) {
            num = AnonymousClass00R.A0C;
        } else if (ordinal == 3) {
            num = AnonymousClass00R.A0N;
        } else if (ordinal != 4) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A0Y;
        }
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C20950Ac4) && this.A00 == ((C20950Ac4) obj).A00);
    }

    public int hashCode() {
        Integer num = this.A00;
        return C72453Mb.A0E(num, A00(num));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "IMAGINE";
            case 2:
                return "MEMU";
            case 3:
                return "FLASH";
            default:
                return "EDIT";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotImagineMetadata(imagineType=");
        return C17900vP.A0B(A00(this.A00), A10);
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

public final class CYT {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C27758Dke(this));

    public CYT(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C186059da A00(C0L c0l) {
        C186059da r0;
        AnonymousClass00H r02 = (AnonymousClass00H) AnonymousClass8BV.A0n(c0l, this.A01);
        if (r02 != null && (r0 = (C186059da) r02.get()) != null) {
            return r0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("No attributes found for ");
        throw AnonymousClass000.A0o(c0l.id, A10);
    }

    public final List A01(Integer num) {
        Integer num2;
        C0L[] values = C0L.values();
        ArrayList A13 = AnonymousClass000.A13();
        for (C0L c0l : values) {
            this.A00.get();
            C18070vi.A0d(c0l, 0);
            switch (c0l.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                case 69:
                case 70:
                case 71:
                    num2 = AnonymousClass00R.A00;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    num2 = AnonymousClass00R.A0C;
                    break;
                default:
                    throw AnonymousClass3MW.A14();
            }
            if (num2 == num) {
                A13.add(c0l);
            }
        }
        return C29431cG.A0t(A13);
    }
}

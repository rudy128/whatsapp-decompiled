package X;

public abstract class CCS {
    public static final Integer A00(int i) {
        Integer num = AnonymousClass00R.A00;
        if (i != 1) {
            num = AnonymousClass00R.A01;
            if (i != 2) {
                num = AnonymousClass00R.A0C;
                if (i != 4096) {
                    num = AnonymousClass00R.A0N;
                    if (i != 8192) {
                        num = AnonymousClass00R.A0Y;
                        if (i != 8193) {
                            num = AnonymousClass00R.A0j;
                            if (i != 8194) {
                                throw AnonymousClass8BX.A0W("Unknown message type: ", AnonymousClass000.A10(), i);
                            }
                        }
                    }
                }
            }
        }
        return num;
    }
}

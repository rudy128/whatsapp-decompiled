package X;

/* renamed from: X.C7n  reason: case insensitive filesystem */
public abstract class C24519C7n {
    public static final C24284Byh A00(C24284Byh byh, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return C24284Byh.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return C24284Byh.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return C24284Byh.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        return C24284Byh.FLEX_START;
                    }
                    break;
            }
        }
        return byh;
    }
}

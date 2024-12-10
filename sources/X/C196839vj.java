package X;

/* renamed from: X.9vj  reason: invalid class name and case insensitive filesystem */
public abstract class C196839vj {
    public static Integer A00(String str) {
        if (str.equals("FAVICON")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("CHATLIST")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("AISEARCH_NULL_STATE_PAPER_PLANE")) {
            return AnonymousClass00R.A0C;
        }
        if (str.equals("AISEARCH_NULL_STATE_SUGGESTION")) {
            return AnonymousClass00R.A0N;
        }
        if (str.equals("AISEARCH_TYPE_AHEAD_SUGGESTION")) {
            return AnonymousClass00R.A0Y;
        }
        if (str.equals("AISEARCH_TYPE_AHEAD_PAPER_PLANE")) {
            return AnonymousClass00R.A0j;
        }
        if (str.equals("AISEARCH_TYPE_AHEAD_RESULT_CHATLIST")) {
            return AnonymousClass00R.A0u;
        }
        if (str.equals("AISEARCH_TYPE_AHEAD_RESULT_MESSAGES")) {
            return AnonymousClass00R.A15;
        }
        if (str.equals("AIVOICE_SEARCH_BAR")) {
            return AnonymousClass00R.A18;
        }
        if (str.equals("AIVOICE_FAVICON")) {
            return AnonymousClass00R.A19;
        }
        if (str.equals("AISTUDIO")) {
            return AnonymousClass00R.A02;
        }
        if (str.equals("DEEPLINK")) {
            return AnonymousClass00R.A03;
        }
        if (str.equals("NOTIFICATION")) {
            return AnonymousClass00R.A04;
        }
        if (str.equals("PROFILE_MESSAGE_BUTTON")) {
            return AnonymousClass00R.A05;
        }
        if (str.equals("FORWARD")) {
            return AnonymousClass00R.A06;
        }
        if (str.equals("APP_SHORTCUT")) {
            return AnonymousClass00R.A07;
        }
        throw AnonymousClass000.A0k(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CHATLIST";
            case 2:
                return "AISEARCH_NULL_STATE_PAPER_PLANE";
            case 3:
                return "AISEARCH_NULL_STATE_SUGGESTION";
            case 4:
                return "AISEARCH_TYPE_AHEAD_SUGGESTION";
            case 5:
                return "AISEARCH_TYPE_AHEAD_PAPER_PLANE";
            case 6:
                return "AISEARCH_TYPE_AHEAD_RESULT_CHATLIST";
            case 7:
                return "AISEARCH_TYPE_AHEAD_RESULT_MESSAGES";
            case 8:
                return "AIVOICE_SEARCH_BAR";
            case 9:
                return "AIVOICE_FAVICON";
            case 10:
                return "AISTUDIO";
            case 11:
                return "DEEPLINK";
            case 12:
                return "NOTIFICATION";
            case 13:
                return "PROFILE_MESSAGE_BUTTON";
            case 14:
                return "FORWARD";
            case 15:
                return "APP_SHORTCUT";
            default:
                return "FAVICON";
        }
    }
}

package X;

/* renamed from: X.4Y5  reason: invalid class name */
public final class AnonymousClass4Y5 {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Y5) {
                AnonymousClass4Y5 r5 = (AnonymousClass4Y5) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return (C72453Mb.A0E(num, A00(num)) * 31) + this.A00;
    }

    public AnonymousClass4Y5(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PROBLEM_AUDIO_NOT_CLEAR";
            case 2:
                return "PROBLEM_AUDIO_ROBOTIC_OR_DISTORTED";
            case 3:
                return "PROBLEM_AUDIO_ECHO";
            case 4:
                return "PROBLEM_AUDIO_TOO_SLOW";
            case 5:
                return "PROBLEM_AUDIO_OTHERS_COULD_NOT_HEAR_ME";
            case 6:
                return "PROBLEM_AUDIO_I_COULD_NOT_HEAR_OTHERS";
            case 7:
                return "PROBLEM_AUDIO_BACKGROUND_OR_CRACKLING_NOISES";
            case 8:
                return "PROBLEM_VIDEO_FROZE";
            case 9:
                return "PROBLEM_VIDEO_BLURRY";
            case 10:
                return "PROBLEM_VIDEO_I_COULD_NOT_SEE_OTHERS";
            case 11:
                return "PROBLEM_VIDEO_OTHERS_COULD_NOT_SEE_ME";
            case 12:
                return "PROBLEM_VIDEO_AND_AUDIO_NOT_MATCHING";
            case 13:
                return "PROBLEM_VIDEO_DISTORTED";
            case 14:
                return "PROBLEM_OTHER_CALL_KEPT_DISCONNECTING";
            case 15:
                return "PROBLEM_OTHER_CALL_SUDDENLY_ENDED";
            default:
                return "PROBLEM_OTHER_COULD_NOT_ANSWER_CALL";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserProblem(userProblemReason=");
        A10.append(A00(this.A01));
        A10.append(", strResourceId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}

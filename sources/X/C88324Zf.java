package X;

/* renamed from: X.4Zf  reason: invalid class name and case insensitive filesystem */
public final class C88324Zf {
    public final long A00;
    public final AnonymousClass4CW A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public C88324Zf() {
        this(AnonymousClass4CW.WA_VIDEO_CALL, AnonymousClass00R.A00, (String) null, 0, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88324Zf) {
                C88324Zf r8 = (C88324Zf) obj;
                if (!(C18070vi.A18(this.A03, r8.A03) && this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A04 == r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A01, AnonymousClass001.A0K(this.A00, C17900vP.A00(this.A03) * 31));
        Integer num = this.A02;
        return C17880vN.A01((A0N + C72453Mb.A0E(num, A00(num))) * 31, this.A04);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "LOADING";
            case 2:
                return "SUCCESS";
            case 3:
                return "CREATE_ERROR";
            case 4:
                return "EDIT_ERROR";
            case 5:
                return "CREATE_NO_INTERNET";
            case 6:
                return "EDIT_NO_INTERNET";
            case 7:
                return "ERROR_MAX_START_TIME";
            case 8:
                return "ERROR_PAST_START_TIME";
            default:
                return "IDLE";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLinkUIState(linkText=");
        A10.append(this.A03);
        A10.append(", eventStartTime=");
        A10.append(this.A00);
        A10.append(", callLinkType=");
        A10.append(this.A01);
        A10.append(", state=");
        A10.append(A00(this.A02));
        A10.append(", isChecked=");
        return C17900vP.A0F(A10, this.A04);
    }

    public C88324Zf(AnonymousClass4CW r1, Integer num, String str, long j, boolean z) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = num;
        this.A04 = z;
    }
}

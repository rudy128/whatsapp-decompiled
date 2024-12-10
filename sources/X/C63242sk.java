package X;

/* renamed from: X.2sk  reason: invalid class name and case insensitive filesystem */
public final class C63242sk {
    public final long A00;
    public final Integer A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63242sk) {
                C63242sk r8 = (C63242sk) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && C18070vi.A18(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A0I = AnonymousClass000.A0I(this.A00) * 31;
        Integer num = this.A01;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = A00(num).hashCode() + num.intValue();
        }
        return ((A0I + hashCode) * 31 * 31) + C17880vN.A02(this.A02);
    }

    public C63242sk(Integer num, Long l, long j) {
        this.A00 = j;
        this.A01 = num;
        this.A02 = l;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DEEPLINK";
            case 2:
                return "FORWARDED_MESSAGE";
            case 3:
                return "RECOMMENDED_NEWSLETTERS";
            case 4:
                return "ADMIN_INVITE";
            case 5:
                return "STATUS_HEADER";
            case 6:
                return "STATUS_LINK_TOOLTIP";
            case 7:
                return "STATUS_LINK_BUTTON";
            case 8:
                return "STATUS_POST_TOOLTIP";
            case 9:
                return "MEDIA_BROWSER_LINK_TOOLTIP";
            case 10:
                return "MEDIA_BROWSER_LINK_BUTTON";
            case 11:
                return "MEDIA_BROWSER_POST_TOOLTIP";
            case 12:
                return "SIMILAR_NEWSLETTERS_NEWSLETTER_THREAD";
            case 13:
                return "SIMILAR_NEWSLETTERS_NEWSLETTER_PROFILE";
            default:
                return "IN_APP_LINK";
        }
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkState(serverMessageId=");
        A10.append(this.A00);
        A10.append(", linkType=");
        Integer num = this.A01;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", messageType=");
        A10.append((Object) null);
        A10.append(", similarNewslettersSessionId=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public C63242sk() {
        this((Integer) null, (Long) null, 0);
    }
}

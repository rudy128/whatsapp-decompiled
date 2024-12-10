package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Cqh  reason: case insensitive filesystem */
public final class C26023Cqh {
    public Drawable A00;
    public CQU A01;
    public AnonymousClass1E7 A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public boolean A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26023Cqh) {
                C26023Cqh cqh = (C26023Cqh) obj;
                if (!C18070vi.A18(this.A07, cqh.A07) || this.A04 != cqh.A04 || !C18070vi.A18(this.A02, cqh.A02) || !C18070vi.A18(this.A05, cqh.A05) || this.A03 != cqh.A03 || !C18070vi.A18(this.A00, cqh.A00) || !C18070vi.A18(this.A01, cqh.A01) || this.A06 != cqh.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0E;
        Integer num = this.A04;
        int A002 = ((((((C17900vP.A00(this.A07) * 31) + C72453Mb.A0E(num, A00(num))) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A05)) * 31;
        Integer num2 = this.A03;
        if (num2 == null) {
            A0E = 0;
        } else {
            A0E = C72453Mb.A0E(num2, A01(num2));
        }
        return C17880vN.A01((((((A002 + A0E) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01)) * 31, this.A06);
    }

    public C26023Cqh(Drawable drawable, CQU cqu, AnonymousClass1E7 r3, Integer num, Integer num2, String str, String str2, boolean z) {
        this.A07 = str;
        this.A04 = num;
        this.A02 = r3;
        this.A05 = str2;
        this.A03 = num2;
        this.A00 = drawable;
        this.A01 = cqu;
        this.A06 = z;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CHECKING_LOCAL_CACHE_STARTED";
            case 2:
                return "CHECKING_LOCAL_CACHE_COMPLETED";
            case 3:
                return "CHECKING_SYNC_SERVICE_STARTED";
            case 4:
                return "CHECKING_SYNC_SERVICE_COMPLETED";
            case 5:
                return "LOADING_CONTACT_PHOTO_STARTED";
            case 6:
                return "LOADING_CONTACT_PHOTO_COMPLETED";
            case 7:
                return "FINALIZED";
            default:
                return "INITIALIZED";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONTACT_NAME";
            case 2:
                return "VERIFIED_NAME";
            case 3:
                return "PHONE_NUMBER";
            case 4:
                return "PUSH_NAME";
            case 5:
                return "CHAT_SUBJECT";
            case 6:
                return "RECIPIENTS_COUNT";
            case 7:
                return "MY_STATUS";
            case 8:
                return "GIVEN_NAME";
            case 9:
                return "INTEROP_NAME";
            case 10:
                return "MY_GROUP_NAME";
            default:
                return "UNKNOWN";
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DialerContactDetails(enteredPhoneNumber=");
        A10.append(this.A07);
        A10.append(", state=");
        Integer num = this.A04;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", contact=");
        A10.append(this.A02);
        A10.append(", displayName=");
        A10.append(this.A05);
        A10.append(", displayNameType=");
        Integer num2 = this.A03;
        if (num2 != null) {
            str2 = A01(num2);
        } else {
            str2 = "null";
        }
        A10.append(str2);
        A10.append(", contactPhoto=");
        A10.append(this.A00);
        A10.append(", contactQueryResponse=");
        A10.append(this.A01);
        A10.append(", enteredPhoneNumberIsValid=");
        return C17900vP.A0F(A10, this.A06);
    }
}

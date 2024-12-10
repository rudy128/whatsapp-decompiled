package X;

/* renamed from: X.4o7  reason: invalid class name and case insensitive filesystem */
public final class C96604o7 implements AnonymousClass87K {
    public void BpN(Integer num) {
        String str;
        StringBuilder A0K = C18070vi.A0K(num);
        A0K.append("contactinfo/maybeverifyidentitykeys Identity verification for contact and self completed with result: ");
        switch (num.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "PENDING";
                break;
            default:
                str = "FAIL";
                break;
        }
        C17890vO.A19(A0K, str);
    }
}

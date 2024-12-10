package X;

/* renamed from: X.1oC  reason: invalid class name and case insensitive filesystem */
public abstract class C36621oC {
    public final C18030ve A00;
    public final C36561o6 A01;
    public final AnonymousClass18K A02;

    public C36621oC(C18030ve r2, AnonymousClass18K r3, C36561o6 r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r3;
    }

    public int A00() {
        if (this instanceof AnonymousClass2C4) {
            return 11993;
        }
        if (this instanceof C36631oD) {
            return 12198;
        }
        if (this instanceof C36661oG) {
            return 11515;
        }
        if (this instanceof C36651oF) {
            return 11435;
        }
        if (this instanceof C36641oE) {
            return 11114;
        }
        return 12235;
    }

    public final C21319Ai4 A01() {
        String str;
        C36561o6 r2 = this.A01;
        int A002 = A00();
        if (this instanceof AnonymousClass2C4) {
            str = "whatsapp_payments_home_banner";
        } else if (this instanceof C36631oD) {
            str = "whatsapp_banner_settings";
        } else if (this instanceof C36661oG) {
            str = "whatsapp_banner_profile";
        } else if (this instanceof C36651oF) {
            str = "whatsapp_banner_group_info";
        } else if (this instanceof C36641oE) {
            str = "whatsapp_banner_chat_list";
        } else {
            str = "whatsapp_banner_call_list";
        }
        C21319Ai4 A012 = r2.A01(str, A002);
        if (A012 != null) {
            A05(A012.A0F, 4);
        }
        return A012;
    }

    public final void A02(AnonymousClass5YR r4) {
        this.A01.A00(C179549Ik.DISMISS_ACTION, r4, A00());
        A05(((C21319Ai4) r4).A0F, 3);
    }

    public final void A03(AnonymousClass5YR r4) {
        this.A01.A00(C179549Ik.IMPRESSION, r4, A00());
        A05(((C21319Ai4) r4).A0F, 1);
    }

    public final void A04(AnonymousClass5YR r4) {
        this.A01.A00(C179549Ik.PRIMARY_ACTION, r4, A00());
        A05(((C21319Ai4) r4).A0F, 2);
    }

    public final void A05(String str, int i) {
        int i2;
        C170888qp r1 = new C170888qp();
        r1.A02 = str;
        if (this instanceof AnonymousClass2C4) {
            i2 = 16;
        } else if (this instanceof C36631oD) {
            i2 = 73;
        } else if (this instanceof C36661oG) {
            i2 = 50;
        } else if (this instanceof C36651oF) {
            i2 = 47;
        } else if (this instanceof C36641oE) {
            i2 = 45;
        } else {
            i2 = 74;
        }
        r1.A01 = Integer.valueOf(i2);
        r1.A00 = Integer.valueOf(i);
        this.A02.CC7(r1);
    }
}

package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.4Xn  reason: invalid class name and case insensitive filesystem */
public final class C87904Xn {
    public static final Set A0A = C200410p.A0S(new String[]{"overflow_menu_report", "message_menu", "overflow_menu_block", "chat_list_block", "biz_overflow_menu_block", "chat_fmx_card_block", "chat_fmx_card_block_suspicious", "chat_list_noinsub_block", "biz_account_info_block", "account_info_report", "account_info_block", "biz_spam_banner_block", "biz_call_log_block", "call_log_block", "biz_block_list", "notification_block"});
    public static final Set A0B;
    public final AnonymousClass1KB A00;
    public final C19880zA A01;
    public final C19880zA A02;
    public final AnonymousClass11S A03;
    public final C26911Ty A04;
    public final AnonymousClass1R3 A05;
    public final C18030ve A06;
    public final AnonymousClass18K A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;

    public final void A00(AnonymousClass1FU r11, UserJid userJid, AnonymousClass205 r13, String str, String str2, C18090vk r16) {
        C18070vi.A0d(r11, 1);
        this.A08.CGF(new C21394AjN(this, r11, userJid, r13, r16, str, str2, 3));
    }

    static {
        Integer[] numArr = new Integer[4];
        C17880vN.A1T(numArr, 1, 0);
        C17880vN.A1T(numArr, 3, 1);
        C17880vN.A1T(numArr, 42, 2);
        C17880vN.A1T(numArr, 43, 3);
        A0B = C200410p.A0S(numArr);
    }

    public final void A01(UserJid userJid) {
        if (C18020vd.A05(C18040vf.A02, this.A06, 10393) && userJid != null) {
            C19880zA r1 = this.A01;
            if (r1.A07()) {
                r1.A03();
                AnonymousClass1ZT.A00(userJid);
                throw AnonymousClass000.A0s("getFirstCtwaUserJid");
            }
        }
    }

    public C87904Xn(C19880zA r1, C19880zA r2, AnonymousClass1KB r3, AnonymousClass11S r4, C26911Ty r5, AnonymousClass1R3 r6, C18030ve r7, AnonymousClass18K r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        C18070vi.A0w(r7, r3, r1, r2, r8);
        C18070vi.A0x(r6, r4, r5, r9, r10);
        this.A06 = r7;
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r9;
        this.A09 = r10;
    }
}

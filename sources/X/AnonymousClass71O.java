package X;

/* renamed from: X.71O  reason: invalid class name */
public class AnonymousClass71O {
    public final C125096aW A00;
    public final C125106aX A01;
    public final C125116aY A02;
    public final C125126aZ A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass118 A05;
    public final C19830z4 A06;
    public final AnonymousClass19D A07;
    public final C18030ve A08;
    public final AnonymousClass707 A09;
    public final AnonymousClass10I A0A;

    public static void A00(C138506xC r0, AnonymousClass89S r1) {
        Integer num;
        int i;
        AnonymousClass163 r02 = r0.A04;
        if (r02 == null) {
            i = 2;
        } else {
            num = (Integer) r02.A00();
            if (num == null) {
                i = -1;
            }
            r1.Btp(num);
        }
        num = Integer.valueOf(i);
        r1.Btp(num);
    }

    public static void A01(AnonymousClass71O r3, C128776gf r4) {
        String str = r4.A00;
        C19830z4 r32 = r3.A06;
        C17880vN.A1E(C19830z4.A00(r32), "support_ban_appeal_state", str);
        if ("UNBANNED".equals(str)) {
            String str2 = r4.A01;
            C17900vP.A0f("BanAppealRepository/storeUnbanReason ", str2, AnonymousClass000.A10());
            C17880vN.A1E(C19830z4.A00(r32), "support_ban_appeal_unban_reason", str2);
            String str3 = r4.A02;
            C17900vP.A0f("BanAppealRepository/storeUnbanReasonUrl ", str3, AnonymousClass000.A10());
            C17880vN.A1E(C19830z4.A00(r32), "support_ban_appeal_unban_reason_url", str3);
        }
    }

    public AnonymousClass71O(C125096aW r1, C125106aX r2, C125116aY r3, C125126aZ r4, AnonymousClass11E r5, AnonymousClass118 r6, C19830z4 r7, AnonymousClass19D r8, C18030ve r9, AnonymousClass707 r10, AnonymousClass10I r11) {
        this.A05 = r6;
        this.A0A = r11;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}

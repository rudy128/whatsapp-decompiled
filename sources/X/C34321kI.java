package X;

import android.app.Notification;
import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1kI  reason: invalid class name and case insensitive filesystem */
public final class C34321kI {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C18030ve A04;
    public final AnonymousClass1LU A05;
    public final AnonymousClass00H A06;
    public final C27301Vn A07;
    public final AnonymousClass1CJ A08;
    public final AnonymousClass122 A09;
    public final AnonymousClass1PQ A0A;
    public final AnonymousClass00H A0B;

    public C34321kI(AnonymousClass1M9 r2, C24921Me r3, AnonymousClass11P r4, AnonymousClass118 r5, C27301Vn r6, AnonymousClass1CJ r7, AnonymousClass122 r8, C18030ve r9, AnonymousClass1LU r10, AnonymousClass1PQ r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r3, 7);
        C18070vi.A0d(r8, 8);
        C18070vi.A0d(r12, 9);
        C18070vi.A0d(r11, 10);
        C18070vi.A0d(r6, 11);
        C18070vi.A0d(r13, 12);
        this.A02 = r4;
        this.A04 = r9;
        this.A03 = r5;
        this.A05 = r10;
        this.A08 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A09 = r8;
        this.A0B = r12;
        this.A0A = r11;
        this.A07 = r6;
        this.A06 = r13;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.97o, X.20i, X.206] */
    public final void A00(UserJid userJid, String str, long j) {
        int i;
        Object[] objArr;
        String string;
        AnonymousClass1CJ r2 = this.A08;
        UserJid userJid2 = userJid;
        if (r2.A0P(userJid2)) {
            if (C18020vd.A00(C18040vf.A02, this.A04, 9177) != 1) {
                return;
            }
        }
        C27301Vn r4 = this.A07;
        String str2 = str;
        boolean equalsIgnoreCase = "clicked_invite_link".equalsIgnoreCase(str2);
        Context context = this.A03.A00;
        C18070vi.A0X(context);
        C24921Me r3 = this.A01;
        AnonymousClass1M9 r0 = this.A00;
        C17960vV.A07(userJid2);
        Object A0I = r3.A0I(r0.A0H(userJid2));
        Object string2 = context.getString(2131899103);
        C18070vi.A0X(string2);
        if (equalsIgnoreCase) {
            i = 2131893079;
            objArr = new Object[]{A0I};
        } else {
            i = 2131893080;
            objArr = new Object[]{A0I, string2};
        }
        String string3 = context.getString(i, objArr);
        C18070vi.A0b(string3);
        if (equalsIgnoreCase) {
            string = context.getString(2131893011, new Object[]{A0I, string2});
        } else {
            string = context.getString(2131893012);
        }
        C18070vi.A0b(string);
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "other_notifications@1";
        A032.A03 = 1;
        A032.A0F(string3);
        AnonymousClass11P r32 = this.A02;
        A032.A09(AnonymousClass11P.A01(r32));
        A032.A06(3);
        A032.A0G(true);
        A032.A0E(string3);
        A032.A0D(string);
        ? r12 = new AnonymousClass72G();
        r12.A07(context.getString(2131893011, new Object[]{A0I, string2}));
        A032.A0B(r12);
        A032.A0A = C1408573i.A00(context, 1, this.A05.A1w(context, userJid2, 0), 0);
        A032.A08.icon = 2131231578;
        Notification A052 = A032.A05();
        C18070vi.A0X(A052);
        r4.BkR(62, A052);
        AnonymousClass1PQ r1 = this.A0A;
        long A012 = AnonymousClass11P.A01(r32);
        boolean z = !r2.A0P(userJid2);
        ? r13 = new C436420i(r1.A02.A01(userJid2, true), 136, A012);
        r13.A00 = true;
        r13.A00 = z;
        r13.A0i(Boolean.toString(equalsIgnoreCase));
        this.A09.BBM(r13);
        ((C58362kZ) this.A0B.get()).A01(new C21366Aiv(this, userJid2, str2, 3, j));
    }
}

package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class A2O {
    public C194489ro A00;
    public boolean A01;
    public final AQB A02 = new AQB(this, 1);
    public final AnonymousClass11S A03;
    public final AnonymousClass1VW A04;
    public final AnonymousClass1M9 A05;
    public final C24671Lf A06;
    public final C24921Me A07;
    public final C27201Vd A08;
    public final AnonymousClass118 A09;
    public final AnonymousClass11P A0A;
    public final C27301Vn A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public final void A01(Context context, C46162Dk r16, C29681ch r17, String str, int i) {
        String str2 = str;
        C18070vi.A0d(str2, 3);
        String A10 = AnonymousClass3Ma.A10(context, r16.A0A(), new Object[1], 0, 2131892869);
        this.A0D.get();
        C29681ch r9 = r17;
        Intent A102 = AnonymousClass1LU.A10(context, r9, (Long) null, 0, 0, false);
        A102.addFlags(335544320);
        PendingIntent A072 = C17880vN.A07(context, A102, 0);
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "other_notifications@1";
        A032.A0F(str2);
        A032.A09(System.currentTimeMillis());
        A032.A06(3);
        A032.A0G(true);
        A032.A0A = A072;
        A032.A0E(A10);
        A032.A0D(str2);
        C17880vN.A1G(A032);
        AnonymousClass1E7 A0H = this.A05.A0H(r9);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        Bitmap A033 = this.A08.A03(context, A0H, dimensionPixelSize, dimensionPixelSize);
        if (A033 == null) {
            A033 = this.A04.A07(A0H, AnonymousClass3MW.A05(this.A09).getDimension(2131168737), dimensionPixelSize);
        }
        AnonymousClass70v.A00(A033, A032);
        C27301Vn r3 = this.A0B;
        StringBuilder A0f = C17890vO.A0f(r9);
        A0f.append('-');
        String A0u = C17880vN.A0u(A0f, System.currentTimeMillis());
        Notification A052 = A032.A05();
        C18070vi.A0X(A052);
        r3.BkS(A0u, i, A052);
        this.A06.unregisterObserver(this.A02);
        this.A01 = false;
    }

    public final void A02(C179509Ig r12, C29681ch r13, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, Integer num) {
        C46162Dk r7;
        AnonymousClass1E7 r4;
        int i;
        int i2;
        Context A0E = C108945cZ.A0E(this.A09);
        String str = "";
        C29681ch r8 = r13;
        C29691ci r72 = (C29691ci) AnonymousClass8BR.A0M(this.A0C).A06(r13, str).first;
        if ((r72 instanceof C46162Dk) && (r7 = (C46162Dk) r72) != null) {
            if (num.intValue() == 0) {
                if (r12 != null) {
                    int ordinal = r12.ordinal();
                    if (ordinal == 2) {
                        r4 = this.A05.A0H(phoneUserJid);
                        i = 2131890495;
                    } else if (ordinal == 3) {
                        if (phoneUserJid2 != null) {
                            r4 = this.A05.A0H(phoneUserJid2);
                            i = 2131893431;
                        } else {
                            i2 = 2131893430;
                        }
                    }
                    str = C17880vN.A0q(A0E, this.A07.A0O(r4), new Object[1], 0, i);
                }
                C18070vi.A0b(str);
                A01(A0E, r7, r8, str, 83);
            } else if (this.A03.A0O(phoneUserJid)) {
                i2 = 2131898596;
            } else {
                r4 = this.A05.A0H(phoneUserJid);
                i = 2131890494;
                str = C17880vN.A0q(A0E, this.A07.A0O(r4), new Object[1], 0, i);
                C18070vi.A0b(str);
                A01(A0E, r7, r8, str, 83);
            }
            str = A0E.getString(i2);
            C18070vi.A0b(str);
            A01(A0E, r7, r8, str, 83);
        }
    }

    public final void A03(C29681ch r15, PhoneUserJid phoneUserJid, List list) {
        C46162Dk r7;
        String A0q;
        Context A0E = C108945cZ.A0E(this.A09);
        C29681ch r11 = r15;
        C29691ci r72 = (C29691ci) AnonymousClass8BR.A0M(this.A0C).A06(r15, "").first;
        if ((r72 instanceof C46162Dk) && (r7 = (C46162Dk) r72) != null) {
            List list2 = list;
            PhoneUserJid phoneUserJid2 = phoneUserJid;
            if (list2.size() == 1) {
                A0q = A00(A0E, r7, phoneUserJid2, (AnonymousClass9IA) C29431cG.A0b(list2), false);
            } else {
                String A0O = this.A07.A0O(this.A05.A0H(phoneUserJid2));
                if (list2.size() == 3) {
                    A0q = C17890vO.A0R(A0E, A0O, 1, 0, 2131892756);
                } else {
                    A0q = C17880vN.A0q(A0E, A00(A0E, r7, phoneUserJid2, (AnonymousClass9IA) list2.get(1), true), C108945cZ.A1a(A0O, A00(A0E, r7, phoneUserJid2, (AnonymousClass9IA) C29431cG.A0b(list2), true), 3, 1), 2, 2131892726);
                }
                C18070vi.A0X(A0q);
            }
            A01(A0E, r7, r11, A0q, 86);
        }
    }

    private final String A00(Context context, C46162Dk r8, UserJid userJid, AnonymousClass9IA r10, boolean z) {
        String str;
        int i;
        int i2;
        String A0O = this.A07.A0O(this.A05.A0H(userJid));
        int ordinal = r10.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return AnonymousClass3Ma.A10(context, A0O, new Object[1], 0, 2131892761);
                    }
                    throw AnonymousClass3MW.A14();
                } else if (z) {
                    i = 2131892729;
                } else {
                    i2 = 2131892750;
                }
            } else if (z) {
                i = 2131892727;
            } else {
                i2 = 2131892561;
            }
            str = C17890vO.A0R(context, A0O, 1, 0, i2);
            C18070vi.A0b(str);
            return str;
        } else if (z) {
            i = 2131892728;
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = A0O;
            str = C17880vN.A0q(context, r8.A0T, objArr, 1, 2131892740);
            C18070vi.A0b(str);
            return str;
        }
        str = context.getString(i);
        C18070vi.A0b(str);
        return str;
    }

    public A2O(AnonymousClass11S r3, AnonymousClass1VW r4, AnonymousClass1M9 r5, C24671Lf r6, C24921Me r7, C27201Vd r8, AnonymousClass11P r9, AnonymousClass118 r10, C27301Vn r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r9, r10, r3, r5, r7);
        C18070vi.A0x(r4, r6, r12, r8, r11);
        C18070vi.A0d(r13, 11);
        this.A0A = r9;
        this.A09 = r10;
        this.A03 = r3;
        this.A05 = r5;
        this.A07 = r7;
        this.A04 = r4;
        this.A06 = r6;
        this.A0C = r12;
        this.A08 = r8;
        this.A0B = r11;
        this.A0D = r13;
    }
}

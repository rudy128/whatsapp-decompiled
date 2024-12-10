package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;

/* renamed from: X.2qp  reason: invalid class name and case insensitive filesystem */
public class C62122qp {
    public String A00;
    public final AnonymousClass1VM A01;
    public final AnonymousClass1HS A02;
    public final C31131f4 A03;
    public final C18000vb A04;
    public final C217217d A05;
    public final AnonymousClass206 A06;
    public final AnonymousClass16P A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    private String A00(C42551yM r4, C42551yM r5, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C145777Mo r0;
        if (this.A09) {
            return ((C43551zz) r4).A0D();
        }
        if (!z2 || (Build.VERSION.SDK_INT >= 28 && (!AnonymousClass1VM.A00(this.A01).A03.isEmpty()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean equalsIgnoreCase = "Silent".equalsIgnoreCase(r4.A07());
        if (this.A08 || z || this.A0B || equalsIgnoreCase || !z3 || z4 || (((r0 = this.A03.A00) != null && r0.A14) || this.A07.A00)) {
            return ((C43551zz) r4).A0F();
        }
        if (r5 != null) {
            return ((C43551zz) r5).A0E();
        }
        return ((C43551zz) r4).A0E();
    }

    public C1409673t A01(PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, AnonymousClass1E7 r25, C60182nW r26, C42551yM r27, C42551yM r28, CharSequence charSequence, CharSequence charSequence2, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        long j;
        String A0y;
        String A0R;
        String str;
        int i3 = i;
        CharSequence charSequence3 = charSequence;
        boolean A012 = this.A02.A01();
        C60182nW r14 = r26;
        if (this.A06 != null) {
            z3 = true;
            j = System.currentTimeMillis();
        } else {
            z3 = false;
            j = r14.A00.A0I;
        }
        C1409673t A032 = C217217d.A03(context);
        A032.A0E(charSequence2);
        A032.A0D(charSequence3);
        A032.A0A = pendingIntent;
        Notification notification = A032.A08;
        notification.deleteIntent = pendingIntent2;
        A032.A0L = "msg";
        A032.A09(j);
        C1409673t A033 = C217217d.A03(context);
        A033.A0L = "msg";
        C217217d r8 = this.A05;
        Context context2 = r8.A07.A00;
        A033.A0E(context2.getString(2131899099));
        if (i3 == 1) {
            C18000vb r11 = this.A04;
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, i3, 0);
            charSequence3 = r11.A0K(objArr, 2131755286, 1);
        }
        A033.A0D(charSequence3);
        A033.A08.icon = 2131231578;
        A032.A09 = A033.A05();
        if (this.A0A) {
            if (this.A09) {
                str = "newsletter_key_messages";
            } else {
                str = "group_key_messages";
            }
            A032.A0N = str;
            A032.A0V = true;
        }
        notification.icon = 2131231578;
        boolean z4 = this.A08;
        if (!z4) {
            AnonymousClass206 r0 = r14.A00;
            C24921Me r9 = r8.A04;
            AnonymousClass1BI r12 = r0.A0v.A00;
            AnonymousClass1E7 r10 = r25;
            int A092 = r9.A09(r10, r12);
            if (!r10.A0F()) {
                A0R = C17880vN.A0q(context2, r9.A0U(r10, A092, false), new Object[1], 0, 2131893073);
            } else if (r0 instanceof C436420i) {
                A0R = r8.A02.A0S((C436420i) r0, false);
            } else {
                AnonymousClass1BI A0H = r0.A0H();
                if (A0H != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(r8.A0L(A0H, r12));
                    A10.append(" @ ");
                    A0y = AnonymousClass000.A0y(r9.A0U(r10, A092, false), A10);
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("getNotificationTicker/missing_rmt_src:");
                    C17890vO.A19(A102, AnonymousClass25A.A0D(r0));
                    StringBuilder A103 = AnonymousClass000.A10();
                    C17880vN.A1A(context2, A103, 2131888741);
                    A103.append(" @ ");
                    A0y = AnonymousClass000.A0y(r9.A0U(r10, A092, false), A103);
                }
                A0R = C17890vO.A0R(context2, A0y, 1, 0, 2131893073);
            }
            A032.A0F(C63462t7.A02(A0R));
        }
        String A062 = r14.A06();
        if (A062 != null && !A062.isEmpty()) {
            A032.A0S.add(A062);
        }
        C42551yM r16 = r27;
        boolean z5 = z;
        if (!z2 && !z && !this.A0B && !z4 && z3) {
            int i4 = 1;
            if (r16.A0C()) {
                i4 = 0;
            }
            A032.A03 = i4;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String A002 = A00(r16, r28, z5, A012, z3);
            this.A00 = A002;
            C17960vV.A07(A002);
            A032.A0M = A002;
            A032.A01 = 1;
            A032.A02 = i + i2;
            StringBuilder sb2 = sb;
            sb2.append(" channelId=");
            sb2.append(A002);
        }
        return A032;
    }

    public C62122qp(AnonymousClass1VM r1, AnonymousClass1HS r2, C31131f4 r3, C18000vb r4, C217217d r5, AnonymousClass206 r6, AnonymousClass16P r7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r7;
        this.A03 = r3;
        this.A01 = r1;
        this.A06 = r6;
        this.A0A = z;
        this.A0B = z2;
        this.A08 = z3;
        this.A09 = z4;
    }
}

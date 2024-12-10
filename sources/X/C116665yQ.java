package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;

/* renamed from: X.5yQ  reason: invalid class name and case insensitive filesystem */
public final class C116665yQ extends C196289ul {
    public C010105w A00;
    public C18000vb A01;
    public Calendar A02;
    public Calendar A03;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass1R8 A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass118 A07;
    public final C19830z4 A08;
    public final AnonymousClass1LW A09;
    public final AnonymousClass121 A0A;
    public final AnonymousClass1PQ A0B;
    public final AnonymousClass1Nb A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C27301Vn A0H;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(android.content.Context r5, X.C20285AEt r6, X.C20271AEe r7) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r3 = 0
            if (r7 == 0) goto L_0x001a
            java.lang.String r0 = r7.A00     // Catch:{ JSONException -> 0x0010 }
            if (r0 == 0) goto L_0x001a
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x001b
        L_0x0010:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ReminderSetupAction/getButtonText: /"
            X.C108995ce.A1M(r0, r1, r2)
        L_0x001a:
            r1 = r3
        L_0x001b:
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "display_text"
            java.lang.String r3 = r1.optString(r0)
        L_0x0023:
            if (r3 == 0) goto L_0x002b
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0035
        L_0x002b:
            r0 = 2131892409(0x7f1218b9, float:1.9419565E38)
            java.lang.String r3 = r5.getString(r0)
            X.C18070vi.A0b(r3)
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116665yQ.A08(android.content.Context, X.AEt, X.AEe):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (r7.A08.A2a("android.permission.POST_NOTIFICATIONS") != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.app.Activity r8, X.AnonymousClass5XY r9, X.AnonymousClass206 r10, X.C20271AEe r11, int r12) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.C18070vi.A0k(r10, r11)
            X.205 r0 = r10.A0v
            X.1BI r5 = r0.A00
            if (r5 == 0) goto L_0x0122
            X.1Nb r0 = r7.A0C
            X.1yM r0 = r0.A0a(r5)
            boolean r0 = r0.A0A()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x001b:
            X.1Vn r0 = r7.A0H
            X.1Vo r0 = (X.AnonymousClass1Vo) r0
            X.1Vp r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0067
            X.3Rj r3 = X.AnonymousClass4a6.A00(r8)
            r0 = 2131892416(0x7f1218c0, float:1.941958E38)
            r3.A0E(r0)
            r0 = 2131892414(0x7f1218be, float:1.9419576E38)
            r3.A0D(r0)
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 == 0) goto L_0x004a
            X.0z4 r1 = r7.A08
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = r1.A2a(r0)
            r2 = 2131892416(0x7f1218c0, float:1.941958E38)
            if (r0 == 0) goto L_0x004d
        L_0x004a:
            r2 = 2131892415(0x7f1218bf, float:1.9419578E38)
        L_0x004d:
            r1 = 4
            X.74v r0 = new X.74v
            r0.<init>(r8, r7, r1)
            r3.A0Z(r0, r2)
            r2 = 2131892418(0x7f1218c2, float:1.9419584E38)
            r1 = 17
        L_0x005b:
            X.74r r0 = new X.74r
            r0.<init>(r1)
            r3.A0X(r0, r2)
            X.AnonymousClass3MY.A1G(r3)
        L_0x0066:
            return
        L_0x0067:
            boolean r0 = X.C72463Mc.A1Y(r1)
            if (r0 == 0) goto L_0x008f
            X.3Rj r3 = X.AnonymousClass4a6.A00(r8)
            r0 = 2131892420(0x7f1218c4, float:1.9419588E38)
            r3.A0E(r0)
            r0 = 2131892417(0x7f1218c1, float:1.9419582E38)
            r3.A0D(r0)
            r2 = 2131892419(0x7f1218c3, float:1.9419586E38)
            r1 = 3
            X.74v r0 = new X.74v
            r0.<init>(r7, r5, r1)
            r3.A0Z(r0, r2)
            r2 = 2131892418(0x7f1218c2, float:1.9419584E38)
            r1 = 18
            goto L_0x005b
        L_0x008f:
            X.3Rj r4 = X.AnonymousClass4a6.A00(r8)
            r0 = 2131892412(0x7f1218bc, float:1.9419572E38)
            r4.A0E(r0)
            r1 = 2131895378(0x7f122452, float:1.9425587E38)
            X.752 r0 = new X.752
            r0.<init>(r8, r7, r5, r10)
            r4.A0Z(r0, r1)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 19
            X.74r r0 = new X.74r
            r0.<init>(r1)
            r4.A0X(r0, r2)
            r0 = 5
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r0]
            X.0vb r0 = r7.A01
            if (r0 == 0) goto L_0x0125
            r2 = 1
            r6 = 2
            java.lang.String r0 = X.C64052u8.A02(r0, r2, r6)
            X.C18070vi.A0X(r0)
            r3 = 0
            r5[r3] = r0
            X.0vb r1 = r7.A01
            if (r1 == 0) goto L_0x0125
            r0 = 24
            java.lang.String r0 = X.C64052u8.A02(r1, r0, r6)
            X.C18070vi.A0X(r0)
            r5[r2] = r0
            X.0vb r1 = r7.A01
            if (r1 == 0) goto L_0x0125
            r0 = 7
            r2 = 3
            java.lang.String r0 = X.C64052u8.A02(r1, r0, r2)
            X.C18070vi.A0X(r0)
            r5[r6] = r0
            X.118 r1 = r7.A07
            r0 = 2131892411(0x7f1218bb, float:1.941957E38)
            java.lang.String r0 = X.C18070vi.A0G(r1, r0)
            r5[r2] = r0
            X.0vb r1 = r7.A01
            if (r1 == 0) goto L_0x0125
            r0 = 10
            java.lang.String r1 = X.C64052u8.A02(r1, r0, r3)
            X.C18070vi.A0X(r1)
            r0 = 4
            r5[r0] = r1
            r0 = 1
            X.74z r2 = new X.74z
            r2.<init>(r8, r7, r11, r0)
            r1 = -1
            androidx.appcompat.app.AlertDialog$Builder r0 = r4.A00
            r0.A0N(r2, r5, r1)
            X.05w r0 = r4.create()
            r7.A00 = r0
            if (r0 == 0) goto L_0x0114
            r0.show()
        L_0x0114:
            X.05w r0 = r7.A00
            if (r0 == 0) goto L_0x0066
            X.0QH r0 = r0.A00
            android.widget.Button r0 = r0.A0H
            if (r0 == 0) goto L_0x0066
            r0.setEnabled(r3)
            return
        L_0x0122:
            r1 = 0
            goto L_0x001b
        L_0x0125:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116665yQ.A0A(android.app.Activity, X.5XY, X.206, X.AEe, int):void");
    }

    public void A0B(Activity activity, AnonymousClass5XY r2, AnonymousClass206 r3, C20271AEe aEe, Class cls) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0j(aEe, r3);
        A0A(activity, r2, r3, aEe, 0);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 5075);
    }

    public C116665yQ(AnonymousClass1L9 r2, AnonymousClass1R8 r3, AnonymousClass11P r4, AnonymousClass118 r5, C27301Vn r6, C19830z4 r7, AnonymousClass1LW r8, AnonymousClass121 r9, AnonymousClass1PQ r10, AnonymousClass1Nb r11, AnonymousClass10I r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r4, r3, r12, r5, r13);
        C18070vi.A0x(r2, r11, r7, r10, r6);
        C18070vi.A0r(r9, r14, r15);
        C18070vi.A0d(r8, 14);
        this.A06 = r4;
        this.A05 = r3;
        this.A0D = r12;
        this.A07 = r5;
        this.A0E = r13;
        this.A04 = r2;
        this.A0C = r11;
        this.A08 = r7;
        this.A0B = r10;
        this.A0H = r6;
        this.A0A = r9;
        this.A0F = r14;
        this.A0G = r15;
        this.A09 = r8;
    }

    public static final void A00(Activity activity, C116665yQ r10) {
        Activity activity2 = activity;
        View inflate = View.inflate(activity, 2131626448, (ViewGroup) null);
        TextView A0E2 = AnonymousClass3Ma.A0E(inflate, 2131433770);
        ImageView A0C2 = AnonymousClass3Ma.A0C(inflate, 2131433768);
        View A052 = C18070vi.A05(inflate, 2131435879);
        View A053 = C18070vi.A05(inflate, 2131428811);
        A0E2.setText(2131895437);
        A0C2.setImageResource(2131233424);
        C73203Rj A002 = AnonymousClass4a6.A00(activity);
        A002.A0c(inflate);
        A002.A0T(false);
        C010105w A0L = AnonymousClass3MY.A0L(A002);
        Window window = A0L.getWindow();
        if (window != null) {
            AnonymousClass3Ma.A1H(window, C108955ca.A01(activity));
        }
        A052.setOnClickListener(new AFH(A0L, r10, activity2, activity.getPackageName(), 1));
        A053.setOnClickListener(new C89914dE(A0L, 23));
        A0L.show();
    }

    public int A04() {
        return 2131232143;
    }

    public String A07() {
        return "cta_reminder";
    }
}

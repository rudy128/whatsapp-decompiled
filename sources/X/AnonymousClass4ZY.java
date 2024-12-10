package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.4ZY  reason: invalid class name */
public final class AnonymousClass4ZY {
    public View A00;
    public AnonymousClass3PO A01;
    public AnonymousClass3QT A02;
    public AnonymousClass4PF A03;
    public C80083wW A04;
    public C80093wX A05;
    public C108415bf A06;
    public ArrayList A07;
    public boolean A08;
    public boolean A09;
    public final ViewGroup A0A;
    public final ListView A0B;
    public final AnonymousClass01E A0C;
    public final C19880zA A0D;
    public final AnonymousClass4JJ A0E;
    public final AnonymousClass1FR A0F;
    public final AnonymousClass11S A0G;
    public final C37551pj A0H;
    public final C36931oh A0I;
    public final C53052bu A0J;
    public final C108355bZ A0K;
    public final AnonymousClass1M9 A0L;
    public final AnonymousClass4LT A0M;
    public final AnonymousClass1CJ A0N;
    public final AnonymousClass1N4 A0O;
    public final AnonymousClass1QY A0P;
    public final C18030ve A0Q;
    public final AnonymousClass12L A0R;
    public final AnonymousClass126 A0S;
    public final AnonymousClass1MB A0T;
    public final AnonymousClass1BI A0U;
    public final AnonymousClass1Nb A0V;
    public final C58012k0 A0W;
    public final C24901Mc A0X;
    public final C41731wy A0Y = AnonymousClass3MW.A0o();
    public final C28931bI A0Z;
    public final C28931bI A0a;
    public final C28931bI A0b;
    public final C86184Qq A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass4PV A0e;
    public final C97924qH A0f;
    public final AnonymousClass1DC A0g;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r1 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        if (r0 != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4PI A00(X.AnonymousClass4SA r22, X.AnonymousClass4ZY r23, X.AnonymousClass1E7 r24) {
        /*
            r4 = r22
            int r1 = r4.A00
            r0 = 1
            r7 = r23
            if (r1 == r0) goto L_0x018d
            r0 = 2
            r3 = r24
            if (r1 == r0) goto L_0x0146
            r0 = 5
            if (r1 == r0) goto L_0x0103
            r0 = 6
            if (r1 != r0) goto L_0x022c
            X.4qH r6 = r7.A0f
            boolean r5 = r4.A02
            boolean r4 = r4.A01
            X.5bf r0 = r7.A06
            int r10 = r0.getType()
            X.1BI r0 = r3.A0J
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)
            if (r1 == 0) goto L_0x0100
            boolean r0 = r3.A0C()
            if (r0 == 0) goto L_0x0100
            X.1PM r0 = r6.A08
            boolean r9 = r0.A04(r1)
        L_0x0034:
            X.1BI r0 = r3.A0J
            boolean r8 = X.C22971Dz.A0T(r0)
            X.1pj r1 = r6.A06
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r3)
            boolean r1 = r1.A0P(r0)
            X.0ve r2 = r6.A0B
            boolean r0 = X.AnonymousClass3MX.A1X(r2)
            if (r5 == 0) goto L_0x022c
            if (r9 != 0) goto L_0x00fc
            if (r0 != 0) goto L_0x00fc
            r19 = 2131897273(0x7f122bb9, float:1.942943E38)
            if (r1 != 0) goto L_0x0058
        L_0x0055:
            r19 = 2131887168(0x7f120440, float:1.9408935E38)
        L_0x0058:
            r5 = 1
            if (r9 != 0) goto L_0x00f7
            if (r4 != 0) goto L_0x00f7
            int r1 = r3.A0A
            if (r1 == r5) goto L_0x00c1
            r0 = 2
            if (r1 == r0) goto L_0x00c1
            r0 = 3
            if (r1 == r0) goto L_0x00bd
            r1 = 5263(0x148f, float:7.375E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r18 = 2131895743(0x7f1225bf, float:1.9426328E38)
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r18 = 2131890435(0x7f121103, float:1.9415562E38)
        L_0x0077:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x007e
            r18 = 2131897137(0x7f122b31, float:1.9429155E38)
        L_0x007e:
            r14 = 0
            if (r10 == 0) goto L_0x0082
            r5 = 0
        L_0x0082:
            X.11S r0 = r6.A05
            boolean r0 = r0.A0N()
            r10 = 0
            int r11 = X.C72453Mb.A0J(r5)
            if (r9 != 0) goto L_0x0097
            if (r4 != 0) goto L_0x0097
            if (r8 != 0) goto L_0x0097
            r12 = 8
            if (r0 == 0) goto L_0x00a0
        L_0x0097:
            r12 = 0
            if (r9 != 0) goto L_0x00ba
            if (r4 != 0) goto L_0x00ba
            if (r8 != 0) goto L_0x00ba
            if (r0 != 0) goto L_0x00ba
        L_0x00a0:
            r13 = 0
            r15 = 8
            r20 = 2131887451(0x7f12055b, float:1.940951E38)
            r21 = -1
            r22 = 2131892997(0x7f121b05, float:1.9420758E38)
            X.4PI r4 = new X.4PI
            r17 = r15
            r24 = r13
            r9 = r4
            r16 = r15
            r23 = r13
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x00b9:
            return r4
        L_0x00ba:
            r14 = 8
            goto L_0x00a0
        L_0x00bd:
            r18 = 2131895744(0x7f1225c0, float:1.942633E38)
            goto L_0x0077
        L_0x00c1:
            r0 = 5263(0x148f, float:7.375E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r2, r0)
            r18 = 2131895745(0x7f1225c1, float:1.9426332E38)
            if (r0 == 0) goto L_0x0077
            r18 = 2131890436(0x7f121104, float:1.9415564E38)
            X.00H r0 = r6.A0F
            java.lang.Object r3 = r0.get()
            X.A1E r3 = (X.A1E) r3
            X.1E7 r2 = r6.A00
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.9aH r0 = r3.A02
            X.0ve r1 = r0.A01
            r0 = 11061(0x2b35, float:1.55E-41)
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x0077
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x0077
            boolean r0 = X.A1E.A00(r3, r2)
            goto L_0x0072
        L_0x00f7:
            r18 = 2131887566(0x7f1205ce, float:1.9409743E38)
            goto L_0x0077
        L_0x00fc:
            if (r1 != 0) goto L_0x022c
            goto L_0x0055
        L_0x0100:
            r9 = 0
            goto L_0x0034
        L_0x0103:
            X.4qH r1 = r7.A0f
            X.1BI r0 = r3.A0J
            r4 = 0
            if (r0 == 0) goto L_0x00b9
            X.1BI r0 = X.AnonymousClass1E7.A00(r3)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r3 = X.AnonymousClass17K.A05(r0)
            if (r3 == 0) goto L_0x00b9
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00b9
            r9 = 0
            X.01E r0 = r1.A02
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131897680(0x7f122d50, float:1.9430256E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r5 = X.AnonymousClass3MW.A0x(r2, r3, r0, r9, r1)
            r6 = 8
            r13 = -1
            X.4PI r4 = new X.4PI
            r8 = r6
            r10 = r6
            r11 = r6
            r15 = r13
            r16 = r13
            r17 = r9
            r18 = r9
            r19 = r9
            r7 = r6
            r12 = r9
            r14 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r4
        L_0x0146:
            X.4qH r2 = r7.A0f
            X.12L r0 = r2.A0C
            boolean r0 = X.C42761yh.A00(r3, r0)
            r4 = 0
            if (r0 == 0) goto L_0x00b9
            X.0z4 r0 = r2.A09
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "wac_consent_shown"
            r6 = 0
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x00b9
            X.1pj r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r3)
            boolean r0 = r1.A0P(r0)
            r13 = 2131887168(0x7f120440, float:1.9408935E38)
            if (r0 == 0) goto L_0x0172
            r13 = 2131897273(0x7f122bb9, float:1.942943E38)
        L_0x0172:
            r12 = 2131898322(0x7f122fd2, float:1.9431558E38)
            r5 = 8
            r14 = 2131887451(0x7f12055b, float:1.940951E38)
            r15 = -1
            r16 = 2131887452(0x7f12055c, float:1.9409511E38)
            X.4PI r3 = new X.4PI
            r9 = r5
            r10 = r5
            r11 = r5
            r17 = r6
            r18 = r6
            r7 = r6
            r8 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r3
        L_0x018d:
            X.4qH r2 = r7.A0f
            boolean r1 = r4.A02
            X.5bf r0 = r7.A06
            int r3 = r0.getType()
            r4 = 0
            if (r1 == 0) goto L_0x00b9
            X.1E7 r0 = r2.A00
            if (r0 != 0) goto L_0x021e
            java.lang.String r0 = "Contact is unexpected null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01a3:
            r4 = 0
        L_0x01a4:
            java.lang.String r0 = X.C97924qH.A00(r2, r3)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = 0
            r20 = 0
            r16 = -1
            r17 = -1
            r6 = 0
            r12 = 8
            int r7 = X.C72453Mb.A0J(r0)
            int r11 = X.C72453Mb.A07(r4)
            X.1kb r5 = r2.A07
            X.1E7 r4 = r2.A00
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r4.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r19 = r5.A0R(r0)
            r0 = 1
            if (r3 != r0) goto L_0x01fe
            X.0ve r4 = r2.A0B
            r3 = 11410(0x2c92, float:1.5989E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x01f7
            r14 = 2131895372(0x7f12244c, float:1.9425575E38)
            r20 = 1
            r16 = 2131891090(0x7f121392, float:1.941689E38)
            r1 = 2131891090(0x7f121392, float:1.941689E38)
        L_0x01e8:
            r8 = 0
            r9 = 8
            r15 = -1
            X.4PI r4 = new X.4PI
            r13 = r9
            r10 = r9
            r18 = r1
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        L_0x01f7:
            r14 = 2131890883(0x7f1212c3, float:1.941647E38)
            r0 = 2131891130(0x7f1213ba, float:1.9416971E38)
            goto L_0x0204
        L_0x01fe:
            r14 = 2131890882(0x7f1212c2, float:1.9416468E38)
            r0 = 2131891129(0x7f1213b9, float:1.941697E38)
        L_0x0204:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L_0x01e8
            X.0z4 r0 = r2.A09
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "privacy_groupadd"
            int r0 = r2.getInt(r0, r1)
            if (r0 != 0) goto L_0x0219
            r12 = 0
        L_0x0219:
            int r17 = r3.intValue()
            goto L_0x01e8
        L_0x021e:
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass3MY.A0a(r0)
            if (r1 == 0) goto L_0x01a3
            X.1MZ r0 = r2.A0A
            boolean r4 = r0.A0J(r1)
            goto L_0x01a4
        L_0x022c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZY.A00(X.4SA, X.4ZY, X.1E7):X.4PI");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.3Q0, android.widget.FrameLayout, android.view.View, android.view.ViewGroup, X.5bf] */
    public static void A01(AnonymousClass4ZY r5, AnonymousClass1E7 r6, boolean z) {
        C42741yf r0;
        C97924qH r1 = r5.A0f;
        r1.A00 = r6;
        r1.A01 = z;
        if (r5.A06 == null) {
            if ((!C18020vd.A05(C18040vf.A02, r5.A0Q, 412) || ((r0 = r6.A0G) != null && r0.A02())) && !C42761yh.A00(r6, r5.A0R)) {
                AnonymousClass01E r4 = r5.A0C;
                ? frameLayout = new FrameLayout(r4);
                if (!frameLayout.A0J) {
                    frameLayout.A0J = true;
                    AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(frameLayout.generatedComponent());
                    frameLayout.A0G = AnonymousClass10E.A8r(A0O2);
                    frameLayout.A0H = AnonymousClass3MZ.A13(A0O2);
                    frameLayout.A0F = AnonymousClass3Ma.A0a(A0O2);
                }
                View.inflate(r4, 2131624712, frameLayout);
                frameLayout.A00 = frameLayout.findViewById(2131427578);
                frameLayout.A02 = frameLayout.findViewById(2131429510);
                frameLayout.A06 = frameLayout.findViewById(2131435535);
                frameLayout.A01 = frameLayout.findViewById(2131428204);
                frameLayout.A0B = C17880vN.A0E(frameLayout, 2131431358);
                frameLayout.A05 = frameLayout.findViewById(2131433190);
                frameLayout.A04 = frameLayout.findViewById(2131430652);
                frameLayout.A07 = C17880vN.A0E(frameLayout, 2131427580);
                frameLayout.A0D = C17880vN.A0E(frameLayout, 2131435536);
                frameLayout.A08 = C17880vN.A0E(frameLayout, 2131428206);
                frameLayout.A0C = C17880vN.A0E(frameLayout, 2131433191);
                frameLayout.A0A = C17880vN.A0E(frameLayout, 2131430653);
                frameLayout.A0E = AnonymousClass3MX.A0W(frameLayout, 2131431283);
                frameLayout.A03 = frameLayout.findViewById(2131430055);
                frameLayout.A09 = C17880vN.A0E(frameLayout, 2131430056);
                r5.A06 = frameLayout;
                frameLayout.setup(r1);
                r5.A0B.addFooterView((View) r5.A06);
                return;
            }
            r5.A06 = r5.A0e.A00(C72463Mc.A0N(r5.A0a), r1);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.LinearLayout, android.view.View, X.3QT, android.view.ViewGroup] */
    public void A02(boolean z, int i) {
        TextView textView;
        int i2;
        this.A00.setVisibility(C72453Mb.A07(z ? 1 : 0));
        if (z || i == 0) {
            AnonymousClass3QT r0 = this.A02;
            if (r0 != null) {
                r0.setVisibility(8);
                return;
            }
            return;
        }
        if (this.A02 == null) {
            AnonymousClass01E r1 = this.A0C;
            ? linearLayout = new LinearLayout(r1);
            if (!linearLayout.A04) {
                linearLayout.A04 = true;
                linearLayout.A02 = C72453Mb.A0i(AnonymousClass3MW.A0O(linearLayout.generatedComponent()));
            }
            View.inflate(r1, 2131624738, linearLayout);
            int A002 = AnonymousClass3MX.A00(r1.getResources(), 2131166265, C87344Vf.A00(r1));
            linearLayout.setPadding(A002, 0, A002, 0);
            linearLayout.A01 = AnonymousClass3MW.A0J(linearLayout, 2131431471);
            linearLayout.A00 = (ProgressBar) AnonymousClass1HF.A06(linearLayout, 2131431470);
            linearLayout.A01.setTextSize(linearLayout.A02.A03(linearLayout.getResources()));
            this.A02 = linearLayout;
            LinearLayout.LayoutParams A0D2 = AnonymousClass3Ma.A0D();
            A0D2.gravity = 17;
            this.A02.setBackground(this.A0K.BQF());
            this.A0A.addView(this.A02, A0D2);
        }
        AnonymousClass3QT r02 = this.A02;
        if (r02 != null) {
            r02.setVisibility(0);
            AnonymousClass3QT r12 = this.A02;
            if (i == 1) {
                r12.A00.setVisibility(0);
                textView = r12.A01;
                i2 = 2131888126;
            } else if (i == 2) {
                r12.A00.setVisibility(8);
                textView = r12.A01;
                i2 = 2131888125;
            } else {
                return;
            }
            textView.setText(i2);
        }
    }

    public AnonymousClass4ZY(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ListView listView, AnonymousClass01E r9, C19880zA r10, AnonymousClass4PV r11, AnonymousClass4JJ r12, AnonymousClass1FR r13, AnonymousClass11S r14, C37551pj r15, C36931oh r16, C53052bu r17, C108355bZ r18, AnonymousClass1M9 r19, AnonymousClass4LT r20, C97924qH r21, AnonymousClass1CJ r22, AnonymousClass1N4 r23, AnonymousClass1QY r24, C18030ve r25, AnonymousClass12L r26, AnonymousClass126 r27, AnonymousClass1MB r28, AnonymousClass1BI r29, AnonymousClass1Nb r30, C58012k0 r31, AnonymousClass1W6 r32, C24901Mc r33, AnonymousClass1DC r34, AnonymousClass00H r35) {
        this.A0Q = r25;
        this.A0C = r9;
        this.A0G = r14;
        this.A0N = r22;
        this.A0X = r33;
        this.A0R = r26;
        this.A0d = r35;
        AnonymousClass1M9 r1 = r19;
        this.A0L = r1;
        this.A0g = r34;
        this.A0K = r18;
        this.A0H = r15;
        this.A0S = r27;
        AnonymousClass1QY r3 = r24;
        this.A0P = r3;
        this.A0T = r28;
        this.A0V = r30;
        this.A0W = r31;
        this.A0O = r23;
        this.A0D = r10;
        this.A0J = r17;
        this.A0f = r21;
        this.A0F = r13;
        this.A0M = r20;
        this.A0U = r29;
        this.A0B = listView;
        this.A0a = AnonymousClass3MW.A0p(viewStub);
        this.A0Z = AnonymousClass3MW.A0p(viewStub3);
        this.A0b = AnonymousClass3MW.A0p(viewStub2);
        this.A0c = new C86184Qq(r14, r1, r3, r32);
        this.A0I = r16;
        this.A0e = r11;
        this.A0E = r12;
        ViewGroup viewGroup = (ViewGroup) AnonymousClass3MX.A09(r9.getLayoutInflater(), listView, 2131624735);
        this.A0A = viewGroup;
        this.A00 = viewGroup.findViewById(2131434180);
        listView.addHeaderView(viewGroup);
    }
}

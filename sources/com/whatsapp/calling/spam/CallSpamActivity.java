package com.whatsapp.calling.spam;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass122;
import X.AnonymousClass17P;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.C129206hQ;
import X.C1598886g;
import X.C18070vi;
import X.C221618v;
import X.C22941Dw;
import X.C24901Mc;
import X.C24921Me;
import X.C32291gx;
import X.C32791hl;
import X.C61552ps;
import X.C61562pt;
import X.C72473Md;
import X.C72483Me;
import X.C825248h;
import X.C90994ey;
import X.C93094iQ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CheckBox;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class CallSpamActivity extends AnonymousClass1FY {
    public AnonymousClass1M9 A00;
    public C24901Mc A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C1598886g A04;

    public class ReportSpamOrBlockDialogFragment extends Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment {
        public long A00;
        public CheckBox A01;
        public AnonymousClass1KB A02;
        public AnonymousClass11E A03;
        public AnonymousClass1M9 A04;
        public C24921Me A05;
        public C32791hl A06;
        public AnonymousClass122 A07;
        public AnonymousClass1E7 A08;
        public UserJid A09;
        public UserJid A0A;
        public C32291gx A0B;
        public C129206hQ A0C;
        public AnonymousClass10I A0D;
        public AnonymousClass00H A0E;
        public AnonymousClass00H A0F;
        public AnonymousClass00H A0G;
        public AnonymousClass00H A0H;
        public String A0I;
        public String A0J;
        public String A0K;
        public boolean A0L;
        public boolean A0M;
        public boolean A0N;

        public static void A00(ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment) {
            if (reportSpamOrBlockDialogFragment.A0M) {
                String str = reportSpamOrBlockDialogFragment.A0K;
                UserJid userJid = reportSpamOrBlockDialogFragment.A0A;
                C18070vi.A0h(str, userJid);
                C61562pt.A00((C61562pt) reportSpamOrBlockDialogFragment.A0H.get(), userJid, str, 2);
                return;
            }
            String str2 = reportSpamOrBlockDialogFragment.A0K;
            UserJid userJid2 = reportSpamOrBlockDialogFragment.A0A;
            C18070vi.A0h(str2, userJid2);
            C61552ps.A00((C61552ps) reportSpamOrBlockDialogFragment.A0E.get(), userJid2, str2, 2);
        }

        /* JADX WARNING: type inference failed for: r4v3 */
        /* JADX WARNING: type inference failed for: r4v4 */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [boolean, int] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.app.Dialog A27(android.os.Bundle r10) {
            /*
                r9 = this;
                java.lang.String r0 = "callspamactivity/createdialog"
                com.whatsapp.util.Log.i((java.lang.String) r0)
                android.os.Bundle r3 = r9.A15()
                java.lang.String r0 = "caller_jid"
                java.lang.String r0 = r3.getString(r0)
                X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
                com.whatsapp.jid.UserJid r0 = r1.A04(r0)
                X.C17960vV.A07(r0)
                r9.A0A = r0
                java.lang.String r0 = "call_creator_jid"
                java.lang.String r0 = r3.getString(r0)
                com.whatsapp.jid.UserJid r0 = r1.A04(r0)
                r9.A09 = r0
                X.1M9 r1 = r9.A04
                com.whatsapp.jid.UserJid r0 = r9.A0A
                X.1E7 r0 = r1.A0E(r0)
                X.C17960vV.A07(r0)
                r9.A08 = r0
                java.lang.String r0 = "call_id"
                java.lang.String r0 = X.C108955ca.A0s(r3, r0)
                r9.A0I = r0
                java.lang.String r2 = "call_duration"
                r0 = -1
                long r0 = r3.getLong(r2, r0)
                r9.A00 = r0
                java.lang.String r0 = "call_terminator"
                r1 = 0
                boolean r0 = r3.getBoolean(r0, r1)
                r9.A0L = r0
                java.lang.String r0 = "call_termination_reason"
                java.lang.String r0 = r3.getString(r0)
                r9.A0J = r0
                java.lang.String r0 = "call_video"
                boolean r0 = r3.getBoolean(r0, r1)
                r9.A0N = r0
                boolean r0 = r9.A0M
                if (r0 == 0) goto L_0x00e0
                X.00H r0 = r9.A0H
                java.lang.Object r2 = r0.get()
                X.2pt r2 = (X.C61562pt) r2
                java.lang.String r1 = r9.A0K
                com.whatsapp.jid.UserJid r0 = r9.A0A
                r8 = 0
                boolean r4 = X.C18070vi.A17(r1, r0)
                X.C61562pt.A00(r2, r0, r1, r8)
            L_0x0076:
                r0 = 11
                X.757 r7 = X.AnonymousClass757.A00(r9, r0)
                X.1FL r6 = r9.A1D()
                X.3Rj r5 = X.AnonymousClass4a6.A00(r6)
                boolean r0 = r9.A0M
                if (r0 == 0) goto L_0x00c9
                r0 = 2131895182(0x7f12238e, float:1.942519E38)
                java.lang.String r0 = r9.A1H(r0)
            L_0x008f:
                r5.A0S(r0)
                r0 = 2131899286(0x7f123396, float:1.9433514E38)
                r5.A0Z(r7, r0)
                r1 = 2131898766(0x7f12318e, float:1.943246E38)
                r0 = 10
                X.757 r0 = X.AnonymousClass757.A00(r9, r0)
                r5.A0X(r0, r1)
                boolean r0 = r9.A0M
                if (r0 == 0) goto L_0x00c4
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
                r0 = 2131626720(0x7f0e0ae0, float:1.8880684E38)
                android.view.View r1 = X.AnonymousClass3MY.A0D(r1, r0)
                r0 = 2131428211(0x7f0b0373, float:1.847806E38)
                android.view.View r0 = r1.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r9.A01 = r0
                r0.setChecked(r4)
                r5.setView(r1)
            L_0x00c4:
                X.05w r0 = r5.create()
                return r0
            L_0x00c9:
                r3 = 2131887169(0x7f120441, float:1.9408937E38)
                java.lang.Object[] r2 = new java.lang.Object[r4]
                X.1E7 r1 = r9.A08
                if (r1 == 0) goto L_0x00dd
                X.1Me r0 = r9.A05
                java.lang.String r0 = r0.A0I(r1)
            L_0x00d8:
                java.lang.String r0 = X.AnonymousClass3MX.A16(r9, r0, r2, r8, r3)
                goto L_0x008f
            L_0x00dd:
                java.lang.String r0 = ""
                goto L_0x00d8
            L_0x00e0:
                X.00H r0 = r9.A0E
                java.lang.Object r2 = r0.get()
                X.2ps r2 = (X.C61552ps) r2
                java.lang.String r1 = r9.A0K
                com.whatsapp.jid.UserJid r0 = r9.A0A
                r8 = 0
                boolean r4 = X.C18070vi.A17(r1, r0)
                X.C61552ps.A00(r2, r0, r1, r8)
                goto L_0x0076
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment.A27(android.os.Bundle):android.app.Dialog");
        }

        public void onCancel(DialogInterface dialogInterface) {
            A00(this);
        }
    }

    public CallSpamActivity() {
        this(0);
        this.A02 = C221618v.A00(AnonymousClass17P.class);
        this.A04 = new C93094iQ(this, 1);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass3Ma.A0u(A0L);
            this.A00 = AnonymousClass10E.A4z(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        UserJid A022;
        super.onCreate(bundle);
        Bundle A09 = AnonymousClass3MY.A09(this);
        String str2 = null;
        if (A09 == null || (A022 = C22941Dw.A02(A09.getString("caller_jid"))) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("callspamactivity/create/not-creating/bad-jid: ");
            if (A09 != null) {
                str2 = A09.getString("caller_jid");
            }
            str = AnonymousClass000.A0y(str2, A10);
        } else {
            AnonymousClass1E7 A0E = this.A00.A0E(A022);
            String string = A09.getString("call_id");
            if (A0E == null || string == null) {
                str = "callspamactivity/create/not-creating/null-args";
            } else {
                AnonymousClass3Ma.A1H(getWindow(), AnonymousClass3Ma.A00(this, 2130970796, 2131102217));
                getWindow().addFlags(2621440);
                setContentView(2131624460);
                int color = getResources().getColor(2131101222);
                AnonymousClass4aX.A0E(AnonymousClass3MX.A0L(this, 2131428741), color);
                AnonymousClass4aX.A0E(AnonymousClass3MX.A0L(this, 2131428737), color);
                AnonymousClass4aX.A0E(AnonymousClass3MX.A0L(this, 2131428739), color);
                C825248h.A00(findViewById(2131428740), this, A09, 22);
                C825248h.A00(findViewById(2131428738), this, A022, 23);
                C825248h.A00(findViewById(2131428736), this, A09, 24);
                C1598886g r1 = this.A04;
                C18070vi.A0d(r1, 0);
                ((AnonymousClass17P) this.A02.get()).A00.add(r1);
                return;
            }
        }
        Log.e(str);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        C1598886g r1 = this.A04;
        C18070vi.A0d(r1, 0);
        ((AnonymousClass17P) this.A02.get()).A00.remove(r1);
    }

    public void onStop() {
        super.onStop();
        finish();
    }

    public CallSpamActivity(int i) {
        this.A03 = false;
        C90994ey.A00(this, 34);
    }
}

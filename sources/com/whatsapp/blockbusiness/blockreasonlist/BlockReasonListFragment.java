package com.whatsapp.blockbusiness.blockreasonlist;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass12L;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3XH;
import X.AnonymousClass4aU;
import X.C17890vO;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C21451AkI;
import X.C22941Dw;
import X.C24921Me;
import X.C27621Wu;
import X.C36401np;
import X.C72453Mb;
import X.C87904Xn;
import X.C98634rT;
import X.C99104sH;
import X.C99144sL;
import X.C99184sP;
import X.C99204sR;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class BlockReasonListFragment extends Hilt_BlockReasonListFragment {
    public CheckBox A00;
    public RecyclerView A01;
    public AnonymousClass1KB A02;
    public AnonymousClass3XH A03;
    public AnonymousClass1M9 A04;
    public C24921Me A05;
    public AnonymousClass11C A06;
    public AnonymousClass1L2 A07;
    public AnonymousClass1KW A08;
    public AnonymousClass12L A09;
    public UserJid A0A;
    public C18010vc A0B;
    public C87904Xn A0C;
    public C36401np A0D;
    public AnonymousClass10I A0E;
    public WDSButton A0F;
    public AnonymousClass00H A0G;
    public boolean A0H;
    public Runnable A0I;
    public final C18100vl A0J = C99144sL.A01(this, 23);

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        if (r1.startsWith("ent:") == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        if (r1.length() > 0) goto L_0x0145;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r11, android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            r2 = 0
            X.C18070vi.A0d(r12, r2)
            android.os.Bundle r1 = r10.A15()
            java.lang.String r0 = "jid"
            java.lang.String r7 = r1.getString(r0)
            if (r7 == 0) goto L_0x0168
            boolean r1 = r10.A0H
            r0 = 2131624292(0x7f0e0164, float:1.887576E38)
            if (r1 == 0) goto L_0x001a
            r0 = 2131624293(0x7f0e0165, float:1.8875762E38)
        L_0x001a:
            android.view.View r9 = r12.inflate(r0, r13, r2)
            X.C18070vi.A0b(r9)
            r0 = 2131428226(0x7f0b0382, float:1.847809E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.AnonymousClass3MX.A0Q(r9, r0)
            android.content.Context r2 = r4.getContext()
            r1 = 0
            r3 = 1
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r2, r3, r1)
            r4.setLayoutManager(r0)
            boolean r0 = r10.A0H
            if (r0 != 0) goto L_0x0055
            android.content.Context r0 = r4.getContext()
            X.BM3 r2 = new X.BM3
            r2.<init>(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131231104(0x7f080180, float:1.807828E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            if (r0 == 0) goto L_0x0052
            r2.A01 = r0
        L_0x0052:
            r4.A0r(r2)
        L_0x0055:
            r4.A0R = r3
            r10.A01 = r4
            r0 = 2131434385(0x7f0b1b91, float:1.8490582E38)
            android.view.View r0 = r9.findViewById(r0)
            X.AnonymousClass1HF.A0q(r0, r3)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A03(r7)
            X.1M9 r0 = r10.A04
            if (r0 == 0) goto L_0x015e
            X.1E7 r8 = r0.A0H(r1)
            X.12L r0 = r10.A09
            if (r0 == 0) goto L_0x015b
            boolean r0 = X.C42761yh.A01(r0, r1)
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0110
            android.content.Context r0 = r10.A14()
            java.lang.String r2 = X.AnonymousClass4GC.A00(r0)
            r1 = 2131898321(0x7f122fd1, float:1.9431556E38)
            java.lang.Object[] r0 = X.AnonymousClass3MX.A1b(r2, r5)
            java.lang.String r1 = X.AnonymousClass3MX.A16(r10, r2, r0, r3, r1)
        L_0x0090:
            X.C18070vi.A0b(r1)
            r0 = 2131428233(0x7f0b0389, float:1.8478105E38)
            android.view.View r3 = r9.findViewById(r0)
            com.whatsapp.FAQTextView r3 = (com.whatsapp.FAQTextView) r3
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x0103
            r3.setText(r1)
        L_0x00a3:
            r0 = 2131434518(0x7f0b1c16, float:1.8490852E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r10.A00 = r0
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A03(r7)
            X.12L r0 = r10.A09
            if (r0 == 0) goto L_0x015b
            boolean r0 = X.C42761yh.A01(r0, r1)
            if (r0 != 0) goto L_0x00ce
            android.os.Bundle r1 = r10.A15()
            java.lang.String r0 = "show_report_upsell"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x00ce
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            X.AnonymousClass3MY.A1B(r9, r0, r5)
        L_0x00ce:
            r0 = 2131428207(0x7f0b036f, float:1.8478052E38)
            com.whatsapp.wds.components.button.WDSButton r2 = X.AnonymousClass3MW.A0r(r9, r0)
            r10.A0F = r2
            java.lang.String r1 = "blockButton"
            if (r2 == 0) goto L_0x0154
            r0 = 4
            X.AnonymousClass3Ma.A1G(r2, r10, r7, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A0F
            if (r2 == 0) goto L_0x0154
            X.12L r1 = r10.A09
            if (r1 == 0) goto L_0x015b
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A03(r7)
            boolean r0 = X.C42761yh.A01(r1, r0)
            r2.setEnabled(r0)
            r0 = 38
            X.AkQ r1 = new X.AkQ
            r1.<init>(r10, r9, r7, r0)
            X.10I r0 = r10.A0E
            if (r0 == 0) goto L_0x0161
            r0.CGF(r1)
            r10.A0I = r1
            return r9
        L_0x0103:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            java.lang.String r1 = "chats"
            java.lang.String r0 = "controls-when-messaging-businesses"
            r3.setEducationTextFromNamedArticle(r2, r1, r0)
            goto L_0x00a3
        L_0x0110:
            boolean r0 = r10.A0H
            r4 = 2131898752(0x7f123180, float:1.943243E38)
            if (r0 == 0) goto L_0x011a
            r4 = 2131894884(0x7f122264, float:1.9424585E38)
        L_0x011a:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = r8.A0V
            if (r1 == 0) goto L_0x0129
            java.lang.String r0 = "ent:"
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            r2 = -1
            if (r0 == 0) goto L_0x014b
            java.lang.String r1 = r8.A0L()
            int r0 = r8.A0A
            if (r0 != r6) goto L_0x013d
            X.1Me r0 = r10.A05
            if (r0 == 0) goto L_0x0158
            java.lang.String r1 = X.AnonymousClass3MX.A17(r0, r8)
        L_0x013d:
            if (r1 == 0) goto L_0x014b
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x014b
        L_0x0145:
            java.lang.String r1 = X.AnonymousClass3MX.A16(r10, r1, r3, r5, r4)
            goto L_0x0090
        L_0x014b:
            X.1Me r0 = r10.A05
            if (r0 == 0) goto L_0x0158
            java.lang.String r1 = r0.A0U(r8, r2, r6)
            goto L_0x0145
        L_0x0154:
            X.C18070vi.A11(r1)
            goto L_0x0166
        L_0x0158:
            java.lang.String r0 = "waContactNames"
            goto L_0x0163
        L_0x015b:
            java.lang.String r0 = "infraABProps"
            goto L_0x0163
        L_0x015e:
            java.lang.String r0 = "contactManager"
            goto L_0x0163
        L_0x0161:
            java.lang.String r0 = "waWorkers"
        L_0x0163:
            X.C18070vi.A11(r0)
        L_0x0166:
            r0 = 0
            throw r0
        L_0x0168:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        AnonymousClass3XH r0 = this.A03;
        if (r0 != null) {
            bundle.putInt("selectedItem", r0.A00);
            AnonymousClass3XH r02 = this.A03;
            if (r02 == null) {
                C18070vi.A11("adapter");
                throw null;
            } else {
                bundle.putString("text", r02.A01.toString());
            }
        }
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        boolean z = A15().getBoolean("should_launch_home_activity");
        C18100vl r5 = this.A0J;
        AnonymousClass3MY.A1K(A1G(), ((BlockReasonListViewModel) r5.getValue()).A01, new C99204sR(bundle, this, 1), 7);
        AnonymousClass3MY.A1K(A1G(), ((BlockReasonListViewModel) r5.getValue()).A0B, new C99184sP(0, this, z), 7);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Dh, java.lang.Object] */
    public static final void A01(BlockReasonListFragment blockReasonListFragment, String str) {
        ? obj = new Object();
        BlockReasonListFragment blockReasonListFragment2 = blockReasonListFragment;
        obj.element = blockReasonListFragment.A15().getBoolean("show_success_toast");
        CheckBox checkBox = blockReasonListFragment.A00;
        if (checkBox == null) {
            C18070vi.A11("reportCheckbox");
        } else {
            boolean isChecked = checkBox.isChecked();
            boolean z = blockReasonListFragment.A15().getBoolean("should_delete_chat_post_block");
            String string = blockReasonListFragment2.A15().getString("entry_point");
            if (string != null) {
                AnonymousClass10I r0 = blockReasonListFragment2.A0E;
                if (r0 != null) {
                    r0.CGF(new C98634rT(blockReasonListFragment2, string, str, obj, isChecked, z));
                    return;
                }
                AnonymousClass3MW.A1G();
            } else {
                throw C17890vO.A0K();
            }
        }
        throw null;
    }

    public void A1s() {
        Runnable runnable = this.A0I;
        if (runnable != null) {
            AnonymousClass10I r0 = this.A0E;
            if (r0 != null) {
                r0.CEz(runnable);
            } else {
                AnonymousClass3MW.A1G();
                throw null;
            }
        }
        super.A1s();
    }

    public static final C27621Wu A00(BlockReasonListFragment blockReasonListFragment, boolean z) {
        String str;
        String str2;
        blockReasonListFragment.A1D().setResult(-1);
        AnonymousClass1FU r3 = (AnonymousClass1FU) C72453Mb.A0Z(blockReasonListFragment);
        C87904Xn r2 = blockReasonListFragment.A0C;
        if (r2 != null) {
            UserJid userJid = blockReasonListFragment.A0A;
            if (userJid == null) {
                str = "userJid";
            } else {
                if (blockReasonListFragment.A15().getBoolean("from_report_flow")) {
                    str2 = "report_block";
                } else {
                    CheckBox checkBox = blockReasonListFragment.A00;
                    if (checkBox == null) {
                        str = "reportCheckbox";
                    } else if (checkBox.isChecked()) {
                        str2 = "block_report";
                    } else {
                        str2 = "block";
                    }
                }
                r2.A00(r3, userJid, AnonymousClass4aU.A03(blockReasonListFragment.A15(), ""), str2, blockReasonListFragment.A15().getString("entry_point"), new C99104sH(r3, blockReasonListFragment, 1, z));
                return C27621Wu.A00;
            }
        } else {
            str = "shareReportOrBlockToMetaHelper";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        String string = A15().getString("jid");
        if (string != null) {
            C22941Dw r0 = UserJid.Companion;
            this.A0A = C22941Dw.A03(string);
            C18030ve r2 = this.A02;
            C18070vi.A0W(r2);
            this.A0H = C18020vd.A05(C18040vf.A02, r2, 6186);
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) this.A0J.getValue();
            UserJid userJid = this.A0A;
            if (userJid == null) {
                C18070vi.A11("userJid");
                throw null;
            } else {
                blockReasonListViewModel.A0C.CGF(new C21451AkI(blockReasonListViewModel, userJid, 3));
            }
        } else {
            throw C17890vO.A0K();
        }
    }
}

package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.profile.ViewProfilePhoto;
import com.whatsapp.quickcontact.QuickContactActivity;
import java.util.Collection;

public class AQ9 implements C23581Gv {
    public final int A00;
    public final Object A01;

    public AQ9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bmh(Collection collection) {
        if (3 - this.A00 == 0) {
            ((PaymentGroupParticipantPickerActivity) this.A01).A0E.notifyDataSetChanged();
        }
    }

    public /* synthetic */ void Bq0(Collection collection) {
        if (6 - this.A00 == 0) {
            QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
            QuickContactActivity.A0Q(quickContactActivity);
            A5G.A01(quickContactActivity);
        }
    }

    public /* synthetic */ void Bq1(Collection collection) {
        if (4 - this.A00 == 0) {
            ViewProfilePhoto.A03((ViewProfilePhoto) this.A01);
        }
    }

    public /* synthetic */ void Bq3(Collection collection) {
        if (6 - this.A00 == 0) {
            QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
            QuickContactActivity.A0Q(quickContactActivity);
            A5G.A01(quickContactActivity);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Brx(com.whatsapp.jid.UserJid r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x00c0;
                case 2: goto L_0x002a;
                case 3: goto L_0x0005;
                case 4: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r12.A01
            X.97G r2 = (X.AnonymousClass97G) r2
            X.1M9 r1 = r2.A04
            X.1E7 r0 = r2.A09
            X.1BI r0 = X.C72463Mc.A0g(r0)
            X.1E7 r0 = r1.A0H(r0)
            r2.A09 = r0
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0005
            X.1Me r1 = r2.A05
            X.1E7 r0 = r2.A09
            java.lang.String r0 = r1.A0I(r0)
            r2.A43(r0)
            return
        L_0x002a:
            java.lang.Object r1 = r12.A01
            X.91R r1 = (X.AnonymousClass91R) r1
            com.whatsapp.jid.UserJid r0 = r1.A0F
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0005
            r1.A5M()
            return
        L_0x003a:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r5 = r12.A01
            com.whatsapp.biz.cart.view.fragment.CartFragment r5 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r5
            com.whatsapp.biz.cart.view.fragment.CartFragment.A04(r5)
            boolean r0 = r5.A11
            if (r0 == 0) goto L_0x0005
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0c
            if (r0 == 0) goto L_0x0005
            java.lang.String r4 = r0.getStringText()
            if (r4 == 0) goto L_0x0005
            int r3 = r4.length()
            r0 = 1
            int r3 = r3 - r0
            r2 = 0
            r1 = 0
        L_0x005b:
            if (r2 > r3) goto L_0x0073
            r0 = r3
            if (r1 != 0) goto L_0x0061
            r0 = r2
        L_0x0061:
            boolean r0 = X.C109005cf.A0u(r4, r0)
            if (r1 != 0) goto L_0x006e
            if (r0 != 0) goto L_0x006b
            r1 = 1
            goto L_0x005b
        L_0x006b:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x006e:
            if (r0 == 0) goto L_0x0073
            int r3 = r3 + -1
            goto L_0x005b
        L_0x0073:
            java.lang.String r10 = X.C108985cd.A0g(r3, r2, r4)
            if (r10 == 0) goto L_0x0005
            X.8G8 r8 = r5.A2K()
            X.8Hz r7 = r5.A0J
            if (r7 != 0) goto L_0x0088
            java.lang.String r0 = "cartItemsAdapter"
        L_0x0083:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0088:
            X.1FL r6 = r5.A1D()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C18070vi.A0z(r6, r0)
            X.01E r6 = (X.AnonymousClass01E) r6
            X.A2v r9 = r5.A0O
            if (r9 != 0) goto L_0x009a
            java.lang.String r0 = "catalogLoadSession"
            goto L_0x0083
        L_0x009a:
            r0 = 3
            X.C18070vi.A0d(r6, r0)
            com.whatsapp.jid.UserJid r2 = r8.A0O
            boolean r0 = r13.equals(r2)
            if (r0 == 0) goto L_0x0005
            X.1PM r0 = r8.A0L
            X.1yf r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x00b4
            java.lang.String r11 = r0.A08
        L_0x00b0:
            X.AnonymousClass8G8.A00(r6, r7, r8, r9, r10, r11)
            return
        L_0x00b4:
            X.1Me r1 = r8.A0M
            X.1E7 r0 = new X.1E7
            r0.<init>(r2)
            java.lang.String r11 = r1.A0I(r0)
            goto L_0x00b0
        L_0x00c0:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            X.AnonymousClass8BY.A1F(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQ9.Brx(com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
        if (r5.A07 != -1) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        if (r5.A07 == 0) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void C1w(X.AnonymousClass1BI r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            r8 = r14
            switch(r0) {
                case 1: goto L_0x00fb;
                case 2: goto L_0x00de;
                case 3: goto L_0x0006;
                case 4: goto L_0x0035;
                case 5: goto L_0x001f;
                case 6: goto L_0x00ee;
                case 7: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.Object r1 = r13.A01
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            X.1E7 r0 = r1.A0Y
            if (r0 == 0) goto L_0x0006
            X.11S r0 = r1.A02
            boolean r0 = r0.A0O(r14)
            if (r0 == 0) goto L_0x0006
            com.whatsapp.registration.RegisterName.A0r(r1)
            return
        L_0x001f:
            java.lang.Object r3 = r13.A01
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r3 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r3
            com.whatsapp.jid.UserJid r0 = r3.A0I
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0006
            X.1pZ r2 = r3.A09
            X.1E7 r1 = r3.A0F
            android.widget.ImageView r0 = r3.A01
            r2.A07(r0, r1)
            return
        L_0x0035:
            java.lang.Object r6 = r13.A01
            com.whatsapp.profile.ViewProfilePhoto r6 = (com.whatsapp.profile.ViewProfilePhoto) r6
            X.1M9 r2 = r6.A04
            X.1E7 r0 = r6.A09
            java.lang.Class<X.1BI> r1 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r0.A06(r1)
            X.C17960vV.A07(r0)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r0 = r2.A0H(r0)
            r6.A09 = r0
            com.whatsapp.jid.Jid r0 = r0.A06(r1)
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0006
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ViewProfilePhoto/onprofilephotochanged photo_full_id:"
            r2.append(r0)
            X.1E7 r1 = r6.A09
            int r0 = r1.A07
            r2.append(r0)
            java.lang.String r0 = " thumb_full_id:"
            r2.append(r0)
            int r0 = r1.A08
            X.C17900vP.A0o(r2, r0)
            X.17x r1 = r6.A08
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0K(r0)
            android.os.Handler r2 = r6.A0F
            r12 = 0
            r2.removeMessages(r12)
            if (r0 == 0) goto L_0x0097
            X.1E7 r0 = r6.A09
            int r10 = r0.A07
            if (r10 != 0) goto L_0x0097
            X.1Ui r7 = r6.A07
            java.lang.String r9 = "ViewProfilePhoto.onProfilePhotoChanged"
            r11 = 1
            r7.A03(r8, r9, r10, r11, r12)
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.sendEmptyMessageDelayed(r12, r0)
        L_0x0097:
            com.whatsapp.profile.ViewProfilePhoto.A0Q(r6)
            r6.invalidateOptionsMenu()
            X.1E7 r5 = r6.A09
            int r4 = r5.A08
            r3 = 1
            r2 = -1
            if (r4 != r2) goto L_0x00aa
            int r0 = r5.A07
            r1 = 1
            if (r0 == r2) goto L_0x00dc
        L_0x00aa:
            r1 = 0
            if (r4 != 0) goto L_0x00dc
            int r0 = r5.A07
            if (r0 != 0) goto L_0x00dc
        L_0x00b1:
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x0006
            r6.A0E = r12
            if (r1 == 0) goto L_0x00cb
            X.1KB r2 = r6.A05
            boolean r0 = r5.A0F()
            r1 = 2131894802(0x7f122212, float:1.942442E38)
            if (r0 == 0) goto L_0x00c7
            r1 = 2131890999(0x7f121337, float:1.9416706E38)
        L_0x00c7:
            r2.A08(r1, r12)
            return
        L_0x00cb:
            if (r3 == 0) goto L_0x0006
            X.1KB r2 = r6.A05
            boolean r0 = r5.A0F()
            r1 = 2131894803(0x7f122213, float:1.9424421E38)
            if (r0 == 0) goto L_0x00c7
            r1 = 2131891000(0x7f121338, float:1.9416708E38)
            goto L_0x00c7
        L_0x00dc:
            r3 = 0
            goto L_0x00b1
        L_0x00de:
            java.lang.Object r1 = r13.A01
            X.91R r1 = (X.AnonymousClass91R) r1
            com.whatsapp.jid.UserJid r0 = r1.A0F
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0006
            r1.A5M()
            return
        L_0x00ee:
            java.lang.Object r0 = r13.A01
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            com.whatsapp.quickcontact.QuickContactActivity.A0Q(r0)
            X.A5G r0 = r0.A0d
            r0.A04()
            return
        L_0x00fb:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.Object r0 = r13.A01
            X.AnonymousClass8BY.A1F(r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQ9.C1w(X.1BI):void");
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r5) {
        switch (this.A00) {
            case 2:
                AnonymousClass91R r1 = (AnonymousClass91R) this.A01;
                if (r5.equals(r1.A0F)) {
                    r1.A5M();
                    return;
                }
                return;
            case 4:
                AnonymousClass97G r3 = (AnonymousClass97G) this.A01;
                AnonymousClass1M9 r2 = r3.A04;
                Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
                Jid A06 = r3.A09.A06(cls);
                C17960vV.A07(A06);
                AnonymousClass1E7 A0H = r2.A0H((AnonymousClass1BI) A06);
                r3.A09 = A0H;
                if (r5.equals(A0H.A06(cls))) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("ViewProfilePhoto/onProfilePhotoStartChanging photo_full_id:");
                    AnonymousClass1E7 r12 = r3.A09;
                    A10.append(r12.A07);
                    A10.append(" thumb_full_id:");
                    C17900vP.A0o(A10, r12.A08);
                    if (r3.A0D) {
                        r3.A0D = false;
                        return;
                    } else {
                        r3.A0E = true;
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public /* synthetic */ void Bkk(UserJid userJid) {
    }

    public /* synthetic */ void Bm3() {
    }

    public /* synthetic */ void Bpv() {
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void Bq4(Collection collection) {
    }

    public /* synthetic */ void BtU(UserJid userJid) {
    }
}

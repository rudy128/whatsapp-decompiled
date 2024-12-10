package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3sl  reason: invalid class name and case insensitive filesystem */
public class C78413sl extends AnonymousClass3uP {
    public boolean A00;
    public final AnonymousClass1FU A01;
    public final C72073Kn A02 = new C92914i7(this, 3);
    public final SharePhoneNumberRowViewModel A03;
    public final AnonymousClass1BI A04;

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    private C202611l getSharePhoneNumberBridge() {
        return (C202611l) ((C219117w) this.A1s.get()).A01(C202611l.class);
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
        }
    }

    public C78413sl(Context context, C108875cR r8, C443022x r9) {
        super(context, r8, r9);
        A1M();
        setLongClickable(false);
        AnonymousClass1FU r0 = (AnonymousClass1FU) AnonymousClass1L9.A01(context, AnonymousClass1FU.class);
        this.A01 = r0;
        this.A03 = (SharePhoneNumberRowViewModel) new C24071It(r0).A00(SharePhoneNumberRowViewModel.class);
        AnonymousClass205 r1 = r9.A0v;
        this.A04 = r1.A00;
        setVisibility(8);
        AnonymousClass1BI r5 = this.A04;
        if (r5 != null) {
            boolean z = r1.A02;
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A03;
            C41731wy r3 = new C41731wy();
            C98714rb.A00(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r5, r3, 27);
            r3.A0A(this.A01, new C91484fl(1, this, z));
            if (!z) {
                setUpShareCta(r5);
            }
        }
    }

    public static void A00(C78413sl r3, AnonymousClass1BI r4) {
        r3.getSharePhoneNumberBridge();
        C18070vi.A0d(r4, 0);
        r3.A01.CMk(AnonymousClass4G6.A00(r4, 5), "SharePhoneNumberBottomSheet");
    }

    private void setUpShareCta(AnonymousClass1BI r5) {
        View A06 = AnonymousClass1HF.A06(getRootView(), 2131434602);
        C22941Dw r0 = UserJid.Companion;
        A06.setOnClickListener(new AnonymousClass48j(C22941Dw.A01(r5), r5, this, 16));
    }

    public int getMainChildMaxWidth() {
        if (A1b() || !getFMessage().A0v.A02) {
            return getResources().getDimensionPixelSize(2131168715);
        }
        return 0;
    }

    public int getCenteredLayoutId() {
        return 2131624917;
    }

    public int getIncomingLayoutId() {
        return 2131624917;
    }

    public int getOutgoingLayoutId() {
        return 2131624918;
    }
}

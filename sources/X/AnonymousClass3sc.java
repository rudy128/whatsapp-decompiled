package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;

/* renamed from: X.3sc  reason: invalid class name */
public class AnonymousClass3sc extends AnonymousClass3uP {
    public TextView A00;
    public boolean A01;
    public final AnonymousClass1FU A02;
    public final SharePhoneNumberRowViewModel A03;

    public boolean A1b() {
        return true;
    }

    public boolean A2Z() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    private C202411j getPhoneNumberSharedBridge() {
        return (C202411j) ((C219117w) this.A1s.get()).A01(C202411j.class);
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
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

    public AnonymousClass3sc(Context context, C108875cR r9, C443222z r10) {
        super(context, r9, r10);
        A1M();
        AnonymousClass1FU r0 = (AnonymousClass1FU) AnonymousClass1L9.A01(context, AnonymousClass1FU.class);
        this.A02 = r0;
        this.A03 = (SharePhoneNumberRowViewModel) new C24071It(r0).A00(SharePhoneNumberRowViewModel.class);
        AnonymousClass205 r02 = r10.A0v;
        boolean z = r02.A02;
        AnonymousClass1BI r4 = r02.A00;
        setBackground((Drawable) null);
        setLongClickable(false);
        if (r4 != null) {
            if (z) {
                SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A03;
                C41731wy r3 = new C41731wy();
                C98714rb.A00(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r4, r3, 25);
                r3.A0A(this.A02, new C26618D6m(this, 3));
            } else if (C22971Dz.A0d(r4)) {
                setOnClickListener(new C90074dU(this, r4, 33));
            }
        }
        TextView A0J = AnonymousClass3MW.A0J(this, 2131431625);
        this.A00 = A0J;
        if (z) {
            A0J.setText(2131894659);
            setVisibility(0);
        } else if (r4 != null) {
            setVisibility(8);
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel2 = this.A03;
            C41731wy r32 = new C41731wy();
            C98714rb.A00(sharePhoneNumberRowViewModel2.A04, sharePhoneNumberRowViewModel2, r4, r32, 27);
            r32.A0A(this.A02, new C26618D6m(this, 2));
        }
    }

    public /* synthetic */ void A2i(C80073wV r4) {
        getPhoneNumberSharedBridge();
        this.A02.CMk(AnonymousClass4G5.A00(r4.A00, r4.A01), "ConversationRowSharePhoneNumber");
    }

    public int getCenteredLayoutId() {
        return 2131626947;
    }

    public int getIncomingLayoutId() {
        return 2131626947;
    }

    public int getOutgoingLayoutId() {
        return 2131626947;
    }
}

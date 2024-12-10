package X;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.8nQ  reason: invalid class name */
public class AnonymousClass8nQ extends AnonymousClass8nR {
    public AnonymousClass118 A00;
    public AnonymousClass1QO A01;
    public AnonymousClass1QS A02;
    public AnonymousClass1R2 A03;
    public C26611Su A04;
    public C187339fe A05;
    public final FrameLayout A06;
    public final ImageView A07;
    public final TextEmojiLabel A08 = AnonymousClass3MX.A0W(this, 2131431112);
    public final TextEmojiLabel A09 = AnonymousClass3MX.A0V(this, 2131431800);
    public final AQ0 A0A;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private void A00() {
        this.A09.setText(getInviteContext());
        C187339fe r5 = this.A05;
        Object obj = new Object();
        AQ0 aq0 = this.A0A;
        if (new C184389as(2, obj).A01 != null) {
            aq0.A00.setImageResource(2131232788);
        }
        if (r5 != null) {
            AnonymousClass1R2 r6 = r5.A03;
            Context context = r5.A01.A00;
            AnonymousClass26n A0M = r6.A0M(context, AnonymousClass1KL.A0B, AnonymousClass1YL.A00(context, 2130970011, 2131101102), 2131168220);
            ImageView imageView = this.A07;
            imageView.setVisibility(0);
            imageView.setImageDrawable(A0M);
        }
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel != null) {
            if (this.A01.A03() && r5 != null) {
                AnonymousClass206 fMessage = getFMessage();
                if (!r5.A02.A0F()) {
                    Intent A042 = AnonymousClass8BS.A04(r5.A01.A00);
                    A042.putExtra("extra_setup_mode", 2);
                    A042.putExtra("extra_payments_entry_type", 2);
                    A042.putExtra("extra_is_first_payment_method", true);
                    A042.putExtra("extra_skip_value_props_display", false);
                    AnonymousClass1BI r1 = fMessage.A0v.A00;
                    if (r1 instanceof GroupJid) {
                        r1 = fMessage.A0H();
                    }
                    String A062 = C22971Dz.A06(r1);
                    A042.putExtra("extra_jid", A062);
                    A042.putExtra("extra_inviter_jid", A062);
                    C60442o2.A00(A042, r5.A00, "acceptInvite");
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.setOnClickListener(new C90074dU(this, A042, 22));
                    return;
                }
            }
            textEmojiLabel.setVisibility(8);
        }
    }

    public AnonymousClass8nQ(Context context, C108875cR r7, AnonymousClass206 r8) {
        super(context, r7, r8);
        A1M();
        FrameLayout A0P = C108945cZ.A0P(this, 2131433514);
        this.A06 = A0P;
        this.A07 = AnonymousClass3MW.A0G(this, 2131433499);
        ViewStub viewStub = (ViewStub) AnonymousClass1HF.A06(this, 2131433560);
        A0P.setForeground(getInnerFrameForegroundDrawable());
        if (this.A01.A03()) {
            this.A05 = this.A02.A06().BWj();
        }
        C187339fe r0 = this.A05;
        AnonymousClass118 r3 = this.A00;
        AnonymousClass10I r2 = this.A1X;
        C26611Su r1 = this.A04;
        if (r0 != null) {
            C18070vi.A0o(r3, r2, r1);
        }
        AQ0 aq0 = new AQ0(r3, r1, r2);
        this.A0A = aq0;
        AnonymousClass9Q1.A00(viewStub, aq0);
        A00();
    }

    private CharSequence getInviteContext() {
        AnonymousClass206 fMessage = getFMessage();
        AnonymousClass1R2 r5 = this.A03;
        Context context = getContext();
        AnonymousClass205 r0 = fMessage.A0v;
        boolean z = r0.A02;
        AnonymousClass1BI r2 = r0.A00;
        C17960vV.A07(r2);
        String A0O = r5.A02.A0O(r5.A01.A0H(r2));
        if (r5.A09.A03()) {
            r5.A0A.A06();
        }
        int i = 2131893648;
        if (z) {
            i = 2131893649;
        }
        String A0j = C72473Md.A0j(context, A0O, i);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(A0j);
        int indexOf = A0j.indexOf(A0O);
        getContext();
        A092.setSpan(new C22628BGo(), indexOf, A0O.length() + indexOf, 0);
        return A092;
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public int getCenteredLayoutId() {
        return 2131624894;
    }

    public int getIncomingLayoutId() {
        return 2131624894;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A06);
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return 2131624895;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.conversation.conversationrow.components.contextcard.AddMembersButton$onAttachedToWindow$1$1;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4C5  reason: invalid class name */
public final class AnonymousClass4C5 extends WDSButton implements AnonymousClass5ZD {
    public final int A00;
    public final C32101gd A01;
    public final C40371ub A02;
    public final AnonymousClass5XL A03;
    public final AnonymousClass1EC A04;
    public final AnonymousClass1EC A05;
    public final C436420i A06;
    public final AnonymousClass10I A07;
    public final boolean A08;
    public final Context A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new C102425Gk(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4C5(Context context, C32101gd r4, C40371ub r5, AnonymousClass5XL r6, AnonymousClass1EC r7, AnonymousClass1EC r8, C436420i r9, AnonymousClass10I r10, int i, boolean z) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(r5, r4, r10);
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r4;
        this.A07 = r10;
        this.A09 = context;
        this.A06 = r9;
        this.A04 = r7;
        this.A05 = r8;
        this.A08 = z;
        this.A00 = i;
        setVariant(C27881Xz.OUTLINE);
        setText(2131895360);
        setFocusable(true);
        setIcon(2131232178);
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final C161548Fr getViewModel() {
        return (C161548Fr) this.A0A.getValue();
    }

    public List getCTAViews() {
        if (this.A05 != null || !this.A08) {
            return C18070vi.A0M(this);
        }
        return C18460wS.A00;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity A012 = AnonymousClass1L9.A01(this.A09, AnonymousClass1FY.class);
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null) {
            AnonymousClass3MX.A1Q(new AddMembersButton$onAttachedToWindow$1$1(A002, this, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        }
        C90074dU.A00(this, A012, 43);
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.conversation.conversationrow.components.contextcard.InviteViaLinkButton$onAttachedToWindow$1$1;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6Ph  reason: invalid class name */
public final class AnonymousClass6Ph extends WDSButton {
    public final C1595384x A00;
    public final AnonymousClass4SV A01;
    public final AnonymousClass1EC A02;
    public final Context A03;
    public final C81723zh A04;
    public final AnonymousClass1EC A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C149627jM(this));

    private final void setupOnClick(AnonymousClass1BI r8, AnonymousClass1FU r9, C81723zh r10, AnonymousClass1EC r11) {
        AnonymousClass1FU r1 = r9;
        C81723zh r2 = r10;
        AnonymousClass1EC r3 = r11;
        setOnClickListener(new AnonymousClass6LH(r1, r2, r3, r8, this, 3));
    }

    /* access modifiers changed from: private */
    public final C111145iQ getViewModel() {
        return (C111145iQ) this.A06.getValue();
    }

    public static /* synthetic */ void setupOnClick$default(AnonymousClass6Ph r1, AnonymousClass1BI r2, AnonymousClass1FU r3, C81723zh r4, AnonymousClass1EC r5, int i, Object obj) {
        if ((i & 8) != 0) {
            r5 = null;
        }
        r1.setupOnClick(r2, r3, r4, r5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6Ph(Context context, C1595384x r3, C81723zh r4, AnonymousClass4SV r5, AnonymousClass1EC r6, AnonymousClass1EC r7) {
        super(context, (AttributeSet) null);
        C18070vi.A0j(r5, r3);
        this.A01 = r5;
        this.A00 = r3;
        this.A03 = context;
        this.A02 = r6;
        this.A04 = r4;
        this.A05 = r7;
        setVariant(C27881Xz.OUTLINE);
        setText(2131891497);
        setIcon(2131232044);
        setupOnClick(r6, AnonymousClass3MZ.A0P(context), r4, r7);
    }

    public final AnonymousClass1EC getGroupJid() {
        return this.A02;
    }

    public final AnonymousClass1EC getLinkedParentGroupJid() {
        return this.A05;
    }

    public final C81723zh getWamGroupInfo() {
        return this.A04;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupOnClick(this.A02, AnonymousClass3MZ.A0P(this.A03), this.A04, this.A05);
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
        if (A002 != null) {
            AnonymousClass3MX.A1Q(new InviteViaLinkButton$onAttachedToWindow$1$1(A002, this, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        }
    }
}

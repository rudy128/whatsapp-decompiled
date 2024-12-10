package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.BwW  reason: case insensitive filesystem */
public final class C24163BwW extends WDSButton implements AnonymousClass5ZD {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final C28527E6b A03;
    public final C107445Zs A04;
    public final C85944Pm A05;
    public final AnonymousClass1EC A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C27738DkK(this));

    /* access modifiers changed from: private */
    public final GroupDescriptionAddUpsellViewModel getViewModel() {
        return (GroupDescriptionAddUpsellViewModel) this.A07.getValue();
    }

    public void A06() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E r1 = AnonymousClass3MY.A0O(this).A10;
            C63492tA.A01((AnonymousClass19D) r1.A02.get(), this);
            C63492tA.A02(AnonymousClass10E.A8q(r1), this);
            C63492tA.A03((AnonymousClass1DC) r1.A95.get(), this);
            C63492tA.A00(AnonymousClass10E.A6R(r1), this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24163BwW(Context context, AnonymousClass1KB r6, C28527E6b e6b, C107445Zs r8, C85944Pm r9, AnonymousClass1EC r10) {
        super(context, (AttributeSet) null);
        C18070vi.A0s(r6, r9, e6b, r8);
        A06();
        this.A02 = r6;
        this.A05 = r9;
        this.A03 = e6b;
        this.A04 = r8;
        this.A01 = context;
        this.A06 = r10;
        setVariant(C27881Xz.OUTLINE);
        setText(2131888925);
        AnonymousClass1FB r3 = (AnonymousClass1FB) AnonymousClass1L9.A01(context, AnonymousClass1FY.class);
        C26623D6r.A00(r3, getViewModel().A00, new C27997DpY(this), 2);
        C26623D6r.A00(r3, getViewModel().A01, new C27998DpZ(this), 2);
        setOnClickListener(new C825048f(this, 25));
    }

    /* access modifiers changed from: private */
    public final void setNewDescription(String str) {
        GroupDescriptionAddUpsellViewModel viewModel = getViewModel();
        if (str == null) {
            str = "";
        }
        AnonymousClass3MW.A1X(viewModel.A05, new GroupDescriptionAddUpsellViewModel$setDescriptionNewValue$1(viewModel, str, (C30391dr) null), C41561wd.A00(viewModel));
    }

    public List getCTAViews() {
        return C18070vi.A0M(this);
    }
}

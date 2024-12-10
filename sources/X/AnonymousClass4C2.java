package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4C2  reason: invalid class name */
public final class AnonymousClass4C2 extends WDSButton implements AnonymousClass5ZD {
    public final AnonymousClass1Q1 A00;
    public final AnonymousClass18K A01;
    public final C24901Mc A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4C2(Context context, AnonymousClass1Q1 r3, AnonymousClass18K r4, AnonymousClass1EC r5, C24901Mc r6) {
        super(context, (AttributeSet) null);
        C18070vi.A0o(r4, r6, r3);
        this.A01 = r4;
        this.A02 = r6;
        this.A00 = r3;
        setAction(AnonymousClass4DG.NORMAL);
        setVariant(C27881Xz.OUTLINE);
        setText(2131891090);
        setIcon(2131231797);
        C90074dU.A00(this, r5, 46);
    }

    public List getCTAViews() {
        return C18070vi.A0M(this);
    }
}

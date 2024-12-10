package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4C3  reason: invalid class name */
public final class AnonymousClass4C3 extends WDSButton implements AnonymousClass5ZD {
    public final Context A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1EC A02;
    public final AnonymousClass1LU A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4C3(Context context, AnonymousClass11P r4, AnonymousClass1LU r5, AnonymousClass1EC r6) {
        super(context, (AttributeSet) null);
        C18070vi.A0j(r4, r5);
        this.A01 = r4;
        this.A03 = r5;
        this.A00 = context;
        this.A02 = r6;
        setVariant(C27881Xz.OUTLINE);
        setText(2131888924);
        setIcon(2131232016);
        setOnClickListener(new C89914dE(this, 17));
    }

    public List getCTAViews() {
        return C18070vi.A0M(this);
    }
}

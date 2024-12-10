package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.fmx.Hilt_FMXGroupSafetyTipsBottomSheetFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4C4  reason: invalid class name */
public final class AnonymousClass4C4 extends WDSButton implements AnonymousClass5ZD {
    public final C436420i A00;
    public final AnonymousClass18K A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4C4(Context context, AnonymousClass18K r6, C436420i r7) {
        super(context, (AttributeSet) null);
        String str;
        C18070vi.A0d(r6, 1);
        this.A01 = r6;
        this.A00 = r7;
        setVariant(C27881Xz.BORDERLESS);
        setText(2131890471);
        setIcon(2131233405);
        AnonymousClass1BI r2 = this.A00.A0v.A00;
        if (r2 == null) {
            str = "SafetyToolsButton/bind Null chat jid";
            C17960vV.A0F(false, str);
        } else if (AnonymousClass3MW.A0i(r2) == null) {
            C17960vV.A0F(false, "SafetyToolsButton/Not group jid");
            str = "SafetyToolsButton/bind Not group jid";
        } else {
            setOnClickListener(new AnonymousClass78A(this, r2, C72453Mb.A0L(this), 1));
            return;
        }
        Log.e(str);
    }

    public static final void setOnClick$lambda$0(AnonymousClass4C4 r3, AnonymousClass1BI r4, AnonymousClass1FY r5, View view) {
        C18070vi.A0e(r3, 0, r5);
        AnonymousClass4ZP.A00(r3.A03, r3.A01, r4, 0, 0);
        Hilt_FMXGroupSafetyTipsBottomSheetFragment hilt_FMXGroupSafetyTipsBottomSheetFragment = new Hilt_FMXGroupSafetyTipsBottomSheetFragment();
        hilt_FMXGroupSafetyTipsBottomSheetFragment.A2C(r5.getSupportFragmentManager(), C17890vO.A0U(hilt_FMXGroupSafetyTipsBottomSheetFragment));
    }

    public List getCTAViews() {
        return C18070vi.A0M(this);
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.SupportAiActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5Sw  reason: invalid class name and case insensitive filesystem */
public final class C105665Sw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SupportAiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105665Sw(SupportAiActivity supportAiActivity) {
        super(1);
        this.this$0 = supportAiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SupportAiActivity/showFallbackEmailDialog");
        View inflate = View.inflate(this.this$0, 2131625805, (ViewGroup) null);
        WaTextView A0U = AnonymousClass3MW.A0U(inflate, 2131432675);
        View findViewById = inflate.findViewById(2131428609);
        C73203Rj A00 = AnonymousClass4a6.A00(this.this$0);
        A00.A0c(inflate);
        A00.A0T(true);
        A00.A0G(new C88794an(this.this$0, 8));
        C010105w A0L = AnonymousClass3MY.A0L(A00);
        SupportAiActivity supportAiActivity = this.this$0;
        C36401np r3 = supportAiActivity.A02;
        if (r3 != null) {
            A0U.setText(r3.A05(supportAiActivity, new C146447Pd(supportAiActivity, 10), supportAiActivity.getString(2131892096), "contact-with-email"));
            C72473Md.A1D(A0U);
            C90014dO.A00(findViewById, A0L, this.this$0, 48);
            A0L.show();
            AnonymousClass00H r0 = this.this$0.A03;
            if (r0 != null) {
                ((C35541mP) C18070vi.A0E(r0)).A02(17, (String) null);
                return C27621Wu.A00;
            }
            C18070vi.A11("supportLogger");
            throw null;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }
}

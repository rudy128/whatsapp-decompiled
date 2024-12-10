package X;

import android.widget.TextView;
import com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsActivity;

/* renamed from: X.7yG  reason: invalid class name */
public final class AnonymousClass7yG extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ImagineMeSettingsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yG(ImagineMeSettingsActivity imagineMeSettingsActivity) {
        super(1);
        this.this$0 = imagineMeSettingsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        TextView textView = (TextView) this.this$0.A06.getValue();
        ImagineMeSettingsActivity imagineMeSettingsActivity = this.this$0;
        int A03 = AnonymousClass3MY.A03((Number) obj);
        C36531o3 r1 = imagineMeSettingsActivity.A01;
        if (r1 != null) {
            String A00 = r1.A00("1892120137920091");
            C36401np r5 = imagineMeSettingsActivity.A03;
            if (r5 != null) {
                textView.setText(r5.A04(imagineMeSettingsActivity, imagineMeSettingsActivity.getString(A03), (Runnable[]) null, new String[]{"learn-more"}, new String[]{A00}));
                return C27621Wu.A00;
            }
            str = "linkifier";
        } else {
            str = "contextualHelpHandler";
        }
        C18070vi.A11(str);
        throw null;
    }
}

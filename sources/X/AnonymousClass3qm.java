package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3qm  reason: invalid class name */
public abstract class AnonymousClass3qm extends AnonymousClass3gf {
    public C19880zA A00;
    public C25491Ok A01;
    public C25161Nd A02;
    public AnonymousClass00H A03;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    public void A4z(AnonymousClass4SL r4, AnonymousClass1E7 r5) {
        boolean A15 = C18070vi.A15(r4, r5);
        C25491Ok r1 = this.A01;
        if (r1 != null) {
            UserJid A0x = AnonymousClass3MZ.A0x(r5);
            if (A0x == null || !r1.A00(A0x)) {
                super.A4z(r4, r5);
                return;
            }
            if (r5.A0y) {
                super.BEb(r5);
            }
            TextEmojiLabel textEmojiLabel = r4.A03;
            textEmojiLabel.setSingleLine(A15);
            textEmojiLabel.setMaxLines(2);
            r4.A00("You can't add this business to a Broadcast list.", A15, 1);
            return;
        }
        C18070vi.A11("businessCoexUtils");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0M(2131892481);
        }
        if (bundle == null && !AnonymousClass3MX.A1W(this.A0E) && !C72463Mc.A1W(this.A0L)) {
            C72453Mb.A15(this, 2131894313, 2131894312);
        }
    }
}

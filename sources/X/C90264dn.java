package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.4dn  reason: invalid class name and case insensitive filesystem */
public final class C90264dn implements View.OnLongClickListener {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11C A01;
    public final String A02;

    public boolean onLongClick(View view) {
        ClipboardManager A09;
        String str = this.A02;
        if (!(str == null || (A09 = this.A01.A09()) == null)) {
            try {
                A09.setPrimaryClip(ClipData.newPlainText(str, str));
                this.A00.A08(2131894510, 0);
                return true;
            } catch (NullPointerException | SecurityException e) {
                Log.e("contactinfo/copy", e);
                this.A00.A08(2131897878, 0);
            }
        }
        return true;
    }

    public C90264dn(AnonymousClass1KB r1, AnonymousClass11C r2, String str) {
        C72473Md.A1I(r1, r2);
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}

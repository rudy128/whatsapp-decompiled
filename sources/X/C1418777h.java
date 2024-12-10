package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.77h  reason: invalid class name and case insensitive filesystem */
public class C1418777h implements InputFilter {
    public final int A00;
    public final Object A01;

    public C1418777h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass74M r0;
        switch (this.A00) {
            case 0:
                String obj = spanned.toString();
                StringBuilder sb = new StringBuilder(obj);
                sb.replace(i3, i4, charSequence.toString());
                if (!AnonymousClass000.A1Y(((AnonymousClass1OS) this.A01).invoke(obj, C18070vi.A0H(sb)))) {
                    return spanned.subSequence(i3, i4);
                }
                return null;
            case 1:
                r0 = ((PopupNotification) this.A01).A15;
                break;
            default:
                r0 = ((MessageReplyActivity) this.A01).A14;
                if (r0 == null) {
                    return null;
                }
                break;
        }
        if (r0.A0J != null) {
            return "";
        }
        return null;
    }
}

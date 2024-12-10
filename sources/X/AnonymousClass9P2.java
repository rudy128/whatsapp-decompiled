package X;

import android.os.Bundle;
import com.whatsapp.WaMessageDialogFragment;
import com.whatsapp.base.WaDialogFragment;

/* renamed from: X.9P2  reason: invalid class name */
public abstract class AnonymousClass9P2 {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.WaMessageDialogFragment, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.Fragment] */
    public static final WaMessageDialogFragment A00(AnonymousClass1GP r12, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Object[] objArr, int i) {
        Integer num5 = num;
        Integer num6 = num2;
        String str3 = str2;
        String str4 = str;
        if (num == null && num2 == null) {
            if (str2 == null) {
                throw AnonymousClass000.A0n("A message dialog must have either the title or message set.");
            }
        } else if (!(str2 == null || num2 == null)) {
            throw AnonymousClass000.A0n("A message dialog can't have a messageString and messageStringRes, only one or the other");
        }
        ? waDialogFragment = new WaDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("message_dialog_parameters", new C20273AEg(num5, num6, num3, num4, str4, str3, objArr, i));
        waDialogFragment.A1R(A0D);
        if (r12 != null) {
            if (str == null) {
                str4 = C108985cd.A0f();
            }
            waDialogFragment.A2F(r12, str4);
        }
        return waDialogFragment;
    }
}

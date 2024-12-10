package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2s8  reason: invalid class name and case insensitive filesystem */
public abstract class C62872s8 {
    public static int A00(AnonymousClass206 r1) {
        if (r1 instanceof C442222p) {
            return 1;
        }
        if (r1 instanceof C442022n) {
            return ((C442022n) r1).A17().size();
        }
        if (!A3I.A02(r1)) {
            return 0;
        }
        C438921i r12 = (C438921i) r1;
        C62572rc r0 = r12.A02;
        if (r0 != null) {
            return r0.A01;
        }
        return r12.A00;
    }

    public static List A02(AnonymousClass206 r3, C34481kY r4) {
        File file;
        if (r3 instanceof C442222p) {
            return Collections.singletonList(((C442222p) r3).A17());
        }
        if (r3 instanceof C442022n) {
            return ((C442022n) r3).A17();
        }
        if (A3I.A02(r3) && (file = AnonymousClass206.A00((AnonymousClass21V) r3).A0G) != null) {
            try {
                return AnonymousClass72d.A01(r4.A01(Uri.fromFile(file)));
            } catch (IOException e) {
                Log.e("vcardloader/splitvcards/exception", e);
            }
        }
        return null;
    }

    public static String A01(Context context, AnonymousClass206 r3) {
        if (!A3I.A02(r3)) {
            return null;
        }
        String A19 = ((AnonymousClass21V) r3).A19();
        if (TextUtils.isEmpty(A19)) {
            return context.getString(2131889020);
        }
        return C64062u9.A0A(A19);
    }
}

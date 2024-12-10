package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.conversation.selectlist.Hilt_SelectListBottomSheet;

/* renamed from: X.4lH  reason: invalid class name and case insensitive filesystem */
public final class C94844lH implements AnonymousClass5ZX {
    public final AnonymousClass1KB A00;

    public C94844lH(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.conversation.selectlist.Hilt_SelectListBottomSheet, com.whatsapp.conversation.selectlist.SelectListBottomSheet, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment] */
    public void CBR(Context context, AnonymousClass5XY r5, AnonymousClass206 r6, C20285AEt aEt, int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("arg_select_list_content", aEt);
        ? hilt_SelectListBottomSheet = new Hilt_SelectListBottomSheet();
        hilt_SelectListBottomSheet.A1R(A0D);
        hilt_SelectListBottomSheet.A00 = new C95194lq(context, this, r6, 0);
        Activity A002 = C18050vg.A00(context);
        if (A002 != null) {
            C20098A7b.A02(hilt_SelectListBottomSheet, ((AnonymousClass1FL) A002).getSupportFragmentManager());
        }
    }
}

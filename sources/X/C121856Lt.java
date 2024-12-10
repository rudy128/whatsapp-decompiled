package X;

import android.view.View;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6Lt  reason: invalid class name and case insensitive filesystem */
public class C121856Lt extends A34 {
    public final View A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final /* synthetic */ DocumentPreviewActivity A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121856Lt(View view, AnonymousClass1F9 r3, DocumentPreviewActivity documentPreviewActivity, File file, String str, String str2) {
        super(r3, true);
        this.A04 = documentPreviewActivity;
        this.A01 = file;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = view;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        String str = this.A03;
        File file = this.A01;
        if (!(str == null || file == null)) {
            try {
                i = C62272r8.A04.A07(file, str);
            } catch (AnonymousClass6SP e) {
                Log.e("DocumentPreviewActivity/getPageCount/could not get page count", e);
            }
            return Integer.valueOf(i);
        }
        i = 0;
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        DocumentPreviewActivity documentPreviewActivity = this.A04;
        int intValue = ((Number) obj).intValue();
        DocumentPreviewActivity.A0Q(this.A00, documentPreviewActivity, this.A03, this.A02, intValue);
    }
}

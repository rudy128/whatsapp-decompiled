package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.3AP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AP implements AnonymousClass3LO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ AnonymousClass1FR A04;
    public final /* synthetic */ C72433Ly A05;
    public final /* synthetic */ C34531kd A06;
    public final /* synthetic */ C692236j A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public final void BuX(File file) {
        C1409573s r1;
        C34531kd r12 = this.A06;
        Uri uri = this.A03;
        Context context = this.A02;
        List list = this.A09;
        int i = this.A01;
        String str = this.A08;
        C692236j r14 = this.A07;
        C72433Ly r9 = this.A05;
        int i2 = this.A00;
        AnonymousClass1FR r7 = this.A04;
        try {
            String queryParameter = uri.getQueryParameter("doodle");
            if (queryParameter != null) {
                File A0H = C26511Sk.A0H(r12.A01, queryParameter);
                AnonymousClass1KW r5 = r12.A06;
                r1 = C139426yp.A00(context, r12.A00, r12.A05, r5, r12.A07, r12.A0B, r12.A0F, A0H);
                if (r1 != null) {
                    r1.A03 = queryParameter;
                } else {
                    throw AnonymousClass000.A0s("Doodle object is null");
                }
            } else {
                r1 = null;
            }
            File file2 = file;
            if (!r12.A0A(r9, r1, (AnonymousClass206) null, r14, file2, str, list, i, i2, r12.A0D.hasGifTag(file2))) {
                r12.A02.A08(2131896086, 0);
            }
            r12.A02.CGP(new AnonymousClass3C0(r9, uri, 1));
        } catch (IOException | NullPointerException e) {
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                r12.A02.A08(2131896086, 0);
            } else {
                r12.A02.A0F(r7, context.getString(2131889993));
            }
            Log.e("SendMedia/sendVideo/error ", e);
        }
    }

    public /* synthetic */ AnonymousClass3AP(Context context, Uri uri, AnonymousClass1FR r3, C72433Ly r4, C34531kd r5, C692236j r6, String str, List list, int i, int i2) {
        this.A06 = r5;
        this.A03 = uri;
        this.A02 = context;
        this.A09 = list;
        this.A01 = i;
        this.A08 = str;
        this.A07 = r6;
        this.A05 = r4;
        this.A00 = i2;
        this.A04 = r3;
    }
}

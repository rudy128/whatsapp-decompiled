package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Aez  reason: case insensitive filesystem */
public final /* synthetic */ class C21131Aez implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass1FU A03;
    public final /* synthetic */ C21132Af0 A04;
    public final /* synthetic */ A1M A05;
    public final /* synthetic */ C20287AEv A06;
    public final /* synthetic */ C20005A2v A07;
    public final /* synthetic */ AnonymousClass1BI A08;
    public final /* synthetic */ UserJid A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.1LU, java.lang.Object] */
    public final void accept(Object obj) {
        AnonymousClass206 r19;
        A1M a1m = this.A05;
        int i = this.A00;
        List list = this.A0A;
        boolean z = this.A0B;
        AnonymousClass1FU r10 = this.A03;
        int i2 = this.A01;
        AnonymousClass1BI r9 = this.A08;
        C20287AEv aEv = this.A06;
        UserJid userJid = this.A09;
        long j = this.A02;
        C20005A2v a2v = this.A07;
        C21132Af0 af0 = this.A04;
        C19760yx r14 = (C19760yx) obj;
        if (i == list.size() - 1) {
            C222119a A002 = C20004A2u.A00(a1m.A05, "send_product_message_tag");
            if (A002 != null) {
                A002.A06("image_upload");
            }
            if (!z) {
                r10.CEx();
            }
        }
        File file = (File) r14.A01;
        if (r14.A00 == Boolean.FALSE) {
            r10.CEx();
            r10.BhQ(2131888004);
            Log.w("product-details/send-product/product load failed");
            a1m.A05.A06("send_product_message_tag", false);
            Log.w("product-details/send-product/temp file creation failed");
        } else {
            if (i2 == 2) {
                Intent A1w = new Object().A1w(r10, r9, 0);
                A1w.putExtra("product", aEv);
                A1w.putExtra("product_file", file);
                A1w.putExtra("_ci_", C1408573i.A01(r10, 0, C17880vN.A0A(), 0));
                AnonymousClass3MY.A12(A1w, userJid, "business_jid");
                C60442o2.A00(A1w, a1m.A03, "CatalogUtils");
                r10.startActivity(A1w);
            } else {
                Uri fromFile = Uri.fromFile(file);
                if (i2 != 1 || r9 == null) {
                    HashSet A12 = C17880vN.A12();
                    C17890vO.A1D(A12, 23);
                    C18070vi.A0d(r10, 1);
                    String absolutePath = file.getAbsolutePath();
                    ArrayList A10 = C17880vN.A10(A12);
                    Intent A0B2 = C72483Me.A0B(r10, "com.whatsapp.contact.picker.ContactPicker", 1);
                    A0B2.putExtra("send", true);
                    A0B2.putExtra("skip_preview", true);
                    if (absolutePath != null) {
                        A0B2.putExtra("file_path", absolutePath);
                    }
                    A0B2.putExtra("message_types", A10);
                    r10.startActivityForResult(A0B2, 3);
                } else {
                    if (j > 0) {
                        r19 = AnonymousClass1W2.A02(a1m.A07, j);
                    } else {
                        r19 = null;
                    }
                    C33251iW r4 = a1m.A02;
                    r4.A19.CGF(new C21472Akd(fromFile, r4, aEv, userJid, r19, Collections.singletonList(r9)));
                    if (i < AnonymousClass3MX.A02(list, 1)) {
                        List list2 = list;
                        AnonymousClass1FU r12 = r10;
                        C20005A2v a2v2 = a2v;
                        a1m.A02(r12, a2v2, r9, userJid, list2, 1, i + 1, j);
                    } else {
                        C72453Mb.A14(r10);
                    }
                }
            }
            a1m.A05.A06("send_product_message_tag", true);
        }
        af0.A0D();
    }

    public /* synthetic */ C21131Aez(AnonymousClass1FU r1, C21132Af0 af0, A1M a1m, C20287AEv aEv, C20005A2v a2v, AnonymousClass1BI r6, UserJid userJid, List list, int i, int i2, long j, boolean z) {
        this.A05 = a1m;
        this.A00 = i;
        this.A0A = list;
        this.A0B = z;
        this.A03 = r1;
        this.A01 = i2;
        this.A08 = r6;
        this.A06 = aEv;
        this.A09 = userJid;
        this.A02 = j;
        this.A07 = a2v;
        this.A04 = af0;
    }
}

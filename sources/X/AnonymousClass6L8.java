package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.CatalogMediaView;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.6L8  reason: invalid class name */
public final class AnonymousClass6L8 extends C38471rL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113315mt A01;
    public final /* synthetic */ CatalogImageListActivity A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARNING: type inference failed for: r2v2, types: [X.A7D, java.lang.Object] */
    public void A04(View view) {
        int A0m;
        int i;
        C18070vi.A0d(view, 0);
        CatalogImageListActivity catalogImageListActivity = this.A02;
        C18030ve r10 = catalogImageListActivity.A0E;
        C18070vi.A0W(r10);
        Context A04 = AnonymousClass3MY.A04(view);
        C20287AEv aEv = catalogImageListActivity.A02;
        if (aEv != null) {
            C113315mt r1 = this.A01;
            List list = C42011xT.A0I;
            AnonymousClass4ZR r5 = r1.A03;
            int i2 = this.A00;
            UserJid userJid = catalogImageListActivity.A05;
            if (userJid != null) {
                C18070vi.A0d(r5, 3);
                Intent intent = new Intent(A04, CatalogMediaView.class);
                intent.putExtra("product", aEv);
                intent.putExtra("target_image_index", i2);
                AnonymousClass3MY.A12(intent, userJid, "cached_jid");
                AnonymousClass745.A09(A04, intent, view, r10);
                AnonymousClass745.A08(A04, intent, view, r5, AnonymousClass001.A1H("thumb-transition-", A1M.A00(aEv.A0H, i2), AnonymousClass000.A10()));
                if (this.A03) {
                    A0m = 51;
                    i = 89;
                } else {
                    A0m = C17880vN.A0m();
                    i = 25;
                }
                Integer valueOf = Integer.valueOf(i);
                ? obj = new Object();
                A8Q a8q = catalogImageListActivity.A03;
                if (a8q != null) {
                    obj.A0B = a8q.A03;
                    obj.A05 = Integer.valueOf(a8q.A0D.get());
                    A8Q a8q2 = catalogImageListActivity.A03;
                    if (a8q2 != null) {
                        obj.A0E = a8q2.A01;
                        obj.A0F = a8q2.A02;
                        obj.A09 = C17880vN.A0n(a8q2.A0E.getAndIncrement());
                        C20287AEv aEv2 = catalogImageListActivity.A02;
                        if (aEv2 != null) {
                            obj.A0H = aEv2.A0H;
                            UserJid userJid2 = catalogImageListActivity.A05;
                            if (userJid2 != null) {
                                obj.A00 = userJid2;
                                obj.A06 = A0m;
                                obj.A04 = valueOf;
                                A8Q a8q3 = catalogImageListActivity.A03;
                                if (a8q3 != null) {
                                    a8q3.A09(obj);
                                    return;
                                }
                            }
                        }
                    }
                }
                C18070vi.A11("catalogAnalyticManager");
                throw null;
            }
            C18070vi.A11("productOwnerJid");
            throw null;
        }
        C18070vi.A11("product");
        throw null;
    }

    public AnonymousClass6L8(C113315mt r1, CatalogImageListActivity catalogImageListActivity, int i, boolean z) {
        this.A02 = catalogImageListActivity;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = z;
    }
}

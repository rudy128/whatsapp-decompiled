package X;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: X.DgY  reason: case insensitive filesystem */
public final class C27505DgY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26220Cv8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27505DgY(C26220Cv8 cv8) {
        super(0);
        this.this$0 = cv8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C25239Cba cba = this.this$0.A03;
        Executor executor = ((C26762DCr) cba.A07).A02;
        BSk bSk = new BSk(cba.A00, cba.A09, executor);
        C26220Cv8 cv8 = this.this$0;
        C25239Cba cba2 = cv8.A03;
        Executor executor2 = ((C26762DCr) cba2.A07).A02;
        C25052CVg cVg = cba2.A09;
        ContentResolver contentResolver = cba2.A00;
        return C26220Cv8.A03(cv8, bSk, new ECv[]{new C22859BSn(contentResolver, cVg, executor2), new DDK(contentResolver, cVg, executor2)});
    }
}

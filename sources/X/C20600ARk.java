package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.ARk  reason: case insensitive filesystem */
public class C20600ARk implements C22500BAh {
    public final /* synthetic */ ARR A00;
    public final /* synthetic */ C20859Aab A01;
    public final /* synthetic */ AnonymousClass21K A02;
    public final /* synthetic */ String A03;

    public C20600ARk(ARR arr, C20859Aab aab, AnonymousClass21K r3, String str) {
        this.A01 = aab;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = arr;
    }

    public void C6i() {
        C20859Aab aab = this.A01;
        BD5 bd5 = aab.A02;
        if (!bd5.Be9()) {
            aab.A00.CEx();
        }
        String str = this.A03;
        if (str == null) {
            bd5.C59(this.A00);
        } else {
            aab.A03.A04.A00(new C21432Ajz(bd5, this.A00, 36), str);
        }
    }

    public void C6l() {
        C20279AEn aEn;
        C20859Aab aab = this.A01;
        if (aab.A02.Be9()) {
            C20828Aa6 aa6 = aab.A03;
            aa6.A0E.A0J(new C21427Aju(aa6, 17));
        } else {
            aab.A00.CEx();
        }
        AnonymousClass21K r2 = this.A02;
        C20285AEt BPK = r2.BPK();
        if (BPK != null && (aEn = BPK.A02) != null && aEn.A0D.A02 != null) {
            AnonymousClass1FY r9 = aab.A00;
            Resources resources = r9.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            long j = r2.BPK().A02.A0D.A02.A00;
            C18000vb r6 = aab.A03.A0G;
            String A0x = AnonymousClass3MW.A0x(resources, new SimpleDateFormat("HH:mm", r6.A0N()).format(new Date(j * 1000)), A1a, 0, 2131893204);
            C73203Rj A002 = AnonymousClass4a6.A00(r9);
            A002.A0T(false);
            A002.A0E(2131893202);
            A002.A0S(A0x);
            A002.A0Z((DialogInterface.OnClickListener) null, 2131893201);
            AnonymousClass3MY.A1G(A002);
        }
    }
}

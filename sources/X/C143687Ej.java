package X;

import android.view.View;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Ej  reason: invalid class name and case insensitive filesystem */
public class C143687Ej implements C34021jm {
    public final /* synthetic */ C111295jU A00;

    public boolean CEa(Jid jid) {
        return false;
    }

    public C143687Ej(C111295jU r1) {
        this.A00 = r1;
    }

    public List BXB() {
        return this.A00.A14.A0D.A04();
    }

    public void Bot(C42071xZ r3, AnonymousClass1BI r4, int i) {
        this.A00.A0j(r4, r3.A05());
    }

    public void Bou(AnonymousClass1BI r4, int i) {
        C111295jU r0 = this.A00;
        r0.A0j(r4, i);
        C130976kJ r2 = r0.A07;
        if (r2 != null) {
            AnonymousClass63R r1 = new AnonymousClass63R();
            r1.A02 = C17880vN.A0j();
            r2.A09.CC7(r1);
        }
    }

    public void Bov(AnonymousClass1BI r4) {
        C111295jU r2 = this.A00;
        AnonymousClass3MY.A1L(r2.A0k, false);
        r2.A1G.A0F(r4);
    }

    public void Bow(View view, C42071xZ r5, C42071xZ r6, AnonymousClass1BI r7, int i, int i2) {
        C111295jU r2 = this.A00;
        AnonymousClass3MY.A1L(r2.A0k, false);
        if (r7 != null) {
            r2.A1G.A0F(r7);
        }
    }

    public void Box(C42071xZ r5, AnonymousClass206 r6) {
        C111295jU r3 = this.A00;
        r3.A15.A03(C108965cb.A1W(r3.A0d, Boolean.TRUE));
        r3.A0n(r6, r5.A05());
    }

    public void Bp0(AnonymousClass1EB r2) {
        Log.e("SearchViewModel/pending group in search results");
    }

    public boolean BxV(C42071xZ r2, C42071xZ r3, AnonymousClass1BI r4, int i) {
        this.A00.A1F.A0F(r4);
        return true;
    }

    public /* synthetic */ View.OnCreateContextMenuListener BVh() {
        return null;
    }

    public /* synthetic */ Set BYt() {
        return C17880vN.A12();
    }

    public /* synthetic */ boolean BeI(AnonymousClass1BI r2) {
        return false;
    }
}

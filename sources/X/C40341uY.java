package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1uY  reason: invalid class name and case insensitive filesystem */
public class C40341uY implements C34021jm {
    public final Context A00;
    public final C19880zA A01;
    public final C203411t A02;

    public /* synthetic */ void Bou(AnonymousClass1BI r1, int i) {
    }

    public /* synthetic */ void Bov(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Box(C42071xZ r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ Set BYt() {
        return new HashSet();
    }

    public void Bot(C42071xZ r3, AnonymousClass1BI r4, int i) {
        this.A02.CAt(this.A00, r4, i);
    }

    public void Bow(View view, C42071xZ r4, C42071xZ r5, AnonymousClass1BI r6, int i, int i2) {
        this.A02.CAt(this.A00, r6, i2);
    }

    public void Bp0(AnonymousClass1EB r2) {
        Log.e("CommunityHomeActivity/pending group in search results");
    }

    public boolean BxV(C42071xZ r3, C42071xZ r4, AnonymousClass1BI r5, int i) {
        this.A02.CAt(this.A00, r5, i);
        return true;
    }

    public C40341uY(Context context, C19880zA r2, C203411t r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ View.OnCreateContextMenuListener BVh() {
        return null;
    }

    public List BXB() {
        return Collections.emptyList();
    }

    public /* synthetic */ boolean BeI(AnonymousClass1BI r2) {
        return false;
    }

    public /* synthetic */ boolean CEa(Jid jid) {
        return false;
    }
}

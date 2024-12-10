package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.concurrent.Executor;

/* renamed from: X.Cba  reason: case insensitive filesystem */
public class C25239Cba {
    public ContentResolver A00;
    public AssetManager A01;
    public Resources A02;
    public final E4K A03;
    public final C24661CEb A04;
    public final E7Y A05;
    public final E7Y A06;
    public final E18 A07;
    public final BSI A08;
    public final C25052CVg A09;
    public final C25026CUc A0A;
    public final C24776CJt A0B = new C24776CJt();
    public final C24776CJt A0C = new C24776CJt();
    public final C24777CJu A0D;
    public final C24272ByV A0E;
    public final E4U A0F;
    public final C9C A0G;
    public final boolean A0H;

    public DDE A00(E4W e4w) {
        BSI bsi = this.A08;
        Executor executor = ((C26762DCr) this.A07).A01;
        E4U e4u = this.A0F;
        C9C c9c = this.A0G;
        C24272ByV byV = this.A0E;
        boolean z = this.A0H;
        return new DDE(C24697CGj.A00, this.A0D, byV, e4u, c9c, bsi, e4w, executor, z);
    }

    public DD5 A01() {
        return new DD5(this.A00, ((C26762DCr) this.A07).A00);
    }

    public DDD A02(E4W e4w, E4X e4x, boolean z) {
        return new DDD(this.A09, e4w, e4x, ((C26762DCr) this.A07).A00, z);
    }

    public C25239Cba(Context context, E4K e4k, C25026CUc cUc, C24661CEb cEb, E7Y e7y, E7Y e7y2, C24777CJu cJu, C24272ByV byV, E18 e18, E4U e4u, C9C c9c, BSI bsi, C25052CVg cVg, boolean z) {
        this.A00 = context.getApplicationContext().getContentResolver();
        this.A02 = context.getApplicationContext().getResources();
        this.A01 = context.getApplicationContext().getAssets();
        this.A08 = bsi;
        this.A0F = e4u;
        this.A0G = c9c;
        this.A0E = byV;
        this.A0H = z;
        this.A07 = e18;
        this.A09 = cVg;
        this.A05 = e7y;
        this.A06 = e7y2;
        this.A03 = e4k;
        this.A04 = cEb;
        this.A0A = cUc;
        this.A0D = cJu;
    }
}

package X;

import android.content.Context;
import android.text.Html;

/* renamed from: X.8yq  reason: invalid class name and case insensitive filesystem */
public class C175518yq extends C195979uG {
    public static int A05 = 7;
    public final C19830z4 A00;
    public final AnonymousClass1QJ A01;
    public final C30921ej A02;
    public final AnonymousClass1QS A03;
    public final AnonymousClass11P A04;

    public CharSequence A00(Context context) {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 6066) || !C63572tK.A0F.equals(this.A01.A02())) {
            return super.A00(context);
        }
        return Html.fromHtml(context.getString(2131894205));
    }

    public C175518yq(AnonymousClass11P r1, C19830z4 r2, C18030ve r3, AnonymousClass1QL r4, AnonymousClass1QJ r5, AnonymousClass1QO r6, C30921ej r7, AnonymousClass1QS r8) {
        super(r3, r4, r6);
        this.A04 = r1;
        this.A03 = r8;
        this.A02 = r7;
        this.A00 = r2;
        this.A01 = r5;
    }
}

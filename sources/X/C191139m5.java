package X;

import android.widget.ImageView;

/* renamed from: X.9m5  reason: invalid class name and case insensitive filesystem */
public class C191139m5 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C20284AEs A01;
    public final /* synthetic */ AnonymousClass8pT A02;
    public final /* synthetic */ C20037A4g A03;

    public C191139m5(ImageView imageView, C20284AEs aEs, AnonymousClass8pT r3, C20037A4g a4g) {
        this.A03 = a4g;
        this.A01 = aEs;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public void A00(A7B a7b, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: fetchCardArtImageContentDetails Couldn't get card art for: ");
        A10.append(str);
        C17900vP.A0Z(a7b, " with error: ", A10);
    }
}

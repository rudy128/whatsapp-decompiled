package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.5n5  reason: invalid class name and case insensitive filesystem */
public class C113435n5 extends C42011xT {
    public View.OnLongClickListener A00;
    public C1418377d A01;
    public boolean A02;
    public boolean A03;
    public final View.OnLongClickListener A04 = new C1421478i(this, 13);
    public final C26631Sw A05;
    public final AnonymousClass88B A06;
    public final StickerView A07;
    public final Integer A08;

    public C113435n5(LayoutInflater layoutInflater, ViewGroup viewGroup, C26631Sw r5, AnonymousClass88B r6, Integer num) {
        super(AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131627107));
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = num;
        StickerView stickerView = (StickerView) this.A0H.findViewById(2131435781);
        this.A07 = stickerView;
        stickerView.A02 = true;
    }
}

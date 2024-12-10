package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SegmentedProgressBar;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.5n9  reason: invalid class name and case insensitive filesystem */
public class C113475n9 extends C42011xT {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final AnonymousClass190 A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final SegmentedProgressBar A0A;
    public final C18000vb A0B;
    public final SizeTickerView A0C;
    public final SizeTickerView A0D;
    public final int[] A0E;

    public C113475n9(View view, AnonymousClass190 r11, C18000vb r12) {
        super(view);
        this.A05 = r11;
        this.A0B = r12;
        SizeTickerView sizeTickerView = (SizeTickerView) AnonymousClass1HF.A06(view, 2131436601);
        this.A0D = sizeTickerView;
        View view2 = this.A0H;
        sizeTickerView.A0M(AnonymousClass3MZ.A02(view2.getContext(), view2.getContext(), 2130971979, 2131103155), 0, false);
        this.A09 = AnonymousClass3MW.A0T(view, 2131436600);
        this.A06 = AnonymousClass3MW.A0T(view, 2131431011);
        this.A0A = (SegmentedProgressBar) AnonymousClass1HF.A06(view, 2131434181);
        this.A04 = AnonymousClass1HF.A06(view, 2131434184);
        WaTextView A0T = AnonymousClass3MW.A0T(view, 2131432395);
        this.A07 = A0T;
        WaTextView A0T2 = AnonymousClass3MW.A0T(view, 2131433339);
        this.A08 = A0T2;
        Context context = view.getContext();
        int[] A1W = C108945cZ.A1W();
        this.A0E = A1W;
        A1W[0] = AnonymousClass3Ma.A00(context, 2130971952, 2131103094);
        A1W[1] = AnonymousClass3Ma.A00(context, 2130972005, 2131103219);
        int A002 = AnonymousClass3Ma.A00(context, 2130971978, 2131103153);
        this.A02 = A002;
        this.A03 = AnonymousClass3Ma.A00(context, 2130971983, 2131103163);
        SizeTickerView sizeTickerView2 = (SizeTickerView) AnonymousClass1HF.A06(view, 2131431012);
        this.A0C = sizeTickerView2;
        sizeTickerView2.A0M(A002, 0, false);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168948);
        Drawable A003 = C24261Jm.A00(context, 2131233071);
        if (A003 != null) {
            A003.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            A0T.setCompoundDrawables(A003, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        Drawable A004 = C24261Jm.A00(context, 2131233072);
        if (A004 != null) {
            A004.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            A0T2.setCompoundDrawables(A004, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}

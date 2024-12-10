package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;

/* renamed from: X.6it  reason: invalid class name and case insensitive filesystem */
public final class C130106it {
    public final int A00;
    public final Context A01;
    public final PopupWindow A02;
    public final WaTextView A03;
    public final C18000vb A04;
    public final int[] A05 = new int[2];

    public C130106it(Context context, C18000vb r8) {
        this.A01 = context;
        this.A04 = r8;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131168445);
        this.A00 = dimensionPixelOffset;
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131168444);
        WaTextView waTextView = new WaTextView(context);
        AnonymousClass3MX.A1C(waTextView.getContext(), waTextView, 2131102364);
        C43421zm.A04(waTextView);
        waTextView.setPadding(dimensionPixelOffset2, dimensionPixelOffset * 2, dimensionPixelOffset2, dimensionPixelOffset);
        this.A03 = waTextView;
        PopupWindow popupWindow = new PopupWindow(waTextView, -2, -2, false);
        popupWindow.setFocusable(true);
        this.A02 = popupWindow;
    }
}

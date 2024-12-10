package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;

/* renamed from: X.6il  reason: invalid class name and case insensitive filesystem */
public final class C130026il {
    public final int A00;
    public final Context A01;
    public final PopupWindow A02;
    public final WaTextView A03;
    public final AnonymousClass11C A04;
    public final C18000vb A05;

    public C130026il(Context context, AnonymousClass11C r7, C18000vb r8) {
        this.A01 = context;
        this.A05 = r8;
        this.A04 = r7;
        int A012 = C62762rw.A01(context, 8.0f);
        this.A00 = A012;
        WaTextView waTextView = new WaTextView(context);
        waTextView.setPadding(A012, A012 * 2, A012, A012);
        AnonymousClass3MX.A1C(waTextView.getContext(), waTextView, 2131103394);
        C43421zm.A04(waTextView);
        this.A03 = waTextView;
        PopupWindow popupWindow = new PopupWindow(waTextView, -2, -2, false);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        this.A02 = popupWindow;
    }
}

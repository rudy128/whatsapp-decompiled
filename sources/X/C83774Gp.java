package X;

import android.content.Context;
import android.os.Handler;
import android.text.InputFilter;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaEditText;

/* renamed from: X.4Gp  reason: invalid class name and case insensitive filesystem */
public abstract class C83774Gp {
    public static void A00(Context context, ScrollView scrollView, TextView textView, TextView textView2, WaEditText waEditText, AnonymousClass11C r23, C18000vb r24, AnonymousClass1L2 r25, AnonymousClass1KW r26, C18030ve r27, C18010vc r28, int i) {
        int i2 = i;
        WaEditText waEditText2 = waEditText;
        waEditText2.setFilters(new InputFilter[]{new C1418577f(i2)});
        waEditText2.addTextChangedListener(new AnonymousClass48A(waEditText2, textView, r23, r24, r25, r26, r27, r28, i2, (int) (((float) i2) * 0.1f), false, false, false));
        C90044dR.A00(textView2, waEditText2, 14);
        ScrollView scrollView2 = scrollView;
        C90574eI.A00(scrollView2.getViewTreeObserver(), waEditText2, scrollView2, 3);
        waEditText2.setOnFocusChangeListener(new C90134da(scrollView2, 4));
        waEditText2.setOnTouchListener(new C90304dr(scrollView2, new CIZ(context, new C72873Nv(scrollView2, waEditText2), (Handler) null), 9));
    }
}

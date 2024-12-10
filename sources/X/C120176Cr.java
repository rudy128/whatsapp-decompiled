package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Cr  reason: invalid class name and case insensitive filesystem */
public class C120176Cr extends C145267Kp {
    public final C125866bo A00;
    public final AnonymousClass4S4 A01;
    public final AnonymousClass12F A02;
    public final C18030ve A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120176Cr(AnonymousClass12F r2, AnonymousClass1KW r3, C125866bo r4, AnonymousClass4S4 r5, C18030ve r6) {
        super(r3);
        C18070vi.A0o(r3, r6, r5);
        C18070vi.A0d(r2, 5);
        this.A03 = r6;
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r2;
    }

    public void CFC(C135396s8 r8, AnonymousClass206 r9) {
        String str;
        TextView textView;
        String A002;
        int i;
        C445823z r0;
        boolean A15 = C18070vi.A15(r9, r8);
        TextEmojiLabel textEmojiLabel = r8.A02;
        Context context = textEmojiLabel.getContext();
        TextPaint A0A = C108975cc.A0A(textEmojiLabel, context);
        boolean z = r9 instanceof C445823z;
        if (!z || (r0 = (C445823z) r9) == null || (str = r0.A06) == null) {
            str = "";
        }
        CharSequence A032 = C72813Np.A03(A0A, AnonymousClass12F.A00(context, 2131233223), str);
        C18070vi.A0X(A032);
        A00(textEmojiLabel, A032);
        if (z) {
            C445823z r92 = (C445823z) r9;
            if (r92.A02 == AnonymousClass00R.A00) {
                if (C18020vd.A05(C18040vf.A02, this.A03, 9062)) {
                    View view = r8.A00;
                    if (view instanceof ViewStub) {
                        C28931bI r02 = new C28931bI(view);
                        r02.A04(A15);
                        textView = (TextView) AnonymousClass3MX.A0D(r02);
                        C18070vi.A0d(textView, A15);
                        r8.A00 = textView;
                    } else {
                        C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
                        textView = (TextView) view;
                    }
                    textView.setVisibility(A15 ? 1 : 0);
                    Context A04 = AnonymousClass3MY.A04(textView);
                    if (r92.A08) {
                        i = 2131890058;
                    } else {
                        C125866bo r03 = this.A00;
                        Long l = r92.A03;
                        if (l == null || AnonymousClass11P.A01(r03.A00) <= l.longValue()) {
                            A002 = this.A01.A00(AnonymousClass00R.A01, r92.A00);
                            textView.setText(A002);
                        }
                        i = 2131890091;
                    }
                    A002 = A04.getString(i);
                    C18070vi.A0b(A002);
                    textView.setText(A002);
                }
            }
        }
    }
}

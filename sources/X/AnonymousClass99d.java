package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.99d  reason: invalid class name */
public final class AnonymousClass99d extends C145527Lp {
    public final AnonymousClass12F A00;

    public AnonymousClass99d(AnonymousClass12F r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CFE(View view, AnonymousClass724 r11, AnonymousClass206 r12, C135486sH r13) {
        C20279AEn aEn;
        int i;
        Object[] objArr;
        String A06;
        int A17 = C18070vi.A17(r12, view);
        AnonymousClass3Ma.A1O(r13, 2, r11);
        r11.A02(view, r12, r13);
        if ((r12 instanceof AnonymousClass21L) && r12.A0u == 54) {
            C136606u5 A002 = AnonymousClass6WB.A00(view);
            A002.A09.setMaxLines(A17);
            C20285AEt aEt = ((AnonymousClass21L) r12).A00;
            if (aEt != null && (aEn = aEt.A02) != null) {
                if (aEn.A0U != null) {
                    ImageView imageView = A002.A02;
                    imageView.getLayoutParams().width = imageView.getResources().getDimensionPixelSize(2131165899);
                    imageView.getLayoutParams().height = imageView.getResources().getDimensionPixelSize(2131165898);
                }
                TextEmojiLabel textEmojiLabel = A002.A07;
                textEmojiLabel.setVisibility(0);
                boolean A08 = aEn.A08();
                Context context = view.getContext();
                if (A08) {
                    i = 2131893954;
                    objArr = new Object[2];
                    C17880vN.A1T(objArr, aEn.A0D.A00(), 0);
                    AnonymousClass1R2 r0 = r11.A0D;
                    boolean A0r = r0.A0r(aEn);
                    C18000vb r02 = r0.A05;
                    if (A0r) {
                        A06 = aEn.A05(r02);
                    } else {
                        A06 = aEn.A06(r02);
                    }
                    objArr[A17] = A06;
                } else {
                    i = 2131893276;
                    objArr = new Object[A17];
                    C17880vN.A1T(objArr, aEn.A0D.A00(), 0);
                }
                AnonymousClass3MY.A0y(context, textEmojiLabel, objArr, i);
            }
        }
    }

    public void CFF(View view, AnonymousClass724 r3, AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        C72473Md.A1I(view, r3);
        r3.A03(view, r4, false);
    }

    public CharSequence BXo(Context context, Paint paint, AnonymousClass206 r4) {
        C18070vi.A0n(context, paint, r4);
        return this.A00.A0B(context, paint, r4);
    }
}

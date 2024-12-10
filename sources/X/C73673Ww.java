package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3Ww  reason: invalid class name and case insensitive filesystem */
public class C73673Ww extends C38391rD {
    public int A00 = -1;
    public AnonymousClass4MV A01;
    public final List A02 = AnonymousClass000.A13();

    public int A0Q() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        View view;
        AnonymousClass3YV r82 = (AnonymousClass3YV) r8;
        C87654Wk r1 = (C87654Wk) this.A02.get(i);
        if (getItemViewType(i) == 0) {
            C80153wg r83 = (C80153wg) r82;
            String str = r1.A02;
            boolean isEmpty = TextUtils.isEmpty(str);
            View view2 = r83.A0H;
            if (isEmpty) {
                view2.setVisibility(8);
                return;
            }
            view2.setVisibility(0);
            r83.A00.A0R(str);
            return;
        }
        AEF aef = r1.A00;
        C80163wh r84 = (C80163wh) r82;
        String str2 = r1.A01;
        if (aef == null) {
            view = r84.A0H;
        } else {
            r84.A00.setChecked(AnonymousClass000.A1T(r84.A05(), r84.A05.A00));
            r84.A0H.setVisibility(0);
            String str3 = aef.A01;
            boolean isEmpty2 = TextUtils.isEmpty(str3);
            TextEmojiLabel textEmojiLabel = r84.A02;
            if (isEmpty2) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.A0R(str3);
                textEmojiLabel.setVisibility(0);
            }
            r84.A04.A0R(aef.A03);
            String str4 = aef.A00;
            boolean isEmpty3 = TextUtils.isEmpty(str4);
            TextEmojiLabel textEmojiLabel2 = r84.A01;
            if (isEmpty3) {
                textEmojiLabel2.setVisibility(8);
            } else {
                textEmojiLabel2.A0R(str4);
                textEmojiLabel2.setVisibility(0);
            }
            boolean isEmpty4 = TextUtils.isEmpty(str2);
            TextEmojiLabel textEmojiLabel3 = r84.A03;
            view = textEmojiLabel3;
            if (!isEmpty4) {
                textEmojiLabel3.A0R(str2);
                textEmojiLabel3.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public int getItemViewType(int i) {
        return (TextUtils.isEmpty(((C87654Wk) this.A02.get(i)).A02) ^ true) ^ true ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        List list = C42011xT.A0I;
        if (i == 0) {
            return new C80153wg(A0D.inflate(2131626864, viewGroup, false), this);
        }
        return new C80163wh(A0D.inflate(2131626863, viewGroup, false), this);
    }
}

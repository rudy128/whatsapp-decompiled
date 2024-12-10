package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.8Hm  reason: invalid class name and case insensitive filesystem */
public final class C161728Hm extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final Context A01;
    public final GridLayoutManager A02;
    public final C37451pZ A03;
    public final C18030ve A04;
    public final AnonymousClass9YV A05;
    public final boolean A06;

    public void Bmc(C42011xT r5, int i) {
        TextEmojiLabel textEmojiLabel;
        String A0L;
        C18070vi.A0d(r5, 0);
        int i2 = r5.A01;
        if (i2 == 0) {
            AnonymousClass8JB r52 = (AnonymousClass8JB) r5;
            AnonymousClass1E7 r2 = (AnonymousClass1E7) this.A00.get(i);
            this.A03.A07(r52.A00, r2);
            String A0K = r2.A0K();
            if (A0K == null || A0K.length() == 0) {
                textEmojiLabel = r52.A02;
                A0L = r2.A0L();
            } else {
                textEmojiLabel = r52.A02;
                A0L = r2.A0K();
            }
            textEmojiLabel.setText(A0L);
            if (r2.A0O()) {
                int A012 = C196929vs.A01(this.A04);
                ImageView imageView = r52.A01;
                imageView.setImageResource(A012);
                imageView.setVisibility(0);
                return;
            }
            r52.A01.setVisibility(8);
        } else if (i2 == 1 && i == 3) {
            AnonymousClass8J9 r53 = (AnonymousClass8J9) r5;
            r53.A01.setText(2131894054);
            r53.A00.setImageResource(2131232183);
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            r2 = new AnonymousClass8JB(AnonymousClass3MX.A0B(LayoutInflater.from(this.A01), viewGroup, 2131626363, false), this.A05);
        } else if (i == 1) {
            List list2 = C42011xT.A0I;
            r2 = new AnonymousClass8J9(AnonymousClass3MX.A0B(LayoutInflater.from(this.A01), viewGroup, 2131626363, false), this.A05);
        } else {
            throw AnonymousClass000.A0k("Invalid view type");
        }
        return r2;
    }

    public int getItemViewType(int i) {
        return i < 3 ? 0 : 1;
    }

    public int A0Q() {
        int size = this.A00.size();
        if ((!this.A06 || size != 3) && size <= 3) {
            return size;
        }
        return this.A02.A00;
    }

    public C161728Hm(Context context, GridLayoutManager gridLayoutManager, C37451pZ r4, C18030ve r5, AnonymousClass9YV r6, boolean z) {
        C18070vi.A0s(context, r5, gridLayoutManager, r4);
        this.A01 = context;
        this.A04 = r5;
        this.A02 = gridLayoutManager;
        this.A03 = r4;
        this.A06 = z;
        this.A05 = r6;
    }
}

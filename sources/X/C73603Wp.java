package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3Wp  reason: invalid class name and case insensitive filesystem */
public final class C73603Wp extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public boolean A01;
    public final Context A02;
    public final LayoutInflater A03;
    public final C72043Kk A04;
    public final AnonymousClass4ZR A05;
    public final C24921Me A06;
    public final C37451pZ A07;
    public final C18000vb A08;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        return new AnonymousClass3ZM(AnonymousClass3MX.A0B(this.A03, viewGroup, 2131625501, false), this.A04);
    }

    public int A0Q() {
        if (this.A00.size() <= 2 || this.A01) {
            return this.A00.size();
        }
        return 3;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        AnonymousClass3ZM r102 = (AnonymousClass3ZM) r10;
        C18070vi.A0d(r102, 0);
        if (this.A01 || i != 2) {
            C86904Tn r6 = (C86904Tn) this.A00.get(i);
            AnonymousClass1E7 r5 = r6.A00;
            C42141xh r3 = r102.A03;
            r3.A05(r5);
            r3.A01.setTextColor(AnonymousClass3Ma.A00(this.A02, 2130970343, 2131101314));
            ImageView imageView = r102.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A05.A02(2131899523));
            AnonymousClass1Xr.A04(imageView, AnonymousClass000.A0y(C22971Dz.A06(r5.A0J), A10));
            C37451pZ r32 = this.A07;
            r32.A07(imageView, r5);
            C24921Me r1 = this.A06;
            if (r1.A0j(r5, -1) && r5.A0c != null) {
                TextEmojiLabel textEmojiLabel = r102.A01;
                textEmojiLabel.setVisibility(0);
                textEmojiLabel.A0S(AnonymousClass3MX.A17(r1, r5), (List) null, 0, false);
            }
            if (r5.A0Z != null) {
                TextEmojiLabel textEmojiLabel2 = r102.A02;
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A0S(r5.A0Z, (List) null, 0, false);
            } else {
                r102.A02.setVisibility(8);
            }
            AnonymousClass3Ma.A1F(r102.A0H, this, r5, r6, 10);
            r32.A07(imageView, r5);
            return;
        }
        int A022 = AnonymousClass3MX.A02(this.A00, 2);
        C42141xh r52 = r102.A03;
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, A022, 0);
        String A0K = this.A08.A0K(A1a, 2131755258, (long) A022);
        TextEmojiLabel textEmojiLabel3 = r52.A01;
        textEmojiLabel3.setText(A0K);
        C72463Mc.A0y(this.A02, textEmojiLabel3, 2130970340, 2131101312);
        r102.A02.setVisibility(8);
        r102.A00.setImageResource(2131231897);
        C89954dI.A00(r102.A0H, this, 32);
    }

    public C73603Wp(Context context, C72043Kk r3, AnonymousClass4ZR r4, C24921Me r5, C37451pZ r6, C18000vb r7) {
        C18070vi.A0k(r5, r7);
        C72473Md.A1J(r6, r3);
        this.A02 = context;
        this.A06 = r5;
        this.A08 = r7;
        this.A05 = r4;
        this.A07 = r6;
        this.A04 = r3;
        this.A03 = LayoutInflater.from(context);
    }
}

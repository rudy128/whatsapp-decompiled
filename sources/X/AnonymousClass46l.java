package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.46l  reason: invalid class name */
public class AnonymousClass46l extends AnonymousClass6FM {
    public AnonymousClass1KB A00;
    public WaImageView A01;
    public AnonymousClass1VW A02;
    public C18000vb A03;
    public C73163Qi A04;
    public List A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public FrameLayout A0A;
    public WaImageView A0B;
    public C115265tf A0C;
    public boolean A0D;
    public final C37451pZ A0E;
    public final AnonymousClass68H A0F;

    private ThumbnailButton A00(Context context, int i) {
        ThumbnailButton thumbnailButton = new ThumbnailButton(context);
        thumbnailButton.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        thumbnailButton.A02 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971095, 2131102422);
        thumbnailButton.A00 = (float) this.A06;
        thumbnailButton.A01 = (float) this.A08;
        thumbnailButton.A06 = false;
        thumbnailButton.setImportantForAccessibility(2);
        return thumbnailButton;
    }

    public void A01() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E A0Q = C72483Me.A0Q(this);
            this.A00 = AnonymousClass10E.A12(A0Q);
            this.A02 = AnonymousClass3MZ.A0e(A0Q);
            this.A03 = AnonymousClass10E.A6Q(A0Q);
        }
    }

    public void A05(AnonymousClass206 r4, List list) {
        this.A04.setSubText((String) null, (List) null);
        C115265tf r1 = this.A0C;
        if (r1 != null) {
            this.A0F.A07(r1);
        }
        C115265tf r2 = (C115265tf) this.A0F.A02(r4);
        this.A0C = r2;
        r2.A0A(new C98304qu(r4, this, list), this.A00.A05);
    }

    public void setMessage(C442222p r7, List list) {
        C18000vb r1 = this.A03;
        FrameLayout frameLayout = this.A0A;
        int i = this.A07;
        C27641Ww.A06(frameLayout, r1, i, i, i, i);
        this.A02.A09(this.A01, 2131231047);
        String A012 = C62872s8.A01(AnonymousClass3MX.A04(this.A0B, this, 8), r7);
        if (A012 == null) {
            A012 = "";
        }
        this.A04.setTitleAndDescription(AnonymousClass1EG.A0E(A012, 128), (String) null, list);
        A05(r7, list);
    }

    public AnonymousClass46l(Context context, C37451pZ r2, AnonymousClass68H r3) {
        super(context);
        A01();
        this.A0F = r3;
        this.A0E = r2;
        A04();
    }

    public View A02() {
        this.A04 = new C73163Qi(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int A042 = C72463Mc.A04(this);
        C27641Ww.A07(this.A04, this.A03, 0, 0, A042, 0);
        this.A04.setLayoutParams(layoutParams);
        return this.A04;
    }

    public View A03() {
        Context context = getContext();
        this.A0A = new FrameLayout(context);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168529);
        this.A06 = getResources().getDimensionPixelSize(2131166060);
        this.A08 = getResources().getDimensionPixelSize(2131166061);
        this.A0A.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.A01 = A00(context, dimensionPixelSize);
        ThumbnailButton A002 = A00(context, dimensionPixelSize);
        this.A0B = A002;
        ArrayList A13 = AnonymousClass000.A13();
        this.A05 = A13;
        A13.add(this.A01);
        A13.add(A002);
        this.A07 = C72463Mc.A04(this);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131168526);
        this.A09 = dimensionPixelSize2;
        C27641Ww.A06(this.A0B, this.A03, dimensionPixelSize2, 0, 0, 0);
        this.A0A.addView(this.A0B);
        this.A0A.addView(this.A01);
        return this.A0A;
    }

    public void setMessage(C442022n r7, List list) {
        int i = this.A07;
        int i2 = ((i * 2) - this.A09) / 2;
        C27641Ww.A06(this.A0A, this.A03, i2, i, i2, i);
        this.A02.A09(this.A01, 2131231047);
        this.A02.A09(this.A0B, 2131231047);
        this.A0B.setVisibility(0);
        this.A01.setVisibility(0);
        A05(r7, list);
    }
}

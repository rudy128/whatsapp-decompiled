package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.inappsupportbloks.components.BloksSupportVideoView;

/* renamed from: X.5qt  reason: invalid class name and case insensitive filesystem */
public final class C114475qt extends BV6 {
    public final /* synthetic */ C26025Cqj A00;

    public Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        C18070vi.A0e(view, 0, dfl);
        String A0D = dfl.A0D(36);
        String A0D2 = dfl.A0D(35);
        String A0D3 = dfl.A0D(38);
        int A04 = dfl.A04(40, 0);
        dfl.A0D(41);
        String A0D4 = dfl.A0D(43);
        String A0D5 = dfl.A0D(42);
        String A0D6 = dfl.A0D(44);
        String A0D7 = dfl.A0D(45);
        ((BloksSupportVideoView) AnonymousClass1HF.A06(view, 2131435940)).A08(Integer.valueOf(A04), A0D, A0D3, A0D2, A0D5, A0D6, A0D4, A0D7);
        return null;
    }

    public void A0O(View view, DOZ doz, DFL dfl) {
        C18070vi.A0d(view, 0);
        BloksSupportVideoView bloksSupportVideoView = (BloksSupportVideoView) AnonymousClass1HF.A06(view, 2131435940);
        WaImageView waImageView = bloksSupportVideoView.A03;
        if (waImageView == null) {
            C18070vi.A11("videoThumbnail");
            throw null;
        }
        waImageView.setImageBitmap((Bitmap) null);
        WaImageView waImageView2 = bloksSupportVideoView.A02;
        if (waImageView2 == null) {
            C18070vi.A11("playButton");
            throw null;
        }
        waImageView2.setOnClickListener((View.OnClickListener) null);
        ((AnonymousClass1FY) AnonymousClass3Ma.A05(bloksSupportVideoView)).A4Q(bloksSupportVideoView.A05);
        bloksSupportVideoView.A05 = null;
        ((C132976nx) bloksSupportVideoView.getSupportVideoLogger().get()).A01 = null;
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 0);
        View inflate = View.inflate(context, 2131627512, (ViewGroup) null);
        C18070vi.A0X(inflate);
        return inflate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114475qt(DOZ doz, DFL dfl, C26025Cqj cqj) {
        super(doz, dfl);
        this.A00 = cqj;
    }
}

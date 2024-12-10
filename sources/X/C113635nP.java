package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;

/* renamed from: X.5nP  reason: invalid class name and case insensitive filesystem */
public final class C113635nP extends C42011xT implements View.OnClickListener {
    public C139226yS A00;
    public final ViewGroup A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C28931bI A07;
    public final C28931bI A08;
    public final /* synthetic */ GalleryPickerFragment A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113635nP(View view, GalleryPickerFragment galleryPickerFragment) {
        super(view);
        View A022;
        this.A09 = galleryPickerFragment;
        C28931bI A0s = C72453Mb.A0s(view, 2131431062);
        this.A08 = A0s;
        C28931bI A0s2 = C72453Mb.A0s(view, 2131431061);
        this.A07 = A0s2;
        if (GalleryPickerFragment.A04(galleryPickerFragment)) {
            A022 = A0s2.A02();
        } else {
            A022 = A0s.A02();
        }
        ViewGroup viewGroup = (ViewGroup) A022;
        C18070vi.A0b(viewGroup);
        this.A01 = viewGroup;
        this.A04 = (TextEmojiLabel) AnonymousClass3MX.A0C(viewGroup, 2131436208);
        this.A05 = AnonymousClass7S3.A00(this, 22);
        this.A03 = C72453Mb.A0W(viewGroup, 2131429679);
        this.A02 = C108975cc.A0B(view, 2131436135);
        this.A06 = AnonymousClass7S3.A00(this, 23);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        String str;
        GalleryPickerFragment galleryPickerFragment = this.A09;
        C18100vl r3 = galleryPickerFragment.A0Z;
        Integer A002 = GalleryPickerViewModel.A00(r3);
        if (A002 != null) {
            int intValue = A002.intValue();
            AnonymousClass00H r0 = galleryPickerFragment.A0N;
            if (r0 != null) {
                C72463Mc.A1F((C20050A4v) r0.get(), 2, intValue);
            } else {
                str = "mediaSharingUserJourneyLogger";
                C18070vi.A11(str);
                throw null;
            }
        }
        if (GalleryPickerFragment.A04(galleryPickerFragment)) {
            ((GalleryPickerViewModel) r3.getValue()).A08.A0F(this.A00);
            return;
        }
        C139226yS r6 = this.A00;
        if (r6 != null) {
            AnonymousClass00H r02 = galleryPickerFragment.A0P;
            if (r02 != null) {
                AnonymousClass1LU r5 = (AnonymousClass1LU) C18070vi.A0E(r02);
                AnonymousClass1FL A1D = galleryPickerFragment.A1D();
                Bundle bundle = galleryPickerFragment.A06;
                C18030ve r2 = galleryPickerFragment.A0G;
                if (r2 != null) {
                    r6.A01(A1D, bundle, r5, C18020vd.A00(C18040vf.A02, r2, 2614));
                    return;
                }
                str = "abProps";
            } else {
                str = "waIntents";
            }
            C18070vi.A11(str);
            throw null;
        }
    }
}

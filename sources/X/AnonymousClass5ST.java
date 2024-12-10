package X;

import com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment;

/* renamed from: X.5ST  reason: invalid class name */
public final class AnonymousClass5ST extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SelectedMediaCaptionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ST(SelectedMediaCaptionFragment selectedMediaCaptionFragment) {
        super(1);
        this.this$0 = selectedMediaCaptionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj instanceof AnonymousClass7HP) {
            SelectedMediaCaptionFragment selectedMediaCaptionFragment = this.this$0;
            if (!selectedMediaCaptionFragment.A08) {
                C108515bp r0 = selectedMediaCaptionFragment.A03;
                if (r0 != null) {
                    r0.onDismiss();
                }
            } else {
                selectedMediaCaptionFragment.A08 = false;
            }
        } else if (obj instanceof AnonymousClass7HN) {
            SelectedMediaCaptionFragment selectedMediaCaptionFragment2 = this.this$0;
            C72453Mb.A1C(selectedMediaCaptionFragment2.A00);
            C72453Mb.A1C(selectedMediaCaptionFragment2.A01);
            AnonymousClass3Ma.A1M(selectedMediaCaptionFragment2.A04);
            SelectedMediaCaptionFragment.A01(this.this$0);
        } else if (obj instanceof AnonymousClass7HM) {
            SelectedMediaCaptionFragment selectedMediaCaptionFragment3 = this.this$0;
            C72453Mb.A1D(selectedMediaCaptionFragment3.A00);
            C72453Mb.A1D(selectedMediaCaptionFragment3.A01);
            C28931bI r02 = selectedMediaCaptionFragment3.A04;
            if (r02 != null) {
                r02.A04(0);
            }
        }
        return C27621Wu.A00;
    }
}

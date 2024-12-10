package X;

import com.whatsapp.gallery.dialogs.Hilt_GalleryPartialPermissionBottomSheetFragment;

/* renamed from: X.5No  reason: invalid class name and case insensitive filesystem */
public final class C104285No extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FL $fragmentActivity;
    public final /* synthetic */ C86504Rw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104285No(AnonymousClass1FL r2, C86504Rw r3) {
        super(0);
        this.$fragmentActivity = r2;
        this.this$0 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.gallery.dialogs.Hilt_GalleryPartialPermissionBottomSheetFragment, com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment, androidx.fragment.app.DialogFragment] */
    public /* bridge */ /* synthetic */ Object invoke() {
        ? hilt_GalleryPartialPermissionBottomSheetFragment = new Hilt_GalleryPartialPermissionBottomSheetFragment();
        C86504Rw r2 = this.this$0;
        AnonymousClass1FL r1 = this.$fragmentActivity;
        hilt_GalleryPartialPermissionBottomSheetFragment.A00 = new C104265Nm(r1, r2);
        hilt_GalleryPartialPermissionBottomSheetFragment.A01 = new C104275Nn(r1, r2);
        C20098A7b.A01(hilt_GalleryPartialPermissionBottomSheetFragment, r1.getSupportFragmentManager());
        return C27621Wu.A00;
    }
}

package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog;

/* renamed from: X.5PY  reason: invalid class name */
public final class AnonymousClass5PY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ LayoutInflater $inflater;
    public final /* synthetic */ StatusArchiveSettingsBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PY(LayoutInflater layoutInflater, ViewGroup viewGroup, StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog) {
        super(0);
        this.this$0 = statusArchiveSettingsBottomSheetDialog;
        this.$inflater = layoutInflater;
        this.$container = viewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = this.this$0;
        AnonymousClass4KF r2 = statusArchiveSettingsBottomSheetDialog.A00;
        if (r2 != null) {
            statusArchiveSettingsBottomSheetDialog.A02 = new AnonymousClass4P9(this.$inflater, this.$container, AnonymousClass10E.A6Q(r2.A00.A02), new AnonymousClass5Af(statusArchiveSettingsBottomSheetDialog.A03.getValue(), 44), new AnonymousClass5Af(this.this$0, 45));
            AnonymousClass4P9 r0 = this.this$0.A02;
            if (r0 != null) {
                return r0.A00;
            }
            throw AnonymousClass000.A0n("StatusArchiveSettingsViewComponent may be accessed only from onCreateView - onDestroyView");
        }
        C18070vi.A11("statusArchiveSettingsViewComponentFactory");
        throw null;
    }
}

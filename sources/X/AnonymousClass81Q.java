package X;

import android.content.ComponentName;
import android.content.Intent;
import com.whatsapp.dmsetting.DisappearingMessagesSettingActivity;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;

/* renamed from: X.81Q  reason: invalid class name */
public final class AnonymousClass81Q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StorageUsageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81Q(StorageUsageActivity storageUsageActivity) {
        super(1);
        this.this$0 = storageUsageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Intent intent = (Intent) obj;
        C18070vi.A0d(intent, 0);
        ComponentName component = intent.getComponent();
        if (component != null) {
            str = component.getClassName();
        } else {
            str = null;
        }
        if (C18070vi.A18(StorageUsageGalleryActivity.class.getName(), str)) {
            this.this$0.startActivityForResult(intent, 0);
        } else if (C18070vi.A18(DisappearingMessagesSettingActivity.class.getName(), str) || "com.whatsapp.autodelete.NewsletterMediaSettingGlobalActivity".equals(str) || "com.whatsapp.ml.v2.storageusage.MLModelStorageUsageActivity".equals(str)) {
            this.this$0.startActivity(intent);
        }
        return C27621Wu.A00;
    }
}

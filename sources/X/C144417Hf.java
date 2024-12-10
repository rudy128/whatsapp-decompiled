package X;

import android.graphics.Bitmap;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.7Hf  reason: invalid class name and case insensitive filesystem */
public class C144417Hf implements C1606889n {
    public final /* synthetic */ AnonymousClass7H2 A00;
    public final /* synthetic */ AnonymousClass65B A01;
    public final /* synthetic */ AnonymousClass891 A02;
    public final /* synthetic */ StorageUsageMediaPreviewView A03;

    public /* synthetic */ void Bti() {
    }

    public void C7F(Bitmap bitmap, boolean z) {
        Bitmap bitmap2 = bitmap;
        AnonymousClass65B r5 = this.A01;
        if (r5.getTag() == this.A02) {
            AnonymousClass7H2 r4 = this.A00;
            if (bitmap == StorageUsageMediaPreviewView.A0E) {
                bitmap2 = null;
            }
            StorageUsageMediaPreviewView storageUsageMediaPreviewView = this.A03;
            C137216v6.A01(bitmap2, storageUsageMediaPreviewView.A0A, r4, r5, storageUsageMediaPreviewView.A09, !z, false, storageUsageMediaPreviewView.A08);
        }
    }

    public C144417Hf(AnonymousClass7H2 r1, AnonymousClass65B r2, AnonymousClass891 r3, StorageUsageMediaPreviewView storageUsageMediaPreviewView) {
        this.A03 = storageUsageMediaPreviewView;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BCw() {
        AnonymousClass65B r2 = this.A01;
        StorageUsageMediaPreviewView storageUsageMediaPreviewView = this.A03;
        Bitmap bitmap = StorageUsageMediaPreviewView.A0E;
        C108975cc.A0x(r2, storageUsageMediaPreviewView.A09);
    }
}

package X;

import android.graphics.Bitmap;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.7HY  reason: invalid class name */
public class AnonymousClass7HY implements AnonymousClass891 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass7H2 A01;
    public final /* synthetic */ StorageUsageMediaPreviewView A02;
    public final /* synthetic */ String A03;

    public AnonymousClass7HY(AnonymousClass7H2 r1, StorageUsageMediaPreviewView storageUsageMediaPreviewView, String str, int i) {
        this.A02 = storageUsageMediaPreviewView;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = str;
    }

    public Bitmap BhZ() {
        Bitmap CP6 = this.A01.CP6(this.A00);
        if (CP6 == null) {
            return StorageUsageMediaPreviewView.A0E;
        }
        return CP6;
    }

    public String Ba8() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01.A00);
        return AnonymousClass000.A0y(this.A03, A10);
    }
}

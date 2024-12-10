package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.5n6  reason: invalid class name and case insensitive filesystem */
public class C113445n6 extends C42011xT {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C18000vb A05;
    public final AnonymousClass18K A06;
    public final StorageUsageMediaPreviewView A07;
    public final StorageUsageMediaPreviewView A08;

    public C113445n6(View view, C18000vb r6, AnonymousClass18K r7, boolean z) {
        super(view);
        this.A06 = r7;
        this.A05 = r6;
        View A062 = AnonymousClass1HF.A06(view, 2131430990);
        this.A00 = A062;
        this.A02 = AnonymousClass3MW.A0J(view, 2131430992);
        StorageUsageMediaPreviewView storageUsageMediaPreviewView = (StorageUsageMediaPreviewView) AnonymousClass1HF.A06(view, 2131430991);
        this.A07 = storageUsageMediaPreviewView;
        View A063 = AnonymousClass1HF.A06(view, 2131431943);
        this.A01 = A063;
        this.A04 = AnonymousClass3MW.A0J(view, 2131431946);
        this.A03 = AnonymousClass3MW.A0J(view, 2131431945);
        StorageUsageMediaPreviewView storageUsageMediaPreviewView2 = (StorageUsageMediaPreviewView) AnonymousClass1HF.A06(view, 2131431944);
        this.A08 = storageUsageMediaPreviewView2;
        storageUsageMediaPreviewView.A08 = z;
        storageUsageMediaPreviewView2.A08 = z;
        AnonymousClass1Y5.A07(A062, "Button");
        AnonymousClass1Y5.A07(A063, "Button");
    }
}

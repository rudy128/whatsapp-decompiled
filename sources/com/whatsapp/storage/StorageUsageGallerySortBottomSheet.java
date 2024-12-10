package com.whatsapp.storage;

import X.AnonymousClass3Qe;
import X.AnonymousClass4M4;
import X.AnonymousClass4bH;
import X.AnonymousClass86E;
import X.C17880vN;
import X.C17960vV;
import X.C90104dX;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

public class StorageUsageGallerySortBottomSheet extends Hilt_StorageUsageGallerySortBottomSheet implements AnonymousClass86E {
    public AnonymousClass4M4 A00;
    public AnonymousClass3Qe A01;
    public AnonymousClass3Qe A02;
    public AnonymousClass3Qe A03;
    public AnonymousClass3Qe A04;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.storage.StorageUsageGallerySortBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.storage.Hilt_StorageUsageGallerySortBottomSheet] */
    public static StorageUsageGallerySortBottomSheet A00(int i, boolean z) {
        ? hilt_StorageUsageGallerySortBottomSheet = new Hilt_StorageUsageGallerySortBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", i);
        A0D.putBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", z);
        hilt_StorageUsageGallerySortBottomSheet.A1R(A0D);
        return hilt_StorageUsageGallerySortBottomSheet;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass3Qe r0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131627136, viewGroup, false);
        AnonymousClass3Qe r1 = new AnonymousClass3Qe(A1n());
        this.A01 = r1;
        r1.setText(2131896268);
        C90104dX.A00(this.A01, this, 0, 35);
        viewGroup2.addView(this.A01);
        AnonymousClass3Qe r12 = new AnonymousClass3Qe(A1n());
        this.A02 = r12;
        r12.setText(2131896269);
        C90104dX.A00(this.A02, this, 1, 35);
        viewGroup2.addView(this.A02);
        AnonymousClass3Qe r13 = new AnonymousClass3Qe(A1n());
        this.A03 = r13;
        r13.setText(2131896270);
        C90104dX.A00(this.A03, this, 2, 35);
        viewGroup2.addView(this.A03);
        Bundle A15 = A15();
        if (A15.getBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", false)) {
            AnonymousClass3Qe r14 = new AnonymousClass3Qe(A1n());
            this.A04 = r14;
            r14.setText(2131899439);
            C90104dX.A00(this.A04, this, 3, 35);
            viewGroup2.addView(this.A04);
        }
        int i = A15.getInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", 0);
        this.A01.setChecked(false);
        this.A02.setChecked(false);
        this.A03.setChecked(false);
        if (i == 0) {
            r0 = this.A01;
        } else if (i == 1) {
            r0 = this.A02;
        } else if (i != 2) {
            if (i == 3) {
                r0 = this.A04;
                C17960vV.A05(r0);
            }
            Dialog dialog = this.A03;
            C17960vV.A07(dialog);
            Window window = dialog.getWindow();
            C17960vV.A07(window);
            window.getDecorView().setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
            window.setStatusBarColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 48;
            window.setAttributes(attributes);
            dialog.setOnShowListener(new AnonymousClass4bH(this, 4));
            return viewGroup2;
        } else {
            r0 = this.A03;
        }
        r0.setChecked(true);
        Dialog dialog2 = this.A03;
        C17960vV.A07(dialog2);
        Window window2 = dialog2.getWindow();
        C17960vV.A07(window2);
        window2.getDecorView().setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
        window2.setStatusBarColor(0);
        WindowManager.LayoutParams attributes2 = window2.getAttributes();
        attributes2.width = -1;
        attributes2.gravity = 48;
        window2.setAttributes(attributes2);
        dialog2.setOnShowListener(new AnonymousClass4bH(this, 4));
        return viewGroup2;
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132083971);
    }
}

package com.whatsapp.glasses;

import X.A1I;
import X.AnonymousClass118;
import X.AnonymousClass1D6;
import X.AnonymousClass3Ma;
import X.AnonymousClass3RV;
import X.B8P;
import X.C0L;
import X.C18070vi;
import X.C200410p;
import X.C200610r;
import X.C86654Sm;
import X.C87214Us;
import X.C89944dH;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SUPBottomSheetView extends Hilt_SUPBottomSheetView implements B8P {
    public int A00;
    public AnonymousClass3RV A01;
    public final C0L A02 = C0L.A12;
    public final Map A03 = C200610r.A04(AnonymousClass1D6.A00(C0L.A11, 2131435926));
    public final Set A04 = C200410p.A0S(new C0L[]{C0L.A15, C0L.A14, C0L.A13});
    public final AtomicBoolean A05;
    public final AnonymousClass118 A06;
    public final C86654Sm A07;
    public final A1I A08;
    public final List A09;

    public SUPBottomSheetView(AnonymousClass118 r10, A1I a1i) {
        C18070vi.A0d(a1i, 2);
        this.A06 = r10;
        this.A08 = a1i;
        C87214Us[] r7 = new C87214Us[3];
        r7[0] = new C87214Us(2131886089, 2131886090, "__external__sup_bottom_sheet_row_phone_locked", "__external__sup_bottom_sheet_row_phone_locked_title");
        r7[1] = new C87214Us(2131886088, 2131886087, "__external__sup_bottom_sheet_row_capture_led_videocalling", "__external__sup_bottom_sheet_row_capture_led_title");
        this.A09 = C18070vi.A0O(new C87214Us(2131886092, 2131886091, "__external__sup_bottom_sheet_row_sensitive_info_videocalling", "__external__sup_bottom_sheet_row_sensitive_info_title"), r7, 2);
        this.A07 = new C86654Sm(2131102654);
        this.A05 = new AtomicBoolean(false);
    }

    public void C8Q(int i) {
        AnonymousClass3RV r0;
        if (i == 3) {
            this.A00--;
        } else {
            Log.e("SUPBottomSheetView Network resource download failure!");
        }
        if (this.A00 <= 0 && this.A05.get() && (r0 = this.A01) != null) {
            A00(r0);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.AnonymousClass3RV r9) {
        /*
            r8 = this;
            java.util.Map r0 = r8.A03
            X.A1I r7 = r8.A08
            X.C18070vi.A0h(r0, r7)
            java.util.Iterator r2 = X.AnonymousClass000.A15(r0)
        L_0x000b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.Object r1 = r0.getKey()
            X.C0L r1 = (X.C0L) r1
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass000.A0M(r0)
            android.graphics.Bitmap r1 = X.C197219wL.A00(r7, r1)
            if (r1 == 0) goto L_0x000b
            android.widget.ImageView r0 = X.AnonymousClass3Ma.A0C(r9, r0)
            r0.setImageBitmap(r1)
            goto L_0x000b
        L_0x0031:
            java.util.Set r0 = r8.A04
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x0038:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r4.next()
            int r2 = r3 + 1
            if (r3 >= 0) goto L_0x004b
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x004b:
            X.C0L r0 = (X.C0L) r0
            android.graphics.Bitmap r1 = X.C197219wL.A00(r7, r0)
            java.util.List r0 = r8.A09
            java.lang.Object r0 = X.C29431cG.A0f(r0, r3)
            X.4Us r0 = (X.C87214Us) r0
            if (r0 == 0) goto L_0x005d
            r0.A00 = r1
        L_0x005d:
            r3 = r2
            goto L_0x0038
        L_0x005f:
            X.C0L r4 = r8.A02
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r6 = 1
            r5 = 0
            java.io.FileInputStream r3 = X.C88574a9.A01(r7, r4)     // Catch:{ IOException -> 0x009a, IllegalStateException -> 0x009e }
            if (r3 == 0) goto L_0x00a4
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0093 }
            int r1 = r3.read()     // Catch:{ all -> 0x0093 }
        L_0x0075:
            r0 = -1
            if (r1 == r0) goto L_0x0081
            char r0 = (char) r1     // Catch:{ all -> 0x0093 }
            r2.append(r0)     // Catch:{ all -> 0x0093 }
            int r1 = r3.read()     // Catch:{ all -> 0x0093 }
            goto L_0x0075
        L_0x0081:
            int r0 = r2.length()     // Catch:{ all -> 0x0093 }
            if (r0 <= r6) goto L_0x008f
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r3.close()     // Catch:{ IOException -> 0x009a, IllegalStateException -> 0x009e }
            goto L_0x00a5
        L_0x008f:
            r3.close()     // Catch:{ IOException -> 0x009a, IllegalStateException -> 0x009e }
            goto L_0x00a4
        L_0x0093:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x009a, IllegalStateException -> 0x009e }
            throw r0     // Catch:{ IOException -> 0x009a, IllegalStateException -> 0x009e }
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "sup:ResourceDownloaderUtil Network resource readFileAsString IOException failure!"
            goto L_0x00a1
        L_0x009e:
            r1 = move-exception
            java.lang.String r0 = "sup:ResourceDownloaderUtil Network resource readFileAsString IllegalStateException failure!"
        L_0x00a1:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a4:
            r2 = r5
        L_0x00a5:
            com.airbnb.lottie.LottieAnimationView r1 = r9.A04
            r0 = 0
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x00b2
            java.lang.String r0 = r4.id
            r1.setAnimationFromJson(r2, r0)
        L_0x00b2:
            X.3Wc r0 = r9.A00
            if (r0 == 0) goto L_0x00b9
            r0.notifyDataSetChanged()
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.glasses.SUPBottomSheetView.A00(X.3RV):void");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context A14 = A14();
        AnonymousClass3RV r2 = new AnonymousClass3RV(A14, this.A07, this.A09);
        this.A01 = r2;
        C89944dH.A00(r2.A05, this, 37);
        if (this.A00 <= 0 && this.A05.get()) {
            A00(r2);
        }
        r2.setBackgroundColor(AnonymousClass3Ma.A00(A14, 2130970679, 2131102070));
        return r2;
    }
}

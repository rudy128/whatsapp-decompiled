package com.whatsapp;

import X.AnonymousClass1NM;
import X.AnonymousClass2RS;
import X.C18070vi;
import X.C26511Sk;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public final class GifHelper {
    public final AnonymousClass1NM A00;

    public GifHelper(AnonymousClass1NM r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    private final native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    private final native boolean hasGifTag(String str);

    public final void A00(File file) {
        AnonymousClass2RS r1;
        C18070vi.A0d(file, 0);
        try {
            AnonymousClass1NM r5 = this.A00;
            File A01 = r5.A01(file);
            C18070vi.A0X(A01);
            String absolutePath = file.getAbsolutePath();
            C18070vi.A0X(absolutePath);
            String absolutePath2 = A01.getAbsolutePath();
            C18070vi.A0X(absolutePath2);
            Mp4Ops.LibMp4OperationResult applyGifTag = applyGifTag(absolutePath, absolutePath2);
            if (applyGifTag == null) {
                Log.e("gif-helper/applyGifTag is null");
                r1 = new AnonymousClass2RS(0, "result is null");
            } else if (!applyGifTag.success) {
                StringBuilder sb = new StringBuilder();
                sb.append("gif-helper/applyGifTag");
                sb.append(applyGifTag.errorMessage);
                Log.e(sb.toString());
                int i = applyGifTag.errorCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid result, error_code: ");
                sb2.append(i);
                sb2.append(" | ");
                sb2.append(applyGifTag.errorMessage);
                r1 = new AnonymousClass2RS(i, sb2.toString());
            } else if (!C26511Sk.A0S(r5, A01, file)) {
                Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                r1 = new AnonymousClass2RS(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            } else {
                return;
            }
            throw r1;
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not access file or failed to move files properly | ");
            sb3.append(e.getMessage());
            throw new AnonymousClass2RS(0, sb3.toString());
        }
    }

    public final boolean A01(File file) {
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            C18070vi.A0X(absolutePath);
            if (!hasGifTag(absolutePath)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
